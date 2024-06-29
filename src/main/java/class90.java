import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class90 {

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    private int field1117 = 0;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lgk;")
    public class264[] field1109;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Lil;")
    public static class274 field1106 = new class274(3, 3);

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "[I")
    public static int[] field1112 = new int[256];

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
    private long field1096;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lct;")
    public static class104 field1111;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Lgk;")
    private class264 field1110;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Lgk;")
    private class264 field1116;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field1118;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 >= -67) {
            this.field1117 = 62;
        }
        field1098++;
        for (int var2 = 0; var2 < this.field1115; var2++) {
            class264 var3 = this.field1109[var2];
            while (true) {
                class264 var4 = var3.field3906;
                if (var3 == var4) {
                    break;
                }
                var4.method1820(-25246);
            }
        }
        this.field1110 = null;
        this.field1116 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public static void method601(boolean arg0) {
        field1112 = null;
        if (arg0) {
            method605(-36, 47, (byte) -104);
        }
        field1111 = null;
        field1106 = null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I")
    public final int method602(boolean arg0) {
        if (!arg0) {
            method610(88);
        }
        field1114++;
        return this.field1115;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Lgk;I)I")
    public final int method603(class264[] arg0, int arg1) {
        if (arg1 != -1) {
            this.field1096 = -76L;
        }
        field1108++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1115; var4++) {
            class264 var5 = this.field1109[var4];
            for (class264 var6 = var5.field3906; var6 != var5; var6 = var6.field3906) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)Lgk;")
    public final class264 method604(int arg0) {
        field1113++;
        if (arg0 > -74) {
            method605(-123, -103, (byte) -54);
        }
        if (this.field1117 > 0 && this.field1109[this.field1117 - 1] != this.field1116) {
            class264 var2 = this.field1116;
            this.field1116 = var2.field3906;
            return var2;
        }
        while (this.field1117 < this.field1115) {
            class264 var3 = this.field1109[this.field1117++].field3906;
            if (this.field1109[this.field1117 - 1] != var3) {
                this.field1116 = var3.field3906;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)V")
    public static final void method605(int arg0, int arg1, byte arg2) {
        if (arg2 != -29) {
            method607((byte) 26);
        }
        field1105++;
        class125 var3 = class56.method428(arg1, 5, -3636);
        var3.method846(arg2 ^ 0xFFFF9703);
        var3.field1657 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILgk;J)V")
    public final void method606(int arg0, class264 arg1, long arg2) {
        field1100++;
        if (arg1.field3908 != null) {
            arg1.method1820(-25246);
        }
        class264 var5 = this.field1109[(int) ((long) (this.field1115 - arg0) & arg2)];
        arg1.field3906 = var5;
        arg1.field3908 = var5.field3908;
        arg1.field3908.field3906 = arg1;
        arg1.field3906.field3908 = arg1;
        arg1.field3907 = arg2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static final void method607(byte arg0) {
        for (class454 var1 = (class454) class225.field3375.method2478(1603); var1 != null; var1 = (class454) class225.field3375.method2486((byte) -82)) {
            if (class178.field2530 == null) {
                var1.method1820(-25246);
            } else if (class388.field5665 >= var1.field6682) {
                int var14 = class4.field69[var1.field6683];
                if (var14 == 0) {
                    class422 var15 = class319.method2098(var1.field6700, var1.field6695, var1.field6702);
                    if (var15 instanceof class346) {
                        class67.method501(var1.field6700, var1.field6695, var1.field6702);
                        class346 var16 = (class346) var15;
                        if (var16.field5091 != null) {
                            class234.method1590(var1.field6700, var1.field6695, var1.field6702, var16.field5091, (class422) null);
                        }
                    }
                } else if (var14 == 1) {
                    class233 var17 = class77.method538(var1.field6700, var1.field6695, var1.field6702);
                    if (var17 instanceof class403) {
                        class422.method2603(var1.field6700, var1.field6695, var1.field6702);
                        class403 var18 = (class403) var17;
                        if (var18.field5812 != null) {
                            class139.method921(var1.field6700, var1.field6695, var1.field6702, var18.field5812, (class233) null);
                        }
                    }
                } else if (var14 == 2) {
                    class336 var21 = class188.method1287(var1.field6700, var1.field6695, var1.field6702, field1118 == null ? (field1118 = method613("jb")) : field1118);
                    if (var21 instanceof class260) {
                        class307.method2050(var1.field6700, var1.field6695, var1.field6702, field1118 == null ? (field1118 = method613("jb")) : field1118);
                        class260 var22 = (class260) var21;
                        if (var22.field3854 != null) {
                            class404.method2525(var22.field3854, false);
                        }
                    }
                } else if (var14 == 3) {
                    class323 var19 = class137.method913(var1.field6700, var1.field6695, var1.field6702);
                    if (var19 instanceof class184) {
                        class370.method2353(var1.field6700, var1.field6695, var1.field6702);
                        class184 var20 = (class184) var19;
                        if (var20.field2591 != null) {
                            class455.method2822(var1.field6700, var1.field6695, var1.field6702, var20.field2591);
                        }
                    }
                }
                var1.method1820(-25246);
            } else if (class388.field5665 == var1.field6694) {
                int var2 = class4.field69[var1.field6683];
                if (var2 == 0) {
                    class422 var3 = class319.method2098(var1.field6700, var1.field6695, var1.field6702);
                    if (var3 instanceof class346) {
                        var1.method1820(-25246);
                    } else if (class163.method1081(var1.field6700, var1.field6695, var1.field6702) == null) {
                        class346 var4 = new class346(var1.field6683, var1.field6701, var1.field6699, var1.field6679, var1.field6678, var3);
                        class234.method1590(var1.field6700, var1.field6695, var1.field6702, var4, (class422) null);
                    } else {
                        var1.method1820(-25246);
                    }
                } else if (var2 == 1) {
                    class233 var12 = class77.method538(var1.field6700, var1.field6695, var1.field6702);
                    if (var12 instanceof class403) {
                        var1.method1820(-25246);
                    } else if (class228.method1563(var1.field6700, var1.field6695, var1.field6702) == null) {
                        class403 var13 = new class403(var1.field6683, var1.field6701, var1.field6699, var1.field6679, var1.field6678, var12);
                        class139.method921(var1.field6700, var1.field6695, var1.field6702, var13, (class233) null);
                    } else {
                        var1.method1820(-25246);
                    }
                } else if (var2 == 2) {
                    class336 var5 = class188.method1287(var1.field6700, var1.field6695, var1.field6702, field1118 == null ? (field1118 = method613("jb")) : field1118);
                    if (var5 instanceof class260) {
                        var1.method1820(-25246);
                    } else {
                        class307.method2050(var1.field6700, var1.field6695, var1.field6702, field1118 == null ? (field1118 = method613("jb")) : field1118);
                        class178 var6 = class450.method2785(var1.field6691, (byte) 113);
                        int var7;
                        int var8;
                        if (var1.field6701 == 1 || var1.field6701 == 3) {
                            var8 = var6.field2533;
                            var7 = var6.field2476;
                        } else {
                            var7 = var6.field2533;
                            var8 = var6.field2476;
                        }
                        class260 var9 = new class260(var1.field6683, var1.field6701, var1.field6700, var1.field6699, var1.field6679, var1.field6678, var1.field6695, var1.field6695 + var7 - 1, var1.field6702, var1.field6702 - (1 - var8), var5);
                        class404.method2525(var9, false);
                    }
                } else if (var2 == 3) {
                    class323 var10 = class137.method913(var1.field6700, var1.field6695, var1.field6702);
                    if (var10 instanceof class184) {
                        var1.method1820(-25246);
                    } else {
                        class184 var11 = new class184(var1.field6699, var1.field6679, var1.field6678, var10);
                        class455.method2822(var1.field6700, var1.field6695, var1.field6702, var11);
                    }
                }
            }
        }
        field1101++;
        if (arg0 >= -26) {
            method610(-125);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lgk;")
    public final class264 method608(byte arg0) {
        this.field1117 = 0;
        field1102++;
        if (arg0 <= 119) {
            this.field1116 = null;
        }
        return this.method604(-102);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(JI)Lgk;")
    public final class264 method609(long arg0, int arg1) {
        this.field1096 = arg0;
        field1104++;
        class264 var4 = this.field1109[(int) ((long) (this.field1115 - 1) & arg0)];
        for (this.field1110 = var4.field3906; this.field1110 != var4; this.field1110 = this.field1110.field3906) {
            if (this.field1110.field3907 == arg0) {
                class264 var5 = this.field1110;
                this.field1110 = this.field1110.field3906;
                return var5;
            }
        }
        if (arg1 <= 39) {
            this.method604(95);
        }
        this.field1110 = null;
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public static final void method610(int arg0) {
        field1103++;
        class212.method1451(class376.field5491, (byte) 86);
        int var1 = (class298.field4343 >> 10) + (class28.field399 >> 3);
        int var2 = (class345.field5077 >> 10) + (class134.field1846 >> 3);
        class423.field6117 = class187.field2619.field4960 = 0;
        class187.field2619.method2415((byte) 54, 8, 8);
        byte var3 = 18;
        class330.field4905 = new int[var3];
        class22.field314 = new int[var3];
        class322.field4762 = new byte[var3][];
        class124.field1652 = new int[var3][4];
        class189.field2648 = new byte[var3][];
        class440.field6387 = new int[var3];
        class356.field5174 = new int[var3];
        class161.field2148 = new int[var3];
        class222.field3200 = new int[var3];
        class215.field3066 = new byte[var3][];
        class38.field532 = new byte[var3][];
        class24.field336 = new byte[var3][];
        int var4 = arg0;
        for (int var5 = (var1 - (class195.field2745 >> 4)) / 8; var5 <= ((class195.field2745 >> 4) + var1) / 8; var5++) {
            for (int var7 = (var2 - (class78.field984 >> 4)) / 8; var7 <= ((class78.field984 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class356.field5174[var4] = var8;
                class161.field2148[var4] = class243.field3602.method707(-1, "m" + var5 + "_" + var7);
                class330.field4905[var4] = class243.field3602.method707(-1, "l" + var5 + "_" + var7);
                class222.field3200[var4] = class243.field3602.method707(-1, "n" + var5 + "_" + var7);
                class22.field314[var4] = class243.field3602.method707(-1, "um" + var5 + "_" + var7);
                class440.field6387[var4] = class243.field3602.method707(-1, "ul" + var5 + "_" + var7);
                if (class222.field3200[var4] == -1) {
                    class161.field2148[var4] = -1;
                    class330.field4905[var4] = -1;
                    class22.field314[var4] = -1;
                    class440.field6387[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class222.field3200.length; var6++) {
            class222.field3200[var6] = -1;
            class161.field2148[var6] = -1;
            class330.field4905[var6] = -1;
            class22.field314[var6] = -1;
            class440.field6387[var6] = -1;
        }
        class364.method2318(false, arg0 ^ 0xA, true, var1, var2);
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Lgk;")
    public final class264 method611(int arg0) {
        field1099++;
        if (this.field1110 == null) {
            return null;
        }
        class264 var2 = this.field1109[(int) (this.field1096 & (long) (this.field1115 - 1))];
        while (this.field1110 != var2) {
            if (this.field1110.field3907 == this.field1096) {
                class264 var3 = this.field1110;
                this.field1110 = this.field1110.field3906;
                return var3;
            }
            this.field1110 = this.field1110.field3906;
        }
        this.field1110 = null;
        if (arg0 > -51) {
            this.field1109 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        this.field1115 = arg0;
        this.field1109 = new class264[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class264 var3 = this.field1109[var2] = new class264();
            var3.field3906 = var3;
            var3.field3908 = var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I")
    public final int method612(int arg0) {
        field1097++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 2) {
            this.field1109 = null;
        }
        while (this.field1115 > var3) {
            class264 var4 = this.field1109[var3];
            class264 var5 = var4.field3906;
            while (var4 != var5) {
                var5 = var5.field3906;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method613(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
