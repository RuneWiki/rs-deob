import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class124 extends class272 {

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Lli;")
    public static class185 field2237 = class245.method1649("<br>(X", -108);

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Lli;")
    public static class185 field2236 = class245.method1649("Continuer", 126);

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Lli;")
    public static class185 field2241 = class245.method1649(":clanreq:", 127);

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Z")
    public static boolean field2239 = false;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Luc;")
    public static class160 field2238;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "Lhi;")
    public static class250 field2234;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2238 = null;
        field2241 = null;
        field2236 = null;
        int var1 = -7 % ((33 - arg0) / 61);
        field2234 = null;
        field2237 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZII)I")
    private final int method902(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method901(77);
        }
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        ++field2240;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2233;
        if (arg1 != 4421) {
            field2237 = null;
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int var4 = class232.field4177[arg0];
            for (int var5 = 0; ~class246.field4385 < ~var5; ++var5) {
                var3[var5] = this.method902(true, class38.field598[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Lhi;I)Z")
    public static final boolean method903(class250 arg0, int arg1) {
        ++field2235;
        int var2 = -109 % ((arg1 - 14) / 44);
        return arg0.method1701(class205.field3768, -2);
    }
}
