import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LXRBRCRX")
public class class30 extends class29 {

    @OriginalMember(owner = "LXRBRCRX", name = "z", descriptor = "Z")
    private boolean field1013 = false;

    @OriginalMember(owner = "LXRBRCRX", name = "B", descriptor = "I")
    private int field1015 = 6;

    @OriginalMember(owner = "LXRBRCRX", name = "C", descriptor = "Z")
    private boolean field1016 = true;

    @OriginalMember(owner = "LXRBRCRX", name = "D", descriptor = "I")
    private int field1017 = -253;

    @OriginalMember(owner = "LXRBRCRX", name = "E", descriptor = "I")
    private int field1018 = 3;

    @OriginalMember(owner = "LXRBRCRX", name = "F", descriptor = "B")
    private byte field1019 = 54;

    @OriginalMember(owner = "LXRBRCRX", name = "G", descriptor = "Z")
    private boolean field1020 = false;

    @OriginalMember(owner = "LXRBRCRX", name = "H", descriptor = "B")
    private byte field1021 = 3;

    @OriginalMember(owner = "LXRBRCRX", name = "I", descriptor = "Z")
    private boolean field1022 = true;

    @OriginalMember(owner = "LXRBRCRX", name = "J", descriptor = "I")
    private int field1023 = 7;

    @OriginalMember(owner = "LXRBRCRX", name = "K", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "LXRBRCRX", name = "P", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "LXRBRCRX", name = "L", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "LXRBRCRX", name = "Q", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "LXRBRCRX", name = "M", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "LXRBRCRX", name = "O", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "LXRBRCRX", name = "N", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "LXRBRCRX", name = "A", descriptor = "I")
    private static int field1014 = -302;

    @OriginalMember(owner = "LXRBRCRX", name = "<init>", descriptor = "(II)V")
    public class30(int arg0, int arg1) {
        this.field1024 = new int[arg0 * arg1];
        this.field1025 = this.field1029 = arg0;
        this.field1026 = this.field1030 = arg1;
        this.field1027 = this.field1028 = 0;
    }

