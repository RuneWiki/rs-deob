import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class21 extends class349 {

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
    private int field187 = 4096;

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
    private int field194 = 0;

    @OriginalMember(owner = "client!tca", name = "H", descriptor = "Ljava/lang/String;")
    public static String field192 = null;

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!tca", name = "E", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!tca", name = "M", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "Lkba;")
    public static class284 field188;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)V", line = 5)
    public static void method115(byte arg0) {
        field188 = null;
        int var1 = 74 % ((74 - arg0) / 42);
        field192 = null;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V", line = 344)
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lpq;IIIZI)V", line = 19)
    public static final void method116(class159 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field190;
        class168.field2093 = arg0;
        class159.field1987 = arg4;
        class333.field4865 = arg1;
        class208.field2732 = arg3;
        if (arg5 != 8956) {
            method120((class255) null, 33, -9, 9, 2, -116);
        }
        class369.field5301 = 1;
        class490.field6609 = 10000;
        class265.field3643 = arg2;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I[B)[B", line = 39)
    public static final byte[] method117(int arg0, byte[] arg1) {
        ++field197;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class657.method3639(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(BI)[I", line = 52)
    public final int[] method13(byte arg0, int arg1) {
        int var3 = 92 % ((arg0 - 56) / 41);
        ++field196;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(0, -1090477337, arg1);
            for (int var6 = 0; ~class39.field497 < ~var6; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field194) {
                    var4[var6] = this.field194;
                } else if (var7 <= this.field187) {
                    var4[var6] = var7;
                } else {
                    var4[var6] = this.field187;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B[ILpea;I[II)Lkfa;", line = 95)
    public static final class200 method118(byte arg0, int[] arg1, class641 arg2, int arg3, int[] arg4, int arg5) {
        ++field191;
        byte[] var6 = new byte[arg3 * arg5];
        int var7 = -92 / ((-93 - arg0) / 33);
        for (int var8 = 0; ~arg5 < ~var8; ++var8) {
            int var9 = arg3 * var8 + arg1[var8];
            for (int var10 = 0; ~var10 > ~arg4[var8]; ++var10) {
                var6[var9++] = -1;
            }
        }
        return new class200(arg2, arg3, arg5, var6);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILdga;)V", line = 124)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            method120((class255) null, 3, -30, -63, -24, 47);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field5100 = ~arg2.method957((byte) -94) == -2;
                }
            } else {
                this.field187 = arg2.method922((byte) -122);
            }
        } else {
            this.field194 = arg2.method922((byte) -120);
        }
        ++field195;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(DB)V", line = 167)
    public static final void method119(double arg0, byte arg1) {
        if (arg1 > 84) {
            ++field189;
            if (class516.field7082 != arg0) {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                    class672.field9528[var3] = var4 <= 255 ? var4 : 255;
                }
                class516.field7082 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lcga;IIIII)V", line = 195)
    public static final void method120(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3524 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class369.field5304[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class123 var13 = class660.field9370[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3524; ++var14) {
                            if (arg0.field3515[var14] == var13.field1591) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3515[arg0.field3524++] = var13.field1591;
                        if (arg0.field3524 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3524; var15 < 4; ++var15) {
            arg0.field3515[var15] = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)[[I", line = 260)
    public final int[][] method9(int arg0, byte arg1) {
        ++field193;
        int var3 = -50 % ((-32 - arg1) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 102, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class39.field497; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 < this.field194) {
                    var9[var12] = this.field194;
                } else if (~var13 < ~this.field187) {
                    var9[var12] = this.field187;
                } else {
                    var9[var12] = var13;
                }
                if (var14 >= this.field194) {
                    if (this.field187 >= var14) {
                        var10[var12] = var14;
                    } else {
                        var10[var12] = this.field187;
                    }
                } else {
                    var10[var12] = this.field194;
                }
                if (~var15 <= ~this.field194) {
                    if (this.field187 >= var15) {
                        var11[var12] = var15;
                    } else {
                        var11[var12] = this.field187;
                    }
                } else {
                    var11[var12] = this.field194;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BJLjava/lang/String;Z)V", line = 348)
    public static final void method121(byte arg0, long arg1, String arg2, boolean arg3) {
        ++field186;
        if (arg3) {
            class367.method2262(false);
            if (class438.field6042.equals("")) {
                class235.field3071 = 39;
                return;
            }
        }
        class138 var5 = new class138(576);
        var5.method951((byte) -82, 10);
        var5.method915((int) (65535.0D * Math.random()), 1502242504);
        var5.method923(arg1, -22205);
        var5.method915(!arg3 ? class625.field8511 : class421.field5873, arg0 ^ 1502242464);
        var5.method905(arg2, arg0 + -221);
        if (arg0 != 104) {
            method119(0.31933063498172404D, (byte) -99);
        }
        var5.method923(arg3 ? class216.field2787 : class636.field8670, -22205);
        if (!arg3) {
            var5.method906(arg0 + -105, (int) (Math.random() * 9.9999999E7D));
            var5.method906(-1, (int) (9.9999999E7D * Math.random()));
            var5.method906(-1, (int) (Math.random() * 9.9999999E7D));
            var5.method906(arg0 + -105, (int) (9.9999999E7D * Math.random()));
        } else {
            var5.method923(class522.method2981(class438.field6042, 28484), arg0 + -22309);
            try {
                var5.method923(Long.parseLong(class487.field6576), -22205);
            } catch (Exception var6) {
                class235.field3071 = 39;
                return;
            }
        }
        var5.method906(-1, (int) (Math.random() * 9.9999999E7D));
        var5.method958(class192.field2492, class20.field185, -109);
        class253.field3491.field1745 = 0;
        class253.field3491.method951((byte) -82, arg3 ? class393.field5641.field4951 : class393.field5638.field4951);
        class253.field3491.method915(var5.field1745 + 28, 1502242504);
        class253.field3491.method915(613, arg0 + 1502242400);
        class253.field3491.method951((byte) -82, class350.field5121);
        class253.field3491.method951((byte) -82, class33.field322.field6547);
        class155.method1033(class253.field3491, 28380);
        class253.field3491.method955(var5.field1745, 0, 29986, var5.field1712);
        class235.field3071 = -3;
        class80.field1018 = 0;
        class335.field4936 = 1;
        class598.field8179 = 0;
    }
}
