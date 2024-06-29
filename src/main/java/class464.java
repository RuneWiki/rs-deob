import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class464 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    private int field6530 = 0;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lwb;")
    private class45 field6537;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    public static boolean field6538 = true;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lsd;")
    public static class74 field6534 = new class74(24, -1);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[Lhu;")
    public static class207[] field6542 = new class207[14];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lpt;")
    private class147 field6535;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lpt;")
    public final class147 method2728(int arg0) {
        field6533++;
        if (~this.field6530 < arg0 && this.field6537.field571[this.field6530 - 1] != this.field6535) {
            class147 var2 = this.field6535;
            this.field6535 = var2.field1779;
            return var2;
        }
        while (this.field6530 < this.field6537.field582) {
            class147 var3 = this.field6537.field571[this.field6530++].field1779;
            if (this.field6537.field571[this.field6530 - 1] != var3) {
                this.field6535 = var3.field1779;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLoj;)V")
    public static final void method2729(byte arg0, class280 arg1) {
        field6532++;
        if (class371.field5311) {
            class67.method346(true, arg1);
        } else {
            class29.method152((byte) 125, arg1);
        }
        if (arg0 != -22) {
            method2733(98);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public static final void method2730(int arg0) {
        field6540++;
        if (class249.field3503.length() == 0) {
            return;
        }
        class486.method2871(true, "--> " + class249.field3503);
        class172.method848(class249.field3503, (byte) 1, false);
        class140.field1690 = 0;
        if (arg0 != -19326) {
            method2729((byte) 52, (class280) null);
        }
        class249.field3503 = "";
        class87.field1065 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Lpt;")
    public final class147 method2731(int arg0) {
        this.field6530 = arg0;
        field6539++;
        return this.method2728(-1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBIII)V")
    public static final void method2732(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 110) {
            field6542 = null;
        }
        field6536++;
        class89 var5 = class146.method695(8, arg3, (byte) -13);
        var5.method449(true);
        var5.field1106 = arg2;
        var5.field1100 = arg0;
        var5.field1111 = arg4;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
    public static void method2733(int arg0) {
        field6534 = null;
        field6542 = null;
        if (arg0 != 0) {
            field6534 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lwb;)V")
    public class464(class45 arg0) {
        this.field6537 = arg0;
    }
}
