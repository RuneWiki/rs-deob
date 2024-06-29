import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class56 {

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Z")
    private boolean field997;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "[I")
    private static int[] field994 = new int[4];

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lhl;")
    private static class229 field981;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lbj;")
    private class92 field987;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[B")
    private static byte[] field984;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lpm;)V")
    private final void method352(class56 arg0) {
        method361();
        method364();
        this.field987 = new class266(this.field989, this.field989);
        class211.method1473(field994);
        this.field987.method666();
        class128.method948();
        class211.method1483(0, 0, this.field989, this.field989, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field997) {
                var2 = -arg0.field986;
                var3 = -arg0.field982;
                var4 = -arg0.field995;
            } else {
                var2 = this.field986 - arg0.field986;
                var3 = this.field982 - arg0.field982;
                var4 = this.field995 - arg0.field995;
            }
        }
        if (this.field988 != 0) {
            int var5 = class128.field2133[this.field988];
            int var6 = class128.field2130[this.field988];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field983 != 0) {
            int var8 = this.field983 - 1024 & 0x7FF;
            int var9 = class128.field2133[var8];
            int var10 = class128.field2130[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class75.method538(field981.field3867, 0, field981.field3879, (short) class128.field2136.method703(2213, this.field996));
        class112 var12 = field981.method1624(64, 512, -var2, -var3, -var4);
        int var13 = var12.method835() - var12.method844();
        int var14 = var12.method848() - var12.method860();
        if (var13 > var14) {
            int var15 = this.field993 == 0 ? (var13 << 9) / this.field989 : (var13 * 16 << 9) / (this.field989 * 13);
            var12.method864(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field993 == 0 ? (var14 << 9) / this.field989 : (var14 * 16 << 9) / (this.field989 * 13);
            var12.method864(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field993 == 0) {
            for (int var17 = 0; var17 < class211.field3551.length; var17++) {
                if (class211.field3551[var17] != 0) {
                    class211.field3551[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method360();
            this.method353();
        }
        class7.field152.method1016(255);
        class211.method1485(field994);
        class128.method948();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
    private final void method353() {
        int var1 = this.field989;
        int var2 = this.field989;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class211.field3557 - var1;
        if (var2 > class211.field3554) {
            var2 -= var2 - class211.field3554;
        }
        if (class211.field3550 > 0) {
            int var9 = class211.field3550;
            var2 -= var9;
            var7 += class211.field3557 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class211.field3552) {
            int var10 = var1 - class211.field3552;
            var1 -= var10;
            var8 += var10;
        }
        if (class211.field3553 > 0) {
            int var11 = class211.field3553;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method356(class211.field3551, this.field993, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILpm;)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class56 arg6) {
        int var8 = this.field988 - arg4 & 0x7FF;
        int var9 = this.field983 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field985) / 2 + var10;
        int var13 = (arg2 - this.field985) / 2 + var11;
        if (var12 < arg3 && this.field985 + var12 > 0 && var13 < arg2 && this.field985 + var13 > 0 && this.method357(arg6)) {
            this.field987.method661(arg0 + var13, arg1 + var12, this.field985, this.field985);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)Z")
    public final boolean method355(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field997) {
            this.field990 = 1073741823;
            var8 = this.field986;
            var9 = this.field982;
            var10 = this.field995;
        } else {
            int var5 = this.field986 - arg0;
            int var6 = this.field982 - arg1;
            int var7 = this.field995 - arg2;
            this.field990 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field990 == 0) {
                this.field990 = 1;
            }
            var8 = (var5 << 8) / this.field990;
            var9 = (var6 << 8) / this.field990;
            var10 = (var7 << 8) / this.field990;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field985 = this.field991 * arg3 / (this.field997 ? 1024 : this.field990);
        } else {
            this.field985 = 0;
        }
        if (this.field985 < 8) {
            this.method359();
            this.field987 = null;
            return false;
        }
        int var12 = class258.method1848(this.field985, true);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field989 != var12) {
            this.field989 = var12;
        }
        this.field988 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field983 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field987 = null;
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method356(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field984[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lpm;)Z")
    private final boolean method357(class56 arg0) {
        if (this.field987 == null) {
            if (this.field992 == 0) {
                this.field987 = class128.field2136.method706((byte) 7, this.field989, this.field996, class128.field2127, true);
            } else if (this.field992 == 2) {
                this.method358(arg0);
            } else if (this.field992 == 1) {
                this.method352(arg0);
            }
        }
        return this.field987 != null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(Lpm;)V")
    private final void method358(class56 arg0) {
        class229 var2 = class229.method1644(class14.field293, this.field996, 0);
        if (var2 == null) {
            return;
        }
        this.field987 = new class92(this.field989, this.field989);
        class211.method1473(field994);
        this.field987.method666();
        class128.method948();
        class211.method1483(0, 0, this.field989, this.field989, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field997) {
                var3 = -arg0.field986;
                var4 = -arg0.field982;
                var5 = -arg0.field995;
            } else {
                var3 = this.field986 - arg0.field986;
                var4 = this.field982 - arg0.field982;
                var5 = this.field995 - arg0.field995;
            }
        }
        if (this.field988 != 0) {
            int var6 = class128.field2133[this.field988];
            int var7 = class128.field2130[this.field988];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field983 != 0) {
            int var9 = this.field983 - 1024 & 0x7FF;
            int var10 = class128.field2133[var9];
            int var11 = class128.field2130[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class112 var13 = var2.method1624(64, 768, -var3, -var4, -var5);
        int var14 = var13.method835() - var13.method844();
        int var15 = var13.method848() - var13.method860();
        int var16 = var13.method844() + var14 / 2;
        int var17 = var13.method860() + var15 / 2;
        if (var14 > var15) {
            var13.method864(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field989);
        } else {
            var13.method864(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field989);
        }
        class7.field152.method1016(255);
        class211.method1485(field994);
        class128.method948();
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V")
    private final void method359() {
    }

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method359();
        super.finalize();
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()V")
    private final void method360() {
        int var1 = this.field989 * 3 / 32;
        int var3 = this.field989 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class211.field3557 * var1 + var1;
        int var8 = class211.field3557 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class211.field3554) {
            var4 = var3 - (var1 + var3 - class211.field3554);
        }
        if (var1 < class211.field3550) {
            int var11 = class211.field3550 - var1;
            var4 -= var11;
            var7 += class211.field3557 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class211.field3552) {
            int var12 = var1 + var3 - class211.field3552;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class211.field3553) {
            int var13 = class211.field3553 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method362(class211.field3551, 0, this.field993, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()V")
    private static final void method361() {
        if (field981 != null) {
            return;
        }
        class229 var0 = field981 = new class229(260, 480, 0);
        int[] var1 = var0.field3891;
        int[] var2 = var0.field3890;
        int[] var3 = var0.field3904;
        int[] var4 = var0.field3874;
        int[] var5 = var0.field3872;
        int[] var6 = var0.field3871;
        var0.field3892 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class128.field2133[var8] >> 1;
            int var10 = class128.field2130[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class128.field2130[var17] >> 9;
                int var19 = (class128.field2133[var17] >> 1) * var9 >> 23;
                int var20 = (class128.field2133[var17] >> 1) * var10 >> 23;
                var1[var0.field3892] = var20;
                var2[var0.field3892] = var18;
                var3[var0.field3892] = -var19;
                var0.field3892++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3879] = 0;
                var5[var0.field3879] = var13;
                var6[var0.field3879] = var12;
                var0.field3879++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3879] = var13;
                    var5[var0.field3879] = var15;
                    var6[var0.field3879] = var12;
                    var0.field3879++;
                    var4[var0.field3879] = var15;
                    var5[var0.field3879] = var16;
                    var6[var0.field3879] = var12;
                    var0.field3879++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3879] = var12;
                var5[var0.field3879] = var13;
                var6[var0.field3879] = 1;
                var0.field3879++;
            }
        }
        var0.field3907 = var0.field3892;
        var0.field3876 = null;
        var0.field3888 = null;
        var0.field3873 = null;
        var0.field3895 = null;
        var0.field3901 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method362(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field984[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()V")
    public static void method363() {
        field981 = null;
        field984 = null;
        field994 = null;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "()V")
    private static final void method364() {
        if (field984 != null) {
            return;
        }
        field984 = new byte[16384];
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
                field984[var4 + var6] = field984[var4 + var9] = field984[var5 + var6] = field984[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field986 = arg2;
        this.field982 = arg3;
        this.field995 = arg4;
        this.field997 = arg7;
        this.field996 = arg1;
        this.field993 = arg6;
        this.field991 = arg5;
        this.field992 = arg0;
    }
}
