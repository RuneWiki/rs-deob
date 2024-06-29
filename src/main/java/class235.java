import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class235 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lbj;")
    public static class215 field3665 = new class215(new byte[5000]);

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
    public static boolean field3668 = false;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lel;")
    public static final class82 method1541(int arg0, int arg1) {
        field3663++;
        class82 var2 = (class82) class246.field3859.method950((long) arg0, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        class82 var3 = class132.method840(class164.field2330, false, (byte) 6, arg0, class250.field3904);
        if (var3 != null) {
            class246.field3859.method942((long) arg0, (byte) 31, var3);
        }
        int var4 = 92 % ((33 - arg1) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Z")
    public static final boolean method1542(int arg0, byte arg1) {
        class43.field657 = true;
        field3667++;
        if (arg1 == -105) {
            class305.field4880 = arg0 + 1 & 0xFFFF;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lbj;")
    public static final class215 method1543(boolean arg0) {
        field3670++;
        class215 var1 = new class215(34);
        if (arg0) {
            return null;
        }
        var1.method1363(11, -72);
        var1.method1363(class270.field4310, 99);
        var1.method1363(class26.field414 ? 1 : 0, -31);
        var1.method1363(class281.field4464 ? 1 : 0, -64);
        var1.method1363(class38.field583 ? 1 : 0, 120);
        var1.method1363(class116.field1677 ? 1 : 0, -54);
        var1.method1363(class288.field4598 ? 1 : 0, 120);
        var1.method1363(class103.field1483 ? 1 : 0, -116);
        var1.method1363(class78.field1087 ? 1 : 0, -76);
        var1.method1363(class68.field959 ? 1 : 0, 96);
        var1.method1363(class56.field782, -65);
        var1.method1363(class202.field3054 ? 1 : 0, 106);
        var1.method1363(class314.field5048 ? 1 : 0, -18);
        var1.method1363(class108.field1548 ? 1 : 0, 109);
        var1.method1363(class181.field2741, 111);
        var1.method1363(class37.field570 ? 1 : 0, 107);
        var1.method1363(class221.field3440, 94);
        var1.method1363(class51.field716, 122);
        var1.method1363(class209.field3110, -51);
        var1.method1385(class71.field1033, true);
        var1.method1385(class59.field818, true);
        var1.method1363(class220.method1441(), 126);
        var1.method1398(true, class71.field1028);
        var1.method1363(class288.field4610, 95);
        var1.method1363(class223.field3483 ? 1 : 0, 115);
        var1.method1363(class78.field1085 ? 1 : 0, -21);
        var1.method1363(class221.field3441, 116);
        var1.method1363(class139.field1929 ? 1 : 0, -38);
        var1.method1363(class175.field2470 ? 1 : 0, 110);
        return var1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3665 = null;
        if (arg0 >= -86) {
            field3669 = -63;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILga;Lfa;)V")
    public static final void method1545(int arg0, class149 arg1, class238 arg2) {
        class74 var3 = arg1.method939(0);
        field3662++;
        if (var3 == null) {
            return;
        }
        int var4 = var3.field4566;
        if (var3.field4557 > var3.field4566) {
            var4 = var3.field4557;
        }
        int var5 = arg2.field3687;
        int var6 = 0;
        int var7 = arg2.field3686;
        int var8 = 0;
        int var9 = 0;
        if (arg1.field2068 != null) {
            var6 = class301.field4788.method204(arg1.field2068, (int[]) null, class53.field758);
            for (int var10 = 0; var10 < var6; var10++) {
                String var11 = class53.field758[var10];
                if (var10 < var6 - 1) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class284.field4558.method440(var11);
                if (var12 > var8) {
                    var8 = var12;
                }
            }
            var9 = class284.field4558.method439() * (var6 - 1) + class284.field4558.method442() / 2;
        }
        int var13 = arg2.field3686 - (var9 / 2);
        int var14 = arg2.field3687;
        if ((class97.field1419 + var4) > var5) {
            var14 = var4 / 2 + var8 / 2 + class97.field1419 + var4 + 5;
            var5 = class97.field1419 + var4;
        } else if (var5 > (class97.field1421 - var4)) {
            var14 = class97.field1421 - var4 / 2 - var4 - (var8 / 2 + 5);
            var5 = class97.field1421 - var4;
        }
        if (class97.field1412 + var4 > var7) {
            var7 = class97.field1412 + var4;
            var13 = var4 / 2 + class97.field1412 - (-var4 + -class284.field4558.method439());
        } else if (var7 > class97.field1420 - var4) {
            var13 = class97.field1420 - var9 - var4 - (var4 / 2);
            var7 = class97.field1420 - var4;
        }
        int var15 = var4 >> 1;
        int var16 = -2;
        int var17 = (int) (Math.atan2((double) (var5 - arg2.field3687), (double) (var7 - arg2.field3686)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        if (arg0 != -13012) {
            return;
        }
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        var3.method493(var3.field4559 << 3, var3.field4551 << 3, (var5 << 4) + var15, (var7 << 4) - -var15, var17, 4096);
        if (arg1.field2068 != null) {
            var16 = var14 - var8 / 2 - 5;
            var18 = var13 - class284.field4558.method442() - 3;
            var19 = var6 * class284.field4558.method439() + var18;
            var20 = var16 + var8 + 10;
            if (arg1.field2034 != 0) {
                class266.method1748(var16, var18, var20 - var16, -var18 + var19, arg1.field2034, arg1.field2034 >>> 24);
            }
            if (arg1.field2038 != 0) {
                class266.method1723(var16, var18, var20 - var16, var19 - var18, arg1.field2038, arg1.field2038 >>> 24);
            }
            for (int var21 = 0; var21 < var6; var21++) {
                String var22 = class53.field758[var21];
                if (var21 < var6 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class284.field4558.method446(var22, var14, var13, arg1.field2031, true);
                var13 += class284.field4558.method439();
            }
        }
        if (var5 - var15 >= class17.field304 || var5 + var15 <= class17.field304 || (var7 - var15) >= class249.field3891 || (var7 + var15) <= class249.field3891 && var16 >= class17.field304 || class17.field304 >= var20 || class249.field3891 <= var18 || var19 <= class249.field3891) {
            return;
        }
        if (arg1.field2037[4] != null) {
            class82.method518(-1, (short) 1012, arg1.field2037[4], arg1.field2063, 0, 0, (long) arg2.field3688, (byte) 101);
        }
        if (arg1.field2037[3] != null) {
            class82.method518(-1, (short) 1007, arg1.field2037[3], arg1.field2063, 0, 0, (long) arg2.field3688, (byte) 63);
        }
        if (arg1.field2037[2] != null) {
            class82.method518(-1, (short) 1010, arg1.field2037[2], arg1.field2063, 0, 0, (long) arg2.field3688, (byte) 112);
        }
        if (arg1.field2037[1] != null) {
            class82.method518(-1, (short) 1006, arg1.field2037[1], arg1.field2063, 0, 0, (long) arg2.field3688, (byte) 74);
        }
        if (arg1.field2037[0] != null) {
            class82.method518(-1, (short) 1004, arg1.field2037[0], arg1.field2063, 0, 0, (long) arg2.field3688, (byte) 106);
            return;
        }
    }
}
