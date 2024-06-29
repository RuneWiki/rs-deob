import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class53 extends class260 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lar;")
    public static class479 field641 = new class479();

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lri;")
    public static class74 field646 = new class74(10, -1);

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lwj;")
    public static class270 field648 = new class270(0, -2);

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Llt;")
    public static class475 field647;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 4)
    public static void method455(byte arg0) {
        field646 = null;
        field647 = null;
        field648 = null;
        field641 = null;
        int var1 = -83 % ((-arg0 - 26) / 59);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLrc;)V", line = 17)
    public static final void method456(byte arg0, class375 arg1) {
        field644++;
        arg1.field5496 = null;
        if (arg0 != 80) {
            field647 = null;
        }
        if (class272.field3758 < 20) {
            class227.field3233.method2454(-9946, arg1);
            class272.field3758++;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z", line = 48)
    public static final boolean method457(int arg0, int arg1) {
        class230.field3252 = true;
        field642++;
        if (arg1 != 0) {
            method456((byte) 87, null);
        }
        class28.field363 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILmg;IIIZ)V", line = 68)
    public static final void method458(int arg0, int arg1, class101 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class88.field1282 = 1;
        class12.field183 = arg2;
        class216.field3008 = arg4;
        field643++;
        class88.field1281 = arg0;
        class385.field5610 = arg6;
        class3.field19 = arg5;
        class449.field6616 = class121.field1817.method540(2) / arg1;
        if (arg3 >= -25) {
            field646 = null;
        }
        if (class449.field6616 < 1) {
            class449.field6616 = 1;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 90)
    public static final void method459(int arg0) {
        field645++;
        int var1 = class20.field269.method1708(class152.field2332, -123);
        if (var1 == 0) {
            class475.field6931 = null;
            class305.method1777((byte) 48, 0);
        } else if (var1 == 1) {
            class310.method1794((byte) 118, (byte) 0);
            class305.method1777((byte) 115, 512);
            if (class267.field3700 != null) {
                class502.method2947(-32177);
            }
        } else {
            class310.method1794((byte) 118, (byte) (class168.field2517 - 4 & 0xFF));
            class305.method1777((byte) 56, 2);
        }
        class33.field437 = class436.field6379;
        if (arg0 != 1) {
            method457(23, -14);
        }
    }
}
