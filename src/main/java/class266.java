import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class266 {

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4313 = new String[] { method2309(method2308("gs\u000fL|)")), method2309(method2308("gs\u000fL})")), method2309(method2308("gs\u000fLz)")), method2309(method2308("gs\u000fL{)")), method2309(method2308("gs\u000fLx)")), method2309(method2308("oa\u0002\u000e")), method2309(method2308("gs\u000fL\u0005hz\u0007\u0016\u0007)")), method2309(method2308("z:@LD")) };

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4310 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "Lhl;")
    public static class556 field4312 = new class556(84, -2);

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "Lgda;")
    public static class58 field4311;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V", line = 8)
    public final void method2303(int arg0, int arg1) {
        try {
            OpenGL.glNewList(this.field4304 + arg0, 4864);
            field4307++;
            if (arg1 != 8334) {
                field4310 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4313[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)V", line = 21)
    public final void method2304(boolean arg0) {
        try {
            if (arg0) {
                field4305 = null;
            }
            field4309++;
            OpenGL.glEndList();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4313[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 33)
    public static final void method2305(int arg0) {
        try {
            field4308++;
            if (class497.field7466 != -1 && class233.field3611 != -1) {
                int var1 = ((class795.field11622 - class26.field284) * class172.field2759 >> 16) + class26.field284;
                class172.field2759 += var1;
                if (class172.field2759 < 65535) {
                    class235.field3625 = false;
                    class312.field5113 = false;
                } else {
                    if (class312.field5113) {
                        class235.field3625 = false;
                    } else {
                        class235.field3625 = true;
                    }
                    class172.field2759 = 65535;
                    class312.field5113 = true;
                }
                float var2 = (float) class172.field2759 / 65535.0F;
                float[] var3 = new float[3];
                int var4 = class612.field8802 * 2;
                for (int var5 = 0; var5 < 3; var5++) {
                    int var6 = class665.field9470[class497.field7466][var4][var5] * 3;
                    int var7 = class665.field9470[class497.field7466][var4 + 1][var5] * 3;
                    int var8 = (class665.field9470[class497.field7466][var4 + 2][var5] + class665.field9470[class497.field7466][var4 - -2][var5] - class665.field9470[class497.field7466][var4 + 3][var5]) * 3;
                    int var9 = class665.field9470[class497.field7466][var4][var5];
                    int var10 = var7 - var6;
                    int var11 = var6 + var8 - (var7 * 2);
                    int var12 = class665.field9470[class497.field7466][var4 + 2][var5] + var7 - var9 - var8;
                    var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
                }
                class396.field6285 = (int) var3[1] * -1;
                class791.field11550 = (int) var3[0] - (class397.field6289 * 512);
                class133.field1896 = (int) var3[2] - class141.field2011 * 512;
                float[] var13 = new float[3];
                int var14 = class344.field5598 * arg0;
                for (int var15 = 0; var15 < 3; var15++) {
                    int var16 = class665.field9470[class233.field3611][var14][var15] * 3;
                    int var17 = class665.field9470[class233.field3611][var14 + 1][var15] * 3;
                    int var18 = (-class665.field9470[class233.field3611][var14 + 3][var15] - (-class665.field9470[class233.field3611][var14 + 2][var15] - class665.field9470[class233.field3611][var14 + 2][var15])) * 3;
                    int var19 = class665.field9470[class233.field3611][var14][var15];
                    int var20 = var17 - var16;
                    int var21 = var16 + var18 - (var17 * 2);
                    int var22 = class665.field9470[class233.field3611][var14 + 2][var15] + var17 - var19 - var18;
                    var13[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var20) * var2 + (float) var19;
                }
                float var23 = var13[0] - var3[0];
                float var24 = (var13[1] - var3[1]) * -1.0F;
                float var25 = var13[2] - var3[2];
                double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
                class134.field1902 = (int) (Math.atan2((double) var24, var26) * 2607.5945876176133D) & 0x3FFF;
                class728.field10661 = (int) (-Math.atan2((double) var23, (double) var25) * 2607.5945876176133D) & 0x3FFF;
                class554.field8109 = ((class665.field9470[class497.field7466][var4 + 2][3] - class665.field9470[class497.field7466][var4][3]) * class172.field2759 >> 16) + class665.field9470[class497.field7466][var4][3];
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field4313[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V", line = 132)
    public static void method2306(int arg0) {
        try {
            field4310 = null;
            field4312 = null;
            field4311 = null;
            field4305 = null;
            if (arg0 > -11) {
                method2306(44);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4313[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IC)V", line = 147)
    public final void method2307(int arg0, char arg1) {
        try {
            if (arg0 == -1) {
                OpenGL.glCallList(this.field4304 + arg1);
                field4306++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4313[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lvf;I)V", line = 169)
    public class266(class159 arg0, int arg1) {
        try {
            this.field4304 = OpenGL.glGenLists(arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4313[6] + (arg0 == null ? field4313[5] : field4313[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2308(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2309(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
