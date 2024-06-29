import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class450 {

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Z")
    public boolean field6690 = true;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "C")
    private char field6694;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Ljava/lang/String;")
    public String field6691;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLfh;)V")
    public final void method2761(byte arg0, class194 arg1) {
        if (arg0 != -60) {
            this.field6691 = null;
        }
        field6688++;
        while (true) {
            int var3 = arg1.method1337((byte) 16);
            if (var3 == 0) {
                return;
            }
            this.method2763(5, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public static final void method2762(byte arg0) {
        field6689++;
        if (arg0 < 54) {
            method2765(-85, 50, -9, null, null);
        }
        class46.field733 = 0;
        class18.field204 = 0;
        class31.field378 = 0;
        class34.field410 = 0;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILfh;)V")
    private final void method2763(int arg0, int arg1, class194 arg2) {
        field6693++;
        if (arg1 == 1) {
            this.field6694 = class515.method3052((byte) -86, arg2.method1398(36));
        } else if (arg1 == 2) {
            this.field6692 = arg2.method1401(-6);
        } else if (arg1 == 4) {
            this.field6690 = false;
        } else if (arg1 == 5) {
            this.field6691 = arg2.method1347(-114);
        }
        if (arg0 != 5) {
            this.field6690 = true;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)Z")
    public final boolean method2764(boolean arg0) {
        field6687++;
        if (arg0) {
            return this.field6694 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIILem;Lem;)V")
    public static final void method2765(int arg0, int arg1, int arg2, class501 arg3, class501 arg4) {
        class281 var5 = class141.method1018(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4380 = arg3;
            var5.field4390 = arg4;
        }
    }
}
