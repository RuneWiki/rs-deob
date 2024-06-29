import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class491 extends class739 {

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    private int field7067 = 0;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    private int field7071 = 0;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    private int field7066 = 0;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "Lqp;")
    public static class715 field7069 = new class715(512);

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    private int field7064;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    private int field7068;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    private int field7070;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    private int field7075;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    private int field7076;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    private int field7078;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "[Ls;")
    public static class339[] field7079;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "[[I")
    public static int[][] field7065;

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class491() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZII)V")
    private final void method2986(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field7064 = -75;
        }
        ++field7081;
        int var5 = arg3 > 2048 ? -(arg0 * arg3 >> 12) + arg3 - -arg0 : (arg0 + 4096) * arg3 >> 12;
        if (var5 <= 0) {
            this.field7078 = this.field7064 = this.field7070 = arg3;
        } else {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field7070 = var15;
                                    this.field7064 = var7;
                                    this.field7078 = var5;
                                }
                            } else {
                                this.field7064 = var7;
                                this.field7070 = var5;
                                this.field7078 = var14;
                            }
                        } else {
                            this.field7070 = var5;
                            this.field7064 = var15;
                            this.field7078 = var7;
                        }
                    } else {
                        this.field7064 = var5;
                        this.field7070 = var14;
                        this.field7078 = var7;
                    }
                } else {
                    this.field7064 = var5;
                    this.field7078 = var15;
                    this.field7070 = var7;
                }
            } else {
                this.field7078 = var5;
                this.field7070 = var7;
                this.field7064 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
    public static void method2987(int arg0) {
        if (arg0 == 2) {
            field7079 = null;
            field7065 = null;
            field7069 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIII)V")
    private final void method2988(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -85326548) {
            ++field7063;
            int var5 = arg1 <= arg2 ? arg2 : arg1;
            int var6 = arg0 <= var5 ? var5 : arg0;
            int var7 = arg2 > arg1 ? arg1 : arg2;
            int var8 = ~var7 < ~arg0 ? arg0 : var7;
            int var9 = -var8 + var6;
            this.field7076 = (var6 + var8) / 2;
            if (~this.field7076 < -1 && ~this.field7076 > -4097) {
                this.field7075 = (var9 << 12) / (this.field7076 <= 2048 ? this.field7076 * 2 : -(this.field7076 * 2) + 8192);
            } else {
                this.field7075 = 0;
            }
            if (~var9 < -1) {
                int var10 = (-arg1 + var6 << 12) / var9;
                int var11 = (-arg2 + var6 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (arg1 != var6) {
                    if (arg2 != var6) {
                        this.field7068 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
                    } else {
                        this.field7068 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                    }
                } else {
                    this.field7068 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
                }
                this.field7068 /= 6;
            } else {
                this.field7068 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field7080;
        if (arg1 != 8213) {
            this.field7070 = 11;
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(arg0, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class399.field5703; ++var11) {
                this.method2988(var7[var11], var5[var11], var6[var11], -85326548);
                this.field7076 += this.field7066;
                this.field7075 += this.field7067;
                for (this.field7068 += this.field7071; this.field7068 < 0; this.field7068 += 4096) {
                }
                if (~this.field7075 > -1) {
                    this.field7075 = 0;
                }
                while (this.field7068 > 4096) {
                    this.field7068 -= 4096;
                }
                if (~this.field7075 < -4097) {
                    this.field7075 = 4096;
                }
                if (~this.field7076 > -1) {
                    this.field7076 = 0;
                }
                if (this.field7076 > 4096) {
                    this.field7076 = 4096;
                }
                this.method2986(this.field7075, true, this.field7068, this.field7076);
                var8[var11] = this.field7078;
                var9[var11] = this.field7064;
                var10[var11] = this.field7070;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ldu;B[[B)V")
    public static final void method2989(class418 arg0, byte arg1, byte[][] arg2) {
        ++field7073;
        if (arg1 != 117) {
            field7069 = null;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class479 var11 = new class479(var10);
                int var12 = class284.field3961[var5] >> 8;
                int var13 = 255 & class284.field3961[var5];
                int var14 = var12 * 64 + -class41.field693;
                int var15 = var13 * 64 + -class71.field1085;
                class569.method3387(arg1 + -117);
                arg0.method3044(arg1 ^ 53, class71.field1085, var11, var15, class41.field693, var14, class6.field57);
                arg0.method2548(var3, var14, 0, var15, class211.field3164, var11);
                if (!arg0.field7266 && ~(class401.field5750 / 8) == ~var12 && class109.field1560 / 8 == var13 && var3[0] != -1) {
                    class728.field10226 = class455.field6490.method3314(var3[2], 45, var3[3], var3[0], var3[1], class154.field2237);
                    class740.field10335 = var3[4];
                }
            }
        }
        for (int var6 = 0; ~var6 > ~var4; ++var6) {
            int var7 = (class284.field3961[var6] >> 8) * 64 + -class41.field693;
            int var8 = (255 & class284.field3961[var6]) * 64 + -class71.field1085;
            byte[] var9 = arg2[var6];
            if (var9 == null && ~class109.field1560 > -801) {
                class569.method3387(0);
                arg0.method3048(64, 0, var7, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLgt;)I")
    public static final int method2990(boolean arg0, class571 arg1) {
        if (arg0) {
            field7079 = null;
        }
        ++field7072;
        class521 var2 = arg1.field8235;
        if (var2.field7535 != null) {
            var2 = var2.method3166(class226.field3372, true);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field7578;
        class83 var4 = arg1.method2052(-5569);
        if (~arg1.field4575 != 0 && !arg1.field4595) {
            if (arg1.field4575 != var4.field1228 && ~arg1.field4575 != ~var4.field1235 && ~arg1.field4575 != ~var4.field1227 && ~arg1.field4575 != ~var4.field1222) {
                if (arg1.field4575 == var4.field1206 || arg1.field4575 == var4.field1205 || arg1.field4575 == var4.field1223 || ~arg1.field4575 == ~var4.field1226) {
                    var3 = var2.field7526;
                }
            } else {
                var3 = var2.field7579;
            }
        } else {
            var3 = var2.field7557;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILaj;)I")
    public static final int method2991(int arg0, class194 arg1) {
        ++field7074;
        if (arg0 != 10366) {
            method2990(false, (class571) null);
        }
        String var2 = class228.method1588(arg1, -114);
        return class119.field1635.method3066(class637.field9005, var2, (byte) 81);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field7077;
        if (arg2 != 1) {
            field7079 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field7066 = (arg0.method2915(-126) << 12) / 100;
                }
            } else {
                this.field7067 = (arg0.method2915(-105) << 12) / 100;
            }
        } else {
            this.field7071 = arg0.method2870(-11395);
        }
    }
}
