import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NDGQUJMA")
public class class36 extends class8 {

    @OriginalMember(owner = "client!NDGQUJMA", name = "w", descriptor = "Z")
    private boolean field1069 = false;

    @OriginalMember(owner = "client!NDGQUJMA", name = "x", descriptor = "Z")
    private boolean field1070 = true;

    @OriginalMember(owner = "client!NDGQUJMA", name = "y", descriptor = "Z")
    private boolean field1071 = false;

    @OriginalMember(owner = "client!NDGQUJMA", name = "z", descriptor = "I")
    private int field1072 = 4;

    @OriginalMember(owner = "client!NDGQUJMA", name = "A", descriptor = "I")
    private int field1073 = -406;

    @OriginalMember(owner = "client!NDGQUJMA", name = "B", descriptor = "B")
    private byte field1074 = 9;

    @OriginalMember(owner = "client!NDGQUJMA", name = "C", descriptor = "Z")
    private boolean field1075 = true;

    @OriginalMember(owner = "client!NDGQUJMA", name = "D", descriptor = "[I")
    public int[] field1076;

    @OriginalMember(owner = "client!NDGQUJMA", name = "I", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!NDGQUJMA", name = "E", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!NDGQUJMA", name = "J", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!NDGQUJMA", name = "F", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!NDGQUJMA", name = "H", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!NDGQUJMA", name = "G", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        this.field1076 = new int[arg0 * arg1];
        this.field1077 = this.field1081 = arg0;
        this.field1078 = this.field1082 = arg1;
        this.field1079 = this.field1080 = 0;
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class36(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1077 = var3.getWidth(arg1);
            this.field1078 = var3.getHeight(arg1);
            this.field1081 = this.field1077;
            this.field1082 = this.field1078;
            this.field1079 = 0;
            this.field1080 = 0;
            this.field1076 = new int[this.field1078 * this.field1077];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1077, this.field1078, this.field1076, 0, this.field1077);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "<init>", descriptor = "(LVSQMPWOM;Ljava/lang/String;I)V")
    public class36(class59 arg0, String arg1, int arg2) {
        class3 var4 = new class3(arg0.method526(arg1 + ".dat", null), -990);
        class3 var5 = new class3(arg0.method526("index.dat", null), -990);
        var5.field50 = var4.method56();
        this.field1081 = var5.method56();
        this.field1082 = var5.method56();
        int var6 = var5.method54();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method58();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field50 += 2;
            var4.field50 += var5.method56() * var5.method56();
            var5.field50++;
        }
        this.field1079 = var5.method54();
        this.field1080 = var5.method54();
        this.field1077 = var5.method56();
        this.field1078 = var5.method56();
        int var10 = var5.method54();
        int var11 = this.field1078 * this.field1077;
        this.field1076 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1076[var12] = var7[var4.method54()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1077; var13++) {
                for (int var14 = 0; var14 < this.field1078; var14++) {
                    this.field1076[this.field1077 * var14 + var13] = var7[var4.method54()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "b", descriptor = "(I)V")
    public void method348(int arg0) {
        if (arg0 == -19705) {
            class8.method138(this.field1078, this.field1076, 0, this.field1077);
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIII)V")
    public void method349(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1076.length; var5++) {
            int var7 = this.field1076[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg1 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg3 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field1076[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        int var6 = 79 / arg2;
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "c", descriptor = "(I)V")
    public void method350(int arg0) {
        int[] var2 = new int[this.field1082 * this.field1081];
        for (int var3 = 0; var3 < this.field1078; var3++) {
            for (int var4 = 0; var4 < this.field1077; var4++) {
                var2[(this.field1080 + var3) * this.field1081 + this.field1079 + var4] = this.field1076[this.field1077 * var3 + var4];
            }
        }
        this.field1076 = var2;
        if (arg0 != -31455) {
            this.field1071 = !this.field1071;
        }
        this.field1077 = this.field1081;
        this.field1078 = this.field1082;
        this.field1079 = 0;
        this.field1080 = 0;
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(III)V")
    public void method351(int arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field1071 = !this.field1071;
        }
        int var4 = this.field1079 + arg2;
        int var5 = this.field1080 + arg0;
        int var6 = class8.field152 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1078;
        int var9 = this.field1077;
        int var10 = class8.field152 - var9;
        int var11 = 0;
        if (var5 < class8.field154) {
            int var12 = class8.field154 - var5;
            var8 -= var12;
            var5 = class8.field154;
            var7 += var9 * var12;
            var6 += class8.field152 * var12;
        }
        if (var5 + var8 > class8.field155) {
            var8 -= var5 + var8 - class8.field155;
        }
        if (var4 < class8.field156) {
            int var13 = class8.field156 - var4;
            var9 -= var13;
            var4 = class8.field156;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class8.field157) {
            int var14 = var4 + var9 - class8.field157;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method352(var9, class8.field151, var8, this.field1076, var10, var6, this.field1072, var7, var11);
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[II[IIIIII)V")
    private void method352(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        if (arg6 != 4) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg1[arg5++] = arg3[arg7++];
                arg1[arg5++] = arg3[arg7++];
                arg1[arg5++] = arg3[arg7++];
                arg1[arg5++] = arg3[arg7++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg1[arg5++] = arg3[arg7++];
            }
            arg5 += arg4;
            arg7 += arg8;
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IBI)V")
    public void method353(int arg0, byte arg1, int arg2) {
        if (arg1 != 3) {
            return;
        }
        int var4 = this.field1079 + arg2;
        int var5 = this.field1080 + arg0;
        int var6 = class8.field152 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1078;
        int var9 = this.field1077;
        int var10 = class8.field152 - var9;
        int var11 = 0;
        if (var5 < class8.field154) {
            int var12 = class8.field154 - var5;
            var8 -= var12;
            var5 = class8.field154;
            var7 += var9 * var12;
            var6 += class8.field152 * var12;
        }
        if (var5 + var8 > class8.field155) {
            var8 -= var5 + var8 - class8.field155;
        }
        if (var4 < class8.field156) {
            int var13 = class8.field156 - var4;
            var9 -= var13;
            var4 = class8.field156;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class8.field157) {
            int var14 = var4 + var9 - class8.field157;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method354(class8.field151, this.field1076, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method354(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIBI)V")
    public void method355(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field1079 + arg3;
        int var6 = this.field1080 + arg1;
        int var7 = class8.field152 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1078;
        int var10 = this.field1077;
        int var11 = class8.field152 - var10;
        int var12 = 0;
        if (var6 < class8.field154) {
            int var13 = class8.field154 - var6;
            var9 -= var13;
            var6 = class8.field154;
            var8 += var10 * var13;
            var7 += class8.field152 * var13;
        }
        if (var6 + var9 > class8.field155) {
            var9 -= var6 + var9 - class8.field155;
        }
        if (var5 < class8.field156) {
            int var14 = class8.field156 - var5;
            var10 -= var14;
            var5 = class8.field156;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class8.field157) {
            int var15 = var5 + var10 - class8.field157;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return;
        }
        this.method356(this.field1073, var9, 0, var8, arg0, var7, this.field1076, class8.field151, var11, var12, var10);
        if (arg2 != 1) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIIIII[I[IIII)V")
    private void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg4;
        if (arg0 != -406) {
            this.field1071 = !this.field1071;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = -arg10; var14 < 0; var14++) {
                int var15 = arg6[arg3++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg7[arg5];
                    arg7[arg5++] = ((var15 & 0xFF00FF) * arg4 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg4 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg8;
            arg3 += arg9;
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[IIIII[IIIII)V")
    public void method357(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 <= 0) {
            this.field1075 = !this.field1075;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg7 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class8.field152 * arg4 + arg8;
            for (int var21 = 0; var21 < arg7; var21++) {
                int var22 = arg6[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class8.field151[var23++] = this.field1076[(var24 >> 16) + (var25 >> 16) * this.field1077];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class8.field152;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIIDIIIII)V")
    public void method358(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 0) {
            this.field1075 = !this.field1075;
        }
        try {
            int var11 = -arg6 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class8.field152 * arg0 + arg8;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg6; var24 < 0; var24++) {
                    int var25 = this.field1076[(var22 >> 16) + (var23 >> 16) * this.field1077];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class8.field151[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class8.field152;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(IIILRAOZRSKX;)V")
    public void method359(int arg0, int arg1, int arg2, class44 arg3) {
        int var5 = this.field1079 + arg0;
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = this.field1080 + arg2;
        int var8 = class8.field152 * var7 + var5;
        int var9 = 0;
        int var10 = this.field1078;
        int var11 = this.field1077;
        int var12 = class8.field152 - var11;
        int var13 = 0;
        if (var7 < class8.field154) {
            int var14 = class8.field154 - var7;
            var10 -= var14;
            var7 = class8.field154;
            var9 += var11 * var14;
            var8 += class8.field152 * var14;
        }
        if (var7 + var10 > class8.field155) {
            var10 -= var7 + var10 - class8.field155;
        }
        if (var5 < class8.field156) {
            int var15 = class8.field156 - var5;
            var11 -= var15;
            var5 = class8.field156;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class8.field157) {
            int var16 = var5 + var11 - class8.field157;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method360(var11, class8.field151, var8, this.field1076, var12, var13, arg3.field1233, var10, var9, 0, 0);
        }
    }

    @OriginalMember(owner = "client!NDGQUJMA", name = "a", descriptor = "(I[II[III[BIIII)V")
    private void method360(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 != 0) {
            this.field1070 = !this.field1070;
        }
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg8++];
                if (var18 != 0 && arg6[arg2] == 0) {
                    arg1[arg2++] = var18;
                } else {
                    arg2++;
                }
                int var19 = arg3[arg8++];
                if (var19 != 0 && arg6[arg2] == 0) {
                    arg1[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg3[arg8++];
                if (var20 != 0 && arg6[arg2] == 0) {
                    arg1[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg3[arg8++];
                if (var21 != 0 && arg6[arg2] == 0) {
                    arg1[arg2++] = var21;
                } else {
                    arg2++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg8++];
                if (var17 != 0 && arg6[arg2] == 0) {
                    arg1[arg2++] = var17;
                } else {
                    arg2++;
                }
            }
            arg2 += arg4;
            arg8 += arg5;
        }
    }
}
