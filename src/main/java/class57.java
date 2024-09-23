import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TNNDDWAZ")
public class class57 extends class39 {

    @OriginalMember(owner = "TNNDDWAZ", name = "w", descriptor = "I")
    private int field1471 = 791;

    @OriginalMember(owner = "TNNDDWAZ", name = "x", descriptor = "Z")
    private boolean field1472 = false;

    @OriginalMember(owner = "TNNDDWAZ", name = "y", descriptor = "I")
    private int field1473 = 432;

    @OriginalMember(owner = "TNNDDWAZ", name = "z", descriptor = "B")
    private byte field1474 = 5;

    @OriginalMember(owner = "TNNDDWAZ", name = "A", descriptor = "I")
    private int field1475 = -7552;

    @OriginalMember(owner = "TNNDDWAZ", name = "B", descriptor = "I")
    private int field1476 = -906;

    @OriginalMember(owner = "TNNDDWAZ", name = "C", descriptor = "I")
    private int field1477 = 569;

    @OriginalMember(owner = "TNNDDWAZ", name = "D", descriptor = "Z")
    private boolean field1478 = false;

    @OriginalMember(owner = "TNNDDWAZ", name = "F", descriptor = "Z")
    private boolean field1480 = false;

    @OriginalMember(owner = "TNNDDWAZ", name = "G", descriptor = "[I")
    public int[] field1481;

