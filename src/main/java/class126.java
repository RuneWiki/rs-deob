import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class126 extends class8 {

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "[Lih;")
    public class6[] field1958;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "Lhh;")
    public static class169 field1957 = new class169();

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "[Lac;")
    public static class108[] field1964 = new class108[4];

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1965 = 7759444;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Z")
    public static boolean field1970 = false;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "[I")
    public static int[] field1966 = new int[14];

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "J")
    public static long field1968 = 0L;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Lak;")
    public static class172 field1967;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "Lak;")
    public static class172 field1969;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 5)
    public static final void method912(int arg0) {
        field1963++;
        if (class225.field3604 == null) {
            return;
        }
        if (class52.field738 < 10) {
            if (!class275.field4425.method1285(class225.field3604.field4657, false)) {
                class52.field738 = class176.field2939.method1289(0, class225.field3604.field4657) / 10;
                return;
            }
            class211.method1526(-98);
            class52.field738 = 10;
        }
        if (class52.field738 == 10) {
            class93.field1276 = class225.field3604.field4651 >> 6 << 6;
            class74.field1048 = (class225.field3604.field4646 >> 6 << 6) + 64 - class93.field1276;
            class27.field377 = class225.field3604.field4645 >> 6 << 6;
            class111.field1650 = (class225.field3604.field4659 >> 6 << 6) + 64 - class27.field377;
            int[] var1 = class225.field3604.method2086((class191.field3129.field4255 >> 7) + class70.field989, (byte) 47, class49.field698, (class191.field3129.field4264 >> 7) + class205.field3367);
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var3 = var1[1] - class27.field377;
                var2 = class93.field1276 - (var1[2] - (class74.field1048 - 1));
            }
            if (var3 >= 0 && class111.field1650 > var3 && var2 >= 0 && class74.field1048 > var2) {
                int var4 = var2 + ((int) (Math.random() * 10.0D) - 5);
                int var5 = var3 + ((int) (Math.random() * 10.0D) - 5);
                class139.field2195 = var5;
                class91.field1254 = var4;
            } else if (class333.field5191 == -1 || class105.field1546 == -1) {
                int[] var7 = class225.field3604.method2080((byte) 85, (class225.field3604.field4655 & 0xFFFED53) >> 14, class225.field3604.field4655 & 0x3FFF);
                class139.field2195 = var7[1] - class27.field377;
                class91.field1254 = class93.field1276 + class74.field1048 - var7[2] - 1;
            } else {
                int[] var6 = class225.field3604.method2080((byte) 122, class333.field5191, class105.field1546);
                if (var6 != null) {
                    class139.field2195 = var6[1] - class27.field377;
                    class91.field1254 = class74.field1048 + class93.field1276 - var6[2] - 1;
                }
                class105.field1546 = -1;
                class333.field5191 = -1;
            }
            if (class225.field3604.field4660 == 37) {
                class122.field1920 = 3.0F;
                class43.field543 = 3.0F;
            } else if (class225.field3604.field4660 == 50) {
                class122.field1920 = 4.0F;
                class43.field543 = 4.0F;
            } else if (class225.field3604.field4660 == 75) {
                class122.field1920 = 6.0F;
                class43.field543 = 6.0F;
            } else if (class225.field3604.field4660 == 100) {
                class122.field1920 = 8.0F;
                class43.field543 = 8.0F;
            } else if (class225.field3604.field4660 == 200) {
                class122.field1920 = 16.0F;
                class43.field543 = 16.0F;
            } else {
                class122.field1920 = 8.0F;
                class43.field543 = 8.0F;
            }
            class46.method295(-1);
            class110.field1635 = new int[class36.field479 + 1];
            int var8 = class74.field1048 >> 6;
            int var9 = class111.field1650 >> 6;
            class129.field2018 = new byte[var9][var8][];
            class113.field1719 = new byte[var9][var8][];
            int var10 = class322.field4985 >> 2 << 10;
            class296.field4683 = new int[var9][var8][];
            class73.field1025 = new byte[var9][var8][];
            class323.field5007 = new int[var9][var8][];
            int var11 = class289.field4633 >> 1;
            class29.field398 = new int[var9][var8][];
            class280.field4520 = new byte[var9][var8][];
            class195.field3191 = new byte[var9][var8][];
            class300.method2141(var10, (byte) 114, var11);
            class52.field738 = 20;
        } else if (class52.field738 == 20) {
            class224.method1590(new class44(class275.field4425.method1294("underlay", class225.field3604.field4657, true)), false);
            class52.field738 = 30;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 30) {
            class180.method1352(new class44(class275.field4425.method1294("overlay", class225.field3604.field4657, true)), 7744);
            class52.field738 = 40;
            class53.method342(25376);
        } else if (class52.field738 == 40) {
            class176.method1327(new class44(class275.field4425.method1294("overlay2", class225.field3604.field4657, true)), (byte) 48);
            class52.field738 = 50;
            class53.method342(25376);
        } else if (class52.field738 == 50) {
            class73.method487(new class44(class275.field4425.method1294("loc", class225.field3604.field4657, true)), (byte) -23);
            class52.field738 = 60;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 60) {
            if (class275.field4425.method1278(-121, class225.field3604.field4657 + "_labels")) {
                if (!class275.field4425.method1285(class225.field3604.field4657 + "_labels", false)) {
                    return;
                }
                class20.field289 = class91.method612(class225.field3604.field4657 + "_labels", class275.field4425, -120);
            } else {
                class20.field289 = new class201(0);
            }
            class52.field738 = 70;
            class53.method342(arg0 ^ 0x636F);
        } else if (class52.field738 == 70) {
            class102.field1483 = new class140(11, true, class94.field1290);
            class52.field738 = 73;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 73) {
            class157.field2473 = new class140(12, true, class94.field1290);
            class52.field738 = 76;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 76) {
            class64.field922 = new class140(14, true, class94.field1290);
            class52.field738 = 79;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == arg0) {
            class10.field129 = new class140(17, true, class94.field1290);
            class52.field738 = 82;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 82) {
            class103.field1505 = new class140(19, true, class94.field1290);
            class52.field738 = 85;
            class319.method2245(true, false);
            class53.method342(25376);
        } else if (class52.field738 == 85) {
            class54.field770 = new class140(22, true, class94.field1290);
            class52.field738 = 88;
            class319.method2245(true, false);
            class53.method342(arg0 ^ 0x636F);
        } else if (class52.field738 == 88) {
            class133.field2085 = new class140(26, true, class94.field1290);
            class52.field738 = 91;
            class319.method2245(true, false);
            class53.method342(arg0 + 25297);
        } else {
            class128.field2004 = new class140(30, true, class94.field1290);
            class52.field738 = 100;
            class319.method2245(true, false);
            class53.method342(25376);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)I", line = 248)
    public static final int method913(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1959++;
        if (arg1 != 10) {
            method913(-82, -128, -124, 100);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Z", line = 273)
    public final boolean method914(byte arg0, int arg1) {
        if (arg0 <= 41) {
            return false;
        } else {
            field1961++;
            return this.field1958[arg1].field98;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIILj;IZJ)Z", line = 285)
    public static final boolean method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class7 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class189.field3099 == class110.field1642;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class45.field633 || var16 >= class158.field2618) {
                    return false;
                }
                class204 var17 = class324.field5032[arg0][var15][var16];
                if (var17 != null && var17.field3360 >= 5) {
                    return false;
                }
            }
        }
        class153 var18 = new class153();
        var18.field2358 = arg11;
        var18.field2367 = arg0;
        var18.field2368 = arg5;
        var18.field2359 = arg6;
        var18.field2372 = arg7;
        var18.field2373 = arg8;
        var18.field2369 = arg9;
        var18.field2371 = arg1;
        var18.field2366 = arg2;
        var18.field2355 = arg1 + arg3 - 1;
        var18.field2361 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class324.field5032[var22][var19][var20] == null) {
                        class324.field5032[var22][var19][var20] = new class204(var22, var19, var20);
                    }
                }
                class204 var23 = class324.field5032[arg0][var19][var20];
                var23.field3343[var23.field3360] = var18;
                var23.field3355[var23.field3360] = var21;
                var23.field3354 |= var21;
                var23.field3360++;
                if (var13 && class280.field4519[var19][var20] != 0) {
                    var14 = class280.field4519[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class280.field4519[var24][var25] == 0) {
                        class280.field4519[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class94.field1291[class274.field4415++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([BI)Lq;", line = 403)
    public static final class345 method916(byte[] arg0, int arg1) {
        field1960++;
        if (arg0 == null) {
            return null;
        }
        class345 var2 = new class345(arg0, class270.field4364, class51.field732, class102.field1489, class184.field3046, class278.field4481);
        class106.method727(true);
        if (arg1 != -3815) {
            method916((byte[]) null, -66);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V", line = 426)
    public static void method917(int arg0) {
        field1969 = null;
        field1957 = null;
        field1964 = null;
        field1967 = null;
        field1966 = null;
        if (arg0 >= -123) {
            method915(-24, -93, 87, 45, 73, -22, -65, -70, (class7) null, 38, false, -64L);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lak;Lak;IZ)V", line = 449)
    public class126(class172 arg0, class172 arg1, int arg2, boolean arg3) {
        class169 var5 = new class169();
        int var6 = arg0.method1299(arg2, (byte) 50);
        this.field1958 = new class6[var6];
        int[] var7 = arg0.method1300(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1287(var7[var8], arg2, -1);
            class122 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class122 var12 = (class122) var5.method1240(3); var12 != null; var12 = (class122) var5.method1235(false)) {
                if (var12.field1915 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1272(0, var11, 116);
                } else {
                    var13 = arg1.method1272(var11, 0, 99);
                }
                var10 = new class122(var11, var13);
                var5.method1232(96, var10);
            }
            this.field1958[var7[var8]] = new class6(var9, var10);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z", line = 512)
    public final boolean method918(int arg0, int arg1) {
        field1962++;
        if (arg1 != 4) {
            this.method914((byte) 53, -107);
        }
        return this.field1958[arg0].field86;
    }
}
