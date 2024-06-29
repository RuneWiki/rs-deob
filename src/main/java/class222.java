import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class222 extends class154 {

    @OriginalMember(owner = "client!su", name = "N", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!su", name = "J", descriptor = "I")
    public static int field3422 = -1;

    @OriginalMember(owner = "client!su", name = "F", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!su", name = "G", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!su", name = "H", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!su", name = "I", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "([ILav;[I[II)V")
    public static final void method1513(int[] arg0, class665 arg1, int[] arg2, int[] arg3, int arg4) {
        for (int var5 = arg4; ~arg0.length < ~var5; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (~var7 != -1 && var9 < arg1.field4608.length) {
                if (~(var7 & 1) != -1) {
                    if (~var6 == 0) {
                        arg1.field4608[var9] = null;
                    } else {
                        class607 var10 = class563.field7993.method651(var6, (byte) 119);
                        int var11 = var10.field8501;
                        class220 var12 = arg1.field4608[var9];
                        if (var12 != null) {
                            if (~var12.field3412 == ~var6) {
                                if (var11 != 0) {
                                    if (~var11 != -2) {
                                        if (var11 == 2) {
                                            var12.field3407 = 0;
                                        }
                                    } else {
                                        var12.field3411 = 0;
                                        var12.field3415 = 1;
                                        var12.field3408 = 0;
                                        var12.field3410 = var8;
                                        var12.field3407 = 0;
                                        if (!arg1.field4577) {
                                            class760.method4227(255, arg1, var10, 0);
                                        }
                                    }
                                } else {
                                    var12 = arg1.field4608[var9] = null;
                                }
                            } else if (var10.field8514 >= class563.field7993.method651(var12.field3412, (byte) 126).field8514) {
                                var12 = arg1.field4608[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class220 var13 = arg1.field4608[var9] = new class220();
                            var13.field3415 = 1;
                            var13.field3407 = 0;
                            var13.field3412 = var6;
                            var13.field3408 = 0;
                            var13.field3411 = 0;
                            var13.field3410 = var8;
                            if (!arg1.field4577) {
                                class760.method4227(255, arg1, var10, 0);
                            }
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        ++field3419;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIF)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILkv;ILha;I)V")
    public static final void method1514(int arg0, int arg1, class282 arg2, int arg3, class65 arg4, int arg5) {
        ++field3418;
        class784 var6 = class618.field8642.method4326(34, arg2.field4108);
        if (arg3 != 65280) {
            field3426 = -50;
        }
        if (var6.field10763 != -1) {
            int var8;
            if (arg2.field4187) {
                int var7 = arg2.field4138 + arg5;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class241 var9 = var6.method4298((byte) -64, arg2.field4101, var8, arg4);
            if (var9 != null) {
                int var10 = arg2.field4188;
                int var11 = arg2.field4125;
                if (~(var8 & 1) == -2) {
                    var11 = arg2.field4188;
                    var10 = arg2.field4125;
                }
                int var12 = var9.method1507();
                int var13 = var9.method1505();
                if (var6.field10765) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (var6.field10762 != 0) {
                    var9.method1603(arg0, -((var11 + -1) * 4) + arg1, var12, var13, 0, var6.field10762 | -16777216, 1);
                } else {
                    var9.method1607(arg0, -(var11 * 4) + arg1 + 4, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIB)V")
    public final void method1053(int arg0, int arg1, int arg2, byte arg3) {
        super.field2191 = arg1;
        super.field2181 = arg0;
        ++field3421;
        super.field2175 = arg2;
        if (arg3 != 122) {
            method1515((class413) null, -84);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lbr;I)Z")
    public static final boolean method1515(class413 arg0, int arg1) {
        ++field3424;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5658) {
            return false;
        } else if (!arg0.method2504((byte) 30, class117.field1789)) {
            return false;
        } else if (arg1 != 21961) {
            return false;
        } else if (class561.field7977.method2242((long) arg0.field5622, -1) != null) {
            return false;
        } else {
            return class173.field2687.method2242((long) arg0.field5656, -1) == null;
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(II)V")
    public static final void method1516(int arg0, int arg1) {
        ++field3420;
        class437.field5904 = 1000000000L / (long) arg0;
        int var2 = -28 / ((arg1 - 40) / 52);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(III)I")
    public static final int method1517(int arg0, int arg1, int arg2) {
        ++field3423;
        int var3 = arg0 >>> 24;
        int var4 = -var3 + 255;
        int var5 = ((arg2 & arg0) * var3 & 16711680 | (16711935 & arg0) * var3 & -16711936) >>> 8;
        return (((65280 & arg1) * var4 & 16711680 | -16711936 & (16711935 & arg1) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(FI)V")
    public final void method1061(float arg0, int arg1) {
        super.field2174 = arg0;
        if (arg1 >= 13) {
            ++field3425;
        }
    }
}
