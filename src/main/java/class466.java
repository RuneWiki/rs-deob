import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class466 extends class297 {

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Luw;")
    public static class418 field6527 = new class418("", 12);

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "[S")
    private static short[] field6533 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "[S")
    private static short[] field6534 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "[S")
    private static short[] field6535 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "[[S")
    public static short[][] field6536 = new short[][] { field6535, field6533, field6534 };

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIIILqo;ZB)Leba;", line = 3)
    public static final class588 method2740(int[] arg0, int arg1, int arg2, int arg3, int arg4, class22 arg5, boolean arg6, byte arg7) {
        if (arg7 != 12) {
            method2742(9);
        }
        ++field6530;
        if (!arg5.field615 && (!class476.method2796(-74, arg4) || !class476.method2796(127, arg3))) {
            return !arg5.field659 ? new class588(arg5, arg4, arg3, class529.method3059(arg4, (byte) 108), class529.method3059(arg3, (byte) 108), arg0) : new class588(arg5, 34037, arg4, arg3, arg6, arg0, arg2, arg1);
        } else {
            return new class588(arg5, 3553, arg4, arg3, arg6, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 22)
    public static void method2741(byte arg0) {
        field6527 = null;
        if (arg0 != -109) {
            field6527 = null;
        }
        field6535 = null;
        field6533 = null;
        field6536 = null;
        field6534 = null;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V", line = 36)
    public static final void method2742(int arg0) {
        ++field6531;
        if (~class700.field9463 <= arg0) {
            long var1 = class554.method3190(arg0 ^ 60);
            class700.field9463 = (int) ((long) class700.field9463 - (-class607.field8332 + var1));
            if (~class700.field9463 < -1) {
                int var3 = (class700.field9463 << 8) / class643.field8858;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class182.field2758 = ((class494.field6827 & 16711935) * var3 + (class394.field5785.field5609 & 16711935) * var4 & -16711936) - -(16711680 & (65280 & class494.field6827) * var3 + (65280 & class394.field5785.field5609) * var4) >>> 8;
                class507.field7057 = (class394.field5785.field5620 - class284.field3971) * var6 + class284.field3971;
                class480.field6703 = (class394.field5785.field5614 - class91.field1628) * var6 + class91.field1628;
                class585.field7989 = class93.field1639 * var3 + class394.field5785.field5615 * var4 >> 8;
                class371.field5292 = (-class177.field2724 + class394.field5785.field5616) * var6 + class177.field2724;
                class638.field8778 = (class394.field5785.field5613 - class472.field6615) * var6 + class472.field6615;
                class186.field2794 = (-16711936 & (16711935 & class53.field1099) * var3 - -((16711935 & class394.field5785.field5618) * var4)) + ((65280 & class53.field1099) * var3 + (65280 & class394.field5785.field5618) * var4 & 16711680) >>> 8;
                class570.field7849 = (-class308.field4274 + class394.field5785.field5605) * var6 + class308.field4274;
                class537.field7432 = (class394.field5785.field5611 - class614.field8390) * var6 + class614.field8390;
                if (class94.field1659 != class394.field5785.field5610) {
                    class590.field8054 = class112.field1938.method340(class94.field1659, class394.field5785.field5610, var6, class590.field8054);
                }
            } else {
                class590.field8054 = class394.field5785.field5610;
                class638.field8778 = class394.field5785.field5613;
                class480.field6703 = class394.field5785.field5614;
                class507.field7057 = class394.field5785.field5620;
                class585.field7989 = class394.field5785.field5615;
                class537.field7432 = class394.field5785.field5611;
                class570.field7849 = class394.field5785.field5605;
                class700.field9463 = -1;
                class186.field2794 = class394.field5785.field5618;
                class182.field2758 = class394.field5785.field5609;
                class371.field5292 = class394.field5785.field5616;
            }
            class607.field8332 = var1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(III)Lun;", line = 93)
    public static final class424 method2743(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5566;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)[[I", line = 101)
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            method2741((byte) 4);
        }
        ++field6529;
        int[][] var3 = super.field4166.method2180(-78, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) -104, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class525.field7275 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 148)
    public class466() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)[I", line = 153)
    public final int[] method15(int arg0, int arg1) {
        ++field6532;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.method18(-113, -46);
        }
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            for (int var5 = 0; ~class525.field7275 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lcea;II)V", line = 192)
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field6526;
        if (arg2 != 31015) {
            field6527 = null;
        }
        if (~arg1 == -1) {
            super.field4178 = arg0.method1535(255) == 1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLcea;)Ljava/lang/String;", line = 210)
    public static final String method2744(byte arg0, class215 arg1) {
        ++field6528;
        if (arg0 != 64) {
            field6535 = null;
        }
        return class61.method652(32767, arg1, -77);
    }
}
