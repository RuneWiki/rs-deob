import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class65 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Z")
    private boolean field757;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    private static int[] field760 = new int[4];

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Li;")
    private static class113 field761;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Lpg;")
    private class187 field770;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "[B")
    private static byte[] field768;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    private final void method390() {
        int var1 = this.field773;
        int var2 = this.field773;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class155.field2244 - var1;
        if (var2 > class155.field2241) {
            var2 -= var2 - class155.field2241;
        }
        if (class155.field2240 > 0) {
            int var9 = class155.field2240;
            var2 -= var9;
            var7 += class155.field2244 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class155.field2246) {
            int var10 = var1 - class155.field2246;
            var1 -= var10;
            var8 += var10;
        }
        if (class155.field2248 > 0) {
            int var11 = class155.field2248;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method397(class155.field2242, this.field769, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILql;)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class65 arg6) {
        int var8 = this.field765 - arg4 & 0x7FF;
        int var9 = this.field764 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field762) / 2 + var10;
        int var13 = (arg2 - this.field762) / 2 + var11;
        if (var12 < arg3 && this.field762 + var12 > 0 && var13 < arg2 && this.field762 + var13 > 0 && this.method392(arg6)) {
            this.field770.method853(arg0 + var13, arg1 + var12, this.field762, this.field762);
        }
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method398();
        super.finalize();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lql;)Z")
    private final boolean method392(class65 arg0) {
        if (this.field770 == null) {
            if (this.field763 == 0) {
                this.field770 = class297.field4685.method769(this.field767, true, this.field773, class297.field4699, 5783);
            } else if (this.field763 == 2) {
                this.method402(arg0);
            } else if (this.field763 == 1) {
                this.method399(arg0);
            }
        }
        return this.field770 != null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
    private static final void method393() {
        if (field768 != null) {
            return;
        }
        field768 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field768[var4 + var6] = field768[var4 + var9] = field768[var5 + var6] = field768[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)Z")
    public final boolean method394(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field757) {
            this.field772 = 1073741823;
            var8 = this.field759;
            var9 = this.field758;
            var10 = this.field766;
        } else {
            int var5 = this.field759 - arg0;
            int var6 = this.field758 - arg1;
            int var7 = this.field766 - arg2;
            this.field772 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field772 == 0) {
                this.field772 = 1;
            }
            var8 = (var5 << 8) / this.field772;
            var9 = (var6 << 8) / this.field772;
            var10 = (var7 << 8) / this.field772;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field762 = this.field771 * arg3 / (this.field757 ? 1024 : this.field772);
        } else {
            this.field762 = 0;
        }
        if (this.field762 < 8) {
            this.method398();
            this.field770 = null;
            return false;
        }
        int var12 = class29.method178(-97, this.field762);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field773 != var12) {
            this.field773 = var12;
        }
        this.field765 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field764 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field770 = null;
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
    public static void method395() {
        field761 = null;
        field768 = null;
        field760 = null;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()V")
    private static final void method396() {
        if (field761 != null) {
            return;
        }
        class113 var0 = field761 = new class113(260, 480, 0);
        int[] var1 = var0.field1522;
        int[] var2 = var0.field1515;
        int[] var3 = var0.field1523;
        int[] var4 = var0.field1542;
        int[] var5 = var0.field1535;
        int[] var6 = var0.field1532;
        var0.field1514 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class297.field4697[var8] >> 1;
            int var10 = class297.field4698[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class297.field4698[var17] >> 9;
                int var19 = (class297.field4697[var17] >> 1) * var9 >> 23;
                int var20 = (class297.field4697[var17] >> 1) * var10 >> 23;
                var1[var0.field1514] = var20;
                var2[var0.field1514] = var18;
                var3[var0.field1514] = -var19;
                var0.field1514++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field1555] = 0;
                var5[var0.field1555] = var13;
                var6[var0.field1555] = var12;
                var0.field1555++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field1555] = var13;
                    var5[var0.field1555] = var15;
                    var6[var0.field1555] = var12;
                    var0.field1555++;
                    var4[var0.field1555] = var15;
                    var5[var0.field1555] = var16;
                    var6[var0.field1555] = var12;
                    var0.field1555++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field1555] = var12;
                var5[var0.field1555] = var13;
                var6[var0.field1555] = 1;
                var0.field1555++;
            }
        }
        var0.field1518 = var0.field1514;
        var0.field1549 = null;
        var0.field1516 = null;
        var0.field1534 = null;
        var0.field1533 = null;
        var0.field1540 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method397(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field768[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
    private final void method398() {
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lql;)V")
    private final void method399(class65 arg0) {
        method396();
        method393();
        this.field770 = new class201(this.field773, this.field773);
        class155.method1017(field760);
        this.field770.method1218();
        class297.method1985();
        class155.method1018(0, 0, this.field773, this.field773, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field757) {
                var2 = -arg0.field759;
                var3 = -arg0.field758;
                var4 = -arg0.field766;
            } else {
                var2 = this.field759 - arg0.field759;
                var3 = this.field758 - arg0.field758;
                var4 = this.field766 - arg0.field766;
            }
        }
        if (this.field765 != 0) {
            int var5 = class297.field4697[this.field765];
            int var6 = class297.field4698[this.field765];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field764 != 0) {
            int var8 = this.field764 - 1024 & 0x7FF;
            int var9 = class297.field4697[var8];
            int var10 = class297.field4698[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class194.method1257(field761.field1511, 0, field761.field1555, (short) class297.field4685.method776((byte) 11, this.field767));
        class275 var12 = field761.method716(64, 512, -var2, -var3, -var4);
        int var13 = var12.method654() - var12.method652();
        int var14 = var12.method1770() - var12.method227();
        if (var13 > var14) {
            int var15 = this.field769 == 0 ? (var13 << 9) / this.field773 : (var13 * 16 << 9) / (this.field773 * 13);
            var12.method1768(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field769 == 0 ? (var14 << 9) / this.field773 : (var14 * 16 << 9) / (this.field773 * 13);
            var12.method1768(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field769 == 0) {
            for (int var17 = 0; var17 < class155.field2242.length; var17++) {
                if (class155.field2242[var17] != 0) {
                    class155.field2242[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method401();
            this.method390();
        }
        class74.field890.method147(-105);
        class155.method1035(field760);
        class297.method1985();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method400(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field768[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "()V")
    private final void method401() {
        int var1 = this.field773 * 3 / 32;
        int var3 = this.field773 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class155.field2244 * var1 + var1;
        int var8 = class155.field2244 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class155.field2241) {
            var4 = var3 - (var1 + var3 - class155.field2241);
        }
        if (var1 < class155.field2240) {
            int var11 = class155.field2240 - var1;
            var4 -= var11;
            var7 += class155.field2244 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class155.field2246) {
            int var12 = var1 + var3 - class155.field2246;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class155.field2248) {
            int var13 = class155.field2248 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method400(class155.field2242, 0, this.field769, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Lql;)V")
    private final void method402(class65 arg0) {
        class113 var2 = class113.method719(class13.field164, this.field767, 0);
        if (var2 == null) {
            return;
        }
        this.field770 = new class187(this.field773, this.field773);
        class155.method1017(field760);
        this.field770.method1218();
        class297.method1985();
        class155.method1018(0, 0, this.field773, this.field773, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field757) {
                var3 = -arg0.field759;
                var4 = -arg0.field758;
                var5 = -arg0.field766;
            } else {
                var3 = this.field759 - arg0.field759;
                var4 = this.field758 - arg0.field758;
                var5 = this.field766 - arg0.field766;
            }
        }
        if (this.field765 != 0) {
            int var6 = class297.field4697[this.field765];
            int var7 = class297.field4698[this.field765];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field764 != 0) {
            int var9 = this.field764 - 1024 & 0x7FF;
            int var10 = class297.field4697[var9];
            int var11 = class297.field4698[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class275 var13 = var2.method716(64, 768, -var3, -var4, -var5);
        int var14 = var13.method654() - var13.method652();
        int var15 = var13.method1770() - var13.method227();
        int var16 = var13.method652() + var14 / 2;
        int var17 = var13.method227() + var15 / 2;
        if (var14 > var15) {
            var13.method1768(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field773);
        } else {
            var13.method1768(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field773);
        }
        class74.field890.method147(-101);
        class155.method1035(field760);
        class297.method1985();
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field759 = arg2;
        this.field758 = arg3;
        this.field766 = arg4;
        this.field757 = arg7;
        this.field767 = arg1;
        this.field769 = arg6;
        this.field771 = arg5;
        this.field763 = arg0;
    }
}
