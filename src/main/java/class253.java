import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class253 extends class300 {

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    private int field4133 = 204;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    private int field4135 = 1;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    private int field4130 = 1;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4131 = "wave:";

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[I")
    public static int[] field4134 = new int[8];

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
    public static final void method1798(int arg0, int arg1, int arg2) {
        ++field4139;
        class110.field1596[arg0] = arg1;
        if (arg2 >= -28) {
            field4131 = null;
        }
        class290 var3 = (class290) class7.field98.method1064(-1, (long) arg0);
        if (var3 != null) {
            if (var3.field4675 != 4611686018427387905L) {
                var3.field4675 = 4611686018427387904L | class98.method665(true) + 500L;
                return;
            }
        } else {
            class290 var4 = new class290(4611686018427387905L);
            class7.field98.method1054(-3510, var4, (long) arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field4132;
        if (arg1 >= -43) {
            this.method99(55, 37);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field4133 = arg0.method1186((byte) -78);
                }
            } else {
                this.field4135 = arg0.method1218(121);
            }
        } else {
            this.field4130 = arg0.method1218(70);
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1799(int arg0) {
        field4131 = null;
        if (arg0 != -8768) {
            method1799(54);
        }
        field4134 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        int[] var3 = super.field4797.method217(arg0, true);
        ++field4138;
        if (super.field4797.field470) {
            for (int var4 = 0; class180.field2826 > var4; ++var4) {
                int var5 = class5.field73[var4];
                int var6 = this.field4130 * var5 >> 12;
                int var7 = var5 % (4096 / this.field4130) * this.field4130;
                int var8 = class235.field3797[arg0];
                int var9 = var8 % (4096 / this.field4135) * this.field4135;
                int var10 = this.field4135 * var8 >> 12;
                if (~this.field4133 < ~var9) {
                    for (var6 -= var10; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (~var6 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4133 < ~var7) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var7 < this.field4133) {
                    int var11;
                    for (var11 = var6 - var10; ~var11 > -1; var11 += 4) {
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
        if (arg1 != -957953300) {
            method1799(-43);
        }
        return var3;
    }
}
