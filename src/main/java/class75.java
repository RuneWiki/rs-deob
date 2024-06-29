import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class75 extends Canvas {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field903;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lec;")
    public static class57 field899 = new class57();

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lef;")
    public static class241 field902 = new class241(64);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static void method459(boolean arg0) {
        field902 = null;
        field899 = null;
        if (arg0) {
            method459(true);
        }
    }

    @OriginalMember(owner = "client!jk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field901++;
        this.field903.update(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field903.paint(arg0);
        field896++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lhi;Lbc;ILbc;)V")
    public static final void method460(class25 arg0, class282 arg1, int arg2, class282 arg3) {
        class199.field2832 = arg1;
        field900++;
        class179.field2543 = arg0;
        class27.field326 = arg3;
        if (arg2 != 1) {
            method460((class25) null, (class282) null, -16, (class282) null);
        }
        if (class199.field2832 != null) {
            class154.field2227 = class199.field2832.method1874((byte) 18, 1);
        }
        if (class27.field326 != null) {
            class222.field3141 = class27.field326.method1874((byte) 18, 1);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method461(byte arg0) {
        if (arg0 < 103) {
            field902 = null;
        }
        field898++;
        class124.field1785.method67((byte) 84);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbc;BLbc;)V")
    public static final void method462(class282 arg0, byte arg1, class282 arg2) {
        class115.field1587 = arg0;
        class100.field1352 = arg2;
        field897++;
        int var3 = -64 % ((arg1 - 50) / 62);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class75(Component arg0) {
        this.field903 = arg0;
    }
}
