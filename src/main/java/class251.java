import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class251 extends class199 {

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    public static int field3685 = -1;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "Lwa;")
    public static class177 field3681 = new class177(5000);

    @OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "[Lp;")
    public static class169[] field3688 = new class169[32768];

    @OriginalMember(owner = "client!hk", name = "lb", descriptor = "S")
    public static short field3692 = 256;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    private int field3679;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "Lfh;")
    public static class140 field3689;

    @OriginalMember(owner = "client!hk", name = "kb", descriptor = "Leo;")
    public static class71 field3691;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
    public static int[] field3673;

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 5)
    private class251(int arg0) {
        super(0, false);
        this.method1762(-3, arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLfd;I)V", line = 14)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field3678++;
        if (arg0 == -43 && arg2 == 0) {
            this.method1762(arg0 ^ 0x28, arg1.method2085((byte) 61));
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V", line = 41)
    public static final void method1761(int arg0, boolean arg1, int arg2) {
        field3676++;
        if (!arg1) {
            field3688 = (class169[]) null;
        }
        class42 var3 = class166.method1242(6, arg2, -1249071392);
        var3.method307((byte) -99);
        var3.field523 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 56)
    public class251() {
        this(0);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I", line = 63)
    public final int[][] method215(int arg0, int arg1) {
        field3686++;
        if (arg1 != -29869) {
            field3685 = 64;
        }
        int[][] var3 = this.field2796.method2187(arg0, -127);
        if (this.field2796.field4667) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class95.field1235; var7++) {
                var5[var7] = this.field3682;
                var4[var7] = this.field3679;
                var6[var7] = this.field3677;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V", line = 98)
    private final void method1762(int arg0, int arg1) {
        this.field3679 = (arg1 & 0xFF00) >> 4;
        field3675++;
        this.field3682 = arg1 >> 12 & 0xFF0;
        this.field3677 = arg1 & 0xFF << 4;
        if (arg0 != -3) {
            field3688 = (class169[]) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 111)
    public static void method1763(int arg0) {
        field3688 = null;
        field3681 = null;
        field3691 = null;
        field3689 = null;
        field3673 = null;
        if (arg0 != -129) {
            method1764(-27, true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V", line = 132)
    public static final void method1764(int arg0, boolean arg1) {
        field3684++;
        if (arg1) {
            method1763(-82);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class222.method1621(1);
        } else if (arg0 == 2) {
            class96.method692(102);
        } else if (arg0 == 3) {
            class56.method425((byte) 65);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)Lgb;", line = 159)
    public static final class196 method1765(int arg0) {
        field3687++;
        if (arg0 != 6) {
            field3688 = (class169[]) null;
        }
        return class217.field3063.length <= class27.field310 ? null : class217.field3063[class27.field310++];
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lem;[I[[FIILpi;[[FI[[FI[[I)V", line = 178)
    public static final void method1766(class339 arg0, int[] arg1, float[][] arg2, int arg3, int arg4, class63 arg5, float[][] arg6, int arg7, float[][] arg8, int arg9, int[][] arg10) {
        field3674++;
        int[] var11 = new int[arg1.length / 2];
        if (arg7 != 1) {
            method1761(-43, false, -91);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg1[var12 + var12];
            int var14 = arg1[var12 + var12 + 1];
            if (arg9 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg9 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg9 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg6[arg4][arg3];
                var18 = arg8[arg4][arg3];
                var19 = arg2[arg4][arg3];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg6[arg4 + 1][arg3];
                var19 = arg2[arg4 + 1][arg3];
                var18 = arg8[arg4 + 1][arg3];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg6[arg4 + 1][arg3 + 1];
                var19 = arg2[arg4 + 1][arg3 + 1];
                var18 = arg8[arg4 + 1][arg3 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg8[arg4][arg3 + 1];
                var17 = arg6[arg4][arg3 + 1];
                var19 = arg2[arg4][arg3 + 1];
            } else {
                float var20 = arg8[arg4][arg3];
                float var21 = (float) var13 / 128.0F;
                float var22 = arg2[arg4][arg3];
                float var23 = (arg2[arg4 + 1][arg3] - var22) * var21 + var22;
                float var24 = (arg8[arg4 + 1][arg3] - var20) * var21 + var20;
                float var25 = arg6[arg4][arg3];
                float var26 = arg2[arg4][arg3 + 1];
                float var27 = (arg6[arg4 + 1][arg3] - var25) * var21 + var25;
                float var28 = (float) var14 / 128.0F;
                float var29 = arg8[arg4][arg3 + 1];
                float var30 = arg6[arg4][arg3 + 1];
                float var31 = (arg6[arg4 + 1][arg3 + 1] - var30) * var21 + var30;
                var17 = (var31 - var27) * var28 + var27;
                float var32 = (arg8[arg4 + 1][arg3 + 1] - var29) * var21 + var29;
                float var33 = (arg2[arg4 + 1][arg3 + 1] - var26) * var21 + var26;
                var19 = (var33 - var23) * var28 + var23;
                var18 = (var32 - var24) * var28 + var24;
            }
            int var34 = (arg4 << 7) + var13;
            int var35 = (arg3 << 7) + var14;
            int var36 = class62.method459(var13, arg4, var14, arg10, arg3, 13);
            var11[var12] = arg5.method464(arg0, var34, var36, var35, var17, var18, var19);
        }
        arg5.method460(var11);
    }
}
