import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class92 extends class317 {

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    private int field1275 = 4096;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    private int field1283 = 4096;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    private int field1282 = 4096;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1273 = "Opened title screen";

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "Z")
    public static boolean field1272 = false;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Z")
    public static boolean field1271 = false;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "Lkm;")
    public static class133 field1281;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Lwa;")
    public static class80 field1279;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "[I")
    public static int[] field1280;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lcg;II)V", line = 8)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = -33 % ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field1282 = arg0.method2220((byte) 50);
        } else if (arg2 == 1) {
            this.field1275 = arg0.method2220((byte) 113);
        } else if (arg2 == 2) {
            this.field1283 = arg0.method2220((byte) 127);
        }
        field1278++;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 56)
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILin;)V", line = 63)
    public static final void method692(int arg0, class344 arg1) {
        field1276++;
        int var2 = arg1.field5317;
        if (arg0 >= -100) {
            return;
        }
        if (var2 == 324) {
            if (class65.field852 == -1) {
                class295.field4384 = arg1.field5199;
                class65.field852 = arg1.field5247;
            }
            if (class266.field3882.field825) {
                arg1.field5247 = class65.field852;
            } else {
                arg1.field5247 = class295.field4384;
            }
        } else if (var2 == 325) {
            if (class65.field852 == -1) {
                class65.field852 = arg1.field5247;
                class295.field4384 = arg1.field5199;
            }
            if (class266.field3882.field825) {
                arg1.field5247 = class295.field4384;
            } else {
                arg1.field5247 = class65.field852;
            }
        } else if (var2 == 327) {
            arg1.field5172 = 150;
            arg1.field5241 = (int) (Math.sin((double) class329.field4966 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field5201 = -1;
            arg1.field5304 = 5;
        } else if (var2 == 328) {
            if (class173.field2356.field3439 == null) {
                arg1.field5201 = 0;
            } else {
                arg1.field5172 = 150;
                arg1.field5241 = (int) (Math.sin((double) class329.field4966 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field5304 = 5;
                arg1.field5201 = ((int) class77.method584(class173.field2356.field3439, 95) << 11) + 2047;
                arg1.field5233 = 0;
                arg1.field5272 = class173.field2356.field3719;
                arg1.field5205 = class173.field2356.field3689;
                arg1.field5328 = class173.field2356.field3725;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V", line = 150)
    public static void method693(boolean arg0) {
        field1281 = null;
        field1279 = null;
        field1273 = null;
        field1280 = null;
        if (arg0) {
            method694(88, 1, 104, 24, 61, -8, 81);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V", line = 168)
    public static final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class209 var7 = new class209();
        var7.field3020 = arg1 / 128;
        var7.field3006 = arg2 / 128;
        var7.field3026 = arg3 / 128;
        var7.field3009 = arg4 / 128;
        var7.field3004 = arg0;
        var7.field3016 = arg1;
        var7.field3024 = arg2;
        var7.field3019 = arg3;
        var7.field3010 = arg4;
        var7.field3005 = arg5;
        var7.field3008 = arg6;
        class190.field2621[class22.field285++] = var7;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I", line = 187)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = 33 / ((-arg0 - 31) / 37);
        field1277++;
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 59, arg1);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class326.field4933; var12++) {
                int var13 = var7[var12];
                int var14 = var6[var12];
                int var15 = var9[var12];
                if (var13 == var15 && var14 == var15) {
                    var8[var12] = this.field1282 * var13 >> 12;
                    var10[var12] = this.field1275 * var15 >> 12;
                    var11[var12] = this.field1283 * var14 >> 12;
                } else {
                    var8[var12] = this.field1282;
                    var10[var12] = this.field1275;
                    var11[var12] = this.field1283;
                }
            }
        }
        return var4;
    }
}
