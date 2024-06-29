import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class320 extends class214 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    private int field4373 = 1;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    private int field4379 = 1;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field4378 = 204;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Ljj;")
    public static class237 field4376;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Laq;")
    public static class385 field4372;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V", line = 5)
    public static void method1929(int arg0) {
        field4372 = null;
        field4376 = null;
        if (arg0 <= 15) {
            method1929(-86);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 206)
    public class320() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I", line = 23)
    public final int[] method14(byte arg0, int arg1) {
        ++field4374;
        int[] var3 = super.field3024.method2585(arg1, arg0 ^ 123);
        if (arg0 != 123) {
            return null;
        } else {
            if (super.field3024.field6135) {
                for (int var4 = 0; ~class399.field5585 < ~var4; ++var4) {
                    int var5 = class436.field5989[var4];
                    int var6 = class56.field909[arg1];
                    int var7 = this.field4379 * var5 >> 12;
                    int var8 = this.field4373 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field4379) * this.field4379;
                    int var10 = var6 % (4096 / this.field4373) * this.field4373;
                    if (this.field4378 > var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field4378) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field4378 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Llk;II)V", line = 109)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 < -114) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field4378 = arg0.method2508(true);
                    }
                } else {
                    this.field4373 = arg0.method2503(true);
                }
            } else {
                this.field4379 = arg0.method2503(true);
            }
            ++field4375;
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 153)
    public static final void method1930(int arg0) {
        ++field4377;
        if (arg0 != 28314) {
            method1929(89);
        }
        if (~class14.field221.toLowerCase().indexOf("microsoft") != 0) {
            class203.field2916[186] = 57;
            class203.field2916[187] = 27;
            class203.field2916[219] = 42;
            class203.field2916[220] = 74;
            class203.field2916[192] = 58;
            class203.field2916[190] = 72;
            class203.field2916[222] = 59;
            class203.field2916[188] = 71;
            class203.field2916[223] = 28;
            class203.field2916[221] = 43;
            class203.field2916[189] = 26;
            class203.field2916[191] = 73;
        } else {
            class203.field2916[47] = 73;
            class203.field2916[61] = 27;
            class203.field2916[45] = 26;
            class203.field2916[91] = 42;
            class203.field2916[93] = 43;
            class203.field2916[44] = 71;
            class203.field2916[92] = 74;
            class203.field2916[59] = 57;
            if (class14.field237 == null) {
                class203.field2916[192] = 58;
                class203.field2916[222] = 59;
            } else {
                class203.field2916[520] = 59;
                class203.field2916[222] = 58;
                class203.field2916[192] = 28;
            }
            class203.field2916[46] = 72;
        }
    }
}
