import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class439 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
    public boolean field6395 = false;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field6393 = 99;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public int field6402 = -1;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public int field6396 = 2;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public int field6405 = -1;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field6389 = -1;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public int field6404 = 0;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field6409 = -1;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public int field6407 = -1;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
    public boolean field6410 = false;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public int field6408 = 5;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Z")
    public boolean field6415 = false;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field6391 = -1;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public int field6390;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Leca;")
    public class378 field6411;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
    private int[] field6397;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
    public int[] field6413;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "[I")
    public int[] field6416;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[Z")
    public boolean[] field6412;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[[I")
    public int[][] field6400;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lr;IIBII)Lr;")
    public final class519 method2593(class519 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6392++;
        int var7 = this.field6413[arg2];
        int var8 = this.field6416[arg2];
        class285 var9 = this.field6411.method2298(-91, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method765((byte) 1, arg5, true);
        }
        class285 var11 = null;
        if ((this.field6395 || class429.field6257) && arg4 != -1 && this.field6416.length > arg4) {
            int var12 = this.field6416[arg4];
            var11 = this.field6411.method2298(arg3 ^ 0xFFFFFFEE, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        class285 var13 = null;
        class285 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6397 != null) {
            if (this.field6397.length > arg2) {
                var15 = this.field6397[arg2];
                if (var15 != 65535) {
                    var13 = this.field6411.method2298(-82, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6395 || class429.field6257) && arg4 != -1 && arg4 < this.field6397.length) {
                var16 = this.field6397[arg4];
                if (var16 != 65535) {
                    var14 = this.field6411.method2298(-116, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6415) {
            arg5 |= 0x200;
        }
        if (arg3 != 115) {
            return null;
        }
        if (var9.method1810(var10, (byte) -99)) {
            arg5 |= 0x80;
        }
        if (var9.method1814(var10, 16384)) {
            arg5 |= 0x100;
        }
        if (var9.method1811(true, var10)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1810(var15, (byte) -65)) {
                arg5 |= 0x80;
            }
            if (var13.method1814(var15, 16384)) {
                arg5 |= 0x100;
            }
            if (var13.method1811(true, var15)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1810(arg4, (byte) -100)) {
                arg5 |= 0x80;
            }
            if (var11.method1814(arg4, arg3 ^ 0x4073)) {
                arg5 |= 0x100;
            }
            if (var11.method1811(true, arg4)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1810(var16, (byte) -120)) {
                arg5 |= 0x80;
            }
            if (var14.method1814(var16, 16384)) {
                arg5 |= 0x100;
            }
            if (var14.method1811(true, var16)) {
                arg5 |= 0x400;
            }
        }
        int var17 = arg5 | 0x20;
        class519 var18 = arg0.method765((byte) 1, var17, true);
        var18.method2934(0, arg4, var11, var10, arg1 - 1, var9, this.field6415, var7, (byte) 122);
        if (var13 != null) {
            var18.method2934(0, var16, var14, var15, arg1 - 1, var13, this.field6415, var7, (byte) 122);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZII)I")
    public final int method2594(int arg0, boolean arg1, int arg2, int arg3) {
        field6398++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6416[arg2];
        class285 var8 = null;
        class285 var9 = this.field6411.method2298(-121, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (arg0 != -1) {
            this.field6397 = null;
        }
        if (var9 == null) {
            return var5;
        }
        if ((this.field6395 || class429.field6257) && arg3 != -1 && this.field6416.length > arg3) {
            int var11 = this.field6416[arg3];
            var8 = this.field6411.method2298(-104, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6415) {
            var5 |= 0x200;
        }
        if (var9.method1810(var10, (byte) -100)) {
            var5 |= 0x80;
        }
        if (var9.method1814(var10, arg0 + 16385)) {
            var5 |= 0x100;
        }
        if (var9.method1811(true, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1810(var6, (byte) -47)) {
                var5 |= 0x80;
            }
            if (var8.method1814(var6, arg0 ^ 0xFFFFBFFF)) {
                var5 |= 0x100;
            }
            if (var8.method1811(true, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field6397 != null && arg1) {
            if (this.field6397.length > arg2) {
                int var12 = this.field6397[arg2];
                if (var12 != 65535) {
                    class285 var13 = this.field6411.method2298(arg0 ^ 0x3B, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1810(var14, (byte) -46)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1814(var14, 16384)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1811(true, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6395 || class429.field6257) && arg3 != -1 && arg3 < this.field6397.length) {
                int var15 = this.field6397[arg3];
                if (var15 != 65535) {
                    class285 var16 = this.field6411.method2298(-80, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1810(var17, (byte) -70)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1814(var17, 16384)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1811(true, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lco;I)V")
    public final void method2595(class268 arg0, int arg1) {
        if (arg1 != 5560) {
            return;
        }
        field6406++;
        while (true) {
            int var3 = arg0.method1738(arg1 ^ 0x1547);
            if (var3 == 0) {
                return;
            }
            this.method2598(var3, arg0, 16);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZI)V")
    public static final void method2596(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method2596(-67, 69, true, 98);
        }
        field6399++;
        int var4 = class202.field2854.field7921 * arg3 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class367.method2214(arg0, 0, class234.field3442, var4, -108, false);
            class331.field4757 = true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIILr;BIII)Lr;")
    public final class519 method2597(byte arg0, int arg1, int arg2, class519 arg3, byte arg4, int arg5, int arg6, int arg7) {
        field6401++;
        int var9 = this.field6413[arg2];
        int var10 = this.field6416[arg2];
        class285 var11 = this.field6411.method2298(-100, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg3.method765(arg0, arg5, true);
        }
        class285 var13 = null;
        if ((this.field6395 || class429.field6257) && arg1 != -1 && this.field6416.length > arg1) {
            int var14 = this.field6416[arg1];
            var13 = this.field6411.method2298(-107, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        if (arg4 >= -41) {
            this.method2594(-111, true, 25, -58);
        }
        if (this.field6415) {
            arg5 |= 0x200;
        }
        if (var11.method1810(var12, (byte) -104)) {
            arg5 |= 0x80;
        }
        if (var11.method1814(var12, 16384)) {
            arg5 |= 0x100;
        }
        if (var11.method1811(true, var12)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1810(arg1, (byte) -54)) {
                arg5 |= 0x80;
            }
            if (var13.method1814(arg1, 16384)) {
                arg5 |= 0x100;
            }
            if (var13.method1811(true, arg1)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class519 var16 = arg3.method765(arg0, var15, true);
        var16.method2934(arg7, arg1, var13, var12, arg6 - 1, var11, this.field6415, var9, (byte) 122);
        return var16;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILco;I)V")
    private final void method2598(int arg0, class268 arg1, int arg2) {
        field6394++;
        if (arg0 == 1) {
            int var4 = arg1.method1745(arg2 ^ 0x7D94);
            this.field6413 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6413[var5] = arg1.method1745(32132);
            }
            this.field6416 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field6416[var6] = arg1.method1745(class631.method3567(arg2, 32148));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field6416[var7] += arg1.method1745(32132) << 16;
            }
        } else if (arg0 == 2) {
            this.field6402 = arg1.method1745(32132);
        } else if (arg0 == 3) {
            this.field6412 = new boolean[256];
            int var15 = arg1.method1738(arg2 + 239);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field6412[arg1.method1738(255)] = true;
            }
        } else if (arg0 == 5) {
            this.field6408 = arg1.method1738(255);
        } else if (arg0 == 6) {
            this.field6405 = arg1.method1745(32132);
        } else if (arg0 == 7) {
            this.field6389 = arg1.method1745(32132);
        } else if (arg0 == 8) {
            this.field6393 = arg1.method1738(255);
        } else if (arg0 == 9) {
            this.field6409 = arg1.method1738(255);
        } else if (arg0 == 10) {
            this.field6407 = arg1.method1738(255);
        } else if (arg0 == 11) {
            this.field6396 = arg1.method1738(arg2 ^ 0xEF);
        } else if (arg0 == 12) {
            int var12 = arg1.method1738(255);
            this.field6397 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field6397[var13] = arg1.method1745(32132);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field6397[var14] = (arg1.method1745(32132) << 16) + this.field6397[var14];
            }
        } else if (arg0 == 13) {
            int var8 = arg1.method1745(arg2 + 32116);
            this.field6400 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg1.method1738(255);
                if (var10 > 0) {
                    this.field6400[var9] = new int[var10];
                    this.field6400[var9][0] = arg1.method1700((byte) 44);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field6400[var9][var11] = arg1.method1745(32132);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field6415 = true;
        } else if (arg0 == 15) {
            this.field6395 = true;
        } else if (arg0 == 16) {
            this.field6410 = true;
        } else if (arg0 == 17) {
            this.field6404 = arg1.method1738(arg2 + 239);
        }
        if (arg2 != 16) {
            this.method2597((byte) -96, -94, -80, null, (byte) 49, -97, 122, -37);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method2599(int arg0) {
        if (this.field6407 == -1) {
            if (this.field6412 == null) {
                this.field6407 = 0;
            } else {
                this.field6407 = 2;
            }
        }
        if (this.field6409 == -1) {
            if (this.field6412 == null) {
                this.field6409 = 0;
            } else {
                this.field6409 = 2;
            }
        }
        field6414++;
        if (arg0 != 65535) {
            this.field6404 = 92;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BB)Z")
    public static final boolean method2600(byte arg0, byte arg1) {
        if (arg1 != -124) {
            method2596(26, -77, true, -86);
        }
        field6403++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class609.field8662[var2 - 128] != '\u0000';
        }
    }
}
