import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class311 extends class581 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Lnea;")
    public static class664 field4610 = new class664(64, 7);

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field4612 = 0;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "Lnea;")
    public static class664 field4613 = new class664(45, -1);

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Lwba;")
    public static class46 field4614 = new class46();

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lf;")
    private class702 field4599;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lf;")
    private class702 field4601;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Lf;")
    private class702 field4602;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lf;")
    public class702 field4605;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Lf;")
    private class702 field4606;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Lf;")
    private class702 field4611;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Z")
    public final boolean method419(byte arg0) {
        ++field4607;
        if (!super.method419((byte) 65)) {
            return false;
        } else {
            class64 var2 = (class64) super.field8179;
            if (!super.field8186.method2997((byte) -95, var2.field1205)) {
                return false;
            } else if (!super.field8186.method2997((byte) -95, var2.field1203)) {
                return false;
            } else {
                if (arg0 < 56) {
                    this.field4602 = null;
                }
                if (!super.field8186.method2997((byte) -95, var2.field1211)) {
                    return false;
                } else if (!super.field8186.method2997((byte) -95, var2.field1202)) {
                    return false;
                } else if (!super.field8186.method2997((byte) -95, var2.field1215)) {
                    return false;
                } else {
                    return super.field8186.method2997((byte) -95, var2.field1212);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static void method1975(int arg0) {
        field4613 = null;
        field4610 = null;
        int var1 = 11 / ((arg0 - 65) / 55);
        field4614 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZ)V")
    public final void method1675(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != 0) {
            method1975(50);
        }
        ++field4603;
        if (arg3) {
            int[] var5 = new int[4];
            class282.field4228.method204(var5);
            class282.field4228.method168(arg1, arg2, arg1 - -super.field8179.field487, arg2 - -super.field8179.field480);
            int var6 = this.field4602.method931();
            int var7 = this.field4602.method936();
            int var8 = this.field4599.method931();
            int var9 = this.field4599.method936();
            this.field4602.method3916(arg1, (-var7 + super.field8179.field480) / 2 + arg2);
            this.field4599.method3916(-var8 + arg1 - -super.field8179.field487, (super.field8179.field480 - var9) / 2 + arg2);
            class282.field4228.method168(arg1, arg2, super.field8179.field487 + arg1, arg2 - -this.field4601.method936());
            this.field4601.method3911(arg1 + var6, arg2, -var8 + super.field8179.field487 + -var6, super.field8179.field480);
            int var10 = this.field4606.method936();
            class282.field4228.method168(arg1, super.field8179.field480 + arg2 + -var10, super.field8179.field487 + arg1, super.field8179.field480 + arg2);
            this.field4606.method3911(arg1 + var6, -var10 + arg2 + super.field8179.field480, -var8 + super.field8179.field487 + -var6, super.field8179.field480);
            class282.field4228.method168(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZII)V")
    public final void method1673(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 <= 107) {
            this.method1673(1, true, 77, -13);
        }
        ++field4609;
        int var5 = arg2 - -this.field4602.method931();
        int var6 = super.field8179.field487 + (arg2 - this.field4599.method931());
        int var7 = this.field4601.method936() + arg0;
        int var8 = super.field8179.field480 + (arg0 - this.field4606.method936());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method3312(43) * var9 / 10000;
        int[] var12 = new int[4];
        class282.field4228.method204(var12);
        class282.field4228.method168(var5, var7, var5 + var11, var8);
        this.method1977(var7, var9, 64, var5, var10);
        class282.field4228.method168(var5 + var11, var7, var6, var8);
        this.field4611.method3911(var5, var7, var9, var10);
        class282.field4228.method168(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1976(int arg0, int arg1, Random arg2) {
        ++field4600;
        if (arg0 != -1) {
            return 83;
        } else if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class284.method1835(arg1, arg0 ^ -76)) {
            return (int) ((long) arg1 * (4294967295L & (long) arg2.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (~var4 <= ~var3);
            return class59.method635(var4, arg1, -128);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        super.method420(arg0);
        ++field4604;
        class64 var2 = (class64) super.field8179;
        this.field4605 = class195.method1321((byte) -114, var2.field1205, super.field8186);
        this.field4611 = class195.method1321((byte) 123, var2.field1203, super.field8186);
        this.field4602 = class195.method1321((byte) 64, var2.field1211, super.field8186);
        this.field4599 = class195.method1321((byte) -71, var2.field1202, super.field8186);
        this.field4601 = class195.method1321((byte) 77, var2.field1215, super.field8186);
        this.field4606 = class195.method1321((byte) 127, var2.field1212, super.field8186);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public void method1977(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4598;
        this.field4605.method3911(arg3, arg0, arg1, arg4);
        if (arg2 != 64) {
            method1975(28);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lpu;Lpu;Lnaa;)V")
    public class311(class522 arg0, class522 arg1, class64 arg2) {
        super(arg0, arg1, arg2);
    }
}
