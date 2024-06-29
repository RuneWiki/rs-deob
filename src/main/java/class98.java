import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2193;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "J")
    private long field2196;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "J")
    private long field2194;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/io/File;")
    private File field2195;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)J", line = 3)
    public final long method660(byte arg0) throws IOException {
        if (arg0 != 109) {
            this.field2195 = null;
        }
        return this.field2193.length();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Ljava/io/File;", line = 13)
    public final File method661(boolean arg0) {
        if (arg0) {
            this.method661(true);
        }
        return this.field2195;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB[BI)V", line = 24)
    public final void method662(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2196 < (long) arg0 + this.field2194) {
            this.field2193.seek(this.field2196 + 1L);
            this.field2193.write(1);
            throw new EOFException();
        } else {
            this.field2193.write(arg2, arg3, arg0);
            if (arg1 < -65) {
                this.field2194 += arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII)I", line = 43)
    public final int method663(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2193.read(arg1, arg0, arg2);
        if (~var5 < arg3) {
            this.field2194 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 58)
    public final void method664(int arg0, long arg1) throws IOException {
        this.field2193.seek(arg1);
        if (arg0 >= 101) {
            this.field2194 = arg1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 71)
    public class98(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2193 = new RandomAccessFile(arg0, arg1);
        this.field2196 = arg2;
        this.field2194 = 0L;
        this.field2195 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V", line = 93)
    public final void method665(boolean arg0) throws IOException {
        this.field2193.close();
        if (arg0) {
            this.field2193 = null;
        }
    }
}
