import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class651 {

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public int field9188 = -1;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field9190 = 0;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field9191 = -1;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "F")
    public static float field9195;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public int field9181;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public int field9182;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public int field9184;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public int field9185;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field9186;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public int field9189;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field9194;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public int field9196;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lfa;")
    public static class526 field9183;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lpl;")
    public static class612 field9187;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method3653(byte arg0) {
        field9183 = null;
        field9187 = null;
        if (arg0 != -107) {
            method3654(-101, 117, -35, -89, 117, null, -128, null, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII[BI[BB)V")
    public static final void method3654(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, byte arg8) {
        field9193++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        int var11 = -arg1;
        if (arg8 != -113) {
            method3655(-24, null, 32);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg7[var10001] = (byte) (arg7[var10001] - arg5[arg2++]);
                int var14 = arg4++;
                arg7[var14] = (byte) (arg7[var14] - arg5[arg2++]);
                int var15 = arg4++;
                arg7[var15] = (byte) (arg7[var15] - arg5[arg2++]);
                int var16 = arg4++;
                arg7[var16] = (byte) (arg7[var16] - arg5[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg7[var10001] = (byte) (arg7[var10001] - arg5[arg2++]);
            }
            arg2 += arg6;
            arg4 += arg3;
            var11++;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[Lkp;I)V")
    public static final void method3655(int arg0, class507[] arg1, int arg2) {
        field9197++;
        int var3 = -92 / ((14 - arg0) / 47);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class507 var5 = arg1[var4];
            if (var5 != null && var5.field6719 == arg2 && !client.method3809(var5)) {
                if (var5.field6735 == 0) {
                    method3655(119, arg1, var5.field6764);
                    if (var5.field6707 != null) {
                        method3655(77, var5.field6707, var5.field6764);
                    }
                    class340 var6 = (class340) class138.field1797.method399(-32748, (long) var5.field6764);
                    if (var6 != null) {
                        class531.method2885(-126, var6.field4392);
                    }
                }
                if (var5.field6735 == 6 && var5.field6746 != -1) {
                    class395 var7 = class583.field8149.method1844(64, var5.field6746);
                    if (var7 != null) {
                        var5.field6742 += class653.field9220;
                        int var8 = var5.field6717;
                        while (var5.field6742 > var7.field4991[var5.field6717]) {
                            var5.field6742 -= var7.field4991[var5.field6717];
                            var5.field6717++;
                            if (var5.field6717 >= var7.field4979.length) {
                                var5.field6717 -= var7.field4988;
                                if (var5.field6717 < 0 || var5.field6717 >= var7.field4979.length) {
                                    var5.field6717 = 0;
                                }
                            }
                            var5.field6820 = var5.field6717 + 1;
                            if (var7.field4979.length <= var5.field6820) {
                                var5.field6820 -= var7.field4988;
                                if (var5.field6820 < 0 || var7.field4979.length <= var5.field6820) {
                                    var5.field6820 = -1;
                                }
                            }
                            class572.method3158(var5, 1023);
                        }
                        if (var5.field6717 != var8) {
                            class106.method602(var7, (byte) -102, var5.field6717);
                        }
                    }
                }
            }
        }
    }
}
