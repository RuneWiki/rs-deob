import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class707 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field9966 = 1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lln;")
    public static class472 field9965 = new class472(8, 0, 4, 1);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ltm;")
    public static class334 field9970 = new class334(68, 2);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lwe;")
    public static class357 field9971 = new class357();

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[I")
    public static int[] field9972 = new int[5];

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[I")
    public static int[] field9973 = new int[4096];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "C")
    public char field9967;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lofa;Z)V", line = 10)
    public final void method3920(class301 arg0, boolean arg1) {
        field9968++;
        while (true) {
            int var3 = arg0.method1987(-28);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field9967 = (char) 65525;
                    return;
                }
            }
            this.method3922(var3, (byte) -105, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 35)
    public static void method3921(byte arg0) {
        if (arg0 > -88) {
            method3921((byte) -100);
        }
        field9965 = null;
        field9973 = null;
        field9970 = null;
        field9971 = null;
        field9972 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLofa;)V", line = 49)
    private final void method3922(int arg0, byte arg1, class301 arg2) {
        if (arg1 > -72) {
            this.field9967 = '?';
        }
        field9969++;
        if (arg0 == 1) {
            this.field9967 = class232.method1610(-21630, arg2.method1984(4));
        } else if (arg0 == 2) {
            this.field9966 = 0;
            return;
        }
    }
}
