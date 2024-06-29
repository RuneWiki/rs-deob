import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class73 {

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[B")
    public byte[] field1879;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lrd;")
    public static class117 field1883 = class95.method812("::", (byte) 8);

    @OriginalMember(owner = "client!je", name = "J", descriptor = "Lrd;")
    public static class117 field1882 = class95.method812("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", (byte) 8);

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Lrd;")
    public static class117 field1895 = class95.method812("redstone2", (byte) 8);

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Lrd;")
    public static class117 field1893 = class95.method812("Texturen geladen)3", (byte) 8);

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "Lrd;")
    private static class117 field1898 = class95.method812("No response from server)3", (byte) 8);

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lrd;")
    public static class117 field1891 = field1898;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lrd;")
    public static class117 field1889 = class95.method812("und die Schaltfl-=che (WSpielkonto erstellen(W am", (byte) 8);

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Lrd;")
    private static class117 field1890 = class95.method812("flash3:", (byte) 8);

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Lrd;")
    public static class117 field1888 = field1890;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lrd;")
    public static class117 field1884 = field1890;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Laf;")
    public static class7 field1896;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1880;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "[[B")
    public static byte[][] field1897;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "[[[B")
    public static byte[][][] field1899;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)I")
    public static final int method662(int arg0, int arg1, byte arg2) {
        int var3 = 81 / ((arg2 - 40) / 44);
        int var4 = class5.method37(arg1 + 45365, false, 4, arg0 + 91923) + (class5.method37(arg1 + 10294, false, 2, arg0 + 37821) - 128 >> 1) + (class5.method37(arg1, false, 1, arg0) - 128 >> 2) - 128;
        field1894++;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILge;IIZ)V")
    public static final void method663(int arg0, int arg1, int arg2, class47 arg3, int arg4, int arg5, boolean arg6) {
        field1885++;
        class79.field2112 = arg4;
        class25.field749 = arg0;
        class77.field2108 = arg5;
        class41.field1179 = arg1;
        class71.field2000 = arg2;
        class32.field944 = arg3;
        class137.field3285 = arg6;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public static final void method664(int arg0) {
        if (arg0 >= -39) {
            method665(-25);
        }
        for (class132 var1 = (class132) class43.field1227.method3(false); var1 != null; var1 = (class132) class43.field1227.method14(127)) {
            if (var1.field3151 == -1) {
                var1.field3160 = 0;
                class144.method1141(var1, 0);
            } else {
                var1.method691(0);
            }
        }
        field1887++;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static void method665(int arg0) {
        field1895 = null;
        field1890 = null;
        field1891 = null;
        field1897 = null;
        field1884 = null;
        if (arg0 <= 62) {
            return;
        }
        field1888 = null;
        field1896 = null;
        field1898 = null;
        field1889 = null;
        field1893 = null;
        field1883 = null;
        field1880 = null;
        field1899 = null;
        field1882 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
    public class67(byte[] arg0) {
        this.field1879 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILdc;)V")
    public static final void method666(int arg0, class25 arg1) {
        field1881++;
        if (arg1.field718 == 0) {
            return;
        }
        if (arg1.field696 != -1 && arg1.field696 < 32768) {
            class36 var2 = class93.field2334[arg1.field696];
            if (var2 != null) {
                int var3 = arg1.field751 - var2.field751;
                int var4 = arg1.field717 - var2.field717;
                if (var4 != 0 || var3 != 0) {
                    arg1.field705 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field696 >= 32768) {
            int var5 = arg1.field696 - 32768;
            if (class104.field2604 == var5) {
                var5 = 2047;
            }
            class101 var6 = class93.field2340[var5];
            if (var6 != null) {
                int var7 = arg1.field717 - var6.field717;
                int var8 = arg1.field751 - var6.field751;
                if (var7 != 0 || var8 != 0) {
                    arg1.field705 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field709 != 0 || arg1.field742 != 0) && (arg1.field737 == 0 || arg1.field698 > 0)) {
            int var9 = arg1.field751 - (arg1.field742 - class108.field2678 - class108.field2678) * 64;
            int var10 = arg1.field717 - (arg1.field709 - class95.field2371 - class95.field2371) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field705 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field742 = 0;
            arg1.field709 = 0;
        }
        int var11 = arg1.field705 - arg1.field697 & 0x7FF;
        if (var11 == 0) {
            arg1.field710 = 0;
        } else {
            arg1.field710++;
            if (var11 > 1024) {
                arg1.field697 -= arg1.field718;
                boolean var12 = true;
                if (arg1.field718 > var11 || 2048 - arg1.field718 < var11) {
                    var12 = false;
                    arg1.field697 = arg1.field705;
                }
                if (arg1.field726 == arg1.field704 && (arg1.field710 > 25 || var12)) {
                    if (arg1.field721 == -1) {
                        arg1.field704 = arg1.field728;
                    } else {
                        arg1.field704 = arg1.field721;
                    }
                }
            } else {
                arg1.field697 += arg1.field718;
                boolean var13 = true;
                if (var11 < arg1.field718 || 2048 - arg1.field718 < var11) {
                    arg1.field697 = arg1.field705;
                    var13 = false;
                }
                if (arg1.field726 == arg1.field704 && (arg1.field710 > 25 || var13)) {
                    if (arg1.field750 == -1) {
                        arg1.field704 = arg1.field728;
                    } else {
                        arg1.field704 = arg1.field750;
                    }
                }
            }
            arg1.field697 &= 0x7FF;
        }
        if (arg0 >= -116) {
            method663(-27, -45, -125, null, 40, 122, true);
        }
    }
}
