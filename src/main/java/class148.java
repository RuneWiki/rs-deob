import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class148 extends class74 {

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    private int field2286 = 4;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    private int field2288 = 4;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2282 = "";

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2292 = "Loaded input handler";

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "[I")
    public static int[] field2291 = new int[100];

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2294 = "M";

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Luf;")
    public static class176 field2281;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static void method1005(int arg0) {
        if (arg0 == -1) {
            field2281 = null;
            field2292 = null;
            field2291 = null;
            field2282 = null;
            field2294 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        if (arg1 > -112) {
            this.field2288 = -84;
        }
        ++field2284;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int var4 = class178.field2662 / this.field2288;
            int var5 = class209.field3248 / this.field2286;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method592(class209.field3248 * var6 / var5, 0, 127);
            } else {
                var7 = this.method592(0, 0, 103);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; var14 < class178.field2662; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class178.field2662 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var10[var16];
                var12[var14] = var9[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method80((byte) 35, (class37) null, 16);
        }
        ++field2293;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = class178.field2662 / this.field2288;
            int var5 = class209.field3248 / this.field2286;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method590(0, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method590(0, 0, class209.field3248 * var7 / var5);
            }
            for (int var8 = 0; ~class178.field2662 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class178.field2662 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.field2288 = -32;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2286 = arg1.method333((byte) -59);
            }
        } else {
            this.field2288 = arg1.method333((byte) -59);
        }
        ++field2283;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I")
    public static final int method1006(int arg0, int arg1) {
        ++field2285;
        return arg0 != -2 ? -23 : arg1 >>> 8;
    }
}
