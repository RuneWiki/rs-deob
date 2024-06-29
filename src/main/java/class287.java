import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class287 extends class38 {

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    private int field4076 = 585;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "Lmia;")
    public static class63 field4074 = new class63(9, 3);

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "F")
    public static float field4079;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILrg;)V", line = 4)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field4075;
        if (arg1 == 0) {
            this.field4076 = arg2.method3712((byte) 95);
        }
        if (arg0 < 34) {
            field4079 = -0.84452766F;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 31)
    public static final byte[] method1830(boolean arg0, int arg1, Object arg2) {
        ++field4077;
        if (arg1 != -1688) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class637.method3661(var3, arg1 ^ -2859) : var3;
        } else if (arg2 instanceof class463) {
            class463 var4 = (class463) arg2;
            return var4.method2823((byte) 9);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 68)
    public static void method1831(int arg0) {
        field4074 = null;
        int var1 = 103 % ((-70 - arg0) / 53);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 80)
    public class287() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[I", line = 84)
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 >= -43) {
            this.method190(-51, 78, (class645) null);
        }
        ++field4078;
        int[] var3 = super.field397.method1376(arg1, (byte) 35);
        if (super.field397.field3005) {
            int var4 = class136.field1816[arg1];
            for (int var5 = 0; ~class729.field10216 < ~var5; ++var5) {
                int var6 = class255.field3666[var5];
                if (~var6 < ~this.field4076 && ~(-this.field4076 + 4096) < ~var6 && -this.field4076 + 2048 < var4 && ~var4 > ~(2048 - -this.field4076)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4076 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field4076 + 2048) > ~var6 && ~var6 > ~(this.field4076 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field4076;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4076);
                } else if (~this.field4076 >= ~var4 && ~var4 >= ~(4096 - this.field4076)) {
                    if (var6 >= this.field4076 && 4096 - this.field4076 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4076 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field4076;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4076 + 2048);
                }
            }
        }
        return var3;
    }
}
