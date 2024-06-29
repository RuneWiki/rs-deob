import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class289 extends class84 {

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4584 = 1;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4587 = 0;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Lcc;")
    public static class216 field4583 = new class216(500);

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqi;ZZ)V")
    public static final void method1962(class131 arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            method1962((class131) null, false, false);
        }
        ++field4586;
        int var3 = ~arg0.field2003 != -1 ? arg0.field2003 : arg0.field2102;
        int var4 = ~arg0.field2025 == -1 ? arg0.field2167 : arg0.field2025;
        class17.method120(-118, arg0.field2073, var4, class113.field1631[arg0.field2073 >> 16], arg2, var3);
        if (arg0.field2052 != null) {
            class17.method120(-124, arg0.field2073, var4, arg0.field2052, arg2, var3);
        }
        class17 var5 = (class17) class124.field1806.method1034((long) arg0.field2073, (byte) 21);
        if (var5 != null) {
            class64.method470(arg2, var3, !arg1, var5.field191, var4);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)I")
    public static final int method1963(boolean arg0, int arg1) {
        ++field4585;
        long var2 = class197.method1454((byte) -104);
        if (arg1 != 0) {
            field4587 = -63;
        }
        for (class100 var4 = arg0 ? (class100) class262.field4266.method1033(-9843) : (class100) class262.field4266.method1031((byte) -7); var4 != null; var4 = (class100) class262.field4266.method1031((byte) -7)) {
            if (~(4611686018427387903L & var4.field1470) > ~var2) {
                if ((4611686018427387904L & var4.field1470) != 0L) {
                    int var5 = (int) var4.field4459;
                    class243.field3904[var5] = class252.field4160[var5];
                    var4.method1922(-1);
                    return var5;
                }
                var4.method1922(~arg1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)V")
    public static void method1964(int arg0) {
        if (arg0 == 0) {
            field4583 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field4588;
        if (arg0 > -125) {
            return null;
        } else {
            int[] var3 = super.field1228.method1627(-1, arg1);
            if (super.field1228.field3651) {
                class158.method1180(var3, 0, class20.field221, class26.field301[arg1]);
            }
            return var3;
        }
    }
}
