import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class36 {

    @OriginalMember(owner = "client!df", name = "t", descriptor = "B")
    private byte field708;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Leh;")
    public static class47 field690 = class195.method1282((byte) -4, "l");

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Leh;")
    public static class47 field693 = class195.method1282((byte) -4, "leuchten2:");

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Leh;")
    public static class47 field691 = class195.method1282((byte) -4, "");

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Leh;")
    public static class47 field700 = class195.method1282((byte) -4, "Texturen geladen)3");

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Leh;")
    private static class47 field701 = class195.method1282((byte) -4, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Leh;")
    private static class47 field695 = class195.method1282((byte) -4, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Leh;")
    public static class47 field699 = field695;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Leh;")
    private static class47 field706 = class195.method1282((byte) -4, " has logged in)3");

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Leh;")
    private static class47 field709 = class195.method1282((byte) -4, "Unable to find ");

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Leh;")
    public static class47 field711 = field701;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Leh;")
    public static class47 field698 = field706;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Leh;")
    public static class47 field703 = field709;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
    public static boolean field697;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method306(int arg0) {
        if (arg0 <= 109) {
            field691 = null;
        }
        field712++;
        return this.field708 & 0x7;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method307(byte arg0) {
        field711 = null;
        field700 = null;
        field709 = null;
        field701 = null;
        field698 = null;
        field699 = null;
        if (arg0 > -93) {
            return;
        }
        field703 = null;
        field693 = null;
        field706 = null;
        field690 = null;
        field691 = null;
        field695 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class36() {
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method308(int arg0) {
        if (class61.field1323 != null) {
            class61.field1323.method678((byte) -80);
            class61.field1323 = null;
        }
        field694++;
        class99.method800(arg0 ^ 0xFFFFFF80);
        class135.method982();
        for (int var1 = 0; var1 < 4; var1++) {
            class54.field1043[var1].method322(arg0 - 18);
        }
        System.gc();
        class189.method1245(arg0, (byte) 69);
        class107.field2235 = -1;
        class72.field1545 = false;
        class69.method617(false);
        class198.method1299(arg0 ^ 0x2, 10);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lhd;)V")
    public class36(class68 arg0) {
        this.field708 = arg0.method567(-1);
        this.field707 = arg0.method569(26496);
        this.field696 = arg0.method599((byte) 96);
        this.field689 = arg0.method599((byte) 96);
        this.field710 = arg0.method599((byte) 96);
        this.field704 = arg0.method599((byte) 96);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I")
    public final int method309(int arg0) {
        if (arg0 != 7) {
            method308(100);
        }
        field702++;
        return (this.field708 & 0x8) == 8 ? 1 : 0;
    }
}
