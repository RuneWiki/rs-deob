import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class156 extends class67 {

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Li;")
    public static class88 field3012 = class208.method1425(105, "(U0a )2 in: ");

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Li;")
    public static class88 field3015 = class208.method1425(105, " weitere Optionen");

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Li;")
    public static class88 field3011 = class208.method1425(105, ":tradereq:");

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Li;")
    public static class88 field3007 = class208.method1425(105, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field3018 = 0;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "J")
    public static long field3006;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lnb;")
    public static class144 field3010;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
    public static int[] field3014;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "[I")
    public static int[] field3016;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
    public static final int method1060(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -101) {
            field3011 = null;
        }
        field3013++;
        if (arg0 > arg3) {
            return arg0;
        } else if (arg3 > arg1) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field3015 = null;
        field3010 = null;
        field3012 = null;
        field3007 = null;
        if (arg0 != 0) {
            method1060(99, -16, -84, -122);
        }
        field3014 = null;
        field3011 = null;
        field3016 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
    public class156(int arg0, int arg1) {
        this.field3008 = arg1;
        this.field3017 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lf;IIIIIIZ)V")
    public static final void method1062(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1069.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1069[var9] - class74.field1353;
            int var23 = arg0.field1064[var9] - class241.field4463;
            int var24 = arg0.field1053[var9] - class216.field4050;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1063 != null) {
                class56.field1058[var9] = var25;
                class56.field1072[var9] = var28;
                class56.field1057[var9] = var29;
            }
            class56.field1055[var9] = (var25 << 9) / var29 + class173.field3365;
            class56.field1062[var9] = (var28 << 9) / var29 + class173.field3363;
        }
        class173.field3350 = 0;
        int var10 = arg0.field1074.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1074[var11];
            int var13 = arg0.field1056[var11];
            int var14 = arg0.field1054[var11];
            int var15 = class56.field1055[var12];
            int var16 = class56.field1055[var13];
            int var17 = class56.field1055[var14];
            int var18 = class56.field1062[var12];
            int var19 = class56.field1062[var13];
            int var20 = class56.field1062[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class118.field2147 && class23.method122(class39.field698 + class173.field3365, class35.field621 + class173.field3363, var18, var19, var20, var15, var16, var17)) {
                    class114.field2059 = arg5;
                    class90.field1715 = arg6;
                }
                if (!arg7) {
                    class173.field3360 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class173.field3352 || var16 > class173.field3352 || var17 > class173.field3352) {
                        class173.field3360 = true;
                    }
                    if (arg0.field1063 == null || arg0.field1063[var11] == -1) {
                        if (arg0.field1073[var11] != 12345678) {
                            class173.method1229(var18, var19, var20, var15, var16, var17, arg0.field1073[var11], arg0.field1070[var11], arg0.field1060[var11]);
                        }
                    } else if (class104.field1884) {
                        int var21 = class173.field3358.method438(118, arg0.field1063[var11]);
                        class173.method1229(var18, var19, var20, var15, var16, var17, class117.method793(var21, arg0.field1073[var11]), class117.method793(var21, arg0.field1070[var11]), class117.method793(var21, arg0.field1060[var11]));
                    } else if (arg0.field1068) {
                        class173.method1227(var18, var19, var20, var15, var16, var17, arg0.field1073[var11], arg0.field1070[var11], arg0.field1060[var11], class56.field1058[0], class56.field1058[1], class56.field1058[3], class56.field1072[0], class56.field1072[1], class56.field1072[3], class56.field1057[0], class56.field1057[1], class56.field1057[3], arg0.field1063[var11]);
                    } else {
                        class173.method1227(var18, var19, var20, var15, var16, var17, arg0.field1073[var11], arg0.field1070[var11], arg0.field1060[var11], class56.field1058[var12], class56.field1058[var13], class56.field1058[var14], class56.field1072[var12], class56.field1072[var13], class56.field1072[var14], class56.field1057[var12], class56.field1057[var13], class56.field1057[var14], arg0.field1063[var11]);
                    }
                }
            }
        }
    }
}
