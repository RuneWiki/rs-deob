import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class195 extends class124 {

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "Z")
    public static boolean field3393 = false;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lpj;")
    private static class237 field3401 = class33.method353("M", 87);

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "[I")
    public static int[] field3402 = new int[200];

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Lpj;")
    public static class237 field3394 = field3401;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "Lpj;")
    public static class237 field3398 = field3401;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "Lob;")
    public class128 field3399;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Lwj;")
    public static class6 field3392;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[B")
    public byte[] field3397;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1345(int arg0, int arg1, int arg2, int arg3) {
        if (!class143.method983(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class272.method1813(var4 + 1, class99.field1773[arg0][arg1][arg2] + arg3, var5 + 1) && class272.method1813(var4 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class272.method1813(var4 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class272.method1813(var4 + 1, class99.field1773[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
    public static final void method1346(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            class223 var3 = class105.method784(arg1, -1);
            int var4 = var3.field3822;
            ++field3391;
            int var5 = var3.field3833;
            int var6 = var3.field3828;
            int var7 = class63.field1263[-var5 + var6];
            if (arg2 < 0 || ~arg2 < ~var7) {
                arg2 = 0;
            }
            int var8 = var7 << var5;
            class220.method1469(19, var4, class202.field3471[var4] & ~var8 | arg2 << var5 & var8);
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3392 = null;
        field3394 = null;
        field3402 = null;
        field3398 = null;
        if (arg0 == 0) {
            field3401 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)[B")
    public final byte[] method885(int arg0) {
        if (arg0 != 1) {
            this.method885(-128);
        }
        ++field3403;
        if (super.field2175) {
            throw new RuntimeException();
        } else {
            return this.field3397;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)I")
    public final int method889(byte arg0) {
        if (arg0 != -30) {
            this.method885(107);
        }
        ++field3396;
        return super.field2175 ? 0 : 100;
    }
}
