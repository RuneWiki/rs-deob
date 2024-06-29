import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class426 extends class55 {

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "[I")
    public static int[] field6012 = new int[32];

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "[I")
    public static int[] field6017 = new int[4];

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public int field6004;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public int field6007;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    public int field6013;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public int field6015;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    public int field6016;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    public int field6022;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "I")
    public int field6023;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public int field6026;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "Lib;")
    public class155 field6018;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "Ltba;")
    public class164 field5999;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "Lwi;")
    public class466 field6024;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "Lfm;")
    public class734 field6019;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V", line = 16)
    public static void method2441(boolean arg0) {
        field6017 = null;
        field6012 = null;
        if (arg0) {
            field6017 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V", line = 34)
    public static final void method2442(int arg0, int arg1) {
        field6011++;
        int var2 = -33 / ((-arg0 - 41) / 34);
        class252 var3 = class150.method916(arg1, -126, 6);
        var3.method1497(0);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 51)
    public final void method2443(int arg0) {
        this.field6024 = null;
        this.field5999 = null;
        this.field6018 = null;
        field6020++;
        this.field6019 = null;
        if (arg0 != -1) {
            method2441(false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLnba;Lha;)I", line = 67)
    public static final int method2444(boolean arg0, class301 arg1, class60 arg2) {
        field6002++;
        if (arg0) {
            field6017 = null;
        }
        if (arg1.field4077 != -1) {
            return arg1.field4077;
        }
        if (arg1.field4081 != -1) {
            class335 var3 = arg2.field636.method925(arg1.field4081, -28755);
            if (!var3.field4527) {
                return var3.field4535;
            }
        }
        return arg1.field4074;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIZ)V", line = 103)
    public static final void method2445(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class339.method2002(arg2 - 117);
        field6000++;
        class376.field5228 = 0L;
        int var5 = class381.method2243((byte) -68);
        if (arg0 == arg2 || var5 == 3) {
            arg4 = true;
        }
        if (!class21.field142.method419()) {
            arg4 = true;
        }
        class207.method1158(arg0, arg2 - 29761, arg4, var5, arg1, arg3);
    }
}
