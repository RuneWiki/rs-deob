import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class26 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[J")
    public static long[] field559 = new long[32];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "S")
    public static short field552 = 32767;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
    public static long field558 = 0L;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lek;")
    public static class169 field556;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lkf;")
    public static class38 field557;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method242(int arg0) {
        field556 = null;
        field559 = null;
        field557 = null;
        if (arg0 != 1) {
            method245(114, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIZIIIIIIII)Z")
    public static final boolean method243(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field555++;
        if (arg3) {
            return false;
        } else if (class239.field4067.field3976 == 2) {
            return class240.method1633(arg2, arg10, arg6, arg9, arg11, arg7, arg8, arg0, 109, arg1, arg4, arg5);
        } else if (class239.field4067.field3976 > 2) {
            return class251.method1700(arg1, arg0, arg6, class239.field4067.field3976, arg4, arg7, arg8, arg5, arg10, -105, arg2, arg9, arg11);
        } else {
            return class8.method52(arg9, arg2, (byte) 94, arg8, arg5, arg10, arg4, arg1, arg6, arg0, arg7, arg11);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method244(byte arg0) {
        if (arg0 > -12) {
            method243(29, true, 94, false, -31, -52, -103, 111, 50, 17, 66, 58);
        }
        field553++;
        if (class201.field3313 > 0) {
            class25.method239((byte) 54);
        } else {
            class194.field3222 = class148.field2547;
            class148.field2547 = null;
            class120.method868(118, 40);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Lnc;")
    public static final class231 method245(int arg0, byte arg1) {
        class231 var2 = (class231) class173.field2882.method764((byte) 70, (long) arg0);
        field550++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -126) {
            method243(-89, true, -27, true, -62, -31, 121, -121, 87, 78, -6, -61);
        }
        byte[] var3 = class134.field2341.method190((byte) -79, arg0, 1);
        class231 var4 = new class231();
        if (var3 != null) {
            var4.method1571(-9, new class217(var3), arg0);
        }
        class173.field2882.method765((byte) -120, var4, (long) arg0);
        return var4;
    }
}
