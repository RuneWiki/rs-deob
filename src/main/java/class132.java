import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class132 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Loj;")
    private class350 field2357;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lus;")
    private class1 field2359;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[B")
    public byte[] field2364;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
    public static int[] field2369 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[Lgaa;")
    public static class272[] field2376 = new class272[16];

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[[Luu;")
    private class261[][] field2367;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILha;II)V")
    public final void method1101(int arg0, class54 arg1, int arg2, int arg3) {
        field2363++;
        class170 var5 = (class170) arg1;
        int var6 = var5.field2828 + arg3 + 1;
        int var7 = var5.field2825 + arg0 + 1;
        int var8 = this.field2361 * var6 + var7;
        int var9 = arg2;
        int var10 = var5.field2830;
        int var11 = var5.field2835;
        int var12 = this.field2361 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var9 = var11 * var13 + arg2;
            var8 += this.field2361 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field2365) {
            int var15 = var6 + var10 + 1 - this.field2365;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var14 += var16;
            var9 += var16;
            var8 += var16;
            var7 = 1;
            var11 -= var16;
        }
        if ((var7 + var11) >= this.field2361) {
            int var17 = var7 + 1 - (this.field2361 - var11);
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class74.method796(var14, -5504, var11, var5.field2834, var9, var10, var12, this.field2364, var8);
            this.method1108((byte) -113, var7, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIII)I")
    public static final int method1102(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2358++;
        int var5 = 65536 - class509.field7220[arg2 * 8192 / arg4] >> 1;
        if (arg1) {
            method1104(-37L, 15);
        }
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILha;B)Z")
    public final boolean method1103(int arg0, int arg1, class54 arg2, byte arg3) {
        field2375++;
        class170 var5 = (class170) arg2;
        int var6 = var5.field2825 + arg0 + 1;
        int var7 = var5.field2828 + arg1 + 1;
        int var8 = this.field2361 * var7 + var6;
        int var9 = var5.field2830;
        int var10 = -30 % ((arg3 - 74) / 35);
        int var11 = var5.field2835;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var7 = 1;
            var8 += this.field2361 * var12;
        }
        int var13 = this.field2361 - var11;
        if ((var7 + var9) >= this.field2365) {
            int var14 = var7 + var9 + 1 - this.field2365;
            var9 -= var14;
        }
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var8 += var15;
            var13 += var15;
            var6 = 1;
            var11 -= var15;
        }
        if ((var6 + var11) >= this.field2361) {
            int var16 = var6 + var11 + 1 - this.field2361;
            var13 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field2361 + var13;
            return class594.method3384(var11, var18, (byte) -21, this.field2364, var9, var8, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JI)V")
    public static final void method1104(long arg0, int arg1) {
        field2366++;
        int var3 = class27.field924 + class532.field7456.field9806;
        int var4 = class121.field2217 + class532.field7456.field9815;
        if (class98.field1762 - var3 < -2000 || (class98.field1762 - var3) > 2000 || (class369.field5478 - var4) < -2000 || class369.field5478 - var4 > 2000) {
            class369.field5478 = var4;
            class98.field1762 = var3;
        }
        if (class98.field1762 != var3) {
            int var5 = var3 - class98.field1762;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class98.field1762 += var6;
        }
        if (class369.field5478 != var4) {
            int var7 = var4 - class369.field5478;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class369.field5478 += var8;
        }
        if (arg1 != -17342) {
            method1102(-43, true, -13, -91, 50);
        }
        if (!class527.field7429.field2675) {
            class591.field8509 += (float) arg0 * class565.field8253 / 6.0F;
            class27.field926 += (float) arg0 * class623.field9015 / 6.0F;
        }
        class150.method1182(arg1 + 17226);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZBIII[[Z)V")
    public final void method1105(boolean arg0, byte arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        this.field2359.method172(false, 4);
        if (arg1 != -75) {
            this.method1101(21, null, 5, 4);
        }
        field2362++;
        this.field2359.method45(false, -127);
        this.field2359.method161(-106, -2);
        this.field2359.method133(1, (byte) -128);
        this.field2359.method7(1, (byte) 76);
        float var7 = 1.0F / (float) (this.field2359.field211 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field2371; var8++) {
                int var9 = var8 << this.field2368;
                int var10 = var8 + 1 << this.field2368;
                label135: for (int var11 = 0; var11 < this.field2372; var11++) {
                    int var12 = var11 << this.field2368;
                    int var13 = var11 + 1 << this.field2368;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg2) >= (-arg3) && arg3 >= var14 - arg2) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg3 <= var15 - arg4 && arg3 >= (var15 - arg4) && arg5[arg3 + var14 - arg2][arg3 + var15 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2367[var11][var8].method1710((byte) 77);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2371; var16++) {
                int var17 = var16 << this.field2368;
                int var18 = var16 + 1 << this.field2368;
                for (int var19 = 0; var19 < this.field2372; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2368;
                    int var22 = var19 + 1 << this.field2368;
                    class424 var23 = this.field2359.field333;
                    var23.field1393 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg4) >= (-arg3) && arg3 >= (var24 - arg4)) {
                            int var25 = this.field2357.field1041 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg2 >= -arg3 && arg3 >= var26 - arg2 && arg5[var26 + arg3 - arg2][var24 + arg3 - arg4]) {
                                    short[] var27 = this.field2357.field5236[var25];
                                    if (var27 != null) {
                                        if (this.field2359.field267) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method745(var27[var29] & 0xFFFF, 128);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method689(var27[var28] & 0xFFFF, true);
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
                        this.field2367[var19][var16].method1714(var23.field1397, 5123, var20, (byte) 100);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIILha;)V")
    public final void method1106(byte arg0, int arg1, int arg2, class54 arg3) {
        field2374++;
        class170 var5 = (class170) arg3;
        int var6 = var5.field2825 + arg1 + 1;
        int var7 = var5.field2828 + arg2 + 1;
        int var8 = var6 + (this.field2361 * var7);
        if (arg0 != -25) {
            this.field2367 = null;
        }
        int var9 = 0;
        int var10 = var5.field2830;
        int var11 = var5.field2835;
        int var12 = this.field2361 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var8 += this.field2361 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field2365) {
            int var15 = var7 + var10 + 1 - this.field2365;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var6 = 1;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (this.field2361 <= (var6 + var11)) {
            int var17 = var6 + 1 - (-var11 + this.field2361);
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class475.method2889(var12, var8, var5.field2834, arg0 - 103, var9, var14, var11, var10, this.field2364);
            this.method1108((byte) 24, var6, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method1107(int arg0) {
        field2360++;
        this.field2367 = new class261[this.field2372][this.field2371];
        for (int var2 = arg0; var2 < this.field2371; var2++) {
            for (int var3 = 0; var3 < this.field2372; var3++) {
                this.field2367[var3][var2] = new class261(this.field2359, this, this.field2357, var3, var2, this.field2368, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIII)V")
    private final void method1108(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2370++;
        if (this.field2367 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 2 >> 7;
        int var10 = -79 % ((arg0 + 67) / 40);
        for (int var11 = var6; var11 <= var7; var11++) {
            class261[] var12 = this.field2367[var11];
            for (int var13 = var8; var13 <= var9; var13++) {
                var12[var13].field3832 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lus;Loj;)V")
    public class132(class1 arg0, class350 arg1) {
        this.field2357 = arg1;
        this.field2359 = arg0;
        this.field2361 = (this.field2357.field1041 * this.field2357.field1040 >> this.field2359.field212) + 2;
        this.field2365 = (this.field2357.field1043 * this.field2357.field1040 >> this.field2359.field212) + 2;
        this.field2368 = this.field2359.field212 + 7 - this.field2357.field1038;
        this.field2364 = new byte[this.field2365 * this.field2361];
        this.field2372 = this.field2357.field1041 >> this.field2368;
        this.field2371 = this.field2357.field1043 >> this.field2368;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method1109(boolean arg0) {
        field2369 = null;
        field2376 = null;
        if (arg0) {
            method1104(-49L, -50);
        }
    }
}
