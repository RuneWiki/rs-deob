import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class174 {

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Lal;")
    private class195 field2636;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Llea;")
    private class573 field2627;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "[B")
    public byte[] field2617;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    private int field2628;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "I")
    public static int field2635 = 0;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "Lus;")
    public static class341 field2634;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field2619;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "[Lvda;")
    public static class537[] field2630;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "[[Ltf;")
    private class247[][] field2633;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V")
    private final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2626++;
        if (this.field2633 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg0 + arg1 + arg4 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class247[] var11 = this.field2633[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3538 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        if (arg0 < 35) {
            method1280(6, 51);
        }
        field2619 = null;
        field2630 = null;
        field2634 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        field2622++;
        this.field2633 = new class247[this.field2629][this.field2631];
        for (int var2 = 0; var2 < this.field2631; var2++) {
            for (int var3 = 0; var3 < this.field2629; var3++) {
                this.field2633[var3][var2] = new class247(this.field2627, this, this.field2636, var3, var2, this.field2628, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 < 35) {
            this.method1277(63, -89, 94, 49, -12);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Lica;")
    public static final class334 method1280(int arg0, int arg1) {
        field2625++;
        int var2 = -11 / ((-arg1 - 26) / 44);
        if (arg0 == 0) {
            return new class789();
        } else if (arg0 == 1) {
            return new class37();
        } else if (arg0 == 2) {
            return new class81();
        } else if (arg0 == 3) {
            return new class430();
        } else if (arg0 == 4) {
            return new class790();
        } else if (arg0 == 5) {
            return new class645();
        } else if (arg0 == 6) {
            return new class289();
        } else if (arg0 == 7) {
            return new class398();
        } else if (arg0 == 8) {
            return new class681();
        } else if (arg0 == 9) {
            return new class433();
        } else if (arg0 == 10) {
            return new class512();
        } else if (arg0 == 11) {
            return new class560();
        } else if (arg0 == 12) {
            return new class616();
        } else if (arg0 == 13) {
            return new class630();
        } else if (arg0 == 14) {
            return new class575();
        } else if (arg0 == 15) {
            return new class607();
        } else if (arg0 == 16) {
            return new class672();
        } else if (arg0 == 17) {
            return new class379();
        } else if (arg0 == 18) {
            return new class648();
        } else if (arg0 == 19) {
            return new class734();
        } else if (arg0 == 20) {
            return new class758();
        } else if (arg0 == 21) {
            return new class259();
        } else if (arg0 == 22) {
            return new class274();
        } else if (arg0 == 23) {
            return new class759();
        } else if (arg0 == 24) {
            return new class552();
        } else if (arg0 == 25) {
            return new class530();
        } else if (arg0 == 26) {
            return new class314();
        } else if (arg0 == 27) {
            return new class145();
        } else if (arg0 == 28) {
            return new class442();
        } else if (arg0 == 29) {
            return new class245();
        } else if (arg0 == 30) {
            return new class306();
        } else if (arg0 == 31) {
            return new class176();
        } else if (arg0 == 32) {
            return new class4();
        } else if (arg0 == 33) {
            return new class608();
        } else if (arg0 == 34) {
            return new class558();
        } else if (arg0 == 35) {
            return new class568();
        } else if (arg0 == 36) {
            return new class488();
        } else if (arg0 == 37) {
            return new class321();
        } else if (arg0 == 38) {
            return new class256();
        } else if (arg0 == 39) {
            return new class121();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIBLr;)V")
    public final void method1281(int arg0, int arg1, byte arg2, class115 arg3) {
        field2621++;
        class9 var5 = (class9) arg3;
        int var6 = var5.field132 + arg1 + 1;
        int var7 = var5.field131 + arg0 + 1;
        int var8 = this.field2623 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field136;
        int var11 = var5.field129;
        int var12 = this.field2623 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += this.field2623 * var14;
            var7 = 1;
            var9 += var11 * var14;
        }
        if (arg2 > -102) {
            return;
        }
        if (var7 + var10 >= this.field2618) {
            int var15 = var7 + var10 + 1 - this.field2618;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var12 += var16;
            var6 = 1;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
        }
        if (var6 + var11 >= this.field2623) {
            int var17 = var11 + var6 + 1 - this.field2623;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class678.method3803(this.field2617, var8, var10, var11, var12, var9, var13, var5.field133, (byte) 106);
            this.method1277(-1, var6, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIB[[ZZI)V")
    public final void method1282(int arg0, int arg1, byte arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field2627.method3385(false, -8);
        field2620++;
        this.field2627.method3377(-32, false);
        this.field2627.method3364(0, -2);
        this.field2627.method3375(1, (byte) 102);
        this.field2627.method3308((byte) 76, 1);
        float var7 = 1.0F / (float) (this.field2627.field8137 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field2631; var22++) {
                int var23 = var22 << this.field2628;
                int var24 = var22 + 1 << this.field2628;
                label89: for (int var25 = 0; var25 < this.field2629; var25++) {
                    int var26 = var25 << this.field2628;
                    int var27 = var25 + 1 << this.field2628;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg0 >= -arg5 && (var28 - arg0) <= arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg5) <= (var29 - arg1) && arg5 >= var29 - arg1 && arg3[var28 + arg5 - arg0][var29 + arg5 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2633[var25][var22].method1641(-112);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2631; var8++) {
                int var9 = var8 << this.field2628;
                int var10 = var8 + 1 << this.field2628;
                for (int var11 = 0; var11 < this.field2629; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field2628;
                    int var14 = var11 + 1 << this.field2628;
                    class501 var15 = this.field2627.field8238;
                    var15.field5983 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg5 <= var16 - arg1 && (var16 - arg1) <= arg5) {
                            int var17 = this.field2636.field5808 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((var18 - arg0) >= (-arg5) && arg5 >= var18 - arg0 && arg3[arg5 + var18 - arg0][arg5 + var16 - arg1]) {
                                    short[] var19 = this.field2636.field2910[var17];
                                    if (var19 != null) {
                                        if (this.field2627.field8231) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2546(true, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2582((byte) -96, var19[var20] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field2633[var11][var8].method1642(var12, 5123, var15.field6002, 80);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg2 > -25) {
            this.field2636 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIILr;)V")
    public final void method1283(int arg0, int arg1, int arg2, class115 arg3) {
        field2632++;
        class9 var5 = (class9) arg3;
        int var6 = var5.field132 + arg0 + 1;
        if (arg2 != 31247) {
            this.method1283(50, -122, -81, null);
        }
        int var7 = var5.field131 + arg1 + 1;
        int var8 = this.field2623 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field136;
        int var11 = var5.field129;
        int var12 = this.field2623 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field2623 * var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field2618) {
            int var15 = var7 + var10 + 1 - this.field2618;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var13 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var6 = 1;
        }
        if (this.field2623 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field2623;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class381.method2297(var10, this.field2617, var12, var9, var13, var8, (byte) -114, var11, var5.field133);
            this.method1277(-1, var6, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIILr;)Z")
    public final boolean method1284(int arg0, int arg1, int arg2, class115 arg3) {
        field2624++;
        class9 var5 = (class9) arg3;
        int var6 = var5.field131 + arg2 + 1;
        int var7 = var5.field132 + arg0 + 1;
        int var8 = this.field2623 * var6 + var7;
        if (arg1 != 353) {
            return true;
        }
        int var9 = var5.field136;
        int var10 = var5.field129;
        int var11 = this.field2623 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field2623 * var12;
        }
        if (this.field2618 <= var6 + var9) {
            int var13 = var9 + var6 + 1 - this.field2618;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var11 += var14;
            var7 = 1;
        }
        if (this.field2623 <= var7 + var10) {
            int var15 = var7 - (-var10 - 1) - this.field2623;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2623 + var11;
            return class329.method1998(-1, var16, var17, var10, var8, var9, this.field2617);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Llea;Lal;)V")
    public class174(class573 arg0, class195 arg1) {
        this.field2636 = arg1;
        this.field2627 = arg0;
        this.field2623 = (this.field2636.field5808 * this.field2636.field5805 >> this.field2627.field8134) + 2;
        this.field2618 = (this.field2636.field5809 * this.field2636.field5805 >> this.field2627.field8134) + 2;
        this.field2617 = new byte[this.field2623 * this.field2618];
        this.field2628 = this.field2627.field8134 + 7 - this.field2636.field5807;
        this.field2629 = this.field2636.field5808 >> this.field2628;
        this.field2631 = this.field2636.field5809 >> this.field2628;
    }
}
