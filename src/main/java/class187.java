import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class187 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Lla;")
    private class422 field3118;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLoj;)V", line = 6)
    public static final void method1423(boolean arg0, class208 arg1) {
        field3122++;
        if (class32.field304) {
            return;
        }
        arg1.method636((byte) 97);
        class608.field8588--;
        if (!arg0) {
            method1424(null, -7, -115);
        }
        if (!arg1.field3484) {
            long var5 = arg1.field3476;
            class180 var7;
            for (var7 = (class180) class88.field1289.method3512(true, var5); var7 != null && !var7.field3061.equals(arg1.field3483); var7 = (class180) class88.field1289.method3513(-1)) {
            }
            if (var7 != null && var7.method1397(arg1, false)) {
                class455.method2790((byte) 5, var7);
            }
            return;
        }
        for (class180 var2 = (class180) class26.field263.method3772(arg0); var2 != null; var2 = (class180) class26.field263.method3780(23774)) {
            if (var2.field3061.equals(arg1.field3483)) {
                boolean var3 = false;
                for (class208 var4 = (class208) var2.field3055.method3772(true); var4 != null; var4 = (class208) var2.field3055.method3780(23774)) {
                    if (arg1 == var4) {
                        if (var2.method1397(arg1, false)) {
                            class455.method2790((byte) 5, var2);
                        }
                        var3 = true;
                        break;
                    }
                }
                if (var3) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([SII)[S", line = 79)
    public static final short[] method1424(short[] arg0, int arg1, int arg2) {
        field3120++;
        short[] var3 = new short[arg2];
        class571.method3312(arg0, 0, var3, 0, arg2);
        int var4 = -64 % ((-arg1 - 55) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 94)
    public static final void method1425(int arg0) {
        field3123++;
        if (arg0 != 0) {
            field3121 = 95;
        }
        if (class471.field6843 != null) {
            class471.field6843.method3190((byte) 112);
            class19.field194 = null;
            class471.field6843 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 123)
    public class187(class292 arg0, int arg1, class422 arg2) {
        new class14(64);
        this.field3118 = arg2;
        this.field3119 = this.field3118.method2615(0, 15);
    }
}
