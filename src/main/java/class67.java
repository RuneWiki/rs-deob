import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class67 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Z")
    public boolean field1073 = false;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    private int[] field1078 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field1082 = -1;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public static int[] field1077 = new int[200];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1076 = "Started 3d Library";

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[S")
    private short[] field1085;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[S")
    private short[] field1086;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[S")
    private short[] field1088;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[S")
    private short[] field1089;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 8)
    public static final void method641(byte arg0) {
        field1091++;
        class109.field1852 = new class137[class51.field803.method453(24190)][];
        if (arg0 > -66) {
            method650(-27, (String) null);
        }
        class356.field5615 = new boolean[class51.field803.method453(24190)];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILcg;II)[Ln;", line = 21)
    public static final class309[] method642(int arg0, class49 arg1, int arg2, int arg3) {
        field1093++;
        if (arg0 < 16) {
            return (class309[]) null;
        } else if (class325.method2262(arg3, (byte) -124, arg1, arg2)) {
            return class130.method1079(383);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V", line = 36)
    public static final void method643(boolean arg0, int arg1) {
        if (arg0) {
            method644((class137) null, 94);
        }
        if (class44.field705 == 0) {
            class69.field1128.method915(arg1, (byte) -76);
        } else {
            class226.field3799 = arg1;
        }
        field1072++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Llg;I)V", line = 65)
    public static final void method644(class137 arg0, int arg1) {
        field1083++;
        int var2 = arg0.field2386;
        if (var2 == 324) {
            if (class101.field1632 == -1) {
                class285.field4522 = arg0.field2410;
                class101.field1632 = arg0.field2400;
            }
            if (class199.field3398.field4682) {
                arg0.field2400 = class101.field1632;
            } else {
                arg0.field2400 = class285.field4522;
            }
        } else if (var2 == 325) {
            if (class101.field1632 == -1) {
                class285.field4522 = arg0.field2410;
                class101.field1632 = arg0.field2400;
            }
            if (class199.field3398.field4682) {
                arg0.field2400 = class285.field4522;
            } else {
                arg0.field2400 = class101.field1632;
            }
        } else if (var2 == 327) {
            arg0.field2367 = 150;
            arg0.field2430 = (int) (Math.sin((double) class181.field3045 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2382 = -1;
            arg0.field2389 = 5;
        } else if (var2 == 328) {
            if (class218.field3632.field3491 == null) {
                arg0.field2382 = 0;
            } else {
                arg0.field2367 = 150;
                arg0.field2430 = (int) (Math.sin((double) class181.field3045 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2389 = 5;
                arg0.field2382 = ((int) class142.method1151(class218.field3632.field3491, -117) << 11) + 2047;
                arg0.field2511 = 0;
                arg0.field2385 = class218.field3632.field2000;
                arg0.field2522 = class218.field3632.field1974;
                arg0.field2380 = class218.field3632.field2009;
            }
        } else if (arg1 != -2561) {
            method646(99);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z", line = 142)
    public final boolean method645(int arg0) {
        field1079++;
        if (this.field1084 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1084.length; var3++) {
            if (!class134.field2332.method429(0, this.field1084[var3], 104)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 166)
    public static void method646(int arg0) {
        if (arg0 == 5) {
            field1077 = null;
            field1076 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Z", line = 178)
    public final boolean method647(int arg0) {
        field1081++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 > -61) {
            return true;
        }
        while (var3 < 5) {
            if (this.field1078[var3] != -1 && !class134.field2332.method429(0, this.field1078[var3], 104)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Lud;", line = 202)
    public final class307 method648(int arg0) {
        field1094++;
        if (this.field1084 == null) {
            return null;
        }
        class307[] var2 = new class307[this.field1084.length];
        for (int var3 = 0; var3 < this.field1084.length; var3++) {
            var2[var3] = class307.method2127(class134.field2332, this.field1084[var3], 0);
        }
        class307 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class307(var2, var2.length);
        }
        if (arg0 != 31721) {
            return (class307) null;
        }
        if (this.field1085 != null) {
            for (int var5 = 0; var5 < this.field1085.length; var5++) {
                var4.method2108(this.field1085[var5], this.field1086[var5]);
            }
        }
        if (this.field1089 != null) {
            for (int var6 = 0; var6 < this.field1089.length; var6++) {
                var4.method2125(this.field1089[var6], this.field1088[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpi;Z)V", line = 262)
    public final void method649(class336 arg0, boolean arg1) {
        if (!arg1) {
            this.method649((class336) null, true);
        }
        field1090++;
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method651(var3, -95, arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 287)
    public static final void method650(int arg0, String arg1) {
        field1080++;
        System.out.println("Error: " + class33.method307(arg1, "%0a", -1, "\n"));
        if (arg0 != -20684) {
            method642(126, (class49) null, 124, -60);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILpi;)V", line = 301)
    private final void method651(int arg0, int arg1, class336 arg2) {
        if (arg1 >= -29) {
            return;
        }
        field1075++;
        if (arg0 == 1) {
            this.field1082 = arg2.method2364(-9069);
        } else if (arg0 == 2) {
            int var4 = arg2.method2364(-9069);
            this.field1084 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1084[var5] = arg2.method2339((byte) -46);
            }
        } else if (arg0 == 3) {
            this.field1073 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method2364(-9069);
            this.field1085 = new short[var6];
            this.field1086 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1085[var7] = (short) arg2.method2339((byte) -46);
                this.field1086[var7] = (short) arg2.method2339((byte) -46);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method2364(-9069);
            this.field1088 = new short[var8];
            this.field1089 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1089[var9] = (short) arg2.method2339((byte) -46);
                this.field1088[var9] = (short) arg2.method2339((byte) -46);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1078[arg0 - 60] = arg2.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Lud;", line = 382)
    public final class307 method652(byte arg0) {
        if (arg0 != 75) {
            return (class307) null;
        }
        field1092++;
        class307[] var2 = new class307[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1078[var4] != -1) {
                var2[var3++] = class307.method2127(class134.field2332, this.field1078[var4], 0);
            }
        }
        class307 var5 = new class307(var2, var3);
        if (this.field1085 != null) {
            for (int var6 = 0; var6 < this.field1085.length; var6++) {
                var5.method2108(this.field1085[var6], this.field1086[var6]);
            }
        }
        if (this.field1089 != null) {
            for (int var7 = 0; var7 < this.field1089.length; var7++) {
                var5.method2125(this.field1089[var7], this.field1088[var7]);
            }
        }
        return var5;
    }
}
