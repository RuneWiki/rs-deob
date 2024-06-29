import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class5 {

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public int field56 = 0;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lhj;")
    public static class69 field54 = class181.method1318(")1p", (byte) -121);

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Lhj;")
    public static class69 field59 = class181.method1318("Lade Konfiguration )2 ", (byte) -126);

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
    public static final boolean method36(int arg0, int arg1, int arg2) {
        int var3 = 69 % ((25 - arg1) / 61);
        field57++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static void method37(int arg0) {
        if (arg0 != 2) {
            method37(63);
        }
        field54 = null;
        field59 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BII)Lpi;")
    public static final class135 method38(byte arg0, int arg1, int arg2) {
        field52++;
        class135 var3 = (class135) class168.field3092.method769(true, (long) arg1 << 32 | (long) arg2);
        if (arg0 < 94) {
            field58 = -2;
        }
        if (var3 == null) {
            var3 = new class135(arg1, arg2);
            class168.field3092.method761(var3.field1685, 0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lfh;II)V")
    private final void method39(class128 arg0, int arg1, int arg2) {
        int var4 = 79 / ((-arg2 - 6) / 58);
        field55++;
        if (arg1 == 2) {
            this.field56 = arg0.method912(83);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lfh;I)V")
    public final void method40(class128 arg0, int arg1) {
        field60++;
        while (true) {
            int var3 = arg0.method937(false);
            if (var3 == 0) {
                if (arg1 == -29834) {
                    return;
                } else {
                    field59 = null;
                    return;
                }
            }
            this.method39(arg0, var3, 124);
        }
    }
}
