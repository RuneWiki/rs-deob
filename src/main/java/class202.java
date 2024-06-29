import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class202 extends class171 implements class164 {

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "Lse;")
    public class171 field3355;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "Z")
    public static boolean field3348 = false;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "Lkh;")
    public static class13 field3364 = new class13(4);

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field3367;

    static {
        new class234("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lya;ZI)Lt;", line = 3)
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3348 = false;
        }
        field3361++;
        return null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V", line = 15)
    public final void method21(boolean arg0) {
        if (arg0) {
            field3364 = null;
        }
        field3351++;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)I", line = 25)
    public final int method624(byte arg0) {
        field3354++;
        if (arg0 >= -119) {
            field3367 = -37;
        }
        return 0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIII)V", line = 38)
    public static final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3353++;
        if (!class184.method1223((byte) -66, arg4)) {
            return;
        }
        if (arg3 <= 107) {
            method1415(25);
        }
        if (class283.field4301[arg4] == null) {
            client.method1393(class200.field3326[arg4], -1, arg9, arg2, arg7, arg1, arg5, arg8, arg6, arg0);
        } else {
            client.method1393(class283.field4301[arg4], -1, arg9, arg2, arg7, arg1, arg5, arg8, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILgq;II)V", line = 57)
    public static final void method1414(int arg0, class358 arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field3365++;
            class39.field531[arg3][arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)V", line = 69)
    public static void method1415(int arg0) {
        if (arg0 != 4) {
            method1414(121, null, -83, -14);
        }
        field3364 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lya;Z)V", line = 79)
    public final void method25(class38 arg0, boolean arg1) {
        field3350++;
        if (arg1) {
            this.method25(null, true);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 90)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        field3349++;
        if (arg0 != 3) {
            this.method29(null, -77);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIILse;)V", line = 100)
    public class202(int arg0, int arg1, int arg2, class171 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field3355 = arg3;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lya;I)Lag;", line = 110)
    public final class484 method29(class38 arg0, int arg1) {
        field3358++;
        if (arg1 < 22) {
            this.method17(-84);
        }
        return null;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V", line = 124)
    public final void method616(int arg0) {
        if (arg0 == 23504) {
            field3362++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z", line = 134)
    public final boolean method17(int arg0) {
        field3352++;
        return arg0 == 13651334 ? false : false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLya;II)Z", line = 145)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        field3347++;
        if (arg0 > -119) {
            method1415(-23);
        }
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lwq;I)I", line = 157)
    public static final int method1416(class116 arg0, int arg1) {
        field3359++;
        class37 var2 = arg0.field1763;
        if (var2.field499 != null) {
            var2 = var2.method256(127, class195.field3271);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != -1) {
            return -7;
        }
        int var3 = var2.field472;
        class376 var4 = arg0.method948(false);
        if (arg0.field1926) {
            var3 = var2.field437;
        } else if (arg0.field1925 == var4.field5662 || arg0.field1925 == var4.field5672 || arg0.field1925 == var4.field5673 || arg0.field1925 == var4.field5650) {
            var3 = var2.field484;
        } else if (arg0.field1925 == var4.field5652 || arg0.field1925 == var4.field5643 || arg0.field1925 == var4.field5648 || arg0.field1925 == var4.field5638) {
            var3 = var2.field488;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLya;)V", line = 198)
    public final void method619(boolean arg0, class38 arg1) {
        field3366++;
        if (!arg0) {
            this.method614(77);
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I", line = 209)
    public final int method627(int arg0) {
        if (arg0 == 23326) {
            field3363++;
            return 0;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)Z", line = 220)
    public final boolean method614(int arg0) {
        if (arg0 != -1086) {
            field3367 = -71;
        }
        field3357++;
        return false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILya;)V", line = 235)
    public final void method623(int arg0, class38 arg1) {
        field3356++;
        if (arg0 < 125) {
            method1415(44);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I", line = 252)
    public final int method621(int arg0) {
        field3360++;
        if (arg0 != 3021) {
            field3348 = true;
        }
        return 0;
    }
}
