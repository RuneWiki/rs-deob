import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 extends class25 {

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lcd;")
    private static class64 field552 = class44.method335((byte) 71, "Loaded world list data");

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lcd;")
    public static class64 field553 = class44.method335((byte) 71, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field555 = -1;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lcd;")
    private static class64 field554 = class44.method335((byte) 71, "shake:");

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lcd;")
    public static class64 field558 = field552;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lcd;")
    public static class64 field556 = field554;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Lcd;")
    public static class64 field561 = field554;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 6)
    public static void method282(int arg0) {
        if (arg0 >= -41) {
            method283(-91, 6);
        }
        field552 = null;
        field561 = null;
        field554 = null;
        field558 = null;
        field556 = null;
        field553 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 39)
    public static final void method283(int arg0, int arg1) {
        if (arg0 >= 100) {
            field557++;
            class165.field2896.method1197((byte) 59, arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V", line = 56)
    public static final void method284(byte arg0) {
        class195.field3332.method1187(0);
        field560++;
        int var1 = -52 % ((-arg0 - 54) / 52);
        class96.field1759.method1187(0);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V", line = 76)
    public class34(int arg0, int arg1) {
        this.field551 = arg0;
        this.field559 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lkh;I)Lf;", line = 94)
    public static final class235 method285(class13 arg0, int arg1) {
        int var2 = 119 / ((28 - arg1) / 35);
        field550++;
        return new class235(arg0.method153(-124), arg0.method153(-96), arg0.method153(-83), arg0.method153(-126), arg0.method153(-96), arg0.method153(-74), arg0.method153(45), arg0.method153(-92), arg0.method111(1263702152), arg0.method152((byte) -128));
    }
}
