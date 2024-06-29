import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class144 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[[I")
    public int[][] field2272;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2265 = "cyan:";

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Lsb;")
    public static class110 field2276 = new class110(16);

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2284 = null;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Leh;")
    public static class137 field2283;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "[I")
    public static int[] field2285;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIZ[Loj;[B)V")
    public static final void method995(int arg0, int arg1, int arg2, boolean arg3, class144[] arg4, byte[] arg5) {
        field2280++;
        int var6 = -1;
        class96 var7 = new class96(arg5);
        while (true) {
            int var8 = var7.method592(119);
            if (var8 == 0) {
                if (arg0 != 2) {
                    method1003(89, 41, 60, 116, (class264) null, (class264) null, -63, -80, 86, 89, -103L);
                    return;
                }
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method539(arg0 - 401085594);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFFE) >> 6;
                int var13 = var7.method584(255);
                int var14 = var13 >> 2;
                int var15 = var9 >> 12;
                int var16 = var13 & 0x3;
                int var17 = arg1 + var11;
                int var18 = arg2 + var12;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class144 var19 = null;
                    if (!arg3) {
                        int var20 = var15;
                        if ((class117.field1664[1][var18][var17] & 0x2) == 2) {
                            var20 = var15 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class234.method1659(var19, var14, var6, !arg3, var18, var16, var15, var17, var15, arg3, arg0 + 28775);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Leh;Leh;I)V")
    public static final void method996(class137 arg0, class137 arg1, int arg2) {
        class27.field363 = arg1;
        if (arg2 != 2883968) {
            field2276 = null;
        }
        class82.field1020 = arg0;
        field2287++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final void method997(int arg0, int arg1, int arg2) {
        if (arg2 <= 115) {
            field2285 = null;
        }
        int var4 = arg1 - this.field2281;
        int var5 = arg0 - this.field2277;
        this.field2272[var4][var5] = class173.method1186(this.field2272[var4][var5], -262145);
        field2278++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
    private final void method998(int arg0, int arg1, int arg2, int arg3) {
        this.field2272[arg1][arg0] = class154.method1048(this.field2272[arg1][arg0], arg2);
        field2270++;
        if (arg3 != 5686) {
            this.field2264 = 51;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBIZIII)V")
    public final void method999(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2263++;
        int var8 = arg2 - this.field2277;
        int var9 = arg5 - this.field2281;
        int var10 = 256;
        if (arg3) {
            var10 |= 0x20000;
        }
        if (arg0) {
            var10 |= 0x40000000;
        }
        if (arg1 <= 121) {
            return;
        }
        for (int var11 = var9; var11 < arg6 + var9; var11++) {
            if (var11 >= 0 && this.field2271 > var11) {
                for (int var12 = var8; var12 < (arg4 + var8); var12++) {
                    if (var12 >= 0 && this.field2264 > var12) {
                        this.method998(var12, var11, var10, 5686);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1000(byte arg0) {
        field2283 = null;
        field2284 = null;
        field2265 = null;
        field2276 = null;
        int var1 = 52 / ((-arg0 - 39) / 53);
        field2285 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIBIZZI)V")
    public final void method1001(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        int var9 = arg1 - this.field2281;
        field2268++;
        int var10 = 256;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg4;
            arg4 = arg0;
            arg0 = var11;
        }
        int var12 = arg7 - this.field2277;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg5) {
            var10 |= 0x40000000;
        }
        if (arg3 != -48) {
            field2286 = 4;
        }
        for (int var13 = var9; var13 < (arg4 + var9); var13++) {
            if (var13 >= 0 && var13 < this.field2271) {
                for (int var14 = var12; var14 < (arg0 + var12); var14++) {
                    if (var14 >= 0 && this.field2264 > var14) {
                        this.method1006(var13, var14, var10, arg3 ^ 0x4D);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V")
    public final void method1002(int arg0, int arg1, int arg2) {
        field2274++;
        int var4 = arg1 - this.field2281;
        int var5 = 103 / ((-arg2 - 28) / 37);
        int var6 = arg0 - this.field2277;
        this.field2272[var4][var6] = class154.method1048(this.field2272[var4][var6], 2097152);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILpb;Lpb;IIIIJ)V")
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, class264 arg4, class264 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class128 var12 = new class128();
        var12.field2051 = arg10;
        var12.field2058 = arg1 * 128 + 64;
        var12.field2050 = arg2 * 128 + 64;
        var12.field2046 = arg3;
        var12.field2043 = arg4;
        var12.field2061 = arg5;
        var12.field2049 = arg6;
        var12.field2056 = arg7;
        var12.field2053 = arg8;
        var12.field2047 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class46.field585[var13][arg1][arg2] == null) {
                class46.field585[var13][arg1][arg2] = new class246(var13, arg1, arg2);
            }
        }
        class46.field585[arg0][arg1][arg2].field4054 = var12;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZZIIIII)V")
    public final void method1004(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field2277;
        field2275++;
        int var9 = arg4 - this.field2281;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method1006(var9, var8, 128, 73);
                this.method1006(var9 - 1, var8, 8, -77);
            }
            if (arg6 == 1) {
                this.method1006(var9, var8, 2, 55);
                this.method1006(var9, var8 + 1, 32, 11);
            }
            if (arg6 == 2) {
                this.method1006(var9, var8, 8, -127);
                this.method1006(var9 + 1, var8, 128, 23);
            }
            if (arg6 == 3) {
                this.method1006(var9, var8, 32, -68);
                this.method1006(var9, var8 - 1, 2, -75);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method1006(var9, var8, 1, -79);
                this.method1006(var9 - 1, var8 + 1, 16, 108);
            }
            if (arg6 == 1) {
                this.method1006(var9, var8, 4, 16);
                this.method1006(var9 + 1, var8 - -1, 64, -102);
            }
            if (arg6 == 2) {
                this.method1006(var9, var8, 16, -116);
                this.method1006(var9 + 1, var8 + -1, 1, -113);
            }
            if (arg6 == 3) {
                this.method1006(var9, var8, 64, -102);
                this.method1006(var9 - 1, var8 + -1, 4, -126);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method1006(var9, var8, 130, -116);
                this.method1006(var9 - 1, var8, 8, -66);
                this.method1006(var9, var8 + 1, 32, -77);
            }
            if (arg6 == 1) {
                this.method1006(var9, var8, 10, -97);
                this.method1006(var9, var8 + 1, 32, 43);
                this.method1006(var9 + 1, var8, 128, 49);
            }
            if (arg6 == 2) {
                this.method1006(var9, var8, 40, 37);
                this.method1006(var9 + 1, var8, 128, -120);
                this.method1006(var9, var8 - 1, 2, 55);
            }
            if (arg6 == 3) {
                this.method1006(var9, var8, 160, -116);
                this.method1006(var9, var8 - 1, 2, 63);
                this.method1006(var9 - 1, var8, 8, -122);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 65536, -98);
                    this.method1006(var9 - 1, var8, 4096, -103);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 1024, -109);
                    this.method1006(var9, var8 + 1, 16384, 125);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 4096, 22);
                    this.method1006(var9 + 1, var8, 65536, -90);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 16384, -112);
                    this.method1006(var9, var8 - 1, 1024, 106);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 512, -100);
                    this.method1006(var9 - 1, var8 + 1, 8192, -105);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 2048, -124);
                    this.method1006(var9 + 1, var8 + 1, 32768, -118);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 8192, -111);
                    this.method1006(var9 + 1, var8 + -1, 512, 33);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 32768, 16);
                    this.method1006(var9 - 1, var8 + -1, 2048, -121);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 66560, 69);
                    this.method1006(var9 - 1, var8, 4096, 125);
                    this.method1006(var9, var8 + 1, 16384, 101);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 5120, -116);
                    this.method1006(var9, var8 + 1, 16384, -88);
                    this.method1006(var9 + 1, var8, 65536, 42);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 20480, -111);
                    this.method1006(var9 + 1, var8, 65536, -89);
                    this.method1006(var9, var8 - 1, 1024, -118);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 81920, -94);
                    this.method1006(var9, var8 - 1, 1024, 34);
                    this.method1006(var9 - 1, var8, 4096, 61);
                }
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 536870912, -94);
                    this.method1006(var9 - 1, var8, 33554432, 9);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 8388608, -68);
                    this.method1006(var9, var8 + 1, 134217728, -76);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 33554432, -81);
                    this.method1006(var9 + 1, var8, 536870912, 87);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 134217728, 61);
                    this.method1006(var9, var8 - 1, 8388608, -96);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 4194304, -71);
                    this.method1006(var9 - 1, var8 + 1, 67108864, 41);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 16777216, 94);
                    this.method1006(var9 + 1, var8 + 1, 268435456, -108);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 67108864, -105);
                    this.method1006(var9 + 1, var8 + -1, 4194304, 37);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 268435456, 49);
                    this.method1006(var9 - 1, var8 + -1, 16777216, 87);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method1006(var9, var8, 545259520, -86);
                    this.method1006(var9 - 1, var8, 33554432, -70);
                    this.method1006(var9, var8 + 1, 134217728, 59);
                }
                if (arg6 == 1) {
                    this.method1006(var9, var8, 41943040, 48);
                    this.method1006(var9, var8 + 1, 134217728, 34);
                    this.method1006(var9 + 1, var8, 536870912, -73);
                }
                if (arg6 == 2) {
                    this.method1006(var9, var8, 167772160, 25);
                    this.method1006(var9 + 1, var8, 536870912, -97);
                    this.method1006(var9, var8 - 1, 8388608, -83);
                }
                if (arg6 == 3) {
                    this.method1006(var9, var8, 671088640, 109);
                    this.method1006(var9, var8 - 1, 8388608, -92);
                    this.method1006(var9 - 1, var8, 33554432, 78);
                }
            }
        }
        int var10 = -13 / ((arg3 - 53) / 58);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)V")
    public final void method1005(int arg0, int arg1, byte arg2) {
        field2266++;
        int var4 = arg1 - this.field2281;
        int var5 = -36 % ((arg2 - 34) / 62);
        int var6 = arg0 - this.field2277;
        this.field2272[var4][var6] = class154.method1048(this.field2272[var4][var6], 262144);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIII)V")
    private final void method1006(int arg0, int arg1, int arg2, int arg3) {
        field2267++;
        this.field2272[arg0][arg1] = class173.method1186(this.field2272[arg0][arg1], ~arg2);
        int var5 = 117 / ((arg3 + 31) / 34);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method1007(boolean arg0) {
        field2282++;
        int var1 = class181.field2887;
        int var2 = class228.field3647;
        int var3 = class83.field1033 - (class292.field4640 + var2);
        int var4 = class137.field2161 - class283.field4517 - var1;
        if (var1 > 0 || var4 > 0 || var2 > 0 || var3 > 0) {
            try {
                Container var5;
                if (class46.field586 != null) {
                    var5 = class46.field586;
                } else if (class41.field517 == null) {
                    var5 = class194.field3107.field609;
                } else {
                    var5 = class41.field517;
                }
                int var6 = 0;
                int var7 = 0;
                if (class41.field517 == var5) {
                    Insets var8 = class41.field517.getInsets();
                    var7 = var8.left;
                    var6 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var7, var6, var1, class83.field1033);
                }
                if (var2 > 0) {
                    var9.fillRect(var7, var6, class137.field2161, var2);
                }
                if (var4 > 0) {
                    var9.fillRect(var7 + class137.field2161 - var4, var6, var4, class83.field1033);
                }
                if (var3 > 0) {
                    var9.fillRect(var7, var6 - (var3 - class83.field1033), class137.field2161, var3);
                }
            } catch (Exception var10) {
            }
        }
        if (!arg0) {
            field2284 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        if (class28.field400 != null) {
            class28.field400.method1210(-1);
            class28.field400 = null;
        }
        class101.method616((byte) 59);
        class196.method1377();
        for (int var1 = 0; var1 < 4; var1++) {
            class187.field2975[var1].method1009(100);
        }
        field2269++;
        class5.method31(false, -80);
        System.gc();
        if (arg0 != -8905) {
            method996((class137) null, (class137) null, 63);
        }
        class152.method1040(3389, 2);
        class171.field2714 = -1;
        class271.field4335 = false;
        class161.method1121(true, arg0 ^ 0x22C8);
        class167.field2683 = 0;
        class83.field1030 = 0;
        class102.field1376 = false;
        class118.field1674 = 0;
        class181.field2883 = 0;
        for (int var2 = 0; var2 < class134.field2111.length; var2++) {
            class134.field2111[var2] = null;
        }
        class77.field970 = 0;
        class134.field2122 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class89.field1113[var3] = null;
            class110.field1568[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class265.field4273[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class206.field3296[var5][var6][var7] = null;
                }
            }
        }
        class269.method1811(-1886318102);
        class242.field3987 = 0;
        class127.method865((byte) 107);
        class183.method1270(true, (byte) 48);
        try {
            class277.method1848(class194.field3107.field609, 2795, "loggedout");
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method1009(int arg0) {
        for (int var2 = 0; var2 < this.field2271; var2++) {
            for (int var3 = 0; var3 < this.field2264; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2271 - 5 <= var2 || var3 >= this.field2264 - 5) {
                    this.field2272[var2][var3] = 16777215;
                } else {
                    this.field2272[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 < 62) {
            this.method1004(true, true, 36, 85, -34, -13, 95);
        }
        field2279++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIZIIII)V")
    public final void method1010(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field2281;
        int var9 = arg4 - this.field2277;
        field2273++;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method998(var9, var8, 128, 5686);
                this.method998(var9, var8 - 1, 8, 5686);
            }
            if (arg5 == 1) {
                this.method998(var9, var8, 2, 5686);
                this.method998(var9 + 1, var8, 32, 5686);
            }
            if (arg5 == 2) {
                this.method998(var9, var8, 8, 5686);
                this.method998(var9, var8 + 1, 128, 5686);
            }
            if (arg5 == 3) {
                this.method998(var9, var8, 32, 5686);
                this.method998(var9 - 1, var8, 2, 5686);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method998(var9, var8, 1, 5686);
                this.method998(var9 + 1, var8 - 1, 16, 5686);
            }
            if (arg5 == 1) {
                this.method998(var9, var8, 4, 5686);
                this.method998(var9 + 1, var8 + 1, 64, 5686);
            }
            if (arg5 == 2) {
                this.method998(var9, var8, 16, 5686);
                this.method998(var9 - 1, var8 + 1, 1, 5686);
            }
            if (arg5 == 3) {
                this.method998(var9, var8, 64, 5686);
                this.method998(var9 - 1, var8 + -1, 4, 5686);
            }
        }
        int var10 = 3 % ((-arg1 - 88) / 32);
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method998(var9, var8, 130, 5686);
                this.method998(var9, var8 - 1, 8, 5686);
                this.method998(var9 + 1, var8, 32, 5686);
            }
            if (arg5 == 1) {
                this.method998(var9, var8, 10, 5686);
                this.method998(var9 + 1, var8, 32, 5686);
                this.method998(var9, var8 + 1, 128, 5686);
            }
            if (arg5 == 2) {
                this.method998(var9, var8, 40, 5686);
                this.method998(var9, var8 + 1, 128, 5686);
                this.method998(var9 - 1, var8, 2, 5686);
            }
            if (arg5 == 3) {
                this.method998(var9, var8, 160, 5686);
                this.method998(var9 - 1, var8, 2, 5686);
                this.method998(var9, var8 - 1, 8, 5686);
            }
        }
        if (arg2) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method998(var9, var8, 65536, 5686);
                    this.method998(var9, var8 - 1, 4096, 5686);
                }
                if (arg5 == 1) {
                    this.method998(var9, var8, 1024, 5686);
                    this.method998(var9 + 1, var8, 16384, 5686);
                }
                if (arg5 == 2) {
                    this.method998(var9, var8, 4096, 5686);
                    this.method998(var9, var8 + 1, 65536, 5686);
                }
                if (arg5 == 3) {
                    this.method998(var9, var8, 16384, 5686);
                    this.method998(var9 - 1, var8, 1024, 5686);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method998(var9, var8, 512, 5686);
                    this.method998(var9 + 1, var8 + -1, 8192, 5686);
                }
                if (arg5 == 1) {
                    this.method998(var9, var8, 2048, 5686);
                    this.method998(var9 + 1, var8 + 1, 32768, 5686);
                }
                if (arg5 == 2) {
                    this.method998(var9, var8, 8192, 5686);
                    this.method998(var9 - 1, var8 - -1, 512, 5686);
                }
                if (arg5 == 3) {
                    this.method998(var9, var8, 32768, 5686);
                    this.method998(var9 - 1, var8 - 1, 2048, 5686);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method998(var9, var8, 66560, 5686);
                    this.method998(var9, var8 - 1, 4096, 5686);
                    this.method998(var9 + 1, var8, 16384, 5686);
                }
                if (arg5 == 1) {
                    this.method998(var9, var8, 5120, 5686);
                    this.method998(var9 + 1, var8, 16384, 5686);
                    this.method998(var9, var8 + 1, 65536, 5686);
                }
                if (arg5 == 2) {
                    this.method998(var9, var8, 20480, 5686);
                    this.method998(var9, var8 + 1, 65536, 5686);
                    this.method998(var9 - 1, var8, 1024, 5686);
                }
                if (arg5 == 3) {
                    this.method998(var9, var8, 81920, 5686);
                    this.method998(var9 - 1, var8, 1024, 5686);
                    this.method998(var9, var8 - 1, 4096, 5686);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method998(var9, var8, 536870912, 5686);
                this.method998(var9, var8 - 1, 33554432, 5686);
            }
            if (arg5 == 1) {
                this.method998(var9, var8, 8388608, 5686);
                this.method998(var9 + 1, var8, 134217728, 5686);
            }
            if (arg5 == 2) {
                this.method998(var9, var8, 33554432, 5686);
                this.method998(var9, var8 + 1, 536870912, 5686);
            }
            if (arg5 == 3) {
                this.method998(var9, var8, 134217728, 5686);
                this.method998(var9 - 1, var8, 8388608, 5686);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method998(var9, var8, 4194304, 5686);
                this.method998(var9 + 1, var8 + -1, 67108864, 5686);
            }
            if (arg5 == 1) {
                this.method998(var9, var8, 16777216, 5686);
                this.method998(var9 + 1, var8 + 1, 268435456, 5686);
            }
            if (arg5 == 2) {
                this.method998(var9, var8, 67108864, 5686);
                this.method998(var9 - 1, var8 + 1, 4194304, 5686);
            }
            if (arg5 == 3) {
                this.method998(var9, var8, 268435456, 5686);
                this.method998(var9 - 1, var8 - 1, 16777216, 5686);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method998(var9, var8, 545259520, 5686);
            this.method998(var9, var8 - 1, 33554432, 5686);
            this.method998(var9 + 1, var8, 134217728, 5686);
        }
        if (arg5 == 1) {
            this.method998(var9, var8, 41943040, 5686);
            this.method998(var9 + 1, var8, 134217728, 5686);
            this.method998(var9, var8 + 1, 536870912, 5686);
        }
        if (arg5 == 2) {
            this.method998(var9, var8, 167772160, 5686);
            this.method998(var9, var8 + 1, 536870912, 5686);
            this.method998(var9 - 1, var8, 8388608, 5686);
        }
        if (arg5 == 3) {
            this.method998(var9, var8, 671088640, 5686);
            this.method998(var9 - 1, var8, 8388608, 5686);
            this.method998(var9, var8 - 1, 33554432, 5686);
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(II)V")
    public class144(int arg0, int arg1) {
        this.field2264 = arg1;
        this.field2271 = arg0;
        this.field2272 = new int[this.field2271][this.field2264];
        this.field2281 = 0;
        this.field2277 = 0;
        this.method1009(86);
    }
}
