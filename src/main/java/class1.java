import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class264 {

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    private int field2 = 4096;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static volatile int field1 = -1;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "[[B")
    public static byte[][] field6 = new byte[50][];

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "[I")
    public static int[] field9 = new int[25];

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "Lq;")
    public static class169 field11;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V", line = 8)
    public static void method1(boolean arg0) {
        if (!arg0) {
            field11 = null;
            field9 = null;
            field6 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V", line = 22)
    public static final void method2(int arg0, int arg1) {
        field12++;
        class101.field1515.method517(false, arg1);
        class24.field412.method517(false, arg1);
        if (arg0 != -20543) {
            method7(-79, -76);
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V", line = 36)
    public static final void method3(byte arg0) {
        if (arg0 < 118) {
            field11 = (class169) null;
        }
        field10++;
        class281.field4751.method523(123);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILii;)V", line = 55)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field5++;
        if (arg1 < -27 && arg0 == 0) {
            this.field2 = arg2.method1524((byte) 95);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 68)
    public class1() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I", line = 75)
    public final int[] method5(int arg0, int arg1) {
        field7++;
        if (arg0 >= -58) {
            field6 = (byte[][]) ((byte[][]) null);
        }
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, class68.field1082 & arg1 - 1, 90);
            int[] var5 = this.method1815(0, arg1, -120);
            int[] var6 = this.method1815(0, arg1 + 1 & class68.field1082, 69);
            for (int var7 = 0; var7 < class226.field3716; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2;
                int var9 = (var5[var7 + 1 & class256.field4370] - var5[class256.field4370 & var7 - 1]) * this.field2;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZBII)V", line = 152)
    public static final void method6(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        class60.field938++;
        if (!arg2) {
            class198.method1307(true, (byte) -108);
            class251.method1752((byte) -123, true);
            class198.method1307(false, (byte) -108);
        }
        field4++;
        class251.method1752((byte) -120, false);
        if (!arg2) {
            class165.method1105(-1);
        }
        class228.method1615(60);
        class29.method206(arg4, (byte) -111, arg5, arg0, arg1, true);
        int var6 = class156.field2333;
        int var7 = class244.field4052;
        int var8 = class255.field4361;
        int var9 = class267.field4598;
        if (class270.field4631 == 1) {
            int var10 = class24.field416 + class2.field25 & 0x7FF;
            int var11 = class46.field707;
            if (class230.field3826 / 256 > var11) {
                var11 = class230.field3826 / 256;
            }
            if (client.field1751[4] && var11 < (class80.field1235[4] + 128)) {
                var11 = class80.field1235[4] + 128;
            }
            class97.method624(var11, class280.field4748, class20.method161(class151.field2183.field211, class151.field2183.field178, 1, class276.field4701) - 50, class249.field4126, var10, var7, (byte) 117, var11 * 3 + 600);
        }
        int var12 = class239.field3970;
        int var13 = class27.field437;
        int var14 = class207.field3287;
        int var15 = class114.field1710;
        int var16 = class303.field5108;
        for (int var17 = 0; var17 < 5; var17++) {
            if (client.field1751[var17]) {
                int var18 = (int) ((double) (class23.field392[var17] * 2 + 1) * Math.random() + Math.sin((double) class260.field4442[var17] / 100.0D * (double) class249.field4118[var17]) * (double) class80.field1235[var17] - (double) class23.field392[var17]);
                if (var17 == 4) {
                    class207.field3287 += var18;
                    if (class207.field3287 < 128) {
                        class207.field3287 = 128;
                    }
                    if (class207.field3287 > 383) {
                        class207.field3287 = 383;
                    }
                }
                if (var17 == 1) {
                    class27.field437 += var18;
                }
                if (var17 == 3) {
                    class114.field1710 = class114.field1710 + var18 & 0x7FF;
                }
                if (var17 == 0) {
                    class239.field3970 += var18;
                }
                if (var17 == 2) {
                    class303.field5108 += var18;
                }
            }
        }
        class70.method501(23666);
        class124.method822(var6, var9, var6 + var8, var7 + var9);
        if (arg3 <= 99) {
            return;
        }
        float var19 = (float) class114.field1710 * 0.17578125F;
        float var20 = (float) class207.field3287 * 0.17578125F;
        if (class270.field4631 == 3) {
            var19 = class296.field4986 * 360.0F / 6.2831855F;
            var20 = class35.field550 * 360.0F / 6.2831855F;
        }
        class45.method322(var6, var9, var8, var7, var6 + (var8 / 2), var7 / 2 + var9, var20, var19, class103.field1543, class103.field1543);
        if (class251.field4162 || var6 > class176.field2683 || var6 + var8 <= class176.field2683 || var9 > class51.field808 || class51.field808 >= var7 + var9) {
            class76.field1189 = 0;
            class242.field4033 = false;
        } else {
            class76.field1189 = 0;
            class242.field4033 = true;
            int var21 = class196.field3067;
            int var22 = class99.field1476;
            int var23 = class280.field4750;
            int var24 = class84.field1276;
            class73.field1148 = (class176.field2683 - var6) * (var22 - var21) / var8 + var21;
            class170.field2619 = (class51.field808 - var9) * (var24 - var23) / var7 + var23;
        }
        class177.method1155((byte) 96);
        byte var25 = class200.method1313(0) == 2 ? (byte) class60.field938 : 1;
        boolean var26 = false;
        class45.method306();
        class45.method317(true);
        class45.method332(true);
        int var27;
        if (class5.field58 == 10) {
            var27 = class221.method1540(class282.field4788, class66.field1037, class303.field5108 >> 10, 117, class239.field3970 >> 10);
        } else {
            var27 = class221.method1540(class282.field4788, class66.field1037, class151.field2183.field186[0] >> 3, -69, class151.field2183.field175[0] >> 3);
        }
        class53.method399(class50.field784, !class117.field1781);
        class45.method312(var27);
        class184.method1207(class114.field1710, (byte) 38, class303.field5108, class207.field3287, class239.field3970, class27.field437);
        class45.field660 = class50.field784;
        class59.method441(class239.field3970, class27.field437, class303.field5108, class207.field3287, class114.field1710, class141.field2081, class209.field3313, class281.field4761, class29.field478, class257.field4395, class275.field4687, class276.field4701 + 1, var25, class151.field2183.field178 >> 7, class151.field2183.field211 >> 7);
        class40.field605 = true;
        class53.method400();
        class184.method1207(0, (byte) 38, 0, 0, 0, 0);
        class177.method1155((byte) 96);
        class89.method587();
        class180.method1178(var8, var7, 0, var6, class103.field1543, var9, class103.field1543);
        class208.method1370(class103.field1543, var9, class103.field1543, var7, true, var6, var8);
        ((class164) class229.field3802).method1089(-29209, class282.field4788);
        class37.method264(var8, false, var9, var6, var7);
        class239.field3970 = var12;
        class303.field5108 = var16;
        class27.field437 = var13;
        class207.field3287 = var14;
        class114.field1710 = var15;
        if (class31.field486 && class301.method2045(false, true, (byte) -95) == 0) {
            class31.field486 = false;
        }
        if (class31.field486) {
            class124.method826(var6, var9, var8, var7, 0);
            class97.method620(class112.field1666, -46, false);
        }
        if (!arg2 && !class31.field486 && !class251.field4162 && var6 <= class176.field2683 && class176.field2683 < var6 + var8 && var9 <= class51.field808 && var7 + var9 > class51.field808) {
            class150.method943((byte) 83, class51.field808, var6, var9, class176.field2683, var8, var7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)V", line = 345)
    public static final void method7(int arg0, int arg1) {
        field8++;
        class250 var2 = class282.method1912(384132640, arg0, 2);
        if (arg1 != 2047) {
            field11 = (class169) null;
        }
        var2.method1748(0);
    }
}
