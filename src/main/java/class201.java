import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class201 extends class187 {

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2695 = "Loading interfaces - ";

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Ljava/lang/String;")
    public String field2700;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "[C")
    public char[] field2701;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "[C")
    public char[] field2703;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "[I")
    public int[] field2698;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[I")
    public int[] field2699;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static final void method1088(int arg0) {
        class235.field3242.method1568(((float) class168.field2125 * 0.1F + 0.7F) * class279.field3788);
        if (arg0 != -50) {
            method1098(-121, -89, -45, (byte) -87);
        }
        field2704++;
        class235.field3242.method1587(class101.field1188, class151.field1916, class5.field40, (float) class173.field2174, (float) class368.field5158, (float) class275.field3713);
        class235.field3242.method1561(class366.field5125);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(CI)I")
    public final int method1089(char arg0, int arg1) {
        field2693++;
        if (this.field2698 == null) {
            return -1;
        } else if (arg1 >= -69) {
            return -60;
        } else {
            for (int var3 = 0; var3 < this.field2698.length; var3++) {
                if (this.field2701[var3] == arg0) {
                    return this.field2698[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(CB)I")
    public final int method1090(char arg0, byte arg1) {
        field2691++;
        if (this.field2699 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 <= 47) {
            this.field2703 = null;
        }
        while (this.field2699.length > var3) {
            if (this.field2703[var3] == arg0) {
                return this.field2699[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILtq;)V")
    public final void method1091(int arg0, class250 arg1) {
        field2697++;
        if (arg0 != 28036) {
            return;
        }
        while (true) {
            int var3 = arg1.method1350(31351);
            if (var3 == 0) {
                return;
            }
            this.method1092(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILtq;)V")
    private final void method1092(int arg0, int arg1, class250 arg2) {
        if (arg0 == arg1) {
            this.field2700 = arg2.method1349(-1754884856);
        } else if (arg1 == 2) {
            int var4 = arg2.method1350(31351);
            this.field2698 = new int[var4];
            this.field2701 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2698[var5] = arg2.method1374(-2);
                byte var6 = arg2.method1363((byte) -25);
                this.field2701[var5] = var6 == 0 ? 0 : class199.method1066(var6, false);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method1350(arg0 + 31350);
            this.field2703 = new char[var7];
            this.field2699 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2699[var8] = arg2.method1374(-2);
                byte var9 = arg2.method1363((byte) -106);
                this.field2703[var8] = var9 == 0 ? 0 : class199.method1066(var9, false);
            }
        }
        field2692++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1093(byte arg0, String arg1) {
        field2705++;
        if (arg1 == null) {
            return;
        }
        String var2 = class88.method482((byte) 118, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class88.field993; var3++) {
            String var4 = class88.method482((byte) 64, class198.field2647[var3]);
            if (var4 != null && var4.equals(var2)) {
                class88.field993--;
                for (int var5 = var3; var5 < class88.field993; var5++) {
                    class198.field2647[var5] = class198.field2647[var5 + 1];
                    class182.field2309[var5] = class182.field2309[var5 + 1];
                    class392.field5645[var5] = class392.field5645[var5 + 1];
                    class260.field3566[var5] = class260.field3566[var5 + 1];
                    class232.field3188[var5] = class232.field3188[var5 + 1];
                    class230.field3176[var5] = class230.field3176[var5 + 1];
                }
                class62.field632++;
                class36.field378 = class367.field5142;
                class281.field3857.method295(arg0 + 20624, 35);
                class281.field3857.method1386(-222840624, class75.method426(arg0 ^ -28584, arg1));
                class281.field3857.method1343(arg1, 22608);
                break;
            }
        }
        if (arg0 != -45) {
            method1097(false, -43, 1, -90, -40, -50);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1094(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2696++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        if (arg1 != 35) {
            return;
        }
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        if (arg5 >= class335.field4462 && class6.field42 >= arg5) {
            int[] var38 = class153.field1932[arg5];
            int var39 = class104.method556(class322.field4306, 2048, arg6 - arg2, class310.field4183);
            int var40 = class104.method556(class322.field4306, 2048, arg6 + arg2, class310.field4183);
            int var41 = class104.method556(class322.field4306, 2048, arg6 - var11, class310.field4183);
            int var42 = class104.method556(class322.field4306, 2048, arg6 + var11, class310.field4183);
            class296.method1740(var39, var38, (byte) 81, arg4, var41);
            class296.method1740(var41, var38, (byte) 81, arg0, var42);
            class296.method1740(var42, var38, (byte) 81, arg4, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class335.field4462 && var45 <= class6.field42) {
                int var47 = class104.method556(class322.field4306, arg1 ^ 0x823, arg6 + var8, class310.field4183);
                int var48 = class104.method556(class322.field4306, 2048, arg6 - var8, class310.field4183);
                if (var44) {
                    int var49 = class104.method556(class322.field4306, 2048, arg6 + var10, class310.field4183);
                    int var50 = class104.method556(class322.field4306, 2048, arg6 - var10, class310.field4183);
                    if (class335.field4462 <= var45) {
                        int[] var51 = class153.field1932[var45];
                        class296.method1740(var48, var51, (byte) 81, arg4, var50);
                        class296.method1740(var50, var51, (byte) 81, arg0, var49);
                        class296.method1740(var49, var51, (byte) 81, arg4, var47);
                    }
                    if (var46 <= class6.field42) {
                        int[] var52 = class153.field1932[var46];
                        class296.method1740(var48, var52, (byte) 81, arg4, var50);
                        class296.method1740(var50, var52, (byte) 81, arg0, var49);
                        class296.method1740(var49, var52, (byte) 81, arg4, var47);
                    }
                } else {
                    if (class335.field4462 <= var45) {
                        class296.method1740(var48, class153.field1932[var45], (byte) 81, arg4, var47);
                    }
                    if (class6.field42 >= var46) {
                        class296.method1740(var48, class153.field1932[var46], (byte) 81, arg4, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field2695 = null;
        if (arg0 != -82) {
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public final void method1096(int arg0) {
        if (this.field2699 != null) {
            for (int var2 = 0; var2 < this.field2699.length; var2++) {
                this.field2699[var2] = class392.method2441(this.field2699[var2], 32768);
            }
        }
        if (arg0 != 32174) {
            return;
        }
        field2690++;
        if (this.field2698 != null) {
            for (int var3 = 0; var3 < this.field2698.length; var3++) {
                this.field2698[var3] = class392.method2441(this.field2698[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1097(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2702++;
        if (class176.field2209 == null) {
            class88.field1003.method1860(arg1, arg2 ^ 0x4C14, arg3, arg4, arg5, -16777216);
            return;
        }
        class127.field1642++;
        if (arg2 != -16596) {
            field2695 = null;
        }
        if (class427.field6264 != null && (class427.field6264.field152 - ((class427.field6264.method857((byte) -106) - 1) * 64) >> 7) == class324.field4321 && class427.field6264.field154 - (class427.field6264.method857((byte) -106) - 1) * 64 >> 7 == class149.field1894) {
            class149.field1894 = -1;
            class324.field4321 = -1;
            class200.method1075(9);
        }
        class149.method799((byte) 62);
        if (!arg0) {
            class372.method2242(0);
        }
        class339.method1981(14);
        class142.method772(arg5, (byte) 87, arg1, true, arg4, arg3);
        int var6 = class376.field5279;
        int var7 = class189.field2396;
        int var8 = class71.field788;
        int var9 = class409.field5910;
        if (class294.field3993 == 1) {
            int var12 = (int) class41.field432;
            if (class96.field1142 >> 8 > var12) {
                var12 = class96.field1142 >> 8;
            }
            if (class118.field1473[4] && (class109.field1340[4] + 128) > var12) {
                var12 = class109.field1340[4] + 128;
            }
            int var13 = (int) class425.field6241 + class401.field5857 & 0x3FFF;
            class319.method1837(var12, (var12 >> 3) * 3 + 600, var13, class275.field3706, method1098(class427.field6264.field152, class427.field6264.field154, class263.field3592, (byte) -121) - 50, var6, 2087999407, class449.field6526);
        } else if (class294.field3993 == 4) {
            int var10 = (int) class41.field432;
            if (var10 < (class96.field1142 >> 8)) {
                var10 = class96.field1142 >> 8;
            }
            if (class118.field1473[4] && var10 < class109.field1340[4] + 128) {
                var10 = class109.field1340[4] + 128;
            }
            int var11 = (int) class425.field6241 & 0x3FFF;
            class319.method1837(var10, (var10 >> 3) * 3 + 600, var11, class275.field3706, method1098(class274.field3698, class91.field1030, class263.field3592, (byte) -121) - 50, var6, 2087999407, class449.field6526);
        } else if (class294.field3993 == 5) {
            class390.method2428(var6, arg2 + 16517);
        }
        int var14 = class127.field1633;
        int var15 = class175.field2197;
        int var16 = class180.field2272;
        int var17 = class67.field700;
        int var18 = class308.field4177;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class118.field1473[var19]) {
                int var22 = (int) (Math.random() * (double) (class225.field3045[var19] * 2 + 1) + Math.sin((double) class284.field3876[var19] / 100.0D * (double) class409.field5926[var19]) * (double) class109.field1340[var19] - (double) class225.field3045[var19]);
                if (var19 == 2) {
                    class180.field2272 += var22;
                }
                if (var19 == 4) {
                    class67.field700 += var22;
                    if (class67.field700 < 1024) {
                        class67.field700 = 1024;
                    } else if (class67.field700 > 3072) {
                        class67.field700 = 3072;
                    }
                }
                if (var19 == 1) {
                    class175.field2197 += var22;
                }
                if (var19 == 3) {
                    class308.field4177 = class308.field4177 + var22 & 0x3FFF;
                }
                if (var19 == 0) {
                    class127.field1633 += var22;
                }
            }
        }
        if (class127.field1633 < 0) {
            class127.field1633 = 0;
        }
        if (class180.field2272 < 0) {
            class180.field2272 = 0;
        }
        if ((class231.field3184 << 7) - 1 < class127.field1633) {
            class127.field1633 = (class231.field3184 << 7) - 1;
        }
        if ((class209.field2840 << 7) - 1 < class180.field2272) {
            class180.field2272 = (class209.field2840 << 7) - 1;
        }
        class156.method838(arg2 ^ 0xFFFFBF2D);
        class419.method2604((byte) 41);
        class88.field1003.method1648(var9, var7, var8 + var9, var7 - -var6);
        class88.field1003.method1613();
        int var20 = class44.field455;
        if (class318.field4233 == null) {
            class88.field1003.method1578(var20);
        } else {
            class318.field4233.method1190(var9, class88.field1003, class67.field700, (byte) 51, class138.field1773 << 3, var6, var8, class308.field4177, var7, var20);
        }
        class449.method2771(-32);
        class62.field635.method750(class127.field1633, class175.field2197, class180.field2272, -class67.field700 & 0x3FFF, -class308.field4177 & 0x3FFF, -class92.field1054 & 0x3FFF);
        class88.field1003.method1611(class62.field635);
        class88.field1003.method1589(var8 / 2 + var9, var6 / 2 + var7, class189.field2397 << 1, class189.field2397 << 1);
        class337.method1965(var6 / 2 + var7, var8 / 2 + var9, (byte) -121, class189.field2397 << 1, class189.field2397 << 1);
        class115.method620(class180.field2272, -class308.field4177 & 0x3FFF, class127.field1633, -class92.field1054 & 0x3FFF, -class67.field700 & 0x3FFF, class175.field2197, 127);
        byte var21 = class330.method1891(true) == 2 ? (byte) class127.field1642 : 1;
        class254.method1437(class88.field1003, class234.field3224, class353.field4935, class62.field635, class127.field1633, class175.field2197, class180.field2272, class452.field6580, class204.field2748, class434.field6346, class181.field2276, class448.field6515, class143.field1826, class263.field3592 + 1, var21, class427.field6264.field152 >> 7, class427.field6264.field154 >> 7, !class448.field6510);
        class449.method2771(-32);
        if (class129.field1664 == 30) {
            class295.method1732(var7, 256, (byte) 111, 256, var8, var9, var6);
            class42.method199(var7, var9, arg2 ^ 0xFFFFB67A, 256, var8, 256, var6);
            class372.method2243(256, var7, 256, var6, var8, (byte) -1, var9);
            class205.method1113(var7, var6, -121, var9, var8);
        }
        class129.method693();
        class175.field2197 = var15;
        class67.field700 = var17;
        class308.field4177 = var18;
        class180.field2272 = var16;
        class127.field1633 = var14;
        if (class160.field2063 && class91.field1032.method2194(2) == 0) {
            class160.field2063 = false;
        }
        if (class160.field2063) {
            class88.field1003.method1860(var7, arg2 ^ 0x4C14, var8, var9, var6, -16777216);
            class88.method484(class105.field1296, 0, class337.field4499, false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIB)I")
    public static final int method1098(int arg0, int arg1, int arg2, byte arg3) {
        field2694++;
        if (class98.field1161 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class315.field4214 - 1 || class340.field4549 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class282.field3872[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        int var7 = -92 % ((arg3 + 64) / 38);
        return class98.field1161[var6].method265(arg0, arg1);
    }
}
