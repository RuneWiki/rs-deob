import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class200 extends class42 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Laa;")
    public static class343 field3060;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field3060 = null;
        if (arg0 <= 16) {
            field3060 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method1358(byte arg0) {
        if (arg0 != 26) {
            method1357(-96);
        }
        class455.field6612 = new class465(8);
        field3059++;
        class55.field1003 = 0;
        for (class115 var1 = (class115) class235.field3503.method904(false); var1 != null; var1 = (class115) class235.field3503.method907(-1)) {
            var1.method820();
        }
    }
}
