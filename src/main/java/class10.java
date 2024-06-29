import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class55 {

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[I")
    public int[] field164;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 11)
    public final void method71(int arg0, int arg1) {
        int var3 = this.field166 + arg0;
        int var4 = this.field162 + arg1;
        int var5 = class55.field1272 * var4 + var3;
        int var6 = 0;
        int var7 = this.field165;
        int var8 = this.field167;
        int var9 = class55.field1272 - var8;
        int var10 = 0;
        if (var4 < class55.field1269) {
            int var11 = class55.field1269 - var4;
            var7 -= var11;
            var4 = class55.field1269;
            var6 += var8 * var11;
            var5 += class55.field1272 * var11;
        }
        if (var4 + var7 > class55.field1266) {
            var7 -= var4 + var7 - class55.field1266;
        }
        if (var3 < class55.field1270) {
            int var12 = class55.field1270 - var3;
            var8 -= var12;
            var3 = class55.field1270;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class55.field1268) {
            int var13 = var3 + var8 - class55.field1268;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method76(class55.field1271, this.field164, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lm;II)V", line = 65)
    public final void method72(class72 arg0, int arg1, int arg2) {
        int var4 = this.field166 + arg1;
        int var5 = this.field162 + arg2;
        int var6 = class55.field1272 * var5 + var4;
        int var7 = 0;
        int var8 = this.field165;
        int var9 = this.field167;
        int var10 = class55.field1272 - var9;
        int var11 = 0;
        if (var5 < class55.field1269) {
            int var12 = class55.field1269 - var5;
            var8 -= var12;
            var5 = class55.field1269;
            var7 += var9 * var12;
            var6 += class55.field1272 * var12;
        }
        if (var5 + var8 > class55.field1266) {
            var8 -= var5 + var8 - class55.field1266;
        }
        if (var4 < class55.field1270) {
            int var13 = class55.field1270 - var4;
            var9 -= var13;
            var4 = class55.field1270;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class55.field1268) {
            int var14 = var4 + var9 - class55.field1268;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method80(class55.field1271, this.field164, 0, var7, var6, var9, var8, var10, var11, arg0.field1695);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[IIIIIII)V", line = 121)
    private static final void method73(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)V", line = 147)
    public final void method74(int arg0, int arg1) {
        int var3 = this.field166 + arg0;
        int var4 = this.field162 + arg1;
        int var5 = class55.field1272 * var4 + var3;
        int var6 = 0;
        int var7 = this.field165;
        int var8 = this.field167;
        int var9 = class55.field1272 - var8;
        int var10 = 0;
        if (var4 < class55.field1269) {
            int var11 = class55.field1269 - var4;
            var7 -= var11;
            var4 = class55.field1269;
            var6 += var8 * var11;
            var5 += class55.field1272 * var11;
        }
        if (var4 + var7 > class55.field1266) {
            var7 -= var4 + var7 - class55.field1266;
        }
        if (var3 < class55.field1270) {
            int var12 = class55.field1270 - var3;
            var8 -= var12;
            var3 = class55.field1270;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class55.field1268) {
            int var13 = var3 + var8 - class55.field1268;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method73(class55.field1271, this.field164, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V", line = 201)
    public final void method75() {
        class55.method399(this.field164, this.field167, this.field165);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[IIIIIIII)V", line = 220)
    private static final void method76(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIDI)V", line = 285)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = class55.field1272 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field164[(var21 >> 16) + (var22 >> 16) * this.field167];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        class55.field1271[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += class55.field1272;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[IIIIIIIII)V", line = 340)
    private static final void method78(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 0xFF00FF) * arg9 + (var14 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 + (var14 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V", line = 375)
    public final void method79(int arg0, int arg1, int arg2) {
        int var4 = this.field166 + arg0;
        int var5 = this.field162 + arg1;
        int var6 = class55.field1272 * var5 + var4;
        int var7 = 0;
        int var8 = this.field165;
        int var9 = this.field167;
        int var10 = class55.field1272 - var9;
        int var11 = 0;
        if (var5 < class55.field1269) {
            int var12 = class55.field1269 - var5;
            var8 -= var12;
            var5 = class55.field1269;
            var7 += var9 * var12;
            var6 += class55.field1272 * var12;
        }
        if (var5 + var8 > class55.field1266) {
            var8 -= var5 + var8 - class55.field1266;
        }
        if (var4 < class55.field1270) {
            int var13 = class55.field1270 - var4;
            var9 -= var13;
            var4 = class55.field1270;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class55.field1268) {
            int var14 = var4 + var9 - class55.field1268;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method78(class55.field1271, this.field164, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[IIIIIIII[B)V", line = 430)
    private static final void method80(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var16;
                } else {
                    arg4++;
                }
                int var17 = arg1[arg3++];
                if (var17 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var17;
                } else {
                    arg4++;
                }
                int var18 = arg1[arg3++];
                if (var18 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg1[arg3++];
                if (var19 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var19;
                } else {
                    arg4++;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var15;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V", line = 507)
    public final void method81() {
        if (this.field167 == this.field161 && this.field165 == this.field163) {
            return;
        }
        int[] var1 = new int[this.field163 * this.field161];
        for (int var2 = 0; var2 < this.field165; var2++) {
            for (int var3 = 0; var3 < this.field167; var3++) {
                var1[(this.field162 + var2) * this.field161 + this.field166 + var3] = this.field164[this.field167 * var2 + var3];
            }
        }
        this.field164 = var1;
        this.field167 = this.field161;
        this.field165 = this.field163;
        this.field166 = 0;
        this.field162 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII[I[I)V", line = 539)
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class55.field1272 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    class55.field1271[var22++] = this.field164[(var23 >> 16) + (var24 >> 16) * this.field167];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class55.field1272;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V", line = 592)
    public final void method83(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field164.length; var4++) {
            int var5 = this.field164[var4];
            if (var5 != 0) {
                int var6 = var5 >> 16 & 0xFF;
                int var7 = arg0 + var6;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var5 >> 8 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var5 & 0xFF;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                this.field164[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 639)
    public class10() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V", line = 644)
    public class10(int arg0, int arg1) {
        this.field164 = new int[arg0 * arg1];
        this.field167 = this.field161 = arg0;
        this.field165 = this.field163 = arg1;
        this.field166 = this.field162 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([BLjava/awt/Component;)V", line = 650)
    public class10(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field167 = var3.getWidth(arg1);
            this.field165 = var3.getHeight(arg1);
            this.field161 = this.field167;
            this.field163 = this.field165;
            this.field166 = 0;
            this.field162 = 0;
            this.field164 = new int[this.field167 * this.field165];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field167, this.field165, this.field164, 0, this.field167);
            var5.grabPixels();
        } catch (InterruptedException var6) {
        }
    }
}
