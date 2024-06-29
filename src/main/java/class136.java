import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class136 extends class340 implements Runnable {

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public int field1762 = -1;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
    private boolean field1764 = true;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lwg;")
    private class415 field1756;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Luc;")
    public static class51 field1761 = new class51(200);

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field1769 = 100;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Luc;")
    public static class51 field1768 = new class51(64);

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lcm;")
    public static class368 field1766;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lcm;")
    public static class368 field1767;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 3)
    public final void method960(int arg0) {
        field1759++;
        (new Thread(this, "a")).start();
        if (arg0 != 100) {
            field1770 = 24;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 17)
    public final void method961(boolean arg0) {
        this.field1764 = arg0;
        field1760++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)B", line = 25)
    public static final byte method962(int arg0, int arg1, int arg2) {
        if (arg2 <= 13) {
            method963(-14, -108);
        }
        field1755++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 49)
    public static final void method963(int arg0, int arg1) {
        field1763++;
        class222.field3067 = -1;
        if (arg0 == 37) {
            class200.field2769 = 3.0F;
        } else if (arg0 == 50) {
            class200.field2769 = 4.0F;
        } else if (arg0 == 75) {
            class200.field2769 = 6.0F;
        } else if (arg0 == 100) {
            class200.field2769 = 8.0F;
        } else if (arg0 == 200) {
            class200.field2769 = 16.0F;
        }
        class222.field3067 = -1;
        if (arg1 != -3809) {
            method963(-65, -65);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 82)
    public static void method964(byte arg0) {
        field1767 = null;
        field1768 = null;
        if (arg0 > 61) {
            field1766 = null;
            field1761 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        field1765++;
        while (this.field1764) {
            this.field1756.method2622(this, false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lwg;)V", line = 163)
    public class136(class415 arg0) {
        this.field1756 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;)V", line = 120)
    public static final void method965(int arg0, String arg1) {
        field1758++;
        if (arg0 < -113 && class43.field637 != null) {
            class122.field1574++;
            class140.field1797.method1833(-20379, 46);
            class140.field1797.method2204(class9.method61((byte) -117, arg1), 8);
            class140.field1797.method2214(arg1, -72);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnq;", line = 139)
    public static final class125 method966(Throwable arg0, String arg1) {
        field1754++;
        class125 var2;
        if ((arg0 instanceof class125)) {
            var2 = (class125) arg0;
            var2.field1624 = var2.field1624 + ' ' + arg1;
        } else {
            var2 = new class125(arg0, arg1);
        }
        return var2;
    }
}
