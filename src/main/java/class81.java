import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class81 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "J")
    private long field1070;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "J")
    private long field1071;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Ljava/io/File;")
    private File field1072;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1073;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[BIB)I", line = 5)
    public final int method527(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        int var5 = this.field1073.read(arg1, arg2, arg0);
        if (arg3 == 2) {
            if (var5 > 0) {
                this.field1070 += (long) var5;
            }
            return var5;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BIIB)V", line = 19)
    public final void method528(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (this.field1071 >= (long) arg1 + this.field1070) {
            this.field1073.write(arg0, arg2, arg1);
            int var5 = 0 / ((arg3 + 6) / 52);
            this.field1070 += (long) arg1;
        } else {
            this.field1073.seek(this.field1071);
            this.field1073.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field1073 != null) {
            System.out.println("Warning! fileondisk " + this.field1072 + " not closed correctly using close(). Auto-closing instead. ");
            this.method532((byte) 121);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JI)V", line = 54)
    public final void method529(long arg0, int arg1) throws IOException {
        if (arg1 < 19) {
            this.field1070 = -97L;
        }
        this.field1073.seek(arg0);
        this.field1070 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)J", line = 65)
    public final long method530(byte arg0) throws IOException {
        return arg0 == -31 ? this.field1073.length() : 87L;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Ljava/io/File;", line = 75)
    public final File method531(int arg0) {
        return arg0 == -1 ? this.field1072 : (File) null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 86)
    public final void method532(byte arg0) throws IOException {
        if (arg0 >= 97 && this.field1073 != null) {
            this.field1073.close();
            this.field1073 = null;
        }
    }
}
