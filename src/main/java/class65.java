import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 {

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[I")
    private int[] field1289;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "[I")
    private int[] field1292;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lpf;")
    private class273 field1284;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lpf;")
    private class273 field1281;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[Lpf;")
    private class273[] field1280;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljd;")
    public static class86 field1279 = class122.method868("Spieler kann nicht gefunden werden: ", true);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Ljd;")
    public static class86 field1283 = class122.method868("Weiter", true);

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "Ljd;")
    public static class86 field1295 = null;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Ljd;")
    private static class86 field1290 = class122.method868("Take", true);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Ljd;")
    public static class86 field1288 = field1290;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "B")
    public static byte field1287;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Log;")
    public static class210 field1291;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Ljd;")
    public static final class86 method459(int arg0, boolean arg1) {
        class86 var2 = class4.method26(false, arg0);
        for (int var3 = var2.method612((byte) 90) - 3; var3 > 0; var3 -= 3) {
            var2 = class109.method783(2, new class86[] { var2.method610(0, var3, (byte) -81), class10.field318, var2.method633(var3, (byte) 61) });
        }
        if (!arg1) {
            method461(115);
        }
        field1285++;
        if (var2.method612((byte) 82) > 9) {
            return class109.method783(2, new class86[] { class76.field1514, var2.method610(0, var2.method612((byte) 127) - 8, (byte) -81), class44.field972, class81.field1581, var2, class157.field2959 });
        } else if (var2.method612((byte) 118) > 6) {
            return class109.method783(2, new class86[] { class111.field2120, var2.method610(0, var2.method612((byte) 60) - 4, (byte) -81), class93.field1880, class81.field1581, var2, class157.field2959 });
        } else {
            return class109.method783(2, new class86[] { class255.field4536, var2, class87.field1732 });
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILbj;DLbe;BZIZ)[I")
    public final int[] method460(int arg0, class151 arg1, double arg2, class28 arg3, byte arg4, boolean arg5, int arg6, boolean arg7) {
        class191.method1310(arg2, 256);
        class160.field3009 = arg3;
        class230.field4182 = arg1;
        class9.method60(true, arg0, arg6);
        field1278++;
        int[] var10 = new int[arg0 * arg6];
        for (int var11 = 0; var11 < this.field1280.length; var11++) {
            this.field1280[var11].method1860(arg6, (byte) 72, arg0);
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = 1;
            var13 = arg0;
            var12 = 0;
        }
        if (arg4 <= 42) {
            return null;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1284.field4778) {
                int[] var18 = this.field1284.method31(-7420, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1284.method29(var16, (byte) -93);
                var20 = var22[1];
                var19 = var22[0];
                var21 = var22[2];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                int var26 = class270.field4752[var24];
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = var19[var23] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class270.field4752[var25];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class270.field4752[var27];
                var10[var15++] = (var26 << 8) + (var29 << 16) + var28;
                if (arg5) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1280.length; var17++) {
            this.field1280[var17].method966((byte) -113);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method461(int arg0) {
        field1291 = null;
        if (arg0 != 866) {
            method462(-9, 1);
        }
        field1279 = null;
        field1288 = null;
        field1295 = null;
        field1290 = null;
        field1283 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method462(int arg0, int arg1) {
        class249 var2 = class248.field4406[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class249 var4 = class248.field4406[var3][arg0][arg1] = class248.field4406[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4430--;
                for (int var5 = 0; var5 < var4.field4445; var5++) {
                    class228 var6 = var4.field4429[var5];
                    if ((var6.field4122 >> 29 & 0x3L) == 2L && var6.field4137 == arg0 && var6.field4127 == arg1) {
                        var6.field4141--;
                    }
                }
            }
        }
        if (class248.field4406[0][arg0][arg1] == null) {
            class248.field4406[0][arg0][arg1] = new class249(0, arg0, arg1);
        }
        class248.field4406[0][arg0][arg1].field4428 = var2;
        class248.field4406[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method463(byte arg0) {
        field1294++;
        if (class154.field2892 == 5) {
            int var1 = -98 / ((arg0 + 31) / 45);
            class154.field2892 = 6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbe;BLbj;)Z")
    public final boolean method464(class28 arg0, byte arg1, class151 arg2) {
        field1293++;
        for (int var4 = 0; var4 < this.field1289.length; var4++) {
            if (!arg2.method1096(-118, this.field1289[var4])) {
                return false;
            }
        }
        int var5 = 97 % ((arg1 - 48) / 56);
        for (int var6 = 0; var6 < this.field1292.length; var6++) {
            if (!arg0.method189((byte) 90, this.field1292[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class65() {
        this.field1289 = new int[0];
        this.field1292 = new int[0];
        this.field1284 = new class81();
        this.field1284.field4806 = 1;
        this.field1281 = new class81();
        this.field1280 = new class273[] { this.field1284, this.field1281 };
        this.field1281.field4806 = 1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbj;B)V")
    public static final void method465(class151 arg0, byte arg1) {
        field1282++;
        class272.field4767 = class92.method681(0, arg0, 28803, class198.field3511);
        class209.field3781 = new class101[class272.field4767.length];
        int var2 = -98 / ((40 - arg1) / 41);
        class114.field2185 = new class101[class272.field4767.length];
        class66.field1314 = new class101[class272.field4767.length];
        for (int var3 = 0; var3 < class272.field4767.length; var3++) {
            class272.field4767[var3].method729();
            class209.field3781[var3] = class272.field4767[var3].method727();
            class272.field4767[var3].method729();
            class114.field2185[var3] = class272.field4767[var3].method727();
            class272.field4767[var3].method729();
            class66.field1314[var3] = class272.field4767[var3].method727();
            class272.field4767[var3].method729();
        }
        class125.field2430 = class127.method895(0, arg0, false, class5.field68);
        class14.field434 = class242.method1656(0, class273.field4797, -13248, arg0);
        class102.field1972 = class242.method1656(0, class155.field2923, -13248, arg0);
        class51.field1072 = class242.method1656(0, class107.field2068, -13248, arg0);
        class237.field4278 = class242.method1656(0, class152.field2880, -13248, arg0);
        class271.field4756 = class31.method205((byte) 114, class246.field4377, arg0, 0);
        class219.field3945 = class31.method205((byte) 67, class203.field3672, arg0, 0);
        class150.field2795 = class247.method1675(0, class138.field2638, arg0, 503);
        class121.field2343 = class31.method205((byte) 110, class226.field4098, arg0, 0);
        class206.field3723 = class31.method205((byte) 82, class25.field607, arg0, 0);
        class206.field3749 = class257.method1733(11280, arg0, 0, class58.field1173);
        class238.field4294 = class257.method1733(11280, arg0, 0, class178.field3219);
        class45.field1014.method1752(class238.field4294, (int[]) null);
        class211.field3820.method1752(class238.field4294, (int[]) null);
        class141.field2684.method1752(class238.field4294, (int[]) null);
        class167 var4 = class238.method1639(class155.field2929, arg0, 128, 0);
        var4.method1201();
        class157.field2962 = var4;
        class167[] var5 = class127.method895(0, arg0, false, class179.field3239);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1201();
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        class108.field2076 = var5;
        for (int var11 = 0; var11 < class125.field2430.length; var11++) {
            class125.field2430[var11].method1199(var7 + var9, var9 + var10, var8 + var9);
        }
        class272.field4767[0].method728(var7 + var9, var10 - -var9, var8 + var9);
        class43.field959 = class125.field2430;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lqk;)V")
    public class65(class200 arg0) {
        int var2 = arg0.method1408((byte) -19);
        this.field1280 = new class273[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class273 var16 = class8.method55(arg0, (byte) -79);
            if (var16.method970((byte) 116) >= 0) {
                var3++;
            }
            if (var16.method1006((byte) 119) >= 0) {
                var4++;
            }
            int var17 = var16.field4794.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1408((byte) -84);
            }
            this.field1280[var6] = var16;
        }
        this.field1292 = new int[var4];
        int var7 = 0;
        this.field1289 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class273 var11 = this.field1280[var9];
            int var12 = var11.field4794.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4794[var13] = this.field1280[var5[var9][var13]];
            }
            int var14 = var11.method970((byte) 116);
            int var15 = var11.method1006((byte) 124);
            if (var14 > 0) {
                this.field1289[var8++] = var14;
            }
            if (var15 > 0) {
                this.field1292[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field1284 = this.field1280[arg0.method1408((byte) -80)];
        this.field1281 = this.field1280[arg0.method1408((byte) -109)];
        Object var10 = null;
    }
}
