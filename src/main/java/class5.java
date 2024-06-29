import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class5 {

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lpk;")
    public static class120 field121;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lpk;")
    public static class120 field122;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Lpk;")
    public static class120 field125;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient;")
    public static client field118;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[[[I")
    public static int[][][] field124;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILhl;III)V", line = 5)
    public static final void method88(int arg0, int arg1, class71 arg2, int arg3, int arg4, int arg5) {
        field123++;
        if (arg2.field1091 == -1 && arg2.field1065 == null) {
            return;
        }
        int var6 = class22.field398 * arg2.field1082 >> 8;
        int var7 = 0;
        if (arg2.field1090 < arg4) {
            var7 += arg4 - arg2.field1090;
        } else if (arg2.field1069 > arg4) {
            var7 += arg2.field1069 - arg4;
        }
        if (arg3 <= 126) {
            method93((byte) 72);
        }
        if (arg2.field1081 < arg0) {
            var7 += arg0 - arg2.field1081;
        } else if (arg0 < arg2.field1087) {
            var7 += arg2.field1087 - arg0;
        }
        if (arg2.field1064 == 0 || var7 - 64 > arg2.field1064 || class22.field398 == 0 || arg2.field1077 != arg5) {
            if (arg2.field1089 != null) {
                class181.field2877.method2345(arg2.field1089);
                arg2.field1089 = null;
            }
            if (arg2.field1083 != null) {
                class181.field2877.method2345(arg2.field1083);
                arg2.field1083 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg2.field1064 - var7) * var6 / arg2.field1064;
        if (arg2.field1089 != null) {
            arg2.field1089.method1881(var8);
        } else if (arg2.field1091 >= 0) {
            class234 var9 = class234.method1683(class208.field3288, arg2.field1091, 0);
            if (var9 != null) {
                class187 var10 = var9.method1685().method1358(class342.field5293);
                class269 var11 = class269.method1893(var10, 100, var8);
                var11.method1880(-1);
                class181.field2877.method2342(var11);
                arg2.field1089 = var11;
            }
        }
        if (arg2.field1083 != null) {
            arg2.field1083.method1881(var8);
            if (!arg2.field1083.method488((byte) -128)) {
                arg2.field1083 = null;
            }
        } else if (arg2.field1065 != null && (arg2.field1088 -= arg1) <= 0) {
            int var12 = (int) ((double) arg2.field1065.length * Math.random());
            class234 var13 = class234.method1683(class208.field3288, arg2.field1065[var12], 0);
            if (var13 != null) {
                class187 var14 = var13.method1685().method1358(class342.field5293);
                class269 var15 = class269.method1893(var14, 100, var8);
                var15.method1880(0);
                class181.field2877.method2342(var15);
                arg2.field1083 = var15;
                arg2.field1088 = (int) (Math.random() * (double) (arg2.field1073 - arg2.field1079)) + arg2.field1079;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I", line = 140)
    public final int method89(int arg0, byte arg1) {
        int var3 = (this.field127.length >> 1) - 1;
        field128++;
        int var4 = -11 % ((arg1 - 19) / 41);
        int var5 = arg0 & var3;
        while (true) {
            int var6 = this.field127[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field127[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLpk;I)[Lwk;", line = 172)
    public static final class186[] method90(byte arg0, class120 arg1, int arg2) {
        field119++;
        if (arg0 < 54) {
            method88(51, -65, (class71) null, -40, -79, 58);
        }
        return class75.method592(arg1, -95, arg2) ? class82.method639((byte) -124) : null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ltk;B)Ltk;", line = 188)
    public static final class266 method91(class266 arg0, byte arg1) {
        if (arg1 != 78) {
            return (class266) null;
        }
        class266 var2 = client.method1865(arg0);
        if (var2 == null) {
            var2 = arg0.field4104;
        }
        field120++;
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "([I)V", line = 203)
    public class5(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field127 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field127[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field127[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field127[var5 + var5] = arg0[var4];
            this.field127[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIII)V", line = 240)
    public static final void method92(boolean arg0, int arg1, int arg2, int arg3) {
        class66.method530((byte) -113, arg0);
        class245.field3665 = arg1;
        field129++;
        class70.field1062 = arg2;
        class145.method1107(arg3, 79);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 251)
    public static void method93(byte arg0) {
        field121 = null;
        field122 = null;
        if (arg0 == -34) {
            field124 = (int[][][]) null;
            field125 = null;
            field118 = null;
        }
    }
}
