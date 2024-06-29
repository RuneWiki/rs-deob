import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class203 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public static boolean field3041 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3042 = "Loading...";

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public static int[] field3044 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static volatile int field3046 = 0;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3048 = "wave:";

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3045;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1439(boolean arg0) {
        if (arg0) {
            field3046 = -29;
        }
        field3048 = null;
        field3044 = null;
        field3042 = null;
        field3045 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lmd;B)V", line = 31)
    public static final void method1440(class123 arg0, byte arg1) {
        field3039++;
        if (arg1 != 13) {
            return;
        }
        int var2 = arg0.field1870 - class227.field3618;
        int var3 = arg0.field1915 * 128 + arg0.method280(false) * 64;
        int var4 = arg0.field1867 * 128 + arg0.method280(false) * 64;
        arg0.field1868 += (var4 - arg0.field1868) / var2;
        arg0.field1877 = 0;
        if (arg0.field1860 == 0) {
            arg0.field1858 = 1024;
        }
        arg0.field1905 += (var3 - arg0.field1905) / var2;
        if (arg0.field1860 == 1) {
            arg0.field1858 = 1536;
        }
        if (arg0.field1860 == 2) {
            arg0.field1858 = 0;
        }
        if (arg0.field1860 == 3) {
            arg0.field1858 = 512;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V", line = 70)
    public static final void method1441(int arg0, boolean arg1) {
        if (arg1) {
            if (class331.field5160 != -1) {
                class323.method2195(true, class331.field5160);
            }
            for (class61 var2 = (class61) class276.field4257.method1228(true); var2 != null; var2 = (class61) class276.field4257.method1223((byte) 13)) {
                class105.method761(var2, true, false);
            }
            class331.field5160 = -1;
            class276.field4257 = new class170(8);
            class76.method560((byte) 109);
            class331.field5160 = class313.field4850;
            class274.method1885(false, arg0 ^ 0x1EB1);
            class20.method154(1441);
            class110.method824(0, class331.field5160);
        }
        class207.field3175 = -1;
        class5.method36(false, class270.field4194);
        class98.field1566 = new class33();
        class98.field1566.field1905 = 3000;
        if (arg0 != 1) {
            field3044 = (int[]) null;
        }
        field3040++;
        class98.field1566.field1868 = 3000;
        if (!class94.field1516 && class288.field4491 == 0) {
            class128.method925(class186.field2788, 0);
            class88.method640(10, (byte) 49);
            return;
        }
        if (class178.field2692 == 2) {
            class265.field4116 = class61.field983 << 7;
            class337.field5278 = class67.field1118 << 7;
        } else {
            class116.method857(-32);
        }
        if (class94.field1516) {
            class84.method593(64);
        }
        class247.method1700(-11814);
        class88.method640(28, (byte) 49);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILhi;I)V", line = 131)
    public static final void method1442(int arg0, int arg1, int arg2, class206 arg3, int arg4) {
        field3047++;
        if (class301.field4706 >= 400) {
            return;
        }
        if (arg3.field3120 != null) {
            arg3 = arg3.method1465(arg4 - 917);
        }
        if (arg4 != 1024) {
            field3045 = (String[]) null;
        }
        if (arg3 == null || !arg3.field3126) {
            return;
        }
        String var5 = arg3.field3125;
        if (arg3.field3129 != 0) {
            String var6 = class288.field4491 == 1 ? class208.field3183 : class342.field5329;
            var5 = var5 + class71.method536(arg3.field3129, -48, class98.field1566.field505) + " (" + var6 + arg3.field3129 + ")";
        }
        if (class313.field4858 == 1) {
            class226.field3590++;
            class231.method1628(arg0, class34.field533, 0, class136.field2149 + " -> <col=ffff00>" + var5, arg1, (short) 23, class186.field2776, (long) arg2);
        } else if (class35.field545) {
            class177 var14 = class115.field1765 == -1 ? null : class299.method2044(class115.field1765, (byte) -32);
            if ((class11.field172 & 0x2) != 0 && (var14 == null || arg3.method1470(var14.field2684, arg4 ^ 0xFFFFFBFF, class115.field1765) != var14.field2684)) {
                class20.field262++;
                class231.method1628(arg0, class344.field5344, 0, class254.field3997 + " -> <col=ffff00>" + var5, arg1, (short) 1, class332.field5173, (long) arg2);
            }
        } else {
            class60.field971++;
            String[] var7 = arg3.field3109;
            if (class131.field2054) {
                var7 = class290.method1990((byte) 126, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class288.field4491 != 0 || !var7[var8].equalsIgnoreCase(class252.field3979))) {
                        byte var9 = 0;
                        class68.field1126++;
                        int var10 = -1;
                        if (arg3.field3151 == var8) {
                            var10 = arg3.field3127;
                        }
                        if (var8 == 0) {
                            var9 = 37;
                        }
                        if (arg3.field3162 == var8) {
                            var10 = arg3.field3136;
                        }
                        if (var8 == 1) {
                            var9 = 47;
                        }
                        if (var8 == 2) {
                            var9 = 46;
                        }
                        if (var8 == 3) {
                            var9 = 13;
                        }
                        if (var8 == 4) {
                            var9 = 60;
                        }
                        class231.method1628(arg0, var10, 0, "<col=ffff00>" + var5, arg1, var9, var7[var8], (long) arg2);
                    }
                }
            }
            if (class288.field4491 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class252.field3979)) {
                        short var12 = 0;
                        class326.field5072++;
                        if (arg3.field3129 > class98.field1566.field505) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 37;
                        }
                        if (var11 == 1) {
                            var13 = 47;
                        }
                        if (var11 == 2) {
                            var13 = 46;
                        }
                        if (var11 == 3) {
                            var13 = 13;
                        }
                        if (var11 == 4) {
                            var13 = 60;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class231.method1628(arg0, arg3.field3117, 0, "<col=ffff00>" + var5, arg1, var13, var7[var11], (long) arg2);
                    }
                }
            }
            class231.method1628(arg0, class131.field2060, 0, "<col=ffff00>" + var5, arg1, (short) 1002, class149.field2258, (long) arg2);
        }
    }
}
