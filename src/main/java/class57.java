import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class57 extends class200 {

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Z")
    public static boolean field1057 = false;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field1068 = 100;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "Ldj;")
    public static class44 field1073 = class89.method650(255, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Ldj;")
    public static class44 field1064 = class89.method650(255, "::rect_debug");

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "Ldj;")
    public static class44 field1076 = class89.method650(255, ":assistreq:");

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "B")
    public static byte field1074 = 0;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "[I")
    private int[] field1059;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
    public int[] field1070;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "[I")
    public static int[] field1072;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "[Lod;")
    public static class155[] field1062;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "[Ldj;")
    private class44[] field1077;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "[[I")
    private int[][] field1055;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I")
    public final int method429(int arg0, int arg1, int arg2) {
        field1061++;
        int var4 = 5 / ((arg2 + 56) / 54);
        if (this.field1059 == null || arg0 < 0 || this.field1059.length < arg0) {
            return -1;
        } else if (this.field1055[arg0] == null || arg1 < 0 || this.field1055[arg0].length < arg1) {
            return -1;
        } else {
            return this.field1055[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static final void method430(boolean arg0) {
        field1069++;
        class82.field1602.method1179((byte) -104);
        class160.field2766.method676(0);
        class31.field548.method676(0);
        if (!arg0) {
            field1073 = null;
        }
        class45.field857.method676(0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILfj;)V")
    private final void method431(int arg0, int arg1, class66 arg2) {
        if (arg1 == 1) {
            this.field1077 = arg2.method496(true).method303(4423, 60);
        } else if (arg1 == 2) {
            int var8 = arg2.method506(255);
            this.field1070 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1070[var9] = arg2.method500(79);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method506(255);
            this.field1055 = new int[var4][];
            this.field1059 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method500(112);
                this.field1059[var5] = var6;
                this.field1055[var5] = new int[class50.field922[var6]];
                for (int var7 = 0; var7 < class50.field922[var6]; var7++) {
                    this.field1055[var5][var7] = arg2.method500(39);
                }
            }
        }
        int var10 = -105 / ((arg0 + 20) / 46);
        field1067++;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1072 = null;
        field1064 = null;
        field1073 = null;
        field1062 = null;
        if (arg0 >= -28) {
            field1066 = 63;
        }
        field1076 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)I")
    public final int method433(int arg0, int arg1) {
        int var3 = -90 / ((38 - arg0) / 60);
        field1063++;
        return this.field1059 == null || arg1 < 0 || arg1 > this.field1059.length ? -1 : this.field1059[arg1];
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
    public final int method434(int arg0) {
        field1075++;
        if (arg0 != 8) {
            field1068 = 65;
        }
        return this.field1059 == null ? 0 : this.field1059.length;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfj;B)V")
    public final void method435(class66 arg0, byte arg1) {
        field1065++;
        while (true) {
            int var3 = arg0.method506(255);
            if (var3 == 0) {
                if (arg1 < 118) {
                    method430(false);
                    return;
                } else {
                    return;
                }
            }
            this.method431(-107, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lfj;B)Ldj;")
    public final class44 method436(class66 arg0, byte arg1) {
        if (arg1 != 93) {
            this.method433(114, 58);
        }
        field1071++;
        class44 var3 = class136.method918(80, (byte) 103);
        if (this.field1059 != null) {
            for (int var4 = 0; var4 < this.field1059.length; var4++) {
                var3.method337(this.field1077[var4], false);
                var3.method337(class59.method448(this.field1059[var4], (byte) 118, arg0.method481(class147.field2602[this.field1059[var4]], (byte) 106), this.field1055[var4]), false);
            }
        }
        var3.method337(this.field1077[this.field1077.length - 1], false);
        return var3.method311((byte) -118);
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Ldj;")
    public final class44 method437(int arg0) {
        field1056++;
        int var2 = -93 % ((arg0 - 21) / 43);
        class44 var3 = class136.method918(80, (byte) 121);
        var3.method337(this.field1077[0], false);
        for (int var4 = 1; var4 < this.field1077.length; var4++) {
            var3.method337(class70.field1346, false);
            var3.method337(this.field1077[var4], false);
        }
        return var3.method311((byte) -118);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfj;[II)V")
    public final void method438(class66 arg0, int[] arg1, int arg2) {
        field1060++;
        if (this.field1059 == null) {
            return;
        }
        if (arg2 != 8) {
            method439(87, -120, -2);
        }
        for (int var4 = 0; var4 < this.field1059.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class227.field4269[this.method433(122, var4)];
            if (var5 > 0) {
                arg0.method502(var5, (byte) -57, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)Z")
    public static final boolean method439(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class190.field3292; var3++) {
            class130 var4 = class59.field1107[var3];
            if (var4.field2311 == 1) {
                int var5 = var4.field2321 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2318 * var5 >> 8) + var4.field2314;
                    int var7 = (var4.field2315 * var5 >> 8) + var4.field2329;
                    int var8 = (var4.field2317 * var5 >> 8) + var4.field2330;
                    int var9 = (var4.field2325 * var5 >> 8) + var4.field2316;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2311 == 2) {
                int var10 = arg0 - var4.field2321;
                if (var10 > 0) {
                    int var11 = (var4.field2318 * var10 >> 8) + var4.field2314;
                    int var12 = (var4.field2315 * var10 >> 8) + var4.field2329;
                    int var13 = (var4.field2317 * var10 >> 8) + var4.field2330;
                    int var14 = (var4.field2325 * var10 >> 8) + var4.field2316;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2311 == 3) {
                int var15 = var4.field2314 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2333 * var15 >> 8) + var4.field2321;
                    int var17 = (var4.field2323 * var15 >> 8) + var4.field2335;
                    int var18 = (var4.field2317 * var15 >> 8) + var4.field2330;
                    int var19 = (var4.field2325 * var15 >> 8) + var4.field2316;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2311 == 4) {
                int var20 = arg2 - var4.field2314;
                if (var20 > 0) {
                    int var21 = (var4.field2333 * var20 >> 8) + var4.field2321;
                    int var22 = (var4.field2323 * var20 >> 8) + var4.field2335;
                    int var23 = (var4.field2317 * var20 >> 8) + var4.field2330;
                    int var24 = (var4.field2325 * var20 >> 8) + var4.field2316;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2311 == 5) {
                int var25 = arg1 - var4.field2330;
                if (var25 > 0) {
                    int var26 = (var4.field2333 * var25 >> 8) + var4.field2321;
                    int var27 = (var4.field2323 * var25 >> 8) + var4.field2335;
                    int var28 = (var4.field2318 * var25 >> 8) + var4.field2314;
                    int var29 = (var4.field2315 * var25 >> 8) + var4.field2329;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
