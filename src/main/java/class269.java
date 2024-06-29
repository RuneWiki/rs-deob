import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class269 {

    @OriginalMember(owner = "client!id", name = "n", descriptor = "J")
    public long field3992 = 0L;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    public static int[] field3990 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
    public static int[] field3988 = new int[32];

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lhi;")
    public static class192 field3982 = new class192();

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lqc;")
    public static class99 field3998 = new class99(100);

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Ldn;")
    public class132 field3987;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Ldn;")
    public class132 field3995;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[Lpn;")
    public static class170[] field3997;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[[[I")
    public static int[][][] field3994;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZII)I", line = 9)
    public static final int method1851(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1) {
            return 127;
        } else {
            field3984++;
            return (arg3 >> 1) + (arg0 >> 5 << 7) + (arg2 >> 2 << 10);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 40)
    public static void method1852(byte arg0) {
        field3990 = null;
        int var1 = -80 / ((arg0 + 23) / 51);
        field3998 = null;
        field3994 = (int[][][]) null;
        field3997 = null;
        field3982 = null;
        field3988 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)J", line = 71)
    public static final long method1853(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        return var3 == null || var3.field2873 == null ? 0L : var3.field2873.field69;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z", line = 79)
    public static final boolean method1854(byte arg0, int arg1) {
        field3981++;
        if (class157.field2170[arg1]) {
            return true;
        } else if (class89.field1258.method969(0, arg1)) {
            int var2 = class89.field1258.method970(-79, arg1);
            if (var2 == 0) {
                class157.field2170[arg1] = true;
                return true;
            }
            if (class241.field3419[arg1] == null) {
                class241.field3419[arg1] = new class344[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class241.field3419[arg1][var3] == null) {
                    byte[] var4 = class89.field1258.method955(arg1, var3, -21853);
                    if (var4 != null) {
                        class344 var5 = class241.field3419[arg1][var3] = new class344();
                        var5.field5206 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2378(new class316(var4), (byte) -111);
                        } else {
                            var5.method2381(new class316(var4), (byte) 0);
                        }
                    }
                }
            }
            class157.field2170[arg1] = true;
            if (arg0 >= -88) {
                field3993 = 124;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIBI)V", line = 151)
    public static final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field3983++;
        if (arg8 >= -29) {
            field3997 = (class170[]) null;
        }
        if (arg0 == arg3 && arg4 == arg9 && arg1 == arg6 && arg2 == arg5) {
            class121.method879(arg4, arg3, arg5, arg6, 120, arg7);
            return;
        }
        int var10 = arg3;
        int var11 = arg4 * 3;
        int var12 = arg4;
        int var13 = arg3 * 3;
        int var14 = arg2 * 3;
        int var15 = arg9 * 3;
        int var16 = arg1 * 3;
        int var17 = arg5 - (arg4 + var14 - var15);
        int var18 = var11 + var14 - var15 - var15;
        int var19 = arg0 * 3;
        int var20 = var19 - var13;
        int var21 = var13 + var16 - var19 - var19;
        int var22 = arg6 + var19 - arg3 - var16;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var25;
            int var28 = var22 * var26;
            int var29 = var17 * var26;
            int var30 = var18 * var25;
            int var31 = var20 * var24;
            int var32 = var23 * var24;
            int var33 = arg3 + (var27 + var28 + var31 >> 12);
            int var34 = arg4 + (var29 + var32 + var30 >> 12);
            class121.method879(var12, var10, var34, var33, -113, arg7);
            var12 = var34;
            var10 = var33;
        }
    }
}
