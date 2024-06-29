import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class226 {

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lwa;")
    public static class281 field3589 = new class281();

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lgm;")
    public class226 field3587;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lgm;")
    public class226 field3588;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Lfa;")
    public static class273 field3590;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lbe;")
    public static class30 field3583;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[[S")
    public static short[][] field3581;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBIII)V")
    public static final void method1571(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3584++;
        if (arg1 != 64) {
            method1572(-65);
        }
        if (arg2 >= class63.field941 && class75.field1180 >= arg2) {
            int var5 = class245.method1720(class53.field711, -109, arg3, class87.field1356);
            int var6 = class245.method1720(class53.field711, arg1 ^ 0xFFFFFF8C, arg0, class87.field1356);
            class103.method669(arg1 - 48, var5, arg4, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)I")
    public static final int method1572(int arg0) {
        field3585++;
        if (arg0 != 12283) {
            method1571(-46, (byte) -128, 111, -52, 119);
        }
        if (class175.field2736) {
            return 0;
        } else if (class165.method1108(arg0 - 12283)) {
            return class208.field3342 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLfa;)V")
    public static final void method1573(byte arg0, class273 arg1) {
        field3586++;
        int var2 = -29 % ((arg0 + 32) / 47);
        class100.field1515 = arg1.method1895("titlebg", false);
        class127.field1960 = arg1.method1895("logo", false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public final void method1574(byte arg0) {
        field3582++;
        if (this.field3587 == null) {
            return;
        }
        this.field3587.field3588 = this.field3588;
        this.field3588.field3587 = this.field3587;
        this.field3587 = null;
        if (arg0 > 103) {
            this.field3588 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static void method1575(int arg0) {
        field3589 = null;
        if (arg0 == 2) {
            field3583 = null;
            field3590 = null;
            field3581 = null;
        }
    }
}
