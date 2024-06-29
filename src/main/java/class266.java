import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class266 extends class166 {

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private int field4723 = 4096;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    private int field4722 = 0;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lhj;")
    public static class69 field4729 = class181.method1318("_", (byte) -122);

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "[Lng;")
    public static class74[] field4731 = new class74[4];

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4724 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lka;")
    public static class243 field4732 = new class243();

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field4735 = 0;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkk;I)V")
    public static final void method1838(class222 arg0, int arg1) {
        ++field4725;
        if (class180.field3272 == arg0.field4056 || ~arg0.field4010 == 0 || arg0.field4006 != 0 || arg0.field3993 + 1 > class211.method1521(-105, arg0.field4010).field2941[arg0.field4022]) {
            int var2 = -arg0.field4028 + class180.field3272;
            int var3 = arg0.field4056 - arg0.field4028;
            int var4 = arg0.field4031 * 128 - -(arg0.method813(15963) * 64);
            int var5 = arg0.field4057 * 128 - -(64 * arg0.method813(15963));
            int var6 = arg0.field4030 * 128 - -(arg0.method813(15963) * 64);
            int var7 = arg0.field4017 * 128 + 64 * arg0.method813(15963);
            arg0.field4005 = ((-var2 + var3) * var5 - -(var2 * var7)) / var3;
            arg0.field3985 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        if (~arg0.field4058 == -1) {
            arg0.field4052 = 1024;
        }
        if (arg0.field4058 == 1) {
            arg0.field4052 = 1536;
        }
        if (~arg0.field4058 == -3) {
            arg0.field4052 = 0;
        }
        if (~arg0.field4058 == -4) {
            arg0.field4052 = 512;
        }
        if (arg1 < -121) {
            arg0.field4011 = 0;
            arg0.field4003 = arg0.field4052;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4726;
        if (arg1 != 8388607) {
            field4731 = null;
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(arg1 ^ 8388485, arg0, 0);
            for (int var5 = 0; ~var5 > ~class253.field4565; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4722 && var6 <= this.field4723 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field4730;
        if (arg0 == 96) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field4723 = arg1.method912(109);
                }
            } else {
                this.field4722 = arg1.method912(arg0 + -47);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILfh;)Lcb;")
    public static final class229 method1839(int arg0, class128 arg1) {
        int var2 = -36 / ((arg0 - -12) / 43);
        ++field4728;
        return new class229(arg1.method955((byte) -79), arg1.method955((byte) 82), arg1.method955((byte) 122), arg1.method955((byte) 87), arg1.method955((byte) -101), arg1.method955((byte) 120), arg1.method955((byte) -58), arg1.method955((byte) -51), arg1.method952((byte) -72), arg1.method937(false));
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class266() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static void method1840(int arg0) {
        field4732 = null;
        field4729 = null;
        field4731 = null;
        if (arg0 != 1024) {
            method1839(94, (class128) null);
        }
        field4724 = null;
    }
}
