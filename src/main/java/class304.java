import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class304 extends class478 {

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    private int field3760 = 1;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    private int field3758 = 204;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
    private int field3759 = 1;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "Lcq;")
    public static class110 field3763 = new class110(76, -1);

    @OriginalMember(owner = "client!gaa", name = "K", descriptor = "I")
    public static int field3767 = 0;

    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "[Lnp;")
    public static class115[] field3766 = new class115[2048];

    @OriginalMember(owner = "client!gaa", name = "M", descriptor = "Lgb;")
    public static class163 field3769 = new class163();

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!gaa", name = "H", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!gaa", name = "I", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!gaa", name = "L", descriptor = "Loga;")
    public static class183 field3768;

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V", line = 5)
    public class304() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 14)
    public static final int method1756(Random arg0, int arg1, int arg2) {
        ++field3762;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class483.method2792(arg1, arg2 ^ 1304107229)) {
            return (int) (((long) arg0.nextInt() & 4294967295L) * (long) arg1 >> 32);
        } else {
            if (arg2 != -1304107232) {
                method1758((byte) -95);
            }
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class479.method2761(var4, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)[I", line = 50)
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            return null;
        } else {
            ++field3761;
            int[] var3 = super.field6886.method789(arg0, (byte) 125);
            if (super.field6886.field1592) {
                for (int var4 = 0; var4 < class436.field6154; ++var4) {
                    int var5 = class684.field9645[var4];
                    int var6 = class695.field9740[arg0];
                    int var7 = this.field3760 * var5 >> 12;
                    int var8 = this.field3759 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3760) * this.field3760;
                    int var10 = var6 % (4096 / this.field3759) * this.field3759;
                    if (var10 < this.field3758) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field3758 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field3758 > var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(IIB)V", line = 139)
    public static final void method1757(int arg0, int arg1, byte arg2) {
        if (arg2 != 44) {
            field3763 = null;
        }
        ++field3765;
        class76 var3 = class3.method28(15, (byte) 42, 0);
        var3.method403((byte) 82);
        var3.field785 = arg0;
        var3.field789 = arg1;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V", line = 159)
    public static void method1758(byte arg0) {
        field3763 = null;
        field3768 = null;
        field3766 = null;
        int var1 = -72 / ((arg0 - -53) / 52);
        field3769 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILnp;I)V", line = 171)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3758 = arg1.method643((byte) -77);
                }
            } else {
                this.field3759 = arg1.method620((byte) -127);
            }
        } else {
            this.field3760 = arg1.method620((byte) 39);
        }
        if (arg0 != 255) {
            field3766 = null;
        }
        ++field3764;
    }
}
