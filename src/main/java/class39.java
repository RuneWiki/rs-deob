import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class39 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Led;")
    public static class43 field735 = class191.method1219("Die Verbindung konnte", false);

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Led;")
    private static class43 field734 = class191.method1219(" more options", false);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Led;")
    public static class43 field737 = class191.method1219("blaugr-Un:", false);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Led;")
    public static class43 field745 = field734;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Led;")
    private static class43 field743 = class191.method1219("Please try again)3", false);

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[Ljg;")
    public static class89[] field744 = new class89[2048];

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Led;")
    public static class43 field742 = field743;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Led;")
    public static class43 field736 = class191.method1219("<col=ffff00>", false);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[B")
    public byte[] field731;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[B")
    public byte[] field746;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    public static int[] field753;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[[[B")
    public static byte[][][] field749;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method212(Component arg0, int arg1) {
        field739++;
        arg0.removeMouseListener(class102.field1942);
        arg0.removeMouseMotionListener(class102.field1942);
        arg0.removeFocusListener(class102.field1942);
        class156.field3157 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public static final void method213(int arg0, int arg1) {
        int var2 = 91 % ((arg1 - 50) / 49);
        field732++;
        class23.field450 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Led;")
    public static final class43 method214(int arg0, byte arg1) {
        field747++;
        if (arg1 != 108) {
            return null;
        }
        class43 var2 = class30.method161(arg0, 10);
        for (int var3 = var2.method248((byte) 60) - 3; var3 > 0; var3 -= 3) {
            var2 = class167.method1036(new class43[] { var2.method241((byte) -62, 0, var3), class139.field2873, var2.method238(arg1 - 93, var3) }, true);
        }
        if (var2.method248((byte) 60) > 9) {
            return class167.method1036(new class43[] { class107.field2055, var2.method241((byte) 123, 0, var2.method248((byte) 60) - 8), class92.field1815, class101.field1928, var2, class128.field2568 }, true);
        } else if (var2.method248((byte) 60) > 6) {
            return class167.method1036(new class43[] { class90.field1790, var2.method241((byte) 80, 0, var2.method248((byte) 60) - 4), class110.field2121, class101.field1928, var2, class128.field2568 }, true);
        } else {
            return class167.method1036(new class43[] { class109.field2111, var2, class75.field1498 }, true);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method215(byte arg0) {
        if (arg0 > -12) {
            return;
        }
        field743 = null;
        field749 = null;
        field742 = null;
        field735 = null;
        field753 = null;
        field745 = null;
        field736 = null;
        field734 = null;
        field744 = null;
        field737 = null;
    }
}
