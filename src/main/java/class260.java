import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class class260 {

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Llga;")
    public static class663 field3537 = new class663(8);

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
    public static boolean field3544;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Z")
    public final boolean method1589(byte arg0) {
        int var2 = 36 / ((23 - arg0) / 40);
        field3543++;
        return (this.field3535 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
    public final boolean method1590(int arg0) {
        field3534++;
        if (arg0 != 0) {
            this.method1593(-110);
        }
        return (this.field3535 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Z")
    public final boolean method1591(int arg0) {
        if (arg0 > -3) {
            return false;
        } else {
            field3540++;
            return (this.field3535 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1592(int arg0, String arg1) {
        field3539++;
        if (arg0 < 43) {
            return -43;
        }
        for (int var2 = 0; var2 < class357.field4745.length; var2++) {
            if (class357.field4745[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)Z")
    public final boolean method1593(int arg0) {
        field3533++;
        if (arg0 != 21945) {
            method1595((byte) -27);
        }
        return (this.field3535 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)V")
    public static final void method1594(byte arg0, int arg1) {
        class675.field9530 = arg1;
        if (arg0 >= -104) {
            method1592(111, null);
        }
        field3538++;
        class593.field8304 = 100;
        class657.field9137 = 3;
        class496.field6752 = -1;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        int var1 = -6 / ((91 - arg0) / 35);
        field3537 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLjava/awt/Canvas;Lfa;)Lr;")
    public static final class166 method1596(boolean arg0, Canvas arg1, class212 arg2) {
        if (arg0) {
            return null;
        } else {
            field3541++;
            return new class142(arg1, arg2);
        }
    }
}
