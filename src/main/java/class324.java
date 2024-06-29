import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class324 extends class406 {

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public int field4613 = -1;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
    public boolean field4617 = false;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
    public static boolean field4610 = false;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lva;")
    public static class288 field4614 = new class288(32);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lic;")
    public static class417 field4620;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method2109(int arg0) {
        field4612++;
        class118.field1443.method1626((byte) 106);
        if (arg0 != 32) {
            field4620 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILtq;)V")
    public static final void method2110(int arg0, class376 arg1) {
        class401.field5725 = arg1;
        if (arg0 <= -78) {
            field4608++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method2111(byte arg0) {
        if (arg0 != -38) {
            method2110(69, (class376) null);
        }
        field4614 = null;
        field4620 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
    public class324(int arg0) {
        this.field4613 = arg0;
    }
}
