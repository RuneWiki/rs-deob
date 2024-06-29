import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class505 extends class5 {

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    private int field6679 = 2048;

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
    private int field6687 = 0;

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
    private int field6685 = 0;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
    private int field6684 = 2048;

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
    private int field6690 = 8192;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "I")
    private int field6686 = 4096;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
    private int field6691 = 12288;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!jo", name = "V", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILes;I)V", line = 3)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6690 = arg1.method3470(arg0 ^ 13110);
                                }
                            } else {
                                this.field6686 = arg1.method3470(13111);
                            }
                        } else {
                            this.field6691 = arg1.method3470(13111);
                        }
                    } else {
                        this.field6684 = arg1.method3470(13111);
                    }
                } else {
                    this.field6687 = arg1.method3470(13111);
                }
            } else {
                this.field6685 = arg1.method3470(13111);
            }
        } else {
            this.field6679 = arg1.method3470(13111);
        }
        ++field6678;
        if (arg0 != 1) {
            method2715(-42, (String) null, -6);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 82)
    public final void method46(int arg0) {
        class205.method1241(0);
        int var2 = 68 % ((arg0 - 64) / 60);
        ++field6681;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 94)
    public class505() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 97)
    public static final int method2715(int arg0, String arg1, int arg2) {
        ++field6683;
        return arg0 != -4096 ? 38 : class393.method2110(arg1, true, arg2, (byte) 124);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BII)Z", line = 110)
    private final boolean method2716(byte arg0, int arg1, int arg2) {
        ++field6682;
        int var4 = (-arg1 + arg2) * this.field6691 >> 12;
        if (arg0 != 127) {
            method2715(-41, (String) null, 9);
        }
        int var5 = class100.field1358[(var4 * 255 & 1046473) >> 12];
        int var6 = (var5 << 12) / this.field6691;
        int var7 = (var6 << 12) / this.field6690;
        int var8 = this.field6686 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && ~(arg1 - -arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Z", line = 133)
    private final boolean method2717(int arg0, int arg1, int arg2) {
        ++field6692;
        int var4 = (arg1 + arg2) * this.field6691 >> 12;
        int var5 = -64 % ((arg0 - 67) / 47);
        int var6 = class100.field1358[(1045411 & var4 * 255) >> 12];
        int var7 = (var6 << 12) / this.field6691;
        int var8 = (var7 << 12) / this.field6690;
        int var9 = this.field6686 * var8 >> 12;
        return ~(-arg1 + arg2) > ~var9 && ~(-arg1 + arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I", line = 150)
    public final int[] method39(int arg0, int arg1) {
        ++field6689;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = 3 % ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int var5 = class272.field3439[arg1] + -2048;
            for (int var6 = 0; class657.field9287 > var6; ++var6) {
                int var7 = class269.field3405[var6] + -2048;
                int var8 = this.field6679 + var7;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = this.field6685 + var5;
                int var12 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var13 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var14 = var7 - -this.field6687;
                int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 + -4096;
                int var17 = this.field6684 + var5;
                int var18 = ~var17 <= 2047 ? var17 : var17 + 4096;
                int var19 = ~var18 < -2049 ? var18 + -4096 : var18;
                var3[var6] = !this.method2716((byte) 127, var10, var13) && !this.method2717(-83, var16, var19) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(IZ)Lit;", line = 224)
    public static final class517 method2718(int arg0, boolean arg1) {
        ++field6688;
        if (!arg1) {
            return null;
        } else {
            class517 var2 = (class517) class150.field1923.method684((byte) 97, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class689.field9770.method3365(0, -107, arg0);
                if (var3 != null && var3.length > 1) {
                    class517 var4;
                    try {
                        var4 = class671.method3768(var3, -49);
                    } catch (Exception var6) {
                        throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                    }
                    class150.field1923.method681(var4, false, (long) arg0);
                    return var4;
                } else {
                    return null;
                }
            }
        }
    }
}
