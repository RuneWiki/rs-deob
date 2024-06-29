import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 {

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    private int field2209;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[[I")
    public int[][] field2174;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lke;")
    public static class65 field2187 = class1.method17("Side panel redrawn", -127);

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lke;")
    public static class65 field2185 = class1.method17("Ung-Ultige Session)2ID)3", -116);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lke;")
    public static class65 field2176 = class1.method17("Fertigkeit)2", -125);

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2199 = -1;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lke;")
    private static class65 field2204 = class1.method17("Select", -121);

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Lke;")
    public static class65 field2197 = class1.method17(" )2> @yel@", -124);

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lke;")
    public static class65 field2189 = class1.method17("@red@", -115);

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Lke;")
    public static class65 field2206 = field2204;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Lke;")
    public static class65 field2202 = class1.method17("::", -127);

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lke;")
    private static class65 field2203 = class1.method17("Loading ignore list", -124);

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lke;")
    public static class65 field2192 = field2203;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    public static int[] field2182;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    public static int[] field2207;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 5)
    public final void method733(int arg0) {
        for (int var2 = 0; var2 < this.field2198; var2++) {
            for (int var4 = 0; var4 < this.field2193; var4++) {
                if (var2 == 0 || var4 == 0 || this.field2198 - 1 == var2 || this.field2193 - 1 == var4) {
                    this.field2174[var2][var4] = 16777215;
                } else {
                    this.field2174[var2][var4] = 16777216;
                }
            }
        }
        int var3 = 21 / ((arg0 - 51) / 44);
        field2194++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIII)V", line = 36)
    public final void method734(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2200++;
        int var7 = arg2 - this.field2188;
        int var8 = arg5 - this.field2209;
        if (arg4 != 8565) {
            method744(15);
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method735(var7, var8, (byte) -69, 128);
                this.method735(var7, var8 - 1, (byte) -72, 8);
            }
            if (arg1 == 1) {
                this.method735(var7, var8, (byte) -101, 2);
                this.method735(var7 + 1, var8, (byte) -115, 32);
            }
            if (arg1 == 2) {
                this.method735(var7, var8, (byte) -100, 8);
                this.method735(var7, var8 + 1, (byte) -86, 128);
            }
            if (arg1 == 3) {
                this.method735(var7, var8, (byte) -72, 32);
                this.method735(var7 - 1, var8, (byte) -12, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method735(var7, var8, (byte) -56, 1);
                this.method735(var7 + 1, var8 + -1, (byte) -113, 16);
            }
            if (arg1 == 1) {
                this.method735(var7, var8, (byte) -127, 4);
                this.method735(var7 + 1, var8 + 1, (byte) -51, 64);
            }
            if (arg1 == 2) {
                this.method735(var7, var8, (byte) -16, 16);
                this.method735(var7 - 1, var8 + 1, (byte) -27, 1);
            }
            if (arg1 == 3) {
                this.method735(var7, var8, (byte) -115, 64);
                this.method735(var7 - 1, var8 - 1, (byte) -26, 4);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method735(var7, var8, (byte) -112, 130);
                this.method735(var7, var8 - 1, (byte) -48, 8);
                this.method735(var7 + 1, var8, (byte) -64, 32);
            }
            if (arg1 == 1) {
                this.method735(var7, var8, (byte) -56, 10);
                this.method735(var7 + 1, var8, (byte) -88, 32);
                this.method735(var7, var8 + 1, (byte) -128, 128);
            }
            if (arg1 == 2) {
                this.method735(var7, var8, (byte) -119, 40);
                this.method735(var7, var8 + 1, (byte) -14, 128);
                this.method735(var7 - 1, var8, (byte) -62, 2);
            }
            if (arg1 == 3) {
                this.method735(var7, var8, (byte) -68, 160);
                this.method735(var7 - 1, var8, (byte) -117, 2);
                this.method735(var7, var8 - 1, (byte) -66, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method735(var7, var8, (byte) -44, 65536);
                this.method735(var7, var8 - 1, (byte) -119, 4096);
            }
            if (arg1 == 1) {
                this.method735(var7, var8, (byte) -63, 1024);
                this.method735(var7 + 1, var8, (byte) -126, 16384);
            }
            if (arg1 == 2) {
                this.method735(var7, var8, (byte) -31, 4096);
                this.method735(var7, var8 + 1, (byte) -26, 65536);
            }
            if (arg1 == 3) {
                this.method735(var7, var8, (byte) -22, 16384);
                this.method735(var7 - 1, var8, (byte) -23, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method735(var7, var8, (byte) -75, 512);
                this.method735(var7 + 1, var8 + -1, (byte) -47, 8192);
            }
            if (arg1 == 1) {
                this.method735(var7, var8, (byte) -61, 2048);
                this.method735(var7 + 1, var8 + 1, (byte) -101, 32768);
            }
            if (arg1 == 2) {
                this.method735(var7, var8, (byte) -89, 8192);
                this.method735(var7 - 1, var8 + 1, (byte) -128, 512);
            }
            if (arg1 == 3) {
                this.method735(var7, var8, (byte) -105, 32768);
                this.method735(var7 - 1, var8 + -1, (byte) -21, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method735(var7, var8, (byte) -22, 66560);
            this.method735(var7, var8 - 1, (byte) -96, 4096);
            this.method735(var7 + 1, var8, (byte) -29, 16384);
        }
        if (arg1 == 1) {
            this.method735(var7, var8, (byte) -128, 5120);
            this.method735(var7 + 1, var8, (byte) -50, 16384);
            this.method735(var7, var8 + 1, (byte) -58, 65536);
        }
        if (arg1 == 2) {
            this.method735(var7, var8, (byte) -76, 20480);
            this.method735(var7, var8 + 1, (byte) -109, 65536);
            this.method735(var7 - 1, var8, (byte) -100, 1024);
        }
        if (arg1 == 3) {
            this.method735(var7, var8, (byte) -67, 81920);
            this.method735(var7 - 1, var8, (byte) -61, 1024);
            this.method735(var7, var8 - 1, (byte) -70, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBI)V", line = 244)
    private final void method735(int arg0, int arg1, byte arg2, int arg3) {
        this.field2174[arg1][arg0] = class5.method37(this.field2174[arg1][arg0], arg3);
        field2181++;
        if (arg2 > -9) {
            this.method741(-86, -95, 85, (byte) 40, 59, true, -85);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIIIZ)V", line = 261)
    public final void method736(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field2209;
        int var8 = arg2 - this.field2188;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method746(128, false, var7, var8);
                this.method746(8, false, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method746(2, false, var7, var8);
                this.method746(32, false, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method746(8, false, var7, var8);
                this.method746(128, false, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method746(32, false, var7, var8);
                this.method746(2, false, var7, var8 - 1);
            }
        }
        if (arg1 != -79) {
            return;
        }
        field2183++;
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method746(1, false, var7, var8);
                this.method746(16, false, var7 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method746(4, false, var7, var8);
                this.method746(64, false, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method746(16, false, var7, var8);
                this.method746(1, false, var7 + 1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method746(64, false, var7, var8);
                this.method746(4, false, var7 - 1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method746(130, false, var7, var8);
                this.method746(8, false, var7 - 1, var8);
                this.method746(32, false, var7, var8 + 1);
            }
            if (arg4 == 1) {
                this.method746(10, false, var7, var8);
                this.method746(32, false, var7, var8 + 1);
                this.method746(128, false, var7 + 1, var8);
            }
            if (arg4 == 2) {
                this.method746(40, false, var7, var8);
                this.method746(128, false, var7 + 1, var8);
                this.method746(2, false, var7, var8 - 1);
            }
            if (arg4 == 3) {
                this.method746(160, false, var7, var8);
                this.method746(2, false, var7, var8 - 1);
                this.method746(8, false, var7 - 1, var8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method746(65536, false, var7, var8);
                this.method746(4096, false, var7 - 1, var8);
            }
            if (arg4 == 1) {
                this.method746(1024, false, var7, var8);
                this.method746(16384, false, var7, var8 + 1);
            }
            if (arg4 == 2) {
                this.method746(4096, false, var7, var8);
                this.method746(65536, false, var7 + 1, var8);
            }
            if (arg4 == 3) {
                this.method746(16384, false, var7, var8);
                this.method746(1024, false, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method746(512, false, var7, var8);
                this.method746(8192, false, var7 - 1, var8 - -1);
            }
            if (arg4 == 1) {
                this.method746(2048, false, var7, var8);
                this.method746(32768, false, var7 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method746(8192, false, var7, var8);
                this.method746(512, false, var7 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method746(32768, false, var7, var8);
                this.method746(2048, false, var7 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method746(66560, false, var7, var8);
            this.method746(4096, false, var7 - 1, var8);
            this.method746(16384, false, var7, var8 + 1);
        }
        if (arg4 == 1) {
            this.method746(5120, false, var7, var8);
            this.method746(16384, false, var7, var8 + 1);
            this.method746(65536, false, var7 + 1, var8);
        }
        if (arg4 == 2) {
            this.method746(20480, false, var7, var8);
            this.method746(65536, false, var7 + 1, var8);
            this.method746(1024, false, var7, var8 - 1);
        }
        if (arg4 == 3) {
            this.method746(81920, false, var7, var8);
            this.method746(1024, false, var7, var8 - 1);
            this.method746(4096, false, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIBII)Z", line = 480)
    public final boolean method737(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2179++;
        if (arg3 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg1 - this.field2188;
        int var9 = arg3 - this.field2209;
        int var10 = arg6 - this.field2209;
        if (arg4 < 50) {
            return true;
        }
        int var11 = arg2 - this.field2188;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2174[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2174[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2174[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2174[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field2174[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field2174[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field2174[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 615)
    public static final void method738(byte arg0) {
        class112.field2788.method793(-117);
        if (arg0 > -87) {
            field2197 = null;
        }
        class29.field792.method963(0, 0);
        field2180++;
        class31.field826 = class127.method1003(class31.field826);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 628)
    public final void method739(int arg0, int arg1, int arg2) {
        if (arg2 == 13514) {
            field2175++;
            int var4 = arg0 - this.field2188;
            int var5 = arg1 - this.field2209;
            this.field2174[var5][var4] = class114.method934(this.field2174[var5][var4], 14680063);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZI)V", line = 642)
    public static final void method740(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        field2190++;
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class84.field2224 = -1;
            class9.field162 = -1;
            return;
        }
        int var4 = class58.method495(arg1, arg3, !arg2, class19.field462) - arg0;
        int var5 = var4 - class5.field102;
        int var6 = arg3 - class102.field2642;
        int var7 = class37.field932[class76.field2038];
        int var8 = class37.field932[class51.field1295];
        int var9 = class37.field943[class76.field2038];
        int var10 = arg1 - class51.field1293;
        int var11 = class37.field943[class51.field1295];
        int var12 = var8 * var10 + var6 * var11 >> 16;
        int var13 = var10 * var11 - var6 * var8 >> 16;
        int var15 = var5 * var9 - var7 * var13 >> 16;
        int var16 = var5 * var7 + var9 * var13 >> 16;
        if (var16 < 50) {
            class84.field2224 = -1;
            class9.field162 = -1;
        } else {
            class84.field2224 = (var12 << 9) / var16 + 256;
            class9.field162 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIZI)V", line = 696)
    public final void method741(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field2188;
        int var9 = arg6 - this.field2209;
        int var10 = 256;
        field2186++;
        int var11 = 5 % ((arg3 + 8) / 58);
        if (arg1 == 1 || arg1 == 3) {
            int var12 = arg4;
            arg4 = arg0;
            arg0 = var12;
        }
        if (arg5) {
            var10 += 131072;
        }
        for (int var13 = var9; var13 < var9 + arg4; var13++) {
            if (var13 >= 0 && this.field2198 > var13) {
                for (int var14 = var8; var14 < arg0 + var8; var14++) {
                    if (var14 >= 0 && var14 < this.field2193) {
                        this.method735(var14, var13, (byte) -14, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIIIII)V", line = 760)
    public final void method742(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2201++;
        int var8 = arg5 - this.field2188;
        int var9 = 256;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = arg6 - this.field2209;
        if (arg2 != -2426) {
            this.method741(-67, -82, 104, (byte) 80, 109, true, 94);
        }
        if (arg1) {
            var9 += 131072;
        }
        for (int var12 = var11; var12 < var11 + arg4; var12++) {
            if (var12 >= 0 && this.field2198 > var12) {
                for (int var13 = var8; var13 < var8 + arg0; var13++) {
                    if (var13 >= 0 && this.field2193 > var13) {
                        this.method746(var9, false, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIIII)Z", line = 821)
    public final boolean method743(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2205++;
        if (arg3 != 67) {
            this.method735(113, -90, (byte) 116, 96);
        }
        int var9 = arg7 + arg4 - 1;
        int var10 = arg6 + arg1 - 1;
        if (arg2 >= arg7 && arg2 <= var9 && arg6 <= arg0 && arg0 <= var10) {
            return true;
        } else if (arg7 - 1 == arg2 && arg6 <= arg0 && var10 >= arg0 && (this.field2174[arg2 - this.field2209][arg0 - this.field2188] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg6 <= arg0 && arg0 <= var10 && (this.field2174[arg2 - this.field2209][arg0 - this.field2188] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg0 && arg7 <= arg2 && arg2 <= var9 && (this.field2174[arg2 - this.field2209][arg0 - this.field2188] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg2 >= arg7 && arg2 <= var9 && (this.field2174[arg2 - this.field2209][arg0 - this.field2188] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 854)
    public static void method744(int arg0) {
        field2192 = null;
        int var1 = 100 % ((65 - arg0) / 52);
        field2187 = null;
        field2202 = null;
        field2189 = null;
        field2203 = null;
        field2204 = null;
        field2207 = null;
        field2185 = null;
        field2197 = null;
        field2206 = null;
        field2182 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V", line = 875)
    public final void method745(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2188;
        int var5 = arg0 - this.field2209;
        if (arg1 < 116) {
            field2203 = null;
        }
        field2195++;
        this.field2174[var5][var4] = class5.method37(this.field2174[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZII)V", line = 900)
    private final void method746(int arg0, boolean arg1, int arg2, int arg3) {
        this.field2174[arg2][arg3] = class114.method934(this.field2174[arg2][arg3], 16777215 - arg0);
        if (arg1) {
            field2202 = null;
        }
        field2196++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIIII)Z", line = 913)
    public final boolean method747(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2208++;
        if (arg1 == arg6 && arg2 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field2209;
        int var9 = arg1 - this.field2209;
        int var10 = arg3 - this.field2188;
        int var11 = arg2 - this.field2188;
        if (arg4 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2174[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2174[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2174[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2174[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0) {
            this.field2174 = null;
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2174[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2174[var8][var10] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2174[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2174[var8][var10] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field2174[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field2174[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field2174[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(II)V", line = 1107)
    public class83(int arg0, int arg1) {
        this.field2193 = arg1;
        this.field2209 = 0;
        this.field2188 = 0;
        this.field2198 = arg0;
        this.field2174 = new int[this.field2198][this.field2193];
        this.method733(102);
    }
}
