import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lsa;")
    private class110 field1755 = new class110(256);

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lsa;")
    private class110 field1769 = new class110(256);

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lja;")
    private class64 field1757;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lja;")
    private class64 field1749;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    public static int[] field1758 = new int[100];

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1759 = "flash2:";

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[[B")
    public static byte[][] field1762 = new byte[1000][];

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "F")
    public static float field1765;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[[B")
    public static byte[][] field1756;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lob;B)V", line = 8)
    public static final void method800(class292 arg0, byte arg1) {
        class292 var2 = class134.method1011(arg0, (byte) -116);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class73.field1127;
            var4 = class180.field2880;
        } else {
            var3 = var2.field4499;
            var4 = var2.field4608;
        }
        field1753++;
        if (arg1 >= -89) {
            field1756 = (byte[][]) ((byte[][]) null);
        }
        class320.method2197(var4, arg0, var3, false, -126);
        class156.method1176(var3, var4, arg0, 0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[[ILdb;IIB[[F[[F[[FIIZZI[ZI[IIZB[[II)V", line = 38)
    public static final void method801(boolean arg0, int[][] arg1, class186 arg2, int arg3, int arg4, byte arg5, float[][] arg6, float[][] arg7, float[][] arg8, int arg9, int arg10, boolean arg11, boolean arg12, int arg13, boolean[] arg14, int arg15, int[] arg16, int arg17, boolean arg18, byte arg19, int[][] arg20, int arg21) {
        field1768++;
        if (arg5 != -111) {
            method807(-47, 123);
        }
        int var22 = (arg18 ? 255 : 0) + (arg4 << 8);
        int var23 = (arg9 << 8) + (arg0 ? 255 : 0);
        int var24 = (arg21 << 8) + (arg12 ? 255 : 0);
        int var25 = (arg11 ? 255 : 0) + (arg15 << 8);
        int[] var26 = new int[arg16.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg16[var27 + var27];
            int[][] var29 = arg1 == null || arg14 == null || !arg14[var27] ? arg20 : arg1;
            int var30 = arg16[var27 + var27 + 1];
            var26[var27] = class53.method392(arg8, arg17, (byte) 8, var23, var28, var29, var22, arg19, var30, (float) arg3, var24, arg7, var25, arg6, false, arg1, arg10, arg2);
        }
        arg2.method1395(arg13, arg17, arg10, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BZIZ)V", line = 74)
    public static final void method802(byte arg0, boolean arg1, int arg2, boolean arg3) {
        field1767++;
        int var10002;
        for (int var4 = 0; var4 < class77.field1173; var4++) {
            class305 var5 = class138.field2196[class145.field2279[var4]];
            if (var5 != null && var5.method199(arg0 + 157) && var5.field4778.method1519((byte) 31)) {
                int var6 = var5.method200(arg0 ^ 0x62);
                if (arg1) {
                    if (!var5.field4778.field3303) {
                        continue;
                    }
                } else if (var5.field4778.field3279 != arg3 || arg2 != 0 && arg2 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field1442 & 0x7F) == 64 && (var5.field1369 & 0x7F) == 64) {
                        int var13 = var5.field1442 >> 7;
                        int var14 = var5.field1369 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class270.field4203[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field1442 & 0x7F) == 0 && (var5.field1369 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field1442 & 0x7F) == 64 && (var5.field1369 & 0x7F) == 64)) {
                    int var7 = var5.field1442 - (var6 * 64) >> 7;
                    int var8 = var5.field1369 - (var6 * 64) >> 7;
                    int var9 = var5.method200(-1) + var7;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var10 = var8 + var5.method200(arg0 ^ 0x62);
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class270.field4203[var11][var12]++;
                        }
                    }
                }
            }
        }
        int var15 = 0;
        if (arg0 != -99) {
            return;
        }
        while (var15 < class77.field1173) {
            class305 var16 = class138.field2196[class145.field2279[var15]];
            long var17 = (long) class145.field2279[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method199(58) && var16.field4778.method1519((byte) 31)) {
                label259: {
                    int var19 = var16.method200(-1);
                    if (arg1) {
                        if (!var16.field4778.field3303) {
                            break label259;
                        }
                    } else if (var16.field4778.field3279 != arg3 || arg2 != 0 && arg2 != var19) {
                        break label259;
                    }
                    var16.field1441 = true;
                    if (var19 == 1) {
                        if ((var16.field1442 & 0x7F) == 64 && (var16.field1369 & 0x7F) == 64) {
                            int var20 = var16.field1442 >> 7;
                            int var21 = var16.field1369 >> 7;
                            if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                                break label259;
                            }
                            if (class270.field4203[var20][var21] > 1) {
                                var10002 = class270.field4203[var20][var21]--;
                                break label259;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var16.field1442 & 0x7F) == 0 && (var16.field1369 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field1442 & 0x7F) == 64 && (var16.field1369 & 0x7F) == 64) {
                        int var22 = var16.field1442 - var19 * 64 >> 7;
                        int var23 = var16.field1369 - (var19 * 64) >> 7;
                        int var24 = var22 + var19;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var23 + var19;
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        boolean var26 = true;
                        for (int var27 = var22; var27 < var24; var27++) {
                            for (int var28 = var23; var28 < var25; var28++) {
                                if (class270.field4203[var27][var28] <= 1) {
                                    var26 = false;
                                    break;
                                }
                            }
                        }
                        if (var26) {
                            int var29 = var22;
                            while (true) {
                                if (var29 >= var24) {
                                    break label259;
                                }
                                for (int var30 = var23; var30 < var25; var30++) {
                                    var10002 = class270.field4203[var29][var30]--;
                                }
                                var29++;
                            }
                        }
                    }
                    if (!var16.field4778.field3275) {
                        var17 |= Long.MIN_VALUE;
                    }
                    var16.field1441 = false;
                    var16.field1425 = class48.method374(var16.field1369, var16.field1442, 87, class41.field734);
                    class293.method2063(class41.field734, var16.field1442, var16.field1369, var16.field1425, var19 * 64 + 60 - 64, var16, var16.field1443, var17, var16.field1450);
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[II)Loc;", line = 323)
    public final class144 method803(int arg0, int[] arg1, int arg2) {
        field1754++;
        if (this.field1749.method466((byte) 23) == 1) {
            return this.method806(arg1, arg2, -125, 0);
        } else if (arg0 != 255) {
            return (class144) null;
        } else if (this.field1749.method465(arg2, 0) == 1) {
            return this.method806(arg1, 0, arg0 - 306, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)[Lai;", line = 350)
    public static final class126[] method804(byte arg0) {
        field1761++;
        class126[] var1 = new class126[class103.field1744];
        if (arg0 != -47) {
            return (class126[]) null;
        }
        for (int var2 = 0; var2 < class103.field1744; var2++) {
            int var3 = class3.field14[var2] * class108.field1797[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class270.field4198[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class251.field3871[class280.method2001(255, var5[var6])];
            }
            if (class265.field4126) {
                var1[var2] = new class105(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var4);
            } else {
                var1[var2] = new class7(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], var4);
            }
        }
        class233.method1680((byte) -12);
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[IB)Loc;", line = 392)
    private final class144 method805(int arg0, int arg1, int[] arg2, byte arg3) {
        field1750++;
        int var5 = arg0 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        if (arg3 != 40) {
            field1759 = (String) null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class144 var9 = (class144) this.field1769.method833(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class167 var10 = (class167) this.field1755.method833(false, var7);
            if (var10 == null) {
                var10 = class167.method1219(this.field1757, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1755.method845(var10, (byte) 75, var7);
            }
            class144 var11 = var10.method1228(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1701(arg3 - 125);
                this.field1769.method845(var11, (byte) -67, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIII)Loc;", line = 438)
    private final class144 method806(int[] arg0, int arg1, int arg2, int arg3) {
        field1760++;
        int var5 = arg1 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF1);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class144 var9 = (class144) this.field1769.method833(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg2 > -44) {
                method804((byte) 73);
            }
            class58 var10 = class58.method433(this.field1749, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class144 var11 = var10.method436();
            this.field1769.method845(var11, (byte) -64, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2263.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lja;Lja;)V", line = 577)
    public class104(class64 arg0, class64 arg1) {
        this.field1757 = arg1;
        this.field1749 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lcc;", line = 511)
    public static final class249 method807(int arg0, int arg1) {
        field1752++;
        class249 var2 = (class249) class29.field477.method1830((long) arg0, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field1626.method467(arg0, 91, 33);
        class249 var4 = new class249();
        if (var3 != null) {
            var4.method1766(new class101(var3), -60, arg0);
        }
        class29.field477.method1831((long) arg0, var4, -13897);
        if (arg1 != 0) {
            field1765 = -0.053341415F;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I[II)Loc;", line = 539)
    public final class144 method808(int arg0, int[] arg1, int arg2) {
        field1763++;
        if (this.field1757.method466((byte) 23) == 1) {
            return this.method805(arg2, 0, arg1, (byte) 40);
        }
        if (arg0 != -65) {
            this.method806((int[]) null, 116, -126, -32);
        }
        if (this.field1757.method465(arg2, 0) != 1) {
            throw new RuntimeException();
        }
        return this.method805(0, arg2, arg1, (byte) 40);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 566)
    public static void method809(int arg0) {
        field1756 = (byte[][]) null;
        field1758 = null;
        field1762 = (byte[][]) null;
        field1759 = null;
        if (arg0 != 0) {
            method809(-34);
        }
    }
}
