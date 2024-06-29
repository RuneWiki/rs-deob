import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class38 extends class739 {

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Z")
    private boolean field588 = true;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Z")
    private boolean field593 = true;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field587 = 0;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field594 = -1;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Z")
    public static boolean field592 = false;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field595;
        if (arg0 != -23347) {
            this.method223((byte) -78, -32);
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 68);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(arg0 ^ 23365, this.field593 ? class683.field9515 - arg1 : arg1, 0);
            if (!this.field588) {
                class135.method995(var4, 0, var3, 0, class29.field523);
            } else {
                for (int var5 = 0; var5 < class29.field523; ++var5) {
                    var3[var5] = var4[-var5 + class346.field4366];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILvda;)Ljava/lang/String;")
    public static final String method235(int arg0, class184 arg1) {
        if (arg0 > -50) {
            field594 = 12;
        }
        ++field586;
        return arg1.field2552 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field590;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 < 26) {
            field587 = -93;
        }
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, !this.field593 ? arg1 : -arg1 + class683.field9515);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field588) {
                for (int var11 = 0; ~class29.field523 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class29.field523; ++var12) {
                    var8[var12] = var5[-var12 + class346.field4366];
                    var9[var12] = var6[class346.field4366 - var12];
                    var10[var12] = var7[-var12 + class346.field4366];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            method235(14, (class184) null);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field10297 = arg0.method2600((byte) -123) == 1;
                }
            } else {
                this.field593 = arg0.method2600((byte) -124) == 1;
            }
        } else {
            this.field588 = arg0.method2600((byte) -126) == 1;
        }
        ++field591;
    }
}
