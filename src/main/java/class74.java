import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class74 extends class33 {

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    private int field1436 = 20;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    private int field1439 = 0;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    private int field1447 = 1365;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field1452 = 0;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
    public static boolean field1441 = false;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Lrd;")
    private static class173 field1443 = class133.method843("Existing User", -81);

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public static volatile int field1450 = 0;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lrd;")
    public static class173 field1455 = field1443;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "[La;")
    public static class1[] field1446 = new class1[256];

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lrd;")
    private static class173 field1454 = class133.method843("Please contact customer support)3", 88);

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Lrd;")
    public static class173 field1440 = field1454;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "La;")
    public static class1 field1444;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "[I")
    public static int[] field1445;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static final void method454(int arg0) {
        if (arg0 < 91) {
            field1445 = null;
        }
        class105.field1938.method53(-51);
        class12.field193.method53(-51);
        class188.field3671.method53(-51);
        class175.field3441.method53(-51);
        class152.field2884.method53(-51);
        ++field1448;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public static final void method455(int arg0) {
        try {
            if (class80.field1583 == null) {
                class80.field1583 = new class66(class64.field1264, class173.method1158(-3, new class173[] { class84.field1671, class208.field4052, class121.field2274 }).method1129((byte) 64));
            } else {
                byte[] var1 = class80.field1583.method412((byte) 78);
                if (var1 != null) {
                    class121 var2 = new class121(var1);
                    class112.field2079 = var2.method755((byte) -94);
                    class198.field3861 = new class40[class112.field2079];
                    for (int var3 = 0; var3 < class112.field2079; ++var3) {
                        class40 var4 = class198.field3861[var3] = new class40();
                        int var5 = var2.method755((byte) -34);
                        var4.field834 = (var5 & 32768) != 0;
                        var4.field822 = var5 & 32767;
                        var4.field833 = var2.method746(-19941);
                        var4.field832 = var2.method782(true);
                        var4.field826 = var3;
                        var4.field825 = class5.method41(var4.field833, false);
                    }
                    class157.method1032(class198.field3861.length - 1, class149.field2839, (byte) 89, class198.field3861, 0, class161.field3002);
                    class24.field526 = true;
                    class80.field1583 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class80.field1583 = null;
        }
        if (arg0 > -65) {
            field1440 = null;
        }
        ++field1456;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIIII)V")
    public static final void method456(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1437;
        int var6 = -arg5 + arg1;
        int var7 = -arg4 + arg2;
        if (~var6 == -1) {
            if (var7 != 0) {
                class99.method611(arg5, (byte) -18, arg4, arg3, arg2);
            }
        } else if (var7 == 0) {
            class208.method1376(true, arg3, arg4, arg5, arg1);
        } else {
            if (arg0 < 27) {
                method459(-39);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg5 * var8 >> 12) + arg4;
            int var10;
            int var11;
            if (class194.field3778 <= arg5) {
                if (~arg5 >= ~class96.field1766) {
                    var10 = arg5;
                    var11 = arg4;
                } else {
                    var10 = class96.field1766;
                    var11 = (class96.field1766 * var8 >> 12) + var9;
                }
            } else {
                var10 = class194.field3778;
                var11 = var9 - -(class194.field3778 * var8 >> 12);
            }
            int var12;
            int var13;
            if (class194.field3778 <= arg1) {
                if (arg1 > class96.field1766) {
                    var12 = class96.field1766;
                    var13 = var9 - -(class96.field1766 * var8 >> 12);
                } else {
                    var12 = arg1;
                    var13 = arg2;
                }
            } else {
                var13 = (class194.field3778 * var8 >> 12) + var9;
                var12 = class194.field3778;
            }
            if (class37.field790 > var11) {
                var10 = (-var9 + class37.field790 << 12) / var8;
                var11 = class37.field790;
            } else if (~class20.field445 > ~var11) {
                var11 = class20.field445;
                var10 = (class20.field445 - var9 << 12) / var8;
            }
            if (~class37.field790 >= ~var13) {
                if (~var13 < ~class20.field445) {
                    var13 = class20.field445;
                    var12 = (class20.field445 - var9 << 12) / var8;
                }
            } else {
                var13 = class37.field790;
                var12 = (-var9 + class37.field790 << 12) / var8;
            }
            class145.method921(var13, var11, var12, 0, var10, arg3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4;
        if (arg3 > -52) {
            method459(101);
        }
        while (arg2 + arg4 >= var5) {
            for (int var6 = arg0; arg0 + arg1 >= var6; ++var6) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class140.field2602[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class46.field975[0][var6][var5] = class46.field975[0][var6 + -1][var5];
                    }
                    if (~(arg0 + arg1) == ~var6 && ~var6 > -104) {
                        class46.field975[0][var6][var5] = class46.field975[0][var6 + 1][var5];
                    }
                    if (~arg4 == ~var5 && var5 > 0) {
                        class46.field975[0][var6][var5] = class46.field975[0][var6][var5 + -1];
                    }
                    if (arg2 + arg4 == var5 && ~var5 > -104) {
                        class46.field975[0][var6][var5] = class46.field975[0][var6][var5 + 1];
                    }
                }
            }
            ++var5;
        }
        ++field1438;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)I")
    public static final int method458(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method457(-12, -26, -65, 71, 118);
        }
        ++field1442;
        int var5 = 65536 - class72.field1404[arg4 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1444 = null;
        field1443 = null;
        field1440 = null;
        if (arg0 < -96) {
            field1455 = null;
            field1454 = null;
            field1445 = null;
            field1446 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static final void method460(byte arg0) {
        class45.field920 = 0;
        ++field1435;
        if (arg0 < -86) {
            class36.field783 = 0;
            class24.method191((byte) -72);
            class117.method709((byte) -7);
            class153.method1004(false);
            class174.method1163((byte) -59);
            for (int var1 = 0; ~var1 > ~class45.field920; ++var1) {
                int var3 = class40.field819[var1];
                if (~class217.field4203 != ~class183.field3600[var3].field2800) {
                    class183.field3600[var3] = null;
                }
            }
            if (~class45.field919 != ~class70.field1358.field2222) {
                throw new RuntimeException("gpp1 pos:" + class70.field1358.field2222 + " psize:" + class45.field919);
            } else {
                for (int var2 = 0; ~class18.field378 < ~var2; ++var2) {
                    if (class183.field3600[class189.field3703[var2]] == null) {
                        throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class18.field378);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method461(byte arg0, Throwable arg1, String arg2) {
        ++field1457;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class172.method1115(32533, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg0 >= -114) {
                field1445 = null;
            }
            if (class82.field1610.field2465 != null) {
                class222 var8 = class82.field1610.method832(new URL(class82.field1610.field2465.getCodeBase(), "clienterror.ws?c=" + class3.field26 + "&u=" + class37.field791 + "&v1=" + class130.field2456 + "&v2=" + class130.field2453 + "&e=" + var7), 0);
                while (~var8.field4254 == -1) {
                    class151.method996(12121, 1L);
                }
                if (var8.field4254 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4256;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 > -99) {
            field1440 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field1452 = arg2.method755((byte) -57);
                    }
                } else {
                    this.field1439 = arg2.method755((byte) -75);
                }
            } else {
                this.field1436 = arg2.method755((byte) -114);
            }
        } else {
            this.field1447 = arg2.method755((byte) -73);
        }
        ++field1451;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1453;
        int[] var3 = super.field718.method514(arg0, 126);
        if (super.field718.field1615) {
            for (int var4 = 0; ~var4 > ~class117.field2173; ++var4) {
                int var5 = (class138.field2585[var4] << 12) / this.field1447 + this.field1439;
                int var6 = (class105.field1937[arg0] << 12) / this.field1447 + this.field1452;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~var13 > ~this.field1436) {
                    ++var13;
                    var9 = (var9 * var10 >> 12) * 2 + var7;
                    var10 = -var12 + var11 + var8;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1436 + -1 <= var13 ? 0 : (var13 << 12) / this.field1436;
            }
        }
        int var14 = 80 / ((-65 - arg1) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }
}
