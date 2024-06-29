import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class481 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6798 = 13156520;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    public static int[] field6800 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lco;")
    public static class210 field6801;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lsd;")
    public static class74 field6802;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field6799;

    static {
        new class40("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field6801 = new class210(50);
        field6802 = new class74(15, 6);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lso;ZILfg;ILoj;)Z", line = 14)
    public static final boolean method2839(class334 arg0, boolean arg1, int arg2, class21 arg3, int arg4, class280 arg5) {
        field6797++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field4782 != null) {
            var9 = class429.field6206 - ((arg0.field4823 + arg3.field289 - class429.field6209) * (class429.field6206 - class429.field6208) / (class429.field6216 - class429.field6209));
            var8 = class429.field6206 - (arg3.field289 + arg0.field4812 - class429.field6209) * (class429.field6206 - class429.field6208) / (class429.field6216 - class429.field6209);
            var7 = (class429.field6199 - class429.field6201) * (arg0.field4816 + arg3.field296 - class429.field6207) / (class429.field6203 - class429.field6207) + class429.field6201;
            var6 = (class429.field6199 - class429.field6201) * (arg3.field296 + arg0.field4811 - class429.field6207) / (class429.field6203 - class429.field6207) + class429.field6201;
        }
        class395 var10 = null;
        int var11 = 0;
        if (arg1) {
            return true;
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field4809 != -1) {
            if (arg3.field297 && arg0.field4792 != -1) {
                var10 = arg0.method2025(arg5, 29784, true);
            } else {
                var10 = arg0.method2025(arg5, 29784, false);
            }
            if (var10 != null) {
                var11 = arg3.field298 - (var10.method216() + 1 >> 1);
                var12 = arg3.field298 + (var10.method216() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field294 - (var10.method222() + 1 >> 1);
                var14 = arg3.field294 + (var10.method222() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class209 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field4822 != null) {
            var15 = class442.method2612(arg0.field4808, 76);
            if (var15 != null) {
                var16 = class56.field715.method2424((int[]) null, class179.field2220, arg0.field4822, 37, (class395[]) null);
                int var23 = arg3.field294;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1157() / 2;
                } else {
                    var17 = var23 - ((var10.method222() >> 1) + var16 * var15.method1159());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class179.field2220[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1158(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field298 + arg4 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + (arg3.field298 + arg4);
                var21 = var17 + arg2;
                if (var20 > var7) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg2 + (var17 + (var16 * var15.method1159()));
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class429.field6201 > var7 || class429.field6199 < var6 || var9 < class429.field6208 || var8 > class429.field6206) {
            return true;
        }
        if (arg0.field4782 != null) {
            int[] var27 = new int[arg0.field4782.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg0.field4782[var28 * 2] + arg3.field296;
                int var31 = arg0.field4782[var28 * 2 + 1] + arg3.field289;
                var27[var28 * 2] = (class429.field6199 - class429.field6201) * (var30 - class429.field6207) / (class429.field6203 - class429.field6207) + class429.field6201;
                var27[var28 * 2 + 1] = class429.field6206 - (class429.field6206 - class429.field6208) * (var31 - class429.field6209) / (class429.field6216 - class429.field6209);
            }
            class70.method355(arg5, var27, arg0.field4785);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method1761(var27[var29 * 2], var27[var29 * 2 + 2], var27[(var29 + 1) * 2 + 1], 1, arg0.field4783, var27[var29 * 2 + 1]);
            }
            arg5.method1761(var27[var27.length - 2], var27[0], var27[1], 1, arg0.field4783, var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class401.field5720 > 0 && (class118.field1461 != -1 && class118.field1461 == arg3.field295 || class224.field3108 != -1 && class224.field3108 == arg0.field4795)) {
                int var32;
                if (class413.field5878 <= 50) {
                    var32 = class413.field5878 * 2;
                } else {
                    var32 = 200 - class413.field5878 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method1758((byte) -64, arg3.field294, var10.method220() / 2 + 7, var33, arg3.field298);
                arg5.method1758((byte) -115, arg3.field294, var10.method220() / 2 + 5, var33, arg3.field298);
                arg5.method1758((byte) -97, arg3.field294, var10.method220() / 2 + 3, var33, arg3.field298);
                arg5.method1758((byte) -97, arg3.field294, var10.method220() / 2 + 1, var33, arg3.field298);
                arg5.method1758((byte) -116, arg3.field294, var10.method220() / 2, var33, arg3.field298);
            }
            var10.method2363(arg3.field298 - (var10.method216() >> 1), arg3.field294 + -(var10.method222() >> 1));
        }
        if (arg0.field4822 != null && var15 != null) {
            class285.method1795(var15, arg5, arg0, var18, arg3, var16, 95, var17);
        }
        if (arg0.field4809 != -1 || arg0.field4822 != null) {
            class50 var34 = new class50(arg3);
            var34.field651 = var20;
            var34.field644 = var12;
            var34.field642 = var21;
            var34.field654 = var13;
            var34.field646 = var14;
            var34.field650 = var22;
            var34.field652 = var19;
            var34.field643 = var11;
            class118.field1467.method803(var34, 50);
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 228)
    public static void method2840(byte arg0) {
        field6802 = null;
        field6800 = null;
        field6801 = null;
        int var1 = 115 / ((-arg0 - 75) / 45);
    }
}
