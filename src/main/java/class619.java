import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class619 extends class734 {

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "[I")
    private int[] field8822 = new int[512];

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8826 = new String[] { method4558(method4557("'Pe&\rn")), method4558(method4557("'Pe&p/Xm|rn")), method4558(method4557("(Chd")), method4558(method4557("'Pe&\bn")), method4558(method4557("=\u0018*&1")), method4558(method4557("'Pe&\u000fn")), method4558(method4557("'Pe&\u000en")) };

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljc;I)V", line = 4)
    public static final void method4553(class711 arg0, int arg1) {
        try {
            field8825++;
            if (arg1 == 255) {
                byte[] var2 = new byte[24];
                if (class397.field5776 != null) {
                    try {
                        class397.field5776.method1166(0L, arg1 - 255);
                        class397.field5776.method1158(var2, (byte) -116);
                        int var3;
                        for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                        }
                        if (var3 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var6) {
                        for (int var4 = 0; var4 < 24; var4++) {
                            var2[var4] = -1;
                        }
                    }
                }
                arg0.method5086(0, var2, 24, -2);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8826[3] + (arg0 == null ? field8826[2] : field8826[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lqo;Z)I", line = 53)
    public static final int method4554(class170 arg0, boolean arg1) {
        try {
            if (arg1) {
                method4554(null, false);
            }
            field8820++;
            if (arg0.field2231 == 0) {
                return 0;
            }
            if (arg0.field2219 != -1) {
                class170 var2 = null;
                if (arg0.field2219 < 32768) {
                    class527 var3 = (class527) class479.field7063.method3693(false, (long) arg0.field2219);
                    if (var3 != null) {
                        var2 = var3.field7672;
                    }
                } else if (arg0.field2219 >= 32768) {
                    var2 = class748.field10666[arg0.field2219 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg0.field2969 - var2.field2969;
                    int var5 = arg0.field2984 - var2.field2984;
                    if (var4 != 0 || var5 != 0) {
                        arg0.method1432(16383, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg0 instanceof class339) {
                class339 var6 = (class339) arg0;
                if (var6.field4921 != -1 && (var6.field2257 == 0 || var6.field2262 > 0)) {
                    var6.method1432(16383, var6.field4921);
                    var6.field4921 = -1;
                }
            } else if (arg0 instanceof class717) {
                class717 var7 = (class717) arg0;
                if (var7.field10213 != -1 && (var7.field2257 == 0 || var7.field2262 > 0)) {
                    int var8 = var7.field2969 - ((var7.field10213 - class537.field7895 - class537.field7895) * 256);
                    int var9 = var7.field2984 - ((var7.field10215 - class655.field9286 - class655.field9286) * 256);
                    if (var8 != 0 || var9 != 0) {
                        var7.method1432(16383, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                    }
                    var7.field10213 = -1;
                }
            }
            return arg0.method1440(false);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field8826[5] + (arg0 == null ? field8826[2] : field8826[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)Z", line = 136)
    public static final boolean method4555(int arg0, int arg1) {
        try {
            field8823++;
            if (arg1 >= -70) {
                return true;
            } else {
                return arg0 != 1 && arg0 != 7;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8826[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(I)V", line = 150)
    public class619(int arg0) {
        try {
            Random var2 = new Random((long) arg0);
            for (int var3 = 0; var3 < 256; var3++) {
                this.field8822[var3] = this.field8822[var3 + 256] = var3;
            }
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = var2.nextInt() & 0xFF;
                int var6 = this.field8822[var5];
                this.field8822[var5] = this.field8822[var5 + 256] = this.field8822[var4];
                this.field8822[var4] = this.field8822[var4 + 256] = var6;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8826[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "([FIIFIIFFFII)V", line = 182)
    public final void method4556(float[] arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10) {
        try {
            field8824++;
            int var12 = (int) ((float) arg9 * arg8 - 1.0F);
            int var13 = var12 & 0xFF;
            int var14 = (int) ((float) arg4 * arg3 - 1.0F);
            int var15 = var14 & 0xFF;
            int var16 = (int) ((float) arg2 * arg7 - 1.0F);
            int var17 = var16 & 0xFF;
            float var18 = (float) arg5 * arg7;
            int var19 = (int) var18;
            int var20 = var19 + 1;
            if (arg1 == 16383) {
                float var21 = var18 - (float) var19;
                float var22 = 1.0F - var21;
                float var23 = class509.method3890((byte) 90, var21);
                int var24 = var20 & var17;
                int var25 = var19 & var17;
                int var26 = this.field8822[var25];
                int var27 = this.field8822[var24];
                for (int var28 = 0; var28 < arg4; var28++) {
                    float var29 = (float) var28 * arg3;
                    int var30 = (int) var29;
                    int var31 = var30 + 1;
                    float var32 = (float) (-var30) + var29;
                    float var33 = 1.0F - var32;
                    int var34 = var30 & var15;
                    int var35 = var31 & var15;
                    float var36 = class509.method3890((byte) 90, var32);
                    int var37 = this.field8822[var34 + var26];
                    int var38 = this.field8822[var35 + var26];
                    int var39 = this.field8822[var27 + var34];
                    int var40 = this.field8822[var27 + var35];
                    for (int var41 = 0; var41 < arg9; var41++) {
                        float var42 = (float) var41 * arg8;
                        int var43 = (int) var42;
                        int var44 = var43 + 1;
                        float var45 = (float) (-var43) + var42;
                        float var46 = 1.0F - var45;
                        int var47 = var43 & var13;
                        float var48 = class509.method3890((byte) 80, var45);
                        int var49 = var44 & var13;
                        arg0[arg10++] = arg6 * class438.method3418(class52.method560(arg1, 16383), class438.method3418(0, class438.method3418(arg1 - 16383, class798.method5754(true, var32, var21, class434.method3377(7, this.field8822[var40 + var49]), var45), var48, class798.method5754(true, var32, var21, class434.method3377(this.field8822[var47 + var40], 7), var46)), var36, class438.method3418(arg1 - 16383, class798.method5754(true, var33, var21, class434.method3377(this.field8822[var39 + var49], 7), var45), var48, class798.method5754(true, var33, var21, class434.method3377(7, this.field8822[var39 + var47]), var46))), var23, class438.method3418(0, class438.method3418(class52.method560(arg1, 16383), class798.method5754(true, var32, var22, class434.method3377(7, this.field8822[var49 + var38]), var45), var48, class798.method5754(true, var32, var22, class434.method3377(this.field8822[var47 + var38], 7), var46)), var36, class438.method3418(0, class798.method5754(true, var33, var22, class434.method3377(7, this.field8822[var49 + var37]), var45), var48, class798.method5754(true, var33, var22, class434.method3377(7, this.field8822[var47 + var37]), var46))));
                    }
                }
            }
        } catch (RuntimeException var51) {
            throw class665.method4799(var51, field8826[6] + (arg0 == null ? field8826[2] : field8826[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4557(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4558(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
