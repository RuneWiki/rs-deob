import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class275 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lus;")
    public static class1 field3988 = new class1(78, 6);

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Ldk;")
    public static class326 field3995 = new class326("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Llh;")
    public static class337 field3987;

    // $FF: synthetic field
    @OriginalMember(owner = "client!af", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3998;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[B")
    public byte[] field3986;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[B")
    public byte[] field3990;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvr;ILnp;Lqo;)V")
    public static final void method1682(class80 arg0, int arg1, class313 arg2, class19 arg3) {
        field3985++;
        class176 var4 = arg3.method125(-115, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method518();
        if (var5 < var4.method521()) {
            var5 = var4.method521();
        }
        byte var6 = 10;
        int var7 = arg0.field981;
        int var8 = arg0.field975;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field236 != null) {
            var9 = class293.field4252.method859((byte) 93, (int[]) null, class107.field1342, arg3.field236, (class176[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class107.field1342[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class338.field4931.method2224(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class338.field4931.method2223() * var9 + class338.field4931.method2225() / 2;
        }
        int var15 = var5 / 2 + arg0.field981;
        int var16 = arg0.field975;
        if ((class395.field5622 + var5) > var7) {
            var15 = var5 / 2 + var10 / 2 + var6 + class395.field5622 + 5;
            var7 = class395.field5622;
        } else if (class395.field5626 - var5 < var7) {
            var7 = class395.field5626 - var5;
            var15 = class395.field5626 - (var5 / 2) - (var10 / 2 + var6) - 5;
        }
        if (class395.field5639 + var5 > var8) {
            var8 = class395.field5639;
            var16 = var5 / 2 + class395.field5639 + var6;
        } else if (var8 > (class395.field5627 - var5)) {
            var16 = class395.field5627 - var6 - var11 - (var5 / 2);
            var8 = class395.field5627 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field981), (double) (var8 - arg0.field975)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1078((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field236 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 - (-var10 - 10);
            var21 = class338.field4931.method2223() * var9 + (var16 + 3);
            if (arg3.field230 != 0) {
                arg2.method1941(var21 - var16, var16, 1, var20 - var18, var18, arg3.field230);
            }
            if (arg3.field249 != 0) {
                arg2.method1933(var21 - var16, arg3.field249, var20 - var18, var16, (byte) -107, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class107.field1342[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class338.field4931.method2226(arg2, var23, var15, var16, arg3.field251, true);
                var16 += class338.field4931.method2223();
            }
        }
        if (arg3.field227 != -1 || arg3.field236 != null) {
            int var24 = var5 >> 1;
            class38 var25 = new class38(arg0);
            var25.field494 = var7 + var24;
            var25.field497 = var20;
            var25.field505 = var8 - var24;
            var25.field507 = var18;
            var25.field500 = var19;
            var25.field499 = var8 + var24;
            var25.field501 = var21;
            var25.field498 = var7 - var24;
            class65.field839.method2845(var25, (byte) 37);
        }
        int var26 = 65 % ((arg1 + 33) / 40);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field3988 = null;
        field3987 = null;
        if (arg0 == -1) {
            field3995 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method1684(int arg0) {
        class303.field4310.method1475(0);
        field3994++;
        class360.field5179.method1475(0);
        class272.field3966.method1475(0);
        class78.field964.method1475(0);
        class355.field5137.method1475(0);
        if (arg0 < 66) {
            method1682((class80) null, 20, (class313) null, (class19) null);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lw;")
    public static final class179 method1685(int arg0) {
        field3996++;
        return arg0 == -23037 ? class395.field5606 : null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public static final void method1686() {
        for (int var0 = 0; var0 < class480.field6737; var0++) {
            if (!class213.field3212[var0]) {
                class94 var1 = class478.field6712[var0];
                int var2 = var1.field1215;
                int var3 = var1.field2557 - class248.field3674;
                int var4 = (var3 * 2 >> class216.field3242) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field2552 - var3 >> class216.field3242;
                int var8 = var1.field2546 - var3 >> class216.field3242;
                int var9 = var1.field2546 + var3 >> class216.field3242;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class360.field5188) {
                    var9 = class360.field5188 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field1203[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class287.field4186) {
                        var15 = class287.field4186 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class304 var18 = class231.method1470(var2, var16, var10, field3998 == null ? (field3998 = method1687("nm")) : field3998);
                        if (var18 != null && var18.field4336 != 0) {
                            if (var18.field4336 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field1203[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field1203[var5 - 1];
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
                                    short var29 = var1.field1203[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field1203[var5 + 1];
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
                class213.field3212[var0] = true;
                class53.field725[var2].method1211(var1, var6);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1687(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
