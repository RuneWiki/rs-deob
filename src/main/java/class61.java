import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class61 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lje;")
    private class93 field1257;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lje;")
    private class93 field1263;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[Lje;")
    private class93[] field1259;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
    public static int[] field1266 = new int[1000];

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Ljd;")
    public static class92 field1261 = class202.method1325((byte) 90, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Ljd;")
    public static class92 field1271 = class202.method1325((byte) 90, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
    public static int[] field1272 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Ljd;")
    public static class92 field1269 = class202.method1325((byte) 90, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ljd;")
    public static class92 field1268 = class202.method1325((byte) 90, "welle:");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lta;")
    public static class180 field1270;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
    public static int[] field1262;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "[I")
    public static int[] field1275;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method366(int arg0) {
        field1272 = null;
        if (arg0 >= -77) {
            method366(120);
        }
        field1261 = null;
        field1269 = null;
        field1271 = null;
        field1268 = null;
        field1270 = null;
        field1275 = null;
        field1266 = null;
        field1262 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnh;IILo;ZDI)[I")
    public final int[] method367(class133 arg0, int arg1, int arg2, class134 arg3, boolean arg4, double arg5, int arg6) {
        class31.method204(arg5, 105);
        class81.field1650 = arg3;
        class100.field2068 = arg0;
        class48.method299(0, arg2, arg6);
        int[] var9 = new int[arg2 * arg6];
        field1267++;
        for (int var10 = 0; var10 < this.field1259.length; var10++) {
            this.field1259[var10].method654(arg6, arg2, 71);
        }
        byte var11;
        int var12;
        int var13;
        if (arg4) {
            var11 = -1;
            var12 = arg2 - 1;
            var13 = -1;
        } else {
            var12 = 0;
            var11 = 1;
            var13 = arg2;
        }
        int var14 = 0;
        for (int var15 = arg1; var15 < arg6; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1257.field1885) {
                int[] var21 = this.field1257.method66(var15, (byte) 121);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field1257.method62(var15, 4096);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var12; var22 != var13; var22 += var11) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var18[var22] >> 4;
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class111.field2253[var23];
                int var26 = var20[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class111.field2253[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class111.field2253[var26];
                var9[var14++] = (var25 << 16) + (var27 << 8) + var28;
            }
        }
        for (int var16 = 0; var16 < this.field1259.length; var16++) {
            this.field1259[var16].method650((byte) -90);
        }
        return var9;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLnh;Lo;)Z")
    public final boolean method368(byte arg0, class133 arg1, class134 arg2) {
        field1274++;
        int var4 = -21 % ((-arg0 - 35) / 62);
        for (int var5 = 0; var5 < this.field1258.length; var5++) {
            if (!arg1.method885(-2, this.field1258[var5])) {
                return false;
            }
        }
        for (int var6 = 0; var6 < this.field1273.length; var6++) {
            if (!arg2.method163(2583, this.field1273[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class61() {
        this.field1258 = new int[0];
        this.field1273 = new int[0];
        this.field1257 = new class98();
        this.field1263 = new class98();
        this.field1259 = new class93[] { this.field1257, this.field1263 };
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lh;)V")
    public class61(class70 arg0) {
        int var2 = arg0.method443(255);
        class33 var3 = new class33(64);
        class33 var4 = new class33(64);
        int[][] var5 = new int[var2][];
        class33 var6 = new class33(64);
        this.field1259 = new class93[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class93 var21 = class168.method1117(arg0, (byte) -75);
            int var22 = var21.method651(-1);
            int var23 = var21.method656((byte) -124);
            if (var22 >= 0 && var22 >= 0 && var4.method216(-98, (long) var22) == null) {
                var4.method210((byte) -106, (long) var22, new class130(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var6.method216(-104, (long) var23) == null) {
                var6.method210((byte) -85, (long) var23, new class130(var23));
            }
            int var26 = var21.field1894.length;
            var5[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var5[var7][var27] = arg0.method443(255);
            }
            var3.method210((byte) -82, (long) var21.field1881, var21);
            this.field1259[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class93 var17 = this.field1259[var8];
            int var18 = var17.field1894.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class93 var20 = (class93) var3.method216(-111, (long) var5[var8][var19]);
                var17.field1894[var19] = var20;
            }
            var5[var8] = null;
        }
        Object var9 = null;
        this.field1257 = (class93) var3.method216(-76, (long) arg0.method443(255));
        this.field1263 = (class93) var3.method216(-115, (long) arg0.method443(255));
        this.field1258 = new int[var4.method218((byte) -80)];
        this.field1273 = new int[var6.method218((byte) -104)];
        class210[] var10 = new class210[var4.method218((byte) -77)];
        class210[] var11 = new class210[var6.method218((byte) -99)];
        var4.method217((byte) 86, var10);
        Object var12 = null;
        var6.method217((byte) 86, var11);
        Object var13 = null;
        Object var14 = null;
        for (int var15 = 0; var15 < var10.length; var15++) {
            this.field1258[var15] = ((class130) var10[var15]).field2608;
        }
        for (int var16 = 0; var16 < var11.length; var16++) {
            this.field1273[var16] = ((class130) var11[var16]).field2608;
        }
    }
}
