import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class116 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lve;")
    public static class255 field1969 = class87.method607(63, "(U");

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1972 = 1;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lve;")
    public static class255 field1975 = class87.method607(54, "T");

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Ltl;")
    public static class197 field1971 = null;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lve;")
    public static class255 field1967 = class87.method607(54, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[Lse;")
    public static class11[] field1978 = new class11[50];

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Ltj;")
    public static class169 field1973;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lrg;")
    public static class88 field1974;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
    public static int[] field1976;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 7)
    public static void method880(byte arg0) {
        field1978 = null;
        field1967 = null;
        field1974 = null;
        field1969 = null;
        if (arg0 != 55) {
            field1978 = (class11[]) null;
        }
        field1975 = null;
        field1973 = null;
        field1971 = null;
        field1976 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Z", line = 24)
    public static final boolean method881(int arg0, byte arg1) {
        field1977++;
        if (arg1 != -69) {
            method881(-11, (byte) -100);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltg;Z)V", line = 40)
    public static final void method882(class301 arg0, boolean arg1) {
        arg0.field5114 = arg0.field5113;
        field1970++;
        if (arg0.field5127 == 0) {
            arg0.field5144 = 0;
            return;
        }
        if (arg0.field5166 != -1 && arg0.field5116 == 0) {
            class271 var2 = class181.method1269(101, arg0.field5166);
            if (arg0.field5124 > 0 && var2.field4663 == 0) {
                arg0.field5144++;
                return;
            }
            if (arg0.field5124 <= 0 && var2.field4646 == 0) {
                arg0.field5144++;
                return;
            }
        }
        int var3 = arg0.field5130;
        int var4 = arg0.field5173;
        int var5 = arg0.field5125[arg0.field5127 - 1] * 128 + arg0.method1680(-112) * 64;
        int var6 = arg0.field5154[arg0.field5127 - 1] * 128 + (arg0.method1680(-103) * 64);
        if (var5 - var3 > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field5130 = var5;
            arg0.field5173 = var6;
            return;
        }
        if (arg1) {
            method882((class301) null, true);
        }
        if (var5 <= var3) {
            if (var3 > var5) {
                if (var4 < var6) {
                    arg0.field5129 = 768;
                } else if (var4 > var6) {
                    arg0.field5129 = 256;
                } else {
                    arg0.field5129 = 512;
                }
            } else if (var6 > var4) {
                arg0.field5129 = 1024;
            } else if (var4 > var6) {
                arg0.field5129 = 0;
            }
        } else if (var4 < var6) {
            arg0.field5129 = 1280;
        } else if (var4 > var6) {
            arg0.field5129 = 1792;
        } else {
            arg0.field5129 = 1536;
        }
        int var7 = arg0.field5129 - arg0.field5157 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = 4;
        int var9 = arg0.field5167;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg0.field5120;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg0.field5146;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg0.field5118;
        }
        if (var9 == -1) {
            var9 = arg0.field5120;
        }
        arg0.field5114 = var9;
        if (arg0 instanceof class186) {
            var10 = ((class186) arg0).field2996.field3900;
        }
        if (var10) {
            if (arg0.field5157 != arg0.field5129 && arg0.field5137 == -1 && arg0.field5148 != 0) {
                var8 = 2;
            }
            if (arg0.field5127 > 2) {
                var8 = 6;
            }
            if (arg0.field5127 > 3) {
                var8 = 8;
            }
            if (arg0.field5144 > 0 && arg0.field5127 > 1) {
                var8 = 8;
                arg0.field5144--;
            }
        } else {
            if (arg0.field5127 > 1) {
                var8 = 6;
            }
            if (arg0.field5127 > 2) {
                var8 = 8;
            }
            if (arg0.field5144 > 0 && arg0.field5127 > 1) {
                arg0.field5144--;
                var8 = 8;
            }
        }
        if (arg0.field5158[arg0.field5127 - 1]) {
            var8 <<= 0x1;
        }
        if (var4 < var6) {
            arg0.field5173 += var8;
            if (var6 < arg0.field5173) {
                arg0.field5173 = var6;
            }
        } else if (var4 > var6) {
            arg0.field5173 -= var8;
            if (var6 > arg0.field5173) {
                arg0.field5173 = var6;
            }
        }
        if (var8 >= 8 && arg0.field5120 == arg0.field5114 && arg0.field5145 != -1) {
            arg0.field5114 = arg0.field5145;
        }
        if (var3 < var5) {
            arg0.field5130 += var8;
            if (var5 < arg0.field5130) {
                arg0.field5130 = var5;
            }
        } else if (var3 > var5) {
            arg0.field5130 -= var8;
            if (arg0.field5130 < var5) {
                arg0.field5130 = var5;
            }
        }
        if (arg0.field5130 == var5 && arg0.field5173 == var6) {
            arg0.field5127--;
            if (arg0.field5124 > 0) {
                arg0.field5124--;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 290)
    public static final void method883(int arg0, int arg1) {
        field1968++;
        class80.field1292.method562((byte) 122, arg0);
        class225.field3766.method562((byte) 87, arg0);
        if (arg1 >= -19) {
            field1967 = (class255) null;
        }
    }
}
