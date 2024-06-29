import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class138 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[Lid;")
    public static class149[] field2517 = new class149[500];

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lve;")
    public static class189 field2520 = new class189(64);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lid;")
    public static class149 field2521 = class60.method382("jaune:", (byte) 12);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
    public static int[] field2522 = new int[128];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lid;")
    public static class149 field2524 = class60.method382("", (byte) 66);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lid;")
    public static class149 field2523 = class60.method382("Fps:", (byte) 21);

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2525 = 1;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILgd;)Lil;")
    public static final class162 method962(int arg0, class74 arg1) {
        if (arg0 != 64) {
            method963(-95);
        }
        field2519++;
        return new class162(arg1.method526((byte) 98), arg1.method526((byte) 124), arg1.method526((byte) 126), arg1.method526((byte) 72), arg1.method526((byte) 100), arg1.method526((byte) 78), arg1.method526((byte) 69), arg1.method526((byte) 90), arg1.method525(65280), arg1.method489((byte) -126));
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2521 = null;
        field2523 = null;
        field2520 = null;
        field2524 = null;
        field2522 = null;
        if (arg0 != 0) {
            method964(-15, -92);
        }
        field2517 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lsj;")
    public static final class49 method964(int arg0, int arg1) {
        if (arg0 > -83) {
            return null;
        }
        class49 var2 = (class49) class264.field4692.method800(261775, (long) arg1);
        field2518++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class173.field3197.method1562(-809612665, arg1, 11);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method313(4572, new class74(var3));
        }
        class264.field4692.method802((long) arg1, 0, var4);
        return var4;
    }
}
