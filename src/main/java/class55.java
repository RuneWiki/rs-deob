import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class55 extends class126 {

    @OriginalMember(owner = "client!va", name = "s", descriptor = "S")
    public short field737;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "S")
    public short field742;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "B")
    public byte field736;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "S")
    public short field726;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "B")
    public byte field727;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Z")
    public boolean field730;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "S")
    public short field743;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Ljava/lang/String;")
    public static String field739 = "purple:";

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Lcr;")
    public static class189 field735 = new class189(64);

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lv;")
    public static class241 field744;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V", line = 11)
    public void method373(byte arg0) {
        if (arg0 >= -91) {
            field739 = null;
        }
        field732++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V", line = 26)
    public static final void method374(int arg0, byte arg1) {
        if (arg1 == 1) {
            class11.field167.method1142((byte) -82, arg0);
            field738++;
        }
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V", line = 37)
    public static void method375(int arg0) {
        field739 = null;
        field735 = null;
        field744 = null;
        if (arg0 != 0) {
            field744 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLlm;)V", line = 53)
    public static final void method376(boolean arg0, class347 arg1) {
        if (!arg0) {
            field733++;
            class117.field1651 = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V", line = 65)
    public static final void method377(int arg0, int arg1) {
        if (arg0 >= -112) {
            return;
        }
        field741++;
        class406.field6035 = arg1;
        class189 var2 = class242.field3238;
        synchronized (class242.field3238) {
            class242.field3238.method1141(256);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 92)
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field737 = (short) arg7;
        this.field742 = (short) arg5;
        this.field740 = (short) arg1;
        this.field729 = (short) arg2;
        this.field736 = arg9;
        this.field726 = (short) arg6;
        this.field727 = (byte) arg0;
        this.field730 = arg8;
        this.field743 = (short) arg4;
        this.field734 = (short) arg3;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)I")
    public abstract int method174(int arg0);
}
