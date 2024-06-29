import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class145 {

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public int field1701 = 0;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Ltd;")
    private static class136 field1692 = class145.method1172("Members only world", 45);

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "Ltd;")
    public static class136 field1696 = class145.method1172("Diese Welt ist voll)3", 45);

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field1695 = 10;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "Ltd;")
    private static class136 field1699 = class145.method1172("Loading config )2 ", 45);

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "[I")
    public static int[] field1700 = new int[128];

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "Ltd;")
    public static class136 field1702 = field1692;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "Ltd;")
    public static class136 field1693 = class145.method1172("Diese Betatest)2Welt ist nur f-Ur eingeladene", 45);

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "Ltd;")
    public static class136 field1704 = class145.method1172("Regeln versto-8en hat)3", 45);

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "Ltd;")
    public static class136 field1697 = field1699;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lm;IIIIIILo;BI)V")
    public static final void method547(class83 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class97 arg7, byte arg8, int arg9) {
        int var10 = class78.field1804[arg1][arg9 + 1][arg2];
        int var11 = class78.field1804[arg1][arg9][arg2 + 1];
        int var12 = class78.field1804[arg1][arg9 + 1][arg2 + 1];
        int var13 = class78.field1804[arg1][arg9][arg2];
        field1698++;
        class128 var14 = class142.method1154(arg5, -93);
        int var15 = var10 + var12 + var13 + var11 >> 2;
        int var16 = (arg5 << 14) + (arg2 << 7) + arg9 + 1073741824;
        if (var14.field3037 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg3 << 6) + arg6;
        if (arg8 != 36) {
            field1695 = -66;
        }
        if (var14.field3064 == 1) {
            var17 += 256;
        }
        if (arg6 == 22) {
            class112 var18;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var18 = var14.method1051(var12, var11, var10, (byte) 79, arg3, var13, 22);
            } else {
                var18 = new class47(arg5, 22, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method744(arg4, arg9, arg2, var15, var18, var16, var17);
            if (var14.field3026 == 1) {
                arg0.method619(arg2, (byte) -96, arg9);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class112 var38;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var38 = var14.method1051(var12, var11, var10, (byte) 98, arg3, var13, 10);
            } else {
                var38 = new class47(arg5, 10, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var14.field3071;
                    var39 = var14.field3076;
                } else {
                    var39 = var14.field3071;
                    var40 = var14.field3076;
                }
                int var41 = 0;
                if (arg6 == 11) {
                    var41 += 256;
                }
                arg7.method753(arg4, arg9, arg2, var15, var40, var39, var38, var41, var16, var17);
            }
            if (var14.field3026 != 0) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg9, var14.field3071, 127);
            }
        } else if (arg6 >= 12) {
            class112 var19;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var19 = var14.method1051(var12, var11, var10, (byte) 100, arg3, var13, arg6);
            } else {
                var19 = new class47(arg5, arg6, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method753(arg4, arg9, arg2, var15, 1, 1, var19, 0, var16, var17);
            if (var14.field3026 != 0) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg9, var14.field3071, arg8 + 91);
            }
        } else if (arg6 == 0) {
            class112 var20;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var20 = var14.method1051(var12, var11, var10, (byte) 85, arg3, var13, 0);
            } else {
                var20 = new class47(arg5, 0, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method781(arg4, arg9, arg2, var15, var20, null, class15.field290[arg3], 0, var16, var17);
            if (var14.field3026 != 0) {
                arg0.method625(arg9, arg6, arg8 - 163, arg2, var14.field3033, arg3);
            }
        } else if (arg6 == 1) {
            class112 var21;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var21 = var14.method1051(var12, var11, var10, (byte) 86, arg3, var13, 1);
            } else {
                var21 = new class47(arg5, 1, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method781(arg4, arg9, arg2, var15, var21, null, client.field455[arg3], 0, var16, var17);
            if (var14.field3026 != 0) {
                arg0.method625(arg9, arg6, -113, arg2, var14.field3033, arg3);
            }
        } else if (arg6 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class112 var23;
            class112 var24;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var23 = var14.method1051(var12, var11, var10, (byte) 120, arg3 + 4, var13, 2);
                var24 = var14.method1051(var12, var11, var10, (byte) 115, var22, var13, 2);
            } else {
                var23 = new class47(arg5, 2, arg3 + 4, var13, var10, var12, var11, var14.field3032, true, null);
                var24 = new class47(arg5, 2, var22, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method781(arg4, arg9, arg2, var15, var23, var24, class15.field290[arg3], class15.field290[var22], var16, var17);
            if (var14.field3026 != 0) {
                arg0.method625(arg9, arg6, 17, arg2, var14.field3033, arg3);
            }
        } else if (arg6 == 3) {
            class112 var25;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var25 = var14.method1051(var12, var11, var10, (byte) 99, arg3, var13, 3);
            } else {
                var25 = new class47(arg5, 3, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method781(arg4, arg9, arg2, var15, var25, null, client.field455[arg3], 0, var16, var17);
            if (var14.field3026 != 0) {
                arg0.method625(arg9, arg6, -127, arg2, var14.field3033, arg3);
            }
        } else if (arg6 == 9) {
            class112 var26;
            if (var14.field3032 == -1 && var14.field3065 == null) {
                var26 = var14.method1051(var12, var11, var10, (byte) 103, arg3, var13, arg6);
            } else {
                var26 = new class47(arg5, arg6, arg3, var13, var10, var12, var11, var14.field3032, true, null);
            }
            arg7.method753(arg4, arg9, arg2, var15, 1, 1, var26, 0, var16, var17);
            if (var14.field3026 != 0) {
                arg0.method624(var14.field3076, arg3, arg2, var14.field3033, arg9, var14.field3071, 127);
            }
        } else {
            if (var14.field3057) {
                if (arg3 == 1) {
                    int var30 = var11;
                    var11 = var12;
                    var12 = var10;
                    var10 = var13;
                    var13 = var30;
                } else if (arg3 == 2) {
                    int var27 = var11;
                    var11 = var10;
                    var10 = var27;
                    int var28 = var12;
                    var12 = var13;
                    var13 = var28;
                } else if (arg3 == 3) {
                    int var29 = var11;
                    var11 = var13;
                    var13 = var10;
                    var10 = var12;
                    var12 = var29;
                }
            }
            if (arg6 == 4) {
                class112 var31;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var31 = var14.method1051(var12, var11, var10, (byte) 78, 0, var13, 4);
                } else {
                    var31 = new class47(arg5, 4, 0, var13, var10, var12, var11, var14.field3032, true, null);
                }
                arg7.method756(arg4, arg9, arg2, var15, var31, class15.field290[arg3], arg3 * 512, 0, 0, var16, var17);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg7.method739(arg4, arg9, arg2);
                if (var33 != 0) {
                    var32 = class142.method1154(var33 >> 14 & 0x7FFF, 65).field3036;
                }
                class112 var34;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var34 = var14.method1051(var12, var11, var10, (byte) 110, 0, var13, 4);
                } else {
                    var34 = new class47(arg5, 4, 0, var13, var10, var12, var11, var14.field3032, true, null);
                }
                arg7.method756(arg4, arg9, arg2, var15, var34, class15.field290[arg3], arg3 * 512, class153.field3502[arg3] * var32, class151.field3453[arg3] * var32, var16, var17);
            } else if (arg6 == 6) {
                class112 var35;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var35 = var14.method1051(var12, var11, var10, (byte) 62, 0, var13, 4);
                } else {
                    var35 = new class47(arg5, 4, 0, var13, var10, var12, var11, var14.field3032, true, null);
                }
                arg7.method756(arg4, arg9, arg2, var15, var35, 256, arg3, 0, 0, var16, var17);
            } else if (arg6 == 7) {
                class112 var36;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var36 = var14.method1051(var12, var11, var10, (byte) 76, 0, var13, 4);
                } else {
                    var36 = new class47(arg5, 4, 0, var13, var10, var12, var11, var14.field3032, true, null);
                }
                arg7.method756(arg4, arg9, arg2, var15, var36, 512, arg3, 0, 0, var16, var17);
            } else if (arg6 == 8) {
                class112 var37;
                if (var14.field3032 == -1 && var14.field3065 == null) {
                    var37 = var14.method1051(var12, var11, var10, (byte) 67, 0, var13, 4);
                } else {
                    var37 = new class47(arg5, 4, 0, var13, var10, var12, var11, var14.field3032, true, null);
                }
                arg7.method756(arg4, arg9, arg2, var15, var37, 768, arg3, 0, 0, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public static void method548(int arg0) {
        field1704 = null;
        field1696 = null;
        field1692 = null;
        field1693 = null;
        int var1 = 116 / ((arg0 - 3) / 50);
        field1697 = null;
        field1699 = null;
        field1702 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method549(int arg0, int arg1) {
        field1703++;
        if (class91.method688(arg1, (byte) -126)) {
            int var2 = 3 % ((arg0 - 32) / 35);
            class37.method317(-1, false, class94.field2201[arg1]);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lsb;II)V")
    private final void method550(class127 arg0, int arg1, int arg2) {
        field1691++;
        if (arg1 != 540) {
            field1706 = -108;
        }
        if (arg2 == 2) {
            this.field1701 = arg0.method1020(false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILsb;)V")
    public final void method551(int arg0, class127 arg1) {
        field1705++;
        if (arg0 < 40) {
            field1699 = null;
        }
        while (true) {
            int var3 = arg1.method1011(114);
            if (var3 == 0) {
                return;
            }
            this.method550(arg1, 540, var3);
        }
    }
}
