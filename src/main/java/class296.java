import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class296 extends class181 {

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "J")
    public static long field4499 = 0L;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
    public static boolean field4510 = false;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4497 = new String[8];

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    public static int[] field4517 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        if (arg0 <= 9) {
            method1952((class237) null, 107, 13);
        }
        class244.field3783.method944(65535);
        field4512++;
        class222.field3459.method944(65535);
        class50.field818.method944(65535);
        class235.field3611.method944(65535);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
    public static final void method1949(int arg0, byte arg1) {
        class151.field2206.method938(arg0, (byte) -123);
        if (arg1 != -62) {
            method1962(-109, -44, -13, false, -119, 100, -95, (int[]) null, (byte) -108, 10, 84);
        }
        class181.field2629.method938(arg0, (byte) -123);
        field4496++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Lhc;")
    public static final class128 method1950(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3026; var4++) {
            class128 var5 = var3.field3037[var4];
            if ((var5.field1880 >> 29 & 0x3L) == 2L && var5.field1882 == arg1 && var5.field1870 == arg2) {
                class114.method821(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)Z")
    public final boolean method1951(byte arg0) {
        int var2 = 23 / ((-arg0 - 72) / 32);
        field4508++;
        return (this.field4515 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpk;II)[Lbk;")
    public static final class46[] method1952(class237 arg0, int arg1, int arg2) {
        field4505++;
        if (class125.method878(arg1, arg0, -1)) {
            int var3 = 38 % ((-arg2 - 54) / 62);
            return class220.method1504((byte) 122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
    public static final void method1953(int arg0, int arg1, int arg2) {
        class105 var3 = class9.method72(arg1, arg1 ^ 0xFFFFFFF2, arg0);
        field4503++;
        var3.method763(false);
        var3.field1553 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLpk;Lpk;)V")
    public static final void method1954(boolean arg0, class237 arg1, class237 arg2) {
        field4513++;
        if (arg0) {
            method1962(104, 87, 66, false, -104, -80, 15, (int[]) null, (byte) 6, -80, -63);
        }
        class199.field2994 = arg2;
        class64.field1075 = arg1;
        class88.field1336 = class64.field1075.method1614(0, 3);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z")
    public final boolean method1955(int arg0) {
        int var2 = 25 % ((arg0 + 11) / 48);
        field4501++;
        return (this.field4515 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Z")
    public final boolean method1956(int arg0) {
        if (arg0 >= -1) {
            this.field4506 = 62;
        }
        field4507++;
        return (this.field4515 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Ljj;")
    public static final class104 method1957(int arg0, boolean arg1) {
        field4509++;
        class104 var2 = (class104) class278.field4281.method945((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field540.method1605(-128, class6.method58(arg0, (byte) 1), class218.method1463(arg0, (byte) 118));
        class104 var4 = new class104();
        var4.field1523 = arg0;
        if (var3 != null) {
            var4.method759(new class54(var3), (byte) 103);
        }
        class278.field4281.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
    public final boolean method1958(int arg0) {
        field4516++;
        if (arg0 != -8) {
            method1948(82);
        }
        return (this.field4515 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public static final void method1959(byte arg0) {
        field4520++;
        if (class234.field3605 == 0) {
            return;
        }
        try {
            if ((++class261.field4009) > 1500) {
                if (class22.field369 != null) {
                    class22.field369.method1718(-17492);
                    class22.field369 = null;
                }
                if (class138.field1997 >= 1) {
                    class234.field3605 = 0;
                    class147.field2132 = -5;
                    return;
                }
                class138.field1997++;
                class234.field3605 = 1;
                class261.field4009 = 0;
                if (class258.field3959 == class110.field1662) {
                    class110.field1662 = class145.field2109;
                } else {
                    class110.field1662 = class258.field3959;
                }
            }
            int var1 = 68 / ((56 - arg0) / 33);
            if (class234.field3605 == 1) {
                class106.field1564 = class217.field3338.method187(class113.field1737, class110.field1662, -74);
                class234.field3605 = 2;
            }
            if (class234.field3605 == 2) {
                if (class106.field1564.field713 == 2) {
                    throw new IOException();
                }
                if (class106.field1564.field713 != 1) {
                    return;
                }
                class22.field369 = new class253((Socket) class106.field1564.field709, class217.field3338);
                class106.field1564 = null;
                class22.field369.method1715(class59.field964.field848, 126, 0, class59.field964.field887);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                int var2 = class22.field369.method1726((byte) 126);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                if (var2 != 101) {
                    class234.field3605 = 0;
                    class147.field2132 = var2;
                    class22.field369.method1718(-17492);
                    class22.field369 = null;
                    return;
                }
                class234.field3605 = 3;
            }
            if (class234.field3605 == 3 && class22.field369.method1725(0) >= 2) {
                int var3 = class22.field369.method1726((byte) 126) << 8 | class22.field369.method1726((byte) 127);
                class267.method1808(var3, false);
                if (class258.field3964 == -1) {
                    class234.field3605 = 0;
                    class147.field2132 = 6;
                    class22.field369.method1718(-17492);
                    class22.field369 = null;
                } else {
                    class234.field3605 = 0;
                    class22.field369.method1718(-17492);
                    class22.field369 = null;
                    class131.method902(-1);
                }
            }
        } catch (IOException var4) {
            if (class22.field369 != null) {
                class22.field369.method1718(-17492);
                class22.field369 = null;
            }
            if (class138.field1997 >= 1) {
                class147.field2132 = -4;
                class234.field3605 = 0;
            } else {
                class138.field1997++;
                class234.field3605 = 1;
                if (class258.field3959 == class110.field1662) {
                    class110.field1662 = class145.field2109;
                } else {
                    class110.field1662 = class258.field3959;
                }
                class261.field4009 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V")
    public class296(int arg0, int arg1) {
        this.field4515 = arg0;
        this.field4506 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    public static void method1960(byte arg0) {
        field4497 = null;
        field4517 = null;
        int var1 = -1 / ((21 - arg0) / 45);
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
    public final int method1961(int arg0) {
        if (arg0 == 3) {
            field4511++;
            return class217.method1459(31435, this.field4515);
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZIII[IBII)V")
    public static final void method1962(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, byte arg8, int arg9, int arg10) {
        field4514++;
        int var11 = arg0;
        if (class72.field1179 <= arg0) {
            return;
        }
        if (arg0 < class72.field1172) {
            var11 = class72.field1172;
        }
        int var12 = arg0 + arg2;
        if (class72.field1172 >= var12) {
            return;
        }
        if (class72.field1179 < var12) {
            var12 = class72.field1179;
        }
        int var13 = arg9;
        if (class72.field1178 <= arg9) {
            return;
        }
        if (arg9 < class72.field1176) {
            var13 = class72.field1176;
        }
        int var14 = arg9 + arg10;
        if (var14 <= class72.field1176) {
            return;
        }
        if (arg4 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg4 = 1;
        }
        if (var14 > class72.field1178) {
            var14 = class72.field1178;
        }
        if (arg8 >= -49) {
            method1962(-95, 76, 106, true, -13, 47, 106, (int[]) null, (byte) 111, 27, 83);
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg4 = 8;
        }
        int var15 = var11 + class72.field1173 - var12;
        int var16 = var12 - arg0;
        int var17 = var14 - arg9;
        int var18 = class72.field1173 * var13 + var11;
        int var19 = var13 - arg9;
        int var20 = arg2 - var16;
        int var21 = var11 - arg0;
        int var22 = arg10 - var17;
        int var23 = arg2 - var21;
        int var24 = arg10 - var19;
        if (arg4 == 1) {
            if (arg1 == 0) {
                for (int var25 = var19; var25 < var17; var25++) {
                    for (int var26 = var21; var26 < var16; var26++) {
                        if (var26 <= var25) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var27 = var24 - 1; var27 >= var22; var27--) {
                    for (int var28 = var21; var28 < var16; var28++) {
                        if (var27 >= var28) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var29 = var19; var29 < var17; var29++) {
                    for (int var30 = var21; var30 < var16; var30++) {
                        if (var30 >= var29) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var31 = var24 - 1; var31 >= var22; var31--) {
                    for (int var32 = var21; var32 < var16; var32++) {
                        if (var32 >= var31) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 2) {
            if (arg1 == 0) {
                for (int var33 = var24 - 1; var33 >= var22; var33--) {
                    for (int var34 = var21; var34 < var16; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var35 = var19; var35 < var17; var35++) {
                    for (int var36 = var21; var36 < var16; var36++) {
                        if (var18 >= 0 && var18 < arg7.length) {
                            if (var36 >= (var35 << 1)) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var37 = var19; var37 < var17; var37++) {
                    for (int var38 = var23 - 1; var38 >= var20; var38--) {
                        if (var37 >> 1 >= var38) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var39 = var24 - 1; var39 >= var22; var39--) {
                    for (int var40 = var23 - 1; var40 >= var20; var40--) {
                        if (var40 >= (var39 << 1)) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 3) {
            if (arg1 == 0) {
                for (int var41 = var24 - 1; var41 >= var22; var41--) {
                    for (int var42 = var23 - 1; var42 >= var20; var42--) {
                        if (var42 <= var41 >> 1) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var43 = var24 - 1; var43 >= var22; var43--) {
                    for (int var44 = var21; var44 < var16; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var45 = var19; var45 < var17; var45++) {
                    for (int var46 = var21; var46 < var16; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var47 = var19; var47 < var17; var47++) {
                    for (int var48 = var23 - 1; var48 >= var20; var48--) {
                        if ((var47 << 1) <= var48) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 4) {
            if (arg1 == 0) {
                for (int var49 = var24 - 1; var49 >= var22; var49--) {
                    for (int var50 = var21; var50 < var16; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 1) {
                for (int var51 = var19; var51 < var17; var51++) {
                    for (int var52 = var21; var52 < var16; var52++) {
                        if (var51 << 1 >= var52) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 2) {
                for (int var53 = var19; var53 < var17; var53++) {
                    for (int var54 = var23 - 1; var54 >= var20; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg1 == 3) {
                for (int var55 = var24 - 1; var55 >= var22; var55--) {
                    for (int var56 = var23 - 1; var56 >= var20; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg7[var18] = arg5;
                        } else if (arg3) {
                            arg7[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg1 == 0) {
                    for (int var65 = var19; var65 < var17; var65++) {
                        for (int var66 = var21; var66 < var16; var66++) {
                            if (var66 <= (arg2 / 2)) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var67 = var19; var67 < var17; var67++) {
                        for (int var68 = var21; var68 < var16; var68++) {
                            if (var67 <= (arg10 / 2)) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var69 = var19; var69 < var17; var69++) {
                        for (int var70 = var21; var70 < var16; var70++) {
                            if (arg2 / 2 <= var70) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var71 = var19; var71 < var17; var71++) {
                        for (int var72 = var21; var72 < var16; var72++) {
                            if (arg10 / 2 <= var71) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg1 == 0) {
                    for (int var73 = var19; var73 < var17; var73++) {
                        for (int var74 = var21; var74 < var16; var74++) {
                            if (var74 <= (var73 - arg10 / 2)) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var75 = var24 - 1; var75 >= var22; var75--) {
                        for (int var76 = var21; var76 < var16; var76++) {
                            if (var75 - arg10 / 2 >= var76) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var77 = var24 - 1; var77 >= var22; var77--) {
                        for (int var78 = var23 - 1; var78 >= var20; var78--) {
                            if (var78 <= (var77 - (arg10 / 2))) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var79 = var19; var79 < var17; var79++) {
                        for (int var80 = var23 - 1; var80 >= var20; var80--) {
                            if (var80 <= var79 - (arg10 / 2)) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg1 == 0) {
                    for (int var81 = var19; var81 < var17; var81++) {
                        for (int var82 = var21; var82 < var16; var82++) {
                            if (var81 - arg10 / 2 <= var82) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var83 = var24 - 1; var83 >= var22; var83--) {
                        for (int var84 = var21; var84 < var16; var84++) {
                            if (var83 - (arg10 / 2) <= var84) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var85 = var24 - 1; var85 >= var22; var85--) {
                        for (int var86 = var23 - 1; var86 >= var20; var86--) {
                            if (var85 - (arg10 / 2) <= var86) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var87 = var19; var87 < var17; var87++) {
                        for (int var88 = var23 - 1; var88 >= var20; var88--) {
                            if (var87 - (arg10 / 2) <= var88) {
                                arg7[var18] = arg5;
                            } else if (arg3) {
                                arg7[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var57 = var24 - 1; var57 >= var22; var57--) {
                for (int var58 = var23 - 1; var58 >= var20; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg7[var18] = arg5;
                    } else if (arg3) {
                        arg7[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 1) {
            for (int var59 = var24 - 1; var59 >= var22; var59--) {
                for (int var60 = var21; var60 < var16; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg7[var18] = arg5;
                    } else if (arg3) {
                        arg7[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 2) {
            for (int var61 = var19; var61 < var17; var61++) {
                for (int var62 = var21; var62 < var16; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg7[var18] = arg5;
                    } else if (arg3) {
                        arg7[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg1 == 3) {
            for (int var63 = var19; var63 < var17; var63++) {
                for (int var64 = var23 - 1; var64 >= var20; var64--) {
                    if (var64 <= (var63 << 1)) {
                        arg7[var18] = arg5;
                    } else if (arg3) {
                        arg7[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Z")
    public final boolean method1963(int arg0, int arg1) {
        field4500++;
        if (arg0 != 2912) {
            this.method1964(-36);
        }
        return (this.field4515 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)Z")
    public final boolean method1964(int arg0) {
        field4502++;
        if (arg0 != -4) {
            this.method1963(120, -23);
        }
        return (this.field4515 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)Z")
    public final boolean method1965(byte arg0) {
        if (arg0 != -55) {
            field4510 = true;
        }
        field4504++;
        return (this.field4515 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public static final void method1966(int arg0) {
        field4518++;
        int var1 = class105.field1555.method1293(class194.field2938);
        for (int var2 = 0; var2 < class51.field826; var2++) {
            int var7 = class105.field1555.method1293(class170.method1143(-24448, var2));
            if (var1 < var7) {
                var1 = var7;
            }
        }
        int var3 = -102 % ((arg0 + 20) / 53);
        var1 += 8;
        int var4 = class51.field826 * 15 + 21;
        int var5 = class101.field1470;
        if ((var5 + var4) > class85.field1311) {
            var5 = class85.field1311 - var4;
        }
        int var6 = class102.field1490 - (var1 / 2);
        if (var5 < 0) {
            var5 = 0;
        }
        if (var6 + var1 > class126.field1854) {
            var6 = class126.field1854 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class85.field1305 != 1) {
            if (class157.field2303 != class102.field1490 || class87.field1317 != class101.field1470) {
                class281.field4314 = class157.field2303;
                class220.field3435 = class87.field1317;
                class85.field1305 = 1;
                return;
            }
            class66.field1093 = true;
            class85.field1305 = 0;
            class106.field1561 = class51.field826 * 15 + (class197.field2979 ? 26 : 22);
            class67.field1116 = var5;
            class229.field3561 = var6;
            class19.field333 = var1;
        } else if (class281.field4314 == class102.field1490 && class220.field3435 == class101.field1470) {
            class229.field3561 = var6;
            class67.field1116 = var5;
            class19.field333 = var1;
            class66.field1093 = true;
            class85.field1305 = 0;
            class106.field1561 = (class197.field2979 ? 26 : 22) + class51.field826 * 15;
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)Z")
    public final boolean method1967(int arg0) {
        if (arg0 == -19279) {
            field4498++;
            return (this.field4515 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)I")
    public final int method1968(byte arg0) {
        field4519++;
        return arg0 == 124 ? this.field4515 >> 18 & 0x7 : -128;
    }
}
