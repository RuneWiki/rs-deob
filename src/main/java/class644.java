import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class644 extends class86 {

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[I")
    public static int[] field8234 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "[I")
    public static int[] field8240;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field8239;
        super.field1200 = arg0;
        class61.method360(arg1, super.field1200);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
    public static void method3482(byte arg0) {
        field8240 = null;
        field8234 = null;
        if (arg0 > -124) {
            field8240 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 != -65) {
            method3482((byte) -74);
        }
        ++field8238;
        if (~super.field1203.method2983(arg0 + -19171).method723((byte) 90) > -97) {
            super.field1200 = 0;
        }
        if (super.field1200 < 0 || super.field1200 > 2) {
            super.field1200 = this.method73(arg0 ^ -65);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLmc;)V")
    public static final void method3483(int arg0, boolean arg1, class234 arg2) {
        ++field8235;
        if (class409.field5432 != null) {
            try {
                class409.field5432.method1442(0L, false);
                class409.field5432.method1443(arg0, 16711680, arg2.field3193, 24);
            } catch (Exception var3) {
            }
        }
        if (arg1) {
            field8240 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lsf;)V")
    public class644(class551 arg0) {
        super(arg0);
        class61.method360(false, super.field1200);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)Z")
    public final boolean method3484(int arg0) {
        ++field8243;
        if (super.field1203.method2983(-19236).method723((byte) 90) < 96) {
            return false;
        } else {
            int var2 = 40 / ((arg0 - -57) / 57);
            return true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field8237;
        if (arg1 != -2) {
            field8234 = null;
        }
        return ~super.field1203.method2983(-19236).method723((byte) 90) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)I")
    public final int method3485(boolean arg0) {
        if (arg0) {
            field8240 = null;
        }
        ++field8241;
        return super.field1200;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
    public static final void method3486(int arg0) {
        class727.method3889(-11108);
        ++field8242;
        class721.field9476 = null;
        class780.field10647 = null;
        class196.field2716 = 0;
        class520.field6618 = 0;
        class563.field7155 = null;
        class356.field4337.field3133 = 0;
        class199.field2766 = 0;
        class345.field4221 = null;
        class187.method1318(arg0 + 6);
        class597.method3220(0);
        for (int var1 = 0; var1 < 2048; ++var1) {
            class263.field3508[var1] = null;
        }
        class422.field5564 = null;
        for (int var2 = 0; var2 < class750.field10228; ++var2) {
            class727 var4 = class542.field6811[var2].field3125;
            if (var4 != null) {
                var4.field4723 = -1;
            }
        }
        class282.method1727(-1996488705);
        class507.field6476 = 1;
        class525.field6679 = -1;
        class524.field6672 = -1;
        class26.method113((byte) 95, 10);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class454.field5919[var3] = true;
        }
        class446.method2556(0);
        class232.field3124 = null;
        class278.field3619 = (long) arg0;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            field8240 = null;
        }
        ++field8244;
        return super.field1203.method2983(-19236).method723((byte) 90) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILsf;)V")
    public class644(int arg0, class551 arg1) {
        super(arg0, arg1);
        class61.method360(false, super.field1200);
    }
}
