import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 {

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field385;

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "J")
    private long field388;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "J")
    private long field386;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Ljava/io/File;")
    private File field387;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)J", line = 6)
    public final long method151(int arg0) throws IOException {
        if (arg0 != 30147) {
            this.field388 = -39L;
        }
        return this.field385.length();
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(BII[B)I", line = 16)
    public final int method152(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 26) {
            this.field385 = null;
        }
        int var5 = this.field385.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field388 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(III[B)V", line = 33)
    public final void method153(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 1) {
            return;
        }
        if ((long) arg2 + this.field388 <= this.field386) {
            this.field385.write(arg3, arg1, arg2);
            this.field388 += arg2;
        } else {
            this.field385.seek(this.field386 + 1L);
            this.field385.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)Ljava/io/File;", line = 53)
    public final File method154(byte arg0) {
        int var2 = -5 / ((-arg0 - 19) / 63);
        return this.field387;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(JB)V", line = 62)
    public final void method155(long arg0, byte arg1) throws IOException {
        int var4 = 69 % ((arg1 + 41) / 37);
        this.field385.seek(arg0);
        this.field388 = arg0;
    }

    @OriginalMember(owner = "mapview!n", name = "finalize", descriptor = "()V", line = 71)
    protected final void finalize() throws Throwable {
        if (this.field385 != null) {
            System.out.println("Warning! fileondisk " + this.field387 + " not closed correctly using close(). Auto-closing instead. ");
            this.method156(19961);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 85)
    public final void method156(int arg0) throws IOException {
        if (this.field385 != null) {
            this.field385.close();
            this.field385 = null;
        }
        if (arg0 != 19961) {
            this.field385 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class25(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field385 = new RandomAccessFile(arg0, arg1);
        this.field388 = 0L;
        this.field386 = arg2;
        this.field387 = arg0;
        int var5 = this.field385.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field385.seek(0L);
            this.field385.write(var5);
        }
        this.field385.seek(0L);
    }
}
