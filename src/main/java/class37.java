import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 extends class504 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Leb;")
    public static class584 field558 = new class584();

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field563 = -1;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILjava/lang/String;Z)V")
    public static final void method289(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
        class476.method2671(arg1, arg2, false, null, (byte) -60, arg3, arg4);
        field557++;
        if (arg0 != 0) {
            field558 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        if (arg0 > -5) {
            field560 = -108;
        }
        field558 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field561++;
        if (~(class477.field6362[0][arg2][arg1] & 0x2) != arg3) {
            return true;
        } else if ((class477.field6362[arg4][arg2][arg1] & 0x10) == 0) {
            return arg0 == class304.method1839(2, arg4, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILbi;)V")
    public static final void method292(int arg0, class449 arg1) {
        field562++;
        if (arg0 != 16) {
            field560 = -34;
        }
        class688.field9680 = arg1.method2523("p11_full", (byte) 55);
        class389.field5148 = arg1.method2523("p12_full", (byte) 56);
        class326.field4505 = arg1.method2523("b12_full", (byte) 117);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILvj;I)V")
    public static final void method293(int arg0, class411 arg1, int arg2) {
        field559++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field5548 > class642.field8626) {
            class373.method2197(false, arg1);
        } else if (arg1.field5610 >= class642.field8626) {
            class681.method3801(true, arg1);
        } else {
            class371.method2185(true, false, arg1);
            var3 = class2.field14;
            var4 = class540.field7119;
        }
        if (arg1.field8620 < 512 || arg1.field8612 < 512 || ((class34.field530 - 1) * 512) <= arg1.field8620 || class34.field531 * 512 - 512 <= arg1.field8612) {
            arg1.field5576 = null;
            var3 = -1;
            arg1.field5610 = 0;
            arg1.field5548 = 0;
            arg1.field5575 = -1;
            arg1.field5631 = -1;
            arg1.field5602 = -1;
            var4 = 0;
            arg1.field8620 = arg1.field5643[0] * 512 + (arg1.method2317((byte) 40) * 256);
            arg1.field8612 = arg1.field5649[0] * 512 + arg1.method2317((byte) 40) * 256;
            arg1.method2357(-1);
        }
        if (class199.field2897 == arg1 && (arg1.field8620 < 6144 || arg1.field8612 < 6144 || (class34.field530 - 12) * 512 <= arg1.field8620 || arg1.field8612 >= (class34.field531 * 512 - 6144))) {
            var3 = -1;
            arg1.field5631 = -1;
            arg1.field5610 = 0;
            var4 = 0;
            arg1.field5576 = null;
            arg1.field5548 = 0;
            arg1.field5575 = -1;
            arg1.field5602 = -1;
            arg1.field8620 = arg1.field5643[0] * 512 + (arg1.method2317((byte) 40) * 256);
            arg1.field8612 = arg1.field5649[0] * 512 + (arg1.method2317((byte) 40) * 256);
            arg1.method2357(-1);
        }
        int var5 = class402.method2304(arg1, (byte) 82);
        class677.method3785(var4, 115, arg1, var3, var5);
        if (arg2 <= 115) {
            field558 = null;
        }
        class36.method281(arg1, var3, 5255);
        class317.method1889(arg1, -1);
    }
}
