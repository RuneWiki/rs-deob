import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ga")
public class class62 {

    @OriginalMember(owner = "ga", name = "d", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "ga", name = "c", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "ga", name = "f", descriptor = "Llf;")
    public static class109 field1203 = class35.method275("Angreifen", 2);

    @OriginalMember(owner = "ga", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "ga", name = "e", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "ga", name = "b", descriptor = "Loh;")
    public static class138 field1199;

    @OriginalMember(owner = "ga", name = "a", descriptor = "(Lbg;ZLbg;)V")
    public static final void method405(class18 arg0, boolean arg1, class18 arg2) {
        field1202++;
        class7.field105 = arg0;
        if (!arg1) {
            class174.field3290 = arg2;
        }
    }

    @OriginalMember(owner = "ga", name = "a", descriptor = "(I)V")
    public static final void method406(int arg0) {
        field1198++;
        if (arg0 != 21504) {
            field1203 = null;
        }
        if (!class123.field2360) {
            return;
        }
        class200 var1 = class129.method932(class168.field3115, -1, class8.field119);
        if (var1 != null && var1.field3832 != null) {
            class82 var2 = new class82();
            var2.field1613 = var1.field3832;
            var2.field1608 = var1;
            class42.method305(24087, var2);
        }
        class123.field2360 = false;
        class115.method851(var1, arg0 ^ 0xFFFFF1C3);
    }

    @OriginalMember(owner = "ga", name = "a", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field1199 = null;
        field1203 = null;
        if (arg0 != 97) {
            field1200 = -95;
        }
    }
}
