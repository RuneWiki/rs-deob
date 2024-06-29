import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TPIBHECB")
public class class56 extends class6 {

    @OriginalMember(owner = "client!TPIBHECB", name = "z", descriptor = "Z")
    private boolean field1429 = false;

    @OriginalMember(owner = "client!TPIBHECB", name = "A", descriptor = "I")
    private int field1430 = -131;

    @OriginalMember(owner = "client!TPIBHECB", name = "C", descriptor = "Z")
    private boolean field1432 = true;

    @OriginalMember(owner = "client!TPIBHECB", name = "D", descriptor = "I")
    private int field1433 = -593;

    @OriginalMember(owner = "client!TPIBHECB", name = "E", descriptor = "Z")
    private boolean field1434 = true;

    @OriginalMember(owner = "client!TPIBHECB", name = "F", descriptor = "[I")
    public int[] field1435;

    @OriginalMember(owner = "client!TPIBHECB", name = "K", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!TPIBHECB", name = "G", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!TPIBHECB", name = "L", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!TPIBHECB", name = "H", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!TPIBHECB", name = "J", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!TPIBHECB", name = "I", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!TPIBHECB", name = "y", descriptor = "I")
    private static int field1428 = 536;

    @OriginalMember(owner = "client!TPIBHECB", name = "B", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "(II)V")
    public class56(int arg0, int arg1) {
        this.field1435 = new int[arg0 * arg1];
        this.field1436 = this.field1440 = arg0;
        this.field1437 = this.field1441 = arg1;
        this.field1438 = this.field1439 = 0;
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class56(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1436 = var3.getWidth(arg1);
            this.field1437 = var3.getHeight(arg1);
            this.field1440 = this.field1436;
            this.field1441 = this.field1437;
            this.field1438 = 0;
            this.field1439 = 0;
            this.field1435 = new int[this.field1437 * this.field1436];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1436, this.field1437, this.field1435, 0, this.field1436);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "(LUUIGNTAD;Ljava/lang/String;I)V")
    public class56(class59 arg0, String arg1, int arg2) {
        class10 var4 = new class10(arg0.method545(arg1 + ".dat", null), field1428);
        class10 var5 = new class10(arg0.method545("index.dat", null), field1428);
        var5.field646 = var4.method196();
        this.field1440 = var5.method196();
        this.field1441 = var5.method196();
        int var6 = var5.method194();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method198();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field646 += 2;
            var4.field646 += var5.method196() * var5.method196();
            var5.field646++;
        }
        this.field1438 = var5.method194();
        this.field1439 = var5.method194();
        this.field1436 = var5.method196();
        this.field1437 = var5.method196();
        int var10 = var5.method194();
        int var11 = this.field1437 * this.field1436;
        this.field1435 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1435[var12] = var7[var4.method194()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1436; var13++) {
                    for (int var14 = 0; var14 < this.field1437; var14++) {
                        this.field1435[this.field1436 * var14 + var13] = var7[var4.method194()];
                    }
                }
            }
            if (class1.field4) {
            }
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(B)V")
    public void method502(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
            class6.method17(this.field1436, this.field1435, this.field1437, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IZII)V")
    public void method503(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field1434 = !this.field1434;
        }
        for (int var5 = 0; var5 < this.field1435.length; var5++) {
            int var6 = this.field1435[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                this.field1435[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(Z)V")
    public void method504(boolean arg0) {
        int[] var2 = new int[this.field1441 * this.field1440];
        for (int var3 = 0; var3 < this.field1437; var3++) {
            for (int var4 = 0; var4 < this.field1436; var4++) {
                var2[(this.field1439 + var3) * this.field1440 + this.field1438 + var4] = this.field1435[this.field1436 * var3 + var4];
            }
        }
        this.field1435 = var2;
        this.field1436 = this.field1440;
        this.field1437 = this.field1441;
        this.field1438 = 0;
        this.field1439 = 0;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(III)V")
    public void method505(int arg0, int arg1, int arg2) {
        int var4 = this.field1438 + arg2;
        int var5 = this.field1439 + arg1;
        if (arg0 != 2) {
            return;
        }
        int var6 = class6.field49 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1437;
        int var9 = this.field1436;
        int var10 = class6.field49 - var9;
        int var11 = 0;
        if (var5 < class6.field51) {
            int var12 = class6.field51 - var5;
            var8 -= var12;
            var5 = class6.field51;
            var7 += var9 * var12;
            var6 += class6.field49 * var12;
        }
        if (var5 + var8 > class6.field52) {
            var8 -= var5 + var8 - class6.field52;
        }
        if (var4 < class6.field53) {
            int var13 = class6.field53 - var4;
            var9 -= var13;
            var4 = class6.field53;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class6.field54) {
            int var14 = var4 + var9 - class6.field54;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method506(this.field1435, 9, var6, var11, var8, var7, var9, var10, class6.field48);
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([IIIIIIII[I)V")
    private void method506(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        if (arg1 < 9 || arg1 > 9) {
            this.field1429 = !this.field1429;
        }
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg2++] = arg0[arg5++];
                arg8[arg2++] = arg0[arg5++];
                arg8[arg2++] = arg0[arg5++];
                arg8[arg2++] = arg0[arg5++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg2++] = arg0[arg5++];
            }
            arg2 += arg7;
            arg5 += arg3;
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IBI)V")
    public void method507(int arg0, byte arg1, int arg2) {
        int var4 = this.field1438 + arg0;
        int var5 = this.field1439 + arg2;
        int var6 = class6.field49 * var5 + var4;
        int var7 = 0;
        if (arg1 != 2) {
            return;
        }
        int var8 = this.field1437;
        int var9 = this.field1436;
        int var10 = class6.field49 - var9;
        int var11 = 0;
        if (var5 < class6.field51) {
            int var12 = class6.field51 - var5;
            var8 -= var12;
            var5 = class6.field51;
            var7 += var9 * var12;
            var6 += class6.field49 * var12;
        }
        if (var5 + var8 > class6.field52) {
            var8 -= var5 + var8 - class6.field52;
        }
        if (var4 < class6.field53) {
            int var13 = class6.field53 - var4;
            var9 -= var13;
            var4 = class6.field53;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class6.field54) {
            int var14 = var4 + var9 - class6.field54;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method508(class6.field48, this.field1435, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method508(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IIBI)V")
    public void method509(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field1438 + arg0;
        int var6 = this.field1439 + arg3;
        int var7 = class6.field49 * var6 + var5;
        int var8 = 0;
        if (arg2 != 16) {
            this.field1431 = -84;
        }
        int var9 = this.field1437;
        int var10 = this.field1436;
        int var11 = class6.field49 - var10;
        int var12 = 0;
        if (var6 < class6.field51) {
            int var13 = class6.field51 - var6;
            var9 -= var13;
            var6 = class6.field51;
            var8 += var10 * var13;
            var7 += class6.field49 * var13;
        }
        if (var6 + var9 > class6.field52) {
            var9 -= var6 + var9 - class6.field52;
        }
        if (var5 < class6.field53) {
            int var14 = class6.field53 - var5;
            var10 -= var14;
            var5 = class6.field53;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class6.field54) {
            int var15 = var5 + var10 - class6.field54;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method510(this.field1435, var11, (byte) 37, var8, class6.field48, arg1, var10, var7, var9, 0, var12);
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([IIBI[IIIIIII)V")
    private void method510(int[] arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg5;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                int var16 = arg0[arg3++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    int var17 = arg4[arg7];
                    arg4[arg7++] = ((var16 & 0xFF00FF) * arg5 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg5 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg1;
            arg3 += arg10;
        }
        if (arg2 != 37) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(II[II[IIIIIII)V")
    public void method511(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg10 != 0) {
            this.field1431 = 454;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg6 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class6.field49 * arg7 + arg8;
            for (int var21 = 0; var21 < arg6; var21++) {
                int var22 = arg2[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg4[var21]; var26 < 0; var26++) {
                    class6.field48[var23++] = this.field1435[(var24 >> 16) + (var25 >> 16) * this.field1436];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class6.field49;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IDIIIIIII)V")
    public void method512(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 8496) {
            return;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg6 / 2;
            int var13 = (int) (Math.sin(arg1) * 65536.0D);
            int var14 = (int) (Math.cos(arg1) * 65536.0D);
            int var15 = arg3 * var13 >> 8;
            int var16 = arg3 * var14 >> 8;
            int var17 = (arg8 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg4 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class6.field49 * arg5 + arg7;
            for (int var20 = 0; var20 < arg6; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field1435[(var22 >> 16) + (var23 >> 16) * this.field1436];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class6.field48[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class6.field49;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IIILOCPHNIUN;)V")
    public void method513(int arg0, int arg1, int arg2, class40 arg3) {
        int var5 = this.field1438 + arg0;
        int var6 = this.field1439 + arg2;
        int var7 = class6.field49 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1437;
        int var10 = this.field1436;
        int var11 = class6.field49 - var10;
        int var12 = 0;
        if (arg1 >= 0) {
            return;
        }
        if (var6 < class6.field51) {
            int var13 = class6.field51 - var6;
            var9 -= var13;
            var6 = class6.field51;
            var8 += var10 * var13;
            var7 += class6.field49 * var13;
        }
        if (var6 + var9 > class6.field52) {
            var9 -= var6 + var9 - class6.field52;
        }
        if (var5 < class6.field53) {
            int var14 = class6.field53 - var5;
            var10 -= var14;
            var5 = class6.field53;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class6.field54) {
            int var15 = var5 + var10 - class6.field54;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method514(var7, var11, var9, class6.field48, var10, this.field1433, var12, 0, this.field1435, arg3.field1171, var8);
        }
    }

    @OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(III[IIIII[I[BI)V")
    private void method514(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, int arg10) {
        if (arg5 >= 0) {
            return;
        }
        int var12 = -(arg4 >> 2);
        int var13 = -(arg4 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg10++];
                if (var18 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var18;
                } else {
                    arg0++;
                }
                int var19 = arg8[arg10++];
                if (var19 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var19;
                } else {
                    arg0++;
                }
                int var20 = arg8[arg10++];
                if (var20 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var20;
                } else {
                    arg0++;
                }
                int var21 = arg8[arg10++];
                if (var21 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var21;
                } else {
                    arg0++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg10++];
                if (var17 != 0 && arg9[arg0] == 0) {
                    arg3[arg0++] = var17;
                } else {
                    arg0++;
                }
            }
            arg0 += arg1;
            arg10 += arg6;
        }
    }
}
