import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class105 extends class110 {

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "[Llf;")
    public class105[] field2196;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Z")
    public boolean field2179;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "[I")
    public static int[] field2181 = new int[32];

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Leh;")
    public static class47 field2184 = class195.method1282((byte) -4, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Leh;")
    public static class47 field2183 = class195.method1282((byte) -4, "blinken1:");

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Leh;")
    private static class47 field2207 = class195.method1282((byte) -4, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Leh;")
    public static class47 field2205 = class195.method1282((byte) -4, "weiss:");

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Leh;")
    public static class47 field2198 = field2207;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Laa;")
    public class2 field2186;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Le;")
    public class39 field2192;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "[[[B")
    public static byte[][][] field2191;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)I")
    public static final int method848(int arg0, int arg1, int arg2) {
        field2206++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else if (arg2 == -256) {
            return var3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)I")
    public static final int method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        field2190++;
        if (arg5 >= -126) {
            return 18;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg4;
        } else {
            return 1 + 7 - arg3 - arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILhd;I)V")
    public void method17(int arg0, class68 arg1, int arg2) {
        field2180++;
        if (arg2 != -256) {
            field2210 = 36;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
    public int method850(byte arg0) {
        if (arg0 == -26) {
            field2200++;
            return -1;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZI)[I")
    public final int[] method851(int arg0, boolean arg1, int arg2) {
        field2187++;
        if (!arg1) {
            method853(null, 24);
        }
        return this.field2196[arg0].field2179 ? this.field2196[arg0].method92(arg2, (byte) 103) : this.field2196[arg0].method15(arg2, arg1)[0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[[I")
    public int[][] method15(int arg0, boolean arg1) {
        if (arg1) {
            field2202++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)V")
    public static final void method852(byte arg0, long arg1) {
        field2199++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class5.field88; var3++) {
            if (class25.field487[var3] == arg1) {
                class174.field3365++;
                class5.field88--;
                for (int var4 = var3; var4 < class5.field88; var4++) {
                    class25.field487[var4] = class25.field487[var4 + 1];
                    class14.field303[var4] = class14.field303[var4 + 1];
                }
                class36.field713 = class103.field2162;
                class60.field1174.method657(28182, 42);
                class60.field1174.method600(32601, arg1);
                break;
            }
        }
        int var5 = -89 / ((arg0 + 59) / 61);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsh;I)V")
    public static final void method853(class170 arg0, int arg1) {
        arg0.field3323 = arg0.field3314;
        field2203++;
        if (arg0.field3272 == 0) {
            arg0.field3273 = 0;
            return;
        }
        if (arg0.field3330 != -1 && arg0.field3329 == 0) {
            class22 var2 = class25.method236(false, arg0.field3330);
            if (arg0.field3300 > 0 && var2.field440 == 0) {
                arg0.field3273++;
                return;
            }
            if (arg0.field3300 <= 0 && var2.field421 == 0) {
                arg0.field3273++;
                return;
            }
        }
        int var3 = arg0.field3291;
        int var4 = arg0.field3281;
        int var5 = arg0.field3310[arg0.field3272 - 1] * 128 + arg0.field3276 * 64;
        int var6 = arg0.field3317[arg0.field3272 - 1] * 128 + arg0.field3276 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field3281 = var6;
            arg0.field3291 = var5;
            return;
        }
        if (var3 >= var5) {
            if (var3 > var5) {
                if (var6 > var4) {
                    arg0.field3282 = 768;
                } else if (var4 > var6) {
                    arg0.field3282 = 256;
                } else {
                    arg0.field3282 = 512;
                }
            } else if (var4 < var6) {
                arg0.field3282 = 1024;
            } else if (var4 > var6) {
                arg0.field3282 = 0;
            }
        } else if (var4 < var6) {
            arg0.field3282 = 1280;
        } else if (var6 >= var4) {
            arg0.field3282 = 1536;
        } else {
            arg0.field3282 = 1792;
        }
        int var7 = arg0.field3282 - arg0.field3286 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        boolean var8 = true;
        int var9 = 4;
        int var10 = arg0.field3338;
        if (var7 >= -256 && var7 <= 256) {
            var10 = arg0.field3328;
        } else if (var7 >= 256 && var7 < 768) {
            var10 = arg0.field3280;
        } else if (var7 >= -768 && var7 <= -256) {
            var10 = arg0.field3332;
        }
        if (var10 == -1) {
            var10 = arg0.field3328;
        }
        arg0.field3323 = var10;
        if (arg0 instanceof class72) {
            var8 = ((class72) arg0).field1547.field1098;
        }
        if (arg1 <= 3) {
            return;
        }
        if (var8) {
            if (arg0.field3286 != arg0.field3282 && arg0.field3287 == -1 && arg0.field3308 != 0) {
                var9 = 2;
            }
            if (arg0.field3272 > 2) {
                var9 = 6;
            }
            if (arg0.field3272 > 3) {
                var9 = 8;
            }
            if (arg0.field3273 > 0 && arg0.field3272 > 1) {
                arg0.field3273--;
                var9 = 8;
            }
        } else {
            if (arg0.field3272 > 1) {
                var9 = 6;
            }
            if (arg0.field3272 > 2) {
                var9 = 8;
            }
            if (arg0.field3273 > 0 && arg0.field3272 > 1) {
                arg0.field3273--;
                var9 = 8;
            }
        }
        if (arg0.field3284[arg0.field3272 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg0.field3291 += var9;
            if (arg0.field3291 > var5) {
                arg0.field3291 = var5;
            }
        } else if (var5 < var3) {
            arg0.field3291 -= var9;
            if (var5 > arg0.field3291) {
                arg0.field3291 = var5;
            }
        }
        if (var9 >= 8 && arg0.field3328 == arg0.field3323 && arg0.field3294 != -1) {
            arg0.field3323 = arg0.field3294;
        }
        if (var6 > var4) {
            arg0.field3281 += var9;
            if (arg0.field3281 > var6) {
                arg0.field3281 = var6;
            }
        } else if (var4 > var6) {
            arg0.field3281 -= var9;
            if (arg0.field3281 < var6) {
                arg0.field3281 = var6;
            }
        }
        if (arg0.field3291 != var5 || arg0.field3281 != var6) {
            return;
        }
        arg0.field3272--;
        if (arg0.field3300 > 0) {
            arg0.field3300--;
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method854(int arg0, byte arg1, int arg2) {
        int var4 = -66 / ((-arg1 - 25) / 35);
        field2208++;
        if (this.field2196[arg0].field2179) {
            int[] var5 = this.field2196[arg0].method92(arg2, (byte) 116);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field2196[arg0].method15(arg2, true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field2181 = null;
        if (arg0 < 36) {
            return;
        }
        field2191 = null;
        field2198 = null;
        field2207 = null;
        field2184 = null;
        field2183 = null;
        field2205 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IBI)V")
    public final void method856(int arg0, byte arg1, int arg2) {
        field2185++;
        if (arg1 >= -73) {
            this.field2197 = 92;
        }
        int var4 = this.field2197 == 255 ? arg2 : this.field2197;
        if (this.field2179) {
            this.field2192 = new class39(var4, arg2, arg0);
        } else {
            this.field2186 = new class2(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)I")
    public static final int method857(int arg0, int arg1, boolean arg2) {
        field2189++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (!arg2) {
                method849(-104, 27, 4, 117, -20, 98, -55);
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V")
    public class105(int arg0, boolean arg1) {
        this.field2196 = new class105[arg0];
        this.field2179 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
    public int method858(int arg0) {
        if (arg0 != 18263) {
            field2205 = null;
        }
        field2204++;
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static final void method859(int arg0) {
        field2194++;
        if (class204.field4029 && class196.field3827 != class107.field2226) {
            class108.method872(class123.field2489.field3310[0], class138.field2715, class123.field2489.field3317[0], class196.field3827, class23.field447, -19789);
            return;
        }
        if (class99.field2090 != class196.field3827) {
            class99.field2090 = class196.field3827;
            class146.method1034(class196.field3827, 0);
        }
        if (arg0 > -104) {
            field2198 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
    public int[] method92(int arg0, byte arg1) {
        field2201++;
        if (arg1 > 78) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public void method13(int arg0) {
        if (arg0 != -1) {
            method857(42, -65, false);
        }
        field2193++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public final void method860(boolean arg0) {
        if (this.field2179) {
            this.field2192.method331(-127);
            this.field2192 = null;
        } else {
            this.field2186.method6(1);
            this.field2186 = null;
        }
        if (arg0) {
            method855((byte) -26);
        }
        field2195++;
    }
}
