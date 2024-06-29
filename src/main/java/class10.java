import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lhc;")
    public static class368 field76 = new class368("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "[I")
    public static int[] field80;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field77;

    static {
        new class368("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field78 = 0;
        field79 = -1;
        field80 = new int[] { 1, -1, -1, 1 };
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILvg;Lea;BI)V", line = 5)
    public static final void method51(int arg0, class108 arg1, class58 arg2, byte arg3, int arg4) {
        field77++;
        class165 var5 = arg1.method831((byte) 73, arg2);
        if (var5 == null) {
            return;
        }
        arg2.method227(arg4, arg0, arg4 + arg1.field1568, arg1.field1577 + arg0);
        if (class63.field852 == 2 || class63.field852 == 5 || class435.field6148 == null) {
            arg2.method214(-16777216, var5, arg4, arg0);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class26.field337 == 4) {
                var9 = class24.field309;
                var6 = class81.field1126;
                var8 = (int) (-class332.field4483) & 0x3FFF;
                var7 = 4096;
            } else {
                var6 = class359.field4970.field44;
                var7 = 4096 - (class129.field1950 * 16);
                var8 = (int) (-class332.field4483) + class19.field249 & 0x3FFF;
                var9 = class359.field4970.field40;
            }
            int var10 = 208 - (class11.field107 * 2 - var9 / 32 - 48);
            int var11 = 48 - ((class264.field3620 - 104) * 2) - (-(class264.field3620 * 4) - -(var6 / 32));
            class435.field6148.method626((float) arg1.field1568 / 2.0F + (float) arg4, (float) arg1.field1577 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var8 << 2, var5, arg4, arg0);
            for (class166 var12 = (class166) class133.field1991.method1173(0); var12 != null; var12 = (class166) class133.field1991.method1165(true)) {
                int var50 = var12.field2342;
                int var51 = (class430.field5988.field2133[var50] >> 14 & 0x3FFF) - class6.field65;
                int var52 = (class430.field5988.field2133[var50] & 0x3FFF) - class371.field5148;
                int var53 = var51 * 4 + 2 - (var9 / 32);
                int var54 = var52 * 4 + 2 - (var6 / 32);
                class229.method1501(class430.field5988.field2140[var50], var54, var5, (byte) -101, arg4, arg2, arg1, var53, arg0);
            }
            for (int var13 = 0; var13 < class251.field3506; var13++) {
                int var47 = class132.field1975[var13] * 4 + 2 - (var9 / 32);
                int var48 = class25.field324[var13] * 4 + 2 - var6 / 32;
                class447 var49 = class133.method996((byte) -19, class124.field1874[var13]);
                if (var49.field6307 != null) {
                    var49 = var49.method2772(70);
                    if (var49 == null || var49.field6293 == -1) {
                        continue;
                    }
                }
                class229.method1501(var49.field6293, var48, var5, (byte) -91, arg4, arg2, arg1, var47, arg0);
            }
            for (class119 var14 = (class119) class417.field5771.method842((byte) -25); var14 != null; var14 = (class119) class417.field5771.method836(50)) {
                int var44 = (int) (var14.field4226 >> 28 & 0x3L);
                if (class111.field1711 == var44) {
                    int var45 = (int) (var14.field4226 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                    int var46 = (int) (var14.field4226 >> 14 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                    class4.method20(arg1, (byte) -30, var45, var46, class363.field4995[0], var5, arg4, arg0);
                }
            }
            for (int var15 = 0; var15 < class53.field674; var15++) {
                class419 var40 = class428.field5951[class228.field3187[var15]];
                if (var40 != null && var40.method2591(-1)) {
                    class233 var41 = var40.field5807;
                    if (var41 != null && var41.field3327 != null) {
                        var41 = var41.method1524((byte) 77);
                    }
                    if (var41 != null && var41.field3292 && var41.field3275) {
                        int var42 = var40.field40 / 32 - var9 / 32;
                        int var43 = var40.field44 / 32 - (var6 / 32);
                        if (var41.field3280 == -1) {
                            class4.method20(arg1, (byte) 100, var42, var43, class363.field4995[1], var5, arg4, arg0);
                        } else {
                            class229.method1501(var41.field3280, var43, var5, (byte) 100, arg4, arg2, arg1, var42, arg0);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class11.field86; var16++) {
                class423 var32 = class87.field1227[class18.field243[var16]];
                if (var32 != null && var32.method2617(-1)) {
                    int var33 = var32.field40 / 32 - (var9 / 32);
                    int var34 = var32.field44 / 32 - (var6 / 32);
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class353.field4751; var36++) {
                        if (var32.field5869.equals(class196.field2851[var36]) && class323.field4388[var36] != 0) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class395.field5492; var38++) {
                        if (var32.field5869.equals(class67.field944[var38].field461)) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    if (class359.field4970.field5888 != 0 && var32.field5888 != 0 && class359.field4970.field5888 == var32.field5888) {
                        var39 = true;
                    }
                    if (var35) {
                        class4.method20(arg1, (byte) -29, var33, var34, class363.field4995[3], var5, arg4, arg0);
                    } else if (var37) {
                        class4.method20(arg1, (byte) 112, var33, var34, class363.field4995[5], var5, arg4, arg0);
                    } else if (var39) {
                        class4.method20(arg1, (byte) -1, var33, var34, class363.field4995[4], var5, arg4, arg0);
                    } else {
                        class4.method20(arg1, (byte) -109, var33, var34, class363.field4995[2], var5, arg4, arg0);
                    }
                }
            }
            class418[] var17 = class273.field3733;
            for (int var18 = 0; var18 < var17.length; var18++) {
                class418 var21 = var17[var18];
                if (var21 != null && var21.field5792 != 0 && (class246.field3467 % 20) < 10) {
                    if (var21.field5792 == 1 && var21.field5786 >= 0 && var21.field5786 < class428.field5951.length) {
                        class419 var22 = class428.field5951[var21.field5786];
                        if (var22 != null) {
                            int var23 = var22.field40 / 32 - (var9 / 32);
                            int var24 = var22.field44 / 32 - (var6 / 32);
                            class86.method686(360000, 123, var24, arg0, var5, var21.field5789, arg1, var23, arg4);
                        }
                    }
                    if (var21.field5792 == 2) {
                        int var25 = (var21.field5778 - class6.field65) * 4 + 2 - (var9 / 32);
                        int var26 = (var21.field5785 - class371.field5148) * 4 - ((var6 / 32) - 2);
                        int var27 = var21.field5787 * 4;
                        int var28 = var27 * var27;
                        class86.method686(var28, 115, var26, arg0, var5, var21.field5789, arg1, var25, arg4);
                    }
                    if (var21.field5792 == 10 && var21.field5786 >= 0 && var21.field5786 < class87.field1227.length) {
                        class423 var29 = class87.field1227[var21.field5786];
                        if (var29 != null) {
                            int var30 = var29.field40 / 32 - (var9 / 32);
                            int var31 = var29.field44 / 32 - (var6 / 32);
                            class86.method686(360000, 126, var31, arg0, var5, var21.field5789, arg1, var30, arg4);
                        }
                    }
                }
            }
            if (class26.field337 != 4) {
                if (class93.field1300 != 0) {
                    int var19 = class93.field1300 * 4 + class359.field4970.method1285(-114) * 2 + 2 - (var9 / 32) - 2;
                    int var20 = class233.field3265 * 4 + class359.field4970.method1285(-81) * 2 - (var6 / 32 - 2) - 2;
                    class4.method20(arg1, (byte) -76, var19, var20, class276.field3767[class399.field5526 ? 1 : 0], var5, arg4, arg0);
                }
                arg2.method461(3, -1, 3, -91, arg1.field1568 / 2 + arg4 - 1, arg1.field1577 / 2 + arg0 - 1);
            }
        }
        int var55 = -62 % ((-arg3 - 11) / 61);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 295)
    public static final void method52() {
        for (int var0 = 0; var0 < class340.field4602; var0++) {
            class5 var1 = class419.field5818[var0];
            class319.method1948(var1);
            class419.field5818[var0] = null;
        }
        class340.field4602 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 313)
    public static void method53(boolean arg0) {
        field76 = null;
        field80 = null;
        if (!arg0) {
            method51(-28, (class108) null, (class58) null, (byte) -77, -38);
        }
    }
}
