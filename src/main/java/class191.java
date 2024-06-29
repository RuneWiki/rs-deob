import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class191 extends class166 {

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
    public int[] field3786 = new int[1];

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    public int[] field3790 = new int[] { -1 };

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lcd;")
    public static class23 field3791 = class54.method414("Registrierter Benutzer", -1);

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lcd;")
    public static class23 field3794 = class54.method414("http:)4)4www)3runescape)3com", -1);

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Lcd;")
    private static class23 field3797 = class54.method414("Close", -1);

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lcd;")
    public static class23 field3787 = field3797;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lfa;")
    public static class47 field3798 = null;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lva;")
    public static class189 field3784 = new class189(new byte[5000]);

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lcd;")
    public static class23 field3800 = class54.method414(" Sekunde(Xn(Y -Ubertragen)3", -1);

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Lcd;")
    private static class23 field3801 = class54.method414("The server is being updated)3", -1);

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Lcd;")
    public static class23 field3799 = field3801;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
    public static int[] field3802 = new int[4000];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lfa;")
    public static class47 field3795;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Lkh;")
    public static class97 field3796;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lcg;Lkh;ZLkh;B)V")
    public static final void method1237(class26 arg0, class97 arg1, boolean arg2, class97 arg3, byte arg4) {
        int var5 = -58 % ((arg4 + 74) / 36);
        class58.field1358 = arg1;
        class59.field1384 = arg2;
        field3785++;
        class78.field1719 = arg3;
        class61.field1410 = class78.field1719.method660(31, 10);
        class7.field122 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lfa;IB)I")
    public static final int method1238(class47 arg0, int arg1, byte arg2) {
        field3788++;
        if (arg0.field1072 == null || arg1 >= arg0.field1072.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field1072[arg1];
            byte var4 = 0;
            int var5 = 0;
            int var6 = 0;
            if (arg2 > -31) {
                method1237(null, null, true, null, (byte) -119);
            }
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var9 = class110.field2330[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 2) {
                    var9 = class61.field1420[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class156.field3120[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class47 var12 = class113.method725((byte) 118, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class85.method565(var13, (byte) -65).field1468 || class186.field3635)) {
                        for (int var14 = 0; var14 < var12.field1136.length; var14++) {
                            if (var13 + 1 == var12.field1136[var14]) {
                                var9 += var12.field1024[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class54.field1288[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class101.field2167[class61.field1420[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class54.field1288[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class134.field2790.field1341;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class12.field246[var15]) {
                            var9 += class61.field1420[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class47 var18 = class113.method725((byte) 97, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class85.method565(var19, (byte) 58).field1468 || class186.field3635)) {
                        for (int var20 = 0; var20 < var18.field1136.length; var20++) {
                            if (var19 + 1 == var18.field1136[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class72.field1657;
                }
                if (var7 == 12) {
                    var9 = class25.field539;
                }
                if (var7 == 13) {
                    int var21 = class54.field1288[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = client.method209(0, var23);
                }
                if (var7 == 18) {
                    var9 = (class134.field2790.field215 >> 7) + class155.field3099;
                }
                if (var7 == 19) {
                    var9 = (class134.field2790.field277 >> 7) + class94.field1989;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var4 == 0) {
                        var6 += var9;
                    }
                    if (var4 == 1) {
                        var6 -= var9;
                    }
                    if (var4 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var4 == 3) {
                        var6 *= var9;
                    }
                    var4 = 0;
                } else {
                    var4 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1239(byte arg0) {
        field3797 = null;
        field3800 = null;
        field3801 = null;
        field3795 = null;
        field3784 = null;
        if (arg0 < 8) {
            field3795 = null;
        }
        field3791 = null;
        field3799 = null;
        field3798 = null;
        field3787 = null;
        field3796 = null;
        field3794 = null;
        field3802 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLcd;)Z")
    public static final boolean method1240(byte arg0, class23 arg1) {
        field3792++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class82.field1780; var2++) {
            if (arg1.method146(127, class5.field95[var2])) {
                return true;
            }
        }
        if (arg0 > -88) {
            field3802 = null;
        }
        return arg1.method146(-62, class134.field2790.field1345);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lkh;III)[Loe;")
    public static final class130[] method1241(class97 arg0, int arg1, int arg2, int arg3) {
        field3793++;
        if (arg1 == 6) {
            return class124.method765(arg3, arg2, (byte) 48, arg0) ? class183.method1127(-82) : null;
        } else {
            return null;
        }
    }
}
