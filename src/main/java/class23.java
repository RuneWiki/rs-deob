import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class23 extends class202 {

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
    public boolean field359 = false;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    private int field362 = -32768;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    private int field378 = -1;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    private int field376 = 0;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Lwk;")
    private class195 field373;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
    public static int[] field357 = new int[4096];

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Lte;")
    private class220 field372;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field368++;
        if (!this.field375) {
            class94 var6 = this.method153((byte) 26);
            if (var6 == null) {
                return;
            }
            this.method149(var6, 1);
        }
        if (this.field372 != null) {
            this.field372.method1442(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lmi;I)V")
    private final void method149(class94 arg0, int arg1) {
        field366++;
        class66 var3 = (class66) arg0;
        if ((this.field372 == null || this.field372.field3413) && (var3.field884 != null || var3.field885 != null)) {
            this.field372 = new class220(class35.field533, 1, 1);
        }
        if (this.field372 != null) {
            this.field372.method1443(var3.field884, var3.field885, false, var3.field872, var3.field901, var3.field903);
        }
        if (arg1 != 1) {
            this.method153((byte) -8);
        }
        this.field375 = true;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I")
    public final int method9() {
        field380++;
        return this.field362;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        if (arg0 != 2) {
            return;
        }
        field364++;
        if (this.field359) {
            return;
        }
        this.field367 += arg1;
        while (this.field373.field2966[this.field376] < this.field367) {
            this.field367 -= this.field373.field2966[this.field376];
            this.field376++;
            if (this.field373.field2989.length <= this.field376) {
                this.field359 = true;
                break;
            }
        }
        if (!this.field359) {
            class181.method1152(false, this.field360, this.field376, this.field363, false, this.field373);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static final void method151(boolean arg0) {
        class116.field1672 = null;
        class157.field2164 = null;
        field377++;
        class282.field4525 = null;
        if (arg0) {
            method151(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBIZIIIIII)V")
    public static final void method152(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class238.field3693[var11][var27] = 0;
                class106.field1517[var11][var27] = 99999999;
            }
        }
        if (arg2 > -111) {
            field370 = -63;
        }
        int var12 = arg0;
        field361++;
        class238.field3693[arg0][arg6] = 99;
        class106.field1517[arg0][arg6] = 0;
        int var13 = 0;
        int var14 = arg6;
        boolean var15 = false;
        byte var16 = 0;
        field357[var16] = arg0;
        int var28 = var16 + 1;
        class301.field4784[var16] = arg6;
        int[][] var17 = class156.field2153[class166.field2364].field3204;
        while (var13 != var28) {
            var12 = field357[var13];
            var14 = class301.field4784[var13];
            var13 = var13 + 1 & 0xFFF;
            if (arg3 == var12 && arg7 == var14) {
                var15 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class156.field2153[class166.field2364].method1328(51, arg7, arg10 - 1, arg3, 2, var14, arg5, var12)) {
                    var15 = true;
                    break;
                }
                if (arg10 < 10 && class156.field2153[class166.field2364].method1329(arg5, arg7, var14, (byte) -106, arg3, var12, arg10 - 1, 2)) {
                    var15 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg8 != 0 && class156.field2153[class166.field2364].method1337((byte) -110, arg9, var12, var14, arg3, 2, arg1, arg8, arg7)) {
                var15 = true;
                break;
            }
            int var26 = class106.field1517[var12][var14] + 1;
            if (var12 > 0 && class238.field3693[var12 - 1][var14] == 0 && (var17[var12 - 1][var14] & 0x2C010E) == 0 && (var17[var12 - 1][var14 + 1] & 0x2C0138) == 0) {
                field357[var28] = var12 - 1;
                class301.field4784[var28] = var14;
                class238.field3693[var12 - 1][var14] = 2;
                var28 = var28 + 1 & 0xFFF;
                class106.field1517[var12 - 1][var14] = var26;
            }
            if (var12 < 102 && class238.field3693[var12 + 1][var14] == 0 && (var17[var12 + 2][var14] & 0x2C0183) == 0 && (var17[var12 + 2][var14 + 1] & 0x2C01E0) == 0) {
                field357[var28] = var12 + 1;
                class301.field4784[var28] = var14;
                var28 = var28 + 1 & 0xFFF;
                class238.field3693[var12 + 1][var14] = 8;
                class106.field1517[var12 + 1][var14] = var26;
            }
            if (var14 > 0 && class238.field3693[var12][var14 - 1] == 0 && (var17[var12][var14 - 1] & 0x2C010E) == 0 && (var17[var12 + 1][var14 - 1] & 0x2C0183) == 0) {
                field357[var28] = var12;
                class301.field4784[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class238.field3693[var12][var14 - 1] = 1;
                class106.field1517[var12][var14 - 1] = var26;
            }
            if (var14 < 102 && class238.field3693[var12][var14 + 1] == 0 && (var17[var12][var14 + 2] & 0x2C0138) == 0 && (var17[var12 + 1][var14 + 2] & 0x2C01E0) == 0) {
                field357[var28] = var12;
                class301.field4784[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class238.field3693[var12][var14 + 1] = 4;
                class106.field1517[var12][var14 + 1] = var26;
            }
            if (var12 > 0 && var14 > 0 && class238.field3693[var12 - 1][var14 - 1] == 0 && (var17[var12 - 1][var14] & 0x2C013E) == 0 && (var17[var12 - 1][var14 - 1] & 0x2C010E) == 0 && (var17[var12][var14 - 1] & 0x2C018F) == 0) {
                field357[var28] = var12 - 1;
                class301.field4784[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class238.field3693[var12 - 1][var14 - 1] = 3;
                class106.field1517[var12 - 1][var14 - 1] = var26;
            }
            if (var12 < 102 && var14 > 0 && class238.field3693[var12 + 1][var14 - 1] == 0 && (var17[var12 + 1][var14 - 1] & 0x2C018F) == 0 && (var17[var12 + 2][var14 - 1] & 0x2C0183) == 0 && (var17[var12 + 2][var14] & 0x2C01E3) == 0) {
                field357[var28] = var12 + 1;
                class301.field4784[var28] = var14 - 1;
                class238.field3693[var12 + 1][var14 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class106.field1517[var12 + 1][var14 - 1] = var26;
            }
            if (var12 > 0 && var14 < 102 && class238.field3693[var12 - 1][var14 + 1] == 0 && (var17[var12 - 1][var14 + 1] & 0x2C013E) == 0 && (var17[var12 - 1][var14 + 2] & 0x2C0138) == 0 && (var17[var12][var14 + 2] & 0x2C01F8) == 0) {
                field357[var28] = var12 - 1;
                class301.field4784[var28] = var14 + 1;
                class238.field3693[var12 - 1][var14 + 1] = 6;
                var28 = var28 + 1 & 0xFFF;
                class106.field1517[var12 - 1][var14 + 1] = var26;
            }
            if (var12 < 102 && var14 < 102 && class238.field3693[var12 + 1][var14 + 1] == 0 && (var17[var12 + 1][var14 + 2] & 0x2C01F8) == 0 && (var17[var12 + 2][var14 + 2] & 0x2C01E0) == 0 && (var17[var12 + 2][var14 + 1] & 0x2C01E3) == 0) {
                field357[var28] = var12 + 1;
                class301.field4784[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class238.field3693[var12 + 1][var14 + 1] = 12;
                class106.field1517[var12 + 1][var14 + 1] = var26;
            }
        }
        if (!var15) {
            if (!arg4) {
                return;
            }
            int var18 = 1000;
            int var19 = 100;
            byte var20 = 10;
            for (int var21 = arg3 - var20; var21 <= (arg3 + var20); var21++) {
                for (int var22 = arg7 - var20; var22 <= arg7 + var20; var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class106.field1517[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg3 > var21) {
                            var23 = arg3 - var21;
                        } else if ((arg9 + arg3 - 1) < var21) {
                            var23 = var21 + 1 - arg3 - arg9;
                        }
                        int var24 = 0;
                        if (arg7 > var22) {
                            var24 = arg7 - var22;
                        } else if (var22 > arg7 + arg8 - 1) {
                            var24 = var22 + 1 - arg7 - arg8;
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var18 > var25 || var18 == var25 && class106.field1517[var21][var22] < var19) {
                            var18 = var25;
                            var12 = var21;
                            var14 = var22;
                            var19 = class106.field1517[var21][var22];
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg0 == var12 && arg6 == var14) {
                return;
            }
        }
        class141.field1939 = var12;
        class176.field2485 = false;
        class274.field4354 = var14;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Lmi;")
    private final class94 method153(byte arg0) {
        field369++;
        class167 var2 = class291.method1952(0, this.field371);
        class94 var3;
        if (this.field359) {
            var3 = var2.method1072(-1, 1, -1, 0);
        } else {
            var3 = var2.method1072(this.field376, arg0 - 25, this.field378, this.field367);
        }
        if (var3 == null) {
            return null;
        } else if (arg0 == 26) {
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static void method154(int arg0) {
        if (arg0 == -15065) {
            field357 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        field358++;
        class94 var13 = this.method153((byte) 26);
        if (var13 != null) {
            this.method149(var13, 1);
            var13.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field372);
            this.field362 = var13.method9();
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field374 = arg1;
        this.field360 = arg2;
        this.field379 = arg5 + arg6;
        this.field371 = arg0;
        this.field363 = arg3;
        this.field365 = arg4;
        int var8 = class291.method1952(0, this.field371).field2375;
        if (var8 == -1) {
            this.field359 = true;
        } else {
            this.field359 = false;
            this.field373 = class280.method1815(var8, 78);
        }
        if (this.field379 == arg6) {
            class181.method1152(false, this.field360, this.field376, this.field363, false, this.field373);
        }
    }
}
