import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class137 implements class759 {

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Ljava/lang/String;")
    private String field1718;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lbt;")
    private class48 field1714;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1713 = -1;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lhj;")
    public static class596 field1716 = new class596(6, 6);

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "B")
    public static byte field1719;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I", line = 4)
    public final int method230(int arg0) {
        if (arg0 != -6635) {
            this.field1714 = null;
        }
        field1721++;
        return this.field1714.method444((byte) -24, this.field1718) ? 100 : this.field1714.method435(0, this.field1718);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Lsg;", line = 19)
    public final class418 method231(int arg0) {
        if (arg0 != -27990) {
            this.method230(-60);
        }
        field1722++;
        return class418.field5451;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V", line = 31)
    public static final void method1008(int arg0) {
        if (class363.field4526.method561()) {
            class363.field4526.method608(class109.field1370);
            class190.method1248(true);
            if (class769.field10572) {
                class247.method1486((byte) 90, class109.field1370);
            } else {
                Dimension var1 = class109.field1370.getSize();
                class363.field4526.method637(class109.field1370, var1.width, var1.height);
            }
            class363.field4526.method627(class109.field1370);
        } else {
            class677.method3810(true, class118.field1503.field10665.method1903(0), false);
        }
        field1720++;
        if (arg0 != 0) {
            method1008(94);
        }
        class41.method341(-65);
        class257.field3034 = true;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V", line = 69)
    public static void method1009(int arg0) {
        field1716 = null;
        if (arg0 < 24) {
            field1713 = -17;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lbt;Ljava/lang/String;)V", line = 90)
    public class137(class48 arg0, String arg1) {
        this.field1718 = arg1;
        this.field1714 = arg0;
    }
}
