import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class308 {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lph;")
    public static class229 field5193 = class266.method1858("(U1", 0);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lph;")
    private static class229 field5195 = class266.method1858("flash1:", 0);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lph;")
    public static class229 field5191 = field5195;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lph;")
    public static class229 field5194 = field5195;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[S")
    public static short[] field5196 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Lbk;")
    public static class60 field5192;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 16)
    public static void method2077(int arg0) {
        field5196 = null;
        field5194 = null;
        if (arg0 != -1) {
            method2078(105, -101);
        }
        field5192 = null;
        field5191 = null;
        field5195 = null;
        field5193 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 37)
    public static final int method2078(int arg0, int arg1) {
        if (arg1 == 1895919) {
            field5189++;
            return (arg0 & 0x1CEDEF) >> 18;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Lig;", line = 54)
    public static final class153 method2079(int arg0, int arg1) {
        field5190++;
        class153 var2 = (class153) class265.field4460.method1413((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field3518.method523(-41, arg0, arg1);
        class153 var4 = new class153();
        if (var3 != null) {
            var4.method1107((byte) -52, new class164(var3));
        }
        class265.field4460.method1419((long) arg0, 5216, var4);
        return var4;
    }
}
