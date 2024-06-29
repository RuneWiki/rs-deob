import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 {

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field135;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "J")
    private long field136;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "J")
    private long field134;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/io/File;")
    private File field133;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)J", line = 4)
    public final long method100(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method105(-40);
        }
        return this.field135.length();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BIBI)I", line = 16)
    public final int method101(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 105) {
            this.field136 = 80L;
        }
        int var5 = this.field135.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field136 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 34)
    public final void method102(byte arg0) throws IOException {
        if (arg0 != -45) {
            this.field134 = -70L;
        }
        if (this.field135 != null) {
            this.field135.close();
            this.field135 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I[BII)V", line = 49)
    public final void method103(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field134 < (long) arg0 + this.field136) {
            this.field135.seek(this.field134 + 1L);
            this.field135.write(1);
            throw new EOFException();
        } else {
            this.field135.write(arg1, arg2, arg0);
            if (arg3 >= 24) {
                this.field136 += arg0;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BJ)V", line = 67)
    public final void method104(byte arg0, long arg1) throws IOException {
        if (arg0 <= 126) {
            this.method105(20);
        }
        this.field135.seek(arg1);
        this.field136 = arg1;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)Ljava/io/File;", line = 78)
    public final File method105(int arg0) {
        return arg0 == -1 ? this.field133 : (File) null;
    }

    @OriginalMember(owner = "mapview!h", name = "finalize", descriptor = "()V", line = 88)
    protected final void finalize() throws Throwable {
        if (this.field135 != null) {
            System.out.println("Warning! fileondisk " + this.field133 + " not closed correctly using close(). Auto-closing instead. ");
            this.method102((byte) -45);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 101)
    public class14(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field135 = new RandomAccessFile(arg0, arg1);
        this.field136 = 0L;
        this.field134 = arg2;
        this.field133 = arg0;
        int var5 = this.field135.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field135.seek(0L);
            this.field135.write(var5);
        }
        this.field135.seek(0L);
    }
}
