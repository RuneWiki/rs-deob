import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class201 extends class139 {

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Ljava/lang/String;")
    public String field3230;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
    public static int[] field3220;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1474(int arg0, Component arg1) {
        arg1.removeMouseListener(class276.field4431);
        arg1.removeMouseMotionListener(class276.field4431);
        ++field3222;
        if (arg0 == 7558) {
            arg1.removeFocusListener(class276.field4431);
            class283.field4496 = 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public final void method1475(int arg0) {
        super.field2242 = Long.MIN_VALUE & super.field2242 | 500L + class197.method1454((byte) -104);
        class101.field1488.method1584(this, (byte) 115);
        ++field3218;
        if (arg0 != -743577184) {
            this.method1475(-50);
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)I")
    public final int method1476(int arg0) {
        if (arg0 != 128) {
            method1482(35, (byte) -121);
        }
        ++field3221;
        return (int) super.field4459;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public final void method1477(int arg0) {
        super.field2242 |= Long.MIN_VALUE;
        ++field3227;
        if ((long) arg0 == this.method1478(false)) {
            class171.field2758.method1584(this, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Z)J")
    public final long method1478(boolean arg0) {
        ++field3228;
        return arg0 ? -15L : super.field2242 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Lsk;")
    public static final class114 method1479(byte arg0) {
        ++field3223;
        try {
            return arg0 != 37 ? null : (class114) Class.forName("lh").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIILwg;Lwg;IIIIJ)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, class178 arg4, class178 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class156 var12 = new class156();
            var12.field2565 = arg10;
            var12.field2558 = arg1 * 128 + 64;
            var12.field2572 = arg2 * 128 + 64;
            var12.field2570 = arg3;
            var12.field2560 = arg4;
            var12.field2569 = arg5;
            var12.field2561 = arg6;
            var12.field2559 = arg7;
            var12.field2568 = arg8;
            var12.field2573 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class220.field3525[var13][arg1][arg2] == null) {
                    class220.field3525[var13][arg1][arg2] = new class286(var13, arg1, arg2);
                }
            }
            class220.field3525[arg0][arg1][arg2].field4532 = var12;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(Z)I")
    public final int method1481(boolean arg0) {
        ++field3225;
        if (!arg0) {
            this.field3230 = null;
        }
        return (int) (255L & super.field4459 >>> 32);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method1482(int arg0, byte arg1) {
        if (arg1 <= -9) {
            ++field3229;
            class213.field3406.method1548(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
    public static void method1483(int arg0) {
        int var1 = -53 % ((arg0 - -11) / 51);
        field3220 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
    public class201(int arg0, int arg1) {
        super.field4459 = (long) arg1 | (long) arg0 << 32;
    }
}
