import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class405 extends class431 {

    @OriginalMember(owner = "client!im", name = "w", descriptor = "[[I")
    public static int[][] field6006 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Luq;")
    public class114 field5996;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "Luq;")
    public class114 field6004;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Ljava/lang/String;")
    public String field5997;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Z")
    public boolean field5998;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field6008;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLkk;)V", line = 3)
    public static final void method2527(byte arg0, class129 arg1) {
        field6005++;
        arg1.field1953 = false;
        if (arg1.field1925 != -1) {
            class189 var2 = class242.field3846.method2238(arg1.field1925, (byte) 78);
            if (var2 == null || var2.field3181 == null) {
                arg1.field1925 = -1;
                arg1.field1926 = false;
            } else {
                label404: {
                    arg1.field1920++;
                    if (var2.field3181.length > arg1.field1921 && arg1.field1920 > var2.field3204[arg1.field1921]) {
                        arg1.field1920 = 1;
                        arg1.field1921++;
                        arg1.field1966++;
                        class501.method2969(var2, arg1.field5837, class398.field5947 == arg1, arg1.field1921, -89, arg1.field5826, arg1.field5833);
                    }
                    if (var2.field3181.length <= arg1.field1921) {
                        arg1.field1920 = 0;
                        arg1.field1921 = 0;
                        if (arg1.field1926) {
                            arg1.field1925 = arg1.method948(false).method2362(false);
                            if (arg1.field1925 == -1) {
                                arg1.field1926 = false;
                                break label404;
                            }
                            var2 = class242.field3846.method2238(arg1.field1925, (byte) 78);
                        }
                        class501.method2969(var2, arg1.field5837, class398.field5947 == arg1, arg1.field1921, -70, arg1.field5826, arg1.field5833);
                    }
                    arg1.field1966 = arg1.field1921 + 1;
                    if (var2.field3181.length <= arg1.field1966) {
                        arg1.field1966 = 0;
                    }
                }
            }
        }
        if (arg1.field1904 != -1 && arg1.field1897 <= class475.field6854) {
            class316 var3 = class123.field1839.method1490(arg1.field1904, true);
            int var4 = var3.field4775;
            if (var4 == -1) {
                arg1.field1904 = -1;
            } else {
                label406: {
                    class189 var5 = class242.field3846.method2238(var4, (byte) 78);
                    if (var3.field4771) {
                        if (var5.field3187 == 3) {
                            if (arg1.field1983 > 0 && class475.field6854 >= arg1.field1940 && arg1.field1893 < class475.field6854) {
                                arg1.field1904 = -1;
                                break label406;
                            }
                        } else if (var5.field3187 == 1 && arg1.field1983 > 0 && arg1.field1940 <= class475.field6854 && class475.field6854 > arg1.field1893) {
                            arg1.field1897 = class475.field6854 + 1;
                            break label406;
                        }
                    }
                    if (var5 == null || var5.field3181 == null) {
                        arg1.field1904 = -1;
                    } else {
                        if (arg1.field1950 < 0) {
                            arg1.field1950 = 0;
                            class501.method2969(var5, arg1.field5837, class398.field5947 == arg1, 0, -74, arg1.field5826, arg1.field5833);
                        }
                        arg1.field1895++;
                        if (arg1.field1950 < var5.field3181.length && arg1.field1895 > var5.field3204[arg1.field1950]) {
                            arg1.field1895 = 1;
                            arg1.field1950++;
                            class501.method2969(var5, arg1.field5837, class398.field5947 == arg1, arg1.field1950, -97, arg1.field5826, arg1.field5833);
                        }
                        if (arg1.field1950 >= var5.field3181.length) {
                            if (var3.field4771) {
                                arg1.field1936++;
                                arg1.field1950 -= var5.field3202;
                                if (arg1.field1936 >= var5.field3183) {
                                    arg1.field1904 = -1;
                                } else if (arg1.field1950 >= 0 && var5.field3181.length > arg1.field1950) {
                                    class501.method2969(var5, arg1.field5837, class398.field5947 == arg1, arg1.field1950, -111, arg1.field5826, arg1.field5833);
                                } else {
                                    arg1.field1904 = -1;
                                }
                            } else {
                                arg1.field1904 = -1;
                            }
                        }
                        arg1.field1961 = arg1.field1950 + 1;
                        if (var5.field3181.length <= arg1.field1961) {
                            if (var3.field4771) {
                                arg1.field1961 -= var5.field3202;
                                if ((arg1.field1936 + 1) >= var5.field3183) {
                                    arg1.field1961 = -1;
                                } else if (arg1.field1961 < 0 || var5.field3181.length <= arg1.field1961) {
                                    arg1.field1961 = -1;
                                }
                            } else {
                                arg1.field1961 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1962 != -1 && arg1.field1931 <= class475.field6854) {
            class316 var6 = class123.field1839.method1490(arg1.field1962, true);
            int var7 = var6.field4775;
            if (var7 == -1) {
                arg1.field1962 = -1;
            } else {
                label409: {
                    class189 var8 = class242.field3846.method2238(var7, (byte) 78);
                    if (var6.field4771) {
                        if (var8.field3187 == 3) {
                            if (arg1.field1983 > 0 && arg1.field1940 <= class475.field6854 && class475.field6854 > arg1.field1893) {
                                arg1.field1962 = -1;
                                break label409;
                            }
                        } else if (var8.field3187 == 1 && arg1.field1983 > 0 && class475.field6854 >= arg1.field1940 && arg1.field1893 < class475.field6854) {
                            arg1.field1931 = class475.field6854 + 1;
                            break label409;
                        }
                    }
                    if (var8 == null || var8.field3181 == null) {
                        arg1.field1962 = -1;
                    } else {
                        if (arg1.field1967 < 0) {
                            arg1.field1967 = 0;
                            class501.method2969(var8, arg1.field5837, class398.field5947 == arg1, 0, -122, arg1.field5826, arg1.field5833);
                        }
                        arg1.field1896++;
                        if (var8.field3181.length > arg1.field1967 && arg1.field1896 > var8.field3204[arg1.field1967]) {
                            arg1.field1967++;
                            arg1.field1896 = 1;
                            class501.method2969(var8, arg1.field5837, class398.field5947 == arg1, arg1.field1967, -88, arg1.field5826, arg1.field5833);
                        }
                        if (arg1.field1967 >= var8.field3181.length) {
                            if (var6.field4771) {
                                arg1.field1957++;
                                arg1.field1967 -= var8.field3202;
                                if (var8.field3183 <= arg1.field1957) {
                                    arg1.field1962 = -1;
                                } else if (arg1.field1967 >= 0 && var8.field3181.length > arg1.field1967) {
                                    class501.method2969(var8, arg1.field5837, class398.field5947 == arg1, arg1.field1967, -77, arg1.field5826, arg1.field5833);
                                } else {
                                    arg1.field1962 = -1;
                                }
                            } else {
                                arg1.field1962 = -1;
                            }
                        }
                        arg1.field1946 = arg1.field1967 + 1;
                        if (var8.field3181.length <= arg1.field1946) {
                            if (var6.field4771) {
                                arg1.field1946 -= var8.field3202;
                                if (var8.field3183 <= arg1.field1957 + 1) {
                                    arg1.field1946 = -1;
                                } else if (arg1.field1946 < 0 || var8.field3181.length <= arg1.field1946) {
                                    arg1.field1946 = -1;
                                }
                            } else {
                                arg1.field1946 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1959 != -1 && arg1.field1907 <= 1) {
            class189 var9 = class242.field3846.method2238(arg1.field1959, (byte) 78);
            if (var9.field3187 == 3) {
                if (arg1.field1983 > 0 && arg1.field1940 <= class475.field6854 && class475.field6854 > arg1.field1893) {
                    arg1.field1959 = -1;
                }
            } else if (var9.field3187 == 1 && arg1.field1983 > 0 && class475.field6854 >= arg1.field1940 && class475.field6854 > arg1.field1893) {
                arg1.field1907 = 2;
            }
        }
        if (arg1.field1959 != -1 && arg1.field1907 == 0) {
            class189 var10 = class242.field3846.method2238(arg1.field1959, (byte) 78);
            if (var10 == null || var10.field3181 == null) {
                arg1.field1959 = -1;
            } else {
                arg1.field1903++;
                if (var10.field3181.length > arg1.field1939 && var10.field3204[arg1.field1939] < arg1.field1903) {
                    arg1.field1939++;
                    arg1.field1903 = 1;
                    class501.method2969(var10, arg1.field5837, class398.field5947 == arg1, arg1.field1939, -62, arg1.field5826, arg1.field5833);
                }
                if (arg1.field1939 >= var10.field3181.length) {
                    arg1.field1943++;
                    arg1.field1939 -= var10.field3202;
                    if (var10.field3183 <= arg1.field1943) {
                        arg1.field1959 = -1;
                    } else if (arg1.field1939 >= 0 && var10.field3181.length > arg1.field1939) {
                        class501.method2969(var10, arg1.field5837, class398.field5947 == arg1, arg1.field1939, -97, arg1.field5826, arg1.field5833);
                    } else {
                        arg1.field1959 = -1;
                    }
                }
                arg1.field1899 = arg1.field1939 + 1;
                if (arg1.field1899 >= var10.field3181.length) {
                    arg1.field1899 -= var10.field3202;
                    if ((arg1.field1943 + 1) >= var10.field3183) {
                        arg1.field1899 = -1;
                    } else if (arg1.field1899 < 0 || arg1.field1899 >= var10.field3181.length) {
                        arg1.field1899 = -1;
                    }
                }
                arg1.field1953 = var10.field3188;
            }
        }
        if (arg1.field1907 > 0) {
            arg1.field1907--;
        }
        if (arg0 > -26) {
            return;
        }
        for (int var11 = 0; var11 < arg1.field1964.length; var11++) {
            class121 var12 = arg1.field1964[var11];
            if (var12 != null) {
                if (var12.field1820 > 0) {
                    var12.field1820--;
                } else {
                    class189 var13 = class242.field3846.method2238(var12.field1815, (byte) 78);
                    if (var13 == null || var13.field3181 == null) {
                        arg1.field1964[var11] = null;
                    } else {
                        var12.field1822++;
                        if (var13.field3181.length > var12.field1823 && var13.field3204[var12.field1823] < var12.field1822) {
                            var12.field1823++;
                            var12.field1822 = 1;
                            class501.method2969(var13, arg1.field5837, class398.field5947 == arg1, var12.field1823, -70, arg1.field5826, arg1.field5833);
                        }
                        if (var13.field3181.length <= var12.field1823) {
                            var12.field1823 -= var13.field3202;
                            var12.field1817++;
                            if (var12.field1817 >= var13.field3183) {
                                arg1.field1964[var11] = null;
                            } else if (var12.field1823 >= 0 && var13.field3181.length > var12.field1823) {
                                class501.method2969(var13, arg1.field5837, class398.field5947 == arg1, var12.field1823, -119, arg1.field5826, arg1.field5833);
                            } else {
                                arg1.field1964[var11] = null;
                            }
                        }
                        var12.field1816 = var12.field1823 + 1;
                        if (var12.field1816 >= var13.field3181.length) {
                            var12.field1816 -= var13.field3202;
                            if (var13.field3183 <= var12.field1817 + 1) {
                                var12.field1816 = -1;
                            } else if (var12.field1816 < 0 || var12.field1816 >= var13.field3181.length) {
                                var12.field1816 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZI)Z", line = 424)
    public static final boolean method2528(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2528(-81, true, -20);
        }
        field5995++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lya;)V", line = 438)
    public static final void method2529(class38 arg0) {
        for (int var1 = class475.field6862; var1 < class213.field3467; var1++) {
            for (int var2 = 0; var2 < class497.field7147; var2++) {
                for (int var3 = 0; var3 < class385.field5799; var3++) {
                    class138 var4 = client.field3311[var1][var2][var3];
                    if (var4 != null) {
                        class312 var5 = var4.field2114;
                        class312 var6 = var4.field2104;
                        if (var5 != null && var5.method17(13651334)) {
                            class78.method675(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method17(13651334)) {
                                class78.method675(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method23(3, 0, arg0, 0, var5, 0, false);
                                var6.method21(false);
                            }
                            var5.method21(false);
                        }
                        for (class327 var7 = var4.field2118; var7 != null; var7 = var7.field4922) {
                            class389 var9 = var7.field4921;
                            if (var9 != null && var9.method17(13651334)) {
                                class78.method675(arg0, var9, var1, var2, var3, var9.field5827 + 1 - var9.field5836, var9.field5829 - var9.field5830 + 1);
                                var9.method21(false);
                            }
                        }
                        class171 var8 = var4.field2105;
                        if (var8 != null && var8.method17(13651334)) {
                            class120.method899(arg0, var8, var1, var2, var3);
                            var8.method21(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 520)
    public static final void method2530() {
        class305.field4596 = 0;
        label212: for (int var0 = 0; var0 < class233.field3756; var0++) {
            class74 var1 = class506.field7399[var0];
            if (class348.field5146 != null) {
                for (int var2 = 0; var2 < class348.field5146.length; var2++) {
                    if (class348.field5146[var2] != -1000000 && (var1.field1060 <= class348.field5146[var2] || var1.field1062 <= class348.field5146[var2]) && (var1.field1051 <= class454.field6607[var2] || var1.field1053 <= class454.field6607[var2]) && (var1.field1051 >= class329.field4945[var2] || var1.field1053 >= class329.field4945[var2]) && (var1.field1055 <= class271.field4153[var2] || var1.field1065 <= class271.field4153[var2]) && (var1.field1055 >= class280.field4250[var2] || var1.field1065 >= class280.field4250[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field1058 == 1) {
                int var3 = var1.field1048 + class46.field602 - class395.field5900;
                if (var3 >= 0 && var3 <= class46.field602 + class46.field602) {
                    int var4 = var1.field1063 + class46.field602 - class284.field4314;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class46.field602 + class46.field602) {
                        continue;
                    }
                    int var5 = var1.field1057 + class46.field602 - class284.field4314;
                    if (var5 > class46.field602 + class46.field602) {
                        var5 = class46.field602 + class46.field602;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class265.field4070[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class62.field761 - var1.field1051;
                        if (var7 > class87.field1244) {
                            var1.field1067 = 1;
                        } else {
                            if (var7 >= -class87.field1244) {
                                continue;
                            }
                            var1.field1067 = 2;
                            var7 = -var7;
                        }
                        var1.field1047 = (var1.field1055 - class529.field7735 << 8) / var7;
                        var1.field1054 = (var1.field1065 - class529.field7735 << 8) / var7;
                        var1.field1056 = (var1.field1060 - class490.field7046 << 8) / var7;
                        var1.field1066 = (var1.field1062 - class490.field7046 << 8) / var7;
                        class517.field7512[class305.field4596++] = var1;
                    }
                }
            } else if (var1.field1058 == 2) {
                int var8 = var1.field1063 + class46.field602 - class284.field4314;
                if (var8 >= 0 && var8 <= class46.field602 + class46.field602) {
                    int var9 = var1.field1048 + class46.field602 - class395.field5900;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class46.field602 + class46.field602) {
                        continue;
                    }
                    int var10 = var1.field1069 + class46.field602 - class395.field5900;
                    if (var10 > class46.field602 + class46.field602) {
                        var10 = class46.field602 + class46.field602;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class265.field4070[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class529.field7735 - var1.field1055;
                        if (var12 > class87.field1244) {
                            var1.field1067 = 3;
                        } else {
                            if (var12 >= -class87.field1244) {
                                continue;
                            }
                            var1.field1067 = 4;
                            var12 = -var12;
                        }
                        var1.field1059 = (var1.field1051 - class62.field761 << 8) / var12;
                        var1.field1046 = (var1.field1053 - class62.field761 << 8) / var12;
                        var1.field1056 = (var1.field1060 - class490.field7046 << 8) / var12;
                        var1.field1066 = (var1.field1062 - class490.field7046 << 8) / var12;
                        class517.field7512[class305.field4596++] = var1;
                    }
                }
            } else if (var1.field1058 == 4) {
                int var13 = var1.field1060 - class490.field7046;
                if (var13 > class335.field4993) {
                    int var14 = var1.field1063 + class46.field602 - class284.field4314;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class46.field602 + class46.field602) {
                        continue;
                    }
                    int var15 = var1.field1057 + class46.field602 - class284.field4314;
                    if (var15 > class46.field602 + class46.field602) {
                        var15 = class46.field602 + class46.field602;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field1048 + class46.field602 - class395.field5900;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class46.field602 + class46.field602) {
                        continue;
                    }
                    int var17 = var1.field1069 + class46.field602 - class395.field5900;
                    if (var17 > class46.field602 + class46.field602) {
                        var17 = class46.field602 + class46.field602;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class265.field4070[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field1067 = 5;
                        var1.field1059 = (var1.field1051 - class62.field761 << 8) / var13;
                        var1.field1046 = (var1.field1053 - class62.field761 << 8) / var13;
                        var1.field1047 = (var1.field1055 - class529.field7735 << 8) / var13;
                        var1.field1054 = (var1.field1065 - class529.field7735 << 8) / var13;
                        class517.field7512[class305.field4596++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 777)
    public static final void method2531(int arg0) {
        field6001++;
        if (arg0 != 31555) {
            method2528(23, true, -91);
        }
        if (class440.field6454) {
            return;
        }
        class471.field6814 = true;
        class440.field6454 = true;
        if (class193.field3258.field7239) {
            class181.field2711 = ((int) class181.field2711 - 17 & 0xFFFFFFF0);
        } else {
            class52.field654 += (-class52.field654 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(I)V", line = 805)
    public static void method2532(int arg0) {
        if (arg0 < 41) {
            method2531(-101);
        }
        field6006 = null;
    }
}
