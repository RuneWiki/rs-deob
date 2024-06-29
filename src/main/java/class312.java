import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class312 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field5067 = -1;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public int field5073 = 0;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Z")
    public boolean field5079 = false;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
    public boolean field5088 = true;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public int field5080 = -1;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public int field5076 = -1;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    private int field5074 = -1;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
    public boolean field5077 = true;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    private int field5103 = -1;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field5085 = -1;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    private int field5069 = -1;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    private int field5102 = -1;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
    public boolean field5068 = true;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field5095 = -1;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field5090 = new String[5];

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    public static int[] field5072 = new int[5];

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "Z")
    public static boolean field5106 = false;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "[I")
    public static int[] field5094 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lui;")
    public static class98 field5086 = new class98(200);

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "[J")
    public static long[] field5107 = new long[100];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    private int field5093;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    private int field5099;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public int field5101;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    private int field5105;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/lang/String;")
    public String field5075;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "Ljava/lang/String;")
    public String field5104;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "[I")
    public int[] field5100;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 6)
    public static void method2175(int arg0) {
        if (arg0 != 1) {
            field5107 = (long[]) null;
        }
        field5086 = null;
        field5094 = null;
        field5072 = null;
        field5107 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZI)Loh;", line = 25)
    public final class187 method2176(boolean arg0, boolean arg1, int arg2) {
        field5083++;
        int var4 = arg1 ? this.field5076 : this.field5080;
        class187 var5 = (class187) class279.field4594.method652((long) ((arg1 ? 65536 : 0) | var4), false);
        if (var5 != null) {
            return var5;
        } else if (class269.field4434.method1519(false, var4)) {
            class239 var6 = class310.method2168(0, class269.field4434, var4, (byte) -72);
            class187 var7;
            if (class245.field3886 && !arg0) {
                var7 = new class87(var6);
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                var7.field2916 = 0;
                var7.field2907 = 0;
                var7.field2917 = var7.field2915;
                var7.field2909 = var7.field2913;
                class279.field4594.method642(var7, (long) (var4 | (arg1 ? 65536 : 0)), -117);
            }
            if (arg2 != -18) {
                method2178(91, -99, -103, -36);
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lfh;B)V", line = 75)
    public final void method2177(class313 arg0, byte arg1) {
        if (arg1 > -56) {
            method2183(-20, (byte) 1, -103, -8, 96, -30);
        }
        field5092++;
        while (true) {
            int var3 = arg0.method2224(-125);
            if (var3 == 0) {
                return;
            }
            this.method2184(-24058, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I", line = 121)
    public static final int method2178(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -8 % ((52 - arg0) / 56);
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field5078++;
        return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z", line = 152)
    public final boolean method2179(int arg0) {
        field5066++;
        if (arg0 != 11902) {
            return true;
        } else if (this.field5103 == -1 && this.field5074 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field5103 == -1) {
                var3 = class44.method338(this.field5074, (byte) -120);
            } else {
                var3 = class170.field2650[this.field5103];
            }
            if (var3 < this.field5093 || var3 > this.field5105) {
                return false;
            } else if (this.field5102 == -1 && this.field5067 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field5102 == -1) {
                    var5 = class44.method338(this.field5067, (byte) -91);
                } else {
                    var5 = class170.field2650[this.field5102];
                }
                return this.field5098 <= var5 && this.field5099 >= var5;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lfo;", line = 219)
    public final class239 method2180(int arg0) {
        field5089++;
        int var2 = -6 % ((-arg0 - 2) / 43);
        class239 var3 = (class239) class279.field4594.method652((long) (this.field5069 | 0x20000), false);
        if (var3 != null) {
            return var3;
        }
        class269.field4434.method1519(false, this.field5069);
        class239 var4 = class310.method2168(0, class269.field4434, this.field5069, (byte) 75);
        if (var4 != null) {
            var4.field2907 = 0;
            var4.field2909 = var4.field2913;
            var4.field2916 = 0;
            var4.field2917 = var4.field2915;
            class279.field4594.method642(var4, (long) (this.field5069 | 0x20000), -84);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I", line = 251)
    public static final int method2181(int arg0, int arg1, int arg2) {
        field5096++;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg1 == 200 ? var5 >> 19 & 0xFF : 47;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lnm;IB)Loh;", line = 269)
    public static final class187 method2182(class221 arg0, int arg1, byte arg2) {
        if (arg2 != -35) {
            field5086 = (class98) null;
        }
        field5082++;
        return class358.method2493((byte) -90, arg0, arg1) ? class319.method2297(0) : null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIIII)V", line = 290)
    public static final void method2183(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field5081++;
        if (class278.field4586 >= arg3 && class33.field505 <= arg2) {
            boolean var6;
            if (arg0 < class341.field5494) {
                var6 = false;
                arg0 = class341.field5494;
            } else if (class196.field3001 >= arg0) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class196.field3001;
            }
            boolean var7;
            if (class341.field5494 > arg5) {
                arg5 = class341.field5494;
                var7 = false;
            } else if (class196.field3001 < arg5) {
                var7 = false;
                arg5 = class196.field3001;
            } else {
                var7 = true;
            }
            if (class33.field505 <= arg3) {
                class270.method1906(arg4, arg5, arg0, class306.field4998[arg3++], 127);
            } else {
                arg3 = class33.field505;
            }
            if (arg2 > class278.field4586) {
                arg2 = class278.field4586;
            } else {
                class270.method1906(arg4, arg5, arg0, class306.field4998[arg2--], 119);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg2; var8++) {
                    int[] var9 = class306.field4998[var8];
                    var9[arg0] = var9[arg5] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg2; var11++) {
                    class306.field4998[var11][arg0] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg2; var10++) {
                    class306.field4998[var10][arg5] = arg4;
                }
            }
        }
        int var12 = -46 % ((arg1 - 71) / 36);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILfh;I)V", line = 392)
    private final void method2184(int arg0, class313 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5080 = arg1.method2250(-1613178296);
        } else if (arg2 == 2) {
            this.field5076 = arg1.method2250(-1613178296);
        } else if (arg2 == 3) {
            this.field5104 = arg1.method2198(-430);
        } else if (arg2 == 4) {
            this.field5087 = arg1.method2249(-98);
        } else if (arg2 == 5) {
            this.field5085 = arg1.method2249(arg0 ^ 0x5DF5);
        } else if (arg2 == 6) {
            this.field5073 = arg1.method2224(arg0 + 23938);
        } else if (arg2 == 7) {
            int var4 = arg1.method2224(-124);
            if ((var4 & 0x2) == 2) {
                this.field5079 = true;
            }
            if ((var4 & 0x1) == 0) {
                this.field5077 = false;
            }
        } else if (arg2 == 8) {
            this.field5068 = arg1.method2224(-121) == 1;
        } else if (arg2 == 9) {
            this.field5074 = arg1.method2250(-1613178296);
            if (this.field5074 == 65535) {
                this.field5074 = -1;
            }
            this.field5103 = arg1.method2250(arg0 - 1613154238);
            if (this.field5103 == 65535) {
                this.field5103 = -1;
            }
            this.field5093 = arg1.method2231((byte) -127);
            this.field5105 = arg1.method2231((byte) -126);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field5090[arg2 - 10] = arg1.method2198(-430);
        } else if (arg2 == 15) {
            int var5 = arg1.method2224(-122);
            this.field5100 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field5100[var6] = arg1.method2214(0);
            }
            this.field5071 = arg1.method2231((byte) -123);
            this.field5097 = arg1.method2231((byte) -123);
        } else if (arg2 == 16) {
            this.field5088 = false;
        } else if (arg2 == 17) {
            this.field5075 = arg1.method2198(-430);
        } else if (arg2 == 18) {
            this.field5069 = arg1.method2250(-1613178296);
        } else if (arg2 == 19) {
            this.field5095 = arg1.method2250(-1613178296);
        } else if (arg2 == 20) {
            this.field5067 = arg1.method2250(-1613178296);
            if (this.field5067 == 65535) {
                this.field5067 = -1;
            }
            this.field5102 = arg1.method2250(arg0 - 1613154238);
            if (this.field5102 == 65535) {
                this.field5102 = -1;
            }
            this.field5098 = arg1.method2231((byte) -126);
            this.field5099 = arg1.method2231((byte) -127);
        } else if (arg2 == 21) {
            this.field5084 = arg1.method2231((byte) -125);
        } else if (arg2 == 22) {
            this.field5070 = arg1.method2231((byte) -124);
        }
        if (arg0 != -24058) {
            this.field5067 = 99;
        }
        field5091++;
    }
}
