import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class274 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4261 = 0;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[I")
    public static int[] field4265 = new int[200];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([II)[I", line = 12)
    public static final int[] method1971(int[] arg0, int arg1) {
        field4268++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class271.method1953(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIIIB)V", line = 36)
    public static final void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field4259++;
        int var11 = arg5 - arg0;
        int var12 = arg3 - arg9;
        int var13 = -1;
        int var14 = 983040 / arg2;
        if (class83.field1238 > 0) {
            if (class87.field1328 <= 10) {
                var13 = class87.field1328 * 5;
            } else {
                var13 = (10 + 10 - class87.field1328) * 5;
            }
        }
        int var15 = 983040 / arg7;
        int var16 = 37 % ((3 - arg10) / 56);
        for (int var17 = -var14; var17 < (var11 + var14); var17++) {
            int var18 = arg2 * var17 + arg6 >> 16;
            int var19 = (var17 + 1) * arg2 + arg6 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg8 + var18;
                int var10000 = arg8 + var19;
                int var23 = arg0 + var17 >> 6;
                if (var23 >= 0 && var23 <= class148.field2387.length - 1) {
                    int[][] var24 = class148.field2387[var23];
                    for (int var25 = -var15; var25 < var12 + var15; var25++) {
                        int var26 = arg7 * var25 + arg1 >> 16;
                        int var27 = (var25 + 1) * arg7 + arg1 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg4 + var27;
                            int var30 = arg4 + var26;
                            int var31 = arg9 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = (arg9 + var25 & 0x3F << 6) + (var17 + arg0 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class6 var34 = class28.method190(76, var33 - 1);
                                    if (!class145.field2268[var34.field104]) {
                                        if (var13 != -1 && class17.field325 == var34.field104) {
                                            class26 var35 = new class26();
                                            var35.field437 = var34.field104;
                                            var35.field438 = var21;
                                            var35.field430 = var30;
                                            class264.field4089.method1493(-112, var35);
                                        } else {
                                            class278.field4307[var34.field104].method59(var21 - 7, var30 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class26 var36 = (class26) class264.field4089.method1490(200); var36 != null; var36 = (class26) class264.field4089.method1487((byte) 117)) {
            class182.method1367(var36.field438, var36.field430, 15, 16776960, var13);
            class182.method1367(var36.field438, var36.field430, 13, 16776960, var13);
            class182.method1367(var36.field438, var36.field430, 11, 16776960, var13);
            class182.method1367(var36.field438, var36.field430, 9, 16776960, var13);
            class278.field4307[var36.field437].method59(var36.field438 - 7, var36.field430 - 7);
        }
        class264.field4089.method1489(200);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 174)
    public static void method1973(byte arg0) {
        field4265 = null;
        if (arg0 <= 48) {
            method1972(71, 92, 24, -49, -91, 92, 116, -33, -30, 106, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 185)
    public static final void method1974(String arg0, int arg1) {
        field4260++;
        if (arg1 <= -68) {
            int var2 = class232.method1673(arg0, -27362);
            if (var2 != -1) {
                class228.method1653(true, class43.field763.field3139[var2], class43.field763.field3137[var2]);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public abstract void method1526(int arg0, int arg1);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public abstract void method1527(int arg0, int arg1, int arg2);
}
