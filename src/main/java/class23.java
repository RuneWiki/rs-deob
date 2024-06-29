import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class121 {

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Leb;")
    public static class230 field439 = class68.method589(0, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
    public static boolean field447 = false;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "Leb;")
    public static class230 field451 = class68.method589(0, "(U1");

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "[I")
    public static int[] field450 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "S")
    public static short field443 = 32767;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Leb;")
    public class230 field436;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Leb;")
    public class230 field438;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[Leh;")
    public static class80[] field434;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static final void method246(boolean arg0) {
        class209.field3651.method1122(10);
        ++field435;
        class227.field3921.method1122(10);
        if (!arg0) {
            class15.field337.method1122(10);
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Lsh;")
    public final class203 method247(int arg0) {
        if (arg0 != 127) {
            return null;
        } else {
            ++field444;
            return class61.field1171[super.field2123];
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
    public static final byte[] method248(boolean arg0, boolean arg1, Object arg2) {
        ++field446;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class161.method1214(var3, true) : var3;
        } else if (arg2 instanceof class141) {
            class141 var4 = (class141) arg2;
            return var4.method1084(32470);
        } else if (!arg0) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
    public static final int method249(int arg0, byte arg1) {
        if (arg1 < 64) {
            field447 = false;
        }
        ++field449;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Leb;ZB)V")
    public static final void method250(class230 arg0, boolean arg1, byte arg2) {
        if (!arg1) {
            try {
                class61.field1174.getAppletContext().showDocument(arg0.method1632(class61.field1174.getCodeBase(), -112), "_top");
            } catch (Exception var4) {
            }
        } else {
            try {
                class61.field1174.getAppletContext().showDocument(arg0.method1632(class61.field1174.getCodeBase(), -118), "_blank");
            } catch (Exception var3) {
            }
        }
        if (arg2 > -6) {
            method248(true, true, (Object) null);
        }
        ++field441;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method251(int arg0) {
        field439 = null;
        field450 = null;
        if (arg0 < -59) {
            field451 = null;
            field434 = null;
        }
    }
}
