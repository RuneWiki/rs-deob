import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 {

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field447;

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "J")
    private long field449;

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "J")
    private long field450;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Ljava/io/File;")
    private File field448;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)V", line = 4)
    public final void method205(byte arg0) throws IOException {
        if (this.field447 != null) {
            this.field447.close();
            this.field447 = null;
        }
        int var2 = -74 % ((arg0 + 82) / 39);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)J", line = 19)
    public final long method206(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field449 = 35L;
        }
        return this.field447.length();
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I[BIB)V", line = 31)
    public final void method207(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 <= 98) {
            this.field450 = 68L;
        }
        if (this.field450 >= (long) arg0 + this.field449) {
            this.field447.write(arg1, arg2, arg0);
            this.field449 += arg0;
        } else {
            this.field447.seek(this.field450 + 1L);
            this.field447.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)Ljava/io/File;", line = 51)
    public final File method208(boolean arg0) {
        return arg0 ? (File) null : this.field448;
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 60)
    public class33(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field447 = new RandomAccessFile(arg0, arg1);
        this.field449 = 0L;
        this.field450 = arg2;
        this.field448 = arg0;
        int var5 = this.field447.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field447.seek(0L);
            this.field447.write(var5);
        }
        this.field447.seek(0L);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(BJ)V", line = 93)
    public final void method209(byte arg0, long arg1) throws IOException {
        this.field447.seek(arg1);
        this.field449 = arg1;
        int var4 = -40 / ((77 - arg0) / 36);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(III[B)I", line = 104)
    public final int method210(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 > -28) {
            this.method208(true);
        }
        int var5 = this.field447.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field449 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ra", name = "finalize", descriptor = "()V", line = 119)
    protected final void finalize() throws Throwable {
        if (this.field447 != null) {
            System.out.println("Warning! fileondisk " + this.field448 + " not closed correctly using close(). Auto-closing instead. ");
            this.method205((byte) -16);
        }
    }
}
