import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class467 {

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Z")
    public boolean field6594 = true;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
    public static int[] field6586 = new int[14];

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field6588 = 0;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field6593 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lwf;")
    public static class79 field6585 = new class79(60, -1);

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "C")
    private char field6581;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public int field6579;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Lmu;")
    public static class180 field6582;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/lang/String;")
    public String field6589;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
    public final boolean method2745(int arg0) {
        field6578++;
        if (arg0 >= -12) {
            return true;
        } else {
            return this.field6581 == 's';
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lrp;II)V")
    private final void method2746(class276 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6581 = class313.method1930(0, arg0.method1715((byte) -92));
        } else if (arg2 == 2) {
            this.field6579 = arg0.method1688(20402);
        } else if (arg2 == 4) {
            this.field6594 = false;
        } else if (arg2 == 5) {
            this.field6589 = arg0.method1750(93);
        }
        field6592++;
        int var4 = -81 / ((-arg1 - 21) / 57);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
    public static final void method2747(int arg0, byte arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field6591++;
        class437.field6080 = arg0;
        if (arg1 != 56) {
            method2750(-19, -117, 105);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lnp;III)V")
    public static final void method2748(class313 arg0, int arg1, int arg2, int arg3) {
        class286.field4169 = new class450[arg1][arg2];
        field6590++;
        class135.field1783 = arg0;
        if (class313.field4423 != null) {
            class305.field4340 = class24.method170(class313.field4423[4], class313.field4423[1], class313.field4423[2], class313.field4423[0], class313.field4423[3], (byte) 35, class313.field4423[5]);
        }
        class266.field3894 = new class450();
        class325.method2063((byte) 112);
        if (arg3 != -6219) {
            field6588 = 67;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static void method2749(boolean arg0) {
        if (arg0) {
            field6593 = -120;
        }
        field6586 = null;
        field6585 = null;
        field6582 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
    public static final void method2750(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1078 != null) {
            var3.field1078 = null;
        }
        if (var3.field1082 != null) {
            var3.field1082 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILrp;)V")
    public final void method2751(int arg0, class276 arg1) {
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                field6583++;
                if (arg0 < 35) {
                    field6588 = -41;
                    return;
                }
                return;
            }
            this.method2746(arg1, 112, var3);
        }
    }
}
