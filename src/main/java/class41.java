import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class41 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
    public static volatile boolean field694 = true;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[Lmb;")
    public static class96[] field699 = new class96[1000];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field693 = new int[1000];

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field707 = 99;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Lmb;")
    public static class96 field706 = class243.method1708("Lade Texturen )2 ", (byte) 95);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "J")
    public long field704;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lnb;")
    public class108 field695;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lnb;")
    public class108 field708;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Lnb;")
    public class108 field709;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)J")
    public static final long method317(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 == null || var3.field3281 == null ? 0L : var3.field3281.field309;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lmb;I)I")
    public static final int method318(class96 arg0, int arg1) {
        field698++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class76.field1306; var2++) {
            if (arg0.method679(class185.field3224[var2], arg1 + 18452)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method319(int arg0) {
        if (arg0 != 99) {
            method321(-16);
        }
        field693 = null;
        field699 = null;
        field706 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method320(byte arg0, Component arg1) {
        field702++;
        arg1.removeKeyListener(class60.field1037);
        arg1.removeFocusListener(class60.field1037);
        class272.field4721 = -1;
        if (arg0 < 20) {
            method320((byte) -28, (Component) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static final void method321(int arg0) {
        if (arg0 != 1000) {
            method319(61);
        }
        field696++;
        class15.field233.method96(false);
    }
}
