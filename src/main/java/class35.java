import java.awt.Container;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class35 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lab;")
    public static class279 field699 = new class279(260);

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Z")
    public static boolean field707 = true;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "J")
    public long field702;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lfd;")
    public static class206 field695;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Laa;")
    public class35 field701;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Laa;")
    public class35 field703;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 10)
    public final void method278(byte arg0) {
        field700++;
        if (arg0 == -105 && this.field703 != null) {
            this.field703.field701 = this.field701;
            this.field701.field703 = this.field703;
            this.field701 = null;
            this.field703 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z", line = 30)
    public final boolean method279(boolean arg0) {
        field706++;
        if (this.field703 == null) {
            return false;
        } else {
            if (arg0) {
                field707 = false;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 51)
    public static void method280(byte arg0) {
        field699 = null;
        field695 = null;
        if (arg0 != -121) {
            field699 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V", line = 66)
    public static final void method281(byte arg0) {
        field697++;
        Container var1;
        if (class177.field2866 != null) {
            var1 = class177.field2866;
        } else if (class283.field4376 == null) {
            var1 = class177.field2849.field2139;
        } else {
            var1 = class283.field4376;
        }
        class61.field1183 = var1.getSize().width;
        if (arg0 > -15) {
            method283(true, -127);
        }
        class177.field2864 = var1.getSize().height;
        if (class283.field4376 == var1) {
            Insets var2 = class283.field4376.getInsets();
            class61.field1183 -= var2.right + var2.left;
            class177.field2864 -= var2.top + var2.bottom;
        }
        if (class241.method1595(2) >= 2) {
            class123.field2122 = 0;
            class294.field4488 = 0;
            class88.field1658 = class61.field1183;
            class134.field2257 = class177.field2864;
        } else {
            class134.field2257 = 503;
            class88.field1658 = 765;
            class294.field4488 = (class61.field1183 - 765) / 2;
            class123.field2122 = 0;
        }
        if (class249.field3893) {
            class249.method1649(class88.field1658, class134.field2257);
        }
        class216.field3456.setSize(class88.field1658, class134.field2257);
        if (class283.field4376 == var1) {
            Insets var3 = class283.field4376.getInsets();
            class216.field3456.setLocation(class294.field4488 + var3.left, class123.field2122 + var3.top);
        } else {
            class216.field3456.setLocation(class294.field4488, class123.field2122);
        }
        if (class158.field2580 != -1) {
            class86.method600((byte) -20, true);
        }
        class334.method2300(0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V", line = 129)
    public static final void method282(int arg0, byte arg1) {
        if (!class290.field4460) {
            arg0 = -1;
        }
        field694++;
        if (class280.field4315 == arg0) {
            return;
        }
        if (arg1 < 88) {
            method285((byte) 21, 35, 100, -82);
        }
        if (arg0 != -1) {
            class146 var2 = class324.method2247((byte) 57, arg0);
            class206 var3 = var2.method953((byte) -111);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class177.field2849.method819(new Point(var2.field2385, var2.field2395), var3.field4373, var3.field4375, class216.field3456, (byte) -89, var3.method1390());
                class280.field4315 = arg0;
            }
        }
        if (arg0 == -1 && class280.field4315 != -1) {
            class177.field2849.method819(new Point(), -1, -1, class216.field3456, (byte) -89, (int[]) null);
            class280.field4315 = -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V", line = 168)
    public static final void method283(boolean arg0, int arg1) {
        class121.field2093 = arg0;
        if (arg1 != -4221) {
            field699 = (class279) null;
        }
        if (class121.field2093) {
            int var2 = class190.field3082.method1304(-116);
            int var3 = class190.field3082.method1304(arg1 ^ 0x1000);
            int var4 = class190.field3082.method1325((byte) -51);
            int var5 = class190.field3082.method1322((byte) 98);
            class190.field3082.method77(0);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    for (int var8 = 0; var8 < 13; var8++) {
                        int var9 = class190.field3082.method81(7, 1);
                        if (var9 == 1) {
                            class99.field1748[var6][var7][var8] = class190.field3082.method81(class331.method2296(arg1, -4220), 26);
                        } else {
                            class99.field1748[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            class190.field3082.method84(-123);
            int var10 = (class250.field3926 - class190.field3082.field3249) / 16;
            class45.field934 = new int[var10][4];
            for (int var11 = 0; var11 < var10; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    class45.field934[var11][var12] = class190.field3082.method1335(false);
                }
            }
            int var13 = class190.field3082.method1323(-3);
            boolean var14 = class185.method1182((byte) 126, class190.field3082.method1317((byte) -87));
            class95.field1708 = new int[var10];
            class218.field3458 = new byte[var10][];
            class131.field2228 = new int[var10];
            class164.field2654 = new byte[var10][];
            class292.field4474 = (byte[][]) null;
            class18.field334 = new int[var10];
            class72.field1502 = new byte[var10][];
            class31.field626 = null;
            client.field905 = new byte[var10][];
            class85.field1602 = new int[var10];
            class334.field5125 = new int[var10];
            int var15 = 0;
            for (int var16 = 0; var16 < 4; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    for (int var18 = 0; var18 < 13; var18++) {
                        int var19 = class99.field1748[var16][var17][var18];
                        if (var19 != -1) {
                            int var20 = (var19 & 0xFFD8DD) >> 14;
                            int var21 = (var19 & 0x3FF9) >> 3;
                            int var22 = (var20 / 8 << 8) + var21 / 8;
                            for (int var23 = 0; var23 < var15; var23++) {
                                if (class95.field1708[var23] == var22) {
                                    var22 = -1;
                                    break;
                                }
                            }
                            if (var22 != -1) {
                                class95.field1708[var15] = var22;
                                int var24 = var22 >> 8 & 0xFF;
                                int var25 = var22 & 0xFF;
                                class334.field5125[var15] = class138.field2304.method2052("m" + var24 + "_" + var25, true);
                                class85.field1602[var15] = class138.field2304.method2052("l" + var24 + "_" + var25, true);
                                class18.field334[var15] = class138.field2304.method2052("um" + var24 + "_" + var25, true);
                                class131.field2228[var15] = class138.field2304.method2052("ul" + var24 + "_" + var25, true);
                                var15++;
                            }
                        }
                    }
                }
            }
            class33.method262(var13, var3, var2, arg1 ^ 0x107C, var14, var4, var5, false);
        } else {
            int var26 = class190.field3082.method1322((byte) 98);
            int var27 = class190.field3082.method1317((byte) -128);
            int var28 = (class250.field3926 - class190.field3082.field3249) / 16;
            class45.field934 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var30 = 0; var30 < 4; var30++) {
                    class45.field934[var29][var30] = class190.field3082.method1346(arg1 + 4260);
                }
            }
            int var31 = class190.field3082.method1304(-120);
            int var32 = class190.field3082.method1322((byte) 98);
            boolean var33 = class185.method1182((byte) 79, class190.field3082.method1317((byte) -71));
            int var34 = class190.field3082.method1315(14289);
            class292.field4474 = (byte[][]) null;
            class31.field626 = null;
            class131.field2228 = new int[var28];
            class164.field2654 = new byte[var28][];
            class334.field5125 = new int[var28];
            class72.field1502 = new byte[var28][];
            class18.field334 = new int[var28];
            class85.field1602 = new int[var28];
            class218.field3458 = new byte[var28][];
            class95.field1708 = new int[var28];
            client.field905 = new byte[var28][];
            int var35 = 0;
            boolean var36 = false;
            if ((var31 / 8 == 48 || (var31 / 8) == 49) && (var26 / 8) == 48) {
                var36 = true;
            }
            if (var31 / 8 == 48 && (var26 / 8) == 148) {
                var36 = true;
            }
            for (int var37 = (var31 - 6) / 8; var37 <= ((var31 + 6) / 8); var37++) {
                for (int var38 = (var26 - 6) / 8; var38 <= (var26 + 6) / 8; var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var36 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class95.field1708[var35] = var39;
                        class334.field5125[var35] = -1;
                        class85.field1602[var35] = -1;
                        class18.field334[var35] = -1;
                        class131.field2228[var35] = -1;
                    } else {
                        class95.field1708[var35] = var39;
                        class334.field5125[var35] = class138.field2304.method2052("m" + var37 + "_" + var38, true);
                        class85.field1602[var35] = class138.field2304.method2052("l" + var37 + "_" + var38, true);
                        class18.field334[var35] = class138.field2304.method2052("um" + var37 + "_" + var38, true);
                        class131.field2228[var35] = class138.field2304.method2052("ul" + var37 + "_" + var38, true);
                    }
                    var35++;
                }
            }
            class33.method262(var31, var34, var26, arg1 ^ 0x107C, var33, var27, var32, false);
        }
        field696++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 416)
    public static final void method284(int arg0) {
        class331.field5087++;
        class14.field263.method80(50, (byte) 115);
        class14.field263.method1311(class241.method1595(2), 10964);
        class14.field263.method1313(class88.field1658, -376480);
        field705++;
        if (arg0 < 1) {
            method283(false, 38);
        }
        class14.field263.method1313(class134.field2257, -376480);
        class14.field263.method1311(class219.field3477, 10964);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIII)I", line = 440)
    public static final int method285(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 118) {
            method283(false, -59);
        }
        field698++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }
}
