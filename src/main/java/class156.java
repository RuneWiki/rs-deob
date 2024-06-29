import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class156 implements class294 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lkr;")
    public static class602 field2188 = new class602(106, -1);

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "F")
    public static float field2196;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
    public boolean field2187;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method979(int arg0) {
        if (arg0 <= 17) {
            field2197 = 37;
        }
        field2188 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILha;IIILts;)V")
    public static final void method980(int arg0, class548 arg1, int arg2, int arg3, int arg4, class220 arg5) {
        if (arg4 >= -8) {
            method979(51);
        }
        field2191++;
        class7 var6 = class71.field1078.method3008(16030, arg5.field2897);
        if (var6.field66 == -1) {
            return;
        }
        int var7;
        if (arg5.field2911) {
            int var8 = arg5.field2918 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class298 var9 = var6.method31(arg5.field2880, var7, arg1, (byte) 105);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field2938;
        int var11 = arg5.field2887;
        if ((var7 & 0x1) == 1) {
            var11 = arg5.field2938;
            var10 = arg5.field2887;
        }
        int var12 = var9.method1963();
        int var13 = var9.method1961();
        if (var6.field69) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field67 == 0) {
            var9.method1959(arg3, arg0 + 4 - var11 * 4, var12, var13);
        } else {
            var9.method1969(arg3, arg0 + 4 - var11 * 4, var12, var13, 0, var6.field67 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lcr;I)Z")
    public final boolean method981(class294 arg0, int arg1) {
        field2189++;
        if (!(arg0 instanceof class156)) {
            return false;
        }
        class156 var3 = (class156) arg0;
        if (this.field2195 != var3.field2195) {
            return false;
        } else if (this.field2192 != var3.field2192) {
            return false;
        } else if (arg1 != 18498) {
            return false;
        } else if (this.field2194 != var3.field2194) {
            return false;
        } else if (this.field2190 != var3.field2190) {
            return false;
        } else if (this.field2185 != var3.field2185) {
            return false;
        } else if (this.field2193 == var3.field2193) {
            return this.field2187 == var3.field2187;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)J")
    public final long method982(byte arg0) {
        field2186++;
        long[] var2 = class264.field3865;
        if (arg0 != -117) {
            field2196 = 0.007743536F;
        }
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field2195 ^ var3) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field2192 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field2192) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field2194 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field2194 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field2194 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field2194 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field2190) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field2185 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field2185 >> 16)) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field2185 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field2185 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field2193 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field2187 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }
}
