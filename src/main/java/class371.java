import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class371 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "J")
    private long field5441;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "J")
    private long field5444;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Ljava/io/File;")
    private File field5442;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5443;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 4)
    public final void method2276(int arg0) throws IOException {
        if (this.field5443 != null) {
            this.field5443.close();
            this.field5443 = null;
        }
        if (arg0 != -2771) {
            this.field5443 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        if (this.field5443 != null) {
            System.out.println("Warning! fileondisk " + this.field5442 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2276(-2771);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JB)V", line = 35)
    public final void method2277(long arg0, byte arg1) throws IOException {
        int var4 = -2 / ((arg1 + 74) / 44);
        this.field5443.seek(arg0);
        this.field5444 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)J", line = 45)
    public final long method2278(boolean arg0) throws IOException {
        return arg0 ? 38L : this.field5443.length();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)I", line = 55)
    public final int method2279(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field5443.read(arg1, arg0, arg3);
        if (arg2 > ~var5) {
            this.field5444 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/io/File;", line = 67)
    public final File method2280(byte arg0) {
        if (arg0 != 13) {
            this.method2280((byte) -53);
        }
        return this.field5442;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BIII)V", line = 77)
    public final void method2281(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field5441 < ((long) arg2 + this.field5444)) {
            this.field5443.seek(this.field5441);
            this.field5443.write(1);
            throw new EOFException();
        }
        if (arg3 != 0) {
            this.method2280((byte) 58);
        }
        this.field5443.write(arg0, arg1, arg2);
        this.field5444 += arg2;
    }
}
