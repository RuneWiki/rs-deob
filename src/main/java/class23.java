import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class23 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lpp;")
    public static class464 field320 = new class464(53, -1);

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Liu;")
    public static class517 field323;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "F")
    public static float field321;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILqa;IILgb;Lfm;)Z")
    public static final boolean method236(int arg0, class167 arg1, int arg2, int arg3, class153 arg4, class192 arg5) {
        field322++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2 != 11468) {
            field321 = -0.32871068F;
        }
        if (arg5.field2737 != null) {
            var6 = (arg4.field2295 + arg5.field2758 - class212.field3130) * (class212.field3111 - class212.field3122) / (class212.field3112 - class212.field3130) + class212.field3122;
            var7 = (arg4.field2295 + arg5.field2773 - class212.field3130) * (class212.field3111 - class212.field3122) / (class212.field3112 - class212.field3130) + class212.field3122;
            var9 = class212.field3109 - ((arg5.field2766 + arg4.field2305 - class212.field3110) * (class212.field3109 - class212.field3123) / (class212.field3115 - class212.field3110));
            var8 = class212.field3109 - ((arg4.field2305 + arg5.field2739 - class212.field3110) * (class212.field3109 - class212.field3123) / (class212.field3115 - class212.field3110));
        }
        class116 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field2747 != -1) {
            if (arg4.field2301 && arg5.field2754 != -1) {
                var10 = arg5.method1273(true, (byte) -67, arg1);
            } else {
                var10 = arg5.method1273(false, (byte) -67, arg1);
            }
            if (var10 != null) {
                var11 = arg4.field2304 - (var10.method955() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg4.field2304 + (var10.method955() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg4.field2303 - (var10.method960() + 1 >> 1);
                var14 = arg4.field2303 + (var10.method960() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class482 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg5.field2753 != null) {
            var15 = class95.method831(arg5.field2759, arg2 ^ 0x2CB3);
            if (var15 != null) {
                var16 = class258.field3751.method3660(arg5.field2753, arg2 ^ 0x2CC8, null, null, class609.field8658);
                int var23 = arg4.field2303;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2776() / 2;
                } else {
                    var17 = var23 - ((var10.method960() >> 1) + (var15.method2777() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class609.field8658[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2779(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field2304 + arg0 - (var18 / 2);
                var20 = var18 / 2 + arg4.field2304 + arg0;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = var17 + arg3;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var17 + var16 * var15.method2777() + arg3;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class212.field3122 > var7 || class212.field3111 < var6 || var9 < class212.field3123 || class212.field3109 < var8) {
            return true;
        }
        if (arg5.field2737 != null) {
            int[] var27 = new int[arg5.field2737.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg5.field2737[var28 * 2] + arg4.field2295;
                int var31 = arg5.field2737[var28 * 2 + 1] + arg4.field2305;
                var27[var28 * 2] = (class212.field3111 - class212.field3122) * (var30 - class212.field3130) / (class212.field3112 - class212.field3130) + class212.field3122;
                var27[var28 * 2 + 1] = class212.field3109 - (class212.field3109 - class212.field3123) * (var31 - class212.field3110) / (class212.field3115 - class212.field3110);
            }
            class198.method1299(arg1, var27, arg5.field2741);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg1.method1155(arg5.field2767, var27[(var29 + 1) * 2], var27[var29 * 2], var27[var29 * 2 + 1], (byte) -8, var27[var29 * 2 + 2 + 1]);
            }
            arg1.method1155(arg5.field2767, var27[0], var27[var27.length - 2], var27[var27.length - 1], (byte) -8, var27[1]);
        }
        if (var10 != null) {
            if (class62.field856 > 0 && (class454.field6570 != -1 && class454.field6570 == arg4.field2298 || class47.field663 != -1 && class47.field663 == arg5.field2769)) {
                int var32;
                if (class608.field8634 > 50) {
                    var32 = 200 - (class608.field8634 * 2);
                } else {
                    var32 = class608.field8634 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method1157(arg4.field2303, var10.method962() / 2 + 7, var33, arg4.field2304, (byte) -37);
                arg1.method1157(arg4.field2303, var10.method962() / 2 + 5, var33, arg4.field2304, (byte) -37);
                arg1.method1157(arg4.field2303, var10.method962() / 2 + 3, var33, arg4.field2304, (byte) -37);
                arg1.method1157(arg4.field2303, var10.method962() / 2 + 1, var33, arg4.field2304, (byte) -37);
                arg1.method1157(arg4.field2303, var10.method962() / 2, var33, arg4.field2304, (byte) -37);
            }
            var10.method953(arg4.field2304 - (var10.method955() >> 1), arg4.field2303 + -(var10.method960() >> 1));
        }
        if (arg5.field2753 != null && var15 != null) {
            class148.method1071(var17, var15, arg1, 31273, arg4, var18, var16, arg5);
        }
        if (arg5.field2747 != -1 || arg5.field2753 != null) {
            class345 var34 = new class345(arg4);
            var34.field4942 = var19;
            var34.field4943 = var12;
            var34.field4948 = var14;
            var34.field4945 = var11;
            var34.field4947 = var22;
            var34.field4940 = var21;
            var34.field4938 = var20;
            var34.field4941 = var13;
            class97.field1694.method414(var34, (byte) 32);
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method237(boolean arg0) {
        field323 = null;
        if (arg0) {
            field321 = 0.21094908F;
        }
        field320 = null;
    }

    static {
        new class567("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field324 = 0;
        field323 = new class517(6, -2);
    }
}
