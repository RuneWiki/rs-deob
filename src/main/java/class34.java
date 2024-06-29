import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 extends class53 {

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    private int field498 = 0;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    private int field492 = 4096;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "Lwa;")
    public static class75 field502 = class66.method560("(Udns", false);

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "Lwa;")
    private static class75 field503 = class66.method560("Discard", false);

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "Lwa;")
    public static class75 field505 = field503;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "Lwa;")
    private static class75 field507 = class66.method560("Select", false);

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Lwa;")
    public static class75 field497 = field507;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static volatile int field494 = 0;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lul;")
    public static class39 field493;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lcb;B)V", line = 13)
    public static final void method222(class267 arg0, byte arg1) {
        class91.field1505 = arg0;
        field500++;
        if (arg1 <= 77) {
            method222((class267) null, (byte) 50);
        }
        class2.field21 = class91.field1505.method1914(-71, 4);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V", line = 25)
    public static final void method223(int arg0, int arg1) {
        field508++;
        if (arg1 >= -10) {
            field493 = (class39) null;
        }
        class194.field3225.method1199(arg0, 119);
        class221.field3764.method1199(arg0, 126);
        class154.field2640.method1199(arg0, 125);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 40)
    public static final void method224() {
        for (int var0 = 0; var0 < class85.field1400; var0++) {
            class285 var1 = class203.field3435[var0];
            class130.method1019(var1);
            class203.field3435[var0] = null;
        }
        class85.field1400 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V", line = 59)
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field506++;
        if (class153.field2635 <= arg3 && arg0 <= class288.field4956 && class90.field1495 <= arg6 && class294.field5041 >= arg2) {
            class292.method2038(arg7, arg1, arg5, arg2, arg0, arg3, arg6, (byte) 44);
        } else {
            class197.method1468(arg2, arg0, arg3, arg1, arg7, 40, arg6, arg5);
        }
        if (arg4 != -1) {
            method228((class96) null, true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 76)
    public static void method226(int arg0) {
        field505 = null;
        field507 = null;
        if (arg0 < 17) {
            method225(53, 124, -20, -121, -1, 127, 76, -22);
        }
        field497 = null;
        field493 = null;
        field502 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 98)
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 103)
    public static final void method227(boolean arg0) {
        field489++;
        int var1 = (class9.field121 >> 10) + (class175.field2939 >> 3);
        byte var2 = 0;
        byte var3 = 18;
        class24.field317 = new int[var3];
        class202.field3410 = new int[var3];
        class88.field1459 = new int[var3];
        byte var4 = 8;
        class109.field1876 = new byte[var3][];
        class176.field2954 = new byte[var3][];
        class267.field4595 = new byte[var3][];
        class288.field4952 = new int[var3];
        class197.field3300 = new int[var3][4];
        byte var5 = 8;
        class294.field5055 = new byte[var3][];
        class90.field1484 = new int[var3];
        class37.field543 = new int[var3];
        class226.field3814 = new byte[var3][];
        int var6 = 0;
        int var7 = (class245.field4120 >> 10) + (class275.field4737 >> 3);
        for (int var8 = (var7 - 6) / 8; var8 <= (var7 + 6) / 8; var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class288.field4952[var6] = var10;
                class88.field1459[var6] = class121.field2039.method1915(-15621, class66.method562((byte) 114, new class75[] { class63.field1105, class67.method565(56, var8), class233.field3940, class67.method565(70, var9) }));
                class202.field3410[var6] = class121.field2039.method1915(-15621, class66.method562((byte) 124, new class75[] { class106.field1788, class67.method565(45, var8), class233.field3940, class67.method565(56, var9) }));
                class24.field317[var6] = class121.field2039.method1915(-15621, class66.method562((byte) -90, new class75[] { class240.field4060, class67.method565(89, var8), class233.field3940, class67.method565(111, var9) }));
                class37.field543[var6] = class121.field2039.method1915(-15621, class66.method562((byte) 113, new class75[] { class31.field455, class67.method565(80, var8), class233.field3940, class67.method565(57, var9) }));
                class90.field1484[var6] = class121.field2039.method1915(-15621, class66.method562((byte) 116, new class75[] { class198.field3323, class67.method565(37, var8), class233.field3940, class67.method565(109, var9) }));
                if (class24.field317[var6] == -1) {
                    class88.field1459[var6] = -1;
                    class202.field3410[var6] = -1;
                    class37.field543[var6] = -1;
                    class90.field1484[var6] = -1;
                }
                var6++;
            }
        }
        class210.method1557(-1, var5, var2, var4, arg0, var7, var1);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I", line = 195)
    public final int[] method59(int arg0, int arg1) {
        field491++;
        if (arg0 != -15196) {
            field503 = (class75) null;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 120);
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                int var6 = var4[var5];
                if (this.field498 > var6) {
                    var3[var5] = this.field498;
                } else if (var6 <= this.field492) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field492;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lwc;Z)V", line = 239)
    public static final void method228(class96 arg0, boolean arg1) {
        if (!arg1) {
            method227(false);
        }
        field499++;
        class290 var2 = (class290) class2.field18.method1007(arg0.field1561.method630(-91), -17004);
        if (var2 == null) {
            return;
        }
        if (var2.field4975 != null) {
            class94.field1527.method1790(var2.field4975);
            var2.field4975 = null;
        }
        var2.method1527(82);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIB)I", line = 264)
    public static final int method229(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        if (arg3 <= 40) {
            field501 = -50;
        }
        field490++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[[I", line = 308)
    public final int[][] method66(int arg0, int arg1) {
        field504++;
        int[][] var3 = this.field882.method874(false, arg0);
        int var4 = 115 / ((76 - arg1) / 42);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(115, 0, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var3[0];
            int[] var9 = var5[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class269.field4644; var12++) {
                int var13 = var9[var12];
                int var14 = var6[var12];
                int var15 = var7[var12];
                if (this.field498 > var13) {
                    var8[var12] = this.field498;
                } else if (this.field492 < var13) {
                    var8[var12] = this.field492;
                } else {
                    var8[var12] = var13;
                }
                if (this.field498 > var14) {
                    var10[var12] = this.field498;
                } else if (this.field492 >= var14) {
                    var10[var12] = var14;
                } else {
                    var10[var12] = this.field492;
                }
                if (this.field498 > var15) {
                    var11[var12] = this.field498;
                } else if (var15 > this.field492) {
                    var11[var12] = this.field492;
                } else {
                    var11[var12] = var15;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILja;Z)V", line = 382)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field495++;
        if (!arg2) {
            this.method54(10, (class60) null, true);
        }
        if (arg0 == 0) {
            this.field498 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field492 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field880 = arg1.method501(0) == 1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 432)
    public static final void method230(byte arg0) {
        if (arg0 != -79) {
            field493 = (class39) null;
        }
        field496++;
        for (int var1 = 0; var1 < class173.field2924; var1++) {
            int var2 = class72.field1214[var1];
            class96 var3 = class169.field2842[var2];
            int var4 = class136.field2328.method501(0);
            if ((var4 & 0x2) != 0) {
                var4 += class136.field2328.method501(arg0 ^ 0xFFFFFFB1) << 8;
            }
            class214.method1579(var3, var2, true, var4);
        }
    }
}
