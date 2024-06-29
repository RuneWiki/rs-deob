import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class192 {

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field2882 = 0;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[Lqa;")
    public class101[] field2872;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lhb;")
    public static class318 field2875 = new class318(64);

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "S")
    public static short field2886 = 256;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2884 = "flash1:";

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "J")
    private long field2867;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lqa;")
    private class101 field2877;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lqa;")
    private class101 field2881;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2885;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IJLqa;)V", line = 7)
    public final void method1319(int arg0, long arg1, class101 arg2) {
        field2871++;
        if (arg2.field1599 != null) {
            arg2.method714(110);
        }
        class101 var5 = this.field2872[(int) ((long) (this.field2869 - 1) & arg1)];
        arg2.field1599 = var5.field1599;
        arg2.field1595 = var5;
        arg2.field1603 = arg1;
        int var6 = 41 / ((arg0 - 2) / 55);
        arg2.field1599.field1595 = arg2;
        arg2.field1595.field1599 = arg2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)Lqa;", line = 27)
    public final class101 method1320(long arg0, int arg1) {
        this.field2867 = arg0;
        field2874++;
        class101 var4 = this.field2872[(int) ((long) (this.field2869 - 1) & arg0)];
        if (arg1 != 13002) {
            return (class101) null;
        }
        for (this.field2877 = var4.field1595; this.field2877 != var4; this.field2877 = this.field2877.field1595) {
            if (this.field2877.field1603 == arg0) {
                class101 var5 = this.field2877;
                this.field2877 = this.field2877.field1595;
                return var5;
            }
        }
        this.field2877 = null;
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lqa;", line = 59)
    public final class101 method1321(byte arg0) {
        if (arg0 >= -48) {
            this.method1330((byte) -124);
        }
        this.field2882 = 0;
        field2878++;
        return this.method1330((byte) -48);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I", line = 73)
    public final int method1322(int arg0) {
        field2880++;
        return arg0 == 14965 ? this.field2869 : -61;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B[Lqa;)I", line = 85)
    public final int method1323(byte arg0, class101[] arg1) {
        int var3 = 0;
        field2870++;
        if (arg0 != 89) {
            return 75;
        }
        for (int var4 = 0; var4 < this.field2869; var4++) {
            class101 var5 = this.field2872[var4];
            for (class101 var6 = var5.field1595; var6 != var5; var6 = var6.field1595) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZIFIII)[I", line = 115)
    public static final int[] method1324(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field2865++;
        int[] var8 = new int[arg0];
        class142 var9 = new class142();
        var9.field2152 = arg5;
        var9.field2159 = arg1;
        var9.field2148 = (int) (arg4 * 4096.0F);
        var9.field2146 = arg2;
        var9.field2147 = arg7;
        var9.field2142 = arg6;
        var9.method47(-9);
        if (arg3 <= 5) {
            return (int[]) null;
        } else {
            class257.method1741(1, 31497, arg0);
            var9.method1022(var8, 0, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 143)
    public static void method1325(int arg0) {
        field2884 = null;
        if (arg0 != -11224) {
            method1329((byte) 22);
        }
        field2875 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lqa;", line = 155)
    public final class101 method1326(byte arg0) {
        field2866++;
        if (this.field2877 == null) {
            return null;
        }
        class101 var2 = this.field2872[(int) (this.field2867 & (long) (this.field2869 - 1))];
        while (this.field2877 != var2) {
            if (this.field2877.field1603 == this.field2867) {
                class101 var3 = this.field2877;
                this.field2877 = this.field2877.field1595;
                return var3;
            }
            this.field2877 = this.field2877.field1595;
        }
        if (arg0 >= -65) {
            this.field2882 = 36;
        }
        this.field2877 = null;
        return null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 187)
    public final void method1327(byte arg0) {
        if (arg0 < 21) {
            this.method1330((byte) -125);
        }
        field2879++;
        for (int var2 = 0; var2 < this.field2869; var2++) {
            class101 var3 = this.field2872[var2];
            while (true) {
                class101 var4 = var3.field1595;
                if (var3 == var4) {
                    break;
                }
                var4.method714(122);
            }
        }
        this.field2877 = null;
        this.field2881 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I", line = 225)
    public final int method1328(int arg0) {
        field2873++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2869; var3++) {
            class101 var4 = this.field2872[var3];
            for (class101 var5 = var4.field1595; var5 != var4; var5 = var5.field1595) {
                var2++;
            }
        }
        if (arg0 != 2) {
            this.method1328(117);
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 258)
    public static final void method1329(byte arg0) {
        field2864++;
        if (arg0 != 88 || class191.field2852 != null || class145.field2197 != null) {
            return;
        }
        int var1 = class253.field3813;
        if (!class5.field27) {
            if (var1 == 1 && class190.field2829 > 0) {
                short var12 = class201.field2998[class190.field2829 - 1];
                if (var12 == 6 || var12 == 9 || var12 == 60 || var12 == 32 || var12 == 8 || var12 == 13 || var12 == 19 || var12 == 31 || var12 == 25 || var12 == 18 || var12 == 41 || var12 == 1003) {
                    int var13 = class193.field2893[class190.field2829 - 1];
                    int var14 = class178.field2633[class190.field2829 - 1];
                    class329 var15 = class80.method541((byte) 96, var14);
                    class21 var16 = client.method902(var15);
                    if (var16.method127(21828) || var16.method139(arg0 ^ 0x2CEA)) {
                        class179.field2652 = false;
                        class213.field3235 = 0;
                        if (class191.field2852 != null) {
                            class247.method1666(class191.field2852, arg0 ^ 0xFFFFFFDC);
                        }
                        class191.field2852 = class80.method541((byte) 96, var14);
                        class304.field4634 = var13;
                        class69.field910 = class28.field387;
                        class147.field2215 = class207.field3140;
                        class247.method1666(class191.field2852, -125);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class226.field3439 == 1 && class190.field2829 > 2 || class291.method2035((byte) 74, class190.field2829 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class190.field2829 > 0 || class115.field1761 == 1) {
                class281.method1963(true);
            }
            if (var1 == 1 && class190.field2829 > 0 || class115.field1761 == 2) {
                class298.method2076(false);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class132.field2036;
            int var3 = class237.field3557;
            if (class242.field3633 - 10 > var2 || var2 > class242.field3633 + class163.field2466 + 10 || var3 < (class23.field347 - 10) || class23.field347 + class176.field2609 + 10 < var3) {
                class5.field27 = false;
                class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class242.field3633;
        int var5 = class23.field347;
        int var6 = class207.field3140;
        int var7 = class163.field2466;
        int var8 = class28.field387;
        int var9 = -1;
        for (int var10 = 0; var10 < class190.field2829; var10++) {
            int var11;
            if (class30.field401) {
                var11 = var5 - (-(class190.field2829 - var10 - 1) * 15 - 35);
            } else {
                var11 = (class190.field2829 - (var10 + 1)) * 15 + var5 + 31;
            }
            if (var4 < var6 && var6 < var4 + var7 && var8 > var11 - 13 && (var11 + 3) > var8) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class248.method1675(0, var9);
        }
        class5.field27 = false;
        class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)Lqa;", line = 393)
    public final class101 method1330(byte arg0) {
        field2876++;
        if (this.field2882 > 0 && this.field2872[this.field2882 - 1] != this.field2881) {
            class101 var2 = this.field2881;
            this.field2881 = var2.field1595;
            return var2;
        }
        if (arg0 >= 0) {
            this.method1322(-128);
        }
        class101 var3;
        do {
            if (this.field2869 <= this.field2882) {
                return null;
            }
            var3 = this.field2872[this.field2882++].field1595;
        } while (this.field2872[this.field2882 - 1] == var3);
        this.field2881 = var3.field1595;
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 432)
    public static final void method1331(int arg0, int arg1) {
        field2868++;
        class151.field2275[1] = (float) class124.method893(255, arg0 >> 8) / 255.0F;
        class151.field2275[0] = (float) (class124.method893(arg0, 16758472) >> 16) / 255.0F;
        class151.field2275[2] = (float) class124.method893(255, arg0) / 255.0F;
        class167.method1167(26022, 3);
        int var2 = -89 / ((-arg1 - 43) / 61);
        class167.method1167(26022, 4);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V", line = 444)
    public class192(int arg0) {
        this.field2869 = arg0;
        this.field2872 = new class101[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class101 var3 = this.field2872[var2] = new class101();
            var3.field1599 = var3;
            var3.field1595 = var3;
        }
    }
}
