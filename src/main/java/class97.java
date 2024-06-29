import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class97 extends class47 {

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Loc;")
    private static class99 field2336 = class48.method402((byte) -104, "Loading game screen )2 ");

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Loc;")
    public static class99 field2335 = class48.method402((byte) -104, ")1p");

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2334 = 0;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Loc;")
    public static class99 field2333 = class48.method402((byte) -104, "welle2:");

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Loc;")
    public static class99 field2332 = class48.method402((byte) -104, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Loc;")
    public static class99 field2341 = field2336;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Loc;")
    private static class99 field2339 = class48.method402((byte) -104, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Loc;")
    public static class99 field2338 = field2339;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Loc;")
    public static class99 field2344 = class48.method402((byte) -104, "Registrierter Benutzer");

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Loc;")
    public static class99 field2340 = class48.method402((byte) -104, ":");

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Loc;")
    public static class99 field2345 = class48.method402((byte) -104, " )2> @lre@");

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Loc;")
    public static class99 field2346 = class48.method402((byte) -104, "@gr1@");

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lwe;")
    public static class150 field2337;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Loc;")
    public class99 field2343;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method801(boolean arg0, Component arg1) {
        field2342++;
        arg1.removeMouseListener(class45.field1070);
        if (!arg0) {
            field2340 = null;
        }
        arg1.removeMouseMotionListener(class45.field1070);
        arg1.removeFocusListener(class45.field1070);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        if (arg0 != -60) {
            method802((byte) 117);
        }
        class149.field3687.method998(true);
        class113.field2823.method998(true);
        field2347++;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method803(int arg0) {
        field2344 = null;
        field2341 = null;
        field2338 = null;
        if (arg0 != 4910) {
            return;
        }
        field2333 = null;
        field2339 = null;
        field2332 = null;
        field2340 = null;
        field2336 = null;
        field2335 = null;
        field2346 = null;
        field2345 = null;
        field2337 = null;
    }
}
