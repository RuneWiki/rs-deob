import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class355 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "J")
    private long field5191;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
    private long field5192;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "Ljava/io/File;")
    private File field5193;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5190;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI[B)V", line = 4)
    public final void method2121(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field5192 < ((long) arg2 + this.field5191)) {
            this.field5190.seek(this.field5192);
            this.field5190.write(1);
            throw new EOFException();
        } else {
            int var5 = 4 / ((arg1 + 31) / 54);
            this.field5190.write(arg3, arg0, arg2);
            this.field5191 += arg2;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(JB)V", line = 25)
    public final void method2122(long arg0, byte arg1) throws IOException {
        this.field5190.seek(arg0);
        this.field5191 = arg0;
        int var4 = 102 % ((arg1 - 45) / 35);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Ljava/io/File;", line = 35)
    public final File method2123(int arg0) {
        if (arg0 != 0) {
            this.method2123(84);
        }
        return this.field5193;
    }

    @OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        if (this.field5190 != null) {
            System.out.println("Warning! fileondisk " + this.field5193 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2126(-1);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II[BZ)I", line = 58)
    public final int method2124(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        if (arg3) {
            this.field5192 = 49L;
        }
        int var5 = this.field5190.read(arg2, arg0, arg1);
        if (var5 > 0) {
            this.field5191 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)J", line = 76)
    public final long method2125(int arg0) throws IOException {
        return arg0 < 36 ? -79L : this.field5190.length();
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 86)
    public final void method2126(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field5191 = 65L;
        }
        if (this.field5190 != null) {
            this.field5190.close();
            this.field5190 = null;
        }
    }
}
