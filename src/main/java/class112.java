import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class112 extends class157 {

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "Lcc;")
    public static class209 field2254 = class95.method669(106, ":chalreq:");

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Lcc;")
    public static class209 field2259 = class95.method669(123, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Lcc;")
    public static class209 field2258 = class95.method669(121, ":");

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "Lcc;")
    public static class209 field2260 = class95.method669(96, "showingVideoAd");

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(III)I")
    private final int method799(int arg0, int arg1, int arg2) {
        ++field2250;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        int var6 = -47 % ((-21 - arg2) / 56);
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)I")
    public static final int method800(int arg0) {
        if (arg0 < 31) {
            method803(-27);
        }
        ++field2251;
        return class10.field199;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public static final void method801(byte arg0) {
        if (~class200.field3580 > -1) {
            class49.field978 = -1;
            class279.field4919 = -1;
            class200.field3580 = 0;
        }
        if (~class200.field3580 < ~class59.field1194) {
            class279.field4919 = -1;
            class200.field3580 = class59.field1194;
            class49.field978 = -1;
        }
        if (class118.field2370 < 0) {
            class279.field4919 = -1;
            class118.field2370 = 0;
            class49.field978 = -1;
        }
        if (class118.field2370 > class98.field1921) {
            class279.field4919 = -1;
            class118.field2370 = class98.field1921;
            class49.field978 = -1;
        }
        int var1 = 98 % ((-20 - arg0) / 39);
        ++field2252;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2255;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (arg0 != -98) {
            method801((byte) 78);
        }
        if (super.field2879.field3363) {
            int var4 = class129.field2479[arg1];
            for (int var5 = 0; ~var5 > ~class226.field4124; ++var5) {
                var3[var5] = this.method799(var4, class50.field987[var5], class3.method15(arg0, 4)) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILsj;Ln;Lsj;Lsj;)Z")
    public static final boolean method802(int arg0, class49 arg1, class16 arg2, class49 arg3, class49 arg4) {
        if (arg0 != 1376312589) {
            method801((byte) 3);
        }
        class44.field873 = arg2;
        class246.field4460 = arg4;
        class234.field4217 = arg1;
        ++field2261;
        class257.field4653 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public static void method803(int arg0) {
        if (arg0 != 7384) {
            method803(-50);
        }
        field2254 = null;
        field2259 = null;
        field2258 = null;
        field2260 = null;
    }
}
