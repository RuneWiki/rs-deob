import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 extends class96 {

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "[B")
    public byte[] field1060;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)Ldj;")
    public static final class218 method493(boolean arg0, int arg1) {
        field1061++;
        class218 var2 = (class218) class364.field5470.method40(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field1443.method1470(4, arg1, 1);
        class218 var4 = new class218();
        var4.field3067 = arg1;
        if (var3 != null) {
            var4.method1341(new class156(var3), -29353);
        }
        var4.method1342((byte) 83);
        if (arg0) {
            return null;
        }
        if (var4.field3060 == 2 && class451.field6569.method2310((byte) -112, (long) arg1) == null) {
            class451.field6569.method2317(-1, (long) arg1, new class304(class256.field3673));
            class141.field1839[class256.field3673++] = var4;
        }
        class364.field5470.method36(-20960, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V")
    public class74(byte[] arg0) {
        this.field1060 = arg0;
    }

    static {
        new class256("", 76);
    }
}
