import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class229 implements class100 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lng;")
    public static class190 field3061 = new class190(50);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lqj;")
    public static class296 field3049;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lsh;")
    public static class44 field3054;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    public boolean field3060;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
    public static int[] field3058;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILc;)Z", line = 5)
    public final boolean method706(int arg0, class100 arg1) {
        field3053++;
        if (!(arg1 instanceof class229)) {
            return false;
        }
        int var3 = -20 % ((2 - arg0) / 59);
        class229 var4 = (class229) arg1;
        if (this.field3063 != var4.field3063) {
            return false;
        } else if (this.field3062 != var4.field3062) {
            return false;
        } else if (this.field3051 != var4.field3051) {
            return false;
        } else if (this.field3055 != var4.field3055) {
            return false;
        } else if (this.field3052 != var4.field3052) {
            return false;
        } else if (this.field3059 == var4.field3059) {
            return this.field3060 == var4.field3060;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 47)
    public static void method1440(int arg0) {
        field3058 = null;
        field3054 = null;
        field3061 = null;
        if (arg0 > 96) {
            field3049 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J", line = 71)
    public final long method705(int arg0) {
        field3065++;
        long[] var2 = class32.field493;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3063 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3062 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3062 ^ var7) & 0xFFL)];
        if (arg0 != -12414) {
            this.method706(104, (class100) null);
        }
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field3051 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field3051 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field3051 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field3051 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field3055) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field3052 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field3052 >> 16)) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field3052 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field3052 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3059 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field3060 ? 1 : 0)) & 0xFFL)];
    }
}
