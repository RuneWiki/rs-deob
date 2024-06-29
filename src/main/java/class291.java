import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class291 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
    private boolean field4171 = true;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    private int field4183 = -1;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "[Lad;")
    private class292[] field4185;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    private int field4173;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "[Lad;")
    private class292[] field4191;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lad;")
    private class292 field4172;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4175 = 0;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[I")
    public static int[] field4179 = new int[4096];

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    private int field4177;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    private int field4180;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Ll;")
    private class16 field4184;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "[Lkf;")
    public static class166[] field4182;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I[Lad;IIII)V", line = 416)
    public class291(int arg0, class292[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4185 = arg1;
        this.field4190 = arg0;
        this.field4173 = arg3;
        this.field4192 = arg4;
        this.field4186 = arg5;
        if (arg1 == null) {
            this.field4172 = null;
            this.field4191 = null;
        } else {
            this.field4191 = new class292[arg1.length];
            this.field4172 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IBIZII)V", line = 16)
    public static final void method1834(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4194++;
        if (class422.field6240 == null) {
            class225.field3300.method367(arg0, arg2, arg4, (byte) 58, -16777216, arg5);
        } else if (class435.field6375.field6335 >= 0 && class397.field5828 * 128 > class435.field6375.field6335 && class435.field6375.field6334 >= 0 && class435.field6375.field6334 < (class457.field6713 * 128)) {
            class50.field551++;
            if (class435.field6375 != null && (class435.field6375.field6335 - ((class435.field6375.method963((byte) 127) - 1) * 64) >> 7) == class74.field1012 && class435.field6375.field6334 - ((class435.field6375.method963((byte) 127) - 1) * 64) >> 7 == class98.field1317) {
                class74.field1012 = -1;
                class98.field1317 = -1;
                class490.method2944((byte) -31);
            }
            class408.method2504(-11841);
            if (!arg3) {
                class141.method1054(25861);
            }
            class522.method3103(0);
            class24.method201(arg4, arg2, (byte) -21, arg0, true, arg5);
            int var6 = class515.field7581;
            int var7 = class4.field70;
            int var8 = class107.field1484;
            int var9 = class107.field1521;
            if (class462.field6802 == 1) {
                int var10 = (int) class386.field5687;
                if ((class67.field869 >> 8) > var10) {
                    var10 = class67.field869 >> 8;
                }
                if (class173.field2456[4] && class200.field2935[4] + 128 > var10) {
                    var10 = class200.field2935[4] + 128;
                }
                int var11 = (int) class328.field4588 + class148.field2073 & 0x3FFF;
                class73.method692(0, class231.field3380, ((var10 >> 3) * 3) + 600 << 0, class49.field537, var11, class66.method643(class435.field6375.field6335, 59, class525.field7714, class435.field6375.field6334) - 50, var7, var10);
            } else if (class462.field6802 == 4) {
                int var12 = (int) class386.field5687;
                if ((class67.field869 >> 8) > var12) {
                    var12 = class67.field869 >> 8;
                }
                if (class173.field2456[4] && var12 < (class200.field2935[4] + 128)) {
                    var12 = class200.field2935[4] + 128;
                }
                int var13 = (int) class328.field4588 & 0x3FFF;
                class73.method692(0, class231.field3380, (var12 >> 3) * 3 + 600 << 0, class49.field537, var13, class66.method643(class204.field2966, 125, class525.field7714, class203.field2949) - 50, var7, var12);
            } else if (class462.field6802 == 5) {
                class215.method1471(var7, (byte) 24);
            }
            int var14 = class161.field2268;
            int var15 = class487.field7162;
            int var16 = class486.field7138;
            int var17 = class321.field4529;
            int var18 = class316.field4503;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class173.field2456[var19]) {
                    int var22 = (int) (Math.random() * (double) (class400.field5937[var19] * 2 + 1) + Math.sin((double) class146.field2051[var19] / 100.0D * (double) class442.field6562[var19]) * (double) class200.field2935[var19] - (double) class400.field5937[var19]);
                    if (var19 == 3) {
                        class316.field4503 = class316.field4503 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class487.field7162 += var22;
                    }
                    if (var19 == 0) {
                        class161.field2268 += var22;
                    }
                    if (var19 == 4) {
                        class321.field4529 += var22;
                        if (class321.field4529 < 1024) {
                            class321.field4529 = 1024;
                        } else if (class321.field4529 > 3072) {
                            class321.field4529 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class486.field7138 += var22;
                    }
                }
            }
            if (class161.field2268 < 0) {
                class161.field2268 = 0;
            }
            if (class161.field2268 > ((class241.field3562 << 7) - 1)) {
                class161.field2268 = (class241.field3562 << 7) - 1;
            }
            if (class486.field7138 < 0) {
                class486.field7138 = 0;
            }
            if ((class497.field7388 << 7) - 1 < class486.field7138) {
                class486.field7138 = (class497.field7388 << 7) - 1;
            }
            class379.method2323(-11572);
            class183.method1291(-12388);
            class225.field3300.method380(var9, var8, var6 + var9, var7 + var8);
            class225.field3300.method331();
            int var20 = class151.field2131;
            if (arg1 > 40) {
                if (class423.field6245 == null) {
                    class225.field3300.method381(var20);
                } else {
                    class423.field6245.method1842(class487.field7161 << 3, var9, var8, class316.field4503, class321.field4529, class225.field3300, 16383, var6, var20, var7);
                }
                class106.method876((byte) -109);
                class462.field6798.method242(class161.field2268, class487.field7162, class486.field7138, -class321.field4529 & 0x3FFF, -class316.field4503 & 0x3FFF, -class170.field2418 & 0x3FFF);
                class225.field3300.method308(class462.field6798);
                class225.field3300.method394(var6 / 2 + var9, var7 / 2 + var8, class314.field4466 << 1, class314.field4466 << 1);
                class487.method2924(class314.field4466 << 1, var6 / 2 + var9, (byte) 118, var7 / 2 + var8, class314.field4466 << 1);
                class280.method1796(-class316.field4503 & 0x3FFF, -class170.field2418 & 0x3FFF, class161.field2268, class486.field7138, -class321.field4529 & 0x3FFF, class487.field7162, 121);
                byte var21 = class478.field7044.method2069(class65.field802, -68) == 2 ? (byte) class50.field551 : 1;
                class349.method2107(class225.field3300, class263.field3867, class176.field2498, class462.field6798, class161.field2268, class487.field7162, class486.field7138, class232.field3411, class133.field1929, class516.field7605, class325.field4562, class393.field5784, class452.field6656, class435.field6375.field6328 + 1, var21, class435.field6375.field6335 >> 7, class435.field6375.field6334 >> 7, !class478.field7044.field3323);
                class106.method876((byte) -109);
                if (class113.field1589 == 30) {
                    class520.method3093(var7, 256, 125, 256, var8, var6, var9);
                    class142.method1057(var6, 256, 10, var8, 256, var9, var7);
                    class49.method497((byte) 56, 256, var8, var6, var7, 256, var9);
                    class523.method3106(var7, var6, var9, var8, (byte) -106);
                }
                class24.method196();
                class161.field2268 = var14;
                class487.field7162 = var15;
                class486.field7138 = var16;
                class316.field4503 = var18;
                class321.field4529 = var17;
                if (class179.field2532 && class405.field6029.method1426(0) == 0) {
                    class179.field2532 = false;
                }
                if (class179.field2532) {
                    class225.field3300.method367(var9, var6, var8, (byte) 58, -16777216, var7);
                    class195.method1364(false, class179.field2529.method2031(true, class377.field5585), class396.field5802, 13);
                }
            }
        } else {
            class225.field3300.method367(arg0, arg2, arg4, (byte) 58, -16777216, arg5);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BILya;)Z", line = 217)
    public final boolean method1835(byte arg0, int arg1, class38 arg2) {
        field4195++;
        if (this.field4183 != arg1) {
            this.field4183 = arg1;
            int var4 = class118.method934(arg1, 269173057);
            if (var4 > arg1) {
                var4 = class106.method871(arg1, false);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4180 != var4) {
                this.field4184 = null;
                this.field4180 = var4;
            }
            if (this.field4185 != null) {
                this.field4177 = 0;
                int[] var5 = new int[this.field4185.length];
                for (int var6 = 0; var6 < this.field4185.length; var6++) {
                    class292 var7 = this.field4185[var6];
                    if (var7.method1847(this.field4173, this.field4192, this.field4186, this.field4183)) {
                        var5[this.field4177] = var7.field4199;
                        this.field4191[this.field4177++] = var7;
                    }
                }
                class360.method2162(var5, this.field4177 - 1, 0, this.field4191, -126);
            }
            this.field4171 = true;
        }
        int var8 = -61 % ((-arg0 - 75) / 34);
        boolean var9 = false;
        if (this.field4171) {
            this.field4171 = false;
            for (int var10 = this.field4177 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field4191[var10].method1853(arg2, this.field4172);
                this.field4171 |= !var11;
                var9 |= var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBZIZI)V", line = 294)
    public static final void method1836(int arg0, int arg1, byte arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field4181++;
        if (arg0 < arg4) {
            int var7 = (arg0 + arg4) / 2;
            int var8 = arg0;
            class166 var9 = class371.field5520[var7];
            class371.field5520[var7] = class371.field5520[arg4];
            class371.field5520[arg4] = var9;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (class411.method2517(arg6, class371.field5520[var10], arg3, var9, arg1, arg5, (byte) -85) <= 0) {
                    class166 var11 = class371.field5520[var10];
                    class371.field5520[var10] = class371.field5520[var8];
                    class371.field5520[var8++] = var11;
                }
            }
            class371.field5520[arg4] = class371.field5520[var8];
            class371.field5520[var8] = var9;
            method1836(arg0, arg1, (byte) 59, arg3, var8 - 1, arg5, arg6);
            method1836(var8 + 1, arg1, (byte) 126, arg3, arg4, arg5, arg6);
        }
        if (arg2 <= 40) {
            field4188 = -29;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Lkf;", line = 339)
    public static final class166 method1837(int arg0) {
        field4174++;
        class453.field6670 = arg0;
        return class134.method1028(1405);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 348)
    public static void method1838(int arg0) {
        if (arg0 != 4096) {
            field4188 = 124;
        }
        field4179 = null;
        field4182 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I", line = 360)
    public static final int method1839(int arg0, int arg1, int arg2, int arg3) {
        field4178++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        int var5 = -77 / ((9 - arg2) / 41);
        if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 385)
    public final void method1840(int arg0) {
        if (this.field4185 != null) {
            for (int var2 = 0; var2 < this.field4185.length; var2++) {
                this.field4185[var2].method1845();
            }
        }
        if (arg0 != -4096) {
            this.field4190 = -91;
        }
        field4189++;
        this.field4184 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(DB)V", line = 439)
    public static final void method1841(double arg0, byte arg1) {
        if (class37.field403 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class470.field6943[var3] = var4 <= 255 ? var4 : 255;
            }
            class37.field403 = arg0;
        }
        if (arg1 > -4) {
            field4179 = null;
        }
        field4187++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIILya;IIII)V", line = 465)
    public final void method1842(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6, int arg7, int arg8, int arg9) {
        field4176++;
        int var11 = arg3 + arg0 & arg6;
        if (this.field4190 == -1) {
            arg5.method386(arg1, arg2, arg7, arg9, arg8, 0);
        } else {
            class104 var12 = class392.field5772.method1780(-31305, this.field4190);
            if (this.field4184 == null && class392.field5772.method1776(this.field4190, 19378)) {
                int[] var13 = var12.field1440 ? class392.field5772.method1777(false, arg6 - 10629, this.field4190, 0.7F, this.field4180, this.field4180) : class392.field5772.method1779(false, this.field4190, false, 0.7F, this.field4180, this.field4180);
                this.field4184 = arg5.method330(var13, 0, this.field4180, this.field4180, this.field4180);
            }
            if (!var12.field1440) {
                arg5.method386(arg1, arg2, arg7, arg9, arg8, 0);
            }
            if (this.field4184 != null) {
                int var14 = var12.field1440 ? 0 : 1;
                int var15 = arg4 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg7 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg7; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field4184.method121(arg1 + var17, arg2 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4177 - 1; var19 >= 0; var19--) {
            this.field4191[var19].method1852(arg5, arg1, arg2, arg7, arg9, arg4, var11);
        }
    }
}
