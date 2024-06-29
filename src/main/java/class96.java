import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class96 extends class272 {

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lli;")
    public static class185 field1808 = class245.method1649("Wordpack geladen)3", -93);

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
    public static int[] field1804;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = -28 % ((-21 - arg1) / 55);
        if (~arg2 == -1) {
            this.field1805 = (arg0.method867(false) << 12) / 255;
        }
        ++field1809;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1807;
        if (arg1 != 4421) {
            field1808 = null;
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            class190.method1367(var3, 0, class246.field4385, this.field1805);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
    public static final int method618(int arg0) {
        ++field1806;
        int var1 = -17 % ((arg0 - 46) / 57);
        return 16;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1802;
        if (class127.method912(arg8, (byte) -110)) {
            class238.field4247 = null;
            int var10 = 74 / ((68 - arg4) / 49);
            class197.method1411((byte) 46, class136.field2557[arg8], arg2, -1, arg7, arg0, arg1, arg5, arg6, arg3);
            if (class238.field4247 != null) {
                class197.method1411((byte) -110, class238.field4247, arg2, -1412584499, arg7, arg0, class131.field2352, class18.field299, arg6, arg3);
                class238.field4247 = null;
            }
        } else if (~arg3 != 0) {
            class44.field700[arg3] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class44.field700[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1804 = null;
        if (arg0 <= 0) {
            field1808 = null;
        }
        field1808 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class96() {
        this(4096);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    private class96(int arg0) {
        super(0, true);
        this.field1805 = 4096;
        this.field1805 = arg0;
    }
}
