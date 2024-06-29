import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class41 {

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "Lu;")
    public static class135 field456 = class87.method676((byte) -116, "http:)4)4");

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lu;")
    private static class135 field468 = class87.method676((byte) -120, "From");

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Lu;")
    public static class135 field469 = field468;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lu;")
    private static class135 field481 = class87.method676((byte) -89, "level)2");

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Lu;")
    public static class135 field463 = class87.method676((byte) -44, "blinken3:");

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lu;")
    public static class135 field471 = field481;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Ltd;")
    public class133 field451;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lke;")
    public class74 field462;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "Llf;")
    public class82 field484;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lnb;")
    public class92 field448;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
    public static final int method148(int arg0, int arg1, int arg2, int arg3) {
        field473++;
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        if (arg2 < 3 && (client.field525[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var9 = (128 - var8) * class68.field1682[var6][var4][var5 + 1] + class68.field1682[var6][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class68.field1682[var6][var4][var5] + class68.field1682[var6][var4 + 1][var5] * var8 >> 7;
        return arg3 == -2 ? (128 - var7) * var10 + var7 * var9 >> 7 : -45;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lg;Ljava/awt/Component;Lg;I)V")
    public static final void method149(class43 arg0, Component arg1, class43 arg2, int arg3) {
        field476++;
        if (class29.field693) {
            return;
        }
        class113.field2739 = class96.method788(503, 17433, 765, arg1);
        class113.field2739.method966(arg3 ^ 0x1DEE);
        class70.method560();
        byte[] var4 = arg2.method337((byte) 1, class57.field1390, class83.field1962);
        class128.field3090 = new class11(var4, arg1);
        class76.field1790 = class128.field3090.method75();
        class29.field694 = class34.method266(class57.field1390, class9.field214, (byte) -107, arg0);
        class93.field2206 = class34.method266(class57.field1390, class82.field1924, (byte) -117, arg0);
        class148.field3686 = class34.method266(class57.field1390, class135.field3243, (byte) -112, arg0);
        class62.field1555 = class30.method243(class119.field2851, 918, arg0, class57.field1390);
        class43.field1027 = class30.method243(class85.field2044, 918, arg0, class57.field1390);
        class56.field1357 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class56.field1357[var5] = var5 * 262144;
        }
        int var6 = 0;
        if (arg3 != -7558) {
            field469 = null;
        }
        while (var6 < 64) {
            class56.field1357[var6 + 64] = var6 * 1024 + 16711680;
            var6++;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class56.field1357[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class56.field1357[var8 + 192] = 16777215;
        }
        client.field534 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            client.field534[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            client.field534[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            client.field534[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            client.field534[var12 + 192] = 16777215;
        }
        class152.field3742 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class152.field3742[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class152.field3742[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class152.field3742[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class152.field3742[var16 + 192] = 16777215;
        }
        class49.field1173 = new int[32768];
        class5.field130 = new int[32768];
        class29.field707 = new int[256];
        class148.method1209(-30847, null);
        class57.field1401 = class57.field1390;
        class59.field1507 = new int[32768];
        class37.field837 = 0;
        class115.field2759 = false;
        class38.field879 = new int[32768];
        if (class84.field1996 == 0) {
            class4.field103 = true;
        } else {
            class4.field103 = false;
        }
        class57.field1389 = class57.field1390;
        if (class4.field103) {
            class21.method158(2, (byte) -19);
        } else {
            class32.method260(false, -78, class57.field1390, class41.field956, class19.field418, 255, 2);
        }
        class106.method862(false, 20625);
        class53.field1258 = true;
        class29.field693 = true;
        class128.field3090.method70(0, 0);
        class76.field1790.method70(382, 0);
        class29.field694.method29(382 - class29.field694.field132 / 2, 18);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field448 = null;
        field477++;
        this.field451 = null;
        if (arg0 != 3) {
            method154(null, (byte) -56);
        }
        this.field462 = null;
        this.field484 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static final void method151(byte arg0) {
        field466++;
        class23.field581.method936(-1);
        int var1 = class23.field581.method934((byte) 113, 8);
        if (var1 < class34.field790) {
            for (int var2 = var1; var2 < class34.field790; var2++) {
                class101.field2443[client.field526++] = class47.field1124[var2];
            }
        }
        if (arg0 <= 42) {
            field463 = null;
        }
        if (var1 > class34.field790) {
            throw new RuntimeException("gnpov1");
        }
        class34.field790 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class47.field1124[var3];
            class111 var5 = class96.field2340[var4];
            int var6 = class23.field581.method934((byte) 116, 1);
            if (var6 == 0) {
                class47.field1124[class34.field790++] = var4;
                var5.field184 = class126.field2998;
            } else {
                int var7 = class23.field581.method934((byte) 105, 2);
                if (var7 == 0) {
                    class47.field1124[class34.field790++] = var4;
                    var5.field184 = class126.field2998;
                    class97.field2358[class126.field3009++] = var4;
                } else if (var7 == 1) {
                    class47.field1124[class34.field790++] = var4;
                    var5.field184 = class126.field2998;
                    int var8 = class23.field581.method934((byte) 106, 3);
                    var5.method47(var8, false, false);
                    int var9 = class23.field581.method934((byte) 113, 1);
                    if (var9 == 1) {
                        class97.field2358[class126.field3009++] = var4;
                    }
                } else if (var7 == 2) {
                    class47.field1124[class34.field790++] = var4;
                    var5.field184 = class126.field2998;
                    int var10 = class23.field581.method934((byte) 112, 3);
                    var5.method47(var10, false, true);
                    int var11 = class23.field581.method934((byte) 113, 3);
                    var5.method47(var11, false, true);
                    int var12 = class23.field581.method934((byte) 110, 1);
                    if (var12 == 1) {
                        class97.field2358[class126.field3009++] = var4;
                    }
                } else if (var7 == 3) {
                    class101.field2443[client.field526++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static final void method152(byte arg0) {
        field450++;
        try {
            if (arg0 >= -6) {
                field447 = -46;
            }
            Graphics var1 = class59.field1484.getGraphics();
            class77.field1831.method94(-17740, 4, var1, 550);
        } catch (Exception var2) {
            class59.field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBII)V")
    public static final void method153(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field474++;
        if (arg3 != -71) {
            method153(-2, -82, -104, (byte) 24, 55, -88);
        }
        if (class132.field3183 == arg2 && class56.field1362 == arg4 && (class86.field2045 == arg0 || !class100.field2422)) {
            return;
        }
        class132.field3183 = arg2;
        class56.field1362 = arg4;
        class86.field2045 = arg0;
        if (!class100.field2422) {
            class86.field2045 = 0;
        }
        class125.method978(25, 1);
        class12.method89(class108.field2606, arg3 ^ 0xB5, null, false);
        int var6 = class126.field3010;
        int var7 = class76.field1795;
        class76.field1795 = arg4 * 8 - 48;
        int var8 = class76.field1795 - var7;
        class126.field3010 = arg2 * 8 - 48;
        int var9 = class76.field1795;
        int var10 = class126.field3010 - var6;
        int var11 = class126.field3010;
        for (int var12 = 0; var12 < 32768; var12++) {
            class111 var28 = class96.field2340[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field192[var29] -= var10;
                    var28.field162[var29] -= var8;
                }
                var28.field172 -= var8 * 128;
                var28.field173 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class145 var26 = class131.field3166[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field192[var27] -= var10;
                    var26.field162[var27] -= var8;
                }
                var26.field172 -= var8 * 128;
                var26.field173 -= var10 * 128;
            }
        }
        byte var14 = 0;
        class136.field3301 = arg0;
        class116.field2789.method51(false, arg3 ^ 0xFFFFFFB3, arg5, arg1);
        byte var15 = 104;
        byte var16 = 1;
        if (var10 < 0) {
            var15 = -1;
            var14 = 103;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var8 + var22;
                int var24 = var10 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class48.field1142[var25][var20][var22] = class48.field1142[var25][var24][var23];
                    } else {
                        class48.field1142[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class44 var21 = (class44) class123.field2940.method182((byte) 50); var21 != null; var21 = (class44) class123.field2940.method181((byte) 65)) {
            var21.field1060 -= var10;
            var21.field1073 -= var8;
            if (var21.field1060 < 0 || var21.field1073 < 0 || var21.field1060 >= 104 || var21.field1073 >= 104) {
                var21.method302(4071);
            }
        }
        class116.field2787 = -1;
        class106.field2548 = false;
        if (class86.field2062 != 0) {
            class86.field2062 -= var10;
            class128.field3093 -= var8;
        }
        class56.field1382 = 0;
        class132.field3178.method188(125);
        class5.field129.method188(123);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lve;B)Lve;")
    public static final class146 method154(class146 arg0, byte arg1) {
        field459++;
        class146 var2 = class12.method91(arg0, (byte) 116);
        if (arg1 < 4) {
            method148(32, 20, -66, -75);
        }
        if (var2 == null) {
            var2 = arg0.field3615;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public static final void method155(int arg0) {
        if (arg0 == 4910) {
            field458++;
            class77.field1831.method966(-54);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field481 = null;
        field469 = null;
        field468 = null;
        field463 = null;
        field471 = null;
        if (arg0 != -32) {
            method154(null, (byte) 60);
        }
        field456 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)I")
    public static final int method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field479++;
        if (arg3 != 256) {
            field468 = null;
        }
        int var5 = 65536 - class51.field1203[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }
}
