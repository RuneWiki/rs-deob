import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class264 {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4179 = "Examine";

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lub;")
    public static class92 field4182;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lub;")
    public static class92 field4184;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILcc;I)I")
    public static final int method1772(int arg0, class222 arg1, int arg2) {
        field4183++;
        if (!client.method1159(arg1).method229(1, arg2) && arg1.field3519 == null) {
            return -1;
        } else {
            if (arg0 != 32226) {
                field4179 = null;
            }
            return arg1.field3416 == null || arg2 >= arg1.field3416.length ? -1 : arg1.field3416[arg2];
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method1773(byte arg0) {
        field4184 = null;
        field4179 = null;
        field4182 = null;
        if (arg0 != 110) {
            method1776((byte) -110, 56, -9);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
    public static final void method1774(int arg0, byte arg1) {
        field4185++;
        if (arg1 <= 111) {
            field4182 = null;
        }
        class69 var2 = class255.method1723((byte) 32, arg0, 6);
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IB)V")
    public static final void method1775(int arg0, byte arg1) {
        field4180++;
        class188.field2959.method1166((byte) 23, arg0);
        class80.field1226.method1166((byte) 23, arg0);
        int var2 = -7 % ((-arg1 - 69) / 56);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)I")
    public static final int method1776(byte arg0, int arg1, int arg2) {
        int var3 = 77 % ((12 - arg0) / 53);
        class198 var4 = (class198) class94.field1480.method2043((long) arg1, -1);
        field4181++;
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field3078.length > arg2) {
            return var4.field3078[arg2];
        } else {
            return 0;
        }
    }
}
