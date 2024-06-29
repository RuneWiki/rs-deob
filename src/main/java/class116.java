import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class116 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2149;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "J")
    private long field2151;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/io/File;")
    private File field2150;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "J")
    private long field2152;

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2149 != null) {
            System.out.println("Warning! fileondisk " + this.field2150 + " not closed correctly using close(). Auto-closing instead. ");
            this.method771(true);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JI)V")
    public final void method770(long arg0, int arg1) throws IOException {
        if (arg1 <= 87) {
            this.field2151 = -33L;
        }
        this.field2149.seek(arg0);
        this.field2151 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) throws IOException {
        if (this.field2149 != null) {
            this.field2149.close();
            this.field2149 = null;
        }
        if (!arg0) {
            this.method774(57);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIII)I")
    public final int method772(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 < 88) {
            this.field2149 = null;
        }
        int var5 = this.field2149.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field2151 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class116(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2149 = new RandomAccessFile(arg0, arg1);
        this.field2151 = 0L;
        this.field2150 = arg0;
        this.field2152 = arg2;
        int var5 = this.field2149.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2149.seek(0L);
            this.field2149.write(var5);
        }
        this.field2149.seek(0L);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[B)V")
    public final void method773(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg2 + this.field2151 > this.field2152) {
            this.field2149.seek(this.field2152 + 1L);
            this.field2149.write(1);
            throw new EOFException();
        }
        if (arg1 != 25302) {
            this.method774(-127);
        }
        this.field2149.write(arg3, arg0, arg2);
        this.field2151 += arg2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method774(int arg0) {
        return arg0 == -1 ? this.field2150 : null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)J")
    public final long method775(int arg0) throws IOException {
        return arg0 == 1 ? this.field2149.length() : -26L;
    }
}
