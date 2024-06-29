import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class131 extends class337 {

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    private int field2000 = 4096;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    private int field2003 = 4096;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    private int field2001 = 409;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    private int field2002 = 4096;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "[I")
    private int[] field2006 = new int[3];

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "[Leb;")
    public static class443[] field2005 = new class443[2048];

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "Lhn;")
    public static class509 field2008 = new class509(73, -1);

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "Lob;")
    public static class521 field2009 = new class521(31, 3);

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "Lhn;")
    public static class509 field2010;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field1999;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        int var4 = 107 % ((arg1 - -41) / 49);
        if (super.field5011.field3346) {
            int[][] var5 = this.method2123(arg0, 0, -104);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class402.field5977; ++var12) {
                int var13 = var6[var12];
                int var14 = var13 - this.field2006[0];
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (var14 > this.field2001) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field2006[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~this.field2001 > ~var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = var17 - this.field2006[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (var18 > this.field2001) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field2003 * var13 >> 12;
                            var10[var12] = this.field2000 * var15 >> 12;
                            var11[var12] = this.field2002 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
    public static void method965(byte arg0) {
        field2008 = null;
        field2009 = null;
        field2010 = null;
        field2005 = null;
        if (arg0 <= 90) {
            method967(49, 110, 48, false, -69, -12);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field2007;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg2.method1548(31529);
                            this.field2006[2] = class74.method644(var5, 255) >> 12;
                            this.field2006[0] = class74.method644(var5 << 4, 267386880);
                            this.field2006[1] = class74.method644(4080, var5 >> 4);
                        }
                    } else {
                        this.field2003 = arg2.method1511(-112);
                    }
                } else {
                    this.field2000 = arg2.method1511(107);
                }
            } else {
                this.field2002 = arg2.method1511(-82);
            }
        } else {
            this.field2001 = arg2.method1511(82);
        }
        int var6 = -79 / ((82 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "()V")
    public static final void method966() {
        class65.method558(1, class213.field3467);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIZII)V")
    public static final void method967(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field2004;
        if (client.field3311 == null) {
            class377.field5692.method364(arg0, arg1 + 17714, -16777216, arg2, arg5, arg4);
        } else if (class398.field5947.field5837 >= 0 && class69.field976 * 128 > class398.field5947.field5837 && class398.field5947.field5833 >= 0 && class285.field4328 * 128 > class398.field5947.field5833) {
            ++class448.field6562;
            if (class398.field5947 != null && ~(class398.field5947.field5837 + (-(64 * class398.field5947.method953(-57)) - -64) >> 7) == ~class114.field1692 && class398.field5947.field5833 - (-1 + class398.field5947.method953(-52)) * 64 >> 7 == class523.field7652) {
                class523.field7652 = -1;
                class114.field1692 = -1;
                class467.method2817(0);
            }
            class207.method1433((byte) 15);
            if (!arg3) {
                class450.method2748(76);
            }
            class504.method2998(-26031);
            class491.method2918(arg5, true, arg2, (byte) -94, arg0, arg4);
            int var6 = class272.field4164;
            int var7 = class412.field6168;
            int var8 = class286.field4336;
            int var9 = class336.field5003;
            if (~class176.field2611 == -2) {
                int var10 = (int) class181.field2711;
                if (var10 < class40.field535 >> 8) {
                    var10 = class40.field535 >> 8;
                }
                if (class407.field6059[4] && var10 < class26.field323[4] - -128) {
                    var10 = class26.field323[4] + 128;
                }
                int var11 = (int) class473.field6830 + class282.field4294 & 16383;
                class488.method2911(-50 + class172.method1153(class154.field2286, arg1 ^ 17715, class398.field5947.field5837, class398.field5947.field5833), false, class468.field6767, (var10 >> 3) * 3 + 600 << 0, var6, class380.field5738, var11, var10);
            } else if (~class176.field2611 != -5) {
                if (class176.field2611 == 5) {
                    class302.method1945(123, var6);
                }
            } else {
                int var12 = (int) class181.field2711;
                if (class40.field535 >> 8 > var12) {
                    var12 = class40.field535 >> 8;
                }
                if (class407.field6059[4] && ~var12 > ~(class26.field323[4] + 128)) {
                    var12 = class26.field323[4] + 128;
                }
                int var13 = 16383 & (int) class473.field6830;
                class488.method2911(-50 + class172.method1153(class154.field2286, -4, class222.field3637, class476.field6868), false, class468.field6767, (var12 >> 3) * 3 + 600 << 0, var6, class380.field5738, var13, var12);
            }
            int var14 = class412.field6180;
            int var15 = class473.field6831;
            int var16 = class71.field1024;
            int var17 = class419.field6263;
            int var18 = class396.field5932;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class407.field6059[var19]) {
                    int var22 = (int) ((double) (class109.field1528[var19] * 2 + 1) * Math.random() - (double) class109.field1528[var19] + Math.sin((double) class315.field4747[var19] / 100.0D * (double) class432.field6405[var19]) * (double) class26.field323[var19]);
                    if (~var19 == -3) {
                        class71.field1024 += var22;
                    }
                    if (var19 == 4) {
                        class419.field6263 += var22;
                        if (class419.field6263 < 1024) {
                            class419.field6263 = 1024;
                        } else if (class419.field6263 > 3072) {
                            class419.field6263 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class396.field5932 = class396.field5932 + var22 & 16383;
                    }
                    if (var19 == 0) {
                        class412.field6180 += var22;
                    }
                    if (var19 == 1) {
                        class473.field6831 += var22;
                    }
                }
            }
            if (~class412.field6180 > -1) {
                class412.field6180 = 0;
            }
            if (class71.field1024 < 0) {
                class71.field1024 = 0;
            }
            if (class412.field6180 > (class497.field7147 << 7) + -1) {
                class412.field6180 = (class497.field7147 << 7) + -1;
            }
            if (~class71.field1024 < ~((class385.field5799 << 7) + -1)) {
                class71.field1024 = (class385.field5799 << 7) + -1;
            }
            class475.method2861((byte) 122);
            class239.method1649(false);
            class377.field5692.method313(var7, var8, var7 + var9, var6 + var8);
            class377.field5692.method306();
            int var20 = class169.field2491;
            if (class32.field377 != null) {
                class32.field377.method1618(var6, class134.field2049 << 3, var8, class396.field5932, class377.field5692, (byte) -110, class419.field6263, var9, var7, var20);
            } else {
                class377.field5692.method360(var20);
            }
            class92.method746(980099212);
            class210.field3431.method218(class412.field6180, class473.field6831, class71.field1024, 16383 & -class419.field6263, -class396.field5932 & 16383, -class364.field5380 & 16383);
            class377.field5692.method362(class210.field3431);
            class377.field5692.method268(var9 / 2 + var7, var8 - -(var6 / 2), class215.field3493 << 1, class215.field3493 << 1);
            class335.method2117(9179409, var9 / 2 + var7, class215.field3493 << 1, class215.field3493 << 1, var8 - -(var6 / 2));
            class447.method2739(256, class473.field6831, 16383 & -class419.field6263, 16383 & -class364.field5380, class412.field6180, 16383 & -class396.field5932, class71.field1024);
            byte var21 = ~class193.field3258.method935(class96.field1384, 1) == -3 ? (byte) class448.field6562 : 1;
            class124.method915(class377.field5692, class475.field6854, class421.field6276, class210.field3431, class412.field6180, class473.field6831, class71.field1024, class221.field3633, class255.field3909, class220.field3617, class233.field3770, class520.field7618, class488.field7034, class398.field5947.field5826 - -1, var21, class398.field5947.field5837 >> 7, class398.field5947.field5833 >> 7, !class193.field3258.field7215);
            class92.method746(980099212);
            if (class429.field6373 == 9) {
                class17.method142(-120, var8, 256, 256, var9, var6, var7);
                class219.method1580(256, -95, var6, var8, var7, var9, 256);
                class445.method2734(var6, var9, 256, var8, (byte) -63, 256, var7);
                class465.method2814(var9, (byte) 103, var8, var6, var7);
            }
            if (arg1 != -17713) {
                field2008 = null;
            }
            class275.method1806();
            class71.field1024 = var16;
            class473.field6831 = var15;
            class412.field6180 = var14;
            class396.field5932 = var18;
            class419.field6263 = var17;
            if (class507.field7405 && ~class322.field4831.method2008(3) == -1) {
                class507.field7405 = false;
            }
            if (class507.field7405) {
                class377.field5692.method364(var8, arg1 ^ -17714, -16777216, var9, var7, var6);
                class258.method1730(false, class59.field709.method1635(class224.field3673, (byte) 117), true, class313.field4722);
            }
        } else {
            class377.field5692.method364(arg0, 1, -16777216, arg2, arg5, arg4);
        }
    }
}
