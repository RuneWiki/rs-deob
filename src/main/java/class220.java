import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class220 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "J")
    private long field3520;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "J")
    private long field3521;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/io/File;")
    private File field3522;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3523;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)J", line = 5)
    public final long method1578(byte arg0) throws IOException {
        int var2 = -127 / ((arg0 - 78) / 48);
        return this.field3523.length();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[BI)V", line = 13)
    public final void method1579(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (((long) arg1 + this.field3520) > this.field3521) {
            this.field3523.seek(this.field3521 + 1L);
            this.field3523.write(1);
            throw new EOFException();
        }
        this.field3523.write(arg2, arg3, arg1);
        this.field3520 += (long) arg1;
        if (arg0 != 16235) {
            this.method1582((byte) -116);
        }
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        if (this.field3523 != null) {
            System.out.println("Warning! fileondisk " + this.field3522 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1580(-3810);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 48)
    public final void method1580(int arg0) throws IOException {
        if (this.field3523 != null) {
            this.field3523.close();
            this.field3523 = null;
        }
        if (arg0 != -3810) {
            this.field3522 = (File) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BJ)V", line = 65)
    public final void method1581(byte arg0, long arg1) throws IOException {
        this.field3523.seek(arg1);
        if (arg0 == -71) {
            this.field3520 = arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)Ljava/io/File;", line = 76)
    public final File method1582(byte arg0) {
        if (arg0 >= -108) {
            this.field3520 = -47L;
        }
        return this.field3522;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([BIIZ)I", line = 89)
    public final int method1583(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return -116;
        }
        int var5 = this.field3523.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field3520 += (long) var5;
        }
        return var5;
    }
}
