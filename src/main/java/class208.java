import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class208 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field3780 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Z")
    public static boolean field3779 = false;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Z")
    public static boolean field3781 = true;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "J")
    public static long field3778;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lta;")
    public class165 field3777;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method1498(byte arg0) {
        field3776++;
        class116.field2201 = null;
        class5.field97 = null;
        class196.field3530 = null;
        if (arg0 < 6) {
            method1499((class22) null, 44, (class262) null, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lv;ILvg;B)V")
    public static final void method1499(class22 arg0, int arg1, class262 arg2, byte arg3) {
        field3782++;
        class103 var4 = new class103();
        var4.field1979 = 1;
        var4.field2641 = (long) arg1;
        var4.field1976 = arg2;
        var4.field1970 = arg0;
        class128 var5 = class250.field4395;
        synchronized (class250.field4395) {
            class250.field4395.method1018((byte) 100, var4);
        }
        class133.method1047(-96);
        if (arg3 != 54) {
            field3779 = false;
        }
    }
}
