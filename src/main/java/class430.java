import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class430 extends class435 {

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "Lau;")
    public class692 field6133 = new class692();

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field6136 = 104;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "Lqk;")
    public static class1 field6135;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "Lbc;")
    public static class9 field6132;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "[[Lvj;")
    public static class204[][] field6131;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 4)
    public static void method2519(int arg0) {
        field6135 = null;
        field6131 = null;
        if (arg0 < -121) {
            field6132 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lwv;ILek;B)V", line = 21)
    public static final void method2520(class705 arg0, int arg1, class465 arg2, byte arg3) {
        if (arg3 != 108) {
            method2521(56, -59, 111, (byte) -74, 42, -69, 91, true, 0.22956766F);
        }
        field6130++;
        class702 var4 = new class702();
        var4.field9931 = arg2.method2705(-30);
        var4.field9929 = arg2.method2691((byte) -67);
        var4.field9936 = new class614[var4.field9931];
        var4.field9927 = new class614[var4.field9931];
        var4.field9932 = new int[var4.field9931];
        var4.field9928 = new byte[var4.field9931][][];
        var4.field9934 = new int[var4.field9931];
        var4.field9935 = new int[var4.field9931];
        for (int var5 = 0; var5 < var4.field9931; var5++) {
            try {
                int var6 = arg2.method2705(-116);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method2717(true);
                    String var18 = arg2.method2717(true);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method2691((byte) -67);
                    }
                    var4.field9935[var5] = var6;
                    var4.field9932[var5] = var19;
                    var4.field9936[var5] = arg0.method3960(0, class590.method3386(var17, 20310), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method2717(true);
                    String var8 = arg2.method2717(true);
                    int var9 = arg2.method2705(-29);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method2717(true);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method2691((byte) -67);
                            var12[var13] = new byte[var14];
                            arg2.method2750(var12[var13], -119, var14, 0);
                        }
                    }
                    var4.field9935[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class590.method3386(var10[var16], 20310);
                    }
                    var4.field9927[var5] = arg0.method3955(class590.method3386(var7, class565.method3310(arg3, 20282)), var8, (byte) 91, var15);
                    var4.field9928[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field9934[var5] = -1;
            } catch (SecurityException var21) {
                var4.field9934[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field9934[var5] = -3;
            } catch (Exception var23) {
                var4.field9934[var5] = -4;
            } catch (Throwable var24) {
                var4.field9934[var5] = -5;
            }
        }
        class187.field2932.method3904(var4, 0);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIBIIIZF)[[I", line = 139)
    public static final int[][] method2521(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, float arg8) {
        field6134++;
        if (arg3 != 2) {
            return null;
        }
        int[][] var9 = new int[arg2][arg5];
        class334 var10 = new class334();
        var10.field4650 = arg1;
        var10.field4651 = arg7;
        var10.field4657 = (int) (arg8 * 4096.0F);
        var10.field4655 = arg6;
        var10.field4646 = arg0;
        var10.method422(-1);
        class550.method3227(-105, arg5, arg2);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1990(255, var9[var11], var11);
        }
        return var9;
    }
}
