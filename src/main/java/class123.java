import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class123 {

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lbv;")
    private class282 field1759;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Llh;")
    private class257 field1771;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[B")
    public byte[] field1751;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    private int field1755;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Z")
    public static boolean field1754 = true;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
    public static boolean field1760 = false;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1770 = 2;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lcq;")
    public static class207 field1752 = new class207(8);

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[[Li;")
    private class510[][] field1762;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILj;II)V")
    public final void method787(int arg0, class229 arg1, int arg2, int arg3) {
        field1767++;
        class178 var5 = (class178) arg1;
        int var6 = var5.field2532 + arg2 + 1;
        int var7 = var5.field2530 + arg0 + 1;
        int var8 = this.field1763 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2534;
        if (arg3 != -29905) {
            this.field1759 = null;
        }
        int var11 = var5.field2539;
        int var12 = this.field1763 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field1763 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field1761 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field1761;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var7 = 1;
            var11 -= var16;
            var14 += var16;
            var12 += var16;
            var8 += var16;
        }
        if (var7 + var11 >= this.field1763) {
            int var17 = var7 - (-var11 - 1) - this.field1763;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class198.method1386(var8, var10, var9, arg3 ^ 0x74A3, var12, var14, var5.field2541, var11, this.field1751);
            this.method788(var6, var10, (byte) 27, var7, var11);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBII)V")
    private final void method788(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 27) {
            method794((byte) -66);
        }
        field1758++;
        if (this.field1762 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg4 + arg3 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg1 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class510[] var11 = this.field1762[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7573 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(ILj;II)V")
    public final void method789(int arg0, class229 arg1, int arg2, int arg3) {
        field1753++;
        class178 var5 = (class178) arg1;
        int var6 = var5.field2532 + arg0 + 1;
        int var7 = var5.field2530 + arg2 + 1;
        int var8 = this.field1763 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2534;
        if (arg3 != 8211) {
            this.method787(-27, null, -87, 92);
        }
        int var11 = var5.field2539;
        int var12 = this.field1763 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field1763 * var14;
            var6 = 1;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (this.field1761 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1761;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var7 = 1;
            var13 += var16;
        }
        if (this.field1763 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1763;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class181.method1299(var8, var12, this.field1751, var11, var9, (byte) -103, var10, var5.field2541, var13);
            this.method788(var6, var10, (byte) 27, var7, var11);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILj;I)Z")
    public final boolean method790(int arg0, int arg1, class229 arg2, int arg3) {
        field1766++;
        class178 var5 = (class178) arg2;
        int var6 = var5.field2530 + arg0 + 1;
        int var7 = var5.field2532 + arg1 + 1;
        int var8 = this.field1763 * var7 + var6;
        int var9 = var5.field2534;
        int var10 = var5.field2539;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var8 += this.field1763 * var11;
            var7 = 1;
        }
        if (arg3 != -648) {
            this.method793(false, 96, null, -81, (byte) -122, 68);
        }
        int var12 = this.field1763 - var10;
        if (var7 + var9 >= this.field1761) {
            int var13 = var7 + var9 + 1 - this.field1761;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var12 += var14;
            var8 += var14;
        }
        if (this.field1763 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field1763;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1763 + var12;
            return class243.method1623(this.field1751, var10, var8, var16, -1, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
    public static final boolean method791(int arg0, int arg1) {
        if (arg1 == -47) {
            field1756++;
            return arg0 == 2 || arg0 == 9 || arg0 == 1008 || arg0 == 46 || arg0 == 45;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public final void method792(int arg0) {
        this.field1762 = new class510[this.field1755][this.field1769];
        field1757++;
        for (int var2 = 0; var2 < this.field1769; var2++) {
            for (int var3 = 0; var3 < this.field1755; var3++) {
                this.field1762[var3][var2] = new class510(this.field1759, this, this.field1771, var3, var2, this.field1764, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != -16569) {
            this.field1764 = 93;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI[[ZIBI)V")
    public final void method793(boolean arg0, int arg1, boolean[][] arg2, int arg3, byte arg4, int arg5) {
        this.field1759.method1823(-23419, false);
        field1765++;
        this.field1759.method1827(false, -37);
        this.field1759.method1811(-2, (byte) -87);
        this.field1759.method1794(1, 85);
        this.field1759.method1802(1, (byte) 57);
        float var7 = 1.0F / (float) (this.field1759.field4085 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field1769; var8++) {
                int var9 = var8 << this.field1764;
                int var10 = var8 + 1 << this.field1764;
                label136: for (int var11 = 0; var11 < this.field1755; var11++) {
                    int var12 = var11 << this.field1764;
                    int var13 = var11 + 1 << this.field1764;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg3) <= (var14 - arg5) && arg3 >= var14 - arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg3) <= (var15 - arg1) && arg3 >= (var15 - arg1) && arg2[arg3 + var14 - arg5][var15 + arg3 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1762[var11][var8].method3038((byte) -89);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field1769; var16++) {
                int var17 = var16 << this.field1764;
                int var18 = var16 + 1 << this.field1764;
                for (int var19 = 0; var19 < this.field1755; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field1764;
                    int var22 = var19 + 1 << this.field1764;
                    class91 var23 = class128.field1807;
                    var23.field1292 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg1) >= (-arg3) && (var24 - arg1) <= arg3) {
                            int var25 = this.field1771.field2912 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg3 <= var26 - arg5 && var26 - arg5 <= arg3 && arg2[arg3 + var26 - arg5][var24 + arg3 - arg1]) {
                                    short[] var27 = this.field1771.field3556[var25];
                                    if (var27 != null) {
                                        if (this.field1759.field4197) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method600(var27[var28] & 0xFFFF, -12891);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method628(-107, var27[var29] & 0xFFFF);
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
                        this.field1762[var19][var16].method3040(5123, var23.field1277, 110, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        if (arg4 > -7) {
            this.field1763 = -62;
        }
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method794(byte arg0) {
        if (arg0 != 67) {
            method795(0.17523015F, -93, -34, (byte) 65, 34, -58, false, 53);
        }
        field1752 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(FIIBIIZI)[I")
    public static final int[] method795(float arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1768++;
        int[] var8 = new int[arg2];
        class75 var9 = new class75();
        var9.field1005 = arg6;
        var9.field1003 = (int) (arg0 * 4096.0F);
        var9.field1015 = arg5;
        var9.field1013 = arg1;
        var9.field1010 = arg4;
        var9.field1014 = arg7;
        var9.method99(-118);
        class170.method1197(arg2, arg3 - 1072879405, 1);
        if (arg3 != 121) {
            field1754 = false;
        }
        var9.method499(0, (byte) -109, var8);
        return var8;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lco;III)V")
    public static final void method796(class442 arg0, int arg1, int arg2, int arg3) {
        long var4 = class467.field6805[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field6569 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field6567[arg0.field6569++] = class515.field7632[var8 - 1].field2020;
            var6 += 16L;
        }
        for (int var9 = arg0.field6569; var9 < 4; var9++) {
            arg0.field6567[var9] = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lbv;Llh;)V")
    public class123(class282 arg0, class257 arg1) {
        this.field1759 = arg0;
        this.field1771 = arg1;
        this.field1763 = (this.field1771.field2915 * this.field1771.field2912 >> this.field1759.field4080) + 2;
        this.field1761 = (this.field1771.field2915 * this.field1771.field2914 >> this.field1759.field4080) + 2;
        this.field1764 = this.field1759.field4080 + 7 - this.field1771.field2916;
        this.field1751 = new byte[this.field1763 * this.field1761];
        this.field1755 = this.field1771.field2912 >> this.field1764;
        this.field1769 = this.field1771.field2914 >> this.field1764;
    }
}
