import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class196 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[[B")
    public static byte[][] field3142 = new byte[1000][];

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lje;")
    public static class278 field3145 = new class278(1, 2, 2, 0);

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
    public static boolean field3151 = false;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lcd;")
    public static class208 field3146 = new class208("", 12);

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Los;")
    public static class309 field3152 = new class309("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lph;")
    public static class459 field3149;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field3148;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3153;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
    public static boolean field3150;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(FB)F")
    public static final float method1317(float arg0, byte arg1) {
        if (arg1 == 59) {
            field3147++;
            return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
        } else {
            return -1.5875583F;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        field3148 = null;
        field3146 = null;
        field3142 = null;
        field3152 = null;
        if (arg0 > -125) {
            field3146 = null;
        }
        field3145 = null;
        field3149 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILza;IIII)V")
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, class288 arg4, int arg5, int arg6, int arg7, int arg8) {
        field3144++;
        class425 var9 = (class425) class211.method1435(arg5, arg7, arg1);
        if (var9 != null) {
            class306 var10 = class123.field2142.method1530((byte) -65, var9.method224(-10848));
            int var11 = var9.method231(38) & 0x3;
            int var12 = var9.method225(false);
            if (var10.field4597 == -1) {
                int var13 = arg3;
                if (var10.field4587 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method1804(118, 4, arg8, arg6, var13);
                    } else if (var11 == 1) {
                        arg4.method1810(4, var13, (byte) -72, arg6, arg8);
                    } else if (var11 == 2) {
                        arg4.method1804(111, 4, arg8 + 3, arg6, var13);
                    } else if (var11 == 3) {
                        arg4.method1810(4, var13, (byte) -93, arg6 + 3, arg8);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method1809(arg6, arg8, var13, 1, 1, arg0 ^ 0x1D1D);
                    } else if (var11 == 1) {
                        arg4.method1809(arg6, arg8 + 3, var13, 1, 1, -7456);
                    } else if (var11 == 2) {
                        arg4.method1809(arg6 + 3, arg8 + 3, var13, 1, 1, -7456);
                    } else if (var11 == 3) {
                        arg4.method1809(arg6 + 3, arg8, var13, 1, 1, -7456);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method1810(4, var13, (byte) 77, arg6, arg8);
                    } else if (var11 == 1) {
                        arg4.method1804(126, 4, arg8 + 3, arg6, var13);
                    } else if (var11 == 2) {
                        arg4.method1810(4, var13, (byte) -91, arg6 + 3, arg8);
                    } else if (var11 == 3) {
                        arg4.method1804(114, 4, arg8, arg6, var13);
                    }
                }
            } else {
                class51.method479(var11, arg8, 0, arg6, var10, arg4);
            }
        }
        if (arg0 != -3) {
            return;
        }
        class425 var14 = (class425) class479.method2859(arg5, arg7, arg1, field3153 == null ? (field3153 = method1322("rj")) : field3153);
        if (var14 != null) {
            class306 var15 = class123.field2142.method1530((byte) -68, var14.method224(-10848));
            int var16 = var14.method231(arg0 + 49) & 0x3;
            int var17 = var14.method225(false);
            if (var15.field4597 != -1) {
                class51.method479(var16, arg8, 0, arg6, var15, arg4);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4587 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method1808(arg8, -10151, arg6, arg6 + 3, arg8 + 3, var18);
                } else {
                    arg4.method1808(arg8, -10151, arg6 + 3, arg6, arg8 + 3, var18);
                }
            }
        }
        class425 var19 = (class425) class296.method1911(arg5, arg7, arg1);
        if (var19 == null) {
            return;
        }
        class306 var20 = class123.field2142.method1530((byte) -121, var19.method224(-10848));
        int var21 = var19.method231(84) & 0x3;
        if (var20.field4597 != -1) {
            class51.method479(var21, arg8, 0, arg6, var20, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIFIIFIF)[F")
    public static final float[] method1320(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, float arg7) {
        field3143++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[2] = var11;
        var8[7] = 0.0F;
        var8[6] = -var11;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[5] = arg4;
        float var12 = 1.0F - var10;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg6 * arg6 + (arg0 * arg0)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg6 / var19;
                var14 = (float) (-arg0) / var19;
            }
            var13[8] = var16 * var16 * var17 + var15;
            var13[4] = var15;
            var13[6] = var14 * var16 * var17;
            var13[5] = var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[3] = -var16 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var13[1] = var16 * var18;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[5] *= arg5;
        var9[6] *= arg2;
        var9[0] *= arg7;
        var9[2] *= arg7;
        var9[4] *= arg5;
        var9[8] *= arg2;
        var9[7] *= arg2;
        var9[3] *= arg5;
        var9[1] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lls;I)Lls;")
    public abstract class95 method1097(class95 arg0, int arg1);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1321(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1322(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
