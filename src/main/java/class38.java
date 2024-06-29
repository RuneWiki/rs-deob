import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class38 extends class331 {

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "[Ltw;")
    public static class247[] field559 = new class247[1024];

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "D")
    public static double field566;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "Lbe;")
    public static class196 field563;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field564;

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lts;)V")
    public class38(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        if (arg1 != 1) {
            return -69;
        } else {
            ++field560;
            return 1;
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(B)I")
    public final int method329(byte arg0) {
        ++field567;
        if (arg0 > -119) {
            this.method329((byte) -124);
        }
        return super.field4202;
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            this.method226((byte) -42);
        }
        ++field568;
        return 2;
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(II)Lga;")
    public static final class70 method330(int arg0, int arg1) {
        ++field562;
        class70[] var2 = class672.method3624(false);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class70 var4 = var2[var3];
            if (var4.field948 == arg0) {
                return var4;
            }
        }
        if (arg1 < 77) {
            field564 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        if (arg0 > 113) {
            super.field4202 = arg1;
            ++field561;
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(ILts;)V")
    public class38(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field565;
        if (arg0 != -1959) {
            field566 = 0.029733607252073066D;
        }
        if (super.field4203.field634.method2976((byte) -125) && ~super.field4202 == -3) {
            super.field4202 = 1;
        }
        if (~super.field4202 > -1 || super.field4202 > 2) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(Z)V")
    public static void method331(boolean arg0) {
        field563 = null;
        field559 = null;
        field564 = null;
        if (!arg0) {
            method331(false);
        }
    }
}
