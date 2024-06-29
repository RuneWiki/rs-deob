import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class241 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lvp;")
    public static class123 field3501 = new class123(40, 18);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lvp;")
    public static class123 field3507 = new class123(24, -1);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lfk;")
    public class461 field3499;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Ldt;", line = 4)
    public final synchronized class158 method1559(int arg0) {
        field3505++;
        class158 var2 = (class158) this.field3499.field6812.method2339(-82, (long) this.field3506);
        if (var2 != null) {
            return var2;
        }
        class158 var3 = class158.method1134(this.field3499.field6802, this.field3506, arg0);
        if (var3 != null) {
            this.field3499.field6812.method2342((long) this.field3506, var3, arg0 ^ 0xFFFFFF92);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLti;)V", line = 35)
    public final void method1560(byte arg0, class303 arg1) {
        if (arg0 <= 9) {
            return;
        }
        while (true) {
            int var3 = arg1.method1918((byte) 98);
            if (var3 == 0) {
                field3500++;
                return;
            }
            this.method1562(arg1, var3, -2);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 56)
    public static void method1561(byte arg0) {
        field3501 = null;
        if (arg0 >= -45) {
            method1561((byte) 70);
        }
        field3507 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lti;II)V", line = 67)
    private final void method1562(class303 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field3506 = arg0.method1868(0);
        } else if (arg1 == 2) {
            this.field3504 = arg0.method1918((byte) -104);
            this.field3503 = arg0.method1918((byte) -118);
        }
        field3508++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Z", line = 95)
    public static final boolean method1563(byte arg0) {
        if (arg0 != 89) {
            field3507 = null;
        }
        field3498++;
        return class106.field1669 > 0;
    }
}
