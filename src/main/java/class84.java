import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class84 extends class457 {

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "Lvv;")
    public static class313 field1464 = new class313(32, -1);

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Lqm;")
    public static class331 field1467;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V", line = 6)
    public final void method334(int arg0, int arg1, int arg2) {
        ++field1460;
        if (arg2 <= 1) {
            this.field1461 = 104;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZ)V", line = 17)
    public final void method331(int arg0, int arg1, boolean arg2) {
        ++field1465;
        int var4 = this.field1469 * arg1 >> 12;
        if (arg2) {
            int var5 = this.field1463 * arg1 >> 12;
            int var6 = this.field1462 * arg0 >> 12;
            int var7 = this.field1461 * arg0 >> 12;
            class437.method2645(super.field6801, var7, (byte) -92, var6, var4, var5);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lia;I)Ltr;", line = 38)
    public static final class84 method605(class23 arg0, int arg1) {
        if (arg1 < 118) {
            return null;
        } else {
            ++field1468;
            return new class84(arg0.method170(492756037), arg0.method170(492756037), arg0.method170(492756037), arg0.method170(492756037), arg0.method181(98), arg0.method126((byte) -107));
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIII)V", line = 51)
    private class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1462 = arg1;
        this.field1461 = arg3;
        this.field1469 = arg0;
        this.field1463 = arg2;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V", line = 68)
    public static void method606(int arg0) {
        field1467 = null;
        if (arg0 != -25390) {
            field1464 = null;
        }
        field1464 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)V", line = 79)
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field1466;
        if (arg0) {
            method606(79);
        }
    }
}
