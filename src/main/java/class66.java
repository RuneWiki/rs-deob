import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class66 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    public static int[] field1625 = new int[25];

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lmb;")
    public static class84 field1624 = class79.method672(true, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lmb;")
    private static class84 field1629 = class79.method672(true, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
    public static int[] field1630 = new int[128];

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lmb;")
    public static class84 field1639 = field1629;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lmb;")
    private static class84 field1637 = class79.method672(true, "Username: ");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1638 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lmb;")
    public static class84 field1621 = class79.method672(true, ": ");

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lmb;")
    public static class84 field1631 = field1637;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lmb;")
    public static class84 field1642 = class79.method672(true, "::clientdrop");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field1622;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
    public int[] field1623;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[Lr;")
    public static class112[] field1620;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "[[I")
    public static int[][] field1634;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILmb;I)V")
    public static final void method596(int arg0, class84 arg1, int arg2) {
        field1640++;
        class6.field112++;
        class80.field1978.method769((byte) -101, 47);
        if (arg2 != -1204) {
            method596(-18, null, 1);
        }
        class80.field1978.method414(0, arg1.method700((byte) 25));
        class80.field1978.method396(arg0, (byte) 43);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method122(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method597(byte arg0) {
        class90.field2257 = 0;
        field1636++;
        if (arg0 != 7) {
            return;
        }
        for (int var1 = -1; var1 < class71.field1746 + class77.field1940; var1++) {
            class145 var18;
            if (var1 == -1) {
                var18 = class40.field925;
            } else if (var1 >= class71.field1746) {
                var18 = class69.field1673[class87.field2146[var1 - class71.field1746]];
            } else {
                var18 = class44.field978[class80.field1990[var1]];
            }
            if (var18 != null && var18.method569((byte) -93)) {
                if (var18 instanceof class103) {
                    class141 var19 = ((class103) var18).field2510;
                    if (var19.field3370 != null) {
                        var19 = var19.method1144(0);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class71.field1746 <= var1) {
                    class141 var22 = ((class103) var18).field2510;
                    if (var22.field3370 != null) {
                        var22 = var22.method1144(0);
                    }
                    if (var22.field3405 >= 0 && var22.field3405 < class141.field3384.length) {
                        class83.method693(var18.field3552 + 15, (byte) 75, var18);
                        if (client.field476 > -1) {
                            class141.field3384[var22.field3405].method928(client.field476 - 12, class30.field701 + -30);
                        }
                    }
                    if (class16.field339 == 1 && class87.field2146[var1 - class71.field1746] == class38.field849 && class5.field100 % 20 < 10) {
                        class83.method693(var18.field3552 + 15, (byte) 108, var18);
                        if (client.field476 > -1) {
                            class97.field2392[0].method928(client.field476 - 12, class30.field701 - 28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class62 var21 = (class62) var18;
                    if (var21.field1522 != -1 || var21.field1527 != -1) {
                        class83.method693(var18.field3552 + 15, (byte) 91, var18);
                        if (client.field476 > -1) {
                            if (var21.field1522 != -1) {
                                field1620[var21.field1522].method928(client.field476 - 12, -var20 + class30.field701);
                                var20 += 25;
                            }
                            if (var21.field1527 != -1) {
                                class141.field3384[var21.field1527].method928(client.field476 - 12, -var20 + class30.field701);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class16.field339 == 10 && class80.field1990[var1] == class94.field2339) {
                        class83.method693(var18.field3552 + 15, (byte) 92, var18);
                        if (client.field476 > -1) {
                            class97.field2392[1].method928(client.field476 - 12, -var20 + class30.field701);
                        }
                    }
                }
                if (var18.field3520 != null && (var1 >= class71.field1746 || class88.field2214 == 0 || class88.field2214 == 3 || class88.field2214 == 1 && class88.method752(0, ((class62) var18).field1535))) {
                    class83.method693(var18.field3552, (byte) 75, var18);
                    if (client.field476 > -1 && class90.field2257 < class57.field1366) {
                        class57.field1340[class90.field2257] = class13.field239.method219(var18.field3520) / 2;
                        class57.field1356[class90.field2257] = class13.field239.field668;
                        class57.field1318[class90.field2257] = client.field476;
                        class57.field1375[class90.field2257] = class30.field701;
                        class57.field1357[class90.field2257] = var18.field3508;
                        class57.field1422[class90.field2257] = var18.field3512;
                        class57.field1330[class90.field2257] = var18.field3507;
                        class57.field1350[class90.field2257] = var18.field3520;
                        class90.field2257++;
                    }
                }
                if (var18.field3515 > class5.field100) {
                    class83.method693(var18.field3552 + 15, (byte) 78, var18);
                    if (client.field476 > -1) {
                        int var23 = var18.field3522 * 30 / var18.field3536;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class142.method1151(client.field476 - 15, class30.field701 + -3, var23, 5, 65280);
                        class142.method1151(var23 + client.field476 - 15, class30.field701 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field3540[var24] > class5.field100) {
                        class83.method693(var18.field3552 / 2, (byte) 103, var18);
                        if (client.field476 > -1) {
                            if (var24 == 1) {
                                class30.field701 -= 20;
                            }
                            if (var24 == 2) {
                                class30.field701 -= 10;
                                client.field476 -= 15;
                            }
                            if (var24 == 3) {
                                class30.field701 -= 10;
                                client.field476 += 15;
                            }
                            class51.field1094[var18.field3503[var24]].method928(client.field476 - 12, class30.field701 - 12);
                            class88.field2188.method213(class93.method787(arg0 ^ 0x56E2, var18.field3554[var24]), client.field476, class30.field701 + 4, 0);
                            class88.field2188.method213(class93.method787(22245, var18.field3554[var24]), client.field476 - 1, class30.field701 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class90.field2257; var2++) {
            int var3 = class57.field1318[var2];
            int var4 = class57.field1375[var2];
            int var5 = class57.field1340[var2];
            int var6 = class57.field1356[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var4 + 2 > class57.field1375[var17] + -class57.field1356[var17] && var4 - var6 < class57.field1375[var17] - -2 && class57.field1318[var17] + class57.field1340[var17] > -var5 + var3 && var3 + var5 > class57.field1318[var17] + -class57.field1340[var17] && var4 > class57.field1375[var17] - class57.field1356[var17]) {
                        var4 = class57.field1375[var17] - class57.field1356[var17];
                        var7 = true;
                    }
                }
            }
            client.field476 = class57.field1318[var2];
            class30.field701 = class57.field1375[var2] = var4;
            class84 var8 = class57.field1350[var2];
            if (class127.field3061 == 0) {
                int var9 = 16776960;
                if (class57.field1357[var2] < 6) {
                    var9 = class37.field827[class57.field1357[var2]];
                }
                if (class57.field1357[var2] == 6) {
                    var9 = class20.field416 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class57.field1357[var2] == 7) {
                    var9 = class20.field416 % 20 >= 10 ? 65535 : 255;
                }
                if (class57.field1357[var2] == 8) {
                    var9 = class20.field416 % 20 < 10 ? 45056 : 8454016;
                }
                if (class57.field1357[var2] == 9) {
                    int var10 = 150 - class57.field1330[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16384000 + 16776960 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = var10 * 5 + 65280 - 500;
                    }
                }
                if (class57.field1357[var2] == 10) {
                    int var11 = 150 - class57.field1330[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 - (var11 + -100) * 5 - 32767745;
                    }
                }
                if (class57.field1357[var2] == 11) {
                    int var12 = 150 - class57.field1330[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class57.field1422[var2] == 0) {
                    class13.field239.method213(var8, client.field476, class30.field701 + 1, 0);
                    class13.field239.method213(var8, client.field476, class30.field701, var9);
                }
                if (class57.field1422[var2] == 1) {
                    class13.field239.method204(var8, client.field476, class30.field701 + 1, 0, class20.field416);
                    class13.field239.method204(var8, client.field476, class30.field701, var9, class20.field416);
                }
                if (class57.field1422[var2] == 2) {
                    class13.field239.method218(var8, client.field476, class30.field701 + 1, 0, class20.field416);
                    class13.field239.method218(var8, client.field476, class30.field701, var9, class20.field416);
                }
                if (class57.field1422[var2] == 3) {
                    class13.field239.method221(var8, client.field476, class30.field701 + 1, 0, class20.field416, 150 - class57.field1330[var2]);
                    class13.field239.method221(var8, client.field476, class30.field701, var9, class20.field416, 150 - class57.field1330[var2]);
                }
                if (class57.field1422[var2] == 4) {
                    int var13 = class13.field239.method219(var8);
                    int var14 = (150 - class57.field1330[var2]) * (var13 + 100) / 150;
                    class142.method1162(client.field476 - 50, 0, client.field476 + 50, 334);
                    class13.field239.method205(var8, client.field476 + 50 - var14, class30.field701 + 1, 0);
                    class13.field239.method205(var8, client.field476 + 50 - var14, class30.field701, var9);
                    class142.method1155();
                }
                if (class57.field1422[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - class57.field1330[var2];
                    class142.method1162(0, class30.field701 - class13.field239.field668 - 1, 512, class30.field701 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class13.field239.method213(var8, client.field476, class30.field701 + var15 + 1, 0);
                    class13.field239.method213(var8, client.field476, class30.field701 + var15, var9);
                    class142.method1155();
                }
            } else {
                class13.field239.method213(var8, client.field476, class30.field701 + 1, 0);
                class13.field239.method213(var8, client.field476, class30.field701, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method123(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIZI)Z")
    public static final boolean method598(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            return true;
        }
        field1635++;
        if (!class47.method338(21, arg4)) {
            return false;
        }
        class62.field1546 = null;
        boolean var7 = class98.method817(class24.field557[arg4], arg6, 0, arg1, arg3, arg2, -1, 0, 0, arg0);
        if (class62.field1546 != null) {
            class98.method817(class62.field1546, arg6, class77.field1947, arg1, arg3, arg2, -1412584499, class105.field2560, 0, arg0);
        }
        return var7;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method599(int arg0) {
        field1626++;
        class142.method1152(this.field1623, this.field1641, this.field1632);
        if (arg0 >= -86) {
            field1638 = -82;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1629 = null;
        field1625 = null;
        if (arg0 != 65) {
            field1627 = -104;
        }
        field1634 = null;
        field1621 = null;
        field1620 = null;
        field1639 = null;
        field1642 = null;
        field1637 = null;
        field1624 = null;
        field1630 = null;
        field1631 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1628++;
        class115.field2754[0].method979(arg4, arg2);
        class115.field2754[1].method979(arg4, arg0 + arg2 - 16);
        class142.method1151(arg4, arg2 + 16, 16, arg0 - 32, class71.field1738);
        if (arg1 != -32) {
            return;
        }
        int var6 = (arg0 - 32) * arg0 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg3 / (arg5 - arg0);
        class142.method1151(arg4, arg2 + var7 + 16, 16, var6, class38.field853);
        class142.method1153(arg4, var7 + arg2 + 16, var6, class136.field3283);
        class142.method1153(arg4 + 1, arg2 + 16 + var7, var6, class136.field3283);
        class142.method1157(arg4, arg2 + var7 + 16, 16, class136.field3283);
        class142.method1157(arg4, arg2 + var7 + 17, 16, class136.field3283);
        class142.method1153(arg4 + 15, arg2 + 16 + var7, var6, class50.field1060);
        class142.method1153(arg4 + 14, arg2 + 17 - -var7, var6 - 1, class50.field1060);
        class142.method1157(arg4, arg2 + var7 + var6 + 15, 16, class50.field1060);
        class142.method1157(arg4 + 1, arg2 - (-var6 + -var7) + 14, 15, class50.field1060);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    protected class66() {
    }
}
