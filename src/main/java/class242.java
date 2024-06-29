import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class242 extends class136 {

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Lbf;")
    public class18 field4476;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[I")
    public static int[] field4481 = new int[128];

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Li;")
    public static class88 field4483 = class208.method1425(105, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Li;")
    private static class88 field4484 = class208.method1425(105, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "Li;")
    public static class88 field4480 = field4484;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Llj;")
    public static class130 field4475;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "[I")
    public static int[] field4479;

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lbf;)V")
    public class242(class18 arg0) {
        this.field4476 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        if (arg0 > -106) {
            return;
        }
        field4479 = null;
        field4480 = null;
        field4481 = null;
        field4483 = null;
        field4475 = null;
        field4484 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lnc;IIIII)V")
    public static final void method1596(class145 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class11.field152 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class48.field899) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class66.field1202 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class52 var14 = class29.field489[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class62.field1137[var11][var12 + 1][var13] + class62.field1137[var11][var12][var13] + class62.field1137[var11][var12][var13 + 1] + class62.field1137[var11][var12 + 1][var13 + 1]) / 4 - (class62.field1137[arg1][arg2 + 1][arg3] + class62.field1137[arg1][arg2][arg3] + class62.field1137[arg1][arg2][arg3 + 1] + class62.field1137[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class157 var16 = var14.field959;
                                    if (var16 != null) {
                                        if (var16.field3023.method544()) {
                                            arg0.method570(var16.field3023, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3034 != null && var16.field3034.method544()) {
                                            arg0.method570(var16.field3034, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field962; var17++) {
                                        class108 var18 = var14.field963[var17];
                                        if (var18 != null && var18.field1945.method544() && (var18.field1935 == var12 || var7 == var12) && (var18.field1938 == var13 || var9 == var13)) {
                                            int var19 = var18.field1942 + 1 - var18.field1935;
                                            int var20 = var18.field1937 + 1 - var18.field1938;
                                            arg0.method570(var18.field1945, (var18.field1935 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1938 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
    public static final void method1597(int arg0, int arg1) {
        field4478++;
        class169 var2;
        if (class110.field2012 == null) {
            var2 = new class169(512, 512);
        } else {
            var2 = (class169) class110.field2012;
        }
        int[] var3 = var2.field3249;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        if (arg0 != -31422) {
            return;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var22 = (103 - var6) * 2048 + 24628;
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class116.field2100[arg1][var23][var6] & 0x18) == 0) {
                    class119.method817(var3, var22, 512, arg1, var23, var6);
                }
                if (arg1 < 3 && (class116.field2100[arg1 + 1][var23][var6] & 0x8) != 0) {
                    class119.method817(var3, var22, 512, arg1 + 1, var23, var6);
                }
                var22 += 4;
            }
        }
        var2.method1169();
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var8 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class116.field2100[arg1][var21][var9] & 0x18) == 0) {
                    class128.method873(var9, var7, true, arg1, var8, var21);
                }
                if (arg1 < 3 && (class116.field2100[arg1 + 1][var21][var9] & 0x8) != 0) {
                    class128.method873(var9, var7, true, arg1 + 1, var8, var21);
                }
            }
        }
        class50.field930 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class74.method501(class149.field2909, var10, var11);
                if (var12 != 0L) {
                    class148 var14 = class190.method1323(Integer.MAX_VALUE & (int) (var12 >>> 32), arg0 + 18972);
                    int var15 = var14.field2819;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = class166.field3202[class149.field2909].field1668;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var10 - 3 < var16 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var10 + 3 > var16 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var11 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var11 + 3 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        class146.field2747[class50.field930] = var14.field2833;
                        class139.field2579[class50.field930] = var16;
                        class134.field2503[class50.field930] = var17;
                        class50.field930++;
                    }
                }
            }
        }
        class110.field2012 = var2;
        class202.field3854.method1523(3739);
    }
}
