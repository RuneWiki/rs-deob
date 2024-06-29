import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class109 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    private int[] field2001;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    public static int[] field2005 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
    public static boolean field2009 = false;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "F")
    public static float field1999;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lek;")
    public static class206 field2002;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V", line = 4)
    public static final void method814(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2004++;
        if (class241.field4016) {
            class337.method2385(arg0, arg2, arg0 + arg1, arg2 + arg3);
            class337.method2378(arg0, arg2, arg1, arg3, 0);
        } else {
            class270.method1891(arg0, arg2, arg0 + arg1, arg2 + arg3);
            class270.method1894(arg0, arg2, arg1, arg3, 0);
        }
        if (class342.field5416 < 100) {
            return;
        }
        float var5 = (float) class38.field821 / (float) class38.field824;
        int var6 = arg1;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = (arg3 - var7) / 2 + arg2;
        if (class23.field574 == null || class23.field574.field1353 != arg1 || class23.field574.field1356 != arg3) {
            class288 var9 = new class288(arg1, arg3);
            class270.method1907(var9.field4697, arg1, arg3);
            if (class38.field829.field3729 != -1) {
                class270.method1894(0, 0, arg1, arg3, class38.field829.field3729);
            }
            class38.method289(0, 0, class38.field824, class38.field821, 0, 0, var6, var7);
            class38.method273();
            if (class241.field4016) {
                class23.field574 = new class265(var9);
            } else {
                class23.field574 = var9;
            }
            if (class241.field4016) {
                class270.field4403 = null;
            } else {
                class285.field4666.method612(-105);
            }
        }
        int var10 = (arg1 - var6) / 2 + arg0;
        class23.field574.method572(var10, var8);
        int var11 = class251.field4123 * var6 / class38.field824 + var10;
        int var12 = class156.field2640 * var7 / class38.field821 + var8;
        int var13 = class162.field2723 * var6 / class38.field824;
        if (arg4 != 0) {
            return;
        }
        int var14 = class148.field2526 * var7 / class38.field821;
        int var15 = 16711680;
        if (class141.field2383 == 1) {
            var15 = 16777215;
        }
        if (class241.field4016) {
            class337.method2380(var11, var12, var13, var14, var15, 128);
            class337.method2387(var11, var12, var13, var14, var15);
        } else {
            class270.method1890(var11, var12, var13, var14, var15, 128);
            class270.method1904(var11, var12, var13, var14, var15);
        }
        if (class1.field37 <= 0) {
            return;
        }
        int var16;
        if (class6.field169 > 50) {
            var16 = (100 - class6.field169) * 5;
        } else {
            var16 = class6.field169 * 5;
        }
        for (class127 var17 = (class127) class38.field825.method1580((byte) -122); var17 != null; var17 = (class127) class38.field825.method1586((byte) 50)) {
            class1 var18 = class125.method901(var17.field2219, (byte) -49);
            if (class140.method970(var18, arg4 + 108)) {
                if (class199.field3349 == var17.field2219) {
                    int var19 = var10 + (var17.field2216 * var6 / class38.field824);
                    int var20 = var8 + (var17.field2217 * var7 / class38.field821);
                    if (class241.field4016) {
                        class337.method2380(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    } else {
                        class270.method1890(var19 - 2, var20 - 2, 4, 4, 16776960, var16);
                    }
                } else if (class177.field2933 != -1 && class177.field2933 == var18.field13) {
                    int var21 = var10 + (var17.field2216 * var6 / class38.field824);
                    int var22 = var8 + (var17.field2217 * var7 / class38.field821);
                    if (class241.field4016) {
                        class337.method2380(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    } else {
                        class270.method1890(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 145)
    public static final void method815(int arg0, int arg1, int arg2) {
        if (arg2 == 8) {
            arg2 = 4;
        }
        field2007++;
        if (arg2 == 4 && !class68.field1254) {
            arg2 = 2;
            arg1 = 2;
        }
        if (class215.field3584 != arg2) {
            if (class269.field4384) {
                return;
            }
            if (class215.field3584 != 0) {
                class105.field1928[class215.field3584].method222();
            }
            if (arg2 != 0) {
                class67 var3 = class105.field1928[arg2];
                var3.method224();
                var3.method225(arg1);
            }
            class215.field3584 = arg2;
            class181.field3150 = arg1;
        } else if (arg2 != 0 && class181.field3150 != arg1) {
            class105.field1928[arg2].method225(arg1);
            class181.field3150 = arg1;
        }
        if (arg0 >= -116) {
            method814(-5, 72, 94, -19, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 197)
    public static void method816(byte arg0) {
        if (arg0 != 102) {
            method815(-87, 39, 34);
        }
        field2005 = null;
        field2002 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 215)
    public final int method817(int arg0, int arg1) {
        int var3 = 107 % ((arg0 - 22) / 61);
        int var4 = (this.field2001.length >> 1) - 1;
        field2003++;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field2001[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2001[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(CI)Z", line = 249)
    public static final boolean method818(char arg0, int arg1) {
        field2006++;
        if (arg1 >= -33) {
            return true;
        } else {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I", line = 261)
    public static final int method819(int arg0) {
        field2008++;
        if (arg0 != 576) {
            method819(125);
        }
        if ((double) class38.field822 == 3.0D) {
            return 37;
        } else if ((double) class38.field822 == 4.0D) {
            return 50;
        } else if ((double) class38.field822 == 6.0D) {
            return 75;
        } else if ((double) class38.field822 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([I)V", line = 291)
    public class109(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2001 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2001[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2001[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2001[var5 + var5] = arg0[var4];
            this.field2001[var5 + var5 + 1] = var4++;
        }
    }
}
