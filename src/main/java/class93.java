import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class93 extends class61 {

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "[Lvh;")
    public class53[] field1322;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Lwm;")
    public static class152 field1316 = class157.method1048("brillant2:", 114);

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "Lwm;")
    public static class152 field1320 = class157.method1048("::cardmem", 109);

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Lwm;")
    public static class152 field1327 = class157.method1048("Bitte warten Sie)3)3)3", 97);

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Loe;")
    public static class127 field1324 = null;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Lph;")
    public static class79 field1326;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)Lhi;", line = 7)
    public static final class291 method610(int arg0) {
        field1328++;
        class291 var1 = new class291(34);
        var1.method1980(false, 11);
        var1.method1980(false, class87.field1228);
        if (arg0 != 1) {
            method615(33);
        }
        var1.method1980(false, class272.field4679 ? 1 : 0);
        var1.method1980(false, class289.field4906 ? 1 : 0);
        var1.method1980(false, class199.field3209 ? 1 : 0);
        var1.method1980(false, class205.field3352 ? 1 : 0);
        var1.method1980(false, class211.field3427 ? 1 : 0);
        var1.method1980(false, class15.field209 ? 1 : 0);
        var1.method1980(false, class92.field1307 ? 1 : 0);
        var1.method1980(false, class33.field539 ? 1 : 0);
        var1.method1980(false, class239.field3919);
        var1.method1980(false, class81.field1131 ? 1 : 0);
        var1.method1980(false, class100.field1454 ? 1 : 0);
        var1.method1980(false, class236.field3870 ? 1 : 0);
        var1.method1980(false, class140.field2135);
        var1.method1980(false, class28.field484 ? 1 : 0);
        var1.method1980(false, class224.field3637);
        var1.method1980(false, class6.field93);
        var1.method1980(false, class72.field1048);
        var1.method1994(class15.field211, 2921);
        var1.method1994(class179.field2848, 2921);
        var1.method1980(false, class47.method323());
        var1.method1967(class243.field4023, -1303690792);
        var1.method1980(false, class167.field2632);
        var1.method1980(false, class20.field270 ? 1 : 0);
        var1.method1980(false, class259.field4438 ? 1 : 0);
        var1.method1980(false, class253.field4386);
        var1.method1980(false, class40.field651 ? 1 : 0);
        var1.method1980(false, class169.field2651 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I", line = 49)
    public static final int method611(int arg0, int arg1) {
        field1325++;
        double var2 = (double) ((arg0 & 0xFF5E5E) >> 16) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFF88) >> 8) / 256.0D;
        double var8 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        if (var4 < var8) {
            var8 = var4;
        }
        double var10 = var2;
        if (var6 > var2) {
            var10 = var6;
        }
        if (var4 > var10) {
            var10 = var4;
        }
        if (arg1 > -75) {
            return 72;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var14 = (var6 - var4) / (var10 - var8);
            } else if (var6 == var10) {
                var14 = (var4 - var2) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var14 = (var2 - var6) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var12 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var20 >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 157)
    public static void method612(byte arg0) {
        field1316 = null;
        field1324 = null;
        field1327 = null;
        int var1 = 21 % ((arg0 + 28) / 55);
        field1320 = null;
        field1326 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)Lrc;", line = 170)
    public static final class325 method613(int arg0, int arg1) {
        field1319++;
        class325 var2 = (class325) class154.field2450.method1663((long) arg0, (byte) -127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field541.method1381(26, arg0, 0);
        if (arg1 < 52) {
            return (class325) null;
        }
        class325 var4 = new class325();
        if (var3 != null) {
            var4.method2283(new class291(var3), -2);
        }
        class154.field2450.method1662(var4, (long) arg0, -75);
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)Z", line = 195)
    public final boolean method614(int arg0, int arg1) {
        field1331++;
        if (arg1 != 0) {
            method617((Color) null, 35, false, (class152) null, -43);
        }
        return this.field1322[arg0].field821;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V", line = 209)
    public static final void method615(int arg0) {
        class123.field1727.method1619(11300);
        field1318++;
        if (arg0 != 0) {
            field1326 = (class79) null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(II)Z", line = 240)
    public final boolean method616(int arg0, int arg1) {
        field1323++;
        return arg1 == 243 ? this.field1322[arg0].field813 : true;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lah;Lah;IZ)V", line = 257)
    public class93(class205 arg0, class205 arg1, int arg2, boolean arg3) {
        class183 var5 = new class183();
        int var6 = arg0.method1375(arg2, 0);
        this.field1322 = new class53[var6];
        int[] var7 = arg0.method1366(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1381(arg2, var7[var8], 0);
            class307 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class307 var12 = (class307) var5.method1221((byte) 54); var12 != null; var12 = (class307) var5.method1223(71)) {
                if (var12.field5277 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1365(0, var11, false);
                } else {
                    var13 = arg1.method1365(var11, 0, false);
                }
                var10 = new class307(var11, var13);
                var5.method1214(false, var10);
            }
            this.field1322[var7[var8]] = new class53(var9, var10);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Color;IZLwm;I)V", line = 316)
    public static final void method617(Color arg0, int arg1, boolean arg2, class152 arg3, int arg4) {
        field1317++;
        try {
            Graphics var5 = class224.field3648.getGraphics();
            if (class316.field5494 == null) {
                class316.field5494 = new Font("Helvetica", 1, 13);
                class150.field2333 = class224.field3648.getFontMetrics(class316.field5494);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class172.field2757, class227.field3709);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class148.field2288 == null) {
                    class148.field2288 = class224.field3648.createImage(304, 34);
                }
                Graphics var6 = class148.field2288.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, arg4, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class316.field5494);
                var6.setColor(Color.white);
                arg3.method973(0, var6, 22, (304 - arg3.method984((byte) -115, class150.field2333)) / 2);
                var5.drawImage(class148.field2288, class172.field2757 / 2 - 152, class227.field3709 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class172.field2757 / 2 - 152;
                int var9 = class227.field3709 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class316.field5494);
                var5.setColor(Color.white);
                arg3.method973(arg4 ^ 0x1, var5, var9 + 22, var8 + (-arg3.method984((byte) -123, class150.field2333) + 304) / 2);
            }
            if (class241.field3951 != null) {
                var5.setFont(class316.field5494);
                var5.setColor(Color.white);
                class241.field3951.method973(arg4 ^ 0x1, var5, class227.field3709 / 2 - 26, class172.field2757 / 2 + -(class241.field3951.method984((byte) -125, class150.field2333) / 2));
            }
        } catch (Exception var12) {
            class224.field3648.repaint();
        }
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V", line = 393)
    public static final void method618(int arg0) {
        if (arg0 != 31) {
            field1326 = (class79) null;
        }
        field1332++;
        class85.field1194.method1613(-22696);
        class205.field3320.method1613(-22696);
    }
}
