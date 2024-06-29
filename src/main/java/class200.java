import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class200 implements class343 {

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lse;")
    private class138 field2848 = new class138(256);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Ltq;")
    private class376 field2843;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ltq;")
    private class376 field2845;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[Lwm;")
    private class336[] field2854;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    public static int[] field2844 = new int[14];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2856 = null;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field2857 = new int[50];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 4)
    public static void method1322(byte arg0) {
        if (arg0 >= -23) {
            field2856 = null;
        }
        field2844 = null;
        field2856 = null;
        field2857 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILae;)V", line = 16)
    public static final void method1323(int arg0, class134 arg1) {
        field2853++;
        int var2 = class8.field120;
        int var3 = class379.field5341;
        if (arg0 <= 104) {
            field2844 = null;
        }
        int var4 = class113.field1393;
        int var5 = class302.field4246;
        int var6 = -10660793;
        arg1.method827(var3, var2, var5, -120, var4, var6);
        arg1.method827(var3 + 1, var2 - -1, 16, -91, var4 - 2, -16777216);
        arg1.method830(-16777216, 1, var5 - 19, var4 + -2, var3 + 18, var2 + 1);
        class174.field2391.method1767(-1, var2 + 3, var6, class193.field2764.method2331(25, class271.field3836), var3 + 14, 4);
        int var7 = class306.field4306.method17(20417);
        int var8 = class306.field4306.method18(1);
        int var9 = 0;
        for (class302 var10 = (class302) class393.field5547.method506((byte) -128); var10 != null; var10 = (class302) class393.field5547.method514(true)) {
            int var11 = var3 - (-((class208.field2958 - var9 - 1) * 16) - 31);
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > (var11 - 13) && var11 + 3 > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class174.method1191(var10.field4247, (byte) -110)) {
                var13 = class50.method288(0, (int) var10.field4250).field2295;
            } else if (class422.method2666(var10.field4247, -8164)) {
                class77 var14 = class167.field2335[(int) var10.field4250];
                if (var14 != null) {
                    var13 = var14.field912.field1639;
                }
            } else if (class327.method2117(var10.field4247, 19)) {
                if (var10.field4247 == 1009) {
                    var13 = class374.method2382((int) var10.field4250, false).field1051;
                } else {
                    var13 = class374.method2382((int) (var10.field4250 >>> 32 & 0x7FFFFFFFL), false).field1051;
                }
            }
            String var15 = class359.method2309(0, var10);
            if (var13 != null) {
                var15 = var15 + class309.method2047(0, var13);
            }
            var9++;
            class174.field2391.method1771(class222.field3112, 0, var11, var2 + 3, var15, var12, class170.field2351, 0);
        }
        class254.method1716(class113.field1393, class302.field4246, class8.field120, -111, class379.field5341);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIFII)[I", line = 99)
    public final int[] method1324(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg4 != 1580) {
            this.method1327(-97, -45);
        }
        field2855++;
        return this.method1327(-2, arg1).method2220(this.field2845, arg2, this, this.field2854[arg1].field4782, arg5, (double) arg3, 0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIFIIZ)[I", line = 114)
    public final int[] method1325(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        field2842++;
        if (arg0 != 4692) {
            this.field2845 = null;
        }
        return this.method1327(-2, arg3).method2216(this.field2845, this.field2854[arg3].field4782, arg1, this, (double) arg2, arg5, arg4, (byte) 86);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIIIF)[F", line = 135)
    public final float[] method1326(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg1 < 97) {
            return null;
        } else {
            field2852++;
            return this.method1327(-2, arg3).method2214(arg2, arg4, this.field2854[arg3].field4782, 0, this, this.field2845);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lv;", line = 146)
    private final class347 method1327(int arg0, int arg1) {
        field2849++;
        if (arg0 != -2) {
            return null;
        }
        class331 var3 = this.field2848.method856((long) arg1, (byte) 123);
        if (var3 != null) {
            return (class347) var3;
        }
        byte[] var4 = this.field2843.method2420(arg1, -1);
        if (var4 == null) {
            return null;
        } else {
            class347 var5 = new class347(new class236(var4));
            this.field2848.method849((byte) 63, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)Z", line = 175)
    public final boolean method1328(byte arg0, int arg1) {
        field2846++;
        int var3 = -118 / ((arg0 - 47) / 36);
        class347 var4 = this.method1327(-2, arg1);
        return var4 != null && var4.method2217(-28657, this, this.field2845);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lwm;", line = 188)
    public final class336 method1329(byte arg0, int arg1) {
        if (arg0 >= -12) {
            field2856 = null;
        }
        field2850++;
        return this.field2854[arg1];
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ltq;Ltq;Ltq;)V", line = 209)
    public class200(class376 arg0, class376 arg1, class376 arg2) {
        this.field2843 = arg1;
        this.field2845 = arg2;
        class236 var4 = new class236(arg0.method2431((byte) 83, 0, 0));
        int var5 = var4.method1617((byte) 48);
        this.field2854 = new class336[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1574(-37) == 1) {
                this.field2854[var6] = new class336();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2854[var7] != null) {
                this.field2854[var7].field4766 = var4.method1574(-6) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2854[var8] != null) {
                this.field2854[var8].field4774 = var4.method1574(-54) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2854[var9] != null) {
                this.field2854[var9].field4768 = var4.method1574(-94) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2854[var10] != null) {
                this.field2854[var10].field4780 = var4.method1574(-71) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2854[var11] != null) {
                this.field2854[var11].field4777 = var4.method1589(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2854[var12] != null) {
                this.field2854[var12].field4765 = var4.method1589(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2854[var13] != null) {
                this.field2854[var13].field4770 = var4.method1589(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2854[var14] != null) {
                this.field2854[var14].field4779 = var4.method1589(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2854[var15] != null) {
                this.field2854[var15].field4778 = (short) var4.method1617((byte) 48);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2854[var16] != null) {
                this.field2854[var16].field4767 = var4.method1589(false);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2854[var17] != null) {
                this.field2854[var17].field4772 = var4.method1589(false);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2854[var18] != null) {
                this.field2854[var18].field4781 = var4.method1574(-31) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2854[var19] != null) {
                this.field2854[var19].field4782 = var4.method1574(-96) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2854[var20] != null) {
                this.field2854[var20].field4775 = var4.method1589(false);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2854[var21] != null) {
                this.field2854[var21].field4769 = var4.method1574(-62) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2854[var22] != null) {
                this.field2854[var22].field4776 = var4.method1574(-65) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2854[var23] != null) {
                this.field2854[var23].field4773 = var4.method1574(-44) == 1;
            }
        }
    }
}
