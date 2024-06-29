import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class353 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "J")
    private long field5109;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "J")
    private long field5110;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/io/File;")
    private File field5108;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5111;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BIIB)I", line = 4)
    public final int method2139(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        int var5 = this.field5111.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field5109 += var5;
        }
        int var6 = 29 % ((-arg3 - 48) / 56);
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V", line = 20)
    public final void method2140(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 1) {
            return;
        }
        if ((long) arg0 + this.field5109 > this.field5110) {
            this.field5111.seek(this.field5110);
            this.field5111.write(1);
            throw new EOFException();
        } else {
            this.field5111.write(arg3, arg2, arg0);
            this.field5109 += arg0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 38)
    public final void method2141(int arg0) throws IOException {
        if (this.field5111 != null) {
            this.field5111.close();
            this.field5111 = null;
        }
        if (arg0 > -53) {
            this.method2143(-34);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)J", line = 56)
    public final long method2142(byte arg0) throws IOException {
        if (arg0 != -17) {
            this.method2143(-125);
        }
        return this.field5111.length();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Ljava/io/File;", line = 68)
    public final File method2143(int arg0) {
        if (arg0 != 0) {
            this.method2143(-18);
        }
        return this.field5108;
    }

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() throws Throwable {
        if (this.field5111 != null) {
            System.out.println("Warning! fileondisk " + this.field5108 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2141(-105);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JB)V", line = 93)
    public final void method2144(long arg0, byte arg1) throws IOException {
        this.field5111.seek(arg0);
        this.field5109 = arg0;
        if (arg1 > -102) {
            this.method2143(-66);
        }
    }
}
