import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class165 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lff;")
    private class62 field2976 = new class62(256);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lff;")
    private class62 field2991 = new class62(256);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lai;")
    private class10 field2983;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lai;")
    private class10 field2988;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[S")
    public static short[] field2975 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2987 = 0;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lkh;")
    public static class117 field2989 = class224.method1450((byte) -116, "(Udns");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2984 = new CRC32();

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[[I")
    public static int[][] field2981;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[B")
    public static byte[][][] field2982;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[II)Lpd;")
    public final class168 method1166(int arg0, int[] arg1, int arg2) {
        field2985++;
        if (this.field2983.method99(58) == 1) {
            return this.method1168(arg0, arg1, 0, 0);
        }
        if (arg2 > -101) {
            field2989 = null;
        }
        if (this.field2983.method108(arg0, 0) != 1) {
            throw new RuntimeException();
        }
        return this.method1168(0, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
    public static final void method1167(int arg0, long arg1) {
        field2979++;
        if (arg0 != -22942) {
            field2975 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class161.method1153(arg1 - 1L, -67);
            class161.method1153(1L, arg0 ^ 0x59E3);
        } else {
            class161.method1153(arg1, -94);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[III)Lpd;")
    private final class168 method1168(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = (arg2 << 4 & 0xFFF8 | arg2 >>> 12) ^ arg0;
        field2992++;
        int var6 = var5 | arg2 << 16;
        if (arg3 != 0) {
            method1172((byte) -120);
        }
        long var7 = (long) var6;
        class168 var9 = (class168) this.field2991.method460(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class59 var10 = class59.method446(this.field2983, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class168 var11 = var10.method444();
            this.field2991.method461(var7, (byte) -106, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field3035.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[I)Lpd;")
    private final class168 method1169(int arg0, int arg1, int arg2, int[] arg3) {
        field2978++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class168 var9 = (class168) this.field2991.method460(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class192 var10 = (class192) this.field2976.method460(var7, 1);
            if (var10 == null) {
                var10 = class192.method1290(this.field2988, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2976.method461(var7, (byte) -79, var10);
            }
            class168 var11 = var10.method1282(arg3);
            if (var11 == null) {
                return null;
            }
            var10.method123((byte) -126);
            if (arg2 > -116) {
                field2981 = null;
            }
            this.field2991.method461(var7, (byte) -43, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIB)Lpd;")
    public final class168 method1170(int[] arg0, int arg1, byte arg2) {
        field2977++;
        if (this.field2988.method99(27) == 1) {
            return this.method1169(0, arg1, -118, arg0);
        } else if (this.field2988.method108(arg1, 0) == 1) {
            return this.method1169(arg1, 0, -120, arg0);
        } else {
            if (arg2 > -66) {
                method1171(54, null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILnc;)Lqa;")
    public static final class176 method1171(int arg0, class145 arg1) {
        field2980++;
        if (arg0 != 0) {
            field2984 = null;
        }
        return new class176(arg1.method1035(arg0 ^ 0xFFFFFF8A), arg1.method1035(-103), arg1.method1035(arg0 ^ 0xFFFFFF9E), arg1.method1035(-110), arg1.method1023(-1002744), arg1.method1023(arg0 - 1002744), arg1.method998(86));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1172(byte arg0) {
        field2981 = null;
        field2984 = null;
        field2989 = null;
        field2975 = null;
        if (arg0 != -10) {
            method1172((byte) 55);
        }
        field2982 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 28223) {
            return;
        }
        if (arg0 == arg4 && arg7 == arg8 && arg1 == arg6 && arg2 == arg3) {
            class172.method1207((byte) -118, arg0, arg8, arg2, arg6, arg5);
        } else {
            int var10 = arg8;
            int var11 = arg0 * 3;
            int var12 = arg8 * 3;
            int var13 = arg0;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = arg1 * 3;
            int var17 = var11 + var16 - var14 - var14;
            int var18 = arg6 + var14 - var16 - arg0;
            int var19 = var14 - var11;
            int var20 = arg7 * 3;
            int var21 = arg2 + var20 - arg8 - var15;
            int var22 = var15 + var12 - var20 - var20;
            int var23 = var20 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var26;
                int var29 = var22 * var25;
                int var30 = var17 * var25;
                int var31 = var19 * var24;
                int var32 = (var30 + var31 + var27 >> 12) + arg0;
                int var33 = var23 * var24;
                int var34 = (var28 + var33 + var29 >> 12) + arg8;
                class172.method1207((byte) -107, var13, var10, var34, var32, arg5);
                var13 = var32;
                var10 = var34;
            }
        }
        field2986++;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lai;Lai;)V")
    public class165(class10 arg0, class10 arg1) {
        this.field2983 = arg0;
        this.field2988 = arg1;
    }
}
