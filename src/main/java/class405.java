import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class405 extends class354 {

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    private int field5961 = 8192;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    private int field5959 = 2048;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    private int field5960 = 4096;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    private int field5958 = 12288;

    @OriginalMember(owner = "client!iu", name = "T", descriptor = "I")
    private int field5969 = 2048;

    @OriginalMember(owner = "client!iu", name = "U", descriptor = "I")
    private int field5970 = 0;

    @OriginalMember(owner = "client!iu", name = "Q", descriptor = "I")
    private int field5966 = 0;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "[I")
    public static int[] field5957 = new int[8];

    @OriginalMember(owner = "client!iu", name = "O", descriptor = "I")
    public static int field5964 = 0;

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!iu", name = "P", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!iu", name = "R", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!iu", name = "S", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!iu", name = "V", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!iu", name = "N", descriptor = "Lki;")
    public static class497 field5963;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        ++field5968;
        class291.method1807(arg0);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
    public class405() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BII)Z")
    private final boolean method2520(byte arg0, int arg1, int arg2) {
        ++field5971;
        int var4 = (arg2 - arg1) * this.field5958 >> 12;
        int var5 = class461.field6801[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field5958;
        int var7 = (var6 << 12) / this.field5961;
        if (arg0 <= 92) {
            return false;
        } else {
            int var8 = this.field5960 * var7 >> 12;
            return ~(arg1 + arg2) > ~var8 && ~(-var8) > ~(arg1 - -arg2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
    public static void method2521(int arg0) {
        field5963 = null;
        if (arg0 <= 54) {
            field5963 = null;
        }
        field5957 = null;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IIB)Z")
    private final boolean method2522(int arg0, int arg1, byte arg2) {
        if (arg2 >= -13) {
            return true;
        } else {
            ++field5967;
            int var4 = (arg0 + arg1) * this.field5958 >> 12;
            int var5 = class461.field6801[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field5958;
            int var7 = (var6 << 12) / this.field5961;
            int var8 = this.field5960 * var7 >> 12;
            return ~var8 < ~(-arg0 + arg1) && -var8 < arg1 - arg0;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field5965;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            this.method206(34, (class303) null, -1);
        }
        if (super.field5357.field1869) {
            int var4 = class278.field4009[arg0] - 2048;
            for (int var5 = 0; ~var5 > ~class404.field5952; ++var5) {
                int var6 = class154.field2358[var5] - 2048;
                int var7 = this.field5959 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field5970 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field5966 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field5969 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method2520((byte) 118, var9, var12) && !this.method2522(var15, var18, (byte) -63) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            this.method206(19, (class303) null, 8);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field5961 = arg1.method1868(0);
                                }
                            } else {
                                this.field5960 = arg1.method1868(0);
                            }
                        } else {
                            this.field5958 = arg1.method1868(0);
                        }
                    } else {
                        this.field5969 = arg1.method1868(arg0 + -15180);
                    }
                } else {
                    this.field5966 = arg1.method1868(0);
                }
            } else {
                this.field5970 = arg1.method1868(arg0 + -15180);
            }
        } else {
            this.field5959 = arg1.method1868(0);
        }
        ++field5962;
    }
}
