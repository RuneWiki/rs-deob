import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class336 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lofa;")
    public static class347 field4737 = null;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public static int[] field4736;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 3)
    public static void method2154(byte arg0) {
        field4737 = null;
        field4736 = null;
        if (arg0 < 2) {
            method2157(-111, true);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)Z", line = 25)
    public static final boolean method2155(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            field4735++;
            return (arg0 & 0x40000) != 0 | class719.method3971(arg1, arg0, (byte) -33) || class655.method3640(-21797, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lub;ZZ)V", line = 41)
    public static final void method2156(class22 arg0, boolean arg1, boolean arg2) {
        field4732++;
        if (class269.field3929 >= 400) {
            return;
        }
        class304 var3 = arg0.field217;
        String var4 = arg0.field211;
        if (var3.field4295 != null) {
            var3 = var3.method1968(class480.field6740, -1);
            if (var3 == null) {
                return;
            }
            var4 = var3.field4278;
        }
        if (!var3.field4260) {
            return;
        }
        if (arg0.field228 != 0) {
            String var5 = class682.field9122 == class426.field6204 ? class58.field727.method365(class55.field647, (byte) 49) : class58.field725.method365(class55.field647, (byte) 84);
            var4 = var4 + class378.method2365(arg0.field228, (byte) 101, class625.field8475.field10358) + " (" + var5 + arg0.field228 + ")";
        }
        if (class506.field7094 && !arg2) {
            class560 var6 = class503.field7077 == -1 ? null : class315.field4447.method3515(class503.field7077, 0);
            if ((class384.field5578 & 0x2) != 0 && (var6 == null || var3.method1965((byte) -122, var6.field7679, class503.field7077) != var6.field7679)) {
                class553.field7631++;
                class26.method147(-1, true, class385.field5594, (long) arg0.field6146, 13, 0, class545.field7534 + " -> <col=ffff00>" + var4, (long) arg0.field6146, false, 0, -1, class182.field2384, false);
            }
        }
        if (!arg2) {
            String[] var7 = var3.field4322;
            if (class26.field262) {
                var7 = class88.method712(var7, (byte) 105);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field4291 == 0 || !var7[var8].equalsIgnoreCase(class58.field720.method365(class55.field647, (byte) 61)))) {
                        byte var9 = 0;
                        int var10 = class37.field393;
                        if (var8 == 0) {
                            var9 = 45;
                        }
                        if (var8 == 1) {
                            var9 = 20;
                        }
                        if (var8 == 2) {
                            var9 = 22;
                        }
                        if (var8 == 3) {
                            var9 = 58;
                        }
                        if (var3.field4323 == var8) {
                            var10 = var3.field4319;
                        }
                        if (var8 == 4) {
                            var9 = 50;
                        }
                        if (var3.field4310 == var8) {
                            var10 = var3.field4315;
                        }
                        class26.method147(-1, true, var7[var8], (long) arg0.field6146, var9, 0, "<col=ffff00>" + var4, (long) arg0.field6146, false, 0, -1, var7[var8].equalsIgnoreCase(class58.field720.method365(class55.field647, (byte) 68)) ? var3.field4318 : var10, false);
                        class264.field3885++;
                    }
                }
            }
            if (var3.field4291 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class58.field720.method365(class55.field647, (byte) 100))) {
                        short var12 = 0;
                        if (class625.field8475.field10358 < arg0.field228) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 45;
                        }
                        if (var11 == 1) {
                            var13 = 20;
                        }
                        if (var11 == 2) {
                            var13 = 22;
                        }
                        if (var11 == 3) {
                            var13 = 58;
                        }
                        if (var11 == 4) {
                            var13 = 50;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class26.method147(-1, true, var7[var11], (long) arg0.field6146, var13, 0, "<col=ffff00>" + var4, (long) arg0.field6146, false, 0, -1, var3.field4318, false);
                        class763.field10477++;
                    }
                }
            }
        }
        class26.method147(-1, true, class58.field719.method365(class55.field647, (byte) 61), (long) arg0.field6146, 1009, 0, "<col=ffff00>" + var4, (long) arg0.field6146, arg1, 0, -1, class463.field6579, arg2);
        class479.field6730++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V", line = 203)
    public static final void method2157(int arg0, boolean arg1) {
        field4734++;
        class651.method3618(class460.field6558, class227.field2935, class693.field9222, 108, arg1);
        if (arg0 < 41) {
            field4733 = -6;
        }
    }
}
