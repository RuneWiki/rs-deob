import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class590 extends class396 {

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    private int field8317;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    private int field8316;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field8321;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    private int field8322;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lfba;")
    public static class27 field8320 = new class27(62, 15);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lva;")
    public static class521 field8323;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 3)
    public static void method3436(int arg0) {
        field8320 = null;
        field8323 = null;
        if (arg0 > -47) {
            field8320 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 18)
    public final void method1584(int arg0, int arg1, int arg2) {
        if (arg2 == -1791337721) {
            ++field8318;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[FIIIII[FIII[I[I)V", line = 29)
    public static final void method3437(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12) {
        ++field8319;
        int var13 = arg6 * arg10 + arg8;
        int var14 = arg0 * arg4 - -arg5;
        int var15 = -arg3 + arg6;
        int var16 = -arg3 + arg4;
        if (arg9 <= 4) {
            method3437(-16, (float[]) null, 33, -27, 81, -60, 11, (float[]) null, 43, 111, -51, (int[]) null, (int[]) null);
        }
        if (arg12 != null) {
            if (arg7 == null) {
                for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                    int var18 = var13 - -arg3;
                    while (var13 < var18) {
                        arg11[var14++] = arg12[var13++];
                    }
                    var13 += var15;
                    var14 += var16;
                }
            } else {
                for (int var19 = 0; arg2 > var19; ++var19) {
                    int var20 = arg3 + var13;
                    while (var13 < var20) {
                        arg11[var14] = arg12[var13];
                        arg1[var14++] = arg7[var13++];
                    }
                    var13 += var15;
                    var14 += var16;
                }
            }
        } else {
            for (int var21 = 0; ~arg2 < ~var21; ++var21) {
                int var22 = arg3 + var13;
                while (~var13 > ~var22) {
                    arg1[var14++] = arg7[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILha;Ld;III)V", line = 111)
    public static final void method3438(int arg0, int arg1, class65 arg2, class160 arg3, int arg4, int arg5, int arg6) {
        ++field8326;
        if (~class197.field3016 > -101) {
            class170.method1256(arg6 + -61447, arg3, arg2);
        }
        arg2.method434(arg4, arg0, arg4 + arg5, arg0 + arg1);
        if (arg6 == 29441) {
            if (~class197.field3016 > -101) {
                byte var7 = 20;
                int var8 = arg5 / 2 + arg4;
                int var9 = arg1 / 2 + -var7 + arg0 + -18;
                arg2.method495(arg4, arg0, arg5, arg1, -16777216, 0);
                arg2.method520(var8 + -152, var9, 304, 34, class727.field10045[class222.field3426].getRGB(), 0);
                arg2.method495(var8 + -150, var9 + 2, class197.field3016 * 3, 30, class688.field9562[class222.field3426].getRGB(), 0);
                class269.field3907.method566(class620.field8679.method3580(class140.field2081, 12), class98.field1116[class222.field3426].getRGB(), var7 + var9, arg6 ^ 29441, -1, var8);
            } else {
                int var10 = -((int) ((float) arg5 / class117.field1796)) + class671.field9338;
                int var11 = (int) ((float) arg1 / class117.field1796) + class752.field10398;
                int var12 = (int) ((float) arg5 / class117.field1796) + class671.field9338;
                class488.field6906 = -((int) ((float) arg1 / class117.field1796)) + class752.field10398;
                class577.field8135 = class671.field9338 - (int) ((float) arg5 / class117.field1796);
                class98.field1117 = (int) ((float) (arg5 * 2) / class117.field1796);
                int var13 = -((int) ((float) arg1 / class117.field1796)) + class752.field10398;
                class776.field10665 = (int) ((float) (arg1 * 2) / class117.field1796);
                class117.method876(var10 - -class117.field1804, class117.field1806 + var11, class117.field1804 + var12, class117.field1806 + var13, arg4, arg0, arg4 + arg5, arg0 + 1 - -arg1);
                class117.method892(arg2);
                class266 var14 = class117.method881(arg2);
                class53.method367(1, 0, arg2, 0, var14);
                if (class503.field7134 > 0) {
                    --class788.field10817;
                    if (class788.field10817 == 0) {
                        --class503.field7134;
                        class788.field10817 = 20;
                    }
                }
                if (class216.field3351) {
                    int var15 = arg4 - (-arg5 + 5);
                    int var16 = arg0 - (-arg1 - -8);
                    class449.field6148.method567(16776960, 0, var15, var16, -1, "Fps:" + class694.field9696);
                    int var20 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (~var18 < -65537) {
                        var19 = 16711680;
                    }
                    class449.field6148.method567(var19, 0, var15, var20, -1, "Mem:" + var18 + "k");
                    var16 = var20 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V", line = 195)
    public class590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8317 = arg2;
        this.field8316 = arg3;
        this.field8321 = arg0;
        this.field8322 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(III)V", line = 209)
    public final void method1583(int arg0, int arg1, int arg2) {
        ++field8325;
        int var4 = this.field8321 * arg0 >> 12;
        if (arg1 != 126) {
            field8323 = null;
        }
        int var5 = this.field8317 * arg0 >> 12;
        int var6 = this.field8322 * arg2 >> 12;
        int var7 = this.field8316 * arg2 >> 12;
        class326.method2089(var4, super.field5451, var6, var5, var7, false);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V", line = 229)
    public final void method1580(int arg0, int arg1, int arg2) {
        ++field8324;
        int var4 = this.field8321 * arg0 >> 12;
        if (arg1 <= -5) {
            int var5 = this.field8317 * arg0 >> 12;
            int var6 = this.field8322 * arg2 >> 12;
            int var7 = this.field8316 * arg2 >> 12;
            class753.method4191(super.field5448, var7, (byte) 104, var4, super.field5449, var6, super.field5451, var5);
        }
    }
}
