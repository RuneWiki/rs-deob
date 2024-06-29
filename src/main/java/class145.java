import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class145 {

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public int field2364 = 0;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Z")
    public boolean field2362 = false;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Z")
    public boolean field2357 = false;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public int field2371 = 5;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public int field2368 = -1;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public int field2367 = 2;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Z")
    public boolean field2358 = false;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public int field2365 = -1;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public int field2376 = -1;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public int field2372 = -1;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field2378 = 99;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field2366 = -1;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Ltl;")
    public class91 field2373;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "[I")
    private int[] field2374;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "[I")
    public int[] field2375;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "[I")
    public int[] field2377;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[Z")
    public boolean[] field2356;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[[I")
    public int[][] field2359;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZII)I")
    public final int method1053(int arg0, boolean arg1, int arg2, int arg3) {
        field2355++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2377[arg3];
        class48 var8 = null;
        class48 var9 = this.field2373.method637(var7 >> 16, false);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2358 || class230.field4004) && arg2 != -1 && arg2 < this.field2377.length) {
            int var11 = this.field2377[arg2];
            var8 = this.field2373.method637(var11 >> 16, false);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2362) {
            var5 |= 0x200;
        }
        if (var9.method340(arg0 - 1026, var10)) {
            var5 |= 0x80;
        }
        if (arg0 != 1024) {
            this.field2361 = -83;
        }
        if (var9.method346(false, var10)) {
            var5 |= 0x100;
        }
        if (var9.method348(arg0 - 942, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method340(-2, var6)) {
                var5 |= 0x80;
            }
            if (var8.method346(false, var6)) {
                var5 |= 0x100;
            }
            if (var8.method348(82, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field2374 != null && arg1) {
            if (this.field2374.length > arg3) {
                int var12 = this.field2374[arg3];
                if (var12 != 65535) {
                    class48 var13 = this.field2373.method637(var12 >> 16, false);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method340(-2, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method346(false, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method348(arg0 - 942, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2358 || class230.field4004) && arg2 != -1 && arg2 < this.field2374.length) {
                int var15 = this.field2374[arg2];
                if (var15 != 65535) {
                    class48 var16 = this.field2373.method637(var15 >> 16, false);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method340(-2, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method346(false, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method348(82, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILia;)V")
    public final void method1054(int arg0, class23 arg1) {
        field2369++;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            int var3 = arg1.method126((byte) -77);
            if (var3 == 0) {
                return;
            }
            this.method1057(arg1, -111, var3);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method1055(byte arg0) {
        field2353++;
        if (this.field2365 == -1) {
            if (this.field2356 == null) {
                this.field2365 = 0;
            } else {
                this.field2365 = 2;
            }
        }
        if (this.field2366 == -1) {
            if (this.field2356 == null) {
                this.field2366 = 0;
            } else {
                this.field2366 = 2;
            }
        }
        if (arg0 < 30) {
            this.field2359 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lhd;")
    public static final class239 method1056(byte arg0) {
        class221.field3807 = 0;
        field2363++;
        return arg0 == 108 ? class403.method2499(arg0 - 109) : null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lia;II)V")
    private final void method1057(class23 arg0, int arg1, int arg2) {
        if (arg1 > -108) {
            method1056((byte) 25);
        }
        if (arg2 == 1) {
            int var4 = arg0.method132(106);
            this.field2375 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2375[var5] = arg0.method132(86);
            }
            this.field2377 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2377[var6] = arg0.method132(103);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2377[var7] = (arg0.method132(115) << 16) + this.field2377[var7];
            }
        } else if (arg2 == 2) {
            this.field2372 = arg0.method132(44);
        } else if (arg2 == 3) {
            this.field2356 = new boolean[256];
            int var15 = arg0.method126((byte) -89);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2356[arg0.method126((byte) -128)] = true;
            }
        } else if (arg2 == 5) {
            this.field2371 = arg0.method126((byte) -77);
        } else if (arg2 == 6) {
            this.field2368 = arg0.method132(118);
        } else if (arg2 == 7) {
            this.field2376 = arg0.method132(106);
        } else if (arg2 == 8) {
            this.field2378 = arg0.method126((byte) -78);
        } else if (arg2 == 9) {
            this.field2366 = arg0.method126((byte) -91);
        } else if (arg2 == 10) {
            this.field2365 = arg0.method126((byte) -81);
        } else if (arg2 == 11) {
            this.field2367 = arg0.method126((byte) -117);
        } else if (arg2 == 12) {
            int var8 = arg0.method126((byte) -74);
            this.field2374 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2374[var9] = arg0.method132(54);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2374[var10] = (arg0.method132(127) << 16) + this.field2374[var10];
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method132(73);
            this.field2359 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method126((byte) -92);
                if (var13 > 0) {
                    this.field2359[var12] = new int[var13];
                    this.field2359[var12][0] = arg0.method181(-10);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field2359[var12][var14] = arg0.method132(119);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2362 = true;
        } else if (arg2 == 15) {
            this.field2358 = true;
        } else if (arg2 == 16) {
            this.field2357 = true;
        } else if (arg2 == 17) {
            this.field2364 = arg0.method126((byte) -100);
        }
        field2370++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Le;IIIIBBI)Le;")
    public final class530 method1058(class530 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte arg6, int arg7) {
        field2360++;
        if (arg5 != 65) {
            this.method1059(62, 111, null, -46, -97, 64);
        }
        int var9 = this.field2375[arg2];
        int var10 = this.field2377[arg2];
        class48 var11 = this.field2373.method637(var10 >> 16, false);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg0.method739(arg6, arg7, true);
        }
        class48 var13 = null;
        if ((this.field2358 || class230.field4004) && arg1 != -1 && arg1 < this.field2377.length) {
            int var14 = this.field2377[arg1];
            var13 = this.field2373.method637(var14 >> 16, false);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field2362) {
            arg7 |= 0x200;
        }
        if (var11.method340(-2, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method346(false, var12)) {
            arg7 |= 0x100;
        }
        if (var11.method348(82, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method340(arg5 - 67, arg1)) {
                arg7 |= 0x80;
            }
            if (var13.method346(false, arg1)) {
                arg7 |= 0x100;
            }
            if (var13.method348(82, arg1)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class530 var16 = arg0.method739(arg6, var15, true);
        var16.method3138(var11, var9, var12, arg1, this.field2362, var13, arg3, 0, arg4 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILe;III)Le;")
    public final class530 method1059(int arg0, int arg1, class530 arg2, int arg3, int arg4, int arg5) {
        field2354++;
        int var7 = this.field2375[arg3];
        int var8 = this.field2377[arg3];
        class48 var9 = this.field2373.method637(var8 >> 16, false);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method739((byte) 1, arg4, true);
        }
        class48 var11 = null;
        if ((this.field2358 || class230.field4004) && arg0 != -1 && this.field2377.length > arg0) {
            int var12 = this.field2377[arg0];
            var11 = this.field2373.method637(var12 >> 16, false);
            arg0 = var12 & 0xFFFF;
        }
        class48 var13 = null;
        class48 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2374 != null) {
            if (this.field2374.length > arg3) {
                var15 = this.field2374[arg3];
                if (var15 != 65535) {
                    var13 = this.field2373.method637(var15 >> 16, false);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2358 || class230.field4004) && arg0 != -1 && arg0 < this.field2374.length) {
                var16 = this.field2374[arg0];
                if (var16 != 65535) {
                    var14 = this.field2373.method637(var16 >> 16, false);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2362) {
            arg4 |= 0x200;
        }
        if (arg5 != 256) {
            return null;
        }
        if (var9.method340(-2, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method346(false, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method348(arg5 ^ 0x152, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method340(arg5 ^ 0xFFFFFEFE, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method346(false, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method348(82, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method340(-2, arg0)) {
                arg4 |= 0x80;
            }
            if (var11.method346(false, arg0)) {
                arg4 |= 0x100;
            }
            if (var11.method348(82, arg0)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method340(-2, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method346(false, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method348(arg5 ^ 0x152, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class530 var18 = arg2.method739((byte) 1, var17, true);
        var18.method3138(var9, var7, var10, arg0, this.field2362, var11, 0, 0, arg1 - 1);
        if (var13 != null) {
            var18.method3138(var13, var7, var15, var16, this.field2362, var14, 0, 0, arg1 - 1);
        }
        return var18;
    }
}
