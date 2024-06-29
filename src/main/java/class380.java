import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class380 extends class535 {

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Lqp;")
    public static class586 field5564 = new class586(40, 6);

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field5565 = 0;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class380(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V", line = 11)
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            this.method93(-74, 59, -19, -115);
        }
        super.field7928 = arg3;
        ++field5563;
        super.field7912 = arg2;
        super.field7919 = arg1;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BI)V", line = 26)
    public static final void method2304(byte arg0, int arg1) {
        if (class22.field197 == null) {
            class22.field197 = new byte[4][class35.field399][class382.field5586];
        }
        ++field5561;
        int var2 = 0;
        int var3 = -1 % ((31 - arg1) / 60);
        while (var2 < 4) {
            for (int var4 = 0; class35.field399 > var4; ++var4) {
                for (int var5 = 0; ~class382.field5586 < ~var5; ++var5) {
                    class22.field197[var2][var4][var5] = arg0;
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)V", line = 61)
    public static void method2305(byte arg0) {
        field5564 = null;
        if (arg0 <= 74) {
            field5564 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IF)V", line = 74)
    public final void method94(int arg0, float arg1) {
        super.field7927 = arg1;
        ++field5562;
        if (arg0 > -8) {
            method2304((byte) 127, 22);
        }
    }
}
