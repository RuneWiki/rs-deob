import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class640 extends class212 {

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Ljava/lang/String;")
    public static String field8796 = null;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "J")
    public static long field8801;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "Lin;")
    public static class91 field8794;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)I", line = 8)
    public final int method417(int arg0, int arg1) {
        ++field8802;
        if (arg0 != 3) {
            return 121;
        } else {
            return !class362.method2313(7351, super.field3004.field4468.method1099(-32350)) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)I", line = 28)
    public final int method3631(int arg0) {
        ++field8790;
        if (arg0 != -32350) {
            this.method417(80, -99);
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V", line = 39)
    public final void method419(int arg0, int arg1) {
        int var3 = -19 % ((82 - arg0) / 35);
        super.field3006 = arg1;
        ++field8793;
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V", line = 50)
    public static final void method3632(int arg0) {
        ++field8798;
        class7 var1 = (class7) class581.field7954.method1469(0);
        if (arg0 <= 4) {
            field8796 = null;
        }
        while (var1 != null) {
            class624.method3561((byte) 108, var1.field52);
            var1 = (class7) class581.field7954.method1467(0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 67)
    public static void method3633(byte arg0) {
        int var1 = -86 / ((arg0 - 13) / 45);
        field8796 = null;
        field8794 = null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ldh;)V", line = 78)
    public class640(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V", line = 83)
    public final void method418(boolean arg0) {
        if (arg0) {
            this.method418(false);
        }
        ++field8792;
        if (super.field3004.field4468.method1100((byte) -119) && !class362.method2313(7351, super.field3004.field4468.method1099(-32350))) {
            super.field3006 = 0;
        }
        if (super.field3006 < 0 || ~super.field3006 < -2) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILdh;)V", line = 101)
    public class640(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "f", descriptor = "(I)Z", line = 104)
    public final boolean method3634(int arg0) {
        if (arg0 < 85) {
            method3633((byte) 116);
        }
        ++field8791;
        return class362.method2313(7351, super.field3004.field4468.method1099(-32350));
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I", line = 121)
    public final int method422(int arg0) {
        ++field8800;
        if (arg0 != 20014) {
            field8795 = -58;
        }
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V", line = 134)
    public static final void method3635(byte arg0, int arg1, int arg2) {
        ++field8797;
        if (arg0 == -8) {
            if (class722.method4007(arg1, (byte) 84)) {
                class98.method914(class396.field5798[arg1], arg2, 119);
            }
        }
    }
}
