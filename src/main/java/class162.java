import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class162 extends class55 {

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Lsg;")
    public class203 field3064 = new class203();

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Lub;")
    public class219 field3067 = new class219();

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lkd;")
    private class112 field3057;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "Ldc;")
    public static class37 field3066 = class185.method1233((byte) 86, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Lbb;")
    public static class14 field3060 = new class14(128);

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Ldc;")
    public static class37 field3068 = class185.method1233((byte) 86, "Angreifen");

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Ldc;")
    public static class37 field3070 = class185.method1233((byte) 86, "<col=40ff00>");

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "[I")
    public static int[] field3069 = new int[200];

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()Lf;")
    public final class55 method437() {
        field3059++;
        class49 var1;
        do {
            var1 = (class49) this.field3064.method1332((byte) -89);
            if (var1 == null) {
                return null;
            }
        } while (var1.field966 == null);
        return var1.field966;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()Lf;")
    public final class55 method438() {
        field3058++;
        class49 var1 = (class49) this.field3064.method1338(32);
        if (var1 == null) {
            return null;
        } else if (var1.field966 == null) {
            return this.method437();
        } else {
            return var1.field966;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()I")
    public final int method436() {
        field3055++;
        return 0;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public final void method442(int arg0) {
        field3063++;
        this.field3067.method442(arg0);
        for (class49 var2 = (class49) this.field3064.method1338(86); var2 != null; var2 = (class49) this.field3064.method1332((byte) -89)) {
            if (!this.field3057.method785(6295, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field965 >= var3) {
                        this.method1085(var2, var3, (byte) -61);
                        var2.field965 -= var3;
                        break;
                    }
                    this.method1085(var2, var2.field965, (byte) -61);
                    var3 -= var2.field965;
                } while (!this.field3057.method761(var3, null, 0, var2, 66));
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[ILee;II)V")
    private final void method1083(int arg0, int arg1, int[] arg2, class49 arg3, int arg4, int arg5) {
        if ((this.field3057.field1993[arg3.field972] & 0x4) != 0 && arg3.field962 < 0) {
            int var7 = this.field3057.field1986[arg3.field972] / class72.field1278;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field973) / var7;
                if (var8 > arg1) {
                    arg3.field973 += arg1 * var7;
                    break;
                }
                arg3.field966.method441(arg2, arg5, var8);
                arg3.field973 += var7 * var8 - 1048576;
                arg1 -= var8;
                class111 var9 = arg3.field966;
                int var10 = class72.field1278 / 100;
                int var11 = 262144 / var7;
                arg5 += var8;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field3057.field2001[arg3.field972] == 0) {
                    arg3.field966 = class111.method738(arg3.field979, var9.method717(), var9.method721(), var9.method722());
                } else {
                    arg3.field966 = class111.method738(arg3.field979, var9.method717(), 0, var9.method722());
                    this.field3057.method775(arg3.field992.field317[arg3.field983] < 0, (byte) 121, arg3);
                    arg3.field966.method724(var10, var9.method721());
                }
                if (arg3.field992.field317[arg3.field983] < 0) {
                    arg3.field966.method745(-1);
                }
                var9.method728(var10);
                var9.method441(arg2, arg5, arg0 - arg5);
                if (var9.method735()) {
                    this.field3067.method1447(var9);
                }
            }
        }
        arg3.field966.method441(arg2, arg5, arg1);
        field3056++;
        if (arg4 <= 90) {
            this.method438();
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([III)V")
    public final void method441(int[] arg0, int arg1, int arg2) {
        field3054++;
        this.field3067.method441(arg0, arg1, arg2);
        for (class49 var4 = (class49) this.field3064.method1338(-1); var4 != null; var4 = (class49) this.field3064.method1332((byte) -89)) {
            if (!this.field3057.method785(6295, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field965 >= var5) {
                        this.method1083(var5 + var6, var5, arg0, var4, 93, var6);
                        var4.field965 -= var5;
                        break;
                    }
                    this.method1083(var5 + var6, var4.field965, arg0, var4, 124, var6);
                    var6 += var4.field965;
                    var5 -= var4.field965;
                } while (!this.field3057.method761(var5, arg0, var6, var4, 100));
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method1084(int arg0, int arg1, int arg2) {
        class97.field1696 = true;
        class225.field4160 = arg0;
        class76.field1346 = arg1;
        class73.field1303 = arg2;
        class110.field1920 = -1;
        class112.field1969 = -1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lee;IB)V")
    private final void method1085(class49 arg0, int arg1, byte arg2) {
        if (arg2 != -61) {
            this.method437();
        }
        if ((this.field3057.field1993[arg0.field972] & 0x4) != 0 && arg0.field962 < 0) {
            int var4 = this.field3057.field1986[arg0.field972] / class72.field1278;
            int var5 = (var4 + 1048575 - arg0.field973) / var4;
            arg0.field973 = arg1 * var4 + arg0.field973 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field3057.field2001[arg0.field972] == 0) {
                    arg0.field966 = class111.method738(arg0.field979, arg0.field966.method717(), arg0.field966.method721(), arg0.field966.method722());
                } else {
                    arg0.field966 = class111.method738(arg0.field979, arg0.field966.method717(), 0, arg0.field966.method722());
                    this.field3057.method775(arg0.field992.field317[arg0.field983] < 0, (byte) 114, arg0);
                }
                if (arg0.field992.field317[arg0.field983] < 0) {
                    arg0.field966.method745(-1);
                }
                arg1 = arg0.field973 / var4;
            }
        }
        arg0.field966.method442(arg1);
        field3062++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public static final boolean method1086(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3061++;
        int var12 = 40 / ((arg6 + 40) / 53);
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class177.field3340[var13][var32] = 0;
                class192.field3591[var13][var32] = 99999999;
            }
        }
        class177.field3340[arg3][arg2] = 99;
        class192.field3591[arg3][arg2] = 0;
        int var14 = arg2;
        int var15 = arg3;
        byte var16 = 0;
        class97.field1697[var16] = arg3;
        int var33 = var16 + 1;
        class145.field2777[var16] = arg2;
        int var17 = 0;
        int[][] var18 = class11.field143[class125.field2246].field3080;
        boolean var19 = false;
        while (var33 != var17) {
            var15 = class97.field1697[var17];
            var14 = class145.field2777[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg8 == var15 && arg1 == var14) {
                var19 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class11.field143[class125.field2246].method1103((byte) 42, arg11 - 1, arg4, arg8, var14, 2, var15, arg1)) {
                    var19 = true;
                    break;
                }
                if (arg11 < 10 && class11.field143[class125.field2246].method1101(arg8, (byte) 77, var14, var15, arg1, arg4, arg11 - 1, 2)) {
                    var19 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg7 != 0 && class11.field143[class125.field2246].method1088(arg1, arg8, var15, arg9, 2, var14, arg0, arg7, (byte) -124)) {
                var19 = true;
                break;
            }
            int var31 = class192.field3591[var15][var14] + 1;
            if (var15 > 0 && class177.field3340[var15 - 1][var14] == 0 && (var18[var15 - 1][var14] & 0x12C010E) == 0 && (var18[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class97.field1697[var33] = var15 - 1;
                class145.field2777[var33] = var14;
                class177.field3340[var15 - 1][var14] = 2;
                var33 = var33 + 1 & 0xFFF;
                class192.field3591[var15 - 1][var14] = var31;
            }
            if (var15 < 102 && class177.field3340[var15 + 1][var14] == 0 && (var18[var15 + 2][var14] & 0x12C0183) == 0 && (var18[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class97.field1697[var33] = var15 + 1;
                class145.field2777[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class177.field3340[var15 + 1][var14] = 8;
                class192.field3591[var15 + 1][var14] = var31;
            }
            if (var14 > 0 && class177.field3340[var15][var14 - 1] == 0 && (var18[var15][var14 - 1] & 0x12C010E) == 0 && (var18[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class97.field1697[var33] = var15;
                class145.field2777[var33] = var14 - 1;
                class177.field3340[var15][var14 - 1] = 1;
                class192.field3591[var15][var14 - 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var14 < 102 && class177.field3340[var15][var14 + 1] == 0 && (var18[var15][var14 + 2] & 0x12C0138) == 0 && (var18[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class97.field1697[var33] = var15;
                class145.field2777[var33] = var14 + 1;
                class177.field3340[var15][var14 + 1] = 4;
                var33 = var33 + 1 & 0xFFF;
                class192.field3591[var15][var14 + 1] = var31;
            }
            if (var15 > 0 && var14 > 0 && class177.field3340[var15 - 1][var14 - 1] == 0 && (var18[var15 - 1][var14] & 0x12C0138) == 0 && (var18[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15][var14 - 1] & 0x12C0183) == 0) {
                class97.field1697[var33] = var15 - 1;
                class145.field2777[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class177.field3340[var15 - 1][var14 - 1] = 3;
                class192.field3591[var15 - 1][var14 - 1] = var31;
            }
            if (var15 < 102 && var14 > 0 && class177.field3340[var15 + 1][var14 - 1] == 0 && (var18[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var15 + 2][var14] & 0x12C01E0) == 0) {
                class97.field1697[var33] = var15 + 1;
                class145.field2777[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class177.field3340[var15 + 1][var14 - 1] = 9;
                class192.field3591[var15 + 1][var14 - 1] = var31;
            }
            if (var15 > 0 && var14 < 102 && class177.field3340[var15 - 1][var14 + 1] == 0 && (var18[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var15][var14 + 2] & 0x12C01E0) == 0) {
                class97.field1697[var33] = var15 - 1;
                class145.field2777[var33] = var14 + 1;
                var33 = var33 + 1 & 0xFFF;
                class177.field3340[var15 - 1][var14 + 1] = 6;
                class192.field3591[var15 - 1][var14 + 1] = var31;
            }
            if (var15 < 102 && var14 < 102 && class177.field3340[var15 + 1][var14 + 1] == 0 && (var18[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class97.field1697[var33] = var15 + 1;
                class145.field2777[var33] = var14 + 1;
                var33 = var33 + 1 & 0xFFF;
                class177.field3340[var15 + 1][var14 + 1] = 12;
                class192.field3591[var15 + 1][var14 + 1] = var31;
            }
        }
        class173.field3301 = 0;
        if (!var19) {
            if (!arg5) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg8 - var22; var23 <= arg8 + var22; var23++) {
                for (int var24 = arg1 - var22; var24 <= arg1 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class192.field3591[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (arg1 + arg7 - 1 < var24) {
                            var26 = var24 + 1 - arg7 - arg1;
                        }
                        if (arg8 > var23) {
                            var25 = arg8 - var23;
                        } else if (arg8 + arg9 - 1 < var23) {
                            var25 = var23 + 1 - arg8 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class192.field3591[var23][var24] < var21) {
                            var21 = class192.field3591[var23][var24];
                            var15 = var23;
                            var14 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg3 == var15 && arg2 == var14) {
                return false;
            }
            class173.field3301 = 1;
        }
        byte var28 = 0;
        class97.field1697[var28] = var15;
        int var34 = var28 + 1;
        class145.field2777[var28] = var14;
        int var29;
        int var30 = var29 = class177.field3340[var15][var14];
        while (arg3 != var15 || arg2 != var14) {
            if (var29 != var30) {
                class97.field1697[var34] = var15;
                class145.field2777[var34++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var15++;
            } else if ((var30 & 0x8) != 0) {
                var15--;
            }
            var30 = class177.field3340[var15][var14];
        }
        if (var34 > 0) {
            class30.method245(true, var34, class145.field2777, class97.field1697, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public static void method1087(int arg0) {
        field3060 = null;
        field3070 = null;
        field3069 = null;
        field3066 = null;
        if (arg0 >= -10) {
            field3071 = -65;
        }
        field3068 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lkd;)V")
    public class162(class112 arg0) {
        this.field3057 = arg0;
    }
}
