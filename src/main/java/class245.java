import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class245 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lvf;")
    public static class265 field4271 = class87.method582(-46, "Examiner");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lvf;")
    public static class265 field4274 = class87.method582(-46, "Untersuchen");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Z")
    public static boolean field4270 = true;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lfl;")
    public static class192 field4273;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lfl;")
    public static class192 field4276;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lmd;")
    public static class214 field4272;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljj;B)Ljj;")
    public abstract class126 method389(class126 arg0, byte arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1628(int arg0) {
        if (arg0 != 0) {
            method1628(-113);
        }
        field4274 = null;
        field4273 = null;
        field4271 = null;
        field4276 = null;
        field4272 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method1629(int arg0) {
        field4275++;
        class89.field1597.method1888((byte) 117);
        class52.field1085.method1888((byte) 123);
        if (arg0 == 0) {
            class13.field417.method1888((byte) 119);
        }
    }
}
