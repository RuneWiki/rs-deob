import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class253 extends class5 {

    @OriginalMember(owner = "client!lba", name = "Q", descriptor = "Z")
    public static boolean field3101 = false;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!lba", name = "P", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[ILen;[IIB)Lao;")
    public static final class405 method1479(int arg0, int[] arg1, class478 arg2, int[] arg3, int arg4, byte arg5) {
        ++field3095;
        if (arg5 != 37) {
            field3101 = false;
        }
        if (arg2.method1687(arg5 ^ 63, class117.field1509, class586.field8227)) {
            byte[] var6 = new byte[arg0 * arg4];
            for (int var7 = 0; ~arg0 < ~var7; ++var7) {
                int var8 = arg4 * var7 + arg3[var7];
                for (int var9 = 0; ~arg1[var7] < ~var9; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class405(arg2, arg4, arg0, var6);
        } else {
            int[] var10 = new int[arg0 * arg4];
            for (int var11 = 0; ~arg0 < ~var11; ++var11) {
                int var12 = arg4 * var11 + arg3[var11];
                for (int var13 = 0; var13 < arg1[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class405(arg2, arg4, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field3096;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -112 % ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 0);
            for (int var6 = 0; var6 < class657.field9287; ++var6) {
                var3[var6] = -var5[var6] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        if (!arg1) {
            this.method39(-124, -114);
        }
        ++field3094;
        int[][] var3 = super.field135.method2706(arg0, -66);
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class657.field9287 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)Z")
    public static final boolean method1480(int arg0, int arg1) {
        if (arg0 != -18705) {
            return true;
        } else {
            ++field3099;
            return arg1 == 3 || ~arg1 == -8 || ~arg1 == -11;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
    public class253() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IIII)I")
    public static final int method1481(int arg0, int arg1, int arg2, int arg3) {
        ++field3097;
        if (~class294.field3634 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class656.field9265 + arg3;
            int var7 = arg0 - class656.field9264;
            if (arg1 >= -24) {
                field3101 = false;
            }
            for (class316 var8 = (class316) class656.field9247.method237(118); var8 != null; var8 = (class316) class656.field9247.method245((byte) 94)) {
                if (~var8.field4057 == ~arg2) {
                    int var9 = var8.field4055;
                    int var10 = var8.field4056;
                    int var11 = var9 - -class656.field9265 << 14 | class656.field9264 + var10;
                    int var12 = (var6 - var9) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (var4 < 0 || ~var5 < ~var12) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)[B")
    public static final byte[] method1482(int arg0, byte arg1) {
        ++field3092;
        if (arg1 != -97) {
            return null;
        } else {
            class456 var2 = (class456) class679.field9549.method684((byte) 117, (long) arg0);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg0);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class517.method2801(var4, var7, 126);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class456(var3);
                class679.field9549.method681(var2, false, (long) arg0);
            }
            return var2.field5829;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            ++field3100;
            if (arg2 == 0) {
                super.field120 = ~arg1.method3501(arg0 + -9269) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V")
    public static final void method1483(int arg0, boolean arg1) {
        if (arg1 && class656.field9236 != null) {
            class51.field774 = class656.field9236.field559;
        } else {
            class51.field774 = -1;
        }
        ++field3093;
        class373.field4705 = null;
        class294.field3634 = 0;
        class656.field9236 = null;
        class147.field1887 = null;
        class656.method3675();
        class656.field9247.method247(2);
        class458.field5842 = null;
        class581.field8131 = null;
        class447.field5737 = null;
        class330.field4217 = -1;
        class159.field2060 = null;
        class576.field8039 = null;
        class91.field1281 = -1;
        class456.field5828 = null;
        class389.field4912 = null;
        class305.field3770 = null;
        if (arg0 > 50) {
            class656.field9251 = null;
            class289.field3594 = null;
            if (class656.field9234 != null) {
                class656.field9234.method3776((byte) 124);
                class656.field9234.method3777(64, true, 128);
            }
            if (class656.field9238 != null) {
                class656.field9238.method3755(64, 64, false);
            }
            if (class656.field9239 != null) {
                class656.field9239.method3136(55, 64);
            }
            class452.field5800.method3567(-125, 64);
        }
    }
}
