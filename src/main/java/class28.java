import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HOSNGCXH")
public class class28 extends class35 {

    @OriginalMember(owner = "HOSNGCXH", name = "z", descriptor = "Z")
    private boolean field870 = false;

    @OriginalMember(owner = "HOSNGCXH", name = "A", descriptor = "Z")
    private boolean field871 = true;

    @OriginalMember(owner = "HOSNGCXH", name = "C", descriptor = "Z")
    private boolean field873 = false;

    @OriginalMember(owner = "HOSNGCXH", name = "D", descriptor = "I")
    private int field874 = 7964;

    @OriginalMember(owner = "HOSNGCXH", name = "E", descriptor = "B")
    private byte field875 = 3;

    @OriginalMember(owner = "HOSNGCXH", name = "F", descriptor = "Z")
    private boolean field876 = false;

    @OriginalMember(owner = "HOSNGCXH", name = "H", descriptor = "Z")
    private boolean field878 = true;

    @OriginalMember(owner = "HOSNGCXH", name = "I", descriptor = "[I")
    public int[] field879;

    @OriginalMember(owner = "HOSNGCXH", name = "N", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "HOSNGCXH", name = "J", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "HOSNGCXH", name = "O", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "HOSNGCXH", name = "K", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "HOSNGCXH", name = "M", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "HOSNGCXH", name = "L", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "HOSNGCXH", name = "B", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "HOSNGCXH", name = "G", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "HOSNGCXH", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        this.field879 = new int[arg0 * arg1];
        this.field880 = this.field884 = arg0;
        this.field881 = this.field885 = arg1;
        this.field882 = this.field883 = 0;
    }

