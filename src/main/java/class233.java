import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class233 extends class38 {

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lhi;")
    public class282 field3826 = new class282();

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Lgl;")
    public class184 field3834 = new class184();

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Lth;")
    private class80 field3824;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field3832 = -1;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "Lch;")
    public static class133 field3821 = new class133(16);

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Lqd;")
    private static class40 field3835 = class147.method1106("Prepared sound engine", (byte) -57);

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Lqd;")
    public static class40 field3837 = class147.method1106("W-=hlen Sie eine Option", (byte) -90);

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lqd;")
    public static class40 field3841 = class147.method1106("::", (byte) -78);

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field3845 = 0;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Lqd;")
    public static class40 field3842 = field3835;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Lce;")
    public static class239 field3818;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Ljava/awt/Image;")
    public static Image field3838;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llm;II[III)V", line = 4)
    private final void method1614(class45 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field3829++;
        if ((this.field3824.field1366[arg0.field869] & 0x4) != 0 && arg0.field883 < 0) {
            int var7 = this.field3824.field1395[arg0.field869] / class25.field448;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field886) / var7;
                if (var8 > arg1) {
                    arg0.field886 += arg1 * var7;
                    break;
                }
                arg0.field868.method319(arg3, arg5, var8);
                arg0.field886 += var7 * var8 - 1048576;
                arg5 += var8;
                arg1 -= var8;
                int var9 = class25.field448 / 100;
                int var10 = 262144 / var7;
                class145 var11 = arg0.field868;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field3824.field1378[arg0.field869] == 0) {
                    arg0.field868 = class145.method1085(arg0.field864, var11.method1078(), var11.method1089(), var11.method1073());
                } else {
                    arg0.field868 = class145.method1085(arg0.field864, var11.method1078(), 0, var11.method1073());
                    this.field3824.method626(arg0, arg0.field872.field183[arg0.field865] < 0, true);
                    arg0.field868.method1065(var9, var11.method1089());
                }
                if (arg0.field872.field183[arg0.field865] < 0) {
                    arg0.field868.method1090(-1);
                }
                var11.method1091(var9);
                var11.method319(arg3, arg5, arg2 - arg5);
                if (var11.method1084()) {
                    this.field3834.method1331(var11);
                }
            }
        }
        if (arg4 != 17880) {
            method1621(24, (class40[]) null, 118, (short[]) null, 31);
        }
        arg0.field868.method319(arg3, arg5, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()Lcg;", line = 71)
    public final class38 method320() {
        field3830++;
        class45 var1;
        do {
            var1 = (class45) this.field3826.method1967(100);
            if (var1 == null) {
                return null;
            }
        } while (var1.field868 == null);
        return var1.field868;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 97)
    public static void method1615(int arg0) {
        field3838 = null;
        field3821 = null;
        field3818 = null;
        field3841 = null;
        field3842 = null;
        if (arg0 != 8) {
            field3818 = (class239) null;
        }
        field3837 = null;
        field3835 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lue;Z)V", line = 117)
    public static final void method1616(class14 arg0, boolean arg1) {
        class299.field4990.method1972(arg0, 112);
        while (true) {
            class14 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class14[][] var7;
            class14 var78;
            do {
                class14 var77;
                do {
                    class14 var76;
                    do {
                        class14 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class14) class299.field4990.method1969(100);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field218);
                                            var3 = var2.field239;
                                            var4 = var2.field233;
                                            var5 = var2.field229;
                                            var6 = var2.field217;
                                            var7 = class93.field1690[var5];
                                            float var8 = 0.0F;
                                            if (class21.field350) {
                                                if (class78.field1316 == class160.field2687) {
                                                    int var9 = class103.field1807[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class286.field4816 != var10) {
                                                        class286.field4816 = var10;
                                                        class146.method1101((byte) -109, var10);
                                                        class273.method1892(class87.method674(0));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class306.field5131 != var11) {
                                                        class306.field5131 = var11;
                                                        class55.method473(var11, (byte) -95);
                                                    }
                                                    int var12 = class244.field4020[0][var3 + 1][var4] + class244.field4020[0][var3][var4] + class244.field4020[0][var3][var4 + 1] + class244.field4020[0][var3 + 1][var4 + 1] >> 2;
                                                    class60.method504(-var12, 3, 20789);
                                                    var8 = 201.5F;
                                                    class21.method133(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class21.method133(var8);
                                                }
                                            }
                                            if (!var2.field223) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class14 var13 = class93.field1690[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field218) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class213.field3431 && var3 > class42.field797) {
                                                    class14 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field218 && (var14.field223 || (var2.field221 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class213.field3431 && var3 < class116.field1992 - 1) {
                                                    class14 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field218 && (var15.field223 || (var2.field221 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class189.field3075 && var4 > class313.field5294) {
                                                    class14 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field218 && (var16.field223 || (var2.field221 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class189.field3075 && var4 < class301.field5051 - 1) {
                                                    class14 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field218 && (var17.field223 || (var2.field221 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field223 = false;
                                            if (var2.field238 != null) {
                                                class14 var18 = var2.field238;
                                                if (class21.field350) {
                                                    class21.method133(201.5F - (float) (var18.field217 + 1) * 50.0F);
                                                }
                                                if (var18.field220 == null) {
                                                    if (var18.field231 != null) {
                                                        if (class188.method1354(0, var3, var4)) {
                                                            class308.method2104(var18.field231, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, true);
                                                        } else {
                                                            class308.method2104(var18.field231, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class188.method1354(0, var3, var4)) {
                                                    class193.method1380(var18.field220, 0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, true);
                                                } else {
                                                    class193.method1380(var18.field220, 0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, false);
                                                }
                                                class302 var19 = var18.field235;
                                                if (var19 != null) {
                                                    if (class21.field350) {
                                                        if ((var19.field5067 & var2.field215) == 0) {
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                        } else {
                                                            class84.method638(var19.field5067, class208.field3331, class48.field940, class180.field2939, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field5059.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var19.field5062 - class208.field3331, var19.field5071 - class48.field940, var19.field5063 - class180.field2939, var19.field5061);
                                                }
                                                for (int var20 = 0; var20 < var18.field216; var20++) {
                                                    class193 var21 = var18.field230[var20];
                                                    if (var21 != null) {
                                                        if (class21.field350) {
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                        }
                                                        var21.field3106.method77(var21.field3109, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var21.field3111 - class208.field3331, var21.field3102 - class48.field940, var21.field3118 - class180.field2939, var21.field3101);
                                                    }
                                                }
                                                if (class21.field350) {
                                                    class21.method133(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field220 == null) {
                                                if (var2.field231 != null) {
                                                    if (class188.method1354(var6, var3, var4)) {
                                                        class308.method2104(var2.field231, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class308.method2104(var2.field231, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, false);
                                                    }
                                                }
                                            } else if (class188.method1354(var6, var3, var4)) {
                                                class193.method1380(var2.field220, var6, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field220.field639 != 12345678 || class55.field1070 && var5 <= class116.field1989) {
                                                    class193.method1380(var2.field220, var6, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class102 var23 = var2.field222;
                                                if (var23 != null && (var23.field1804 & 0x80000000L) != 0L) {
                                                    if (class21.field350 && var23.field1794) {
                                                        class21.method133(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    var23.field1790.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var23.field1788 - class208.field3331, var23.field1792 - class48.field940, var23.field1795 - class180.field2939, var23.field1804);
                                                    if (class21.field350 && var23.field1794) {
                                                        class21.method133(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class302 var26 = var2.field235;
                                            class20 var27 = var2.field225;
                                            if (var26 != null || var27 != null) {
                                                if (class213.field3431 == var3) {
                                                    var24++;
                                                } else if (class213.field3431 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class189.field3075 == var4) {
                                                    var24 += 3;
                                                } else if (class189.field3075 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class188.field3028[var24];
                                                var2.field215 = class58.field1128[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field5067 & class91.field1659[var24]) == 0) {
                                                    var2.field226 = 0;
                                                } else if (var26.field5067 == 16) {
                                                    var2.field226 = 3;
                                                    var2.field237 = class263.field4409[var24];
                                                    var2.field236 = 3 - var2.field237;
                                                } else if (var26.field5067 == 32) {
                                                    var2.field226 = 6;
                                                    var2.field237 = class162.field2700[var24];
                                                    var2.field236 = 6 - var2.field237;
                                                } else if (var26.field5067 == 64) {
                                                    var2.field226 = 12;
                                                    var2.field237 = class14.field213[var24];
                                                    var2.field236 = 12 - var2.field237;
                                                } else {
                                                    var2.field226 = 9;
                                                    var2.field237 = class9.field137[var24];
                                                    var2.field236 = 9 - var2.field237;
                                                }
                                                if ((var26.field5067 & var25) != 0 && !class213.method1500(var6, var3, var4, var26.field5067)) {
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    var26.field5059.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var26.field5062 - class208.field3331, var26.field5071 - class48.field940, var26.field5063 - class180.field2939, var26.field5061);
                                                }
                                                if ((var26.field5064 & var25) != 0 && !class213.method1500(var6, var3, var4, var26.field5064)) {
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    var26.field5066.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var26.field5062 - class208.field3331, var26.field5071 - class48.field940, var26.field5063 - class180.field2939, var26.field5061);
                                                }
                                            }
                                            if (var27 != null && !class284.method1976(var6, var3, var4, var27.field343.method74())) {
                                                if (class21.field350) {
                                                    class21.method133(var8 - 0.5F);
                                                }
                                                if ((var27.field337 & var25) != 0) {
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    var27.field343.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var27.field346 + var27.field342 - class208.field3331, var27.field330 - class48.field940, var27.field332 + var27.field333 - class180.field2939, var27.field338);
                                                } else if (var27.field337 == 256) {
                                                    int var28 = var27.field346 - class208.field3331;
                                                    int var29 = var27.field330 - class48.field940;
                                                    int var30 = var27.field332 - class180.field2939;
                                                    int var31 = var27.field344;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class21.field350) {
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                        }
                                                        var27.field343.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var27.field342 + var28, var29, var27.field333 + var30, var27.field338);
                                                    } else if (var27.field335 != null) {
                                                        if (class21.field350) {
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                        }
                                                        var27.field335.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var28, var29, var30, var27.field338);
                                                    }
                                                }
                                                if (class21.field350) {
                                                    class21.method133(var8);
                                                }
                                            }
                                            if (var22) {
                                                class102 var34 = var2.field222;
                                                if (var34 != null && (var34.field1804 & 0x80000000L) == 0L) {
                                                    if (class21.field350 && var34.field1794) {
                                                        class21.method133(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    var34.field1790.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var34.field1788 - class208.field3331, var34.field1792 - class48.field940, var34.field1795 - class180.field2939, var34.field1804);
                                                    if (class21.field350 && var34.field1794) {
                                                        class21.method133(var8);
                                                    }
                                                }
                                                class299 var35 = var2.field232;
                                                if (var35 != null && var35.field4999 == 0) {
                                                    if (class21.field350) {
                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                    }
                                                    if (var35.field4991 != null) {
                                                        var35.field4991.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var35.field4997 - class208.field3331, var35.field4993 - class48.field940, var35.field4995 - class180.field2939, var35.field5006);
                                                    }
                                                    if (var35.field4992 != null) {
                                                        var35.field4992.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var35.field4997 - class208.field3331, var35.field4993 - class48.field940, var35.field4995 - class180.field2939, var35.field5006);
                                                    }
                                                    if (var35.field5007 != null) {
                                                        var35.field5007.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var35.field4997 - class208.field3331, var35.field4993 - class48.field940, var35.field4995 - class180.field2939, var35.field5006);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field221;
                                            if (var36 != 0) {
                                                if (var3 < class213.field3431 && (var36 & 0x4) != 0) {
                                                    class14 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field218) {
                                                        class299.field4990.method1972(var37, -105);
                                                    }
                                                }
                                                if (var4 < class189.field3075 && (var36 & 0x2) != 0) {
                                                    class14 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field218) {
                                                        class299.field4990.method1972(var38, 105);
                                                    }
                                                }
                                                if (var3 > class213.field3431 && (var36 & 0x1) != 0) {
                                                    class14 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field218) {
                                                        class299.field4990.method1972(var39, -98);
                                                    }
                                                }
                                                if (var4 > class189.field3075 && (var36 & 0x8) != 0) {
                                                    class14 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field218) {
                                                        class299.field4990.method1972(var40, 104);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field226 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field216; var42++) {
                                                if (class81.field1425 != var2.field230[var42].field3117 && (var2.field219[var42] & var2.field226) == var2.field237) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class302 var43 = var2.field235;
                                                if (!class213.method1500(var6, var3, var4, var43.field5067)) {
                                                    if (class21.field350) {
                                                        label882: {
                                                            if ((var43.field5061 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field5062 - class208.field3331;
                                                                int var45 = var43.field5063 - class180.field2939;
                                                                int var46 = (int) (var43.field5061 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class285.field4807 - 1) {
                                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class90.field1632 - 1 && var4 < class285.field4807 - 1) {
                                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class90.field1632 - 1 && var4 > 0) {
                                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field5059.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var43.field5062 - class208.field3331, var43.field5071 - class48.field940, var43.field5063 - class180.field2939, var43.field5061);
                                                }
                                                var2.field226 = 0;
                                            }
                                        }
                                        if (!var2.field214) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field216;
                                            var2.field214 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class193 var50 = var2.field230[var49];
                                                if (class81.field1425 != var50.field3117) {
                                                    for (int var51 = var50.field3107; var51 <= var50.field3112; var51++) {
                                                        for (int var52 = var50.field3108; var52 <= var50.field3115; var52++) {
                                                            class14 var53 = var7[var51][var52];
                                                            if (var53.field223) {
                                                                var2.field214 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field226 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3107) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3112) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3108) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3115) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field226) == var2.field236) {
                                                                    var2.field214 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class195.field3137[var48++] = var50;
                                                    int var55 = class213.field3431 - var50.field3107;
                                                    int var56 = var50.field3112 - class213.field3431;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class189.field3075 - var50.field3108;
                                                    int var58 = var50.field3115 - class189.field3075;
                                                    if (var58 > var57) {
                                                        var50.field3113 = var55 + var58;
                                                    } else {
                                                        var50.field3113 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class193 var62 = class195.field3137[var61];
                                                    if (class81.field1425 != var62.field3117) {
                                                        if (var62.field3113 > var59) {
                                                            var59 = var62.field3113;
                                                            var60 = var61;
                                                        } else if (var62.field3113 == var59) {
                                                            int var63 = var62.field3111 - class208.field3331;
                                                            int var64 = var62.field3118 - class180.field2939;
                                                            int var65 = class195.field3137[var60].field3111 - class208.field3331;
                                                            int var66 = class195.field3137[var60].field3118 - class180.field2939;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class193 var67 = class195.field3137[var60];
                                                var67.field3117 = class81.field1425;
                                                if (!class173.method1274(var6, var67.field3107, var67.field3112, var67.field3108, var67.field3115, var67.field3106.method74())) {
                                                    if (class21.field350) {
                                                        if ((var67.field3101 & 0xFC000L) == 147456L) {
                                                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                                                            int var68 = var67.field3111 - class208.field3331;
                                                            int var69 = var67.field3118 - class180.field2939;
                                                            int var70 = (int) (var67.field3101 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class84.method652(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class84.method652(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class84.method652(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class84.method652(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class84.method643(class208.field3331, class48.field940, class180.field2939, var5, var67.field3107, var67.field3108, var67.field3112, var67.field3115);
                                                        }
                                                    }
                                                    var67.field3106.method77(var67.field3109, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var67.field3111 - class208.field3331, var67.field3102 - class48.field940, var67.field3118 - class180.field2939, var67.field3101);
                                                }
                                                for (int var71 = var67.field3107; var71 <= var67.field3112; var71++) {
                                                    for (int var72 = var67.field3108; var72 <= var67.field3115; var72++) {
                                                        class14 var73 = var7[var71][var72];
                                                        if (var73.field226 != 0) {
                                                            class299.field4990.method1972(var73, -115);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field218) {
                                                            class299.field4990.method1972(var73, 79);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field214) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field214 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field218);
                            } while (var2.field226 != 0);
                            if (var3 > class213.field3431 || var3 <= class42.field797) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field218);
                        if (var3 < class213.field3431 || var3 >= class116.field1992 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field218);
                    if (var4 > class189.field3075 || var4 <= class313.field5294) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field218);
                if (var4 < class189.field3075 || var4 >= class301.field5051 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field218);
            var2.field218 = false;
            class60.field1150--;
            class299 var79 = var2.field232;
            if (var79 != null && var79.field4999 != 0) {
                if (class21.field350) {
                    class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                }
                if (var79.field4991 != null) {
                    var79.field4991.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var79.field4997 - class208.field3331, var79.field4993 - class48.field940 - var79.field4999, var79.field4995 - class180.field2939, var79.field5006);
                }
                if (var79.field4992 != null) {
                    var79.field4992.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var79.field4997 - class208.field3331, var79.field4993 - class48.field940 - var79.field4999, var79.field4995 - class180.field2939, var79.field5006);
                }
                if (var79.field5007 != null) {
                    var79.field5007.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var79.field4997 - class208.field3331, var79.field4993 - class48.field940 - var79.field4999, var79.field4995 - class180.field2939, var79.field5006);
                }
            }
            if (var2.field215 != 0) {
                class20 var80 = var2.field225;
                if (var80 != null && !class284.method1976(var6, var3, var4, var80.field343.method74())) {
                    if ((var80.field337 & var2.field215) != 0) {
                        if (class21.field350) {
                            class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                        }
                        var80.field343.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var80.field346 + var80.field342 - class208.field3331, var80.field330 - class48.field940, var80.field332 + var80.field333 - class180.field2939, var80.field338);
                    } else if (var80.field337 == 256) {
                        int var81 = var80.field346 - class208.field3331;
                        int var82 = var80.field330 - class48.field940;
                        int var83 = var80.field332 - class180.field2939;
                        int var84 = var80.field344;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class21.field350) {
                                class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                            }
                            var80.field343.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var80.field342 + var81, var82, var80.field333 + var83, var80.field338);
                        } else if (var80.field335 != null) {
                            if (class21.field350) {
                                class84.method646(class208.field3331, class48.field940, class180.field2939, var5, var3, var4);
                            }
                            var80.field335.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var81, var82, var83, var80.field338);
                        }
                    }
                }
                class302 var87 = var2.field235;
                if (var87 != null) {
                    if ((var87.field5064 & var2.field215) != 0 && !class213.method1500(var6, var3, var4, var87.field5064)) {
                        if (class21.field350) {
                            class84.method638(var87.field5064, class208.field3331, class48.field940, class180.field2939, var6, var3, var4);
                        }
                        var87.field5066.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var87.field5062 - class208.field3331, var87.field5071 - class48.field940, var87.field5063 - class180.field2939, var87.field5061);
                    }
                    if ((var87.field5067 & var2.field215) != 0 && !class213.method1500(var6, var3, var4, var87.field5067)) {
                        if (class21.field350) {
                            class84.method638(var87.field5067, class208.field3331, class48.field940, class180.field2939, var6, var3, var4);
                        }
                        var87.field5059.method77(0, class52.field1002, class221.field3680, class298.field4980, class257.field4276, var87.field5062 - class208.field3331, var87.field5071 - class48.field940, var87.field5063 - class180.field2939, var87.field5061);
                    }
                }
            }
            if (var5 < class294.field4942 - 1) {
                class14 var88 = class93.field1690[var5 + 1][var3][var4];
                if (var88 != null && var88.field218) {
                    class299.field4990.method1972(var88, 24);
                }
            }
            if (var3 < class213.field3431) {
                class14 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field218) {
                    class299.field4990.method1972(var89, 116);
                }
            }
            if (var4 < class189.field3075) {
                class14 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field218) {
                    class299.field4990.method1972(var90, 98);
                }
            }
            if (var3 > class213.field3431) {
                class14 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field218) {
                    class299.field4990.method1972(var91, 113);
                }
            }
            if (var4 > class189.field3075) {
                class14 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field218) {
                    class299.field4990.method1972(var92, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()I", line = 1102)
    public final int method321() {
        field3827++;
        return 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llm;II)V", line = 1113)
    private final void method1617(class45 arg0, int arg1, int arg2) {
        if ((this.field3824.field1366[arg0.field869] & 0x4) != 0 && arg0.field883 < 0) {
            int var4 = this.field3824.field1395[arg0.field869] / class25.field448;
            int var5 = (var4 + 1048575 - arg0.field886) / var4;
            arg0.field886 = arg2 * var4 + arg0.field886 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field3824.field1378[arg0.field869] == 0) {
                    arg0.field868 = class145.method1085(arg0.field864, arg0.field868.method1078(), arg0.field868.method1089(), arg0.field868.method1073());
                } else {
                    arg0.field868 = class145.method1085(arg0.field864, arg0.field868.method1078(), 0, arg0.field868.method1073());
                    this.field3824.method626(arg0, arg0.field872.field183[arg0.field865] < 0, true);
                }
                if (arg0.field872.field183[arg0.field865] < 0) {
                    arg0.field868.method1090(-1);
                }
                arg2 = arg0.field886 / var4;
            }
        }
        if (arg1 <= 48) {
            this.method319((int[]) null, 38, -107);
        }
        arg0.field868.method316(arg2);
        field3817++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()Lcg;", line = 1154)
    public final class38 method317() {
        field3819++;
        class45 var1 = (class45) this.field3826.method1971(100);
        if (var1 == null) {
            return null;
        } else if (var1.field868 == null) {
            return this.method320();
        } else {
            return var1.field868;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 1175)
    public final void method316(int arg0) {
        this.field3834.method316(arg0);
        field3820++;
        for (class45 var2 = (class45) this.field3826.method1971(100); var2 != null; var2 = (class45) this.field3826.method1967(100)) {
            if (!this.field3824.method629(var2, (byte) 107)) {
                int var3 = arg0;
                do {
                    if (var2.field890 >= var3) {
                        this.method1617(var2, 85, var3);
                        var2.field890 -= var3;
                        break;
                    }
                    this.method1617(var2, 57, var2.field890);
                    var3 -= var2.field890;
                } while (!this.field3824.method611(0, (int[]) null, var2, var3, 2));
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "([III)V", line = 1210)
    public final void method319(int[] arg0, int arg1, int arg2) {
        field3831++;
        this.field3834.method319(arg0, arg1, arg2);
        for (class45 var4 = (class45) this.field3826.method1971(100); var4 != null; var4 = (class45) this.field3826.method1967(100)) {
            if (!this.field3824.method629(var4, (byte) 116)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field890 >= var5) {
                        this.method1614(var4, var5, var5 + var6, arg0, 17880, var6);
                        var4.field890 -= var5;
                        break;
                    }
                    this.method1614(var4, var4.field890, var5 + var6, arg0, 17880, var6);
                    var6 += var4.field890;
                    var5 -= var4.field890;
                } while (!this.field3824.method611(var6, arg0, var4, var5, 2));
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILbb;)V", line = 1255)
    public static final void method1618(int arg0, class86 arg1) {
        field3823++;
        int var2 = arg1.field1505 - class256.field4266;
        int var3 = arg1.field1518 * 128 + arg1.method666(24207) * 64;
        int var4 = arg1.field1536 * 128 + (arg1.method666(24207) * 64);
        arg1.field1531 += (var3 - arg1.field1531) / var2;
        if (arg1.field1493 == 0) {
            arg1.field1521 = 1024;
        }
        arg1.field1497 += (var4 - arg1.field1497) / var2;
        int var5 = 93 % ((26 - arg0) / 60);
        if (arg1.field1493 == 1) {
            arg1.field1521 = 1536;
        }
        arg1.field1524 = 0;
        if (arg1.field1493 == 2) {
            arg1.field1521 = 0;
        }
        if (arg1.field1493 == 3) {
            arg1.field1521 = 512;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lbg;IIIII)V", line = 1287)
    public static final void method1619(class196 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class294.field4942 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class90.field1632) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class285.field4807 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class14 var14 = class93.field1690[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class78.field1316[var11][var12 + 1][var13] + class78.field1316[var11][var12][var13] + class78.field1316[var11][var12][var13 + 1] + class78.field1316[var11][var12 + 1][var13 + 1]) / 4 - (class78.field1316[arg1][arg2 + 1][arg3] + class78.field1316[arg1][arg2][arg3] + class78.field1316[arg1][arg2][arg3 + 1] + class78.field1316[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class302 var16 = var14.field235;
                                    if (var16 != null) {
                                        if (var16.field5059.method1180()) {
                                            arg0.method1159(var16.field5059, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field5066 != null && var16.field5066.method1180()) {
                                            arg0.method1159(var16.field5066, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field216; var17++) {
                                        class193 var18 = var14.field230[var17];
                                        if (var18 != null && var18.field3106.method1180() && (var18.field3107 == var12 || var7 == var12) && (var18.field3108 == var13 || var9 == var13)) {
                                            int var19 = var18.field3112 + 1 - var18.field3107;
                                            int var20 = var18.field3115 + 1 - var18.field3108;
                                            arg0.method1159(var18.field3106, (var18.field3107 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3108 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIIIII)V", line = 1392)
    public static final void method1620(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3822++;
        class131.method971(arg4, 23141);
        if (arg1 != 37) {
            return;
        }
        int var7 = arg4 - arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg4;
        int var10 = var7;
        int var11 = -arg4;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        if (arg0 >= class220.field3664 && class72.field1275 >= arg0) {
            int[] var15 = class37.field694[arg0];
            int var16 = class110.method827((byte) -78, arg6 - arg4, class48.field941, class125.field2164);
            int var17 = class110.method827((byte) 59, arg4 + arg6, class48.field941, class125.field2164);
            int var18 = class110.method827((byte) -97, arg6 - var7, class48.field941, class125.field2164);
            int var19 = class110.method827((byte) 106, arg6 + var7, class48.field941, class125.field2164);
            class150.method1124(var18, var16, arg3, true, var15);
            class150.method1124(var19, var18, arg2, true, var15);
            class150.method1124(var17, var19, arg3, true, var15);
        }
        while (var9 > var8) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            if (var12 >= 0 && var10 >= 1) {
                var10--;
                class303.field5075[var10] = var8;
                var12 -= var10 << 1;
            }
            var8++;
            var11 += var13;
            if (var11 >= 0) {
                var9--;
                int var20 = arg0 - var9;
                var11 -= var9 << 1;
                int var21 = arg0 + var9;
                if (class220.field3664 <= var21 && class72.field1275 >= var20) {
                    if (var9 < var7) {
                        int var22 = class303.field5075[var9];
                        int var23 = class110.method827((byte) 54, arg6 + var8, class48.field941, class125.field2164);
                        int var24 = class110.method827((byte) 96, arg6 - var8, class48.field941, class125.field2164);
                        int var25 = class110.method827((byte) 88, arg6 + var22, class48.field941, class125.field2164);
                        int var26 = class110.method827((byte) -54, arg6 - var22, class48.field941, class125.field2164);
                        if (var21 <= class72.field1275) {
                            int[] var27 = class37.field694[var21];
                            class150.method1124(var26, var24, arg3, true, var27);
                            class150.method1124(var25, var26, arg2, true, var27);
                            class150.method1124(var23, var25, arg3, true, var27);
                        }
                        if (var20 >= class220.field3664) {
                            int[] var28 = class37.field694[var20];
                            class150.method1124(var26, var24, arg3, true, var28);
                            class150.method1124(var25, var26, arg2, true, var28);
                            class150.method1124(var23, var25, arg3, true, var28);
                        }
                    } else {
                        int var29 = class110.method827((byte) -61, arg6 + var8, class48.field941, class125.field2164);
                        int var30 = class110.method827((byte) 96, arg6 - var8, class48.field941, class125.field2164);
                        if (var21 <= class72.field1275) {
                            class150.method1124(var29, var30, arg3, true, class37.field694[var21]);
                        }
                        if (var20 >= class220.field3664) {
                            class150.method1124(var29, var30, arg3, true, class37.field694[var20]);
                        }
                    }
                }
            }
            int var31 = arg0 - var8;
            int var32 = arg0 + var8;
            if (class220.field3664 <= var32 && var31 <= class72.field1275) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class125.field2164 && class48.field941 >= var34) {
                    int var35 = class110.method827((byte) 76, var33, class48.field941, class125.field2164);
                    int var36 = class110.method827((byte) -67, var34, class48.field941, class125.field2164);
                    if (var7 <= var8) {
                        if (var32 <= class72.field1275) {
                            class150.method1124(var35, var36, arg3, true, class37.field694[var32]);
                        }
                        if (var31 >= class220.field3664) {
                            class150.method1124(var35, var36, arg3, true, class37.field694[var31]);
                        }
                    } else {
                        int var37 = var10 < var8 ? class303.field5075[var8] : var10;
                        int var38 = class110.method827((byte) -63, arg6 + var37, class48.field941, class125.field2164);
                        int var39 = class110.method827((byte) -73, arg6 - var37, class48.field941, class125.field2164);
                        if (class72.field1275 >= var32) {
                            int[] var40 = class37.field694[var32];
                            class150.method1124(var39, var36, arg3, true, var40);
                            class150.method1124(var38, var39, arg2, true, var40);
                            class150.method1124(var35, var38, arg3, true, var40);
                        }
                        if (var31 >= class220.field3664) {
                            int[] var41 = class37.field694[var31];
                            class150.method1124(var39, var36, arg3, true, var41);
                            class150.method1124(var38, var39, arg2, true, var41);
                            class150.method1124(var35, var38, arg3, true, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[Lqd;I[SI)V", line = 1578)
    public static final void method1621(int arg0, class40[] arg1, int arg2, short[] arg3, int arg4) {
        field3815++;
        int var5 = -59 / ((arg2 + 21) / 62);
        if (arg0 <= arg4) {
            return;
        }
        int var6 = arg4;
        int var7 = (arg0 + arg4) / 2;
        class40 var8 = arg1[var7];
        arg1[var7] = arg1[arg0];
        arg1[arg0] = var8;
        short var9 = arg3[var7];
        arg3[var7] = arg3[arg0];
        arg3[arg0] = var9;
        for (int var10 = arg4; var10 < arg0; var10++) {
            if (var8 == null || arg1[var10] != null && arg1[var10].method353(var8, 1) < (var10 & 0x1)) {
                class40 var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                short var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var8;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var9;
        method1621(var6 - 1, arg1, 97, arg3, arg4);
        method1621(arg0, arg1, -108, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lth;)V", line = 1673)
    public class233(class80 arg0) {
        this.field3824 = arg0;
    }
}
