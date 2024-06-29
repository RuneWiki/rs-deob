import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class277 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public static int[] field4477 = new int[4096];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lgl;")
    public static class250 field4485;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljava/lang/String;")
    public String field4481;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[[[I")
    public static int[][][] field4486;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIIIIIZIIILhc;Z)V")
    public static final void method1922(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class53 arg10, boolean arg11) {
        field4478++;
        if (arg0 != 105) {
            field4484 = -38;
        }
        if (arg1 < 0 || arg1 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var14 = arg10.method366(-16505);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method366(-16505);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method366(arg0 ^ 0xFFFFBFEE);
                }
            }
        }
        if (!arg6 && !arg11) {
            class253.field3806[arg4][arg1][arg5] = 0;
        }
        while (true) {
            int var12 = arg10.method366(-16505);
            if (var12 == 0) {
                if (arg6) {
                    class103.field1792[0][arg1 + arg3][arg5 + arg7] = class297.field4763[0][arg1 + arg3][arg5 + arg7];
                    return;
                } else if (arg4 == 0) {
                    class103.field1792[0][arg1 + arg3][arg5 + arg7] = -class309.method2094(arg8 + 932731, -11926, arg2 + 556238) * 8;
                    return;
                } else {
                    class103.field1792[arg4][arg1 + arg3][arg5 + arg7] = class103.field1792[arg4 - 1][arg1 + arg3][arg5 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method366(-16505);
                if (arg6) {
                    class103.field1792[0][arg1 + arg3][arg5 + arg7] = var13 * 8 + class297.field4763[0][arg1 + arg3][arg5 + arg7];
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 == 0) {
                    class103.field1792[0][arg1 + arg3][arg5 + arg7] = -var13 * 8;
                    return;
                }
                class103.field1792[arg4][arg1 + arg3][arg5 + arg7] = class103.field1792[arg4 - 1][arg1 + arg3][arg5 + arg7] - (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg11) {
                    arg10.method366(-16505);
                } else {
                    class243.field3584[arg4][arg1][arg5] = arg10.method335((byte) 26);
                    class219.field3202[arg4][arg1][arg5] = (byte) ((var12 - 2) / 4);
                    class263.field4208[arg4][arg1][arg5] = (byte) class301.method2056(3, var12 + arg9 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg6 && !arg11) {
                    class253.field3806[arg4][arg1][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg11) {
                class227.field3335[arg4][arg1][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public static final void method1923(int arg0, int arg1, int arg2) {
        class39.field521 = arg0 - class46.field623;
        if (arg2 >= 91) {
            class270.field4342 = class46.field621 + class46.field620 - arg1 - 1;
            field4475++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1924(int arg0) {
        field4485 = null;
        if (arg0 != -3342) {
            method1924(121);
        }
        field4477 = null;
        field4486 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
    public static final int method1925(int arg0, boolean arg1) {
        field4483++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (!arg1) {
            field4477 = null;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method1926(int arg0) {
        field4480++;
        class142.field2308 = new class143(32);
        if (arg0 != -8023) {
            method1923(15, 98, 39);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4477[var0] = class81.method605(var0, 6279);
        }
        field4484 = 0;
        field4485 = new class250(0, -1);
    }
}
