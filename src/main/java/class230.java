import java.awt.Canvas;
import java.awt.Point;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class230 extends InputStream {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[Llh;")
    public static class295[] field3659 = new class295[29];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    public static boolean field3658 = false;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lhc;")
    public static class235 field3661;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lad;")
    public static class259 field3654;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3651;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    public static int[] field3653;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILre;I)V")
    public static final void method1533(byte arg0, int arg1, class228 arg2, int arg3) {
        if (arg2.field3579 == 0) {
            arg2.field3532 = arg2.field3616;
        } else if (arg2.field3579 == 1) {
            arg2.field3532 = (arg1 - arg2.field3625) / 2 + arg2.field3616;
        } else if (arg2.field3579 == 2) {
            arg2.field3532 = arg1 - arg2.field3616 - arg2.field3625;
        } else if (arg2.field3579 == 3) {
            arg2.field3532 = arg2.field3616 * arg1 >> 14;
        } else if (arg2.field3579 == 4) {
            arg2.field3532 = (arg2.field3616 * arg1 >> 14) + (arg1 - arg2.field3625) / 2;
        } else {
            arg2.field3532 = arg1 - (arg2.field3616 * arg1 >> 14) - arg2.field3625;
        }
        field3652++;
        if (arg2.field3632 == 0) {
            arg2.field3577 = arg2.field3633;
        } else if (arg2.field3632 == 1) {
            arg2.field3577 = (arg3 - arg2.field3574) / 2 + arg2.field3633;
        } else if (arg2.field3632 == 2) {
            arg2.field3577 = arg3 - arg2.field3633 - arg2.field3574;
        } else if (arg2.field3632 == 3) {
            arg2.field3577 = arg2.field3633 * arg3 >> 14;
        } else if (arg2.field3632 == 4) {
            arg2.field3577 = (arg2.field3633 * arg3 >> 14) + (arg3 - arg2.field3574) / 2;
        } else {
            arg2.field3577 = arg3 - (arg2.field3633 * arg3 >> 14) - arg2.field3574;
        }
        if (arg0 < 15) {
            method1534(true);
        }
        if (!class170.field2647) {
            return;
        }
        if (client.method1059(arg2).field4362 == 0 && arg2.field3477 != 0) {
            return;
        }
        if (arg2.field3532 < 0) {
            arg2.field3532 = 0;
        } else if (arg1 < arg2.field3625 + arg2.field3532) {
            arg2.field3532 = arg1 - arg2.field3625;
        }
        if (arg2.field3577 < 0) {
            arg2.field3577 = 0;
            return;
        }
        if (arg3 < (arg2.field3577 + arg2.field3574)) {
            arg2.field3577 = arg3 - arg2.field3574;
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1534(boolean arg0) {
        field3662++;
        if (class183.field2844 != null) {
            class183.field2844.method555((byte) -43);
        }
        if (class222.field3412 != null) {
            class222.field3412.method555((byte) -43);
        }
        if (arg0) {
            field3654 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1535(int arg0) {
        field3656++;
        class28.field389.method1888(arg0 ^ 0x248D4C8A);
        if (arg0 != 613239950) {
            method1537(-44, 60);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1536(int arg0) {
        field3659 = null;
        field3661 = null;
        field3651 = null;
        field3653 = null;
        if (arg0 >= -122) {
            field3661 = null;
        }
        field3654 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method1537(int arg0, int arg1) {
        if (!class10.field171) {
            arg1 = -1;
        }
        field3660++;
        if (class38.field536 == arg1) {
            return;
        }
        if (arg0 != arg1) {
            class57 var2 = class138.method935((byte) 81, arg1);
            class276 var3 = var2.method434((byte) 127);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class179.field2788.method251(6263, field3651, new Point(var2.field940, var2.field939), var3.method1860(), var3.field2877, var3.field2869);
                class38.field536 = arg1;
            }
        }
        if (arg1 == -1 && class38.field536 != -1) {
            class179.field2788.method251(6263, field3651, new Point(), (int[]) null, -1, -1);
            class38.field536 = -1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "read", descriptor = "()I")
    public final int read() {
        class150.method1011((byte) 41, 30000L);
        field3657++;
        return -1;
    }
}
