import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class48 {

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Lfha;")
    private class378 field558;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Luj;")
    public static class383 field560 = new class383();

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "Ldp;")
    public static class3 field563 = new class3();

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Z")
    public static boolean field570 = false;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Laia;")
    public static class226 field564;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Lfp;")
    public static class323 field567;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lfp;")
    public static class323 field569;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "[Loaa;")
    public static class287[] field568;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "[Loia;")
    public static class88[] field566;

    @OriginalMember(owner = "client!wba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field558.method2368(this.field559, (byte) 123);
        field561++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILha;IIIIILmq;III)V")
    public static final void method307(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class508 arg8, int arg9, int arg10, int arg11) {
        if (arg9 < arg6 && arg6 < (arg4 + arg9) && arg5 - 13 < arg1 && (arg5 + 3) > arg1) {
            arg3 = arg11;
        }
        field557++;
        String var12 = class476.method2848((byte) -112, arg8);
        class505.field7241.method508(0, arg3, arg0 - 155, arg9 + 3, class748.field10391, var12, class417.field5894, arg5);
        if (arg0 != 255) {
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method308(int arg0) {
        field560 = null;
        field568 = null;
        field567 = null;
        field563 = null;
        if (arg0 == -5620) {
            field569 = null;
            field564 = null;
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIILha;Ljb;Laa;III)V")
    public static final void method309(int arg0, int arg1, int arg2, class58 arg3, class493 arg4, class486 arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -13) {
            method308(22);
        }
        field562++;
        class344 var9 = class569.field8079.method3088((byte) -71, arg1);
        if (var9 == null || !var9.field4810 || !var9.method2223(class101.field1201, arg6 ^ 0xFFFFFFF1)) {
            return;
        }
        if (var9.field4842 != null) {
            int[] var10 = new int[var9.field4842.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class97.field1168 == 4) {
                    var28 = (int) class552.field7773 & 0x3FFF;
                } else {
                    var28 = (int) class552.field7773 + class535.field7520 & 0x3FFF;
                }
                int var29 = class164.field2258[var28];
                int var30 = class164.field2252[var28];
                if (class97.field1168 != 4) {
                    var30 = var30 * 256 / (class180.field2412 + 256);
                    var29 = var29 * 256 / (class180.field2412 + 256);
                }
                var10[var11 * 2] = ((var9.field4842[var11 * 2] * 4 + arg8) * var30 + (var9.field4842[var11 * 2 + 1] * 4 + arg7) * var29 >> 14) + arg0 + (arg4.field7095 / 2);
                var10[var11 * 2 + 1] = arg4.field7031 / 2 + arg2 - ((var9.field4842[var11 * 2 + 1] * 4 + arg7) * var30 + -((var9.field4842[var11 * 2] * 4 + arg8) * var29) >> 14);
            }
            class22.method136(arg3, var10, var9.field4831, arg4.field7081, arg4.field7014);
            if (var9.field4815 > 0) {
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[var12 * 2 + 2];
                    int var23 = var10[var12 * 2 + 3];
                    if (var22 < var20) {
                        int var24 = var20;
                        int var25 = var21;
                        var20 = var22;
                        var21 = var23;
                        var22 = var24;
                        var23 = var25;
                    } else if (var20 == var22 && var23 < var21) {
                        int var26 = var21;
                        var21 = var23;
                        var23 = var26;
                    }
                    arg3.method456(var20, var21, var22, var23, var9.field4820[var9.field4798[var12] & 0xFF], 1, arg5, arg0, arg2, var9.field4815, var9.field4822, var9.field4837);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var14 > var16) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg3.method456(var13, var14, var15, var16, var9.field4820[var9.field4798[var9.field4798.length - 1] & 0xFF], 1, arg5, arg0, arg2, var9.field4815, var9.field4822, var9.field4837);
            } else {
                for (int var27 = 0; var27 < var10.length / 2 - 1; var27++) {
                    arg3.method383(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 1 + 2], var9.field4820[var9.field4798[var27] & 0xFF], 1, arg5, arg0, arg2);
                }
                arg3.method383(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4820[var9.field4798[var9.field4798.length - 1] & 0xFF], 1, arg5, arg0, arg2);
            }
        }
        class88 var31 = null;
        if (var9.field4803 != -1) {
            var31 = var9.method2230(arg3, (byte) -13, false);
            if (var31 != null) {
                class93.method691(-122, arg2, arg8, arg5, var31, arg7, arg0, arg4);
            }
        }
        if (var9.field4847 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method663();
        }
        class59 var33 = class352.field4974;
        class143 var34 = class219.field2859;
        if (var9.field4808 == 1) {
            var34 = class455.field6428;
            var33 = class478.field6780;
        }
        if (var9.field4808 == 2) {
            var33 = class505.field7241;
            var34 = class119.field1441;
        }
        class253.method1680(var32, arg4, var9.field4846, arg8, arg6 ^ 0xFFFFFEF3, var9.field4847, var33, arg2, var34, arg0, arg7, arg5);
        return;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lfha;II)V")
    public class48(class378 arg0, int arg1, int arg2) {
        this.field558 = arg0;
        this.field559 = arg2;
    }
}
