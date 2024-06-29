import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class205 {

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    private int field3 = 585;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "Lvd;")
    public static class222 field1 = class212.method1357("k", 10731);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Lvd;")
    private static class222 field4 = class212.method1357("Loaded update list", 10731);

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Lvd;")
    public static class222 field9 = class212.method1357("bevor Sie den Vorgang wiederholen)3", 10731);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lvd;")
    public static class222 field2 = field4;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvd;Lvd;Lvd;I)V")
    public static final void method1(class222 arg0, class222 arg1, class222 arg2, int arg3) {
        class97.field1800 = arg2;
        ++field10;
        if (arg3 != 0) {
            field7 = 70;
        }
        class97.field1805 = arg1;
        class97.field1816 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field6;
        if (arg2 == 0) {
            this.field3 = arg0.method675(2);
        }
        int var5 = 21 / ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
    public static void method3(int arg0) {
        field9 = null;
        if (arg0 == -6568) {
            field1 = null;
            field2 = null;
            field4 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field5;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int var4 = class218.field4051[arg1];
            for (int var5 = 0; ~var5 > ~class118.field2245; ++var5) {
                int var6 = class230.field4319[var5];
                if (this.field3 < var6 && ~(-this.field3 + 4096) < ~var6 && var4 > -this.field3 + 2048 && ~var4 > ~(this.field3 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field3 + 2048 && ~var6 > ~(2048 - -this.field3)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3 + 2048);
                } else if (this.field3 <= var4 && ~var4 >= ~(-this.field3 + 4096)) {
                    if (var6 >= this.field3 && ~(4096 - this.field3) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field3);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3 + 2048);
                }
            }
        }
        return arg0 != 0 ? null : var3;
    }
}
