import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class587 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8439 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Llm;")
    public static class50 field8438;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method3444(byte arg0) {
        field8438 = null;
        if (arg0 >= -38) {
            field8439 = -110;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public static final void method3445(int arg0, int arg1, int arg2) {
        class183.field2780 = arg1;
        class483.field6679 = arg0;
        if (arg2 != 8468) {
            method3444((byte) 97);
        }
        field8437++;
        if (class388.field5420 == 0) {
            class81.field1198 = class790.field10813 * 2 + class183.field2780;
            class278.field4016 = class621.field8770 * 2 + class483.field6679;
        } else if (class388.field5420 == 1) {
            class448.field6176 = class183.field2780 / class657.field9274 + class172.field2590 + 2;
            class600.field8557 = class483.field6679 / class36.field432 + class300.field4327 + 2;
            class81.field1198 = class657.field9274 * class448.field6176;
            class278.field4016 = class600.field8557 * class36.field432;
            class621.field8770 = class278.field4016 - class483.field6679 >> 1;
            class790.field10813 = class81.field1198 - class183.field2780 >> 1;
        } else if (class388.field5420 == 2) {
            class81.field1198 = class183.field2780;
            class278.field4016 = class483.field6679;
            return;
        }
    }
}
