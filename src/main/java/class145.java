import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class145 {

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lrc;")
    private class119 field3510 = null;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    private int field3512 = 65000;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Lrc;")
    private class119 field3523 = null;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Loa;")
    public static class98 field3495 = class38.method349(255, "Nehmen");

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Loa;")
    private static class98 field3498 = class38.method349(255, "Accept challenge");

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Loa;")
    public static class98 field3509 = field3498;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Loa;")
    public static class98 field3503 = class38.method349(255, "");

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Loa;")
    public static class98 field3520 = class38.method349(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Loa;")
    private static class98 field3522 = class38.method349(255, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Loa;")
    public static class98 field3499 = field3503;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Loa;")
    public static class98 field3516 = field3503;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Loa;")
    public static class98 field3518 = field3503;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Loa;")
    public static class98 field3497 = field3503;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Loa;")
    public static class98 field3526 = class38.method349(255, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Loa;")
    public static class98 field3505 = field3503;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Loa;")
    public static class98 field3521 = field3503;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Loa;")
    public static class98 field3502 = field3503;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Loa;")
    private static class98 field3514 = class38.method349(255, "cyan:");

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Loa;")
    public static class98 field3511 = field3514;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "Loa;")
    public static class98 field3527 = field3522;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Z")
    public static boolean field3529 = false;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Loa;")
    public static class98 field3513 = field3514;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "Loa;")
    public static class98 field3530 = field3503;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lgb;")
    public static class45 field3525;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lid;")
    public static class60 field3504;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1161(int arg0) {
        field3525 = null;
        field3518 = null;
        field3511 = null;
        if (arg0 != -1) {
            return;
        }
        field3503 = null;
        field3497 = null;
        field3514 = null;
        field3499 = null;
        field3513 = null;
        field3505 = null;
        field3520 = null;
        field3502 = null;
        field3527 = null;
        field3530 = null;
        field3521 = null;
        field3509 = null;
        field3526 = null;
        field3516 = null;
        field3522 = null;
        field3495 = null;
        field3504 = null;
        field3498 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Lid;")
    public static final class60 method1162(boolean arg0) {
        field3519++;
        if (!arg0) {
            field3509 = null;
        }
        class60 var1 = new class60();
        var1.field1315 = class55.field1207[0];
        var1.field1314 = class78.field1713;
        var1.field1310 = class83.field1928[0];
        var1.field1309 = class102.field2351;
        byte[] var2 = class138.field3382[0];
        var1.field1312 = class91.field2103[0];
        var1.field1313 = class62.field1318[0];
        int var3 = var1.field1313 * var1.field1312;
        var1.field1311 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1311[var4] = class83.field1934[class150.method1211(var2[var4], 255)];
        }
        class150.method1203(-1454146233);
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ltd;B)V")
    public static final void method1163(class132 arg0, byte arg1) {
        field3515++;
        int var2 = arg0.field3135 >> 16;
        if (arg1 != 69) {
            method1163(null, (byte) 39);
        }
        if (class71.field1462 == var2 || class83.field1923 == var2) {
            class15.field306 = true;
        }
        if (class132.field3111 == var2 || class52.field1163[class31.field709] == var2) {
            class137.field3332 = true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[B")
    public final byte[] method1164(int arg0, int arg1) {
        field3496++;
        class119 var3 = this.field3510;
        synchronized (this.field3510) {
            try {
                if (this.field3523.method945((byte) 61) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3523.method949((long) (arg1 * 6), false);
                this.field3523.method951(class65.field1384, 6, false, 0);
                int var5 = ((class65.field1384[0] & 0xFF) << 16) + ((class65.field1384[1] & 0xFF) << 8) + (class65.field1384[2] & 0xFF);
                int var6 = (class65.field1384[5] & 0xFF) + (((class65.field1384[3] & 0xFF) << 16) + ((class65.field1384[4] & 0xFF) << 8));
                if (var5 < 0 || var5 > this.field3512) {
                    return null;
                } else if (var6 > 0 && this.field3510.method945((byte) 61) / 520L >= (long) var6) {
                    if (arg0 != 1338129168) {
                        field3509 = null;
                    }
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label74: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var11;
                        this.field3510.method949((long) (var6 * 520), false);
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3510.method951(class65.field1384, var13 + 8, false, 0);
                        int var14 = ((class65.field1384[2] & 0xFF) << 8) + (class65.field1384[3] & 0xFF);
                        int var15 = class65.field1384[7] & 0xFF;
                        int var16 = ((class65.field1384[0] & 0xFF) << 8) + (class65.field1384[1] & 0xFF);
                        int var17 = ((class65.field1384[5] & 0xFF) << 8) + ((class65.field1384[4] & 0xFF) << 16) + (class65.field1384[6] & 0xFF);
                        if (arg1 == var16 && var9 == var14 && this.field3517 == var15) {
                            if (var17 >= 0 && (long) var17 <= this.field3510.method945((byte) 61) / 520L) {
                                var6 = var17;
                                var9++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var10[var11++] = class65.field1384[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIZII)Z")
    private final boolean method1165(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3528++;
        class119 var6 = this.field3510;
        synchronized (this.field3510) {
            try {
                int var8;
                if (arg2) {
                    if (this.field3523.method945((byte) 61) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field3523.method949((long) (arg3 * 6), false);
                    this.field3523.method951(class65.field1384, 6, false, 0);
                    var8 = ((class65.field1384[3] & 0xFF) << 16) + ((class65.field1384[4] & 0xFF) << 8) + (class65.field1384[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field3510.method945((byte) 61) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3510.method945((byte) 61) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class65.field1384[1] = (byte) (arg4 >> 8);
                class65.field1384[0] = (byte) (arg4 >> 16);
                class65.field1384[5] = (byte) var8;
                class65.field1384[2] = (byte) arg4;
                class65.field1384[3] = (byte) (var8 >> 16);
                int var10 = 0;
                int var11 = 0;
                class65.field1384[4] = (byte) (var8 >> 8);
                this.field3523.method949((long) (arg3 * 6), false);
                this.field3523.method944(6, class65.field1384, arg1, true);
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label104: {
                            this.field3510.method949((long) (var8 * 520), false);
                            try {
                                this.field3510.method951(class65.field1384, 8, false, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class65.field1384[4] & 0xFF) << 16) + (((class65.field1384[5] & 0xFF) << 8) + (class65.field1384[6] & 0xFF));
                            int var13 = ((class65.field1384[0] & 0xFF) << 8) + (class65.field1384[1] & 0xFF);
                            int var14 = ((class65.field1384[2] & 0xFF) << 8) + (class65.field1384[3] & 0xFF);
                            int var15 = class65.field1384[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field3517 == var15) {
                                if (var12 >= 0 && this.field3510.method945((byte) 61) / 520L >= (long) var12) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3510.method945((byte) 61) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class65.field1384[7] = (byte) this.field3517;
                    class65.field1384[2] = (byte) (var11 >> 8);
                    class65.field1384[0] = (byte) (arg3 >> 8);
                    class65.field1384[3] = (byte) var11;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class65.field1384[6] = (byte) var12;
                    class65.field1384[4] = (byte) (var12 >> 16);
                    class65.field1384[1] = (byte) arg3;
                    class65.field1384[5] = (byte) (var12 >> 8);
                    var11++;
                    this.field3510.method949((long) (var8 * 520), false);
                    var8 = var12;
                    this.field3510.method944(8, class65.field1384, 0, true);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3510.method944(var18, arg0, var10, true);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3506++;
        return "Cache:" + this.field3517;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1166(int arg0, int arg1, byte[] arg2, int arg3) {
        field3508++;
        class119 var5 = this.field3510;
        synchronized (this.field3510) {
            if (arg1 < 0 || arg1 > this.field3512) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1165(arg2, 0, true, arg3, arg1);
            if (!var6) {
                var6 = this.method1165(arg2, 0, false, arg3, arg1);
            }
            int var7 = -73 % ((-arg0 - 69) / 32);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lta;")
    public static final class129 method1167(int arg0, int arg1) {
        field3500++;
        class129 var2 = (class129) class106.field2427.method730((byte) 35, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 65280) {
            field3509 = null;
        }
        byte[] var3 = class54.field1191.method1058(6, -82, arg0);
        class129 var4 = new class129();
        var4.field2982 = arg0;
        if (var3 != null) {
            var4.method1030((byte) 84, new class8(var3));
        }
        var4.method1041(arg1 - 65181);
        if (var4.field2958) {
            var4.field2947 = 0;
            var4.field2965 = false;
        }
        class106.field2427.method732(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILrc;Lrc;I)V")
    public class145(int arg0, class119 arg1, class119 arg2, int arg3) {
        this.field3523 = arg2;
        this.field3512 = arg3;
        this.field3517 = arg0;
        this.field3510 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILgb;Lgb;)V")
    public static final void method1168(int arg0, class45 arg1, class45 arg2) {
        field3524++;
        if (class33.field815) {
            class137.method1112(arg1, true, arg2);
            return;
        }
        if (~class52.field1148 == arg0 || class52.field1148 == 5) {
            byte var3 = 20;
            arg2.method388(class33.field821, 382, 245 - var3, 16777215);
            int var4 = 253 - var3;
            class7.method49(230, var4, 304, 34, 9179409);
            class7.method49(231, var4 + 1, 302, 32, 0);
            class7.method41(232, var4 + 2, class81.field1835 * 3, 30, 9179409);
            class7.method41(class81.field1835 * 3 + 232, var4 + 2, 300 - class81.field1835 * 3, 30, 0);
            arg2.method388(class80.field1759, 382, 276 - var3, 16777215);
        }
        if (class52.field1148 == 20) {
            client.field505.method830(382 - client.field505.field2325 / 2, -(client.field505.field2328 / 2) + 271);
            short var5 = 211;
            arg2.method381(class80.field1748, 382, var5, 16776960, true);
            int var23 = var5 + 15;
            arg2.method381(class80.field1776, 382, var23, 16776960, true);
            int var24 = var23 + 15;
            arg2.method381(class80.field1766, 382, var24, 16776960, true);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method386(class102.method840(new class98[] { class42.field994, class80.field1744 }, 10), 292, var26, 16777215, true);
            int var27 = var26 + 15;
            arg2.method386(class102.method840(new class98[] { class76.field1672, class80.field1777.method806((byte) -97) }, 10), 294, var27, 16777215, true);
            int var28 = var27 + 15;
        }
        if (class52.field1148 == 10) {
            client.field505.method830(202, 171);
            if (class118.field2636 == 0) {
                short var13 = 251;
                short var14 = 291;
                short var15 = 302;
                arg2.method381(class88.field2023, 382, var13, 16776960, true);
                class26.field622.method830(var15 - 73, var14 + -20);
                int var39 = var13 + 30;
                arg2.method387(class11.field232, var15 - 73, var14 - 20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 462;
                class26.field622.method830(var16 - 73, var14 - 20);
                arg2.method387(class134.field3260, var16 - 73, var14 - 20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class118.field2636 == 2) {
                short var9 = 211;
                arg2.method381(class80.field1748, 382, var9, 16776960, true);
                int var32 = var9 + 15;
                short var10 = 302;
                arg2.method381(class80.field1776, 382, var32, 16776960, true);
                int var34 = var32 + 15;
                arg2.method381(class80.field1766, 382, var34, 16776960, true);
                int var35 = var34 + 15;
                short var11 = 321;
                int var36 = var35 + 10;
                arg2.method386(class102.method840(new class98[] { class42.field994, class80.field1744, class119.field2680 % 40 < 20 & class74.field1564 == 0 ? class29.field682 : class80.field1760 }, arg0 ^ 0xFFFFFFF5), 292, var36, 16777215, true);
                int var37 = var36 + 15;
                arg2.method386(class102.method840(new class98[] { class76.field1672, class80.field1777.method806((byte) -97), class74.field1564 == 1 & class119.field2680 % 40 < 20 ? class29.field682 : class80.field1760 }, arg0 ^ 0xFFFFFFF5), 294, var37, 16777215, true);
                int var38 = var37 + 15;
                class26.field622.method830(var10 - 73, var11 - 20);
                arg2.method381(class115.field2596, var10, var11 + 5, 16777215, true);
                short var12 = 462;
                class26.field622.method830(var12 - 73, var11 + -20);
                arg2.method381(class24.field590, var12, var11 + 5, 16777215, true);
            } else if (class118.field2636 == 3) {
                arg2.method381(class88.field2021, 382, 211, 16776960, true);
                short var6 = 382;
                short var7 = 321;
                short var8 = 236;
                arg2.method381(class27.field658, 382, var8, 16777215, true);
                int var29 = var8 + 15;
                arg2.method381(class118.field2625, 382, var29, 16777215, true);
                int var30 = var29 + 15;
                arg2.method381(class121.field2707, 382, var30, 16777215, true);
                int var31 = var30 + 15;
                arg2.method381(class130.field3005, 382, var31, 16777215, true);
                class26.field622.method830(var6 - 73, var7 + -20);
                arg2.method381(class24.field590, var6, var7 + 5, 16777215, true);
                int var33 = var31 + 15;
            }
        }
        if (class86.field1974 > 0) {
            class49.method420(class86.field1974, (byte) 4);
            class86.field1974 = 0;
        }
        class120.method955(-113);
        class52.field1139[class91.field2107 ? 1 : 0].method830(725, 463);
        if (class52.field1148 > 5 && class147.field3598 != 2 && class139.field3391 == 0) {
            if (class37.field920 == null) {
                class37.field920 = class20.method188(class135.field3295, class135.field3290, (byte) -127, class80.field1760);
            } else {
                byte var17 = 5;
                byte var18 = 100;
                short var19 = 463;
                class37.field920.method830(var17, var19);
                byte var20 = 35;
                arg2.method381(class102.method840(new class98[] { class73.field1533, class4.field64, class132.method1074(class5.field74, (byte) 73) }, 10), var17 + var18 / 2, var20 / 2 + var19 + -2, 16777215, true);
                if (class35.field864 == null) {
                    arg1.method381(class25.field598, var18 / 2 + var17, var20 / 2 + var19 + 12, 16777215, true);
                } else {
                    arg1.method381(client.field512, var18 / 2 + var17, var20 / 2 + var19 + 12, 16777215, true);
                }
            }
        }
        try {
            Graphics var21 = class73.field1506.getGraphics();
            class58.field1303.method406(32, 0, 0, var21);
        } catch (Exception var22) {
            class73.field1506.repaint();
        }
    }
}
