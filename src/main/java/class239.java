import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class239 extends class311 {

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
    public boolean field3813 = false;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field3827 = 0;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field3837 = 0;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "B")
    private byte field3840 = 0;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "B")
    private byte field3855 = 0;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    private int field3856 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[I")
    private int[] field3842;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "[I")
    public int[] field3826;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "[I")
    public int[] field3849;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "[I")
    public int[] field3852;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
    private int[] field3848;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[S")
    private short[] field3836;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "[S")
    private short[] field3814;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "[S")
    private short[] field3830;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "[S")
    private short[] field3841;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "[S")
    private short[] field3845;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "[F")
    private float[] field3828;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "[F")
    private float[] field3851;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[S")
    private short[] field3812;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[B")
    private byte[] field3820;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[S")
    private short[] field3815;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "[S")
    private short[] field3834;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "[S")
    private short[] field3835;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "[S")
    private short[] field3831;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "[B")
    private byte[] field3824;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[S")
    private short[] field3817;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lae;")
    public class278 field3839;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Lql;")
    public class17 field3843;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Lql;")
    private class17 field3818;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "Lql;")
    private class17 field3819;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lql;")
    private class17 field3821;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Lql;")
    private class17 field3850;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "S")
    private short field3853;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "S")
    private short field3823;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "[S")
    private short[] field3832;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
    private int[] field3844;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Lwa;")
    private static class82 field3822 = new class82(10000);

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Ltd;")
    private static class239 field3846 = new class239();

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "Ltd;")
    private static class239 field3854 = new class239();

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "Ltd;")
    private static class239 field3857 = new class239();

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "Ltd;")
    private static class239 field3858 = new class239();

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "Ltd;")
    private static class239 field3859 = new class239();

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "Ltd;")
    private static class239 field3860 = new class239();

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "[I")
    private static int[] field3861 = new int[1];

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "[I")
    private static int[] field3865 = new int[1];

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "Z")
    private static boolean field3872 = false;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "F")
    private static float field3862;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "F")
    private static float field3864;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "F")
    private static float field3867;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "F")
    private static float field3868;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "F")
    private static float field3870;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "F")
    private static float field3871;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    private static int field3863;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    private static int field3866;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
    private static int field3869;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "Lde;")
    private class62 field3847;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lvi;")
    private class6 field3816;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3838;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "[J")
    private static long[] field3825;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[[I")
    private int[][] field3829;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
    private int[][] field3833;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FFF)I", line = 6)
    private static final int method1593(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZ)Lak;", line = 40)
    public final class311 method1594(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1629(arg0, arg1, arg2, field3858, field3857);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 43)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
        if (this.field3837 == 0) {
            return;
        }
        if (!this.field3839.field4649) {
            this.method1623();
        }
        short var13 = this.field3839.field4644;
        short var14 = this.field3839.field4642;
        short var15 = this.field3839.field4643;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class312.field5336) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class21.field301) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class273.field4571) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class218.field3495) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class200.field3104[arg0];
            var27 = class200.field3115[arg0];
        }
        if (arg8 > 0L && class142.field2177 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class277.field4635 >= var28 && class277.field4635 <= var29 && class236.field3771 >= var30 && class236.field3771 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field3839.field4646;
                short var37 = this.field3839.field4645;
                short var38 = this.field3839.field4648;
                short var39 = this.field3839.field4647;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class277.field4635 >= var32 && class277.field4635 <= var33 && class236.field3771 >= var34 && class236.field3771 <= var35) {
                    if (this.field5333) {
                        class190.field2979[class9.field102++] = arg8;
                    } else {
                        if (field3865.length < this.field3837) {
                            field3865 = new int[this.field3837];
                            field3861 = new int[this.field3837];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field3827) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field3856) {
                                        break label118;
                                    }
                                    short var80 = this.field3815[var79];
                                    short var81 = this.field3834[var79];
                                    short var82 = this.field3835[var79];
                                    if (this.method1634(class277.field4635, class236.field3771, field3861[var80], field3861[var81], field3861[var82], field3865[var80], field3865[var81], field3865[var82])) {
                                        class190.field2979[class9.field102++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field3826[var59];
                            int var61 = this.field3849[var59];
                            int var62 = this.field3852[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field3842[var59];
                            int var76 = this.field3842[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field3832[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field3865[var78] = var73;
                                field3861[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class255.field4181;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1641();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!td", name = "m", descriptor = "()V", line = 318)
    public final void method1595() {
        if (this.field3814 == null) {
            this.method1647();
            return;
        }
        for (int var1 = 0; var1 < this.field3827; var1++) {
            int var2 = this.field3852[var1];
            this.field3852[var1] = this.field3826[var1];
            this.field3826[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3837; var3++) {
            short var4 = this.field3841[var3];
            this.field3841[var3] = this.field3814[var3];
            this.field3814[var3] = (short) (-var4);
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "n", descriptor = "()I", line = 356)
    public final int method1596() {
        return this.field3853;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 361)
    public final void method1597(int arg0) {
        int var2 = class200.field3104[arg0];
        int var3 = class200.field3115[arg0];
        for (int var4 = 0; var4 < this.field3827; var4++) {
            int var5 = this.field3849[var4] * var2 + this.field3826[var4] * var3 >> 16;
            this.field3849[var4] = this.field3849[var4] * var3 - this.field3826[var4] * var2 >> 16;
            this.field3826[var4] = var5;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()I", line = 380)
    public final int method1598() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4645;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I", line = 386)
    public final int method1599() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4647;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Z", line = 392)
    public final boolean method673() {
        return this.field3813 && this.field3826 != null && this.field3814 != null;
    }

    @OriginalMember(owner = "client!td", name = "k", descriptor = "()I", line = 395)
    public final int method1600() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4648;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V", line = 408)
    public final void method1601(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3827; var4++) {
            this.field3826[var4] += arg0;
            this.field3849[var4] += arg1;
            this.field3852[var4] += arg2;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ZZZ)Lak;", line = 422)
    public final class311 method1602(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1629(arg0, arg1, arg2, field3860, field3859);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII[FFIF)V", line = 425)
    private static final void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3867 = var16;
        field3870 = var17;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 4542)
    private class239() {
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lgb;IIZ)V", line = 4544)
    public class239(class169 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2612];
        this.field3842 = new int[arg0.field2650 + 1];
        for (int var6 = 0; var6 < arg0.field2612; var6++) {
            if ((arg0.field2622 == null || arg0.field2622[var6] != 2) && (arg0.field2621 == null || arg0.field2621[var6] == -1 || !class200.field3102.method97(arg0.field2621[var6] & 0xFFFF, -65))) {
                var5[this.field3856++] = var6;
                this.field3842[arg0.field2628[var6]]++;
                this.field3842[arg0.field2641[var6]]++;
                this.field3842[arg0.field2627[var6]]++;
            }
        }
        long[] var7 = new long[this.field3856];
        for (int var8 = 0; var8 < this.field3856; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2621 != null) {
                var14 = arg0.field2621[var9];
                if (var14 != -1) {
                    var12 = class200.field3102.method89(var14 & 0xFFFF, 255);
                    var13 = class200.field3102.method88(var14 & 0xFFFF, false);
                }
            }
            boolean var15 = arg0.field2606 != null && arg0.field2606[var9] != 0 || var14 != -1 && !class200.field3102.method92((byte) 88, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2652 != null) {
                var10 += arg0.field2652[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class13.method90(true, var7, var5);
        this.field3827 = arg0.field2650;
        this.field3826 = arg0.field2648;
        this.field3849 = arg0.field2644;
        this.field3852 = arg0.field2655;
        this.field3848 = arg0.field2623;
        this.field3836 = arg0.field2656;
        int var20 = this.field3856 * 3;
        this.field3814 = new short[var20];
        this.field3830 = new short[var20];
        this.field3841 = new short[var20];
        this.field3845 = new short[var20];
        this.field3828 = new float[var20];
        this.field3851 = new float[var20];
        this.field3812 = new short[this.field3856];
        this.field3820 = new byte[this.field3856];
        this.field3815 = new short[this.field3856];
        this.field3834 = new short[this.field3856];
        this.field3835 = new short[this.field3856];
        this.field3831 = new short[this.field3856];
        if (arg0.field2610 != null) {
            this.field3824 = new byte[this.field3856];
        }
        if (arg0.field2618 != null) {
            this.field3817 = new short[this.field3856];
        }
        this.field3839 = new class278();
        this.field3843 = new class17();
        this.field3818 = new class17();
        if (class25.field360) {
            this.field3819 = new class17();
        }
        this.field3821 = new class17();
        this.field3850 = new class17();
        this.field3853 = (short) arg1;
        this.field3823 = (short) arg2;
        this.field3832 = new short[var20];
        field3825 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2650; var22++) {
            int var23 = this.field3842[var22];
            this.field3842[var22] = var21;
            var21 += var23;
        }
        this.field3842[arg0.field2650] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2629 != null) {
            int var28 = arg0.field2625;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3856; var36++) {
                int var37 = var5[var36];
                if (arg0.field2629[var37] != -1) {
                    int var38 = arg0.field2629[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2628[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2641[var37];
                        } else {
                            var40 = arg0.field2627[var37];
                        }
                        int var41 = arg0.field2648[var40];
                        int var42 = arg0.field2644[var40];
                        int var43 = arg0.field2655[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2620[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2651[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2645[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2651[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2645[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2614[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2651[var44] / 1024.0F;
                        var49 = (float) arg0.field2645[var44] / 1024.0F;
                        var48 = (float) arg0.field2614[var44] / 1024.0F;
                    }
                    var27[var44] = method1606(arg0.field2647[var44], arg0.field2609[var44], arg0.field2654[var44], arg0.field2608[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3856; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2633[var51] & 0xFFFF;
            short var53;
            if (arg0.field2621 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2621[var51];
            }
            int var54;
            if (arg0.field2629 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2629[var51];
            }
            int var55;
            if (arg0.field2606 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2606[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2620[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2628[var51];
                        int var67 = arg0.field2641[var51];
                        int var68 = arg0.field2627[var51];
                        short var69 = arg0.field2647[var54];
                        short var70 = arg0.field2609[var54];
                        short var71 = arg0.field2654[var54];
                        float var72 = (float) arg0.field2648[var69];
                        float var73 = (float) arg0.field2644[var69];
                        float var74 = (float) arg0.field2655[var69];
                        float var75 = (float) arg0.field2648[var70] - var72;
                        float var76 = (float) arg0.field2644[var70] - var73;
                        float var77 = (float) arg0.field2655[var70] - var74;
                        float var78 = (float) arg0.field2648[var71] - var72;
                        float var79 = (float) arg0.field2644[var71] - var73;
                        float var80 = (float) arg0.field2655[var71] - var74;
                        float var81 = (float) arg0.field2648[var66] - var72;
                        float var82 = (float) arg0.field2644[var66] - var73;
                        float var83 = (float) arg0.field2655[var66] - var74;
                        float var84 = (float) arg0.field2648[var67] - var72;
                        float var85 = (float) arg0.field2644[var67] - var73;
                        float var86 = (float) arg0.field2655[var67] - var74;
                        float var87 = (float) arg0.field2648[var68] - var72;
                        float var88 = (float) arg0.field2644[var68] - var73;
                        float var89 = (float) arg0.field2655[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2628[var51];
                        int var102 = arg0.field2641[var51];
                        int var103 = arg0.field2627[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2630[var54];
                        float var109 = (float) arg0.field2640[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2614[var54] & 0xFFFF) / 1024.0F;
                            method1603(arg0.field2648[var101], arg0.field2644[var101], arg0.field2655[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3867;
                            var57 = field3870;
                            method1603(arg0.field2648[var102], arg0.field2644[var102], arg0.field2655[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3867;
                            var59 = field3870;
                            method1603(arg0.field2648[var103], arg0.field2644[var103], arg0.field2655[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3867;
                            var61 = field3870;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2615[var54] / 256.0F;
                            float var113 = (float) arg0.field2632[var54] / 256.0F;
                            int var114 = arg0.field2648[var102] - arg0.field2648[var101];
                            int var115 = arg0.field2644[var102] - arg0.field2644[var101];
                            int var116 = arg0.field2655[var102] - arg0.field2655[var101];
                            int var117 = arg0.field2648[var103] - arg0.field2648[var101];
                            int var118 = arg0.field2644[var103] - arg0.field2644[var101];
                            int var119 = arg0.field2655[var103] - arg0.field2655[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2651[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2645[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2614[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1593(var126, var127, var128);
                            method1618(arg0.field2648[var101], arg0.field2644[var101], arg0.field2655[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3868;
                            var57 = field3862;
                            method1618(arg0.field2648[var102], arg0.field2644[var102], arg0.field2655[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3868;
                            var59 = field3862;
                            method1618(arg0.field2648[var103], arg0.field2644[var103], arg0.field2655[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3868;
                            var61 = field3862;
                        } else if (var65 == 3) {
                            method1612(arg0.field2648[var101], arg0.field2644[var101], arg0.field2655[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3871;
                            var57 = field3864;
                            method1612(arg0.field2648[var102], arg0.field2644[var102], arg0.field2655[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3871;
                            var59 = field3864;
                            method1612(arg0.field2648[var103], arg0.field2644[var103], arg0.field2655[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3871;
                            var61 = field3864;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1148();
            byte var129;
            if (arg0.field2622 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2622[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2628[var51];
                class121 var133 = arg0.field2635[var132];
                this.field3815[var50] = this.method1607(arg0, var132, var130, var133.field1897, var133.field1885, var133.field1896, var133.field1887, var56, var57);
                int var134 = arg0.field2641[var51];
                class121 var135 = arg0.field2635[var134];
                this.field3834[var50] = this.method1607(arg0, var134, (long) var62 + var130, var135.field1897, var135.field1885, var135.field1896, var135.field1887, var58, var59);
                int var136 = arg0.field2627[var51];
                class121 var137 = arg0.field2635[var136];
                this.field3835[var50] = this.method1607(arg0, var136, (long) var63 + var130, var137.field1897, var137.field1885, var137.field1896, var137.field1887, var60, var61);
            } else if (var129 == 1) {
                class251 var138 = arg0.field2649[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4102 > 0 ? 1024 : 2048) + (var138.field4103 + 256 << 12) + (var138.field4100 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3815[var50] = this.method1607(arg0, arg0.field2628[var51], var139, var138.field4102, var138.field4103, var138.field4100, 0, var56, var57);
                this.field3834[var50] = this.method1607(arg0, arg0.field2641[var51], (long) var62 + var139, var138.field4102, var138.field4103, var138.field4100, 0, var58, var59);
                this.field3835[var50] = this.method1607(arg0, arg0.field2627[var51], (long) var63 + var139, var138.field4102, var138.field4103, var138.field4100, 0, var60, var61);
            }
            if (arg0.field2621 == null) {
                this.field3831[var50] = -1;
            } else {
                this.field3831[var50] = arg0.field2621[var51];
            }
            if (this.field3824 != null) {
                this.field3824[var50] = (byte) arg0.field2610[var51];
            }
            this.field3812[var50] = arg0.field2633[var51];
            if (arg0.field2606 != null) {
                this.field3820[var50] = arg0.field2606[var51];
            }
            if (arg0.field2618 != null) {
                this.field3817[var50] = arg0.field2618[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3856; var143++) {
            short var144 = this.field3831[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3844 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3856; var147++) {
            short var148 = this.field3831[var147];
            if (var146 != var148) {
                this.field3844[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3844[var145] = this.field3856;
        field3825 = null;
        this.field3814 = method1635(this.field3814, this.field3837);
        this.field3830 = method1635(this.field3830, this.field3837);
        this.field3841 = method1635(this.field3841, this.field3837);
        this.field3845 = method1635(this.field3845, this.field3837);
        this.field3828 = method1627(this.field3828, this.field3837);
        this.field3851 = method1627(this.field3851, this.field3837);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lth;IIIZ)V", line = 475)
    public final void method674(class86 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class239 var6 = (class239) arg0;
        if (this.field3856 == 0 || var6.field3856 == 0) {
            return;
        }
        int var7 = var6.field3827;
        int[] var8 = var6.field3826;
        int[] var9 = var6.field3849;
        int[] var10 = var6.field3852;
        short[] var11 = var6.field3814;
        short[] var12 = var6.field3830;
        short[] var13 = var6.field3841;
        short[] var14 = var6.field3845;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3847 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3847.field994;
            var16 = this.field3847.field996;
            var17 = this.field3847.field995;
            var18 = this.field3847.field993;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3847 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3847.field994;
            var20 = var6.field3847.field996;
            var21 = var6.field3847.field995;
            var22 = var6.field3847.field993;
        }
        int[] var23 = var6.field3842;
        short[] var24 = var6.field3832;
        if (!var6.field3839.field4649) {
            var6.method1623();
        }
        short var25 = var6.field3839.field4642;
        short var26 = var6.field3839.field4643;
        short var27 = var6.field3839.field4646;
        short var28 = var6.field3839.field4645;
        short var29 = var6.field3839.field4648;
        short var30 = var6.field3839.field4647;
        for (int var31 = 0; var31 < this.field3827; var31++) {
            int var32 = this.field3849[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3826[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3852[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3842[var31];
                        int var37 = this.field3842[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3832[var38] - 1;
                            if (var35 == -1 || this.field3845[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3847 = new class62();
                                            var15 = this.field3847.field994 = class262.method1845(23032, this.field3814);
                                            var16 = this.field3847.field996 = class262.method1845(23032, this.field3830);
                                            var17 = this.field3847.field995 = class262.method1845(23032, this.field3841);
                                            var18 = this.field3847.field993 = class262.method1845(23032, this.field3845);
                                        }
                                        if (var19 == null) {
                                            class62 var44 = var6.field3847 = new class62();
                                            var19 = var44.field994 = class262.method1845(23032, var11);
                                            var20 = var44.field996 = class262.method1845(23032, var12);
                                            var21 = var44.field995 = class262.method1845(23032, var13);
                                            var22 = var44.field993 = class262.method1845(23032, var14);
                                        }
                                        short var45 = this.field3814[var35];
                                        short var46 = this.field3830[var35];
                                        short var47 = this.field3841[var35];
                                        short var48 = this.field3845[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3842[var31];
                                        int var58 = this.field3842[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3832[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIJ)V", line = 712)
    public final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field3837 == 0) {
            return;
        }
        GL var10 = class255.field4181;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1641();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ISIB)I", line = 736)
    private static final int method1605(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class200.field3098[class270.method1914(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class200.field3102.method98(93, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class200.field3102.method91(90, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIFFF)[F", line = 795)
    private static final float[] method1606(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lgb;IJIIIIFF)S", line = 869)
    private final short method1607(class169 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3842[arg1];
        int var12 = this.field3842[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3832[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3825[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3832[var13] = (short) (this.field3837 + 1);
        field3825[var13] = arg2;
        this.field3814[this.field3837] = (short) arg3;
        this.field3830[this.field3837] = (short) arg4;
        this.field3841[this.field3837] = (short) arg5;
        this.field3845[this.field3837] = (short) arg6;
        this.field3828[this.field3837] = arg7;
        this.field3851[this.field3837] = arg8;
        return (short) (this.field3837++);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 906)
    public final void method1608(int arg0) {
        int var2 = class200.field3104[arg0];
        int var3 = class200.field3115[arg0];
        for (int var4 = 0; var4 < this.field3827; var4++) {
            int var5 = this.field3852[var4] * var2 + this.field3826[var4] * var3 >> 16;
            this.field3852[var4] = this.field3852[var4] * var3 - this.field3826[var4] * var2 >> 16;
            this.field3826[var4] = var5;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[IIIIZI[I)V", line = 926)
    public final void method1609(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field3863 = 0;
            field3869 = 0;
            field3866 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3829.length) {
                    int[] var16 = this.field3829[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3836 == null || (arg6 & this.field3836[var18]) != 0) {
                            field3863 += this.field3826[var18];
                            field3869 += this.field3849[var18];
                            field3866 += this.field3852[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field3863 = field3863 / var13 + var10;
                field3869 = field3869 / var13 + var11;
                field3866 = field3866 / var13 + var12;
                field3872 = true;
            } else {
                field3863 = var10;
                field3869 = var11;
                field3866 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3829.length) {
                    int[] var27 = this.field3829[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3836 == null || (arg6 & this.field3836[var29]) != 0) {
                            this.field3826[var29] += var22;
                            this.field3849[var29] += var23;
                            this.field3852[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field3829.length) {
                        int[] var92 = this.field3829[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field3836 == null || (arg6 & this.field3836[var94]) != 0) {
                                this.field3826[var94] -= field3863;
                                this.field3849[var94] -= field3869;
                                this.field3852[var94] -= field3866;
                                if (arg4 != 0) {
                                    int var95 = class200.field3104[arg4];
                                    int var96 = class200.field3115[arg4];
                                    int var97 = this.field3849[var94] * var95 + this.field3826[var94] * var96 + 32767 >> 16;
                                    this.field3849[var94] = this.field3849[var94] * var96 + 32767 - this.field3826[var94] * var95 >> 16;
                                    this.field3826[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class200.field3104[arg2];
                                    int var99 = class200.field3115[arg2];
                                    int var100 = this.field3849[var94] * var99 + 32767 - this.field3852[var94] * var98 >> 16;
                                    this.field3852[var94] = this.field3852[var94] * var99 + this.field3849[var94] * var98 + 32767 >> 16;
                                    this.field3849[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class200.field3104[arg3];
                                    int var102 = class200.field3115[arg3];
                                    int var103 = this.field3852[var94] * var101 + this.field3826[var94] * var102 + 32767 >> 16;
                                    this.field3852[var94] = this.field3852[var94] * var102 + 32767 - this.field3826[var94] * var101 >> 16;
                                    this.field3826[var94] = var103;
                                }
                                this.field3826[var94] += field3863;
                                this.field3849[var94] += field3869;
                                this.field3852[var94] += field3866;
                            }
                        }
                    }
                }
                if (arg5 && this.field3814 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field3829.length) {
                            int[] var106 = this.field3829[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field3836 == null || (arg6 & this.field3836[var108]) != 0) {
                                    int var109 = this.field3842[var108];
                                    int var110 = this.field3842[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field3832[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class200.field3104[arg4];
                                            int var114 = class200.field3115[arg4];
                                            int var115 = this.field3830[var112] * var113 + this.field3814[var112] * var114 + 32767 >> 16;
                                            this.field3830[var112] = (short) (this.field3830[var112] * var114 + 32767 - this.field3814[var112] * var113 >> 16);
                                            this.field3814[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class200.field3104[arg2];
                                            int var117 = class200.field3115[arg2];
                                            int var118 = this.field3830[var112] * var117 + 32767 - this.field3841[var112] * var116 >> 16;
                                            this.field3841[var112] = (short) (this.field3841[var112] * var117 + this.field3830[var112] * var116 + 32767 >> 16);
                                            this.field3830[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class200.field3104[arg3];
                                            int var120 = class200.field3115[arg3];
                                            int var121 = this.field3841[var112] * var119 + this.field3814[var112] * var120 + 32767 >> 16;
                                            this.field3841[var112] = (short) (this.field3841[var112] * var120 + 32767 - this.field3814[var112] * var119 >> 16);
                                            this.field3814[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3819 != null) {
                        this.field3819.field241 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field3872) {
                    int var36 = arg7[6] * field3866 + arg7[0] * field3863 + arg7[3] * field3869 + 16384 >> 15;
                    int var37 = arg7[7] * field3866 + arg7[1] * field3863 + arg7[4] * field3869 + 16384 >> 15;
                    int var38 = arg7[8] * field3866 + arg7[2] * field3863 + arg7[5] * field3869 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field3863 = var39;
                    field3869 = var40;
                    field3866 = var41;
                    field3872 = false;
                }
                int[] var42 = new int[9];
                int var43 = class200.field3115[arg2] >> 1;
                int var44 = class200.field3104[arg2] >> 1;
                int var45 = class200.field3115[arg3] >> 1;
                int var46 = class200.field3104[arg3] >> 1;
                int var47 = class200.field3115[arg4] >> 1;
                int var48 = class200.field3104[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field3866 + var42[0] * -field3863 + var42[1] * -field3869 + 16384 >> 15;
                int var52 = var42[5] * -field3866 + var42[3] * -field3863 + var42[4] * -field3869 + 16384 >> 15;
                int var53 = var42[8] * -field3866 + var42[6] * -field3863 + var42[7] * -field3869 + 16384 >> 15;
                int var54 = field3863 + var51;
                int var55 = field3869 + var52;
                int var56 = field3866 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field3829.length) {
                        int[] var81 = this.field3829[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field3836 == null || (arg6 & this.field3836[var83]) != 0) {
                                int var84 = this.field3852[var83] * var68[2] + this.field3849[var83] * var68[1] + this.field3826[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field3852[var83] * var68[5] + this.field3849[var83] * var68[4] + this.field3826[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field3852[var83] * var68[8] + this.field3849[var83] * var68[7] + this.field3826[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field3826[var83] = var87;
                                this.field3849[var83] = var88;
                                this.field3852[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3829.length) {
                        int[] var174 = this.field3829[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3836 == null || (arg6 & this.field3836[var176]) != 0) {
                                this.field3826[var176] -= field3863;
                                this.field3849[var176] -= field3869;
                                this.field3852[var176] -= field3866;
                                this.field3826[var176] = this.field3826[var176] * arg2 >> 7;
                                this.field3849[var176] = this.field3849[var176] * arg3 >> 7;
                                this.field3852[var176] = this.field3852[var176] * arg4 >> 7;
                                this.field3826[var176] += field3863;
                                this.field3849[var176] += field3869;
                                this.field3852[var176] += field3866;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field3872) {
                    int var128 = arg7[6] * field3866 + arg7[0] * field3863 + arg7[3] * field3869 + 16384 >> 15;
                    int var129 = arg7[7] * field3866 + arg7[1] * field3863 + arg7[4] * field3869 + 16384 >> 15;
                    int var130 = arg7[8] * field3866 + arg7[2] * field3863 + arg7[5] * field3869 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field3863 = var131;
                    field3869 = var132;
                    field3866 = var133;
                    field3872 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field3863 * var134 + 16384 >> 15;
                int var138 = -field3869 * var135 + 16384 >> 15;
                int var139 = -field3866 * var136 + 16384 >> 15;
                int var140 = field3863 + var137;
                int var141 = field3869 + var138;
                int var142 = field3866 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field3829.length) {
                        int[] var163 = this.field3829[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field3836 == null || (arg6 & this.field3836[var165]) != 0) {
                                int var166 = this.field3852[var165] * var150[2] + this.field3849[var165] * var150[1] + this.field3826[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field3852[var165] * var150[5] + this.field3849[var165] * var150[4] + this.field3826[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field3852[var165] * var150[8] + this.field3849[var165] * var150[7] + this.field3826[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field3826[var165] = var169;
                                this.field3849[var165] = var170;
                                this.field3852[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3833 != null && this.field3820 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field3833.length) {
                        int[] var179 = this.field3833[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field3817 == null || (arg6 & this.field3817[var181]) != 0) {
                                int var182 = (this.field3820[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field3820[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field3818.field241 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3833 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field3833.length) {
                    int[] var185 = this.field3833[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field3817 == null || (arg6 & this.field3817[var187]) != 0) {
                            int var188 = this.field3812[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field3812[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field3818.field241 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I", line = 1716)
    public final int method679() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4642;
    }

    @OriginalMember(owner = "client!td", name = "o", descriptor = "()V", line = 1722)
    public final void method1610() {
        int var10002;
        if (this.field3848 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3827; var3++) {
                int var4 = this.field3848[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3829 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3829[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3827) {
                int var7 = this.field3848[var6] & 0xFF;
                this.field3829[var7][var1[var7]++] = var6++;
            }
            this.field3848 = null;
        }
        if (this.field3824 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3856; var10++) {
            int var11 = this.field3824[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3833 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3833[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3856) {
            int var14 = this.field3824[var13] & 0xFF;
            this.field3833[var14][var8[var14]++] = var13++;
        }
        this.field3824 = null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 1814)
    public final void method1611(int arg0) {
        this.field3823 = (short) arg0;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII[FIF)V", line = 1820)
    private static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3871 = var16;
        field3864 = var17;
    }

    @OriginalMember(owner = "client!td", name = "p", descriptor = "()V", line = 1868)
    public final void method1613() {
        if (this.field3814 == null) {
            this.method1616();
            return;
        }
        for (int var1 = 0; var1 < this.field3827; var1++) {
            this.field3826[var1] = -this.field3826[var1];
            this.field3852[var1] = -this.field3852[var1];
        }
        for (int var2 = 0; var2 < this.field3837; var2++) {
            this.field3814[var2] = (short) (-this.field3814[var2]);
            this.field3841[var2] = (short) (-this.field3841[var2]);
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V", line = 1904)
    public final void method1614(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3827; var4++) {
            this.field3826[var4] = this.field3826[var4] * arg0 >> 7;
            this.field3849[var4] = this.field3849[var4] * arg1 >> 7;
            this.field3852[var4] = this.field3852[var4] * arg2 >> 7;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(ZZZ)Lak;", line = 1917)
    public final class311 method1615(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1629(arg0, arg1, arg2, field3854, field3846);
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V", line = 1924)
    public final void method1616() {
        for (int var1 = 0; var1 < this.field3827; var1++) {
            this.field3826[var1] = -this.field3826[var1];
            this.field3852[var1] = -this.field3852[var1];
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "q", descriptor = "()V", line = 1937)
    private final void method1617() {
        if (field3822.field1280.length < this.field3837 * 12) {
            field3822 = new class82((this.field3837 + 100) * 12);
        } else {
            field3822.field1301 = 0;
        }
        if (class255.field4167) {
            for (int var1 = 0; var1 < this.field3856; var1++) {
                field3822.method577(-122, this.field3815[var1]);
                field3822.method577(-126, this.field3834[var1]);
                field3822.method577(-120, this.field3835[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field3856; var2++) {
                field3822.method596(this.field3815[var2], 98);
                field3822.method596(this.field3834[var2], 68);
                field3822.method596(this.field3835[var2], 77);
            }
        }
        if (!class255.field4190) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3822.field1301);
            var5.put(field3822.field1280, 0, field3822.field1301);
            var5.flip();
            this.field3850.field241 = true;
            this.field3850.field245 = var5;
            this.field3850.field244 = null;
            return;
        }
        class6 var3 = new class6();
        ByteBuffer var4 = ByteBuffer.wrap(field3822.field1280, 0, field3822.field1301);
        var3.method42(var4);
        this.field3850.field241 = true;
        this.field3850.field245 = null;
        this.field3850.field244 = var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1995)
    private static final void method1618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3868 = var18;
        field3862 = var19;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V", line = 2073)
    public final void method1619(int arg0) {
        this.field3853 = (short) arg0;
        this.field3818.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "r", descriptor = "()V", line = 2078)
    public static void method1620() {
        field3825 = null;
        field3822 = null;
        field3838 = null;
        field3846 = null;
        field3854 = null;
        field3857 = null;
        field3858 = null;
        field3859 = null;
        field3860 = null;
        field3865 = null;
        field3861 = null;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Z", line = 2091)
    public final boolean method1621() {
        if (this.field3829 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3827; var1++) {
            this.field3826[var1] <<= 0x4;
            this.field3849[var1] <<= 0x4;
            this.field3852[var1] <<= 0x4;
        }
        field3863 = 0;
        field3869 = 0;
        field3866 = 0;
        return true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(SS)V", line = 2113)
    public final void method1622(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3856; var3++) {
            if (this.field3831[var3] == arg0) {
                this.field3831[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class200.field3102.method98(-125, arg0 & 0xFFFF);
            var5 = class200.field3102.method91(-98, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class200.field3102.method98(57, arg1 & 0xFFFF);
            var7 = class200.field3102.method91(-114, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3818.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "s", descriptor = "()V", line = 2148)
    private final void method1623() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3827; var9++) {
            int var10 = this.field3826[var9];
            int var11 = this.field3849[var9];
            int var12 = this.field3852[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3839.field4646 = (short) var1;
        this.field3839.field4645 = (short) var4;
        this.field3839.field4642 = (short) var2;
        this.field3839.field4643 = (short) var5;
        this.field3839.field4648 = (short) var3;
        this.field3839.field4647 = (short) var6;
        this.field3839.field4644 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3839.field4649 = true;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(SS)V", line = 2223)
    public final void method1624(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3856; var3++) {
            if (this.field3812[var3] == arg0) {
                this.field3812[var3] = arg1;
            }
        }
        this.field3818.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILtd;[[I[[IIII)V", line = 2239)
    public final void method1625(int arg0, int arg1, class239 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3839.field4649) {
            arg2.method1623();
        }
        int var9 = arg2.field3839.field4646 + arg5;
        int var10 = arg2.field3839.field4645 + arg5;
        int var11 = arg2.field3839.field4648 + arg7;
        int var12 = arg2.field3839.field4647 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3827; var17++) {
                int var18 = this.field3826[var17] + arg5;
                int var19 = this.field3852[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3849[var17] = this.field3849[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3839.field4642;
            for (int var28 = 0; var28 < this.field3827; var28++) {
                int var29 = (this.field3849[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3826[var28] + arg5;
                    int var31 = this.field3852[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3849[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2170(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3839.field4643 - arg2.field3839.field4642;
            for (int var42 = 0; var42 < this.field3827; var42++) {
                int var43 = this.field3826[var42] + arg5;
                int var44 = this.field3852[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3849[var42] = var51 + this.field3849[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3839.field4643 - arg2.field3839.field4642;
            for (int var53 = 0; var53 < this.field3827; var53++) {
                int var54 = this.field3826[var53] + arg5;
                int var55 = this.field3852[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3849[var53] = ((this.field3849[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3843.field241 = false;
        this.field3839.field4649 = false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZZZ)V", line = 2436)
    public final void method1626(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3840 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3837 != 0) {
            if (arg6) {
                boolean var8 = !this.field3818.field241 && (arg1 || arg2 && !class25.field360);
                this.method1628(false, !this.field3843.field241 && arg0, var8, this.field3819 != null && !this.field3819.field241 && arg2, !this.field3821.field241 && arg3);
                if (!this.field3850.field241 && arg4 && arg1) {
                    this.method1617();
                }
            }
            if (arg0) {
                if (this.field3843.field241) {
                    if (!this.field3839.field4649) {
                        this.method1623();
                    }
                    this.field3826 = null;
                    this.field3849 = null;
                    this.field3852 = null;
                    this.field3832 = null;
                    this.field3842 = null;
                } else {
                    this.field3855 = (byte) (this.field3855 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3818.field241) {
                    this.field3812 = null;
                    this.field3820 = null;
                } else {
                    this.field3855 = (byte) (this.field3855 | 0x2);
                }
            }
            if (arg2 && class25.field360) {
                if (this.field3819.field241) {
                    this.field3814 = null;
                    this.field3830 = null;
                    this.field3841 = null;
                    this.field3845 = null;
                } else {
                    this.field3855 = (byte) (this.field3855 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3821.field241) {
                    this.field3828 = null;
                    this.field3851 = null;
                } else {
                    this.field3855 = (byte) (this.field3855 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3850.field241 && this.field3818.field241) {
                    this.field3815 = null;
                    this.field3834 = null;
                    this.field3835 = null;
                } else {
                    this.field3855 = (byte) (this.field3855 | 0x10);
                }
            }
            if (arg5) {
                this.field3848 = null;
                this.field3824 = null;
                this.field3829 = (int[][]) null;
                this.field3833 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([FI)[F", line = 2537)
    private static final float[] method1627(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class75.method539(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZ)V", line = 2544)
    private final void method1628(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3843.field240 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3818.field240 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3819.field240 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3821.field240 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3822.field1280.length < this.field3837 * var6) {
            field3822 = new class82((this.field3837 + 100) * var6);
        } else {
            field3822.field1301 = 0;
        }
        if (arg1) {
            if (class255.field4167) {
                for (int var7 = 0; var7 < this.field3827; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3826[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3849[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3852[var7]);
                    int var11 = this.field3842[var7];
                    int var12 = this.field3842[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3832[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3822.field1301 = var6 * var14;
                        field3822.method577(-123, var8);
                        field3822.method577(-127, var9);
                        field3822.method577(-123, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3827; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3826[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3849[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3852[var15]);
                    int var19 = this.field3842[var15];
                    int var20 = this.field3842[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3832[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3822.field1301 = var6 * var22;
                        field3822.method596(var16, 105);
                        field3822.method596(var17, 121);
                        field3822.method596(var18, 84);
                    }
                }
            }
        }
        if (arg2) {
            if (class25.field360) {
                for (int var42 = 0; var42 < this.field3856; var42++) {
                    int var43 = method1605(this.field3812[var42], this.field3831[var42], this.field3853, this.field3820[var42]);
                    field3822.field1301 = this.field3815[var42] * var6 + this.field3818.field240;
                    field3822.method577(-123, var43);
                    field3822.field1301 = this.field3834[var42] * var6 + this.field3818.field240;
                    field3822.method577(-121, var43);
                    field3822.field1301 = this.field3835[var42] * var6 + this.field3818.field240;
                    field3822.method577(-127, var43);
                }
            } else {
                int var23 = (int) class289.field4812[0];
                int var24 = (int) class289.field4812[1];
                int var25 = (int) class289.field4812[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3853 * 1.3F);
                int var28 = this.field3823 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3856; var29++) {
                    short var30 = this.field3815[var29];
                    short var31 = this.field3845[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3841[var30] * var25 + this.field3830[var30] * var24 + this.field3814[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3841[var30] * var25 + this.field3830[var30] * var24 + this.field3814[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3845[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3834[var29];
                    short var34 = this.field3845[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3841[var33] * var25 + this.field3830[var33] * var24 + this.field3814[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3841[var33] * var25 + this.field3830[var33] * var24 + this.field3814[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3845[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3835[var29];
                    short var37 = this.field3845[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3841[var36] * var25 + this.field3830[var36] * var24 + this.field3814[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3841[var36] * var25 + this.field3830[var36] * var24 + this.field3814[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3845[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1605(this.field3812[var29], this.field3831[var29], var32, this.field3820[var29]);
                    int var40 = method1605(this.field3812[var29], this.field3831[var29], var35, this.field3820[var29]);
                    int var41 = method1605(this.field3812[var29], this.field3831[var29], var38, this.field3820[var29]);
                    field3822.field1301 = var6 * var30 + this.field3818.field240;
                    field3822.method577(-121, var39);
                    field3822.field1301 = var6 * var33 + this.field3818.field240;
                    field3822.method577(-120, var40);
                    field3822.field1301 = var6 * var36 + this.field3818.field240;
                    field3822.method577(-124, var41);
                }
                this.field3814 = null;
                this.field3830 = null;
                this.field3841 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3823;
            float var45 = 3.0F / (float) (this.field3823 / 2 + this.field3823);
            field3822.field1301 = this.field3819.field240;
            if (class255.field4167) {
                for (int var46 = 0; var46 < this.field3837; var46++) {
                    short var47 = this.field3845[var46];
                    if (var47 == 0) {
                        field3822.method640(881, (float) this.field3814[var46] * var45);
                        field3822.method640(881, (float) this.field3830[var46] * var45);
                        field3822.method640(881, (float) this.field3841[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3822.method640(881, (float) this.field3814[var46] * var48);
                        field3822.method640(881, (float) this.field3830[var46] * var48);
                        field3822.method640(881, (float) this.field3841[var46] * var48);
                    }
                    field3822.field1301 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3837; var49++) {
                    short var50 = this.field3845[var49];
                    if (var50 == 0) {
                        field3822.method601((float) this.field3814[var49] * var45, (byte) 124);
                        field3822.method601((float) this.field3830[var49] * var45, (byte) 64);
                        field3822.method601((float) this.field3841[var49] * var45, (byte) 122);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3822.method601((float) this.field3814[var49] * var51, (byte) 91);
                        field3822.method601((float) this.field3830[var49] * var51, (byte) 86);
                        field3822.method601((float) this.field3841[var49] * var51, (byte) 111);
                    }
                    field3822.field1301 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3822.field1301 = this.field3821.field240;
            if (class255.field4167) {
                for (int var52 = 0; var52 < this.field3837; var52++) {
                    field3822.method640(881, this.field3828[var52]);
                    field3822.method640(881, this.field3851[var52]);
                    field3822.field1301 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3837; var53++) {
                    field3822.method601(this.field3828[var53], (byte) 90);
                    field3822.method601(this.field3851[var53], (byte) 76);
                    field3822.field1301 += var6 - 8;
                }
            }
        }
        field3822.field1301 = this.field3837 * var6;
        if (arg0) {
            if (class255.field4194) {
                ByteBuffer var54 = ByteBuffer.wrap(field3822.field1280, 0, field3822.field1301);
                if (this.field3816 == null) {
                    this.field3816 = new class6(true);
                    this.field3816.method42(var54);
                } else {
                    this.field3816.method38(var54);
                }
                if (arg1) {
                    this.field3843.field241 = true;
                    this.field3843.field245 = null;
                    this.field3843.field244 = this.field3816;
                    this.field3843.field252 = var6;
                }
                if (arg2) {
                    this.field3818.field241 = true;
                    this.field3818.field245 = null;
                    this.field3818.field244 = this.field3816;
                    this.field3818.field252 = var6;
                }
                if (arg3) {
                    this.field3819.field241 = true;
                    this.field3819.field245 = null;
                    this.field3819.field244 = this.field3816;
                    this.field3819.field252 = var6;
                }
                if (arg4) {
                    this.field3821.field241 = true;
                    this.field3821.field245 = null;
                    this.field3821.field244 = this.field3816;
                    this.field3821.field252 = var6;
                }
            } else {
                if (field3838 == null || field3838.capacity() < field3822.field1301) {
                    field3838 = ByteBuffer.allocateDirect(var6 * 100 + field3822.field1301);
                } else {
                    field3838.clear();
                }
                field3838.put(field3822.field1280, 0, field3822.field1301);
                field3838.flip();
                if (arg1) {
                    this.field3843.field241 = true;
                    this.field3843.field245 = field3838;
                    this.field3843.field244 = null;
                    this.field3843.field252 = var6;
                }
                if (arg2) {
                    this.field3818.field241 = true;
                    this.field3818.field245 = field3838;
                    this.field3843.field244 = null;
                    this.field3818.field252 = var6;
                }
                if (arg3) {
                    this.field3819.field241 = true;
                    this.field3819.field245 = field3838;
                    this.field3819.field244 = null;
                    this.field3819.field252 = var6;
                }
                if (arg4) {
                    this.field3821.field241 = true;
                    this.field3821.field245 = field3838;
                    this.field3821.field244 = null;
                    this.field3821.field252 = var6;
                }
            }
        } else if (class255.field4190) {
            class6 var55 = new class6();
            ByteBuffer var56 = ByteBuffer.wrap(field3822.field1280, 0, field3822.field1301);
            var55.method42(var56);
            if (arg1) {
                this.field3843.field241 = true;
                this.field3843.field245 = null;
                this.field3843.field244 = var55;
                this.field3843.field252 = var6;
            }
            if (arg2) {
                this.field3818.field241 = true;
                this.field3818.field245 = null;
                this.field3818.field244 = var55;
                this.field3818.field252 = var6;
            }
            if (arg3) {
                this.field3819.field241 = true;
                this.field3819.field245 = null;
                this.field3819.field244 = var55;
                this.field3819.field252 = var6;
            }
            if (arg4) {
                this.field3821.field241 = true;
                this.field3821.field245 = null;
                this.field3821.field244 = var55;
                this.field3821.field252 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3822.field1301);
            var57.put(field3822.field1280, 0, field3822.field1301);
            var57.flip();
            if (arg1) {
                this.field3843.field241 = true;
                this.field3843.field245 = var57;
                this.field3843.field244 = null;
                this.field3843.field252 = var6;
            }
            if (arg2) {
                this.field3818.field241 = true;
                this.field3818.field245 = var57;
                this.field3843.field244 = null;
                this.field3818.field252 = var6;
            }
            if (arg3) {
                this.field3819.field241 = true;
                this.field3819.field245 = var57;
                this.field3819.field244 = null;
                this.field3819.field252 = var6;
            }
            if (arg4) {
                this.field3821.field241 = true;
                this.field3821.field245 = var57;
                this.field3821.field244 = null;
                this.field3821.field252 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZLtd;Ltd;)Lak;", line = 3072)
    private final class311 method1629(boolean arg0, boolean arg1, boolean arg2, class239 arg3, class239 arg4) {
        arg3.field3827 = this.field3827;
        arg3.field3837 = this.field3837;
        arg3.field3856 = this.field3856;
        arg3.field3853 = this.field3853;
        arg3.field3823 = this.field3823;
        arg3.field3840 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field3826 == null || arg3.field3826.length < this.field3827) {
            arg3.field3826 = new int[this.field3827 + 100];
            arg3.field3849 = new int[this.field3827 + 100];
            arg3.field3852 = new int[this.field3827 + 100];
        }
        for (int var6 = 0; var6 < this.field3827; var6++) {
            arg3.field3826[var6] = this.field3826[var6];
            arg3.field3849[var6] = this.field3849[var6];
            arg3.field3852[var6] = this.field3852[var6];
        }
        if (arg3.field3843 == null) {
            arg3.field3843 = new class17();
        }
        arg3.field3843.field241 = false;
        if (arg3.field3839 == null) {
            arg3.field3839 = new class278();
        }
        arg3.field3839.field4649 = false;
        if (arg0) {
            arg3.field3820 = this.field3820;
        } else {
            if (arg4.field3820 == null || arg4.field3820.length < this.field3856) {
                arg4.field3820 = new byte[this.field3856 + 100];
            }
            arg3.field3820 = arg4.field3820;
            for (int var7 = 0; var7 < this.field3856; var7++) {
                arg3.field3820[var7] = this.field3820[var7];
            }
        }
        if (arg1) {
            arg3.field3812 = this.field3812;
        } else {
            if (arg4.field3812 == null || arg4.field3812.length < this.field3856) {
                arg4.field3812 = new short[this.field3856 + 100];
            }
            arg3.field3812 = arg4.field3812;
            for (int var8 = 0; var8 < this.field3856; var8++) {
                arg3.field3812[var8] = this.field3812[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field3818 = this.field3818;
        } else {
            if (arg4.field3818 == null) {
                arg4.field3818 = new class17();
            }
            arg3.field3818 = arg4.field3818;
            arg3.field3818.field241 = false;
        }
        if (arg2 || this.field3814 == null) {
            arg3.field3814 = this.field3814;
            arg3.field3830 = this.field3830;
            arg3.field3841 = this.field3841;
            arg3.field3845 = this.field3845;
            arg3.field3819 = this.field3819;
        } else {
            if (arg4.field3814 == null || arg4.field3814.length < this.field3837) {
                arg4.field3814 = new short[this.field3837 + 100];
                arg4.field3830 = new short[this.field3837 + 100];
                arg4.field3841 = new short[this.field3837 + 100];
                arg4.field3845 = new short[this.field3837 + 100];
            }
            arg3.field3814 = arg4.field3814;
            arg3.field3830 = arg4.field3830;
            arg3.field3841 = arg4.field3841;
            arg3.field3845 = arg4.field3845;
            for (int var9 = 0; var9 < this.field3837; var9++) {
                arg3.field3814[var9] = this.field3814[var9];
                arg3.field3830[var9] = this.field3830[var9];
                arg3.field3841[var9] = this.field3841[var9];
                arg3.field3845[var9] = this.field3845[var9];
            }
            if (class25.field360) {
                if (arg4.field3819 == null) {
                    arg4.field3819 = new class17();
                }
                arg3.field3819 = arg4.field3819;
                arg3.field3819.field241 = false;
            } else {
                arg3.field3819 = null;
            }
        }
        arg3.field3828 = this.field3828;
        arg3.field3851 = this.field3851;
        arg3.field3848 = this.field3848;
        arg3.field3829 = this.field3829;
        arg3.field3815 = this.field3815;
        arg3.field3834 = this.field3834;
        arg3.field3835 = this.field3835;
        arg3.field3831 = this.field3831;
        arg3.field3824 = this.field3824;
        arg3.field3833 = this.field3833;
        arg3.field3821 = this.field3821;
        arg3.field3850 = this.field3850;
        arg3.field3844 = this.field3844;
        arg3.field3832 = this.field3832;
        arg3.field3842 = this.field3842;
        arg3.field5333 = this.field5333;
        arg3.field3836 = this.field3836;
        arg3.field3817 = this.field3817;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lth;", line = 3223)
    public final class86 method669(int arg0, int arg1, int arg2) {
        this.field3813 = false;
        if (this.field3847 != null) {
            this.field3814 = this.field3847.field994;
            this.field3830 = this.field3847.field996;
            this.field3841 = this.field3847.field995;
            this.field3845 = this.field3847.field993;
            this.field3847 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!td", name = "t", descriptor = "()I", line = 3236)
    public final int method1630() {
        return this.field3823;
    }

    @OriginalMember(owner = "client!td", name = "u", descriptor = "()V", line = 3241)
    public final void method1631() {
        if (this.field3814 == null) {
            this.method1633();
            return;
        }
        for (int var1 = 0; var1 < this.field3827; var1++) {
            int var2 = this.field3826[var1];
            this.field3826[var1] = this.field3852[var1];
            this.field3852[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3837; var3++) {
            short var4 = this.field3814[var3];
            this.field3814[var3] = this.field3841[var3];
            this.field3841[var3] = (short) (-var4);
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZZZZZZZ)Ltd;", line = 3279)
    public final class239 method1632(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class239 var12 = new class239();
        var12.field3827 = this.field3827;
        var12.field3837 = this.field3837;
        var12.field3856 = this.field3856;
        if (arg0) {
            var12.field3826 = this.field3826;
            var12.field3852 = this.field3852;
        } else {
            var12.field3826 = class64.method480(this.field3826, 2);
            var12.field3852 = class64.method480(this.field3852, 2);
        }
        if (arg1) {
            var12.field3849 = this.field3849;
        } else {
            var12.field3849 = class64.method480(this.field3849, 2);
        }
        if (arg0 && arg1) {
            var12.field3843 = this.field3843;
            var12.field3839 = this.field3839;
        } else {
            var12.field3843 = new class17();
            var12.field3839 = new class278();
        }
        if (arg2) {
            var12.field3812 = this.field3812;
        } else {
            var12.field3812 = class262.method1845(23032, this.field3812);
        }
        if (arg3) {
            var12.field3820 = this.field3820;
        } else {
            var12.field3820 = class317.method2200((byte) -46, this.field3820);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class25.field360) {
            var12.field3818 = new class17();
        } else {
            var12.field3818 = this.field3818;
        }
        if (arg5) {
            var12.field3814 = this.field3814;
            var12.field3830 = this.field3830;
            var12.field3841 = this.field3841;
            var12.field3845 = this.field3845;
        } else {
            var12.field3814 = class262.method1845(23032, this.field3814);
            var12.field3830 = class262.method1845(23032, this.field3830);
            var12.field3841 = class262.method1845(23032, this.field3841);
            var12.field3845 = class262.method1845(23032, this.field3845);
        }
        if (!class25.field360) {
            var12.field3819 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3819 = this.field3819;
        } else {
            var12.field3819 = new class17();
        }
        if (arg8) {
            var12.field3828 = this.field3828;
            var12.field3851 = this.field3851;
            var12.field3821 = this.field3821;
        } else {
            var12.field3828 = class202.method1363(this.field3828, 0);
            var12.field3851 = class202.method1363(this.field3851, 0);
            var12.field3821 = new class17();
        }
        if (arg9) {
            var12.field3815 = this.field3815;
            var12.field3834 = this.field3834;
            var12.field3835 = this.field3835;
            var12.field3850 = this.field3850;
        } else {
            var12.field3815 = class262.method1845(23032, this.field3815);
            var12.field3834 = class262.method1845(23032, this.field3834);
            var12.field3835 = class262.method1845(23032, this.field3835);
            var12.field3850 = new class17();
        }
        if (arg10) {
            var12.field3831 = this.field3831;
        } else {
            var12.field3831 = class262.method1845(23032, this.field3831);
        }
        var12.field3848 = this.field3848;
        var12.field3829 = this.field3829;
        var12.field3824 = this.field3824;
        var12.field3833 = this.field3833;
        var12.field3844 = this.field3844;
        var12.field3832 = this.field3832;
        var12.field3842 = this.field3842;
        var12.field3853 = this.field3853;
        var12.field3823 = this.field3823;
        var12.field3836 = this.field3836;
        var12.field3817 = this.field3817;
        return var12;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "()V", line = 3422)
    public final void method1633() {
        for (int var1 = 0; var1 < this.field3827; var1++) {
            int var2 = this.field3826[var1];
            this.field3826[var1] = this.field3852[var1];
            this.field3852[var1] = -var2;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)Z", line = 3436)
    private final boolean method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([SI)[S", line = 3456)
    private static final short[] method1635(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class75.method540(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "()I", line = 3461)
    public final int method1636() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4644;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[IIIIZ)V", line = 3468)
    public final void method1637(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3863 = 0;
            field3869 = 0;
            field3866 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3829.length) {
                    int[] var14 = this.field3829[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3863 += this.field3826[var16];
                        field3869 += this.field3849[var16];
                        field3866 += this.field3852[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3863 = field3863 / var11 + var8;
                field3869 = field3869 / var11 + var9;
                field3866 = field3866 / var11 + var10;
            } else {
                field3863 = var8;
                field3869 = var9;
                field3866 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3829.length) {
                    int[] var22 = this.field3829[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3826[var24] += var17;
                        this.field3849[var24] += var18;
                        this.field3852[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3829.length) {
                    int[] var27 = this.field3829[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3826[var29] -= field3863;
                        this.field3849[var29] -= field3869;
                        this.field3852[var29] -= field3866;
                        if (arg4 != 0) {
                            int var30 = class200.field3104[arg4];
                            int var31 = class200.field3115[arg4];
                            int var32 = this.field3849[var29] * var30 + this.field3826[var29] * var31 + 32767 >> 16;
                            this.field3849[var29] = this.field3849[var29] * var31 + 32767 - this.field3826[var29] * var30 >> 16;
                            this.field3826[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class200.field3104[arg2];
                            int var34 = class200.field3115[arg2];
                            int var35 = this.field3849[var29] * var34 + 32767 - this.field3852[var29] * var33 >> 16;
                            this.field3852[var29] = this.field3852[var29] * var34 + this.field3849[var29] * var33 + 32767 >> 16;
                            this.field3849[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class200.field3104[arg3];
                            int var37 = class200.field3115[arg3];
                            int var38 = this.field3852[var29] * var36 + this.field3826[var29] * var37 + 32767 >> 16;
                            this.field3852[var29] = this.field3852[var29] * var37 + 32767 - this.field3826[var29] * var36 >> 16;
                            this.field3826[var29] = var38;
                        }
                        this.field3826[var29] += field3863;
                        this.field3849[var29] += field3869;
                        this.field3852[var29] += field3866;
                    }
                }
            }
            if (arg5 && this.field3814 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3829.length) {
                        int[] var41 = this.field3829[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3842[var43];
                            int var45 = this.field3842[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3832[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class200.field3104[arg4];
                                    int var49 = class200.field3115[arg4];
                                    int var50 = this.field3830[var47] * var48 + this.field3814[var47] * var49 + 32767 >> 16;
                                    this.field3830[var47] = (short) (this.field3830[var47] * var49 + 32767 - this.field3814[var47] * var48 >> 16);
                                    this.field3814[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class200.field3104[arg2];
                                    int var52 = class200.field3115[arg2];
                                    int var53 = this.field3830[var47] * var52 + 32767 - this.field3841[var47] * var51 >> 16;
                                    this.field3841[var47] = (short) (this.field3841[var47] * var52 + this.field3830[var47] * var51 + 32767 >> 16);
                                    this.field3830[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class200.field3104[arg3];
                                    int var55 = class200.field3115[arg3];
                                    int var56 = this.field3841[var47] * var54 + this.field3814[var47] * var55 + 32767 >> 16;
                                    this.field3841[var47] = (short) (this.field3841[var47] * var55 + 32767 - this.field3814[var47] * var54 >> 16);
                                    this.field3814[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3819 != null) {
                    this.field3819.field241 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3829.length) {
                    int[] var59 = this.field3829[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3826[var61] -= field3863;
                        this.field3849[var61] -= field3869;
                        this.field3852[var61] -= field3866;
                        this.field3826[var61] = this.field3826[var61] * arg2 >> 7;
                        this.field3849[var61] = this.field3849[var61] * arg3 >> 7;
                        this.field3852[var61] = this.field3852[var61] * arg4 >> 7;
                        this.field3826[var61] += field3863;
                        this.field3849[var61] += field3869;
                        this.field3852[var61] += field3866;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3833 != null && this.field3820 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field3833.length) {
                        int[] var64 = this.field3833[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field3820[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field3820[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field3818.field241 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3833 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field3833.length) {
                    int[] var70 = this.field3833[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field3812[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field3812[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field3818.field241 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V", line = 3875)
    public final void method1638(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3863 = 0;
            field3869 = 0;
            field3866 = 0;
            for (int var6 = 0; var6 < this.field3827; var6++) {
                field3863 += this.field3826[var6];
                field3869 += this.field3849[var6];
                field3866 += this.field3852[var6];
                var5++;
            }
            if (var5 > 0) {
                field3863 = field3863 / var5 + arg1;
                field3869 = field3869 / var5 + arg2;
                field3866 = field3866 / var5 + arg3;
            } else {
                field3863 = arg1;
                field3869 = arg2;
                field3866 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3827; var7++) {
                this.field3826[var7] += arg1;
                this.field3849[var7] += arg2;
                this.field3852[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3827; var8++) {
                this.field3826[var8] -= field3863;
                this.field3849[var8] -= field3869;
                this.field3852[var8] -= field3866;
                if (arg3 != 0) {
                    int var9 = class200.field3104[arg3];
                    int var10 = class200.field3115[arg3];
                    int var11 = this.field3849[var8] * var9 + this.field3826[var8] * var10 + 32767 >> 16;
                    this.field3849[var8] = this.field3849[var8] * var10 + 32767 - this.field3826[var8] * var9 >> 16;
                    this.field3826[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class200.field3104[arg1];
                    int var13 = class200.field3115[arg1];
                    int var14 = this.field3849[var8] * var13 + 32767 - this.field3852[var8] * var12 >> 16;
                    this.field3852[var8] = this.field3852[var8] * var13 + this.field3849[var8] * var12 + 32767 >> 16;
                    this.field3849[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class200.field3104[arg2];
                    int var16 = class200.field3115[arg2];
                    int var17 = this.field3852[var8] * var15 + this.field3826[var8] * var16 + 32767 >> 16;
                    this.field3852[var8] = this.field3852[var8] * var16 + 32767 - this.field3826[var8] * var15 >> 16;
                    this.field3826[var8] = var17;
                }
                this.field3826[var8] += field3863;
                this.field3849[var8] += field3869;
                this.field3852[var8] += field3866;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3827; var18++) {
                this.field3826[var18] -= field3863;
                this.field3849[var18] -= field3869;
                this.field3852[var18] -= field3866;
                this.field3826[var18] = this.field3826[var18] * arg1 / 128;
                this.field3849[var18] = this.field3849[var18] * arg2 / 128;
                this.field3852[var18] = this.field3852[var18] * arg3 / 128;
                this.field3826[var18] += field3863;
                this.field3849[var18] += field3869;
                this.field3852[var18] += field3866;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3856; var19++) {
                int var20 = (this.field3820[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3820[var19] = (byte) var20;
            }
            this.field3818.field241 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field3856; var21++) {
                int var22 = this.field3812[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field3812[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field3818.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "v", descriptor = "()V", line = 4074)
    public static final void method1639() {
        field3846 = new class239();
        field3854 = new class239();
        field3857 = new class239();
        field3858 = new class239();
        field3859 = new class239();
        field3860 = new class239();
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "()I", line = 4084)
    public final int method1640() {
        if (!this.field3839.field4649) {
            this.method1623();
        }
        return this.field3839.field4646;
    }

    @OriginalMember(owner = "client!td", name = "w", descriptor = "()V", line = 4094)
    private final void method1641() {
        GL var1 = class255.field4181;
        if (this.field3856 == 0) {
            return;
        }
        if (this.field3840 != 0) {
            this.method1628(true, !this.field3843.field241 && (this.field3840 & 0x1) != 0, !this.field3818.field241 && (this.field3840 & 0x2) != 0, this.field3819 != null && !this.field3819.field241 && (this.field3840 & 0x4) != 0, false);
        }
        this.method1628(false, !this.field3843.field241, !this.field3818.field241, this.field3819 != null && !this.field3819.field241, !this.field3821.field241);
        if (!this.field3850.field241) {
            this.method1617();
        }
        if (this.field3855 != 0) {
            if ((this.field3855 & 0x1) != 0) {
                this.field3826 = null;
                this.field3849 = null;
                this.field3852 = null;
                this.field3832 = null;
                this.field3842 = null;
            }
            if ((this.field3855 & 0x2) != 0) {
                this.field3812 = null;
                this.field3820 = null;
            }
            if ((this.field3855 & 0x4) != 0) {
                this.field3814 = null;
                this.field3830 = null;
                this.field3841 = null;
                this.field3845 = null;
            }
            if ((this.field3855 & 0x8) != 0) {
                this.field3828 = null;
                this.field3851 = null;
            }
            if ((this.field3855 & 0x10) != 0) {
                this.field3815 = null;
                this.field3834 = null;
                this.field3835 = null;
            }
            this.field3855 = 0;
        }
        class6 var2 = null;
        if (this.field3843.field244 != null) {
            this.field3843.field244.method39();
            var2 = this.field3843.field244;
            var1.glVertexPointer(3, 5126, this.field3843.field252, (long) this.field3843.field240);
        }
        if (this.field3818.field244 != null) {
            if (this.field3818.field244 != var2) {
                this.field3818.field244.method39();
                var2 = this.field3818.field244;
            }
            var1.glColorPointer(4, 5121, this.field3818.field252, (long) this.field3818.field240);
        }
        if (class25.field360 && this.field3819.field244 != null) {
            if (this.field3819.field244 != var2) {
                this.field3819.field244.method39();
                var2 = this.field3819.field244;
            }
            var1.glNormalPointer(5126, this.field3819.field252, (long) this.field3819.field240);
        }
        if (this.field3821.field244 != null) {
            if (this.field3821.field244 != var2) {
                this.field3821.field244.method39();
                class6 var3 = this.field3821.field244;
            }
            var1.glTexCoordPointer(2, 5126, this.field3821.field252, (long) this.field3821.field240);
        }
        if (this.field3850.field244 != null) {
            this.field3850.field244.method41();
        }
        if (this.field3843.field244 == null || this.field3818.field244 == null || class25.field360 && this.field3819.field244 == null || this.field3821.field244 == null) {
            if (class255.field4190) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3843.field244 == null) {
                this.field3843.field245.position(this.field3843.field240);
                var1.glVertexPointer(3, 5126, this.field3843.field252, this.field3843.field245);
            }
            if (this.field3818.field244 == null) {
                this.field3818.field245.position(this.field3818.field240);
                var1.glColorPointer(4, 5121, this.field3818.field252, this.field3818.field245);
            }
            if (class25.field360 && this.field3819.field244 == null) {
                this.field3819.field245.position(this.field3819.field240);
                var1.glNormalPointer(5126, this.field3819.field252, this.field3819.field245);
            }
            if (this.field3821.field244 == null) {
                this.field3821.field245.position(this.field3821.field240);
                var1.glTexCoordPointer(2, 5126, this.field3821.field252, this.field3821.field245);
            }
        }
        if (this.field3850.field244 == null && class255.field4190) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3844.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3844[var5];
            int var7 = this.field3844[var5 + 1];
            short var8 = this.field3831[var6];
            if (var8 == -1) {
                class255.method1790(-1);
                class281.method1973(0, 0, 0);
            } else {
                class200.field3102.method86(var8 & 0xFFFF, true);
            }
            if (this.field3850.field244 == null) {
                this.field3850.field245.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3850.field245);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V", line = 4270)
    public final void method1642() {
        for (int var1 = 0; var1 < this.field3827; var1++) {
            this.field3826[var1] = this.field3826[var1] + 7 >> 4;
            this.field3849[var1] = this.field3849[var1] + 7 >> 4;
            this.field3852[var1] = this.field3852[var1] + 7 >> 4;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "x", descriptor = "()V", line = 4287)
    public final void method1643() {
        for (int var1 = 0; var1 < this.field3827; var1++) {
            this.field3852[var1] = -this.field3852[var1];
        }
        if (this.field3841 != null) {
            for (int var2 = 0; var2 < this.field3837; var2++) {
                this.field3841[var2] = (short) (-this.field3841[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3856; var3++) {
            short var4 = this.field3815[var3];
            this.field3815[var3] = this.field3835[var3];
            this.field3835[var3] = var4;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
        this.field3850.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 4325)
    public final void method1644(int arg0) {
        int var2 = class200.field3104[arg0];
        int var3 = class200.field3115[arg0];
        for (int var4 = 0; var4 < this.field3827; var4++) {
            int var5 = this.field3849[var4] * var3 - this.field3852[var4] * var2 >> 16;
            this.field3852[var4] = this.field3852[var4] * var3 + this.field3849[var4] * var2 >> 16;
            this.field3849[var4] = var5;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 4346)
    public final void method1645(int arg0) {
        if (this.field3814 == null) {
            this.method1608(arg0);
            return;
        }
        int var2 = class200.field3104[arg0];
        int var3 = class200.field3115[arg0];
        for (int var4 = 0; var4 < this.field3827; var4++) {
            int var5 = this.field3852[var4] * var2 + this.field3826[var4] * var3 >> 16;
            this.field3852[var4] = this.field3852[var4] * var3 - this.field3826[var4] * var2 >> 16;
            this.field3826[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3837; var6++) {
            int var7 = this.field3841[var6] * var2 + this.field3814[var6] * var3 >> 16;
            this.field3841[var6] = (short) (this.field3841[var6] * var3 - this.field3814[var6] * var2 >> 16);
            this.field3814[var6] = (short) var7;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
        if (this.field3819 != null) {
            this.field3819.field241 = false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lek;)Lek;", line = 4387)
    public final class183 method1646(class183 arg0) {
        if (this.field3837 == 0) {
            return null;
        }
        if (!this.field3839.field4649) {
            this.method1623();
        }
        int var2;
        int var3;
        if (class289.field4814 > 0) {
            var2 = this.field3839.field4646 - (class289.field4814 * this.field3839.field4643 >> 8) >> 3;
            var3 = this.field3839.field4645 - (class289.field4814 * this.field3839.field4642 >> 8) >> 3;
        } else {
            var2 = this.field3839.field4646 - (class289.field4814 * this.field3839.field4642 >> 8) >> 3;
            var3 = this.field3839.field4645 - (class289.field4814 * this.field3839.field4643 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class289.field4815 > 0) {
            var4 = this.field3839.field4648 - (class289.field4815 * this.field3839.field4643 >> 8) >> 3;
            var5 = this.field3839.field4647 - (class289.field4815 * this.field3839.field4642 >> 8) >> 3;
        } else {
            var4 = this.field3839.field4648 - (class289.field4815 * this.field3839.field4642 >> 8) >> 3;
            var5 = this.field3839.field4647 - (class289.field4815 * this.field3839.field4643 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class183 var8;
        if (arg0 == null || arg0.field2873.length < var6 * var7) {
            var8 = new class183(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2352 = arg0.field2341 = var6;
            arg0.field2349 = arg0.field2351 = var7;
            arg0.method1262();
        }
        var8.field2353 = var2;
        var8.field2344 = var4;
        if (field3865.length < this.field3837) {
            field3865 = new int[this.field3837];
            field3861 = new int[this.field3837];
        }
        for (int var9 = 0; var9 < this.field3827; var9++) {
            int var10 = (this.field3826[var9] - (this.field3849[var9] * class289.field4814 >> 8) >> 3) - var2;
            int var11 = (this.field3852[var9] - (this.field3849[var9] * class289.field4815 >> 8) >> 3) - var4;
            int var12 = this.field3842[var9];
            int var13 = this.field3842[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3832[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3865[var15] = var10;
                field3861[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3856; var16++) {
            if (this.field3820[var16] <= 128) {
                short var17 = this.field3815[var16];
                short var18 = this.field3834[var16];
                short var19 = this.field3835[var16];
                int var20 = field3865[var17];
                int var21 = field3865[var18];
                int var22 = field3865[var19];
                int var23 = field3861[var17];
                int var24 = field3861[var18];
                int var25 = field3861[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class200.method1351(var8.field2873, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!td", name = "l", descriptor = "()V", line = 4521)
    public final void method1647() {
        for (int var1 = 0; var1 < this.field3827; var1++) {
            int var2 = this.field3852[var1];
            this.field3852[var1] = this.field3826[var1];
            this.field3826[var1] = -var2;
        }
        this.field3839.field4649 = false;
        this.field3843.field241 = false;
    }
}
