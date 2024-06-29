import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class235 extends class23 {

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    private int field4277 = 1024;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    private int field4280 = 3072;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    private int field4278 = 2048;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Llc;")
    public static class143 field4274 = class66.method374("ondulation2:", -1);

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lbg;")
    public static class177 field4281 = new class177(128);

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "Llc;")
    private static class143 field4288 = class66.method374("Loading sprites )2 ", -1);

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Llc;")
    public static class143 field4285 = field4288;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "J")
    public static volatile long field4293 = 0L;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "Llc;")
    public static class143 field4286 = class66.method374(":duelstake:", -1);

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "F")
    public static float field4289;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "Lgf;")
    public static class7 field4291;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "[I")
    public static int[] field4287;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.field4278 = -this.field4277 + this.field4280;
        ++field4279;
        int var2 = -21 / ((22 - arg0) / 60);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
    public static final void method1585(boolean arg0, byte arg1) {
        ++field4273;
        class206.field3764 = arg0;
        if (arg1 == 108) {
            class209.field3832 = !class21.method149((byte) -57);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class235() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field4282;
            int[][] var3 = super.field366.method209(arg1 + -1, arg0);
            if (super.field366.field508) {
                int[][] var4 = this.method161(arg0, 0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class72.field1359 < ~var11; ++var11) {
                    var7[var11] = this.field4277 - -(var8[var11] * this.field4278 >> 12);
                    var9[var11] = (var5[var11] * this.field4278 >> 12) + this.field4277;
                    var10[var11] = (var6[var11] * this.field4278 >> 12) + this.field4277;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public static void method1586(boolean arg0) {
        field4286 = null;
        field4274 = null;
        field4291 = null;
        field4281 = null;
        if (!arg0) {
            method1585(false, (byte) 60);
        }
        field4285 = null;
        field4288 = null;
        field4287 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lgf;IBILgf;)Lrb;")
    public static final class193 method1587(class7 arg0, int arg1, byte arg2, int arg3, class7 arg4) {
        ++field4276;
        if (!class189.method1223(arg4, arg3, 79, arg1)) {
            return null;
        } else {
            if (arg2 < 45) {
                method1587((class7) null, -60, (byte) -36, 73, (class7) null);
            }
            return class29.method194(arg0.method41(-18328, arg1, arg3), -689415792);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        int[] var3 = super.field369.method306(arg1, -23179);
        ++field4283;
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 82, 0);
            for (int var5 = 0; class72.field1359 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field4278 >> 12) + this.field4277;
            }
        }
        if (arg0 >= -13) {
            field4291 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field4275;
        if (!arg2) {
            field4285 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field373 = arg0.method1265(117) == 1;
                }
            } else {
                this.field4280 = arg0.method1275(128);
            }
        } else {
            this.field4277 = arg0.method1275(128);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public static final void method1588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4284;
        if (arg0 <= 52) {
            method1588(97, -13, 84, -91, 25);
        }
        for (int var5 = 0; ~var5 > ~class128.field2260; ++var5) {
            if (~(class255.field4572[var5] + class133.field2330[var5]) < ~arg3 && ~class255.field4572[var5] > ~(arg3 - -arg2) && arg1 < class237.field4306[var5] + class176.field3151[var5] && ~class176.field3151[var5] > ~(arg1 - -arg4)) {
                class69.field1323[var5] = true;
            }
        }
    }
}
