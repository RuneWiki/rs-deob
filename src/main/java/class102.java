import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class class102 {

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1467 = 104;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Lpb;")
    public static class680 field1464;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
    public static final byte[] method787(int arg0, int arg1, Object arg2, byte arg3) {
        field1463++;
        if (arg2 == null) {
            return null;
        } else if (arg3 < 110) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class308.method1988(arg1, var4, 0, arg0);
        } else if (arg2 instanceof class102) {
            class102 var5 = (class102) arg2;
            return var5.method791(0, arg1, arg0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
    public static final void method788(boolean arg0) {
        field1465++;
        if (!arg0) {
            class282.field4078.method3103(-11294);
            class338.field4739.method3103(-11294);
            class647.field8730.method3103(-11294);
            class98.field1408.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "([BI)V")
    public abstract void method789(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)[B")
    public abstract byte[] method790(int arg0);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)[B")
    public abstract byte[] method791(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(Z)V")
    public static void method792(boolean arg0) {
        field1464 = null;
        if (arg0) {
            method792(false);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static final void method793(byte arg0) {
        class345[] var1 = class223.field2890;
        synchronized (class223.field2890) {
            int var2 = 0;
            while (true) {
                if (var2 >= class223.field2890.length) {
                    break;
                }
                class223.field2890[var2] = new class345();
                class68.field950[var2] = 0;
                var2++;
            }
        }
        if (arg0 >= -120) {
            field1464 = null;
        }
        field1466++;
    }
}
