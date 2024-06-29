import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class231 extends class683 {

    @OriginalMember(owner = "client!cca", name = "cb", descriptor = "Llca;")
    public class603 field3010;

    @OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!cca", name = "Z", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!cca", name = "bb", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!cca", name = "db", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lmq;)V")
    public class231(class475 arg0) {
        super(arg0);
        this.field3010 = new class603(arg0);
        super.field9329 = new class330(super.field9308);
        super.field9348 = new class330(super.field9308);
        super.field9339 = new class330(super.field9308);
        super.field9325 = new class330(super.field9308);
        super.field9333 = new class330(super.field9308);
        super.field9318 = new class330(super.field9308);
        super.field9345 = new class330(super.field9308);
        super.field9343 = new class330(super.field9308);
        super.field9313 = new class330(super.field9308);
        super.field9346 = new class330(super.field9308);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIB)V")
    public static final void method1397(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3007;
        if (arg2 > arg3) {
            for (int var5 = arg3; var5 < arg2; ++var5) {
                class30.field364[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg2; ~arg3 < ~var6; ++var6) {
                class30.field364[var6][arg0] = arg1;
            }
        }
        if (arg4 > -16) {
            method1398(27, 105, 100);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)I")
    public static final int method1398(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        ++field3011;
        if (arg0 != 0) {
            method1397(69, 82, 6, 57, (byte) 84);
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public final void method1399(int arg0) {
        this.field3010 = new class603((class475) super.field9308);
        if (arg0 != 10) {
            this.field3010 = null;
        }
        ++field3009;
    }
}
