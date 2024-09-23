import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZWUMKFUX")
public class class72 extends class36 {

    @OriginalMember(owner = "ZWUMKFUX", name = "w", descriptor = "Z")
    private boolean field1720 = false;

    @OriginalMember(owner = "ZWUMKFUX", name = "x", descriptor = "B")
    private byte field1721 = 52;

    @OriginalMember(owner = "ZWUMKFUX", name = "y", descriptor = "Z")
    private boolean field1722 = true;

    @OriginalMember(owner = "ZWUMKFUX", name = "z", descriptor = "I")
    private int field1723 = -911;

    @OriginalMember(owner = "ZWUMKFUX", name = "A", descriptor = "[I")
    public int[] field1724;

    @OriginalMember(owner = "ZWUMKFUX", name = "F", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "ZWUMKFUX", name = "B", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "ZWUMKFUX", name = "G", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "ZWUMKFUX", name = "C", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "ZWUMKFUX", name = "E", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "ZWUMKFUX", name = "D", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "ZWUMKFUX", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1724 = new int[arg0 * arg1];
        this.field1725 = this.field1729 = arg0;
        this.field1726 = this.field1730 = arg1;
        this.field1727 = this.field1728 = 0;
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class72(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1725 = var3.getWidth(arg1);
            this.field1726 = var3.getHeight(arg1);
            this.field1729 = this.field1725;
            this.field1730 = this.field1726;
            this.field1727 = 0;
            this.field1728 = 0;
            this.field1724 = new int[this.field1726 * this.field1725];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1725, this.field1726, this.field1724, 0, this.field1725);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "<init>", descriptor = "(LINOFEYKQ;Ljava/lang/String;I)V")
    public class72(class21 arg0, String arg1, int arg2) {
        class35 var4 = new class35((byte) -103, arg0.method277(arg1 + ".dat", null));
        class35 var5 = new class35((byte) -103, arg0.method277("index.dat", null));
        var5.field1107 = var4.method351();
        this.field1729 = var5.method351();
        this.field1730 = var5.method351();
        int var6 = var5.method349();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method353();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1107 += 2;
            var4.field1107 += var5.method351() * var5.method351();
            var5.field1107++;
        }
        this.field1727 = var5.method349();
        this.field1728 = var5.method349();
        this.field1725 = var5.method351();
        this.field1726 = var5.method351();
        int var10 = var5.method349();
        int var11 = this.field1726 * this.field1725;
        this.field1724 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1724[var12] = var7[var4.method349()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1725; var13++) {
                for (int var14 = 0; var14 < this.field1726; var14++) {
                    this.field1724[this.field1725 * var14 + var13] = var7[var4.method349()];
                }
            }
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(B)V")
    public void method589(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
            class36.method388(this.field1725, this.field1724, this.field1726, 12933);
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IIIB)V")
    public void method590(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field1724.length; var5++) {
            int var8 = this.field1724[var5];
            if (var8 != 0) {
                int var9 = var8 >> 16 & 0xFF;
                int var10 = arg0 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var8 >> 8 & 0xFF;
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = var8 & 0xFF;
                int var14 = arg1 + var13;
                if (var14 < 1) {
                    var14 = 1;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                this.field1724[var5] = (var10 << 16) + (var12 << 8) + var14;
            }
        }
        if (arg3 == 7) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "c", descriptor = "(I)V")
    public void method591(int arg0) {
        int[] var2 = new int[this.field1730 * this.field1729];
        for (int var3 = 0; var3 < this.field1726; var3++) {
            for (int var5 = 0; var5 < this.field1725; var5++) {
                var2[(this.field1728 + var3) * this.field1729 + this.field1727 + var5] = this.field1724[this.field1725 * var3 + var5];
            }
        }
        if (arg0 != 2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1724 = var2;
        this.field1725 = this.field1729;
        this.field1726 = this.field1730;
        this.field1727 = 0;
        this.field1728 = 0;
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(III)V")
    public void method592(int arg0, int arg1, int arg2) {
        int var4 = this.field1727 + arg1;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1728 + arg2;
        int var7 = class36.field1125 * var6 + var4;
        int var8 = 0;
        int var9 = this.field1726;
        int var10 = this.field1725;
        int var11 = class36.field1125 - var10;
        int var12 = 0;
        if (var6 < class36.field1127) {
            int var13 = class36.field1127 - var6;
            var9 -= var13;
            var6 = class36.field1127;
            var8 += var10 * var13;
            var7 += class36.field1125 * var13;
        }
        if (var6 + var9 > class36.field1128) {
            var9 -= var6 + var9 - class36.field1128;
        }
        if (var4 < class36.field1129) {
            int var14 = class36.field1129 - var4;
            var10 -= var14;
            var4 = class36.field1129;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class36.field1130) {
            int var15 = var4 + var10 - class36.field1130;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method593(var8, var9, var10, class36.field1124, var12, var7, this.field1724, var11, (byte) -97);
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(III[III[IIB)V")
    private void method593(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, byte arg8) {
        int var10 = -(arg2 >> 2);
        int var11 = -(arg2 & 0x3);
        if (arg8 != -97) {
            this.field1722 = !this.field1722;
        }
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg5++] = arg6[arg0++];
                arg3[arg5++] = arg6[arg0++];
                arg3[arg5++] = arg6[arg0++];
                arg3[arg5++] = arg6[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg5++] = arg6[arg0++];
            }
            arg5 += arg7;
            arg0 += arg4;
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IIB)V")
    public void method594(int arg0, int arg1, byte arg2) {
        if (arg2 == 8) {
            boolean var4 = false;
        } else {
            this.field1723 = 259;
        }
        int var5 = this.field1727 + arg0;
        int var6 = this.field1728 + arg1;
        int var7 = class36.field1125 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1726;
        int var10 = this.field1725;
        int var11 = class36.field1125 - var10;
        int var12 = 0;
        if (var6 < class36.field1127) {
            int var13 = class36.field1127 - var6;
            var9 -= var13;
            var6 = class36.field1127;
            var8 += var10 * var13;
            var7 += class36.field1125 * var13;
        }
        if (var6 + var9 > class36.field1128) {
            var9 -= var6 + var9 - class36.field1128;
        }
        if (var5 < class36.field1129) {
            int var14 = class36.field1129 - var5;
            var10 -= var14;
            var5 = class36.field1129;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class36.field1130) {
            int var15 = var5 + var10 - class36.field1130;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method595(class36.field1124, this.field1724, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method595(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IIII)V")
    public void method596(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1727 + arg1;
        int var6 = this.field1728 + arg0;
        int var7 = class36.field1125 * var6 + var5;
        int var8 = 0;
        int var9 = 6 / arg3;
        int var10 = this.field1726;
        int var11 = this.field1725;
        int var12 = class36.field1125 - var11;
        int var13 = 0;
        if (var6 < class36.field1127) {
            int var14 = class36.field1127 - var6;
            var10 -= var14;
            var6 = class36.field1127;
            var8 += var11 * var14;
            var7 += class36.field1125 * var14;
        }
        if (var6 + var10 > class36.field1128) {
            var10 -= var6 + var10 - class36.field1128;
        }
        if (var5 < class36.field1129) {
            int var15 = class36.field1129 - var5;
            var11 -= var15;
            var5 = class36.field1129;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class36.field1130) {
            int var16 = var5 + var11 - class36.field1130;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method597(var10, var8, arg2, var12, 0, var11, 7741, var7, class36.field1124, var13, this.field1724);
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IIIIIIII[II[I)V")
    private void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg2;
        if (arg6 != 7741) {
            return;
        }
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = arg10[arg1++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg8[arg7];
                    arg8[arg7++] = ((var15 & 0xFF00FF) * arg2 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg2 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg3;
            arg1 += arg9;
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(BIIII[II[IIII)V")
    public void method598(byte arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 4) {
            return;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg6 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg10 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class36.field1125 * arg8 + arg4;
            for (int var21 = 0; var21 < arg6; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    class36.field1124[var23++] = this.field1724[(var24 >> 16) + (var25 >> 16) * this.field1725];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class36.field1125;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IIDIIIIII)V")
    public void method599(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 <= 0) {
            this.field1720 = !this.field1720;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg0 / 2;
            int var13 = (int) (Math.sin(arg2) * 65536.0D);
            int var14 = (int) (Math.cos(arg2) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg5 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class36.field1125 * arg8 + arg3;
            for (int var20 = 0; var20 < arg0; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1724[(var22 >> 16) + (var23 >> 16) * this.field1725];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class36.field1124[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class36.field1125;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(IBILRZWMPYWU;)V")
    public void method600(int arg0, byte arg1, int arg2, class47 arg3) {
        if (this.field1721 != arg1) {
            return;
        }
        int var5 = this.field1727 + arg0;
        int var6 = this.field1728 + arg2;
        int var7 = class36.field1125 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1726;
        int var10 = this.field1725;
        int var11 = class36.field1125 - var10;
        int var12 = 0;
        if (var6 < class36.field1127) {
            int var13 = class36.field1127 - var6;
            var9 -= var13;
            var6 = class36.field1127;
            var8 += var10 * var13;
            var7 += class36.field1125 * var13;
        }
        if (var6 + var9 > class36.field1128) {
            var9 -= var6 + var9 - class36.field1128;
        }
        if (var5 < class36.field1129) {
            int var14 = class36.field1129 - var5;
            var10 -= var14;
            var5 = class36.field1129;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class36.field1130) {
            int var15 = var5 + var10 - class36.field1130;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method601(0, var7, this.field1724, var9, var10, var12, class36.field1124, arg3.field1348, var11, 18, var8);
        }
    }

    @OriginalMember(owner = "ZWUMKFUX", name = "a", descriptor = "(II[IIII[I[BIII)V")
    private void method601(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg4 >> 2);
        int var13 = -(arg4 & 0x3);
        if (arg9 <= 0) {
            this.field1723 = -222;
        }
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg2[arg10++];
                if (var18 != 0 && arg7[arg1] == 0) {
                    arg6[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg2[arg10++];
                if (var19 != 0 && arg7[arg1] == 0) {
                    arg6[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg2[arg10++];
                if (var20 != 0 && arg7[arg1] == 0) {
                    arg6[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg2[arg10++];
                if (var21 != 0 && arg7[arg1] == 0) {
                    arg6[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg2[arg10++];
                if (var17 != 0 && arg7[arg1] == 0) {
                    arg6[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg8;
            arg10 += arg5;
        }
    }
}
