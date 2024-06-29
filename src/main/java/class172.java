import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class172 extends class43 {

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Lab;")
    public class269 field2734 = new class269();

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lpg;")
    public class290 field2737 = new class290();

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lga;")
    private class155 field2736;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
    public static int[] field2726;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    public static int[] field2729;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[[[I")
    public static int[][][] field2739;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()Lfg;")
    public final class43 method242() {
        field2733++;
        class166 var1 = (class166) this.field2734.method1802(43);
        if (var1 == null) {
            return null;
        } else if (var1.field2678 == null) {
            return this.method239();
        } else {
            return var1.field2678;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()I")
    public final int method238() {
        field2730++;
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V")
    public final void method237(int[] arg0, int arg1, int arg2) {
        field2725++;
        this.field2737.method237(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2734.method1802(43); var4 != null; var4 = (class166) this.field2734.method1815(0)) {
            if (!this.field2736.method1061(-26224, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2669) {
                        this.method1180(var5, false, var5 + var6, var6, var4, arg0);
                        var4.field2669 -= var6;
                        break;
                    }
                    this.method1180(var5, false, var5 + var6, var4.field2669, var4, arg0);
                    var5 += var4.field2669;
                    var6 -= var4.field2669;
                } while (!this.field2736.method1063(122, arg0, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)V")
    public static final void method1179(int arg0, int arg1, byte arg2) {
        int var3 = class218.field3493 * arg0 >> 8;
        if (arg1 == -1 && !class271.field4335) {
            class17.method91(false);
        } else if (arg1 != -1 && (class171.field2714 != arg1 || !class51.method289(-1)) && var3 != 0 && !class271.field4335) {
            class92.method500(0, 24217, class182.field2897, var3, false, arg1, 2);
        }
        field2724++;
        class171.field2714 = arg1;
        if (arg2 != -94) {
            method1179(-121, -98, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIILli;[I)V")
    private final void method1180(int arg0, boolean arg1, int arg2, int arg3, class166 arg4, int[] arg5) {
        if (arg1) {
            this.field2737 = null;
        }
        if ((this.field2736.field2436[arg4.field2663] & 0x4) != 0 && arg4.field2658 < 0) {
            int var7 = this.field2736.field2425[arg4.field2663] / class280.field4448;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2680) / var7;
                if (var8 > arg3) {
                    arg4.field2680 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                int var9 = 262144 / var7;
                arg4.field2678.method237(arg5, arg0, var8);
                arg0 += var8;
                arg4.field2680 += var7 * var8 - 1048576;
                int var10 = class280.field4448 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class193 var11 = arg4.field2678;
                if (this.field2736.field2477[arg4.field2663] == 0) {
                    arg4.field2678 = class193.method1343(arg4.field2677, var11.method1331(), var11.method1333(), var11.method1362());
                } else {
                    arg4.field2678 = class193.method1343(arg4.field2677, var11.method1331(), 0, var11.method1362());
                    this.field2736.method1071(-1, arg4, arg4.field2665.field4509[arg4.field2651] < 0);
                    arg4.field2678.method1366(var10, var11.method1333());
                }
                if (arg4.field2665.field4509[arg4.field2651] < 0) {
                    arg4.field2678.method1336(-1);
                }
                var11.method1348(var10);
                var11.method237(arg5, arg0, arg2 - arg0);
                if (var11.method1367()) {
                    this.field2737.method1954(var11);
                }
            }
        }
        arg4.field2678.method237(arg5, arg0, arg3);
        field2731++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBII)V")
    public static final void method1181(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2727++;
        class233 var5 = class114.method746(arg1, 1228126432, 8);
        var5.method1651((byte) 121);
        var5.field3855 = arg0;
        var5.field3852 = arg3;
        var5.field3850 = arg4;
        if (arg2 != -27) {
            field2729 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method236(int arg0) {
        field2738++;
        this.field2737.method236(arg0);
        for (class166 var2 = (class166) this.field2734.method1802(43); var2 != null; var2 = (class166) this.field2734.method1815(0)) {
            if (!this.field2736.method1061(-26224, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2669 >= var3) {
                        this.method1182(var2, var3, true);
                        var2.field2669 -= var3;
                        break;
                    }
                    this.method1182(var2, var2.field2669, true);
                    var3 -= var2.field2669;
                } while (!this.field2736.method1063(123, (int[]) null, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lli;IZ)V")
    private final void method1182(class166 arg0, int arg1, boolean arg2) {
        field2728++;
        if ((this.field2736.field2436[arg0.field2663] & 0x4) != 0 && arg0.field2658 < 0) {
            int var4 = this.field2736.field2425[arg0.field2663] / class280.field4448;
            int var5 = (var4 + 1048575 - arg0.field2680) / var4;
            arg0.field2680 = arg0.field2680 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2736.field2477[arg0.field2663] == 0) {
                    arg0.field2678 = class193.method1343(arg0.field2677, arg0.field2678.method1331(), arg0.field2678.method1333(), arg0.field2678.method1362());
                } else {
                    arg0.field2678 = class193.method1343(arg0.field2677, arg0.field2678.method1331(), 0, arg0.field2678.method1362());
                    this.field2736.method1071(-1, arg0, arg0.field2665.field4509[arg0.field2651] < 0);
                }
                if (arg0.field2665.field4509[arg0.field2651] < 0) {
                    arg0.field2678.method1336(-1);
                }
                arg1 = arg0.field2680 / var4;
            }
        }
        if (!arg2) {
            this.field2734 = null;
        }
        arg0.field2678.method236(arg1);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field2726 = null;
        field2729 = null;
        if (arg0 == 18068) {
            field2739 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1184(String arg0, int arg1) {
        field2735++;
        int var2 = class258.method1762(arg1 + 2839, arg0);
        if (var2 != -1 && arg1 == -2728) {
            int[] var3 = class238.field3928.method1020(class209.field3336.field494[var2] & 0x3FFF, (byte) 63, (class209.field3336.field494[var2] & 0x338ABB19) >> 28, (class209.field3336.field494[var2] & 0xFFFEE09) >> 14);
            client.method725(var3[2], var3[1], (byte) 98);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()Lfg;")
    public final class43 method239() {
        field2732++;
        class166 var1;
        do {
            var1 = (class166) this.field2734.method1815(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2678 == null);
        return var1.field2678;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lga;)V")
    public class172(class155 arg0) {
        this.field2736 = arg0;
    }
}
