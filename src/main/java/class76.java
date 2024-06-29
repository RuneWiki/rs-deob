import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class76 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lhk;")
    public class125 field1335 = new class125();

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Loa;")
    public static class99 field1346 = class221.method1463(2844, " ");

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lgd;")
    public static class74 field1350 = new class74(64);

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "[J")
    public static long[] field1352 = new long[32];

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1354 = -1;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Loa;")
    public static class99 field1353 = class221.method1463(2844, "::errortest");

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Ltf;")
    public static class107 field1351;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lhk;")
    private class125 field1343;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Ltg;")
    public static class182 field1342;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lhk;I)V")
    public final void method527(class125 arg0, int arg1) {
        if (arg0.field2192 != null) {
            arg0.method828((byte) 121);
        }
        if (arg1 != 10) {
            method532(27);
        }
        arg0.field2192 = this.field1335;
        arg0.field2184 = this.field1335.field2184;
        arg0.field2192.field2184 = arg0;
        arg0.field2184.field2192 = arg0;
        field1336++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lhk;")
    public final class125 method528(int arg0) {
        field1348++;
        if (arg0 != 1) {
            this.field1343 = null;
        }
        class125 var2 = this.field1335.field2184;
        if (this.field1335 == var2) {
            return null;
        } else {
            var2.method828((byte) 122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)Lhk;")
    public final class125 method529(int arg0) {
        if (arg0 != 10) {
            return null;
        }
        field1340++;
        class125 var2 = this.field1335.field2184;
        if (this.field1335 == var2) {
            this.field1343 = null;
            return null;
        } else {
            this.field1343 = var2.field2184;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class78 var20 = new class78(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class128.field2236[var21][arg1][arg2] == null) {
                    class128.field2236[var21][arg1][arg2] = new class216(var21, arg1, arg2);
                }
            }
            class128.field2236[arg0][arg1][arg2].field3750 = var20;
        } else if (arg3 == 1) {
            class78 var22 = new class78(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class128.field2236[var23][arg1][arg2] == null) {
                    class128.field2236[var23][arg1][arg2] = new class216(var23, arg1, arg2);
                }
            }
            class128.field2236[arg0][arg1][arg2].field3750 = var22;
        } else {
            class61 var24 = new class61(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class128.field2236[var25][arg1][arg2] == null) {
                    class128.field2236[var25][arg1][arg2] = new class216(var25, arg1, arg2);
                }
            }
            class128.field2236[arg0][arg1][arg2].field3746 = var24;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Lhk;")
    public final class125 method531(byte arg0) {
        field1347++;
        if (arg0 < 102) {
            this.method533(-26);
        }
        class125 var2 = this.field1335.field2192;
        if (this.field1335 == var2) {
            this.field1343 = null;
            return null;
        } else {
            this.field1343 = var2.field2192;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static void method532(int arg0) {
        if (arg0 >= -24) {
            return;
        }
        field1351 = null;
        field1352 = null;
        field1353 = null;
        field1346 = null;
        field1342 = null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Lhk;")
    public final class125 method533(int arg0) {
        int var2 = -9 % ((8 - arg0) / 46);
        class125 var3 = this.field1343;
        field1339++;
        if (this.field1335 == var3) {
            this.field1343 = null;
            return null;
        } else {
            this.field1343 = var3.field2184;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public final void method534(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field1341++;
        while (true) {
            class125 var2 = this.field1335.field2184;
            if (this.field1335 == var2) {
                this.field1343 = null;
                return;
            }
            var2.method828((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)Lhk;")
    public final class125 method535(int arg0) {
        int var2 = -124 % ((-arg0 - 48) / 55);
        field1345++;
        class125 var3 = this.field1343;
        if (this.field1335 == var3) {
            this.field1343 = null;
            return null;
        } else {
            this.field1343 = var3.field2192;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class76() {
        this.field1335.field2184 = this.field1335;
        this.field1335.field2192 = this.field1335;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lhk;B)V")
    public final void method536(class125 arg0, byte arg1) {
        if (arg0.field2192 != null) {
            arg0.method828((byte) -99);
        }
        field1344++;
        int var3 = -14 % ((arg1 - 34) / 37);
        arg0.field2192 = this.field1335.field2192;
        arg0.field2184 = this.field1335;
        arg0.field2192.field2184 = arg0;
        arg0.field2184.field2192 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JIZBI)Loa;")
    public static final class99 method537(long arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field1338++;
        class99 var6 = class28.method237(0, 0);
        if (arg3 != -103) {
            method530(-15, 62, 70, 1, 32, -15, -60, -125, -86, 108, 85, -65, -127, 28, 49, -122, -86, -114, 93, -4);
        }
        if (arg0 < 0L) {
            arg0 = -arg0;
            var6.method664(arg3 + 102, class256.field4415);
        }
        class99 var7 = class211.field3656;
        class99 var8 = class79.field1391;
        if (arg4 == 1) {
            var8 = class211.field3656;
            var7 = class79.field1391;
        }
        if (arg4 == 2) {
            var8 = class211.field3656;
            var7 = class273.field4822;
        }
        if (arg4 == 3) {
            var7 = class79.field1391;
            var8 = class211.field3656;
        }
        class99 var9 = class28.method237(0, 0);
        class99 var10 = class28.method237(0, 0);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method664(-1, class198.method1333(arg3 ^ 0xD, (int) (arg0 % 10L)));
            arg0 /= 10L;
        }
        if (arg0 == 0L) {
            var9 = class251.field4332;
        }
        int var12 = 0;
        while (arg0 > 0L) {
            if (arg2 && var12 != 0 && var12 % 3 == 0) {
                var9.method664(-1, var7);
            }
            var9.method664(-1, class198.method1333(-125, (int) (arg0 % 10L)));
            arg0 /= 10L;
            var12++;
        }
        if (var10.method659(arg3 ^ 0x3) > 0) {
            var10.method664(-1, var8);
        }
        return class198.method1332(arg3 + 202, new class99[] { var6, var9.method704(true), var10.method704(true) });
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILuk;IJIIII)Z")
    public static final boolean method538(int arg0, int arg1, int arg2, int arg3, class98 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class210.method1411(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
