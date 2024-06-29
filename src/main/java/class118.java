import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class118 extends class291 {

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Leg;")
    private static class37 field1997 = class174.method1167("white:", 95);

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Leg;")
    public static class37 field2005 = field1997;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Leg;")
    public static class37 field2008 = field1997;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "Leg;")
    public static class37 field2009 = class174.method1167(":assistreq:", -127);

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Leg;")
    public class37 field1999;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljl;BI)Lja;")
    public static final class105 method839(class101 arg0, byte arg1, int arg2) {
        field2001++;
        if (class170.method1139((byte) 26, arg2, arg0)) {
            return arg1 == 120 ? class75.method498((byte) -56) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static void method840(int arg0) {
        if (arg0 != -6) {
            method839((class101) null, (byte) 98, -100);
        }
        field2005 = null;
        field2008 = null;
        field2009 = null;
        field1997 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lva;BI)V")
    private final void method841(class187 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1998 = arg0.method1268(255);
        } else if (arg2 == 2) {
            this.field2003 = arg0.method1290((byte) 90);
        } else if (arg2 == 5) {
            this.field1999 = arg0.method1253(30);
        }
        field2010++;
        int var4 = 83 / ((arg1 + 79) / 38);
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)Z")
    public final boolean method842(int arg0) {
        if (arg0 == 28253) {
            field2000++;
            return this.field1998 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method843(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 > -113) {
            method839((class101) null, (byte) 37, -82);
        }
        field2006++;
        if (class262.method1772(0, arg3)) {
            client.method785(class232.field4000[arg3], -1, arg5, arg2, arg0, arg7, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILva;)V")
    public final void method844(int arg0, class187 arg1) {
        if (arg0 >= -89) {
            field2005 = null;
        }
        field2002++;
        while (true) {
            int var3 = arg1.method1268(255);
            if (var3 == 0) {
                return;
            }
            this.method841(arg1, (byte) -118, var3);
        }
    }
}
