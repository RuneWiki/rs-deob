import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class116 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lmh;")
    public static class62 field1938 = class201.method1405(true, "hint_mapmarkers");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lud;")
    public static class52 field1945 = new class52();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILmh;)V", line = 18)
    public static final void method899(int arg0, int arg1, class62 arg2) {
        field1936++;
        class151 var3 = class165.method1194((byte) 1, arg0, arg1);
        var3.method1088(126);
        var3.field2384 = arg2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 31)
    public static void method900(byte arg0) {
        if (arg0 != 49) {
            method900((byte) 85);
        }
        field1945 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILmh;Lmh;B)V", line = 107)
    public static final void method901(int arg0, class62 arg1, class62 arg2, byte arg3) {
        class38.method260(arg0, arg2, arg1, -1, -1, (class62) null);
        field1939++;
        if (arg3 <= 47) {
            method901(-51, (class62) null, (class62) null, (byte) 92);
        }
    }
}
