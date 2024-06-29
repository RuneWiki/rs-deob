import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class120 extends class22 {

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field2761 = 2;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Lva;")
    private static class121 field2773 = class107.method797(" is already on your ignore list", -10983);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lva;")
    public static class121 field2771 = field2773;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Lv;")
    public class120 field2770;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "Lv;")
    public class120 field2772;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lhe;")
    public static class47 field2774;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 6)
    public final void method926(boolean arg0) {
        field2776++;
        if (this.field2772 == null) {
            return;
        }
        this.field2772.field2770 = this.field2770;
        this.field2770.field2772 = this.field2772;
        if (arg0) {
            this.field2772 = null;
            this.field2770 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 25)
    public static final void method927(int arg0) {
        class107.method793(109);
        field2763++;
        if (class1.field8 == 2) {
            int[] var1 = class55.field1271;
            byte[] var2 = class124.field2833.field1695;
            int var3 = var2.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2[var4] == 0) {
                    var1[var4] = 0;
                }
            }
            class63.field1527.method82(0, 0, 33, 33, 25, 25, class96.field2149, 256, class82.field1894, client.field421);
            class81.method556((byte) -54);
            return;
        }
        int var5 = class96.field2149 + class69.field1633 & 0x7FF;
        int var6 = class62.field1494.field750 / 32 + 48;
        int var7 = 464 - class62.field1494.field742 / arg0;
        class63.field1522.method82(25, 5, 146, 151, var6, var7, var5, class28.field700 + 256, class44.field1013, class97.field2166);
        class63.field1527.method82(0, 0, 33, 33, 25, 25, class96.field2149, 256, class82.field1894, client.field421);
        for (int var8 = 0; var8 < class4.field75; var8++) {
            int var38 = class37.field875[var8] * 4 + 2 - class62.field1494.field742 / 32;
            int var39 = class42.field978[var8] * 4 + 2 - class62.field1494.field750 / 32;
            class48.method351(var39, (byte) -99, class64.field1549[var8], var38);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class9 var35 = class14.field249[class121.field2807][var9][var34];
                if (var35 != null) {
                    int var36 = var34 * 4 + 2 - class62.field1494.field742 / 32;
                    int var37 = var9 * 4 + 2 - class62.field1494.field750 / 32;
                    class48.method351(var37, (byte) -58, client.field441[0], var36);
                }
            }
        }
        for (int var10 = 0; var10 < class42.field965; var10++) {
            class50 var30 = class8.field110[class1.field7[var10]];
            if (var30 != null && var30.method232(-251272184)) {
                class16 var31 = var30.field1183;
                if (var31.field311 != null) {
                    var31 = var31.method131((byte) 2);
                }
                if (var31 != null && var31.field330 && var31.field322) {
                    int var32 = var30.field750 / 32 - class62.field1494.field750 / 32;
                    int var33 = var30.field742 / 32 - class62.field1494.field742 / 32;
                    class48.method351(var32, (byte) -123, client.field441[1], var33);
                }
            }
        }
        for (int var11 = 0; var11 < class13.field231; var11++) {
            class77 var22 = class127.field2895[class71.field1680[var11]];
            if (var22 != null && var22.method232(arg0 ^ 0xF105E428)) {
                int var23 = var22.field750 / 32 - class62.field1494.field750 / 32;
                int var24 = var22.field742 / 32 - class62.field1494.field742 / 32;
                boolean var25 = false;
                long var26 = var22.field1766.method932(arg0 + 80);
                for (int var28 = 0; var28 < class8.field119; var28++) {
                    if (class92.field2092[var28] == var26 && class41.field951[var28] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class62.field1494.field1777 != 0 && var22.field1777 != 0 && class62.field1494.field1777 == var22.field1777) {
                    var29 = true;
                }
                if (var25) {
                    class48.method351(var23, (byte) -98, client.field441[3], var24);
                } else if (var29) {
                    class48.method351(var23, (byte) -108, client.field441[4], var24);
                } else {
                    class48.method351(var23, (byte) -73, client.field441[2], var24);
                }
            }
        }
        if (class95.field2120 != 0 && class115.field2614 % 20 < 10) {
            if (class95.field2120 == 1 && class107.field2436 >= 0 && class8.field110.length > class107.field2436) {
                class50 var12 = class8.field110[class107.field2436];
                if (var12 != null) {
                    int var13 = var12.field750 / 32 - class62.field1494.field750 / 32;
                    int var14 = var12.field742 / 32 - class62.field1494.field742 / 32;
                    class108.method802(-12199, var13, class60.field1450[1], var14);
                }
            }
            if (class95.field2120 == 2) {
                int var15 = (class37.field871 - class9.field132) * 4 + 2 - class62.field1494.field742 / 32;
                int var16 = (class113.field2559 - class129.field2977) * 4 + 2 - class62.field1494.field750 / 32;
                class108.method802(-12199, var16, class60.field1450[1], var15);
            }
            if (class95.field2120 == 10 && class59.field1415 >= 0 && class127.field2895.length > class59.field1415) {
                class77 var17 = class127.field2895[class59.field1415];
                if (var17 != null) {
                    int var18 = var17.field742 / 32 - class62.field1494.field742 / 32;
                    int var19 = var17.field750 / 32 - class62.field1494.field750 / 32;
                    class108.method802(arg0 - 12231, var19, class60.field1450[1], var18);
                }
            }
        }
        if (class43.field988 != 0) {
            int var20 = class60.field1444 * 4 + 2 - class62.field1494.field742 / 32;
            int var21 = class43.field988 * 4 + 2 - class62.field1494.field750 / 32;
            class48.method351(var21, (byte) -58, class60.field1450[0], var20);
        }
        class55.method401(97, 78, 3, 3, 16777215);
        class81.method556((byte) -54);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V", line = 232)
    public static void method928(byte arg0) {
        field2774 = null;
        field2771 = null;
        if (arg0 != -37) {
            field2769 = -89;
        }
        field2773 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I", line = 248)
    public static final int method929(int arg0, int arg1, int arg2, int arg3) {
        field2768++;
        int var4 = arg2 / arg1;
        int var5 = arg0 / arg1;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg2 & arg1 - 1;
        int var8 = class28.method219((byte) 117, var5, var4);
        if (arg3 != -20648) {
            field2771 = null;
        }
        int var9 = class28.method219((byte) 109, var5 + 1, var4);
        int var10 = class28.method219((byte) 81, var5, var4 + 1);
        int var11 = class28.method219((byte) 94, var5 + 1, var4 - -1);
        int var12 = class69.method484(arg1, arg3 + 20540, var8, var6, var9);
        int var13 = class69.method484(arg1, arg3 ^ 0x50CC, var10, var6, var11);
        return class69.method484(arg1, -107, var12, var7, var13);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILbe;Lle;)V", line = 286)
    public static final void method930(int arg0, int arg1, class12 arg2, class71 arg3) {
        field2767++;
        byte[] var4 = null;
        class9 var5 = class15.field294;
        synchronized (class15.field294) {
            int var6 = -32 % ((32 - arg1) / 58);
            for (class101 var7 = (class101) class15.field294.method57((byte) 86); var7 != null; var7 = (class101) class15.field294.method66(-29860)) {
                if ((long) arg0 == var7.field577 && var7.field2252 == arg3 && var7.field2254 == 0) {
                    var4 = var7.field2263;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = arg3.method495(arg0, -1319);
            arg2.method96(var8, true, -3, arg0, arg3);
        } else {
            arg2.method96(var4, true, -3, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 356)
    public static final void method931(byte arg0) {
        if (arg0 == -8) {
            class60.field1441 = null;
            field2766++;
            class115.field2625 = null;
            class116.field2633 = null;
        }
    }
}
