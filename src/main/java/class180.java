import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class180 extends class21 {

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field2883 = 0;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    private int field2886 = 0;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    private int field2887 = 16;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field2890 = 2000;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    private int field2892 = 4096;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Z")
    public static boolean field2899 = false;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lab;")
    public static class279 field2889 = new class279(50);

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field2901 = " is already on your friend list.";

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "[Lnh;")
    public static class241[] field2897;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)I", line = 5)
    public static final int method1131(byte arg0) {
        field2900++;
        int var1 = -81 % ((-arg0 - 20) / 35);
        return ((class80.field1573 == 0 ? 0 : 1) << 22) + ((class202.field3278 == 0 ? 0 : 1) << 20) + ((class191.field3110 ? 1 : 0) << 19) + (class259.field4028 << 17) + ((class45.field926 ? 1 : 0) << 15) + ((class334.field5115 ? 1 : 0) << 13) + (class305.field4620 & 0x3 << 11) + ((class157.field2572 ? 1 : 0) << 9) + ((client.field902 ? 1 : 0) << 8) + ((class79.field1555 ? 1 : 0) << 7) + (class331.field5068 & 0x7) + ((class250.field3925 ? 1 : 0) << 3) + ((class104.field1794 ? 1 : 0) << 4) + ((class64.field1227 ? 1 : 0) << 5) + ((class318.field4809 ? 1 : 0) << 6) + ((class259.field4030 ? 1 : 0) << 10) + ((class140.field2314 ? 1 : 0) << 16) + ((class171.field2751 == 0 ? 0 : 1) << 21) + (class275.method1842() << 23);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIIIZ)V", line = 15)
    public static final void method1132(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class288.field4435 = arg3;
        if (arg2) {
            method1138(3);
        }
        class276.field4223 = arg4;
        class178.field2870 = arg5;
        class90.field1660 = arg0;
        field2891++;
        class85.field1609 = arg1;
        if (arg6 && class178.field2870 >= 100) {
            class38.field742 = class90.field1660 * 128 + 64;
            class283.field4381 = class276.field4223 * 128 + 64;
            class132.field2232 = class325.method2250(class283.field4381, 22771, class289.field4438, class38.field742) - class85.field1609;
        }
        class135.field2271 = 2;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 43)
    public static void method1133(int arg0) {
        field2901 = null;
        field2897 = null;
        if (arg0 != -101) {
            field2897 = (class241[]) null;
        }
        field2889 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 289)
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BIB)Z", line = 60)
    public static final boolean method1134(int arg0, byte[] arg1, int arg2, byte arg3) {
        field2893++;
        boolean var4 = true;
        class202 var5 = new class202(arg1);
        int var6 = -59 / ((arg3 - 29) / 35);
        int var7 = -1;
        label57: while (true) {
            int var8 = var5.method1358(32767);
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var5.method1296((byte) 91);
                    if (var12 == 0) {
                        continue label57;
                    }
                    int var13 = var5.method1317((byte) -82) >> 2;
                    var9 += var12 - 1;
                    int var14 = (var9 & 0xFFA) >> 6;
                    int var15 = arg0 + var14;
                    int var16 = var9 & 0x3F;
                    int var17 = arg2 + var16;
                    if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                        class31 var18 = class277.method1864(var7, 0);
                        if (var13 != 22 || class64.field1227 || var18.field638 != 0 || var18.field624 == 1 || var18.field571) {
                            var10 = true;
                            if (!var18.method249(20)) {
                                var4 = false;
                                class264.field4102++;
                            }
                        }
                    }
                }
                int var11 = var5.method1296((byte) 91);
                if (var11 == 0) {
                    break;
                }
                var5.method1317((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(B)[Lmg;", line = 140)
    public static final class113[] method1135(byte arg0) {
        field2895++;
        class113[] var1 = new class113[class125.field2167];
        if (arg0 < 89) {
            field2902 = -56;
        }
        for (int var2 = 0; var2 < class125.field2167; var2++) {
            var1[var2] = new class113(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], class254.field3968[var2], class274.field4202);
        }
        class97.method644((byte) 100);
        return var1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILkl;B)Ljava/lang/String;", line = 165)
    public static final String method1136(int arg0, class68 arg1, byte arg2) {
        field2896++;
        if (!client.method359(arg1).method1787(arg0, 117) && arg1.field1334 == null) {
            return null;
        }
        int var3 = 48 % ((53 - arg2) / 60);
        if (arg1.field1369 == null || arg0 >= arg1.field1369.length || arg1.field1369[arg0] == null || arg1.field1369[arg0].trim().length() == 0) {
            return class29.field551 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field1369[arg0];
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 190)
    public static final void method1137(int arg0) {
        class255.field3971.method1884(arg0 ^ 0xFFFFA9DA);
        if (arg0 != 0) {
            field2897 = (class241[]) null;
        }
        field2894++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILag;)V", line = 201)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field2882++;
        if (arg0 != -318) {
            return;
        }
        if (arg1 == 0) {
            this.field2886 = arg2.method1317((byte) -116);
        } else if (arg1 == 1) {
            this.field2890 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field2887 = arg2.method1317((byte) -92);
        } else if (arg1 == 3) {
            this.field2883 = arg2.method1315(14289);
        } else if (arg1 == 4) {
            this.field2892 = arg2.method1315(14289);
        }
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)I", line = 271)
    public static final int method1138(int arg0) {
        field2898++;
        if (arg0 != 2) {
            field2901 = (String) null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZIIIIIIII)V", line = 293)
    public static final void method1139(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2885++;
        if (arg4 >= class147.field2416 && arg4 <= class259.field4024 && arg9 >= class147.field2416 && class259.field4024 >= arg9 && arg3 >= class147.field2416 && class259.field4024 >= arg3 && arg0 >= class147.field2416 && arg0 <= class259.field4024 && class59.field1162 <= arg8 && arg8 <= class186.field3028 && arg2 >= class59.field1162 && class186.field3028 >= arg2 && class59.field1162 <= arg7 && class186.field3028 >= arg7 && arg5 >= class59.field1162 && class186.field3028 >= arg5) {
            class179.method1128(arg8, -6191, arg0, arg3, arg7, arg6, arg2, arg9, arg4, arg5);
        } else {
            class247.method1643(arg6, arg7, arg3, arg5, arg2, arg4, 3467, arg8, arg0, arg9);
        }
        if (arg1) {
            method1137(-64);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 315)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        field2884++;
        if (this.field443.field2637) {
            int var4 = this.field2892 >> 1;
            int[][] var5 = this.field443.method1043(-89);
            Random var6 = new Random((long) this.field2886);
            for (int var7 = 0; var7 < this.field2890; var7++) {
                int var8 = this.field2892 > 0 ? this.field2883 + class220.method1462(var6, -861395680, this.field2892) - var4 : this.field2883;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class220.method1462(var6, -861395680, class294.field4489);
                int var11 = class220.method1462(var6, -861395680, class147.field2421);
                int var12 = (class46.field953[var9] * this.field2887 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = var10 + (class122.field2117[var9] * this.field2887 >> 12);
                int var15 = var14 - var10;
                if (var15 != 0 || var13 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var14;
                        var14 = var12;
                        var12 = var17;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var14 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                        var10 = var14;
                        var14 = var19;
                    }
                    int var21 = var11;
                    int var22 = var14 - var10;
                    int var23 = var12 - var11;
                    int var24 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = -var22 / 2;
                    int var26 = var11 >= var12 ? -1 : 1;
                    int var27 = 1024 - (class220.method1462(var6, -861395680, 4096) >> 2);
                    for (int var28 = var10; var28 < var14; var28++) {
                        var25 += var23;
                        int var29 = var21 & class204.field3323;
                        int var30 = var27 + ((-var10 + var28) * var24) + 1024;
                        int var31 = class4.field108 & var28;
                        if (var25 > 0) {
                            var21 += var26;
                            var25 += -var22;
                        }
                        if (var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        int var32 = -87 % ((33 - arg0) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V", line = 452)
    public final void method183(byte arg0) {
        field2888++;
        if (arg0 <= 82) {
            field2899 = false;
        }
        class233.method1546(17431);
    }
}
