import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 extends class7 {

    @OriginalMember(owner = "client!pe", name = "Pb", descriptor = "Lrc;")
    public static class105 field2185 = class43.method374("Verbindung mit Update)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!pe", name = "bc", descriptor = "[Lrc;")
    public static class105[] field2197 = new class105[500];

    @OriginalMember(owner = "client!pe", name = "Vb", descriptor = "I")
    public static int field2191 = -1;

    @OriginalMember(owner = "client!pe", name = "hc", descriptor = "Lrc;")
    private static class105 field2203 = class43.method374("Enter object name", 0);

    @OriginalMember(owner = "client!pe", name = "Rb", descriptor = "Lrc;")
    public static class105 field2187 = field2203;

    @OriginalMember(owner = "client!pe", name = "ic", descriptor = "Lrc;")
    public static class105 field2204 = class43.method374("Chat panel redrawn", 0);

    @OriginalMember(owner = "client!pe", name = "cc", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!pe", name = "jc", descriptor = "Lrc;")
    public static class105 field2205 = class43.method374("blaugr-Un:", 0);

    @OriginalMember(owner = "client!pe", name = "Nb", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pe", name = "Ob", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!pe", name = "Qb", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pe", name = "Sb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!pe", name = "Wb", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!pe", name = "Xb", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!pe", name = "Yb", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!pe", name = "Zb", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!pe", name = "ac", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!pe", name = "dc", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!pe", name = "ec", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pe", name = "fc", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!pe", name = "gc", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!pe", name = "Tb", descriptor = "Lbc;")
    private class10 field2189;

    @OriginalMember(owner = "client!pe", name = "Ub", descriptor = "[I")
    public static int[] field2190;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "(I)I", line = 14)
    public final int method779(int arg0) {
        ++field2193;
        return arg0 != 13270 ? -125 : super.field117[super.field143++] + -this.field2189.method126((byte) -87) & 255;
    }

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "(II)I", line = 29)
    public final int method780(int arg0, int arg1) {
        ++field2188;
        return arg1 <= 48 ? -108 : arg0 * 8 + -this.field2201;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(IB)V", line = 46)
    public final void method781(int arg0, byte arg1) {
        if (arg1 >= -8) {
            field2203 = null;
        }
        super.field117[super.field143++] = (byte) (this.field2189.method126((byte) -87) + arg0);
        ++field2194;
    }

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "(II)V", line = 61)
    public static final void method782(int arg0, int arg1) {
        if (arg1 >= 101) {
            ++field2199;
            if (class75.method638(-12164)) {
                if (!class29.field670) {
                    class81.method695(arg0, (byte) -106);
                } else {
                    class122.field2982 = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V", line = 86)
    public class95(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "(I)V", line = 99)
    public static final void method783(int arg0) {
        ++field2196;
        if (~class75.field1674 == -1) {
            if (class96.field2224 == null) {
                int var1 = class104.field2371;
                if (arg0 != -4632) {
                    method786(106, (class58) null);
                }
                if (class122.field3003 == 1 && class86.field1937 >= 516 && class30.field683 >= 160 && class86.field1937 <= 765 && class30.field683 <= 205) {
                    var1 = 0;
                }
                if (class130.field3165) {
                    if (~var1 != -2) {
                        int var2 = class35.field816;
                        int var3 = class75.field1664;
                        if (~class1.field13 == -1) {
                            var2 -= 4;
                            var3 -= 4;
                        }
                        if (~class1.field13 == -2) {
                            var2 -= 205;
                            var3 -= 553;
                        }
                        if (~class1.field13 == -3) {
                            var3 -= 17;
                            var2 -= 357;
                        }
                        if (~var3 > ~(class51.field1075 - 10) || ~(class51.field1075 - (-class116.field2723 - 10)) > ~var3 || var2 < class10.field199 + -10 || ~var2 < ~(class74.field1654 + 10 + class10.field199)) {
                            class130.field3165 = false;
                            if (~class1.field13 == -3) {
                                class90.field2064 = true;
                            }
                            if (~class1.field13 == -2) {
                                class80.field1805 = true;
                            }
                        }
                    }
                    if (var1 == 1) {
                        int var4 = class51.field1075;
                        int var5 = class10.field199;
                        int var6 = class116.field2723;
                        int var7 = class86.field1937;
                        int var8 = class30.field683;
                        int var9 = -1;
                        if (~class1.field13 == -1) {
                            var8 -= 4;
                            var7 -= 4;
                        }
                        if (class1.field13 == 1) {
                            var7 -= 553;
                            var8 -= 205;
                        }
                        if (~class1.field13 == -3) {
                            var8 -= 357;
                            var7 -= 17;
                        }
                        for (int var10 = 0; ~var10 > ~class113.field2652; ++var10) {
                            int var11 = (class113.field2652 + -1 + -var10) * 15 + 31 + var5;
                            if (var4 < var7 && ~var7 > ~(var4 + var6) && ~(var11 + -13) > ~var8 && ~var8 > ~(var11 + 3)) {
                                var9 = var10;
                            }
                        }
                        if (~var9 != 0) {
                            class74.method626((byte) -91, var9);
                        }
                        if (~class1.field13 == -3) {
                            class90.field2064 = true;
                        }
                        if (class1.field13 == 1) {
                            class80.field1805 = true;
                        }
                        class130.field3165 = false;
                        return;
                    }
                } else {
                    if (~var1 == -2 && class113.field2652 > 0) {
                        int var12 = class15.field298[class113.field2652 - 1];
                        if (var12 == 5 || ~var12 == -33 || var12 == 24 || ~var12 == -3 || ~var12 == -30 || var12 == 25 || var12 == 13 || ~var12 == -11 || ~var12 == -57 || ~var12 == -29 || ~var12 == -24 || ~var12 == -1004) {
                            int var13 = class128.field3104[class113.field2652 - 1];
                            int var14 = class96.field2225[class113.field2652 + -1];
                            class119 var15 = class119.method964(65535, var14);
                            if (var15.field2795 || var15.field2834) {
                                class74.field1650 = class86.field1937;
                                class16.field345 = var14;
                                class93.field2178 = false;
                                class83.field1850 = var13;
                                class73.field1615 = class30.field683;
                                class75.field1674 = 2;
                                if (~(var14 >> 16) == ~class18.field418) {
                                    class75.field1674 = 1;
                                }
                                class71.field1558 = 0;
                                if (var14 >> 16 == class1.field4) {
                                    class75.field1674 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (~var1 == -2 && (class1.field9 == 1 || class66.method561(class113.field2652 - 1, 10024)) && ~class113.field2652 < -3) {
                        var1 = 2;
                    }
                    if (var1 == 1 && ~class113.field2652 < -1) {
                        class74.method626((byte) -91, class113.field2652 + -1);
                    }
                    if (~var1 != -3 || class113.field2652 <= 0) {
                        return;
                    }
                    class14.method158(8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "(I)V", line = 284)
    public static void method784(int arg0) {
        field2204 = null;
        int var1 = 83 % ((-38 - arg0) / 52);
        field2190 = null;
        field2203 = null;
        field2205 = null;
        field2187 = null;
        field2185 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "(II)I", line = 308)
    public final int method785(int arg0, int arg1) {
        ++field2183;
        int var3 = this.field2201 >> 3;
        int var4 = -(7 & this.field2201) + 8;
        this.field2201 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field117[var3++] & class93.field2166[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field117[var3] & class93.field2166[var4]) + var5;
        } else {
            var6 = (class93.field2166[arg1] & super.field117[var3] >> var4 - arg1) + var5;
        }
        if (arg0 != 205) {
            method787(false, (class33) null, -92);
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjd;)V", line = 345)
    public static final void method786(int arg0, class58 arg1) {
        ++field2184;
        arg1.field1242 = 0;
        int var2 = -class104.field2351 + arg1.field1272;
        if (~arg1.field1219 == -1) {
            arg1.field1253 = 1024;
        }
        if (arg1.field1219 == 1) {
            arg1.field1253 = 1536;
        }
        if (arg1.field1219 == 2) {
            arg1.field1253 = 0;
        }
        int var3 = arg1.field1256 * 128 + arg1.field1227 * 64;
        int var4 = arg1.field1287 * 128 + arg1.field1227 * 64;
        if (~arg1.field1219 == -4) {
            arg1.field1253 = 512;
        }
        arg1.field1274 += (var4 - arg1.field1274) / var2;
        int var5 = -127 % ((29 - arg0) / 59);
        arg1.field1229 += (-arg1.field1229 + var3) / var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLfb;I)Z", line = 378)
    public static final boolean method787(boolean arg0, class33 arg1, int arg2) {
        class67.field1518 = 20;
        ++field2200;
        try {
            class74.field1634 = (class127) Class.forName("qe").newInstance();
            return true;
        } catch (Throwable var4) {
            if (arg2 != 8) {
                field2203 = null;
            }
            class4 var3 = arg1.method317((byte) 124);
            if (var3 != null) {
                class74.field1634 = new class103(arg1, var3);
                return true;
            } else if (arg0) {
                class74.field1634 = new class89(arg1);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[I)V", line = 413)
    public final void method788(int arg0, int[] arg1) {
        ++field2195;
        this.field2189 = new class10(arg1);
        if (arg0 < 19) {
            this.method785(52, -89);
        }
    }

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "(B)V", line = 425)
    public final void method789(byte arg0) {
        ++field2202;
        super.field143 = (this.field2201 + 7) / 8;
        if (arg0 > -30) {
            this.field2201 = 87;
        }
    }

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "(B)V", line = 438)
    public final void method790(byte arg0) {
        ++field2192;
        if (arg0 == -76) {
            this.field2201 = super.field143 * 8;
        }
    }
}
