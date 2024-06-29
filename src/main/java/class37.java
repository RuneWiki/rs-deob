import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class37 extends class196 {

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[[B")
    public byte[][] field758 = new byte[256][];

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public int field762 = 0;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[I")
    private int[] field748;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "[I")
    private int[] field769;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "[I")
    private int[] field779;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private static int field750 = 0;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "Lcd;")
    private static class23 field756 = class54.method414(")4u", -1);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lcd;")
    private static class23 field760 = class54.method414("lt", -1);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "[Lcd;")
    private static class23[] field746 = new class23[100];

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Lcd;")
    private static class23 field759 = class54.method414("img=", -1);

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lcd;")
    private static class23 field753 = class54.method414("str=", -1);

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    private static int field755 = 0;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "Lcd;")
    private static class23 field764 = class54.method414("shad=", -1);

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    private static int field761 = -1;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "Lcd;")
    private static class23 field754 = class54.method414("str", -1);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lcd;")
    private static class23 field747 = class54.method414("gt", -1);

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "Lcd;")
    private static class23 field772 = class54.method414("shad", -1);

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Lcd;")
    private static class23 field752 = class54.method414("col=", -1);

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Lcd;")
    private static class23 field770 = class54.method414(")4str", -1);

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "Lcd;")
    private static class23 field773 = class54.method414("u=", -1);

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
    private static int field775 = -1;

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "I")
    private static int field777 = -1;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Lcd;")
    private static class23 field763 = class54.method414("u", -1);

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
    private static int field778 = 256;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    private static int field745 = 0;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    private static int field767 = 0;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "Lcd;")
    private static class23 field768 = class54.method414(")4shad", -1);

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "Lcd;")
    private static class23 field766 = class54.method414(")4col", -1);

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "Lcd;")
    private static class23 field780 = class54.method414("br", -1);

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    private static int field751 = 256;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
    private static int field781 = -1;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "[B")
    private byte[] field776;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "[I")
    private int[] field774;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[Loe;")
    public static class130[] field749;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIII)V")
    public final void method265(class23 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method278(arg3, arg4);
            this.method267(arg0, arg1 - this.method273(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;II[I[I)V")
    private final void method266(class23 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field762;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field473; var10++) {
            int var11 = arg0.field480[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class23 var12 = arg0.method156(var7 + 1, var10, -109);
                    var7 = -1;
                    if (var12.method161(-87, field760)) {
                        var11 = 60;
                    } else {
                        if (!var12.method161(117, field747)) {
                            if (var12.method144(field759, 0)) {
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
                                    int var15 = var12.method136(4, -3331).method135((byte) -98);
                                    class130 var16 = field749[var15];
                                    var16.method836(arg1 + var13, this.field762 + var6 - var16.field2703 + var14);
                                    arg1 += var16.field2705;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method272(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field776 != null && var8 != -1) {
                        arg1 += this.field776[(var8 << 8) + var11];
                    }
                    int var17 = this.field769[var11];
                    int var18 = this.field779[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field745 > 0) {
                            field755 += field745;
                            arg1 += field755 >> 8;
                            field755 &= 0xFF;
                        }
                    } else if (field751 == 256) {
                        if (field775 != -1) {
                            this.method274(var11, this.field757[var11] + arg1 + var19 + 1, this.field748[var11] + var6 + 1 + var20, var17, var18, field775);
                        }
                        this.method196(var11, this.field757[var11] + arg1 + var19, this.field748[var11] + var6 + var20, var17, var18, field767);
                    } else {
                        if (field775 != -1) {
                            this.method276(var11, this.field757[var11] + arg1 + var19 + 1, this.field748[var11] + var6 + 1 + var20, var17, var18, field775, field751);
                        }
                        this.method195(var11, this.field757[var11] + arg1 + var19, this.field748[var11] + var6 + var20, var17, var18, field767, field751);
                    }
                    int var21 = this.field774[var11];
                    if (field777 != -1) {
                        class196.method1284(arg1, (int) ((double) this.field762 * 0.7D) + var6, var21, field777);
                    }
                    if (field781 != -1) {
                        class196.method1284(arg1, this.field762 + var6, var21, field781);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;II)V")
    private final void method267(class23 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field762;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field473; var7++) {
            int var8 = arg0.field480[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class23 var9 = arg0.method156(var5 + 1, var7, -111);
                    var5 = -1;
                    if (var9.method161(126, field760)) {
                        var8 = 60;
                    } else {
                        if (!var9.method161(118, field747)) {
                            if (var9.method144(field759, 0)) {
                                try {
                                    int var10 = var9.method136(4, -3331).method135((byte) -98);
                                    class130 var11 = field749[var10];
                                    var11.method836(arg1, this.field762 + var4 - var11.field2703);
                                    arg1 += var11.field2705;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method272(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field776 != null && var6 != -1) {
                        arg1 += this.field776[(var6 << 8) + var8];
                    }
                    int var12 = this.field769[var8];
                    int var13 = this.field779[var8];
                    if (var8 == 32) {
                        if (field745 > 0) {
                            field755 += field745;
                            arg1 += field755 >> 8;
                            field755 &= 0xFF;
                        }
                    } else if (field751 == 256) {
                        if (field775 != -1) {
                            this.method274(var8, this.field757[var8] + arg1 + 1, this.field748[var8] + var4 + 1, var12, var13, field775);
                        }
                        this.method196(var8, this.field757[var8] + arg1, this.field748[var8] + var4, var12, var13, field767);
                    } else {
                        if (field775 != -1) {
                            this.method276(var8, this.field757[var8] + arg1 + 1, this.field748[var8] + var4 + 1, var12, var13, field775, field751);
                        }
                        this.method195(var8, this.field757[var8] + arg1, this.field748[var8] + var4, var12, var13, field767, field751);
                    }
                    int var14 = this.field774[var8];
                    if (field777 != -1) {
                        class196.method1284(arg1, (int) ((double) this.field762 * 0.7D) + var4, var14, field777);
                    }
                    if (field781 != -1) {
                        class196.method1284(arg1, this.field762 + var4 + 1, var14, field781);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method268(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIIILjava/util/Random;I)I")
    public final int method269(class23 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method287(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field473];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field473; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method266(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lcd;IIII)V")
    public final void method270(class23 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method278(arg3, arg4);
            this.method267(arg0, arg1 - this.method273(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public static void method271() {
        field760 = null;
        field747 = null;
        field759 = null;
        field780 = null;
        field752 = null;
        field766 = null;
        field773 = null;
        field763 = null;
        field756 = null;
        field764 = null;
        field772 = null;
        field768 = null;
        field753 = null;
        field754 = null;
        field770 = null;
        field749 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;)V")
    private final void method272(class23 arg0) {
        try {
            if (arg0.method144(field752, 0)) {
                field767 = arg0.method136(4, -3331).method142((byte) 33, 16);
                return;
            }
            if (arg0.method161(126, field766)) {
                field767 = field750;
                return;
            }
            if (arg0.method144(field753, 0)) {
                field777 = arg0.method136(4, -3331).method142((byte) 33, 16);
                return;
            }
            if (arg0.method161(118, field754)) {
                field777 = 8388608;
                return;
            }
            if (arg0.method161(124, field770)) {
                field777 = -1;
                return;
            }
            if (arg0.method144(field773, 0)) {
                field781 = arg0.method136(2, -3331).method142((byte) 33, 16);
                return;
            }
            if (arg0.method161(126, field763)) {
                field781 = 0;
                return;
            }
            if (arg0.method161(117, field756)) {
                field781 = -1;
                return;
            }
            if (arg0.method144(field764, 0)) {
                field775 = arg0.method136(5, -3331).method142((byte) 33, 16);
                return;
            }
            if (arg0.method161(-10, field772)) {
                field775 = 0;
                return;
            }
            if (arg0.method161(-108, field768)) {
                field775 = field761;
                return;
            }
            if (arg0.method161(-118, field780)) {
                this.method287(field750, field761, field778);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lcd;)I")
    public final int method273(class23 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field473; var5++) {
            int var6 = arg0.field480[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class23 var7 = arg0.method156(var2 + 1, var5, -71);
                    var2 = -1;
                    if (var7.method161(122, field760)) {
                        var6 = 60;
                    } else {
                        if (!var7.method161(-12, field747)) {
                            if (var7.method144(field759, 0)) {
                                try {
                                    int var8 = var7.method136(4, -3331).method135((byte) -98);
                                    var4 += field749[var8].field2705;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field774[var6];
                    if (this.field776 != null && var3 != -1) {
                        var4 += this.field776[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(IIIIII)V")
    private final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class196.field3872 * arg2 + arg1;
        int var8 = class196.field3872 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class196.field3873) {
            int var11 = class196.field3873 - arg2;
            arg4 -= var11;
            arg2 = class196.field3873;
            var10 += arg3 * var11;
            var7 += class196.field3872 * var11;
        }
        if (arg2 + arg4 > class196.field3867) {
            arg4 -= arg2 + arg4 - class196.field3867;
        }
        if (arg1 < class196.field3870) {
            int var12 = class196.field3870 - arg1;
            arg3 -= var12;
            arg1 = class196.field3870;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class196.field3869) {
            int var13 = arg1 + arg3 - class196.field3869;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method280(class196.field3871, this.field758[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B)V")
    private final void method275(byte[] arg0) {
        this.field774 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field774.length; var2++) {
                this.field774[var2] = arg0[var2] & 0xFF;
            }
            this.field762 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field774[var4] = arg0[var3++] & 0xFF;
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
        this.field776 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field776[(var13 << 8) + var14] = (byte) method268(var9, var11, var6, this.field774, var5, var13, var14);
                    }
                }
            }
        }
        this.field762 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIIIII)V")
    private final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class196.field3872 * arg2 + arg1;
        int var9 = class196.field3872 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class196.field3873) {
            int var12 = class196.field3873 - arg2;
            arg4 -= var12;
            arg2 = class196.field3873;
            var11 += arg3 * var12;
            var8 += class196.field3872 * var12;
        }
        if (arg2 + arg4 > class196.field3867) {
            arg4 -= arg2 + arg4 - class196.field3867;
        }
        if (arg1 < class196.field3870) {
            int var13 = class196.field3870 - arg1;
            arg3 -= var13;
            arg1 = class196.field3870;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class196.field3869) {
            int var14 = arg1 + arg3 - class196.field3869;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method289(class196.field3871, this.field758[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;I)V")
    private final void method277(class23 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method143(-41); var5++) {
            int var6 = arg0.method160(var5, 255);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field745 = (arg1 - this.method273(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    private final void method278(int arg0, int arg1) {
        field777 = -1;
        field781 = -1;
        field761 = arg1;
        field775 = arg1;
        field750 = arg0;
        field767 = arg0;
        field778 = 256;
        field751 = 256;
        field745 = 0;
        field755 = 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIIIII)V")
    public final void method279(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method278(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field473];
        for (int var11 = 0; var11 < arg0.field473; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method266(arg0, arg1 - this.method273(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method280(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIIIIIIII)I")
    public final int method281(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method292(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;[I[Lcd;)I")
    private final int method282(class23 arg0, int[] arg1, class23[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class23 var6 = class181.method1122(124, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method143(-41);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method160(var14, 255);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class23 var16 = arg0.method156(var10 + 1, var14, -113);
                    var10 = -1;
                    var6.method154((byte) 84, 60);
                    var6.method155(127, var16);
                    var6.method154((byte) 84, 62);
                    if (var16.method161(127, field780)) {
                        arg2[var12++] = var6.method156(var5, var6.method143(-41), -93);
                        var5 = var6.method143(-41);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method161(-108, field760)) {
                        var4 += this.method286(60);
                        if (this.field776 != null && var11 != -1) {
                            var4 += this.field776[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method161(-66, field747)) {
                        var4 += this.method286(62);
                        if (this.field776 != null && var11 != -1) {
                            var4 += this.field776[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method144(field759, 0)) {
                        try {
                            int var17 = var16.method136(4, -3331).method135((byte) -98);
                            var4 += field749[var17].field2705;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method154((byte) 84, var15);
                        var4 += this.method286(var15);
                        if (this.field776 != null && var11 != -1) {
                            var4 += this.field776[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method143(-41);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method156(var5, var7 - var9, -83);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method143(-41);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method143(-41) > var5) {
            arg2[var12++] = var6.method156(var5, var6.method143(-41), -103);
        }
        return var12;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lcd;I)I")
    public final int method283(class23 arg0, int arg1) {
        int var3 = this.method282(arg0, new int[] { arg1 }, field746);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method273(field746[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Lcd;)Lcd;")
    public static final class23 method284(class23 arg0) {
        int var1 = arg0.method143(-41);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field480[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class23 var4 = new class23();
        var4.field473 = var1 + var2;
        var4.field480 = new byte[var4.field473];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field480[var6];
            if (var7 == 60) {
                var4.field480[var5++] = 60;
                var4.field480[var5++] = 108;
                var4.field480[var5++] = 116;
                var4.field480[var5++] = 62;
            } else if (var7 == 62) {
                var4.field480[var5++] = 60;
                var4.field480[var5++] = 103;
                var4.field480[var5++] = 116;
                var4.field480[var5++] = 62;
            } else {
                var4.field480[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIIII)V")
    public final void method285(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method278(arg3, arg4);
        int[] var7 = new int[arg0.field473];
        int[] var8 = new int[arg0.field473];
        for (int var9 = 0; var9 < arg0.field473; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method266(arg0, arg1 - this.method273(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)I")
    private final int method286(int arg0) {
        return this.field774[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    private final void method287(int arg0, int arg1, int arg2) {
        field777 = -1;
        field781 = -1;
        field761 = arg1;
        field775 = arg1;
        field750 = arg0;
        field767 = arg0;
        field778 = arg2;
        field751 = arg2;
        field745 = 0;
        field755 = 0;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Lcd;I)I")
    public final int method288(class23 arg0, int arg1) {
        return this.method282(arg0, new int[] { arg1 }, field746);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method289(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lcd;IIIII)V")
    public final void method290(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method278(arg3, arg4);
        int[] var7 = new int[arg0.field473];
        for (int var8 = 0; var8 < arg0.field473; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method266(arg0, arg1 - this.method273(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Lcd;IIII)V")
    public final void method291(class23 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method278(arg3, arg4);
            this.method267(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lcd;IIIIIIIIII)I")
    private final int method292(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method287(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field762;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field771 + this.field765 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method282(arg0, var12, field746);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field765 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field765 - this.field771 - (var13 - 1) * arg10) / 2 + this.field765 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field771 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field765 - this.field771 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field765 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method267(field746[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method267(field746[var16], arg1 + (arg3 - this.method273(field746[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method267(field746[var16], arg1 + arg3 - this.method273(field746[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method267(field746[var16], arg1, var14);
            } else {
                this.method277(field746[var16], arg3);
                this.method267(field746[var16], arg1, var14);
                field745 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class37(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field757 = arg1;
        this.field748 = arg2;
        this.field769 = arg3;
        this.field779 = arg4;
        this.method275(arg0);
        this.field758 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field748[var10] < var8 && this.field779[var10] != 0) {
                var8 = this.field748[var10];
            }
            if (this.field779[var10] + this.field748[var10] > var9) {
                var9 = this.field779[var10] + this.field748[var10];
            }
        }
        this.field765 = this.field762 - var8;
        this.field771 = var9 - this.field762;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(IIIIII)V")
    public abstract void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
    public class37(byte[] arg0) {
        this.method275(arg0);
    }
}