    @OriginalMember(owner = "TNNDDWAZ", name = "L", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "TNNDDWAZ", name = "H", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "TNNDDWAZ", name = "M", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "TNNDDWAZ", name = "I", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "TNNDDWAZ", name = "K", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "TNNDDWAZ", name = "J", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "TNNDDWAZ", name = "E", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "TNNDDWAZ", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field1481 = new int[arg0 * arg1];
        this.field1482 = this.field1486 = arg0;
        this.field1483 = this.field1487 = arg1;
        this.field1484 = this.field1485 = 0;
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class57(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1482 = var3.getWidth(arg1);
            this.field1483 = var3.getHeight(arg1);
            this.field1486 = this.field1482;
            this.field1487 = this.field1483;
            this.field1484 = 0;
            this.field1485 = 0;
            this.field1481 = new int[this.field1483 * this.field1482];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1482, this.field1483, this.field1481, 0, this.field1482);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "<init>", descriptor = "(LSYUGXMZF;Ljava/lang/String;I)V")
    public class57(class55 arg0, String arg1, int arg2) {
        class30 var4 = new class30(arg0.method551(arg1 + ".dat", null), -982);
        class30 var5 = new class30(arg0.method551("index.dat", null), -982);
        var5.field1065 = var4.method351();
        this.field1486 = var5.method351();
        this.field1487 = var5.method351();
        int var6 = var5.method349();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method353();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1065 += 2;
            var4.field1065 += var5.method351() * var5.method351();
            var5.field1065++;
        }
        this.field1484 = var5.method349();
        this.field1485 = var5.method349();
        this.field1482 = var5.method351();
        this.field1483 = var5.method351();
        int var10 = var5.method349();
        int var11 = this.field1483 * this.field1482;
        this.field1481 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1481[var12] = var7[var4.method349()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1482; var13++) {
                for (int var14 = 0; var14 < this.field1483; var14++) {
                    this.field1481[this.field1482 * var14 + var13] = var7[var4.method349()];
                }
            }
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(Z)V")
    public void method553(boolean arg0) {
        class39.method415(this.field1477, this.field1481, this.field1483, this.field1482);
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(IIBI)V")
    public void method554(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1481.length; var5++) {
            int var6 = this.field1481[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg0 + var9;
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
                this.field1481[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 == -39) {
            ;
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "c", descriptor = "(I)V")
    public void method555(int arg0) {
        int[] var2 = new int[this.field1487 * this.field1486];
        for (int var3 = 0; var3 < this.field1483; var3++) {
            for (int var4 = 0; var4 < this.field1482; var4++) {
                var2[(this.field1485 + var3) * this.field1486 + this.field1484 + var4] = this.field1481[this.field1482 * var3 + var4];
            }
        }
        if (arg0 >= 0) {
            return;
        }
        this.field1481 = var2;
        this.field1482 = this.field1486;
        this.field1483 = this.field1487;
        this.field1484 = 0;
        this.field1485 = 0;
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(BII)V")
    public void method556(byte arg0, int arg1, int arg2) {
        int var4 = this.field1484 + arg1;
        if (arg0 != -25) {
            this.field1478 = !this.field1478;
        }
        int var5 = this.field1485 + arg2;
        int var6 = class39.field1203 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1483;
        int var9 = this.field1482;
        int var10 = class39.field1203 - var9;
        int var11 = 0;
        if (var5 < class39.field1205) {
            int var12 = class39.field1205 - var5;
            var8 -= var12;
            var5 = class39.field1205;
            var7 += var9 * var12;
            var6 += class39.field1203 * var12;
        }
        if (var5 + var8 > class39.field1206) {
            var8 -= var5 + var8 - class39.field1206;
        }
        if (var4 < class39.field1207) {
            int var13 = class39.field1207 - var4;
            var9 -= var13;
            var4 = class39.field1207;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class39.field1208) {
            int var14 = var4 + var9 - class39.field1208;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method557(var9, this.field1481, var7, var10, var8, class39.field1202, var6, var11, 355);
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(I[IIII[IIII)V")
    private void method557(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg5[arg6++] = arg1[arg2++];
                arg5[arg6++] = arg1[arg2++];
                arg5[arg6++] = arg1[arg2++];
                arg5[arg6++] = arg1[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg5[arg6++] = arg1[arg2++];
            }
            arg6 += arg3;
            arg2 += arg7;
        }
        if (arg8 <= 0) {
            this.field1480 = !this.field1480;
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(IIB)V")
    public void method558(int arg0, int arg1, byte arg2) {
        int var4 = this.field1484 + arg1;
        int var5 = this.field1485 + arg0;
        if (arg2 != 71) {
            return;
        }
        int var6 = class39.field1203 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1483;
        int var9 = this.field1482;
        int var10 = class39.field1203 - var9;
        int var11 = 0;
        if (var5 < class39.field1205) {
            int var12 = class39.field1205 - var5;
            var8 -= var12;
            var5 = class39.field1205;
            var7 += var9 * var12;
            var6 += class39.field1203 * var12;
        }
        if (var5 + var8 > class39.field1206) {
            var8 -= var5 + var8 - class39.field1206;
        }
        if (var4 < class39.field1207) {
            int var13 = class39.field1207 - var4;
            var9 -= var13;
            var4 = class39.field1207;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class39.field1208) {
            int var14 = var4 + var9 - class39.field1208;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method559(class39.field1202, this.field1481, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method559(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(IIII)V")
    public void method560(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            return;
        }
        int var5 = this.field1484 + arg2;
        int var6 = this.field1485 + arg3;
        int var7 = class39.field1203 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1483;
        int var10 = this.field1482;
        int var11 = class39.field1203 - var10;
        int var12 = 0;
        if (var6 < class39.field1205) {
            int var13 = class39.field1205 - var6;
            var9 -= var13;
            var6 = class39.field1205;
            var8 += var10 * var13;
            var7 += class39.field1203 * var13;
        }
        if (var6 + var9 > class39.field1206) {
            var9 -= var6 + var9 - class39.field1206;
        }
        if (var5 < class39.field1207) {
            int var14 = class39.field1207 - var5;
            var10 -= var14;
            var5 = class39.field1207;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class39.field1208) {
            int var15 = var5 + var10 - class39.field1208;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method561(class39.field1202, (byte) 59, var7, var12, var8, var9, var10, this.field1481, 0, arg1, var11);
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "([IBIIIII[IIII)V")
    private void method561(int[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg9;
        if (arg1 != 59) {
            this.field1477 = 125;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg7[arg4++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg0[arg2];
                    arg0[arg2++] = ((var15 & 0xFF00FF) * arg9 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg9 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg10;
            arg4 += arg3;
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(IIII[IIIIII[I)V")
    public void method562(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        while (arg0 >= 0) {
            this.field1479 = 10;
        }
        try {
            int var12 = -arg2 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg6 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class39.field1203 * arg1 + arg5;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg10[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg4[var21]; var26 < 0; var26++) {
                    class39.field1202[var23++] = this.field1481[(var24 >> 16) + (var25 >> 16) * this.field1482];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class39.field1203;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(DBIIIIIII)V")
    public void method563(double arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 118) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg3 / 2;
            int var13 = -arg5 / 2;
            int var14 = (int) (Math.sin(arg0) * 65536.0D);
            int var15 = (int) (Math.cos(arg0) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg7 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class39.field1203 * arg2 + arg6;
            for (int var21 = 0; var21 < arg5; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg3; var25 < 0; var25++) {
                    int var26 = this.field1481[(var23 >> 16) + (var24 >> 16) * this.field1482];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class39.field1202[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class39.field1203;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "(LGLPEJJEY;III)V")
    public void method564(class19 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1484 + arg3;
        int var6 = this.field1485 + arg1;
        int var7 = class39.field1203 * var6 + var5;
        int var8 = 0;
        if (arg2 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = this.field1483;
        int var11 = this.field1482;
        int var12 = class39.field1203 - var11;
        int var13 = 0;
        if (var6 < class39.field1205) {
            int var14 = class39.field1205 - var6;
            var10 -= var14;
            var6 = class39.field1205;
            var8 += var11 * var14;
            var7 += class39.field1203 * var14;
        }
        if (var6 + var10 > class39.field1206) {
            var10 -= var6 + var10 - class39.field1206;
        }
        if (var5 < class39.field1207) {
            int var15 = class39.field1207 - var5;
            var11 -= var15;
            var5 = class39.field1207;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class39.field1208) {
            int var16 = var5 + var11 - class39.field1208;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method565(class39.field1202, var7, var10, var8, 0, arg0.field893, var13, var11, this.field1481, -7552, var12);
        }
    }

    @OriginalMember(owner = "TNNDDWAZ", name = "a", descriptor = "([IIIII[BII[III)V")
    private void method565(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (this.field1475 != arg9) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg7 >> 2);
        int var14 = -(arg7 & 0x3);
        for (int var15 = -arg2; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg8[arg3++];
                if (var19 != 0 && arg5[arg1] == 0) {
                    arg0[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg8[arg3++];
                if (var20 != 0 && arg5[arg1] == 0) {
                    arg0[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg8[arg3++];
                if (var21 != 0 && arg5[arg1] == 0) {
                    arg0[arg1++] = var21;
                } else {
                    arg1++;
                }
                int var22 = arg8[arg3++];
                if (var22 != 0 && arg5[arg1] == 0) {
                    arg0[arg1++] = var22;
                } else {
                    arg1++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg8[arg3++];
                if (var18 != 0 && arg5[arg1] == 0) {
                    arg0[arg1++] = var18;
                } else {
                    arg1++;
                }
            }
            arg1 += arg10;
            arg3 += arg6;
        }
    }
}
