import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class319 extends class428 {

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "F")
    private float field5197 = 0.0F;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Lb;")
    private class352 field5205;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5206 = new String[] { method2738(method2737("1\u001fs8s")), method2738(method2737("1\u001fs2s")), method2738(method2737("1\u001fs:s")), method2738(method2737("1\u001fs<s")), method2738(method2737("1\u001fsG2)\u0002)Es")), method2738(method2737(")\u001e1\u0017")), method2738(method2737("<EsU&")), method2738(method2737("1\u001fs5s")), method2738(method2737("1\u001fs?s")), method2738(method2737("1\u001fs=s")), method2738(method2737("1\u001fs3s")), method2738(method2737("1\u001fs>s")), method2738(method2737("1\u001fs9s")) };

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field5199 = 0;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "[[[I")
    public static int[][][] field5200;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZ)V", line = 7)
    public final void method1221(int arg0, boolean arg1) {
        try {
            super.field6741.method2223(class434.field6809, class734.field10762, (byte) 115);
            ++field5201;
            if (arg0 != 6056) {
                method2736((byte) 16, 8, -25);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5206[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V", line = 18)
    public final void method1225(boolean arg0, int arg1) {
        try {
            if (arg1 != 29145) {
                this.method1222((class399) null, (byte) 4, -22);
            }
            super.field6741.method2245(125, 1);
            ++field5202;
            super.field6741.method2223(class434.field6809, class440.field6863, (byte) 107);
            super.field6741.method1067(true, class339.field5532, false, -98, 0);
            super.field6741.method2248((byte) -109, class612.field8798, 0);
            super.field6741.method1083((byte) -1, 0);
            super.field6741.method2245(99, 0);
            super.field6741.method2204(3, -16777216);
            super.field6741.method2248((byte) -109, class119.field1723, 0);
            this.method2733(arg1 + -29070);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5206[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lgca;Lb;)V", line = 38)
    public class319(class261 arg0, class352 arg1) {
        super(arg0);
        try {
            this.field5205 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5206[4] + (arg0 != null ? field5206[6] : field5206[5]) + ',' + (arg1 != null ? field5206[6] : field5206[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V", line = 48)
    public final void method2733(int arg0) {
        try {
            if (arg0 != 75) {
                this.method1226(24);
            }
            if (super.field6741.method2205((byte) -120) == 0) {
                class615 var2 = super.field6741.method2199(0);
                super.field6741.method2245(67, 1);
                class615 var3 = super.field6741.method2208((byte) -66);
                var3.method2461(var2);
                var3.method4481(0.125F, (byte) -113, 0.125F, 1.0F);
                var3.method4475((byte) -128, this.field5197, 0.0F, 0.0F);
                super.field6741.method2252(class791.field11549, true);
                super.field6741.method2245(72, 0);
            }
            ++field5195;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5206[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)I", line = 73)
    public static final int method2734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg0 != 1) {
                method2734(86, 91, 28, -29, 100, 69);
            }
            ++field5192;
            if (class740.field10902 == null) {
                return 0;
            } else if (arg3 < 3) {
                int var6 = arg4 >> 9;
                int var7 = arg2 >> 9;
                if (~arg5 <= -1 && arg1 >= 0 && ~(class126.field1823 - 1) <= ~arg5 && class169.field2725 + -1 >= arg1) {
                    if (~var6 <= -2 && ~var7 <= -2 && ~var6 >= ~(class126.field1823 + -1) && ~var7 >= ~(class169.field2725 - 1)) {
                        boolean var8 = ~(2 & class224.field3519[1][arg4 >> 9][arg2 >> 9]) != -1;
                        if ((arg4 & 511) == 0) {
                            boolean var9 = (2 & class224.field3519[1][var6 + -1][arg2 >> 9]) != 0;
                            boolean var10 = ~(2 & class224.field3519[1][var6][arg2 >> 9]) != -1;
                            if (!var10 != !var9) {
                                var8 = ~(2 & class224.field3519[1][arg5][arg1]) != -1;
                            }
                        }
                        if (~(arg2 & 511) == -1) {
                            boolean var11 = (2 & class224.field3519[1][arg4 >> 9][var7 + -1]) != 0;
                            boolean var12 = (class224.field3519[1][arg4 >> 9][var7] & 2) != 0;
                            if (var11 == !var12) {
                                var8 = (2 & class224.field3519[1][arg5][arg1]) != 0;
                            }
                        }
                        if (var8) {
                            ++arg3;
                        }
                        return class740.field10902[arg3].method2497((byte) -91, arg4, arg2);
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return class740.field10902[arg3].method2497((byte) -91, arg4, arg2);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field5206[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V", line = 134)
    public static void method2735(int arg0) {
        try {
            if (arg0 > 121) {
                field5200 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5206[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lln;BI)V", line = 145)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            if (arg1 < 7) {
                this.method1226(-47);
            }
            super.field6741.method2233((byte) -123, arg0);
            ++field5203;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5206[9] + (arg0 != null ? field5206[6] : field5206[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)Z", line = 164)
    public static final boolean method2736(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 < 44) {
                field5199 = -106;
            }
            ++field5196;
            return (arg1 & 544) == 544 | ~(arg1 & 24) != -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5206[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z", line = 178)
    public final boolean method1226(int arg0) {
        try {
            ++field5204;
            if (arg0 > -111) {
                field5199 = 42;
            }
            return this.field5205.method2924(20);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5206[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 190)
    public final void method1224(boolean arg0) {
        try {
            ++field5198;
            super.field6741.method2245(60, 1);
            super.field6741.method2223(class734.field10762, class734.field10762, (byte) 108);
            super.field6741.method2262((byte) 116, class339.field5532, 0);
            if (!arg0) {
                field5200 = null;
            }
            super.field6741.method2248((byte) -109, class339.field5532, 0);
            super.field6741.method1083((byte) -1, 1);
            super.field6741.method2233((byte) -33, (class399) null);
            super.field6741.method2245(112, 0);
            super.field6741.method2248((byte) -109, class339.field5532, 0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5206[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V", line = 208)
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            super.field6741.method2245(arg1 ^ 45, 1);
            ++field5193;
            if ((arg0 & 128) == 0) {
                if (~(arg2 & 1) != -2) {
                    if (this.field5205.field5689) {
                        super.field6741.method2233((byte) -117, this.field5205.field5687);
                    } else {
                        super.field6741.method2233((byte) -29, this.field5205.field5681[0]);
                    }
                } else if (!this.field5205.field5689) {
                    int var4 = super.field6741.field4214 % 4000 * 16 / 4000;
                    super.field6741.method2233((byte) -102, this.field5205.field5681[var4]);
                } else {
                    this.field5197 = (float) (super.field6741.field4214 % 4000) / 4000.0F;
                    super.field6741.method2233((byte) -94, this.field5205.field5687);
                }
            } else {
                super.field6741.method2233((byte) -49, (class399) null);
            }
            super.field6741.method2245(arg1 ^ 84, 0);
            if (arg1 != 100) {
                this.field5205 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5206[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2737(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 91);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2738(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
