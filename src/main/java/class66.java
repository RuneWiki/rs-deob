import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class66 extends class739 {

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "I")
    private int field1023 = -1;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "Lqk;")
    public static class146 field1022 = null;

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!vha", name = "D", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!vha", name = "E", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!vha", name = "F", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!vha", name = "G", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!vha", name = "H", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!vha", name = "I", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!vha", name = "K", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "[I")
    public int[] field1021;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(Z)V", line = 3)
    public final void method586(boolean arg0) {
        ++field1027;
        super.method586(arg0);
        this.field1021 = null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)I", line = 13)
    public final int method587(byte arg0) {
        int var2 = -53 / ((-33 - arg0) / 52);
        ++field1024;
        return this.field1023;
    }

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "(Z)Z", line = 28)
    public final boolean method588(boolean arg0) {
        ++field1031;
        if (arg0) {
            this.method586(false);
        }
        if (this.field1021 != null) {
            return true;
        } else if (~this.field1023 <= -1) {
            class676 var2 = class645.field9290 >= 0 ? class676.method3850(class625.field8883, class645.field9290, this.field1023) : class676.method3841(class625.field8883, this.field1023);
            var2.method3840();
            this.field1021 = var2.method3839();
            this.field1025 = var2.field9614;
            this.field1026 = var2.field9618;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIB)V", line = 59)
    public static final void method589(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= -109) {
            ++field1029;
            for (class654 var5 = (class654) class451.field6446.method3565(102); var5 != null; var5 = (class654) class451.field6446.method3561((byte) 98)) {
                class264.method1744(arg2, (byte) 124, arg0, arg1, arg3, var5);
            }
            for (class654 var6 = (class654) class337.field4661.method3565(-22); var6 != null; var6 = (class654) class337.field4661.method3561((byte) 32)) {
                byte var12 = 1;
                class83 var13 = var6.field9383.method2052(-5569);
                if (var6.field9383.field4575 != -1 && !var6.field9383.field4595) {
                    if (~var6.field9383.field4575 != ~var13.field1228 && var6.field9383.field4575 != var13.field1235 && ~var6.field9383.field4575 != ~var13.field1227 && var6.field9383.field4575 != var13.field1222) {
                        if (~var6.field9383.field4575 == ~var13.field1206 || ~var6.field9383.field4575 == ~var13.field1205 || var6.field9383.field4575 == var13.field1223 || ~var6.field9383.field4575 == ~var13.field1226) {
                            var12 = 3;
                        }
                    } else {
                        var12 = 2;
                    }
                } else {
                    var12 = 0;
                }
                if (var6.field9374 != var12) {
                    int var14 = class491.method2990(false, var6.field9383);
                    class521 var15 = var6.field9383.field8235;
                    if (var15.field7535 != null) {
                        var15 = var15.method3166(class226.field3372, true);
                    }
                    if (var15 != null && var14 != -1) {
                        if (~var6.field9354 == ~var14 && !var6.field9355 == !var15.field7528) {
                            var6.field9374 = var12;
                            var6.field9373 = var15.field7537;
                        } else {
                            boolean var16 = false;
                            if (var6.field9375 == null) {
                                var16 = true;
                            } else {
                                var6.field9373 -= 512;
                                if (var6.field9373 <= 0) {
                                    class593.field8429.method3652(var6.field9375);
                                    var6.field9375 = null;
                                    var16 = true;
                                }
                            }
                            if (var16) {
                                var6.field9373 = var15.field7537;
                                var6.field9355 = var15.field7528;
                                var6.field9381 = null;
                                var6.field9354 = var14;
                                var6.field9363 = null;
                                var6.field9374 = var12;
                            }
                        }
                    } else {
                        var6.field9355 = false;
                        var6.field9354 = -1;
                        var6.field9374 = var12;
                    }
                }
                var6.field9379 = var6.field9383.field3923;
                var6.field9362 = var6.field9383.field3923 - -(var6.field9383.method2053(true) << 8);
                var6.field9359 = var6.field9383.field3916;
                var6.field9368 = var6.field9383.field3916 + (var6.field9383.method2053(true) << 8);
                class264.method1744(arg2, (byte) 124, arg0, arg1, arg3, var6);
            }
            for (class654 var7 = (class654) class675.field9602.method4023((byte) -55); var7 != null; var7 = (class654) class675.field9602.method4021((byte) 80)) {
                byte var8 = 1;
                class83 var9 = var7.field9366.method2052(-5569);
                if (~var7.field9366.field4575 != 0 && !var7.field9366.field4595) {
                    if (~var7.field9366.field4575 != ~var9.field1228 && var7.field9366.field4575 != var9.field1235 && var7.field9366.field4575 != var9.field1227 && ~var7.field9366.field4575 != ~var9.field1222) {
                        if (var7.field9366.field4575 == var9.field1206 || ~var7.field9366.field4575 == ~var9.field1205 || var7.field9366.field4575 == var9.field1223 || ~var7.field9366.field4575 == ~var9.field1226) {
                            var8 = 3;
                        }
                    } else {
                        var8 = 2;
                    }
                } else {
                    var8 = 0;
                }
                if (var7.field9374 != var8) {
                    int var10 = class240.method1658(30200, var7.field9366);
                    if (~var7.field9354 == ~var10 && var7.field9366.field9091 == var7.field9355) {
                        var7.field9374 = var8;
                        var7.field9373 = var7.field9366.field9092;
                    } else {
                        boolean var11 = false;
                        if (var7.field9375 == null) {
                            var11 = true;
                        } else {
                            var7.field9373 -= 512;
                            if (~var7.field9373 >= -1) {
                                class593.field8429.method3652(var7.field9375);
                                var11 = true;
                                var7.field9375 = null;
                            }
                        }
                        if (var11) {
                            var7.field9373 = var7.field9366.field9092;
                            var7.field9374 = var8;
                            var7.field9381 = null;
                            var7.field9355 = var7.field9366.field9091;
                            var7.field9354 = var10;
                            var7.field9363 = null;
                        }
                    }
                }
                var7.field9379 = var7.field9366.field3923;
                var7.field9362 = var7.field9366.field3923 - -(var7.field9366.method2053(true) << 8);
                var7.field9359 = var7.field9366.field3916;
                var7.field9368 = var7.field9366.field3916 - -(var7.field9366.method2053(true) << 8);
                class264.method1744(arg2, (byte) 124, arg0, arg1, arg3, var7);
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lsl;IB)V", line = 234)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 == 1) {
            if (arg1 == 0) {
                this.field1023 = arg0.method2882(-1);
            }
            ++field1030;
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(II)[[I", line = 249)
    public int[][] method113(int arg0, int arg1) {
        ++field1028;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (arg1 != 8213) {
            return null;
        } else {
            if (super.field10328.field4727 && this.method588(false)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field1025 * (class505.field7350 != this.field1026 ? this.field1026 * arg0 / class505.field7350 : arg0);
                if (class399.field5703 == this.field1025) {
                    for (int var8 = 0; var8 < class399.field5703; ++var8) {
                        int var9 = this.field1021[var7++];
                        var6[var8] = class368.method2314(var9 << 4, 4080);
                        var5[var8] = class368.method2314(var9, 65280) >> 4;
                        var4[var8] = class368.method2314(4080, var9 >> 12);
                    }
                } else {
                    for (int var10 = 0; var10 < class399.field5703; ++var10) {
                        int var11 = this.field1025 * var10 / class399.field5703;
                        int var12 = this.field1021[var7 + var11];
                        var6[var10] = class368.method2314(var12 << 4, 4080);
                        var5[var10] = class368.method2314(var12, 65280) >> 4;
                        var4[var10] = class368.method2314(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V", line = 318)
    public static void method590(int arg0) {
        if (arg0 >= -35) {
            method589(31, 53, 9, 46, (byte) 31);
        }
        field1022 = null;
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "()V", line = 328)
    public class66() {
        super(0, false);
    }
}
