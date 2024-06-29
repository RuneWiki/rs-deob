import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class172 extends class273 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public int field2753 = 0;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Lwm;")
    public static class152 field2738 = class157.method1048("Gestionnaire de saisie charg-B", 118);

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2758 = -1;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Lse;")
    public class12 field2736;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lah;")
    public static class205 field2732;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Lr;")
    public class270 field2754;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Lqc;")
    public class4 field2742;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Ltm;")
    public class71 field2746;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Ltm;")
    public class71 field2750;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Z")
    public boolean field2749;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[I")
    public int[] field2737;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 13)
    public static void method1147(byte arg0) {
        if (arg0 <= -47) {
            field2732 = null;
            field2738 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIIII)V", line = 28)
    public static final void method1148(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class34 var6 = class287.field4857[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class215 var7 = var6.field578;
        if (var7 != null) {
            int var8 = var7.field3499;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class95 var10 = var6.field561;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1360;
        int var12 = var10.field1367;
        int var13 = var10.field1368;
        int var14 = var10.field1352;
        int[] var15 = class186.field2952[var11];
        int[] var16 = class289.field4903[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V", line = 125)
    public static final void method1149(byte arg0) {
        field2733++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (arg0 != 69) {
                field2726 = 90;
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class6.field96 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)[Lbg;", line = 166)
    public static final class203[] method1150(boolean arg0) {
        class203[] var1 = new class203[class52.field807];
        if (arg0) {
            method1153(-35, 12, -88, 25, -95);
        }
        field2760++;
        for (int var2 = 0; var2 < class52.field807; var2++) {
            int var3 = class8.field106[var2] * class253.field4383[var2];
            byte[] var4 = class23.field403[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class134.field2070[class34.method251(var4[var6], 255)];
            }
            if (class217.field3516) {
                var1[var2] = new class68(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var5);
            } else {
                var1[var2] = new class109(class186.field2975, class193.field3068, class180.field2865[var2], class179.field2856[var2], class253.field4383[var2], class8.field106[var2], var5);
            }
        }
        class132.method841((byte) -122);
        return var1;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)V", line = 206)
    public static final void method1151(byte arg0) {
        field2744++;
        class227.field3678.method1619(11300);
        class120.field1695.method1619(11300);
        class320.field5588.method1619(11300);
        if (arg0 <= 41) {
            field2745 = 124;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V", line = 260)
    public static final void method1152(boolean arg0) {
        field2741++;
        if (arg0) {
            class152.field2425.method1619(11300);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 271)
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            method1148((int[]) null, -33, -60, 92, -4, 74);
        }
        field2743++;
        if (arg0 >= arg4) {
            class275.method1885(arg3, class179.field2843[arg2], arg4, arg0, -2611);
        } else {
            class275.method1885(arg3, class179.field2843[arg2], arg0, arg4, arg1 ^ 0xFFFFF5CD);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)Z", line = 290)
    public static final boolean method1154(boolean arg0) {
        if (!arg0) {
            field2732 = (class205) null;
        }
        field2752++;
        return class89.field1252 == 0 ? class200.field3227.method2054(-73) : true;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V", line = 308)
    public final void method1155(byte arg0) {
        int var2 = this.field2729;
        if (this.field2754 != null) {
            class270 var3 = this.field2754.method1845(true);
            if (var3 == null) {
                this.field2729 = -1;
                this.field2756 = 0;
                this.field2740 = 0;
                this.field2737 = null;
                this.field2731 = 0;
            } else {
                this.field2756 = var3.field4588;
                this.field2737 = var3.field4572;
                this.field2729 = var3.field4559;
                this.field2731 = var3.field4584 * 128;
                this.field2740 = var3.field4614;
            }
        } else if (this.field2742 != null) {
            int var4 = class162.method1085(false, this.field2742);
            if (var2 != var4) {
                this.field2729 = var4;
                class242 var5 = this.field2742.field72;
                if (var5.field4011 != null) {
                    var5 = var5.method1650(4);
                }
                if (var5 == null) {
                    this.field2731 = 0;
                } else {
                    this.field2731 = var5.field4017 * 128;
                }
            }
        } else if (this.field2736 != null) {
            this.field2729 = class117.method774(this.field2736, true);
            this.field2731 = this.field2736.field150 * 128;
        }
        field2747++;
        if (this.field2729 != var2 && this.field2746 != null) {
            class290.field4916.method1495(this.field2746);
            this.field2746 = null;
        }
        int var6 = -12 % ((arg0 + 14) / 42);
    }
}
