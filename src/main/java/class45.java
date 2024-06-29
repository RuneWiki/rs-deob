import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    private int[] field713 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Z")
    public boolean field719 = false;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public int field716 = -1;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Z")
    public static boolean field726 = false;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lcf;")
    public static class93 field723 = class147.method1066("Titelbild geladen)3", -48);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Llj;")
    public static class25 field712 = new class25(16);

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Lnh;")
    public static class54 field733 = new class54(64);

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lcf;")
    public static class93 field734 = class147.method1066("Chargement de l(W-Bcran)2titre )2 ", -48);

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lcf;")
    private static class93 field736 = class147.method1066("Loaded update list", -48);

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lcf;")
    public static class93 field735 = field736;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "[I")
    private int[] field728;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[S")
    private short[] field717;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[S")
    private short[] field721;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "[S")
    private short[] field722;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "[S")
    private short[] field730;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class210.field3821 * 128) {
            arg0 = class210.field3821 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class256.field4623 * 128) {
            arg2 = class256.field4623 * 128 - 1;
        }
        class218.field3981 = class179.field3155[arg3];
        class266.field4734 = class179.field3158[arg3];
        class53.field867 = class179.field3155[arg4];
        class40.field624 = class179.field3158[arg4];
        class166.field2931 = arg0;
        class263.field4692 = arg1;
        class272.field4825 = arg2;
        class206.field3703 = arg0 / 128;
        class133.field2335 = arg2 / 128;
        class246.field4427 = class206.field3703 - class11.field153;
        if (class246.field4427 < 0) {
            class246.field4427 = 0;
        }
        class37.field560 = class133.field2335 - class11.field153;
        if (class37.field560 < 0) {
            class37.field560 = 0;
        }
        class273.field4862 = class206.field3703 + class11.field153;
        if (class273.field4862 > class210.field3821) {
            class273.field4862 = class210.field3821;
        }
        class5.field65 = class133.field2335 + class11.field153;
        if (class5.field65 > class256.field4623) {
            class5.field65 = class256.field4623;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class11.field153 + class11.field153 + 2; var16++) {
            for (int var19 = 0; var19 < class11.field153 + class11.field153 + 2; var19++) {
                int var20 = (var16 - class11.field153 << 7) - (class166.field2931 & 0x7F);
                int var21 = (var19 - class11.field153 << 7) - (class272.field4825 & 0x7F);
                int var22 = class206.field3703 + var16 - class11.field153;
                int var23 = class133.field2335 + var19 - class11.field153;
                if (var22 >= 0 && var23 >= 0 && var22 < class210.field3821 && var23 < class256.field4623) {
                    int var24;
                    if (class270.field4815 == null) {
                        var24 = class69.field1265[0][var22][var23] + 128 - class263.field4692;
                    } else {
                        var24 = class270.field4815[0][var22][var23] + 128 - class263.field4692;
                    }
                    int var25 = class69.field1265[3][var22][var23] - class263.field4692 - 1000;
                    class167.field2953[var16][var19] = class102.method747(var20, var25, var24, var21, var15);
                } else {
                    class167.field2953[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class11.field153 + class11.field153 + 1; var17++) {
            for (int var18 = 0; var18 < class11.field153 + class11.field153 + 1; var18++) {
                class15.field200[var17][var18] = class167.field2953[var17][var18] || class167.field2953[var17 + 1][var18] || class167.field2953[var17][var18 + 1] || class167.field2953[var17 + 1][var18 + 1];
            }
        }
        class213.field3905 = arg6;
        class103.field1798 = arg7;
        class35.field540 = arg8;
        class199.field3611 = arg9;
        class200.field3627 = arg10;
        class271.method1802();
        if (class193.field3543 != null) {
            class231.method1582(true);
            class168.method1213(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class231.method1582(false);
        }
        class168.method1213(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method248(int arg0) {
        field733 = null;
        field734 = null;
        field736 = null;
        field735 = null;
        if (arg0 < 43) {
            field736 = null;
        }
        field723 = null;
        field712 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Ljf;")
    public final class64 method249(int arg0) {
        field718++;
        class64[] var2 = new class64[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field713[var4] != -1) {
                var2[var3++] = class64.method443(class130.field2299, this.field713[var4], 0);
            }
        }
        if (arg0 >= -118) {
            this.method256(87);
        }
        class64 var5 = new class64(var2, var3);
        if (this.field717 != null) {
            for (int var6 = 0; var6 < this.field717.length; var6++) {
                var5.method433(this.field717[var6], this.field722[var6]);
            }
        }
        if (this.field721 != null) {
            for (int var7 = 0; var7 < this.field721.length; var7++) {
                var5.method448(this.field721[var7], this.field730[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        int var1 = 0;
        int var2 = 72 / ((-arg0 - 74) / 35);
        while (var1 < class72.field1299) {
            int var3 = class58.field995[var1];
            class227 var4 = class155.field2709[var3];
            if (var4 != null) {
                class35.method207(var4, var4.field4062.field2504, (byte) -125);
            }
            var1++;
        }
        field714++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lee;B)V")
    public final void method251(class280 arg0, byte arg1) {
        int var3 = 24 % ((arg1 + 79) / 35);
        while (true) {
            int var4 = arg0.method1907(16832);
            if (var4 == 0) {
                field715++;
                return;
            }
            this.method253(arg0, (byte) 83, var4);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ls;Z)V")
    public static final void method252(class237 arg0, boolean arg1) {
        if (!arg1) {
            method252((class237) null, false);
        }
        field731++;
        class43 var2 = (class43) class117.field2064.method135(arg0.field4247.method679((byte) 56), arg1);
        if (var2 == null) {
            return;
        }
        if (var2.field671 != null) {
            class35.field543.method1657(var2.field671);
            var2.field671 = null;
        }
        var2.method1544((byte) -125);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lee;BI)V")
    private final void method253(class280 arg0, byte arg1, int arg2) {
        if (arg1 <= 58) {
            return;
        }
        field724++;
        if (arg2 == 1) {
            this.field716 = arg0.method1907(16832);
        } else if (arg2 == 2) {
            int var4 = arg0.method1907(16832);
            this.field728 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field728[var5] = arg0.method1891(-123);
            }
        } else if (arg2 == 3) {
            this.field719 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1907(16832);
            this.field722 = new short[var6];
            this.field717 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field717[var7] = (short) arg0.method1891(-123);
                this.field722[var7] = (short) arg0.method1891(-111);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method1907(16832);
            this.field721 = new short[var8];
            this.field730 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field721[var9] = (short) arg0.method1891(-121);
                this.field730[var9] = (short) arg0.method1891(-119);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field713[arg2 - 60] = arg0.method1891(-123);
            return;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Ljf;")
    public final class64 method254(byte arg0) {
        field725++;
        if (this.field728 == null) {
            return null;
        }
        class64[] var2 = new class64[this.field728.length];
        for (int var3 = 0; var3 < this.field728.length; var3++) {
            var2[var3] = class64.method443(class130.field2299, this.field728[var3], 0);
        }
        if (arg0 > -53) {
            field733 = null;
        }
        class64 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class64(var2, var2.length);
        }
        if (this.field717 != null) {
            for (int var5 = 0; var5 < this.field717.length; var5++) {
                var4.method433(this.field717[var5], this.field722[var5]);
            }
        }
        if (this.field721 != null) {
            for (int var6 = 0; var6 < this.field721.length; var6++) {
                var4.method448(this.field721[var6], this.field730[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
    public final boolean method255(byte arg0) {
        boolean var2 = true;
        if (arg0 != -57) {
            method248(38);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field713[var3] != -1 && !class130.field2299.method1287(0, this.field713[var3], (byte) -65)) {
                var2 = false;
            }
        }
        field727++;
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Z")
    public final boolean method256(int arg0) {
        field720++;
        if (this.field728 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field728.length; var3++) {
            if (!class130.field2299.method1287(0, this.field728[var3], (byte) -65)) {
                var2 = false;
            }
        }
        return var2;
    }
}
