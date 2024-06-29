import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class113 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2024;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
    private long field2027;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljava/io/File;")
    private File field2025;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "J")
    private long field2026;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BII)I")
    public final int method793(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2024.read(arg1, arg3, arg0);
        if (var5 > 0) {
            this.field2027 += var5;
        }
        if (arg2 != 1) {
            this.field2026 = 89L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2024 = new RandomAccessFile(arg0, arg1);
        this.field2027 = 0L;
        this.field2025 = arg0;
        this.field2026 = arg2;
        int var5 = this.field2024.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2024.seek(0L);
            this.field2024.write(var5);
        }
        this.field2024.seek(0L);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)V")
    public final void method794(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 25) {
            this.field2027 = 45L;
        }
        if ((long) arg3 + this.field2027 > this.field2026) {
            this.field2024.seek(this.field2026 + 1L);
            this.field2024.write(1);
            throw new EOFException();
        } else {
            this.field2024.write(arg1, arg2, arg3);
            this.field2027 += arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
    public final long method795(int arg0) throws IOException {
        if (arg0 != 11204) {
            this.field2025 = null;
        }
        return this.field2024.length();
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method796(int arg0) {
        int var2 = -37 / ((arg0 - 43) / 54);
        return this.field2025;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method797(int arg0) throws IOException {
        if (arg0 < -97 && this.field2024 != null) {
            this.field2024.close();
            this.field2024 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2024 != null) {
            System.out.println("Warning! fileondisk " + this.field2025 + " not closed correctly using close(). Auto-closing instead. ");
            this.method797(-121);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V")
    public final void method798(long arg0, byte arg1) throws IOException {
        this.field2024.seek(arg0);
        if (arg1 != -102) {
            this.field2024 = null;
        }
        this.field2027 = arg0;
    }
}
