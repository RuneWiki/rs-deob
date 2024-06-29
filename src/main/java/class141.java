import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class141 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
    public boolean field2253 = false;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public int field2258 = -1;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field2257 = -1;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public int field2274 = 99;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field2259 = -1;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public int field2269 = -1;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field2260 = -1;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Z")
    public boolean field2276 = false;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Z")
    public boolean field2261 = false;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public int field2278 = 5;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
    public boolean field2270 = false;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field2273 = 2;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2275 = "Started 3d Library";

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lcc;")
    public static class216 field2271 = new class216(64);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    public int[] field2252;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[I")
    public int[] field2263;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[I")
    private int[] field2272;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[Z")
    public boolean[] field2268;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[[I")
    public int[][] field2267;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public final void method1002(boolean arg0) {
        field2262++;
        if (!arg0) {
            return;
        }
        if (this.field2260 == -1) {
            if (this.field2268 == null) {
                this.field2260 = 0;
            } else {
                this.field2260 = 2;
            }
        }
        if (this.field2259 != -1) {
            return;
        }
        if (this.field2268 == null) {
            this.field2259 = 0;
        } else {
            this.field2259 = 2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILv;)V")
    private final void method1003(byte arg0, int arg1, class152 arg2) {
        if (arg1 == 1) {
            int var13 = arg2.method1126(false);
            this.field2263 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2263[var14] = arg2.method1126(false);
            }
            this.field2252 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2252[var15] = arg2.method1126(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2252[var16] = (arg2.method1126(false) << 16) + this.field2252[var16];
            }
        } else if (arg1 == 2) {
            this.field2269 = arg2.method1126(false);
        } else if (arg1 == 3) {
            this.field2268 = new boolean[256];
            int var4 = arg2.method1111(255);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2268[arg2.method1111(255)] = true;
            }
        } else if (arg1 == 4) {
            this.field2270 = true;
        } else if (arg1 == 5) {
            this.field2278 = arg2.method1111(255);
        } else if (arg1 == 6) {
            this.field2257 = arg2.method1126(false);
        } else if (arg1 == 7) {
            this.field2258 = arg2.method1126(false);
        } else if (arg1 == 8) {
            this.field2274 = arg2.method1111(255);
        } else if (arg1 == 9) {
            this.field2260 = arg2.method1111(255);
        } else if (arg1 == 10) {
            this.field2259 = arg2.method1111(255);
        } else if (arg1 == 11) {
            this.field2273 = arg2.method1111(255);
        } else if (arg1 == 12) {
            int var10 = arg2.method1111(255);
            this.field2272 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2272[var11] = arg2.method1126(false);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2272[var12] += arg2.method1126(false) << 16;
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method1126(false);
            this.field2267 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1111(255);
                if (var8 > 0) {
                    this.field2267[var7] = new int[var8];
                    this.field2267[var7][0] = arg2.method1128((byte) -123);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field2267[var7][var9] = arg2.method1126(false);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2276 = true;
        } else if (arg1 == 15) {
            this.field2253 = true;
        } else if (arg1 == 16) {
            this.field2261 = true;
        }
        field2264++;
        int var17 = -52 % ((-arg0 - 24) / 52);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILpc;I)Lpc;")
    public final class22 method1004(int arg0, int arg1, int arg2, class22 arg3, int arg4) {
        field2254++;
        int var6 = this.field2252[arg0];
        int var7 = this.field2263[arg0];
        class165 var8 = class81.method594(var6 >> 16, arg2);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg3.method145(true, true, true);
        }
        class165 var10 = null;
        class165 var11 = null;
        int var12 = 0;
        class165 var13 = null;
        int var14 = 0;
        if ((this.field2253 || class217.field3444) && arg4 != -1 && arg4 < this.field2252.length) {
            int var15 = this.field2252[arg4];
            var13 = class81.method594(var15 >> 16, 3);
            arg4 = var15 & 0xFFFF;
        }
        if (this.field2272 != null) {
            if (arg0 < this.field2272.length) {
                var12 = this.field2272[arg0];
                if (var12 != 65535) {
                    var11 = class81.method594(var12 >> 16, 3);
                    var12 &= 0xFFFF;
                }
            }
            if ((this.field2253 || class217.field3444) && arg4 != -1 && arg4 < this.field2272.length) {
                var14 = this.field2272[arg4];
                if (var14 != 65535) {
                    var10 = class81.method594(var14 >> 16, 3);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1218((byte) 103, var9);
        boolean var17 = !var8.method1220((byte) 45, var9);
        if (var11 != null) {
            var16 &= !var11.method1218((byte) 98, var12);
            var17 &= !var11.method1220((byte) -125, var12);
        }
        if (var13 != null) {
            var16 &= !var13.method1218((byte) 102, arg4);
            var17 &= !var13.method1220((byte) -126, arg4);
        }
        if (var10 != null) {
            var16 &= !var10.method1218((byte) 84, var14);
            var17 &= !var10.method1220((byte) 11, var14);
        }
        class22 var18 = arg3.method145(var16, var17, !this.field2276);
        var18.method139(var8, var9, var13, arg4, arg1 - 1, var7, this.field2276);
        if (var11 != null) {
            var18.method139(var11, var12, var10, var14, arg1 - 1, var7, this.field2276);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILpc;III)Lpc;")
    public final class22 method1005(int arg0, class22 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2263[arg4];
        int var7 = this.field2252[arg4];
        field2255++;
        class165 var8 = class81.method594(var7 >> 16, 3);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method158(true, true, true);
        }
        if (arg0 <= 55) {
            this.method1005(106, (class22) null, 96, -65, 67);
        }
        class165 var10 = null;
        if ((this.field2253 || class217.field3444) && arg3 != -1 && this.field2252.length > arg3) {
            int var11 = this.field2252[arg3];
            var10 = class81.method594(var11 >> 16, 3);
            arg3 = var11 & 0xFFFF;
        }
        class22 var12;
        if (var10 == null) {
            var12 = arg1.method158(!var8.method1218((byte) 117, var9), !var8.method1220((byte) 116, var9), !this.field2276);
        } else {
            var12 = arg1.method158(!var8.method1218((byte) 112, var9) & !var10.method1218((byte) 77, arg3), !var8.method1220((byte) -126, var9) & !var10.method1220((byte) 114, arg3), !this.field2276);
        }
        var12.method139(var8, var9, var10, arg3, arg2 - 1, var6, this.field2276);
        return var12;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLv;)V")
    public final void method1006(byte arg0, class152 arg1) {
        field2277++;
        while (true) {
            int var3 = arg1.method1111(arg0 + 216);
            if (var3 == 0) {
                if (arg0 == 39) {
                    return;
                } else {
                    this.field2278 = -31;
                    return;
                }
            }
            this.method1003((byte) 57, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILpc;III)Lpc;")
    public final class22 method1007(int arg0, int arg1, class22 arg2, int arg3, int arg4, int arg5) {
        field2266++;
        int var7 = this.field2263[arg0];
        int var8 = this.field2252[arg0];
        class165 var9 = class81.method594(var8 >> 16, 3);
        int var10 = var8 & arg5;
        if (var9 == null) {
            return arg2.method155(true, true, true);
        }
        class165 var11 = null;
        if ((this.field2253 || class217.field3444) && arg4 != -1 && arg4 < this.field2252.length) {
            int var12 = this.field2252[arg4];
            var11 = class81.method594(var12 >> 16, arg5 - 65532);
            arg4 = var12 & 0xFFFF;
        }
        int var13 = arg3 & 0x3;
        class22 var14;
        if (var11 == null) {
            var14 = arg2.method155(!var9.method1218((byte) 126, var10), !var9.method1220((byte) 89, var10), !this.field2276);
        } else {
            var14 = arg2.method155(!var9.method1218((byte) 108, var10) & !var11.method1218((byte) 77, arg4), !var9.method1220((byte) 6, var10) & !var11.method1220((byte) -10, arg4), !this.field2276);
        }
        if (var13 == 1) {
            var14.method160();
        } else if (var13 == 2) {
            var14.method143();
        } else if (var13 == 3) {
            var14.method157();
        }
        var14.method139(var9, var10, var11, arg4, arg1 - 1, var7, this.field2276);
        if (var13 == 1) {
            var14.method157();
        } else if (var13 == 2) {
            var14.method143();
        } else if (var13 == 3) {
            var14.method160();
        }
        return var14;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        field2275 = null;
        field2271 = null;
        if (arg0 < 107) {
            method1008((byte) 57);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(SI)Z")
    public static final boolean method1009(short arg0, int arg1) {
        field2279++;
        if (arg0 == 40 || arg0 == 3 || arg0 == 60 || arg0 == 24 || arg0 == 29 || arg0 == 2 || arg0 == 13 || arg0 == 38) {
            return true;
        } else if (arg0 == 25 || arg0 == 39 || arg0 == 1005 || arg0 == 1004) {
            return true;
        } else if (arg0 == 32 || arg0 == 11 || arg0 == 46 || arg0 == 5 || arg0 == 12) {
            return true;
        } else if (arg0 == 51 || arg0 == 19 || arg0 == 10 || arg0 == 18 || arg0 == 44 || arg0 == 8) {
            return true;
        } else if (arg1 == -4) {
            return false;
        } else {
            return false;
        }
    }
}
