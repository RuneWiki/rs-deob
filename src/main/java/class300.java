import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class300 {

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public int field5032 = 99;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Z")
    public boolean field5019 = false;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Z")
    private boolean field5016 = false;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field5025 = -1;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field5029 = 5;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field5009 = -1;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public int field5034 = -1;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public int field5036 = -1;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public int field5037 = -1;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field5020 = 2;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lqd;")
    private static class40 field5015 = class147.method1106("You can(Wt add yourself to your own ignore list)3", (byte) -83);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lqd;")
    public static class40 field5010 = field5015;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lqd;")
    public static class40 field5012 = null;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Lqd;")
    public static class40 field5024 = class147.method1106(" )2> <col=00ffff>", (byte) -85);

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Z")
    public static boolean field5038 = false;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field5026 = 128;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lce;")
    public static class239 field5028;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lfk;")
    public static class41 field5023;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    public int[] field5018;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "[I")
    public int[] field5033;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
    private int[] field5035;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[I")
    private int[] field5039;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[[I")
    public int[][] field5014;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILrf;)Lrf;", line = 15)
    public final class266 method2042(int arg0, int arg1, class266 arg2) {
        int var4 = this.field5018[arg1];
        class76 var5 = class227.method1591(21770, var4 >> 16);
        if (arg0 != -5284) {
            this.field5014 = (int[][]) ((int[][]) null);
        }
        field5027++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1179(true, true);
        } else {
            class266 var7 = arg2.method1179(!var5.method562((byte) -108, var6), !this.field5016);
            var7.method1138(var5, var6, this.field5016);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILrf;I)Lrf;", line = 36)
    public final class266 method2043(int arg0, class266 arg1, int arg2) {
        int var4 = this.field5018[arg2];
        class76 var5 = class227.method1591(arg0 ^ 0x59BC, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field5022++;
        if (var5 == null) {
            return arg1.method1161(true, true);
        }
        if (arg0 != 3254) {
            field5010 = (class40) null;
        }
        class266 var7 = arg1.method1161(!var5.method562((byte) -114, var6), !this.field5016);
        var7.method1138(var5, var6, this.field5016);
        return var7;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 60)
    public static void method2044(int arg0) {
        field5028 = null;
        field5010 = null;
        field5024 = null;
        field5023 = null;
        field5012 = null;
        if (arg0 <= -76) {
            field5015 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILrf;B)Lrf;", line = 84)
    public final class266 method2045(int arg0, class266 arg1, byte arg2) {
        field5017++;
        int var4 = this.field5018[arg0];
        class76 var5 = class227.method1591(21770, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1179(true, true);
        }
        class76 var7 = null;
        int var8 = 0;
        if (this.field5039 != null && this.field5039.length > arg0) {
            int var9 = this.field5039[arg0];
            var7 = class227.method1591(21770, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class266 var11 = arg1.method1179(!var5.method562((byte) -109, var6), !this.field5016);
            var11.method1138(var5, var6, this.field5016);
            return var11;
        } else {
            class266 var10 = arg1.method1179(!var5.method562((byte) -125, var6) & !var7.method562((byte) -112, var8), !this.field5016);
            var10.method1138(var5, var6, this.field5016);
            var10.method1138(var7, var8, this.field5016);
            return arg2 > -16 ? (class266) null : var10;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLrf;ILpi;I)Lrf;", line = 127)
    public final class266 method2046(byte arg0, class266 arg1, int arg2, class300 arg3, int arg4) {
        field5030++;
        int var6 = this.field5018[arg2];
        class76 var7 = class227.method1591(21770, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (arg0 < 112) {
            return (class266) null;
        } else if (var7 == null) {
            return arg3.method2042(-5284, arg4, arg1);
        } else {
            int var9 = arg3.field5018[arg4];
            class76 var10 = class227.method1591(21770, var9 >> 16);
            int var11 = var9 & 0xFFFF;
            if (var10 == null) {
                class266 var12 = arg1.method1179(!var7.method562((byte) -128, var8), !this.field5016);
                var12.method1138(var7, var8, this.field5016);
                return var12;
            } else {
                class266 var13 = arg1.method1179(!var7.method562((byte) -124, var8) & !var10.method562((byte) -110, var11), !arg3.field5016 & !this.field5016);
                var13.method1176(var7, var8, var10, var11, this.field5035, this.field5016 | arg3.field5016);
                return var13;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILrf;)Lrf;", line = 169)
    public final class266 method2047(int arg0, int arg1, int arg2, class266 arg3) {
        field5011++;
        int var5 = this.field5018[arg1];
        class76 var6 = class227.method1591(21770, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method1179(true, true);
        }
        int var8 = arg2 & 0x3;
        class266 var9 = arg3.method1179(!var6.method562((byte) -121, var7), !this.field5016);
        if (var8 == 1) {
            var9.method1144();
        } else if (var8 == 2) {
            var9.method1135();
        } else if (var8 == 3) {
            var9.method1145();
        }
        if (arg0 != 26356) {
            return (class266) null;
        }
        var9.method1138(var6, var7, this.field5016);
        if (var8 == 1) {
            var9.method1145();
        } else if (var8 == 2) {
            var9.method1135();
        } else if (var8 == 3) {
            var9.method1144();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 225)
    public static final void method2048(int arg0, int arg1) {
        class181.field2945.method1348(arg0 + 4251, arg1);
        if (arg0 != -4251) {
            field5038 = true;
        }
        field5031++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLsd;)V", line = 236)
    public final void method2049(boolean arg0, class26 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method226(255);
            if (var3 == 0) {
                field5040++;
                return;
            }
            this.method2050(arg1, var3, -5685);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lsd;II)V", line = 270)
    private final void method2050(class26 arg0, int arg1, int arg2) {
        if (arg2 != -5685) {
            field5026 = -16;
        }
        field5041++;
        if (arg1 == 1) {
            int var4 = arg0.method197(arg2 ^ 0x1634);
            this.field5033 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5033[var5] = arg0.method197(arg2 + 5684);
            }
            this.field5018 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5018[var6] = arg0.method197(class88.method686(arg2, 5684));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field5018[var7] += arg0.method197(-1) << 16;
            }
        } else if (arg1 == 2) {
            this.field5036 = arg0.method197(arg2 ^ 0x1634);
        } else if (arg1 == 3) {
            int var15 = arg0.method226(255);
            this.field5035 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5035[var16] = arg0.method226(class88.method686(arg2, -5836));
            }
            this.field5035[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field5019 = true;
        } else if (arg1 == 5) {
            this.field5029 = arg0.method226(255);
        } else if (arg1 == 6) {
            this.field5009 = arg0.method197(-1);
        } else if (arg1 == 7) {
            this.field5034 = arg0.method197(-1);
        } else if (arg1 == 8) {
            this.field5032 = arg0.method226(255);
        } else if (arg1 == 9) {
            this.field5037 = arg0.method226(255);
        } else if (arg1 == 10) {
            this.field5025 = arg0.method226(255);
        } else if (arg1 == 11) {
            this.field5020 = arg0.method226(arg2 ^ 0xFFFFE934);
        } else if (arg1 == 12) {
            int var8 = arg0.method226(255);
            this.field5039 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5039[var9] = arg0.method197(-1);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field5039[var10] = (arg0.method197(arg2 + 5684) << 16) + this.field5039[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method197(-1);
            this.field5014 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method226(255);
                if (var13 > 0) {
                    this.field5014[var12] = new int[var13];
                    this.field5014[var12][0] = arg0.method244(-26711);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field5014[var12][var14] = arg0.method197(-1);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field5016 = true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 454)
    public final void method2051(int arg0) {
        if (this.field5037 == -1) {
            if (this.field5035 == null) {
                this.field5037 = 0;
            } else {
                this.field5037 = 2;
            }
        }
        field5021++;
        if (this.field5025 == -1) {
            if (this.field5035 == null) {
                this.field5025 = 0;
            } else {
                this.field5025 = 2;
            }
        }
        int var2 = -2 / ((arg0 - 61) / 54);
    }
}
