import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class534 extends class154 {

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lbu;")
    public static class21 field7711 = new class21(38, 20);

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "J")
    public static long field7712;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FI)V")
    public final void method1061(float arg0, int arg1) {
        ++field7714;
        if (arg1 > 13) {
            super.field2174 = arg0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIB)V")
    public final void method1053(int arg0, int arg1, int arg2, byte arg3) {
        super.field2181 = arg0;
        ++field7713;
        super.field2175 = arg2;
        if (arg3 != 122) {
            this.method1061(-0.33796212F, -5);
        }
        super.field2191 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
    public static void method3219(byte arg0) {
        if (arg0 <= 46) {
            field7712 = 94L;
        }
        field7711 = null;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
    public static final void method3220(byte arg0) {
        class514.field7278 = 0;
        ++field7715;
        int var1 = 0;
        if (arg0 != -17) {
            method3219((byte) 66);
        }
        while (~var1 > -2049) {
            class85.field932[var1] = null;
            class256.field3766[var1] = 1;
            class451.field6312[var1] = null;
            ++var1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIF)V")
    public class534(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
