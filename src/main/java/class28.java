import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class28 extends class183 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "[I")
    public static int[] field492 = new int[128];

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "[I")
    public static int[] field497 = new int[2500];

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[[Z")
    public static boolean[][] field499 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "[I")
    public static int[] field501 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "Ljf;")
    public static class229 field502 = class212.method1457((byte) 77, "sch-Utteln:");

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Ljf;")
    public static class229 field498 = class212.method1457((byte) 94, "Nehmen");

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 4)
    public static final void method244(int arg0) {
        field493++;
        if (class140.field2438 != null || class317.field5356 != null) {
            return;
        }
        if (arg0 != 0) {
            field501 = (int[]) null;
        }
        int var1 = class55.field969;
        if (class61.field1044) {
            if (var1 != 1) {
                int var6 = class287.field4914;
                int var7 = class82.field1511;
                if (var6 < class261.field4536 - 10 || (class261.field4536 + class202.field3536 + 10) < var6 || var7 < class240.field4229 - 10 || class240.field4229 + class12.field142 + 10 < var7) {
                    class61.field1044 = false;
                    class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
                }
            }
            if (var1 == 1) {
                int var8 = class261.field4536;
                int var9 = class240.field4229;
                int var10 = class202.field3536;
                int var11 = class60.field1033;
                int var12 = class222.field3791;
                int var13 = -1;
                for (int var14 = 0; var14 < class124.field2176; var14++) {
                    int var15 = ((class124.field2176 - var14 - 1) * 15) + var9 + 31;
                    if (var12 > var8 && var12 < var8 + var10 && var11 > (var15 - 13) && (var15 + 3) > var11) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class325.method2188(true, var13);
                }
                class61.field1044 = false;
                class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
            }
            return;
        }
        if (var1 == 1 && class124.field2176 > 0) {
            short var2 = class115.field2063[class124.field2176 - 1];
            if (var2 == 10 || var2 == 33 || var2 == 1 || var2 == 15 || var2 == 12 || var2 == 13 || var2 == 58 || var2 == 3 || var2 == 5 || var2 == 17 || var2 == 14 || var2 == 1007) {
                int var3 = class18.field282[class124.field2176 - 1];
                int var4 = class229.field3952[class124.field2176 - 1];
                class67 var5 = class96.method662(var3, true);
                if (class230.method1663(6449, client.method1820(var5)) || class245.method1778(client.method1820(var5), (byte) -103)) {
                    class260.field4516 = 0;
                    class98.field1746 = false;
                    if (class140.field2438 != null) {
                        class194.method1328((byte) -105, class140.field2438);
                    }
                    class140.field2438 = class96.method662(var3, true);
                    class308.field5209 = var4;
                    class60.field1036 = class222.field3791;
                    class217.field3731 = class60.field1033;
                    class194.method1328((byte) -68, class140.field2438);
                    return;
                }
            }
        }
        if (var1 == 1 && (class189.field3292 == 1 && class124.field2176 > 2 || class70.method516(class124.field2176 - 1, (byte) -111))) {
            var1 = 2;
        }
        if (var1 == 2 && class124.field2176 > 0 || class146.field2531 == 1) {
            class14.method96(10754);
        }
        if (var1 == 1 && class124.field2176 > 0 || class146.field2531 == 2) {
            class109.method774(8608);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BILjf;Ljf;)V", line = 130)
    public static final void method245(byte arg0, int arg1, class229 arg2, class229 arg3) {
        field503++;
        class274.method1917((class229) null, -1, arg2, arg3, arg1, -117);
        if (arg0 != -75) {
            method247(-103, (class229) null, false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V", line = 142)
    public static void method246(int arg0) {
        field497 = null;
        field492 = null;
        field501 = null;
        field502 = null;
        field499 = (boolean[][]) null;
        if (arg0 != 13648) {
            method247(72, (class229) null, true);
        }
        field498 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I", line = 161)
    public final int[][] method12(int arg0, int arg1) {
        field491++;
        int var3 = 57 % ((18 - arg0) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class22.field393; var8++) {
                this.method248((byte) 120, var8, arg1);
                int[][] var9 = this.method1250(class305.field5166, 0, (byte) 122);
                var7[var8] = var9[0][class19.field292];
                var6[var8] = var9[1][class19.field292];
                var5[var8] = var9[2][class19.field292];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILkh;I)V", line = 198)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3166 = arg1.method93(false) == 1;
        }
        field495++;
        if (arg0 >= -43) {
            this.method12(108, 48);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjf;Z)V", line = 213)
    public static final void method247(int arg0, class229 arg1, boolean arg2) {
        field494++;
        class229 var3 = arg1.method1608(-199);
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class111.field1957 : class249.field4389) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class42 var9 = class27.method242(var8, -30280);
            if (var9.field758 && var9.method359(41).method1608(-199).method1649(var3, (byte) -102) != -1) {
                if (var5 >= 50) {
                    class327.field5492 = null;
                    class111.field1950 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class327.field5492 = var4;
        class111.field1950 = var5;
        class228.field3923 = 0;
        if (arg0 < 80) {
            return;
        }
        class229[] var12 = new class229[class111.field1950];
        for (int var13 = 0; var13 < class111.field1950; var13++) {
            var12[var13] = class27.method242(var4[var13], -30280).method359(100);
        }
        class329.method2242(false, var12, class327.field5492);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)[I", line = 294)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, arg1 ^ arg1);
        if (this.field3161.field1736) {
            for (int var4 = 0; var4 < class22.field393; var4++) {
                this.method248((byte) 109, var4, arg0);
                int[] var5 = this.method1253(0, class305.field5166, arg1 + 121);
                var3[var4] = var5[class19.field292];
            }
        }
        field500++;
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 320)
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V", line = 330)
    private final void method248(byte arg0, int arg1, int arg2) {
        if (arg0 < 28) {
            field499 = (boolean[][]) ((boolean[][]) null);
        }
        field496++;
        int var4 = class97.field1737[arg1];
        int var5 = class42.field746[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
            class19.field292 = arg1;
            class305.field5166 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class305.field5166 = arg1;
            class19.field292 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class19.field292 = class22.field393 - arg2;
            class305.field5166 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class305.field5166 = class144.field2508 - arg2;
            class19.field292 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class19.field292 = class22.field393 - arg1;
            class305.field5166 = class144.field2508 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class305.field5166 = class144.field2508 - arg1;
            class19.field292 = class22.field393 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class305.field5166 = class144.field2508 - arg1;
            class19.field292 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class19.field292 = class22.field393 - arg1;
            class305.field5166 = arg2;
        }
        class19.field292 &= class52.field913;
        class305.field5166 &= class252.field4405;
    }
}
