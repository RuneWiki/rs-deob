import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class55 extends class115 {

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
    private int field762 = -1;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Lqe;")
    public static class168 field753 = class66.method448("compass", -112);

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Lqe;")
    private static class168 field751 = class66.method448("Players", -125);

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "Lqe;")
    public static class168 field756 = field751;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "Ljh;")
    public static class2 field755 = new class2(50);

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "Lqe;")
    public static class168 field765 = class66.method448("<col=ffff00>", -122);

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "Loe;")
    public static class256 field767;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field759;
        if (arg2 == 0) {
            this.field762 = arg1.method731(false);
        }
        if (arg0 != 107) {
            this.method388((byte) 97);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(III)V")
    public static final void method383(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class89.field1395; ++var3) {
            for (int var4 = 0; var4 < class90.field1406; ++var4) {
                for (int var5 = 0; var5 < class32.field386; ++var5) {
                    class177 var6 = class254.field4395[var3][var4][var5];
                    if (var6 != null) {
                        class162 var7 = var6.field3116;
                        if (var7 != null && var7.field2775.method42()) {
                            class169.method1124(var7.field2775, var3, var4, var5, 1, 1);
                            if (var7.field2777 != null && var7.field2777.method42()) {
                                class169.method1124(var7.field2777, var3, var4, var5, 1, 1);
                                var7.field2775.method41(var7.field2777, 0, 0, 0, false);
                                var7.field2777 = var7.field2777.method51(arg0, arg1, arg2);
                            }
                            var7.field2775 = var7.field2775.method51(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3115; ++var8) {
                            class169 var10 = var6.field3090[var8];
                            if (var10 != null && var10.field2934.method42()) {
                                class169.method1124(var10.field2934, var3, var4, var5, var10.field2932 - var10.field2939 + 1, var10.field2936 - var10.field2923 + 1);
                                var10.field2934 = var10.field2934.method51(arg0, arg1, arg2);
                            }
                        }
                        class17 var9 = var6.field3101;
                        if (var9 != null && var9.field153.method42()) {
                            class96.method634(var9.field153, var3, var4, var5);
                            var9.field153 = var9.field153.method51(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field754;
        if (arg1 < 11) {
            this.method388((byte) 14);
        }
        int[][] var3 = super.field1882.method1242(arg0, 101);
        if (super.field1882.field3344 && this.method388((byte) 87)) {
            int var4 = (~class62.field855 != ~this.field748 ? this.field748 * arg0 / class62.field855 : arg0) * this.field764;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class130.field2297 != ~this.field764) {
                for (int var8 = 0; ~class130.field2297 < ~var8; ++var8) {
                    int var9 = this.field764 * var8 / class130.field2297;
                    int var10 = this.field752[var4 + var9];
                    var7[var8] = class86.method571(var10, 255) << 4;
                    var6[var8] = class86.method571(4080, var10 >> 4);
                    var5[var8] = class86.method571(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; class130.field2297 > var11; ++var11) {
                    int var12 = this.field752[var4++];
                    var7[var11] = class86.method571(255, var12) << 4;
                    var6[var11] = class86.method571(var12, 65280) >> 4;
                    var5[var11] = class86.method571(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
    public static final void method384(int arg0) {
        int var1 = 0;
        if (arg0 <= -61) {
            while (~class3.field30 < ~var1) {
                class127 var2 = class208.method1349(-108, var1);
                if (var2 != null && ~var2.field2112 == -1) {
                    class50.field682[var1] = 0;
                    class92.field1441[var1] = 0;
                }
                ++var1;
            }
            class104.field1673 = new class236(16);
            ++field758;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field756 = null;
        field765 = null;
        if (arg0 != 122) {
            method386((byte) -12);
        }
        field751 = null;
        field753 = null;
        field767 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public final void method208(int arg0) {
        ++field757;
        super.method208(arg0);
        this.field752 = null;
        if (arg0 != 12801) {
            field753 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static final void method386(byte arg0) {
        if (arg0 != 44) {
            field767 = null;
        }
        int var1 = -((int) ((double) class122.field2021.field2175 / class167.field2852)) + class151.field2629;
        int var2 = (int) ((double) class122.field2021.field2175 / class167.field2852) + class151.field2629;
        int var3 = -((int) ((double) class122.field2021.field2210 / class167.field2852)) + class91.field1423;
        ++field750;
        if (var1 < 0) {
            class27.field342 = -1;
            class151.field2629 = (int) ((double) class122.field2021.field2175 / class167.field2852);
            class68.field971 = -1;
        }
        if (var2 > class79.field1189) {
            class151.field2629 = -((int) ((double) class122.field2021.field2175 / class167.field2852)) + class79.field1189;
            class68.field971 = -1;
            class27.field342 = -1;
        }
        int var4 = (int) ((double) class122.field2021.field2210 / class167.field2852) + class91.field1423;
        if (var3 < 0) {
            class68.field971 = -1;
            class27.field342 = -1;
            class91.field1423 = (int) ((double) class122.field2021.field2210 / class167.field2852);
        }
        if (var4 > class42.field552) {
            class27.field342 = -1;
            class91.field1423 = -((int) ((double) class122.field2021.field2210 / class167.field2852)) + class42.field552;
            class68.field971 = -1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class55() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)I")
    public final int method387(int arg0) {
        if (arg0 != -28800) {
            this.method387(-78);
        }
        ++field763;
        return this.field762;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)Z")
    private final boolean method388(byte arg0) {
        ++field749;
        if (arg0 != 87) {
            this.method208(-125);
        }
        if (this.field752 != null) {
            return true;
        } else if (this.field762 >= 0) {
            int var2 = class130.field2297;
            int var3 = class62.field855;
            int var4 = class158.field2735.method686(this.field762, (byte) 121) ? 64 : 128;
            this.field752 = class158.field2735.method674(this.field762, arg0 ^ 86);
            this.field764 = var4;
            this.field748 = var4;
            class100.method658(var2, var3, (byte) -78);
            return this.field752 != null;
        } else {
            return false;
        }
    }
}
