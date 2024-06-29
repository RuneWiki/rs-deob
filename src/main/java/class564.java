import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class564 {

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "Ldga;")
    private class445 field7844;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Lqj;")
    private class548 field7846;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public int field7840;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    private int field7829;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    private int field7833;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "[B")
    public byte[] field7847;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    private int field7845;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    private int field7834;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "[I")
    public static int[] field7838 = new int[25];

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lwp;")
    public static class453 field7832 = new class453(37, 5);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "[I")
    public static int[] field7842;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "[[Lkm;")
    private class123[][] field7843;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZIII)V", line = 7)
    private final void method3092(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7836++;
        if (this.field7843 == null) {
            return;
        }
        if (arg1) {
            this.method3096(-127, null, false, -108);
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class123[] var11 = this.field7843[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1555 = true;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[[ZZZI)V", line = 46)
    public final void method3093(int arg0, int arg1, boolean[][] arg2, boolean arg3, boolean arg4, int arg5) {
        this.field7846.method3010((byte) 105, false);
        field7839++;
        this.field7846.method2953(false, 125);
        this.field7846.method2961(-2, (byte) -106);
        if (!arg3) {
            this.method3093(-3, -16, null, true, false, -12);
        }
        this.field7846.method3005(false, 1);
        this.field7846.method3017((byte) 60, 1);
        float var7 = 1.0F / (float) (this.field7846.field7480 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field7834; var8++) {
                int var9 = var8 << this.field7833;
                int var10 = var8 + 1 << this.field7833;
                label135: for (int var11 = 0; var11 < this.field7845; var11++) {
                    int var12 = var11 << this.field7833;
                    int var13 = var11 + 1 << this.field7833;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg0) >= (-arg5) && (var14 - arg0) <= arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg1 >= -arg5 && arg5 >= (var15 - arg1) && arg2[var14 + arg5 - arg0][var15 + arg5 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field7843[var11][var8].method657((byte) -94);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field7834; var16++) {
                int var17 = var16 << this.field7833;
                int var18 = var16 + 1 << this.field7833;
                for (int var19 = 0; var19 < this.field7845; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field7833;
                    int var22 = var19 + 1 << this.field7833;
                    class458 var23 = this.field7846.field7570;
                    var23.field8812 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg5 <= var24 - arg1 && var24 - arg1 <= arg5) {
                            int var25 = this.field7844.field3441 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((-arg5) <= (var26 - arg0) && arg5 >= var26 - arg0 && arg2[arg5 + var26 - arg0][var24 + arg5 - arg1]) {
                                    short[] var27 = this.field7844.field5614[var25];
                                    if (var27 != null) {
                                        if (this.field7846.field7579) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method3526(var27[var29] & 0xFFFF, 13469);
                                                var20++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method3484(var27[var28] & 0xFFFF, (byte) 0);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field7843[var19][var16].method656(var23.field8804, 5123, var20, -57);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lha;III)Z", line = 234)
    public final boolean method3094(class119 arg0, int arg1, int arg2, int arg3) {
        field7835++;
        class77 var5 = (class77) arg0;
        int var6 = var5.field1057 + arg2 + 1;
        int var7 = var5.field1067 + arg1 + 1;
        int var8 = this.field7840 * var7 + var6;
        int var9 = var5.field1059;
        int var10 = var5.field1058;
        int var11 = this.field7840 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field7840 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if (arg3 != -11578) {
            this.method3095(38);
        }
        if (this.field7829 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field7829;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var11 += var14;
            var6 = 1;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field7840) {
            int var15 = var6 + var10 + 1 - this.field7840;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field7840 + var11;
            return class453.method2425(var10, var16, 117, var17, var8, this.field7847, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 313)
    public final void method3095(int arg0) {
        if (arg0 <= 41) {
            return;
        }
        field7837++;
        this.field7843 = new class123[this.field7845][this.field7834];
        for (int var2 = 0; var2 < this.field7834; var2++) {
            for (int var3 = 0; var3 < this.field7845; var3++) {
                this.field7843[var3][var2] = new class123(this.field7846, this, this.field7844, var3, var2, this.field7833, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILha;ZI)V", line = 343)
    public final void method3096(int arg0, class119 arg1, boolean arg2, int arg3) {
        field7841++;
        class77 var5 = (class77) arg1;
        int var6 = var5.field1067 + arg3 + 1;
        int var7 = var5.field1057 + arg0 + 1;
        int var8 = this.field7840 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field1059;
        int var11 = var5.field1058;
        int var12 = this.field7840 - var11;
        if (!arg2) {
            method3100(-72, 31, false);
        }
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field7840 * var14;
        }
        if (var6 + var10 >= this.field7829) {
            int var15 = var6 + var10 + 1 - this.field7829;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var11 -= var16;
            var13 += var16;
            var7 = 1;
            var9 += var16;
            var12 += var16;
        }
        if (this.field7840 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field7840;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class332.method1880(var11, var5.field1055, var12, var9, this.field7847, -1, var10, var8, var13);
            this.method3092(var7, !arg2, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Les;B)Ljs;", line = 418)
    public static final class269 method3097(class630 arg0, byte arg1) {
        field7828++;
        int var2 = arg0.method3501(-9268);
        if (arg1 != -117) {
            field7842 = null;
        }
        class414 var3 = class349.method1929((byte) 87)[arg0.method3501(-9268)];
        class29 var4 = class20.method132(arg1 + 174)[arg0.method3501(arg1 ^ 0x2447)];
        int var5 = arg0.method3510(85);
        int var6 = arg0.method3510(arg1 ^ 0xFFFFFFD6);
        int var7 = arg0.method3470(13111);
        int var8 = arg0.method3470(arg1 + 13228);
        int var9 = arg0.method3483(58);
        int var10 = arg0.method3483(127);
        int var11 = arg0.method3483(73);
        boolean var12 = arg0.method3501(-9268) == 1;
        return new class269(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Lha;III)V", line = 451)
    public final void method3098(class119 arg0, int arg1, int arg2, int arg3) {
        field7830++;
        class77 var5 = (class77) arg0;
        int var6 = var5.field1057 + arg2 + 1;
        int var7 = var5.field1067 + arg1 + 1;
        int var8 = this.field7840 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1059;
        int var11 = var5.field1058;
        int var12 = this.field7840 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field7840 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field7829) {
            int var15 = var7 + var10 + 1 - this.field7829;
            var10 -= var15;
        }
        if (arg3 <= ~var6) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var6 = 1;
            var11 -= var16;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field7840) {
            int var17 = var6 + var11 + 1 - this.field7840;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class370.method2024(var11, var14, this.field7847, var9, var5.field1055, var12, var10, var8, arg3 - 112);
            this.method3092(var6, false, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 523)
    public static void method3099(int arg0) {
        field7838 = null;
        field7842 = null;
        if (arg0 != 1) {
            method3097(null, (byte) 95);
        }
        field7832 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIZ)I", line = 537)
    public static final int method3100(int arg0, int arg1, boolean arg2) {
        field7831++;
        if (arg2) {
            return 0;
        }
        class492 var3 = class183.method1141(arg2, (byte) 123, arg1);
        if (var3 == null) {
            return class354.field4508.method3529(-101, arg1).field7131;
        }
        int var4 = 0;
        if (arg0 != 1) {
            return -69;
        }
        for (int var5 = 0; var5 < var3.field6496.length; var5++) {
            if (var3.field6496[var5] == -1) {
                var4++;
            }
        }
        return var4 + class354.field4508.method3529(-102, arg1).field7131 - var3.field6496.length;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lqj;Ldga;)V", line = 574)
    public class564(class548 arg0, class445 arg1) {
        this.field7844 = arg1;
        this.field7846 = arg0;
        this.field7840 = (this.field7844.field3441 * this.field7844.field3432 >> this.field7846.field7479) + 2;
        this.field7829 = (this.field7844.field3440 * this.field7844.field3432 >> this.field7846.field7479) + 2;
        this.field7833 = this.field7846.field7479 + 7 - this.field7844.field3437;
        this.field7847 = new byte[this.field7840 * this.field7829];
        this.field7845 = this.field7844.field3441 >> this.field7833;
        this.field7834 = this.field7844.field3440 >> this.field7833;
    }
}
