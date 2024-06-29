import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class324 {

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "J")
    private long field4522;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "J")
    private long field4523;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Ljava/io/File;")
    private File field4521;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4524;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method2044(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field4523 < (long) arg2 + this.field4522) {
            this.field4524.seek(this.field4523);
            this.field4524.write(1);
            throw new EOFException();
        }
        this.field4524.write(arg0, arg3, arg2);
        this.field4522 += (long) arg2;
        if (arg1 <= 0) {
            this.method2046(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J", line = 26)
    public final long method2045(int arg0) throws IOException {
        int var2 = 71 % ((arg0 - 78) / 32);
        return this.field4524.length();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Ljava/io/File;", line = 38)
    public final File method2046(boolean arg0) {
        return arg0 ? null : this.field4521;
    }

    @OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        if (this.field4524 != null) {
            System.out.println("Warning! fileondisk " + this.field4521 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2049(-91);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)I", line = 61)
    public final int method2047(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field4524.read(arg2, arg3, arg1);
        if (var5 > arg0) {
            this.field4522 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)V", line = 73)
    public final void method2048(byte arg0, long arg1) throws IOException {
        if (arg0 != 91) {
            this.method2046(false);
        }
        this.field4524.seek(arg1);
        this.field4522 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 84)
    public final void method2049(int arg0) throws IOException {
        int var2 = -105 % ((arg0 + 8) / 51);
        if (this.field4524 != null) {
            this.field4524.close();
            this.field4524 = null;
        }
    }
}
