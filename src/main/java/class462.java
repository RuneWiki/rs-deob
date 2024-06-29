import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class462 extends class271 {

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6744 = new String[] { method3554(method3553("Iq6Y3\u0015")), method3554(method3553("Iq6Y0\u0015")), method3554(method3553("Iq6Y1\u0015")), method3554(method3553("Iq6Y4\u0015")), method3554(method3553("Iq6Y<\u0015")), method3554(method3553("Iq6Y2\u0015")), method3554(method3553("H~")), method3554(method3553("H\u007f")), method3554(method3553("Iq6Y=\u0015")) };

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "Lsb;")
    public static class261 field6738 = new class261(31, 2);

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
    public static int field6742 = 0;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "Ltb;")
    private class392 field6741;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V", line = 5)
    public static void method3550(byte arg0) {
        try {
            int var1 = -19 % ((arg0 - 56) / 52);
            field6738 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6744[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 14)
    public final void method802(int arg0) {
        try {
            ++field6737;
            int var2 = -9 % ((38 - arg0) / 41);
            super.method802(-12);
            this.field6741 = class304.method2443(true, super.field3831, ((class778) super.field3830).field11085);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6744[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z", line = 26)
    public static final boolean method3551(byte arg0, int arg1, int arg2) {
        try {
            ++field6739;
            if (arg0 < 73) {
                return true;
            } else {
                return (arg1 & 540800) != 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6744[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIBZ)V", line = 40)
    public final void method550(int arg0, int arg1, byte arg2, boolean arg3) {
        try {
            ++field6743;
            if (arg2 != -35) {
                field6738 = null;
            }
            class236.field3418.method212(arg0 - 2, arg1, super.field3830.field10543 + 4, super.field3830.field10541 + 2, ((class778) super.field3830).field11084, 0);
            class236.field3418.method212(arg0 - 1, arg1 + 1, super.field3830.field10543 + 2, super.field3830.field10541, 0, 0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6744[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)Z", line = 52)
    public final boolean method800(byte arg0) {
        try {
            ++field6740;
            if (arg0 > -2) {
                this.field6741 = null;
            }
            return !super.method800((byte) -29) ? false : super.field3831.method530(false, ((class778) super.field3830).field11085);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6744[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BIZI)V", line = 68)
    public final void method549(byte arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field6736;
            int var5 = this.method2217(false) * super.field3830.field10543 / 10000;
            int[] var6 = new int[4];
            class236.field3418.method229(var6);
            if (arg0 < 60) {
                field6738 = null;
            }
            class236.field3418.method208(arg3, arg1 + 2, arg3 + var5, super.field3830.field10541 + arg1);
            this.field6741.method3075(arg3, arg1 + 2, super.field3830.field10543, super.field3830.field10541);
            class236.field3418.method208(var6[0], var6[1], var6[2], var6[3]);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6744[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)V", line = 92)
    public static final void method3552(byte arg0) {
        try {
            ++field6735;
            if (arg0 != -5) {
                field6738 = null;
            }
            class476 var1 = class60.field916.field11099;
            int var2 = var1.method5116((byte) -110);
            int var3 = var1.method5119(101);
            class751.field10694 = var1.method5128(arg0 + 5);
            boolean var4 = ~var1.method5132((byte) 16) == -2;
            int var5 = var1.method5116((byte) -120);
            class76.method772((byte) -111);
            class185.method1525(-8011, var3);
            var1.method3678(-1);
            for (int var6 = 0; ~var6 > -5; ++var6) {
                for (int var7 = 0; class625.field8929 >> 3 > var7; ++var7) {
                    for (int var8 = 0; var8 < class14.field187 >> 3; ++var8) {
                        int var9 = var1.method3677(arg0 + -119, 1);
                        if (~var9 == -2) {
                            class634.field8995[var6][var7][var8] = var1.method3677(arg0 + -89, 26);
                        } else {
                            class634.field8995[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            var1.method3681(-67);
            int var10 = (-var1.field9945 + class60.field916.field11105) / 16;
            class20.field255 = new int[var10][4];
            for (int var11 = 0; var11 < var10; ++var11) {
                for (int var12 = 0; ~var12 > -5; ++var12) {
                    class20.field255[var11][var12] = var1.method5113(arg0 + 18448);
                }
            }
            class259.field3688 = null;
            class521.field7608 = new int[var10];
            class125.field1576 = new byte[var10][];
            class359.field5217 = new int[var10];
            class796.field11577 = new byte[var10][];
            class686.field9614 = new byte[var10][];
            class250.field3572 = new int[var10];
            class385.field5630 = new byte[var10][];
            class693.field9685 = new int[var10];
            class753.field10768 = null;
            class136.field1754 = new int[var10];
            int var13 = 0;
            for (int var14 = 0; var14 < 4; ++var14) {
                for (int var15 = 0; var15 < class625.field8929 >> 3; ++var15) {
                    for (int var16 = 0; ~var16 > ~(class14.field187 >> 3); ++var16) {
                        int var17 = class634.field8995[var14][var15][var16];
                        if (~var17 != 0) {
                            int var18 = 1023 & var17 >> 14;
                            int var19 = (var17 & 16381) >> 3;
                            int var20 = (var18 / 8 << 8) + var19 / 8;
                            for (int var21 = 0; var13 > var21; ++var21) {
                                if (~var20 == ~class136.field1754[var21]) {
                                    var20 = -1;
                                    break;
                                }
                            }
                            if (var20 != -1) {
                                class136.field1754[var13] = var20;
                                int var22 = (65512 & var20) >> 8;
                                int var23 = var20 & 255;
                                class250.field3572[var13] = class203.field2987.method502("m" + var22 + "_" + var23, (byte) -106);
                                class521.field7608[var13] = class203.field2987.method502("l" + var22 + "_" + var23, (byte) -115);
                                class693.field9685[var13] = class203.field2987.method502(field6744[6] + var22 + "_" + var23, (byte) -93);
                                class359.field5217[var13] = class203.field2987.method502(field6744[7] + var22 + "_" + var23, (byte) -91);
                                ++var13;
                            }
                        }
                    }
                }
            }
            class555.method4155(12, var4, var2, var5, -5);
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field6744[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Llga;Llga;Lvm;)V", line = 243)
    public class462(class47 arg0, class47 arg1, class778 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3553(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 117);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3554(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
