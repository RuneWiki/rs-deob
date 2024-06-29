import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class180 {

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lon;")
    private class220 field2650;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lod;")
    private class349 field2646;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[B")
    public byte[] field2649;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[[B")
    public static byte[][] field2647;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[[Lko;")
    private class348[][] field2657;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public final void method1221(int arg0) {
        this.field2657 = new class348[this.field2652][this.field2642];
        field2639++;
        if (arg0 >= -77) {
            return;
        }
        for (int var2 = 0; var2 < this.field2642; var2++) {
            for (int var3 = 0; var3 < this.field2652; var3++) {
                this.field2657[var3][var2] = new class348(this.field2646, this, this.field2650, var3, var2, this.field2644, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Le;")
    public static final class369 method1222(int arg0, byte arg1) {
        field2653++;
        class369[] var2 = class141.method936(8);
        int var3 = 0;
        int var4 = 81 / ((arg1 - 12) / 41);
        while (var2.length > var3) {
            class369 var5 = var2[var3];
            if (var5.field5649 == arg0) {
                return var5;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method1223(byte arg0) {
        if (arg0 == 54) {
            field2647 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lj;III)V")
    public final void method1224(class377 arg0, int arg1, int arg2, int arg3) {
        field2648++;
        class478 var5 = (class478) arg0;
        int var6 = var5.field7017 + arg2 + 1;
        int var7 = var5.field7029 + arg3 + arg1;
        int var8 = this.field2651 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7015;
        int var11 = var5.field7020;
        int var12 = this.field2651 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field2651 * var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field2655) {
            int var15 = var10 + var7 + 1 - this.field2655;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var9 += var16;
            var12 += var16;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
        }
        if (var6 + var11 >= this.field2651) {
            int var17 = var11 + var6 + 1 - this.field2651;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class299.method1896(var11, -81, var14, var8, var5.field7028, var10, this.field2649, var12, var9);
            this.method1229(var10, arg3 + 5442, var11, var7, var6);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILj;IB)Z")
    public final boolean method1225(int arg0, class377 arg1, int arg2, byte arg3) {
        field2654++;
        if (arg3 != 17) {
            method1222(-125, (byte) -114);
        }
        class478 var5 = (class478) arg1;
        int var6 = var5.field7017 + arg2 + 1;
        int var7 = var5.field7029 + arg0 + 1;
        int var8 = this.field2651 * var7 + var6;
        int var9 = var5.field7015;
        int var10 = var5.field7020;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field2651 * var11;
            var9 -= var11;
            var7 = 1;
        }
        int var12 = this.field2651 - var10;
        if ((var7 + var9) >= this.field2655) {
            int var13 = var7 + var9 + 1 - this.field2655;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += var14;
            var12 += var14;
        }
        if ((var6 + var10) >= this.field2651) {
            int var15 = var6 + var10 + 1 - this.field2651;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2651 + var12;
            return class178.method1213((byte) 106, this.field2649, var9, var10, var17, var8, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI[[ZIII)V")
    public final void method1226(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        this.field2646.method2130(51, false);
        field2638++;
        this.field2646.method2177(3678, false);
        if (arg3 != -19762) {
            method1223((byte) 84);
        }
        this.field2646.method2161(127, -2);
        this.field2646.method2186(1, -53);
        this.field2646.method2162(1, 1);
        float var7 = 1.0F / (float) (this.field2646.field5229 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field2642; var8++) {
                int var9 = var8 << this.field2644;
                int var10 = var8 + 1 << this.field2644;
                label135: for (int var11 = 0; var11 < this.field2652; var11++) {
                    int var12 = var11 << this.field2644;
                    int var13 = var11 + 1 << this.field2644;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg1) >= (-arg4) && arg4 >= (var14 - arg1)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg5) >= (-arg4) && arg4 >= var15 - arg5 && arg2[var14 + arg4 - arg1][var15 + arg4 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2657[var11][var8].method2113((byte) -49);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2642; var16++) {
                int var17 = var16 << this.field2644;
                int var18 = var16 + 1 << this.field2644;
                for (int var19 = 0; var19 < this.field2652; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2644;
                    int var22 = var19 + 1 << this.field2644;
                    class209 var23 = class415.field6228;
                    var23.field3037 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg5 >= -arg4 && arg4 >= var24 - arg5) {
                            int var25 = this.field2650.field370 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg4 <= var26 - arg1 && arg4 >= var26 - arg1 && arg2[var26 - (arg1 - arg4)][var24 + arg4 - arg5]) {
                                    short[] var27 = this.field2650.field3251[var25];
                                    if (var27 != null) {
                                        if (this.field2646.field5313) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method1413(arg3 ^ 0x4D46, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1453((byte) -78, var27[var29] & 0xFFFF);
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
                        this.field2657[var19][var16].method2117(5123, true, var23.field3036, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        class261.method1734();
        if (arg0 != 10483) {
            field2641 = -99;
        }
        field2643++;
        for (int var1 = 0; var1 < 4; var1++) {
            class434.field6500[var1].method863(-102);
        }
        class264.method1758(20841);
        class426.method2554(126);
        System.gc();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILj;)V")
    public final void method1228(int arg0, int arg1, int arg2, class377 arg3) {
        field2645++;
        class478 var5 = (class478) arg3;
        if (arg2 != 28246) {
            this.method1221(106);
        }
        int var6 = var5.field7017 + arg0 + 1;
        int var7 = var5.field7029 + arg1 + 1;
        int var8 = var6 + (this.field2651 * var7);
        int var9 = 0;
        int var10 = var5.field7015;
        int var11 = var5.field7020;
        int var12 = this.field2651 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field2651 * var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field2655) {
            int var15 = var7 + var10 + 1 - this.field2655;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var13 += var16;
            var12 += var16;
            var11 -= var16;
        }
        if (var6 + var11 >= this.field2651) {
            int var17 = var6 + var11 + 1 - this.field2651;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class252.method1696(var11, var13, this.field2649, var9, var5.field7028, 0, var8, var12, var10);
            this.method1229(var10, arg2 ^ 0x7B15, var11, var7, var6);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    private final void method1229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2640++;
        if (this.field2657 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg2 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        if (arg1 != 5443) {
            return;
        }
        int var9 = arg3 - (1 + 1 - arg0) >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class348[] var11 = this.field2657[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5008 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lod;Lon;)V")
    public class180(class349 arg0, class220 arg1) {
        this.field2650 = arg1;
        this.field2646 = arg0;
        this.field2651 = (this.field2650.field370 * this.field2650.field365 >> this.field2646.field5231) + 2;
        this.field2655 = (this.field2650.field369 * this.field2650.field365 >> this.field2646.field5231) + 2;
        this.field2644 = 7 - (this.field2650.field372 - this.field2646.field5231);
        this.field2649 = new byte[this.field2655 * this.field2651];
        this.field2652 = this.field2650.field370 >> this.field2644;
        this.field2642 = this.field2650.field369 >> this.field2644;
    }
}
