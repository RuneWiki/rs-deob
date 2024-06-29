import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 {

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field2242;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[[I")
    public int[][] field2269;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lpd;")
    private static class94 field2243 = class28.method249(-125, "Unable to connect)3");

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lpd;")
    public static class94 field2240 = class28.method249(49, "Fps:");

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
    public static volatile boolean field2253 = false;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lpd;")
    public static class94 field2251 = class28.method249(-87, "Stufe)2");

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Lpd;")
    private static class94 field2259 = class28.method249(-125, "Loaded gamescreen");

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field2256 = 20;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lpd;")
    public static class94 field2255 = field2243;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Lpd;")
    public static class94 field2266 = class28.method249(-74, "::errortest");

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Lpd;")
    public static class94 field2267 = class28.method249(106, " weitere Optionen");

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lpd;")
    private static class94 field2238 = class28.method249(-120, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lpd;")
    public static class94 field2257 = field2238;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lpd;")
    public static class94 field2245 = field2259;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lpd;")
    public static class94 field2239 = field2243;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lpd;")
    public static class94 field2273 = class28.method249(127, "null");

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method644(boolean arg0) {
        field2250++;
        while (class99.field2502.method322(8, class95.field2443) >= 11) {
            int var1 = class99.field2502.method319(11, 8);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class85.field2138[var1] == null) {
                var2 = true;
                class85.field2138[var1] = new class89();
                if (class23.field613[var1] != null) {
                    class85.field2138[var1].method665(class23.field613[var1], false);
                }
            }
            class38.field985[class113.field2886++] = var1;
            class89 var3 = class85.field2138[var1];
            var3.field163 = class26.field699;
            int var4 = class99.field2502.method319(5, 8);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class99.field2502.method319(5, 8);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class99.field2502.method319(1, 8);
            int var7 = class33.field920[class99.field2502.method319(3, 8)];
            if (var2) {
                var3.field187 = var7;
            }
            int var8 = class99.field2502.method319(1, 8);
            if (var8 == 1) {
                class81.field2060[class66.field1613++] = var1;
            }
            var3.method46(var6 == 1, class80.field2044.field219[0] + var4, 0, class80.field2044.field165[0] + var5);
        }
        if (arg0) {
            field2257 = null;
        }
        class99.field2502.method327(7);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 91)
    public static void method645(byte arg0) {
        field2267 = null;
        field2243 = null;
        field2245 = null;
        field2266 = null;
        field2272 = null;
        field2257 = null;
        field2240 = null;
        field2255 = null;
        if (arg0 <= 63) {
            field2267 = null;
        }
        field2259 = null;
        field2251 = null;
        field2239 = null;
        field2238 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V", line = 113)
    private final void method646(int arg0, int arg1, int arg2, int arg3) {
        this.field2269[arg3][arg1] = class81.method605(this.field2269[arg3][arg1], arg2 - arg0);
        field2261++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZIII)V", line = 127)
    public final void method647(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field2248;
        int var9 = arg6 - this.field2242;
        field2246++;
        if (arg4 != -4) {
            method645((byte) -55);
        }
        int var10 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg0;
            arg0 = arg2;
            arg2 = var11;
        }
        if (arg3) {
            var10 += 131072;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && this.field2265 > var12) {
                for (int var13 = var8; var13 < arg2 + var8; var13++) {
                    if (var13 >= 0 && this.field2247 > var13) {
                        this.method651(var12, (byte) -23, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 184)
    public static final void method648(int arg0) {
        field2268++;
        int var1 = class99.field2502.method319(8, 8);
        if (arg0 != 3) {
            return;
        }
        if (class113.field2886 > var1) {
            for (int var2 = var1; var2 < class113.field2886; var2++) {
                client.field479[class13.field332++] = class38.field985[var2];
            }
        }
        if (class113.field2886 < var1) {
            throw new RuntimeException("gppov1");
        }
        class113.field2886 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class38.field985[var3];
            class89 var5 = class85.field2138[var4];
            int var6 = class99.field2502.method319(1, 8);
            if (var6 == 0) {
                class38.field985[class113.field2886++] = var4;
                var5.field163 = class26.field699;
            } else {
                int var7 = class99.field2502.method319(2, arg0 ^ 0xB);
                if (var7 == 0) {
                    class38.field985[class113.field2886++] = var4;
                    var5.field163 = class26.field699;
                    class81.field2060[class66.field1613++] = var4;
                } else if (var7 == 1) {
                    class38.field985[class113.field2886++] = var4;
                    var5.field163 = class26.field699;
                    int var8 = class99.field2502.method319(3, 8);
                    var5.method45(false, true, var8);
                    int var9 = class99.field2502.method319(1, 8);
                    if (var9 == 1) {
                        class81.field2060[class66.field1613++] = var4;
                    }
                } else if (var7 == 2) {
                    class38.field985[class113.field2886++] = var4;
                    var5.field163 = class26.field699;
                    int var10 = class99.field2502.method319(3, 8);
                    var5.method45(true, true, var10);
                    int var11 = class99.field2502.method319(3, 8);
                    var5.method45(true, true, var11);
                    int var12 = class99.field2502.method319(1, 8);
                    if (var12 == 1) {
                        class81.field2060[class66.field1613++] = var4;
                    }
                } else if (var7 == 3) {
                    client.field479[class13.field332++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIIII)Z", line = 292)
    public final boolean method649(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2260++;
        if (arg2 == arg5 && arg0 == arg4) {
            return true;
        }
        int var8 = arg4 - this.field2248;
        if (arg1 != -26) {
            field2266 = null;
        }
        int var9 = arg0 - this.field2248;
        int var10 = arg2 - this.field2242;
        int var11 = arg5 - this.field2242;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2269[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2269[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2269[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2269[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field2269[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field2269[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2269[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIIIII)Z", line = 393)
    public final boolean method650(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2252++;
        if (arg2 == arg5 && arg3 == arg6) {
            return true;
        } else if (arg0 < 90) {
            return false;
        } else {
            int var8 = arg2 - this.field2242;
            int var9 = arg5 - this.field2242;
            int var10 = arg6 - this.field2248;
            int var11 = arg3 - this.field2248;
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if (var8 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2269[var9][var10] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2269[var9][var10] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var8 == var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var8 - 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var8 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2269[var9][var10] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2269[var9][var10] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var8 == var9 && var11 - 1 == var10) {
                        return true;
                    }
                    if (var8 - 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if (var8 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2269[var9][var10] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var8 - 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10 && (this.field2269[var9][var10] & 0x1280102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var8 - 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280108) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2269[var9][var10] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var8 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var8 == var9 && var11 + 1 == var10 && (this.field2269[var9][var10] & 0x1280120) == 0) {
                        return true;
                    }
                    if (var8 + 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x1280180) == 0) {
                        return true;
                    }
                    if (var8 == var9 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var8 == var9 && var11 + 1 == var10 && (this.field2269[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2269[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field2269[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V", line = 583)
    private final void method651(int arg0, byte arg1, int arg2, int arg3) {
        this.field2269[arg0][arg2] = class100.method756(this.field2269[arg0][arg2], arg3);
        if (arg1 != -23) {
            field2253 = false;
        }
        field2249++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[B[Lod;IIILde;III)V", line = 594)
    public static final void method652(int arg0, int arg1, byte[] arg2, class88[] arg3, int arg4, int arg5, int arg6, class24 arg7, int arg8, int arg9, int arg10) {
        if (arg10 != 1131170534) {
            return;
        }
        field2262++;
        int var11 = -1;
        class122 var12 = new class122(arg2);
        while (true) {
            int var13 = var12.method948(115);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method948(121);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var12.method943(-1025);
                int var19 = var18 >> 2;
                int var20 = var14 >> 6 & 0x3F;
                int var21 = var18 & 0x3;
                if (arg9 == var17 && var20 >= arg8 && arg8 + 8 > var20 && arg5 <= var16 && var16 < arg5 + 8) {
                    class27 var22 = class55.method440(var11, (byte) 76);
                    int var23 = class102.method765(var21, var22.field715, var22.field771, arg10 - 1131184592, var16 & 0x7, arg4, var20 & 0x7) + arg0;
                    int var24 = arg1 + class33.method271(var20 & 0x7, var22.field715, var16 & 0x7, 512, var21, var22.field771, arg4);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg6;
                        if ((class108.field2679[1][var23][var24] & 0x2) == 2) {
                            var25 = arg6 - 1;
                        }
                        class88 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg3[var25];
                        }
                        class9.method51(arg7, var11, var23, var24, arg6, (byte) 114, var19, var26, var21 + arg4 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 673)
    public final void method653(byte arg0) {
        int var2 = 0;
        int var3 = 65 % ((arg0 - 57) / 62);
        while (var2 < this.field2265) {
            for (int var4 = 0; var4 < this.field2247; var4++) {
                if (var2 == 0 || var4 == 0 || this.field2265 - 1 == var2 || this.field2247 - 1 == var4) {
                    this.field2269[var2][var4] = 16777215;
                } else {
                    this.field2269[var2][var4] = 16777216;
                }
            }
            var2++;
        }
        field2263++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 716)
    public final void method654(int arg0, int arg1, int arg2) {
        field2235++;
        int var4 = arg1 - this.field2248;
        if (arg2 != -3) {
            this.method651(-15, (byte) -113, -3, -95);
        }
        int var5 = arg0 - this.field2242;
        this.field2269[var5][var4] = class81.method605(this.field2269[var5][var4], 14680063);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIII)V", line = 735)
    public final void method655(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2258++;
        int var7 = arg3 - this.field2248;
        int var8 = arg4 - this.field2242;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method651(var8, (byte) -23, var7, 128);
                this.method651(var8 - 1, (byte) -23, var7, 8);
            }
            if (arg5 == 1) {
                this.method651(var8, (byte) -23, var7, 2);
                this.method651(var8, (byte) -23, var7 + 1, 32);
            }
            if (arg5 == 2) {
                this.method651(var8, (byte) -23, var7, 8);
                this.method651(var8 + 1, (byte) -23, var7, 128);
            }
            if (arg5 == 3) {
                this.method651(var8, (byte) -23, var7, 32);
                this.method651(var8, (byte) -23, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method651(var8, (byte) -23, var7, 1);
                this.method651(var8 - 1, (byte) -23, var7 + 1, 16);
            }
            if (arg5 == 1) {
                this.method651(var8, (byte) -23, var7, 4);
                this.method651(var8 + 1, (byte) -23, var7 + 1, 64);
            }
            if (arg5 == 2) {
                this.method651(var8, (byte) -23, var7, 16);
                this.method651(var8 + 1, (byte) -23, var7 - 1, 1);
            }
            if (arg5 == 3) {
                this.method651(var8, (byte) -23, var7, 64);
                this.method651(var8 - 1, (byte) -23, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method651(var8, (byte) -23, var7, 130);
                this.method651(var8 - 1, (byte) -23, var7, 8);
                this.method651(var8, (byte) -23, var7 + 1, 32);
            }
            if (arg5 == 1) {
                this.method651(var8, (byte) -23, var7, 10);
                this.method651(var8, (byte) -23, var7 + 1, 32);
                this.method651(var8 + 1, (byte) -23, var7, 128);
            }
            if (arg5 == 2) {
                this.method651(var8, (byte) -23, var7, 40);
                this.method651(var8 + 1, (byte) -23, var7, 128);
                this.method651(var8, (byte) -23, var7 - 1, 2);
            }
            if (arg5 == 3) {
                this.method651(var8, (byte) -23, var7, 160);
                this.method651(var8, (byte) -23, var7 - 1, 2);
                this.method651(var8 - 1, (byte) -23, var7, 8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method651(var8, (byte) -23, var7, 65536);
                    this.method651(var8 - 1, (byte) -23, var7, 4096);
                }
                if (arg5 == 1) {
                    this.method651(var8, (byte) -23, var7, 1024);
                    this.method651(var8, (byte) -23, var7 + 1, 16384);
                }
                if (arg5 == 2) {
                    this.method651(var8, (byte) -23, var7, 4096);
                    this.method651(var8 + 1, (byte) -23, var7, 65536);
                }
                if (arg5 == 3) {
                    this.method651(var8, (byte) -23, var7, 16384);
                    this.method651(var8, (byte) -23, var7 - 1, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method651(var8, (byte) -23, var7, 512);
                    this.method651(var8 - 1, (byte) -23, var7 + 1, 8192);
                }
                if (arg5 == 1) {
                    this.method651(var8, (byte) -23, var7, 2048);
                    this.method651(var8 + 1, (byte) -23, var7 + 1, 32768);
                }
                if (arg5 == 2) {
                    this.method651(var8, (byte) -23, var7, 8192);
                    this.method651(var8 + 1, (byte) -23, var7 - 1, 512);
                }
                if (arg5 == 3) {
                    this.method651(var8, (byte) -23, var7, 32768);
                    this.method651(var8 - 1, (byte) -23, var7 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method651(var8, (byte) -23, var7, 66560);
                    this.method651(var8 - 1, (byte) -23, var7, 4096);
                    this.method651(var8, (byte) -23, var7 + 1, 16384);
                }
                if (arg5 == 1) {
                    this.method651(var8, (byte) -23, var7, 5120);
                    this.method651(var8, (byte) -23, var7 + 1, 16384);
                    this.method651(var8 + 1, (byte) -23, var7, 65536);
                }
                if (arg5 == 2) {
                    this.method651(var8, (byte) -23, var7, 20480);
                    this.method651(var8 + 1, (byte) -23, var7, 65536);
                    this.method651(var8, (byte) -23, var7 - 1, 1024);
                }
                if (arg5 == 3) {
                    this.method651(var8, (byte) -23, var7, 81920);
                    this.method651(var8, (byte) -23, var7 - 1, 1024);
                    this.method651(var8 - 1, (byte) -23, var7, 4096);
                }
            }
        }
        int var9 = 13 % ((arg0 + 28) / 58);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIZIII)V", line = 941)
    public final void method656(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 16799) {
            this.method650((byte) 15, 2, -48, 16, 55, 1, -1);
        }
        int var8 = arg2 - this.field2248;
        int var9 = arg1 - this.field2242;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg6;
            arg6 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        field2244++;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < arg6 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field2265) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && this.field2247 > var13) {
                        this.method646(var11, var13, arg5 ^ 0xFFBE60, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ls;ZI)Z", line = 989)
    public static final boolean method657(class111 arg0, boolean arg1, int arg2) {
        field2237++;
        if (arg1) {
            field2273 = null;
        }
        byte[] var3 = arg0.method824(arg2, false);
        if (var3 == null) {
            return false;
        } else {
            class17.method125((byte) -115, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)Z", line = 1006)
    public final boolean method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2271++;
        int var9 = arg3 + arg5 - 1;
        int var10 = arg0 + arg6 - 1;
        if (arg5 <= arg4 && arg4 <= var9 && arg2 >= arg0 && arg2 <= var10) {
            return true;
        } else if (arg5 + arg7 == arg4 && arg2 >= arg0 && arg2 <= var10 && (this.field2269[arg4 - this.field2242][arg2 - this.field2248] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg0 <= arg2 && var10 >= arg2 && (this.field2269[arg4 - this.field2242][arg2 - this.field2248] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg2 && arg4 >= arg5 && var9 >= arg4 && (this.field2269[arg4 - this.field2242][arg2 - this.field2248] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg5 <= arg4 && arg4 <= var9 && (this.field2269[arg4 - this.field2242][arg2 - this.field2248] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 1034)
    public static final void method659(byte arg0) {
        field2270++;
        int var1 = class74.field1822 + class80.field2044.field222;
        int var2 = class80.field2044.field177 + class26.field697;
        if (arg0 > -53) {
            return;
        }
        if (class82.field2086 - var2 < -500 || class82.field2086 - var2 > 500 || class46.field1124 - var1 < -500 || class46.field1124 - var1 > 500) {
            class46.field1124 = var1;
            class82.field2086 = var2;
        }
        if (class46.field1124 != var1) {
            class46.field1124 += (var1 - class46.field1124) / 16;
        }
        if (class82.field2086 != var2) {
            class82.field2086 += (var2 - class82.field2086) / 16;
        }
        if (class92.field2353[96]) {
            class105.field2631 += (-class105.field2631 - 24) / 2;
        } else if (class92.field2353[97]) {
            class105.field2631 += (24 - class105.field2631) / 2;
        } else {
            class105.field2631 /= 2;
        }
        if (class92.field2353[98]) {
            class133.field3245 += (12 - class133.field3245) / 2;
        } else if (class92.field2353[99]) {
            class133.field3245 += (-class133.field3245 - 12) / 2;
        } else {
            class133.field3245 /= 2;
        }
        class28.field783 += class133.field3245 / 2;
        class107.field2668 = class105.field2631 / 2 + class107.field2668 & 0x7FF;
        int var3 = 0;
        int var4 = class82.field2086 >> 7;
        int var5 = class46.field1124 >> 7;
        if (class28.field783 < 128) {
            class28.field783 = 128;
        }
        if (class28.field783 > 383) {
            class28.field783 = 383;
        }
        int var6 = class25.method226(class64.field1589, class46.field1124, class82.field2086, (byte) -96);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class64.field1589;
                    if (var9 < 3 && (class108.field2679[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class41.field1049[var9][var7][var8];
                    if (var3 < var10) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (field2234 < var11) {
            field2234 += (var11 - field2234) / 24;
        } else if (var11 < field2234) {
            field2234 += (var11 - field2234) / 80;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZB)V", line = 1143)
    public final void method660(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg2 - this.field2248;
        int var8 = arg1 - this.field2242;
        if (arg5 >= -37) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method646(128, var7, 16777215, var8);
                this.method646(8, var7, 16777215, var8 - 1);
            }
            if (arg0 == 1) {
                this.method646(2, var7, 16777215, var8);
                this.method646(32, var7 + 1, 16777215, var8);
            }
            if (arg0 == 2) {
                this.method646(8, var7, 16777215, var8);
                this.method646(128, var7, 16777215, var8 + 1);
            }
            if (arg0 == 3) {
                this.method646(32, var7, 16777215, var8);
                this.method646(2, var7 - 1, 16777215, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method646(1, var7, 16777215, var8);
                this.method646(16, var7 + 1, 16777215, var8 - 1);
            }
            if (arg0 == 1) {
                this.method646(4, var7, 16777215, var8);
                this.method646(64, var7 + 1, 16777215, var8 + 1);
            }
            if (arg0 == 2) {
                this.method646(16, var7, 16777215, var8);
                this.method646(1, var7 - 1, 16777215, var8 + 1);
            }
            if (arg0 == 3) {
                this.method646(64, var7, 16777215, var8);
                this.method646(4, var7 - 1, 16777215, var8 - 1);
            }
        }
        field2254++;
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method646(130, var7, 16777215, var8);
                this.method646(8, var7, 16777215, var8 - 1);
                this.method646(32, var7 + 1, 16777215, var8);
            }
            if (arg0 == 1) {
                this.method646(10, var7, 16777215, var8);
                this.method646(32, var7 + 1, 16777215, var8);
                this.method646(128, var7, 16777215, var8 + 1);
            }
            if (arg0 == 2) {
                this.method646(40, var7, 16777215, var8);
                this.method646(128, var7, 16777215, var8 + 1);
                this.method646(2, var7 - 1, 16777215, var8);
            }
            if (arg0 == 3) {
                this.method646(160, var7, 16777215, var8);
                this.method646(2, var7 - 1, 16777215, var8);
                this.method646(8, var7, 16777215, var8 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method646(65536, var7, 16777215, var8);
                this.method646(4096, var7, 16777215, var8 - 1);
            }
            if (arg0 == 1) {
                this.method646(1024, var7, 16777215, var8);
                this.method646(16384, var7 + 1, 16777215, var8);
            }
            if (arg0 == 2) {
                this.method646(4096, var7, 16777215, var8);
                this.method646(65536, var7, 16777215, var8 + 1);
            }
            if (arg0 == 3) {
                this.method646(16384, var7, 16777215, var8);
                this.method646(1024, var7 - 1, 16777215, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method646(512, var7, 16777215, var8);
                this.method646(8192, var7 + 1, 16777215, var8 - 1);
            }
            if (arg0 == 1) {
                this.method646(2048, var7, 16777215, var8);
                this.method646(32768, var7 + 1, 16777215, var8 + 1);
            }
            if (arg0 == 2) {
                this.method646(8192, var7, 16777215, var8);
                this.method646(512, var7 - 1, 16777215, var8 + 1);
            }
            if (arg0 == 3) {
                this.method646(32768, var7, 16777215, var8);
                this.method646(2048, var7 - 1, 16777215, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method646(66560, var7, 16777215, var8);
            this.method646(4096, var7, 16777215, var8 - 1);
            this.method646(16384, var7 + 1, 16777215, var8);
        }
        if (arg0 == 1) {
            this.method646(5120, var7, 16777215, var8);
            this.method646(16384, var7 + 1, 16777215, var8);
            this.method646(65536, var7, 16777215, var8 + 1);
        }
        if (arg0 == 2) {
            this.method646(20480, var7, 16777215, var8);
            this.method646(65536, var7, 16777215, var8 + 1);
            this.method646(1024, var7 - 1, 16777215, var8);
        }
        if (arg0 == 3) {
            this.method646(81920, var7, 16777215, var8);
            this.method646(1024, var7 - 1, 16777215, var8);
            this.method646(4096, var7, 16777215, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V", line = 1383)
    public class88(int arg0, int arg1) {
        this.field2247 = arg1;
        this.field2248 = 0;
        this.field2242 = 0;
        this.field2265 = arg0;
        this.field2269 = new int[this.field2265][this.field2247];
        this.method653((byte) 119);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V", line = 1399)
    public final void method661(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2248;
        field2236++;
        int var5 = arg0 - this.field2242;
        this.field2269[var5][var4] = class100.method756(this.field2269[var5][var4], arg2);
    }
}
