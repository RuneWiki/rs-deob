import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class145 {

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "[B")
    public byte[] field2183;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lfc;")
    private static class39 field2177 = class90.method774("To create a new account you need to", -84);

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lfc;")
    public static class39 field2176 = class90.method774(")4l", -110);

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lfc;")
    private static class39 field2184 = class90.method774("On", -93);

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Lfc;")
    public static class39 field2185 = field2184;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lfc;")
    public static class39 field2175 = class90.method774("", -94);

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "Lfc;")
    public static class39 field2186 = field2175;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Lfc;")
    public static class39 field2180 = field2175;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lfc;")
    public static class39 field2174 = field2175;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lfc;")
    public static class39 field2178 = field2175;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lfc;")
    public static class39 field2188 = field2177;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Lfc;")
    public static class39 field2187 = field2175;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Lfc;")
    public static class39 field2182 = field2175;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIIIIIIIII)Z", line = 11)
    public static final boolean method790(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2170++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class139.field3517[var12][var36] = 0;
                class61.field1493[var12][var36] = 99999999;
            }
        }
        class139.field3517[arg10][arg7] = 99;
        class61.field1493[arg10][arg7] = 0;
        int var13 = arg10;
        int var14 = 0;
        int var15 = arg7;
        byte var16 = 0;
        class150.field3713[var16] = arg10;
        boolean var17 = false;
        int var37 = var16 + 1;
        class146.field3633[var16] = arg7;
        int[][] var18 = class117.field3077[class24.field661].field2526;
        int var19 = class150.field3713.length;
        while (var14 != var37) {
            var15 = class146.field3633[var14];
            var13 = class150.field3713[var14];
            var14 = (var14 + 1) % var19;
            if (arg11 == var13 && arg6 == var15) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class117.field3077[class24.field661].method860(arg11, (byte) -35, var13, arg6, arg2, var15, arg8 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class117.field3077[class24.field661].method857(arg8 - 1, 124, arg6, arg2, var15, arg11, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg4 != 0 && class117.field3077[class24.field661].method867(arg9, arg5, arg11, var15, arg4, -1, var13, arg6)) {
                var17 = true;
                break;
            }
            int var35 = class61.field1493[var13][var15] + 1;
            if (var13 > 0 && class139.field3517[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0) {
                class150.field3713[var37] = var13 - 1;
                class146.field3633[var37] = var15;
                var37 = (var37 + 1) % var19;
                class139.field3517[var13 - 1][var15] = 2;
                class61.field1493[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class139.field3517[var13 + 1][var15] == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0) {
                class150.field3713[var37] = var13 + 1;
                class146.field3633[var37] = var15;
                class139.field3517[var13 + 1][var15] = 8;
                class61.field1493[var13 + 1][var15] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var15 > 0 && class139.field3517[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class150.field3713[var37] = var13;
                class146.field3633[var37] = var15 - 1;
                var37 = (var37 + 1) % var19;
                class139.field3517[var13][var15 - 1] = 1;
                class61.field1493[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class139.field3517[var13][var15 + 1] == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class150.field3713[var37] = var13;
                class146.field3633[var37] = var15 + 1;
                class139.field3517[var13][var15 + 1] = 4;
                class61.field1493[var13][var15 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 > 0 && var15 > 0 && class139.field3517[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class150.field3713[var37] = var13 - 1;
                class146.field3633[var37] = var15 - 1;
                class139.field3517[var13 - 1][var15 - 1] = 3;
                class61.field1493[var13 - 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var15 > 0 && class139.field3517[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0 && (var18[var13][var15 - 1] & 0x12C0102) == 0) {
                class150.field3713[var37] = var13 + 1;
                class146.field3633[var37] = var15 - 1;
                class139.field3517[var13 + 1][var15 - 1] = 9;
                var37 = (var37 + 1) % var19;
                class61.field1493[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class139.field3517[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var15] & 0x12C0108) == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class150.field3713[var37] = var13 - 1;
                class146.field3633[var37] = var15 + 1;
                class139.field3517[var13 - 1][var15 + 1] = 6;
                var37 = (var37 + 1) % var19;
                class61.field1493[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class139.field3517[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var15] & 0x12C0180) == 0 && (var18[var13][var15 + 1] & 0x12C0120) == 0) {
                class150.field3713[var37] = var13 + 1;
                class146.field3633[var37] = var15 + 1;
                var37 = (var37 + 1) % var19;
                class139.field3517[var13 + 1][var15 + 1] = 12;
                class61.field1493[var13 + 1][var15 + 1] = var35;
            }
        }
        if (arg1 != -1) {
            field2187 = null;
        }
        class121.field3169 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= arg11 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class61.field1493[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg11 > var23) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg9 + arg11 - 1) {
                            var25 = var23 + 1 - arg11 - arg9;
                        }
                        int var26 = 0;
                        if (arg6 > var24) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg6 + arg4 - 1) {
                            var26 = var24 + 1 - arg6 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class61.field1493[var23][var24]) {
                            var15 = var24;
                            var20 = var27;
                            var21 = class61.field1493[var23][var24];
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg7 == var15) {
                return false;
            }
            class121.field3169 = 1;
        }
        byte var28 = 0;
        class150.field3713[var28] = var13;
        int var38 = var28 + 1;
        class146.field3633[var28] = var15;
        int var29;
        int var30 = var29 = class139.field3517[var13][var15];
        while (arg10 != var13 || arg7 != var15) {
            if (var29 != var30) {
                class150.field3713[var38] = var13;
                var29 = var30;
                class146.field3633[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class139.field3517[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class146.field3633[var38];
            int var33 = class150.field3713[var38];
            if (arg3 == 0) {
                class61.field1503++;
                class79.field1794.method393((byte) -14, 241);
                class79.field1794.method326(var31 + var31 + 3, (byte) -68);
            }
            if (arg3 == 1) {
                class86.field1945++;
                class79.field1794.method393((byte) -14, 156);
                class79.field1794.method326(var31 + var31 + 3 + 14, (byte) -45);
            }
            if (arg3 == 2) {
                class79.field1794.method393((byte) -14, 216);
                class79.field1794.method326(var31 + var31 + 3, (byte) -87);
                class100.field2495++;
            }
            class79.field1794.method281(-1084673848, var32 + class55.field1382);
            class79.field1794.method281(-1084673848, class54.field1341 + var33);
            class72.field1683 = class150.field3713[0];
            class128.field3253 = class146.field3633[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class79.field1794.method316(128, class150.field3713[var38] - var33);
                class79.field1794.method317(class146.field3633[var38] - var32, true);
            }
            class79.field1794.method326(class114.field2988[82] ? 1 : 0, (byte) -76);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIILod;Lac;I)V", line = 358)
    public static final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class101 arg6, class4 arg7, int arg8) {
        field2169++;
        if (class74.field1705 && (class137.field3424[0][arg2][arg0] & 0x2) == 0) {
            if ((class137.field3424[arg5][arg2][arg0] & 0x10) != 0) {
                return;
            }
            if (class71.method657(arg2, 16626, arg0, arg5) != class94.field2207) {
                return;
            }
        }
        if (class143.field3595 > arg5) {
            class143.field3595 = arg5;
        }
        int var9 = class7.field219[arg5][arg2][arg0];
        int var10 = class7.field219[arg5][arg2 + 1][arg0];
        int var11 = class7.field219[arg5][arg2 + 1][arg0 + 1];
        int var12 = class7.field219[arg5][arg2][arg0 + 1];
        class35 var13 = class90.method776(arg8, -123);
        int var14 = (arg3 << 6) + arg1;
        if (var13.field917 == 1) {
            var14 += 256;
        }
        int var15 = (arg8 << 14) + arg2 + (arg0 << 7) + 1073741824;
        if (arg4 <= 115) {
            return;
        }
        if (var13.field959 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = var10 + var12 + var9 + var11 >> 2;
        if (var13.method401((byte) 72)) {
            class26.method333(arg5, true, arg3, arg0, arg2, var13);
        }
        if (arg1 == 22) {
            if (!class74.field1705 || var13.field959 != 0 || var13.field953 == 1 || var13.field946) {
                class113 var17;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var17 = var13.method412(-973389238, var11, var10, var12, arg3, var9, 22);
                } else {
                    var17 = new class112(arg8, 22, arg3, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method62(arg5, arg2, arg0, var16, var17, var15, var14);
                if (var13.field953 == 1 && arg6 != null) {
                    arg6.method868(23, arg2, arg0);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class113 var37;
            if (var13.field915 == -1 && var13.field970 == null) {
                var37 = var13.method412(-973389238, var11, var10, var12, arg3, var9, 10);
            } else {
                var37 = new class112(arg8, 10, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg3 == 1 || arg3 == 3) {
                    var39 = var13.field912;
                    var38 = var13.field930;
                } else {
                    var38 = var13.field912;
                    var39 = var13.field930;
                }
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                if (arg7.method72(arg5, arg2, arg0, var16, var38, var39, var37, var40, var15, var14) && var13.field907) {
                    int var41 = 15;
                    if (var37 instanceof class23) {
                        var41 = ((class23) var37).method268() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (class31.field870[arg5][arg2 + var42][arg0 + var43] < var41) {
                                class31.field870[arg5][arg2 + var42][arg0 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method872(-116, var13.field945, arg0, var13.field912, arg2, var13.field930, arg3);
            }
        } else if (arg1 >= 12) {
            class113 var18;
            if (var13.field915 == -1 && var13.field970 == null) {
                var18 = var13.method412(-973389238, var11, var10, var12, arg3, var9, arg1);
            } else {
                var18 = new class112(arg8, arg1, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method72(arg5, arg2, arg0, var16, 1, 1, var18, 0, var15, var14);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0) {
                class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 2340);
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method872(-112, var13.field945, arg0, var13.field912, arg2, var13.field930, arg3);
            }
        } else if (arg1 == 0) {
            class113 var19;
            if (var13.field915 == -1 && var13.field970 == null) {
                var19 = var13.method412(-973389238, var11, var10, var12, arg3, var9, 0);
            } else {
                var19 = new class112(arg8, 0, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method68(arg5, arg2, arg0, var16, var19, null, class54.field1347[arg3], 0, var15, var14);
            if (arg3 == 0) {
                if (var13.field907) {
                    class31.field870[arg5][arg2][arg0] = 50;
                    class31.field870[arg5][arg2][arg0 + 1] = 50;
                }
                if (var13.field923) {
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 585);
                }
            } else if (arg3 == 1) {
                if (var13.field907) {
                    class31.field870[arg5][arg2][arg0 + 1] = 50;
                    class31.field870[arg5][arg2 + 1][arg0 + 1] = 50;
                }
                if (var13.field923) {
                    class112.field2934[arg5][arg2][arg0 + 1] = class126.method1050(class112.field2934[arg5][arg2][arg0 + 1], 1170);
                }
            } else if (arg3 == 2) {
                if (var13.field907) {
                    class31.field870[arg5][arg2 + 1][arg0] = 50;
                    class31.field870[arg5][arg2 + 1][arg0 + 1] = 50;
                }
                if (var13.field923) {
                    class112.field2934[arg5][arg2 + 1][arg0] = class126.method1050(class112.field2934[arg5][arg2 + 1][arg0], 585);
                }
            } else if (arg3 == 3) {
                if (var13.field907) {
                    class31.field870[arg5][arg2][arg0] = 50;
                    class31.field870[arg5][arg2 + 1][arg0] = 50;
                }
                if (var13.field923) {
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 1170);
                }
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method869(arg0, arg2, (byte) 4, arg1, var13.field945, arg3);
            }
            if (var13.field955 != 16) {
                arg7.method30(arg5, arg2, arg0, var13.field955);
            }
        } else if (arg1 == 1) {
            class113 var20;
            if (var13.field915 == -1 && var13.field970 == null) {
                var20 = var13.method412(-973389238, var11, var10, var12, arg3, var9, 1);
            } else {
                var20 = new class112(arg8, 1, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method68(arg5, arg2, arg0, var16, var20, null, class1.field12[arg3], 0, var15, var14);
            if (var13.field907) {
                if (arg3 == 0) {
                    class31.field870[arg5][arg2][arg0 + 1] = 50;
                } else if (arg3 == 1) {
                    class31.field870[arg5][arg2 + 1][arg0 + 1] = 50;
                } else if (arg3 == 2) {
                    class31.field870[arg5][arg2 + 1][arg0] = 50;
                } else if (arg3 == 3) {
                    class31.field870[arg5][arg2][arg0] = 50;
                }
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method869(arg0, arg2, (byte) -75, arg1, var13.field945, arg3);
            }
        } else if (arg1 == 2) {
            int var21 = arg3 + 1 & 0x3;
            class113 var22;
            class113 var23;
            if (var13.field915 == -1 && var13.field970 == null) {
                var22 = var13.method412(-973389238, var11, var10, var12, arg3 + 4, var9, 2);
                var23 = var13.method412(-973389238, var11, var10, var12, var21, var9, 2);
            } else {
                var22 = new class112(arg8, 2, arg3 + 4, var9, var10, var11, var12, var13.field915, true, null);
                var23 = new class112(arg8, 2, var21, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method68(arg5, arg2, arg0, var16, var22, var23, class54.field1347[arg3], class54.field1347[var21], var15, var14);
            if (var13.field923) {
                if (arg3 == 0) {
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 585);
                    class112.field2934[arg5][arg2][arg0 + 1] = class126.method1050(class112.field2934[arg5][arg2][arg0 + 1], 1170);
                } else if (arg3 == 1) {
                    class112.field2934[arg5][arg2][arg0 + 1] = class126.method1050(class112.field2934[arg5][arg2][arg0 + 1], 1170);
                    class112.field2934[arg5][arg2 + 1][arg0] = class126.method1050(class112.field2934[arg5][arg2 + 1][arg0], 585);
                } else if (arg3 == 2) {
                    class112.field2934[arg5][arg2 + 1][arg0] = class126.method1050(class112.field2934[arg5][arg2 + 1][arg0], 585);
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 1170);
                } else if (arg3 == 3) {
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 1170);
                    class112.field2934[arg5][arg2][arg0] = class126.method1050(class112.field2934[arg5][arg2][arg0], 585);
                }
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method869(arg0, arg2, (byte) -72, arg1, var13.field945, arg3);
            }
            if (var13.field955 != 16) {
                arg7.method30(arg5, arg2, arg0, var13.field955);
            }
        } else if (arg1 == 3) {
            class113 var24;
            if (var13.field915 == -1 && var13.field970 == null) {
                var24 = var13.method412(-973389238, var11, var10, var12, arg3, var9, 3);
            } else {
                var24 = new class112(arg8, 3, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method68(arg5, arg2, arg0, var16, var24, null, class1.field12[arg3], 0, var15, var14);
            if (var13.field907) {
                if (arg3 == 0) {
                    class31.field870[arg5][arg2][arg0 + 1] = 50;
                } else if (arg3 == 1) {
                    class31.field870[arg5][arg2 + 1][arg0 + 1] = 50;
                } else if (arg3 == 2) {
                    class31.field870[arg5][arg2 + 1][arg0] = 50;
                } else if (arg3 == 3) {
                    class31.field870[arg5][arg2][arg0] = 50;
                }
            }
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method869(arg0, arg2, (byte) -74, arg1, var13.field945, arg3);
            }
        } else if (arg1 == 9) {
            class113 var25;
            if (var13.field915 == -1 && var13.field970 == null) {
                var25 = var13.method412(-973389238, var11, var10, var12, arg3, var9, arg1);
            } else {
                var25 = new class112(arg8, arg1, arg3, var9, var10, var11, var12, var13.field915, true, null);
            }
            arg7.method72(arg5, arg2, arg0, var16, 1, 1, var25, 0, var15, var14);
            if (var13.field953 != 0 && arg6 != null) {
                arg6.method872(-122, var13.field945, arg0, var13.field912, arg2, var13.field930, arg3);
            }
        } else {
            if (var13.field924) {
                if (arg3 == 1) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var26;
                } else if (arg3 == 2) {
                    int var27 = var12;
                    var12 = var10;
                    var10 = var27;
                    int var28 = var11;
                    var11 = var9;
                    var9 = var28;
                } else if (arg3 == 3) {
                    int var29 = var12;
                    var12 = var9;
                    var9 = var10;
                    var10 = var11;
                    var11 = var29;
                }
            }
            if (arg1 == 4) {
                class113 var30;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var30 = var13.method412(-973389238, var11, var10, var12, 0, var9, 4);
                } else {
                    var30 = new class112(arg8, 4, 0, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method37(arg5, arg2, arg0, var16, var30, class54.field1347[arg3], arg3 * 512, 0, 0, var15, var14);
            } else if (arg1 == 5) {
                int var31 = 16;
                int var32 = arg7.method48(arg5, arg2, arg0);
                if (var32 != 0) {
                    var31 = class90.method776(var32 >> 14 & 0x7FFF, -120).field955;
                }
                class113 var33;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var33 = var13.method412(-973389238, var11, var10, var12, 0, var9, 4);
                } else {
                    var33 = new class112(arg8, 4, 0, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method37(arg5, arg2, arg0, var16, var33, class54.field1347[arg3], arg3 * 512, class71.field1657[arg3] * var31, class112.field2941[arg3] * var31, var15, var14);
            } else if (arg1 == 6) {
                class113 var34;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var34 = var13.method412(-973389238, var11, var10, var12, 0, var9, 4);
                } else {
                    var34 = new class112(arg8, 4, 0, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method37(arg5, arg2, arg0, var16, var34, 256, arg3, 0, 0, var15, var14);
            } else if (arg1 == 7) {
                class113 var35;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var35 = var13.method412(-973389238, var11, var10, var12, 0, var9, 4);
                } else {
                    var35 = new class112(arg8, 4, 0, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method37(arg5, arg2, arg0, var16, var35, 512, arg3, 0, 0, var15, var14);
            } else if (arg1 == 8) {
                class113 var36;
                if (var13.field915 == -1 && var13.field970 == null) {
                    var36 = var13.method412(-973389238, var11, var10, var12, 0, var9, 4);
                } else {
                    var36 = new class112(arg8, 4, 0, var9, var10, var11, var12, var13.field915, true, null);
                }
                arg7.method37(arg5, arg2, arg0, var16, var36, 768, arg3, 0, 0, var15, var14);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I", line = 865)
    public static final int method792(int arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field2179++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 != 1457791400) {
            field2187 = null;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 890)
    public static void method793(int arg0) {
        field2184 = null;
        field2182 = null;
        field2176 = null;
        field2185 = null;
        field2177 = null;
        field2174 = null;
        field2175 = null;
        field2188 = null;
        field2186 = null;
        field2180 = null;
        field2187 = null;
        field2178 = null;
        if (arg0 != 1) {
            method792(-95, -59);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V", line = 931)
    public class93(byte[] arg0) {
        this.field2183 = arg0;
    }
}