    @OriginalMember(owner = "LXRBRCRX", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class30(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1025 = var3.getWidth(arg1);
            this.field1026 = var3.getHeight(arg1);
            this.field1029 = this.field1025;
            this.field1030 = this.field1026;
            this.field1027 = 0;
            this.field1028 = 0;
            this.field1024 = new int[this.field1026 * this.field1025];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1025, this.field1026, this.field1024, 0, this.field1025);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "<init>", descriptor = "(LLYZBHNJP;Ljava/lang/String;I)V")
    public class30(class31 arg0, String arg1, int arg2) {
        class69 var4 = new class69(arg0.method290(arg1 + ".dat", null), field1014);
        class69 var5 = new class69(arg0.method290("index.dat", null), field1014);
        var5.field1700 = var4.method549();
        this.field1029 = var5.method549();
        this.field1030 = var5.method549();
        int var6 = var5.method547();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method551();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1700 += 2;
            var4.field1700 += var5.method549() * var5.method549();
            var5.field1700++;
        }
        this.field1027 = var5.method547();
        this.field1028 = var5.method547();
        this.field1025 = var5.method549();
        this.field1026 = var5.method549();
        int var10 = var5.method547();
        int var11 = this.field1026 * this.field1025;
        this.field1024 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1024[var12] = var7[var4.method547()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1025; var13++) {
                for (int var14 = 0; var14 < this.field1026; var14++) {
                    this.field1024[this.field1025 * var14 + var13] = var7[var4.method547()];
                }
            }
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "b", descriptor = "(I)V")
    public void method276(int arg0) {
        class29.method264(false, this.field1025, this.field1024, this.field1026);
        if (arg0 < 2 || arg0 > 2) {
            ;
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(IZII)V")
    public void method277(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < this.field1024.length; var5++) {
            int var6 = this.field1024[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg2 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg3 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1024[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "c", descriptor = "(I)V")
    public void method278(int arg0) {
        int[] var2 = new int[this.field1030 * this.field1029];
        while (arg0 >= 0) {
            this.field1015 = 471;
        }
        for (int var3 = 0; var3 < this.field1026; var3++) {
            for (int var4 = 0; var4 < this.field1025; var4++) {
                var2[(this.field1028 + var3) * this.field1029 + this.field1027 + var4] = this.field1024[this.field1025 * var3 + var4];
            }
        }
        this.field1024 = var2;
        this.field1025 = this.field1029;
        this.field1026 = this.field1030;
        this.field1027 = 0;
        this.field1028 = 0;
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(III)V")
    public void method279(int arg0, int arg1, int arg2) {
        int var4 = this.field1027 + arg0;
        int var5 = this.field1028 + arg2;
        int var6 = 95 / arg1;
        int var7 = class29.field1003 * var5 + var4;
        int var8 = 0;
        int var9 = this.field1026;
        int var10 = this.field1025;
        int var11 = class29.field1003 - var10;
        int var12 = 0;
        if (var5 < class29.field1005) {
            int var13 = class29.field1005 - var5;
            var9 -= var13;
            var5 = class29.field1005;
            var8 += var10 * var13;
            var7 += class29.field1003 * var13;
        }
        if (var5 + var9 > class29.field1006) {
            var9 -= var5 + var9 - class29.field1006;
        }
        if (var4 < class29.field1007) {
            int var14 = class29.field1007 - var4;
            var10 -= var14;
            var4 = class29.field1007;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class29.field1008) {
            int var15 = var4 + var10 - class29.field1008;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method280(var11, this.field1024, class29.field1002, (byte) 6, var8, var7, var9, var10, var12);
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(I[I[IBIIIII)V")
    private void method280(int arg0, int[] arg1, int[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
                arg2[arg5++] = arg1[arg4++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg2[arg5++] = arg1[arg4++];
            }
            arg5 += arg0;
            arg4 += arg8;
        }
        if (arg3 != 6) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "b", descriptor = "(III)V")
    public void method281(int arg0, int arg1, int arg2) {
        int var4 = this.field1027 + arg2;
        if (arg0 < this.field1018 || arg0 > this.field1018) {
            this.field1017 = -460;
        }
        int var5 = this.field1028 + arg1;
        int var6 = class29.field1003 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1026;
        int var9 = this.field1025;
        int var10 = class29.field1003 - var9;
        int var11 = 0;
        if (var5 < class29.field1005) {
            int var12 = class29.field1005 - var5;
            var8 -= var12;
            var5 = class29.field1005;
            var7 += var9 * var12;
            var6 += class29.field1003 * var12;
        }
        if (var5 + var8 > class29.field1006) {
            var8 -= var5 + var8 - class29.field1006;
        }
        if (var4 < class29.field1007) {
            int var13 = class29.field1007 - var4;
            var9 -= var13;
            var4 = class29.field1007;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class29.field1008) {
            int var14 = var4 + var9 - class29.field1008;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method282(class29.field1002, this.field1024, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method282(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(IIII)V")
    public void method283(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1027 + arg2;
        int var6 = this.field1028 + arg1;
        if (arg3 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = class29.field1003 * var6 + var5;
        int var9 = 0;
        int var10 = this.field1026;
        int var11 = this.field1025;
        int var12 = class29.field1003 - var11;
        int var13 = 0;
        if (var6 < class29.field1005) {
            int var14 = class29.field1005 - var6;
            var10 -= var14;
            var6 = class29.field1005;
            var9 += var11 * var14;
            var8 += class29.field1003 * var14;
        }
        if (var6 + var10 > class29.field1006) {
            var10 -= var6 + var10 - class29.field1006;
        }
        if (var5 < class29.field1007) {
            int var15 = class29.field1007 - var5;
            var11 -= var15;
            var5 = class29.field1007;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class29.field1008) {
            int var16 = var5 + var11 - class29.field1008;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method284(0, var12, var11, var8, var10, 8, var9, this.field1024, arg0, var13, class29.field1002);
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(IIIIIII[III[I)V")
    private void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg8;
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = arg7[arg6++];
                if (var15 == 0) {
                    arg3++;
                } else {
                    int var16 = arg10[arg3];
                    arg10[arg3++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg1;
            arg6 += arg9;
        }
        if (arg5 < 8 || arg5 > 8) {
            this.field1022 = !this.field1022;
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(III[IIIIII[II)V")
    public void method285(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg7 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg1 / 2;
            int var14 = -arg6 / 2;
            int var15 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
            int var17 = arg5 * var15 >> 8;
            int var18 = arg5 * var16 >> 8;
            int var19 = (arg0 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg2 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class29.field1003 * arg8 + arg10;
            for (int var22 = 0; var22 < arg6; var22++) {
                int var23 = arg3[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg9[var22]; var27 < 0; var27++) {
                    class29.field1002[var24++] = this.field1024[(var25 >> 16) + (var26 >> 16) * this.field1025];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class29.field1003;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(DIIIIIIII)V")
    public void method286(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 0) {
            this.field1016 = !this.field1016;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg8 / 2;
            int var13 = (int) (Math.sin(arg0) * 65536.0D);
            int var14 = (int) (Math.cos(arg0) * 65536.0D);
            int var15 = arg2 * var13 >> 8;
            int var16 = arg2 * var14 >> 8;
            int var17 = (arg6 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class29.field1003 * arg4 + arg3;
            for (int var20 = 0; var20 < arg8; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1024[(var22 >> 16) + (var23 >> 16) * this.field1025];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class29.field1002[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class29.field1003;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(BLTAIXVIBM;II)V")
    public void method287(byte arg0, class47 arg1, int arg2, int arg3) {
        int var5 = this.field1027 + arg2;
        if (arg0 == 1) {
            boolean var6 = false;
        } else {
            this.field1016 = !this.field1016;
        }
        int var7 = this.field1028 + arg3;
        int var8 = class29.field1003 * var7 + var5;
        int var9 = 0;
        int var10 = this.field1026;
        int var11 = this.field1025;
        int var12 = class29.field1003 - var11;
        int var13 = 0;
        if (var7 < class29.field1005) {
            int var14 = class29.field1005 - var7;
            var10 -= var14;
            var7 = class29.field1005;
            var9 += var11 * var14;
            var8 += class29.field1003 * var14;
        }
        if (var7 + var10 > class29.field1006) {
            var10 -= var7 + var10 - class29.field1006;
        }
        if (var5 < class29.field1007) {
            int var15 = class29.field1007 - var5;
            var11 -= var15;
            var5 = class29.field1007;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class29.field1008) {
            int var16 = var5 + var11 - class29.field1008;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method288(0, var13, var9, var11, var8, (byte) 3, arg1.field1432, var12, var10, class29.field1002, this.field1024);
        }
    }

    @OriginalMember(owner = "LXRBRCRX", name = "a", descriptor = "(IIIIIB[BII[I[I)V")
    private void method288(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8, int[] arg9, int[] arg10) {
        if (this.field1021 != arg5) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg3 >> 2);
        int var14 = -(arg3 & 0x3);
        for (int var15 = -arg8; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg10[arg2++];
                if (var19 != 0 && arg6[arg4] == 0) {
                    arg9[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg10[arg2++];
                if (var20 != 0 && arg6[arg4] == 0) {
                    arg9[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg10[arg2++];
                if (var21 != 0 && arg6[arg4] == 0) {
                    arg9[arg4++] = var21;
                } else {
                    arg4++;
                }
                int var22 = arg10[arg2++];
                if (var22 != 0 && arg6[arg4] == 0) {
                    arg9[arg4++] = var22;
                } else {
                    arg4++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg10[arg2++];
                if (var18 != 0 && arg6[arg4] == 0) {
                    arg9[arg4++] = var18;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg2 += arg1;
        }
    }
}
