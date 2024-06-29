import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class47 {

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    private int field718 = 0;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[Lli;")
    public class208[] field709;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field719 = -1;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "J")
    public static long field713 = 0L;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lfg;")
    public static class203 field701 = new class203();

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
    public static boolean field723 = true;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lve;")
    public static class255 field725 = class87.method607(57, "<col=ff3000>");

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lve;")
    private static class255 field724 = class87.method607(91, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lve;")
    public static class255 field722 = field724;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "J")
    private long field705;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lli;")
    private class208 field699;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lli;")
    private class208 field720;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 4)
    public static final void method274(int arg0) {
        if (arg0 != -29617) {
            method285(false, -6);
        }
        field714++;
        for (class152 var1 = (class152) class95.field1622.method1471((byte) 85); var1 != null; var1 = (class152) class95.field1622.method1475((byte) 83)) {
            if (var1.field2570) {
                var1.method1119(arg0 + 29618);
            }
        }
        for (class152 var2 = (class152) class166.field2792.method1471((byte) 37); var2 != null; var2 = (class152) class166.field2792.method1475((byte) 83)) {
            if (var2.field2570) {
                var2.method1119(1);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 38)
    public final void method275(int arg0) {
        field716++;
        if (arg0 != -671198520) {
            method281((byte) -35);
        }
        for (int var2 = 0; var2 < this.field712; var2++) {
            class208 var3 = this.field709[var2];
            while (true) {
                class208 var4 = var3.field3563;
                if (var3 == var4) {
                    break;
                }
                var4.method1502((byte) -82);
            }
        }
        this.field699 = null;
        this.field720 = null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I", line = 71)
    public final int method276(int arg0) {
        field708++;
        if (arg0 != 65280) {
            this.field718 = -108;
        }
        return this.field712;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Lli;", line = 86)
    public final class208 method277(int arg0) {
        field721++;
        if (this.field699 == null) {
            return null;
        }
        if (arg0 <= 7) {
            this.method276(34);
        }
        class208 var2 = this.field709[(int) (this.field705 & (long) (this.field712 - 1))];
        while (this.field699 != var2) {
            if (this.field699.field3568 == this.field705) {
                class208 var3 = this.field699;
                this.field699 = this.field699.field3563;
                return var3;
            }
            this.field699 = this.field699.field3563;
        }
        this.field699 = null;
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)I", line = 122)
    public static final int method278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field717++;
        if (class120.field2009) {
            arg2 = 1000000;
            class120.field2009 = false;
        }
        if (arg4 != 64) {
            return -32;
        }
        class181 var5 = class185.field2982[arg0][arg3];
        float var6 = var5.field2928;
        int var7 = var5.field2934;
        float var8 = ((float) arg1 * 0.1F + 0.7F) * var5.field2924;
        float var9 = var5.field2931;
        int var10 = var5.field2933;
        int var11 = var5.field2927;
        if (!class304.field5199) {
            var10 = 0;
        }
        if (class197.field3285 != var11 || class20.field323 != var8 || class308.field5248 != var6 || class231.field3835 != var9 || class60.field943 != var7 || class285.field4898 != var10) {
            class308.field5248 = var6;
            class60.field930 = class276.field4744;
            class225.field3769 = class68.field1012;
            class20.field323 = var8;
            class197.field3285 = var11;
            class159.field2681 = class11.field165;
            class103.field1737 = class154.field2626;
            class206.field3544 = 0;
            class231.field3835 = var9;
            class285.field4898 = var10;
            class212.field3620 = class121.field2015;
            class44.field683 = class288.field4955;
            class60.field943 = var7;
        }
        if (class206.field3544 < 65536) {
            class206.field3544 += arg2 * 250;
            if (class206.field3544 >= 65536) {
                class206.field3544 = 65536;
            }
            int var12 = class206.field3544 >> 8;
            int var13 = 65536 - class206.field3544 >> 8;
            class288.field4955 = class44.field683 * var13 + class285.field4898 * var12 >> 8;
            class276.field4744 = ((class60.field930 & 0xFF00FF) * var13 + ((class197.field3285 & 0xFF00FF) * var12) & 0xFF00FF00) + ((class60.field930 & 0xFF00) * var13 + (class197.field3285 & 0xFF00) * var12 & 0xFF0000) >> 8;
            float var14 = (float) class206.field3544 / 65536.0F;
            float var15 = (float) (65536 - class206.field3544) / 65536.0F;
            class121.field2015 = class231.field3835 * var14 + class212.field3620 * var15;
            class68.field1012 = ((class60.field943 & 0xFF00) * var12 + (class225.field3769 & 0xFF00) * var13 & 0xFF0000) + ((class60.field943 & 0xFF00FF) * var12 + (class225.field3769 & 0xFF00FF) * var13 & 0xFF00FF00) >> 8;
            class11.field165 = class308.field5248 * var14 + class159.field2681 * var15;
            class154.field2626 = class20.field323 * var14 + class103.field1737 * var15;
        }
        class272.method1896(class276.field4744, class154.field2626, class11.field165, class121.field2015);
        class272.method1906(class68.field1012, class288.field4955);
        class272.method1903((float) class220.field3715, (float) class172.field2850, (float) class129.field2136);
        class272.method1900();
        return class68.field1012;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BD)V", line = 206)
    public static final void method279(byte arg0, double arg1) {
        int var3 = 63 % ((51 - arg0) / 50);
        if (class271.field4682 != arg1) {
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
                class195.field3213[var4] = var5 > 255 ? 255 : var5;
            }
            class271.field4682 = arg1;
        }
        field700++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)Lli;", line = 233)
    public final class208 method280(long arg0, int arg1) {
        this.field705 = arg0;
        field703++;
        class208 var4 = this.field709[(int) ((long) (this.field712 - 1) & arg0)];
        this.field699 = var4.field3563;
        if (arg1 != 29153) {
            this.field720 = (class208) null;
        }
        while (this.field699 != var4) {
            if (this.field699.field3568 == arg0) {
                class208 var5 = this.field699;
                this.field699 = this.field699.field3563;
                return var5;
            }
            this.field699 = this.field699.field3563;
        }
        this.field699 = null;
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 266)
    public static void method281(byte arg0) {
        field701 = null;
        if (arg0 < -80) {
            field722 = null;
            field725 = null;
            field724 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLpb;)V", line = 280)
    public static final void method282(byte arg0, class70 arg1) {
        field702++;
        if (arg1.field1066.length - arg1.field1068 < 1) {
            return;
        }
        int var2 = arg1.method481(0);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field1066.length - arg1.field1068) {
            return;
        }
        class79.field1291 = arg1.method481(0);
        if (class79.field1291 < 1) {
            class79.field1291 = 1;
        } else if (class79.field1291 > 4) {
            class79.field1291 = 4;
        }
        class20.method110(true, arg1.method481(0) == 1);
        class136.field2259 = arg1.method481(0) == 1;
        class229.field3788 = arg1.method481(0) == 1;
        class298.field5094 = arg1.method481(arg0 + 114) == 1;
        class314.field5328 = arg1.method481(0) == 1;
        class143.field2392 = arg1.method481(0) == 1;
        class136.field2262 = arg1.method481(0) == 1;
        if (arg0 != -114) {
            field722 = (class255) null;
        }
        class190.field3048 = arg1.method481(arg0 ^ -114) == 1;
        class13.field176 = arg1.method481(arg0 + 114);
        if (class13.field176 > 2) {
            class13.field176 = 2;
        }
        if (var2 >= 2) {
            class114.field1921 = arg1.method481(arg0 ^ -114) == 1;
        } else {
            class114.field1921 = arg1.method481(0) == 1;
            arg1.method481(arg0 + 114);
        }
        class258.field4390 = arg1.method481(0) == 1;
        class304.field5199 = arg1.method481(0) == 1;
        class250.field4222 = arg1.method481(arg0 + 114);
        if (class250.field4222 > 2) {
            class250.field4222 = 2;
        }
        class150.field2546 = arg1.method481(arg0 + 114) == 1;
        class25.field392 = arg1.method481(0);
        if (class25.field392 > 127) {
            class25.field392 = 127;
        }
        class184.field2963 = arg1.method481(0);
        class301.field5169 = arg1.method481(0);
        if (class301.field5169 > 127) {
            class301.field5169 = 127;
        }
        if (var2 >= 1) {
            class264.field4469 = arg1.method423(arg0 ^ 0xFFFFFF71);
            class9.field133 = arg1.method423(arg0 + 369);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method481(0);
        }
        if (var2 >= 4) {
            arg1.method481(arg0 + 114);
        }
        if (var2 >= 5) {
            class293.field5023 = arg1.method469(100);
        }
        if (var2 >= 6) {
            class289.field4979 = arg1.method481(0);
        }
        if (var2 >= 7) {
            class63.field959 = arg1.method481(0) == 1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lli;Z)I", line = 414)
    public final int method283(class208[] arg0, boolean arg1) {
        if (arg1) {
            this.field709 = (class208[]) null;
        }
        field697++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field712; var4++) {
            class208 var5 = this.field709[var4];
            for (class208 var6 = var5.field3563; var6 != var5; var6 = var6.field3563) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZJLli;)V", line = 448)
    public final void method284(boolean arg0, long arg1, class208 arg2) {
        if (!arg0) {
            this.field699 = (class208) null;
        }
        if (arg2.field3566 != null) {
            arg2.method1502((byte) -82);
        }
        field707++;
        class208 var5 = this.field709[(int) ((long) (this.field712 - 1) & arg1)];
        arg2.field3566 = var5.field3566;
        arg2.field3568 = arg1;
        arg2.field3563 = var5;
        arg2.field3566.field3563 = arg2;
        arg2.field3563.field3566 = arg2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V", line = 469)
    public static final void method285(boolean arg0, int arg1) {
        class210.field3579 = new int[104];
        class125.field2079 = new int[104];
        class190.field3043 = new int[104];
        class143.field2391 = new int[104];
        class168.field2827 = new int[104];
        class265.field4484 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class248.field4156 = new byte[var2][104][104];
        class159.field2685 = new byte[var2][104][104];
        if (arg1 != 21883) {
            field724 = (class255) null;
        }
        class122.field2037 = new byte[var2][105][105];
        class282.field4847 = new byte[var2][104][104];
        class220.field3704 = new byte[var2][104][104];
        field706++;
        class291.field5003 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I", line = 498)
    public final int method286(byte arg0) {
        int var2 = -104 % ((-arg0 - 2) / 46);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field712; var4++) {
            class208 var5 = this.field709[var4];
            class208 var6 = var5.field3563;
            while (var5 != var6) {
                var6 = var6.field3563;
                var3++;
            }
        }
        field715++;
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BLpb;)V", line = 535)
    public static final void method287(byte arg0, class70 arg1) {
        label89: while (true) {
            if (arg1.field1066.length > arg1.field1068) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method481(0) == 1) {
                    var2 = arg1.method481(0);
                    var3 = true;
                    var4 = arg1.method481(0);
                }
                int var5 = arg1.method481(0);
                int var6 = arg1.method481(0);
                int var7 = var5 * 64 - class225.field3768;
                int var8 = class41.field636 - (var6 * 64 + -class297.field5084) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class282.field4846 > (var7 + 63) && var8 < class41.field636) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label89;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var11 < (var2 * 8 + 8) && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method466((byte) -32);
                                if (var13 != 0) {
                                    if (class118.field1981[var9][var10] == null) {
                                        class118.field1981[var9][var10] = new byte[4096];
                                    }
                                    class118.field1981[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method466((byte) -91);
                                    if (class76.field1248[var9][var10] == null) {
                                        class76.field1248[var9][var10] = new byte[4096];
                                    }
                                    class76.field1248[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var15 = 0;
                while (true) {
                    if (var15 >= (var3 ? 64 : 4096)) {
                        continue label89;
                    }
                    byte var16 = arg1.method466((byte) -111);
                    if (var16 != 0) {
                        arg1.field1068++;
                    }
                    var15++;
                }
            }
            if (arg0 <= 7) {
                return;
            }
            field711++;
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Lli;", line = 633)
    public final class208 method288(byte arg0) {
        this.field718 = 0;
        if (arg0 != -42) {
            field723 = true;
        }
        field710++;
        return this.method289(arg0 ^ 0xFFFFFF92);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V", line = 649)
    public class47(int arg0) {
        this.field709 = new class208[arg0];
        this.field712 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field709[var2] = new class208();
            var3.field3566 = var3;
            var3.field3563 = var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Lli;", line = 687)
    public final class208 method289(int arg0) {
        field698++;
        if (this.field718 > 0 && this.field709[this.field718 - 1] != this.field720) {
            class208 var2 = this.field720;
            this.field720 = var2.field3563;
            return var2;
        }
        if (arg0 < 52) {
            this.field699 = (class208) null;
        }
        class208 var3;
        do {
            if (this.field712 <= this.field718) {
                return null;
            }
            var3 = this.field709[this.field718++].field3563;
        } while (this.field709[this.field718 - 1] == var3);
        this.field720 = var3.field3563;
        return var3;
    }
}
