import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class121 extends class288 {

    @OriginalMember(owner = "client!ld", name = "pc", descriptor = "I")
    private int field1886 = 0;

    @OriginalMember(owner = "client!ld", name = "tc", descriptor = "I")
    public int field1890 = 0;

    @OriginalMember(owner = "client!ld", name = "qc", descriptor = "I")
    public int field1887 = -1;

    @OriginalMember(owner = "client!ld", name = "Kc", descriptor = "I")
    public int field1907 = -1;

    @OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
    public int field1898 = 0;

    @OriginalMember(owner = "client!ld", name = "Dc", descriptor = "I")
    public int field1900 = -1;

    @OriginalMember(owner = "client!ld", name = "wc", descriptor = "I")
    public int field1893 = 0;

    @OriginalMember(owner = "client!ld", name = "zc", descriptor = "I")
    public int field1896 = -1;

    @OriginalMember(owner = "client!ld", name = "Sc", descriptor = "Z")
    public boolean field1915 = false;

    @OriginalMember(owner = "client!ld", name = "Nc", descriptor = "I")
    public int field1910 = 0;

    @OriginalMember(owner = "client!ld", name = "Ec", descriptor = "I")
    public int field1901 = -1;

    @OriginalMember(owner = "client!ld", name = "Pc", descriptor = "I")
    public int field1912 = 0;

    @OriginalMember(owner = "client!ld", name = "Oc", descriptor = "I")
    public int field1911 = -1;

    @OriginalMember(owner = "client!ld", name = "Wc", descriptor = "I")
    public int field1919 = -1;

    @OriginalMember(owner = "client!ld", name = "Tc", descriptor = "I")
    public static int field1916 = 128;

    @OriginalMember(owner = "client!ld", name = "sc", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ld", name = "uc", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ld", name = "vc", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ld", name = "xc", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ld", name = "Ac", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ld", name = "Cc", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ld", name = "Fc", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ld", name = "Gc", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ld", name = "Hc", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ld", name = "Ic", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ld", name = "Lc", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ld", name = "Mc", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ld", name = "Qc", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ld", name = "Uc", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ld", name = "Vc", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ld", name = "Rc", descriptor = "Lmj;")
    public class230 field1914;

    @OriginalMember(owner = "client!ld", name = "yc", descriptor = "Ljava/lang/String;")
    public String field1895;

    @OriginalMember(owner = "client!ld", name = "rc", descriptor = "[Lsd;")
    public static class27[] field1888;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lhb;I)V", line = 4)
    public final void method926(class35 arg0, int arg1) {
        field1897++;
        arg0.field455 = 0;
        int var3 = arg0.method273(65280);
        int var4 = super.method929(12);
        this.method2031(false, ((var3 & 0x3A) >> 3) + 1);
        int var5 = var3 & 0x1;
        this.field1886 = arg1 & var3 >> 6;
        int var6 = -1;
        this.field4507 += (this.method929(12) - var4) * 64;
        boolean var7 = (var3 & 0x4) != 0;
        int[] var8 = new int[12];
        this.field4496 += (this.method929(12) - var4) * 64;
        this.field1919 = arg0.method242((byte) -93);
        this.field1911 = arg0.method242((byte) -93);
        this.field1912 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method273(arg1 + 65277);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method273(arg1 + 65277);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg0.method300(arg1 ^ 0xACE652F3);
                    this.field1912 = arg0.method273(arg1 ^ 0xFF03);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class292.field4590[var12 - 32768];
                    var8[var9] = class147.method1098(var13, 1073741824);
                    int var14 = class225.method1603(var13, 0).field4151;
                    if (var14 != 0) {
                        this.field1912 = var14;
                    }
                } else {
                    var8[var9] = class147.method1098(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method273(65280);
            if (var17 < 0 || var17 >= class37.field558[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4478 = arg0.method300(-1394191632);
        long var18 = arg0.method289((byte) 126);
        this.field1895 = class188.method1358(95, var18);
        this.field1910 = arg0.method273(65280);
        if (var7) {
            this.field1893 = arg0.method300(-1394191632);
            this.field1896 = -1;
            this.field1890 = this.field1910;
        } else {
            this.field1893 = 0;
            this.field1890 = arg0.method273(65280);
            this.field1896 = arg0.method273(65280);
            if (this.field1896 == 255) {
                this.field1896 = -1;
            }
        }
        int var20 = this.field1898;
        this.field1898 = arg0.method273(65280);
        if (this.field1898 == 0) {
            class115.method899(arg1 ^ 0xFFFD, this);
        } else {
            int var21 = this.field1900;
            int var22 = this.field1907;
            int var23 = this.field1901;
            int var24 = this.field1887;
            this.field1900 = arg0.method300(arg1 - 1394191635);
            this.field1907 = arg0.method300(-1394191632);
            this.field1901 = arg0.method300(-1394191632);
            this.field1887 = arg0.method300(-1394191632);
            if (this.field1898 != var20 || this.field1900 != var21 || this.field1907 != var22 || this.field1901 != var23 || this.field1887 != var24) {
                class261.method1800(this, arg1 - 18792);
            }
        }
        if (this.field1914 == null) {
            this.field1914 = new class230();
        }
        int var25 = this.field1914.field3559;
        this.field1914.method1631(var15, var5 == 1, var8, true, var6, this.field4478);
        if (var6 != var25) {
            this.field4507 = this.field4477[0] * 128 + (this.method929(12) * 64);
            this.field4496 = this.field4470[0] * 128 + (this.method929(12) * 64);
        }
        if (this.field4502 != null) {
            this.field4502.method1776();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLek;ZI)V", line = 154)
    public static final void method927(int arg0, byte arg1, class184 arg2, boolean arg3, int arg4) {
        field1918++;
        if (arg1 != 69) {
            field1916 = -126;
        }
        int var5 = arg2.field2890;
        if (arg2.field2872 == 0) {
            arg2.field2890 = arg2.field2936;
        } else if (arg2.field2872 == 1) {
            arg2.field2890 = arg0 - arg2.field2936;
        } else if (arg2.field2872 == 2) {
            arg2.field2890 = arg2.field2936 * arg0 >> 14;
        } else if (arg2.field2872 == 3) {
            if (arg2.field2945 == 2) {
                arg2.field2890 = (arg2.field2936 - 1) * arg2.field2906 + arg2.field2936 * 32;
            } else if (arg2.field2945 == 7) {
                arg2.field2890 = (arg2.field2936 - 1) * arg2.field2906 + arg2.field2936 * 115;
            }
        }
        int var6 = arg2.field2904;
        if (arg2.field2963 == 0) {
            arg2.field2904 = arg2.field2913;
        } else if (arg2.field2963 == 1) {
            arg2.field2904 = arg4 - arg2.field2913;
        } else if (arg2.field2963 == 2) {
            arg2.field2904 = arg2.field2913 * arg4 >> 14;
        } else if (arg2.field2963 == 3) {
            if (arg2.field2945 == 2) {
                arg2.field2904 = (arg2.field2913 - 1) * arg2.field2871 + arg2.field2913 * 32;
            } else if (arg2.field2945 == 7) {
                arg2.field2904 = (arg2.field2913 - 1) * arg2.field2871 + arg2.field2913 * 12;
            }
        }
        if (arg2.field2872 == 4) {
            arg2.field2890 = arg2.field2904 * arg2.field2883 / arg2.field2864;
        }
        if (arg2.field2963 == 4) {
            arg2.field2904 = arg2.field2890 * arg2.field2864 / arg2.field2883;
        }
        if (class199.field3147 && (client.method1764(arg2).field4234 != 0 || arg2.field2945 == 0)) {
            if (arg2.field2904 < 5 && arg2.field2890 < 5) {
                arg2.field2904 = 5;
                arg2.field2890 = 5;
            } else {
                if (arg2.field2904 <= 0) {
                    arg2.field2904 = 5;
                }
                if (arg2.field2890 <= 0) {
                    arg2.field2890 = 5;
                }
            }
        }
        if (arg2.field2881 == 1337) {
            class252.field3768 = arg2;
        }
        if (arg3 && arg2.field2817 != null && (arg2.field2890 != var5 || arg2.field2904 != var6)) {
            class167 var7 = new class167();
            var7.field2510 = arg2.field2817;
            var7.field2518 = arg2;
            class35.field473.method977(4, var7);
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)Ljava/lang/String;", line = 257)
    public final String method928(int arg0) {
        field1889++;
        String var2 = this.field1895;
        if (arg0 != 24094) {
            return (String) null;
        }
        if (class314.field4866 != null) {
            var2 = class314.field4866[this.field1886] + var2;
        }
        if (class314.field4865 != null) {
            var2 = var2 + class314.field4865[this.field1886];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V", line = 285)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1902++;
    }

    @OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V", line = 296)
    protected final void finalize() {
        field1903++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()I", line = 304)
    public final int method19() {
        field1899++;
        return this.field4488;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 313)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        field1892++;
        if (this.field1914 == null) {
            return;
        }
        class162 var13 = this.field4439 != -1 && this.field4437 == 0 ? class173.method1259((byte) 119, this.field4439) : null;
        class162 var14 = this.field4527 == -1 || this.field1915 || this.field4527 == this.method2030(-13196).field2084 && var13 != null ? null : class173.method1259((byte) 119, this.field4527);
        class1 var15 = this.field1914.method1641(this.field4460, this.field4436, var13, this.field4504, this.field4537, this.field4508, -1, this.field4449, var14, true, this.field4536);
        int var16 = class230.method1634(25);
        if (class36.field534 && class228.field3523 < 96 && var16 > 50) {
            class152.method1121((byte) 99);
        }
        if (class183.field2755 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (class96.field1417 < var17) {
                class33.field411[class96.field1417] = new byte[102400];
                class96.field1417++;
            }
            while (var17 < class96.field1417) {
                class96.field1417--;
                class33.field411[class96.field1417] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4488 = var15.method19();
        if (class228.field3534 && (this.field1914.field3559 == -1 || class10.method78(this.field1914.field3559, 2).field2736)) {
            class1 var18 = class59.method530(var15, true, 240, this.field4496, this.field4510, 0, this.field4459, var14 == null ? var13 : var14, 1, this.field4507, 0, arg0, var14 == null ? this.field4536 : this.field4436, 160);
            if (class36.field534) {
                float var19 = class36.method329();
                float var20 = class36.method321();
                class36.method319();
                class36.method326(var19, var20 - 150.0F);
                var18.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class254) null);
                class36.method305();
                class36.method326(var19, var20);
            } else {
                var18.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class254) null);
            }
        }
        if (class235.field3602 == this) {
            for (int var21 = class141.field2185.length - 1; var21 >= 0; var21--) {
                class273 var22 = class141.field2185[var21];
                if (var22 != null && var22.field4135 != -1) {
                    if (var22.field4132 == 1 && var22.field4136 >= 0 && var22.field4136 < class161.field2394.length) {
                        class45 var23 = class161.field2394[var22.field4136];
                        if (var23 != null) {
                            int var24 = var23.field4507 / 32 - (class235.field3602.field4507 / 32);
                            int var25 = var23.field4496 / 32 - class235.field3602.field4496 / 32;
                            this.method931(arg7, var24, arg6, arg1, arg4, var22.field4135, var15, (byte) -49, arg0, arg5, var25, arg3, arg2, arg9, (class254) null);
                        }
                    }
                    if (var22.field4132 == 2) {
                        int var26 = (var22.field4139 - class302.field4735) * 4 + 2 - (class235.field3602.field4507 / 32);
                        int var27 = (var22.field4140 - class110.field1744) * 4 + 2 - (class235.field3602.field4496 / 32);
                        this.method931(arg7, var26, arg6, arg1, arg4, var22.field4135, var15, (byte) -63, arg0, arg5, var27, arg3, arg2, arg9, (class254) null);
                    }
                    if (var22.field4132 == 10 && var22.field4136 >= 0 && class319.field4964.length > var22.field4136) {
                        class121 var28 = class319.field4964[var22.field4136];
                        if (var28 != null) {
                            int var29 = var28.field4496 / 32 - (class235.field3602.field4496 / 32);
                            int var30 = var28.field4507 / 32 - class235.field3602.field4507 / 32;
                            this.method931(arg7, var30, arg6, arg1, arg4, var22.field4135, var15, (byte) -49, arg0, arg5, var29, arg3, arg2, arg9, (class254) null);
                        }
                    }
                }
            }
        }
        this.method2040(var15, -32768);
        this.method2039(true, arg0, var15);
        class1 var31 = null;
        if (!this.field1915 && this.field4526 != -1 && this.field4482 != -1) {
            class269 var32 = class99.method778(20951, this.field4526);
            var31 = var32.method1871((byte) 59, this.field4480, this.field4482, this.field4533);
            if (var31 != null) {
                var31.method32(0, -this.field4509, 0);
                if (var32.field4057) {
                    if (class265.field3960 != 0) {
                        var31.method4(class265.field3960);
                    }
                    if (class293.field4597 != 0) {
                        var31.method21(class293.field4597);
                    }
                    if (class324.field5048 != 0) {
                        var31.method32(0, class324.field5048, 0);
                    }
                }
            }
        }
        class1 var33 = null;
        if (!this.field1915 && this.field4451 != null) {
            if (this.field4454 <= class312.field4852) {
                this.field4451 = null;
            }
            if (class312.field4852 >= this.field4462 && this.field4454 > class312.field4852) {
                if (this.field4451 instanceof class30) {
                    var33 = (class1) ((class30) this.field4451).method213(16);
                } else {
                    var33 = (class1) this.field4451;
                }
                var33.method32(this.field4461 - this.field4507, this.field4465 - this.field4510, this.field4440 - this.field4496);
                if (this.field4497 == 512) {
                    var33.method14();
                } else if (this.field4497 == 1024) {
                    var33.method5();
                } else if (this.field4497 == 1536) {
                    var33.method9();
                }
            }
        }
        if (class36.field534) {
            var15.field1 = true;
            var15.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
            if (var31 != null) {
                var31.field1 = true;
                var31.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
            }
        } else {
            if (var31 != null) {
                var15 = ((class85) var15).method707(var31);
            }
            if (var33 != null) {
                var15 = ((class85) var15).method707(var33);
            }
            var15.field1 = true;
            var15.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
        }
        if (var33 == null) {
            return;
        }
        if (this.field4497 == 512) {
            var33.method9();
        } else if (this.field4497 == 1024) {
            var33.method5();
        } else if (this.field4497 == 1536) {
            var33.method14();
        }
        var33.method32(this.field4507 - this.field4461, -this.field4465 + this.field4510, this.field4496 - this.field4440);
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)I", line = 555)
    public final int method929(int arg0) {
        field1891++;
        if (arg0 != 12) {
            this.field1919 = 28;
        }
        return this.field1914 == null || this.field1914.field3559 == -1 ? super.method929(12) : class10.method78(this.field1914.field3559, 2).field2750;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V", line = 578)
    public static void method930(byte arg0) {
        field1888 = null;
        if (arg0 != 82) {
            field1888 = (class27[]) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIILaj;BIIIIIILt;)V", line = 593)
    private final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class1 arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class254 arg14) {
        int var16 = arg1 * arg1 + (arg10 * arg10);
        field1917++;
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg1, (double) arg10) * 325.949D) & 0x7FF;
        if (arg7 >= -44) {
            this.method1(-69, 1, -52, 72, 90, 77, 47, -29, -60L, 59, (class254) null);
        }
        class1 var18 = class37.method342(arg6, this.field4507, arg5, false, this.field4510, var17, this.field4496);
        if (var18 == null) {
            return;
        }
        if (!class36.field534) {
            var18.method1(0, arg3, arg12, arg11, arg4, arg9, arg2, arg0, -1L, arg13, arg14);
            return;
        }
        float var19 = class36.method329();
        float var20 = class36.method321();
        class36.method319();
        class36.method326(var19, var20 - 150.0F);
        var18.method1(0, arg3, arg12, arg11, arg4, arg9, arg2, arg0, -1L, arg13, arg14);
        class36.method305();
        class36.method326(var19, var20);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIIZ)V", line = 639)
    public final void method932(byte arg0, int arg1, int arg2, boolean arg3) {
        field1905++;
        if (arg0 != 72) {
            this.field1898 = -56;
        }
        super.method2028(-119, arg3, arg2, this.method929(12), arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)I", line = 662)
    public static final int method933(byte arg0, int arg1) {
        field1894++;
        if (arg0 <= 66) {
            field1916 = 10;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;)V", line = 674)
    public static final void method934(int arg0, String arg1) {
        field1909++;
        int var2 = 16 / ((73 - arg0) / 53);
        for (class190 var3 = (class190) class87.field1276.method986(false); var3 != null; var3 = (class190) class87.field1276.method982(14877)) {
            if (var3.field3021.equals(arg1)) {
                class154.field2332 = var3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Z", line = 703)
    public final boolean method409(int arg0) {
        field1904++;
        if (this.field1914 == null) {
            return false;
        } else {
            if (arg0 != 1) {
                this.field1907 = -21;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZIFII)[[I", line = 733)
    public static final int[][] method935(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6, int arg7, int arg8) {
        field1908++;
        class295 var9 = new class295();
        int[][] var10 = new int[arg1][arg8];
        var9.field4644 = arg5;
        var9.field4630 = arg4;
        var9.field4645 = arg0;
        var9.field4636 = (int) (arg6 * 4096.0F);
        var9.field4643 = arg3;
        var9.method465(71);
        class153.method1126(arg1, arg8, -116);
        if (arg7 > -91) {
            return (int[][]) ((int[][]) null);
        } else {
            for (int var11 = 0; var11 < arg1; var11++) {
                var9.method2081(var10[var11], var11, -30427);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)I", line = 767)
    public final int method413(int arg0) {
        if (arg0 != -1) {
            this.method16(121, -54, 44, 55, 110);
        }
        field1906++;
        return this.field4478;
    }
}
