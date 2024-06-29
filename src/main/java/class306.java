import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class306 extends class13 {

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    private int field4225 = 1;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    private int field4222 = 204;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    private int field4229 = 1;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field4224 = 0;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Ldr;")
    public static class428 field4221 = new class428();

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "S")
    public static short field4230 = 1;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "[I")
    public static int[] field4232 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Lrb;")
    public static class197 field4231;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "[I")
    public static int[] field4233;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZI)I")
    public static final int method1972(boolean arg0, int arg1) {
        ++field4228;
        long var2 = class385.method2442(-6631);
        if (arg1 != -24767) {
            field4224 = -16;
        }
        for (class75 var4 = !arg0 ? (class75) class361.field4987.method881((byte) -68) : (class75) class361.field4987.method885(-55); var4 != null; var4 = (class75) class361.field4987.method881((byte) -68)) {
            if ((var4.field1071 & 4611686018427387903L) < var2) {
                if ((4611686018427387904L & var4.field1071) != 0L) {
                    int var5 = (int) var4.field5600;
                    class297.field4156[var5] = class34.field532[var5];
                    var4.method2467((byte) -107);
                    return var5;
                }
                var4.method2467((byte) -75);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static void method1973(int arg0) {
        field4232 = null;
        if (arg0 != 1) {
            method1972(true, 118);
        }
        field4231 = null;
        field4233 = null;
        field4221 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLnq;)V")
    public static final void method1974(byte arg0, class268 arg1) {
        int var2 = 92 % ((-19 - arg0) / 33);
        ++field4223;
        class328.field4544 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field4226;
        if (!arg0) {
            method1972(true, -113);
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            for (int var4 = 0; var4 < class269.field3751; ++var4) {
                int var5 = class296.field4148[var4];
                int var6 = class277.field3873[arg1];
                int var7 = this.field4225 * var5 >> 12;
                int var8 = this.field4229 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4225) * this.field4225;
                int var10 = var6 % (4096 / this.field4229) * this.field4229;
                if (~this.field4222 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4222 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4222 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field4220;
        if (arg1 > 50) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field4222 = arg0.method174(255);
                    }
                } else {
                    this.field4229 = arg0.method172((byte) 52);
                }
            } else {
                this.field4225 = arg0.method172((byte) 52);
            }
        }
    }
}
