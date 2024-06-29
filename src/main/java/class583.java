import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class583 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field8252;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/io/File;")
    private File field8253;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "J")
    private long field8246;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "J")
    private long field8254;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lfja;")
    public static class783 field8250 = new class783(34, 3);

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field8258 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Ld;")
    public static class162 field8256;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method3346(int arg0) {
        field8247++;
        return arg0 == 0 ? this.field8253 : null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)J")
    public final long method3347(int arg0) throws IOException {
        field8249++;
        return arg0 == 0 ? this.field8252.length() : 96L;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BII)V")
    public final void method3348(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 1) {
            method3352(true);
        }
        field8255++;
        if (this.field8246 < ((long) arg2 + this.field8254)) {
            this.field8252.seek(this.field8246);
            this.field8252.write(1);
            throw new EOFException();
        } else {
            this.field8252.write(arg1, arg0, arg2);
            this.field8254 += arg2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method3349(int arg0) throws IOException {
        if (this.field8252 != null) {
            this.field8252.close();
            this.field8252 = null;
        }
        if (arg0 != -4013) {
            field8258 = 83;
        }
        field8251++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZJ)V")
    public final void method3350(boolean arg0, long arg1) throws IOException {
        this.field8252.seek(arg1);
        field8244++;
        if (arg0) {
            this.method3346(118);
        }
        this.field8254 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[BII)I")
    public final int method3351(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 >= -109) {
            method3352(true);
        }
        field8245++;
        int var5 = this.field8252.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field8254 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method3352(boolean arg0) {
        field8256 = null;
        field8250 = null;
        if (arg0) {
            field8256 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8248++;
        if (this.field8252 != null) {
            System.out.println("Warning! fileondisk " + this.field8253 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3349(-4013);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class583(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field8252 = new RandomAccessFile(arg0, arg1);
        this.field8253 = arg0;
        this.field8246 = arg2;
        this.field8254 = 0L;
        int var5 = this.field8252.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field8252.seek(0L);
            this.field8252.write(var5);
        }
        this.field8252.seek(0L);
    }
}
