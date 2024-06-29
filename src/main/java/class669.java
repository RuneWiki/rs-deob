import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class669 extends class610 {

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method258(int arg0, int arg1, byte arg2) {
        ++field9442;
        if (arg2 != 70) {
            method3709(112);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)Lhd;", line = 13)
    public static final class679 method3708(int arg0, int arg1, int arg2) {
        ++field9437;
        class679 var3 = (class679) class594.field8264.method2061(arg2 + -1403066233, (long) arg1 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class679(arg0, arg1);
            class594.field8264.method2063(var3.field7311, 1, var3);
        }
        return arg2 != 1403048928 ? null : var3;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 34)
    public static final void method3709(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class459.field6496[var1] = false;
        }
        ++field9439;
        class24.field326 = -1;
        if (arg0 > 104) {
            class648.field9190 = 0;
            class170.field2556 = class117.field1563;
            class305.field4488 = class628.field8762;
            class1.field9 = class591.field8245;
            class292.field4398 = -1;
            class17.field247 = class239.field3440;
            class670.field9445 = 5;
            class576.field7745 = 0;
            class429.field6022 = class172.field2572;
            class274.field3871 = class492.field6794;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 64)
    public final void method257(boolean arg0, int arg1) {
        ++field9440;
        if (arg1 < -19) {
            super.field8473.method1751(true, 110);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZ)V", line = 75)
    public final void method254(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field9438;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;II)V", line = 85)
    public static final void method3710(String arg0, String arg1, String arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg4 < -79) {
            ++field9434;
            class319 var9 = class130.field1786[99];
            for (int var10 = 99; var10 > 0; --var10) {
                class130.field1786[var10] = class130.field1786[var10 + -1];
            }
            if (var9 == null) {
                var9 = new class319(arg3, arg8, arg6, arg2, arg0, arg5, arg7, arg1);
            } else {
                var9.method1950(arg7, arg5, arg8, arg2, arg6, arg0, 15954, arg3, arg1);
            }
            ++class85.field1170;
            class130.field1786[0] = var9;
            class23.field317 = class93.field1231;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILit;)V", line = 115)
    public final void method255(int arg0, int arg1, class591 arg2) {
        if (arg0 == 256) {
            ++field9436;
            super.field8473.method1804(false, arg2);
            super.field8473.method1801(arg1, 34166);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z", line = 128)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            field9441 = 52;
        }
        ++field9433;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 140)
    public final void method252(int arg0) {
        if (arg0 != 31130) {
            this.method257(true, -13);
        }
        super.field8473.method1751(false, arg0 ^ 31204);
        ++field9435;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Len;)V", line = 153)
    public class669(class289 arg0) {
        super(arg0);
    }
}
