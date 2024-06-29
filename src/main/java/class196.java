import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class196 {

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3123 = new String[] { method1806(method1805("}A\u0014G")), method1806(method1805("}A\u0017G")) };

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lvn;")
    public static class330 field3115 = new class330(74, 2);

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    public static int[] field3121 = new int[50];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lwi;")
    public static class493 field3117;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public static int[] field3119;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 8)
    public static void method1803(byte arg0) {
        try {
            field3121 = null;
            if (arg0 != 88) {
                field3119 = null;
            }
            field3117 = null;
            field3119 = null;
            field3115 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3123[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1804(byte arg0) {
        try {
            field3116++;
            if (class200.field3161 == null) {
                class200.field3161 = new int[65536];
                double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
                int var3 = 0;
                for (int var4 = 0; var4 < 512; var4++) {
                    float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
                    for (int var7 = 0; var7 < 128; var7++) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = var12 - (float) var13;
                        float var16 = (1.0F - var6) * var8;
                        float var17 = (1.0F - (var6 * var15)) * var8;
                        float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                        if (var14 == 0) {
                            var9 = var8;
                            var11 = var16;
                            var10 = var18;
                        } else if (var14 == 1) {
                            var10 = var8;
                            var9 = var17;
                            var11 = var16;
                        } else if (var14 == 2) {
                            var9 = var16;
                            var10 = var8;
                            var11 = var18;
                        } else if (var14 == 3) {
                            var11 = var8;
                            var10 = var17;
                            var9 = var16;
                        } else if (var14 == 4) {
                            var9 = var18;
                            var11 = var8;
                            var10 = var16;
                        } else if (var14 == 5) {
                            var11 = var17;
                            var9 = var8;
                            var10 = var16;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                        class200.field3161[var3++] = var25;
                    }
                }
                if (arg0 != -83) {
                    field3120 = 30;
                }
            }
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field3123[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!c", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1805(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!c", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1806(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
