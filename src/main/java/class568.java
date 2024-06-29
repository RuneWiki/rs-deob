import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class568 {

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field8278;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "J")
    private long field8280;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "J")
    private long field8274;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Ljava/io/File;")
    private File field8276;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lefa;")
    public static class322 field8272 = new class322(8);

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "[Leda;")
    public static class116[] field8284 = new class116[0];

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BJ)V")
    public final void method3268(byte arg0, long arg1) throws IOException {
        field8275++;
        this.field8278.seek(arg1);
        this.field8280 = arg1;
        if (arg0 > -11) {
            this.method3270(-92);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[BBI)I")
    public final int method3269(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = 56 % ((57 - arg2) / 52);
        field8282++;
        int var6 = this.field8278.read(arg1, arg3, arg0);
        if (var6 > 0) {
            this.field8280 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method3270(int arg0) {
        if (arg0 != 29822) {
            this.method3270(-74);
        }
        field8279++;
        return this.field8276;
    }

    @OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field8278 != null) {
            System.out.println("Warning! fileondisk " + this.field8276 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3271((byte) -85);
        }
        field8273++;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class568(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field8278 = new RandomAccessFile(arg0, arg1);
        this.field8280 = 0L;
        this.field8274 = arg2;
        this.field8276 = arg0;
        int var5 = this.field8278.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field8278.seek(0L);
            this.field8278.write(var5);
        }
        this.field8278.seek(0L);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public final void method3271(byte arg0) throws IOException {
        field8281++;
        if (this.field8278 != null) {
            this.field8278.close();
            this.field8278 = null;
        }
        if (arg0 > -72) {
            field8284 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)J")
    public final long method3272(boolean arg0) throws IOException {
        if (arg0) {
            method3274((byte) 48);
        }
        field8283++;
        return this.field8278.length();
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[BZ)V")
    public final void method3273(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field8277++;
        if (this.field8274 < (long) arg1 + this.field8280) {
            this.field8278.seek(this.field8274);
            this.field8278.write(1);
            throw new EOFException();
        }
        this.field8278.write(arg2, arg0, arg1);
        this.field8280 += arg1;
        if (!arg3) {
            this.field8278 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static void method3274(byte arg0) {
        field8272 = null;
        field8284 = null;
        int var1 = -85 % ((-arg0 - 50) / 38);
    }
}
