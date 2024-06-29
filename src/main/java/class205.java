import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class205 extends class167 {

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    private int field3691 = 4096;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    private int field3696 = 0;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "Lkh;")
    public static class117 field3692 = class224.method1450((byte) -70, "unzap");

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "Lfi;")
    public static class65 field3698;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field3698 = null;
        field3692 = null;
        if (arg0 != 31) {
            field3695 = -42;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field3691 = arg0.method1049((byte) 93);
            }
        } else {
            this.field3696 = arg0.method1049((byte) 112);
        }
        ++field3694;
        if (arg1) {
            this.method53((byte) -83, 78);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            field3698 = null;
        }
        ++field3693;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, arg0 ^ -96, 0);
            for (int var5 = 0; ~class115.field2146 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field3696 <= var6 && ~var6 >= ~this.field3691 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLkh;)V")
    public static final void method1360(boolean arg0, class117 arg1) {
        ++field3697;
        class72 var2 = class48.method380(40, arg1);
        if (var2 != null) {
            class34.field807 = -class80.field1501 + var2.field1381;
            class211.field3837 = -var2.field1384 + class173.field3116 + class33.field773;
            int var3 = class211.field3837 - -((int) ((double) class166.field2994.field207 / class90.field1672));
            int var4 = class211.field3837 - (int) ((double) class166.field2994.field207 / class90.field1672);
            if (arg0) {
                method1360(true, (class117) null);
            }
            int var5 = -((int) ((double) class166.field2994.field256 / class90.field1672)) + class34.field807;
            int var6 = class34.field807 - -((int) ((double) class166.field2994.field256 / class90.field1672));
            if (~var5 > -1) {
                class34.field807 = (int) ((double) class166.field2994.field256 / class90.field1672);
            }
            if (var4 < 0) {
                class211.field3837 = (int) ((double) class166.field2994.field207 / class90.field1672);
            }
            if (var6 > class237.field4284) {
                class34.field807 = -((int) ((double) class166.field2994.field256 / class90.field1672)) + class237.field4284;
            }
            if (var3 > class33.field773) {
                class211.field3837 = -((int) ((double) class166.field2994.field207 / class90.field1672)) + class33.field773;
            }
        }
    }
}
