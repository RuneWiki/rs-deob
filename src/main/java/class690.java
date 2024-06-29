import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class690 extends class585 {

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    private int field9651 = 585;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field9649 = 0;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "Z")
    public static boolean field9654 = false;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;IIIILha;II)V", line = 3)
    public static final void method3900(String arg0, int arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7) {
        if (class772.field10606 == null || class95.field1079 == null) {
            if (class152.field2163.method4349((byte) -102, class741.field10219) && class152.field2163.method4349((byte) -102, class777.field10676)) {
                class772.field10606 = arg5.method551(class1.method5(class152.field2163, class741.field10219, 0), true);
                class1 var8 = class1.method5(class152.field2163, class777.field10676, 0);
                class95.field1079 = arg5.method551(var8, true);
                var8.method6();
                class182.field2809 = arg5.method551(var8, true);
            } else {
                arg5.method495(arg4, arg7, arg1, arg2, 255 - class492.field6977 << 24 | class161.field2560, 1);
            }
        }
        if (arg3 != 0) {
            method3900((String) null, -5, 10, -42, -92, (class65) null, -38, 42);
        }
        ++field9655;
        if (class772.field10606 != null && class95.field1079 != null) {
            int var9 = (-(class95.field1079.method1508() * 2) + arg1) / class772.field10606.method1508();
            for (int var10 = 0; ~var10 > ~var9; ++var10) {
                class772.field10606.method1604(arg4 - (-class95.field1079.method1508() - class772.field10606.method1508() * var10), arg7);
            }
            class95.field1079.method1604(arg4, arg7);
            class182.field2809.method1604(arg1 + (arg4 - class182.field2809.method1508()), arg7);
        }
        class269.field3907.method563(arg0, (byte) 66, -16777216 | class665.field9264, -1, arg7 + 14, arg4 - -3);
        arg5.method495(arg4, arg2 + arg7, arg1, -arg2 + arg6, class161.field2560 | -class492.field6977 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z", line = 47)
    public static final boolean method3901(byte arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            return false;
        } else {
            ++field9653;
            return (33 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lso;II)V", line = 60)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field9651 = arg0.method2998(true);
        }
        ++field9650;
        if (arg1 != 1) {
            method3900((String) null, 59, 43, 102, 32, (class65) null, -85, 82);
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)[I", line = 87)
    public final int[] method55(int arg0, int arg1) {
        ++field9652;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            this.method54((class494) null, 8, 111);
        }
        if (super.field8255.field3677) {
            int var4 = class633.field8892[arg0];
            for (int var5 = 0; var5 < class293.field4278; ++var5) {
                int var6 = class581.field8200[var5];
                if (this.field9651 < var6 && -this.field9651 + 4096 > var6 && 2048 - this.field9651 < var4 && ~var4 > ~(2048 - -this.field9651)) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field9651 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field9651) && ~(this.field9651 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field9651;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field9651);
                } else if (var4 >= this.field9651 && ~var4 >= ~(-this.field9651 + 4096)) {
                    if (this.field9651 <= var6 && ~(-this.field9651 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field9651 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field9651;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field9651 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V", line = 167)
    public class690() {
        super(0, true);
    }
}
