import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class274 extends class155 {

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field4579 = 0;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Laj;")
    public static class151 field4580;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Laj;")
    public static class151 field4581;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Lhg;")
    public static class207 field4582;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
    public static void method1928(int arg0) {
        field4582 = null;
        field4580 = null;
        if (arg0 == 1) {
            field4581 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z")
    public abstract boolean method136(byte arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lri;")
    public static final class251 method1929(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2817;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLnj;Lei;)V")
    public static final void method1930(byte arg0, class206 arg1, class195 arg2) {
        field4578++;
        class230 var3 = arg2.method1396(0);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field4225;
        if (var3.field4235 > var3.field4225) {
            var4 = var3.field4235;
        }
        int var5 = arg1.field3315;
        int var6 = -69 % ((-arg0 - 46) / 56);
        int var7 = arg1.field3318;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (arg2.field3125 != null) {
            var10 = class25.field450.method1230(arg2.field3125, (int[]) null, class232.field3932);
            for (int var11 = 0; var11 < var10; var11++) {
                String var12 = class232.field3932[var11];
                if ((var10 - 1) > var11) {
                    var12 = var12.substring(0, var12.length() - 4);
                }
                int var13 = class249.field4186.method529(var12);
                if (var8 < var13) {
                    var8 = var13;
                }
            }
            var9 = class249.field4186.method522() * (var10 - 1) + class249.field4186.method526() / 2;
        }
        int var14 = arg1.field3315;
        int var15 = arg1.field3318 - var9 / 2;
        int var16 = -2;
        int var17 = -2;
        if ((class148.field2450 + var4) > var5) {
            var5 = class148.field2450 + var4;
            var14 = var4 / 2 + class148.field2450 + (var8 / 2) + var4 + 5;
        } else if ((class148.field2460 - var4) < var5) {
            var5 = class148.field2460 - var4;
            var14 = class148.field2460 - var4 - var4 / 2 - (var8 / 2) - 5;
        }
        if (class148.field2452 + var4 > var7) {
            var7 = class148.field2452 + var4;
            var15 = class148.field2452 + var4 - (-(var4 / 2) - class249.field4186.method522());
        } else if (var7 > class148.field2457 - var4) {
            var15 = class148.field2457 - var9 - var4 - var4 / 2;
            var7 = class148.field2457 - var4;
        }
        int var18 = var4 >> 1;
        int var19 = (int) ((Math.atan2((double) (var5 - arg1.field3315), (double) (var7 - arg1.field3318)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var3.method1658(var3.field4226 << 3, var3.field4230 << 3, (var5 << 4) + var18, (var7 << 4) + var18, var19, 4096);
        int var20 = -2;
        int var21 = -2;
        if (arg2.field3125 != null) {
            var16 = var15 - class249.field4186.method526() - 3;
            var17 = var10 * class249.field4186.method522() + var16;
            var21 = var14 - (var8 / 2) - 5;
            var20 = var8 + var21 + 10;
            if (arg2.field3143 != 0) {
                class211.method1480(var21, var16, var20 - var21, -var16 + var17, arg2.field3143, arg2.field3143 >>> 24);
            }
            if (arg2.field3129 != 0) {
                class211.method1484(var21, var16, var20 - var21, -var16 + var17, arg2.field3129, arg2.field3129 >>> 24);
            }
            for (int var22 = 0; var22 < var10; var22++) {
                String var23 = class232.field3932[var22];
                if (var22 < (var10 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class249.field4186.method523(var23, var14, var15, arg2.field3149, true);
                var15 += class249.field4186.method522();
            }
        }
        if (class96.field1558 <= (var5 - var18) || var5 + var18 <= class96.field1558 || var7 - var18 >= class87.field1448 || class87.field1448 >= (var7 + var18) && var21 >= class96.field1558 || class96.field1558 >= var20 || var16 >= class87.field1448 || class87.field1448 >= var17) {
            return;
        }
        if (arg2.field3134[4] != null) {
            class289.method2009(0, arg2.field3122, true, (long) arg1.field3327, 0, -1, arg2.field3134[4], (short) 1004);
        }
        if (arg2.field3134[3] != null) {
            class289.method2009(0, arg2.field3122, true, (long) arg1.field3327, 0, -1, arg2.field3134[3], (short) 1011);
        }
        if (arg2.field3134[2] != null) {
            class289.method2009(0, arg2.field3122, true, (long) arg1.field3327, 0, -1, arg2.field3134[2], (short) 1012);
        }
        if (arg2.field3134[1] != null) {
            class289.method2009(0, arg2.field3122, true, (long) arg1.field3327, 0, -1, arg2.field3134[1], (short) 1007);
        }
        if (arg2.field3134[0] != null) {
            class289.method2009(0, arg2.field3122, true, (long) arg1.field3327, 0, -1, arg2.field3134[0], (short) 1002);
            return;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method138(byte arg0);
}
