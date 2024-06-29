import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lpd;")
    public static class94 field240 = class28.method249(-119, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field237 = new int[500];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[Lte;")
    public static class119[][][] field243 = new class119[4][104][104];

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lpd;")
    public static class94 field242 = class28.method249(-85, "Die Verbindung konnte");

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[Lpd;")
    public static class94[] field248 = new class94[5];

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lpd;")
    public static class94 field246 = class28.method249(-99, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public static volatile boolean field249 = true;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field250 = -1;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lpd;")
    private static class94 field256 = class28.method249(-78, "Loaded input handler");

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lpd;")
    public static class94 field260 = field256;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lvc;")
    public static class128 field253 = new class128(20);

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lpd;")
    private static class94 field262 = class28.method249(25, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lpd;")
    public static class94 field263 = field262;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lc;")
    public static class16 field251;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lla;")
    public static class66 field241;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lmb;")
    public static class73 field247;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Ljava/awt/Frame;")
    public static Frame field259;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lde;IIIIBILod;I)V", line = 14)
    public static final void method51(class24 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class88 arg7, int arg8) {
        field238++;
        if (class115.field2912 && (class108.field2679[0][arg2][arg3] & 0x2) == 0) {
            if ((class108.field2679[arg4][arg2][arg3] & 0x10) != 0) {
                return;
            }
            if (client.method137(arg3, true, arg2, arg4) != class102.field2581) {
                return;
            }
        }
        if (arg5 < 38) {
            field262 = null;
        }
        if (class50.field1255 > arg4) {
            class50.field1255 = arg4;
        }
        int var9 = class41.field1049[arg4][arg2 + 1][arg3 + 1];
        int var10 = class41.field1049[arg4][arg2][arg3];
        int var11 = class41.field1049[arg4][arg2 + 1][arg3];
        int var12 = (arg3 << 7) + arg2 + (arg1 << 14) + 1073741824;
        int var13 = (arg8 << 6) + arg6;
        int var14 = class41.field1049[arg4][arg2][arg3 + 1];
        class27 var15 = class55.method440(arg1, (byte) 76);
        int var16 = var10 + var11 + var9 + var14 >> 2;
        if (var15.field739 == 1) {
            var13 += 256;
        }
        if (var15.field726 == 0) {
            var12 += Integer.MIN_VALUE;
        }
        if (var15.method245((byte) -103)) {
            class133.method1052(var15, true, arg8, arg4, arg3, arg2);
        }
        if (arg6 == 22) {
            if (!class115.field2912 || var15.field726 != 0 || var15.field710) {
                class12 var17;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var17 = var15.method240(22, arg8, var11, 125, var14, var10, var9);
                } else {
                    var17 = new class51(arg1, 22, arg8, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method199(arg4, arg2, arg3, var16, var17, var12, var13);
                if (var15.field727 && var15.field726 == 1 && arg7 != null) {
                    arg7.method661(arg2, arg3, 2097152);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class12 var37;
            if (var15.field755 == -1 && var15.field764 == null) {
                var37 = var15.method240(10, arg8, var11, 110, var14, var10, var9);
            } else {
                var37 = new class51(arg1, 10, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            if (var37 != null) {
                int var38 = 0;
                if (arg6 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field715;
                    var39 = var15.field771;
                } else {
                    var39 = var15.field715;
                    var40 = var15.field771;
                }
                if (arg0.method176(arg4, arg2, arg3, var16, var40, var39, var37, var38, var12, var13) && var15.field712) {
                    class48 var41;
                    if (var37 instanceof class48) {
                        var41 = (class48) var37;
                    } else {
                        var41 = var15.method240(10, arg8, var11, 118, var14, var10, var9);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var40; var42++) {
                            for (int var43 = 0; var43 <= var39; var43++) {
                                int var44 = var41.method373() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (class40.field1038[arg4][arg2 + var42][arg3 + var43] < var44) {
                                    class40.field1038[arg4][arg2 + var42][arg3 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field727 && arg7 != null) {
                arg7.method647(var15.field771, arg8, var15.field715, var15.field725, -4, arg3, arg2);
            }
        } else if (arg6 >= 12) {
            class12 var18;
            if (var15.field755 == -1 && var15.field764 == null) {
                var18 = var15.method240(arg6, arg8, var11, 6, var14, var10, var9);
            } else {
                var18 = new class51(arg1, arg6, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method176(arg4, arg2, arg3, var16, 1, 1, var18, 0, var12, var13);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
                class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 2340);
            }
            if (var15.field727 && arg7 != null) {
                arg7.method647(var15.field771, arg8, var15.field715, var15.field725, -4, arg3, arg2);
            }
        } else if (arg6 == 0) {
            class12 var19;
            if (var15.field755 == -1 && var15.field764 == null) {
                var19 = var15.method240(0, arg8, var11, 107, var14, var10, var9);
            } else {
                var19 = new class51(arg1, 0, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method174(arg4, arg2, arg3, var16, var19, null, class89.field2323[arg8], 0, var12, var13);
            if (arg8 == 0) {
                if (var15.field712) {
                    class40.field1038[arg4][arg2][arg3] = 50;
                    class40.field1038[arg4][arg2][arg3 + 1] = 50;
                }
                if (var15.field732) {
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 585);
                }
            } else if (arg8 == 1) {
                if (var15.field712) {
                    class40.field1038[arg4][arg2][arg3 + 1] = 50;
                    class40.field1038[arg4][arg2 + 1][arg3 + 1] = 50;
                }
                if (var15.field732) {
                    class107.field2671[arg4][arg2][arg3 + 1] = class100.method756(class107.field2671[arg4][arg2][arg3 + 1], 1170);
                }
            } else if (arg8 == 2) {
                if (var15.field712) {
                    class40.field1038[arg4][arg2 + 1][arg3] = 50;
                    class40.field1038[arg4][arg2 + 1][arg3 + 1] = 50;
                }
                if (var15.field732) {
                    class107.field2671[arg4][arg2 + 1][arg3] = class100.method756(class107.field2671[arg4][arg2 + 1][arg3], 585);
                }
            } else if (arg8 == 3) {
                if (var15.field712) {
                    class40.field1038[arg4][arg2][arg3] = 50;
                    class40.field1038[arg4][arg2 + 1][arg3] = 50;
                }
                if (var15.field732) {
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 1170);
                }
            }
            if (var15.field727 && arg7 != null) {
                arg7.method655(123, var15.field725, arg6, arg3, arg2, arg8);
            }
            if (var15.field753 != 16) {
                arg0.method202(arg4, arg2, arg3, var15.field753);
            }
        } else if (arg6 == 1) {
            class12 var20;
            if (var15.field755 == -1 && var15.field764 == null) {
                var20 = var15.method240(1, arg8, var11, 123, var14, var10, var9);
            } else {
                var20 = new class51(arg1, 1, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method174(arg4, arg2, arg3, var16, var20, null, class25.field682[arg8], 0, var12, var13);
            if (var15.field712) {
                if (arg8 == 0) {
                    class40.field1038[arg4][arg2][arg3 + 1] = 50;
                } else if (arg8 == 1) {
                    class40.field1038[arg4][arg2 + 1][arg3 + 1] = 50;
                } else if (arg8 == 2) {
                    class40.field1038[arg4][arg2 + 1][arg3] = 50;
                } else if (arg8 == 3) {
                    class40.field1038[arg4][arg2][arg3] = 50;
                }
            }
            if (var15.field727 && arg7 != null) {
                arg7.method655(79, var15.field725, arg6, arg3, arg2, arg8);
            }
        } else if (arg6 == 2) {
            int var21 = arg8 + 1 & 0x3;
            class12 var22;
            class12 var23;
            if (var15.field755 == -1 && var15.field764 == null) {
                var22 = var15.method240(2, arg8 + 4, var11, -31, var14, var10, var9);
                var23 = var15.method240(2, var21, var11, -88, var14, var10, var9);
            } else {
                var22 = new class51(arg1, 2, arg8 + 4, var10, var11, var9, var14, var15.field755, true, null);
                var23 = new class51(arg1, 2, var21, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method174(arg4, arg2, arg3, var16, var22, var23, class89.field2323[arg8], class89.field2323[var21], var12, var13);
            if (var15.field732) {
                if (arg8 == 0) {
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 585);
                    class107.field2671[arg4][arg2][arg3 + 1] = class100.method756(class107.field2671[arg4][arg2][arg3 + 1], 1170);
                } else if (arg8 == 1) {
                    class107.field2671[arg4][arg2][arg3 + 1] = class100.method756(class107.field2671[arg4][arg2][arg3 + 1], 1170);
                    class107.field2671[arg4][arg2 + 1][arg3] = class100.method756(class107.field2671[arg4][arg2 + 1][arg3], 585);
                } else if (arg8 == 2) {
                    class107.field2671[arg4][arg2 + 1][arg3] = class100.method756(class107.field2671[arg4][arg2 + 1][arg3], 585);
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 1170);
                } else if (arg8 == 3) {
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 1170);
                    class107.field2671[arg4][arg2][arg3] = class100.method756(class107.field2671[arg4][arg2][arg3], 585);
                }
            }
            if (var15.field727 && arg7 != null) {
                arg7.method655(-121, var15.field725, arg6, arg3, arg2, arg8);
            }
            if (var15.field753 != 16) {
                arg0.method202(arg4, arg2, arg3, var15.field753);
            }
        } else if (arg6 == 3) {
            class12 var24;
            if (var15.field755 == -1 && var15.field764 == null) {
                var24 = var15.method240(3, arg8, var11, -10, var14, var10, var9);
            } else {
                var24 = new class51(arg1, 3, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method174(arg4, arg2, arg3, var16, var24, null, class25.field682[arg8], 0, var12, var13);
            if (var15.field712) {
                if (arg8 == 0) {
                    class40.field1038[arg4][arg2][arg3 + 1] = 50;
                } else if (arg8 == 1) {
                    class40.field1038[arg4][arg2 + 1][arg3 + 1] = 50;
                } else if (arg8 == 2) {
                    class40.field1038[arg4][arg2 + 1][arg3] = 50;
                } else if (arg8 == 3) {
                    class40.field1038[arg4][arg2][arg3] = 50;
                }
            }
            if (var15.field727 && arg7 != null) {
                arg7.method655(-113, var15.field725, arg6, arg3, arg2, arg8);
            }
        } else if (arg6 == 9) {
            class12 var25;
            if (var15.field755 == -1 && var15.field764 == null) {
                var25 = var15.method240(arg6, arg8, var11, 8, var14, var10, var9);
            } else {
                var25 = new class51(arg1, arg6, arg8, var10, var11, var9, var14, var15.field755, true, null);
            }
            arg0.method176(arg4, arg2, arg3, var16, 1, 1, var25, 0, var12, var13);
            if (var15.field727 && arg7 != null) {
                arg7.method647(var15.field771, arg8, var15.field715, var15.field725, -4, arg3, arg2);
            }
        } else {
            if (var15.field767) {
                if (arg8 == 1) {
                    int var26 = var14;
                    var14 = var9;
                    var9 = var11;
                    var11 = var10;
                    var10 = var26;
                } else if (arg8 == 2) {
                    int var27 = var14;
                    var14 = var11;
                    var11 = var27;
                    int var28 = var9;
                    var9 = var10;
                    var10 = var28;
                } else if (arg8 == 3) {
                    int var29 = var14;
                    var14 = var10;
                    var10 = var11;
                    var11 = var9;
                    var9 = var29;
                }
            }
            if (arg6 == 4) {
                class12 var30;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var30 = var15.method240(4, 0, var11, -72, var14, var10, var9);
                } else {
                    var30 = new class51(arg1, 4, 0, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method215(arg4, arg2, arg3, var16, var30, class89.field2323[arg8], arg8 * 512, 0, 0, var12, var13);
            } else if (arg6 == 5) {
                int var31 = arg0.method182(arg4, arg2, arg3);
                int var32 = 16;
                if (var31 > 0) {
                    var32 = class55.method440(var31 >> 14 & 0x7FFF, (byte) 76).field753;
                }
                class12 var33;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var33 = var15.method240(4, 0, var11, 111, var14, var10, var9);
                } else {
                    var33 = new class51(arg1, 4, 0, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method215(arg4, arg2, arg3, var16, var33, class89.field2323[arg8], arg8 * 512, class64.field1574[arg8] * var32, class28.field812[arg8] * var32, var12, var13);
            } else if (arg6 == 6) {
                class12 var34;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var34 = var15.method240(4, 0, var11, -80, var14, var10, var9);
                } else {
                    var34 = new class51(arg1, 4, 0, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method215(arg4, arg2, arg3, var16, var34, 256, arg8, 0, 0, var12, var13);
            } else if (arg6 == 7) {
                class12 var35;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var35 = var15.method240(4, 0, var11, 118, var14, var10, var9);
                } else {
                    var35 = new class51(arg1, 4, 0, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method215(arg4, arg2, arg3, var16, var35, 512, arg8, 0, 0, var12, var13);
            } else if (arg6 == 8) {
                class12 var36;
                if (var15.field755 == -1 && var15.field764 == null) {
                    var36 = var15.method240(4, 0, var11, -127, var14, var10, var9);
                } else {
                    var36 = new class51(arg1, 4, 0, var10, var11, var9, var14, var15.field755, true, null);
                }
                arg0.method215(arg4, arg2, arg3, var16, var36, 768, arg8, 0, 0, var12, var13);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I", line = 518)
    public static final int method52(int arg0) {
        field252++;
        int var1 = -40 % ((-arg0 - 37) / 63);
        return 19;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLs;)I", line = 536)
    public static final int method53(boolean arg0, class111 arg1) {
        int var2 = 0;
        field261++;
        if (arg1.method820(class38.field981, class95.field2447, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class108.field2690, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class50.field1242, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class26.field698, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class47.field1151, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class7.field135, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class69.field1675, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class42.field1062, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class52.field1309, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class110.field2724, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class67.field1637, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class25.field681, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class21.field580, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class70.field1699, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class107.field2655, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class99.field2507, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class50.field1231, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class94.field2391, (byte) 42)) {
            var2++;
        }
        if (arg1.method820(class38.field981, class122.field3088, (byte) 42)) {
            var2++;
        }
        if (arg0) {
            method51(null, -66, -97, -54, -114, (byte) -128, -29, null, 29);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 622)
    public static final void method54(byte arg0) {
        if (arg0 >= -79) {
            field249 = false;
        }
        field244++;
        while (true) {
            class119 var1 = class128.field3225;
            class33 var2;
            synchronized (class128.field3225) {
                var2 = (class33) class119.field2956.method886(-4996);
            }
            if (var2 == null) {
                return;
            }
            var2.field905.method546((int) var2.field3345, false, var2.field901, (byte) -14, var2.field918);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 651)
    public static void method55(int arg0) {
        field242 = null;
        field251 = null;
        field262 = null;
        field246 = null;
        if (arg0 != 0) {
            return;
        }
        field253 = null;
        field260 = null;
        field259 = null;
        field240 = null;
        field241 = null;
        field243 = null;
        field248 = null;
        field237 = null;
        field247 = null;
        field263 = null;
        field256 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 675)
    public static final void method56(int arg0) {
        field255++;
        if (class117.field2938 != null) {
            class77 var1 = class117.field2938;
            class77 var2 = class69.method506(var1, 112);
            if (var2 == null) {
                class117.field2938 = null;
                return;
            }
            class1.field19++;
            int[] var3 = class41.method310(var2, arg0 - 3161);
            int[] var4 = class41.method310(var1, -123);
            int var5 = class94.field2411 - class6.field118;
            int var6 = class84.field2121 - class87.field2214;
            if (var5 <= var1.field1907 && var5 >= -var1.field1907 && var1.field1907 >= var6 && var6 >= -var1.field1907 && !class99.field2516) {
                var6 = 0;
                var5 = 0;
            } else if (class1.field19 > var1.field1935 || class99.field2516) {
                class99.field2516 = true;
            } else {
                var5 = 0;
                var6 = 0;
            }
            int var7 = var4[0] + var5 - var3[0];
            int var8 = var4[1] + var6 - var3[1];
            if (var7 < 0) {
                var7 = 0;
            }
            if (var1.field1964 + var7 > var2.field1964) {
                var7 = var2.field1964 - var1.field1964;
            }
            if (var8 < 0) {
                var8 = 0;
            }
            if (var2.field1967 < var1.field1967 + var8) {
                var8 = var2.field1967 - var1.field1967;
            }
            if (class117.field2938.field1981 != null && class99.field2516) {
                class55.method433(var1.field1981, var8, var7, 0, 100, var1);
            }
            if (class79.field2024 == 0) {
                if (!class99.field2516) {
                    if (class117.field2938.field1936 != null) {
                        class55.method433(var1.field1936, var8, var7, 0, 100, var1);
                    }
                    if ((class99.field2520 == 1 || class77.method575(114, class97.field2478 - 1)) && class97.field2478 > 2) {
                        class89.method668((byte) 122);
                    } else if (class97.field2478 > 0) {
                        class120.method898(170, class97.field2478 - 1);
                    }
                } else if (class117.field2938.field1912 != null) {
                    class55.method433(var1.field1912, var8, var7, 0, 100, var1);
                }
                class117.field2938 = null;
            }
        }
        if (arg0 != 3051) {
            field247 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII[Lme;IIII)Z", line = 790)
    public static final boolean method57(int arg0, int arg1, int arg2, int arg3, int arg4, class77[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field257++;
        boolean var10 = true;
        if (arg0 < 109) {
            method52(-119);
        }
        class130.method1019(arg7, arg1, arg9, arg3);
        for (int var11 = 0; var11 < arg5.length; var11++) {
            class77 var12 = arg5[var11];
            if (var12 != null && var12.field1920 == arg2) {
                if (var12.field1896 > 0) {
                    class70.method528(var12, (byte) -125);
                }
                int var13 = var12.field1961 + arg1 - arg4;
                int var14 = var12.field1970;
                int var15 = var12.field1878 + arg7 - arg6;
                if (class117.field2938 == var12) {
                    class77 var16 = class69.method506(var12, 119);
                    int[] var17 = class41.method310(var16, -128);
                    int[] var18 = class41.method310(var12, -53);
                    if (!var12.field1971) {
                        var14 = 128;
                    }
                    int var19 = class94.field2411 - class6.field118;
                    int var20 = class84.field2121 - class87.field2214;
                    if (var12.field1907 >= var19 && var19 >= -var12.field1907 && var20 <= var12.field1907 && -var12.field1907 <= var20 && !class99.field2516) {
                        var20 = 0;
                        var19 = 0;
                    } else if (class1.field19 > var12.field1935 || class99.field2516) {
                        class99.field2516 = true;
                    } else {
                        var20 = 0;
                        var19 = 0;
                    }
                    int var21 = var18[1] + var20 - var17[1];
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var22 = var18[0] + var19 - var17[0];
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var21 + var12.field1967 > var16.field1967) {
                        var21 = var16.field1967 - var12.field1967;
                    }
                    if (var16.field1964 < var12.field1964 + var22) {
                        var22 = var16.field1964 - var12.field1964;
                    }
                    var15 = var17[0] + var22;
                    var13 = var17[1] + var21;
                }
                if ((!var12.field1895 || var15 <= class130.field3240 && class130.field3243 >= var13 && class130.field3238 <= var12.field1964 + var15 && var12.field1967 + var13 >= class130.field3241) && (!var12.field1895 || !var12.field1897)) {
                    if (var12.field1917 == 0) {
                        if (var12.field1897 && !class80.method597(arg8, -4, var11)) {
                            continue;
                        }
                        if (!var12.field1895) {
                            if (var12.field1866 - var12.field1967 < var12.field1915) {
                                var12.field1915 = var12.field1866 - var12.field1967;
                            }
                            if (var12.field1915 < 0) {
                                var12.field1915 = 0;
                            }
                        }
                        var10 &= method57(114, var13, var12.field1928, var12.field1967 + var13, var12.field1915, arg5, var12.field1873, var15, arg8, var15 + var12.field1964);
                        if (var12.field1918 != null) {
                            var10 &= method57(127, var13, var12.field1928, var13 + var12.field1967, var12.field1915, var12.field1918, var12.field1873, var15, arg8, var15 + var12.field1964);
                        }
                        class130.method1019(arg7, arg1, arg9, arg3);
                        if (var12.field1866 > var12.field1967) {
                            class31.method265(var12.field1866, var12.field1967, var12.field1915, var15 + var12.field1964, -102, var13);
                        }
                    }
                    if (var12.field1917 != 1) {
                        if (var12.field1917 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field1967; var24++) {
                                for (int var25 = 0; var25 < var12.field1964; var25++) {
                                    int var26 = (var12.field1903 + 32) * var25 + var15;
                                    int var27 = var13 + (var12.field1968 + 32) * var24;
                                    if (var23 < 20) {
                                        var27 += var12.field1933[var23];
                                        var26 += var12.field1979[var23];
                                    }
                                    if (var12.field1869[var23] > 0) {
                                        boolean var28 = false;
                                        int var29 = var12.field1869[var23] - 1;
                                        boolean var30 = false;
                                        if (var26 > class130.field3238 - 32 && var26 < class130.field3240 && class130.field3241 - 32 < var27 && var27 < class130.field3243 || class100.field2535 != 0 && class136.field3325 == var23) {
                                            class116 var31;
                                            if (class126.field3178 == 1 && class107.field2669 == var23 && class17.field422 == var12.field1928) {
                                                var31 = class47.method348(var12.field1919[var23], (byte) 28, false, var29, 0, 2);
                                            } else {
                                                var31 = class47.method348(var12.field1919[var23], (byte) 28, false, var29, 3153952, 1);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class100.field2535 != 0 && class136.field3325 == var23 && class119.field2977 == var12.field1928) {
                                                int var32 = class94.field2411 - class17.field423;
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                int var33 = class84.field2121 - class64.field1566;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (client.field489 < 5) {
                                                    var33 = 0;
                                                    var32 = 0;
                                                }
                                                var31.method870(var26 + var32, var27 + var33, 128);
                                                if (arg2 != -1) {
                                                    class77 var34 = arg5[arg2 & 0xFFFF];
                                                    if (class130.field3241 > var27 + var33 && var34.field1915 > 0) {
                                                        int var35 = (class130.field3241 - var27 - var33) * class66.field1620 / 3;
                                                        if (class66.field1620 * 10 < var35) {
                                                            var35 = class66.field1620 * 10;
                                                        }
                                                        if (var34.field1915 < var35) {
                                                            var35 = var34.field1915;
                                                        }
                                                        class64.field1566 += var35;
                                                        var34.field1915 -= var35;
                                                    }
                                                    if (var27 + var33 + 32 > class130.field3243 && var34.field1915 < var34.field1866 - var34.field1967) {
                                                        int var36 = (var27 + var33 + 32 - class130.field3243) * class66.field1620 / 3;
                                                        if (class66.field1620 * 10 < var36) {
                                                            var36 = class66.field1620 * 10;
                                                        }
                                                        if (var36 > var34.field1866 - var34.field1967 - var34.field1915) {
                                                            var36 = var34.field1866 - var34.field1967 - var34.field1915;
                                                        }
                                                        class64.field1566 -= var36;
                                                        var34.field1915 += var36;
                                                    }
                                                }
                                            } else if (class134.field3297 != 0 && class77.field1957 == var23 && class23.field593 == var12.field1928) {
                                                var31.method870(var26, var27, 128);
                                            } else {
                                                var31.method873(var26, var27);
                                            }
                                        }
                                    } else if (var12.field1973 != null && var23 < 20) {
                                        class116 var37 = var12.method578(var23, (byte) -118);
                                        if (var37 != null) {
                                            var37.method873(var26, var27);
                                        } else if (class37.field965) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field1917 == 3) {
                            int var38;
                            if (class2.method12(var12, (byte) -59)) {
                                var38 = var12.field1862;
                                if (class80.method597(arg8, -4, var11) && var12.field1887 != 0) {
                                    var38 = var12.field1887;
                                }
                            } else {
                                var38 = var12.field1876;
                                if (class80.method597(arg8, -4, var11) && var12.field1916 != 0) {
                                    var38 = var12.field1916;
                                }
                            }
                            if (var14 == 0) {
                                if (var12.field1944) {
                                    class130.method1028(var15, var13, var12.field1964, var12.field1967, var38);
                                } else {
                                    class130.method1032(var15, var13, var12.field1964, var12.field1967, var38);
                                }
                            } else if (var12.field1944) {
                                class130.method1021(var15, var13, var12.field1964, var12.field1967, var38, 256 - (var14 & 0xFF));
                            } else {
                                class130.method1027(var15, var13, var12.field1964, var12.field1967, var38, 256 - (var14 & 0xFF));
                            }
                        } else if (var12.field1917 == 4) {
                            class16 var39 = var12.method573(false);
                            if (var39 != null) {
                                class94 var40 = var12.field1905;
                                int var41;
                                if (class2.method12(var12, (byte) -59)) {
                                    var41 = var12.field1862;
                                    if (class80.method597(arg8, -4, var11) && var12.field1887 != 0) {
                                        var41 = var12.field1887;
                                    }
                                    if (var12.field1939.method710(-123) > 0) {
                                        var40 = var12.field1939;
                                    }
                                } else {
                                    var41 = var12.field1876;
                                    if (class80.method597(arg8, -4, var11) && var12.field1916 != 0) {
                                        var41 = var12.field1916;
                                    }
                                }
                                if (var12.field1895 && var12.field1956 != -1) {
                                    class110 var42 = class39.method295(var12.field1956, 1);
                                    var40 = var42.field2713;
                                    if (var40 == null) {
                                        var40 = class8.field175;
                                    }
                                    if (var42.field2727 == 1 || var12.field1883 != 1) {
                                        var40 = class4.method20(new class94[] { var40, class98.field2484, class69.method510(var12.field1883, -4) }, true);
                                    }
                                }
                                if (var12.field1894 == 6 && class111.field2809 == var12.field1928) {
                                    var41 = var12.field1876;
                                    var40 = class20.field550;
                                }
                                if (class130.field3239 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class94 var43 = class31.method263(var12, 0, var40);
                                var39.method121(var43, var15, var13, var12.field1964, var12.field1967, var41, var12.field1913, var12.field1899, var12.field1922, var12.field1888);
                            } else if (class37.field965) {
                                var10 = false;
                            }
                        } else if (var12.field1917 == 5) {
                            if (var12.field1895) {
                                class116 var45;
                                if (var12.field1956 == -1) {
                                    var45 = var12.method576(false, -23772);
                                } else {
                                    var45 = class47.method348(var12.field1883, (byte) 28, false, var12.field1956, var12.field1925, var12.field1982);
                                }
                                if (var45 != null) {
                                    int var46 = var45.field2931;
                                    int var47 = var45.field2928;
                                    if (var12.field1911) {
                                        int[] var48 = new int[4];
                                        class130.method1023(var48);
                                        int var49 = var15;
                                        if (var15 < var48[0]) {
                                            var49 = var48[0];
                                        }
                                        int var50 = var13;
                                        if (var48[1] > var13) {
                                            var50 = var48[1];
                                        }
                                        int var51 = var12.field1964 + var15;
                                        if (var51 > var48[2]) {
                                            var51 = var48[2];
                                        }
                                        int var52 = var13 + var12.field1967;
                                        if (var48[3] < var52) {
                                            var52 = var48[3];
                                        }
                                        class130.method1019(var49, var50, var51, var52);
                                        int var53 = (var46 + var12.field1964 - 1) / var46;
                                        int var54 = (var47 + var12.field1967 - 1) / var47;
                                        for (int var55 = 0; var55 < var53; var55++) {
                                            for (int var56 = 0; var56 < var54; var56++) {
                                                if (var12.field1927 != 0) {
                                                    var45.method864(var46 * var55 + var46 / 2 + var15, var47 / 2 + var47 * var56 + var13, var12.field1927, 4096);
                                                } else if (var14 == 0) {
                                                    var45.method873(var15 + var46 * var55, var47 * var56 + var13);
                                                } else {
                                                    var45.method870(var46 * var55 + var15, var47 * var56 + var13, 256 - (var14 & 0xFF));
                                                }
                                            }
                                        }
                                        class130.method1029(var48);
                                    } else {
                                        int var57 = var12.field1964 * 4096 / var46;
                                        if (var12.field1927 != 0) {
                                            var45.method864(var15 + var12.field1964 / 2, var12.field1967 / 2 + var13, var12.field1927, var57);
                                        } else if (var14 != 0) {
                                            var45.method862(var15, var13, var12.field1964, var12.field1967, 256 - (var14 & 0xFF));
                                        } else if (var12.field1964 == var46 && var12.field1967 == var47) {
                                            var45.method873(var15, var13);
                                        } else {
                                            var45.method876(var15, var13, var12.field1964, var12.field1967);
                                        }
                                    }
                                } else if (class37.field965) {
                                    var10 = false;
                                }
                            } else {
                                class116 var44 = var12.method576(class2.method12(var12, (byte) -59), -23772);
                                if (var44 != null) {
                                    var44.method873(var15, var13);
                                } else if (class37.field965) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field1917 == 6) {
                            boolean var58 = class2.method12(var12, (byte) -59);
                            Object var59 = null;
                            int var60;
                            if (var58) {
                                var60 = var12.field1879;
                            } else {
                                var60 = var12.field1931;
                            }
                            class48 var62;
                            if (var12.field1969 == 5) {
                                if (var12.field1893 == 0) {
                                    var62 = class52.field1304.method516(-1, null, null, -1, 256);
                                } else {
                                    var62 = class80.field2044.method77(1536);
                                }
                            } else if (var60 == -1) {
                                var62 = var12.method580((byte) 50, -1, class80.field2044.field2299, null, var58);
                                if (var62 == null && class37.field965) {
                                    var10 = false;
                                }
                            } else {
                                class57 var61 = class70.method519(5, var60);
                                var62 = var12.method580((byte) 50, var12.field1904, class80.field2044.field2299, var61, var58);
                                if (var62 == null && class37.field965) {
                                    var10 = false;
                                }
                            }
                            int var63 = var12.field1875;
                            int var64 = var12.field1892;
                            int var65 = var12.field1960;
                            int var66 = var12.field1886;
                            int var67 = var12.field1955;
                            int var68 = var12.field1948;
                            if (var12.field1956 != -1) {
                                class110 var69 = class39.method295(var12.field1956, 1);
                                if (var69 != null) {
                                    class110 var70 = var69.method805(var12.field1883, (byte) -117);
                                    var62 = var70.method804(true, 1, true);
                                    var63 = var70.field2744;
                                    var66 = var70.field2738;
                                    var64 = var70.field2718;
                                    var68 = var70.field2716;
                                    if (var12.field1964 > 0) {
                                        var68 = var68 * 32 / var12.field1964;
                                    }
                                    var65 = var70.field2719;
                                    var67 = var70.field2742;
                                }
                            }
                            class124.method981(var12.field1964 / 2 + var15, var12.field1967 / 2 + var13);
                            int var71 = class124.field3152[var64] * var68 >> 16;
                            int var72 = class124.field3146[var64] * var68 >> 16;
                            if (var62 != null) {
                                if (var12.field1895) {
                                    var62.method354();
                                    if (var12.field1972) {
                                        var62.method355(0, var63, var66, var64, var65, var62.field297 / 2 + var67 + var71, var67 + var72, var68);
                                    } else {
                                        var62.method378(0, var63, var66, var64, var65, var62.field297 / 2 + var67 + var71, var67 + var72);
                                    }
                                } else {
                                    var62.method378(0, var63, 0, var64, 0, var71, var72);
                                }
                            }
                            class124.method992();
                        } else {
                            if (var12.field1917 == 7) {
                                class16 var73 = var12.method573(false);
                                if (var73 == null) {
                                    if (class37.field965) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var74 = 0;
                                for (int var75 = 0; var75 < var12.field1967; var75++) {
                                    for (int var76 = 0; var76 < var12.field1964; var76++) {
                                        if (var12.field1869[var74] > 0) {
                                            class110 var77 = class39.method295(var12.field1869[var74] - 1, 1);
                                            class94 var78 = var77.field2713;
                                            if (var78 == null) {
                                                var78 = class8.field175;
                                            }
                                            if (var77.field2727 == 1 || var12.field1919[var74] != 1) {
                                                var78 = class4.method20(new class94[] { var78, class98.field2484, class69.method510(var12.field1919[var74], -4) }, true);
                                            }
                                            int var79 = (var12.field1968 + 12) * var75 + var13;
                                            int var80 = (var12.field1903 + 115) * var76 + var15;
                                            if (var12.field1899 == 0) {
                                                var73.method103(var78, var80, var79, var12.field1876, var12.field1913);
                                            } else if (var12.field1899 == 1) {
                                                var73.method116(var78, var12.field1964 / 2 + var80, var79, var12.field1876, var12.field1913);
                                            } else {
                                                var73.method107(var78, var80 + var12.field1964 - 1, var79, var12.field1876, var12.field1913);
                                            }
                                        }
                                        var74++;
                                    }
                                }
                            }
                            if (var12.field1917 == 8 && class2.method14(arg8, var11, (byte) 104) && class29.field844 == class20.field564) {
                                int var81 = 0;
                                class16 var82 = class112.field2835;
                                int var83 = 0;
                                class94 var84 = var12.field1905;
                                class94 var85 = class31.method263(var12, 0, var84);
                                while (var85.method710(-123) > 0) {
                                    int var93 = var85.method711(-34, class123.field3127);
                                    class94 var94;
                                    if (var93 == -1) {
                                        var94 = var85;
                                        var85 = class8.field230;
                                    } else {
                                        var94 = var85.method706(var93, (byte) 116, 0);
                                        var85 = var85.method687(var93 + 2, -123);
                                    }
                                    int var95 = var82.method113(var94);
                                    if (var95 > var81) {
                                        var81 = var95;
                                    }
                                    var83 += var82.field398 + 1;
                                }
                                var81 += 6;
                                int var86 = var12.field1964 + var15 - var81 - 5;
                                var83 += 7;
                                if (var15 + 5 > var86) {
                                    var86 = var15 + 5;
                                }
                                int var87 = var13 + var12.field1967 + 5;
                                if (arg9 < var86 + var81) {
                                    var86 = arg9 - var81;
                                }
                                if (var83 + var87 > arg3) {
                                    var87 = arg3 - var83;
                                }
                                class130.method1028(var86, var87, var81, var83, 16777120);
                                class130.method1032(var86, var87, var81, var83, 0);
                                class94 var88 = var12.field1905;
                                int var89 = var82.field398 + var87 + 2;
                                class94 var90 = class31.method263(var12, 0, var88);
                                while (var90.method710(-123) > 0) {
                                    int var91 = var90.method711(-34, class123.field3127);
                                    class94 var92;
                                    if (var91 == -1) {
                                        var92 = var90;
                                        var90 = class8.field230;
                                    } else {
                                        var92 = var90.method706(var91, (byte) 116, 0);
                                        var90 = var90.method687(var91 + 2, -123);
                                    }
                                    var82.method103(var92, var86 + 3, var89, 0, false);
                                    var89 += var82.field398 + 1;
                                }
                            }
                            if (var12.field1917 == 9) {
                                if (var12.field1910 == 1) {
                                    class130.method1025(var15, var13, var12.field1964 + var15, var12.field1967 + var13, var12.field1876);
                                } else {
                                    int var96 = var12.field1964 < 0 ? -var12.field1964 : var12.field1964;
                                    int var97 = var12.field1967 < 0 ? -var12.field1967 : var12.field1967;
                                    int var98 = var96;
                                    if (var97 > var96) {
                                        var98 = var97;
                                    }
                                    if (var98 != 0) {
                                        int var99 = (var12.field1964 << 16) / var98;
                                        int var100 = (var12.field1967 << 16) / var98;
                                        if (var99 >= var100) {
                                            var99 = -var99;
                                        } else {
                                            var100 = -var100;
                                        }
                                        int var101 = var12.field1910 * var100 + 1 >> 17;
                                        int var102 = var12.field1910 * var99 + 1 >> 17;
                                        int var103 = var12.field1910 * var100 >> 17;
                                        int var104 = var15 + var103;
                                        int var105 = var12.field1910 * var99 >> 17;
                                        int var106 = var15 - var101;
                                        int var107 = var12.field1964 + var15 - var101;
                                        int var108 = var15 + var12.field1964 + var103;
                                        int var109 = var13 - var102;
                                        int var110 = var13 + var105;
                                        int var111 = var12.field1967 + var13 - var102;
                                        int var112 = var12.field1967 + var13 + var105;
                                        class124.method986(var104, var106, var107);
                                        class124.method996(var110, var109, var111, var104, var106, var107, var12.field1876);
                                        class124.method986(var104, var107, var108);
                                        class124.method996(var110, var111, var112, var104, var107, var108, var12.field1876);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lme;I)V", line = 1600)
    public static final void method58(class77 arg0, int arg1) {
        int var2;
        if (~arg0.field1928 > arg1) {
            var2 = arg0.field1920 >> 16;
        } else {
            var2 = arg0.field1928 >> 16;
        }
        field239++;
        if (class115.field2925 == var2 || class75.field1837 == var2) {
            class73.field1781 = true;
        }
        if (class45.field1108 == var2 || class42.field1065[class92.field2361] == var2) {
            class135.field3323 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 1624)
    public static final void method59(byte arg0) {
        field258++;
        if (arg0 != 1) {
            return;
        }
        if (class115.field2912 && class64.field1589 != class102.field2581) {
            class6.method35(class19.field522, (byte) -123, class75.field1838, class80.field2044.field219[0], class80.field2044.field165[0], class64.field1589);
        } else if (class64.field1589 != class25.field680) {
            class25.field680 = class64.field1589;
            class105.method775(class64.field1589, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "run", descriptor = "()V", line = 1663)
    public final void run() {
        field254++;
        try {
            while (true) {
                class119 var1 = class128.field3225;
                class33 var2;
                synchronized (class128.field3225) {
                    var2 = (class33) class128.field3225.method895(-14156);
                }
                if (var2 == null) {
                    class127.method1004(100L, 98);
                    Object var6 = class70.field1686;
                    synchronized (class70.field1686) {
                        if (class80.field2050 <= 1) {
                            class80.field2050 = 0;
                            class70.field1686.notifyAll();
                            return;
                        }
                        class80.field2050--;
                    }
                } else {
                    if (var2.field902 == 0) {
                        var2.field901.method398(var2.field918.length, (byte) -116, (int) var2.field3345, var2.field918);
                        class119 var4 = class128.field3225;
                        synchronized (class128.field3225) {
                            var2.method1074((byte) -28);
                        }
                    } else if (var2.field902 == 1) {
                        var2.field918 = var2.field901.method397((int) var2.field3345, -5989);
                        class119 var3 = class128.field3225;
                        synchronized (class128.field3225) {
                            class119.field2956.method894(12800, var2);
                        }
                    }
                    Object var5 = class70.field1686;
                    synchronized (class70.field1686) {
                        if (class80.field2050 <= 1) {
                            class80.field2050 = 0;
                            class70.field1686.notifyAll();
                            return;
                        }
                        class80.field2050 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class81.method607(null, var17, (byte) -125);
        }
    }
}
