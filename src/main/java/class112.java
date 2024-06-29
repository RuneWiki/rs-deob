import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class112 extends class263 {

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field1393 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1383 = -1;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1402 = new String[8];

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lpp;")
    public class365 field1392;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "Lqj;")
    public static class476 field1400;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lhl;")
    public class494 field1390;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Lhl;")
    public class494 field1412;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lft;")
    public class4 field1413;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Lft;")
    public class4 field1414;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Lac;")
    public class506 field1389;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lfh;")
    public class609 field1386;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Lfh;")
    public class609 field1396;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Lpg;")
    public class687 field1404;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
    public boolean field1384;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Z")
    public boolean field1387;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Z")
    public boolean field1395;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "[I")
    public int[] field1401;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 19)
    public static final String[] method774(char arg0, int arg1, String arg2) {
        field1394++;
        int var3 = class445.method2440(arg0, arg2, 0);
        String[] var4 = new String[arg1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I", line = 59)
    public static final int method775(int arg0) {
        field1397++;
        if (class467.field5795 == 0) {
            class350.field4496.method2016(120, new class144("jaclib"));
            if (class350.field4496.method2020(64).method909(-1038) != 100) {
                return 1;
            }
            if (!((class144) class350.field4496.method2020(64)).method907(arg0 + 19189)) {
                class455.field5687.method1199((byte) -87);
            }
            class467.field5795 = 1;
        }
        if (class467.field5795 == 1) {
            class159.field1879 = class350.method2019(15578);
            class350.field4489.method2016(arg0 - 24, new class473(class195.field2300));
            class350.field4499.method2016(111, new class144("jaggl"));
            class350.field4500.method2016(95, new class144("jagdx"));
            class350.field4501.method2016(109, new class144("jagmisc"));
            class350.field4502.method2016(97, new class144("sw3d"));
            class350.field4503.method2016(72, new class144("hw3d"));
            class350.field4504.method2016(93, new class473(class292.field3706));
            class350.field4505.method2016(76, new class473(class677.field9227));
            class350.field4506.method2016(87, new class473(class634.field8594));
            class350.field4507.method2016(83, new class473(class487.field6090));
            class350.field4508.method2016(47, new class473(class72.field939));
            class350.field4509.method2016(87, new class473(class19.field203));
            class350.field4510.method2016(106, new class473(class336.field4147));
            class350.field4511.method2016(arg0 - 37, new class473(class563.field7035));
            class350.field4512.method2016(97, new class473(class405.field5224));
            class350.field4513.method2016(84, new class473(class664.field9025));
            class350.field4514.method2016(121, new class473(class590.field7924));
            class350.field4515.method2016(86, new class473(class527.field6658));
            class350.field4516.method2016(arg0 ^ 0x26, new class473(class489.field6112));
            class350.field4517.method2016(66, new class473(class493.field6150));
            class350.field4518.method2016(58, new class644(class261.field3310, "huffman"));
            class350.field4519.method2016(44, new class473(class667.field9049));
            class350.field4520.method2016(125, new class473(class261.field3309));
            class350.field4521.method2016(arg0 ^ 0x27, new class473(class329.field4095));
            class350.field4522.method2016(arg0 ^ 0x3B, new class214(class682.field9284, "details"));
            for (int var1 = 0; var1 < class159.field1879.length; var1++) {
                if (class159.field1879[var1].method2020(arg0 ^ 0x23) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class350[] var3 = class159.field1879;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class350 var5 = var3[var4];
                int var6 = var5.method2013(false);
                int var7 = var5.method2020(64).method909(-1038);
                var2 += var6 * var7 / 100;
            }
            class460.field5746 = var2;
            class467.field5795 = 2;
        }
        if (arg0 != 99) {
            method778(-54, null, -62, 70, -75, null, 123, -13, -101);
        }
        if (class159.field1879 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class350[] var11 = class159.field1879;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class350 var16 = var11[var12];
            int var17 = var16.method2013(false);
            int var18 = var16.method2020(64).method909(-1038);
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class144) class350.field4501.method2020(64)).method907(19288)) {
                class455.field5687.method1198(true);
            }
            class159.field1879 = null;
        }
        int var13 = var9 - class460.field5746;
        int var14 = var8 - class460.field5746;
        int var15 = var14 > 0 ? var13 * 100 / var14 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 215)
    public final void method776(int arg0) {
        field1415++;
        int var2 = 115 % ((46 - arg0) / 34);
        int var3 = this.field1399;
        boolean var4 = this.field1387;
        if (this.field1404 != null) {
            class687 var5 = this.field1404.method3800(class327.field4084, (byte) -127);
            if (var5 == null) {
                this.field1403 = 0;
                this.field1388 = 0;
                this.field1399 = -1;
                this.field1395 = false;
                this.field1387 = false;
                this.field1401 = null;
                this.field1410 = 0;
                this.field1405 = 0;
            } else {
                this.field1410 = var5.field9387;
                this.field1405 = var5.field9390;
                this.field1388 = var5.field9430;
                this.field1401 = var5.field9460;
                this.field1395 = var5.field9453;
                this.field1387 = var5.field9416;
                this.field1399 = var5.field9380;
                this.field1403 = var5.field9427 << 9;
            }
        } else if (this.field1389 != null) {
            int var6 = class294.method1774(-125, this.field1389);
            if (var3 != var6) {
                this.field1399 = var6;
                class689 var7 = this.field1389.field6326;
                if (var7.field9546 != null) {
                    var7 = var7.method3812(class327.field4084, -116);
                }
                if (var7 == null) {
                    this.field1410 = this.field1403 = 0;
                    this.field1387 = this.field1389.field6326.field9525;
                } else {
                    this.field1403 = var7.field9530 << 9;
                    this.field1410 = var7.field9511;
                    this.field1387 = var7.field9525;
                }
            }
        } else if (this.field1392 != null) {
            this.field1399 = class78.method610(this.field1392, -959874180);
            this.field1410 = this.field1392.field4712;
            this.field1403 = this.field1392.field4716 << 9;
            this.field1387 = this.field1392.field4692;
        }
        if (this.field1399 == var3 && this.field1387 == var4) {
            return;
        }
        if (this.field1396 == null) {
            return;
        }
        class314.field3941.method1489(this.field1396);
        this.field1396 = null;
        this.field1413 = null;
        this.field1390 = null;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V", line = 312)
    public static void method777(int arg0) {
        if (arg0 != -22462) {
            field1383 = 45;
        }
        field1400 = null;
        field1402 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BIII[BIII)V", line = 325)
    public static final void method778(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field1385++;
        if (arg2 <= 10) {
            method775(21);
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg5[arg7++]);
                int var14 = arg6++;
                arg1[var14] = (byte) (arg1[var14] - arg5[arg7++]);
                int var15 = arg6++;
                arg1[var15] = (byte) (arg1[var15] - arg5[arg7++]);
                int var16 = arg6++;
                arg1[var16] = (byte) (arg1[var16] - arg5[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg1[var10001] = (byte) (arg1[var10001] - arg5[arg7++]);
            }
            arg7 += arg4;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBZ)V", line = 373)
    public static final void method779(int arg0, byte arg1, boolean arg2) {
        int var3 = -39 / ((-arg1 - 79) / 39);
        field1406++;
        class36 var4 = class354.method2029(arg0, Integer.MIN_VALUE, arg2);
        if (var4 != null) {
            var4.method1566(-122);
        }
    }
}
