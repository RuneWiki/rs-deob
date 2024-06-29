import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class674 extends class634 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    private int field9552 = 4096;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    private int field9553 = 0;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lpea;")
    public static class722 field9555 = new class722(0);

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "[S")
    public static short[] field9558 = new short[256];

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "F")
    public static float field9559;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class674() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field9552 = arg1.method1476(122);
            }
        } else {
            this.field9553 = arg1.method1476(-3);
        }
        if (arg2) {
            field9559 = 2.1195765F;
        }
        ++field9554;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static final void method3838(int arg0) {
        if (arg0 < ~class30.field352) {
            class99.field1035 = -1;
            class30.field352 = 0;
            class469.field6702 = -1;
        }
        ++field9551;
        if (class30.field352 > class656.field9373) {
            class99.field1035 = -1;
            class469.field6702 = -1;
            class30.field352 = class656.field9373;
        }
        if (~class116.field1211 > -1) {
            class469.field6702 = -1;
            class116.field1211 = 0;
            class99.field1035 = -1;
        }
        if (class116.field1211 > class656.field9372) {
            class116.field1211 = class656.field9372;
            class99.field1035 = -1;
            class469.field6702 = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static final void method3839(int arg0) {
        ++field9557;
        if (arg0 == class654.field9334.field9858.method2982(38) && ~class316.field4035 != ~class122.field1278) {
            class313.method1863(class630.field9065, class443.field6427, false, false, 11);
        } else {
            class140.method880(class275.field3370, (byte) -122);
            if (class552.field7920 != class122.field1278) {
                class154.method944(true);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
    public static void method3840(int arg0) {
        if (arg0 == 14880) {
            field9558 = null;
            field9555 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field9556;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method3(78, (class244) null, true);
        }
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            for (int var5 = 0; ~var5 > ~class635.field9139; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field9553 <= var6 && ~var6 >= ~this.field9552 ? 4096 : 0;
            }
        }
        return var3;
    }
}
