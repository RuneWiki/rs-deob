import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class190 extends class302 {

    @OriginalMember(owner = "client!wd", name = "tb", descriptor = "Z")
    public static volatile boolean field2626 = true;

    @OriginalMember(owner = "client!wd", name = "xb", descriptor = "Ljava/lang/String;")
    public static String field2630 = "level: ";

    @OriginalMember(owner = "client!wd", name = "wb", descriptor = "Ljava/lang/String;")
    public static String field2629 = " is already on your friend list.";

    @OriginalMember(owner = "client!wd", name = "yb", descriptor = "[I")
    public static int[] field2631 = new int[32];

    @OriginalMember(owner = "client!wd", name = "qb", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!wd", name = "rb", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!wd", name = "sb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wd", name = "ub", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!wd", name = "vb", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!wd", name = "zb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method1377(int arg0, boolean arg1) {
        field2627++;
        byte[][] var2;
        if (class47.field623 && arg1) {
            var2 = class264.field3838;
        } else {
            var2 = class48.field649;
        }
        if (arg0 != 24505) {
            method1378(99, (String) null, -27, (String) null);
        }
        int var3 = class101.field1316.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class305.field4457[var4] >> 8) * 64 - class331.field4867;
                int var7 = (class305.field4457[var4] & 0xFF) * 64 - class355.field5556;
                class323.method2235(false);
                class8.method53(arg1, var5, -127, var7, var6, class231.field3312);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I", line = 53)
    public static final int method1378(int arg0, String arg1, int arg2, String arg3) {
        field2622++;
        int var4 = arg3.length();
        if (arg0 != 5379) {
            return 68;
        }
        int var5 = 0;
        int var6 = arg1.length();
        char var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while (var4 > (var5 - var7) || var6 > var8 - var9) {
            if (var4 <= (var5 - var7)) {
                return -1;
            }
            if (var6 <= var8 - var9) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg3.charAt(var5++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var8++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var7 = class328.method2270(var22, false);
            var9 = class328.method2270(var24, false);
            char var26 = class271.method1848(-99, arg2, var22);
            char var27 = class271.method1848(-73, arg2, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class65.method475(arg0 - 3617, arg2, var28) - class65.method475(1762, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var12 = var6 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class65.method475(1762, arg2, var16) - class65.method475(1762, arg2, var17);
                }
            }
        }
        int var18 = var4 - var6;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg3.charAt(var19);
            char var21 = arg1.charAt(var19);
            if (var20 != var21) {
                return class65.method475(arg0 - 3617, arg2, var20) - class65.method475(1762, arg2, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "(B)V", line = 178)
    public static void method1379(byte arg0) {
        field2630 = null;
        field2629 = null;
        if (arg0 < 112) {
            field2630 = (String) null;
        }
        field2631 = null;
    }

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V", line = 191)
    public static final void method1380(int arg0) {
        field2628++;
        if (arg0 != -1122255295) {
            field2629 = (String) null;
        }
        while (true) {
            class156 var1;
            class331 var3;
            do {
                var1 = (class156) class137.field1874.method411(false);
                if (var1 == null) {
                    return;
                }
                if (var1.field2154 < 0) {
                    int var2 = -var1.field2154 - 1;
                    if (class103.field1333 == var2) {
                        var3 = class359.field5616;
                    } else {
                        var3 = class311.field4574[var2];
                    }
                } else {
                    int var4 = var1.field2154 - 1;
                    var3 = class251.field3688[var4];
                }
            } while (var3 == null);
            class219 var5 = class345.method2392(var1.field2168, arg0 + 1122255295);
            if (class56.field724 < 3) {
            }
            int var6;
            int var7;
            if (var1.field2167 == 1 || var1.field2167 == 3) {
                var7 = var5.field3096;
                var6 = var5.field3112;
            } else {
                var6 = var5.field3096;
                var7 = var5.field3112;
            }
            int var8 = (var7 + 1 >> 1) + var1.field2175;
            int var9 = (var7 >> 1) + var1.field2175;
            int var10 = var1.field2155 + (var6 >> 1);
            int var11 = var1.field2155 + (var6 + 1 >> 1);
            int[][] var12 = class74.field978[class56.field724];
            int var13 = var12[var8][var10] + var12[var9][var10] + var12[var9][var11] + var12[var8][var11] >> 2;
            class260 var14 = null;
            int var15 = class8.field90[var1.field2162];
            if (var15 == 0) {
                class231 var19 = class54.method414(class56.field724, var1.field2175, var1.field2155);
                if (var19 != null) {
                    var14 = var19.field3309;
                }
            } else if (var15 == 1) {
                class66 var18 = class362.method2519(class56.field724, var1.field2175, var1.field2155);
                if (var18 != null) {
                    var14 = var18.field848;
                }
            } else if (var15 == 2) {
                class294 var17 = class347.method2412(class56.field724, var1.field2175, var1.field2155);
                if (var17 != null) {
                    var14 = var17.field4275;
                }
            } else if (var15 == 3) {
                class24 var16 = class154.method1189(class56.field724, var1.field2175, var1.field2155);
                if (var16 != null) {
                    var14 = var16.field269;
                }
            }
            if (var14 != null) {
                class139.method1056(-1, class56.field724, 0, var1.field2175, var1.field2163 + 1, var1.field2155, (byte) 38, 0, var15, var1.field2161 + 1);
                var3.field4922 = var1.field2155 * 128 + var6 * 64;
                int var20 = var1.field2156;
                int var21 = var1.field2157;
                var3.field4927 = var1.field2175 * 128 + var7 * 64;
                var3.field4856 = var13;
                var3.field4938 = var1.field2161 + class313.field4603;
                int var22 = var1.field2172;
                var3.field4943 = var14;
                var3.field4905 = class313.field4603 + var1.field2163;
                if (var22 < var21) {
                    int var23 = var21;
                    var21 = var22;
                    var22 = var23;
                }
                var3.field4937 = var1.field2175 + var22;
                var3.field4939 = var1.field2175 + var21;
                int var24 = var1.field2173;
                if (var24 < var20) {
                    int var25 = var20;
                    var20 = var24;
                    var24 = var25;
                }
                var3.field4933 = var1.field2155 + var24;
                var3.field4913 = var1.field2155 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)V", line = 359)
    public static final void method1381(int arg0) {
        class146 var1 = (class146) class263.field3822.method413(1253231568);
        field2632++;
        if (arg0 < 72) {
            method1382(false, (String[]) null, 69, -113);
        }
        while (var1 != null) {
            if (var1.field2034 == -1) {
                var1.field2046 = 0;
                class175.method1287(var1, (byte) -126);
            } else {
                var1.method179((byte) 51);
            }
            var1 = (class146) class263.field3822.method419(122);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z[Ljava/lang/String;II)Ljava/lang/String;", line = 388)
    public static final String method1382(boolean arg0, String[] arg1, int arg2, int arg3) {
        field2625++;
        if (arg0) {
            return (String) null;
        } else if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg2 + arg3;
            for (int var7 = arg2; var7 < var6; var7++) {
                String var8 = arg1[var7];
                if (var8 == null) {
                    var5 += 4;
                } else {
                    var5 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var5);
            for (int var10 = arg2; var10 < var6; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 454)
    public static final void method1383(byte arg0, String arg1, boolean arg2) {
        field2621++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class235.field3374.method1902(arg1, 250);
        if (arg0 >= -46) {
            return;
        }
        int var6 = var3 + 6;
        int var7 = class235.field3374.method1914(arg1, 250) * 13;
        if (class47.field623) {
            class129.method997(var4 - var3, -var3 + var6, var5 + var3 + var3, var3 + var3 + var7, 0);
            class129.method986(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 - -var3, 16777215);
        } else {
            class37.method231(var4 - var3, -var3 + var6, var3 + var3 + var5, var3 + var7 + var3, 0);
            class37.method248(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var3 + var7, 16777215);
        }
        class235.field3374.method1896(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class90.method648(var3 + var5 + var3, 0, var3 + var7 + var3, -var3 + var4, var6 - var3);
        if (!arg2) {
            class221.method1610(var4, var6, var7, 128, var5);
        } else if (class47.field623) {
            class47.method379();
        } else {
            try {
                Graphics var8 = class26.field307.getGraphics();
                class283.field4035.method320(0, var8, (byte) -128, 0);
            } catch (Exception var10) {
                class26.field307.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I", line = 518)
    public final int[][] method215(int arg0, int arg1) {
        field2624++;
        if (arg1 != -29869) {
            field2630 = (String) null;
        }
        int[][] var3 = this.field2796.method2187(arg0, -48);
        if (this.field2796.field4667 && this.method2113(-128)) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int var6 = arg0 % this.field4416 * this.field4416;
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class95.field1235; var8++) {
                int var9 = this.field4432[var6 + (var8 % this.field4425)];
                var5[var8] = class335.method2339(var9, 255) << 4;
                var4[var8] = class335.method2339(4080, var9 >> 4);
                var7[var8] = class335.method2339(var9, 16711680) >> 12;
            }
        }
        return var3;
    }
}
