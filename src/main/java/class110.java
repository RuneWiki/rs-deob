import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2625;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Ljava/io/File;")
    private File field2626;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "J")
    private long field2624;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "J")
    private long field2627;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method858(int arg0) throws IOException {
        if (arg0 <= -20 && this.field2625 != null) {
            this.field2625.close();
            this.field2625 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)J")
    public final long method859(int arg0) throws IOException {
        return arg0 == 21528 ? this.field2625.length() : 94L;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BBII)V")
    public final void method860(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field2624 > this.field2627) {
            this.field2625.seek(this.field2627 + 1L);
            this.field2625.write(1);
            throw new EOFException();
        }
        this.field2625.write(arg0, arg3, arg2);
        this.field2624 += arg2;
        if (arg1 < 48) {
            this.method863(98);
        }
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2625 != null) {
            System.out.println("Warning! fileondisk " + this.field2626 + " not closed correctly using close(). Auto-closing instead. ");
            this.method858(-50);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JB)V")
    public final void method861(long arg0, byte arg1) throws IOException {
        this.field2625.seek(arg0);
        this.field2624 = arg0;
        if (arg1 <= 110) {
            this.method863(-86);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI[B)I")
    public final int method862(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != -70) {
            this.method863(70);
        }
        int var5 = this.field2625.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field2624 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method863(int arg0) {
        if (arg0 <= 45) {
            this.method863(-109);
        }
        return this.field2626;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class110(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2625 = new RandomAccessFile(arg0, arg1);
        this.field2626 = arg0;
        this.field2624 = 0L;
        this.field2627 = arg2;
        int var5 = this.field2625.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2625.seek(0L);
            this.field2625.write(var5);
        }
        this.field2625.seek(0L);
    }
}
