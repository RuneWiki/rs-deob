import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class526 extends class702 {

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method3103(byte arg0, int arg1) {
        ++field7709;
        class197.field2381 = 1000000000L / (long) arg1;
        int var2 = -20 / ((arg0 - -57) / 63);
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lkga;)V", line = 14)
    public class526(class506 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)Z", line = 17)
    public final boolean method998(boolean arg0) {
        ++field7708;
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljf;II)V", line = 30)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        ++field7702;
        super.field9912.method2932(true, arg0);
        super.field9912.method2985(arg1, -26973);
        if (arg2 != 58) {
            this.method998(true);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)V", line = 42)
    public final void method1001(int arg0, int arg1, int arg2) {
        ++field7710;
        int var4 = -110 / ((arg1 - 55) / 36);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZZ)V", line = 57)
    public final void method1000(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field7704;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)V", line = 67)
    public final void method1005(boolean arg0, int arg1) {
        if (arg1 <= -102) {
            super.field9912.method2944(true, true);
            ++field7705;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 79)
    public static final void method3104(int arg0) {
        ++field7707;
        int[] var1 = new int[class65.field1021.field310];
        int var2 = arg0;
        for (int var3 = 0; ~class65.field1021.field310 < ~var3; ++var3) {
            class238 var5 = class65.field1021.method178(false, var3);
            if (~var5.field3202 <= -1 || ~var5.field3252 <= -1) {
                var1[var2++] = var3;
            }
        }
        class510.field7463 = new int[var2];
        for (int var4 = 0; var2 > var4; ++var4) {
            class510.field7463[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 111)
    public final void method1002(boolean arg0) {
        ++field7706;
        super.field9912.method2944(false, arg0);
    }
}
