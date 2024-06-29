import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[B")
    public static byte[] field299 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "B")
    public byte field293;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "B")
    public byte field301;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "B")
    public byte field307;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "B")
    public byte field311;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "B")
    public byte field312;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "B")
    public byte field314;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "B")
    public byte field315;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "S")
    public short field295;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public boolean field294;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Z")
    public boolean field296;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
    public boolean field297;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
    public boolean field302;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Z")
    public boolean field303;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    public boolean field304;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    public boolean field309;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
    public boolean field310;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Z")
    public boolean field313;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method138(int arg0) {
        field305++;
        if (arg0 >= -38) {
            method139(93);
        }
        class356.field4909 = true;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method139(int arg0) {
        field299 = null;
        if (arg0 != 0) {
            field300 = -41;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILr;Lwm;)V")
    public static final void method140(int arg0, class110 arg1, class364 arg2) {
        field298++;
        if (class47.field635) {
            return;
        }
        arg2.method2064(0);
        class49.field655 = arg2.method2050(class325.method1811(arg1, class311.field4104), true);
        class49.field655.method836((class424.field5738 - class49.field655.method777()) / 2, (class72.field986 - class49.field655.method774()) / 2);
        class140.field2042 = arg2.method2050(class325.method1811(arg1, class155.field2170), true);
        class140.field2042.method836((class424.field5738 - class140.field2042.method777()) / 2, arg0);
        class47.field635 = true;
    }
}
