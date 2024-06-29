import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class475 extends class318 {

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "[I")
    private int[] field6024 = new int[512];

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field6029 = 0;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Lpl;")
    public static class612 field6030;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
    public static int[] field6031;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "[Lf;")
    public static class536[] field6026;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 6)
    public static void method2511(int arg0) {
        field6026 = null;
        field6031 = null;
        field6030 = null;
        int var1 = 72 % ((42 - arg0) / 61);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 20)
    public static final String[] method2512(int arg0, String arg1, char arg2) {
        field6034++;
        int var3 = class460.method2454((byte) 41, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg0 > -72) {
            field6030 = null;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)[Lro;", line = 55)
    public static final class170[] method2513(byte arg0) {
        if (arg0 != 58) {
            field6032 = -53;
        }
        if (class304.field3743 == null) {
            class170[] var1 = class162.method933(class590.field8289, arg0 ^ 0x4F);
            class170[] var2 = new class170[var1.length];
            int var3 = 0;
            int var4 = class301.field3698.method136(class651.field9191, (byte) 82);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class170 var9 = var1[var5];
                if ((var9.field2218 <= 0 || var9.field2218 >= 24) && var9.field2216 >= 800 && var9.field2213 >= 600 && (var4 != 2 || var9.field2216 <= 800 && var9.field2213 <= 600) && (var4 != 1 || var9.field2216 <= 1024 && var9.field2213 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class170 var11 = var2[var10];
                        if (var9.field2216 == var11.field2216 && var9.field2213 == var11.field2213) {
                            if (var11.field2218 < var9.field2218) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class304.field3743 = new class170[var3];
            class293.method1639(var2, 0, class304.field3743, 0, var3);
            int[] var6 = new int[class304.field3743.length];
            for (int var7 = 0; var7 < class304.field3743.length; var7++) {
                class170 var8 = class304.field3743[var7];
                var6[var7] = var8.field2216 * var8.field2213;
            }
            class288.method1618(var6, class304.field3743, 124);
        }
        field6033++;
        return class304.field3743;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Les;I)V", line = 138)
    public static final void method2514(class630 arg0, int arg1) {
        field6028++;
        byte[] var2 = new byte[24];
        if (class546.field7273 != null) {
            try {
                class546.field7273.method3555(13755, 0L);
                class546.field7273.method3561(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method3475(65536, 24, arg1, var2);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(FIIIF[FIIFIF)V", line = 179)
    public final void method1828(float arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        field6025++;
        int var12 = (int) ((float) arg7 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg9 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg8;
        int var19 = (int) var18;
        if (arg3 != 7) {
            return;
        }
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class48.method302(var21, (byte) 68);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field6024[var24];
        int var27 = this.field6024[var25];
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class48.method302(var32, (byte) 40);
            int var37 = this.field6024[var26 + var34];
            int var38 = this.field6024[var35 + var26];
            int var39 = this.field6024[var27 + var34];
            int var40 = this.field6024[var35 + var27];
            for (int var41 = 0; var41 < arg7; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class48.method302(var45, (byte) -125);
                int var49 = var44 & var13;
                arg5[arg6++] = arg10 * class368.method2016(var23, class368.method2016(var36, class368.method2016(var48, class556.method3063(var33, -40, class695.method3921(7, this.field6024[var47 + var37]), var22, var46), class688.method3877(arg3, -91), class556.method3063(var33, -125, class695.method3921(this.field6024[var37 + var49], 7), var22, var45)), -61, class368.method2016(var48, class556.method3063(var32, 118, class695.method3921(this.field6024[var38 + var47], 7), var22, var46), -89, class556.method3063(var32, 110, class695.method3921(this.field6024[var38 + var49], 7), var22, var45))), arg3 - 129, class368.method2016(var36, class368.method2016(var48, class556.method3063(var33, 116, class695.method3921(7, this.field6024[var47 - -var39]), var21, var46), -99, class556.method3063(var33, -39, class695.method3921(this.field6024[var39 + var49], 7), var21, var45)), -108, class368.method2016(var48, class556.method3063(var32, 118, class695.method3921(7, this.field6024[var40 + var47]), var21, var46), arg3 + -85, class556.method3063(var32, -32, class695.method3921(7, this.field6024[var40 + var49]), var21, var45))));
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V", line = 345)
    public class475(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6024[var3] = this.field6024[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6024[var5];
            this.field6024[var5] = this.field6024[var5 + 256] = this.field6024[var4];
            this.field6024[var4] = this.field6024[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZII)Z", line = 277)
    public static final boolean method2515(boolean arg0, int arg1, int arg2) {
        field6027++;
        if (!class84.field1188) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class103.field1390[var3] == null || class103.field1390[var3][var4] == null) {
            return false;
        } else if (arg0) {
            return false;
        } else {
            class507 var5 = class103.field1390[var3][var4];
            if (arg2 == -1 && var5.field6735 == 0) {
                for (class145 var6 = (class145) class1.field7.method237(96); var6 != null; var6 = (class145) class1.field7.method245((byte) 23)) {
                    if (var6.field1873 == 45 || var6.field1873 == 1011 || var6.field1873 == 57 || var6.field1873 == 60 || var6.field1873 == 50) {
                        for (class507 var7 = class156.method894(-1018745488, var6.field1868); var7 != null; var7 = class309.method1787((byte) 125, var7)) {
                            if (var5.field6764 == var7.field6764) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class145 var8 = (class145) class1.field7.method237(103); var8 != null; var8 = (class145) class1.field7.method245((byte) 88)) {
                    if (var8.field1869 == arg2 && var5.field6764 == var8.field1868 && (var8.field1873 == 45 || var8.field1873 == 1011 || var8.field1873 == 57 || var8.field1873 == 60 || var8.field1873 == 50)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
