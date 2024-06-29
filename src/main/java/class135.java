import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class135 extends class219 {

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    private int field2406 = 0;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    private int field2409 = 16;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    private int field2415 = 4096;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    private int field2412 = 2000;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field2408 = 0;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[I")
    public static int[] field2404 = new int[25];

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field2417 = 0;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lbd;")
    public static class162 field2407 = class17.method142(0, " ");

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field2413 = 255;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Ldc;")
    public static class71 field2400;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "Lclient;")
    public static client field2414;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2418;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lbd;Z)Lbd;", line = 10)
    public static final class162 method1062(class162[] arg0, boolean arg1) {
        if (!arg1) {
            return (class162) null;
        }
        field2403++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class120.method979(30000, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 361)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 68)
    public final void method39(byte arg0) {
        class165.method1302(22);
        if (arg0 != 22) {
            method1064(115, -89, 123, (byte) 60, 114, -10, -117);
        }
        field2410++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[I", line = 82)
    public final int[] method41(boolean arg0, int arg1) {
        field2411++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = this.field2415 >> 1;
            int[][] var5 = this.field3654.method2030(2595);
            Random var6 = new Random((long) this.field2408);
            for (int var7 = 0; var7 < this.field2412; var7++) {
                int var8 = this.field2415 > 0 ? this.field2406 + class95.method771(var6, this.field2415, (byte) 120) - var4 : this.field2406;
                int var9 = (var8 & 0xFF4) >> 4;
                int var10 = class95.method771(var6, class128.field2326, (byte) 111);
                int var11 = class95.method771(var6, class47.field749, (byte) 111);
                int var12 = (class293.field4927[var9] * this.field2409 >> 12) + var11;
                int var13 = (class31.field518[var9] * this.field2409 >> 12) + var10;
                int var14 = var12 - var11;
                int var15 = var13 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var13;
                        var13 = var12;
                        int var18 = var10;
                        var12 = var17;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var10 > var13) {
                        int var19 = var10;
                        var10 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var10;
                    int var23 = var12 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = 1024 - (class95.method771(var6, 4096, (byte) 118) >> 2);
                    int var25 = -var22 / 2;
                    int var26 = 2048 / var22;
                    int var27 = var11 >= var12 ? -1 : 1;
                    for (int var28 = var10; var28 < var13; var28++) {
                        var25 += var23;
                        int var29 = (var28 - var10) * var26 + var24 + 1024;
                        int var30 = var21 & class60.field927;
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 -= -var27;
                        }
                        int var31 = class252.field4208 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            field2414 = (client) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILuh;II)V", line = 218)
    public static final void method1063(int arg0, int arg1, class83 arg2, int arg3, int arg4) {
        field2402++;
        if (class293.field4931 >= 400) {
            return;
        }
        if (arg2.field1502 != null) {
            arg2 = arg2.method643(true);
        }
        if (arg2 == null || !arg2.field1494) {
            return;
        }
        int var5 = 50 / ((arg0 - 34) / 54);
        class162 var6 = arg2.field1469;
        if (arg2.field1459 != 0) {
            var6 = method1062(new class162[] { var6, class128.method1032(class122.field2215.field642, arg2.field1459, (byte) -34), class257.field4263, class216.field3605, class156.method1212(10, arg2.field1459), class258.field4297 }, true);
        }
        if (class148.field2674 == 1) {
            class143.method1143((long) arg4, (short) 30, 10015, arg1, arg3, class267.field4443, method1062(new class162[] { class190.field3246, class109.field1958, var6 }, true));
            class183.field3163++;
        } else if (!class13.field213) {
            class153.field2714++;
            class162[] var7 = arg2.field1489;
            if (class50.field796) {
                var7 = class146.method1163(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class53.field841 != 0 || !var7[var8].method1282(class154.field2725, 47))) {
                        class128.field2328++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 26;
                        }
                        if (var8 == 1) {
                            var9 = 14;
                        }
                        if (var8 == 2) {
                            var9 = 49;
                        }
                        if (var8 == 3) {
                            var9 = 39;
                        }
                        if (var8 == 4) {
                            var9 = 21;
                        }
                        class143.method1143((long) arg4, var9, 10015, arg1, arg3, var7[var8], method1062(new class162[] { class213.field3574, var6 }, true));
                    }
                }
            }
            if (class53.field841 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method1282(class154.field2725, 123)) {
                        short var11 = 0;
                        class288.field4843++;
                        if (class122.field2215.field642 < arg2.field1459) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 26;
                        }
                        if (var10 == 1) {
                            var12 = 14;
                        }
                        if (var10 == 2) {
                            var12 = 49;
                        }
                        if (var10 == 3) {
                            var12 = 39;
                        }
                        if (var10 == 4) {
                            var12 = 21;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class143.method1143((long) arg4, var12, 10015, arg1, arg3, var7[var10], method1062(new class162[] { class213.field3574, var6 }, true));
                    }
                }
            }
            class143.method1143((long) arg4, (short) 1005, 10015, arg1, arg3, class87.field1539, method1062(new class162[] { class213.field3574, var6 }, true));
        } else if ((class60.field930 & 0x2) == 2) {
            class143.method1143((long) arg4, (short) 12, 10015, arg1, arg3, class245.field4074, method1062(new class162[] { class243.field4042, class109.field1958, var6 }, true));
            class305.field5142++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIBIII)V", line = 365)
    public static final void method1064(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2416++;
        if (class112.field2028 <= arg6 - arg0 && (arg6 + arg0) <= class82.field1426 && arg1 - arg0 >= class303.field5106 && class298.field4989 >= (arg0 + arg1)) {
            class147.method1170(arg6, arg2, -1, arg5, arg0, arg4, arg1);
        } else {
            class7.method38(arg5, (byte) 55, arg2, arg1, arg4, arg0, arg6);
        }
        int var7 = -94 % ((arg3 + 12) / 37);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILb;)V", line = 396)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == 0) {
            this.field2408 = arg2.method756(915905888);
        } else if (arg0 == 1) {
            this.field2412 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field2409 = arg2.method756(915905888);
        } else if (arg0 == 3) {
            this.field2406 = arg2.method761((byte) 108);
        } else if (arg0 == 4) {
            this.field2415 = arg2.method761((byte) 108);
        }
        if (arg1 == 0) {
            field2419++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)V", line = 450)
    public static void method1065(boolean arg0) {
        field2418 = (byte[][][]) null;
        if (arg0) {
            field2413 = -15;
        }
        field2400 = null;
        field2407 = null;
        field2414 = null;
        field2404 = null;
    }
}
