import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class class228 implements class603 {

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
    private boolean field3323 = false;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lte;")
    public class527 field3325;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Z")
    private boolean field3334;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lh;")
    public static class572 field3327;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lh;")
    public static class572 field3337;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3338;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Z")
    public static boolean field3340;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "[F")
    public static float[] field3341;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Ltq;")
    public static class537 field3339;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    private final void method1457(int arg0, int arg1) {
        this.field3325.field7758 -= arg0;
        field3316++;
        this.field3325.field7758 += this.method1468((byte) 106);
        if (arg1 > -25) {
            this.field3325 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLfaa;)V")
    public static final void method1458(byte arg0, class136 arg1) {
        field3335++;
        arg1.field1856 = 0;
        if (arg1.field1898 != -1) {
            class78 var2 = class463.field6521.method2983(arg1.field1898, -112);
            if (var2 == null || var2.field1035 == null) {
                arg1.field1898 = -1;
                arg1.field1921 = false;
            } else {
                label401: {
                    arg1.field1900++;
                    if (arg1.field1876 < var2.field1035.length && arg1.field1900 > var2.field1049[arg1.field1876]) {
                        arg1.field1900 = 1;
                        arg1.field1876++;
                        arg1.field1914++;
                        class163.method1179(-1721201176, arg1.field8496, var2, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1876);
                    }
                    if (arg1.field1876 >= var2.field1035.length) {
                        arg1.field1876 = 0;
                        arg1.field1900 = 0;
                        if (arg1.field1921) {
                            arg1.field1898 = arg1.method947(false).method1451(true);
                            if (arg1.field1898 == -1) {
                                arg1.field1921 = false;
                                break label401;
                            }
                            var2 = class463.field6521.method2983(arg1.field1898, -126);
                        }
                        class163.method1179(-1721201176, arg1.field8496, var2, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1876);
                    }
                    arg1.field1914 = arg1.field1876 + 1;
                    if (var2.field1035.length <= arg1.field1914) {
                        arg1.field1914 = 0;
                    }
                }
            }
        }
        if (arg1.field1912 != -1 && class617.field9123 >= arg1.field1890) {
            class389 var3 = class59.field742.method863(arg1.field1912, (byte) -127);
            int var4 = var3.field5357;
            if (var4 == -1) {
                arg1.field1912 = -1;
            } else {
                label403: {
                    class78 var5 = class463.field6521.method2983(var4, -125);
                    if (var3.field5352) {
                        if (var5.field1059 == 3) {
                            if (arg1.field1947 > 0 && class617.field9123 >= arg1.field1874 && class617.field9123 > arg1.field1857) {
                                arg1.field1912 = -1;
                                break label403;
                            }
                        } else if (var5.field1059 == 1 && arg1.field1947 > 0 && arg1.field1874 <= class617.field9123 && arg1.field1857 < class617.field9123) {
                            arg1.field1890 = class617.field9123 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field1035 == null) {
                        arg1.field1912 = -1;
                    } else {
                        if (arg1.field1863 < 0) {
                            arg1.field1863 = 0;
                            class163.method1179(-1721201176, arg1.field8496, var5, class541.field8119 == arg1, arg1.field8501, arg1.field8500, 0);
                        }
                        arg1.field1861++;
                        if (var5.field1035.length > arg1.field1863 && arg1.field1861 > var5.field1049[arg1.field1863]) {
                            arg1.field1861 = 1;
                            arg1.field1863++;
                            class163.method1179(-1721201176, arg1.field8496, var5, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1863);
                        }
                        if (var5.field1035.length <= arg1.field1863) {
                            if (var3.field5352) {
                                arg1.field1863 -= var5.field1046;
                                arg1.field1909++;
                                if (var5.field1053 <= arg1.field1909) {
                                    arg1.field1912 = -1;
                                } else if (arg1.field1863 >= 0 && arg1.field1863 < var5.field1035.length) {
                                    class163.method1179(-1721201176, arg1.field8496, var5, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1863);
                                } else {
                                    arg1.field1912 = -1;
                                }
                            } else {
                                arg1.field1912 = -1;
                            }
                        }
                        arg1.field1854 = arg1.field1863 + 1;
                        if (var5.field1035.length <= arg1.field1854) {
                            if (var3.field5352) {
                                arg1.field1854 -= var5.field1046;
                                if (var5.field1053 <= (arg1.field1909 + 1)) {
                                    arg1.field1854 = -1;
                                } else if (arg1.field1854 < 0 || var5.field1035.length <= arg1.field1854) {
                                    arg1.field1854 = -1;
                                }
                            } else {
                                arg1.field1854 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1935 != -1 && class617.field9123 >= arg1.field1929) {
            class389 var6 = class59.field742.method863(arg1.field1935, (byte) -120);
            int var7 = var6.field5357;
            if (var7 == -1) {
                arg1.field1935 = -1;
            } else {
                label406: {
                    class78 var8 = class463.field6521.method2983(var7, -112);
                    if (var6.field5352) {
                        if (var8.field1059 == 3) {
                            if (arg1.field1947 > 0 && arg1.field1874 <= class617.field9123 && arg1.field1857 < class617.field9123) {
                                arg1.field1935 = -1;
                                break label406;
                            }
                        } else if (var8.field1059 == 1 && arg1.field1947 > 0 && arg1.field1874 <= class617.field9123 && class617.field9123 > arg1.field1857) {
                            arg1.field1929 = class617.field9123 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field1035 == null) {
                        arg1.field1935 = -1;
                    } else {
                        if (arg1.field1877 < 0) {
                            arg1.field1877 = 0;
                            class163.method1179(-1721201176, arg1.field8496, var8, class541.field8119 == arg1, arg1.field8501, arg1.field8500, 0);
                        }
                        arg1.field1860++;
                        if (var8.field1035.length > arg1.field1877 && var8.field1049[arg1.field1877] < arg1.field1860) {
                            arg1.field1877++;
                            arg1.field1860 = 1;
                            class163.method1179(-1721201176, arg1.field8496, var8, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1877);
                        }
                        if (var8.field1035.length <= arg1.field1877) {
                            if (var6.field5352) {
                                arg1.field1891++;
                                arg1.field1877 -= var8.field1046;
                                if (arg1.field1891 >= var8.field1053) {
                                    arg1.field1935 = -1;
                                } else if (arg1.field1877 >= 0 && arg1.field1877 < var8.field1035.length) {
                                    class163.method1179(-1721201176, arg1.field8496, var8, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1877);
                                } else {
                                    arg1.field1935 = -1;
                                }
                            } else {
                                arg1.field1935 = -1;
                            }
                        }
                        arg1.field1903 = arg1.field1877 + 1;
                        if (arg1.field1903 >= var8.field1035.length) {
                            if (var6.field5352) {
                                arg1.field1903 -= var8.field1046;
                                if (var8.field1053 <= arg1.field1891 + 1) {
                                    arg1.field1903 = -1;
                                } else if (arg1.field1903 < 0 || arg1.field1903 >= var8.field1035.length) {
                                    arg1.field1903 = -1;
                                }
                            } else {
                                arg1.field1903 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1872 != -1 && arg1.field1882 <= 1) {
            class78 var9 = class463.field6521.method2983(arg1.field1872, -114);
            if (var9.field1059 == 3) {
                if (arg1.field1947 > 0 && arg1.field1874 <= class617.field9123 && class617.field9123 > arg1.field1857) {
                    arg1.field1872 = -1;
                }
            } else if (var9.field1059 == 1 && arg1.field1947 > 0 && class617.field9123 >= arg1.field1874 && class617.field9123 > arg1.field1857) {
                arg1.field1882 = 2;
            }
        }
        if (arg1.field1872 != -1 && arg1.field1882 == 0) {
            class78 var10 = class463.field6521.method2983(arg1.field1872, -114);
            if (var10 == null || var10.field1035 == null) {
                arg1.field1872 = -1;
            } else {
                arg1.field1926++;
                if (var10.field1035.length > arg1.field1858 && var10.field1049[arg1.field1858] < arg1.field1926) {
                    arg1.field1858++;
                    arg1.field1926 = 1;
                    class163.method1179(-1721201176, arg1.field8496, var10, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1858);
                }
                if (arg1.field1858 >= var10.field1035.length) {
                    arg1.field1938++;
                    arg1.field1858 -= var10.field1046;
                    if (arg1.field1938 >= var10.field1053) {
                        arg1.field1872 = -1;
                    } else if (arg1.field1858 >= 0 && arg1.field1858 < var10.field1035.length) {
                        class163.method1179(-1721201176, arg1.field8496, var10, class541.field8119 == arg1, arg1.field8501, arg1.field8500, arg1.field1858);
                    } else {
                        arg1.field1872 = -1;
                    }
                }
                arg1.field1939 = arg1.field1858 + 1;
                if (arg1.field1939 >= var10.field1035.length) {
                    arg1.field1939 -= var10.field1046;
                    if (var10.field1053 <= (arg1.field1938 + 1)) {
                        arg1.field1939 = -1;
                    } else if (arg1.field1939 < 0 || arg1.field1939 >= var10.field1035.length) {
                        arg1.field1939 = -1;
                    }
                }
                arg1.field1856 = var10.field1037;
            }
        }
        if (arg1.field1882 > 0) {
            arg1.field1882--;
        }
        if (arg0 >= -115) {
            return;
        }
        for (int var11 = 0; var11 < arg1.field1917.length; var11++) {
            class46 var12 = arg1.field1917[var11];
            if (var12 != null) {
                if (var12.field550 > 0) {
                    var12.field550--;
                } else {
                    class78 var13 = class463.field6521.method2983(var12.field554, -106);
                    if (var13 == null || var13.field1035 == null) {
                        arg1.field1917[var11] = null;
                    } else {
                        var12.field558++;
                        if (var13.field1035.length > var12.field551 && var12.field558 > var13.field1049[var12.field551]) {
                            var12.field551++;
                            var12.field558 = 1;
                            class163.method1179(-1721201176, arg1.field8496, var13, class541.field8119 == arg1, arg1.field8501, arg1.field8500, var12.field551);
                        }
                        if (var12.field551 >= var13.field1035.length) {
                            var12.field551 -= var13.field1046;
                            var12.field552++;
                            if (var12.field552 >= var13.field1053) {
                                arg1.field1917[var11] = null;
                            } else if (var12.field551 >= 0 && var13.field1035.length > var12.field551) {
                                class163.method1179(-1721201176, arg1.field8496, var13, class541.field8119 == arg1, arg1.field8501, arg1.field8500, var12.field551);
                            } else {
                                arg1.field1917[var11] = null;
                            }
                        }
                        var12.field547 = var12.field551 + 1;
                        if (var13.field1035.length <= var12.field547) {
                            var12.field547 -= var13.field1046;
                            if (var13.field1053 <= (var12.field552 + 1)) {
                                var12.field547 = -1;
                            } else if (var12.field547 < 0 || var13.field1035.length <= var12.field547) {
                                var12.field547 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1459(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class213.field3139++;
        class303.field4179 = 0;
        for (int var6 = class606.field9004; var6 < class348.field4772; var6++) {
            class205[][] var17 = class420.field5697[var6];
            for (int var18 = class583.field8555; var18 < class162.field2557; var18++) {
                for (int var19 = class334.field4628; var19 < class140.field1987; var19++) {
                    class205 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class222.field3230[var18 + class504.field7141 - class297.field4092][var19 + class504.field7141 - class18.field169] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3028 = true;
                            var20.field3032 = true;
                            if (var20.field3029 == null) {
                                var20.field3034 = false;
                            } else {
                                var20.field3034 = true;
                            }
                            class303.field4179++;
                        } else {
                            var20.field3028 = false;
                            var20.field3032 = false;
                            var20.field3039 = 0;
                            if (var18 >= class297.field4092 - 16 && var18 <= class297.field4092 + 16 && var19 >= class18.field169 - 16 && var19 <= class18.field169 + 16 && (var20.field3047 != null || var20.field3037 != null || var20.field3040 != null || var20.field3050 != null || var20.field3045 != null || var20.field3029 != null)) {
                                class451.field6356.method928(var20, -8186);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class165.field2609 == class114.field1609;
        for (int var8 = class606.field9004; var8 < class348.field4772; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class193.field2864.method499() && var8 >= arg2 && arg1 != null) {
                int var10 = class222.field3230.length;
                if (class222.field3230.length + class583.field8555 > class145.field2083) {
                    var10 -= class222.field3230.length + class583.field8555 - class145.field2083;
                }
                int var11 = class222.field3230[0].length;
                if (class222.field3230[0].length + class334.field4628 > class384.field5282) {
                    var11 -= class222.field3230[0].length + class334.field4628 - class384.field5282;
                }
                int var12 = class477.field6774;
                while (true) {
                    if (var12 >= var10) {
                        class451.field6356.method935(var8, var9, class165.field2609[var8], true, 17246);
                        break;
                    }
                    int var13 = class583.field8555 + var12 - class477.field6774;
                    for (int var14 = class365.field5035; var14 < var11; var14++) {
                        class25.field245[var12][var14] = false;
                        if (class222.field3230[var12][var14]) {
                            int var15 = class334.field4628 + var14 - class365.field5035;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class420.field5697[var16][var13][var15] != null && class420.field5697[var16][var13][var15].field3036 == var8) {
                                    class25.field245[var12][var14] = class420.field5697[var16][var13][var15].field3028;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class451.field6356.method935(var8, var9, class165.field2609[var8], false, 17246);
            }
            class451.field6356.method938(5126);
        }
        if (!class304.method1864(true)) {
            class304.method1864(false);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
    public final void method1460(boolean arg0, int arg1) {
        field3329++;
        if (arg1 != -5286) {
            field3341 = null;
        }
        if (arg0 != this.field3323) {
            this.field3323 = arg0;
            this.method1465((byte) -59);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Z")
    public final boolean method1461(int arg0) {
        field3326++;
        if (!this.field3325.field7856) {
            if (arg0 != 0) {
                this.method1457(22, -41);
            }
            return false;
        }
        int var2 = this.method1468((byte) 119);
        this.field3325.method3152(arg0 - 2, this);
        OpenGL.glGenerateMipmapEXT(this.field3333);
        this.field3334 = true;
        this.method1465((byte) -59);
        this.method1457(var2, -89);
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public final void method1462(byte arg0) {
        field3336++;
        if (this.field3322 > 0) {
            this.field3325.method3144(this.field3322, (byte) -51, this.method1468((byte) 19));
            this.field3322 = 0;
        }
        int var2 = 22 / ((arg0 - 21) / 63);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3) {
        field3324++;
        if (arg2 == 0) {
            class402.method2367(class63.field792, (byte) 90);
            class629.field9245++;
        }
        if (arg2 == 1) {
            class330.field4552++;
            class402.method2367(class316.field4351, (byte) 91);
        }
        class112.field1589.method1012(976668456, arg1 + class38.field463);
        class112.field1589.method1027(255, class473.field6687 + arg0);
        class112.field1589.method1054(class24.field237.method1788(16, 82) ? 1 : 0, true);
        class618.field9137 = arg0;
        if (arg3 == -20328) {
            class5.field45 = false;
            class349.field4776 = arg1;
            class169.method1204(-106);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public static void method1464(int arg0) {
        field3327 = null;
        field3341 = null;
        field3338 = null;
        field3339 = null;
        int var1 = -32 % ((1 - arg0) / 55);
        field3337 = null;
    }

    @OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1462((byte) 126);
        field3318++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    private final void method1465(byte arg0) {
        field3320++;
        this.field3325.method3152(-2, this);
        if (arg0 != -59) {
            field3340 = true;
        }
        if (this.field3323) {
            OpenGL.glTexParameteri(this.field3333, 10241, this.field3334 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3333, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3333, 10241, this.field3334 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3333, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public static final void method1466(int arg0) {
        field3321++;
        int var1 = 0;
        if (arg0 != 24916) {
            field3341 = null;
        }
        for (int var2 = 0; var2 < class146.field2125; var2++) {
            for (int var3 = 0; var3 < class410.field5609; var3++) {
                if (class177.method1248(false, var1, class420.field5697, true, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V")
    public final void method1467(byte arg0, boolean arg1) {
        if (arg0 != 97) {
            return;
        }
        field3317++;
        if (this.field3334 != arg1) {
            int var3 = this.method1468((byte) -47);
            this.field3334 = true;
            this.method1465((byte) -59);
            this.method1457(var3, -52);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I")
    private final int method1468(byte arg0) {
        int var2 = 28 % ((55 - arg0) / 36);
        field3331++;
        int var3 = this.field3325.method3161(this.field3319, 0) * this.field3332;
        return this.field3334 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        field3328++;
        if (class3.field25 <= arg3 && class100.field1452 >= arg3) {
            int var5 = class36.method223(class130.field1801, (byte) 50, arg2, class14.field136);
            int var6 = class36.method223(class130.field1801, (byte) 50, arg0, class14.field136);
            class93.method735(true, var6, var5, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)I")
    public final int method1470(byte arg0) {
        field3330++;
        return arg0 == 25 ? this.field3322 : -71;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lte;IIIZ)V")
    public class228(class527 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3325 = arg0;
        this.field3319 = arg2;
        this.field3332 = arg3;
        this.field3333 = arg1;
        this.field3334 = arg4;
        OpenGL.glGenTextures(1, class58.field737, 0);
        this.field3322 = class58.field737[0];
        this.method1457(0, -75);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public abstract void method642(int arg0);

    static {
        new class572("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3327 = new class572("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
        field3337 = new class572("M", "M", "M", "M");
        field3338 = new String[8];
        new class572("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3340 = false;
        field3341 = new float[4];
    }
}
