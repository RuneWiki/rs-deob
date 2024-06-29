import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class720 extends class747 {

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    private int field10017 = 4096;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "Lkr;")
    public static class602 field10019 = new class602(114, 2);

    @OriginalMember(owner = "client!qp", name = "R", descriptor = "Z")
    public static boolean field10024 = false;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!qp", name = "T", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "Lis;")
    public static class333 field10021;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILha;Ljo;IILto;)Z", line = 3)
    public static final boolean method4032(int arg0, class548 arg1, class21 arg2, int arg3, int arg4, class717 arg5) {
        ++field10016;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field222 != null) {
            var6 = (class461.field6410 - class461.field6416) * (-class461.field6418 + arg5.field9989 + arg2.field239) / (-class461.field6418 + class461.field6403) + class461.field6416;
            var9 = -((arg2.field238 + arg5.field9985 + -class461.field6398) * (-class461.field6417 + class461.field6399) / (-class461.field6398 + class461.field6411)) + class461.field6399;
            var7 = class461.field6416 - -((arg2.field234 + arg5.field9989 + -class461.field6418) * (-class461.field6416 + class461.field6410) / (-class461.field6418 + class461.field6403));
            var8 = -((arg2.field251 + arg5.field9985 + -class461.field6398) * (-class461.field6417 + class461.field6399) / (-class461.field6398 + class461.field6411)) + class461.field6399;
        }
        class298 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field244 != -1) {
            if (arg5.field9991 && arg2.field212 != -1) {
                var10 = arg2.method110(-63, arg1, true);
            } else {
                var10 = arg2.method110(arg3 + -22, arg1, false);
            }
            if (var10 != null) {
                var11 = arg5.field9987 + -(1 + var10.method1963() >> 1);
                var12 = arg5.field9987 + (1 + var10.method1963() >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg5.field9988 - (var10.method1961() - -1 >> 1);
                var14 = arg5.field9988 - -(1 + var10.method1961() >> 1);
                if (~var8 < ~var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class203 var15 = null;
        int var16 = arg3;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg2.field210 != null) {
            var15 = class757.method4204(7946, arg2.field233);
            if (var15 != null) {
                var16 = class488.field6818.method1129((byte) 81, arg2.field210, class622.field8319, (class298[]) null, (int[]) null);
                var17 = arg5.field9987 - -((-class461.field6416 + class461.field6410) * arg2.field243 / (-class461.field6418 + class461.field6403));
                int var24 = -((-class461.field6417 + class461.field6399) * arg2.field247 / (class461.field6411 - class461.field6398)) + arg5.field9988;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method1234() / 2;
                } else {
                    var18 = var24 - ((var10.method1961() >> 1) - -(var15.method1233() * var16));
                }
                for (int var25 = 0; ~var16 < ~var25; ++var25) {
                    String var26 = class622.field8319[var25];
                    if (~var25 > ~(var16 + -1)) {
                        var26 = var26.substring(0, var26.length() + -4);
                    }
                    int var27 = var15.method1235(var26);
                    if (~var27 < ~var19) {
                        var19 = var27;
                    }
                }
                var20 = -(var19 / 2) + var17 + arg4;
                var21 = var19 / 2 + arg4 + var17;
                if (var20 < var6) {
                    var6 = var20;
                }
                var22 = arg0 + var18;
                if (~var21 < ~var7) {
                    var7 = var21;
                }
                var23 = arg0 + var16 * var15.method1233() + var18;
                if (~var8 < ~var22) {
                    var8 = var22;
                }
                if (~var23 < ~var9) {
                    var9 = var23;
                }
            }
        }
        if (~var7 <= ~class461.field6416 && var6 <= class461.field6410 && class461.field6417 <= var9 && var8 <= class461.field6399) {
            class461.method2806(arg1, arg5, arg2);
            if (var10 != null) {
                if (~class224.field3017 < -1 && (class505.field7031 != -1 && class505.field7031 == arg5.field9990 || ~class293.field4201 != 0 && ~class293.field4201 == ~arg2.field235)) {
                    int var28;
                    if (~class659.field8770 >= -51) {
                        var28 = class659.field8770 * 2;
                    } else {
                        var28 = -(class659.field8770 * 2) + 200;
                    }
                    int var29 = var28 << 24 | 16776960;
                    arg1.method3252(var10.method1955() / 2 - -7, arg5.field9988, -21650, arg5.field9987, var29);
                    arg1.method3252(5 + var10.method1955() / 2, arg5.field9988, -21650, arg5.field9987, var29);
                    arg1.method3252(var10.method1955() / 2 + 3, arg5.field9988, arg3 ^ -21650, arg5.field9987, var29);
                    arg1.method3252(var10.method1955() / 2 - -1, arg5.field9988, -21650, arg5.field9987, var29);
                    arg1.method3252(var10.method1955() / 2, arg5.field9988, arg3 + -21650, arg5.field9987, var29);
                }
                var10.method1970(arg5.field9987 - (var10.method1963() >> 1), arg5.field9988 - (var10.method1961() >> 1));
            }
            if (arg2.field210 != null && var15 != null) {
                class442.method2708((byte) 126, var16, arg1, var19, arg2, var17, arg5, var15, var18);
            }
            if (arg2.field244 != -1 || arg2.field210 != null) {
                class726 var30 = new class726(arg5);
                var30.field10058 = var12;
                var30.field10077 = var14;
                var30.field10060 = var11;
                var30.field10068 = var22;
                var30.field10071 = var23;
                var30.field10063 = var21;
                var30.field10066 = var20;
                var30.field10067 = var13;
                class226.field3034.method3610(9289, var30);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIILuu;IZ)V", line = 185)
    public static final void method4033(boolean arg0, int arg1, int arg2, class237 arg3, int arg4, boolean arg5) {
        if (arg0) {
            method4034(52, 71, 55);
        }
        ++field10012;
        class67.method537(arg2, arg4, arg1, -14041, arg3, arg5, 0L);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z", line = 196)
    public static final boolean method4034(int arg0, int arg1, int arg2) {
        ++field10018;
        if (arg2 <= 66) {
            return false;
        } else {
            return (arg0 & 2048) != 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lcea;Z)I", line = 207)
    public static final int method4035(class96 arg0, boolean arg1) {
        if (arg1) {
            method4032(19, (class548) null, (class21) null, -52, -78, (class717) null);
        }
        ++field10020;
        int var2 = arg0.field1350;
        class32 var3 = arg0.method3084((byte) -92);
        if (arg0.field7159 != -1 && !arg0.field7165) {
            if (arg0.field7159 != var3.field420 && arg0.field7159 != var3.field379 && arg0.field7159 != var3.field398 && arg0.field7159 != var3.field414) {
                if (arg0.field7159 == var3.field407 || arg0.field7159 == var3.field415 || ~arg0.field7159 == ~var3.field418 || arg0.field7159 == var3.field421) {
                    var2 = arg0.field1360;
                }
            } else {
                var2 = arg0.field1316;
            }
        } else {
            var2 = arg0.field1363;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ldc;II)V", line = 239)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            method4035((class96) null, true);
        }
        if (arg2 == 0) {
            this.field10017 = arg0.method482(arg1 + -772603280);
        }
        ++field10014;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)Z", line = 254)
    public static final boolean method4036(int arg0, byte arg1, int arg2) {
        if (arg1 < 61) {
            method4032(-17, (class548) null, (class21) null, -55, -73, (class717) null);
        }
        ++field10013;
        return ~(arg0 & 50560) != -1;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)V", line = 265)
    public static void method4037(byte arg0) {
        field10021 = null;
        field10019 = null;
        if (arg0 > -50) {
            method4032(2, (class548) null, (class21) null, -111, 123, (class717) null);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I", line = 277)
    public final int[] method182(int arg0, int arg1) {
        ++field10015;
        if (arg1 >= -89) {
            method4037((byte) 22);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(124, arg0 - 1 & class415.field5878, 0);
            int[] var5 = this.method4156(87, arg0, 0);
            int[] var6 = this.method4156(36, class415.field5878 & arg0 - -1, 0);
            for (int var7 = 0; var7 < class73.field1095; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field10017;
                int var9 = (var5[class73.field1097 & var7 + 1] + -var5[class73.field1097 & var7 + -1]) * this.field10017;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 330)
    public class720() {
        super(1, true);
    }
}
