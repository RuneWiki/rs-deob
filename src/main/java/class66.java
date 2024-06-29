import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class66 extends class115 {

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    private int field1025 = 585;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "[I")
    public static int[] field1032 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "Z")
    public static boolean field1030 = false;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1034 = "K";

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "[I")
    public static int[] field1035 = new int[128];

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static final void method450(int arg0) {
        class153.field2230 = 0;
        class282.field4501 = 0;
        class92.method624((byte) 37);
        class268.method1793(8);
        ++field1033;
        class32.method229(500);
        class47.method309(0);
        for (int var1 = 0; var1 < class153.field2230; ++var1) {
            int var3 = class193.field2758[var1];
            if (~class82.field1267 != ~class194.field2777[var3].field85) {
                if (class194.field2777[var3].field793 > 0) {
                    class260.method1741(127, class194.field2777[var3]);
                }
                class194.field2777[var3] = null;
            }
        }
        if (~class7.field140 != ~class68.field1071.field1673) {
            throw new RuntimeException("gpp1 pos:" + class68.field1071.field1673 + " psize:" + class7.field140);
        } else {
            for (int var2 = 0; ~var2 > ~class193.field2770; ++var2) {
                if (class194.field2777[class110.field1589[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class193.field2770);
                }
            }
            if (arg0 != 4660) {
                field1032 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method451(boolean arg0, int arg1) {
        ++field1037;
        byte[][] var2 = class255.field3870;
        byte var3 = 4;
        if (arg1 != 14021) {
            field1034 = null;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class270.method1804(arg1 ^ 7925);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class155.field2273[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = 3 & var8 >> 24;
                        if (!arg0 || ~var9 == -1) {
                            int var10 = 3 & var8 >> 1;
                            int var11 = 1023 & var8 >> 14;
                            int var12 = var8 >> 3 & 2047;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; class23.field303.length > var14; ++var14) {
                                if (class23.field303[var14] == var13 && var2[var14] != null) {
                                    class101.method673((var11 & 7) * 8, var4, var6 * 8, class246.field3681, var9, (7 & var12) * 8, arg0, var5 * 8, var2[var14], 22054, var10);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class23.method172(var4, 8, 8, var6 * 8, -1, var5 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1025 = arg1.method756(arg0 ^ 29900);
        }
        if (arg0 == -1) {
            ++field1027;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)Lei;")
    public static final class169 method452(int arg0) {
        ++field1031;
        try {
            int var1 = -105 % ((arg0 - -29) / 58);
            return (class169) Class.forName("vg").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1028;
        if (arg0 != 242152972) {
            method450(-15);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = class187.field2664[arg1];
            for (int var5 = 0; class77.field1178 > var5; ++var5) {
                int var6 = class169.field2444[var5];
                if (~this.field1025 > ~var6 && 4096 - this.field1025 > var6 && var4 > -this.field1025 + 2048 && this.field1025 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1025);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field1025 + 2048) && ~var6 > ~(this.field1025 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field1025;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1025 + 2048);
                } else if (this.field1025 <= var4 && var4 <= -this.field1025 + 4096) {
                    if (var6 >= this.field1025 && ~var6 >= ~(-this.field1025 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1025 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1025;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1025 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZIIIIZI)Lij;")
    public static final class69 method453(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field1029;
        class273 var8 = class259.method1735(arg7, -14667);
        if (~arg4 < -2 && var8.field4389 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (var8.field4335[var10] <= arg4 && var8.field4335[var10] != 0) {
                    var9 = var8.field4389[var10];
                }
            }
            if (~var9 != 0) {
                var8 = class259.method1735(var9, -14667);
            }
        }
        class215 var11 = var8.method1837(768);
        if (var11 == null) {
            return null;
        } else {
            class244 var12 = null;
            if (~var8.field4348 != 0) {
                var12 = (class244) method453(false, true, 0, 1, 10, -3232, true, var8.field4364);
                if (var12 == null) {
                    return null;
                }
            } else if (var8.field4368 != -1) {
                var12 = (class244) method453(false, true, arg2, arg3, arg4, -3232, false, var8.field4346);
                if (var12 == null) {
                    return null;
                }
            }
            if (arg5 != -3232) {
                return null;
            } else {
                int var13 = class144.field2068;
                int var14 = class144.field2065;
                int[] var15 = new int[4];
                int[] var16 = class144.field2070;
                class144.method953(var15);
                class244 var17 = new class244(36, 32);
                class144.method959(var17.field3663, 36, 32);
                class18.method150();
                class18.method140(16, 16);
                class18.field251 = false;
                int var18 = var8.field4359;
                if (!arg6) {
                    if (arg3 == 2) {
                        var18 = (int) ((double) var18 * 1.04D);
                    }
                } else {
                    var18 = (int) ((double) var18 * 1.5D);
                }
                int var19 = class18.field259[var8.field4394] * var18 >> 16;
                int var20 = class18.field261[var8.field4394] * var18 >> 16;
                var11.method24(0, var8.field4333, var8.field4321, var8.field4394, var8.field4390, var20 - var11.method36() / 2 + var8.field4363, var8.field4363 + var19, -1L);
                if (arg3 >= 1) {
                    var17.method1584(1);
                    if (~arg3 <= -3) {
                        var17.method1584(16777215);
                    }
                    class144.method959(var17.field3663, 36, 32);
                }
                if (~arg2 != -1) {
                    var17.method1595(arg2);
                }
                if (var8.field4348 == -1) {
                    if (~var8.field4368 != 0) {
                        class144.method959(var12.field3663, 36, 32);
                        var17.method470(0, 0);
                        var17 = var12;
                    }
                } else {
                    var12.method470(0, 0);
                }
                if (arg0 && (~var8.field4387 == -2 || arg4 != 1) && arg4 != -1) {
                    class179.field2565.method1270(class162.method1090(true, arg4), 0, 9, 16776960, 1);
                }
                class144.method959(var16, var13, var14);
                class144.method966(var15);
                class18.method150();
                class18.field251 = true;
                return var17;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(III)V")
    public static final void method454(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class5.field36; ++var3) {
            for (int var4 = 0; var4 < class90.field1372; ++var4) {
                for (int var5 = 0; var5 < class225.field3383; ++var5) {
                    class131 var6 = class16.field233[var3][var4][var5];
                    if (var6 != null) {
                        class288 var7 = var6.field1923;
                        if (var7 != null && var7.field4557.method864()) {
                            class285.method1916(var7.field4557, var3, var4, var5, 1, 1);
                            if (var7.field4553 != null && var7.field4553.method864()) {
                                class285.method1916(var7.field4553, var3, var4, var5, 1, 1);
                                var7.field4557.method884(var7.field4553, 0, 0, 0, false);
                                var7.field4553 = var7.field4553.method862(arg0, arg1, arg2);
                            }
                            var7.field4557 = var7.field4557.method862(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1926; ++var8) {
                            class162 var10 = var6.field1908[var8];
                            if (var10 != null && var10.field2348.method864()) {
                                class285.method1916(var10.field2348, var3, var4, var5, var10.field2362 - var10.field2353 + 1, var10.field2340 - var10.field2357 + 1);
                                var10.field2348 = var10.field2348.method862(arg0, arg1, arg2);
                            }
                        }
                        class109 var9 = var6.field1930;
                        if (var9 != null && var9.field1569.method864()) {
                            class162.method1084(var9.field1569, var3, var4, var5);
                            var9.field1569 = var9.field1569.method862(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1032 = null;
        field1034 = null;
        field1035 = null;
        if (arg0 != -10935) {
            method454(89, -103, 63);
        }
    }
}
