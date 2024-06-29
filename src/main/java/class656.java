import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class656 extends class331 {

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "F")
    public static float field9024;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field9020;
        if (arg0 == -1959) {
            if (~super.field4202 != -1 && super.field4203.field591.method3604((byte) -127) != 1) {
                super.field4202 = 0;
            }
            if (super.field4202 < 0 || ~super.field4202 < -2) {
                super.field4202 = this.method226((byte) 13);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field9022;
        if (arg1 != 1) {
            return 97;
        } else {
            return ~arg0 != -1 && super.field4203.field591.method3604((byte) -121) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)I")
    public final int method3565(byte arg0) {
        if (arg0 > -119) {
            field9024 = 0.8592762F;
        }
        ++field9025;
        return super.field4202;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lts;)V")
    public class656(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field9021;
        return arg0 != 13 ? 68 : 1;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(ILts;)V")
    public class656(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(B)Z")
    public final boolean method3566(byte arg0) {
        if (arg0 <= 103) {
            field9024 = -0.9373268F;
        }
        ++field9023;
        return true;
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        if (arg0 < 113) {
            field9024 = 0.0011094074F;
        }
        super.field4202 = arg1;
        ++field9019;
    }
}
