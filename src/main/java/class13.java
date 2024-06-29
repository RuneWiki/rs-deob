import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class13 extends class398 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[Lb;")
    public static class177[] field299 = new class177[1024];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field307 = -1;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI)V")
    public final void method86(int arg0, byte arg1, int arg2) {
        ++field298;
        if (arg1 != 82) {
            this.method93(52, (class517) null, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Z")
    public final boolean method87(int arg0) {
        ++field303;
        return arg0 != 3 ? true : true;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Luca;)V")
    public class13(class287 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lcaa;Z)V")
    public static final void method88(class538 arg0, boolean arg1) {
        if (class96.field1479) {
            if (arg1) {
                class78.field1283[class78.field1283.length - 1].method2781(arg0, true);
            } else {
                int var2 = class559.method3243(arg0.field7902);
                int var3 = class517.field7266[2] * arg0.method258(-1) / arg0.field7901;
                int var4 = class559.method3243(arg0.field7902 - var3);
                int var5 = class559.method3243(arg0.field7902 + var3);
                if (var4 == var5) {
                    class78.field1283[var2].method2781(arg0, true);
                } else if (var5 - var4 == 1) {
                    class78.field1283[class346.field5108 + var4].method2781(arg0, true);
                } else {
                    class78.field1283[class78.field1283.length - 1].method2781(arg0, true);
                }
            }
        } else {
            class351.method2179(arg0, class631.field9135);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILkga;)V")
    public static final void method89(int arg0, int arg1, int arg2, class518 arg3) {
        class44 var4 = class471.method2715(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field672 = arg3;
            int var5 = class383.field5753 == class178.field2480 ? 1 : 0;
            if (arg3.method270(-125)) {
                if (arg3.method274(-1510217528)) {
                    class403.field6051[var5][class48.field760[var5]++] = arg3;
                    return;
                }
                class313.field4591[var5][class311.field4576[var5]++] = arg3;
                return;
            }
            class153.field2152[var5][class464.field6700[var5]++] = arg3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method90(int arg0) {
        field299 = null;
        if (arg0 != 2199) {
            method89(-107, 56, -59, (class518) null);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
    public final void method91(boolean arg0, int arg1) {
        ++field301;
        super.field6009.method1716(true, 3042);
        if (arg1 != -5191) {
            this.method93(118, (class517) null, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method92(int arg0) {
        ++field306;
        if (arg0 == 512) {
            super.field6009.method1716(false, 3042);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILvaa;B)V")
    public final void method93(int arg0, class517 arg1, byte arg2) {
        ++field305;
        super.field6009.method1709((byte) -51, arg1);
        int var4 = 19 / ((arg2 - 76) / 41);
        super.field6009.method1751(arg0, 21575);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public final void method94(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field304;
        }
    }
}
