import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class497 extends class92 {

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Z")
    private boolean field6968 = false;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Lpp;")
    public static class464 field6964 = new class464(7, 6);

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "Z")
    public static boolean field6973;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
    public static void method2833(byte arg0) {
        if (arg0 > -89) {
            field6964 = null;
        }
        field6964 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V")
    public final void method671(boolean arg0, byte arg1) {
        if (arg1 != 107) {
            method2835(true, (class472) null, (byte) -28, (Canvas) null);
        }
        ++field6969;
        class628 var3 = super.field1635.method3613(68);
        if (var3 != null && arg0) {
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method3577(var3, true);
            super.field1635.method118(class133.field2150, (byte) -9);
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method3583(false, class609.field8665, class634.field9219);
            super.field1635.method97(false, true, arg1 + -99, class554.field7834, 2);
            super.field1635.method3570(class371.field5369, 0, (byte) 12);
            class516 var4 = super.field1635.method3595((byte) 40);
            var4.method2904(super.field1635.method3633(-27388), true);
            super.field1635.method3616(class338.field4855, (byte) 94);
            super.field1635.method3645(0, (byte) 91);
            this.field6968 = true;
        } else {
            super.field1635.method3570(class371.field5369, 0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public final void method669(byte arg0) {
        if (arg0 <= 55) {
            this.method669((byte) 103);
        }
        ++field6966;
        if (this.field6968) {
            super.field1635.method3645(1, (byte) 91);
            super.field1635.method118(class471.field6774, (byte) -120);
            super.field1635.method3583(false, class635.field9225, class635.field9225);
            super.field1635.method3601(-111, class104.field1753, 2);
            super.field1635.method3570(class477.field6813, 0, (byte) 126);
            super.field1635.method3627(-78);
            super.field1635.method3577((class96) null, true);
            super.field1635.method3645(0, (byte) 91);
            this.field6968 = false;
        } else {
            super.field1635.method3570(class477.field6813, 0, (byte) -119);
        }
        super.field1635.method3583(false, class635.field9225, class635.field9225);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Z")
    public final boolean method673(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field6967;
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILqv;)V")
    public final void method672(int arg0, int arg1, class96 arg2) {
        if (arg0 != 0) {
            this.method669((byte) 85);
        }
        ++field6963;
        super.field1635.method3577(arg2, true);
        super.field1635.method3600(arg0 ^ -118, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIII)V")
    public static final void method2834(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class222.field3350 && ~class409.field6071 <= ~arg4) {
            int var5 = class34.method306(class183.field2638, arg2, class268.field3911, (byte) 81);
            int var6 = class34.method306(class183.field2638, arg1, class268.field3911, (byte) 101);
            class57.method463(arg3, var5, var6, arg4, -1);
        }
        ++field6970;
        if (arg0 <= 12) {
            field6973 = false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lnd;)V")
    public class497(class632 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLn;BLjava/awt/Canvas;)Lqa;")
    public static final class167 method2835(boolean arg0, class472 arg1, byte arg2, Canvas arg3) {
        ++field6972;
        if (arg2 <= 96) {
            method2833((byte) -83);
        }
        return !arg0 ? new class73(arg3, arg1) : new class45(arg3, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)V")
    public final void method675(boolean arg0, int arg1, int arg2) {
        ++field6971;
        if (!arg0) {
            field6973 = true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
    public final void method676(boolean arg0, int arg1) {
        super.field1635.method3583(false, class635.field9225, class634.field9219);
        if (arg1 < -65) {
            ++field6965;
        }
    }
}
