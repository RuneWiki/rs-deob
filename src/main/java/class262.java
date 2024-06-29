import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class262 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
    private long field4521;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "J")
    private long field4524;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/io/File;")
    private File field4522;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4523;

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field4523 != null) {
            System.out.println("Warning! fileondisk " + this.field4522 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1838(1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[BB)I", line = 19)
    public final int method1836(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = -106 % ((-arg3 - 82) / 36);
        int var6 = this.field4523.read(arg2, arg0, arg1);
        if (var6 > 0) {
            this.field4521 += (long) var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/io/File;", line = 33)
    public final File method1837(int arg0) {
        return arg0 == -2417 ? this.field4522 : (File) null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 43)
    public final void method1838(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method1837(35);
        }
        if (this.field4523 != null) {
            this.field4523.close();
            this.field4523 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J", line = 59)
    public final long method1839(byte arg0) throws IOException {
        return arg0 <= 46 ? 63L : this.field4523.length();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JB)V", line = 69)
    public final void method1840(long arg0, byte arg1) throws IOException {
        this.field4523.seek(arg0);
        if (arg1 != -94) {
            this.field4521 = 60L;
        }
        this.field4521 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI[B)V", line = 80)
    public final void method1841(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field4524 < ((long) arg0 + this.field4521)) {
            this.field4523.seek(this.field4524 + 1L);
            this.field4523.write(1);
            throw new EOFException();
        }
        this.field4523.write(arg3, arg2, arg0);
        this.field4521 += (long) arg0;
        if (arg1) {
            this.method1837(50);
        }
    }
}
