import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public abstract class class782 extends class568 {

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11421 = new String[] { method5619(method5618("M*bi\u0010\u0012")), method5619(method5618("T8o+")), method5619(method5618("Ac-i.")), method5619(method5618("M*bi\u0015\u0012")), method5619(method5618("M*bi\u0016\u0012")), method5619(method5618("M*bi\u0011\u0012")) };

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "Ljca;")
    public static class715 field11414 = new class715(1);

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field11419 = new String[] { method5619(method5618("_#")), method5619(method5618("^(")), method5619(method5618("\\?")), method5619(method5618("J9")), method5619(method5618("T!")) };

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "I")
    public static int field11411;

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "I")
    public static int field11413;

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
    public int field11415;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "I")
    public static int field11416;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public int field11418;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "Ljava/lang/String;")
    public static String field11420;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "[I")
    public int[] field11412;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "[Lkha;")
    public static class610[] field11417;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIII[FI)V", line = 7)
    public static final void method5614(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        try {
            field11411++;
            if (arg3 > 0 && !class46.method469(arg3, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg4 >= arg1 || class46.method469(arg1, 1010)) {
                int var7 = class766.method5522(false, arg2);
                int var8 = 0;
                int var9 = arg1 <= arg3 ? arg1 : arg3;
                int var10 = arg3 >> 1;
                int var11 = arg1 >> 1;
                float[] var12 = arg5;
                float[] var13 = new float[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Df(arg6, var8, arg0, arg3, arg1, 0, arg2, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg3 * var7;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                float var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var13[var17] = var27 * 0.25F;
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    var12 = var15;
                    arg1 = var11;
                    arg3 = var10;
                    var8++;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field11421[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field11421[1] : field11421[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V", line = 102)
    public static final void method5615(int arg0) {
        try {
            class71[] var1 = class571.field8275;
            synchronized (class571.field8275) {
                int var2 = 0;
                while (true) {
                    if (var2 >= class571.field8275.length) {
                        break;
                    }
                    class571.field8275[var2] = new class71();
                    class97.field1433[var2] = 0;
                    var2++;
                }
            }
            if (arg0 != -2) {
                method5617(-9, 27, (byte) 119);
            }
            field11416++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11421[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V", line = 135)
    public static void method5616(int arg0) {
        try {
            if (arg0 == 15696) {
                field11420 = null;
                field11419 = null;
                field11417 = null;
                field11414 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11421[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIB)V", line = 151)
    public static final void method5617(int arg0, int arg1, byte arg2) {
        try {
            field11413++;
            class551 var3 = class380.method3113(-9, 0L, 15);
            var3.method4086(68);
            var3.field8073 = arg0;
            var3.field8076 = arg1;
            if (arg2 != 18) {
                method5614(-5, 55, 119, 19, 39, null, 48);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11421[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V")
    public abstract void method2166(int arg0, Graphics arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public abstract void method2167(int arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5618(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5619(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
