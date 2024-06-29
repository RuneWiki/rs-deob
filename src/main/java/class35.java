import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 extends OutputStream {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIZIII)Z")
    public static final boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field423++;
        if (arg5 > 2000 || arg4 > 2000 || arg1 > 2000 || arg7 > 2000 || arg8 > 2000 || arg0 > 2000) {
            return false;
        } else if (arg5 < -2000 || arg4 < -2000 || arg1 < -2000 || arg7 < -2000 || arg8 < -2000 || arg0 < -2000) {
            return false;
        } else if (arg6) {
            if (class1.field2 == 2) {
                int var10 = arg7 + (class12.field125 * arg5);
                if (var10 >= 0 && var10 < class129.field1838.length && ((arg2 << 8) - 38400) < class129.field1838[var10]) {
                    return false;
                }
                int var11 = class12.field125 * arg4 + arg8;
                if (var11 >= 0 && var11 < class129.field1838.length && ((arg3 << 8) - 38400) < class129.field1838[var11]) {
                    return false;
                }
                int var12 = class12.field125 * arg1 + arg0;
                if (var12 >= 0 && var12 < class129.field1838.length && (arg9 << 8) - 38400 < class129.field1838[var12]) {
                    return false;
                }
            }
            int var13 = arg8 - arg7;
            int var14 = arg4 - arg5;
            int var15 = arg0 - arg7;
            int var16 = arg1 - arg5;
            int var17 = arg3 - arg2;
            if (arg5 < arg4 && arg1 < arg1) {
                arg5--;
                if (arg4 <= arg1) {
                    arg1++;
                } else {
                    arg4++;
                }
            } else if (arg4 < arg1) {
                arg4--;
                if (arg1 >= arg5) {
                    arg1++;
                } else {
                    arg5++;
                }
            } else {
                arg1--;
                if (arg5 > arg4) {
                    arg5++;
                } else {
                    arg4++;
                }
            }
            int var18 = arg9 - arg2;
            int var19 = 0;
            if (arg4 != arg5) {
                var19 = (arg8 - arg7 << 12) / (arg4 - arg5);
            }
            int var20 = 0;
            if (arg1 != arg4) {
                var20 = (arg0 - arg8 << 12) / (arg1 - arg4);
            }
            int var21 = 0;
            if (arg1 != arg5) {
                var21 = (arg7 - arg0 << 12) / (arg5 - arg1);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg5 <= arg4 && arg5 <= arg1) {
                if (arg5 >= class672.field9426) {
                    return true;
                }
                if (class672.field9426 < arg1) {
                    arg1 = class672.field9426;
                }
                int var25 = (arg2 << 8) + var23 - (arg7 * var23);
                if (class672.field9426 < arg4) {
                    arg4 = class672.field9426;
                }
                if (arg1 > arg4) {
                    int var26;
                    int var27 = var26 = arg7 << 12;
                    if (arg5 < 0) {
                        var27 -= arg5 * var21;
                        var25 -= arg5 * var24;
                        var26 -= arg5 * var19;
                        arg5 = 0;
                    }
                    int var28 = arg8 << 12;
                    if (arg4 < 0) {
                        var28 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg4 != arg5 && var21 < var19 || arg4 == arg5 && var21 > var20) {
                        int var29 = arg1 - arg4;
                        int var30 = arg4 - arg5;
                        int var31 = class12.field125 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var28 >> 12) + 1, var23, (byte) 102, class129.field1838, var25, var31, 0, (var27 >> 12) - 1)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var27 += var21;
                                    var25 += var24;
                                    var31 += class12.field125;
                                }
                            }
                            if (!class235.method1478((var26 >> 12) + 1, var23, (byte) 76, class129.field1838, var25, var31, 0, (var27 >> 12) - 1)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var27 += var21;
                            var31 += class12.field125;
                        }
                    } else {
                        int var32 = arg1 - arg4;
                        int var33 = arg4 - arg5;
                        int var34 = class12.field125 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var27 >> 12) + 1, var23, (byte) 108, class129.field1838, var25, var34, 0, (var28 >> 12) - 1)) {
                                        return false;
                                    }
                                    var27 += var21;
                                    var34 += class12.field125;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class235.method1478((var27 >> 12) + 1, var23, (byte) 64, class129.field1838, var25, var34, 0, (var26 >> 12) - 1)) {
                                return false;
                            }
                            var25 += var24;
                            var34 += class12.field125;
                            var26 += var19;
                            var27 += var21;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg7 << 12;
                    if (arg5 < 0) {
                        var35 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var37 = arg0 << 12;
                    if (arg1 < 0) {
                        var37 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if (arg1 != arg5 && var21 < var19 || arg1 == arg5 && var19 < var20) {
                        int var38 = arg4 - arg1;
                        int var39 = arg1 - arg5;
                        int var40 = class12.field125 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var35 >> 12) + 1, var23, (byte) 105, class129.field1838, var25, var40, 0, (var37 >> 12) - 1)) {
                                        return false;
                                    }
                                    var35 += var19;
                                    var40 += class12.field125;
                                    var37 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class235.method1478((var35 >> 12) + 1, var23, (byte) 98, class129.field1838, var25, var40, 0, (var36 >> 12) - 1)) {
                                return false;
                            }
                            var35 += var19;
                            var40 += class12.field125;
                            var36 += var21;
                            var25 += var24;
                        }
                    } else {
                        int var41 = arg4 - arg1;
                        int var42 = arg1 - arg5;
                        int var43 = class12.field125 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var37 >> 12) + 1, var23, (byte) 72, class129.field1838, var25, var43, 0, (var35 >> 12) - 1)) {
                                        return false;
                                    }
                                    var43 += class12.field125;
                                    var35 += var19;
                                    var25 += var24;
                                    var37 += var20;
                                }
                            }
                            if (!class235.method1478((var36 >> 12) + 1, var23, (byte) 126, class129.field1838, var25, var43, 0, (var35 >> 12) - 1)) {
                                return false;
                            }
                            var36 += var21;
                            var35 += var19;
                            var25 += var24;
                            var43 += class12.field125;
                        }
                    }
                }
            } else if (arg1 < arg4) {
                if (arg1 >= class672.field9426) {
                    return true;
                }
                if (arg4 > class672.field9426) {
                    arg4 = class672.field9426;
                }
                if (class672.field9426 < arg5) {
                    arg5 = class672.field9426;
                }
                int var44 = (arg9 << 8) + var23 - (arg0 * var23);
                if (arg4 <= arg5) {
                    int var45;
                    int var46 = var45 = arg0 << 12;
                    if (arg1 < 0) {
                        var46 -= arg1 * var20;
                        var45 -= arg1 * var21;
                        var44 -= arg1 * var24;
                        arg1 = 0;
                    }
                    int var47 = arg8 << 12;
                    if (arg4 < 0) {
                        var47 -= arg4 * var19;
                        arg4 = 0;
                    }
                    if (var20 >= var21) {
                        int var48 = arg5 - arg4;
                        int var49 = arg4 - arg1;
                        int var50 = class12.field125 * arg1;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var47 >> 12) + 1, var23, (byte) 102, class129.field1838, var44, var50, 0, (var45 >> 12) - 1)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var44 += var24;
                                    var47 += var19;
                                    var50 += class12.field125;
                                }
                            }
                            if (!class235.method1478((var46 >> 12) + 1, var23, (byte) 95, class129.field1838, var44, var50, 0, (var45 >> 12) - 1)) {
                                return false;
                            }
                            var50 += class12.field125;
                            var45 += var21;
                            var46 += var20;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg5 - arg4;
                        int var52 = arg4 - arg1;
                        int var53 = class12.field125 * arg1;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var45 >> 12) + 1, var23, (byte) 106, class129.field1838, var44, var53, 0, (var47 >> 12) - 1)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var53 += class12.field125;
                                    var44 += var24;
                                    var47 += var19;
                                }
                            }
                            if (!class235.method1478((var45 >> 12) + 1, var23, (byte) 76, class129.field1838, var44, var53, 0, (var46 >> 12) - 1)) {
                                return false;
                            }
                            var45 += var21;
                            var53 += class12.field125;
                            var46 += var20;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg0 << 12;
                    int var56 = arg7 << 12;
                    if (arg1 < 0) {
                        var54 -= arg1 * var21;
                        var55 -= arg1 * var20;
                        var44 -= arg1 * var24;
                        arg1 = 0;
                    }
                    if (arg5 < 0) {
                        var56 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var20 >= var21) {
                        int var57 = arg4 - arg5;
                        int var58 = arg5 - arg1;
                        int var59 = class12.field125 * arg1;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var55 >> 12) + 1, var23, (byte) 81, class129.field1838, var44, var59, 0, (var56 >> 12) - 1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var19;
                                    var59 += class12.field125;
                                    var55 += var20;
                                }
                            }
                            if (!class235.method1478((var55 >> 12) + 1, var23, (byte) 126, class129.field1838, var44, var59, 0, (var54 >> 12) - 1)) {
                                return false;
                            }
                            var54 += var21;
                            var59 += class12.field125;
                            var44 += var24;
                            var55 += var20;
                        }
                    } else {
                        int var60 = arg4 - arg5;
                        int var61 = arg5 - arg1;
                        int var62 = class12.field125 * arg1;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var56 >> 12) + 1, var23, (byte) 107, class129.field1838, var44, var62, 0, (var55 >> 12) - 1)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var55 += var20;
                                    var62 += class12.field125;
                                    var44 += var24;
                                }
                            }
                            if (!class235.method1478((var54 >> 12) + 1, var23, (byte) 68, class129.field1838, var44, var62, 0, (var55 >> 12) - 1)) {
                                return false;
                            }
                            var44 += var24;
                            var54 += var21;
                            var62 += class12.field125;
                            var55 += var20;
                        }
                    }
                }
            } else if (class672.field9426 <= arg4) {
                return true;
            } else {
                if (class672.field9426 < arg1) {
                    arg1 = class672.field9426;
                }
                if (arg5 > class672.field9426) {
                    arg5 = class672.field9426;
                }
                int var63 = (arg3 << 8) - (arg8 * var23 - var23);
                if (arg5 <= arg1) {
                    int var64;
                    int var65 = var64 = arg8 << 12;
                    int var66 = arg7 << 12;
                    if (arg4 < 0) {
                        var65 -= arg4 * var19;
                        var63 -= arg4 * var24;
                        var64 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg5 < 0) {
                        var66 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var20 > var19) {
                        int var67 = arg1 - arg5;
                        int var68 = arg5 - arg4;
                        int var69 = class12.field125 * arg4;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var64 >> 12) + 1, var23, (byte) 84, class129.field1838, var63, var69, 0, (var66 >> 12) - 1)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var66 += var21;
                                    var64 += var20;
                                    var69 += class12.field125;
                                }
                            }
                            if (!class235.method1478((var64 >> 12) + 1, var23, (byte) 122, class129.field1838, var63, var69, 0, (var65 >> 12) - 1)) {
                                return false;
                            }
                            var64 += var20;
                            var65 += var19;
                            var63 += var24;
                            var69 += class12.field125;
                        }
                    } else {
                        int var70 = arg1 - arg5;
                        int var71 = arg5 - arg4;
                        int var72 = class12.field125 * arg4;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var66 >> 12) + 1, var23, (byte) 122, class129.field1838, var63, var72, 0, (var64 >> 12) - 1)) {
                                        return false;
                                    }
                                    var72 += class12.field125;
                                    var64 += var20;
                                    var63 += var24;
                                    var66 += var21;
                                }
                            }
                            if (!class235.method1478((var65 >> 12) + 1, var23, (byte) 110, class129.field1838, var63, var72, 0, (var64 >> 12) - 1)) {
                                return false;
                            }
                            var72 += class12.field125;
                            var63 += var24;
                            var65 += var19;
                            var64 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg8 << 12;
                    int var75 = arg0 << 12;
                    if (arg4 < 0) {
                        var74 -= arg4 * var19;
                        var63 -= arg4 * var24;
                        var73 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg1 < 0) {
                        var75 -= arg1 * var21;
                        arg1 = 0;
                    }
                    if ((arg1 == arg4 || var20 <= var19) && (arg1 != arg4 || var21 >= var19)) {
                        int var79 = arg5 - arg1;
                        int var80 = arg1 - arg4;
                        int var81 = class12.field125 * arg4;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var74 >> 12) + 1, var23, (byte) 98, class129.field1838, var63, var81, 0, (var75 >> 12) - 1)) {
                                        return false;
                                    }
                                    var74 += var19;
                                    var63 += var24;
                                    var75 += var21;
                                    var81 += class12.field125;
                                }
                            }
                            if (!class235.method1478((var74 >> 12) + 1, var23, (byte) 118, class129.field1838, var63, var81, 0, (var73 >> 12) - 1)) {
                                return false;
                            }
                            var63 += var24;
                            var74 += var19;
                            var73 += var20;
                            var81 += class12.field125;
                        }
                    } else {
                        int var76 = arg5 - arg1;
                        int var77 = arg1 - arg4;
                        int var78 = class12.field125 * arg4;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class235.method1478((var75 >> 12) + 1, var23, (byte) 83, class129.field1838, var63, var78, 0, (var74 >> 12) - 1)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var74 += var19;
                                    var78 += class12.field125;
                                    var75 += var21;
                                }
                            }
                            if (!class235.method1478((var73 >> 12) + 1, var23, (byte) 66, class129.field1838, var63, var78, 0, (var74 >> 12) - 1)) {
                                return false;
                            }
                            var78 += class12.field125;
                            var74 += var19;
                            var73 += var20;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field424++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BZ)V")
    public static final void method312(byte[] arg0, boolean arg1) {
        field425++;
        class501 var2 = new class501(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method2874((byte) -75);
                if (var3 == 0) {
                    if (arg1) {
                        method311(94, -108, 124, -46, -56, 56, true, -29, -45, 109);
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class114.field1578 = new int[6];
                    var4[0] = var2.method2845(-1);
                    var4[1] = var2.method2845(-1);
                    var4[2] = var2.method2845(-1);
                    var4[3] = var2.method2845(-1);
                    var4[4] = var2.method2845(-1);
                    var4[5] = var2.method2845(-1);
                } else if (var3 == 4) {
                    int var7 = var2.method2874((byte) -75);
                    class483.field6635 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class483.field6635[var8] = var2.method2845(-1);
                        if (class483.field6635[var8] == 65535) {
                            class483.field6635[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method2874((byte) -75);
                    class672.field9423 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class672.field9423[var6] = var2.method2845(-1);
                        if (class672.field9423[var6] == 65535) {
                            class672.field9423[var6] = -1;
                        }
                    }
                }
            }
        }
    }
}
