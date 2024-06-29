import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class79 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Loh;")
    public static class263 field1600 = class253.method1681(-120, ")4j");

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        if (arg0 == -7373) {
            field1600 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method538(int arg0, int arg1) {
        if (arg1 != 0) {
            method539(true);
        }
        class249.field4351.method829(arg0, (byte) 110);
        field1602++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static final void method539(boolean arg0) {
        field1601++;
        class204.field3662++;
        class154.field2792.method1516(-59, 3);
        if (arg0) {
            class154.field2792.method1272((byte) 77, 0L);
        }
    }
}
