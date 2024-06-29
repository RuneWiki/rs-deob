import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class152 {

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "[[B")
    private byte[][] field1862 = new byte[256][];

    @OriginalMember(owner = "client!ma", name = "ub", descriptor = "I")
    public int field1879 = 0;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "[I")
    private int[] field1859;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "[I")
    private int[] field1876;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "[I")
    private int[] field1864;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!ma", name = "yb", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    private static int field1857 = 256;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Lfc;")
    private static class39 field1855 = class90.method774(")4col", -88);

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
    private static int field1865 = 0;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lfc;")
    private static class39 field1863 = class90.method774("str", -116);

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lfc;")
    private static class39 field1866 = class90.method774("u=", -101);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "Lfc;")
    private static class39 field1854 = class90.method774(")4i", -90);

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lfc;")
    private static class39 field1870 = class90.method774("i", -93);

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lfc;")
    private static class39 field1871 = class90.method774("gt", -79);

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Lfc;")
    private static class39 field1852 = class90.method774("shad", -93);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lfc;")
    private static class39 field1856 = class90.method774(")4u", -103);

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "Lfc;")
    private static class39 field1872 = class90.method774("lt", -123);

    @OriginalMember(owner = "client!ma", name = "sb", descriptor = "Lfc;")
    private static class39 field1877 = class90.method774("b", -124);

    @OriginalMember(owner = "client!ma", name = "tb", descriptor = "Lfc;")
    private static class39 field1878 = class90.method774("img=", -78);

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lfc;")
    private static class39 field1874 = class90.method774(")4str", -99);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    private static int field1858 = -1;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "Lfc;")
    private static class39 field1875 = class90.method774(")4shad", -119);

    @OriginalMember(owner = "client!ma", name = "wb", descriptor = "Lfc;")
    private static class39 field1881 = class90.method774("br", -98);

    @OriginalMember(owner = "client!ma", name = "vb", descriptor = "Lfc;")
    private static class39 field1880 = class90.method774("col=", -105);

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lfc;")
    private static class39 field1860 = class90.method774(")4b", -114);

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "Lfc;")
    private static class39 field1873 = class90.method774("shad=", -88);

    @OriginalMember(owner = "client!ma", name = "Ab", descriptor = "Lfc;")
    private static class39 field1885 = class90.method774("u", -97);

    @OriginalMember(owner = "client!ma", name = "xb", descriptor = "I")
    private static int field1882 = 0;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    private static int field1868 = -1;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "Lfc;")
    private static class39 field1867 = class90.method774("str=", -125);

    @OriginalMember(owner = "client!ma", name = "zb", descriptor = "I")
    private static int field1884 = -1;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    private static int field1869 = -1;

    @OriginalMember(owner = "client!ma", name = "Cb", descriptor = "I")
    private static int field1887 = 0;

    @OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
    private static int field1888 = 0;

    @OriginalMember(owner = "client!ma", name = "Bb", descriptor = "Ljava/util/Random;")
    private static Random field1886 = new Random();

    @OriginalMember(owner = "client!ma", name = "Eb", descriptor = "[Lfc;")
    private static class39[] field1889 = new class39[100];

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lue;")
    private static class141[] field1861;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I[BIIIIIII)V", line = 4)
    private static final void method698(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;IIIIIIIII)V", line = 60)
    public final void method699(class39 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method701(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field1879;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field1883 + this.field1853 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method709(arg0, var11, field1889);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field1853 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field1853 - this.field1883 - (var12 - 1) * arg9) / 2 + this.field1853 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field1883 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field1853 - this.field1883 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field1853 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method702(field1889[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method702(field1889[var15], arg1 + (arg3 - this.method707(field1889[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method702(field1889[var15], arg1 + arg3 - this.method707(field1889[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method702(field1889[var15], arg1, var13);
            } else {
                this.method703(field1889[var15], arg3);
                this.method702(field1889[var15], arg1, var13);
                field1865 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;IIII)V", line = 133)
    public final void method700(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method701(arg3, arg4);
            this.method702(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 142)
    private final void method701(int arg0, int arg1) {
        field1884 = -1;
        field1858 = -1;
        field1868 = arg1;
        field1869 = arg1;
        field1888 = arg0;
        field1882 = arg0;
        field1857 = 256;
        field1865 = 0;
        field1887 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;II)V", line = 155)
    private final void method702(class39 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1879;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field1046; var6++) {
            int var7 = arg0.field1067[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class39 var8 = arg0.method456(0, var5 + 1, var6);
                    var5 = -1;
                    if (var8.method462(-117, field1872)) {
                        var7 = 60;
                    } else {
                        if (!var8.method462(-125, field1871)) {
                            if (var8.method472(0, field1878)) {
                                try {
                                    int var9 = var8.method469(4, (byte) -126).method457(-25657);
                                    class141 var10 = field1861[var9];
                                    var10.method1155(arg1, this.field1879 + var4 - var10.field3546);
                                    arg1 += var10.field3543;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method716(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field1876[var7];
                    int var12 = this.field1864[var7];
                    if (var7 == 32) {
                        if (field1865 > 0) {
                            field1887 += field1865;
                            arg1 += field1887 >> 8;
                            field1887 &= 0xFF;
                        }
                    } else if (field1857 == 256) {
                        if (field1869 != -1) {
                            method705(this.field1862[var7], arg1 + 1, this.field1859[var7] + var4 + 1, var11, var12, field1869);
                        }
                        method705(this.field1862[var7], arg1, this.field1859[var7] + var4, var11, var12, field1882);
                    } else {
                        if (field1869 != -1) {
                            method719(this.field1862[var7], arg1 + 1, this.field1859[var7] + var4 + 1, var11, var12, field1869, field1857);
                        }
                        method719(this.field1862[var7], arg1, this.field1859[var7] + var4, var11, var12, field1882, field1857);
                    }
                    if (field1884 != -1) {
                        class152.method1218(arg1, (int) ((double) this.field1879 * 0.7D) + var4, var11, field1884);
                    }
                    if (field1858 != -1) {
                        class152.method1218(arg1, this.field1879 + var4 + 1, var11, field1858);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;I)V", line = 257)
    private final void method703(class39 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method437(59); var5++) {
            int var6 = arg0.method442((byte) 106, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1865 = (arg1 - this.method707(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lfc;IIII)V", line = 298)
    public final void method704(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method701(arg3, arg4);
            this.method702(arg0, arg1 - this.method707(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIII)V", line = 307)
    private static final void method705(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class152.field3752 * arg2 + arg1;
        int var7 = class152.field3752 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class152.field3753) {
            int var10 = class152.field3753 - arg2;
            arg4 -= var10;
            arg2 = class152.field3753;
            var9 += arg3 * var10;
            var6 += class152.field3752 * var10;
        }
        if (arg2 + arg4 > class152.field3756) {
            arg4 -= arg2 + arg4 - class152.field3756;
        }
        if (arg1 < class152.field3755) {
            int var11 = class152.field3755 - arg1;
            arg3 -= var11;
            arg1 = class152.field3755;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class152.field3757) {
            int var12 = arg1 + arg3 - class152.field3757;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method698(class152.field3754, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lfc;I)I", line = 355)
    public final int method706(class39 arg0, int arg1) {
        int var3 = this.method709(arg0, new int[] { arg1 }, field1889);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method707(field1889[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;)I", line = 374)
    public final int method707(class39 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field1046; var4++) {
            int var5 = arg0.field1067[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class39 var6 = arg0.method456(0, var2 + 1, var4);
                var2 = -1;
                if (var6.method462(-113, field1872)) {
                    var3 += this.field1876[60];
                } else if (var6.method462(-122, field1871)) {
                    var3 += this.field1876[62];
                } else if (var6.method472(0, field1878)) {
                    try {
                        int var7 = var6.method469(4, (byte) -124).method457(-25657);
                        var3 += field1861[var7].field3543;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field1876[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lfc;)Lfc;", line = 439)
    public static final class39 method708(class39 arg0) {
        int var1 = arg0.method437(-51);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1067[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class39 var4 = new class39();
        var4.field1046 = var1 + var2;
        var4.field1067 = new byte[var4.field1046];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1067[var6];
            if (var7 == 60) {
                var4.field1067[var5++] = 60;
                var4.field1067[var5++] = 108;
                var4.field1067[var5++] = 116;
                var4.field1067[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1067[var5++] = 60;
                var4.field1067[var5++] = 103;
                var4.field1067[var5++] = 116;
                var4.field1067[var5++] = 62;
            } else {
                var4.field1067[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;[I[Lfc;)I", line = 497)
    private final int method709(class39 arg0, int[] arg1, class39[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class39 var6 = class124.method1039(false, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method437(-62);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method442((byte) 67, var13);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class39 var15 = arg0.method456(0, var10 + 1, var13);
                    var10 = -1;
                    var6.method466(true, 60);
                    var6.method458(1, var15);
                    var6.method466(true, 62);
                    if (var15.method462(-125, field1881)) {
                        arg2[var11++] = var6.method456(0, var5, var6.method437(-91));
                        var5 = var6.method437(-54);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method462(-111, field1872)) {
                        var4 += this.method721(60);
                    } else if (var15.method462(-124, field1871)) {
                        var4 += this.method721(62);
                    } else if (var15.method472(0, field1878)) {
                        try {
                            int var16 = var15.method469(4, (byte) -121).method457(-25657);
                            var4 += field1861[var16].field3543;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method466(true, var14);
                        var4 += this.method721(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method437(72);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method456(0, var5, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method437(-96);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method437(-65) > var5) {
            arg2[var11++] = var6.method456(0, var5, var6.method437(65));
        }
        return var11;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;IIIII)V", line = 638)
    public final void method710(class39 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method701(arg3, arg4);
        int[] var7 = new int[arg0.field1046];
        int[] var8 = new int[arg0.field1046];
        for (int var9 = 0; var9 < arg0.field1046; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method717(arg0, arg1 - this.method707(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lfc;IIIII)V", line = 664)
    public final void method711(class39 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method701(arg3, arg4);
        int[] var7 = new int[arg0.field1046];
        for (int var8 = 0; var8 < arg0.field1046; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method717(arg0, arg1 - this.method707(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lfc;IIIII)V", line = 690)
    public final void method712(class39 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method701(arg3, arg4);
        field1886.setSeed((long) arg5);
        field1857 = (field1886.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1046];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1046; var9++) {
            var7[var9] = var8;
            if ((field1886.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method717(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 1135)
    public class84(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1859 = arg0;
        this.field1876 = arg1;
        this.field1864 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1862 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1859[var10] < var8 && this.field1864[var10] != 0) {
                var8 = this.field1859[var10];
            }
            if (this.field1864[var10] + this.field1859[var10] > var9) {
                var9 = this.field1864[var10] + this.field1859[var10];
            }
            byte[] var11 = this.field1862[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1879 = this.field1864[32] + this.field1859[32];
        this.field1853 = this.field1879 - var8;
        this.field1883 = var9 - this.field1879;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V", line = 1192)
    public class84(byte[] arg0) {
        this.field1876 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field1876.length; var2++) {
            this.field1876[var2] = arg0[var2] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;IIIIII)V", line = 723)
    public final void method713(class39 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method701(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1046];
        for (int var11 = 0; var11 < arg0.field1046; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method717(arg0, arg1 - this.method707(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I[BIIIIIIII)V", line = 773)
    private static final void method714(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V", line = 804)
    public static void method715() {
        field1872 = null;
        field1871 = null;
        field1878 = null;
        field1881 = null;
        field1880 = null;
        field1855 = null;
        field1877 = null;
        field1860 = null;
        field1870 = null;
        field1854 = null;
        field1866 = null;
        field1885 = null;
        field1856 = null;
        field1873 = null;
        field1852 = null;
        field1875 = null;
        field1867 = null;
        field1863 = null;
        field1874 = null;
        field1861 = null;
        field1886 = null;
        field1889 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lfc;)V", line = 831)
    private final void method716(class39 arg0) {
        try {
            if (arg0.method472(0, field1880)) {
                field1882 = arg0.method469(4, (byte) -113).method438(16, -1088756478);
                return;
            }
            if (arg0.method462(-121, field1855)) {
                field1882 = field1888;
                return;
            }
            if (arg0.method472(0, field1867)) {
                field1884 = arg0.method469(4, (byte) -122).method438(16, -1088756478);
                return;
            }
            if (arg0.method462(-112, field1863)) {
                field1884 = 8388608;
                return;
            }
            if (arg0.method462(-113, field1874)) {
                field1884 = -1;
                return;
            }
            if (!arg0.method462(-111, field1877) && !arg0.method462(-120, field1860) && !arg0.method462(-118, field1870) && !arg0.method462(-116, field1854)) {
                if (arg0.method472(0, field1866)) {
                    field1858 = arg0.method469(2, (byte) -128).method438(16, -1088756478);
                    return;
                }
                if (arg0.method462(-125, field1885)) {
                    field1858 = 0;
                    return;
                }
                if (arg0.method462(-118, field1856)) {
                    field1858 = -1;
                    return;
                }
                if (arg0.method472(0, field1873)) {
                    field1869 = arg0.method469(5, (byte) -105).method438(16, -1088756478);
                    return;
                }
                if (arg0.method462(-117, field1852)) {
                    field1869 = 0;
                    return;
                }
                if (arg0.method462(-124, field1875)) {
                    field1869 = field1868;
                    return;
                }
                if (arg0.method462(-112, field1881)) {
                    this.method701(field1888, field1868);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfc;II[I[I)V", line = 908)
    private final void method717(class39 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1879;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1046; var9++) {
            int var10 = arg0.field1067[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class39 var11 = arg0.method456(0, var7 + 1, var9);
                    var7 = -1;
                    if (var11.method462(-111, field1872)) {
                        var10 = 60;
                    } else {
                        if (!var11.method462(-113, field1871)) {
                            if (var11.method472(0, field1878)) {
                                try {
                                    int var12;
                                    if (arg3 == null) {
                                        var12 = 0;
                                    } else {
                                        var12 = arg3[var8];
                                    }
                                    int var13;
                                    if (arg4 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg4[var8];
                                    }
                                    var8++;
                                    int var14 = var11.method469(4, (byte) -123).method457(-25657);
                                    class141 var15 = field1861[var14];
                                    var15.method1155(arg1 + var12, this.field1879 + var6 - var15.field3546 + var13);
                                    arg1 += var15.field3543;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method716(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field1876[var10];
                    int var17 = this.field1864[var10];
                    int var18;
                    if (arg3 == null) {
                        var18 = 0;
                    } else {
                        var18 = arg3[var8];
                    }
                    int var19;
                    if (arg4 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg4[var8];
                    }
                    var8++;
                    if (var10 == 32) {
                        if (field1865 > 0) {
                            field1887 += field1865;
                            arg1 += field1887 >> 8;
                            field1887 &= 0xFF;
                        }
                    } else if (field1857 == 256) {
                        if (field1869 != -1) {
                            method705(this.field1862[var10], arg1 + var18 + 1, this.field1859[var10] + var6 + 1 + var19, var16, var17, field1869);
                        }
                        method705(this.field1862[var10], arg1 + var18, this.field1859[var10] + var6 + var19, var16, var17, field1882);
                    } else {
                        if (field1869 != -1) {
                            method719(this.field1862[var10], arg1 + var18 + 1, this.field1859[var10] + var6 + 1 + var19, var16, var17, field1869, field1857);
                        }
                        method719(this.field1862[var10], arg1 + var18, this.field1859[var10] + var6 + var19, var16, var17, field1882, field1857);
                    }
                    if (field1884 != -1) {
                        class152.method1218(arg1, (int) ((double) this.field1879 * 0.7D) + var6, var16, field1884);
                    }
                    if (field1858 != -1) {
                        class152.method1218(arg1, this.field1879 + var6, var16, field1858);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lfc;I)I", line = 1040)
    public final int method718(class39 arg0, int arg1) {
        return this.method709(arg0, new int[] { arg1 }, field1889);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIIII)V", line = 1047)
    private static final void method719(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class152.field3752 * arg2 + arg1;
        int var8 = class152.field3752 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class152.field3753) {
            int var11 = class152.field3753 - arg2;
            arg4 -= var11;
            arg2 = class152.field3753;
            var10 += arg3 * var11;
            var7 += class152.field3752 * var11;
        }
        if (arg2 + arg4 > class152.field3756) {
            arg4 -= arg2 + arg4 - class152.field3756;
        }
        if (arg1 < class152.field3755) {
            int var12 = class152.field3755 - arg1;
            arg3 -= var12;
            arg1 = class152.field3755;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class152.field3757) {
            int var13 = arg1 + arg3 - class152.field3757;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method714(class152.field3754, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lfc;IIII)V", line = 1110)
    public final void method720(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method701(arg3, arg4);
            this.method702(arg0, arg1 - this.method707(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)I", line = 1208)
    public final int method721(int arg0) {
        return this.field1876[arg0 & 0xFF];
    }
}
