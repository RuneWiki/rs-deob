import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class188 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lp;")
    private class262 field3138 = null;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    private int field3147 = 65000;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lp;")
    private class262 field3151 = null;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Ldf;")
    private static class51 field3142 = class46.method233("M", 100);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Ldf;")
    public static class51 field3150 = field3142;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3143 = -1;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ldf;")
    public static class51 field3140 = field3142;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Ldf;")
    public static class51 field3149 = class46.method233("Lade)3)3)3", 100);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[B")
    public final byte[] method1340(int arg0, byte arg1) {
        field3141++;
        class262 var3 = this.field3151;
        synchronized (this.field3151) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3138.method1777((byte) 95)) {
                    return null;
                }
                if (arg1 != 94) {
                    this.method1340(-34, (byte) -79);
                }
                this.field3138.method1785((long) (arg0 * 6), arg1 + 19209);
                this.field3138.method1779(0, 6, class97.field1615, (byte) -107);
                int var5 = ((class97.field1615[1] & 0xFF) << 8) + (((class97.field1615[0] & 0xFF) << 16) + (class97.field1615[2] & 0xFF));
                int var6 = (class97.field1615[4] & 0xFF << 8) + ((class97.field1615[3] & 0xFF << 16) + (class97.field1615[5] & 0xFF));
                if (var5 < 0 || var5 > this.field3147) {
                    return null;
                } else if (var6 > 0 && this.field3151.method1777((byte) 95) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3151.method1785((long) (var6 * 520), 19303);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3151.method1779(0, var13 + 8, class97.field1615, (byte) -107);
                        int var14 = ((class97.field1615[0] & 0xFF) << 8) + (class97.field1615[1] & 0xFF);
                        int var15 = (class97.field1615[4] & 0xFF << 16) + (class97.field1615[6] & 0xFF) + (class97.field1615[5] & 0xFF << 8);
                        int var16 = class97.field1615[7] & 0xFF;
                        int var17 = (class97.field1615[2] & 0xFF << 8) + (class97.field1615[3] & 0xFF);
                        if (arg0 == var14 && var10 == var17 && this.field3145 == var16) {
                            if (var15 >= 0 && ((long) var15) <= (this.field3151.method1777((byte) 95) / 520L)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class97.field1615[var20 + 8];
                                }
                                var10++;
                                var6 = var15;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkf;IIIIZIZIII)V")
    public static final void method1341(class170 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3152++;
        if (arg5 && !class34.method170(-60) && (class160.field2626[0][arg9][arg6] & 0x2) == 0) {
            if ((class160.field2626[arg1][arg9][arg6] & 0x10) != 0) {
                return;
            }
            if (class259.method1763((byte) 116, arg6, arg1, arg9) != class245.field4253) {
                return;
            }
        }
        if (class62.field1010 > arg1) {
            class62.field1010 = arg1;
        }
        class108 var11 = class41.method210(arg4, (byte) 75);
        int var12;
        int var13;
        if (arg8 == 1 || arg8 == 3) {
            var13 = var11.field1824;
            var12 = var11.field1807;
        } else {
            var12 = var11.field1824;
            var13 = var11.field1807;
        }
        int var14;
        int var15;
        if (arg9 + var12 <= 104) {
            var14 = (var12 >> 1) + arg9;
            var15 = (var12 + 1 >> 1) + arg9;
        } else {
            var14 = arg9;
            var15 = arg9 + 1;
        }
        int[][] var16 = class172.field2820[arg10];
        int var17 = (arg9 << 7) + (var12 << 6);
        int var18 = (arg6 << 7) + (var13 << 6);
        int var19;
        int var20;
        if ((arg6 + var13) > 104) {
            var19 = arg6 + 1;
            var20 = arg6;
        } else {
            var19 = (var13 + 1 >> 1) + arg6;
            var20 = (var13 >> 1) + arg6;
        }
        int[][] var21 = null;
        if (arg7) {
            var21 = class101.field1682[0];
        } else if (arg10 < 3) {
            var21 = class172.field2820[arg10 + 1];
        }
        long var22 = (long) (arg6 | 0x800000 << 7 | arg9 | arg3 << 14 | arg8 << 20);
        if (var11.field1835 == arg2 || arg7) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field1829 == 1) {
            var22 |= 0x400000L;
        }
        int var24 = var16[var14][var20] + var16[var15][var20] - (-var16[var14][var19] + -var16[var15][var19]) >> 2;
        if (var11.field1832) {
            var22 |= 0x80000000L;
        }
        if (var11.method776(66)) {
            class230.method1589((class83) null, arg8, arg9, (class103) null, (byte) -119, arg1, var11, arg6);
        }
        long var25 = var22 | (long) arg4 << 32;
        boolean var27 = !arg7 & var11.field1805;
        if (arg3 == 22) {
            if (class193.field3244 || var11.field1835 != 0 || var11.field1779 == 1 || var11.field1817) {
                class49 var29;
                if (var11.field1782 == -1 && var11.field1796 == null) {
                    class183 var28 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 75, 22, arg8, var17, var21);
                    var29 = var28.field3017;
                } else {
                    var29 = new class22(arg4, 22, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
                }
                class162.method1144(arg1, arg9, arg6, var24, var29, var25, var11.field1804);
                if (var11.field1779 == 1 && arg0 != null) {
                    arg0.method1178(arg9, 262144, arg6);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class49 var69;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var68 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 74, 10, arg3 == 11 ? arg8 + 4 : arg8, var17, var21);
                var69 = var68.field3017;
            } else {
                var69 = new class22(arg4, 10, arg3 == 11 ? arg8 + 4 : arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            if (var69 != null) {
                boolean var70 = class131.method966(arg1, arg9, arg6, var24, var12, var13, var69, 0, var25);
                if (var11.field1790 && var70 && arg5) {
                    int var71 = 15;
                    if (var69 instanceof class65) {
                        var71 = ((class65) var69).method434() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class64.field1039[arg1][arg9 + var72][arg6 + var73]) {
                                class64.field1039[arg1][arg9 + var72][arg6 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1190(var12, var13, var11.field1800, arg9, 19661184, arg6);
            }
        } else if (arg3 >= 12) {
            class49 var31;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var30 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 118, arg3, arg8, var17, var21);
                var31 = var30.field3017;
            } else {
                var31 = new class22(arg4, arg3, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class131.method966(arg1, arg9, arg6, var24, 1, 1, var31, 0, var25);
            if (arg5 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
                class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 4);
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1190(var12, var13, var11.field1800, arg9, arg2 + 19661184, arg6);
            }
        } else if (arg3 == 0) {
            class49 var33;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var32 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 105, 0, arg8, var17, var21);
                var33 = var32.field3017;
            } else {
                var33 = new class22(arg4, 0, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class22.method114(arg1, arg9, arg6, var24, var33, (class49) null, class164.field2687[arg8], 0, var25);
            if (arg5) {
                if (arg8 == 0) {
                    if (var11.field1790) {
                        class64.field1039[arg1][arg9][arg6] = 50;
                        class64.field1039[arg1][arg9][arg6 + 1] = 50;
                    }
                    if (var11.field1823) {
                        class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 1);
                    }
                } else if (arg8 == 1) {
                    if (var11.field1790) {
                        class64.field1039[arg1][arg9][arg6 + 1] = 50;
                        class64.field1039[arg1][arg9 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1823) {
                        class5.field56[arg1][arg9][arg6 + 1] = class82.method642(class5.field56[arg1][arg9][arg6 + 1], 2);
                    }
                } else if (arg8 == 2) {
                    if (var11.field1790) {
                        class64.field1039[arg1][arg9 + 1][arg6] = 50;
                        class64.field1039[arg1][arg9 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1823) {
                        class5.field56[arg1][arg9 + 1][arg6] = class82.method642(class5.field56[arg1][arg9 + 1][arg6], 1);
                    }
                } else if (arg8 == 3) {
                    if (var11.field1790) {
                        class64.field1039[arg1][arg9][arg6] = 50;
                        class64.field1039[arg1][arg9 + 1][arg6] = 50;
                    }
                    if (var11.field1823) {
                        class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 2);
                    }
                }
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1184(var11.field1800, arg8, arg3, arg9, arg6, (byte) -77);
            }
            if (var11.field1828 != 16) {
                class72.method503(arg1, arg9, arg6, var11.field1828);
            }
        } else if (arg3 == 1) {
            class49 var35;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var34 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 101, 1, arg8, var17, var21);
                var35 = var34.field3017;
            } else {
                var35 = new class22(arg4, 1, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class22.method114(arg1, arg9, arg6, var24, var35, (class49) null, class57.field953[arg8], 0, var25);
            if (var11.field1790 && arg5) {
                if (arg8 == 0) {
                    class64.field1039[arg1][arg9][arg6 + 1] = 50;
                } else if (arg8 == 1) {
                    class64.field1039[arg1][arg9 + 1][arg6 + 1] = 50;
                } else if (arg8 == 2) {
                    class64.field1039[arg1][arg9 + 1][arg6] = 50;
                } else if (arg8 == 3) {
                    class64.field1039[arg1][arg9][arg6] = 50;
                }
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1184(var11.field1800, arg8, arg3, arg9, arg6, (byte) -77);
            }
        } else if (arg3 == 2) {
            int var36 = arg8 + 1 & 0x3;
            class49 var38;
            class49 var40;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var37 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 50, 2, arg8 + 4, var17, var21);
                var38 = var37.field3017;
                class183 var39 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 109, 2, var36, var17, var21);
                var40 = var39.field3017;
            } else {
                var38 = new class22(arg4, 2, arg8 + 4, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
                var40 = new class22(arg4, 2, var36, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class22.method114(arg1, arg9, arg6, var24, var38, var40, class164.field2687[arg8], class164.field2687[var36], var25);
            if (var11.field1823 && arg5) {
                if (arg8 == 0) {
                    class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 1);
                    class5.field56[arg1][arg9][arg6 + 1] = class82.method642(class5.field56[arg1][arg9][arg6 + 1], 2);
                } else if (arg8 == 1) {
                    class5.field56[arg1][arg9][arg6 + 1] = class82.method642(class5.field56[arg1][arg9][arg6 + 1], 2);
                    class5.field56[arg1][arg9 + 1][arg6] = class82.method642(class5.field56[arg1][arg9 + 1][arg6], 1);
                } else if (arg8 == 2) {
                    class5.field56[arg1][arg9 + 1][arg6] = class82.method642(class5.field56[arg1][arg9 + 1][arg6], 1);
                    class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 2);
                } else if (arg8 == 3) {
                    class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 2);
                    class5.field56[arg1][arg9][arg6] = class82.method642(class5.field56[arg1][arg9][arg6], 1);
                }
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1184(var11.field1800, arg8, arg3, arg9, arg6, (byte) -77);
            }
            if (var11.field1828 != 16) {
                class72.method503(arg1, arg9, arg6, var11.field1828);
            }
        } else if (arg3 == 3) {
            class49 var42;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var41 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 97, 3, arg8, var17, var21);
                var42 = var41.field3017;
            } else {
                var42 = new class22(arg4, 3, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class22.method114(arg1, arg9, arg6, var24, var42, (class49) null, class57.field953[arg8], 0, var25);
            if (var11.field1790 && arg5) {
                if (arg8 == 0) {
                    class64.field1039[arg1][arg9][arg6 + 1] = 50;
                } else if (arg8 == 1) {
                    class64.field1039[arg1][arg9 + 1][arg6 + 1] = 50;
                } else if (arg8 == 2) {
                    class64.field1039[arg1][arg9 + 1][arg6] = 50;
                } else if (arg8 == 3) {
                    class64.field1039[arg1][arg9][arg6] = 50;
                }
            }
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1184(var11.field1800, arg8, arg3, arg9, arg6, (byte) -77);
            }
        } else if (arg3 == 9) {
            class49 var44;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var43 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 126, arg3, arg8, var17, var21);
                var44 = var43.field3017;
            } else {
                var44 = new class22(arg4, arg3, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class131.method966(arg1, arg9, arg6, var24, 1, 1, var44, 0, var25);
            if (var11.field1779 != 0 && arg0 != null) {
                arg0.method1190(var12, var13, var11.field1800, arg9, 19661184, arg6);
            }
            if (var11.field1828 != 16) {
                class72.method503(arg1, arg9, arg6, var11.field1828);
            }
        } else if (arg3 == 4) {
            class49 var46;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var45 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 43, 4, arg8, var17, var21);
                var46 = var45.field3017;
            } else {
                var46 = new class22(arg4, 4, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class146.method1043(arg1, arg9, arg6, var24, var46, (class49) null, class164.field2687[arg8], 0, 0, 0, var25);
        } else if (arg3 == 5) {
            int var47 = 16;
            long var48 = class75.method542(arg1, arg9, arg6);
            if (var48 != 0L) {
                var47 = class41.method210(Integer.MAX_VALUE & (int) (var48 >>> 32), (byte) 75).field1828;
            }
            class49 var51;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var50 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, arg2 + 64, 4, arg8, var17, var21);
                var51 = var50.field3017;
            } else {
                var51 = new class22(arg4, 4, arg8, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class146.method1043(arg1, arg9, arg6, var24, var51, (class49) null, class164.field2687[arg8], 0, class136.field2260[arg8] * var47, class32.field473[arg8] * var47, var25);
        } else if (arg3 == 6) {
            int var52 = 8;
            long var53 = class75.method542(arg1, arg9, arg6);
            if (var53 != 0L) {
                var52 = class41.method210((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) 75).field1828 / 2;
            }
            class49 var56;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var55 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 107, 4, arg8 + 4, var17, var21);
                var56 = var55.field3017;
            } else {
                var56 = new class22(arg4, 4, arg8 + 4, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class146.method1043(arg1, arg9, arg6, var24, var56, (class49) null, 256, arg8, class16.field245[arg8] * var52, class43.field691[arg8] * var52, var25);
        } else if (arg3 == 7) {
            int var57 = arg8 + 2 & 0x3;
            class49 var59;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var58 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 125, 4, var57 + 4, var17, var21);
                var59 = var58.field3017;
            } else {
                var59 = new class22(arg4, 4, var57 + 4, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class146.method1043(arg1, arg9, arg6, var24, var59, (class49) null, 256, var57, 0, 0, var25);
        } else if (arg3 == 8) {
            int var60 = 8;
            long var61 = class75.method542(arg1, arg9, arg6);
            if (var61 != 0L) {
                var60 = class41.method210((int) (var61 >>> 32) & Integer.MAX_VALUE, (byte) 75).field1828 / 2;
            }
            int var63 = arg8 + 2 & 0x3;
            class49 var65;
            class49 var67;
            if (var11.field1782 == -1 && var11.field1796 == null) {
                class183 var64 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 99, 4, arg8 + 4, var17, var21);
                var65 = var64.field3017;
                class183 var66 = var11.method777(var27, var16, var24, arg5, (class158) null, var18, 102, 4, var63 + 4, var17, var21);
                var67 = var66.field3017;
            } else {
                var65 = new class22(arg4, 4, arg8 + 4, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
                var67 = new class22(arg4, 4, var63 + 4, arg10, arg9, arg6, var11.field1782, var11.field1837, (class49) null);
            }
            class146.method1043(arg1, arg9, arg6, var24, var65, var67, 256, arg8, class16.field245[arg8] * var60, class43.field691[arg8] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1342(byte arg0, Component arg1) {
        if (arg0 < 38) {
            method1347(-68, 105, 48, (class11) null, -30);
        }
        field3153++;
        Method var2 = class229.field3984;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class208.field3475);
        arg1.addFocusListener(class208.field3475);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII[B)Z")
    public final boolean method1343(byte arg0, int arg1, int arg2, byte[] arg3) {
        field3156++;
        class262 var5 = this.field3151;
        synchronized (this.field3151) {
            if (arg1 < 0 || arg1 > this.field3147) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1345(-1, arg1, arg3, true, arg2);
            if (!var6) {
                var6 = this.method1345(-1, arg1, arg3, false, arg2);
            }
            if (arg0 >= -104) {
                this.toString();
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILu;II)[Ltg;")
    public static final class171[] method1344(int arg0, class111 arg1, int arg2, int arg3) {
        field3144++;
        if (arg0 < 107) {
            method1341((class170) null, -34, 24, 75, -65, false, 68, true, -120, 2, 45);
        }
        return class69.method480(arg2, 57, arg3, arg1) ? class84.method650((byte) 118) : null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method1345(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field3139++;
        class262 var6 = this.field3151;
        synchronized (this.field3151) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg4 * 6 + 6) > this.field3138.method1777((byte) 95)) {
                        return false;
                    }
                    this.field3138.method1785((long) (arg4 * 6), 19303);
                    this.field3138.method1779(0, 6, class97.field1615, (byte) -107);
                    var8 = (class97.field1615[5] & 0xFF) + ((class97.field1615[3] & 0xFF << 16) + ((class97.field1615[4] & 0xFF) << 8));
                    if (var8 <= 0 || this.field3151.method1777((byte) 95) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3151.method1777((byte) 95) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class97.field1615[0] = (byte) (arg1 >> 16);
                class97.field1615[4] = (byte) (var8 >> 8);
                class97.field1615[1] = (byte) (arg1 >> 8);
                if (arg0 != -1) {
                    this.field3147 = 76;
                }
                class97.field1615[3] = (byte) (var8 >> 16);
                class97.field1615[5] = (byte) var8;
                class97.field1615[2] = (byte) arg1;
                this.field3138.method1785((long) (arg4 * 6), 19303);
                this.field3138.method1783(6, class97.field1615, 0, false);
                int var10 = 0;
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field3151.method1785((long) (var8 * 520), 19303);
                            try {
                                this.field3151.method1779(0, 8, class97.field1615, (byte) -107);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class97.field1615[5] & 0xFF << 8) + ((class97.field1615[4] & 0xFF << 16) + (class97.field1615[6] & 0xFF));
                            int var13 = class97.field1615[7] & 0xFF;
                            int var14 = ((class97.field1615[0] & 0xFF) << 8) + (class97.field1615[1] & 0xFF);
                            int var15 = ((class97.field1615[2] & 0xFF) << 8) + (class97.field1615[3] & 0xFF);
                            if (arg4 == var14 && var11 == var15 && this.field3145 == var13) {
                                if (var12 >= 0 && this.field3151.method1777((byte) 95) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3151.method1777((byte) 95) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg3 = false;
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class97.field1615[7] = (byte) this.field3145;
                    class97.field1615[1] = (byte) arg4;
                    class97.field1615[2] = (byte) (var11 >> 8);
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg1 - var10;
                    class97.field1615[5] = (byte) (var12 >> 8);
                    class97.field1615[0] = (byte) (arg4 >> 8);
                    class97.field1615[6] = (byte) var12;
                    class97.field1615[3] = (byte) var11;
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class97.field1615[4] = (byte) (var12 >> 16);
                    this.field3151.method1785((long) (var8 * 520), 19303);
                    this.field3151.method1783(8, class97.field1615, 0, false);
                    var8 = var12;
                    this.field3151.method1783(var18, arg2, var10, false);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3148++;
        return "Cache:" + this.field3145;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1346(byte arg0) {
        field3150 = null;
        field3140 = null;
        if (arg0 != 87) {
            field3154 = 53;
        }
        field3142 = null;
        field3149 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILhd;I)V")
    public static final void method1347(int arg0, int arg1, int arg2, class11 arg3, int arg4) {
        field3155++;
        if (class39.field616 >= 400) {
            return;
        }
        if (arg3.field120 != null) {
            arg3 = arg3.method60((byte) 118);
        }
        if (arg3 == null || !arg3.field150) {
            return;
        }
        class51 var5 = arg3.field134;
        if (arg3.field114 != 0) {
            var5 = class20.method104(-114, new class51[] { var5, class48.method248(class44.field706.field1697, arg3.field114, false), class265.field4643, class217.field3772, class51.method311(arg3.field114, 10), class169.field2759 });
        }
        if (arg0 != 4) {
            return;
        }
        if (class175.field2871 == 1) {
            class185.method1313(arg1, (long) arg4, class183.field3031, (short) 28, class20.method104(arg0 + 117, new class51[] { class181.field2990, class108.field1808, var5 }), arg2, -501);
            class23.field354++;
        } else if (!class93.field1532) {
            class84.field1406++;
            class51[] var6 = arg3.field155;
            if (class23.field348) {
                var6 = class89.method675(-14182, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class86.field1440 != 0 || !var6[var7].method292(true, class36.field555))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 5;
                        }
                        class24.field365++;
                        if (var7 == 1) {
                            var8 = 31;
                        }
                        if (var7 == 2) {
                            var8 = 11;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 49;
                        }
                        class185.method1313(arg1, (long) arg4, var6[var7], var8, class20.method104(arg0 + 115, new class51[] { class167.field2722, var5 }), arg2, arg0 - 505);
                    }
                }
            }
            if (class86.field1440 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method292(true, class36.field555)) {
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 5;
                        }
                        class90.field1494++;
                        if (var9 == 1) {
                            var11 = 31;
                        }
                        if (class44.field706.field1697 < arg3.field114) {
                            var10 = 2000;
                        }
                        if (var9 == 2) {
                            var11 = 11;
                        }
                        if (var9 == 3) {
                            var11 = 22;
                        }
                        if (var9 == 4) {
                            var11 = 49;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class185.method1313(arg1, (long) arg4, var6[var9], var11, class20.method104(51, new class51[] { class167.field2722, var5 }), arg2, -501);
                    }
                }
            }
            class185.method1313(arg1, (long) arg4, class36.field545, (short) 1001, class20.method104(-127, new class51[] { class167.field2722, var5 }), arg2, -501);
            return;
        } else if ((class170.field2788 & 0x2) == 2) {
            class108.field1785++;
            class185.method1313(arg1, (long) arg4, class261.field4562, (short) 17, class20.method104(arg0 - 112, new class51[] { class22.field336, class108.field1808, var5 }), arg2, arg0 ^ 0xFFFFFE0F);
            return;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILp;Lp;I)V")
    public class188(int arg0, class262 arg1, class262 arg2, int arg3) {
        this.field3151 = arg1;
        this.field3138 = arg2;
        this.field3147 = arg3;
        this.field3145 = arg0;
    }
}
