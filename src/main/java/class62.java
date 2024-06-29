import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class62 {

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Lha;")
    private class77 field1138 = new class77();

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ldc;")
    public static class37 field1135 = class185.method1233((byte) 86, "Null");

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ldc;")
    public static class37 field1139 = class185.method1233((byte) 86, "(U1");

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "[I")
    public static int[] field1146 = new int[100];

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "J")
    public static long field1143 = 0L;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ldc;")
    public static class37 field1140 = class185.method1233((byte) 86, "(Z");

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ldc;")
    public static class37 field1129 = class185.method1233((byte) 86, "::fpsoff");

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1141 = 500;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "[J")
    public static long[] field1147 = new long[32];

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -2265) {
            field1129 = null;
        }
        field1136++;
        class25[] var7 = class246.field4504;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class25 var9 = var7[var8];
            if (var9 != null && var9.field429 == 2) {
                class165.method1112(arg4 >> 1, var9.field430 * 2, arg6, (var9.field437 - class99.field1735 << 7) + var9.field436, arg0, -16734, arg3 >> 1, (var9.field438 - class124.field2212 << 7) + var9.field433);
                if (class38.field802 > -1 && class203.field3758 % 20 < 10) {
                    class12.field174[var9.field431].method687(class38.field802 + arg2 - 12, arg1 - (-class218.field4074 - -28));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLre;I)V")
    public static final void method462(byte arg0, class190 arg1, int arg2) {
        field1133++;
        if (arg0 <= 5) {
            field1147 = null;
        }
        if (arg1.field3515 > class203.field3758) {
            class23.method161(arg1, (byte) 12);
        } else if (arg1.field3547 >= class203.field3758) {
            class60.method456(arg1, 106);
        } else {
            class224.method1473(2, arg1);
        }
        if (arg1.field3505 < 128 || arg1.field3490 < 128 || arg1.field3505 >= 13184 || arg1.field3490 >= 13184) {
            arg1.field3515 = 0;
            arg1.field3505 = arg1.field3494[0] * 128 + arg1.field3499 * 64;
            arg1.field3524 = -1;
            arg1.field3541 = -1;
            arg1.field3490 = arg1.field3525[0] * 128 + arg1.field3499 * 64;
            arg1.field3547 = 0;
            arg1.method1262(-84);
        }
        if (class238.field4382 == arg1 && (arg1.field3505 < 1536 || arg1.field3490 < 1536 || arg1.field3505 >= 11776 || arg1.field3490 >= 11776)) {
            arg1.field3490 = arg1.field3525[0] * 128 + arg1.field3499 * 64;
            arg1.field3505 = arg1.field3494[0] * 128 + arg1.field3499 * 64;
            arg1.field3541 = -1;
            arg1.field3547 = 0;
            arg1.field3524 = -1;
            arg1.field3515 = 0;
            arg1.method1262(-82);
        }
        class121.method828((byte) -77, arg1);
        class238.method1542(1, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lp;[BIIIZII)V")
    public static final void method463(class163[] arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1148++;
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg3 + var11 > 0 && arg3 + var11 < 103) {
                            arg0[var9].field3080[arg7 + var10][arg3 + var11] = class58.method449(arg0[var9].field3080[arg7 + var10][arg3 + var11], -16777217);
                        }
                    }
                }
            }
        }
        if (arg4 >= -123) {
            field1143 = -119L;
        }
        class28 var12 = new class28(arg1);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class163.method1099(var15 + arg3, var12, var13, var14 + arg7, arg5, arg6, (byte) -121, 0, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lha;")
    public final class77 method464(int arg0) {
        if (arg0 >= -84) {
            return null;
        }
        class77 var2 = this.field1138.field1353;
        field1132++;
        if (this.field1138 == var2) {
            return null;
        } else {
            var2.method533(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lha;B)V")
    public final void method465(class77 arg0, byte arg1) {
        field1145++;
        if (arg0.field1357 != null) {
            arg0.method533(false);
        }
        arg0.field1357 = this.field1138.field1357;
        arg0.field1353 = this.field1138;
        if (arg1 >= 53) {
            arg0.field1357.field1353 = arg0;
            arg0.field1353.field1357 = arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3) {
        field1144++;
        if (class39.method352(-10924, arg3)) {
            int var4 = 72 % ((-arg1 - 54) / 51);
            class195.method1302(class177.field3344[arg3], arg2, arg0, -1, true);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lha;")
    public final class77 method467(int arg0) {
        field1142++;
        if (arg0 == 128) {
            class77 var2 = this.field1138.field1353;
            return this.field1138 == var2 ? null : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILha;)V")
    public final void method468(int arg0, class77 arg1) {
        if (arg1.field1357 != null) {
            arg1.method533(false);
        }
        arg1.field1353 = this.field1138.field1353;
        if (arg0 == 0) {
            field1131++;
            arg1.field1357 = this.field1138;
            arg1.field1357.field1353 = arg1;
            arg1.field1353.field1357 = arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public static void method469(int arg0) {
        field1146 = null;
        field1135 = null;
        field1139 = null;
        field1140 = null;
        field1147 = null;
        if (arg0 == 0) {
            field1129 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class62() {
        this.field1138.field1357 = this.field1138;
        this.field1138.field1353 = this.field1138;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)I")
    public static final int method470(boolean arg0) {
        if (!arg0) {
            method463(null, null, -126, -113, 64, true, 49, -2);
        }
        field1130++;
        return class174.field3316;
    }
}
