import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class114 {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lrd;")
    public static class173 field2104 = class133.method843("<col=ffff00>*V", 66);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lrd;")
    public static class173 field2100 = class133.method843("me", -93);

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field2117 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lrd;")
    private static class173 field2108 = class133.method843("RuneScape has been updated(Q", 15);

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lrd;")
    public static class173 field2123 = field2108;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "J")
    private long field2112;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "J")
    private long field2115;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "La;")
    public static class1 field2106;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
    public boolean field2109;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
    private int[] field2113;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[I")
    private int[] field2124;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILri;I)Lvf;")
    public final class213 method692(int arg0, class178 arg1, int arg2) {
        field2110++;
        if (this.field2111 != -1) {
            return class94.method593(this.field2111, (byte) -38).method314(arg2, (byte) 74, arg1);
        }
        class213 var4 = (class213) class76.field1497.method46(this.field2115, arg0 ^ 0xFFFF9827);
        if (arg0 != -13) {
            return null;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2113[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class41.method302((byte) 119, var15 & 0x3FFFFFFF).method1301((byte) 73)) {
                        var5 = true;
                    }
                } else if (!class195.method1298(1639, var15 & 0x3FFFFFFF).method166(-1, this.field2109)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class141[] var8 = new class141[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2113[var9];
                if ((var12 & 0x40000000) != 0) {
                    class141 var14 = class195.method1298(1639, var12 & 0x3FFFFFFF).method167(79, this.field2109);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class141 var13 = class41.method302((byte) 114, var12 & 0x3FFFFFFF).method1303(arg0 - 24396);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class141 var10 = new class141(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class164.field3043[var11].length > this.field2124[var11]) {
                    var10.method890(class147.field2767[var11], class164.field3043[var11][this.field2124[var11]]);
                }
                if (this.field2124[var11] < class158.field2965[var11].length) {
                    var10.method890(class52.field1071[var11], class158.field2965[var11][this.field2124[var11]]);
                }
            }
            var4 = var10.method897(64, 768, -50, -10, -50, true, true);
            class76.field1497.method52(-3583, var4, this.field2115);
        }
        if (arg1 != null) {
            var4 = arg1.method1203(var4, 65535, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public final void method693(int arg0, int arg1, int arg2) {
        int var4 = class202.field3922[arg0];
        field2102++;
        if (this.field2113[var4] != 0 && class41.method302((byte) 107, arg1) != null) {
            this.field2113[var4] = class21.method181(arg2, arg1);
            this.method698(arg2 ^ 0x8000000C);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
    public final void method694(boolean arg0, int arg1) {
        if (arg1 == -6) {
            field2105++;
            if (arg0 != this.field2109) {
                this.method703(arg1 - 983186354, -1, arg0, this.field2124, null);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V")
    public final void method695(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field2115 = -15L;
        }
        field2103++;
        this.field2124[arg1] = arg0;
        this.method698(12);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILmb;)V")
    public final void method696(int arg0, class121 arg1) {
        field2114++;
        arg1.method752(this.field2109 ? 1 : 0, (byte) -128);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2113[class202.field3922[var3]];
            if ((Integer.MIN_VALUE & var5) == 0) {
                arg1.method736(65535, 90);
            } else {
                arg1.method736(var5 & 0x3FFFFFFF, 93);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method752(this.field2124[var4], (byte) -128);
        }
        if (arg0 < 63) {
            this.method699((byte) -94);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method697(int arg0) {
        if (arg0 != 14058) {
            return;
        }
        field2106 = null;
        field2123 = null;
        field2100 = null;
        field2108 = null;
        field2104 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    private final void method698(int arg0) {
        long var2 = this.field2115;
        field2120++;
        this.field2115 = -1L;
        long[] var4 = class66.field1280;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2115 = this.field2115 >>> 8 ^ var4[(int) (((long) (this.field2113[var5] >> 24) ^ this.field2115) & 0xFFL)];
            this.field2115 = var4[(int) (((long) (this.field2113[var5] >> 16) ^ this.field2115) & 0xFFL)] ^ this.field2115 >>> 8;
            this.field2115 = var4[(int) (((long) (this.field2113[var5] >> 8) ^ this.field2115) & 0xFFL)] ^ this.field2115 >>> 8;
            this.field2115 = this.field2115 >>> 8 ^ var4[(int) (((long) this.field2113[var5] ^ this.field2115) & 0xFFL)];
        }
        if (arg0 != 12) {
            this.method698(42);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2115 = var4[(int) ((this.field2115 ^ (long) this.field2124[var6]) & 0xFFL)] ^ this.field2115 >>> 8;
        }
        this.field2115 = this.field2115 >>> 8 ^ var4[(int) (((long) (this.field2109 ? 1 : 0) ^ this.field2115) & 0xFFL)];
        if (var2 != 0L && this.field2115 != var2) {
            class92.field1739.method50(var2, 4);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
    public final int method699(byte arg0) {
        if (arg0 != 3) {
            this.method694(false, -41);
        }
        field2127++;
        return this.field2111 == -1 ? (this.field2113[8] << 10) + ((this.field2124[0] << 25) + (this.field2124[4] << 20)) + (this.field2113[11] << 5) + (this.field2113[0] << 15) + this.field2113[1] : class94.method593(this.field2111, (byte) -38).field927 + 305419896;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIZ)V")
    public final void method700(boolean arg0, int arg1, boolean arg2) {
        field2126++;
        int var4 = this.field2124[arg1];
        if (!arg0) {
            field2101 = 34;
        }
        if (arg2) {
            var4++;
            if (class164.field3043[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class164.field3043[arg1].length - 1;
            }
        }
        this.field2124[arg1] = var4;
        this.method698(12);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILri;ILri;)Lvf;")
    public final class213 method701(int arg0, int arg1, class178 arg2, int arg3, class178 arg4) {
        if (arg0 != 5) {
            field2101 = 17;
        }
        field2122++;
        if (this.field2111 != -1) {
            return class94.method593(this.field2111, (byte) -38).method315(arg2, arg3, arg4, arg1, arg0 ^ 0xFFFFFFFA);
        }
        long var6 = this.field2115;
        int[] var8 = this.field2113;
        if (arg4 != null && (arg4.field3495 >= 0 || arg4.field3509 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2113[var9];
            }
            if (arg4.field3495 >= 0) {
                if (arg4.field3495 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class21.method181(arg4.field3495, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field3509 >= 0) {
                if (arg4.field3509 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class21.method181(1073741824, arg4.field3509);
                    var6 ^= var8[3];
                }
            }
        }
        class213 var10 = (class213) class92.field1739.method46(var6, arg0 ^ 0x67D1);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class41.method302((byte) 102, var21 & 0x3FFFFFFF).method1302(0)) {
                        var11 = true;
                    }
                } else if (!class195.method1298(1639, var21 & 0x3FFFFFFF).method162((byte) 60, this.field2109)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2112 != -1L) {
                    var10 = (class213) class92.field1739.method46(this.field2112, arg0 + 26575);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class141[] var13 = new class141[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class141 var20 = class195.method1298(1639, var18 & 0x3FFFFFFF).method171((byte) -115, this.field2109);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class141 var19 = class41.method302((byte) 125, var18 & 0x3FFFFFFF).method1307(arg0 + 105);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class141 var16 = new class141(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class164.field3043[var17].length > this.field2124[var17]) {
                        var16.method890(class147.field2767[var17], class164.field3043[var17][this.field2124[var17]]);
                    }
                    if (this.field2124[var17] < class158.field2965[var17].length) {
                        var16.method890(class52.field1071[var17], class158.field2965[var17][this.field2124[var17]]);
                    }
                }
                var10 = var16.method897(64, 850, -30, -50, -30, true, true);
                class92.field1739.method52(-3583, var10, var6);
                this.field2112 = var6;
            }
        }
        if (arg4 == null && arg2 == null) {
            return var10;
        }
        class213 var22;
        if (arg4 != null && arg2 != null) {
            var22 = arg4.method1201(arg1, arg2, arg3, (byte) -44, var10);
        } else if (arg4 == null) {
            var22 = arg2.method1193(arg3, var10, (byte) 86);
        } else {
            var22 = arg4.method1193(arg1, var10, (byte) 103);
        }
        return var22;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        if (arg1 != -86) {
            this.field2112 = 105L;
        }
        this.field2109 = arg0;
        this.method698(12);
        field2118++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ[I[I)V")
    public final void method703(int arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        field2116++;
        if (arg0 != -983186360) {
            this.method703(14, -110, false, null, null);
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class196.field3824; var7++) {
                    class196 var8 = class41.method302((byte) 99, var7);
                    if (var8 != null && !var8.field3805 && var8.field3812 == var6 + (arg2 ? 7 : 0)) {
                        arg4[class202.field3922[var6]] = class21.method181(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2111 = arg1;
        this.field2113 = arg4;
        this.field2124 = arg3;
        this.field2109 = arg2;
        this.method698(12);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIB)V")
    public final void method704(boolean arg0, int arg1, byte arg2) {
        field2119++;
        if (arg1 == 1 && this.field2109) {
            return;
        }
        int var4 = this.field2113[class202.field3922[arg1]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class196 var6;
        do {
            if (arg0) {
                var5++;
                if (var5 >= class196.field3824) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class196.field3824 - 1;
                }
            }
            var6 = class41.method302((byte) 105, var5);
        } while (var6 == null || var6.field3805 || var6.field3812 != arg1 + (this.field2109 ? 7 : 0));
        this.field2113[class202.field3922[arg1]] = class21.method181(Integer.MIN_VALUE, var5);
        if (arg2 != 20) {
            field2123 = null;
        }
        this.method698(arg2 ^ 0x18);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
    public static final boolean method705(boolean arg0) {
        field2121++;
        if (arg0) {
            return false;
        } else if (class55.field1097 == 0) {
            return class21.field467.method74((byte) 96);
        } else {
            return true;
        }
    }
}
