import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class205 extends class182 {

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lsg;")
    public static class169 field4006 = class165.method1060(" loggt sich ein)3", 1536);

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "Lsg;")
    private static class169 field4012 = class165.method1060("Prepared visibility map", 1536);

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lsg;")
    public static class169 field4010 = field4012;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "Lua;")
    public static class181 field4013 = new class181(64);

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Lsg;")
    private static class169 field4023 = class165.method1060("Login server offline)3", 1536);

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "Lsg;")
    public static class169 field4025 = field4023;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "Lm;")
    public class108 field4004;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Lm;")
    public class108 field4018;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Lbf;")
    public class17 field4015;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
    public int[] field4022;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIII)V")
    public static final void method1328(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4027++;
        for (class205 var5 = (class205) class70.field1311.method145(0); var5 != null; var5 = (class205) class70.field1311.method152((byte) -128)) {
            if (var5.field4007 != -1 || var5.field4022 != null) {
                int var6 = 0;
                if (arg2 > var5.field4005) {
                    var6 += arg2 - var5.field4005;
                } else if (arg2 < var5.field4017) {
                    var6 += var5.field4017 - arg2;
                }
                if (arg4 > var5.field4020) {
                    var6 += arg4 - var5.field4020;
                } else if (var5.field4021 > arg4) {
                    var6 += var5.field4021 - arg4;
                }
                if (var6 - 64 > var5.field4016 || class20.field435 == 0 || var5.field4011 != arg3) {
                    if (var5.field4018 != null) {
                        class175.field3425.method1302(var5.field4018);
                        var5.field4018 = null;
                    }
                    if (var5.field4004 != null) {
                        class175.field3425.method1302(var5.field4004);
                        var5.field4004 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field4016 - var6) * class20.field435 / var5.field4016;
                    if (var5.field4018 != null) {
                        var5.field4018.method663(var7);
                    } else if (var5.field4007 >= 0) {
                        class166 var8 = class166.method1066(class62.field1143, var5.field4007, 0);
                        if (var8 != null) {
                            class83 var9 = var8.method1064().method499(class172.field3319);
                            class108 var10 = class108.method636(var9, 100, var7);
                            var10.method651(-1);
                            class175.field3425.method1296(var10);
                            var5.field4018 = var10;
                        }
                    }
                    if (var5.field4004 != null) {
                        var5.field4004.method663(var7);
                        if (!var5.field4004.method1212(arg0 ^ 0xFFFFFFDD)) {
                            var5.field4004 = null;
                        }
                    } else if (var5.field4022 != null && (var5.field4008 -= arg1) <= 0) {
                        int var11 = (int) ((double) var5.field4022.length * Math.random());
                        class166 var12 = class166.method1066(class62.field1143, var5.field4022[var11], 0);
                        if (var12 != null) {
                            class83 var13 = var12.method1064().method499(class172.field3319);
                            class108 var14 = class108.method636(var13, 100, var7);
                            var14.method651(0);
                            class175.field3425.method1296(var14);
                            var5.field4004 = var14;
                            var5.field4008 = var5.field4026 + (int) (Math.random() * (double) (var5.field4024 - var5.field4026));
                        }
                    }
                }
            }
        }
        if (arg0 != -85) {
            field4023 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
    public static final void method1329(boolean arg0, int arg1) {
        field4009++;
        if (class4.field79.field3698 >> 7 == class154.field2964 && class4.field79.field3679 >> 7 == class96.field1822) {
            class154.field2964 = 0;
        }
        int var2 = class141.field2631;
        if (arg1 != 50) {
            return;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class196 var5;
            if (arg0) {
                var5 = class4.field79;
                var4 = 33538048;
            } else {
                var4 = class202.field3932[var3] << 14;
                var5 = class65.field1213[class202.field3932[var3]];
            }
            if (var5 != null && var5.method1249(-5701)) {
                var5.field3843 = false;
                if ((class105.field1925 && class141.field2631 > 50 || class141.field2631 > 200) && !arg0 && var5.field3716 == var5.field3683) {
                    var5.field3843 = true;
                }
                int var6 = var5.field3698 >> 7;
                int var7 = var5.field3679 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field3853 == null || class162.field3107 < var5.field3854 || var5.field3848 <= class162.field3107) {
                        if ((var5.field3698 & 0x7F) == 64 && (var5.field3679 & 0x7F) == 64) {
                            if (class121.field2238[var6][var7] == class145.field2701) {
                                continue;
                            }
                            class121.field2238[var6][var7] = class145.field2701;
                        }
                        var5.field3870 = class183.method1215(var5.field3698, class61.field1132, var5.field3679, 0);
                        class196.field3840.method910(class61.field1132, var5.field3698, var5.field3679, var5.field3870, 60, var5, var5.field3719, var4, var5.field3705);
                    } else {
                        var5.field3843 = false;
                        var5.field3870 = class183.method1215(var5.field3698, class61.field1132, var5.field3679, 0);
                        class196.field3840.method898(class61.field1132, var5.field3698, var5.field3679, var5.field3870, 60, var5, var5.field3719, var4, var5.field3850, var5.field3849, var5.field3861, var5.field3858);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public final void method1330(int arg0) {
        field4019++;
        int var2 = 113 / ((26 - arg0) / 55);
        int var3 = this.field4007;
        class17 var4 = this.field4015.method99(-119);
        if (var4 == null) {
            this.field4022 = null;
            this.field4016 = 0;
            this.field4024 = 0;
            this.field4007 = -1;
            this.field4026 = 0;
        } else {
            this.field4007 = var4.field394;
            this.field4016 = var4.field372 * 128;
            this.field4024 = var4.field401;
            this.field4026 = var4.field374;
            this.field4022 = var4.field397;
        }
        if (this.field4007 != var3 && this.field4018 != null) {
            class175.field3425.method1302(this.field4018);
            this.field4018 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1331(byte arg0) {
        field4012 = null;
        if (arg0 != -112) {
            field4013 = null;
        }
        field4010 = null;
        field4023 = null;
        field4006 = null;
        field4013 = null;
        field4025 = null;
    }
}
