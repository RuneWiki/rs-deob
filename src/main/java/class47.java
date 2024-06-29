import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lw;")
    public class127 field1183 = new class127();

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lhb;")
    private static class44 field1153 = class102.method810("Account locked as we suspect it has been stolen)3", -28606);

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lhb;")
    private static class44 field1165 = class102.method810("On", -28606);

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lhb;")
    public static class44 field1168 = field1165;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lhb;")
    public static class44 field1174 = field1153;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lhb;")
    public static class44 field1175 = class102.method810("rot:", -28606);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Z")
    public static boolean field1160 = false;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Lhb;")
    public static class44 field1178 = class102.method810("headicons_prayer", -28606);

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1177 = 127;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1152 = -1;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[Ll;")
    public static class66[] field1164 = new class66[12];

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lhb;")
    public static class44 field1162 = class102.method810("Bitte warten Sie)3)3)3", -28606);

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
    public static boolean field1181 = false;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lhb;")
    public static class44 field1161 = class102.method810("::hiddenbuttontest", -28606);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Lw;")
    private class127 field1185;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lpc;")
    public static class93 field1158;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lpc;")
    public static class93 field1173;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lw;", line = 11)
    public final class127 method434(boolean arg0) {
        field1154++;
        class127 var2 = this.field1185;
        if (this.field1183 == var2) {
            this.field1185 = null;
            return null;
        }
        this.field1185 = var2.field3059;
        if (!arg0) {
            method447((byte) 68, -14L);
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 42)
    public static final void method435(byte arg0) {
        field1156++;
        if (arg0 != -76) {
            field1152 = -120;
        }
        Object var1 = class16.field322;
        synchronized (class16.field322) {
            if (class36.field861 != 0) {
                class36.field861 = 1;
                try {
                    class16.field322.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lw;", line = 73)
    public final class127 method436(byte arg0) {
        if (arg0 != 107) {
            this.method443((byte) 75);
        }
        field1151++;
        class127 var2 = this.field1185;
        if (this.field1183 == var2) {
            this.field1185 = null;
            return null;
        } else {
            this.field1185 = var2.field3060;
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;ILtd;)V", line = 108)
    public static final void method437(Component arg0, int arg1, class116 arg2) {
        field1179++;
        if (class11.field206) {
            return;
        }
        class27.field630 = class117.method899(class121.field2967, arg2, 125, class40.field907);
        class90.field2307 = class117.method899(class94.field2393, arg2, 125, class40.field907);
        class120.field2931 = class117.method899(class111.field2759, arg2, 125, class40.field907);
        class33.field810 = class117.method899(class36.field868, arg2, arg1 + 126, class40.field907);
        class15.field288 = class117.method899(class55.field1399, arg2, 126, class40.field907);
        class127.field3051 = class117.method899(class118.field2908, arg2, 127, class40.field907);
        class31.field762 = class11.method80((byte) 73, arg0, 479, 96);
        class90.field2307.method680(0, arg1);
        class71.field1743 = class11.method80((byte) -76, arg0, 172, 156);
        class112.method854();
        class120.field2931.method680(0, 0);
        class121.field2954 = class11.method80((byte) 109, arg0, 190, 261);
        class27.field630.method680(0, 0);
        class105.field2669 = class11.method80((byte) 69, arg0, 512, 334);
        class112.method854();
        class131.field3198 = class11.method80((byte) 68, arg0, 496, 50);
        class88.field2252 = class11.method80((byte) 92, arg0, 269, 37);
        class127.field3047 = class11.method80((byte) 96, arg0, 249, 45);
        class45 var3 = class31.method314(class86.field2212, arg2, class40.field907, false);
        class78.field1956 = class11.method80((byte) 119, arg0, var3.field1128, var3.field1127);
        var3.method420(0, 0);
        class45 var4 = class31.method314(class102.field2587, arg2, class40.field907, false);
        class62.field1566 = class11.method80((byte) -74, arg0, var4.field1128, var4.field1127);
        var4.method420(0, 0);
        class45 var5 = class31.method314(class62.field1579, arg2, class40.field907, false);
        class101.field2577 = class11.method80((byte) -53, arg0, var5.field1128, var5.field1127);
        var5.method420(0, 0);
        class45 var6 = class31.method314(class46.field1136, arg2, class40.field907, false);
        class102.field2589 = class11.method80((byte) -69, arg0, var6.field1128, var6.field1127);
        var6.method420(0, 0);
        class45 var7 = class31.method314(class131.field3189, arg2, class40.field907, false);
        class44.field1120 = class11.method80((byte) 118, arg0, var7.field1128, var7.field1127);
        var7.method420(0, 0);
        class45 var8 = class31.method314(class90.field2295, arg2, class40.field907, false);
        class97.field2476 = class11.method80((byte) -76, arg0, var8.field1128, var8.field1127);
        var8.method420(0, 0);
        class45 var9 = class31.method314(class41.field949, arg2, class40.field907, false);
        class117.field2865 = class11.method80((byte) 117, arg0, var9.field1128, var9.field1127);
        var9.method420(0, 0);
        class45 var10 = class31.method314(class131.field3196, arg2, class40.field907, false);
        class98.field2508 = class11.method80((byte) 70, arg0, var10.field1128, var10.field1127);
        var10.method420(0, 0);
        class45 var11 = class31.method314(class85.field2182, arg2, class40.field907, false);
        class18.field357 = class11.method80((byte) 67, arg0, var11.field1128, var11.field1127);
        var11.method420(0, 0);
        class63.field1599 = class117.method899(class103.field2620, arg2, 125, class40.field907);
        class127.field3053 = class117.method899(class110.field2758, arg2, 126, class40.field907);
        class53.field1320 = class117.method899(class80.field2020, arg2, arg1 ^ 0x7E, class40.field907);
        class111.field2761 = class63.field1599.method682();
        class111.field2761.method683();
        class51.field1280 = class127.field3053.method682();
        class51.field1280.method683();
        class80.field2013 = class63.field1599.method682();
        class80.field2013.method677();
        class86.field2196 = class127.field3053.method682();
        class86.field2196.method677();
        class94.field2399 = class53.field1320.method682();
        class94.field2399.method677();
        class61.field1557 = class63.field1599.method682();
        class61.field1557.method683();
        class61.field1557.method677();
        class57.field1505 = class127.field3053.method682();
        class57.field1505.method683();
        class57.field1505.method677();
        class128.field3081 = class100.method789(client.field383, (byte) 2, arg2, class40.field907);
        class39.field877 = new int[151];
        class107.field2724 = new int[33];
        class84.field2154 = new int[151];
        class40.field888 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class120.field2931.field2122[class120.field2931.field2127 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class107.field2724[var12] = var17;
            class40.field888[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class120.field2931.field2122[class120.field2931.field2127 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class39.field877[var13 - 5] = var14 - 25;
            class84.field2154[var13 - 5] = var15 - var14;
        }
        class11.field206 = true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIILtd;)Lee;", line = 263)
    public static final class30 method438(byte arg0, int arg1, int arg2, class116 arg3) {
        if (arg0 > -124) {
            method449(null, 45);
        }
        field1180++;
        return class74.method629(-12890, arg2, arg3, arg1) ? class52.method497((byte) -127) : null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Lw;", line = 307)
    public final class127 method439(byte arg0) {
        field1184++;
        class127 var2 = this.field1183.field3060;
        if (this.field1183 == var2) {
            return null;
        }
        if (arg0 < 74) {
            method438((byte) 18, 117, -6, null);
        }
        var2.method948(68);
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lw;B)V", line = 324)
    public final void method440(class127 arg0, byte arg1) {
        field1166++;
        if (arg0.field3060 != null) {
            arg0.method948(112);
        }
        arg0.field3059 = this.field1183.field3059;
        int var3 = 95 / ((arg1 - 50) / 60);
        arg0.field3060 = this.field1183;
        arg0.field3060.field3059 = arg0;
        arg0.field3059.field3060 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lw;", line = 341)
    public final class127 method441(int arg0) {
        class127 var2 = this.field1183.field3059;
        field1159++;
        if (arg0 != -1) {
            field1161 = null;
        }
        if (this.field1183 == var2) {
            return null;
        } else {
            var2.method948(arg0 ^ 0x4C);
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V", line = 358)
    public static void method442(byte arg0) {
        field1173 = null;
        field1161 = null;
        if (arg0 != -63) {
            method447((byte) -96, -120L);
        }
        field1165 = null;
        field1153 = null;
        field1158 = null;
        field1174 = null;
        field1178 = null;
        field1175 = null;
        field1168 = null;
        field1162 = null;
        field1164 = null;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)Lw;", line = 391)
    public final class127 method443(byte arg0) {
        field1157++;
        class127 var2 = this.field1183.field3059;
        if (this.field1183 == var2) {
            this.field1185 = null;
            return null;
        }
        if (arg0 != -111) {
            this.method441(21);
        }
        this.field1185 = var2.field3059;
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lw;Lw;I)V", line = 435)
    public final void method444(class127 arg0, class127 arg1, int arg2) {
        field1155++;
        if (arg1.field3060 != null) {
            arg1.method948(122);
        }
        arg1.field3059 = arg0;
        arg1.field3060 = arg0.field3060;
        if (arg2 != -28891) {
            field1181 = true;
        }
        arg1.field3060.field3059 = arg1;
        arg1.field3059.field3060 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Lw;", line = 455)
    public final class127 method445(int arg0) {
        field1163++;
        class127 var2 = this.field1183.field3060;
        int var3 = -59 / ((arg0 + 40) / 46);
        if (this.field1183 == var2) {
            this.field1185 = null;
            return null;
        } else {
            this.field1185 = var2.field3060;
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BIII[Lpb;)V", line = 474)
    public static final void method446(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class92[] arg6) {
        int var7 = 0;
        if (arg5 != 27680) {
            field1176 = 29;
        }
        while (var7 < 4) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg6[var7].field2338[arg1 + var12][arg4 + var13] = class118.method914(arg6[var7].field2338[arg1 + var12][arg4 + var13], -16777217);
                    }
                }
            }
            var7++;
        }
        class131 var8 = new class131(arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class97.method772(var9, arg4 + var11, arg0, arg3, (byte) 123, 0, arg1 + var10, var8);
                }
            }
        }
        field1167++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V", line = 542)
    public static final void method447(byte arg0, long arg1) {
        if (arg0 > -46) {
            return;
        }
        field1169++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class122.method936(false, arg1 - 1L);
            class122.method936(false, 1L);
        } else {
            class122.method936(false, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lw;Z)V", line = 567)
    public final void method448(class127 arg0, boolean arg1) {
        if (!arg1) {
            field1176 = -88;
        }
        if (arg0.field3060 != null) {
            arg0.method948(82);
        }
        arg0.field3059 = this.field1183;
        arg0.field3060 = this.field1183.field3060;
        field1182++;
        arg0.field3060.field3059 = arg0;
        arg0.field3059.field3060 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 638)
    public class47() {
        this.field1183.field3060 = this.field1183;
        this.field1183.field3059 = this.field1183;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 599)
    public static final void method449(Component arg0, int arg1) {
        field1171++;
        if (arg1 != 33) {
            method437(null, 14, null);
        }
        arg0.removeKeyListener(class18.field358);
        arg0.removeFocusListener(class18.field358);
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V", line = 611)
    public final void method450(byte arg0) {
        if (arg0 != 111) {
            return;
        }
        field1150++;
        while (true) {
            class127 var2 = this.field1183.field3059;
            if (this.field1183 == var2) {
                return;
            }
            var2.method948(70);
        }
    }
}
