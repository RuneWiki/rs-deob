import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class241 implements Runnable {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[Ljh;")
    public volatile class250[] field4176 = new class250[2];

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Z")
    public volatile boolean field4175 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
    public volatile boolean field4174 = false;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    public static boolean field4177 = false;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Lsc;")
    private static class181 field4189 = class149.method967(255, "Members object");

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lsc;")
    public static class181 field4178 = field4189;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lsc;")
    public static class181 field4188 = class149.method967(255, "(U2");

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lsc;")
    public static class181 field4187 = class149.method967(255, "");

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Lsc;")
    public static class181 field4195 = field4187;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Lsc;")
    public static class181 field4191 = field4187;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field4196 = 50;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[Lsc;")
    public static class181[] field4182 = new class181[field4196];

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
    public static int[] field4198 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    public static int[] field4197 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "[I")
    public static int[] field4184 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
    public static int[] field4190 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
    public static int[] field4199 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
    public static int[] field4180 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    public static int[] field4185 = new int[field4196];

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lej;")
    public class142 field4183;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Ldg;")
    public static class90 field4179;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[Lka;")
    public static class134[] field4193;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[Lka;")
    public static class134[] field4194;

    @OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
    public final void run() {
        field4192++;
        this.field4174 = true;
        try {
            while (!this.field4175) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class250 var2 = this.field4176[var1];
                    if (var2 != null) {
                        var2.method1701((byte) 109);
                    }
                }
                class95.method632(true, 10L);
                class228.method1498(0, (Object) null, this.field4183);
            }
        } catch (Exception var9) {
            class83.method565(var9, (String) null, 118);
        } finally {
            Object var6 = null;
            this.field4174 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    public static final int method1639(int arg0, int arg1) {
        field4186++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (arg0 & var2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
    public static final void method1640(boolean arg0, int arg1) {
        if ((class258.field4507.field2654 >> 7) == class210.field3612 && class258.field4507.field2681 >> 7 == class146.field2400) {
            class210.field3612 = 0;
        }
        field4181++;
        int var2 = class152.field2538;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            long var4;
            class116 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class258.field4507;
            } else {
                var4 = (long) class218.field3750[var3] << 32;
                var6 = class39.field602[class218.field3750[var3]];
            }
            if (var6 != null && var6.method768((byte) -61)) {
                var6.field1909 = false;
                if ((class207.field3552 && class152.field2538 > 200 || class152.field2538 > 50) && !arg0 && var6.field2655 == var6.field2629) {
                    var6.field1909 = true;
                }
                int var7 = var6.field2654 >> 7;
                int var8 = var6.field2681 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1900 == null || class237.field4125 < var6.field1916 || class237.field4125 >= var6.field1891) {
                        if (var6.field2619 == 1 && (var6.field2654 & 0x7F) == 64 && (var6.field2681 & 0x7F) == 64) {
                            if (class1.field12[var7][var8] == class94.field1505) {
                                continue;
                            }
                            class1.field12[var7][var8] = class94.field1505;
                        }
                        var6.field2622 = class232.method1606(class38.field581, (byte) -69, var6.field2681, var6.field2654);
                        class188.method1304(class38.field581, var6.field2654, var6.field2681, var6.field2622, var6.field2619 * 64 - 4, var6, var6.field2675, var4, var6.field2632);
                    } else {
                        var6.field1909 = false;
                        var6.field2622 = class232.method1606(class38.field581, (byte) -22, var6.field2681, var6.field2654);
                        class171.method1131(class38.field581, var6.field2654, var6.field2681, var6.field2622, var6, var6.field2675, var4, var6.field1918, var6.field1922, var6.field1893, var6.field1912);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method1641(boolean arg0) {
        field4185 = null;
        field4190 = null;
        field4194 = null;
        if (arg0) {
            method1639(71, 75);
        }
        field4187 = null;
        field4195 = null;
        field4199 = null;
        field4180 = null;
        field4178 = null;
        field4184 = null;
        field4179 = null;
        field4197 = null;
        field4188 = null;
        field4189 = null;
        field4182 = null;
        field4193 = null;
        field4191 = null;
        field4198 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lhc;IIIIIIZ)V")
    public static final void method1642(class15 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field284.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field284[var9] - class146.field2391;
            int var23 = arg0.field281[var9] - class264.field4601;
            int var24 = arg0.field275[var9] - class45.field699;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field271 != null) {
                class15.field274[var9] = var25;
                class15.field272[var9] = var28;
                class15.field289[var9] = var29;
            }
            class15.field282[var9] = (var25 << 9) / var29 + class72.field1146;
            class15.field288[var9] = (var28 << 9) / var29 + class72.field1141;
        }
        class72.field1142 = 0;
        int var10 = arg0.field285.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field285[var11];
            int var13 = arg0.field279[var11];
            int var14 = arg0.field277[var11];
            int var15 = class15.field282[var12];
            int var16 = class15.field282[var13];
            int var17 = class15.field282[var14];
            int var18 = class15.field288[var12];
            int var19 = class15.field288[var13];
            int var20 = class15.field288[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class149.field2499 && class84.method570(class72.field1146 + class12.field249, class72.field1141 + class38.field585, var18, var19, var20, var15, var16, var17)) {
                    class194.field3389 = arg5;
                    class123.field2024 = arg6;
                }
                if (!arg7) {
                    class72.field1152 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class72.field1158 || var16 > class72.field1158 || var17 > class72.field1158) {
                        class72.field1152 = true;
                    }
                    if (arg0.field271 == null || arg0.field271[var11] == -1) {
                        if (arg0.field283[var11] != 12345678) {
                            class72.method500(var18, var19, var20, var15, var16, var17, arg0.field283[var11], arg0.field280[var11], arg0.field270[var11]);
                        }
                    } else if (!class73.field1166) {
                        int var21 = class72.field1157.method948(65535, arg0.field271[var11]);
                        class72.method500(var18, var19, var20, var15, var16, var17, class140.method897(var21, arg0.field283[var11]), class140.method897(var21, arg0.field280[var11]), class140.method897(var21, arg0.field270[var11]));
                    } else if (arg0.field278) {
                        class72.method492(var18, var19, var20, var15, var16, var17, arg0.field283[var11], arg0.field280[var11], arg0.field270[var11], class15.field274[0], class15.field274[1], class15.field274[3], class15.field272[0], class15.field272[1], class15.field272[3], class15.field289[0], class15.field289[1], class15.field289[3], arg0.field271[var11]);
                    } else {
                        class72.method492(var18, var19, var20, var15, var16, var17, arg0.field283[var11], arg0.field280[var11], arg0.field270[var11], class15.field274[var12], class15.field274[var13], class15.field274[var14], class15.field272[var12], class15.field272[var13], class15.field272[var14], class15.field289[var12], class15.field289[var13], class15.field289[var14], arg0.field271[var11]);
                    }
                }
            }
        }
    }
}
