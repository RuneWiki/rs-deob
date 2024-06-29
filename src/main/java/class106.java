import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class106 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2156;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/io/File;")
    private File field2158;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "J")
    private long field2157;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
    private long field2159;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IJ)V")
    public final void method722(int arg0, long arg1) throws IOException {
        if (arg0 != 1) {
            this.field2157 = 34L;
        }
        this.field2156.seek(arg1);
        this.field2159 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)J")
    public final long method723(byte arg0) throws IOException {
        if (arg0 != 13) {
            this.method724((byte) -33);
        }
        return this.field2156.length();
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method724(byte arg0) {
        if (arg0 >= -94) {
            this.field2159 = 57L;
        }
        return this.field2158;
    }

    @OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2156 != null) {
            System.out.println("Warning! fileondisk " + this.field2158 + " not closed correctly using close(). Auto-closing instead. ");
            this.method725((byte) 50);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public final void method725(byte arg0) throws IOException {
        if (this.field2156 != null) {
            this.field2156.close();
            this.field2156 = null;
        }
        if (arg0 != 50) {
            this.method724((byte) 35);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)I")
    public final int method726(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = 60 % ((4 - arg3) / 43);
        int var6 = this.field2156.read(arg2, arg0, arg1);
        if (var6 > 0) {
            this.field2159 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII[B)V")
    public final void method727(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 114) {
            this.field2157 = 12L;
        }
        if ((long) arg2 + this.field2159 > this.field2157) {
            this.field2156.seek(this.field2157 + 1L);
            this.field2156.write(1);
            throw new EOFException();
        } else {
            this.field2156.write(arg3, arg1, arg2);
            this.field2159 += arg2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class106(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2156 = new RandomAccessFile(arg0, arg1);
        this.field2158 = arg0;
        this.field2157 = arg2;
        this.field2159 = 0L;
        int var5 = this.field2156.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2156.seek(0L);
            this.field2156.write(var5);
        }
        this.field2156.seek(0L);
    }
}
