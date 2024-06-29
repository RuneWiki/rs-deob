import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class130 {

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lsp;")
    private class452 field1669;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Lur;")
    private class377 field1680;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "[B")
    public byte[] field1683;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1677 = new String[100];

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field1681 = -2;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Ljc;")
    public static class305 field1670 = new class305("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Ljc;")
    public static class305 field1685 = new class305("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "F")
    public static float field1687;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "[[Led;")
    private class500[][] field1682;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 3)
    public final void method778(int arg0) {
        field1664++;
        if (arg0 != 1) {
            this.method783(-71, (byte) -30, 15, null);
        }
        this.field1682 = new class500[this.field1666][this.field1665];
        for (int var2 = 0; var2 < this.field1665; var2++) {
            for (int var3 = 0; var3 < this.field1666; var3++) {
                this.field1682[var3][var2] = new class500(this.field1680, this, this.field1669, var3, var2, this.field1668, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILi;I)Z", line = 36)
    public final boolean method779(int arg0, int arg1, class31 arg2, int arg3) {
        field1679++;
        class429 var5 = (class429) arg2;
        int var6 = var5.field6230 + arg0 + 1;
        int var7 = var5.field6234 + arg1 - arg3;
        int var8 = var7 + (this.field1667 * var6);
        int var9 = var5.field6236;
        int var10 = var5.field6227;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field1667 * var11;
        }
        int var12 = this.field1667 - var10;
        if (this.field1671 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field1671;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var12 += var14;
            var7 = 1;
        }
        if ((var7 + var10) >= this.field1667) {
            int var15 = var7 + var10 + 1 - this.field1667;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1667 + var12;
            return class516.method3078(var9, var16, var17, 0, var10, var8, this.field1683);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZIIII)V", line = 111)
    private final void method780(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1678++;
        if (this.field1682 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + (arg3 - 1) - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 - (1 + 1 - arg4) >> 7;
        if (arg0) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class500[] var11 = this.field1682[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7289 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB[[ZZII)V", line = 151)
    public final void method781(int arg0, byte arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5) {
        this.field1680.method2230(-13721, false);
        field1672++;
        this.field1680.method2289((byte) 121, false);
        if (arg1 != -42) {
            field1677 = null;
        }
        this.field1680.method2299(-2, (byte) 122);
        this.field1680.method2260(16640, 1);
        this.field1680.method2279(1, (byte) 76);
        float var7 = 1.0F / (float) (this.field1680.field5311 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field1665; var8++) {
                int var9 = var8 << this.field1668;
                int var10 = var8 + 1 << this.field1668;
                label135: for (int var11 = 0; var11 < this.field1666; var11++) {
                    int var12 = var11 << this.field1668;
                    int var13 = var11 + 1 << this.field1668;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg0 >= -arg5 && arg5 >= (var14 - arg0)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg5 <= var15 - arg4 && (var15 - arg4) <= arg5 && arg2[arg5 + var14 - arg0][var15 + arg5 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1682[var11][var8].method2999(-18360);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field1665; var16++) {
                int var17 = var16 << this.field1668;
                int var18 = var16 + 1 << this.field1668;
                for (int var19 = 0; var19 < this.field1666; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field1668;
                    int var22 = var19 + 1 << this.field1668;
                    class408 var23 = this.field1680.field5372;
                    var23.field5729 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg5 <= var24 - arg4 && (var24 - arg4) <= arg5) {
                            int var25 = this.field1669.field391 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg0 >= -arg5 && var26 - arg0 <= arg5 && arg2[var26 + arg5 - arg0][var24 - (arg4 - arg5)]) {
                                    short[] var27 = this.field1669.field6750[var25];
                                    if (var27 != null) {
                                        if (this.field1680.field5334) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2444((byte) 65, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method2434(-12659, var27[var29] & 0xFFFF);
                                                var20++;
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
                        this.field1682[var19][var16].method3002(true, var23.field5761, var20, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V", line = 338)
    public static void method782(int arg0) {
        field1685 = null;
        field1670 = null;
        int var1 = -22 / ((arg0 + 62) / 63);
        field1677 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBILi;)V", line = 351)
    public final void method783(int arg0, byte arg1, int arg2, class31 arg3) {
        field1676++;
        class429 var5 = (class429) arg3;
        int var6 = var5.field6230 + arg2 + 1;
        int var7 = var5.field6234 + arg0 + 1;
        int var8 = this.field1667 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6236;
        int var11 = var5.field6227;
        int var12 = this.field1667 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field1667 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field1671) {
            int var15 = var6 + 1 - (-var10 + this.field1671);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var8 += var16;
        }
        if (var7 + var11 >= this.field1667) {
            int var17 = var7 + var11 + 1 - this.field1667;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (arg1 != 39) {
            field1677 = null;
        }
        if (var11 > 0 && var10 > 0) {
            class523.method3114(arg1 ^ 0xFFFFFFA1, var9, this.field1683, var14, var12, var10, var8, var5.field6231, var11);
            this.method780(false, var7, var6, var11, var10);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(IBILi;)V", line = 429)
    public final void method784(int arg0, byte arg1, int arg2, class31 arg3) {
        field1673++;
        class429 var5 = (class429) arg3;
        int var6 = var5.field6234 + arg2 + 1;
        int var7 = var5.field6230 + arg0 + 1;
        int var8 = this.field1667 * var7 + var6;
        int var9 = 0;
        if (arg1 <= 33) {
            return;
        }
        int var10 = var5.field6236;
        int var11 = var5.field6227;
        int var12 = this.field1667 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field1667 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field1671) {
            int var15 = var7 + var10 + 1 - this.field1671;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var11 -= var16;
            var9 += var16;
            var14 += var16;
            var6 = 1;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field1667) {
            int var17 = var6 + var11 + 1 - this.field1667;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class391.method2365(this.field1683, var5.field6231, var10, var9, var14, var12, (byte) -75, var11, var8);
            this.method780(false, var6, var7, var11, var10);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lur;Lsp;)V", line = 500)
    public class130(class377 arg0, class452 arg1) {
        this.field1669 = arg1;
        this.field1680 = arg0;
        this.field1667 = (this.field1669.field392 * this.field1669.field391 >> this.field1680.field5308) + 2;
        this.field1671 = (this.field1669.field394 * this.field1669.field392 >> this.field1680.field5308) + 2;
        this.field1668 = this.field1680.field5308 + 7 - this.field1669.field387;
        this.field1683 = new byte[this.field1671 * this.field1667];
        this.field1666 = this.field1669.field391 >> this.field1668;
        this.field1665 = this.field1669.field394 >> this.field1668;
    }
}
