import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class113 extends class244 implements class670 {

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lpq;")
    public class177 field1313;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Z")
    private boolean field1315;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Lep;")
    public static class382 field1320 = null;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Ldga;")
    public static class190 field1323;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Lgr;")
    private class396 field1329;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Z")
    public static final boolean method699(int arg0, int arg1, int arg2) {
        if (arg1 > -18) {
            return true;
        } else {
            ++field1327;
            return ~(2048 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        this.field1313.method1033(arg0, (byte) 109);
        ++field1324;
        if (arg1 >= -126) {
            this.field1329 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        ++field1319;
        if (arg0 <= 49) {
            this.method457(-123, 109, (class635) null, -52);
        }
        return this.field1313.method1032(-28959);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        int var2 = -105 % ((7 - arg0) / 46);
        ++field1317;
        return this.field1313.field2153;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
    public static final void method700(int arg0) {
        if (~class214.field2601 != 0) {
            class501.method2885(-1, arg0 ^ 22932, class214.field2601, -1, false);
            class214.field2601 = -1;
        }
        if (arg0 != -1) {
            method701(37);
        }
        ++field1325;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            this.field1313 = null;
        }
        ++field1318;
        return this.field1313.field2139;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = -47 % ((12 - arg0) / 56);
        ++field1321;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field1326;
        class350 var5 = this.field1313.method1041(super.field3161, false, arg2, true, 131072, super.field3160, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != 1) {
                field1320 = null;
            }
            class389 var6 = arg2.method297();
            var6.method228(super.field3160, super.field3159, super.field3161);
            return var5.method910(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIZIII)V")
    public class113(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class480.method2804(1, arg8, arg9));
        this.field1313 = new class177(arg0, arg1, arg8, arg9, arg2, arg3, super.field3160, super.field3161, arg7, arg10);
        this.field1315 = ~arg1.field4407 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        int var2 = 65 / ((-82 - arg0) / 37);
        ++field1331;
        return this.field1313.field2145;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field1310;
        class350 var3 = this.field1313.method1041(super.field3161, false, arg0, true, 2048, super.field3160, true);
        if (var3 == null) {
            return null;
        } else {
            class389 var4 = arg0.method297();
            var4.method228(super.field3160, super.field3159, super.field3161);
            class231 var5 = null;
            if (this.field1315) {
                var5 = class526.method2993(1, 32671);
            }
            int var6 = super.field3160 >> 9;
            int var7 = super.field3161 >> 9;
            this.field1313.method1034(var7, var6, var6, var4, var7, arg0, 127, var3, true);
            if (arg1 != 0) {
                this.method448(-90);
            }
            if (this.field1313.field2126 != null) {
                class211 var8 = this.field1313.field2126.method1241();
                arg0.method301(var3, var8, var4, var5 == null ? null : var5.field2947[0], 0);
            } else {
                var3.method904(var4, var5 != null ? var5.field2947[0] : null, 0);
            }
            if (this.field1329 == null) {
                this.field1329 = class426.method2298(super.field3160, var3, 12409, super.field3161, super.field3159);
            } else {
                class644.method3611(var3, super.field3160, this.field1329, (byte) -122, super.field3161, super.field3159);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        ++field1311;
        this.field1313.method1040(262144, arg0);
        if (arg1 < 97) {
            this.method453(false, 91, true, 9, 81, (class673) null, (class635) null);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        ++field1330;
        if (!arg2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        ++field1312;
        int var3 = 104 / ((arg0 - 47) / 34);
        return this.field1329;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1323 = null;
        if (arg0 != 0) {
            method701(-96);
        }
        field1320 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 != 29877) {
            this.field1329 = null;
        }
        ++field1309;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        ++field1316;
        if (arg1 == 31055) {
            class350 var3 = this.field1313.method1041(super.field3161, true, arg0, true, 262144, super.field3160, true);
            if (var3 != null) {
                int var4 = super.field3160 >> 9;
                int var5 = super.field3161 >> 9;
                class389 var6 = arg0.method297();
                var6.method228(super.field3160, super.field3159, super.field3161);
                this.field1313.method1034(var5, var4, var4, var6, var5, arg0, 126, var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 != -126) {
            this.method447((byte) 67);
        }
        ++field1322;
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 > -20) {
            return null;
        } else {
            ++field1328;
            return this.field1313.method1041(0, false, arg2, true, arg0, 0, false);
        }
    }
}
