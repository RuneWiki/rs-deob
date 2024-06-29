import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class42 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field628;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "J")
    private long field633;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "J")
    private long field634;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Ljava/io/File;")
    private File field639;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "[Lhda;")
    public static class747[] field638 = new class747[5];

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "S")
    public static short field641;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method381(int arg0) {
        if (arg0 > -17) {
            method387(-111, -8, 126, null);
        }
        field638 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BII)Z")
    public static final boolean method382(byte arg0, int arg1, int arg2) {
        if (arg0 <= 75) {
            field641 = 42;
        }
        field631++;
        return class609.method3516(arg2, arg1, (byte) 70) | (arg2 & 0x40000) != 0 || class554.method3244(-1, arg1, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)I")
    public final int method383(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 != 1) {
            method381(-53);
        }
        field636++;
        int var5 = this.field628.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field634 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
    public final void method384(int arg0, long arg1) throws IOException {
        field635++;
        this.field628.seek(arg1);
        int var4 = 24 / ((-arg0 - 8) / 51);
        this.field634 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field632++;
        if (this.field628 != null) {
            System.out.println("Warning! fileondisk " + this.field639 + " not closed correctly using close(). Auto-closing instead. ");
            this.method389(31);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II[BI)V")
    public final void method385(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field637++;
        if (this.field633 < (long) arg3 + this.field634) {
            this.field628.seek(this.field633);
            this.field628.write(1);
            throw new EOFException();
        }
        if (arg1 != 1) {
            method382((byte) -101, 48, -94);
        }
        this.field628.write(arg2, arg0, arg3);
        this.field634 += arg3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)J")
    public final long method386(byte arg0) throws IOException {
        field630++;
        if (arg0 < 1) {
            method382((byte) -66, 124, -110);
        }
        return this.field628.length();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIILbj;)V")
    public static final void method387(int arg0, int arg1, int arg2, class241 arg3) {
        field640++;
        if (!class34.field450) {
            return;
        }
        int var4 = 0;
        for (class66 var5 = (class66) arg3.field3388.method1196(-126); var5 != null; var5 = (class66) arg3.field3388.method1204(false)) {
            int var10 = class76.method766(var5, -1);
            if (var10 > var4) {
                var4 = var10;
            }
        }
        var4 += 8;
        int var6 = arg3.field3382 * 16 + 21;
        class610.field8829 = (class214.field3067 ? 26 : 22) + arg3.field3382 * 16;
        int var7 = class396.field5544 + class380.field5300;
        if (arg2 >= -31) {
            method382((byte) 116, -91, 7);
        }
        if ((var7 + var4) > class206.field2956) {
            var7 = class396.field5544 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class214.field3067 ? 33 : 31;
        int var9 = arg0 + 13 - var8;
        if (class363.field5105 < (var6 + var9)) {
            var9 = class363.field5105 - var6;
        }
        class138.field2148 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class316.field4485 = arg3;
        class167.field2468 = var4;
        class114.field1826 = var9;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method388(int arg0) {
        int var2 = 57 / ((-arg0 - 54) / 41);
        field629++;
        return this.field639;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
    public final void method389(int arg0) throws IOException {
        if (arg0 != 31) {
            field638 = null;
        }
        if (this.field628 != null) {
            this.field628.close();
            this.field628 = null;
        }
        field642++;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class42(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field628 = new RandomAccessFile(arg0, arg1);
        this.field633 = arg2;
        this.field634 = 0L;
        this.field639 = arg0;
        int var5 = this.field628.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field628.seek(0L);
            this.field628.write(var5);
        }
        this.field628.seek(0L);
    }

    static {
        for (int var0 = 0; var0 < field638.length; var0++) {
            field638[var0] = new class747();
        }
        field641 = 1;
        field643 = 0;
    }
}
