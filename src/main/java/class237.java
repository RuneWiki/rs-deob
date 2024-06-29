import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class237 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "J")
    private long field3859;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
    private long field3860;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/io/File;")
    private File field3858;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3857;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III[B)I")
    public final int method1645(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3857.read(arg3, arg0, arg2);
        if (arg1 < var5) {
            this.field3859 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method1646(int arg0) throws IOException {
        if (this.field3857 != null) {
            this.field3857.close();
            this.field3857 = null;
        }
        if (arg0 != 0) {
            this.method1649((byte) 53);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III[B)V")
    public final void method1647(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field3859 > this.field3860) {
            this.field3857.seek(this.field3860);
            this.field3857.write(1);
            throw new EOFException();
        } else {
            this.field3857.write(arg3, arg2, arg0);
            if (arg1 == -17135) {
                this.field3859 += (long) arg0;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)V")
    public final void method1648(int arg0, long arg1) throws IOException {
        this.field3857.seek(arg1);
        if (arg0 == -1) {
            this.field3859 = arg1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1649(byte arg0) {
        int var2 = -36 % ((arg0 - 29) / 33);
        return this.field3858;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)J")
    public final long method1650(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3859 = -28L;
        }
        return this.field3857.length();
    }

    @OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3857 != null) {
            System.out.println("Warning! fileondisk " + this.field3858 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1646(0);
        }
    }
}
