import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 {

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "Z")
    private static boolean field1168 = false;

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "I")
    private static int field1170 = 0;

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "Ljia;")
    private static class645 field1169 = new class645();

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final synchronized void method686(boolean arg0, boolean arg1) {
        field1168 = arg1;
        if (!arg0) {
            field1168 = false;
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V", line = 20)
    public static final synchronized void method687(int arg0) {
        if (arg0 >= 86) {
            field1170++;
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)V", line = 31)
    public static final synchronized void method688(boolean arg0) {
        while (true) {
            class285 var1 = (class285) field1169.method3584(23287);
            if (var1 == null) {
                if (!arg0) {
                    method690(null, (byte) 102);
                    return;
                }
                return;
            }
            var1.field3932.method131(true);
            var1.method1207(101);
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V", line = 51)
    public static final synchronized void method689(byte arg0) {
        field1170--;
        if (field1170 == 0) {
            method688(true);
        }
        if (arg0 > -18) {
            method689((byte) 47);
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Le;B)V", line = 67)
    public static final synchronized void method690(class560 arg0, byte arg1) {
        if (field1168) {
            return;
        }
        if (field1170 > 0) {
            class285 var2 = new class285();
            var2.field3932 = arg0;
            field1169.method3594((byte) -34, var2);
        } else {
            arg0.method131(false);
        }
        if (arg1 < 5) {
            field1168 = false;
        }
    }
}
