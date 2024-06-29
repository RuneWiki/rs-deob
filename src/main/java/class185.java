import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class185 extends class261 {

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    private int field2983 = 10;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field2980 = 0;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    private int field2986 = 2048;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "[[Lgl;")
    public static class181[][] field2982 = new class181[13][13];

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Lve;")
    public static class255 field2985 = class87.method607(77, "Sprites geladen)3");

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
    public static int[] field2990 = new int[2];

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "Lrg;")
    public static class88 field2989;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "[I")
    private int[] field2979;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "[I")
    private int[] field2987;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[I", line = 10)
    public final int[] method21(byte arg0, int arg1) {
        field2981++;
        int var3 = -126 % ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = class20.field324[arg1];
            if (this.field2980 == 0) {
                short var6 = 0;
                for (int var7 = 0; var7 < this.field2983; var7++) {
                    if (var5 >= this.field2979[var7] && this.field2979[var7 + 1] > var5) {
                        if (this.field2987[var7] > var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class36.method218(var4, 0, class92.field1576, var6);
            } else {
                for (int var8 = 0; var8 < class92.field1576; var8++) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class245.field4120[var8];
                    int var12 = this.field2980;
                    if (var12 == 1) {
                        var9 = var11;
                    } else if (var12 == 2) {
                        var9 = (var5 + var11 - 4096 >> 1) + 2048;
                    } else if (var12 == 3) {
                        var9 = (var11 - var5 >> 1) + 2048;
                    }
                    for (int var13 = 0; var13 < this.field2983; var13++) {
                        if (var9 >= this.field2979[var13] && var9 < this.field2979[var13 + 1]) {
                            if (var9 < this.field2987[var13]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BJ)V", line = 123)
    public static final void method1291(byte arg0, long arg1) {
        field2992++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -113) {
            method1295(-78, 24, -119);
        }
        for (int var3 = 0; var3 < class33.field529; var3++) {
            if (class209.field3570[var3] == arg1) {
                class33.field529--;
                for (int var4 = var3; var4 < class33.field529; var4++) {
                    class32.field519[var4] = class32.field519[var4 + 1];
                    class93.field1595[var4] = class93.field1595[var4 + 1];
                    class198.field3420[var4] = class198.field3420[var4 + 1];
                    class209.field3570[var4] = class209.field3570[var4 + 1];
                    class70.field1110[var4] = class70.field1110[var4 + 1];
                    class220.field3713[var4] = class220.field3713[var4 + 1];
                }
                class251.field4224 = class251.field4240;
                class255.field4318.method1523(22260, 195);
                class137.field2290++;
                class255.field4318.method449(16711680, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 172)
    public static void method1292(int arg0) {
        field2990 = null;
        field2989 = null;
        field2982 = (class181[][]) null;
        field2985 = null;
        if (arg0 != -1253601630) {
            method1291((byte) 4, 70L);
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 185)
    private final void method1293(int arg0) {
        this.field2979 = new int[this.field2983 + 1];
        field2991++;
        if (arg0 < 91) {
            this.field2986 = 64;
        }
        this.field2987 = new int[this.field2983 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field2983;
        int var4 = this.field2986 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2983; var5++) {
            this.field2979[var5] = var2;
            this.field2987[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2979[this.field2983] = 4096;
        this.field2987[this.field2983] = this.field2987[0] + 4096;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lpb;BI)V", line = 222)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field2994++;
        if (arg1 > -115) {
            method1295(-65, -127, 63);
        }
        if (arg2 == 0) {
            this.field2983 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field2986 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field2980 = arg0.method481(0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 454)
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 271)
    public static final void method1294(int arg0) {
        class120.field2009 = true;
        if (arg0 != 0) {
            method1294(113);
        }
        field2977++;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(B)V", line = 282)
    public final void method111(byte arg0) {
        field2988++;
        if (arg0 != -57) {
            method1296(true, true, -52, 8, 112, -55, false, 19);
        }
        this.method1293(92);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)I", line = 293)
    public static final int method1295(int arg0, int arg1, int arg2) {
        field2978++;
        if (arg1 > -31) {
            method1292(-66);
        }
        int var3 = class147.method1093(-120, arg0 + 91923, arg2 + 45365, 4) - (-(class147.method1093(-16, arg0 + 37821, arg2 + 10294, 2) - 128 >> 1) - (class147.method1093(-126, arg0, arg2, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZIIIIZI)Lud;", line = 316)
    public static final class269 method1296(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2975++;
        class192 var8 = class132.method990((byte) -119, arg7);
        if (arg2 > 1 && var8.field3095 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg2 >= var8.field3065[var10] && var8.field3065[var10] != 0) {
                    var9 = var8.field3095[var10];
                }
            }
            if (var9 != -1) {
                var8 = class132.method990((byte) -119, var9);
            }
        }
        class267 var11 = var8.method1315(arg3 + 405014085);
        if (var11 == null) {
            return null;
        }
        class83 var12 = null;
        if (var8.field3130 != -1) {
            var12 = (class83) method1296(true, true, 10, -405013968, 1, 0, false, var8.field3089);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3060 != -1) {
            var12 = (class83) method1296(false, true, arg2, -405013968, arg4, arg5, false, var8.field3078);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class175.field2890;
        int[] var14 = class175.field2891;
        int[] var15 = new int[4];
        if (arg3 != -405013968) {
            return (class269) null;
        }
        int var16 = class175.field2892;
        class175.method1240(var15);
        class83 var17 = new class83(36, 32);
        class175.method1254(var17.field1344, 36, 32);
        class283.method1997();
        class283.method1996(16, 16);
        int var18 = var8.field3092;
        if (arg0) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg4 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class283.field4876 = false;
        int var19 = class283.field4877[var8.field3077] * var18 >> 16;
        int var20 = class283.field4870[var8.field3077] * var18 >> 16;
        var11.method1357(0, var8.field3110, var8.field3111, var8.field3077, var8.field3082, var19 - (var11.method176() / 2 - var8.field3073), var8.field3073 + var20);
        if (arg4 >= 1) {
            var17.method573(1);
            if (arg4 >= 2) {
                var17.method573(16777215);
            }
            class175.method1254(var17.field1344, 36, 32);
        }
        if (arg5 != 0) {
            var17.method577(arg5);
        }
        if (var8.field3130 != -1) {
            var12.method291(0, 0);
        } else if (var8.field3060 != -1) {
            class175.method1254(var12.field1344, 36, 32);
            var17.method291(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field3066 == 1 || arg2 != 1) && arg2 != -1) {
            class17.field260.method494(class59.method359(arg2, arg3 + 405013995), 0, 9, 16776960, 1);
        }
        class175.method1254(var14, var13, var16);
        class175.method1237(var15);
        class283.method1997();
        class283.field4876 = true;
        return class281.field4827 && !arg1 ? new class98(var17) : var17;
    }
}
