import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class66 extends class3 {

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lni;")
    public class311 field1002;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Lee;")
    public static class75 field1003 = new class75(64);

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Lok;")
    public static class41 field1005 = class137.method956(")3", 45);

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "Z")
    public static boolean field1006 = true;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "Lok;")
    public static class41 field1008 = class137.method956("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V", line = 15)
    public static void method486(int arg0) {
        field1005 = null;
        if (arg0 != 64) {
            method486(63);
        }
        field1008 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V", line = 46)
    public static final void method487(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 24 % ((32 - arg3) / 55);
        field1007++;
        if (class273.field4449 <= arg0 && class153.field2439 >= arg0) {
            int var6 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg1);
            int var7 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg4);
            class271.method1913(var7, (byte) -117, arg0, var6, arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lni;)V", line = 75)
    public class66(class311 arg0) {
        this.field1002 = arg0;
    }
}
