import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class397 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field5550 = 8;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public int field5560 = 16777215;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lon;")
    public static class35 field5559 = new class35(64);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field5557;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Z")
    public boolean field5553;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 5)
    public static void method2439(int arg0) {
        field5559 = null;
        if (arg0 >= -69) {
            method2440(99, (byte) -128, -15, (class362) null, 22, -38, 6);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBILsb;III)V", line = 15)
    public static final void method2440(int arg0, byte arg1, int arg2, class362 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 31) {
            field5559 = null;
        }
        field5554++;
        class416.method2577(arg3.field3167, 7, arg0, arg3.field3176, arg4, arg5, 0, arg6, arg2);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLap;I)V", line = 26)
    public final void method2441(byte arg0, class289 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1861((byte) -72);
            if (var4 == 0) {
                field5555++;
                if (arg0 != 69) {
                    this.field5557 = 63;
                    return;
                }
                return;
            }
            this.method2442(arg1, -73, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lap;III)V", line = 49)
    private final void method2442(class289 arg0, int arg1, int arg2, int arg3) {
        field5551++;
        if (arg2 == 1) {
            this.field5550 = arg0.method1853(117);
        } else if (arg2 == 2) {
            this.field5553 = true;
        } else if (arg2 == 3) {
            this.field5561 = arg0.method1833(62);
            this.field5557 = arg0.method1833(88);
            this.field5552 = arg0.method1833(72);
        } else if (arg2 == 4) {
            this.field5558 = arg0.method1861((byte) -72);
        } else if (arg2 == 5) {
            this.field5556 = arg0.method1853(-27);
        } else if (arg2 == 6) {
            this.field5560 = arg0.method1880((byte) -96);
        }
        int var5 = 22 % ((56 - arg1) / 45);
    }
}
