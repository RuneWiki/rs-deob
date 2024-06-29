import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class150 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "F")
    public static float field2292 = 0.0F;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2298;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2299;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
    public static int[] field2296;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[[Lao;")
    public static class116[][] field2295;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method1145(boolean arg0) {
        field2295 = null;
        if (!arg0) {
            field2298 = 101;
        }
        field2296 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lrk;IZ)Lvm;")
    public static final class323 method1146(class427 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1148(-75, -42, -43, (class427) null);
        }
        field2297++;
        byte[] var3 = arg0.method2656(100, arg1);
        return var3 == null ? null : new class323(var3);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
    public static final void method1147(int arg0, int arg1, int arg2, int arg3) {
        if (class122.field1712 != null) {
            class122.field1712[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILrk;)Lgs;")
    public static final class40 method1148(int arg0, int arg1, int arg2, class427 arg3) {
        field2294++;
        class289 var4 = new class289(arg3.method2633(arg2, -1, arg1));
        class40 var5 = new class40(arg2, var4.method1871(-1), var4.method1871(-1), var4.method1856((byte) 56), var4.method1856((byte) 125), var4.method1861((byte) -72) == 1, var4.method1861((byte) -72));
        int var6 = var4.method1861((byte) -72);
        int var7 = 0;
        if (arg0 > -97) {
            return null;
        }
        while (var6 > var7) {
            var5.field616.method1249(new class360(var4.method1861((byte) -72), var4.method1853(-110), var4.method1853(-75), var4.method1853(-64), var4.method1853(-23), var4.method1853(109), var4.method1853(114), var4.method1853(-39), var4.method1853(-109)), (byte) -108);
            var7++;
        }
        var5.method395(127);
        return var5;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
    public static final void method1149() {
        for (int var0 = 0; var0 < class339.field4631; var0++) {
            if (!class183.field2663[var0]) {
                class21 var1 = class30.field511[var0];
                int var2 = var1.field389;
                int var3 = var1.field3625 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field3618 - var3 >> 7;
                int var8 = var1.field3620 - var3 >> 7;
                int var9 = var1.field3620 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class16.field190) {
                    var9 = class16.field190 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field399[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class368.field5054) {
                        var15 = class368.field5054 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class228 var18 = class95.method815(var2, var16, var10, field2299 == null ? (field2299 = method1151("fo")) : field2299);
                        if (var18 != null && var18.field3165 != 0) {
                            if (var18.field3165 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field399[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field399[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field399[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field399[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class183.field2663[var0] = true;
                class91.field1351[var2].method1520(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        if (arg0 != 1) {
            field2298 = -8;
        }
        class236.field3262.method2533(0);
        field2293++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1151(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
