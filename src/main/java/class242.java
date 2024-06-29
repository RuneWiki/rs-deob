import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class242 extends class98 {

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    private int field3438 = 4;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    private int field3439 = 4;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class242() {
        super(1, false);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        int var3 = 25 % ((60 - arg1) / 43);
        ++field3441;
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int var5 = class268.field3811 / this.field3439;
            int var6 = class140.field1737 / this.field3438;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method546(class140.field1737 * var7 / var6, (byte) 33, 0);
            } else {
                var8 = this.method546(0, (byte) 33, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class268.field3811; ++var15) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class268.field3811 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(B)Lgq;")
    public static final class300 method1651(byte arg0) {
        ++field3442;
        int var1 = -121 % ((arg0 - 45) / 41);
        return class308.field4345;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            this.field3439 = 50;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field3438 = arg1.method1574(-51);
            }
        } else {
            this.field3439 = arg1.method1574(arg2 ^ -87);
        }
        ++field3443;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field3440;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = class268.field3811 / this.field3439;
            int var5 = class140.field1737 / this.field3438;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method539(0, (byte) -78, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method539(0, (byte) -60, class140.field1737 * var7 / var5);
            }
            for (int var8 = 0; ~class268.field3811 < ~var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class268.field3811 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        if (arg0 != 0) {
            this.method81(8, (class236) null, -66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)V")
    public static final void method1652(int arg0, boolean arg1) {
        ++field3444;
        if (!arg1 == class178.field2452) {
            class178.field2452 = arg1;
            if (arg0 == 0) {
                class18.method124(2420);
            }
        }
    }
}
