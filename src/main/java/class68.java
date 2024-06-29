import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class68 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "J")
    private long field1283;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "J")
    private long field1284;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljava/io/File;")
    private File field1282;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1285;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BBII)V", line = 6)
    public final void method453(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -117) {
            this.method456((byte) -79);
        }
        if (this.field1283 < (long) arg3 + this.field1284) {
            this.field1285.seek(this.field1283 + 1L);
            this.field1285.write(1);
            throw new EOFException();
        } else {
            this.field1285.write(arg0, arg2, arg3);
            this.field1284 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J", line = 24)
    public final long method454(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method456((byte) 16);
        }
        return this.field1285.length();
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        if (this.field1285 != null) {
            System.out.println("Warning! fileondisk " + this.field1282 + " not closed correctly using close(). Auto-closing instead. ");
            this.method457(1);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BIII)I", line = 47)
    public final int method455(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1285.read(arg0, arg2, arg3);
        if (var5 > arg1) {
            this.field1284 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Ljava/io/File;", line = 58)
    public final File method456(byte arg0) {
        if (arg0 <= 64) {
            this.field1283 = 61L;
        }
        return this.field1282;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 69)
    public final void method457(int arg0) throws IOException {
        if (this.field1285 != null) {
            this.field1285.close();
            this.field1285 = null;
        }
        if (arg0 != 1) {
            this.method456((byte) -58);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V", line = 86)
    public final void method458(long arg0, int arg1) throws IOException {
        if (arg1 != -26545) {
            this.method456((byte) 38);
        }
        this.field1285.seek(arg0);
        this.field1284 = arg0;
    }
}
