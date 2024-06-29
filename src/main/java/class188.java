import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class188 extends class260 {

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Lqp;")
    public static class466 field2714 = new class466("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field2723 = -1;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "Ldi;")
    public static class83 field2725 = new class83(71, 5);

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "Lmg;")
    public static class101 field2726;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public static void method1178(int arg0) {
        field2725 = null;
        field2714 = null;
        field2726 = null;
        if (arg0 != -1) {
            method1178(110);
        }
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)Z")
    public final boolean method1179(int arg0) {
        if (arg0 == 799487809) {
            field2715++;
            return (this.field2719 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
    public final int method1180(byte arg0) {
        if (arg0 == 70) {
            field2716++;
            return this.field2719 >> 18 & 0x7;
        } else {
            return -55;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
    public final boolean method1181(int arg0, int arg1) {
        if (arg0 == -2049225995) {
            field2718++;
            return (this.field2719 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)I")
    public final int method1182(byte arg0) {
        if (arg0 != 104) {
            field2725 = null;
        }
        field2722++;
        return class407.method2437(8287, this.field2719);
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(B)Z")
    public final boolean method1183(byte arg0) {
        field2721++;
        if (arg0 != -79) {
            this.method1180((byte) 121);
        }
        return (this.field2719 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        if (arg0 != -1) {
            field2724 = -25;
        }
        field2717++;
        return (this.field2719 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
    public class188(int arg0, int arg1) {
        this.field2720 = arg1;
        this.field2719 = arg0;
    }
}
