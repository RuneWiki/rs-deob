import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class116 extends class113 {

    @OriginalMember(owner = "client!io", name = "g", descriptor = "Lcw;")
    public class386 field1629;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lgk;II[B)V")
    public class116(class463 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1629 = class235.method1497(arg3, false, arg2, 6406, 6406, arg0, 1, arg1);
        this.field1629.method2040(false, (byte) 89, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)Lbm;")
    public static final class215 method751(byte arg0, int arg1, int arg2) {
        field1630++;
        class215 var3 = new class215();
        var3.field2751 = -1;
        var3.field2754 = -1;
        var3.field2762 = arg2 + 1 + 5;
        var3.field2743 = arg1 + 1 + 5;
        if (arg0 > -21) {
            field1632 = 106;
        }
        var3.field2742 = new int[var3.field2743][var3.field2762];
        var3.method1374(-5);
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public static final void method752(boolean arg0) {
        field1633++;
        class249.field3175.method84(-73);
        class24.field429.method84(-76);
        class412.field5493.method84(99);
        if (arg0) {
            class248.field3172.method84(-118);
            class256.field3238.method84(102);
        }
    }
}
