import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class330 extends class134 {

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Lwf;")
    public static class137 field4451;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILjava/awt/Canvas;B)Lnca;", line = 4)
    public static final class753 method1956(int arg0, int arg1, Canvas arg2, byte arg3) {
        ++field4452;
        try {
            Class var4 = Class.forName("tf");
            class753 var5 = (class753) var4.newInstance();
            var5.method1772(arg0, arg1, 4095, arg2);
            if (arg3 >= -28) {
                field4458 = 90;
            }
            return var5;
        } catch (Throwable var7) {
            class393 var6 = new class393();
            var6.method1772(arg0, arg1, 4095, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)Z", line = 32)
    public final boolean method1957(int arg0) {
        ++field4454;
        if (!class555.method3148(false, super.field1712.field5503.method741((byte) 127))) {
            return false;
        } else {
            if (arg0 != -1) {
                method1959(78);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)V", line = 46)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        int var3 = 93 / ((-26 - arg0) / 41);
        ++field4456;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(ILkda;)V", line = 56)
    public class330(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 60)
    public final void method60(byte arg0) {
        if (arg0 < 118) {
            field4451 = null;
        }
        ++field4453;
        if (super.field1712.field5503.method744(true) && !class555.method3148(false, super.field1712.field5503.method741((byte) 120))) {
            super.field1708 = 0;
        }
        if (~super.field1708 > -1 || super.field1708 > 2) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)I", line = 79)
    public final int method58(int arg0) {
        ++field4457;
        return arg0 != 0 ? 77 : 0;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)I", line = 90)
    public final int method1958(byte arg0) {
        if (arg0 < 119) {
            return -112;
        } else {
            ++field4459;
            return super.field1708;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkda;)V", line = 101)
    public class330(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)V", line = 104)
    public static void method1959(int arg0) {
        field4451 = null;
        if (arg0 >= -50) {
            method1956(76, 110, (Canvas) null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(II)I", line = 116)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            this.method60((byte) -94);
        }
        ++field4455;
        return !class555.method3148(false, super.field1712.field5503.method741((byte) 125)) ? 3 : 1;
    }
}
