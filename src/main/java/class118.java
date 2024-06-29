import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class118 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Ldd;")
    public static class35 field2621 = class180.method1196((byte) 127, "sl_button");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2618;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public static int[] field2622;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public static int[] field2623;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[[B")
    public static byte[][] field2624;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field2618 = null;
        field2624 = null;
        field2621 = null;
        field2623 = null;
        if (arg0 != 18505) {
            field2618 = null;
        }
        field2622 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V")
    public static final void method846(int arg0, boolean arg1, int arg2) {
        field2620++;
        if (!arg1) {
            method845(-48);
        }
        if (class69.field1670 != 0 && arg2 != -1) {
            class19.method173(class102.field2255, false, arg2, (byte) 120, 0, class69.field1670);
            class181.field3697 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILhb;B[B)V")
    public static final void method847(int arg0, class72 arg1, byte arg2, byte[] arg3) {
        class161 var4 = new class161();
        var4.field3284 = 0;
        field2619++;
        var4.field3281 = arg1;
        var4.field2416 = arg0;
        var4.field3274 = arg3;
        class187 var5 = class71.field1698;
        synchronized (class71.field1698) {
            if (arg2 != -116) {
                return;
            }
            class71.field1698.method1236((byte) -39, var4);
        }
        class64.method530(2103893900);
    }
}
