import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class161 extends class23 {

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    private int field3040 = 1;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    private int field3038 = 0;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Ldc;")
    public static class37 field3044 = class185.method1233((byte) 86, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3045 = new CRC32();

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "J")
    public static long field3050 = 0L;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "Ldc;")
    private static class37 field3052 = class185.method1233((byte) 86, "Cancel");

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "Ldc;")
    public static class37 field3046 = field3052;

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "Ldc;")
    public static class37 field3053 = class185.method1233((byte) 86, " ");

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "Lwa;")
    public static class238 field3048;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "Ldj;")
    public static class44 field3047;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "Z")
    public static boolean field3049;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        class74.method521(2);
        ++field3037;
        if (arg0 != -21746) {
            field3052 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            field3049 = true;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field3040 = arg0.method215(-1797813752);
                }
            } else {
                this.field3039 = arg0.method215(-1797813752);
            }
        } else {
            this.field3038 = arg0.method215(-1797813752);
        }
        ++field3042;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ldc;BIII)V")
    public static final void method1081(class37 arg0, byte arg1, int arg2, int arg3, int arg4) {
        class136 var5 = class229.method1485(arg3, arg2, (byte) -92);
        ++field3041;
        if (var5 != null) {
            int var6 = -4 % ((arg1 - 9) / 58);
            if (var5.field2626 != null) {
                class51 var7 = new class51();
                var7.field1028 = arg0;
                var7.field1042 = var5.field2626;
                var7.field1038 = arg4;
                var7.field1031 = var5;
                class210.method1397(var7, (byte) -126);
            }
            boolean var8 = true;
            if (var5.field2659 > 0) {
                var8 = class66.method484(var5, 205);
            }
            if (var8) {
                if (class135.method941(13417, class107.method699(var5, 67), arg4 - 1)) {
                    if (arg4 == 1) {
                        class49.field970.method1503(230, 2976);
                        ++class224.field4147;
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (~arg4 == -3) {
                        ++class156.field2961;
                        class49.field970.method1503(205, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (~arg4 == -4) {
                        ++class135.field2490;
                        class49.field970.method1503(127, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (~arg4 == -5) {
                        class49.field970.method1503(211, 2976);
                        ++class168.field3204;
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (~arg4 == -6) {
                        class49.field970.method1503(203, 2976);
                        ++class20.field330;
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (arg4 == 6) {
                        ++class29.field539;
                        class49.field970.method1503(39, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (~arg4 == -8) {
                        class49.field970.method1503(187, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                        ++class18.field266;
                    }
                    if (~arg4 == -9) {
                        class49.field970.method1503(156, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                        ++class135.field2489;
                    }
                    if (arg4 == 9) {
                        ++class24.field417;
                        class49.field970.method1503(128, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                    if (arg4 == 10) {
                        ++class114.field2043;
                        class49.field970.method1503(235, 2976);
                        class49.field970.method183(arg3, -1137894376);
                        class49.field970.method197(arg2, (byte) 51);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field3035 = -74;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -111);
        ++field3043;
        if (super.field405.field4114) {
            int var4 = class167.field3196[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class199.field3705 > var6; ++var6) {
                int var7 = class133.field2477[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field3038 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field3040 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field3040;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field3039 != 0) {
                    if (this.field3039 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class107.field1874[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public static void method1082(boolean arg0) {
        field3047 = null;
        field3052 = null;
        field3044 = null;
        field3048 = null;
        field3046 = null;
        field3053 = null;
        if (arg0) {
            field3045 = null;
        }
    }
}
