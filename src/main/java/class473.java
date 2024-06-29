import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class473 extends class30 {

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    private int field6498 = 0;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    private int field6502 = 8192;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    private int field6506 = 2048;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    private int field6508 = 0;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    private int field6509 = 12288;

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
    private int field6512 = 4096;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
    private int field6511 = 2048;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6503 = "";

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public static int field6504 = -1;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "Lgca;")
    public static class227 field6500 = new class227();

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    public class473() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field6510;
        if (arg0 != 1) {
            method2666(10);
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = class430.field6016[arg1] + -2048;
            for (int var5 = 0; var5 < class31.field399; ++var5) {
                int var6 = class48.field568[var5] + -2048;
                int var7 = this.field6506 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = var4 - -this.field6508;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field6498 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field6511 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method2663(var9, (byte) -127, var12) && !this.method2665(-37, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)Z")
    private final boolean method2663(int arg0, byte arg1, int arg2) {
        ++field6499;
        int var4 = (-arg0 + arg2) * this.field6509 >> 12;
        int var5 = class76.field995[255 & var4 * 255 >> 12];
        if (arg1 >= -126) {
            this.method27((byte) -115, 92, (class501) null);
        }
        int var6 = (var5 << 12) / this.field6509;
        int var7 = (var6 << 12) / this.field6502;
        int var8 = this.field6512 * var7 >> 12;
        return arg0 + arg2 < var8 && arg0 - -arg2 > -var8;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            this.method29((byte) -89);
        }
        ++field6507;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field6502 = arg2.method2845(-1);
                                }
                            } else {
                                this.field6512 = arg2.method2845(-1);
                            }
                        } else {
                            this.field6509 = arg2.method2845(-1);
                        }
                    } else {
                        this.field6511 = arg2.method2845(-1);
                    }
                } else {
                    this.field6498 = arg2.method2845(-1);
                }
            } else {
                this.field6508 = arg2.method2845(-1);
            }
        } else {
            this.field6506 = arg2.method2845(-1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (~class128.field1831 >= ~arg0 && class529.field7169 >= arg1 && ~arg6 <= ~class469.field6466 && ~arg3 >= ~class533.field7200) {
            class671.method3786(arg5, arg0, arg1, arg4, arg6, arg2, arg3, -21468);
        } else {
            class11.method57(arg4, false, arg0, arg6, arg5, arg2, arg1, arg3);
        }
        ++field6505;
        if (arg7 != -68) {
            method2664(38, 1, 58, 7, -76, 99, 61, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)Z")
    private final boolean method2665(int arg0, int arg1, int arg2) {
        ++field6497;
        int var4 = (arg1 + arg2) * this.field6509 >> 12;
        if (arg0 >= -22) {
            return true;
        } else {
            int var5 = class76.field995[(var4 * 255 & 1046243) >> 12];
            int var6 = (var5 << 12) / this.field6509;
            int var7 = (var6 << 12) / this.field6502;
            int var8 = this.field6512 * var7 >> 12;
            return var8 > -arg2 + arg1 && ~(-var8) > ~(-arg2 + arg1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        class118.method841(0);
        ++field6501;
        if (arg0 >= -10) {
            this.method2663(-120, (byte) 39, -36);
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
    public static void method2666(int arg0) {
        field6500 = null;
        if (arg0 != 8192) {
            field6503 = null;
        }
        field6503 = null;
    }
}
