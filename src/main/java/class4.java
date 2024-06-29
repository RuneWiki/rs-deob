import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class168 {

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lhe;")
    public static class19 field112;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Lig;")
    public static class9 field118;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method55(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 0) {
            field117 = -13;
        }
        field111++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class131.method913(true, var3) : var3;
        } else if (arg1 instanceof class76) {
            class76 var4 = (class76) arg1;
            return var4.method565((byte) 35);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method56(int arg0) {
        field116++;
        if (class252.field4406 > 0) {
            class40.method313((byte) 71);
            return;
        }
        class251.field4398 = class44.field727;
        class44.field727 = null;
        if (arg0 != 8364) {
            field113 = 58;
        }
        class90.method641((byte) 66, 40);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method57(int arg0, KeyEvent arg1) {
        field110++;
        int var2 = arg1.getKeyChar();
        if (arg0 <= 2) {
            method56(86);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
    public static final int method58(int arg0, int arg1, int arg2) {
        field114++;
        int var3 = arg0 >> 31 & arg1 + arg2;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static void method59(int arg0) {
        field118 = null;
        if (arg0 != 128) {
            method58(44, -121, 98);
        }
        field112 = null;
    }
}
