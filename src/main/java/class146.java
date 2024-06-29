import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class146 extends class304 {

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    private int field2223 = 1365;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    private int field2224 = 0;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    private int field2221 = 20;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    private int field2220 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "[I")
    public static int[] field2225 = new int[4096];

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "La;")
    public static class281 field2231;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "Ljd;")
    public static class95 field2228;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "[Lcn;")
    public static class228[] field2226;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 7)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V", line = 11)
    public static void method1104(byte arg0) {
        field2226 = null;
        field2228 = null;
        field2225 = null;
        field2231 = null;
        if (arg0 != 94) {
            field2228 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIILbd;I)V", line = 30)
    public static final void method1105(int arg0, boolean arg1, int arg2, int arg3, class28 arg4, int arg5) {
        field2230++;
        if (class159.field2414 >= 50 || arg4 == null || arg4.field327 == null || arg4.field327.length <= arg0 || arg4.field327[arg0] == null) {
            return;
        }
        if (arg2 != 6924) {
            field2228 = (class95) null;
        }
        int var6 = arg4.field327[arg0][0];
        int var7 = (var6 & 0xEF) >> 5;
        int var8 = var6 >> 8;
        if (arg4.field327[arg0].length > 1) {
            int var9 = (int) (Math.random() * (double) arg4.field327[arg0].length);
            if (var9 > 0) {
                var8 = arg4.field327[arg0][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg1) {
                class39.method302(var8, 255, var7, 0, -24);
            }
        } else if (class71.field1022 != 0) {
            class296.field4566[class159.field2414] = var8;
            class338.field5249[class159.field2414] = var7;
            int var11 = (arg3 - 64) / 128;
            class8.field117[class159.field2414] = 0;
            int var12 = (arg5 - 64) / 128;
            class251.field3798[class159.field2414] = null;
            class112.field1698[class159.field2414] = 255;
            class139.field2092[class159.field2414] = (var12 << 16) + (var11 << 8) + var10;
            class159.field2414++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 96)
    public static final void method1106(int arg0) {
        if (arg0 >= -124) {
            field2232 = 27;
        }
        field2222++;
        while (true) {
            class65 var1;
            class305 var3;
            do {
                var1 = (class65) class112.field1697.method1944(123);
                if (var1 == null) {
                    return;
                }
                if (var1.field949 < 0) {
                    int var2 = -var1.field949 - 1;
                    if (class153.field2323 == var2) {
                        var3 = class39.field575;
                    } else {
                        var3 = class201.field3096[var2];
                    }
                } else {
                    int var4 = var1.field949 - 1;
                    var3 = class264.field4064[var4];
                }
            } while (var3 == null);
            class32 var5 = class226.method1607(-125, var1.field931);
            if (class265.field4112 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field935 == 1 || var1.field935 == 3) {
                var6 = var5.field416;
                var7 = var5.field413;
            } else {
                var6 = var5.field413;
                var7 = var5.field416;
            }
            int var8 = var1.field929 + (var7 + 1 >> 1);
            int var9 = var1.field929 + (var7 >> 1);
            int var10 = (var6 + 1 >> 1) + var1.field943;
            int[][] var11 = class203.field3111[class265.field4112];
            int var12 = var1.field943 + (var6 >> 1);
            int var13 = var11[var8][var10] + var11[var8][var12] + var11[var9][var12] + var11[var9][var10] >> 2;
            class110 var14 = null;
            int var15 = class188.field2958[var1.field932];
            if (var15 == 0) {
                class35 var19 = class292.method2011(class265.field4112, var1.field929, var1.field943);
                if (var19 != null) {
                    var14 = var19.field511;
                }
            } else if (var15 == 1) {
                class158 var18 = class168.method1277(class265.field4112, var1.field929, var1.field943);
                if (var18 != null) {
                    var14 = var18.field2402;
                }
            } else if (var15 == 2) {
                class228 var16 = class294.method2035(class265.field4112, var1.field929, var1.field943);
                if (var16 != null) {
                    var14 = var16.field3480;
                }
            } else if (var15 == 3) {
                class341 var17 = class258.method1818(class265.field4112, var1.field929, var1.field943);
                if (var17 != null) {
                    var14 = var17.field5305;
                }
            }
            if (var14 != null) {
                class201.method1459(0, class265.field4112, var1.field934 + 1, 0, 1574, var1.field943, var1.field946 + 1, -1, var1.field929, var15);
                var3.field4730 = var13;
                var3.field4729 = var14;
                var3.field4689 = var1.field946 + class233.field3542;
                var3.field4686 = class233.field3542 + var1.field934;
                var3.field4719 = var1.field943 * 128 + var6 * 64;
                var3.field4681 = var1.field929 * 128 + (var7 * 64);
                int var20 = var1.field945;
                int var21 = var1.field940;
                int var22 = var1.field936;
                if (var22 < var20) {
                    int var23 = var20;
                    var20 = var22;
                    var22 = var23;
                }
                var3.field4721 = var1.field929 + var22;
                var3.field4704 = var1.field929 + var20;
                int var24 = var1.field947;
                if (var24 < var21) {
                    int var25 = var21;
                    var21 = var24;
                    var24 = var25;
                }
                var3.field4714 = var1.field943 + var21;
                var3.field4768 = var1.field943 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lwm;II)V", line = 283)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2223 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field2221 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field2224 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field2220 = arg0.method1755(false);
        }
        field2229++;
        if (arg2 != -2828) {
            field2232 = -114;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I", line = 323)
    public final int[] method71(int arg0, int arg1) {
        field2227++;
        if (arg0 != 7) {
            method1105(-108, false, 59, 116, (class28) null, 21);
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            for (int var4 = 0; var4 < class218.field3333; var4++) {
                int var5 = (class162.field2631[var4] << 12) / this.field2223 + this.field2224;
                int var6 = (class84.field1225[arg1] << 12) / this.field2223 + this.field2220;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field2221) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= (this.field2221 - 1) ? 0 : (var13 << 12) / this.field2221;
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2225[var0] = class12.method96(true, var0);
        }
        field2231 = new class281();
        field2232 = 0;
    }
}
