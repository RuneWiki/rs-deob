import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class306 extends class45 {

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field4500 = 0;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public int field4509 = -1;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lcd;")
    public static class43[] field4496 = new class43[32768];

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field4506 = -1;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4502 = "Loaded sprites";

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljn;")
    public static class396 field4491 = new class396();

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method2087(byte arg0) {
        if (arg0 <= 66) {
            field4502 = null;
        }
        field4496 = null;
        field4502 = null;
        field4491 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
    public static final void method2088(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4494++;
        if (class384.field5563 == 1) {
            class139.field1915[class117.field1652 / 100].method454(class152.field2062 - 8, class414.field6086 + -8);
        }
        if (class384.field5563 == 2) {
            class139.field1915[class117.field1652 / 100 + 4].method454(class152.field2062 - 8, class414.field6086 + -8);
        }
        class188.method1131(arg0 - 48577);
        if (arg0 != 32768) {
            method2089(-66);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)Lur;")
    public static final class92 method2089(int arg0) {
        field4507++;
        class248.field3343 = 0;
        if (arg0 <= 16) {
            method2087((byte) 17);
        }
        return class431.method2733(-1);
    }
}
