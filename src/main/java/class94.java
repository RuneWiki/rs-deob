import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class94 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1847;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "J")
    private long field1848;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "J")
    private long field1849;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
    private File field1846;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)J")
    public final long method598(int arg0) throws IOException {
        if (arg0 != 2066) {
            this.method599((byte) 0);
        }
        return this.field1847.length();
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1847 != null) {
            System.out.println("Warning! fileondisk " + this.field1846 + " not closed correctly using close(). Auto-closing instead. ");
            this.method603(-1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method599(byte arg0) {
        if (arg0 <= 25) {
            this.method599((byte) -73);
        }
        return this.field1846;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ[BI)V")
    public final void method600(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field1849 > this.field1848) {
            this.field1847.seek(this.field1848 + 1L);
            this.field1847.write(1);
            throw new EOFException();
        }
        if (!arg1) {
            this.field1846 = null;
        }
        this.field1847.write(arg2, arg3, arg0);
        this.field1849 += arg0;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class94(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1847 = new RandomAccessFile(arg0, arg1);
        this.field1848 = arg2;
        this.field1849 = 0L;
        this.field1846 = arg0;
        int var5 = this.field1847.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1847.seek(0L);
            this.field1847.write(var5);
        }
        this.field1847.seek(0L);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BJ)V")
    public final void method601(byte arg0, long arg1) throws IOException {
        this.field1847.seek(arg1);
        this.field1849 = arg1;
        int var4 = -64 % ((52 - arg0) / 51);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BBII)I")
    public final int method602(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1847.read(arg0, arg3, arg2);
        if (arg1 > -32) {
            this.field1847 = null;
        }
        if (var5 > 0) {
            this.field1849 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final void method603(int arg0) throws IOException {
        if (arg0 == -1 && this.field1847 != null) {
            this.field1847.close();
            this.field1847 = null;
        }
    }
}
