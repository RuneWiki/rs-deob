import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class45 extends class86 {

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public int field679 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field680 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public int field683 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public int field682 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public int field684 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
    public int field687 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public int field690 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public int field691 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "Lqs;")
    public class410 field689;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field686 = -1;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lqs;)V", line = 79)
    public class45(class410 arg0) {
        this.field689 = arg0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZLjava/lang/String;)I", line = 20)
    public static final int method348(int arg0, boolean arg1, String arg2) {
        field681++;
        return arg1 ? class206.method1271(arg0, arg2, true, 3869) : 24;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z", line = 32)
    public final boolean method349(int arg0, int arg1, int arg2) {
        field685++;
        if (this.field687 <= arg1 && this.field691 >= arg1 && this.field680 <= arg0 && this.field690 >= arg0) {
            return true;
        } else if (arg1 >= this.field679 && arg1 <= this.field683 && arg0 >= this.field682 && arg0 <= this.field684) {
            return true;
        } else {
            return arg2 != -24270;
        }
    }
}
