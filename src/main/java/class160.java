import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class160 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lag;")
    private class123 field2592 = new class123();

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Luc;")
    private class202 field2605 = new class202();

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    private int field2607;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lpd;")
    private class3 field2606;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2601 = null;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2602 = "wave:";

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lqh;")
    public static class315[] field2597;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIIIIII)V", line = 5)
    public static final void method1175(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2593++;
        if (class309.method2186(26080, arg2)) {
            if (arg1) {
                field2599 = -24;
            }
            client.method1866(class110.field1789[arg2], -1, arg3, arg5, arg0, arg7, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 27)
    public final void method1176(byte arg0) {
        field2608++;
        if (arg0 >= -20) {
            field2603 = -67;
        }
        this.field2605.method1454(-31175);
        this.field2606.method83(-23);
        this.field2592 = new class123();
        this.field2607 = this.field2604;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIBIII)V", line = 42)
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 84) {
            field2602 = (String) null;
        }
        field2600++;
        if (class309.method2186(26080, arg1)) {
            class53.method448(arg3, arg8, arg6, (byte) 127, -1, arg2, class110.field1789[arg1], arg4, arg7, arg0);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class280.field4378[var9] = true;
            }
        } else {
            class280.field4378[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 72)
    public static void method1178(byte arg0) {
        field2602 = null;
        field2601 = null;
        field2597 = null;
        if (arg0 > -77) {
            method1175(17, false, 70, -39, -82, 51, -84, 28);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1179(int arg0, int arg1) {
        if (arg1 != 0) {
            field2602 = (String) null;
        }
        field2590++;
        class16.field331.method2285(arg0, (byte) 114);
        class274.field4290.method2285(arg0, (byte) -38);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lvb;", line = 102)
    public final class60 method1180(int arg0) {
        if (arg0 >= -12) {
            return (class60) null;
        } else {
            field2596++;
            return this.field2606.method71((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Lvb;", line = 118)
    public final class60 method1181(byte arg0) {
        field2589++;
        int var2 = -42 % ((arg0 - 36) / 47);
        return this.field2606.method84(1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BJLag;)V", line = 130)
    public final void method1182(byte arg0, long arg1, class123 arg2) {
        int var5 = 126 % ((21 - arg0) / 36);
        if (this.field2607 == 0) {
            class123 var6 = this.field2605.method1452(13634);
            var6.method489(false);
            var6.method981(-116);
            if (this.field2592 == var6) {
                class123 var7 = this.field2605.method1452(13634);
                var7.method489(false);
                var7.method981(-121);
            }
        } else {
            this.field2607--;
        }
        field2594++;
        this.field2606.method75(arg2, -1, arg1);
        this.field2605.method1453(arg2, 122);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)Lag;", line = 162)
    public final class123 method1183(long arg0, byte arg1) {
        if (arg1 > -100) {
            return (class123) null;
        }
        class123 var4 = (class123) this.field2606.method79(arg0, (byte) 0);
        field2595++;
        if (var4 != null) {
            this.field2605.method1453(var4, 123);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 192)
    public static final int method1184(String arg0, String arg1, int arg2, int arg3) {
        field2598++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = 0;
        char var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while ((var8 - var7) < var4 || var5 > var6 - var9) {
            if (var4 <= var8 - var7) {
                return -1;
            }
            if (var6 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg1.charAt(var8++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var7 = class291.method2046(arg3 ^ 0xFFFFCEF2, var22);
            var9 = class291.method2046(arg3 + 46610, var24);
            char var26 = class124.method984(-64, var22, arg2);
            char var27 = class124.method984(arg3 ^ 0x72BE, var24, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class137.method1061(var28, (byte) 35, arg2) - class137.method1061(var29, (byte) 35, arg2);
                }
            }
        }
        if (arg3 != -29324) {
            method1179(66, -4);
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var12 = var5 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class137.method1061(var16, (byte) 35, arg2) - class137.method1061(var17, (byte) 35, arg2);
                }
            }
        }
        int var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class137.method1061(var20, (byte) 35, arg2) - class137.method1061(var21, (byte) 35, arg2);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[Ltk;I)V", line = 314)
    public static final void method1185(byte arg0, class266[] arg1, int arg2) {
        field2591++;
        if (arg0 >= -125) {
            field2597 = (class315[]) null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class266 var4 = arg1[var3];
            if (var4 != null && var4.field3926 == arg2 && (!var4.field4043 || !client.method1862(var4))) {
                if (var4.field4084 == 0) {
                    if (!var4.field4043 && client.method1862(var4) && class143.field2313 != var4) {
                        continue;
                    }
                    method1185((byte) -128, arg1, var4.field4088);
                    if (var4.field3994 != null) {
                        method1185((byte) -128, var4.field3994, var4.field4088);
                    }
                    class24 var5 = (class24) class158.field2584.method79((long) var4.field4088, (byte) 0);
                    if (var5 != null) {
                        class47.method403(var5.field417, (byte) 120);
                    }
                }
                if (var4.field4084 == 6) {
                    if (var4.field3975 != -1 || var4.field3993 != -1) {
                        boolean var6 = class264.method1823((byte) -89, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3993;
                        } else {
                            var7 = var4.field3975;
                        }
                        if (var7 != -1) {
                            class38 var8 = class63.method503(var7, (byte) 97);
                            if (var8 != null) {
                                var4.field4041 += class137.field2241;
                                while (var4.field4041 > var8.field568[var4.field4077]) {
                                    var4.field4041 -= var8.field568[var4.field4077];
                                    var4.field4077++;
                                    if (var8.field584.length <= var4.field4077) {
                                        var4.field4077 -= var8.field564;
                                        if (var4.field4077 < 0 || var8.field584.length <= var4.field4077) {
                                            var4.field4077 = 0;
                                        }
                                    }
                                    var4.field3966 = var4.field4077 + 1;
                                    if (var4.field3966 >= var8.field584.length) {
                                        var4.field3966 -= var8.field564;
                                        if (var4.field3966 < 0 || var8.field584.length <= var4.field3966) {
                                            var4.field3966 = -1;
                                        }
                                    }
                                    class280.method1971((byte) 101, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4073 != 0 && !var4.field4043) {
                        int var9 = var4.field4073 << 16 >> 16;
                        int var10 = class137.field2241 * var9;
                        var4.field3968 = var4.field3968 + var10 & 0x7FF;
                        int var11 = var4.field4073 >> 16;
                        int var12 = class137.field2241 * var11;
                        var4.field4020 = var4.field4020 + var12 & 0x7FF;
                        class280.method1971((byte) 101, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V", line = 446)
    public class160(int arg0) {
        this.field2607 = arg0;
        this.field2604 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2606 = new class3(var2);
    }
}
