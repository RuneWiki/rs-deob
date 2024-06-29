import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class294 {

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lap;")
    public static class310 field4145 = new class310(1, 2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lor;")
    public static class275 field4147;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lrn;")
    public static class417 field4151;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lnl;")
    public static class435 field4150;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 3)
    public static void method1915(byte arg0) {
        field4147 = null;
        field4151 = null;
        int var1 = 1 % ((-arg0 - 27) / 60);
        field4145 = null;
        field4150 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)I", line = 16)
    public final int method1916(boolean arg0) {
        field4152++;
        if (!arg0) {
            field4150 = null;
        }
        return this.field4149;
    }

    @OriginalMember(owner = "client!ha", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field4146++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1917(int arg0) {
        field4148++;
        boolean var1 = class464.field6538 != null || class169.field2446 > 0;
        if (var1) {
            class412.field5645 = 1;
        }
        if (class243.field3533 && class162.field2363.method1820((byte) -96, 81) && class303.field4310 > 2) {
            if (var1) {
                class373.field5137 = (class73) class6.field38.field1299.field6388.field6388;
            } else {
                class434.method2622((byte) 118, class69.field1012.method938(1), class69.field1012.method936(0), (class73) class6.field38.field1299.field6388.field6388);
            }
        } else if (var1) {
            class373.field5137 = (class73) class6.field38.field1299.field6388;
        } else {
            class434.method2622((byte) 118, class69.field1012.method938(1), class69.field1012.method936(0), (class73) class6.field38.field1299.field6388);
        }
        if (arg0 > -42) {
            method1915((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 76)
    public class294(String arg0, int arg1) {
        this.field4149 = arg1;
    }
}
