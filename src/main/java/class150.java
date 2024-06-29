import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class150 extends class232 {

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    private int field2097 = 2000;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    private int field2094 = 4096;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    private int field2103 = 16;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    private int field2104 = 0;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "[Ljava/lang/String;")
    private static final String[] field2106 = new String[] { method1369(method1368("\u001fK,o\f")), method1369(method1368("\u0006UnO")), method1369(method1368("\u001fK,f\f")), method1369(method1368("\u0013\u000e,\rY")), method1369(method1368("\u001fK,b\f")), method1369(method1368("\u001fK,g\f")), method1369(method1368("\u001fK,e\f")), method1369(method1368("\u001fK,`\f")) };

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "[I")
    public static int[] field2093 = new int[4];

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "Lvn;")
    public static class330 field2095 = new class330(38, -1);

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "[S")
    public static short[] field2105 = new short[] { 46, 21, 19, 30, 49, 57, 16, 18 };

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            class204.method1843((byte) 92);
            int var2 = -59 % ((arg0 - 73) / 34);
            ++field2102;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2106[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field2100;
            if (arg0 >= 96) {
                if (arg2 != 0) {
                    if (~arg2 != -2) {
                        if (arg2 != 2) {
                            if (~arg2 != -4) {
                                if (arg2 == 4) {
                                    this.field2094 = arg1.method1687((byte) -58);
                                }
                            } else {
                                this.field2104 = arg1.method1687((byte) -87);
                            }
                        } else {
                            this.field2103 = arg1.method1645((byte) -124);
                        }
                    } else {
                        this.field2097 = arg1.method1687((byte) -78);
                    }
                } else {
                    this.field2092 = arg1.method1645((byte) -120);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2106[2] + arg0 + ',' + (arg1 != null ? field2106[3] : field2106[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lha;I)V")
    public static final void method1365(class63 arg0, int arg1) {
        try {
            ++field2101;
            int var2 = 0;
            int var3 = 0;
            if (arg1 == 5395) {
                if (class316.field5141) {
                    var2 = class50.method516(false);
                    var3 = class568.method4171(0);
                }
                int var4 = class65.field897 + var2;
                int var5 = class606.field8725 - -var3;
                int var6 = class489.field7379;
                int var7 = class209.field3290 - 3;
                byte var8 = 20;
                class2.method11(class209.field3290, var8, class709.field10226.method5154(class795.field11624, (byte) 65), -128, class489.field7379, class606.field8725 + var3, arg0, class65.field897 - -var2);
                int var9 = var2 + class15.field174.method5051(0);
                int var10 = class15.field174.method5048(true) + var3;
                if (!class595.field8598) {
                    int var11 = 0;
                    for (class59 var12 = (class59) class439.field6858.method3228(arg1 ^ 5400); var12 != null; var12 = (class59) class439.field6858.method3216(true)) {
                        int var13 = var5 - -var8 - (-((class320.field5213 + -1 + -var11) * 16) + -13);
                        ++var11;
                        if (~(class65.field897 + var2) > ~var9 && class65.field897 - -class489.field7379 + var2 > var9 && var10 > var13 + -13 && ~var10 > ~(var13 + 4) && var12.field775) {
                            arg0.method242(class65.field897 + var2, var13 + -12, class489.field7379, 16, class776.field11330 | 255 - class482.field7331 << 24, 1);
                        }
                    }
                } else {
                    int var14 = 0;
                    for (class603 var15 = (class603) class580.field8365.method5147((byte) -53); var15 != null; var15 = (class603) class580.field8365.method5144(arg1 ^ 5139)) {
                        int var16 = var5 - -(var14 * 16) + var8 + 13;
                        if (~var9 < ~(class65.field897 + var2) && ~var9 > ~(class65.field897 + class489.field7379 + var2) && ~var10 < ~(var16 + -13) && var16 + 4 > var10 && (var15.field8711 > 1 || ((class59) var15.field8713.field10193.field7074).field775)) {
                            arg0.method242(class65.field897 + var2, var16 + -12, class489.field7379, 16, 255 - class482.field7331 << 24 | class776.field11330, 1);
                        }
                        ++var14;
                    }
                    if (class116.field1694 != null) {
                        int var17 = 0;
                        class2.method11(class541.field7977, var8, class116.field1694.field8710, -128, class630.field9060, class270.field4346, arg0, class452.field6990);
                        for (class59 var18 = (class59) class116.field1694.field8713.method5147((byte) 125); var18 != null; var18 = (class59) class116.field1694.field8713.method5144(256)) {
                            int var19 = var17 * 16 + 13 + var8 + class270.field4346;
                            if (~var9 < ~class452.field6990 && var9 < class630.field9060 + class452.field6990 && var19 - 13 < var10 && var19 + 4 > var10 && var18.field775) {
                                arg0.method242(class452.field6990, var19 + -12, class630.field9060, 16, class776.field11330 | 255 - class482.field7331 << 24, 1);
                            }
                            ++var17;
                        }
                        class252.method2139(class270.field4346, class630.field9060, class541.field7977, -80, class452.field6990, var8, arg0);
                    }
                }
                class252.method2139(class606.field8725 + var3, class489.field7379, class209.field3290, -47, class65.field897 + var2, var8, arg0);
                if (!class595.field8598) {
                    int var20 = 0;
                    for (class59 var21 = (class59) class439.field6858.method3228(11); var21 != null; var21 = (class59) class439.field6858.method3216(true)) {
                        int var22 = (-var20 + class320.field5213 + -1) * 16 + (var5 - (-var8 - 13));
                        ++var20;
                        class432.method3415(var22, var4, true, var10, arg0, var21, var9, var7, -16777216 | class785.field11472, var5, var6, class293.field4696 | -16777216);
                    }
                } else {
                    int var23 = 0;
                    for (class603 var24 = (class603) class580.field8365.method5147((byte) 71); var24 != null; var24 = (class603) class580.field8365.method5144(arg1 + -5139)) {
                        int var25 = class606.field8725 + 13 - (-var3 - var8 + -(var23 * 16));
                        if (var24.field8711 != 1) {
                            class139.method1291(class606.field8725 + var3, -16777216 | class785.field11472, arg0, class65.field897 + var2, class293.field4696 | -16777216, class209.field3290, var10, var24, var9, -92, class489.field7379, var25);
                        } else {
                            class432.method3415(var25, class65.field897 + var2, true, var10, arg0, (class59) var24.field8713.field10193.field7074, var9, class209.field3290, class785.field11472 | -16777216, class606.field8725 + var3, class489.field7379, class293.field4696 | -16777216);
                        }
                        ++var23;
                    }
                    if (class116.field1694 != null) {
                        int var26 = 0;
                        for (class59 var27 = (class59) class116.field1694.field8713.method5147((byte) 126); var27 != null; var27 = (class59) class116.field1694.field8713.method5144(256)) {
                            int var28 = class270.field4346 - (-var8 + -13 - 16 * var26);
                            class432.method3415(var28, class452.field6990, true, var10, arg0, var27, var9, class541.field7977, -16777216 | class785.field11472, class270.field4346, class630.field9060, class293.field4696 | -16777216);
                            ++var26;
                        }
                        class785.method5647((byte) 87, class452.field6990, class270.field4346, class541.field7977, class630.field9060);
                    }
                }
                class785.method5647((byte) 87, class65.field897 + var2, class606.field8725 + var3, class209.field3290, class489.field7379);
            }
        } catch (RuntimeException var30) {
            throw class590.method4333(var30, field2106[5] + (arg0 != null ? field2106[3] : field2106[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2098;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                this.field2097 = -45;
            }
            if (super.field3601.field6907) {
                int var4 = this.field2094 >> 1;
                int[][] var5 = super.field3601.method3465(arg1 ^ 123);
                Random var6 = new Random((long) this.field2092);
                for (int var7 = 0; this.field2097 > var7; ++var7) {
                    int var8 = this.field2094 > 0 ? this.field2104 - (-class235.method2039(var6, this.field2094, arg1 ^ -23) + var4) : this.field2104;
                    int var9 = (var8 & 4092) >> 4;
                    int var10 = class235.method2039(var6, class449.field6969, arg1 ^ -5);
                    int var11 = class235.method2039(var6, class742.field10920, -100);
                    int var12 = (class266.field4305[var9] * this.field2103 >> 12) + var10;
                    int var13 = (class305.field4919[var9] * this.field2103 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (var15 != 0 || ~var14 != -1) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (var10 > var12) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 - (class235.method2039(var6, 4096, -78) >> 2);
                        int var27 = ~var13 >= ~var11 ? -1 : 1;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        for (int var28 = var10; var28 < var12; ++var28) {
                            int var29 = (var28 - var10) * var25 + var26 + 1024;
                            int var30 = var28 & class250.field3824;
                            int var31 = class315.field5126 & var21;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (~var24 < -1) {
                                var24 += -var22;
                                var21 -= -var27;
                            }
                        }
                    }
                }
            }
            return var3;
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field2106[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
    public static final void method1366(boolean arg0, int arg1) {
        try {
            class2.field37 = arg1;
            ++field2099;
            class104.field1524.method304(1);
            if (!arg0) {
                method1365((class63) null, -82);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2106[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static void method1367(int arg0) {
        try {
            field2093 = null;
            if (arg0 > -9) {
                field2105 = null;
            }
            field2105 = null;
            field2095 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2106[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1368(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1369(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
