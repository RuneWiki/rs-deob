import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1188;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "J")
    private long field1190;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "J")
    private long field1189;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/io/File;")
    private File field1191;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BII)V")
    public final void method378(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field1189 > this.field1190) {
            this.field1188.seek(this.field1190 + 1L);
            this.field1188.write(1);
            throw new EOFException();
        }
        this.field1188.write(arg1, arg2, arg0);
        this.field1189 += arg0;
        if (arg3 != -1) {
            this.method382(-85);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)J")
    public final long method379(byte arg0) throws IOException {
        return arg0 == 44 ? this.field1188.length() : -83L;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public final void method380(byte arg0) throws IOException {
        this.field1188.close();
        this.field1188 = null;
        if (arg0 != -50) {
            this.field1191 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V")
    public final void method381(byte arg0, long arg1) throws IOException {
        if (arg0 != -44) {
            this.field1188 = null;
        }
        this.field1188.seek(arg1);
        this.field1189 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method382(int arg0) {
        return arg0 == 0 ? this.field1191 : null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I[BII)I")
    public final int method383(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1188.read(arg1, arg3, arg0);
        if (var5 > arg2) {
            this.field1189 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class54(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1188 = new RandomAccessFile(arg0, arg1);
        this.field1190 = arg2;
        this.field1189 = 0L;
        this.field1191 = arg0;
        int var5 = this.field1188.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1188.seek(0L);
            this.field1188.write(var5);
        }
        this.field1188.seek(0L);
    }
}
