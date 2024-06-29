import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class757 extends class518 {

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field10825 = new String[] { method5493(method5492("\u0016E'\u0018")), method5493(method5492("\u0003\u001eeZk")), method5493(method5492("\bX*ZUP")), method5493(method5492("\bX*ZTP")), method5493(method5492("\bX*ZSP")), method5493(method5492("\bX*ZWP")), method5493(method5492("\bX*ZQP")), method5493(method5492("\bX*ZRP")) };

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "Lsk;")
    public static class649 field10819 = new class649(0, 0);

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
    public static int field10817;

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
    public static int field10820;

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "I")
    public static int field10821;

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
    public static int field10824;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "[Lgha;")
    private class160[] field10822;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field10818;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 29 / ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                this.method5490(super.field7564.method4459((byte) -91), true);
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10825[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBII)V", line = 27)
    public static final void method5489(int arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field10824;
            int var4 = arg3 - -class537.field7895;
            int var5 = class655.field9286 + arg0;
            if (class608.field8715 != null && arg3 >= 0 && ~arg0 <= -1 && ~arg3 > ~class625.field8929 && ~class14.field187 < ~arg0) {
                if (class451.field6612.field9089.method5427(3) != 0 || ~class203.field2988.field2981 == ~arg2) {
                    long var6 = (long) (arg2 << 28 | var5 << 14 | var4);
                    class413 var8 = (class413) class414.field5965.method3693(false, var6);
                    if (arg1 >= -24) {
                        field10823 = -80;
                    }
                    if (var8 == null) {
                        class563.method4214(arg2, arg3, arg0);
                    } else {
                        class197 var9 = (class197) var8.field5934.method3977((byte) -97);
                        if (var9 == null) {
                            class563.method4214(arg2, arg3, arg0);
                        } else {
                            class716 var10 = (class716) class563.method4214(arg2, arg3, arg0);
                            if (var10 != null) {
                                var10.field10207 = var10.field10201 = -1;
                            } else {
                                var10 = new class716(arg3 << 9, class107.field1413[arg2].method5442(arg3, arg0, 31844), arg0 << 9, arg2, arg2);
                            }
                            var10.field10195 = var9.field2925;
                            var10.field10187 = var9.field2926;
                            label73: while (true) {
                                class197 var11 = (class197) var8.field5934.method3987(0);
                                if (var11 == null) {
                                    break;
                                }
                                if (~var10.field10187 != ~var11.field2926) {
                                    var10.field10207 = var11.field2926;
                                    var10.field10204 = var11.field2925;
                                    while (true) {
                                        class197 var12 = (class197) var8.field5934.method3987(0);
                                        if (var12 == null) {
                                            break label73;
                                        }
                                        if (~var10.field10187 != ~var12.field2926 && var10.field10207 != var12.field2926) {
                                            var10.field10186 = var12.field2925;
                                            var10.field10201 = var12.field2926;
                                        }
                                    }
                                }
                            }
                            int var13 = class100.method977(-1, (arg0 << 9) + 256, arg2, (arg3 << 9) + 256);
                            var10.field10199 = 0;
                            var10.field2969 = arg3 << 9;
                            var10.field2981 = (byte) arg2;
                            var10.field2971 = (byte) arg2;
                            var10.field2975 = var13;
                            var10.field2984 = arg0 << 9;
                            if (class23.method275(1, arg3, arg0)) {
                                ++var10.field2971;
                            }
                            class179.method1492(arg2, arg3, arg0, var13, var10);
                        }
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field10825[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "([[IZ)V", line = 125)
    private final void method5490(int[][] arg0, boolean arg1) {
        try {
            if (arg1) {
                ++field10820;
                int var3 = class110.field1436;
                int var4 = class606.field8689;
                class419.method3266(arg0, -46);
                class291.method2359(class478.field7048, 4, class247.field3543, 0, 0);
                if (this.field10822 != null) {
                    for (int var5 = 0; ~var5 > ~this.field10822.length; ++var5) {
                        class160 var6 = this.field10822[var5];
                        int var7 = var6.field2050;
                        int var8 = var6.field2049;
                        if (~var7 > -1) {
                            if (var8 >= 0) {
                                var6.method1349(3289650, var3, var4);
                            }
                        } else if (var8 < 0) {
                            var6.method1350(var3, 5781, var4);
                        } else {
                            var6.method1348(var3, var4, (byte) 37);
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10825[7] + (arg0 != null ? field10825[1] : field10825[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V", line = 178)
    public class757() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "(B)V", line = 181)
    public static void method5491(byte arg0) {
        try {
            field10819 = null;
            if (arg0 > -56) {
                method5491((byte) -28);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10825[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILjc;I)V", line = 197)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (~arg0 == -1) {
                this.field10822 = new class160[arg1.method5128(0)];
                for (int var4 = 0; this.field10822.length > var4; ++var4) {
                    int var5 = arg1.method5128(0);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field10822[var4] = class369.method2925(arg1, (byte) -125);
                                }
                            } else {
                                this.field10822[var4] = class626.method4594(0, arg1);
                            }
                        } else {
                            this.field10822[var4] = class104.method997((byte) 116, arg1);
                        }
                    } else {
                        this.field10822[var4] = class776.method5586(arg1, -111);
                    }
                }
            } else if (arg0 == 1) {
                super.field7565 = ~arg1.method5128(0) == -2;
            }
            if (arg2 != -3) {
                field10819 = null;
            }
            ++field10817;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10825[2] + arg0 + ',' + (arg1 != null ? field10825[1] : field10825[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)[[I", line = 271)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field10821;
            int[][] var3 = super.field7575.method1955(arg1, arg0 + -2);
            if (arg0 != 0) {
                field10819 = null;
            }
            if (super.field7575.field3416) {
                int var4 = class110.field1436;
                int var5 = class606.field8689;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field7575.method1952(true);
                this.method5490(var6, true);
                for (int var8 = 0; var8 < class606.field8689; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class110.field1436 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class434.method3377(var15 << 4, 4080);
                        var12[var14] = class434.method3377(var15, 65280) >> 4;
                        var11[var14] = class434.method3377(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field10825[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5492(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5493(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
