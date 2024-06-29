import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class248 extends class117 {

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    private int field4376;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Z")
    public static boolean field4379 = false;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
    public static final void method1703(int arg0, int arg1, int arg2) {
        ++field4378;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        --arg0;
        int var4 = class197.field3552[arg0];
        int var5 = class96.field1816[arg0];
        if (arg1 == 0) {
            ++class100.field1929;
            class191.field3499.method75(82, 120);
            class191.field3499.method655(0, var3 + 3 + var3);
        }
        if (~arg1 == -2) {
            class191.field3499.method75(111, 51);
            class191.field3499.method655(arg2 + -3, var3 + var3 + 17);
            ++class152.field2856;
        }
        if (~arg1 == -3) {
            class191.field3499.method75(246, 39);
            class191.field3499.method655(0, var3 + var3 + 3);
            ++class100.field1938;
        }
        class191.field3499.method655(arg2 ^ arg2, !class217.field3942[82] ? 0 : 1);
        class191.field3499.method616(-8618, class257.field4500 + var5);
        class191.field3499.method634(var4 - -class62.field1035, arg2 ^ -68);
        class265.field4605 = class197.field3552[0];
        class213.field3886 = class96.field1816[0];
        for (int var6 = 1; ~var3 < ~var6; ++var6) {
            --arg0;
            class191.field3499.method627(124, class197.field3552[arg0] - var4);
            class191.field3499.method656(class96.field1816[arg0] - var5, 26754);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    private class248(int arg0) {
        super(0, true);
        this.field4376 = 4096;
        this.field4376 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            this.method60(-95, 12, (class81) null);
        }
        if (~arg1 == -1) {
            this.field4376 = (arg2.method622(true) << 12) / 255;
        }
        ++field4377;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            this.method61(-43, 15);
        }
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            class241.method1665(var3, 0, class143.field2702, this.field4376);
        }
        ++field4381;
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    public static final void method1704(byte arg0, int arg1) {
        ++field4380;
        class113 var2 = class126.method1001(40, 2, arg1);
        var2.method897(true);
        int var3 = -113 % ((arg0 - 82) / 39);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZZ)Lhh;")
    public static final class163 method1705(int arg0, boolean arg1, boolean arg2) {
        ++field4382;
        if (arg1) {
            method1704((byte) -75, 80);
        }
        return class256.method1732(10, false, arg0, arg2);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class248() {
        this(4096);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lhh;I)Z")
    public static final boolean method1706(class163 arg0, int arg1) {
        ++field4375;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class29.field465 < ~var2; ++var2) {
                if (arg0.method1228(class11.field171[var2], -48)) {
                    return true;
                }
            }
            return arg1 != 25 ? false : false;
        }
    }
}
