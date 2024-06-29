import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class307 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lke;")
    public static class256 field5295 = class316.method2202("hint_headicons", 27626);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient;")
    public static client field5289;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
    public static int[] field5283;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 21)
    public static void method2134(int arg0) {
        field5295 = null;
        field5289 = null;
        field5283 = null;
        if (arg0 != 159) {
            method2136(11);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBILng;)Lj;", line = 41)
    public static final class227 method2135(int arg0, byte arg1, int arg2, class138 arg3) {
        field5288++;
        if (arg1 < 11) {
            method2136(49);
        }
        return class83.method611(arg2, 104, arg3, arg0) ? class317.method2206(false) : null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 89)
    public static final void method2136(int arg0) {
        if (arg0 == -5254) {
            field5284++;
            class100.field1785.method2084(-124);
            class14.field183.method2084(-90);
            class45.field837.method2084(-55);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I", line = 112)
    public static final int method2137(int arg0, int arg1) {
        field5287++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            if (arg1 != -123) {
                field5289 = (client) null;
            }
            return arg0;
        }
    }
}
