import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class79 extends class137 {

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "[B")
    public byte[] field1317;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field1314 = new String[100];

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "[[[B")
    public static byte[][][] field1316;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
    public class79(byte[] arg0) {
        this.field1317 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)V")
    public static void method539(int arg0) {
        if (arg0 >= -72) {
            method539(-2);
        }
        field1314 = null;
        field1316 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lag;ZIIIII)V")
    public static final void method540(class211 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1318++;
        class50 var7 = class49.method346(arg5, (byte) 41);
        if (var7 != null && var7.field838 && var7.method356(1223)) {
            if (var7.field829 != null) {
                int[] var8 = new int[var7.field829.length];
                for (int var9 = 0; var9 < var8.length / 2; var9++) {
                    int var11;
                    if (class120.field1919 == 4) {
                        var11 = (int) class90.field1456 & 0x7FF;
                    } else {
                        var11 = (int) class90.field1456 + class173.field2831 & 0x7FF;
                    }
                    int var12 = class302.field4823[var11];
                    int var13 = class302.field4824[var11];
                    if (class120.field1919 != 4) {
                        var13 = var13 * 256 / (class292.field4687 + 256);
                        var12 = var12 * 256 / (class292.field4687 + 256);
                    }
                    var8[var9 * 2] = arg0.field3430 / 2 + ((arg2 + (var7.field829[var9 * 2] * 4)) * var13 + (var7.field829[var9 * 2 + 1] * 4 + arg4) * var12 >> 16) + arg6;
                    var8[var9 * 2 + 1] = arg3 + (arg0.field3394 / 2) - ((var7.field829[var9 * 2 + 1] * 4 + arg4) * var13 - ((var7.field829[var9 * 2] * 4 + arg2) * var12) >> 16);
                }
                class76.method517(var8, var7.field830, var7.field830 >>> 24, arg0.field3460, arg0.field3505);
                for (int var10 = 0; var10 < (var8.length / 2 - 1); var10++) {
                    class127.method896(var8[var10 * 2], var8[var10 * 2 + 1], var8[(var10 + 1) * 2], var8[var10 * 2 + 2 + 1], var7.field836, var7.field836 >>> 24, arg0.field3460, arg0.field3505);
                }
                class127.method896(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field836, var7.field836 >>> 24, arg0.field3460, arg0.field3505);
            }
            class220 var14 = null;
            if (var7.field831 != -1) {
                var14 = var7.method351(false, false, 109);
                if (var14 != null) {
                    class299.method1981(arg4, arg0, arg3, var14, (byte) 124, arg6, arg2);
                }
            }
            if (var7.field819 != null) {
                int var15 = 0;
                if (var14 != null) {
                    var15 = var14.field3605;
                }
                class93 var16 = class78.field1311;
                if (var7.field847 == 1) {
                    var16 = class88.field1443;
                }
                if (var7.field847 == 2) {
                    var16 = class59.field967;
                }
                class2.method14(arg2, arg6, var7.field821, arg4, true, var15, var7.field819, var16, arg0, arg3);
            }
        }
        if (arg1) {
            field1315 = -101;
        }
    }
}
