import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class229 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4130 = 128;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lmb;")
    public static class132 field4131 = class166.method1092("blinken1:", 119);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lmb;")
    public static class132 field4135 = class166.method1092("(U2", 111);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1459(int arg0, int arg1) {
        if (arg1 == -3694) {
            class43.field754 = 1000 / arg0;
            field4133++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        if (arg0 != -121) {
            field4131 = null;
        }
        field4135 = null;
        field4131 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1461(int arg0) {
        if (class166.field3027 != null) {
            class166.field3027.method423(true);
            class166.field3027 = null;
        }
        field4132++;
        class17.method89(109);
        class23.method154();
        int var1 = 0;
        if (arg0 != -24962) {
            method1461(79);
        }
        while (var1 < 4) {
            class182.field3351[var1].method1305(true);
            var1++;
        }
        class125.method824((byte) 95);
        System.gc();
        class164.method1062(2, -1);
        class182.field3345 = false;
        class182.field3335 = -1;
        class23.method151((byte) -118);
        class2.method6(10, (byte) -30);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLpb;I)Lnc;")
    public static final class144 method1462(byte arg0, class165 arg1, int arg2) {
        if (arg0 != 67) {
            method1461(-35);
        }
        field4129++;
        byte[] var3 = arg1.method1072(arg2, arg0 ^ 0x42);
        return var3 == null ? null : new class144(var3);
    }
}
