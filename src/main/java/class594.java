import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class594 extends class411 {

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
    private int[] field8344 = new int[512];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field8335 = new int[32];

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field8336 = 0;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lpia;")
    public static class54 field8343;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[J")
    public static long[] field8339;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[Lar;")
    public static class664[] field8345;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3398(int arg0) {
        field8337++;
        int var1 = class472.field6857;
        int[] var2 = class96.field1419;
        for (int var3 = arg0; var3 < var1; var3++) {
            class573 var9 = class279.field4271[var2[var3]];
            if (var9 != null && var9.field1665 > 0) {
                var9.field1665--;
                if (var9.field1665 == 0) {
                    var9.field1633 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class356.field5394; var4++) {
            long var5 = (long) class45.field758[var4];
            class53 var7 = (class53) class332.field4881.method3512(true, var5);
            if (var7 != null) {
                class461 var8 = var7.field847;
                if (var8.field1665 > 0) {
                    var8.field1665--;
                    if (var8.field1665 == 0) {
                        var8.field1633 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 65)
    public static void method3399(int arg0) {
        field8335 = null;
        field8339 = null;
        field8345 = null;
        if (arg0 != 256) {
            field8339 = null;
        }
        field8343 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)Z", line = 81)
    public static final boolean method3400(int arg0, byte arg1, int arg2) {
        field8338++;
        int var3 = -69 / ((-arg1 - 7) / 36);
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFII[FIFIIFI)V", line = 93)
    public final void method2530(float arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        field8346++;
        int var12 = (int) ((float) arg7 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg8 * arg9;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class334.method2141((byte) -126, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field8344[var25];
        int var27 = this.field8344[var24];
        if (arg10 > -38) {
            method3401(64, -106);
        }
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class334.method2141((byte) -91, var32);
            int var37 = this.field8344[var26 + var34];
            int var38 = this.field8344[var26 + var35];
            int var39 = this.field8344[var27 + var34];
            int var40 = this.field8344[var27 + var35];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class334.method2141((byte) -114, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg4[arg2++] = class84.method749(var23, class84.method749(var36, class84.method749(var47, class321.method2084(var33, class636.method3603(this.field8344[var37 + var48], 7), var22, var46, (byte) -41), class321.method2084(var33, class636.method3603(7, this.field8344[var49 + var37]), var22, var45, (byte) -41), true), class84.method749(var47, class321.method2084(var32, class636.method3603(7, this.field8344[var38 + var48]), var22, var46, (byte) -41), class321.method2084(var32, class636.method3603(7, this.field8344[var49 + var38]), var22, var45, (byte) -41), true), true), class84.method749(var36, class84.method749(var47, class321.method2084(var33, class636.method3603(7, this.field8344[var39 + var48]), var21, var46, (byte) -41), class321.method2084(var33, class636.method3603(this.field8344[var49 + var39], 7), var21, var45, (byte) -41), true), class84.method749(var47, class321.method2084(var32, class636.method3603(this.field8344[var40 + var48], 7), var21, var46, (byte) -41), class321.method2084(var32, class636.method3603(this.field8344[var40 + var49], 7), var21, var45, (byte) -41), true), true), true) * arg1;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 183)
    public static final void method3401(int arg0, int arg1) {
        field8341++;
        class118 var2 = class86.method755(true, 8, arg1);
        var2.method936(arg0 - 7);
        if (arg0 != 7) {
            field8335 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V", line = 207)
    public class594(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field8344[var3] = this.field8344[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field8344[var5];
            this.field8344[var5] = this.field8344[var5 + 256] = this.field8344[var4];
            this.field8344[var4] = this.field8344[var4 + 256] = var6;
        }
    }
}
