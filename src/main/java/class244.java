import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class244 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[Lrg;")
    private class96[] field4010;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4008 = 1;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Z")
    public static boolean field4012 = true;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Ln;")
    public static class282 field4009 = new class282(64);

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lna;")
    private static class26 field4013 = class69.method505("shake:", (byte) -117);

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lna;")
    public static class26 field4014 = class69.method505("(Z", (byte) -124);

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lna;")
    public static class26 field4016 = field4013;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lna;")
    public static class26 field4015 = field4013;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 12)
    public static final void method1683(int arg0, byte arg1, int arg2) {
        class32 var3 = class268.field4433[class279.field4651][arg2][arg0];
        field4011++;
        if (var3 == null) {
            class78.method555(class279.field4651, arg2, arg0);
        } else if (arg1 == 65) {
            int var4 = -99999999;
            class2 var5 = null;
            for (class2 var6 = (class2) var3.method264(-60); var6 != null; var6 = (class2) var3.method263(4)) {
                class217 var7 = class45.method341(var6.field23.field2155, (byte) 104);
                int var8 = var7.field3404;
                if (var7.field3415 == 1) {
                    var8 = (var6.field23.field2147 + 1) * var8;
                }
                if (var4 < var8) {
                    var4 = var8;
                    var5 = var6;
                }
            }
            if (var5 == null) {
                class78.method555(class279.field4651, arg2, arg0);
            } else {
                var3.method258(64, var5);
                class141 var9 = null;
                class141 var10 = null;
                for (class2 var11 = (class2) var3.method264(arg1 ^ 0xFFFFFF89); var11 != null; var11 = (class2) var3.method263(arg1 - 61)) {
                    class141 var12 = var11.field23;
                    if (var5.field23.field2155 != var12.field2155) {
                        if (var9 == null) {
                            var9 = var12;
                        }
                        if (var9.field2155 != var12.field2155 && var10 == null) {
                            var10 = var12;
                        }
                    }
                }
                long var13 = (long) ((arg0 << 7) + arg2 + 1610612736);
                class198.method1332(class279.field4651, arg2, arg0, class17.method118(class279.field4651, 1, arg2 * 128 + 64, arg0 * 128 + 64), var5.field23, var13, var9, var10);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 93)
    public static void method1684(byte arg0) {
        field4015 = null;
        field4013 = null;
        field4016 = null;
        field4014 = null;
        if (arg0 < -46) {
            field4009 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JB)V", line = 110)
    public static final void method1685(long arg0, byte arg1) {
        try {
            int var3 = 30 / ((arg1 + 86) / 36);
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
        field4007++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIILak;I)Lak;", line = 142)
    public static final class311 method1686(boolean arg0, int arg1, int arg2, int arg3, int arg4, class311 arg5, int arg6) {
        long var7 = (long) arg3;
        class311 var9 = (class311) class32.field540.method1989(var7, (byte) 121);
        field4006++;
        if (var9 == null) {
            class169 var10 = class169.method1166(class80.field1258, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1159(64, 768, -50, -10, -50);
            class32.field540.method1978((byte) -95, var9, var7);
        }
        int var11 = arg5.method1640();
        int var12 = arg5.method1598();
        int var13 = arg5.method1600();
        int var14 = arg5.method1599();
        class311 var15 = var9.method1594(arg0, true, true);
        if (arg1 != 0) {
            var15.method1608(arg1);
        }
        if (class255.field4184) {
            class239 var16 = (class239) var15;
            if (arg6 != class17.method118(class279.field4651, 1, arg4 + var11, arg2 + var13) || arg6 != class17.method118(class279.field4651, 1, arg4 + var12, arg2 + var14)) {
                for (int var17 = 0; var17 < var16.field3827; var17++) {
                    var16.field3849[var17] += class17.method118(class279.field4651, 1, var16.field3826[var17] + arg4, var16.field3852[var17] + arg2) - arg6;
                }
                var16.field3843.field241 = false;
                var16.field3839.field4649 = false;
            }
        } else {
            class270 var18 = (class270) var15;
            if (arg6 != class17.method118(class279.field4651, 1, arg4 + var11, arg2 + var13) || arg6 != class17.method118(class279.field4651, 1, arg4 + var12, arg2 + var14)) {
                for (int var19 = 0; var19 < var18.field4466; var19++) {
                    var18.field4458[var19] += class17.method118(class279.field4651, 1, var18.field4460[var19] + arg4, var18.field4470[var19] + arg2) - arg6;
                }
                var18.field4472 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 220)
    public static final void method1687(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class235.field3723; var3++) {
            for (int var4 = 0; var4 < class285.field4778; var4++) {
                for (int var5 = 0; var5 < class303.field5221; var5++) {
                    class55 var6 = class36.field585[var3][var4][var5];
                    if (var6 != null) {
                        class267 var7 = var6.field890;
                        if (var7 != null && var7.field4409.method673()) {
                            class198.method1333(var7.field4409, var3, var4, var5, 1, 1);
                            if (var7.field4412 != null && var7.field4412.method673()) {
                                class198.method1333(var7.field4412, var3, var4, var5, 1, 1);
                                var7.field4409.method674(var7.field4412, 0, 0, 0, false);
                                var7.field4412 = var7.field4412.method669(arg0, arg1, arg2);
                            }
                            var7.field4409 = var7.field4409.method669(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field879; var8++) {
                            class39 var9 = var6.field877[var8];
                            if (var9 != null && var9.field632.method673()) {
                                class198.method1333(var9.field632, var3, var4, var5, var9.field652 + 1 - var9.field637, var9.field634 - var9.field630 + 1);
                                var9.field632 = var9.field632.method669(arg0, arg1, arg2);
                            }
                        }
                        class137 var10 = var6.field886;
                        if (var10 != null && var10.field2095.method673()) {
                            class53.method396(var10.field2095, var3, var4, var5);
                            var10.field2095 = var10.field2095.method669(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V", line = 299)
    public class244(int arg0) {
        this.field4010 = new class96[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class96 var3 = this.field4010[var2] = new class96();
            var3.field1565 = var3;
            var3.field1575 = var3;
        }
    }
}
