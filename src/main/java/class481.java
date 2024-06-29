import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class481 {

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public int field7060 = 128;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public int field7062 = 128;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field7055;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public int field7057;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field7056;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "Lko;")
    public static class348 field7066;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "Lbr;")
    public static class268 field7063;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bs", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7067;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2879(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field7066 = new class348();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)Lfr;", line = 5)
    public static final class282 method2872(byte arg0, int arg1) {
        field7053++;
        class282 var2 = (class282) class231.field3361.method2339(-106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field693.method683(0, arg1, 5);
        class282 var4 = new class282();
        if (var3 != null) {
            var4.method1782((byte) -92, arg1, new class303(var3));
        }
        int var5 = -123 / ((arg0 - 2) / 45);
        class231.field3361.method2342((long) arg1, var4, -93);
        return var4;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I", line = 29)
    public static final int method2873(int arg0, int arg1) {
        field7054++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == 0) {
            return class86.method700(arg1, true);
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 44)
    public static void method2874(int arg0) {
        field7063 = null;
        field7066 = null;
        if (arg0 != -1) {
            method2874(4);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lbs;", line = 55)
    public final class481 method2875(byte arg0) {
        if (arg0 != -22) {
            method2872((byte) -5, 15);
        }
        field7058++;
        return new class481(this.field7055, this.field7062, this.field7060, this.field7056, this.field7064, this.field7057);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILti;)Lii;", line = 69)
    public static final class386 method2876(int arg0, class303 arg1) {
        field7059++;
        return arg0 > -70 ? null : new class386(arg1.method1901(118), arg1.method1901(126), arg1.method1901(127), arg1.method1901(122), arg1.method1901(127), arg1.method1901(124), arg1.method1901(122), arg1.method1901(122), arg1.method1866(false), arg1.method1918((byte) 102));
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lbs;I)V", line = 80)
    public final void method2877(class481 arg0, int arg1) {
        this.field7057 = arg0.field7057;
        field7061++;
        if (arg1 != -3) {
            field7063 = null;
        }
        this.field7055 = arg0.field7055;
        this.field7064 = arg0.field7064;
        this.field7056 = arg0.field7056;
        this.field7062 = arg0.field7062;
        this.field7060 = arg0.field7060;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILiv;)V", line = 96)
    public static final void method2878(int arg0, class64 arg1) {
        field7065++;
        if (class36.field545 == null) {
            return;
        }
        class232 var2 = null;
        if (arg1.field1129 == 0) {
            var2 = (class232) class396.method2468(arg1.field1134, arg1.field1122, arg1.field1121);
        }
        if (arg1.field1129 == 1) {
            var2 = (class232) class7.method52(arg1.field1134, arg1.field1122, arg1.field1121);
        }
        if (arg1.field1129 == 2) {
            var2 = (class232) class51.method372(arg1.field1134, arg1.field1122, arg1.field1121, field7067 == null ? (field7067 = method2879("rq")) : field7067);
        }
        if (arg1.field1129 == 3) {
            var2 = (class232) class358.method2310(arg1.field1134, arg1.field1122, arg1.field1121);
        }
        if (arg0 != 10845) {
            method2874(112);
        }
        if (var2 == null) {
            arg1.field1133 = 0;
            arg1.field1136 = 0;
            arg1.field1137 = -1;
        } else {
            arg1.field1137 = var2.method379((byte) -96);
            arg1.field1136 = var2.method380(true);
            arg1.field1133 = var2.method375(-13015);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V", line = 157)
    public class481(int arg0) {
        this.field7055 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIII)V", line = 169)
    private class481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7055 = arg0;
        this.field7057 = arg5;
        this.field7064 = arg4;
        this.field7062 = arg1;
        this.field7060 = arg2;
        this.field7056 = arg3;
    }
}
