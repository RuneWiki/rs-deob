import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[[I")
    public int[][] field117;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lhe;")
    private static class54 field118 = class6.method58("Could not complete login)3", false);

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lhe;")
    public static class54 field124 = field118;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lhe;")
    public static class54 field126 = class6.method58("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "La;")
    public static class1 field107 = new class1();

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static volatile int field132 = -1;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
    public static boolean field133 = false;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field131 = -1;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lsf;")
    public static class131 field135 = new class131(50);

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field139 = 10;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field140 = -1;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Lhe;")
    public static class54 field141 = class6.method58("Unerwartete Antwort vom Anmelde)2Server)3", false);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Lce;")
    public static class20 field136;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Llc;")
    public static class79 field134;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
    public static boolean field130;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field101++;
        if (arg3 == arg6 && arg0 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field129;
        int var9 = arg6 - this.field129;
        int var10 = arg0 - this.field105;
        int var11 = -63 / ((-arg1 - 17) / 62);
        int var12 = arg4 - this.field105;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var8 + 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field117[var9][var12] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 - 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var12 && (this.field117[var9][var12] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var8 - 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field117[var9][var12] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 + 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var12 && (this.field117[var9][var12] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var9 && var10 + 1 == var12 && (this.field117[var9][var12] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var12 && (this.field117[var9][var12] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var12 && (this.field117[var9][var12] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIZII)Z")
    public final boolean method27(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field115++;
        int var9 = arg2 + arg4 - 1;
        int var10 = arg0 + arg6 - 1;
        if (arg4 <= arg3 && arg3 <= var9 && arg1 >= arg6 && arg1 <= var10) {
            return true;
        } else if (arg4 - 1 == arg3 && arg1 >= arg6 && var10 >= arg1 && (this.field117[arg3 - this.field129][arg1 - this.field105] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg3 && arg1 >= arg6 && var10 >= arg1 && (this.field117[arg3 - this.field129][arg1 - this.field105] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg1 && arg3 >= arg4 && arg3 <= var9 && (this.field117[arg3 - this.field129][arg1 - this.field105] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg4 <= arg3 && var9 >= arg3 && (this.field117[arg3 - this.field129][arg1 - this.field105] & 0x20) == 0 && (arg7 & 0x1) == 0) {
            return true;
        } else {
            return !arg5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public static final void method28(int arg0, int arg1) {
        field127++;
        if (class105.field2604 == arg0) {
            return;
        }
        if (class105.field2604 == 0) {
            class49.method353((byte) -6);
        }
        if (arg0 == 20 || arg0 == 40) {
            class70.field1756 = 0;
            class118.field2765 = 0;
            class5.field152 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class9.field259 != null) {
            class9.field259.method1130(-31709);
            class9.field259 = null;
        }
        if (class105.field2604 == 25) {
            class150.field3396 = 0;
            class141.field3210 = 0;
            class121.field2807 = 0;
            class58.field1462 = 1;
            class89.field2190 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method166(client.field607, class150.field3394, (byte) 99, class70.field1753);
        } else {
            class138.method1072((byte) 56);
        }
        if (arg1 != 1) {
            field130 = true;
        }
        class105.field2604 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method29(int arg0) {
        class95.field2413.method145(arg0);
        field137++;
        for (int var1 = 0; var1 < 32; var1++) {
            class64.field1552[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class80.field1972[var2] = 0L;
        }
        class72.field1782 = 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIII)V")
    public final void method30(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field102++;
        if (arg4 >= -109) {
            return;
        }
        int var7 = arg5 - this.field105;
        int var8 = arg3 - this.field129;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method35(115, var8, var7, 128);
                this.method35(94, var8 - 1, var7, 8);
            }
            if (arg2 == 1) {
                this.method35(101, var8, var7, 2);
                this.method35(92, var8, var7 + 1, 32);
            }
            if (arg2 == 2) {
                this.method35(97, var8, var7, 8);
                this.method35(109, var8 + 1, var7, 128);
            }
            if (arg2 == 3) {
                this.method35(111, var8, var7, 32);
                this.method35(120, var8, var7 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method35(108, var8, var7, 1);
                this.method35(113, var8 - 1, var7 + 1, 16);
            }
            if (arg2 == 1) {
                this.method35(116, var8, var7, 4);
                this.method35(117, var8 + 1, var7 + 1, 64);
            }
            if (arg2 == 2) {
                this.method35(123, var8, var7, 16);
                this.method35(113, var8 + 1, var7 + -1, 1);
            }
            if (arg2 == 3) {
                this.method35(98, var8, var7, 64);
                this.method35(109, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method35(95, var8, var7, 130);
                this.method35(99, var8 - 1, var7, 8);
                this.method35(125, var8, var7 + 1, 32);
            }
            if (arg2 == 1) {
                this.method35(105, var8, var7, 10);
                this.method35(127, var8, var7 + 1, 32);
                this.method35(106, var8 + 1, var7, 128);
            }
            if (arg2 == 2) {
                this.method35(110, var8, var7, 40);
                this.method35(90, var8 + 1, var7, 128);
                this.method35(121, var8, var7 - 1, 2);
            }
            if (arg2 == 3) {
                this.method35(107, var8, var7, 160);
                this.method35(94, var8, var7 - 1, 2);
                this.method35(94, var8 - 1, var7, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method35(90, var8, var7, 65536);
                this.method35(104, var8 - 1, var7, 4096);
            }
            if (arg2 == 1) {
                this.method35(94, var8, var7, 1024);
                this.method35(96, var8, var7 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method35(121, var8, var7, 4096);
                this.method35(117, var8 + 1, var7, 65536);
            }
            if (arg2 == 3) {
                this.method35(101, var8, var7, 16384);
                this.method35(106, var8, var7 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method35(117, var8, var7, 512);
                this.method35(96, var8 - 1, var7 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method35(93, var8, var7, 2048);
                this.method35(101, var8 + 1, var7 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method35(116, var8, var7, 8192);
                this.method35(116, var8 + 1, var7 - 1, 512);
            }
            if (arg2 == 3) {
                this.method35(126, var8, var7, 32768);
                this.method35(100, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method35(125, var8, var7, 66560);
            this.method35(120, var8 - 1, var7, 4096);
            this.method35(102, var8, var7 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method35(98, var8, var7, 5120);
            this.method35(123, var8, var7 + 1, 16384);
            this.method35(112, var8 + 1, var7, 65536);
        }
        if (arg2 == 2) {
            this.method35(112, var8, var7, 20480);
            this.method35(90, var8 + 1, var7, 65536);
            this.method35(99, var8, var7 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method35(100, var8, var7, 81920);
            this.method35(94, var8, var7 - 1, 1024);
            this.method35(89, var8 - 1, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field114++;
        if (class86.method691((byte) 112, arg7)) {
            class48.field1167 = null;
            if (arg8 < 35) {
                field136 = null;
            }
            class15.method138(class59.field1481[arg7], arg0, arg4, arg2, arg1, arg3, arg6, -1, arg5, -107);
            if (class48.field1167 != null) {
                class15.method138(class48.field1167, arg0, class72.field1785, arg2, class1.field3, arg3, arg6, -1412584499, arg5, -107);
                class48.field1167 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class85.field2114[var9] = true;
            }
        } else {
            class85.field2114[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIILnc;)V")
    public static final void method32(byte arg0, int arg1, int arg2, class93 arg3) {
        field110++;
        if (class133.field3017 != null || class133.field3007 || (arg3 == null || class139.method1079(-20274, arg3) == null)) {
            return;
        }
        class133.field3017 = arg3;
        class115.field2725 = class139.method1079(arg0 - 20359, arg3);
        class147.field3318 = arg2;
        if (arg0 != 85) {
            method32((byte) -122, 32, 94, null);
        }
        class53.field1288 = 0;
        class39.field1006 = false;
        class140.field3204 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public final void method33(byte arg0, int arg1, int arg2) {
        if (arg0 >= 114) {
            field109++;
            int var4 = arg2 - this.field129;
            int var5 = arg1 - this.field105;
            this.field117[var4][var5] = class38.method292(this.field117[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)Lab;")
    public static final class3 method34(boolean arg0, int arg1) {
        field112++;
        class3 var2 = (class3) class111.field2659.method991((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field1014.method266(6, (byte) 118, arg1);
        class3 var4 = new class3();
        var4.field42 = arg1;
        if (var3 != null) {
            var4.method22(-1, new class83(var3));
        }
        var4.method21(61);
        if (var4.field96) {
            var4.field40 = false;
            var4.field83 = 0;
        }
        class111.field2659.method990(arg0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
    private final void method35(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 88) {
            this.field117[arg1][arg2] = class38.method292(this.field117[arg1][arg2], arg3);
            field103++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLce;)V")
    public static final void method36(byte arg0, class20 arg1) {
        for (int var2 = 0; var2 < class130.field2925.length; var2++) {
            class130.field2925[var2] = 0;
        }
        int var3 = -110 / ((arg0 - 69) / 53);
        short var4 = 256;
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var4);
            class130.field2925[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var4 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class102.field2553[var16] = (class130.field2925[var16 - 1] + class130.field2925[var16 + 1] + class130.field2925[var16 - 128] + class130.field2925[var16 + 128]) / 4;
                }
            }
            int[] var14 = class130.field2925;
            class130.field2925 = class102.field2553;
            class102.field2553 = var14;
        }
        field108++;
        if (arg1 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1.field577; var8++) {
            for (int var9 = 0; var9 < arg1.field574; var9++) {
                if (arg1.field573[var7++] != 0) {
                    int var10 = var9 + arg1.field571 + 16;
                    int var11 = var8 + arg1.field576 + 16;
                    int var12 = (var11 << 7) + var10;
                    class130.field2925[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZII)V")
    public final void method37(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field129;
        field116++;
        int var8 = arg2 - this.field105;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method45((byte) -96, var7, var8, 128);
                this.method45((byte) -94, var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method45((byte) -98, var7, var8, 2);
                this.method45((byte) -123, var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method45((byte) -102, var7, var8, 8);
                this.method45((byte) -109, var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method45((byte) -111, var7, var8, 32);
                this.method45((byte) -121, var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method45((byte) -125, var7, var8, 1);
                this.method45((byte) -87, var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method45((byte) -115, var7, var8, 4);
                this.method45((byte) -114, var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method45((byte) -94, var7, var8, 16);
                this.method45((byte) -124, var7 + 1, var8 + -1, 1);
            }
            if (arg4 == 3) {
                this.method45((byte) -103, var7, var8, 64);
                this.method45((byte) -124, var7 - 1, var8 + -1, 4);
            }
        }
        if (arg1 != 1) {
            field124 = null;
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method45((byte) -92, var7, var8, 130);
                this.method45((byte) -110, var7 - 1, var8, 8);
                this.method45((byte) -114, var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method45((byte) -112, var7, var8, 10);
                this.method45((byte) -115, var7, var8 + 1, 32);
                this.method45((byte) -114, var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method45((byte) -89, var7, var8, 40);
                this.method45((byte) -105, var7 + 1, var8, 128);
                this.method45((byte) -95, var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method45((byte) -125, var7, var8, 160);
                this.method45((byte) -121, var7, var8 - 1, 2);
                this.method45((byte) -115, var7 - 1, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method45((byte) -108, var7, var8, 65536);
                this.method45((byte) -121, var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method45((byte) -87, var7, var8, 1024);
                this.method45((byte) -120, var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method45((byte) -124, var7, var8, 4096);
                this.method45((byte) -100, var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method45((byte) -115, var7, var8, 16384);
                this.method45((byte) -107, var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method45((byte) -92, var7, var8, 512);
                this.method45((byte) -97, var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method45((byte) -104, var7, var8, 2048);
                this.method45((byte) -97, var7 + 1, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method45((byte) -87, var7, var8, 8192);
                this.method45((byte) -86, var7 + 1, var8 + -1, 512);
            }
            if (arg4 == 3) {
                this.method45((byte) -87, var7, var8, 32768);
                this.method45((byte) -112, var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method45((byte) -88, var7, var8, 66560);
            this.method45((byte) -110, var7 - 1, var8, 4096);
            this.method45((byte) -106, var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method45((byte) -101, var7, var8, 5120);
            this.method45((byte) -88, var7, var8 + 1, 16384);
            this.method45((byte) -103, var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method45((byte) -107, var7, var8, 20480);
            this.method45((byte) -109, var7 + 1, var8, 65536);
            this.method45((byte) -123, var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method45((byte) -85, var7, var8, 81920);
            this.method45((byte) -108, var7, var8 - 1, 1024);
            this.method45((byte) -115, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIIII)V")
    public final void method38(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field129;
        int var9 = 256;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg5;
            arg5 = arg3;
            arg3 = var10;
        }
        if (arg2) {
            var9 += 131072;
        }
        field106++;
        int var11 = arg0 - this.field105;
        if (arg1 != 2) {
            field141 = null;
        }
        for (int var12 = var8; var12 < arg5 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field125) {
                for (int var13 = var11; var13 < var11 + arg3; var13++) {
                    if (var13 >= 0 && this.field113 > var13) {
                        this.method35(97, var12, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public final void method39(int arg0, int arg1, int arg2) {
        field123++;
        int var4 = arg0 - this.field129;
        int var5 = arg1 - this.field105;
        this.field117[var4][var5] = class118.method887(this.field117[var4][var5], -262145);
        if (arg2 != -1) {
            this.field105 = -112;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIIII)Z")
    public final boolean method40(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field104++;
        if (arg3 == arg4 && arg0 == arg6) {
            return true;
        }
        int var8 = 71 / ((6 - arg1) / 49);
        int var9 = arg4 - this.field129;
        int var10 = arg6 - this.field105;
        int var11 = arg0 - this.field105;
        int var12 = arg3 - this.field129;
        if (arg2 == 0) {
            if (arg5 == 0) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field117[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field117[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 == var12 && var11 + 1 == var10) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field117[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field117[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 == var12 && var11 - 1 == var10) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field117[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var12 - 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field117[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var12 - 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field117[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var12 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var9 == var12 && var11 + 1 == var10 && (this.field117[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var9 == var12 && var11 + 1 == var10 && (this.field117[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var9 == var12 && var11 - 1 == var10 && (this.field117[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var12 - 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var12 + 1 == var9 && var10 == var11 && (this.field117[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
    public final void method41(int arg0, int arg1, int arg2) {
        field111++;
        int var4 = arg0 - this.field129;
        int var5 = arg1 - this.field105;
        this.field117[var4][var5] = class38.method292(this.field117[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIZ)V")
    public final void method42(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field129;
        int var9 = arg0 - this.field105;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg4;
            arg4 = var10;
        }
        field120++;
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field125 > var12) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && this.field113 > var13) {
                        this.method45((byte) -110, var12, var13, var11);
                    }
                }
            }
        }
        if (arg3 <= 32) {
            field131 = 10;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
    public static final void method43(int arg0, int arg1) {
        field119++;
        class53.method374((byte) -78);
        class95.method764(false);
        if (arg1 != 2) {
            field133 = false;
        }
        int var2 = class72.method563(arg1 ^ 0x6A, arg0).field2884;
        if (var2 == 0) {
            return;
        }
        int var3 = class63.field1540[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class152.method1162(0.9D);
                ((class66) class152.field3422).method510(0, 0.9D);
            }
            if (var3 == 2) {
                class152.method1162(0.8D);
                ((class66) class152.field3422).method510(0, 0.8D);
            }
            if (var3 == 3) {
                class152.method1162(0.7D);
                ((class66) class152.field3422).method510(arg1 - 2, 0.7D);
            }
            if (var3 == 4) {
                class152.method1162(0.6D);
                ((class66) class152.field3422).method510(0, 0.6D);
            }
            class62.method492(4000);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class67.field1682 != var4) {
                if (class67.field1682 == 0 && field140 != -1) {
                    class137.method1068(var4, -2, class105.field2602, 0, field140, false);
                    class52.field1236 = false;
                } else if (var4 == 0) {
                    class133.method997(arg1 ^ 0x6431);
                    class52.field1236 = false;
                } else {
                    class68.method546(23245, var4);
                }
                class67.field1682 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class34.field856 = 127;
            }
            if (var3 == 1) {
                class34.field856 = 96;
            }
            if (var3 == 2) {
                class34.field856 = 64;
            }
            if (var3 == 3) {
                class34.field856 = 32;
            }
            if (var3 == 4) {
                class34.field856 = 0;
            }
        }
        if (var2 == 6) {
            class28.field757 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class139.field3190 = 127;
            }
            if (var3 == 1) {
                class139.field3190 = 96;
            }
            if (var3 == 2) {
                class139.field3190 = 64;
            }
            if (var3 == 3) {
                class139.field3190 = 32;
            }
            if (var3 == 4) {
                class139.field3190 = 0;
            }
        }
        if (var2 == 5) {
            class156.field3543 = var3;
        }
        if (var2 == 9) {
            class31.field791 = var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static void method44(boolean arg0) {
        field126 = null;
        if (arg0) {
            return;
        }
        field136 = null;
        field124 = null;
        field134 = null;
        field107 = null;
        field118 = null;
        field135 = null;
        field141 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIII)V")
    private final void method45(byte arg0, int arg1, int arg2, int arg3) {
        this.field117[arg1][arg2] = class118.method887(this.field117[arg1][arg2], ~arg3);
        field122++;
        if (arg0 > -84) {
            method36((byte) 42, null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        for (int var2 = 0; var2 < this.field125; var2++) {
            for (int var3 = 0; var3 < this.field113; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field125 - 5 || var3 >= this.field113 - 5) {
                    this.field117[var2][var3] = 16777215;
                } else {
                    this.field117[var2][var3] = 16777216;
                }
            }
        }
        if (arg0) {
            field128++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
    public class4(int arg0, int arg1) {
        this.field125 = arg0;
        this.field113 = arg1;
        this.field129 = 0;
        this.field117 = new int[this.field125][this.field113];
        this.field105 = 0;
        this.method46(true);
    }
}
