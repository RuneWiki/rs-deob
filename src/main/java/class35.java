import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class35 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Ltl;")
    public class255 field529;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field530 = "glow3:";

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Llm;")
    public static class150 field531 = new class150(64);

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljm;")
    public static class126 field534 = new class126(5000);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    public static int[] field537 = new int[100];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lui;")
    public static class286 field536;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lnh;")
    public static class305 field532;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lnh;")
    public static class305 field535;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILrl;IB)V")
    public static final void method237(int arg0, class310 arg1, int arg2, byte arg3) {
        field524++;
        if (arg3 <= 18) {
            field530 = null;
        }
        if (arg1.field4133 == arg2 && arg2 != -1) {
            class195 var4 = class280.method1815(arg2, 118);
            int var5 = var4.field2967;
            if (var5 == 1) {
                arg1.field4146 = 0;
                arg1.field4107 = arg0;
                arg1.field4099 = 0;
                arg1.field4072 = 1;
                arg1.field4112 = 0;
                class181.method1152(false, arg1.field4081, arg1.field4099, arg1.field4140, false, var4);
            }
            if (var5 == 2) {
                arg1.field4146 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field4133 == -1 || class280.method1815(arg2, -63).field2992 >= class280.method1815(arg1.field4133, 89).field2992) {
            arg1.field4072 = 1;
            arg1.field4046 = arg1.field4064;
            arg1.field4112 = 0;
            arg1.field4146 = 0;
            arg1.field4099 = 0;
            arg1.field4133 = arg2;
            arg1.field4107 = arg0;
            if (arg1.field4133 == -1) {
                return;
            }
            class181.method1152(false, arg1.field4081, arg1.field4099, arg1.field4140, false, class280.method1815(arg1.field4133, -29));
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method238(int arg0) {
        field534 = null;
        field532 = null;
        if (arg0 > -39) {
            return;
        }
        field535 = null;
        field530 = null;
        field537 = null;
        field531 = null;
        field536 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3) {
        class255 var5 = class154.method965(arg0, 0);
        this.field525 = arg2;
        this.field526 = arg3;
        this.field528 = arg1;
        if (var5.field4014 == -1) {
            this.field529 = var5;
        } else {
            this.field529 = class154.method965(var5.field4014, 0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ltl;III)V")
    public class35(class255 arg0, int arg1, int arg2, int arg3) {
        this.field529 = arg0;
        this.field526 = arg3;
        this.field528 = arg1;
        this.field525 = arg2;
    }
}
