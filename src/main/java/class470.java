import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class470 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6584;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "J")
    private long field6585;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "J")
    private long field6587;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Ljava/io/File;")
    private File field6594;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field6595 = 0;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Loaa;")
    public static class290 field6592 = new class290(0, 2, 2, 1);

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BIBI)I", line = 4)
    public final int method2768(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field6588++;
        int var5 = this.field6584.read(arg0, arg1, arg3);
        int var6 = 39 % ((75 - arg2) / 39);
        if (var5 > 0) {
            this.field6587 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2769(boolean arg0) throws IOException {
        field6593++;
        if (arg0) {
            this.method2772(-27);
        }
        if (this.field6584 != null) {
            this.field6584.close();
            this.field6584 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BII[B)V", line = 39)
    public final void method2770(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6591++;
        if (((long) arg2 + this.field6587) > this.field6585) {
            this.field6584.seek(this.field6585);
            this.field6584.write(1);
            throw new EOFException();
        }
        if (arg0 < 108) {
            this.field6587 = 124L;
        }
        this.field6584.write(arg3, arg1, arg2);
        this.field6587 += arg2;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 64)
    public static void method2771(byte arg0) {
        if (arg0 >= -2) {
            method2771((byte) 126);
        }
        field6592 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Ljava/io/File;", line = 74)
    public final File method2772(int arg0) {
        field6590++;
        if (arg0 <= 64) {
            method2771((byte) -48);
        }
        return this.field6594;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IJ)V", line = 85)
    public final void method2773(int arg0, long arg1) throws IOException {
        field6596++;
        if (arg0 != -18968) {
            this.field6584 = null;
        }
        this.field6584.seek(arg1);
        this.field6587 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)J", line = 97)
    public final long method2774(byte arg0) throws IOException {
        field6586++;
        return arg0 == -46 ? this.field6584.length() : 97L;
    }

    @OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V", line = 108)
    protected final void finalize() throws Throwable {
        if (this.field6584 != null) {
            System.out.println("Warning! fileondisk " + this.field6594 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2769(false);
        }
        field6589++;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 123)
    public class470(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field6584 = new RandomAccessFile(arg0, arg1);
        this.field6585 = arg2;
        this.field6587 = 0L;
        this.field6594 = arg0;
        int var5 = this.field6584.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6584.seek(0L);
            this.field6584.write(var5);
        }
        this.field6584.seek(0L);
    }
}
