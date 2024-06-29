import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class184 extends class128 {

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/lang/String;")
    private String field3117 = "null";

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lc;")
    public static class331 field3119 = new class331();

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "[[B")
    public static byte[][] field3131 = new byte[250][];

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "C")
    public char field3113;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "C")
    public char field3126;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "Ltm;")
    private class79 field3129;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Ltm;")
    public class79 field3132;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)I", line = 4)
    public final int method1414(byte arg0, int arg1) {
        field3125++;
        if (this.field3132 == null) {
            return this.field3120;
        } else if (arg0 > -74) {
            return -90;
        } else {
            class142 var3 = (class142) this.field3132.method732((long) arg1, true);
            return var3 == null ? this.field3120 : var3.field2601;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(Z)V", line = 28)
    private final void method1415(boolean arg0) {
        field3130++;
        this.field3129 = new class79(this.field3132.method733((byte) 122));
        if (arg0) {
            for (class190 var2 = (class190) this.field3132.method736(2); var2 != null; var2 = (class190) this.field3132.method727((byte) -110)) {
                class176 var3 = new class176(var2.field3186, (int) var2.field5062);
                this.field3129.method725(class116.method984(121, var2.field3186), var3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(Z)V", line = 51)
    private final void method1416(boolean arg0) {
        this.field3129 = new class79(this.field3132.method733((byte) 121));
        for (class142 var2 = (class142) this.field3132.method736(2); var2 != null; var2 = (class142) this.field3132.method727((byte) -110)) {
            class142 var3 = new class142((int) var2.field5062);
            this.field3129.method725((long) var2.field2601, var3, 1);
        }
        if (!arg0) {
            this.method1418(66, -9);
        }
        field3116++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII[Lao;ZIIIII)V", line = 87)
    public static final void method1417(int arg0, byte[] arg1, int arg2, int arg3, class200[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class336 var11 = new class336(arg1);
        if (arg2 != -4765) {
            return;
        }
        field3124++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method2347(32767);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method2314((byte) -43);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method2364(arg2 ^ 0x31F0);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg8 == var19 && var17 >= arg9 && (arg9 + 8) > var17 && arg6 <= var16 && var16 < (arg6 + 8)) {
                    class97 var22 = class92.method798((byte) 104, var12);
                    int var23 = class247.method1739(var22.field1549, var22.field1559, arg7, var16 & 0x7, 5, var21, var17 & 0x7) + arg0;
                    int var24 = class25.method235(var22.field1559, var22.field1549, 84, arg7, var16 & 0x7, var21, var17 & 0x7) + arg3;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class200 var25 = null;
                        if (!arg5) {
                            int var26 = arg10;
                            if ((class152.field2683[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class290.method1978((byte) 42, !arg5, arg10, arg7 + var21 & 0x3, var25, arg5, var12, arg10, var20, var24, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Ljava/lang/String;", line = 168)
    public final String method1418(int arg0, int arg1) {
        field3123++;
        if (this.field3132 == null) {
            return this.field3117;
        } else {
            int var3 = -106 % ((arg0 + 9) / 50);
            class190 var4 = (class190) this.field3132.method732((long) arg1, true);
            return var4 == null ? this.field3117 : var4.field3186;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIILgk;I)Lgk;", line = 187)
    public static final class10 method1419(boolean arg0, int arg1, int arg2, int arg3, int arg4, class10 arg5, int arg6) {
        field3115++;
        long var7 = (long) arg1;
        class10 var9 = (class10) class203.field3453.method467(arg0, var7);
        if (var9 == null) {
            class307 var10 = class307.method2127(class262.field4248, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2104(64, 768, -50, -10, -50);
            class203.field3453.method465(var9, var7, (byte) 109);
        }
        int var11 = arg5.method86();
        int var12 = arg5.method82();
        int var13 = arg5.method102();
        int var14 = arg5.method87();
        class10 var15 = var9.method73(true, true, arg0);
        if (arg3 != 0) {
            var15.method80(arg3);
        }
        if (class43.field680) {
            class183 var16 = (class183) var15;
            if (class223.method1627((byte) -126, arg6 + var13, arg2 + var11, class205.field3497) != arg4 || arg4 != class223.method1627((byte) -123, arg6 + var14, arg2 - -var12, class205.field3497)) {
                for (int var17 = 0; var17 < var16.field3055; var17++) {
                    var16.field3054[var17] += class223.method1627((byte) -128, var16.field3087[var17] + arg6, var16.field3080[var17] + arg2, class205.field3497) - arg4;
                }
                var16.field3065.field2650 = false;
                var16.field3078.field5466 = false;
            }
        } else {
            class103 var18 = (class103) var15;
            if (class223.method1627((byte) -121, arg6 + var13, arg2 - -var11, class205.field3497) != arg4 || class223.method1627((byte) -124, arg6 + var14, arg2 + var12, class205.field3497) != arg4) {
                for (int var19 = 0; var19 < var18.field1661; var19++) {
                    var18.field1671[var19] += class223.method1627((byte) -120, var18.field1664[var19] + arg6, var18.field1657[var19] - -arg2, class205.field3497) - arg4;
                }
                var18.field1654 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)Z", line = 269)
    public final boolean method1420(int arg0, int arg1) {
        field3127++;
        if (this.field3132 == null) {
            return false;
        }
        if (this.field3129 == null) {
            this.method1416(true);
        }
        class142 var3 = (class142) this.field3129.method732((long) arg0, true);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 0) {
                this.field3132 = (class79) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 294)
    public final boolean method1421(String arg0, int arg1) {
        field3114++;
        if (this.field3132 == null) {
            return false;
        }
        if (this.field3129 == null) {
            this.method1415(true);
        }
        if (arg1 != 24566) {
            field3131 = (byte[][]) ((byte[][]) null);
        }
        for (class176 var3 = (class176) this.field3129.method732(class116.method984(-118, arg0), true); var3 != null; var3 = (class176) this.field3129.method726(false)) {
            if (var3.field2997.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 325)
    public static void method1422(int arg0) {
        field3131 = (byte[][]) null;
        field3119 = null;
        if (arg0 != 103) {
            field3119 = (class331) null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILpi;)V", line = 349)
    public final void method1423(int arg0, class336 arg1) {
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                if (arg0 != -24217) {
                    return;
                }
                field3112++;
                return;
            }
            this.method1424(var3, arg1, (byte) 19);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILpi;B)V", line = 371)
    private final void method1424(int arg0, class336 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3126 = class99.method860((byte) 29, arg1.method2323(arg2 ^ 0x63));
        } else if (arg0 == 2) {
            this.field3113 = class99.method860((byte) 29, arg1.method2323(-54));
        } else if (arg0 == 3) {
            this.field3117 = arg1.method2365(arg2 ^ 0x76);
        } else if (arg0 == 4) {
            this.field3120 = arg1.method2338((byte) 71);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method2339((byte) -46);
            this.field3132 = new class79(class168.method1318(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2338((byte) 95);
                class320 var7;
                if (arg0 == 5) {
                    var7 = new class190(arg1.method2365(127));
                } else {
                    var7 = new class142(arg1.method2338((byte) 81));
                }
                this.field3132.method725((long) var6, var7, 1);
            }
        }
        field3128++;
        if (arg2 != 19) {
            this.method1414((byte) -118, -62);
        }
    }
}
