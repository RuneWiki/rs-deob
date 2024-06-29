import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class Linkable {

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Z")
    public static boolean field94 = false;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Lv;")
    public static JagString field97 = class1.method2(255, "Find");

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "I")
    public static int field93 = 20;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "[J")
    public static long[] field100 = new long[32];

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "J")
    public long key;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "Lg;")
    public Linkable next;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lg;")
    public Linkable prev;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "[I")
    public static int[] field92;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 12)
    public static void method41(int arg0) {
        field100 = null;
        field97 = null;
        field92 = null;
        int var1 = 68 % ((arg0 - 61) / 56);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 44)
    public static final void method42(int arg0, Component arg1) {
        arg1.removeKeyListener(StringNode.field81);
        arg1.removeFocusListener(StringNode.field81);
        if (arg0 != 32) {
            field97 = null;
        }
        mapview.field269 = -1;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 67)
    public final void unlink(byte arg0) {
        if (this.prev == null) {
            return;
        }
        this.prev.next = this.next;
        this.next.prev = this.prev;
        if (arg0 > -83) {
            this.unlink((byte) -6);
        }
        this.next = null;
        this.prev = null;
    }
}
