import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class197 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "[I")
    public static int[] field2725 = new int[500];

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lfi;")
    public static class8 field2718 = new class8();

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lha;")
    public static class243 field2723;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[[[Ldh;")
    public static class77[][][] field2727;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method1302(boolean arg0, byte arg1, int arg2, int arg3) {
        field2719++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 15 / ((48 - arg1) / 58);
            int var5 = 2;
            for (int var6 = arg3 / arg2; var6 != 0; var6 /= arg2) {
                var5++;
            }
            char[] var7 = new char[var5];
            var7[0] = '+';
            for (int var8 = var5 - 1; var8 > 0; var8--) {
                int var9 = arg3;
                arg3 /= arg2;
                int var10 = var9 - (arg2 * arg3);
                if (var10 < 10) {
                    var7[var8] = (char) (var10 + 48);
                } else {
                    var7[var8] = (char) (var10 + 87);
                }
            }
            return new String(var7);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method1303(int arg0) {
        field2726++;
        if (class72.field1019 != null) {
            return;
        }
        class72.field1019 = new int[65536];
        if (arg0 != 27919) {
            field2727 = null;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class72.field1019[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1304(int arg0) {
        if (arg0 == 17351) {
            field2723 = null;
            field2718 = null;
            field2727 = null;
            field2725 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)[Lje;")
    public static final class131[] method1305(boolean arg0) {
        field2721++;
        if (!arg0) {
            method1302(true, (byte) 28, -19, -95);
        }
        if (class369.field5442 == null) {
            class131[] var1 = class132.method945(false, class63.field948);
            class131[] var2 = new class131[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class131 var8 = var1[var4];
                if ((var8.field1716 <= 0 || var8.field1716 >= 24) && var8.field1720 >= 800 && var8.field1715 >= 600 && (class393.field5727 >= 96 || class397.field5796 != 0 || var8.field1720 <= 1024 && var8.field1715 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class131 var10 = var2[var9];
                        if (var8.field1720 == var10.field1720 && var8.field1715 == var10.field1715) {
                            if (var8.field1716 > var10.field1716) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class369.field5442 = new class131[var3];
            class206.method1361(var2, 0, class369.field5442, 0, var3);
            int[] var5 = new int[class369.field5442.length];
            for (int var6 = 0; var6 < class369.field5442.length; var6++) {
                class131 var7 = class369.field5442[var6];
                var5[var6] = var7.field1720 * var7.field1715;
            }
            class352.method2321(class369.field5442, 16, var5);
        }
        return class369.field5442;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lro;Z)Z")
    public static final boolean method1306(class407 arg0, boolean arg1) {
        boolean var2 = class370.field5469 == class266.field3950;
        int var3 = 0;
        arg0.method636((byte) 0);
        if (arg0.field5917 < 0 || arg0.field5918 < 0 || arg0.field5924 >= class108.field1421 || arg0.field5920 >= class186.field2554) {
            return false;
        }
        for (int var4 = arg0.field5917; var4 <= arg0.field5924; var4++) {
            for (int var7 = arg0.field5918; var7 <= arg0.field5920; var7++) {
                int var8 = 0;
                if (var4 > arg0.field5917) {
                    var8++;
                }
                if (var4 < arg0.field5924) {
                    var8 += 4;
                }
                if (var7 > arg0.field5918) {
                    var8 += 8;
                }
                if (var7 < arg0.field5920) {
                    var8 += 2;
                }
                class267.method1787(arg0.field5922, var4, var7);
                class77 var9 = class106.field1405[arg0.field5922][var4][var7];
                class356 var10 = class129.method914(arg0, (byte) -123, var8);
                class356 var11 = var9.field1064;
                if (var11 == null) {
                    var9.field1064 = var10;
                } else {
                    while (var11.field5275 != null) {
                        var11 = var11.field5275;
                    }
                    var11.field5275 = var10;
                }
                var9.field1075 = (byte) (var9.field1075 | var8);
                if (var2 && class50.field777[var4][var7] != 0) {
                    var3 = class50.field777[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field5917; var5 <= arg0.field5924; var5++) {
                for (int var6 = arg0.field5918; var6 <= arg0.field5920; var6++) {
                    if (class50.field777[var5][var6] == 0) {
                        class50.field777[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class13.field211[class355.field5261++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static final void method1307(int arg0) {
        if (arg0 > -36) {
            field2718 = null;
        }
        while (class27.field471.method1828(class20.field342, false) >= 11) {
            int var1 = class27.field471.method1832(11, (byte) -47);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class176.field2382[var1] == null) {
                class176.field2382[var1] = new class317();
                class176.field2382[var1].field2183 = var1;
                if (class329.field4858[var1] != null) {
                    class176.field2382[var1].method2079(-86, class329.field4858[var1]);
                }
                var2 = true;
            }
            class117.field1528[class402.field5869++] = var1;
            class317 var3 = class176.field2382[var1];
            var3.field2154 = class231.field3179;
            int var4 = class27.field471.method1832(5, (byte) -40);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class27.field471.method1832(1, (byte) -56);
            if (var5 == 1) {
                class298.field4500[class421.field6124++] = var1;
            }
            int var6 = class27.field471.method1832(1, (byte) -91);
            int var7 = class112.field1449[class27.field471.method1832(3, (byte) -87)];
            int var8 = class27.field471.method1832(5, (byte) -57);
            if (var2) {
                var3.method1093(var7, 16383);
            }
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2076(class383.field5609.field2189[0] + var8, 109, class383.field5609.field2190[0] + var4, class268.field3973, var6 == 1);
        }
        field2722++;
        class27.field471.method1831(-15939);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static final void method1308(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2717++;
        if (class427.field6212 == null) {
            return;
        }
        while (true) {
            while (class1.field15.length > class166.field2247) {
                class184 var1 = class1.field15[class166.field2247];
                if (var1 != null && var1.field2466 == -1) {
                    if (class228.field3149 == null) {
                        class228.field3149 = class427.field6212.method2720(-127, var1.field2467);
                    }
                    int var2 = class228.field3149.field3034;
                    if (var2 == -1) {
                        return;
                    }
                    class228.field3149 = null;
                    class166.field2247++;
                    var1.field2466 = var2;
                } else {
                    class166.field2247++;
                }
            }
            return;
        }
    }
}
