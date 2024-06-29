import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class175 extends class80 {

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Lr;")
    public class66 field3086;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3076 = 0;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lr;")
    private static class66 field3077 = class93.method641(43, "Loading textures )2 ");

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lr;")
    public static class66 field3075 = field3077;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lr;")
    public static class66 field3082 = class93.method641(43, "http:)4)4");

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lr;")
    public static class66 field3085 = class93.method641(43, "settings");

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILha;)I")
    public static final int method1178(int arg0, int arg1, class63 arg2) {
        field3080++;
        if (arg2.field1231 == null || arg2.field1231.length <= arg0) {
            return -2;
        }
        try {
            if (arg1 != 20) {
                method1181(-10, -70, 84, -119, -48, -79, 2, (byte) -64);
            }
            int[] var3 = arg2.field1231[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var9 = class98.field1919[var3[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 2) {
                    var9 = class121.field2290[var3[var4++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class52.field928[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class63 var12 = class54.method367(var11, (byte) -80);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class40.method242(-25672, var13).field2822 || class260.field4587)) {
                        for (int var14 = 0; var14 < var12.field1118.length; var14++) {
                            if (var13 + 1 == var12.field1118[var14]) {
                                var9 += var12.field1097[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class89.field1726[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class196.field3380[class121.field2290[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class89.field1726[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class207.field3595.field816;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class42.field693[var15]) {
                            var9 += class121.field2290[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class63 var18 = class54.method367(var17, (byte) -80);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class40.method242(-25672, var19).field2822 || class260.field4587)) {
                        for (int var20 = 0; var20 < var18.field1118.length; var20++) {
                            if (var19 + 1 == var18.field1118[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class197.field3407;
                }
                if (var7 == 12) {
                    var9 = class81.field1587;
                }
                if (var7 == 13) {
                    int var21 = class89.field1726[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class226.method1440(var23, false);
                }
                if (var7 == 18) {
                    var9 = (class207.field3595.field2077 >> 7) + class3.field39;
                }
                if (var7 == 19) {
                    var9 = (class207.field3595.field2053 >> 7) + class34.field512;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var6 += var9;
                    }
                    if (var5 == 1) {
                        var6 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var5 == 3) {
                        var6 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        field3078++;
        class252 var1 = class218.field3747;
        synchronized (class218.field3747) {
            class73.field1447 = class95.field1836;
            class9.field104++;
            if (class9.field90 >= 0) {
                while (class9.field90 != class139.field2582) {
                    int var3 = class62.field1048[class139.field2582];
                    class139.field2582 = class139.field2582 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class167.field3009[var3] = true;
                    } else {
                        class167.field3009[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class167.field3009[var2] = false;
                }
                class9.field90 = class139.field2582;
            }
            class95.field1836 = class1.field12;
        }
        int var4 = 10 / ((arg0 - 91) / 35);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        field3082 = null;
        if (arg0 != -69) {
            field3075 = null;
        }
        field3085 = null;
        field3077 = null;
        field3075 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3084++;
        int var8 = 2048 - arg6 & 0x7FF;
        int var9 = 2048 - arg1 & 0x7FF;
        if (arg7 <= 26) {
            return;
        }
        int var10 = 0;
        int var11 = arg4;
        if (var8 != 0) {
            int var12 = class123.field2314[var8];
            int var13 = class123.field2326[var8];
            var10 = -arg4 * var12 >> 16;
            var11 = arg4 * var13 >> 16;
        }
        int var14 = 0;
        if (var9 != 0) {
            int var15 = class123.field2314[var9];
            var14 = var11 * var15 >> 16;
            int var16 = class123.field2326[var9];
            var11 = var11 * var16 >> 16;
        }
        class250.field4410 = arg1;
        class253.field4435 = arg6;
        class134.field2494 = arg3 - var10;
        class207.field3597 = arg2 - var14;
        class192.field3330 = arg5 - var11;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I")
    public static final int method1182(int arg0, int arg1, int arg2) {
        field3079++;
        if (arg0 == 0) {
            long var3 = (long) ((arg2 << 16) + arg1);
            return class24.field313 != null && class24.field313.field1560 == var3 ? class252.field4432.field4335 * 99 / (class252.field4432.field4350.length - class24.field313.field936) + 1 : 0;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class175() {
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lr;I)V")
    public class175(class66 arg0, int arg1) {
        this.field3086 = arg0;
    }
}
