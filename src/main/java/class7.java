import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class7 extends class213 {

    @OriginalMember(owner = "client!af", name = "K", descriptor = "[Laf;")
    public class7[] field115;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Z")
    public boolean field99;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lob;")
    private static class141 field104 = class175.method1195(40, "New User");

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lob;")
    public static class141 field109 = field104;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "[I")
    public static int[] field106 = new int[4000];

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Lob;")
    public static class141 field113 = class175.method1195(40, "Hidden)2");

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Lvc;")
    public static class212 field108 = new class212(64);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Lob;")
    public static class141 field118 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Lae;")
    public static class6 field120 = new class6(5000);

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Lnd;")
    public class133 field100;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lve;")
    public class214 field97;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Lfd;")
    public static class55 field119;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)[[I")
    public final int[][] method42(int arg0, int arg1, int arg2) {
        field105++;
        int var4 = 1 % ((arg1 - 31) / 34);
        if (this.field115[arg2].field99) {
            int[] var5 = this.field115[arg2].method30((byte) 95, arg0);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field115[arg2].method51(arg0, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIZIIIZLhi;)V")
    public static final void method43(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9, class79 arg10) {
        field96++;
        if (arg5 && (class164.field3177[0][arg1][arg6] & 0x2) == 0) {
            if ((class164.field3177[arg4][arg1][arg6] & 0x10) != 0) {
                return;
            }
            if (class6.method37(arg1, arg4, arg6, false) != class54.field1055) {
                return;
            }
        }
        if (arg2 != 70) {
            return;
        }
        if (arg4 < class103.field1991) {
            class103.field1991 = arg4;
        }
        class54 var11 = class175.method1198(-14098, arg3);
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field1079;
            var13 = var11.field1073;
        } else {
            var12 = var11.field1073;
            var13 = var11.field1079;
        }
        int var14;
        int var15;
        if (arg1 + var13 > 104) {
            var14 = arg1 + 1;
            var15 = arg1;
        } else {
            var15 = arg1 + (var13 >> 1);
            var14 = (var13 + 1 >> 1) + arg1;
        }
        int var16;
        int var17;
        if (arg6 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg6;
            var17 = (var12 >> 1) + arg6;
        } else {
            var17 = arg6;
            var16 = arg6 + 1;
        }
        int[][] var18 = class31.field617[arg7];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var20 = (arg1 << 7) + (var13 << 6);
        int var21 = (arg6 << 7) + (var12 << 6);
        long var22 = (long) ((arg0 | 0x400) << 20 | arg8 << 14 | arg1 | arg6 << 7);
        if (var11.field1051 == 0) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field1025 == 1) {
            var22 |= 0x400000L;
        }
        long var24 = var22 | (long) arg3 << 32;
        if (arg9 && var11.method368(-1)) {
            class2.method12((byte) 124, arg6, arg4, var11, arg0, arg1);
        }
        if (arg8 == 22) {
            if (!arg5 || var11.field1051 != 0 || var11.field1061 == 1 || var11.field1075) {
                class2 var27;
                if (var11.field1049 == -1 && var11.field1024 == null) {
                    class161 var26 = var11.method371(var20, 22, arg9, arg0, var19, arg2 - 84, var21, var18);
                    var27 = var26.field3121;
                } else {
                    var27 = new class57(arg3, 22, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
                }
                class76.method532(arg4, arg1, arg6, var19, var27, var24, var11.field1018);
                if (var11.field1061 == 1 && arg10 != null) {
                    arg10.method548((byte) 70, arg1, arg6);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class2 var67;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var66 = var11.method371(var20, 10, arg9, arg0, var19, -62, var21, var18);
                var67 = var66.field3121;
            } else {
                var67 = new class57(arg3, 10, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            if (var67 != null) {
                boolean var68 = class82.method565(arg4, arg1, arg6, var19, var13, var12, var67, arg8 == 11 ? 256 : 0, var24);
                if (var11.field1052 && var68 && arg9) {
                    int var69 = 15;
                    if (var67 instanceof class56) {
                        var69 = ((class56) var67).method383() / 4;
                        if (var69 > 30) {
                            var69 = 30;
                        }
                    }
                    for (int var70 = 0; var70 <= var13; var70++) {
                        for (int var71 = 0; var71 <= var12; var71++) {
                            if (var69 > class57.field1118[arg4][arg1 + var70][arg6 + var71]) {
                                class57.field1118[arg4][arg1 + var70][arg6 + var71] = (byte) var69;
                            }
                        }
                    }
                }
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method549(var13, var12, var11.field1036, arg6, arg1, (byte) -108);
            }
        } else if (arg8 >= 12) {
            class2 var29;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var28 = var11.method371(var20, arg8, arg9, arg0, var19, -65, var21, var18);
                var29 = var28.field3121;
            } else {
                var29 = new class57(arg3, arg8, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class82.method565(arg4, arg1, arg6, var19, 1, 1, var29, 0, var24);
            if (arg9 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg4 > 0) {
                class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 2340);
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method549(var13, var12, var11.field1036, arg6, arg1, (byte) -23);
            }
        } else if (arg8 == 0) {
            class2 var31;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var30 = var11.method371(var20, 0, arg9, arg0, var19, -106, var21, var18);
                var31 = var30.field3121;
            } else {
                var31 = new class57(arg3, 0, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class105.method699(arg4, arg1, arg6, var19, var31, null, class214.field4092[arg0], 0, var24);
            if (arg9) {
                if (arg0 == 0) {
                    if (var11.field1052) {
                        class57.field1118[arg4][arg1][arg6] = 50;
                        class57.field1118[arg4][arg1][arg6 + 1] = 50;
                    }
                    if (var11.field1058) {
                        class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 585);
                    }
                } else if (arg0 == 1) {
                    if (var11.field1052) {
                        class57.field1118[arg4][arg1][arg6 + 1] = 50;
                        class57.field1118[arg4][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1058) {
                        class9.field158[arg4][arg1][arg6 + 1] = class57.method389(class9.field158[arg4][arg1][arg6 + 1], 1170);
                    }
                } else if (arg0 == 2) {
                    if (var11.field1052) {
                        class57.field1118[arg4][arg1 + 1][arg6] = 50;
                        class57.field1118[arg4][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1058) {
                        class9.field158[arg4][arg1 + 1][arg6] = class57.method389(class9.field158[arg4][arg1 + 1][arg6], 585);
                    }
                } else if (arg0 == 3) {
                    if (var11.field1052) {
                        class57.field1118[arg4][arg1][arg6] = 50;
                        class57.field1118[arg4][arg1 + 1][arg6] = 50;
                    }
                    if (var11.field1058) {
                        class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 1170);
                    }
                }
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method555(arg8, arg0, var11.field1036, arg1, arg6, arg2 ^ 0xFFFFFFBA);
            }
            if (var11.field1046 != 16) {
                class11.method74(arg4, arg1, arg6, var11.field1046);
            }
        } else if (arg8 == 1) {
            class2 var33;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var32 = var11.method371(var20, 1, arg9, arg0, var19, -78, var21, var18);
                var33 = var32.field3121;
            } else {
                var33 = new class57(arg3, 1, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class105.method699(arg4, arg1, arg6, var19, var33, null, class113.field2163[arg0], 0, var24);
            if (var11.field1052 && arg9) {
                if (arg0 == 0) {
                    class57.field1118[arg4][arg1][arg6 + 1] = 50;
                } else if (arg0 == 1) {
                    class57.field1118[arg4][arg1 + 1][arg6 + 1] = 50;
                } else if (arg0 == 2) {
                    class57.field1118[arg4][arg1 + 1][arg6] = 50;
                } else if (arg0 == 3) {
                    class57.field1118[arg4][arg1][arg6] = 50;
                }
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method555(arg8, arg0, var11.field1036, arg1, arg6, -4);
            }
        } else if (arg8 == 2) {
            int var34 = arg0 + 1 & 0x3;
            class2 var36;
            class2 var38;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var35 = var11.method371(var20, 2, arg9, arg0 + 4, var19, arg2 - 129, var21, var18);
                var36 = var35.field3121;
                class161 var37 = var11.method371(var20, 2, arg9, var34, var19, -38, var21, var18);
                var38 = var37.field3121;
            } else {
                var36 = new class57(arg3, 2, arg0 + 4, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
                var38 = new class57(arg3, 2, var34, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class105.method699(arg4, arg1, arg6, var19, var36, var38, class214.field4092[arg0], class214.field4092[var34], var24);
            if (var11.field1058 && arg9) {
                if (arg0 == 0) {
                    class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 585);
                    class9.field158[arg4][arg1][arg6 + 1] = class57.method389(class9.field158[arg4][arg1][arg6 + 1], 1170);
                } else if (arg0 == 1) {
                    class9.field158[arg4][arg1][arg6 + 1] = class57.method389(class9.field158[arg4][arg1][arg6 + 1], 1170);
                    class9.field158[arg4][arg1 + 1][arg6] = class57.method389(class9.field158[arg4][arg1 + 1][arg6], 585);
                } else if (arg0 == 2) {
                    class9.field158[arg4][arg1 + 1][arg6] = class57.method389(class9.field158[arg4][arg1 + 1][arg6], 585);
                    class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 1170);
                } else if (arg0 == 3) {
                    class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 1170);
                    class9.field158[arg4][arg1][arg6] = class57.method389(class9.field158[arg4][arg1][arg6], 585);
                }
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method555(arg8, arg0, var11.field1036, arg1, arg6, -4);
            }
            if (var11.field1046 != 16) {
                class11.method74(arg4, arg1, arg6, var11.field1046);
            }
        } else if (arg8 == 3) {
            class2 var40;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var39 = var11.method371(var20, 3, arg9, arg0, var19, -60, var21, var18);
                var40 = var39.field3121;
            } else {
                var40 = new class57(arg3, 3, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class105.method699(arg4, arg1, arg6, var19, var40, null, class113.field2163[arg0], 0, var24);
            if (var11.field1052 && arg9) {
                if (arg0 == 0) {
                    class57.field1118[arg4][arg1][arg6 + 1] = 50;
                } else if (arg0 == 1) {
                    class57.field1118[arg4][arg1 + 1][arg6 + 1] = 50;
                } else if (arg0 == 2) {
                    class57.field1118[arg4][arg1 + 1][arg6] = 50;
                } else if (arg0 == 3) {
                    class57.field1118[arg4][arg1][arg6] = 50;
                }
            }
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method555(arg8, arg0, var11.field1036, arg1, arg6, -4);
            }
        } else if (arg8 == 9) {
            class2 var42;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var41 = var11.method371(var20, arg8, arg9, arg0, var19, -107, var21, var18);
                var42 = var41.field3121;
            } else {
                var42 = new class57(arg3, arg8, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class82.method565(arg4, arg1, arg6, var19, 1, 1, var42, 0, var24);
            if (var11.field1061 != 0 && arg10 != null) {
                arg10.method549(var13, var12, var11.field1036, arg6, arg1, (byte) -44);
            }
            if (var11.field1046 != 16) {
                class11.method74(arg4, arg1, arg6, var11.field1046);
            }
        } else if (arg8 == 4) {
            class2 var44;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var43 = var11.method371(var20, 4, arg9, arg0, var19, -53, var21, var18);
                var44 = var43.field3121;
            } else {
                var44 = new class57(arg3, 4, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class117.method759(arg4, arg1, arg6, var19, var44, null, class214.field4092[arg0], 0, 0, 0, var24);
        } else if (arg8 == 5) {
            int var45 = 16;
            long var46 = class224.method1442(arg4, arg1, arg6);
            if (var46 != 0L) {
                var45 = class175.method1198(-14098, (int) (var46 >>> 32) & Integer.MAX_VALUE).field1046;
            }
            class2 var49;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var48 = var11.method371(var20, 4, arg9, arg0, var19, -112, var21, var18);
                var49 = var48.field3121;
            } else {
                var49 = new class57(arg3, 4, arg0, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class117.method759(arg4, arg1, arg6, var19, var49, null, class214.field4092[arg0], 0, class212.field4052[arg0] * var45, class215.field4105[arg0] * var45, var24);
        } else if (arg8 == 6) {
            int var50 = 8;
            long var51 = class224.method1442(arg4, arg1, arg6);
            if (var51 != 0L) {
                var50 = class175.method1198(-14098, Integer.MAX_VALUE & (int) (var51 >>> 32)).field1046 / 2;
            }
            class2 var54;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var53 = var11.method371(var20, 4, arg9, arg0 + 4, var19, -123, var21, var18);
                var54 = var53.field3121;
            } else {
                var54 = new class57(arg3, 4, arg0 + 4, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class117.method759(arg4, arg1, arg6, var19, var54, null, 256, arg0, class142.field2742[arg0] * var50, class180.field3540[arg0] * var50, var24);
        } else if (arg8 == 7) {
            int var55 = arg0 + 2 & 0x3;
            class2 var57;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var56 = var11.method371(var20, 4, arg9, var55 + 4, var19, -56, var21, var18);
                var57 = var56.field3121;
            } else {
                var57 = new class57(arg3, 4, var55 + 4, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class117.method759(arg4, arg1, arg6, var19, var57, null, 256, var55, 0, 0, var24);
        } else if (arg8 == 8) {
            int var58 = 8;
            long var59 = class224.method1442(arg4, arg1, arg6);
            if (var59 != 0L) {
                var58 = class175.method1198(arg2 - 14168, Integer.MAX_VALUE & (int) (var59 >>> 32)).field1046 / 2;
            }
            int var61 = arg0 + 2 & 0x3;
            class2 var63;
            class2 var65;
            if (var11.field1049 == -1 && var11.field1024 == null) {
                class161 var62 = var11.method371(var20, 4, arg9, arg0 + 4, var19, -127, var21, var18);
                var63 = var62.field3121;
                class161 var64 = var11.method371(var20, 4, arg9, var61 + 4, var19, -20, var21, var18);
                var65 = var64.field3121;
            } else {
                var63 = new class57(arg3, 4, arg0 + 4, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
                var65 = new class57(arg3, 4, var61 + 4, arg7, arg1, arg6, var11.field1049, var11.field1057, null);
            }
            class117.method759(arg4, arg1, arg6, var19, var63, var65, 256, arg0, class142.field2742[arg0] * var58, class180.field3540[arg0] * var58, var24);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
    public int method44(int arg0) {
        field107++;
        if (arg0 < 50) {
            field109 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)I")
    public int method45(int arg0) {
        field117++;
        return arg0 == -24089 ? -1 : -70;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIII)V")
    public static final void method46(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field102++;
        class180.method1217(arg1 + arg5, (byte) 52, arg5 - arg1, arg4, class41.field805[arg0]);
        int var7 = arg3;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var9 + var10;
        if (arg2 != -107) {
            return;
        }
        int var14 = var8 - (var12 - 1) * var11;
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (arg3 - 1) * var15;
        int var19 = ((arg3 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var16;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var17;
                    var14 += var20;
                    var20 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var6++;
                var17 += var16;
                var14 += var20;
                var20 += var16;
            }
            var14 += -var19;
            var13 += -var18;
            var18 -= var15;
            var19 -= var15;
            var7--;
            int var21 = arg5 + var6;
            int var22 = arg0 + var7;
            int var23 = arg0 - var7;
            int var24 = arg5 - var6;
            class180.method1217(var21, (byte) 52, var24, arg4, class41.field805[var23]);
            class180.method1217(var21, (byte) 52, var24, arg4, class41.field805[var22]);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
    public int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            return null;
        } else {
            field116++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public void method47(int arg0) {
        field112++;
        if (arg0 != 1) {
            method53(89, 8);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        field93++;
        class37.field736.method1385(9946);
        class37.field737.method1385(9946);
        class95.field1885.method1385(9946);
        if (arg0 != 50) {
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILog;)V")
    public void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -83 / ((66 - arg1) / 57);
        field95++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
    public final void method49(byte arg0, int arg1, int arg2) {
        field101++;
        int var4 = this.field121 == 255 ? arg1 : this.field121;
        if (arg0 < 83) {
            this.method47(118);
        }
        if (this.field99) {
            this.field100 = new class133(var4, arg1, arg2);
        } else {
            this.field97 = new class214(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public void method50(boolean arg0) {
        if (this.field99) {
            this.field100.method843(true);
            this.field100 = null;
        } else {
            this.field97.method1393(false);
            this.field97 = null;
        }
        field103++;
        if (arg0) {
            method55(39);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[[I")
    public int[][] method51(int arg0, byte arg1) {
        int var3 = -122 % ((arg1 + 42) / 41);
        field110++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)[I")
    public final int[] method52(int arg0, int arg1, int arg2) {
        field111++;
        if (arg2 < 20) {
            field98 = -49;
        }
        return this.field115[arg1].field99 ? this.field115[arg1].method30((byte) 96, arg0) : this.field115[arg1].method51(arg0, (byte) 76)[0];
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public static final int method53(int arg0, int arg1) {
        field114++;
        if (arg1 > -8) {
            field119 = null;
        }
        class31 var2 = class141.method904(arg0, -82);
        int var3 = var2.field622;
        int var4 = var2.field619;
        int var5 = var2.field624;
        int var6 = class161.field3124[var5 - var4];
        return var6 & class180.field3538[var3] >> var4;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static void method54(int arg0) {
        field106 = null;
        field118 = null;
        field120 = null;
        field108 = null;
        field109 = null;
        if (arg0 != 4) {
            method48((byte) -63);
        }
        field113 = null;
        field119 = null;
        field104 = null;
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public static final void method55(int arg0) {
        class165.field3199 = arg0;
        field94++;
        class135.field2561 = 0;
        class77.method536((byte) 113);
        class103.method692(127);
        class195.method1313(123);
        class214.method1398(3610);
        for (int var1 = 0; var1 < class135.field2561; var1++) {
            int var3 = class204.field3913[var1];
            if (class20.field344 != class116.field2231[var3].field3885) {
                class116.field2231[var3] = null;
            }
        }
        if (class187.field3632 != class156.field3014.field2865) {
            throw new RuntimeException("gpp1 pos:" + class156.field3014.field2865 + " psize:" + class187.field3632);
        }
        for (int var2 = 0; var2 < class184.field3587; var2++) {
            if (class116.field2231[class188.field3647[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class184.field3587);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IZ)V")
    public class7(int arg0, boolean arg1) {
        this.field115 = new class7[arg0];
        this.field99 = arg1;
    }
}
