import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class278 extends class158 {

    @OriginalMember(owner = "client!al", name = "lb", descriptor = "Lli;")
    public static class185 field4943 = class245.method1649("<col=ff0000>", -111);

    @OriginalMember(owner = "client!al", name = "mb", descriptor = "Lli;")
    private static class185 field4944 = class245.method1649("K", -127);

    @OriginalMember(owner = "client!al", name = "kb", descriptor = "Lli;")
    public static class185 field4942 = field4944;

    @OriginalMember(owner = "client!al", name = "ob", descriptor = "Lli;")
    public static class185 field4946 = field4944;

    @OriginalMember(owner = "client!al", name = "ib", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!al", name = "jb", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!al", name = "nb", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!al", name = "pb", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!al", name = "hb", descriptor = "Lhi;")
    public static class250 field4939;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V")
    public static final void method1906(int arg0) {
        ++field4947;
        if (!class221.field4019 && ~class259.field4601 != -3) {
            try {
                class182.field3357.method1315(-65, class88.field1730);
                if (arg0 != -3) {
                    method1909(false, false, (byte) 102, 113, false);
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "i", descriptor = "(I)V")
    public static void method1907(int arg0) {
        field4942 = null;
        field4946 = null;
        int var1 = 74 % ((-14 - arg0) / 61);
        field4943 = null;
        field4939 = null;
        field4944 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
    public static final void method1908(int arg0, int arg1) {
        ++field4940;
        class176.field3219 = 1000 / arg1;
        if (arg0 >= -17) {
            field4942 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field4945;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = -30 % ((arg1 - -60) / 45);
        if (super.field4818.field3954 && this.method1120(-26981)) {
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int var8 = arg0 % super.field2988 * super.field2988;
            for (int var9 = 0; ~class246.field4385 < ~var9; ++var9) {
                int var10 = super.field2995[var9 % super.field2984 + var8];
                var6[var9] = class220.method1526(255, var10) << 4;
                var5[var9] = class220.method1526(4080, var10 >> 4);
                var7[var9] = class220.method1526(var10 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZBIZ)Lhi;")
    public static final class250 method1909(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        ++field4941;
        class242 var5 = null;
        if (class250.field4444 != null) {
            var5 = new class242(arg3, class250.field4444, class90.field1742[arg3], 1000000);
        }
        if (arg2 > -27) {
            method1907(-69);
        }
        class191.field3531[arg3] = class135.field2538.method997(class12.field222, (byte) -34, arg3, var5);
        if (arg1) {
            class191.field3531[arg3].method1257(-103);
        }
        return new class250(class191.field3531[arg3], arg0, arg4);
    }
}
