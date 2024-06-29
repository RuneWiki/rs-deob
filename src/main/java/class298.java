import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class298 extends class30 {

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    private int field4732 = 4096;

    @OriginalMember(owner = "client!jq", name = "V", descriptor = "I")
    private int field4742 = 3216;

    @OriginalMember(owner = "client!jq", name = "X", descriptor = "I")
    private int field4744 = 3216;

    @OriginalMember(owner = "client!jq", name = "bb", descriptor = "[I")
    private int[] field4748 = new int[3];

    @OriginalMember(owner = "client!jq", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4746 = "glow2:";

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!jq", name = "R", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jq", name = "U", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!jq", name = "W", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!jq", name = "Y", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!jq", name = "ab", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!jq", name = "cb", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!jq", name = "db", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!jq", name = "eb", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jq", name = "S", descriptor = "Lcq;")
    public static class272 field4739;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "[Lwb;")
    public static class179[] field4730;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
    public static final void method2007(int arg0) {
        ++field4740;
        if (arg0 != -1265899832) {
            method2015(-120, -81);
        }
        if (class306.field4847 != -1) {
            int var1 = class414.field6125;
            int var2 = class287.field4604;
            if (~class402.field6005 != -1) {
                var2 = class214.field3480;
                var1 = class56.field692;
            }
            class282.method1923(0, 0, class306.field4847, var2, class430.field6324, 0, class369.field5615, var1, 0, (byte) -79);
            if (class30.field367 != null) {
                class326.method2168(0, var2, var1);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    public class298() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        this.method2012((byte) -111);
        ++field4745;
        if (arg0 < 90) {
            method2008((class57) null);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljr;)V")
    public static final void method2008(class57 arg0) {
        for (int var1 = arg0.field726; var1 <= arg0.field710; ++var1) {
            for (int var2 = arg0.field720; var2 <= arg0.field711; ++var2) {
                class232 var3 = class423.field6252[arg0.field714][var1][var2];
                if (var3 != null) {
                    class247 var4 = var3.field3866;
                    class247 var5 = null;
                    while (var4 != null) {
                        if (var4.field4052 == arg0) {
                            if (var5 != null) {
                                var5.field4054 = var4.field4054;
                            } else {
                                var3.field3866 = var4.field4054;
                            }
                            var4.method1713(-1479);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4054;
                    }
                    var3.field3876 = 0;
                    for (class247 var6 = var3.field3866; var6 != null; var6 = var6.field4054) {
                        var3.field3876 = (byte) (var3.field3876 | var6.field4051);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)V")
    public static final void method2009(int arg0, byte arg1) {
        ++field4743;
        if (arg1 != -108) {
            method2015(-40, -23);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    class301.method2023(123);
                } else if (arg0 != 3) {
                    throw new RuntimeException();
                } else {
                    class318.method2115(65);
                }
            } else {
                class450.method2807(-1);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
    public static final void method2010(boolean arg0) {
        ++field4735;
        if (class132.field2071 != -1) {
            class1.method1(class132.field2071, true, -1, false, -1);
            class132.field2071 = -1;
        }
        if (!arg0) {
            method2010(true);
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)V")
    public static final void method2011(byte arg0, int arg1) {
        class52 var2 = class235.field3940;
        synchronized (class235.field3940) {
            class235.field3940.method337(arg1, (byte) -122);
        }
        ++field4749;
        class52 var3 = class121.field1695;
        synchronized (class121.field1695) {
            if (arg0 != -17) {
                method2007(74);
            }
            class121.field1695.method337(arg1, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
    private final void method2012(byte arg0) {
        ++field4733;
        double var2 = Math.cos((double) ((float) this.field4744 / 4096.0F));
        this.field4748[0] = (int) (Math.sin((double) ((float) this.field4742 / 4096.0F)) * var2 * 4096.0D);
        this.field4748[1] = (int) (Math.cos((double) ((float) this.field4742 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 != -111) {
            field4739 = null;
        }
        this.field4748[2] = (int) (Math.sin((double) ((float) this.field4744 / 4096.0F)) * 4096.0D);
        int var4 = this.field4748[0] * this.field4748[0] >> 12;
        int var5 = this.field4748[1] * this.field4748[1] >> 12;
        int var6 = this.field4748[2] * this.field4748[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4748[2] = (this.field4748[2] << 12) / var7;
            this.field4748[0] = (this.field4748[0] << 12) / var7;
            this.field4748[1] = (this.field4748[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V")
    public static void method2013(int arg0) {
        field4730 = null;
        field4746 = null;
        field4739 = null;
        if (arg0 < 38) {
            field4730 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(B)V")
    public static final void method2014(byte arg0) {
        class52 var1 = class86.field1081;
        synchronized (class86.field1081) {
            class86.field1081.method335((byte) 67);
        }
        if (arg0 < 123) {
            field4739 = null;
        }
        ++field4734;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
    public static final void method2015(int arg0, int arg1) {
        class134.field2094 = 1000 / arg1;
        ++field4736;
        if (arg0 != -5635) {
            field4751 = -92;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 < 49) {
            method2015(-62, 124);
        }
        ++field4737;
        int[] var3 = super.field371.method2367((byte) 85, arg0);
        if (super.field371.field5586) {
            int var4 = class156.field2452 * this.field4732 >> 12;
            int[] var5 = this.method210((byte) 126, 0, arg0 + -1 & class246.field4033);
            int[] var6 = this.method210((byte) 87, 0, arg0);
            int[] var7 = this.method210((byte) 92, 0, class246.field4033 & arg0 + 1);
            for (int var8 = 0; class369.field5610 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class106.field1492] + -var6[var8 + 1 & class106.field1492]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class56.field691[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field4748[1] * var16 >> 12;
                int var18 = this.field4748[2] * var15 >> 12;
                int var19 = this.field4748[0] * var14 >> 12;
                var3[var8] = var19 - (-var17 + -var18);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([II[I[ILsd;)V")
    public static final void method2016(int[] arg0, int arg1, int[] arg2, int[] arg3, class50 arg4) {
        if (arg1 == -30076) {
            for (int var5 = 0; ~var5 > ~arg3.length; ++var5) {
                int var6 = arg3[var5];
                int var7 = arg2[var5];
                int var8 = arg0[var5];
                int var9 = 0;
                while (~var7 != -1 && arg4.field1835.length > var9) {
                    if ((1 & var7) != 0) {
                        if (var6 != -1) {
                            class417 var10 = class156.method1099(var6, arg1 ^ -30026);
                            int var11 = var10.field6172;
                            class318 var12 = arg4.field1835[var9];
                            if (var12 != null) {
                                if (~var12.field4982 != ~var6) {
                                    if (~var10.field6166 <= ~class156.method1099(var12.field4982, 59).field6166) {
                                        var12 = arg4.field1835[var9] = null;
                                    }
                                } else if (var11 != 0) {
                                    if (var11 == 1) {
                                        var12.field4977 = 0;
                                        var12.field4973 = var8;
                                        var12.field4980 = 0;
                                        var12.field4976 = 0;
                                        var12.field4981 = 1;
                                        class196.method1374(arg4.field722, (byte) -104, 0, arg4.field724, false, var10);
                                    } else if (~var11 == -3) {
                                        var12.field4980 = 0;
                                    }
                                } else {
                                    var12 = arg4.field1835[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class318 var13 = arg4.field1835[var9] = new class318();
                                var13.field4980 = 0;
                                var13.field4973 = var8;
                                var13.field4981 = 1;
                                var13.field4977 = 0;
                                var13.field4976 = 0;
                                var13.field4982 = var6;
                                class196.method1374(arg4.field722, (byte) -104, 0, arg4.field724, false, var10);
                            }
                        } else {
                            arg4.field1835[var9] = null;
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
            }
            ++field4731;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field4744 = arg0.method1272((byte) -97);
                }
            } else {
                this.field4742 = arg0.method1272((byte) -74);
            }
        } else {
            this.field4732 = arg0.method1272((byte) -95);
        }
        if (arg1 == 6456) {
            ++field4750;
        }
    }
}
