import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class33 {

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "Lf;")
    public static class10 field469 = class23.method139("Brewery", (byte) -72);

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "[[B")
    public static byte[][] field471 = new byte[1000][];

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "[I")
    public static int[] field473 = new int[256];

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lf;")
    public static class10 field474;

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "Lf;")
    public static class10 field476;

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "Lf;")
    public static class10 field475;

    @OriginalMember(owner = "mapview!qa", name = "l", descriptor = "Lf;")
    public static class10 field480;

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field479;

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "[I")
    public static int[] field470;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "[[Lm;")
    public static class24[][] field477;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I[B)[B", line = 18)
    public static final byte[] method215(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class40.method253(arg1, 0, var3, 0, var2);
        return arg0 > -103 ? (byte[]) null : var3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field473[var0] = var1;
        }
        field474 = class23.method139("Mini)2Game", (byte) -53);
        field476 = class23.method139("Spice Shop", (byte) -57);
        field475 = class23.method139("Cookery Shop", (byte) -128);
        field480 = class23.method139("Mining Site", (byte) -60);
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(II[Lf;I)Lf;", line = 45)
    public static final class10 method216(int arg0, int arg1, class10[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class41.field543;
            }
            var4 += arg2[arg1 + var5].field106;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg0 < 77) {
            method219(-5, 105, -3);
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            class10 var9 = arg2[arg1 + var8];
            class40.method253(var9.field112, 0, var6, var7, var9.field106);
            var7 += var9.field106;
        }
        class10 var10 = new class10();
        var10.field112 = var6;
        var10.field106 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(IZ)I", line = 89)
    public final int method217(int arg0, boolean arg1) {
        int var3 = (this.field472.length >> 1) - 1;
        int var4 = arg0 & var3;
        if (arg1) {
            return 83;
        }
        while (true) {
            int var5 = this.field472[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field472[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)V", line = 114)
    public static void method218(int arg0) {
        field470 = null;
        field477 = null;
        field469 = null;
        field479 = null;
        field475 = null;
        field476 = null;
        field471 = null;
        field474 = null;
        if (arg0 != 4032) {
            method218(110);
        }
        field473 = null;
        field480 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(III)B", line = 141)
    public static final byte method219(int arg0, int arg1, int arg2) {
        int var3 = 45 % ((55 - arg2) / 63);
        int var4 = arg0 >> 6;
        int var5 = arg1 >> 6;
        if (class23.field248[var4][var5] == null) {
            return 0;
        } else if (class23.field248[var4][var5].field261 == null) {
            return class23.field248[var4][var5].field264;
        } else {
            return class23.field248[var4][var5].field261[(arg0 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "([I)V", line = 162)
    public class33(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field472 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field472[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field472[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field472[var5 + var5] = arg0[var4];
            this.field472[var5 + var5 + 1] = var4++;
        }
    }
}
