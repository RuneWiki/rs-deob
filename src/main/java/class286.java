import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class286 extends class8 {

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    private int field4516 = 0;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    private int field4523 = 1365;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    private int field4524 = 20;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    private int field4522 = 0;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field4518 = null;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "[Lph;")
    public static class78[] field4527 = new class78[0];

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "Lvj;")
    public static class115 field4520 = new class115();

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lf;")
    public static class36 field4525;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V")
    public static void method1920(byte arg0) {
        field4520 = null;
        field4527 = null;
        field4525 = null;
        field4518 = null;
        if (arg0 < 69) {
            field4527 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
    public static final void method1921(int arg0) {
        if (class157.field2548 != -1) {
            class79.method549(class157.field2548, 113);
        }
        if (arg0 > -127) {
            field4527 = null;
        }
        for (int var1 = 0; ~var1 > ~class98.field1615; ++var1) {
            if (class275.field4352[var1]) {
                class223.field3698[var1] = true;
            }
            class82.field1286[var1] = class275.field4352[var1];
            class275.field4352[var1] = false;
        }
        class67.field1110 = class222.field3682;
        ++field4517;
        class10.field142 = -1;
        class67.field1105 = null;
        class250.field3983 = -1;
        if (~class157.field2548 != 0) {
            class98.field1615 = 0;
            class132.method931(0);
        }
        class2.method13();
        class287.field4533 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 < 62) {
            this.field4524 = -100;
        }
        ++field4519;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field4516 = arg1.method1521((byte) 113);
                    }
                } else {
                    this.field4522 = arg1.method1521((byte) 113);
                }
            } else {
                this.field4524 = arg1.method1521((byte) 113);
            }
        } else {
            this.field4523 = arg1.method1521((byte) 113);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            this.field4522 = 87;
        }
        int[] var3 = super.field110.method1585(0, arg1);
        ++field4526;
        if (super.field110.field3734) {
            for (int var4 = 0; ~class231.field3798 < ~var4; ++var4) {
                int var5 = (class176.field2776[var4] << 12) / this.field4523 + this.field4522;
                int var6 = (class182.field2864[arg1] << 12) / this.field4523 + this.field4516;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (var11 + var13 < 16384 && var12 < this.field4524) {
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = var7 + var11 - var13;
                    ++var12;
                    var13 = var10 * var10 >> 12;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = this.field4524 + -1 > var12 ? (var12 << 12) / this.field4524 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(B)V")
    public static final void method1922(byte arg0) {
        for (int var1 = 0; var1 < 104; ++var1) {
            for (int var7 = 0; var7 < 104; ++var7) {
                class105.field1682[var1][var7] = 0;
            }
        }
        ++field4521;
        for (int var2 = 0; ~var2 > ~class155.field2514; ++var2) {
            class33 var6 = class35.field548[class57.field973[var2]];
            if (var6 != null) {
                var6.field3327 = false;
            }
        }
        int var3 = 0;
        int var4 = -120 / ((arg0 - -16) / 57);
        while (var3 < class141.field2287) {
            class15 var5 = class137.field2260[class221.field3648[var3]];
            if (var5 != null) {
                var5.field3327 = false;
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class286() {
        super(0, true);
    }
}
