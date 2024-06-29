import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class203 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lcd;")
    private static class23 field4005 = class54.method414("Your profile will be transferred in:", -1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
    public static boolean[] field4006 = new boolean[5];

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lcd;")
    private static class23 field4004 = class54.method414(" seconds)3", -1);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lcd;")
    public static class23 field4011 = field4004;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lcd;")
    public static class23 field4009 = class54.method414("Art", -1);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lcd;")
    public static class23 field4013 = field4005;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lwb;")
    public static class199 field4001;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([I[IB[Lcb;II)V")
    public static final void method1329(int[] arg0, int[] arg1, byte arg2, class21[] arg3, int arg4, int arg5) {
        field4003++;
        if (arg2 != 99) {
            field4001 = null;
        }
        if (arg4 >= arg5) {
            return;
        }
        int var6 = arg4 - 1;
        int var7 = (arg4 + arg5) / 2;
        int var8 = arg5 + 1;
        class21 var9 = arg3[var7];
        arg3[var7] = arg3[arg4];
        arg3[arg4] = var9;
        while (var6 < var8) {
            boolean var10 = true;
            do {
                var8--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg0[var11] == 2) {
                        var13 = arg3[var8].field436;
                        var12 = var9.field436;
                    } else if (arg0[var11] == 1) {
                        var12 = var9.field448;
                        var13 = arg3[var8].field448;
                        if (var12 == -1 && arg1[var11] == 1) {
                            var12 = 2001;
                        }
                        if (var13 == -1 && arg1[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg0[var11] == 3) {
                        var12 = var9.field431 ? 1 : 0;
                        var13 = arg3[var8].field431 ? 1 : 0;
                    } else {
                        var13 = arg3[var8].field449;
                        var12 = var9.field449;
                    }
                    if (var12 != var13) {
                        if ((arg1[var11] != 1 || var13 <= var12) && (arg1[var11] != 0 || var12 <= var13)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg0[var15] == 2) {
                        var16 = arg3[var6].field436;
                        var17 = var9.field436;
                    } else if (arg0[var15] == 1) {
                        var17 = var9.field448;
                        var16 = arg3[var6].field448;
                        if (var16 == -1 && arg1[var15] == 1) {
                            var16 = 2001;
                        }
                        if (var17 == -1 && arg1[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg0[var15] == 3) {
                        var16 = arg3[var6].field431 ? 1 : 0;
                        var17 = var9.field431 ? 1 : 0;
                    } else {
                        var16 = arg3[var6].field449;
                        var17 = var9.field449;
                    }
                    if (var16 != var17) {
                        if ((arg1[var15] != 1 || var17 <= var16) && (arg1[var15] != 0 || var17 >= var16)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 < var8) {
                class21 var18 = arg3[var6];
                arg3[var6] = arg3[var8];
                arg3[var8] = var18;
            }
        }
        method1329(arg0, arg1, (byte) 99, arg3, arg4, var8);
        method1329(arg0, arg1, (byte) 99, arg3, var8 + 1, arg5);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIII)I")
    public static final int method1330(byte arg0, int arg1, int arg2, int arg3) {
        field4008++;
        int var4 = arg2 >> 7;
        if (arg0 != -88) {
            method1332((byte) 25);
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg2 & 0x7F;
        int var8 = arg3;
        if (arg3 < 3 && (class53.field1253[1][var4][var5] & 0x2) == 2) {
            var8 = arg3 + 1;
        }
        int var9 = (128 - var7) * class182.field3596[var8][var4][var5] + class182.field3596[var8][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class182.field3596[var8][var4][var5 - -1] + class182.field3596[var8][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var6) * var9 + var6 * var10 >> 7;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public static final void method1331(int arg0, int arg1, int arg2) {
        field4007++;
        if (class168.field3367 != arg2) {
            class174.field3475 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class174.field3475[var3] = (var3 << 12) / arg2;
            }
            class168.field3367 = arg2;
            class163.field3266 = arg2 - 1;
        }
        if (arg1 != 204245836) {
            field4006 = null;
        }
        if (class2.field24 == arg0) {
            return;
        }
        class95.field1995 = new int[arg0];
        for (int var4 = 0; var4 < arg0; var4++) {
            class95.field1995[var4] = (var4 << 12) / arg0;
        }
        class2.field24 = arg0;
        class81.field1760 = arg0 - 1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1332(byte arg0) {
        field4001 = null;
        field4004 = null;
        if (arg0 > -18) {
            field4002 = -76;
        }
        field4009 = null;
        field4006 = null;
        field4013 = null;
        field4011 = null;
        field4005 = null;
    }
}
