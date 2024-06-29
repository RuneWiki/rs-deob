import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class295 extends class177 {

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    private int field4973 = 0;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    private int field4974 = -1;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "Z")
    public boolean field4977 = false;

    @OriginalMember(owner = "client!pi", name = "rb", descriptor = "Lje;")
    private class68 field5001;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Z")
    private boolean field4982;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "Z")
    private boolean field4992;

    @OriginalMember(owner = "client!pi", name = "qb", descriptor = "Z")
    private boolean field5000;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "Z")
    private boolean field4978;

    @OriginalMember(owner = "client!pi", name = "tb", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!pi", name = "pb", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!pi", name = "yb", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!pi", name = "mb", descriptor = "I")
    private int field4996;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Lbe;")
    public static class283 field4984 = class153.method941(-25, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!pi", name = "ub", descriptor = "I")
    public static int field5004 = 0;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "Lbe;")
    public static class283 field4986 = class153.method941(-107, "hitmarks");

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "Lii;")
    public static class201 field4981 = new class201();

    @OriginalMember(owner = "client!pi", name = "Ab", descriptor = "Lbe;")
    private static class283 field5010 = class153.method941(1, " is already on your ignore list)3");

    @OriginalMember(owner = "client!pi", name = "zb", descriptor = "Lbe;")
    public static class283 field5009 = field5010;

    @OriginalMember(owner = "client!pi", name = "Cb", descriptor = "Lbe;")
    public static class283 field5012 = class153.method941(127, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "F")
    private float field4980;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!pi", name = "lb", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!pi", name = "nb", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!pi", name = "ob", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!pi", name = "sb", descriptor = "I")
    private int field5002;

    @OriginalMember(owner = "client!pi", name = "vb", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!pi", name = "wb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!pi", name = "xb", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!pi", name = "Bb", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!pi", name = "Db", descriptor = "Lek;")
    public static class172 field5013;

    @OriginalMember(owner = "client!pi", name = "kb", descriptor = "[I")
    private int[] field4994;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lfd;ZFLek;I)[I", line = 24)
    public final int[] method1995(class230 arg0, boolean arg1, float arg2, class172 arg3, int arg4) {
        int var6 = 94 % ((-arg4 - 15) / 33);
        field4989++;
        if (this.field4994 == null || this.field4980 != arg2) {
            if (!this.field5001.method433(arg0, arg3, 0)) {
                return null;
            }
            int var7 = arg1 ? 64 : 128;
            this.field4994 = this.field5001.method434(var7, this.field4992, arg3, var7, true, (byte) 76, (double) arg2, arg0);
            this.field4980 = arg2;
            if (this.field4982) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var13 = var7;
                int var14;
                int var15 = var14 = var7;
                int var16 = var7 * var7;
                int var17 = var7 - 1;
                int var18 = var7 - 1;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var20 = var18; var20 >= 0; var20--) {
                        var14--;
                        int var21 = this.field4994[var14];
                        var8[var20] += class178.method1174(255, var21 >> 16);
                        var9[var20] += class178.method1174(255, var21 >> 8);
                        var10[var20] += class178.method1174(255, var21);
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                }
                int var22 = var16;
                for (int var23 = var17; var23 >= 0; var23--) {
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    int var28 = 1;
                    for (int var29 = 2; var29 >= 0; var29--) {
                        var28--;
                        var26 += var8[var28];
                        var24 += var9[var28];
                        var25 += var10[var28];
                        if (var28 == 0) {
                            var28 = var13;
                        }
                    }
                    for (int var30 = var18; var30 >= 0; var30--) {
                        var28--;
                        var27--;
                        int var31 = var24 / 9;
                        int var32 = var26 / 9;
                        int var33 = var25 / 9;
                        var22--;
                        var11[var22] = class53.method337(class53.method337(var31 << 8, var32 << 16), var33);
                        var25 += var10[var28] - var10[var27];
                        var24 += var9[var28] - var9[var27];
                        var26 += var8[var28] - var8[var27];
                        if (var27 == 0) {
                            var27 = var13;
                        }
                        if (var28 == 0) {
                            var28 = var13;
                        }
                    }
                    for (int var34 = var18; var34 >= 0; var34--) {
                        var15--;
                        int var35 = this.field4994[var15];
                        var14--;
                        int var36 = this.field4994[var14];
                        var8[var34] += -class178.method1174(var35 >> 16, 255) + (class178.method1174(16727789, var36) >> 16);
                        var9[var34] += -(class178.method1174(65339, var35) >> 8) + (class178.method1174(var36, 65453) >> 8);
                        var10[var34] += -class178.method1174(var35, 255) + class178.method1174(var36, 255);
                    }
                    if (var15 == 0) {
                        var15 = var16;
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                }
                this.field4994 = var11;
            }
        }
        return this.field4994;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lfe;)V", line = 717)
    public class295(class229 arg0) {
        this.field5001 = new class68(arg0);
        this.field4982 = arg0.method1535((byte) 116) == 1;
        this.field4992 = arg0.method1535((byte) 76) == 1;
        this.field5000 = arg0.method1535((byte) 108) == 1;
        this.field4978 = arg0.method1535((byte) 101) == 1;
        int var2 = arg0.method1535((byte) 91) & 0x3;
        this.field5003 = arg0.method1497(false);
        this.field4999 = arg0.method1497(false);
        int var3 = arg0.method1535((byte) 124);
        arg0.method1535((byte) 114);
        if (var2 == 1) {
            this.field5008 = 2;
        } else if (var2 == 2) {
            this.field5008 = 3;
        } else if (var2 == 3) {
            this.field5008 = 4;
        } else {
            this.field5008 = 0;
        }
        this.field4996 = (var3 & 0xF8) >> 4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Z", line = 197)
    public static final boolean method1996(int arg0, int arg1) {
        field4985++;
        if (arg1 != -4097) {
            method1996(-107, 39);
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILek;Lfd;Z)[I", line = 208)
    public final int[] method1997(int arg0, class172 arg1, class230 arg2, boolean arg3) {
        field5007++;
        if (!this.field5001.method433(arg2, arg1, 0)) {
            return null;
        }
        if (arg0 > -46) {
            this.field4982 = false;
        }
        int var5 = arg3 ? 64 : 128;
        return this.field5001.method434(var5, this.field4992, arg1, var5, false, (byte) 76, 1.0D, arg2);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V", line = 235)
    public static final void method1998(int arg0, boolean arg1) {
        class180.field3091.method1637(arg1, arg0);
        class294.field4970.method1637(arg1, arg0);
        field4975++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZBLfd;Lek;)Z", line = 248)
    public final boolean method1999(boolean arg0, byte arg1, class230 arg2, class172 arg3) {
        field5005++;
        if (!this.field5001.method433(arg2, arg3, 0)) {
            return false;
        }
        GL var5 = class167.field2806;
        int var6 = class232.method1564(4);
        int var7 = arg0 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field4974 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field5002 = class101.field1723;
                this.field4974 = var8[0];
                class167.method1033(this.field4974);
                ByteBuffer var9 = ByteBuffer.wrap(this.field5001.method431(var7, var7, -116, this.field4992, arg3, arg2, 0.7D));
                if (this.field4996 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class101.field1720 += var9.limit() * 4 / 3 - this.field4973;
                    this.field4973 = var9.limit() * 4 / 3;
                } else if (this.field4996 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class101.field1720 += var9.limit() * 4 / 3 - this.field4973;
                            this.field4973 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field5001.method431(var7, var7, -116, this.field4992, arg3, arg2, 0.7D));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class101.field1720 += var9.limit() - this.field4973;
                    this.field4973 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field5000 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field4978 ? 10497 : 33071);
            } else {
                class167.method1033(this.field4974);
            }
        }
        if ((var6 & 0x2) == 0) {
            class167.method1047(this.field5008);
        }
        if ((var6 & 0x4) == 0) {
            class167.method1055(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field4999 == 0 && this.field5003 == 0) {
                class167.method1034();
            } else {
                float var12 = (float) (class167.field2803 * this.field5003) / (float) var7;
                float var13 = (float) (class167.field2803 * this.field4999) / (float) var7;
                class167.method1061(var12, var13, 0.0F);
            }
        }
        int var14 = -1 / ((9 - arg1) / 43);
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLfd;Lek;)Z", line = 355)
    public final boolean method2000(byte arg0, class230 arg1, class172 arg2) {
        if (arg0 == 49) {
            field4993++;
            return this.field5001.method433(arg1, arg2, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([Lqb;[Lgi;[Lqb;[Lqb;Lek;[Lqb;I)V", line = 368)
    public static final void method2001(class95[] arg0, class204[] arg1, class95[] arg2, class95[] arg3, class172 arg4, class95[] arg5, int arg6) {
        field4987++;
        class304.field5159 = arg1;
        class126.field2091 = arg2;
        class10.field93 = arg4;
        class273.field4587 = arg5;
        class201.field3435 = arg3;
        int var7 = 81 % ((arg6 - 73) / 35);
        class68.field970 = arg0;
        class184.field3163.method1810(-88);
        int var8 = class10.field93.method1097(class242.field4081, 0);
        int[] var9 = class10.field93.method1118(var8, false);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class184.field3163.method1809(class291.method1983(-29576, new class229(class10.field93.method1107(var8, var9[var10], 118))), (byte) -127);
        }
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V", line = 403)
    public static void method2002(int arg0) {
        field5013 = null;
        field4984 = null;
        field5009 = null;
        field4986 = null;
        if (arg0 == -1) {
            field5012 = null;
            field4981 = null;
            field5010 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 423)
    public static final void method2003(boolean arg0) {
        if (arg0) {
            method2006(-11L, -99);
        }
        for (int var1 = 0; var1 < class69.field1015; var1++) {
            int var2 = class26.field393[var1];
            class191 var3 = class149.field2436[var2];
            int var4 = class262.field4462.method1535((byte) 88);
            if ((var4 & 0x2) != 0) {
                var4 += class262.field4462.method1535((byte) 91) << 8;
            }
            class277.method1850(var2, var4, (byte) -49, var3);
        }
        field5006++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V", line = 461)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4991++;
        if (class92.method588(arg3, arg0 - 44)) {
            client.method1594(class122.field2036[arg3], -1, arg4, arg1, arg5, arg7, arg2, arg6);
            if (arg0 != 1) {
                method2008(69, (class281) null, -74, -12, -92, 29, 51, 115, -37);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V", line = 479)
    public final void method2005(int arg0, int arg1) {
        field4998++;
        if (this.field4994 == null) {
            return;
        }
        int var3 = 62 % ((-arg0 - 74) / 40);
        if (this.field4999 == 0 && this.field5003 == 0) {
            return;
        }
        if (class115.field1922 == null || class115.field1922.length < this.field4994.length) {
            class115.field1922 = new int[this.field4994.length];
        }
        int var4 = this.field4994.length == 4096 ? 64 : 128;
        int var5 = this.field4994.length;
        int var6 = var4 - 1;
        int var7 = arg1 * var4 * this.field4999;
        int var8 = this.field5003 * arg1;
        int var9 = var5 - 1;
        for (int var10 = 0; var10 < var5; var10 += var4) {
            int var11 = var9 & var7 + var10;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var11 + (var6 & var8 + var12);
                int var14 = var10 + var12;
                class115.field1922[var14] = this.field4994[var13];
            }
        }
        int[] var15 = this.field4994;
        this.field4994 = class115.field1922;
        class115.field1922 = var15;
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 538)
    protected final void finalize() throws Throwable {
        if (this.field4974 != -1) {
            class101.method672(this.field4974, this.field4973, this.field5002);
            this.field4974 = -1;
            this.field4973 = 0;
        }
        super.finalize();
        field4997++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)V", line = 556)
    public static final void method2006(long arg0, int arg1) {
        field4988++;
        if ((long) arg1 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < class103.field1748; var3++) {
            if (class160.field2622[var3] == arg0) {
                class148.field2413++;
                class103.field1748--;
                for (int var4 = var3; var4 < class103.field1748; var4++) {
                    class143.field2372[var4] = class143.field2372[var4 + 1];
                    class194.field3321[var4] = class194.field3321[var4 + 1];
                    class16.field190[var4] = class16.field190[var4 + 1];
                    class160.field2622[var4] = class160.field2622[var4 + 1];
                    class42.field586[var4] = class42.field586[var4 + 1];
                    class245.field4166[var4] = class245.field4166[var4 + 1];
                }
                class141.field2359 = class252.field4284;
                class228.field3831.method621(54, 8);
                class228.field3831.method1544((byte) 8, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V", line = 603)
    public static final void method2007(boolean arg0) {
        field4995++;
        class291.field4930.method1631(-27875);
        if (arg0) {
            field4986 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILl;IIIIIII)V", line = 618)
    public static final void method2008(int arg0, class281 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg4 & 0x3;
        if (arg0 != 64) {
            field4986 = (class283) null;
        }
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg1.field4727;
            var11 = arg1.field4754;
        } else {
            var10 = arg1.field4754;
            var11 = arg1.field4727;
        }
        field4976++;
        int var12;
        int var13;
        if ((arg6 + var11) > 104) {
            var12 = arg6;
            var13 = arg6 + 1;
        } else {
            var13 = (var11 + 1 >> 1) + arg6;
            var12 = (var11 >> 1) + arg6;
        }
        int var14 = (arg6 << 7) + (var11 << 6);
        int var15;
        int var16;
        if ((arg3 + var10) <= 104) {
            var15 = (var10 + 1 >> 1) + arg3;
            var16 = arg3 + (var10 >> 1);
        } else {
            var15 = arg3 + 1;
            var16 = arg3;
        }
        int[][] var17 = class65.field890[arg5];
        int var18 = var17[var13][var16] + var17[var13][var15] + var17[var12][var16] + var17[var12][var15] >> 2;
        int var19 = 0;
        int var20 = (arg3 << 7) + (var10 << 6);
        if (arg5 != 0) {
            int[][] var21 = class65.field890[0];
            var19 = var18 - (var21[var12][var16] + var21[var13][var16] + var21[var12][var15] + var21[var13][var15] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class65.field890[arg5 + 1];
        }
        class201 var23 = arg1.method1891(true, arg8, (byte) -70, var22, var18, false, var20, (class95) null, var17, arg4, var14);
        class212.method1390(var23.field3431, var14 - arg7, var19, var20 - arg2);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILek;IB)[Lqb;", line = 703)
    public static final class95[] method2009(int arg0, class172 arg1, int arg2, byte arg3) {
        int var4 = 73 / ((-arg3 - 43) / 58);
        field4979++;
        return class26.method183(true, arg1, arg2, arg0) ? class137.method855(-12) : null;
    }
}
