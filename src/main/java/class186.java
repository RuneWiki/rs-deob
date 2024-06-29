import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class186 implements class216 {

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "Lwu;")
    private class376 field2821;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Lqk;")
    private class15 field2812;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "Lhu;")
    private class133 field2815;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qga", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field2822;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        field2814++;
        if (arg0 != 5618) {
            this.method320(-11);
        }
        return this.field2821.method2216(this.field2812.field213, -57);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "()V")
    public static final void method1284() {
        for (int var0 = 0; var0 < class295.field4220; var0++) {
            if (!class20.field342[var0]) {
                class690 var1 = class573.field7526[var0];
                class87 var2 = var1.field9602;
                int var3 = var1.field9613;
                int var4 = var2.method673(-17) - class307.field4416;
                int var5 = (var4 * 2 >> class140.field2224) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method665(109) - var4 >> class140.field2224;
                int var9 = var2.method670((byte) -84) - var4 >> class140.field2224;
                int var10 = var2.method670((byte) -78) + var4 >> class140.field2224;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class143.field2290) {
                    var10 = class143.field2290 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9606[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class735.field10163) {
                        var16 = class735.field10163 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class675 var19 = class490.method2780(var3, var17, var11, field2822 == null ? (field2822 = method1286("fb")) : field2822);
                        if (var19 != null && var19.field9368 != 0) {
                            if (var19.field9368 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9606[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9606[var6 - 1];
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
                                    short var30 = var1.field9606[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9606[var6 + 1];
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
                class20.field342[var0] = true;
                class507.field6771[var3].method1736(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZB)V")
    public final void method328(boolean arg0, byte arg1) {
        field2813++;
        if (arg1 >= -60) {
            this.method320(112);
        }
        if (!arg0) {
            return;
        }
        int var3 = class69.field844 >= class228.field3251 ? class69.field844 : class228.field3251;
        int var4 = class304.field4321 >= class199.field2993 ? class304.field4321 : class199.field2993;
        int var5 = this.field2815.method1036();
        int var6 = this.field2815.method1048();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var9 = var4;
            var10 = 0;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field2815.method1052(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lwu;Lqk;)V")
    public class186(class376 arg0, class15 arg1) {
        this.field2821 = arg0;
        this.field2812 = arg1;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        field2818++;
        if (arg0 <= 34) {
            this.field2812 = null;
        }
        this.field2815 = class453.method2578(this.field2812.field213, this.field2821, true);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLwd;)V")
    public static final void method1285(byte arg0, class276 arg1) {
        arg1.method1661(true);
        field2820++;
        if (arg0 != -1) {
            field2816 = -83;
        }
        int var2 = class303.field4293;
        class383 var3 = class472.field6475 = class248.field3438[var2] = new class383();
        var3.field10297 = var2;
        int var4 = arg1.method1664(arg0 + 2060, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFDDF8) >> 14;
        var3.field10322[0] = var6 - class503.field6752;
        int var7 = var4 & 0x3FFF;
        var3.field3505 = (var3.field10322[0] << 9) + (var3.method2256(arg0) << 8);
        var3.field10321[0] = var7 - class334.field4757;
        var3.field3502 = (var3.field10321[0] << 9) + (var3.method2256(-1) << 8);
        class507.field6775 = var3.field3508 = var3.field3515 = var5;
        if (class498.method2810(arg0 - 10386, var3.field10322[0], var3.field10321[0])) {
            var3.field3515++;
        }
        if (class388.field5407[var2] != null) {
            var3.method2260(true, class388.field5407[var2]);
        }
        class586.field7665 = 0;
        class20.field351[class586.field7665++] = var2;
        class498.field6714[var2] = 0;
        class736.field10181 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1664(2059, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class753 var13 = class32.field496[var8] = new class753();
                var13.field10499 = 0;
                var13.field10497 = -1;
                var13.field10494 = (var11 << 14) + (var10 << 28) + var12;
                var13.field10495 = false;
                class31.field490[class736.field10181++] = var8;
                class498.field6714[var8] = 0;
            }
        }
        arg1.method1660(-97);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1286(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
