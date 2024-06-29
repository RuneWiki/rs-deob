import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class21 extends class116 {

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
    public int field315 = 0;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "[I")
    private int[] field317;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Lda;")
    private static class275 field287 = class255.method1672(94, "gt");

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Lda;")
    private static class275 field286 = class255.method1672(104, "str=");

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Lda;")
    private static class275 field294 = class255.method1672(127, "copy");

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lda;")
    private static class275 field292 = class255.method1672(96, ")4col");

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Lda;")
    private static class275 field295 = class255.method1672(93, "str");

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "Lda;")
    private static class275 field297 = class255.method1672(107, ")4trans");

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Lda;")
    private static class275 field289 = class255.method1672(109, "u");

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lda;")
    private static class275 field293 = class255.method1672(95, "euro");

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lda;")
    private static class275 field301 = class255.method1672(95, "col=");

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "Lda;")
    private static class275 field308 = class255.method1672(94, ")4str");

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Lda;")
    private static class275 field291 = class255.method1672(104, "img=");

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lda;")
    private static class275 field303 = class255.method1672(121, "nbsp");

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Lda;")
    private static class275 field304 = class255.method1672(126, ")4u");

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "Lda;")
    private static class275 field313 = class255.method1672(112, "reg");

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "Lda;")
    private static class275 field307 = class255.method1672(101, "times");

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "Lda;")
    private static class275 field305 = class255.method1672(123, "trans=");

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lda;")
    private static class275 field288 = class255.method1672(108, "shad");

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Lda;")
    private static class275 field285 = class255.method1672(106, "shad=");

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "Lda;")
    private static class275 field310 = class255.method1672(102, "lt");

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lda;")
    private static class275 field302 = class255.method1672(112, "br");

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "Lda;")
    private static class275 field298 = class255.method1672(104, "u=");

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "Lda;")
    private static class275 field309 = class255.method1672(106, "shy");

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "Lda;")
    private static class275 field316 = class255.method1672(107, ")4shad");

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Lda;")
    private static class275 field299 = class169.method1160(100, 95);

    @OriginalMember(owner = "client!rh", name = "sb", descriptor = "I")
    private static int field320 = 0;

    @OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
    private static int field321 = -1;

    @OriginalMember(owner = "client!rh", name = "rb", descriptor = "I")
    private static int field319 = 0;

    @OriginalMember(owner = "client!rh", name = "ub", descriptor = "I")
    private static int field322 = -1;

    @OriginalMember(owner = "client!rh", name = "vb", descriptor = "I")
    private static int field323 = 0;

    @OriginalMember(owner = "client!rh", name = "wb", descriptor = "[Lda;")
    private static class275[] field324 = new class275[100];

    @OriginalMember(owner = "client!rh", name = "yb", descriptor = "I")
    private static int field326 = -1;

    @OriginalMember(owner = "client!rh", name = "zb", descriptor = "I")
    private static int field327 = 0;

    @OriginalMember(owner = "client!rh", name = "xb", descriptor = "I")
    private static int field325 = 256;

    @OriginalMember(owner = "client!rh", name = "Ab", descriptor = "I")
    private static int field328 = -1;

    @OriginalMember(owner = "client!rh", name = "Bb", descriptor = "I")
    private static int field329 = 256;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "[B")
    private byte[] field306;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "[I")
    private int[] field284;

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "[Lrj;")
    private class13[] field318;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;I)I")
    public final int method108(class275 arg0, int arg1) {
        return this.method134(arg0, new int[] { arg1 }, field324);
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)I")
    private final int method109(int arg0) {
        return this.field314[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;)Lda;")
    public static final class275 method111(class275 arg0) {
        int var1 = arg0.method1838(3);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field4749[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class275 var4 = new class275();
        var4.field4752 = var1 + var2;
        var4.field4749 = new byte[var4.field4752];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field4749[var6];
            if (var7 == 60) {
                var4.field4749[var5++] = 60;
                var4.field4749[var5++] = 108;
                var4.field4749[var5++] = 116;
                var4.field4749[var5++] = 62;
            } else if (var7 == 62) {
                var4.field4749[var5++] = 60;
                var4.field4749[var5++] = 103;
                var4.field4749[var5++] = 116;
                var4.field4749[var5++] = 62;
            } else {
                var4.field4749[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIII)V")
    public final void method112(class275 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method128(arg3, arg4);
            this.method132(arg0, arg1 - this.method113(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lda;)I")
    public final int method113(class275 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field4752; var5++) {
            int var6 = arg0.field4749[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class275 var7 = arg0.method1815(var2 + 1, var5, 0);
                    var2 = -1;
                    if (var7.method1828(true, field310)) {
                        var6 = 60;
                    } else if (var7.method1828(true, field287)) {
                        var6 = 62;
                    } else if (var7.method1828(true, field303)) {
                        var6 = 160;
                    } else if (var7.method1828(true, field309)) {
                        var6 = 173;
                    } else if (var7.method1828(true, field307)) {
                        var6 = 215;
                    } else if (var7.method1828(true, field293)) {
                        var6 = 128;
                    } else if (var7.method1828(true, field294)) {
                        var6 = 169;
                    } else {
                        if (!var7.method1828(true, field313)) {
                            if (var7.method1851(field291, -55)) {
                                try {
                                    int var8 = var7.method1839(4, (byte) 115).method1847((byte) 5);
                                    var4 += this.field318[var8].field194;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 174;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field314[var6];
                    if (this.field306 != null && var3 != -1) {
                        var4 += this.field306[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIIII)V")
    public final void method114(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method128(arg3, arg4);
        int[] var7 = new int[arg0.field4752];
        for (int var8 = 0; var8 < arg0.field4752; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method124(arg0, arg1 - this.method113(arg0) / 2, arg2, (int[]) null, var7);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Lda;)V")
    private final void method115(class275 arg0) {
        try {
            if (arg0.method1851(field301, -124)) {
                field320 = arg0.method1839(4, (byte) -41).method1822(-8804, 16);
                return;
            }
            if (arg0.method1828(true, field292)) {
                field320 = field327;
                return;
            }
            if (arg0.method1851(field305, 81)) {
                field329 = arg0.method1839(6, (byte) 97).method1847((byte) 5);
                return;
            }
            if (arg0.method1828(true, field297)) {
                field329 = field325;
                return;
            }
            if (arg0.method1851(field286, 118)) {
                field328 = arg0.method1839(4, (byte) 106).method1822(-8804, 16);
                return;
            }
            if (arg0.method1828(true, field295)) {
                field328 = 8388608;
                return;
            }
            if (arg0.method1828(true, field308)) {
                field328 = -1;
                return;
            }
            if (arg0.method1851(field298, -76)) {
                field321 = arg0.method1839(2, (byte) 104).method1822(-8804, 16);
                return;
            }
            if (arg0.method1828(true, field289)) {
                field321 = 0;
                return;
            }
            if (arg0.method1828(true, field304)) {
                field321 = -1;
                return;
            }
            if (arg0.method1851(field285, 92)) {
                field326 = arg0.method1839(5, (byte) -35).method1822(-8804, 16);
                return;
            }
            if (arg0.method1828(true, field288)) {
                field326 = 0;
                return;
            }
            if (arg0.method1828(true, field316)) {
                field326 = field322;
                return;
            }
            if (arg0.method1828(true, field302)) {
                this.method127(field327, field322, field325);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lda;IIII)V")
    public final void method116(class275 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method128(arg3, arg4);
            this.method132(arg0, arg1 - this.method113(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
    public static void method117() {
        field310 = null;
        field287 = null;
        field303 = null;
        field309 = null;
        field307 = null;
        field293 = null;
        field294 = null;
        field313 = null;
        field291 = null;
        field302 = null;
        field301 = null;
        field292 = null;
        field305 = null;
        field297 = null;
        field298 = null;
        field289 = null;
        field304 = null;
        field285 = null;
        field288 = null;
        field316 = null;
        field286 = null;
        field295 = null;
        field308 = null;
        field299 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lda;IIIII)V")
    public final void method118(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method128(arg3, arg4);
        int[] var7 = new int[arg0.field4752];
        int[] var8 = new int[arg0.field4752];
        for (int var9 = 0; var9 < arg0.field4752; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method124(arg0, arg1 - this.method113(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lda;I)V")
    private final void method119(class275 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1838(3); var5++) {
            int var6 = arg0.method1852(103, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field323 = (arg1 - this.method113(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Lda;IIII)V")
    public final void method121(class275 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method128(arg3, arg4);
            this.method132(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([Lrj;[I)V")
    public final void method122(class13[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field318 = arg0;
        this.field284 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIIILjava/util/Random;I)I")
    public final int method123(class275 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method127(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field4752];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field4752; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method124(arg0, arg1, arg2, var8, (int[]) null);
        return var9;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;II[I[I)V")
    private final void method124(class275 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field315;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field4752; var10++) {
            int var11 = arg0.field4749[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class275 var12 = arg0.method1815(var7 + 1, var10, 0);
                    var7 = -1;
                    if (var12.method1828(true, field310)) {
                        var11 = 60;
                    } else if (var12.method1828(true, field287)) {
                        var11 = 62;
                    } else if (var12.method1828(true, field303)) {
                        var11 = 160;
                    } else if (var12.method1828(true, field309)) {
                        var11 = 173;
                    } else if (var12.method1828(true, field307)) {
                        var11 = 215;
                    } else if (var12.method1828(true, field293)) {
                        var11 = 128;
                    } else if (var12.method1828(true, field294)) {
                        var11 = 169;
                    } else {
                        if (!var12.method1828(true, field313)) {
                            if (var12.method1851(field291, -74)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method1839(4, (byte) 112).method1847((byte) 5);
                                    class13 var16 = this.field318[var15];
                                    int var17 = this.field284 == null ? var16.field201 : this.field284[var15];
                                    if (field329 == 256) {
                                        var16.method62(arg1 + var13, this.field315 + var6 - var17 + var14);
                                    } else {
                                        var16.method63(arg1 + var13, this.field315 + var6 - var17 + var14, field329);
                                    }
                                    arg1 += var16.field194;
                                    var8 = -1;
                                } catch (Exception var23) {
                                }
                            } else {
                                this.method115(var12);
                            }
                            continue;
                        }
                        var11 = 174;
                    }
                }
                if (var7 == -1) {
                    if (this.field306 != null && var8 != -1) {
                        arg1 += this.field306[(var8 << 8) + var11];
                    }
                    int var18 = this.field317[var11];
                    int var19 = this.field312[var11];
                    int var20;
                    if (arg3 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg3[var9];
                    }
                    int var21;
                    if (arg4 == null) {
                        var21 = 0;
                    } else {
                        var21 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field323 > 0) {
                            field319 += field323;
                            arg1 += field319 >> 8;
                            field319 &= 0xFF;
                        }
                    } else if (field329 == 256) {
                        if (field326 != -1) {
                            this.method120(var11, this.field296[var11] + arg1 + var20 + 1, this.field300[var11] + var6 + 1 + var21, var18, var19, field326, true);
                        }
                        this.method120(var11, this.field296[var11] + arg1 + var20, this.field300[var11] + var6 + var21, var18, var19, field320, false);
                    } else {
                        if (field326 != -1) {
                            this.method110(var11, this.field296[var11] + arg1 + var20 + 1, this.field300[var11] + var6 + 1 + var21, var18, var19, field326, field329, true);
                        }
                        this.method110(var11, this.field296[var11] + arg1 + var20, this.field300[var11] + var6 + var21, var18, var19, field320, field329, false);
                    }
                    int var22 = this.field314[var11];
                    if (field328 != -1) {
                        class47.method294(arg1, (int) ((double) this.field315 * 0.7D) + var6, var22, field328);
                    }
                    if (field321 != -1) {
                        class47.method294(arg1, this.field315 + var6, var22, field321);
                    }
                    arg1 += var22;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIIIIIIIII)I")
    public final int method125(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method127(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field315;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field311 + this.field290 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method134(arg0, var12, field324);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field311 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field311 - this.field290 - (var13 - 1) * arg10) / 2 + this.field311 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field290 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field311 - this.field290 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field311 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method132(field324[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method132(field324[var16], arg1 + (arg3 - this.method113(field324[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method132(field324[var16], arg1 + arg3 - this.method113(field324[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method132(field324[var16], arg1, var14);
            } else {
                this.method119(field324[var16], arg3);
                this.method132(field324[var16], arg1, var14);
                field323 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIIIII)V")
    public final void method126(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method128(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field4752];
        for (int var11 = 0; var11 < arg0.field4752; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method124(arg0, arg1 - this.method113(arg0) / 2, arg2, (int[]) null, var10);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    private final void method127(int arg0, int arg1, int arg2) {
        field328 = -1;
        field321 = -1;
        field322 = arg1;
        field326 = arg1;
        field327 = arg0;
        field320 = arg0;
        field325 = arg2;
        field329 = arg2;
        field323 = 0;
        field319 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    private final void method128(int arg0, int arg1) {
        field328 = -1;
        field321 = -1;
        field322 = arg1;
        field326 = arg1;
        field327 = arg0;
        field320 = arg0;
        field325 = 256;
        field329 = 256;
        field323 = 0;
        field319 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Lda;I)I")
    public final int method129(class275 arg0, int arg1) {
        int var3 = this.method134(arg0, new int[] { arg1 }, field324);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method113(field324[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method130(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;IIIIIIIII)I")
    public final int method131(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method125(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;II)V")
    private final void method132(class275 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field315;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field4752; var7++) {
            int var8 = arg0.field4749[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class275 var9 = arg0.method1815(var5 + 1, var7, 0);
                    var5 = -1;
                    if (var9.method1828(true, field310)) {
                        var8 = 60;
                    } else if (var9.method1828(true, field287)) {
                        var8 = 62;
                    } else if (var9.method1828(true, field303)) {
                        var8 = 160;
                    } else if (var9.method1828(true, field309)) {
                        var8 = 173;
                    } else if (var9.method1828(true, field307)) {
                        var8 = 215;
                    } else if (var9.method1828(true, field293)) {
                        var8 = 128;
                    } else if (var9.method1828(true, field294)) {
                        var8 = 169;
                    } else {
                        if (!var9.method1828(true, field313)) {
                            if (var9.method1851(field291, -53)) {
                                try {
                                    int var10 = var9.method1839(4, (byte) 91).method1847((byte) 5);
                                    class13 var11 = this.field318[var10];
                                    int var12 = this.field284 == null ? var11.field201 : this.field284[var10];
                                    if (field329 == 256) {
                                        var11.method62(arg1, this.field315 + var4 - var12);
                                    } else {
                                        var11.method63(arg1, this.field315 + var4 - var12, field329);
                                    }
                                    arg1 += var11.field194;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method115(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field306 != null && var6 != -1) {
                        arg1 += this.field306[(var6 << 8) + var8];
                    }
                    int var13 = this.field317[var8];
                    int var14 = this.field312[var8];
                    if (var8 == 32) {
                        if (field323 > 0) {
                            field319 += field323;
                            arg1 += field319 >> 8;
                            field319 &= 0xFF;
                        }
                    } else if (field329 == 256) {
                        if (field326 != -1) {
                            this.method120(var8, this.field296[var8] + arg1 + 1, this.field300[var8] + var4 + 1, var13, var14, field326, true);
                        }
                        this.method120(var8, this.field296[var8] + arg1, this.field300[var8] + var4, var13, var14, field320, false);
                    } else {
                        if (field326 != -1) {
                            this.method110(var8, this.field296[var8] + arg1 + 1, this.field300[var8] + var4 + 1, var13, var14, field326, field329, true);
                        }
                        this.method110(var8, this.field296[var8] + arg1, this.field300[var8] + var4, var13, var14, field320, field329, false);
                    }
                    int var15 = this.field314[var8];
                    if (field328 != -1) {
                        class47.method294(arg1, (int) ((double) this.field315 * 0.7D) + var4, var15, field328);
                    }
                    if (field321 != -1) {
                        class47.method294(arg1, this.field315 + var4 + 1, var15, field321);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([B)V")
    private final void method133(byte[] arg0) {
        this.field314 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field314.length; var2++) {
                this.field314[var2] = arg0[var2] & 0xFF;
            }
            this.field315 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field314[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field306 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field306[(var13 << 8) + var14] = (byte) method130(var9, var11, var6, this.field314, var5, var13, var14);
                    }
                }
            }
        }
        this.field315 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lda;[I[Lda;)I")
    public final int method134(class275 arg0, int[] arg1, class275[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        field299.method1843(0, false);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        byte var8 = 0;
        int var9 = -1;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method1838(3);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method1852(123, var13);
            if (var14 == 60) {
                var9 = var13;
            } else {
                if (var14 == 62 && var9 != -1) {
                    class275 var15 = arg0.method1815(var9 + 1, var13, 0);
                    var9 = -1;
                    field299.method1824(0, 60);
                    field299.method1835(var15, 0);
                    field299.method1824(0, 62);
                    if (var15.method1828(true, field302)) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field299.method1815(var5, field299.method1838(3), 0);
                        } else {
                            arg2[var11].method1843(0, false);
                            arg2[var11] = arg2[var11].method1809(field299.method1838(3), -1, field299, var5);
                        }
                        var11++;
                        var5 = field299.method1838(3);
                        var4 = 0;
                        var6 = -1;
                        var10 = -1;
                    } else if (var15.method1828(true, field310)) {
                        var4 += this.method109(60);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 60];
                        }
                        var10 = 60;
                    } else if (var15.method1828(true, field287)) {
                        var4 += this.method109(62);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 62];
                        }
                        var10 = 62;
                    } else if (var15.method1828(true, field303)) {
                        var4 += this.method109(160);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 160];
                        }
                        var10 = 160;
                    } else if (var15.method1828(true, field309)) {
                        var4 += this.method109(173);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 173];
                        }
                        var10 = 173;
                    } else if (var15.method1828(true, field307)) {
                        var4 += this.method109(215);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 215];
                        }
                        var10 = 215;
                    } else if (var15.method1828(true, field293)) {
                        var4 += this.method109(128);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 128];
                        }
                        var10 = 128;
                    } else if (var15.method1828(true, field294)) {
                        var4 += this.method109(169);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 169];
                        }
                        var10 = 169;
                    } else if (var15.method1828(true, field313)) {
                        var4 += this.method109(174);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + 174];
                        }
                        var10 = 174;
                    } else if (var15.method1851(field291, -68)) {
                        try {
                            int var16 = var15.method1839(4, (byte) -94).method1847((byte) 5);
                            var4 += this.field318[var16].field194;
                            var10 = -1;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var9 == -1) {
                    if (var14 != -1) {
                        field299.method1824(0, var14);
                        var4 += this.method109(var14);
                        if (this.field306 != null && var10 != -1) {
                            var4 += this.field306[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == 32) {
                        var6 = field299.method1838(3);
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field299.method1815(var5, var6 - var8, 0);
                        } else {
                            arg2[var11].method1843(0, false);
                            arg2[var11] = arg2[var11].method1809(var6 - var8, -1, field299, var5);
                        }
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = -1;
                    }
                    if (var14 == 45) {
                        var6 = field299.method1838(3);
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field299.method1838(3) > var5) {
            if (arg2[var11] == null) {
                arg2[var11] = field299.method1815(var5, field299.method1838(3), 0);
            } else {
                arg2[var11].method1843(0, false);
                arg2[var11] = arg2[var11].method1809(field299.method1838(3), -1, field299, var5);
            }
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class21(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field296 = arg1;
        this.field300 = arg2;
        this.field317 = arg3;
        this.field312 = arg4;
        this.method133(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field300[var8] < var6 && this.field312[var8] != 0) {
                var6 = this.field300[var8];
            }
            if (this.field312[var8] + this.field300[var8] > var7) {
                var7 = this.field312[var8] + this.field300[var8];
            }
        }
        this.field311 = this.field315 - var6;
        this.field290 = var7 - this.field315;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([B)V")
    public class21(byte[] arg0) {
        this.method133(arg0);
    }
}
