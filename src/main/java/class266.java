import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class266 extends class612 {

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public int field3374 = -1;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "Lmq;")
    public static class78 field3360 = new class78(60, 4);

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field3369 = 2;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "[S")
    public static short[] field3373 = new short[256];

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
    public static int field3376 = 1400;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "Ljava/lang/String;")
    public String field3362;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "Ljava/lang/String;")
    public String field3367;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILlea;BILdfa;)V", line = 5)
    public static final void method1597(int arg0, class546 arg1, byte arg2, int arg3, class757 arg4) {
        ++field3363;
        byte var5 = -1;
        if (~(arg0 & 512) != -1) {
            var5 = arg4.method1136((byte) -102);
        }
        if ((arg0 & 32768) != 0) {
            arg1.field7677 = arg4.method1140((byte) 123) == 1;
        }
        if ((arg0 & 128) != 0) {
            class664.field9089[arg3] = arg4.method1125(false);
        }
        if (~(arg0 & 8) != -1) {
            int var6 = arg4.method1117((byte) -73);
            if (~var6 < -1) {
                for (int var7 = 0; var6 > var7; ++var7) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg4.method1158(-32768);
                    if (var11 == 32767) {
                        var11 = arg4.method1158(-32768);
                        var9 = arg4.method1158(-32768);
                        var8 = arg4.method1158(-32768);
                        var10 = arg4.method1158(-32768);
                    } else if (~var11 != -32767) {
                        var9 = arg4.method1158(-32768);
                    } else {
                        var11 = -1;
                    }
                    int var12 = arg4.method1158(-32768);
                    int var13 = arg4.method1117((byte) -73);
                    arg1.method257(var9, field3368, var12, var11, var10, var13, var8, (byte) -103);
                }
            }
        }
        if ((arg0 & 1024) != 0) {
            int var14 = arg4.method1094(255);
            int[] var15 = new int[var14];
            int[] var16 = new int[var14];
            int[] var17 = new int[var14];
            for (int var18 = 0; var14 > var18; ++var18) {
                int var19 = arg4.method1153(true);
                if (var19 == 65535) {
                    var19 = -1;
                }
                var15[var18] = var19;
                var16[var18] = arg4.method1117((byte) -73);
                var17[var18] = arg4.method1153(true);
            }
            class462.method2736(var17, 0, var16, arg1, var15);
        }
        if (arg2 != -11) {
            method1600(84, -64, -73, 77, (byte) 32);
        }
        if ((256 & arg0) != 0) {
            int var20 = arg4.method1107(false);
            arg1.field416 = arg4.method1154((byte) -74);
            arg1.field350 = arg4.method1117((byte) -73);
            arg1.field372 = (var20 & 32768) != 0;
            arg1.field411 = var20 & 32767;
            arg1.field394 = field3368 - -arg1.field416 + arg1.field411;
        }
        if (~(16 & arg0) != -1) {
            int var21 = arg4.method1122(18726);
            int var22 = arg4.method1111(-17320);
            if (~var21 == -65536) {
                var21 = -1;
            }
            int var23 = arg4.method1094(arg2 ^ -246);
            int var24 = var23 & 7;
            int var25 = var23 >> 3 & 15;
            if (var25 == 15) {
                var25 = -1;
            }
            arg1.method261(var22, var25, false, (byte) 36, var21, var24);
        }
        if (~(16384 & arg0) != -1) {
            arg1.field334 = arg4.method1106(-1);
            if (arg1.field334.charAt(0) == '~') {
                arg1.field334 = arg1.field334.substring(1);
                class673.method3627((byte) -128, arg1.field7656, arg1.method3105((byte) 86, false), 2, arg1.method3101(117, true), 0, arg1.field334);
            } else if (class339.field4374 == arg1) {
                class673.method3627((byte) -127, arg1.field7656, arg1.method3105((byte) 120, false), 2, arg1.method3101(116, true), 0, arg1.field334);
            }
            arg1.field345 = 150;
            arg1.field356 = 0;
            arg1.field409 = 0;
        }
        if (~(arg0 & 2) != -1) {
            int var26 = arg4.method1117((byte) -73);
            byte[] var27 = new byte[var26];
            class179 var28 = new class179(var27);
            arg4.method1097(false, var27, 0, var26);
            class576.field8042[arg3] = var28;
            arg1.method3098((byte) -40, var28);
        }
        if ((4 & arg0) != 0) {
            int var29 = arg4.method1153(true);
            if (var29 == 65535) {
                var29 = -1;
            }
            arg1.field407 = var29;
        }
        if ((8192 & arg0) != 0) {
            arg1.field406 = arg4.method1136((byte) -102);
            arg1.field366 = arg4.method1133(8);
            arg1.field342 = arg4.method1136((byte) -102);
            arg1.field341 = arg4.method1131(arg2 + -117);
            arg1.field339 = arg4.method1107(false) - -field3368;
            arg1.field355 = arg4.method1107(false) - -field3368;
            arg1.field330 = arg4.method1154((byte) -65);
            arg1.field434 = 0;
            if (!arg1.field7673) {
                arg1.field406 += arg1.field435[0];
                arg1.field427 = 1;
                arg1.field341 += arg1.field426[0];
                arg1.field366 += arg1.field426[0];
                arg1.field342 += arg1.field435[0];
            } else {
                arg1.field366 += arg1.field7669;
                arg1.field341 += arg1.field7669;
                arg1.field406 += arg1.field7694;
                arg1.field427 = 0;
                arg1.field342 += arg1.field7694;
            }
        }
        if ((arg0 & 64) != 0) {
            arg1.field7703 = arg4.method1153(true);
            if (arg1.field427 == 0) {
                arg1.method266(-122, arg1.field7703);
                arg1.field7703 = -1;
            }
        }
        if ((arg0 & 262144) != 0) {
            int var30 = arg4.method1094(255);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            for (int var33 = 0; ~var33 > ~var30; ++var33) {
                int var34 = arg4.method1107(false);
                if (~(var34 & 49152) == -49153) {
                    int var35 = arg4.method1122(18726);
                    var31[var33] = class216.method1308(var35, var34 << 16);
                } else {
                    var31[var33] = var34;
                }
                var32[var33] = arg4.method1107(false);
            }
            arg1.method255(var32, var31, -110);
        }
        if ((arg0 & 2048) != 0) {
            int var36 = arg4.method1122(18726);
            int var37 = arg4.method1144(arg2 + -15178);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var38 = arg4.method1117((byte) -73);
            int var39 = 7 & var38;
            int var40 = var38 >> 3 & 15;
            if (var40 == 15) {
                var40 = -1;
            }
            arg1.method261(var37, var40, true, (byte) 36, var36, var39);
        }
        if ((1 & arg0) != 0) {
            int[] var41 = new int[4];
            for (int var42 = 0; ~var42 > -5; ++var42) {
                var41[var42] = arg4.method1153(true);
                if (var41[var42] == 65535) {
                    var41[var42] = -1;
                }
            }
            int var43 = arg4.method1094(255);
            class177.method1086(2, var41, arg1, var43);
        }
        if (~(65536 & arg0) != -1) {
            arg1.field365 = arg4.method1133(8);
            arg1.field398 = arg4.method1125(false);
            arg1.field344 = arg4.method1125(false);
            arg1.field380 = (byte) arg4.method1094(255);
            arg1.field333 = field3368 - -arg4.method1107(false);
            arg1.field327 = field3368 + arg4.method1119(false);
        }
        if (arg1.field7673) {
            if (~var5 == -128) {
                arg1.method3103(arg1.field7669, arg1.field7694, (byte) 7);
            } else {
                byte var44;
                if (~var5 != 0) {
                    var44 = var5;
                } else {
                    var44 = class664.field9089[arg3];
                }
                class612.method3347(var44, arg1, -108);
                arg1.method3097(96, arg1.field7669, var44, arg1.field7694);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CB)C", line = 344)
    public static final char method1598(char arg0, byte arg1) {
        if (arg1 != -86) {
            field3366 = -67;
        }
        ++field3361;
        if (~arg0 != -33 && ~arg0 != -161 && ~arg0 != -96 && arg0 != '-') {
            if (~arg0 != -92 && arg0 != ']' && arg0 != '#') {
                if (arg0 != 224 && arg0 != 225 && arg0 != 226 && arg0 != 228 && arg0 != 227 && arg0 != 192 && ~arg0 != -194 && arg0 != 194 && arg0 != 196 && ~arg0 != -196) {
                    if (~arg0 != -233 && arg0 != 233 && ~arg0 != -235 && ~arg0 != -236 && ~arg0 != -201 && arg0 != 201 && arg0 != 202 && ~arg0 != -204) {
                        if (~arg0 != -238 && arg0 != 238 && arg0 != 239 && ~arg0 != -206 && ~arg0 != -207 && arg0 != 207) {
                            if (arg0 != 242 && ~arg0 != -244 && ~arg0 != -245 && ~arg0 != -247 && ~arg0 != -246 && ~arg0 != -211 && arg0 != 211 && arg0 != 212 && ~arg0 != -215 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && ~arg0 != -252 && ~arg0 != -253 && arg0 != 217 && arg0 != 218 && ~arg0 != -220 && arg0 != 220) {
                                    if (~arg0 != -232 && ~arg0 != -200) {
                                        if (arg0 != 255 && arg0 != 376) {
                                            if (arg0 != 241 && ~arg0 != -210) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I", line = 741)
    public static final int method1599(int arg0) {
        if (arg0 != 22396) {
            method1602((byte) 27);
        }
        ++field3371;
        return class173.field2265++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIB)V", line = 757)
    public static final void method1600(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3370;
        for (int var5 = 0; class48.field702 > var5; ++var5) {
            Rectangle var6 = class101.field1238[var5];
            if (~(var6.x + var6.width) < ~arg3 && arg0 + arg3 > var6.x && var6.y + var6.height > arg1 && ~var6.y > ~(arg1 + arg2)) {
                class709.field9971[var5] = true;
            }
        }
        if (arg4 != -128) {
            method1603((byte) -106);
        }
        class365.method2249(true, arg1 - -arg2, arg1, arg0 + arg3, arg3);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILd;ILjava/awt/Canvas;I)Lha;", line = 782)
    public static final class454 method1601(int arg0, class96 arg1, int arg2, Canvas arg3, int arg4) {
        ++field3364;
        return arg0 != 3262 ? null : new class12(arg3, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)V", line = 795)
    public static final void method1602(byte arg0) {
        class521.method2994(-93);
        if (arg0 >= -6) {
            field3369 = 111;
        }
        ++field3372;
        class322.field4113 = false;
        method1600(class521.field7340, class649.field8919, class382.field5329, class333.field4301, (byte) -128);
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)V", line = 818)
    public static void method1603(byte arg0) {
        field3373 = null;
        field3360 = null;
        if (arg0 >= -84) {
            method1600(58, -27, 77, -110, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)Ldia;", line = 829)
    public final class673 method1604(int arg0) {
        if (arg0 != -30874) {
            return null;
        } else {
            ++field3365;
            return class138.field1652[super.field8462];
        }
    }
}
