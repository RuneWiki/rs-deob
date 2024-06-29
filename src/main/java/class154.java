import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class154 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lel;")
    private class3 field2512 = null;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    private int field2511 = 65000;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lel;")
    private class3 field2516 = null;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Ltl;")
    private static class59 field2519 = class85.method639("Select", 9588);

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Ltl;")
    public static class59 field2523 = class85.method639("Lade Schrifts-=tze )2 ", 9588);

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Ltl;")
    public static class59 field2518 = field2519;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Ltl;")
    public static class59 field2525 = class85.method639("gelb:", 9588);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Ltl;")
    public static class59 field2524 = class85.method639("Schlie-8en", 9588);

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[Loj;")
    public static class260[] field2509;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[Lkm;")
    public static class86[] field2517;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBII)I", line = 8)
    public static final int method1099(int arg0, byte arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 < 22) {
            method1100((class295) null, (class295) null, -14);
        }
        field2515++;
        return (arg3 >> 2 << 10) + (arg2 >> 1) + (arg0 >> 5 << 7);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lme;Lme;I)I", line = 36)
    public static final int method1100(class295 arg0, class295 arg1, int arg2) {
        if (arg2 != 579495728) {
            return -30;
        }
        field2527++;
        int var3 = 0;
        if (arg0.method2034(class14.field198, (byte) 17)) {
            var3++;
        }
        if (arg0.method2034(class37.field561, (byte) 32)) {
            var3++;
        }
        if (arg0.method2034(class157.field2570, (byte) 97)) {
            var3++;
        }
        if (arg1.method2034(class14.field198, (byte) 79)) {
            var3++;
        }
        if (arg1.method2034(class37.field561, (byte) 81)) {
            var3++;
        }
        if (arg1.method2034(class157.field2570, (byte) 54)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lwk;Z)V", line = 70)
    public static final void method1101(class105 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        arg0.field1731 = false;
        if (arg0.field1767 != -1) {
            class129 var2 = class265.method1834((byte) -39, arg0.field1767);
            if (var2 == null || var2.field2118 == null) {
                arg0.field1767 = -1;
            } else {
                arg0.field1733++;
                if (var2.field2118.length > arg0.field1746 && var2.field2132[arg0.field1746] < arg0.field1733) {
                    arg0.field1733 = 1;
                    arg0.field1746++;
                    class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var2, arg0.field1746, arg0.field1769);
                }
                if (arg0.field1746 >= var2.field2118.length) {
                    arg0.field1733 = 0;
                    arg0.field1746 = 0;
                    class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var2, arg0.field1746, arg0.field1769);
                }
            }
        }
        field2521++;
        if (arg0.field1749 != -1 && class30.field420 >= arg0.field1744) {
            int var3 = class221.method1533(arg0.field1749, (byte) -44).field5250;
            if (var3 == -1) {
                arg0.field1749 = -1;
            } else {
                class129 var4 = class265.method1834((byte) -39, var3);
                if (var4 == null || var4.field2118 == null) {
                    arg0.field1749 = -1;
                } else {
                    if (arg0.field1792 < 0) {
                        arg0.field1792 = 0;
                        class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var4, 0, arg0.field1769);
                    }
                    arg0.field1760++;
                    if (var4.field2118.length > arg0.field1792 && var4.field2132[arg0.field1792] < arg0.field1760) {
                        arg0.field1792++;
                        arg0.field1760 = 1;
                        class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var4, arg0.field1792, arg0.field1769);
                    }
                    if (arg0.field1792 >= var4.field2118.length) {
                        arg0.field1749 = -1;
                    }
                }
            }
        }
        if (arg0.field1737 != -1 && arg0.field1786 <= 1) {
            class129 var5 = class265.method1834((byte) -39, arg0.field1737);
            if (var5.field2120 == 1 && arg0.field1779 > 0 && class30.field420 >= arg0.field1780 && arg0.field1770 < class30.field420) {
                arg0.field1786 = 1;
                return;
            }
        }
        if (arg0.field1737 != -1 && arg0.field1786 == 0) {
            class129 var6 = class265.method1834((byte) -39, arg0.field1737);
            if (var6 == null || var6.field2118 == null) {
                arg0.field1737 = -1;
            } else {
                arg0.field1789++;
                if (var6.field2118.length > arg0.field1781 && var6.field2132[arg0.field1781] < arg0.field1789) {
                    arg0.field1789 = 1;
                    arg0.field1781++;
                    class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var6, arg0.field1781, arg0.field1769);
                }
                if (var6.field2118.length <= arg0.field1781) {
                    arg0.field1721++;
                    arg0.field1781 -= var6.field2114;
                    if (var6.field2139 <= arg0.field1721) {
                        arg0.field1737 = -1;
                    } else if (arg0.field1781 >= 0 && arg0.field1781 < var6.field2118.length) {
                        class29.method182(1048575, class286.field4920 == arg0, arg0.field1774, var6, arg0.field1781, arg0.field1769);
                    } else {
                        arg0.field1737 = -1;
                    }
                }
                arg0.field1731 = var6.field2113;
            }
        }
        if (arg0.field1786 > 0) {
            arg0.field1786--;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII)Z", line = 209)
    public final boolean method1102(byte[] arg0, int arg1, int arg2, int arg3) {
        field2514++;
        class3 var5 = this.field2516;
        synchronized (this.field2516) {
            if (arg1 != -10728) {
                return false;
            } else if (arg3 >= 0 && arg3 <= this.field2511) {
                boolean var6 = this.method1104(arg2, arg3, 1, true, arg0);
                if (!var6) {
                    var6 = this.method1104(arg2, arg3, 1, false, arg0);
                }
                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 235)
    public static void method1103(byte arg0) {
        field2509 = null;
        field2517 = null;
        if (arg0 != 125) {
            method1103((byte) 122);
        }
        field2519 = null;
        field2525 = null;
        field2524 = null;
        field2523 = null;
        field2518 = null;
    }

    @OriginalMember(owner = "client!tg", name = "toString", descriptor = "()Ljava/lang/String;", line = 254)
    public final String toString() {
        field2510++;
        return "Cache:" + this.field2528;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILel;Lel;I)V", line = 514)
    public class154(int arg0, class3 arg1, class3 arg2, int arg3) {
        this.field2516 = arg1;
        this.field2511 = arg3;
        this.field2512 = arg2;
        this.field2528 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIZ[B)Z", line = 291)
    private final boolean method1104(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field2522++;
        class3 var6 = this.field2516;
        synchronized (this.field2516) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (((long) (arg0 * 6 + 6)) > this.field2512.method19(-105)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2512.method22((byte) -50, (long) (arg0 * 6));
                    this.field2512.method18(0, class287.field4937, 6, arg2 ^ 0xFFFFFFFE);
                    var7 = (class287.field4937[5] & 0xFF) + (((class287.field4937[3] & 0xFF) << 16) + ((class287.field4937[4] & 0xFF) << 8));
                    if (var7 <= 0 || ((long) var7) > (this.field2516.method19(arg2 ^ 0xFFFFFF89) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field2516.method19(-105) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class287.field4937[0] = (byte) (arg1 >> 16);
                int var8 = 0;
                class287.field4937[2] = (byte) arg1;
                class287.field4937[4] = (byte) (var7 >> 8);
                class287.field4937[arg2] = (byte) (arg1 >> 8);
                class287.field4937[3] = (byte) (var7 >> 16);
                int var9 = 0;
                class287.field4937[5] = (byte) var7;
                this.field2512.method22((byte) -85, (long) (arg0 * 6));
                this.field2512.method15(0, 916062416, class287.field4937, 6);
                while (true) {
                    if (arg1 > var8) {
                        label135: {
                            int var10 = 0;
                            if (arg3) {
                                this.field2516.method22((byte) -89, (long) (var7 * 520));
                                try {
                                    this.field2516.method18(0, class287.field4937, 8, -1);
                                } catch (EOFException var18) {
                                    break label135;
                                }
                                var10 = (class287.field4937[4] & 0xFF << 16) + (class287.field4937[5] & 0xFF << 8) + (class287.field4937[6] & 0xFF);
                                int var12 = (class287.field4937[0] & 0xFF << 8) + (class287.field4937[1] & 0xFF);
                                int var13 = ((class287.field4937[2] & 0xFF) << 8) + (class287.field4937[3] & 0xFF);
                                int var14 = class287.field4937[7] & 0xFF;
                                if (arg0 != var12 || var9 != var13 || this.field2528 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field2516.method19(arg2 ^ 0xFFFFFF98) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field2516.method19(arg2 ^ 0x74) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg3 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg1 - var8) <= 512) {
                                var10 = 0;
                            }
                            class287.field4937[7] = (byte) this.field2528;
                            class287.field4937[1] = (byte) arg0;
                            class287.field4937[5] = (byte) (var10 >> 8);
                            class287.field4937[3] = (byte) var9;
                            class287.field4937[4] = (byte) (var10 >> 16);
                            class287.field4937[6] = (byte) var10;
                            int var15 = arg1 - var8;
                            class287.field4937[2] = (byte) (var9 >> 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var9++;
                            class287.field4937[0] = (byte) (arg0 >> 8);
                            this.field2516.method22((byte) -100, (long) (var7 * 520));
                            var7 = var10;
                            this.field2516.method15(0, 916062416, class287.field4937, 8);
                            this.field2516.method15(var8, 916062416, arg4, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[B", line = 410)
    public final byte[] method1105(int arg0, int arg1) {
        field2526++;
        class3 var3 = this.field2516;
        synchronized (this.field2516) {
            try {
                Object var10000;
                if (this.field2512.method19(arg1 + 71) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2512.method22((byte) -65, (long) (arg0 * 6));
                this.field2512.method18(0, class287.field4937, 6, arg1 ^ 0xFFFFFFF7);
                int var4 = (class287.field4937[2] & 0xFF) + (class287.field4937[1] & 0xFF << 8) + (class287.field4937[0] & 0xFF << 16);
                int var5 = (class287.field4937[5] & 0xFF) + (((class287.field4937[3] & 0xFF) << 16) + ((class287.field4937[4] & 0xFF) << 8));
                if (var4 < 0 || this.field2511 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (this.field2516.method19(80) / 520L) < ((long) var5)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    if (arg1 != 8) {
                        this.method1104(1, -103, -27, false, (byte[]) null);
                    }
                    while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2516.method22((byte) -66, (long) (var5 * 520));
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field2516.method18(0, class287.field4937, var9 + 8, -1);
                        int var10 = ((class287.field4937[2] & 0xFF) << 8) + (class287.field4937[3] & 0xFF);
                        int var11 = class287.field4937[7] & 0xFF;
                        int var12 = (class287.field4937[0] & 0xFF << 8) + (class287.field4937[1] & 0xFF);
                        int var13 = (class287.field4937[6] & 0xFF) + ((class287.field4937[5] & 0xFF) << 8) + (class287.field4937[4] & 0xFF << 16);
                        if (arg0 != var12 || var8 != var10 || this.field2528 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var13 < 0 || this.field2516.method19(arg1 ^ 0x60) / 520L < (long) var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var13;
                        var8++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class287.field4937[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
