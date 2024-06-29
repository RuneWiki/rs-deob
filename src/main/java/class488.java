import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class488 {

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6585;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Ljava/io/File;")
    private File field6588;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "J")
    private long field6592;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "J")
    private long field6594;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "Llj;")
    public static class570 field6589 = new class570(7, 0, 1, 1);

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "Ldb;")
    public static class298 field6598 = new class298(87, 16);

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "Lpca;")
    public static class671 field6599 = new class671("stellardawn", 1);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "Lsba;")
    public static class204 field6601;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "Luw;")
    public static class386 field6600;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIB[B)I")
    public final int method2726(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field6597++;
        int var5 = this.field6585.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field6592 += var5;
        }
        int var6 = 97 / ((-arg2 - 50) / 63);
        return var5;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method2727(byte arg0) {
        field6591++;
        if (arg0 >= -25) {
            method2734(-63);
        }
        return this.field6588;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IC)Z")
    public static final boolean method2728(int arg0, char arg1) {
        field6584++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class353.method2102(arg1, -49)) {
            return true;
        } else {
            char[] var2 = class34.field528;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var8 = var2[var3];
                if (arg1 == var8) {
                    return true;
                }
            }
            char[] var4 = class464.field6267;
            int var5 = 0;
            int var6 = 36 % ((arg0 + 6) / 59);
            while (var4.length > var5) {
                char var7 = var4[var5];
                if (arg1 == var7) {
                    return true;
                }
                var5++;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V")
    public final void method2729(byte arg0) throws IOException {
        field6590++;
        if (this.field6585 != null) {
            this.field6585.close();
            this.field6585 = null;
        }
        int var2 = -113 % ((arg0 - 63) / 37);
    }

    @OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field6585 != null) {
            System.out.println("Warning! fileondisk " + this.field6588 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2729((byte) 113);
        }
        field6586++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I[BII)V")
    public final void method2730(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6595++;
        if (arg3 != -1) {
            return;
        }
        if (((long) arg2 + this.field6592) > this.field6594) {
            this.field6585.seek(this.field6594);
            this.field6585.write(1);
            throw new EOFException();
        } else {
            this.field6585.write(arg1, arg0, arg2);
            this.field6592 += arg2;
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)V")
    public static final void method2731(byte arg0) {
        class288.method1783();
        field6593++;
        if (arg0 != -95) {
            method2734(-46);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class591.field7820[var1].method3703((byte) -78);
        }
        class75.method594((byte) -88);
        class465.method2628((byte) -41);
        System.gc();
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)J")
    public final long method2732(int arg0) throws IOException {
        field6596++;
        if (arg0 < 86) {
            this.field6588 = null;
        }
        return this.field6585.length();
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IJ)V")
    public final void method2733(int arg0, long arg1) throws IOException {
        this.field6585.seek(arg1);
        int var4 = -81 / ((arg0 + 34) / 61);
        field6587++;
        this.field6592 = arg1;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class488(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field6585 = new RandomAccessFile(arg0, arg1);
        this.field6588 = arg0;
        this.field6592 = 0L;
        this.field6594 = arg2;
        int var5 = this.field6585.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6585.seek(0L);
            this.field6585.write(var5);
        }
        this.field6585.seek(0L);
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public static void method2734(int arg0) {
        field6589 = null;
        field6601 = null;
        field6598 = null;
        field6600 = null;
        field6599 = null;
        if (arg0 != 16) {
            method2734(-31);
        }
    }
}
