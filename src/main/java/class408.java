import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class408 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "J")
    private long field5938;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "J")
    private long field5939;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Ljava/io/File;")
    private File field5941;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5940;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)J")
    public final long method2580(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field5941 = null;
        }
        return this.field5940.length();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BJ)V")
    public final void method2581(byte arg0, long arg1) throws IOException {
        this.field5940.seek(arg1);
        if (arg0 >= -48) {
            this.method2585(-30);
        }
        this.field5939 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB[B)I")
    public final int method2582(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        int var5 = this.field5940.read(arg3, arg0, arg1);
        if (var5 > 0) {
            this.field5939 += (long) var5;
        }
        int var6 = -18 / ((arg2 + 70) / 47);
        return var5;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III[B)V")
    public final void method2583(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field5938 < ((long) arg0 + this.field5939)) {
            this.field5940.seek(this.field5938);
            this.field5940.write(1);
            throw new EOFException();
        }
        if (arg1 != 1) {
            this.field5940 = null;
        }
        this.field5940.write(arg3, arg2, arg0);
        this.field5939 += (long) arg0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method2584(byte arg0) throws IOException {
        if (this.field5940 != null) {
            this.field5940.close();
            this.field5940 = null;
        }
        if (arg0 >= -26) {
            this.field5941 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method2585(int arg0) {
        if (arg0 != 18791) {
            this.field5940 = null;
        }
        return this.field5941;
    }

    @OriginalMember(owner = "client!cs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field5940 != null) {
            System.out.println("Warning! fileondisk " + this.field5941 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2584((byte) -115);
        }
    }
}
