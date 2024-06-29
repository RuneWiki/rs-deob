import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class149 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
    private int[] field2600;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
    private int[] field2613;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lsg;")
    private class243 field2603;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lsg;")
    private class243 field2614;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[Lsg;")
    private class243[] field2611;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Ldc;")
    public static class17 field2597 = null;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static volatile int field2606 = 0;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lub;")
    public static class227 field2609 = class257.method1749("Art", 17263);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[Lub;")
    public static class227[] field2604 = new class227[1000];

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lub;")
    public static class227 field2608 = null;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Ln;")
    public static class138 field2605;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "La;")
    public static class20 field2596;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lnh;")
    public static class57 field2602;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[[[I")
    public static int[][][] field2612;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2612 = null;
        field2597 = null;
        field2609 = null;
        field2602 = null;
        field2596 = null;
        if (arg0 == 24812) {
            field2604 = null;
            field2605 = null;
            field2608 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static final void method944(byte arg0) {
        if (class213.field3595[98]) {
            class27.field440 += (12 - class27.field440) / 2;
        } else if (class213.field3595[99]) {
            class27.field440 += (-class27.field440 - 12) / 2;
        } else {
            class27.field440 /= 2;
        }
        class24.field409 += class27.field440 / 2;
        if (class213.field3595[96]) {
            class83.field1461 += (-class83.field1461 - 24) / 2;
        } else if (class213.field3595[97]) {
            class83.field1461 += (24 - class83.field1461) / 2;
        } else {
            class83.field1461 /= 2;
        }
        class29.field476 += class83.field1461 / 2;
        if (arg0 > -21) {
            field2602 = null;
        }
        field2599++;
        int var1 = class216.field3639.field50 + class185.field3144;
        int var2 = class101.field1772 + class216.field3639.field99;
        if (class54.field936 - var1 < -500 || class54.field936 - var1 > 500 || (class251.field4349 - var2) < -500 || (class251.field4349 - var2) > 500) {
            class54.field936 = var1;
            class251.field4349 = var2;
        }
        if (class251.field4349 != var2) {
            class251.field4349 += (var2 - class251.field4349) / 16;
        }
        if (class54.field936 != var1) {
            class54.field936 += (var1 - class54.field936) / 16;
        }
        class194.method1232((byte) 23);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILub;Z)V")
    public static final void method945(int arg0, class227 arg1, boolean arg2) {
        class227 var3 = arg1.method1525((byte) -117);
        int var4 = 0;
        field2607++;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class4.field83; var6++) {
            class178 var9 = class133.method815(var6, (byte) -70);
            if ((!arg2 || var9.field2996) && var9.field3042 == -1 && var9.field3005 == -1 && var9.field3046 == 0 && var9.field3048.method1525((byte) -67).method1506(-1646, var3) != -1) {
                if (var4 >= 250) {
                    class38.field636 = -1;
                    class94.field1637 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class87.field1516 = 0;
        class94.field1637 = var5;
        class38.field636 = var4;
        class227[] var7 = new class227[class38.field636];
        for (int var8 = arg0; var8 < class38.field636; var8++) {
            var7[var8] = class133.method815(var5[var8], (byte) -70).field3048;
        }
        class246.method1642(var7, arg0 + 1, class94.field1637);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ln;I)V")
    public static final void method946(class138 arg0, int arg1) {
        field2601++;
        class44.field734 = arg0.method869(class153.field2659, 0);
        class67.field1212 = arg0.method869(class124.field2230, 0);
        class172.field2871 = arg0.method869(class65.field1187, 0);
        class83.field1453 = arg0.method869(class214.field3610, 0);
        class103.field1798 = arg0.method869(class237.field4118, 0);
        class31.field500 = arg0.method869(class53.field934, arg1);
        class180.field3088 = arg0.method869(class10.field178, arg1);
        class43.field713 = arg0.method869(class249.field4327, 0);
        class232.field4052 = arg0.method869(class53.field929, 0);
        class40.field664 = arg0.method869(class53.field932, 0);
        class64.field1178 = arg0.method869(class44.field732, 0);
        class4.field42 = arg0.method869(class72.field1262, 0);
        class40.field655 = arg0.method869(class118.field2153, 0);
        class243.field4227 = arg0.method869(class32.field515, 0);
        class216.field3642 = arg0.method869(class76.field1322, 0);
        class60.field1105 = arg0.method869(class70.field1231, 0);
        arg0.method869(class15.field283, 0);
        class236.field4097 = arg0.method869(class177.field2984, 0);
        class2.field34 = arg0.method869(class219.field3688, arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwj;Ln;B)Z")
    public final boolean method947(class233 arg0, class138 arg1, byte arg2) {
        field2595++;
        int var4 = 0;
        if (arg2 != -48) {
            method943(39);
        }
        while (var4 < this.field2600.length) {
            if (!arg1.method876(true, this.field2600[var4])) {
                return false;
            }
            var4++;
        }
        for (int var5 = 0; var5 < this.field2613.length; var5++) {
            if (!arg0.method46((byte) 24, this.field2613[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZDIILwj;Ln;IZ)[I")
    public final int[] method948(boolean arg0, double arg1, int arg2, int arg3, class233 arg4, class138 arg5, int arg6, boolean arg7) {
        class33.method172(118, arg1);
        class143.field2464 = arg5;
        class225.field3837 = arg4;
        class245.method1636(arg2, (byte) 7, arg6);
        int[] var10 = new int[arg2 * arg6];
        field2598++;
        for (int var11 = 0; var11 < this.field2611.length; var11++) {
            this.field2611[var11].method1621(arg6, (byte) 121, arg2);
        }
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var13 = -1;
            var12 = arg2 - 1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = arg3; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2603.field4230) {
                int[] var18 = this.field2603.method77(-95, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2603.method80(230, var16);
                var19 = var22[1];
                var21 = var22[2];
                var20 = var22[0];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
                int var25 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class52.field926[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = var21[var23] >> 4;
                int var28 = class52.field926[var25];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class52.field926[var27];
                var10[var15++] = (var26 << 16) - (-(var28 << 8) - var29);
                if (arg0) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2611.length; var17++) {
            this.field2611[var17].method227(arg3 + 256);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method949(String arg0, Throwable arg1, int arg2) {
        field2610++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class192.method1220(0, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class165.field2766.field4153 == null) {
                return;
            }
            class74 var8 = class165.field2766.method1601((byte) -9, new URL(class165.field2766.field4153.getCodeBase(), "clienterror.ws?c=" + class58.field1071 + "&u=" + class151.field2632 + "&v1=" + class239.field4166 + "&v2=" + class239.field4152 + "&e=" + var7));
            while (var8.field1302 == 0) {
                class171.method1088(102, 1L);
            }
            if (var8.field1302 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1299;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg2 > -101) {
            method949((String) null, (Throwable) null, 19);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class149() {
        this.field2600 = new int[0];
        this.field2613 = new int[0];
        this.field2603 = new class256();
        this.field2603.field4236 = 1;
        this.field2614 = new class256();
        this.field2611 = new class243[] { this.field2603, this.field2614 };
        this.field2614.field4236 = 1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lnj;)V")
    public class149(class226 arg0) {
        int var2 = arg0.method1471(255);
        this.field2611 = new class243[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class243 var16 = class207.method1317(arg0, 0);
            if (var16.method449((byte) -64) >= 0) {
                var3++;
            }
            if (var16.method228(-23565) >= 0) {
                var4++;
            }
            int var17 = var16.field4234.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1471(255);
            }
            this.field2611[var6] = var16;
        }
        this.field2613 = new int[var4];
        int var7 = 0;
        this.field2600 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class243 var11 = this.field2611[var9];
            int var12 = var11.field4234.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4234[var13] = this.field2611[var5[var9][var13]];
            }
            int var14 = var11.method449((byte) -64);
            int var15 = var11.method228(-23565);
            if (var14 > 0) {
                this.field2600[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2613[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2603 = this.field2611[arg0.method1471(255)];
        this.field2614 = this.field2611[arg0.method1471(255)];
    }
}
