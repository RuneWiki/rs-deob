import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class196 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field2714;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Z")
    private boolean field2713;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field2704;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
    private static int[] field2718 = new int[4];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field2706;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lq;")
    private class128 field2716;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lca;")
    private static class271 field2717;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[B")
    private static byte[] field2708;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;)Z")
    private final boolean method1239(class196 arg0) {
        if (this.field2716 == null) {
            if (this.field2704 == 0) {
                this.field2716 = class90.field1260.method910(true, this.field2715, class90.field1267, this.field2703, 92);
            } else if (this.field2704 == 2) {
                this.method1243(arg0);
            } else if (this.field2704 == 1) {
                this.method1250(arg0);
            }
        }
        return this.field2716 != null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    private static final void method1240() {
        if (field2717 != null) {
            return;
        }
        class271 var0 = field2717 = new class271(260, 480, 0);
        int[] var1 = var0.field4148;
        int[] var2 = var0.field4167;
        int[] var3 = var0.field4165;
        int[] var4 = var0.field4186;
        int[] var5 = var0.field4198;
        int[] var6 = var0.field4184;
        var0.field4162 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class90.field1259[var8] >> 1;
            int var10 = class90.field1255[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class90.field1255[var17] >> 9;
                int var19 = (class90.field1259[var17] >> 1) * var9 >> 23;
                int var20 = (class90.field1259[var17] >> 1) * var10 >> 23;
                var1[var0.field4162] = var20;
                var2[var0.field4162] = var18;
                var3[var0.field4162] = -var19;
                var0.field4162++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field4190] = 0;
                var5[var0.field4190] = var13;
                var6[var0.field4190] = var12;
                var0.field4190++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field4190] = var13;
                    var5[var0.field4190] = var15;
                    var6[var0.field4190] = var12;
                    var0.field4190++;
                    var4[var0.field4190] = var15;
                    var5[var0.field4190] = var16;
                    var6[var0.field4190] = var12;
                    var0.field4190++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field4190] = var12;
                var5[var0.field4190] = var13;
                var6[var0.field4190] = 1;
                var0.field4190++;
            }
        }
        var0.field4192 = var0.field4162;
        var0.field4158 = null;
        var0.field4157 = null;
        var0.field4153 = null;
        var0.field4191 = null;
        var0.field4195 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1241(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2708[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1242(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2708[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lvc;)V")
    private final void method1243(class196 arg0) {
        class271 var2 = class271.method1813(class130.field1832, this.field2715, 0);
        if (var2 == null) {
            return;
        }
        this.field2716 = new class128(this.field2703, this.field2703);
        class64.method403(field2718);
        this.field2716.method879();
        class90.method580();
        class64.method401(0, 0, this.field2703, this.field2703, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2713) {
                var3 = -arg0.field2707;
                var4 = -arg0.field2710;
                var5 = -arg0.field2714;
            } else {
                var3 = this.field2707 - arg0.field2707;
                var4 = this.field2710 - arg0.field2710;
                var5 = this.field2714 - arg0.field2714;
            }
        }
        if (this.field2706 != 0) {
            int var6 = class90.field1259[this.field2706];
            int var7 = class90.field1255[this.field2706];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2711 != 0) {
            int var9 = this.field2711 - 1024 & 0x7FF;
            int var10 = class90.field1259[var9];
            int var11 = class90.field1255[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class18 var13 = var2.method1818(64, 768, -var3, -var4, -var5);
        int var14 = var13.method117() - var13.method127();
        int var15 = var13.method141() - var13.method106();
        int var16 = var13.method127() + var14 / 2;
        int var17 = var13.method106() + var15 / 2;
        if (var14 > var15) {
            var13.method130(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2703);
        } else {
            var13.method130(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2703);
        }
        class207.field2889.method1979((byte) -61);
        class64.method399(field2718);
        class90.method580();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V")
    public static void method1244() {
        field2717 = null;
        field2708 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
    private final void method1245() {
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
    private final void method1246() {
        int var1 = this.field2703;
        int var2 = this.field2703;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class64.field879 - var1;
        if (var2 > class64.field878) {
            var2 -= var2 - class64.field878;
        }
        if (class64.field876 > 0) {
            int var9 = class64.field876;
            var2 -= var9;
            var7 += class64.field879 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class64.field873) {
            int var10 = var1 - class64.field873;
            var1 -= var10;
            var8 += var10;
        }
        if (class64.field877 > 0) {
            int var11 = class64.field877;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1242(class64.field881, this.field2709, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
    public final boolean method1247(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2713) {
            this.field2712 = 1073741823;
            var8 = this.field2707;
            var9 = this.field2710;
            var10 = this.field2714;
        } else {
            int var5 = this.field2707 - arg0;
            int var6 = this.field2710 - arg1;
            int var7 = this.field2714 - arg2;
            this.field2712 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2712 == 0) {
                this.field2712 = 1;
            }
            var8 = (var5 << 8) / this.field2712;
            var9 = (var6 << 8) / this.field2712;
            var10 = (var7 << 8) / this.field2712;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2702 = this.field2705 * arg3 / (this.field2713 ? 1024 : this.field2712);
        } else {
            this.field2702 = 0;
        }
        if (this.field2702 < 8) {
            this.method1245();
            this.field2716 = null;
            return false;
        }
        int var12 = class238.method1594(this.field2702, 4096);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2703 != var12) {
            this.field2703 = var12;
        }
        this.field2706 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2711 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2716 = null;
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
    private static final void method1248() {
        if (field2708 != null) {
            return;
        }
        field2708 = new byte[16384];
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
                field2708[var4 + var6] = field2708[var4 + var9] = field2708[var5 + var6] = field2708[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1245();
        super.finalize();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILvc;)V")
    public final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class196 arg6) {
        int var8 = this.field2706 - arg4 & 0x7FF;
        int var9 = this.field2711 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2702) / 2 + var10;
        int var13 = (arg2 - this.field2702) / 2 + var11;
        if (var12 < arg3 && this.field2702 + var12 > 0 && var13 < arg2 && this.field2702 + var13 > 0 && this.method1239(arg6)) {
            this.field2716.method705(arg0 + var13, arg1 + var12, this.field2702, this.field2702);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lvc;)V")
    private final void method1250(class196 arg0) {
        method1240();
        method1248();
        this.field2716 = new class243(this.field2703, this.field2703);
        class64.method403(field2718);
        this.field2716.method879();
        class90.method580();
        class64.method401(0, 0, this.field2703, this.field2703, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2713) {
                var2 = -arg0.field2707;
                var3 = -arg0.field2710;
                var4 = -arg0.field2714;
            } else {
                var2 = this.field2707 - arg0.field2707;
                var3 = this.field2710 - arg0.field2710;
                var4 = this.field2714 - arg0.field2714;
            }
        }
        if (this.field2706 != 0) {
            int var5 = class90.field1259[this.field2706];
            int var6 = class90.field1255[this.field2706];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2711 != 0) {
            int var8 = this.field2711 - 1024 & 0x7FF;
            int var9 = class90.field1259[var8];
            int var10 = class90.field1255[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class115.method776(field2717.field4183, 0, field2717.field4190, (short) class90.field1260.method911(90, this.field2715));
        class18 var12 = field2717.method1818(64, 512, -var2, -var3, -var4);
        int var13 = var12.method117() - var12.method127();
        int var14 = var12.method141() - var12.method106();
        if (var13 > var14) {
            int var15 = this.field2709 == 0 ? (var13 << 9) / this.field2703 : (var13 * 16 << 9) / (this.field2703 * 13);
            var12.method130(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2709 == 0 ? (var14 << 9) / this.field2703 : (var14 * 16 << 9) / (this.field2703 * 13);
            var12.method130(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2709 == 0) {
            for (int var17 = 0; var17 < class64.field881.length; var17++) {
                if (class64.field881[var17] != 0) {
                    class64.field881[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1251();
            this.method1246();
        }
        class207.field2889.method1979((byte) -117);
        class64.method399(field2718);
        class90.method580();
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2707 = arg2;
        this.field2710 = arg3;
        this.field2714 = arg4;
        this.field2713 = arg7;
        this.field2715 = arg1;
        this.field2709 = arg6;
        this.field2705 = arg5;
        this.field2704 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
    private final void method1251() {
        int var1 = this.field2703 * 3 / 32;
        int var3 = this.field2703 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class64.field879 * var1 + var1;
        int var8 = class64.field879 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class64.field878) {
            var4 = var3 - (var1 + var3 - class64.field878);
        }
        if (var1 < class64.field876) {
            int var11 = class64.field876 - var1;
            var4 -= var11;
            var7 += class64.field879 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class64.field873) {
            int var12 = var1 + var3 - class64.field873;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class64.field877) {
            int var13 = class64.field877 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1241(class64.field881, 0, this.field2709, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }
}
