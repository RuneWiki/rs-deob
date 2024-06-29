import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IBHUFTPE")
public class class22 extends class15 {

    @OriginalMember(owner = "client!IBHUFTPE", name = "v", descriptor = "Z")
    private boolean field783 = true;

    @OriginalMember(owner = "client!IBHUFTPE", name = "w", descriptor = "I")
    private int field784 = 533;

    @OriginalMember(owner = "client!IBHUFTPE", name = "x", descriptor = "I")
    private int field785 = 625;

    @OriginalMember(owner = "client!IBHUFTPE", name = "y", descriptor = "Z")
    private boolean field786 = false;

    @OriginalMember(owner = "client!IBHUFTPE", name = "z", descriptor = "Z")
    private boolean field787 = false;

    @OriginalMember(owner = "client!IBHUFTPE", name = "A", descriptor = "I")
    private int field788 = 5;

    @OriginalMember(owner = "client!IBHUFTPE", name = "B", descriptor = "[I")
    public int[] field789;

    @OriginalMember(owner = "client!IBHUFTPE", name = "G", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!IBHUFTPE", name = "C", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!IBHUFTPE", name = "H", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!IBHUFTPE", name = "D", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!IBHUFTPE", name = "F", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!IBHUFTPE", name = "E", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "(II)V")
    public class22(int arg0, int arg1) {
        this.field789 = new int[arg0 * arg1];
        this.field790 = this.field794 = arg0;
        this.field791 = this.field795 = arg1;
        this.field792 = this.field793 = 0;
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class22(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field790 = var3.getWidth(arg1);
            this.field791 = var3.getHeight(arg1);
            this.field794 = this.field790;
            this.field795 = this.field791;
            this.field792 = 0;
            this.field793 = 0;
            this.field789 = new int[this.field791 * this.field790];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field790, this.field791, this.field789, 0, this.field790);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "(LIEMHZJLX;Ljava/lang/String;I)V")
    public class22(class23 arg0, String arg1, int arg2) {
        class38 var4 = new class38(0, arg0.method242(arg1 + ".dat", null));
        class38 var5 = new class38(0, arg0.method242("index.dat", null));
        var5.field1161 = var4.method359();
        this.field794 = var5.method359();
        this.field795 = var5.method359();
        int var6 = var5.method357();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method361();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1161 += 2;
            var4.field1161 += var5.method359() * var5.method359();
            var5.field1161++;
        }
        this.field792 = var5.method357();
        this.field793 = var5.method357();
        this.field790 = var5.method359();
        this.field791 = var5.method359();
        int var10 = var5.method357();
        int var11 = this.field791 * this.field790;
        this.field789 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field789[var12] = var7[var4.method357()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field790; var13++) {
                for (int var14 = 0; var14 < this.field791; var14++) {
                    this.field789[this.field790 * var14 + var13] = var7[var4.method357()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "b", descriptor = "(B)V")
    public void method228(byte arg0) {
        class15.method209(this.field789, this.field791, this.field790, (byte) 0);
        if (arg0 != 59) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(BIII)V")
    public void method229(byte arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field789.length; var5++) {
            int var6 = this.field789[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg1 + var9;
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
                this.field789[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "b", descriptor = "(I)V")
    public void method230(int arg0) {
        int[] var2 = new int[this.field795 * this.field794];
        for (int var3 = 0; var3 < this.field791; var3++) {
            for (int var5 = 0; var5 < this.field790; var5++) {
                var2[(this.field793 + var3) * this.field794 + this.field792 + var5] = this.field789[this.field790 * var3 + var5];
            }
        }
        if (arg0 != -185) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field789 = var2;
        this.field790 = this.field794;
        this.field791 = this.field795;
        this.field792 = 0;
        this.field793 = 0;
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(ZII)V")
    public void method231(boolean arg0, int arg1, int arg2) {
        int var4 = this.field792 + arg1;
        int var5 = this.field793 + arg2;
        int var6 = class15.field723 * var5 + var4;
        int var7 = 0;
        if (arg0) {
            this.field788 = 60;
        }
        int var8 = this.field791;
        int var9 = this.field790;
        int var10 = class15.field723 - var9;
        int var11 = 0;
        if (var5 < class15.field725) {
            int var12 = class15.field725 - var5;
            var8 -= var12;
            var5 = class15.field725;
            var7 += var9 * var12;
            var6 += class15.field723 * var12;
        }
        if (var5 + var8 > class15.field726) {
            var8 -= var5 + var8 - class15.field726;
        }
        if (var4 < class15.field727) {
            int var13 = class15.field727 - var4;
            var9 -= var13;
            var4 = class15.field727;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class15.field728) {
            int var14 = var4 + var9 - class15.field728;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method232(var9, 946, class15.field722, var10, var7, var11, var6, var8, this.field789);
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(II[IIIIII[I)V")
    private void method232(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        int var12 = 83 / arg1;
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg2[arg6++] = arg8[arg4++];
                arg2[arg6++] = arg8[arg4++];
                arg2[arg6++] = arg8[arg4++];
                arg2[arg6++] = arg8[arg4++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg2[arg6++] = arg8[arg4++];
            }
            arg6 += arg3;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(III)V")
    public void method233(int arg0, int arg1, int arg2) {
        int var4 = this.field792 + arg1;
        int var5 = this.field793 + arg2;
        int var6 = class15.field723 * var5 + var4;
        int var7 = 0;
        if (arg0 != -23827) {
            return;
        }
        int var8 = this.field791;
        int var9 = this.field790;
        int var10 = class15.field723 - var9;
        int var11 = 0;
        if (var5 < class15.field725) {
            int var12 = class15.field725 - var5;
            var8 -= var12;
            var5 = class15.field725;
            var7 += var9 * var12;
            var6 += class15.field723 * var12;
        }
        if (var5 + var8 > class15.field726) {
            var8 -= var5 + var8 - class15.field726;
        }
        if (var4 < class15.field727) {
            int var13 = class15.field727 - var4;
            var9 -= var13;
            var4 = class15.field727;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class15.field728) {
            int var14 = var4 + var9 - class15.field728;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method234(class15.field722, this.field789, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method234(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IIBI)V")
    public void method235(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 5) {
            boolean var5 = false;
        } else {
            this.field786 = !this.field786;
        }
        int var6 = this.field792 + arg3;
        int var7 = this.field793 + arg0;
        int var8 = class15.field723 * var7 + var6;
        int var9 = 0;
        int var10 = this.field791;
        int var11 = this.field790;
        int var12 = class15.field723 - var11;
        int var13 = 0;
        if (var7 < class15.field725) {
            int var14 = class15.field725 - var7;
            var10 -= var14;
            var7 = class15.field725;
            var9 += var11 * var14;
            var8 += class15.field723 * var14;
        }
        if (var7 + var10 > class15.field726) {
            var10 -= var7 + var10 - class15.field726;
        }
        if (var6 < class15.field727) {
            int var15 = class15.field727 - var6;
            var11 -= var15;
            var6 = class15.field727;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class15.field728) {
            int var16 = var6 + var11 - class15.field728;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method236((byte) 8, 0, var9, var8, this.field789, var11, arg1, class15.field722, var13, var12, var10);
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(BIII[III[IIII)V")
    private void method236(byte arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 8) {
            return;
        }
        int var12 = 256 - arg6;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = arg4[arg2++];
                if (var15 == 0) {
                    arg3++;
                } else {
                    int var16 = arg7[arg3];
                    arg7[arg3++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg9;
            arg2 += arg8;
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IZ[III[IIIIII)V")
    public void method237(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg1) {
            return;
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class15.field723 * arg7 + arg9;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = arg2[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg5[var21]; var26 < 0; var26++) {
                    class15.field722[var23++] = this.field789[(var24 >> 16) + (var25 >> 16) * this.field790];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class15.field723;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IIIDIIIBI)V")
    public void method238(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 == 6) {
            boolean var11 = false;
        } else {
            this.field786 = !this.field786;
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg0 / 2;
            int var14 = (int) (Math.sin(arg3) * 65536.0D);
            int var15 = (int) (Math.cos(arg3) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class15.field723 * arg2 + arg8;
            for (int var21 = 0; var21 < arg0; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg6; var25 < 0; var25++) {
                    int var26 = this.field789[(var23 >> 16) + (var24 >> 16) * this.field790];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class15.field722[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class15.field723;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(LBNGXLHWA;IIZ)V")
    public void method239(class5 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field783 = !this.field783;
        }
        int var5 = this.field792 + arg2;
        int var6 = this.field793 + arg1;
        int var7 = class15.field723 * var6 + var5;
        int var8 = 0;
        int var9 = this.field791;
        int var10 = this.field790;
        int var11 = class15.field723 - var10;
        int var12 = 0;
        if (var6 < class15.field725) {
            int var13 = class15.field725 - var6;
            var9 -= var13;
            var6 = class15.field725;
            var8 += var10 * var13;
            var7 += class15.field723 * var13;
        }
        if (var6 + var9 > class15.field726) {
            var9 -= var6 + var9 - class15.field726;
        }
        if (var5 < class15.field727) {
            int var14 = class15.field727 - var5;
            var10 -= var14;
            var5 = class15.field727;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class15.field728) {
            int var15 = var5 + var10 - class15.field728;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method240(var8, this.field789, var7, var9, var11, arg0.field80, class15.field722, var10, 0, var12, 0);
        }
    }

    @OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(I[IIII[B[IIIII)V")
    private void method240(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg7 >> 2);
        if (arg10 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -(arg7 & 0x3);
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg1[arg0++];
                if (var19 != 0 && arg5[arg2] == 0) {
                    arg6[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg1[arg0++];
                if (var20 != 0 && arg5[arg2] == 0) {
                    arg6[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg1[arg0++];
                if (var21 != 0 && arg5[arg2] == 0) {
                    arg6[arg2++] = var21;
                } else {
                    arg2++;
                }
                int var22 = arg1[arg0++];
                if (var22 != 0 && arg5[arg2] == 0) {
                    arg6[arg2++] = var22;
                } else {
                    arg2++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg1[arg0++];
                if (var18 != 0 && arg5[arg2] == 0) {
                    arg6[arg2++] = var18;
                } else {
                    arg2++;
                }
            }
            arg2 += arg4;
            arg0 += arg9;
        }
    }
}
