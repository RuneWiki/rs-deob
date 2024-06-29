import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class362 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public static int[] field5341 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Loq;")
    public static class231 field5345 = new class231("", 13);

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "F")
    public static float field5346;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5344;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5347;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method2198(int arg0) {
        field5342++;
        if (arg0 != 3) {
            field5339 = -112;
        }
        for (class486 var1 = (class486) class382.field5559.method1318((byte) 80); var1 != null; var1 = (class486) class382.field5559.method1318((byte) 80)) {
            class300.method1808(var1, arg0 + 66);
        }
        int var2;
        int var3;
        if (class463.field7116.method75(-1, class30.field395)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class455.field6976;
            var3 = class455.field6976;
        }
        client.method1183();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1189();
            client.method1191(var4);
            client.method1192(var4);
        }
        client.method1177();
        client.method1179();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I")
    public static final int method2199(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2199(-58, 52, true);
        }
        field5344++;
        int var3 = class141.method935(88, arg1 - 1, arg0 + -1) + class141.method935(100, arg1 - 1, arg0 + 1) + class141.method935(101, arg1 - -1, arg0 + -1) + class141.method935(84, arg1 + 1, arg0 + 1);
        int var4 = class141.method935(93, arg1, arg0 - 1) + class141.method935(108, arg1, arg0 + 1) + class141.method935(94, arg1 + -1, arg0) + class141.method935(95, arg1 + 1, arg0);
        int var5 = class141.method935(124, arg1, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method2200(byte arg0) {
        if (arg0 == -84) {
            field5341 = null;
            field5345 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public static final void method2201() {
        for (int var0 = 0; var0 < class51.field766; var0++) {
            if (!class467.field7164[var0]) {
                class233 var1 = class162.field2532[var0];
                class480 var2 = var1.field3534;
                int var3 = var1.field3541;
                int var4 = var2.method2894((byte) -128) - class42.field621;
                int var5 = (var4 * 2 >> class239.field3602) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2895(0) - var4 >> class239.field3602;
                int var9 = var2.method2900((byte) -31) - var4 >> class239.field3602;
                int var10 = var2.method2900((byte) -31) + var4 >> class239.field3602;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class347.field5132) {
                    var10 = class347.field5132 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field3545[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class377.field5492) {
                        var16 = class377.field5492 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class205 var19 = class86.method607(var3, var17, var11, field5347 == null ? (field5347 = method2203("hs")) : field5347);
                        if (var19 != null && var19.field3226 != 0) {
                            if (var19.field3226 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3545[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3545[var6 - 1];
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
                                    short var30 = var1.field3545[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3545[var6 + 1];
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
                class467.field7164[var0] = true;
                class99.field1801[var3].method316(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILtq;)Ljava/lang/String;")
    public static final String method2202(int arg0, class427 arg1) {
        field5340++;
        if (client.method1176(arg1).method376(1) == 0) {
            return null;
        }
        if (arg0 < 115) {
            method2200((byte) 83);
        }
        if (arg1.field6167 == null || arg1.field6167.trim().length() == 0) {
            return class483.field7373 ? "Hidden-use" : null;
        } else {
            return arg1.field6167;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2203(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
