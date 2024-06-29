import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class57 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "Lvv;")
    public static class329 field685 = new class329(16);

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "Lhda;")
    public static class752 field688 = new class752(47, 1);

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
    public static final void method378(int arg0) {
        class586.method3199(-106);
        field689++;
        if (arg0 != -26894) {
            return;
        }
        class201.field3013 = null;
        class164.field2494 = null;
        class193.field2912 = null;
        class178.field2688 = null;
        class131.field2147 = null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(III)V")
    public static final void method379(int arg0, int arg1, int arg2) {
        field686++;
        class127 var3 = class760.method4231(arg0, -874792672, 12);
        var3.method1010(614);
        if (arg2 != 16) {
            method378(2);
        }
        var3.field2099 = arg1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        field685 = null;
        field688 = null;
        if (arg0 > -46) {
            method380((byte) 5);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BI)V")
    public static final void method381(byte arg0, int arg1) {
        field687++;
        class127 var2 = class760.method4231(arg1, -874792672, 16);
        var2.method1002(-60);
        if (arg0 != 70) {
            method379(40, 117, -76);
        }
    }
}
