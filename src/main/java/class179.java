import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class179 extends class123 {

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    private int field3148 = 585;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "[I")
    public static int[] field3144 = new int[50];

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Leb;")
    public static class230 field3143 = class68.method589(0, "scape main");

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "Leb;")
    public static class230 field3150 = class68.method589(0, "loc");

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lkk;")
    public static class223 field3146;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field3148 = arg1.method161(arg2 ^ 1876195784);
        }
        ++field3142;
        if (arg2 != 1876195788) {
            field3143 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILkk;Lkk;Lla;)V")
    public static final void method1301(int arg0, class223 arg1, class223 arg2, class94 arg3) {
        class114.field2037 = arg1;
        class52.field900 = arg3;
        if (arg0 < 0) {
            field3150 = null;
        }
        class89.field1559 = arg2;
        ++field3147;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field3149;
        int[] var3 = super.field2160.method1323((byte) 91, arg0);
        int var4 = 109 % ((-24 - arg1) / 57);
        if (super.field2160.field3243) {
            int var5 = class154.field2753[arg0];
            for (int var6 = 0; class140.field2505 > var6; ++var6) {
                int var7 = class214.field3705[var6];
                if (~var7 < ~this.field3148 && ~var7 > ~(-this.field3148 + 4096) && ~var5 < ~(-this.field3148 + 2048) && ~var5 > ~(2048 - -this.field3148)) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field3148 + 2048);
                    var3[var6] = -var11 + 4096;
                } else if (var7 > 2048 - this.field3148 && ~(this.field3148 + 2048) < ~var7) {
                    int var12 = var5 + -2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field3148;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field3148 + 2048);
                } else if (this.field3148 <= var5 && ~(-this.field3148 + 4096) <= ~var5) {
                    if (var7 >= this.field3148 && var7 <= -this.field3148 + 4096) {
                        var3[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = ~var16 > -1 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field3148 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 > -1 ? -var20 : var20;
                    int var22 = var21 - this.field3148;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (2048 - this.field3148);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)Z")
    public static final boolean method1302(int arg0) {
        int var1 = 17 % ((2 - arg0) / 43);
        ++field3141;
        return class251.field4506;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3144 = null;
        field3150 = null;
        if (arg0 != 0) {
            method1302(-117);
        }
        field3143 = null;
        field3146 = null;
    }
}
