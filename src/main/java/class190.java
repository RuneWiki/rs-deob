import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class190 {

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field3080 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Loe;")
    public static class9 field3082 = new class9(5000);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "F")
    public static float field3079;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lbm;")
    public static class307 field3089;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[[[I")
    public static int[][][] field3085;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 21)
    public static void method1213(byte arg0) {
        field3082 = null;
        field3085 = (int[][][]) null;
        field3089 = null;
        if (arg0 >= -123) {
            method1218(15, (class109) null);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V", line = 40)
    public static final void method1214(int arg0, byte arg1) {
        field3078++;
        class65.method502(class65.field1247, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class65.method494(-50.0F, -60.0F, -50.0F);
        if (arg1 != 113) {
            method1215(-91, 17, (String[]) null, (short[]) null, false);
        }
        class65.method501(class65.field1238, 0, false);
        class65.method495();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II[Ljava/lang/String;[SZ)V", line = 54)
    public static final void method1215(int arg0, int arg1, String[] arg2, short[] arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        field3086++;
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        String var6 = arg2[var5];
        int var7 = arg0;
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var6;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var6 == null || arg2[var9] != null && arg2[var9].compareTo(var6) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var7];
                arg2[var7] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7++] = var11;
            }
        }
        arg2[arg1] = arg2[var7];
        arg2[var7] = var6;
        arg3[arg1] = arg3[var7];
        arg3[var7] = var8;
        method1215(arg0, var7 - 1, arg2, arg3, false);
        method1215(var7 + 1, arg1, arg2, arg3, false);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 107)
    public static final void method1216(byte arg0) {
        field3087++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 > -42) {
            method1214(88, (byte) 47);
        }
        while (var2 < 104) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class226.method1506((byte) -32, true, var1, var3, class326.field4975, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lve;III)V", line = 157)
    public static final void method1217(class278 arg0, int arg1, int arg2, int arg3) {
        if ((arg2 & 0x1) != 0) {
            arg0.field1942 = field3082.method1307((byte) 102);
            if (arg0.field1942.charAt(0) == '~') {
                arg0.field1942 = arg0.field1942.substring(1);
                class42.method321(arg0.field1942, 2, arg3 ^ 0x3F, arg0.method1871(-40));
            } else if (class66.field1265 == arg0) {
                class42.method321(arg0.field1942, 2, 1, arg0.method1871(-105));
            }
            arg0.field1890 = 150;
            arg0.field1913 = 0;
            arg0.field1880 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var4 = field3082.method1317((byte) -108);
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = field3082.method1304(-120);
                if (var9 == 65535) {
                    var9 = -1;
                }
                var5[var8] = var9;
                var6[var8] = field3082.method1302((byte) -52);
                var7[var8] = field3082.method1322((byte) 98);
            }
            class334.method2303(var5, var6, (byte) 92, arg0, var7);
        }
        field3084++;
        if ((arg2 & 0x4) != 0) {
            int var10 = field3082.method1296((byte) 91);
            int var11 = field3082.method1317((byte) -81);
            arg0.method702(class25.field494, var10, 0, var11);
            arg0.field1943 = class25.field494 + 300;
            arg0.field1934 = field3082.method1302((byte) -52);
        }
        if ((arg2 & 0x80) != 0) {
            arg0.field1900 = field3082.method1304(-112);
            arg0.field1887 = field3082.method1323(arg3 - 65);
        }
        if ((arg2 & 0x40) != 0) {
            int var12 = field3082.method1325((byte) -51);
            byte[] var13 = new byte[var12];
            class202 var14 = new class202(var13);
            field3082.method1312((byte) -122, var12, var13, 0);
            class51.field1026[arg1] = var14;
            arg0.method1874(true, var14);
        }
        if ((arg2 & 0x800) != 0) {
            int var15 = field3082.method1296((byte) 91);
            int var16 = field3082.method1317((byte) -115);
            arg0.method702(class25.field494, var15, arg3 - 62, var16);
        }
        if ((arg2 & 0x2) != 0) {
            arg0.field1878 = field3082.method1323(-3);
            if (arg0.field1878 == 65535) {
                arg0.field1878 = -1;
            }
        }
        if ((arg2 & 0x400) != 0) {
            arg0.field1915 = field3082.method1317((byte) -91);
            arg0.field1896 = field3082.method1302((byte) -52);
            arg0.field1888 = field3082.method1305(127);
            arg0.field1957 = field3082.method1325((byte) -51);
            arg0.field1924 = field3082.method1304(-124) + class25.field494;
            arg0.field1909 = field3082.method1322((byte) 98) + class25.field494;
            arg0.field1922 = field3082.method1317((byte) -87);
            arg0.field1877 = 1;
            arg0.field1925 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            int var17 = field3082.method1323(-3);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = field3082.method1325((byte) -51);
            class88.method617(arg0, var17, (byte) -101, var18);
        }
        if ((arg2 & 0x20) != 0) {
            int var19 = field3082.method1322((byte) 98);
            int var20 = field3082.method1302((byte) -52);
            int var21 = field3082.method1302((byte) -52);
            int var22 = field3082.field3249;
            boolean var23 = (var19 & 0x8000) != 0;
            if (arg0.field4269 != null && arg0.field4281 != null) {
                long var24 = class116.method767(arg3 - 189, arg0.field4269);
                boolean var26 = false;
                if (var20 <= 1) {
                    if (!var23 && (class294.field4494 && !class211.field3400 || class188.field3047)) {
                        var26 = true;
                    } else {
                        for (int var27 = 0; var27 < class77.field1538; var27++) {
                            if (class291.field4471[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var26 && class42.field814 == 0) {
                    class67.field1266.field3249 = 0;
                    field3082.method1350(0, arg3 ^ 0xFFFFFFA1, var21, class67.field1266.field3273);
                    class67.field1266.field3249 = 0;
                    int var28 = -1;
                    String var30;
                    if (var23) {
                        class228 var29 = client.method347(14, class67.field1266);
                        var28 = var29.field3596;
                        var30 = var29.field3609.method1541(class67.field1266, arg3 ^ 0x6E);
                        var19 &= 0x7FFF;
                    } else {
                        var30 = class312.method2119(class218.method1455(-106, class163.method1042(class67.field1266, 32767)));
                    }
                    arg0.field1942 = var30.trim();
                    arg0.field1880 = var19 >> 8;
                    arg0.field1913 = var19 & 0xFF;
                    arg0.field1890 = 150;
                    if (var20 == 2) {
                        class234.method1557((String) null, "<img=1>" + arg0.method1871(-78), var30, var23 ? 17 : 1, 60, var28);
                    } else if (var20 == 1) {
                        class234.method1557((String) null, "<img=0>" + arg0.method1871(-81), var30, var23 ? 17 : 1, 103, var28);
                    } else {
                        class234.method1557((String) null, arg0.method1871(-39), var30, var23 ? 17 : 2, 90, var28);
                    }
                }
            }
            field3082.field3249 = var21 + var22;
        }
        if (arg3 != 62 || (arg2 & 0x100) == 0) {
            return;
        }
        boolean var31 = true;
        int var32 = field3082.method1323(-3);
        int var33 = field3082.method1343((byte) -80);
        if (var32 == 65535) {
            var32 = -1;
        }
        if (var32 != -1 && arg0.field1856 != -1 && class279.method1882(25397, class87.method609(var32, (byte) 73).field177).field4035 < class279.method1882(25397, class87.method609(arg0.field1856, (byte) 32).field177).field4035) {
            var31 = false;
        }
        if (!var31) {
            return;
        }
        arg0.field1856 = var32;
        arg0.field1884 = 0;
        arg0.field1862 = class25.field494 + (var33 & 0xFFFF);
        arg0.field1919 = var33 >> 16;
        arg0.field1875 = 0;
        if (class25.field494 < arg0.field1862) {
            arg0.field1884 = -1;
        }
        arg0.field1952 = 1;
        if (arg0.field1856 == -1 || class25.field494 != arg0.field1862) {
            return;
        }
        int var34 = class87.method609(arg0.field1856, (byte) 97).field177;
        if (var34 != -1) {
            class260 var35 = class279.method1882(25397, var34);
            if (var35 != null && var35.field4044 != null) {
                class255.method1705(arg0.field1872, arg0.field1869, (byte) -44, var35, 0, class66.field1265 == arg0);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILhm;)V", line = 438)
    public static final void method1218(int arg0, class109 arg1) {
        if (arg0 <= 43) {
            return;
        }
        field3091++;
        class322 var2 = arg1.method698(-115);
        arg1.field1893 = var2.field4907;
        if (arg1.field1877 == 0) {
            arg1.field1930 = 0;
            return;
        }
        if (arg1.field1897 != -1 && arg1.field1921 == 0) {
            class260 var3 = class279.method1882(25397, arg1.field1897);
            if (arg1.field1925 > 0 && var3.field4057 == 0) {
                arg1.field1930++;
                return;
            }
            if (arg1.field1925 <= 0 && var3.field4063 == 0) {
                arg1.field1930++;
                return;
            }
        }
        if (arg1.field1856 != -1 && class25.field494 >= arg1.field1862) {
            class8 var4 = class87.method609(arg1.field1856, (byte) 101);
            if (var4.field174 && var4.field177 != -1) {
                class260 var5 = class279.method1882(25397, var4.field177);
                if (arg1.field1925 > 0 && var5.field4057 == 0) {
                    arg1.field1930++;
                    return;
                }
                if (arg1.field1925 <= 0 && var5.field4063 == 0) {
                    arg1.field1930++;
                    return;
                }
            }
        }
        int var6 = arg1.field1869;
        int var7 = arg1.field1872;
        int var8 = arg1.field1871[arg1.field1877 - 1] * 128 + (arg1.method710(-1) * 64);
        int var9 = arg1.field1899[arg1.field1877 - 1] * 128 + (arg1.method710(-1) * 64);
        if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field1872 = var9;
            arg1.field1869 = var8;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg1.field1886 = 1280;
            } else if (var7 > var9) {
                arg1.field1886 = 1792;
            } else {
                arg1.field1886 = 1536;
            }
        } else if (var6 > var8) {
            if (var9 > var7) {
                arg1.field1886 = 768;
            } else if (var7 > var9) {
                arg1.field1886 = 256;
            } else {
                arg1.field1886 = 512;
            }
        } else if (var9 > var7) {
            arg1.field1886 = 1024;
        } else if (var7 > var9) {
            arg1.field1886 = 0;
        }
        int var10 = arg1.field1886 - arg1.field1927 & 0x7FF;
        int var11 = var2.field4903;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var12 = 4;
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field4901;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field4917;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field4909;
        }
        if (var11 == -1) {
            var11 = var2.field4901;
        }
        byte var13 = 1;
        boolean var14 = true;
        arg1.field1893 = var11;
        if (arg1 instanceof class255) {
            var14 = ((class255) arg1).field3991.field846;
        }
        if (var14) {
            if (arg1.field1927 != arg1.field1886 && arg1.field1878 == -1 && arg1.field1859 != 0) {
                var12 = 2;
            }
            if (arg1.field1877 > 2) {
                var12 = 6;
            }
            if (arg1.field1877 > 3) {
                var12 = 8;
            }
            if (arg1.field1930 > 0 && arg1.field1877 > 1) {
                arg1.field1930--;
                var12 = 8;
            }
        } else {
            if (arg1.field1877 > 1) {
                var12 = 6;
            }
            if (arg1.field1877 > 2) {
                var12 = 8;
            }
            if (arg1.field1930 > 0 && arg1.field1877 > 1) {
                var12 = 8;
                arg1.field1930--;
            }
        }
        if (arg1.field1879[arg1.field1877 - 1] == 2) {
            var12 <<= 0x1;
            var13 = 2;
        } else if (arg1.field1879[arg1.field1877 - 1] == 0) {
            var13 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var2.field4936 == -1) {
            if (var2.field4910 != -1 && var13 == 0) {
                if (arg1.field1893 == var2.field4903 && var2.field4920 != -1) {
                    arg1.field1893 = var2.field4920;
                } else if (arg1.field1893 == var2.field4909 && var2.field4934 != -1) {
                    arg1.field1893 = var2.field4934;
                } else if (arg1.field1893 == var2.field4917 && var2.field4931 != -1) {
                    arg1.field1893 = var2.field4931;
                } else {
                    arg1.field1893 = var2.field4910;
                }
            }
        } else if (arg1.field1893 == var2.field4903 && var2.field4918 != -1) {
            arg1.field1893 = var2.field4918;
        } else if (arg1.field1893 == var2.field4909 && var2.field4928 != -1) {
            arg1.field1893 = var2.field4928;
        } else if (arg1.field1893 == var2.field4917 && var2.field4902 != -1) {
            arg1.field1893 = var2.field4902;
        } else {
            arg1.field1893 = var2.field4936;
        }
        if (var2.field4923 != -1) {
            int var15 = var12 << 7;
            if (arg1.field1877 == 1) {
                int var16 = arg1.field1954 * arg1.field1954;
                int var17 = (var8 < arg1.field1869 ? arg1.field1869 - var8 : var8 - arg1.field1869) << 7;
                int var18 = (arg1.field1872 <= var9 ? var9 - arg1.field1872 : -var9 + arg1.field1872) << 7;
                int var19 = var17 > var18 ? var17 : var18;
                int var20 = var2.field4923 * 2 * var19;
                if (var20 < var16) {
                    arg1.field1954 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field1954 -= var2.field4923;
                    if (arg1.field1954 < 0) {
                        arg1.field1954 = 0;
                    }
                } else if (var15 > arg1.field1954) {
                    arg1.field1954 += var2.field4923;
                    if (var15 < arg1.field1954) {
                        arg1.field1954 = var15;
                    }
                }
            } else if (var15 > arg1.field1954) {
                arg1.field1954 += var2.field4923;
                if (arg1.field1954 > var15) {
                    arg1.field1954 = var15;
                }
            } else if (arg1.field1954 > 0) {
                arg1.field1954 -= var2.field4923;
                if (arg1.field1954 < 0) {
                    arg1.field1954 = 0;
                }
            }
            var12 = arg1.field1954 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var6 < var8) {
            arg1.field1869 += var12;
            if (var8 < arg1.field1869) {
                arg1.field1869 = var8;
            }
        } else if (var6 > var8) {
            arg1.field1869 -= var12;
            if (arg1.field1869 < var8) {
                arg1.field1869 = var8;
            }
        }
        if (var7 < var9) {
            arg1.field1872 += var12;
            if (arg1.field1872 > var9) {
                arg1.field1872 = var9;
            }
        } else if (var9 < var7) {
            arg1.field1872 -= var12;
            if (arg1.field1872 < var9) {
                arg1.field1872 = var9;
            }
        }
        if (arg1.field1869 == var8 && arg1.field1872 == var9) {
            if (arg1.field1925 > 0) {
                arg1.field1925--;
            }
            arg1.field1877--;
        }
    }
}
