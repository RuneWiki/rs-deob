import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class537 extends class646 {

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    private int field7882 = -1;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "Leda;")
    public static class116 field7884 = new class116(24, 8);

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "I")
    public static int field7890 = 0;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public int field7880;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public int field7883;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!pu", name = "T", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "[I")
    public int[] field7885;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method1543(int arg0) {
        super.method1543(-109);
        ++field7888;
        int var2 = 6 / ((-49 - arg0) / 45);
        this.field7885 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)I")
    public final int method3146(boolean arg0) {
        if (!arg0) {
            this.field7882 = -72;
        }
        ++field7879;
        return this.field7882;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I")
    public int[][] method298(int arg0, int arg1) {
        ++field7886;
        if (arg0 != -12424) {
            return null;
        } else {
            int[][] var3 = super.field9164.method1002(124, arg1);
            if (super.field9164.field2082 && this.method3149(118)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field7880 * (~class236.field3492 != ~this.field7883 ? this.field7883 * arg1 / class236.field3492 : arg1);
                if (class89.field1330 == this.field7880) {
                    for (int var8 = 0; ~var8 > ~class89.field1330; ++var8) {
                        int var9 = this.field7885[var7++];
                        var6[var8] = class248.method1593(255, var9) << 4;
                        var5[var8] = class248.method1593(var9, 65280) >> 4;
                        var4[var8] = class248.method1593(4080, var9 >> 12);
                    }
                } else {
                    for (int var10 = 0; ~class89.field1330 < ~var10; ++var10) {
                        int var11 = this.field7880 * var10 / class89.field1330;
                        int var12 = this.field7885[var7 + var11];
                        var6[var10] = class248.method1593(4080, var12 << 4);
                        var5[var10] = class248.method1593(var12, 65280) >> 4;
                        var4[var10] = class248.method1593(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)V")
    public static final void method3147(boolean arg0) {
        ++field7889;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class73.field1162[var1] = false;
        }
        class260.field3750 = 0;
        class307.field4274 = class551.field8078;
        class225.field3368 = class322.field4478;
        if (arg0) {
            field7890 = -56;
        }
        class656.field9268 = -1;
        class40.field544 = 5;
        class208.field3211 = 0;
        class424.field6053 = class277.field3933;
        class583.field8548 = class148.field2508;
        class698.field9896 = class432.field6220;
        class29.field405 = class666.field9366;
        class76.field1181 = -1;
        class294.field4104 = -1;
        class638.field9054 = -1;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method3148(byte arg0) {
        if (arg0 != -122) {
            field7890 = 36;
        }
        field7884 = null;
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z")
    public final boolean method3149(int arg0) {
        ++field7881;
        if (this.field7885 != null) {
            return true;
        } else if (this.field7882 >= 0) {
            class628 var2 = class436.field6282 >= 0 ? class628.method3550(class398.field5758, class436.field6282, this.field7882) : class628.method3537(class398.field5758, this.field7882);
            var2.method3536();
            this.field7885 = var2.method3546();
            this.field7883 = var2.field8940;
            this.field7880 = var2.field8936;
            return true;
        } else {
            return arg0 < 97;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field7882 = arg0.method2755((byte) -121);
        }
        if (arg2 <= 7) {
            this.method295((class465) null, 4, (byte) -93);
        }
        ++field7878;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(ZII)V")
    public static final void method3150(boolean arg0, int arg1, int arg2) {
        ++field7887;
        class70.field1107 = arg1;
        class133.field2155 = arg2;
        class173.method1275(class233.field3457.field4294, class233.field3457.field4286, 654776389);
        if (!arg0) {
            class262.method1671(119);
            class218.method1466(false, class308.field4283, (byte) -74, class415.field5895);
        } else {
            class218.method1466(false, "", (byte) -74, "");
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class537() {
        super(0, false);
    }
}
