import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class63 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1154;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
    private long field1155;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "J")
    private long field1156;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljava/io/File;")
    private File field1153;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI[B)V")
    public final void method443(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = 39 % ((74 - arg1) / 40);
        if (this.field1156 < (long) arg2 + this.field1155) {
            this.field1154.seek(this.field1156 + 1L);
            this.field1154.write(1);
            throw new EOFException();
        } else {
            this.field1154.write(arg3, arg0, arg2);
            this.field1155 += arg2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)V")
    public final void method444(int arg0, long arg1) throws IOException {
        this.field1154.seek(arg1);
        this.field1155 = arg1;
        if (arg0 != 1) {
            this.field1153 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method445(byte arg0) {
        return arg0 <= 8 ? null : this.field1153;
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1154 != null) {
            System.out.println("Warning! fileondisk " + this.field1153 + " not closed correctly using close(). Auto-closing instead. ");
            this.method446(0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method446(int arg0) throws IOException {
        if (this.field1154 != null) {
            this.field1154.close();
            this.field1154 = null;
        }
        if (arg0 != 0) {
            this.method445((byte) 2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)J")
    public final long method447(byte arg0) throws IOException {
        return arg0 <= 124 ? 43L : this.field1154.length();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII[B)I")
    public final int method448(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1154.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field1155 += var5;
        }
        if (arg0 != -62) {
            this.field1154 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class63(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1154 = new RandomAccessFile(arg0, arg1);
        this.field1155 = 0L;
        this.field1156 = arg2;
        this.field1153 = arg0;
        int var5 = this.field1154.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1154.seek(0L);
            this.field1154.write(var5);
        }
        this.field1154.seek(0L);
    }
}
