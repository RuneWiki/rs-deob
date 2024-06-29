import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class205 extends class102 {

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    private int field3831 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "[S")
    private short[] field3826 = new short[257];

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "Lqe;")
    public static class179 field3836 = class206.method1380("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", (byte) -127);

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3821 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "[I")
    public static int[] field3837 = new int[128];

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "Ldc;")
    public static class36 field3838 = new class36();

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lqe;")
    private static class179 field3841 = class206.method1380("Starting 3d library", (byte) 63);

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lqe;")
    public static class179 field3840 = field3841;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "[I")
    private int[] field3827;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "[I")
    private int[] field3834;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "[[I")
    private int[][] field3825;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field3831 = arg0.method1243(3);
            this.field3825 = new int[arg0.method1243(3)][2];
            for (int var4 = 0; ~var4 > ~this.field3825.length; ++var4) {
                this.field3825[var4][0] = arg0.method1252(2);
                this.field3825[var4][1] = arg0.method1252(2);
            }
        }
        ++field3824;
        if (arg2) {
            this.field3827 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field3830;
        if (this.field3825 == null) {
            this.field3825 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field3825.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3831 == 2) {
                this.method1374(105);
            }
            class56.method390(-1);
            this.method1372(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
    public static final void method1368(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class229 var5 = (class229) class216.field4000.method242(16711680); var5 != null; var5 = (class229) class216.field4000.method237(10)) {
            if (var5.field4242 != -1 || var5.field4245 != null) {
                int var6 = 0;
                if (arg3 <= var5.field4227) {
                    if (var5.field4237 > arg3) {
                        var6 += -arg3 + var5.field4237;
                    }
                } else {
                    var6 += arg3 - var5.field4227;
                }
                if (arg4 > var5.field4235) {
                    var6 += arg4 - var5.field4235;
                } else if (arg4 < var5.field4231) {
                    var6 += -arg4 + var5.field4231;
                }
                if (~var5.field4240 <= ~(var6 + -64) && class102.field1963 != 0 && ~var5.field4225 == ~arg0) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + var5.field4240) * class102.field1963 / var5.field4240;
                    if (var5.field4244 != null) {
                        var5.field4244.method528(var7);
                    } else if (~var5.field4242 <= -1) {
                        class200 var8 = class200.method1331(class157.field2850, var5.field4242, 0);
                        if (var8 != null) {
                            class24 var9 = var8.method1329().method162(class15.field373);
                            class83 var10 = class83.method537(var9, 100, var7);
                            var10.method552(-1);
                            class38.field824.method1195(var10);
                            var5.field4244 = var10;
                        }
                    }
                    if (var5.field4223 != null) {
                        var5.field4223.method528(var7);
                        if (!var5.field4223.method589(-1)) {
                            var5.field4223 = null;
                        }
                    } else if (var5.field4245 != null && (var5.field4241 -= arg1) <= 0) {
                        int var11 = (int) ((double) var5.field4245.length * Math.random());
                        class200 var12 = class200.method1331(class157.field2850, var5.field4245[var11], 0);
                        if (var12 != null) {
                            class24 var13 = var12.method1329().method162(class15.field373);
                            class83 var14 = class83.method537(var13, 100, var7);
                            var14.method552(0);
                            class38.field824.method1195(var14);
                            var5.field4241 = var5.field4224 + (int) (Math.random() * (double) (-var5.field4224 + var5.field4233));
                            var5.field4223 = var14;
                        }
                    }
                } else {
                    if (var5.field4244 != null) {
                        class38.field824.method1199(var5.field4244);
                        var5.field4244 = null;
                    }
                    if (var5.field4223 != null) {
                        class38.field824.method1199(var5.field4223);
                        var5.field4223 = null;
                    }
                }
            }
        }
        ++field3833;
        if (arg2 != -49) {
            field3836 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (!arg0) {
            this.field3826 = null;
        }
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            for (int var5 = 0; var5 < class155.field2796; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3826[var6];
            }
        }
        ++field3823;
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
    private final int[] method1369(int arg0, byte arg1) {
        ++field3818;
        if (arg0 < 0) {
            return this.field3834;
        } else if (arg0 >= this.field3825.length) {
            return this.field3827;
        } else {
            return arg1 != -107 ? null : this.field3825[arg0];
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILb;[BI)V")
    public static final void method1370(int arg0, class12 arg1, byte[] arg2, int arg3) {
        class127 var4 = new class127();
        var4.field2316 = 0;
        var4.field1694 = (long) arg0;
        int var5 = -94 / ((arg3 - -21) / 41);
        ++field3829;
        var4.field2317 = arg2;
        var4.field2325 = arg1;
        class36 var6 = class111.field2090;
        synchronized (class111.field2090) {
            class111.field2090.method235(-118, var4);
        }
        class3.method22(-128);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILmd;II)V")
    public static final void method1371(int arg0, int arg1, int arg2, class134 arg3, int arg4, int arg5) {
        ++field3832;
        class229 var6 = new class229();
        var6.field4245 = arg3.field2447;
        if (arg0 != 831485932) {
            method1370(-97, (class12) null, (byte[]) null, 48);
        }
        var6.field4242 = arg3.field2483;
        int var7 = arg3.field2442;
        var6.field4231 = arg1 * 128;
        var6.field4224 = arg3.field2457;
        var6.field4233 = arg3.field2427;
        var6.field4237 = arg4 * 128;
        var6.field4225 = arg5;
        var6.field4240 = arg3.field2469 * 128;
        int var8 = arg3.field2430;
        if (~arg2 == -2 || arg2 == 3) {
            var7 = arg3.field2430;
            var8 = arg3.field2442;
        }
        var6.field4227 = (arg4 + var7) * 128;
        var6.field4235 = (arg1 - -var8) * 128;
        if (arg3.field2479 != null) {
            var6.field4228 = arg3;
            var6.method1508(arg0 + -831499999);
        }
        class216.field4000.method235(arg0 ^ -831485864, var6);
        if (var6.field4245 != null) {
            var6.field4241 = var6.field4224 + (int) ((double) (-var6.field4224 + var6.field4233) * Math.random());
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    private final void method1372(int arg0) {
        ++field3828;
        int var2 = this.field3831;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3825.length + -1) && ~var4 <= ~this.field3825[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3825[var5 - 1];
                    int[] var7 = this.field3825[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class229.field4243[(8181 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3826[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field3825.length - 1 && ~var13 <= ~this.field3825[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3825[var14 + -1];
                    int[] var16 = this.field3825[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3826[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field3825.length + -1) && ~var21 <= ~this.field3825[var22][0]; ++var22) {
                }
                int[] var23 = this.field3825[var22 - 1];
                int[] var24 = this.field3825[var22];
                int var25 = this.method1369(var22 - 2, (byte) -107)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1369(var22 + 1, (byte) -107)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - (var27 - -var25) - -var26;
                int var32 = -var31 + var25 - var26;
                int var34 = (var29 * var31 >> 12) * var30 >> 12;
                int var35 = -var25 + var27;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var35 >> 12;
                int var38 = var36 + var37 + var26 + var34;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3826[var20] = (short) var38;
            }
        }
        if (arg0 != 0) {
            this.method1374(-101);
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3838 = null;
        field3841 = null;
        field3837 = null;
        field3821 = null;
        int var1 = -72 % ((arg0 - -42) / 48);
        field3836 = null;
        field3840 = null;
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    private final void method1374(int arg0) {
        ++field3835;
        int[] var2 = this.field3825[0];
        int[] var3 = this.field3825[1];
        if (arg0 != 105) {
            method1371(33, -118, -110, (class134) null, 105, 14);
        }
        int[] var4 = this.field3825[this.field3825.length + -2];
        int[] var5 = this.field3825[this.field3825.length + -1];
        this.field3834 = new int[] { var2[0] + -var3[0] + var2[0], -var3[1] - (-var2[1] - var2[1]) };
        this.field3827 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILae;)Lae;")
    public static final class6 method1375(int arg0, class6 arg1) {
        if (arg0 != 27875) {
            field3837 = null;
        }
        ++field3819;
        class6 var2 = class100.method640(255, arg1);
        if (var2 == null) {
            var2 = arg1.field109;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)Z")
    public static final boolean method1376(byte arg0) {
        ++field3820;
        long var1 = class80.method504(-1);
        int var3 = (int) (-class190.field3538 + var1);
        if (arg0 >= -110) {
            method1373(-19);
        }
        class190.field3538 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class202.field3739 += var3;
        if (class91.field1738 == 0 && ~class80.field1543 == -1 && class191.field3569 == 0 && ~class47.field1022 == -1) {
            return true;
        } else if (class87.field1663 == null) {
            return false;
        } else {
            try {
                if (~class202.field3739 < -30001) {
                    throw new IOException();
                } else {
                    while (class80.field1543 < 20 && ~class47.field1022 < -1) {
                        class116 var4 = (class116) class105.field1977.method913(0);
                        class185 var5 = new class185(4);
                        var5.method1230((byte) -126, 1);
                        var5.method1214(1200707720, (int) var4.field1694);
                        class87.field1663.method307(-33, 0, var5.field3397, 4);
                        class194.field3603.method914(var4.field1694, var4, true);
                        --class47.field1022;
                        ++class80.field1543;
                    }
                    while (~class91.field1738 > -21 && class191.field3569 > 0) {
                        class116 var6 = (class116) class56.field1241.method1023(false);
                        class185 var7 = new class185(4);
                        var7.method1230((byte) -105, 0);
                        var7.method1214(1200707720, (int) var6.field1694);
                        class87.field1663.method307(-78, 0, var7.field3397, 4);
                        var6.method187((byte) -105);
                        class111.field2088.method914(var6.field1694, var6, true);
                        ++class91.field1738;
                        --class191.field3569;
                    }
                    for (int var8 = 0; var8 < 100; ++var8) {
                        int var9 = class87.field1663.method305((byte) 107);
                        if (var9 < 0) {
                            throw new IOException();
                        }
                        if (~var9 == -1) {
                            break;
                        }
                        class202.field3739 = 0;
                        byte var10 = 0;
                        if (class73.field1439 != null) {
                            if (class232.field4279 == 0) {
                                var10 = 1;
                            }
                        } else {
                            var10 = 8;
                        }
                        if (~var10 < -1) {
                            int var11 = -class144.field2623.field3432 + var10;
                            if (var9 < var11) {
                                var11 = var9;
                            }
                            class87.field1663.method311((byte) -79, class144.field2623.field3397, class144.field2623.field3432, var11);
                            if (~class91.field1737 != -1) {
                                for (int var12 = 0; var11 > var12; ++var12) {
                                    class144.field2623.field3397[class144.field2623.field3432 + var12] = (byte) class171.method1087(class144.field2623.field3397[class144.field2623.field3432 + var12], class91.field1737);
                                }
                            }
                            class144.field2623.field3432 += var11;
                            if (class144.field2623.field3432 < var10) {
                                break;
                            }
                            if (class73.field1439 == null) {
                                class144.field2623.field3432 = 0;
                                int var13 = class144.field2623.method1243(3);
                                int var14 = class144.field2623.method1252(2);
                                int var15 = class144.field2623.method1243(3);
                                long var16 = (long) ((var13 << 16) - -var14);
                                int var18 = class144.field2623.method1231(-4898);
                                class116 var19 = (class116) class194.field3603.method909(-1, var16);
                                class235.field4331 = true;
                                if (var19 == null) {
                                    var19 = (class116) class111.field2088.method909(-1, var16);
                                    class235.field4331 = false;
                                }
                                if (var19 == null) {
                                    throw new IOException();
                                }
                                class73.field1439 = var19;
                                int var20 = var15 == 0 ? 5 : 9;
                                class192.field3576 = new class185(var18 + var20 + class73.field1439.field2190);
                                class192.field3576.method1230((byte) -93, var15);
                                class192.field3576.method1229((byte) -119, var18);
                                class232.field4279 = 8;
                                class144.field2623.field3432 = 0;
                            } else if (class232.field4279 == 0) {
                                if (~class144.field2623.field3397[0] != 0) {
                                    class73.field1439 = null;
                                } else {
                                    class144.field2623.field3432 = 0;
                                    class232.field4279 = 1;
                                }
                            }
                        } else {
                            int var21 = class192.field3576.field3397.length + -class73.field1439.field2190;
                            int var22 = -class232.field4279 + 512;
                            if (-class192.field3576.field3432 + var21 < var22) {
                                var22 = -class192.field3576.field3432 + var21;
                            }
                            if (var9 < var22) {
                                var22 = var9;
                            }
                            class87.field1663.method311((byte) -43, class192.field3576.field3397, class192.field3576.field3432, var22);
                            if (~class91.field1737 != -1) {
                                for (int var23 = 0; ~var23 > ~var22; ++var23) {
                                    class192.field3576.field3397[class192.field3576.field3432 + var23] = (byte) class171.method1087(class192.field3576.field3397[class192.field3576.field3432 + var23], class91.field1737);
                                }
                            }
                            class192.field3576.field3432 += var22;
                            class232.field4279 += var22;
                            if (class192.field3576.field3432 != var21) {
                                if (class232.field4279 != 512) {
                                    break;
                                }
                                class232.field4279 = 0;
                            } else {
                                if (class73.field1439.field1694 != 16711935L) {
                                    class188.field3499.reset();
                                    class188.field3499.update(class192.field3576.field3397, 0, var21);
                                    int var24 = (int) class188.field3499.getValue();
                                    if (class73.field1439.field2179 != var24) {
                                        try {
                                            class87.field1663.method303(1);
                                        } catch (Exception var30) {
                                        }
                                        ++class50.field1076;
                                        class91.field1737 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        class87.field1663 = null;
                                        return false;
                                    }
                                    class50.field1076 = 0;
                                    class191.field3571 = 0;
                                    class73.field1439.field2189.method325((class73.field1439.field1694 & 16711680L) == 16711680L, class192.field3576.field3397, (int) (65535L & class73.field1439.field1694), class235.field4331, (byte) 61);
                                } else {
                                    class163.field2946 = class192.field3576;
                                    for (int var25 = 0; var25 < 256; ++var25) {
                                        class49 var26 = class8.field242[var25];
                                        if (var26 != null) {
                                            class163.field2946.field3432 = var25 * 8 - -5;
                                            int var27 = class163.field2946.method1231(-4898);
                                            int var28 = class163.field2946.method1231(-4898);
                                            var26.method321(true, var27, var28);
                                        }
                                    }
                                }
                                class73.field1439.method592((byte) -128);
                                class192.field3576 = null;
                                if (class235.field4331) {
                                    --class80.field1543;
                                } else {
                                    --class91.field1738;
                                }
                                class232.field4279 = 0;
                                class73.field1439 = null;
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException var31) {
                try {
                    class87.field1663.method303(1);
                } catch (Exception var29) {
                }
                class87.field1663 = null;
                ++class191.field3571;
                return false;
            }
        }
    }
}
