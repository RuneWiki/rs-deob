import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2063;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/io/File;")
    private File field2064;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "J")
    private long field2065;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "J")
    private long field2066;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method791(int arg0) throws IOException {
        if (this.field2063 != null) {
            this.field2063.close();
            this.field2063 = null;
        }
        if (arg0 != -24709) {
            this.method795(-32);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[BIZ)V")
    public final void method792(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if ((long) arg0 + this.field2066 > this.field2065) {
            this.field2063.seek(this.field2065 + 1L);
            this.field2063.write(1);
            throw new EOFException();
        }
        this.field2063.write(arg1, arg2, arg0);
        this.field2066 += arg0;
        if (!arg3) {
            this.field2063 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[BI)I")
    public final int method793(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field2063.read(arg2, arg3, arg1);
        int var6 = -119 / ((-arg0 - 46) / 57);
        if (var5 > 0) {
            this.field2066 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JI)V")
    public final void method794(long arg0, int arg1) throws IOException {
        if (arg1 == 0) {
            this.field2063.seek(arg0);
            this.field2066 = arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2063 != null) {
            System.out.println("Warning! fileondisk " + this.field2064 + " not closed correctly using close(). Auto-closing instead. ");
            this.method791(-24709);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method795(int arg0) {
        if (arg0 >= -76) {
            this.method795(28);
        }
        return this.field2064;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)J")
    public final long method796(int arg0) throws IOException {
        if (arg0 != 31422) {
            this.field2064 = null;
        }
        return this.field2063.length();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class98(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2063 = new RandomAccessFile(arg0, arg1);
        this.field2064 = arg0;
        this.field2065 = arg2;
        this.field2066 = 0L;
        int var5 = this.field2063.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2063.seek(0L);
            this.field2063.write(var5);
        }
        this.field2063.seek(0L);
    }
}
