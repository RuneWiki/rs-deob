import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class154 extends class298 {

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    private int field1846 = 1;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    private int field1848 = 1;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "Lsd;")
    public static class74 field1853 = new class74(11, 2);

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "Lec;")
    public static class40 field1854;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    public static int field1857;

    static {
        new class40("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field1855 = 0;
        field1854 = new class40("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
        field1858 = 0;
        field1859 = 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method157(int arg0, int arg1) {
        ++field1845;
        int[][] var3 = super.field4454.method1638((byte) 98, arg1);
        if (super.field4454.field3886) {
            int var4 = this.field1846 + 1 + this.field1846;
            int var5 = 65536 / var4;
            int var6 = this.field1848 - -this.field1848 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field1846; var9 <= arg1 - -this.field1846; ++var9) {
                int[][] var19 = this.method1878(0, class208.field2886 & var9, 66);
                int[][] var20 = new int[3][class158.field1877];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1848; ~var27 >= ~this.field1848; ++var27) {
                    int var37 = var27 & class474.field6656;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class158.field1877) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class474.field6656 & var31 - this.field1848;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = class474.field6656 & this.field1848 + var31;
                    var22 = var25[var36] + var33;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                }
                var8[var9 - arg1 + this.field1846] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class158.field1877; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != -24032) {
            field1854 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILvt;)V", line = 140)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field1849;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4449 = arg2.method895((byte) -109) == 1;
                }
            } else {
                this.field1846 = arg2.method895((byte) -76);
            }
        } else {
            this.field1848 = arg2.method895((byte) -75);
        }
        if (arg0 > -44) {
            method744((class256) null, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V", line = 184)
    public static final void method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1852;
        if (arg1 == arg2) {
            class270.method1632(arg0, arg4, (byte) 77, arg2, arg7, arg3, arg6);
        } else {
            if (~class75.field912 >= ~(-arg2 + arg6) && arg2 + arg6 <= class453.field6396 && ~class357.field5123 >= ~(-arg1 + arg0) && arg0 - -arg1 <= class328.field4729) {
                class318.method1954(arg7, arg6, arg3, arg5 + -457832492, arg1, arg0, arg4, arg2);
            } else {
                class256.method1571(arg2, arg0, arg4, arg3, arg1, (byte) -120, arg6, arg7);
            }
            if (arg5 != 457854448) {
                method746(-41, (byte) 20);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[I", line = 209)
    public final int[] method13(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field1856;
            int[] var3 = super.field4443.method2877(arg0, 1);
            if (super.field4443.field6915) {
                int var4 = this.field1846 + 1 - -this.field1846;
                int var5 = 65536 / var4;
                int var6 = this.field1848 - -1 + this.field1848;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field1846 + arg0; ~(arg0 - -this.field1846) <= ~var9; ++var9) {
                    int[] var13 = this.method1882(0, -2594, var9 & class208.field2886);
                    int[] var14 = new int[class158.field1877];
                    int var15 = 0;
                    for (int var16 = -this.field1848; ~this.field1848 <= ~var16; ++var16) {
                        var15 += var13[var16 & class474.field6656];
                    }
                    int var17 = 0;
                    while (class158.field1877 > var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class474.field6656 & var17 - this.field1848];
                        ++var17;
                        var15 = var13[class474.field6656 & var17 - -this.field1848] + var18;
                    }
                    var8[-arg0 + this.field1846 + var9] = var14;
                }
                for (int var10 = 0; class158.field1877 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 483)
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 305)
    public static void method743(int arg0) {
        field1854 = null;
        field1853 = null;
        if (arg0 != 28276) {
            field1855 = -120;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lab;B)V", line = 317)
    public static final void method744(class256 arg0, byte arg1) {
        ++field1847;
        if (class293.field4359) {
            class244.method1332((byte) -119, class106.field1293);
            ++class181.field2309;
            int var2 = -90 / ((arg1 - 69) / 48);
            class230.field3185.method897(arg0.field3659, -104);
            class230.field3185.method878(true, class274.field3905);
            class230.field3185.method889(true, arg0.field3568);
            class230.field3185.method933((byte) -121, class145.field1749);
            class230.field3185.method889(true, arg0.field3585);
            class230.field3185.method889(true, class208.field2883);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIBII)V", line = 341)
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field1850;
        if (class480.method2837((byte) -121, arg3)) {
            int var10 = 57 % ((arg6 - 51) / 35);
            class190.method1038(2048, arg2, class284.field4130[arg3], arg7, arg5, arg8, arg0, arg1, arg4, -1);
        } else if (arg7 != -1) {
            class61.field764[arg7] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class61.field764[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)I", line = 379)
    public static final int method746(int arg0, byte arg1) {
        ++field1851;
        double var2 = (double) (arg0 >> 16 & 255) / 256.0D;
        double var4 = (double) ((65371 & arg0) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 255) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (-var6 + var4) / (var10 - var8);
            } else if (var4 != var10) {
                if (var6 == var10) {
                    var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (var6 - var2) / (-var8 + var10) + 2.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 + -var8);
            }
        }
        if (arg1 > -122) {
            return -88;
        } else {
            double var18 = var12 / 6.0D;
            int var20 = (int) (var18 * 256.0D);
            int var21 = (int) (var14 * 256.0D);
            int var22 = (int) (var16 * 256.0D);
            if (~var21 > -1) {
                var21 = 0;
            } else if (~var21 < -256) {
                var21 = 255;
            }
            if (~var22 <= -1) {
                if (var22 > 255) {
                    var22 = 255;
                }
            } else {
                var22 = 0;
            }
            if (~var22 < -244) {
                var21 >>= 4;
            } else if (var22 > 217) {
                var21 >>= 3;
            } else if (var22 > 192) {
                var21 >>= 2;
            } else if (var22 > 179) {
                var21 >>= 1;
            }
            return ((var20 >> 2 & 63) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
        }
    }
}
