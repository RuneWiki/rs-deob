import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class162 implements class309 {

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field1893 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1895 = 255;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lsj;")
    public static class432 field1890;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Z")
    public boolean field1892;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)J", line = 3)
    public final long method1029(boolean arg0) {
        field1881++;
        if (!arg0) {
            this.field1889 = -118;
        }
        long[] var2 = class116.field1341;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field1889) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field1884 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field1884) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field1882 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field1882 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field1882 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field1882) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1887) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field1883 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field1883 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field1883 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field1883) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field1880) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field1892 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILuk;)Z", line = 34)
    public final boolean method1030(int arg0, class309 arg1) {
        field1891++;
        if (!(arg1 instanceof class162)) {
            return false;
        }
        int var3 = -26 % ((84 - arg0) / 39);
        class162 var4 = (class162) arg1;
        if (this.field1889 != var4.field1889) {
            return false;
        } else if (this.field1884 != var4.field1884) {
            return false;
        } else if (this.field1882 != var4.field1882) {
            return false;
        } else if (this.field1887 != var4.field1887) {
            return false;
        } else if (this.field1883 != var4.field1883) {
            return false;
        } else if (this.field1880 == var4.field1880) {
            return var4.field1892 == this.field1892;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 78)
    public static void method1031(boolean arg0) {
        if (arg0) {
            field1895 = -17;
        }
        field1893 = null;
        field1890 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIIIII)Lts;", line = 99)
    public static final class33 method1032(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1885++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg6 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg5 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 475427L;
        if (arg0 != -24) {
            return null;
        }
        class33 var9 = (class33) class372.field5043.method2295(var7, (byte) 74);
        if (var9 == null) {
            class33 var10 = class276.field3581.method763(arg5, arg1, arg4, arg2, arg6, arg3);
            class372.field5043.method2294(var10, (byte) 121, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLa;Lwo;Lwo;Lwo;)Z", line = 119)
    public static final boolean method1033(byte arg0, class229 arg1, class285 arg2, class285 arg3, class285 arg4) {
        class284.field3716 = arg1;
        class274.field3543 = arg2;
        field1886++;
        int var5 = 33 % ((arg0 - 55) / 58);
        class72.field896 = arg3;
        class291.field3843 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIII)V", line = 142)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 128) {
            return;
        }
        if (arg3 == arg9 && arg0 == arg6 && arg5 == arg8 && arg4 == arg7) {
            class218.method1324(arg3, (byte) 125, arg6, arg1, arg4, arg8);
        } else {
            int var10 = arg3;
            int var11 = arg6;
            int var12 = arg3 * 3;
            int var13 = arg6 * 3;
            int var14 = arg9 * 3;
            int var15 = arg0 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 * 3;
            int var18 = arg8 + var14 - arg3 - var16;
            int var19 = arg4 + var15 - arg6 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg3 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg6;
                class218.method1324(var10, (byte) -46, var11, arg1, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        field1894++;
    }
}
