import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class228 extends class76 {

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    private int field3828 = 4096;

    @OriginalMember(owner = "client!vj", name = "mb", descriptor = "I")
    private int field3837 = 0;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "Lia;")
    public static class257 field3826 = class28.method234(-51, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static volatile int field3829 = 0;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "Lia;")
    private static class257 field3824 = class28.method234(89, "Ok");

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "Lia;")
    public static class257 field3825 = field3824;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "Lia;")
    public static class257 field3830 = class28.method234(-84, "Fallen lassen");

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "[I")
    public static int[] field3832;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "[I")
    public static int[] field3835;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
    public static void method1487(int arg0) {
        field3825 = null;
        if (arg0 != 11566) {
            field3829 = -63;
        }
        field3826 = null;
        field3832 = null;
        field3835 = null;
        field3830 = null;
        field3824 = null;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field3823;
        if (arg0 != -9351) {
            method1489((class152) null, true);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            for (int var5 = 0; ~var5 > ~class96.field1807; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3837 && ~var6 >= ~this.field3828 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field3828 = arg0.method1063(-17162);
            }
        } else {
            this.field3837 = arg0.method1063(-17162);
        }
        if (arg1 > -86) {
            this.method158((class152) null, (byte) -97, -92);
        }
        ++field3833;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    public static final void method1488(byte arg0) {
        ++field3827;
        int var1 = (int) ((double) class239.field4114.field926 / class15.field332) + class181.field3146;
        int var2 = (int) ((double) class239.field4114.field981 / class15.field332) + class233.field3997;
        int var3 = -((int) ((double) class239.field4114.field926 / class15.field332)) + class181.field3146;
        if (var3 < 0) {
            class181.field3146 = (int) ((double) class239.field4114.field926 / class15.field332);
            class26.field510 = -1;
            class143.field2516 = -1;
        }
        int var4 = -101 % ((arg0 - 32) / 42);
        int var5 = class233.field3997 - (int) ((double) class239.field4114.field981 / class15.field332);
        if (~var1 < ~class252.field4337) {
            class181.field3146 = -((int) ((double) class239.field4114.field926 / class15.field332)) + class252.field4337;
            class143.field2516 = -1;
            class26.field510 = -1;
        }
        if (~var5 > -1) {
            class26.field510 = -1;
            class233.field3997 = (int) ((double) class239.field4114.field981 / class15.field332);
            class143.field2516 = -1;
        }
        if (var2 > class181.field3149) {
            class26.field510 = -1;
            class143.field2516 = -1;
            class233.field3997 = -((int) ((double) class239.field4114.field981 / class15.field332)) + class181.field3149;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lk;Z)Lhd;")
    public static final class29 method1489(class152 arg0, boolean arg1) {
        ++field3831;
        if (arg1) {
            field3826 = null;
        }
        return new class29(arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1075(-7903), arg0.method1064((byte) -96), arg0.method1064((byte) -115), arg0.method1051((byte) -100));
    }
}