    @OriginalMember(owner = "HOSNGCXH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class28(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field880 = var3.getWidth(arg1);
            this.field881 = var3.getHeight(arg1);
            this.field884 = this.field880;
            this.field885 = this.field881;
            this.field882 = 0;
            this.field883 = 0;
            this.field879 = new int[this.field881 * this.field880];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field880, this.field881, this.field879, 0, this.field880);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "<init>", descriptor = "(LTKEGJSFV;Ljava/lang/String;I)V")
    public class28(class58 arg0, String arg1, int arg2) {
        class15 var4 = new class15(arg0.method542(arg1 + ".dat", null), false);
        class15 var5 = new class15(arg0.method542("index.dat", null), false);
        var5.field709 = var4.method263();
        this.field884 = var5.method263();
        this.field885 = var5.method263();
        int var6 = var5.method261();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method265();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field709 += 2;
            var4.field709 += var5.method263() * var5.method263();
            var5.field709++;
        }
        this.field882 = var5.method261();
        this.field883 = var5.method261();
        this.field880 = var5.method263();
        this.field881 = var5.method263();
        int var10 = var5.method261();
        int var11 = this.field881 * this.field880;
        this.field879 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field879[var12] = var7[var4.method261()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field880; var13++) {
                    for (int var14 = 0; var14 < this.field881; var14++) {
                        this.field879[this.field880 * var14 + var13] = var7[var4.method261()];
                    }
                }
            }
            if (class33.field1009) {
            }
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(Z)V")
    public void method330(boolean arg0) {
        class35.method380(this.field879, this.field880, 0, this.field881);
        if (!arg0) {
            this.field877 = 316;
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(IIBI)V")
    public void method331(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < this.field879.length; var5++) {
            int var7 = this.field879[var5];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg0 + var10;
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
                this.field879[var5] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
        if (arg2 == 1) {
            boolean var6 = false;
        } else {
            this.field878 = !this.field878;
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(I)V")
    public void method332(int arg0) {
        int[] var2 = new int[this.field885 * this.field884];
        for (int var3 = 0; var3 < this.field881; var3++) {
            for (int var4 = 0; var4 < this.field880; var4++) {
                var2[(this.field883 + var3) * this.field884 + this.field882 + var4] = this.field879[this.field880 * var3 + var4];
            }
        }
        this.field879 = var2;
        while (arg0 >= 0) {
            this.field878 = !this.field878;
        }
        this.field880 = this.field884;
        this.field881 = this.field885;
        this.field882 = 0;
        this.field883 = 0;
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(ZII)V")
    public void method333(boolean arg0, int arg1, int arg2) {
        int var4 = this.field882 + arg1;
        int var5 = this.field883 + arg2;
        if (arg0) {
            this.field877 = -471;
        }
        int var6 = class35.field1020 * var5 + var4;
        int var7 = 0;
        int var8 = this.field881;
        int var9 = this.field880;
        int var10 = class35.field1020 - var9;
        int var11 = 0;
        if (var5 < class35.field1022) {
            int var12 = class35.field1022 - var5;
            var8 -= var12;
            var5 = class35.field1022;
            var7 += var9 * var12;
            var6 += class35.field1020 * var12;
        }
        if (var5 + var8 > class35.field1023) {
            var8 -= var5 + var8 - class35.field1023;
        }
        if (var4 < class35.field1024) {
            int var13 = class35.field1024 - var4;
            var9 -= var13;
            var4 = class35.field1024;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1025) {
            int var14 = var4 + var9 - class35.field1025;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method334(var8, var10, this.field879, 147, var9, var6, class35.field1019, var7, var11);
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(II[IIII[III)V")
    private void method334(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        if (arg3 <= 0) {
            this.field877 = 82;
        }
        int var10 = -(arg4 >> 2);
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg5++] = arg2[arg7++];
                arg6[arg5++] = arg2[arg7++];
                arg6[arg5++] = arg2[arg7++];
                arg6[arg5++] = arg2[arg7++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg5++] = arg2[arg7++];
            }
            arg5 += arg1;
            arg7 += arg8;
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(III)V")
    public void method335(int arg0, int arg1, int arg2) {
        int var4 = this.field882 + arg2;
        if (this.field874 != arg0) {
            this.field871 = !this.field871;
        }
        int var5 = this.field883 + arg1;
        int var6 = class35.field1020 * var5 + var4;
        int var7 = 0;
        int var8 = this.field881;
        int var9 = this.field880;
        int var10 = class35.field1020 - var9;
        int var11 = 0;
        if (var5 < class35.field1022) {
            int var12 = class35.field1022 - var5;
            var8 -= var12;
            var5 = class35.field1022;
            var7 += var9 * var12;
            var6 += class35.field1020 * var12;
        }
        if (var5 + var8 > class35.field1023) {
            var8 -= var5 + var8 - class35.field1023;
        }
        if (var4 < class35.field1024) {
            int var13 = class35.field1024 - var4;
            var9 -= var13;
            var4 = class35.field1024;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1025) {
            int var14 = var4 + var9 - class35.field1025;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method336(class35.field1019, this.field879, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method336(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(IIIB)V")
    public void method337(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field882 + arg1;
        int var6 = this.field883 + arg2;
        int var7 = class35.field1020 * var6 + var5;
        int var8 = 0;
        int var9 = this.field881;
        int var10 = this.field880;
        int var11 = class35.field1020 - var10;
        int var12 = 0;
        if (this.field875 != arg3) {
            return;
        }
        if (var6 < class35.field1022) {
            int var13 = class35.field1022 - var6;
            var9 -= var13;
            var6 = class35.field1022;
            var8 += var10 * var13;
            var7 += class35.field1020 * var13;
        }
        if (var6 + var9 > class35.field1023) {
            var9 -= var6 + var9 - class35.field1023;
        }
        if (var5 < class35.field1024) {
            int var14 = class35.field1024 - var5;
            var10 -= var14;
            var5 = class35.field1024;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1025) {
            int var15 = var5 + var10 - class35.field1025;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method338(var12, class35.field1019, arg0, 0, false, var10, var9, var8, this.field879, var11, var7);
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(I[IIIZIII[III)V")
    private void method338(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg2;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                int var15 = arg8[arg7++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg1[arg10];
                    arg1[arg10++] = ((var15 & 0xFF00FF) * arg2 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg2 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg9;
            arg7 += arg0;
        }
        if (arg4) {
            this.field874 = 203;
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(I[IIII[IIIIII)V")
    public void method339(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        while (arg4 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg6 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg3 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class35.field1020 * arg10 + arg8;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg5[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg1[var22]; var27 < 0; var27++) {
                    class35.field1019[var24++] = this.field879[(var25 >> 16) + (var26 >> 16) * this.field880];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class35.field1020;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(IIIDIBIII)V")
    public void method340(int arg0, int arg1, int arg2, double arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 == 5) {
            boolean var11 = false;
        } else {
            this.field872 = -374;
        }
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin(arg3) * 65536.0D);
            int var15 = (int) (Math.cos(arg3) * 65536.0D);
            int var16 = arg6 * var14 >> 8;
            int var17 = arg6 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class35.field1020 * arg7 + arg2;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg4; var25 < 0; var25++) {
                    int var26 = this.field879[(var23 >> 16) + (var24 >> 16) * this.field880];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class35.field1019[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class35.field1020;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(ILDGXCFOYI;BI)V")
    public void method341(int arg0, class11 arg1, byte arg2, int arg3) {
        int var5 = this.field882 + arg0;
        if (arg2 != -8) {
            this.field870 = !this.field870;
        }
        int var6 = this.field883 + arg3;
        int var7 = class35.field1020 * var6 + var5;
        int var8 = 0;
        int var9 = this.field881;
        int var10 = this.field880;
        int var11 = class35.field1020 - var10;
        int var12 = 0;
        if (var6 < class35.field1022) {
            int var13 = class35.field1022 - var6;
            var9 -= var13;
            var6 = class35.field1022;
            var8 += var10 * var13;
            var7 += class35.field1020 * var13;
        }
        if (var6 + var9 > class35.field1023) {
            var9 -= var6 + var9 - class35.field1023;
        }
        if (var5 < class35.field1024) {
            int var14 = class35.field1024 - var5;
            var10 -= var14;
            var5 = class35.field1024;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1025) {
            int var15 = var5 + var10 - class35.field1025;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method342(var10, var7, 0, var12, var8, arg1.field607, this.field879, var11, class35.field1019, 0, var9);
        }
    }

    @OriginalMember(owner = "HOSNGCXH", name = "a", descriptor = "(IIIII[B[II[III)V")
    private void method342(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg2 != 0) {
            return;
        }
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg6[arg4++];
                if (var18 != 0 && arg5[arg1] == 0) {
                    arg8[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg6[arg4++];
                if (var19 != 0 && arg5[arg1] == 0) {
                    arg8[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg6[arg4++];
                if (var20 != 0 && arg5[arg1] == 0) {
                    arg8[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg6[arg4++];
                if (var21 != 0 && arg5[arg1] == 0) {
                    arg8[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg6[arg4++];
                if (var17 != 0 && arg5[arg1] == 0) {
                    arg8[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg7;
            arg4 += arg3;
        }
    }
}
