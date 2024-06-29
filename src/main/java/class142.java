import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class142 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "B")
    private byte field2827;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[Ljd;")
    public static class92[] field2822 = new class92[1000];

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljd;")
    public static class92 field2833 = class202.method1325((byte) 90, "Abbrechen");

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
    public final int method935(int arg0) {
        if (arg0 <= 23) {
            method937(false);
        }
        field2834++;
        return this.field2827 & 0x7;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method936(byte arg0) {
        if (arg0 == 19) {
            field2833 = null;
            field2822 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static final void method937(boolean arg0) {
        field2831++;
        if (class79.field1617 != null) {
            class196 var1 = class79.field1617;
            synchronized (class79.field1617) {
                class79.field1617 = null;
            }
        }
        if (arg0) {
            method936((byte) 6);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)Ljd;")
    public static final class92 method938(int arg0, boolean arg1) {
        field2825++;
        if (arg1) {
            field2835 = 52;
        }
        return class4.method30(arg0, 10, false, false);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)I")
    public final int method939(byte arg0) {
        int var2 = 10 / ((arg0 + 68) / 50);
        field2828++;
        return (this.field2827 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class142() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lh;)V")
    public class142(class70 arg0) {
        this.field2827 = arg0.method431(-12469);
        this.field2823 = arg0.method442(-21351);
        this.field2830 = arg0.method453(87);
        this.field2824 = arg0.method453(125);
        this.field2821 = arg0.method453(57);
        this.field2829 = arg0.method453(27);
    }
}
