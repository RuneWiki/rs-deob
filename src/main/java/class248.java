import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class248 implements class276 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3078 = -1;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lcq;")
    public static class110 field3075 = new class110(85, 8);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    public static int[] field3082 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
    public boolean field3071;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[[B")
    public static byte[][] field3079;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIBII)Z")
    public static final boolean method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field3077++;
        if (arg8 >= (arg2 + arg3) || arg2 >= (arg1 + arg8)) {
            return false;
        } else if ((arg0 + arg4) > arg5 && arg4 < (arg5 + arg7)) {
            return arg6 == 116 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ICI)C")
    public static final char method1462(int arg0, char arg1, int arg2) {
        field3073++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 != -14799) {
            method1463(true);
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public static void method1463(boolean arg0) {
        if (arg0) {
            method1463(true);
        }
        field3079 = null;
        field3082 = null;
        field3075 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lso;Z)Z")
    public final boolean method1464(class276 arg0, boolean arg1) {
        field3080++;
        if (!(arg0 instanceof class248)) {
            return false;
        }
        class248 var3 = (class248) arg0;
        if (this.field3081 != var3.field3081) {
            return false;
        } else if (this.field3076 != var3.field3076) {
            return false;
        } else if (this.field3070 != var3.field3070) {
            return false;
        } else if (!arg1) {
            return true;
        } else if (this.field3072 != var3.field3072) {
            return false;
        } else if (this.field3068 != var3.field3068) {
            return false;
        } else if (this.field3074 == var3.field3074) {
            return var3.field3071 == this.field3071;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
    public final long method1465(boolean arg0) {
        field3069++;
        long[] var2 = class85.field861;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field3081) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3076 >> 8)) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field3076) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field3070 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field3070 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field3070 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field3070 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field3072 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field3068 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field3068 >> 16)) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field3068 >> 8)) & 0xFFL)];
        if (!arg0) {
            this.field3070 = -126;
        }
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field3068) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3074 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field3071 ? 1 : 0)) & 0xFFL)];
    }
}
