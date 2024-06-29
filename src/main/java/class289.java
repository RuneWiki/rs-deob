import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class289 {

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    private int field4375 = -1;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    private int field4372 = 0;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lbo;")
    private class16 field4373 = new class16();

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Z")
    public boolean field4382 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    private int field4365;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    private int field4366;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[[I")
    private int[][] field4368;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[Lsk;")
    private class231[] field4367;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4371 = 0;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Lqf;")
    public static class359 field4380 = null;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lph;")
    public static class361 field4369;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lph;")
    public static class361 field4377;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 7)
    public final void method2083(int arg0) {
        for (int var2 = arg0; var2 < this.field4365; var2++) {
            this.field4368[var2] = null;
        }
        this.field4368 = (int[][]) null;
        this.field4367 = null;
        this.field4373.method95(arg0 - 30123);
        this.field4373 = null;
        field4374++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)[[I", line = 31)
    public final int[][] method2084(int arg0) {
        field4370++;
        if (this.field4366 != this.field4365) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -27062) {
            field4380 = (class359) null;
        }
        for (int var2 = 0; var2 < this.field4365; var2++) {
            this.field4367[var2] = class212.field3070;
        }
        return this.field4368;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 62)
    public static void method2085(int arg0) {
        if (arg0 == 15264) {
            field4380 = null;
            field4369 = null;
            field4377 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBIIZIIIIII)V", line = 74)
    public static final void method2086(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4379++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class17.field283[var11][var12] = 0;
                class208.field3040[var11][var12] = 99999999;
            }
        }
        class17.field283[arg2][arg0] = 99;
        if (arg1 != -3) {
            field4381 = 61;
        }
        class208.field3040[arg2][arg0] = 0;
        int var13 = arg2;
        byte var14 = 0;
        int var15 = 0;
        int var16 = arg0;
        class1.field59[var14] = arg2;
        boolean var17 = false;
        int var28 = var14 + 1;
        class67.field988[var14] = arg0;
        int[][] var18 = class92.field1269[class321.field4835].field1349;
        while (var28 != var15) {
            var13 = class1.field59[var15];
            var16 = class67.field988[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg7 == var13 && arg3 == var16) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class92.field1269[class321.field4835].method759(arg7, -1140146928, var16, arg8 - 1, var13, arg6, 2, arg3)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class92.field1269[class321.field4835].method751(2, arg8 - 1, arg6, var13, arg7, arg1 ^ 0xFFFFFFFC, var16, arg3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg10 != 0 && class92.field1269[class321.field4835].method764(var16, arg9, arg5, arg7, arg10, arg3, 2, var13, -80)) {
                var17 = true;
                break;
            }
            int var19 = class208.field3040[var13][var16] + 1;
            if (var13 > 0 && class17.field283[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x2C010E) == 0 && (var18[var13 - 1][var16 + 1] & 0x2C0138) == 0) {
                class1.field59[var28] = var13 - 1;
                class67.field988[var28] = var16;
                class17.field283[var13 - 1][var16] = 2;
                class208.field3040[var13 - 1][var16] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 102 && class17.field283[var13 + 1][var16] == 0 && (var18[var13 + 2][var16] & 0x2C0183) == 0 && (var18[var13 + 2][var16 + 1] & 0x2C01E0) == 0) {
                class1.field59[var28] = var13 + 1;
                class67.field988[var28] = var16;
                class17.field283[var13 + 1][var16] = 8;
                var28 = var28 + 1 & 0xFFF;
                class208.field3040[var13 + 1][var16] = var19;
            }
            if (var16 > 0 && class17.field283[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x2C010E) == 0 && (var18[var13 + 1][var16 - 1] & 0x2C0183) == 0) {
                class1.field59[var28] = var13;
                class67.field988[var28] = var16 - 1;
                var28 = var28 + 1 & 0xFFF;
                class17.field283[var13][var16 - 1] = 1;
                class208.field3040[var13][var16 - 1] = var19;
            }
            if (var16 < 102 && class17.field283[var13][var16 + 1] == 0 && (var18[var13][var16 + 2] & 0x2C0138) == 0 && (var18[var13 + 1][var16 + 2] & 0x2C01E0) == 0) {
                class1.field59[var28] = var13;
                class67.field988[var28] = var16 + 1;
                var28 = var28 + 1 & 0xFFF;
                class17.field283[var13][var16 + 1] = 4;
                class208.field3040[var13][var16 + 1] = var19;
            }
            if (var13 > 0 && var16 > 0 && class17.field283[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16] & 0x2C013E) == 0 && (var18[var13 - 1][var16 - 1] & 0x2C010E) == 0 && (var18[var13][var16 - 1] & 0x2C018F) == 0) {
                class1.field59[var28] = var13 - 1;
                class67.field988[var28] = var16 - 1;
                var28 = var28 + 1 & 0xFFF;
                class17.field283[var13 - 1][var16 - 1] = 3;
                class208.field3040[var13 - 1][var16 - 1] = var19;
            }
            if (var13 < 102 && var16 > 0 && class17.field283[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x2C018F) == 0 && (var18[var13 + 2][var16 - 1] & 0x2C0183) == 0 && (var18[var13 + 2][var16] & 0x2C01E3) == 0) {
                class1.field59[var28] = var13 + 1;
                class67.field988[var28] = var16 - 1;
                class17.field283[var13 + 1][var16 - 1] = 9;
                class208.field3040[var13 + 1][var16 - 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 > 0 && var16 < 102 && class17.field283[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x2C013E) == 0 && (var18[var13 - 1][var16 + 2] & 0x2C0138) == 0 && (var18[var13][var16 + 2] & 0x2C01F8) == 0) {
                class1.field59[var28] = var13 - 1;
                class67.field988[var28] = var16 + 1;
                class17.field283[var13 - 1][var16 + 1] = 6;
                class208.field3040[var13 - 1][var16 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 102 && var16 < 102 && class17.field283[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 2] & 0x2C01F8) == 0 && (var18[var13 + 2][var16 + 2] & 0x2C01E0) == 0 && (var18[var13 + 2][var16 + 1] & 0x2C01E3) == 0) {
                class1.field59[var28] = var13 + 1;
                class67.field988[var28] = var16 + 1;
                var28 = var28 + 1 & 0xFFF;
                class17.field283[var13 + 1][var16 + 1] = 12;
                class208.field3040[var13 + 1][var16 + 1] = var19;
            }
        }
        if (!var17) {
            if (!arg4) {
                return;
            }
            byte var20 = 10;
            int var21 = 100;
            int var22 = 1000;
            for (int var23 = arg7 - var20; var23 <= arg7 + var20; var23++) {
                for (int var24 = arg3 - var20; var24 <= arg3 + var20; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class208.field3040[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg3 > var24) {
                            var26 = arg3 - var24;
                        } else if ((arg3 + arg10 - 1) < var24) {
                            var26 = var24 + 1 - arg3 - arg10;
                        }
                        if (var23 < arg7) {
                            var25 = arg7 - var23;
                        } else if (arg7 + arg9 - 1 < var23) {
                            var25 = var23 + 1 - arg7 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var22 || var22 == var27 && var21 > class208.field3040[var23][var24]) {
                            var22 = var27;
                            var21 = class208.field3040[var23][var24];
                            var16 = var24;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return;
            }
            if (arg2 == var13 && arg0 == var16) {
                return;
            }
        }
        class358.field5478 = var16;
        class50.field757 = false;
        class3.field101 = var13;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I", line = 425)
    public final int[] method2087(int arg0, int arg1) {
        if (arg0 > -36) {
            method2086(24, (byte) 70, -41, 90, true, -18, 126, -89, 16, -112, -47);
        }
        field4376++;
        if (this.field4366 == this.field4365) {
            this.field4382 = this.field4367[arg1] == null;
            this.field4367[arg1] = class212.field3070;
            return this.field4368[arg1];
        } else if (this.field4365 == 1) {
            this.field4382 = this.field4375 != arg1;
            this.field4375 = arg1;
            return this.field4368[0];
        } else {
            class231 var3 = this.field4367[arg1];
            if (var3 == null) {
                this.field4382 = true;
                if (this.field4372 < this.field4365) {
                    var3 = new class231(arg1, this.field4372);
                    this.field4372++;
                } else {
                    class231 var4 = (class231) this.field4373.method94(false);
                    var3 = new class231(arg1, var4.field3498);
                    this.field4367[var4.field3494] = null;
                    var4.method876(8);
                }
                this.field4367[arg1] = var3;
            } else {
                this.field4382 = false;
            }
            this.field4373.method99(var3, (byte) 33);
            return this.field4368[var3.field3498];
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V", line = 520)
    public class289(int arg0, int arg1, int arg2) {
        this.field4365 = arg0;
        this.field4366 = arg1;
        this.field4368 = new int[this.field4365][arg2];
        this.field4367 = new class231[this.field4366];
    }
}
