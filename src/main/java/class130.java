import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class130 {

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    public static int[] field2226 = new int[2];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[Lda;")
    public static class114[] field2224;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lsd;Z)V", line = 21)
    public static final void method965(class26 arg0, boolean arg1) {
        field2227++;
        if (!arg1) {
            field2226 = (int[]) null;
        }
        while (true) {
            while (arg0.field472.length > arg0.field478) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method226(255) == 1) {
                    var3 = arg0.method226(255);
                    var2 = true;
                    var4 = arg0.method226(255);
                }
                int var5 = arg0.method226(255);
                int var6 = arg0.method226(255);
                int var7 = var5 * 64 - class91.field1662;
                int var8 = class272.field4524 + class268.field4462 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class233.field3840 > var7 + 63 && class268.field4462 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method234(2193);
                                if (var13 != 0) {
                                    if (class62.field1169[var9][var10] == null) {
                                        class62.field1169[var9][var10] = new byte[4096];
                                    }
                                    class62.field1169[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method234(2193);
                                    if (class214.field3591[var9][var10] == null) {
                                        class214.field3591[var9][var10] = new byte[4096];
                                    }
                                    class214.field3591[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method234(2193);
                        if (var16 != 0) {
                            arg0.field478++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 135)
    public static void method966(byte arg0) {
        field2226 = null;
        if (arg0 >= -117) {
            field2225 = 43;
        }
        field2224 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZZIZII)Lcm;", line = 149)
    public static final class185 method967(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        class277 var8 = class165.method1243(arg0 - 45, arg7);
        if (arg4 > 1 && var8.field4652 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4639[var10] <= arg4 && var8.field4639[var10] != 0) {
                    var9 = var8.field4652[var10];
                }
            }
            if (var9 != -1) {
                var8 = class165.method1243(-27, var9);
            }
        }
        field2222++;
        class175 var11 = var8.method1937((byte) 125);
        if (var11 == null) {
            return null;
        }
        class99 var12 = null;
        if (var8.field4648 != -1) {
            var12 = (class99) method967(arg0, 1, true, true, 10, false, 0, var8.field4661);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4641 != -1) {
            var12 = (class99) method967(0, arg1, false, true, arg4, false, arg6, var8.field4674);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class115.field1986;
        int[] var14 = class115.field1978;
        int var15 = class115.field1985;
        int[] var16 = new int[4];
        class115.method876(var16);
        class99 var17 = new class99(36, 32);
        class115.method871(var17.field1761, 36, 32);
        class203.method1414();
        class203.method1431(16, 16);
        class203.field3224 = false;
        int var18 = var8.field4664;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class203.field3208[var8.field4632] * var18 >> 16;
        int var20 = class203.field3216[var8.field4632] * var18 >> 16;
        var11.method1168(arg0, var8.field4629, var8.field4687, var8.field4632, var8.field4684, var19 + (var8.field4659 - (var11.method74() / 2)), var8.field4659 + var20);
        if (arg1 >= 1) {
            var17.method747(1);
            if (arg1 >= 2) {
                var17.method747(16777215);
            }
            class115.method871(var17.field1761, 36, 32);
        }
        if (arg6 != 0) {
            var17.method741(arg6);
        }
        if (var8.field4648 != -1) {
            var12.method744(0, 0);
        } else if (var8.field4641 != -1) {
            class115.method871(var12.field1761, 36, 32);
            var17.method744(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field4637 == 1 || arg4 != 1) && arg4 != -1) {
            class209.field3345.method1831(class49.method434(arg4, arg0 - 13313), 0, 9, 16776960, 1);
        }
        class115.method871(var14, var13, var15);
        class115.method866(var16);
        class203.method1414();
        class203.field3224 = true;
        return class21.field350 && !arg3 ? new class100(var17) : var17;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lka;I)Lka;")
    public abstract class181 method964(class181 arg0, int arg1);
}
