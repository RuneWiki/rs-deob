import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class219 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[Lwj;")
    private class129[] field3669;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "D")
    public static double field3670 = -1.0D;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3678 = "wishes to trade with you.";

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lvh;")
    public static class108 field3671;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        field3674++;
        int var8 = arg4 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        class89.method578(arg4, false);
        if (arg6 != -2432) {
            method1450(-39);
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = -1;
        int var12 = -var8;
        int var13 = var8;
        int var14 = -1;
        if (class118.field2094 <= arg5 && arg5 <= class89.field1582) {
            int[] var15 = class167.field2735[arg5];
            int var16 = class160.method1090(arg2 - arg4, (byte) 16, class118.field2098, class126.field2222);
            int var17 = class160.method1090(arg2 + arg4, (byte) 16, class118.field2098, class126.field2222);
            int var18 = class160.method1090(arg2 - var8, (byte) 16, class118.field2098, class126.field2222);
            int var19 = class160.method1090(arg2 + var8, (byte) 16, class118.field2098, class126.field2222);
            class93.method598(-7, var18, var16, var15, arg0);
            class93.method598(arg6 ^ 0x979, var19, var18, var15, arg1);
            class93.method598(-7, var17, var19, var15, arg0);
        }
        while (var7 < var9) {
            var14 += 2;
            var12 += var14;
            var11 += 2;
            var10 += var11;
            if (var12 >= 0 && var13 >= 1) {
                var13--;
                var12 -= var13 << 1;
                class256.field4178[var13] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                int var20 = arg5 - var9;
                var10 -= var9 << 1;
                int var21 = arg5 + var9;
                if (class118.field2094 <= var21 && var20 <= class89.field1582) {
                    if (var8 > var9) {
                        int var22 = class256.field4178[var9];
                        int var23 = class160.method1090(arg2 + var7, (byte) 16, class118.field2098, class126.field2222);
                        int var24 = class160.method1090(arg2 - var7, (byte) 16, class118.field2098, class126.field2222);
                        int var25 = class160.method1090(arg2 + var22, (byte) 16, class118.field2098, class126.field2222);
                        int var26 = class160.method1090(arg2 - var22, (byte) 16, class118.field2098, class126.field2222);
                        if (class89.field1582 >= var21) {
                            int[] var27 = class167.field2735[var21];
                            class93.method598(-7, var26, var24, var27, arg0);
                            class93.method598(-7, var25, var26, var27, arg1);
                            class93.method598(-7, var23, var25, var27, arg0);
                        }
                        if (class118.field2094 <= var20) {
                            int[] var28 = class167.field2735[var20];
                            class93.method598(-7, var26, var24, var28, arg0);
                            class93.method598(-7, var25, var26, var28, arg1);
                            class93.method598(-7, var23, var25, var28, arg0);
                        }
                    } else {
                        int var29 = class160.method1090(arg2 + var7, (byte) 16, class118.field2098, class126.field2222);
                        int var30 = class160.method1090(arg2 - var7, (byte) 16, class118.field2098, class126.field2222);
                        if (class89.field1582 >= var21) {
                            class93.method598(-7, var29, var30, class167.field2735[var21], arg0);
                        }
                        if (class118.field2094 <= var20) {
                            class93.method598(-7, var29, var30, class167.field2735[var20], arg0);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class118.field2094 <= var32 && class89.field1582 >= var31) {
                int var33 = arg2 - var9;
                int var34 = arg2 + var9;
                if (var34 >= class126.field2222 && var33 <= class118.field2098) {
                    int var35 = class160.method1090(var34, (byte) 16, class118.field2098, class126.field2222);
                    int var36 = class160.method1090(var33, (byte) 16, class118.field2098, class126.field2222);
                    if (var8 <= var7) {
                        if (var32 <= class89.field1582) {
                            class93.method598(arg6 + 2425, var35, var36, class167.field2735[var32], arg0);
                        }
                        if (class118.field2094 <= var31) {
                            class93.method598(arg6 ^ 0x979, var35, var36, class167.field2735[var31], arg0);
                        }
                    } else {
                        int var37 = var7 > var13 ? class256.field4178[var7] : var13;
                        int var38 = class160.method1090(arg2 + var37, (byte) 16, class118.field2098, class126.field2222);
                        int var39 = class160.method1090(arg2 - var37, (byte) 16, class118.field2098, class126.field2222);
                        if (class89.field1582 >= var32) {
                            int[] var40 = class167.field2735[var32];
                            class93.method598(-7, var39, var36, var40, arg0);
                            class93.method598(-7, var38, var39, var40, arg1);
                            class93.method598(-7, var35, var38, var40, arg0);
                        }
                        if (class118.field2094 <= var31) {
                            int[] var41 = class167.field2735[var31];
                            class93.method598(arg6 ^ 0x979, var39, var36, var41, arg0);
                            class93.method598(-7, var38, var39, var41, arg1);
                            class93.method598(-7, var35, var38, var41, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1450(int arg0) {
        field3676++;
        if (arg0 != -29839) {
            method1452(-9, -109, -9);
        }
        class252 var1 = class63.field1096;
        synchronized (class63.field1096) {
            class113.field2043 = class116.field2075;
            class51.field890++;
            if (class239.field3934 >= 0) {
                while (class239.field3934 != class205.field3359) {
                    int var2 = class288.field4582[class205.field3359];
                    class205.field3359 = class205.field3359 + 1 & 0x7F;
                    if (var2 < 0) {
                        class12.field169[~var2] = false;
                    } else {
                        class12.field169[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class12.field169[var3] = false;
                }
                class239.field3934 = class205.field3359;
            }
            class116.field2075 = class261.field4265;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvh;Lam;Lvh;I)V")
    public static final void method1451(class108 arg0, class297 arg1, class108 arg2, int arg3) {
        class155.field2597 = arg1;
        field3677++;
        class208.field3504 = arg2;
        if (arg3 > -90) {
            method1450(-46);
        }
        class54.field938 = arg0;
        if (class208.field3504 != null) {
            class82.field1490 = class208.field3504.method754(117, 1);
        }
        if (class54.field938 != null) {
            class92.field1616 = class54.field938.method754(121, 1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
    public static final int method1452(int arg0, int arg1, int arg2) {
        field3673++;
        int var3 = class55.method339(arg0 + arg2, arg1 + 91923, arg0 ^ -45365, 4) + ((class55.method339(arg2 - -10294, arg1 + 37821, -2, 2) + -128 >> 1) - -(class55.method339(arg2, arg1, -2, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static final void method1453(int arg0) {
        field3672++;
        if (arg0 != -8918) {
            return;
        }
        int var1 = class277.field4432 * 128 + 64;
        int var2 = class182.field2973 * 128 + 64;
        int var3 = class10.method68(true, class176.field2886, var1, var2) - class126.field2210;
        if (class151.field2523 < 100) {
            if (class237.field3904 < var1) {
                class237.field3904 += (var1 - class237.field3904) * class151.field2523 / 1000 + class87.field1552;
                if (class237.field3904 > var1) {
                    class237.field3904 = var1;
                }
            }
            if (class56.field976 < var2) {
                class56.field976 += class87.field1552 + ((var2 - class56.field976) * class151.field2523 / 1000);
                if (class56.field976 > var2) {
                    class56.field976 = var2;
                }
            }
            if (class237.field3904 > var1) {
                class237.field3904 -= class87.field1552 + ((class237.field3904 - var1) * class151.field2523 / 1000);
                if (class237.field3904 < var1) {
                    class237.field3904 = var1;
                }
            }
            if (class56.field976 > var2) {
                class56.field976 -= (class56.field976 - var2) * class151.field2523 / 1000 + class87.field1552;
                if (class56.field976 < var2) {
                    class56.field976 = var2;
                }
            }
            if (var3 > class250.field4093) {
                class250.field4093 += class87.field1552 + ((var3 - class250.field4093) * class151.field2523 / 1000);
                if (class250.field4093 > var3) {
                    class250.field4093 = var3;
                }
            }
            if (var3 < class250.field4093) {
                class250.field4093 -= class87.field1552 + ((class250.field4093 - var3) * class151.field2523 / 1000);
                if (var3 > class250.field4093) {
                    class250.field4093 = var3;
                }
            }
        } else {
            class237.field3904 = class277.field4432 * 128 + 64;
            class56.field976 = class182.field2973 * 128 + 64;
            class250.field4093 = class10.method68(true, class176.field2886, class237.field3904, class56.field976) - class126.field2210;
        }
        int var4 = class74.field1226 * 128 + 64;
        int var5 = class136.field2385 * 128 + 64;
        int var6 = class10.method68(true, class176.field2886, var4, var5) - class225.field3777;
        int var7 = var6 - class250.field4093;
        int var8 = var5 - class56.field976;
        int var9 = var4 - class237.field3904;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class52.field914;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class228.field3844 < var11) {
            class228.field3844 += (var11 - class228.field3844) * class126.field2208 / 1000 + class112.field2009;
            if (class228.field3844 > var11) {
                class228.field3844 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < class228.field3844) {
            class228.field3844 -= class112.field2009 + ((class228.field3844 - var11) * class126.field2208 / 1000);
            if (var11 > class228.field3844) {
                class228.field3844 = var11;
            }
        }
        if (var13 > 0) {
            class52.field914 += class126.field2208 * var13 / 1000 + class112.field2009;
            class52.field914 &= 0x7FF;
        }
        if (var13 < 0) {
            class52.field914 -= -var13 * class126.field2208 / 1000 + class112.field2009;
            class52.field914 &= 0x7FF;
        }
        int var14 = var12 - class52.field914;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class52.field914 = var12;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Z")
    public static final boolean method1454(int arg0) {
        field3675++;
        if (arg0 > -31) {
            return false;
        }
        try {
            return class256.method1692(true);
        } catch (IOException var4) {
            class239.method1580((byte) -65);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class87.field1558 + "," + class211.field3564 + "," + class295.field4694 + " - " + class101.field1747 + "," + (class273.field4378.field1464[0] + class126.field2206) + "," + (class273.field4378.field1486[0] + class255.field4162) + " - ";
            for (int var3 = 0; class101.field1747 > var3 && var3 < 50; var3++) {
                var2 = var2 + class248.field4058.field1730[var3] + ",";
            }
            class254.method1684(127, var5, var2);
            class63.method402((byte) -18);
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3678 = null;
        if (arg0 != 3) {
            field3671 = null;
        }
        field3671 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V")
    public class219(int arg0) {
        this.field3669 = new class129[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class129 var3 = this.field3669[var2] = new class129();
            var3.field2258 = var3;
            var3.field2261 = var3;
        }
    }
}
