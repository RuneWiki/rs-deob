import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class556 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lra;")
    public static class361 field7270 = new class361(106, 0);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    public static int[] field7272 = new int[1];

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Len;")
    public static class368 field7273 = new class368(1);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field7276;

    // $FF: synthetic field
    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field7277;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
    public static final void method2979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7276++;
        if (arg1 == arg4) {
            class429.method2465(arg3, true, arg2, arg4, arg0);
        } else if (arg5 == 8) {
            if (class265.field3552 <= arg0 - arg4 && class641.field8924 >= (arg0 + arg4) && class165.field2061 <= (arg2 - arg1) && class99.field1309 >= (arg1 + arg2)) {
                class357.method2054((byte) -70, arg1, arg4, arg2, arg0, arg3);
            } else {
                class458.method2578(arg3, -2, arg1, arg0, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method2980(int arg0) {
        field7270 = null;
        field7273 = null;
        if (arg0 == 8) {
            field7272 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method2981() {
        for (int var0 = 0; var0 < class421.field5444; var0++) {
            if (!class252.field3442[var0]) {
                class357 var1 = class421.field5440[var0];
                class296 var2 = var1.field4631;
                int var3 = var1.field4632;
                int var4 = var2.method1752(46) - class57.field768;
                int var5 = (var4 * 2 >> class291.field3760) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1754(76) - var4 >> class291.field3760;
                int var9 = var2.method1755(122) - var4 >> class291.field3760;
                int var10 = var2.method1755(109) + var4 >> class291.field3760;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class151.field1933) {
                    var10 = class151.field1933 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4629[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class590.field8010) {
                        var16 = class590.field8010 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class34 var19 = class47.method432(var3, var17, var11, field7277 == null ? (field7277 = method2983("mca")) : field7277);
                        if (var19 != null && var19.field511 != 0) {
                            if (var19.field511 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4629[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4629[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4629[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4629[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class252.field3442[var0] = true;
                class392.field4997[var3].method672(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method2982(int arg0) {
        field7271++;
        int var1 = arg0;
        if (class260.field3509 != null) {
            var1 = class260.field3509.method1589(class364.field4697, (byte) 103);
        }
        if (var1 == 2) {
            int var4 = class544.field7066 <= 800 ? class544.field7066 : 800;
            int var5 = class207.field2669 > 600 ? 600 : class207.field2669;
            class289.field3729 = (class544.field7066 - var4) / 2;
            class519.field6796 = var4;
            class349.field4470 = 0;
            class461.field6047 = var5;
        } else if (var1 == 1) {
            int var2 = class544.field7066 <= 1024 ? class544.field7066 : 1024;
            int var3 = class207.field2669 > 768 ? 768 : class207.field2669;
            class519.field6796 = var2;
            class289.field3729 = (class544.field7066 - var2) / 2;
            class461.field6047 = var3;
            class349.field4470 = 0;
        } else {
            class289.field3729 = 0;
            class461.field6047 = class207.field2669;
            class519.field6796 = class544.field7066;
            class349.field4470 = 0;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2983(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
