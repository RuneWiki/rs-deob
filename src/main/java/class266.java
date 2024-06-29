import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class266 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field3615 = 8;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public int field3627 = 16777215;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lam;")
    public static class286 field3616;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Z")
    public boolean field3625;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBLtq;)V", line = 3)
    private final void method1481(int arg0, int arg1, byte arg2, class250 arg3) {
        field3622++;
        if (arg1 == 1) {
            this.field3615 = arg3.method1374(-2);
        } else if (arg1 == 2) {
            this.field3625 = true;
        } else if (arg1 == 3) {
            this.field3617 = arg3.method1366((byte) -118);
            this.field3619 = arg3.method1366((byte) -121);
            this.field3620 = arg3.method1366((byte) -74);
        } else if (arg1 == 4) {
            this.field3621 = arg3.method1350(31351);
        } else if (arg1 == 5) {
            this.field3618 = arg3.method1374(-2);
        } else if (arg1 == 6) {
            this.field3627 = arg3.method1372(-2);
        }
        if (arg2 < 19) {
            this.method1481(-123, -27, (byte) 80, (class250) null);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILtq;)V", line = 58)
    public final void method1482(int arg0, int arg1, class250 arg2) {
        while (true) {
            int var4 = arg2.method1350(31351);
            if (var4 == 0) {
                if (arg1 <= 42) {
                    field3616 = null;
                }
                field3624++;
                return;
            }
            this.method1481(arg0, var4, (byte) 95, arg2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 88)
    public static void method1483(int arg0) {
        if (arg0 == 2) {
            field3616 = null;
        }
    }
}
