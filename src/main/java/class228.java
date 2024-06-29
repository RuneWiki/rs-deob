import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class228 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3689 = "shake:";

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Z")
    public static boolean field3698 = false;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Ldl;")
    public static class123 field3695;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
    public static int[] field3696;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)V")
    public static final void method1559(int arg0, long arg1) {
        field3688++;
        if (arg1 == 0L) {
            return;
        }
        if (!(field3692 < 100 || class237.field3794) || field3692 >= 200) {
            class106.method693("", 0, class92.field1403, (byte) -54);
            return;
        }
        String var3 = class75.method510(-8950, arg1);
        for (int var4 = 0; var4 < field3692; var4++) {
            if (class143.field2101[var4] == arg1) {
                class106.method693("", 0, var3 + class154.field2300, (byte) 64);
                return;
            }
        }
        int var5 = 0;
        if (arg0 != -17413) {
            field3692 = -2;
        }
        while (class141.field2066 > var5) {
            if (class46.field590[var5] == arg1) {
                class106.method693("", 0, class271.field4305 + var3 + class29.field394, (byte) 76);
                return;
            }
            var5++;
        }
        if (var3.equals(class149.field2227.field2912)) {
            class106.method693("", 0, class54.field738, (byte) -94);
            return;
        }
        class120.field1748++;
        class94.field1464[field3692] = var3;
        class143.field2101[field3692] = arg1;
        class143.field2096[field3692] = 0;
        class190.field3013[field3692] = "";
        class7.field104[field3692] = 0;
        class229.field3710[field3692] = false;
        class111.field1681 = class141.field2067;
        field3692++;
        class13.field165.method892(191, (byte) -108);
        class13.field165.method206(-5061, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1560(int arg0) {
        field3689 = null;
        if (arg0 != 0) {
            method1564(103, -67, (byte) -81, -115, 63);
        }
        field3696 = null;
        field3695 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1561(byte arg0) {
        class235.field3766.method893(22452);
        field3697++;
        int var1 = class235.field3766.method887(true, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class235.field3766.method887(true, 2);
        if (var2 == 0) {
            class84.field1316[class164.field2553++] = 2047;
        } else if (arg0 >= 27) {
            if (var2 == 1) {
                int var3 = class235.field3766.method887(true, 3);
                class149.field2227.method570((byte) -117, 1, var3);
                int var4 = class235.field3766.method887(true, 1);
                if (var4 == 1) {
                    class84.field1316[class164.field2553++] = 2047;
                }
            } else if (var2 == 2) {
                if (class235.field3766.method887(true, 1) == 1) {
                    int var6 = class235.field3766.method887(true, 3);
                    class149.field2227.method570((byte) -112, 2, var6);
                    int var7 = class235.field3766.method887(true, 3);
                    class149.field2227.method570((byte) -107, 2, var7);
                } else {
                    int var5 = class235.field3766.method887(true, 3);
                    class149.field2227.method570((byte) -83, 0, var5);
                }
                int var8 = class235.field3766.method887(true, 1);
                if (var8 == 1) {
                    class84.field1316[class164.field2553++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class235.field3766.method887(true, 1);
                class276.field4398 = class235.field3766.method887(true, 2);
                int var10 = class235.field3766.method887(true, 7);
                int var11 = class235.field3766.method887(true, 7);
                int var12 = class235.field3766.method887(true, 1);
                if (var12 == 1) {
                    class84.field1316[class164.field2553++] = 2047;
                }
                class149.field2227.method1295(var10, 768, var11, var9 == 1);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(CB)Z")
    public static final boolean method1562(char arg0, byte arg1) {
        if (arg1 <= 102) {
            method1562('V', (byte) 54);
        }
        field3693++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class46.field581;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lhb;IIIIIIIZ)V")
    public static final void method1563(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class172.field2696;
        int var11;
        int var12 = var11 = (arg7 << 7) - class82.field1285;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class200.field3128[arg1][arg6][arg7] - client.field2328;
        int var18 = class200.field3128[arg1][arg6 + 1][arg7] - client.field2328;
        int var19 = class200.field3128[arg1][arg6 + 1][arg7 + 1] - client.field2328;
        int var20 = class200.field3128[arg1][arg6][arg7 + 1] - client.field2328;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class171.field2673;
        int var46 = (var24 << 9) / var25 + class171.field2682;
        int var47 = (var27 << 9) / var31 + class171.field2673;
        int var48 = (var30 << 9) / var31 + class171.field2682;
        int var49 = (var33 << 9) / var37 + class171.field2673;
        int var50 = (var36 << 9) / var37 + class171.field2682;
        int var51 = (var39 << 9) / var43 + class171.field2673;
        int var52 = (var42 << 9) / var43 + class171.field2682;
        class171.field2674 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class78.field1109 && class115.method764(class171.field2673 + class135.field1964, class5.field74 + class171.field2682, var50, var52, var48, var49, var51, var47)) {
                class139.field2050 = arg6;
                client.field2314 = arg7;
            }
            if (!arg8) {
                class171.field2679 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class171.field2684 || var51 > class171.field2684 || var47 > class171.field2684) {
                    class171.field2679 = true;
                }
                if (arg0.field3517 == -1) {
                    if (arg0.field3505 != 12345678) {
                        class171.method1195(var50, var52, var48, var49, var51, var47, arg0.field3505, arg0.field3512, arg0.field3508);
                    }
                } else if (!class184.field2893) {
                    int var53 = class171.field2689.method259((byte) 92, arg0.field3517);
                    class171.method1195(var50, var52, var48, var49, var51, var47, class226.method1542(var53, arg0.field3505), class226.method1542(var53, arg0.field3512), class226.method1542(var53, arg0.field3508));
                } else if (arg0.field3507) {
                    class171.method1199(var50, var52, var48, var49, var51, var47, arg0.field3505, arg0.field3512, arg0.field3508, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3517);
                } else {
                    class171.method1199(var50, var52, var48, var49, var51, var47, arg0.field3505, arg0.field3512, arg0.field3508, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3517);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class78.field1109 && class115.method764(class171.field2673 + class135.field1964, class5.field74 + class171.field2682, var46, var48, var52, var45, var47, var51)) {
            class139.field2050 = arg6;
            client.field2314 = arg7;
        }
        if (arg8) {
            return;
        }
        class171.field2679 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class171.field2684 || var47 > class171.field2684 || var51 > class171.field2684) {
            class171.field2679 = true;
        }
        if (arg0.field3517 != -1) {
            if (class184.field2893) {
                class171.method1199(var46, var48, var52, var45, var47, var51, arg0.field3513, arg0.field3508, arg0.field3512, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3517);
                return;
            }
            int var54 = class171.field2689.method259((byte) 52, arg0.field3517);
            class171.method1195(var46, var48, var52, var45, var47, var51, class226.method1542(var54, arg0.field3513), class226.method1542(var54, arg0.field3508), class226.method1542(var54, arg0.field3512));
        } else if (arg0.field3513 != 12345678) {
            class171.method1195(var46, var48, var52, var45, var47, var51, arg0.field3513, arg0.field3508, arg0.field3512);
            return;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBII)V")
    public static final void method1564(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -91) {
            field3692 = -15;
        }
        class94.field1463 = -1;
        class57.field804 = -1;
        field3694++;
        class158.field2435 = class104.field1611 * arg4 / arg1;
        class219.field3563 = class165.field2565 * arg0 / arg3;
        class17.method117(13);
    }
}
