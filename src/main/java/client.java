import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class655 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lra;")
    public static class361 field1206 = new class361(18, -1);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1223 = -1;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "[Lga;")
    public static class63[] field1224 = new class63[14];

    @OriginalMember(owner = "client!client", name = "H", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field1227;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field1225;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/Class;")
    public static Class field1226;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "[S")
    public static short[] field1222;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method691(byte arg0, int arg1) {
        class448.field5870.field9099 = arg1;
        class297.field3891 = null;
        class472.field6150 = null;
        class622.field8384 = 0;
        if (arg0 < 96) {
            field1206 = null;
        }
        field1219++;
        class448.field5870.field9101++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method692(byte arg0) {
        int var2 = -42 % ((arg0 + 43) / 49);
        field1215++;
        boolean var3 = class448.field5870.method3589((byte) -113);
        if (!var3) {
            this.method697(2053);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method693(byte arg0) {
        field1210++;
        if (arg0 > -67) {
            return;
        }
        if (class364.field4697 != 2) {
            this.method701(27142);
            return;
        }
        try {
            this.method701(27142);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class698.method3809(var5.getMessage() + " (Recovered) " + this.method711((byte) -16), (byte) 115, var5);
            class11.method58(0, -105);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method694(int arg0) {
        field1206 = null;
        if (arg0 <= 0) {
            field1222 = null;
        }
        field1222 = null;
        field1224 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final synchronized void method695(byte arg0) {
        field1211++;
        if (class348.field4462 != null && class524.field6827 == null) {
            try {
                Class var2 = class348.field4462.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class524.field6827 = (Canvas) var3.get(class348.field4462);
                var3.set(class348.field4462, null);
                if (class524.field6827 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method695(arg0);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1214++;
        if (!this.method3606(-23175)) {
            return;
        }
        class434.field5592 = new class265();
        class434.field5592.field3554 = Integer.parseInt(this.getParameter("worldid"));
        class657.field9166 = new class265();
        class657.field9166.field3554 = Integer.parseInt(this.getParameter("lobbyid"));
        class657.field9166.field3543 = this.getParameter("lobbyaddress");
        class611.field8255 = new class265();
        class611.field8255.field3554 = Integer.parseInt(this.getParameter("demoid"));
        class611.field8255.field3543 = this.getParameter("demoaddress");
        class119.field1536 = class631.method3497(0, Integer.parseInt(this.getParameter("modewhere")));
        if (class280.field3665 == class119.field1536) {
            class119.field1536 = class547.field7104;
        } else if (!class381.method2174(true, class119.field1536) && class555.field7261 != class119.field1536) {
            class119.field1536 = class555.field7261;
        }
        class549.field7131 = class141.method1065(Integer.parseInt(this.getParameter("modewhat")), -12594);
        if (class60.field821 != class549.field7131 && class549.field7131 != class152.field1945 && class549.field7131 != class17.field187) {
            class549.field7131 = class17.field187;
        }
        try {
            class144.field1890 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class144.field1890 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class584.field7922 = true;
        } else {
            class584.field7922 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class508.field6667 = true;
        } else {
            class508.field6667 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class97.field1308 = true;
        } else {
            class97.field1308 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class153.field1947 = class245.field3273;
            } else if (var4.equals("1")) {
                class153.field1947 = class50.field699;
            }
        }
        try {
            class31.field467 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class31.field467 = 0;
        }
        class514.field6736 = this.getParameter("quiturl");
        class384.field4915 = this.getParameter("settings");
        if (class384.field4915 == null) {
            class384.field4915 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class358.field4643 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class358.field4643 = 0;
            }
        }
        class673.field9324 = Integer.parseInt(this.getParameter("colourid"));
        if (class673.field9324 < 0 || class673.field9324 >= class536.field6981.length) {
            class673.field9324 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class510.field6689 = true;
            class603.field8118 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class346.field4421 = true;
        }
        class285.field3701 = this.getParameter("sskey");
        if (class285.field3701 != null && class285.field3701.length() < 2) {
            class285.field3701 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class478.field6390 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class470.field6144 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class569.field7432 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class381.field4890 = this;
        if (class245.field3273 == class153.field1947) {
            class94.field1240 = 765;
            class535.field6968 = 503;
        } else if (class50.field699 == class153.field1947) {
            class94.field1240 = 640;
            class535.field6968 = 480;
        }
        this.method3608(class535.field6968, (byte) -91, 615, class153.field1947.field8841, class549.field7131.method2299((byte) 30) + 32, class94.field1240, 35);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1212++;
        try {
            if (arg0.length != 6) {
                class651.method3579("Argument count", 126);
            }
            class434.field5592 = new class265();
            class434.field5592.field3554 = Integer.parseInt(arg0[0]);
            class657.field9166 = new class265();
            class657.field9166.field3554 = Integer.parseInt(arg0[1]);
            class611.field8255 = new class265();
            class611.field8255.field3554 = Integer.parseInt(arg0[2]);
            class119.field1536 = class280.field3665;
            if (arg0[3].equals("live")) {
                class549.field7131 = class17.field187;
            } else if (arg0[3].equals("rc")) {
                class549.field7131 = class152.field1945;
            } else if (arg0[3].equals("wip")) {
                class549.field7131 = class60.field821;
            } else {
                class651.method3579("modewhat", 122);
            }
            class144.field1890 = class453.method2553((byte) -126, arg0[4]);
            if (class144.field1890 == -1) {
                if (arg0[4].equals("english")) {
                    class144.field1890 = 0;
                } else if (arg0[4].equals("german")) {
                    class144.field1890 = 1;
                } else {
                    class651.method3579("language", -40);
                }
            }
            class508.field6667 = false;
            class584.field7922 = false;
            if (arg0[5].equals("game0")) {
                class153.field1947 = class245.field3273;
            } else if (arg0[5].equals("game1")) {
                class153.field1947 = class50.field699;
            } else {
                class651.method3579("game", -99);
            }
            class673.field9324 = class153.field1947.field8837;
            class510.field6689 = true;
            class603.field8118 = true;
            class569.field7432 = 0L;
            class285.field3701 = null;
            class478.field6390 = false;
            class384.field4915 = "";
            class31.field467 = 0;
            class358.field4643 = 0;
            class470.field6144 = 0;
            class346.field4421 = false;
            client var1 = new client();
            class381.field4890 = var1;
            var1.method3601(615, false, 1024, 35, -31476, class153.field1947.field8841, 768, class549.field7131.method2299((byte) 23) + 32);
            class425.field5520.setLocation(40, 40);
        } catch (Exception var3) {
            class698.method3809(null, (byte) 119, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltc;)Lcr;")
    public static final class162 method696(class477 arg0) {
        class162 var1 = (class162) class691.field9442.method39(((long) arg0.field6234 << 32) + (long) arg0.field6221, 31750);
        return var1 == null ? arg0.field6304 : var1;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method697(int arg0) {
        field1209++;
        if (class448.field5870.field9101 > class276.field3617) {
            class423.field5473.method1638(128);
            class521.field6802 = (class448.field5870.field9101 * 50 - 50) * 5;
            if (class521.field6802 > 3000) {
                class521.field6802 = 3000;
            }
            if (class448.field5870.field9101 >= 2 && class448.field5870.field9099 == 6) {
                this.method3600((byte) -118, "js5connect_outofdate");
                class566.field7391 = 14;
                return;
            }
            if (class448.field5870.field9101 >= 4 && class448.field5870.field9099 == -1) {
                this.method3600((byte) -115, "js5crc");
                class566.field7391 = 14;
                return;
            }
            if (class448.field5870.field9101 >= 4 && class133.method968((byte) 1, class566.field7391)) {
                if (class448.field5870.field9099 == 7 || class448.field5870.field9099 == 9) {
                    this.method3600((byte) -100, "js5connect_full");
                } else if (class448.field5870.field9099 <= 0) {
                    this.method3600((byte) -99, "js5io");
                } else if (class489.field6489 == null) {
                    this.method3600((byte) -122, "js5connect");
                } else {
                    this.method3600((byte) -125, "js5proxy_" + class489.field6489.trim());
                }
                class566.field7391 = 14;
                return;
            }
        }
        class276.field3617 = class448.field5870.field9101;
        if (class521.field6802 > 0) {
            class521.field6802--;
            return;
        }
        try {
            if (class622.field8384 == 0) {
                class297.field3891 = class423.field5473.method1639(false, class688.field9413);
                class622.field8384++;
            }
            if (class622.field8384 == 1) {
                if (class297.field3891.field7108 == 2) {
                    if (class297.field3891.field7113 != null) {
                        class489.field6489 = (String) class297.field3891.field7113;
                    }
                    this.method691((byte) 108, 1000);
                    return;
                }
                if (class297.field3891.field7108 == 1) {
                    class622.field8384++;
                }
            }
            if (arg0 != 2053) {
                main(null);
            }
            if (class622.field8384 == 2) {
                class472.field6150 = new class336((Socket) class297.field3891.field7113, class688.field9413);
                class418 var2 = new class418(5);
                var2.method2352(true, class206.field2653.field6068);
                var2.method2353(615, (byte) -44);
                class472.field6150.method1928(0, 5, var2.field5393, 3);
                class622.field8384++;
                class158.field1980 = class584.method3191(1);
            }
            if (class622.field8384 == 3) {
                if (class133.method968((byte) 1, class566.field7391) || class472.field6150.method1925((byte) 96) > 0) {
                    int var3 = class472.field6150.method1930(0);
                    if (var3 != 0) {
                        this.method691((byte) 121, var3);
                        return;
                    }
                    class622.field8384++;
                } else if (class584.method3191(arg0 - 2052) - class158.field1980 > 30000L) {
                    this.method691((byte) 99, 1001);
                    return;
                }
            }
            if (class622.field8384 == 4) {
                boolean var4 = class133.method968((byte) 1, class566.field7391) || class302.method1772((byte) -30, class566.field7391) || class61.method517((byte) 110, class566.field7391);
                class318[] var5 = class318.method1850((byte) -73);
                class418 var6 = new class418(var5.length * 4);
                class472.field6150.method1929(var6.field5393.length, var6.field5393, 0, (byte) 127);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1851(arg0 ^ 0x3F0F9, var6.method2355(arg0 ^ 0x853));
                }
                class448.field5870.method3592(!var4, false, class472.field6150);
                class297.field3891 = null;
                class472.field6150 = null;
                class622.field8384 = 0;
            }
        } catch (IOException var8) {
            this.method691((byte) 98, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method698(int arg0) {
        if (class478.field6390) {
            class331.field4308 = 64;
        }
        field1221++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class218.method1394(8323);
        class435.field5645 = new class518(class688.field9413);
        class448.field5870 = new class653();
        class563.method3010(new int[] { 1000, 100 }, false, new int[] { 20, 260 });
        if (class555.field7261 != class119.field1536) {
            class355.field4591 = new byte[50][];
        }
        class260.field3509 = new class250(class688.field9413);
        if (class555.field7261 == class119.field1536) {
            class434.field5592.field3543 = this.getCodeBase().getHost();
        } else if (class381.method2174(true, class119.field1536)) {
            class434.field5592.field3543 = this.getCodeBase().getHost();
            class434.field5592.field3538 = class434.field5592.field3554 + 40000;
            class657.field9166.field3538 = class657.field9166.field3554 + 40000;
            class434.field5592.field3541 = class434.field5592.field3554 + 50000;
            class611.field8255.field3538 = class611.field8255.field3554 + 40000;
            class657.field9166.field3541 = class657.field9166.field3554 + 50000;
            class611.field8255.field3541 = class611.field8255.field3554 + 50000;
        } else if (class280.field3665 == class119.field1536) {
            class434.field5592.field3543 = "127.0.0.1";
            class657.field9166.field3543 = "127.0.0.1";
            class434.field5592.field3538 = class434.field5592.field3554 + 40000;
            class611.field8255.field3543 = "127.0.0.1";
            class657.field9166.field3538 = class657.field9166.field3554 + 40000;
            class611.field8255.field3538 = class611.field8255.field3554 + 40000;
            class434.field5592.field3541 = class434.field5592.field3554 + 50000;
            class657.field9166.field3541 = class657.field9166.field3554 + 50000;
            class611.field8255.field3541 = class611.field8255.field3554 + 50000;
        }
        if (arg0 <= 80) {
            return;
        }
        if (class245.field3273 == class153.field1947) {
            class630.field8788 = false;
        }
        class195.field2548 = class597.field8068 = class626.field8756 = class519.field6793 = new short[256];
        class423.field5473 = class434.field5592;
        if (class50.field699 == class153.field1947) {
            class465.field6070 = true;
            class21.field234 = 0;
            class524.field6828 = class215.field2760;
            class432.field5579 = class456.field5980;
            class563.field7341 = 16777215;
        } else {
            class524.field6828 = class537.field6987;
            class432.field5579 = class329.field4290;
        }
        class390.field4990 = class475.method2622((byte) 120, class524.field6827);
        class691.field9440 = class110.method844(class524.field6827, 1, true);
        try {
            if (class688.field9413.field1830 != null) {
                class514.field6737 = new class249(class688.field9413.field1830, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class388.field4970[var3] = new class249(class688.field9413.field1825[var3], 6000, 0);
                }
                class476.field6204 = new class249(class688.field9413.field1819, 6000, 0);
                class34.field509 = new class264(255, class514.field6737, class476.field6204, 500000);
                class355.field4593 = new class249(class688.field9413.field1838, 24, 0);
                class688.field9413.field1830 = null;
                class688.field9413.field1825 = null;
                class688.field9413.field1819 = null;
                class688.field9413.field1838 = null;
            }
        } catch (IOException var4) {
            class514.field6737 = null;
            class355.field4593 = null;
            class476.field6204 = null;
            class34.field509 = null;
        }
        if (class555.field7261 != class119.field1536) {
            class144.field1889 = true;
        }
        if (class245.field3273 == class153.field1947) {
            class302.field3922 = class604.field8124.method3280((byte) -116, class144.field1890);
        } else if (class50.field699 == class153.field1947) {
            class302.field3922 = class604.field8126.method3280((byte) -98, class144.field1890);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method699(byte arg0) {
        field1216++;
        if (class364.field4697 == 2) {
            try {
                this.method710(106);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class698.method3809(var5.getMessage() + " (Recovered) " + this.method711((byte) -16), (byte) 122, var5);
                class11.method58(0, -103);
            }
        } else {
            this.method710(40);
        }
        if (arg0 <= 98) {
            this.method693((byte) -109);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltc;)Ltc;")
    public static final class477 method700(class477 arg0) {
        int var1 = method696(arg0).method1146(-122);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class600.method3268(-123, arg0.field6292);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method701(int arg0) {
        field1207++;
        if (class566.field7391 == 14) {
            return;
        }
        class424.field5503++;
        if (arg0 != 27142) {
            field1222 = null;
        }
        if ((class424.field5503 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class665.field9234 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class631.field8802.setSeed((long) class665.field9234);
        }
        if ((class424.field5503 % 50) == 0) {
            class361.field4666 = class28.field436;
            class28.field436 = 0;
            class555.field7268 = class11.field117;
            class11.field117 = 0;
        }
        this.method692((byte) 70);
        if (class618.field8349 != null) {
            class618.field8349.method1986(-103);
        }
        class304.method1794(arg0 ^ 0x6A0E);
        class390.field4990.method3174(3760);
        class691.field9440.method2213(100);
        if (class520.field6799 != null) {
            class520.field6799.method224((int) class584.method3191(arg0 ^ 0x6A07));
        }
        class565.method3022(1);
        class307.field4023 = 0;
        class458.field5999 = 0;
        for (class409 var3 = class390.field4990.method3177((byte) 72); var3 != null; var3 = class390.field4990.method3177((byte) 84)) {
            int var6 = var3.method311(-8523);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method316((byte) -83);
                if (class224.method1415(arg0 - 27145) && (var7 == '`' || var7 == '§')) {
                    if (class228.method1438((byte) -124)) {
                        class105.method782(true);
                    } else {
                        class265.method1637(true);
                    }
                } else if (class458.field5999 < 128) {
                    class495.field6533[class458.field5999] = var3;
                    class458.field5999++;
                }
            } else if (var6 == 0 && class307.field4023 < 75) {
                class294.field3818[class307.field4023] = var3;
                class307.field4023++;
            }
        }
        class87.field1160 = 0;
        for (class252 var4 = class691.field9440.method2211(3813864); var4 != null; var4 = class691.field9440.method2211(3813864)) {
            int var5 = var4.method324(-2);
            if (var5 == -1) {
                class650.field9051.method2087(var4, -113);
            } else if (var5 == 6) {
                class87.field1160 += var4.method321(arg0 ^ 0x6A5E);
            } else if (class401.method2285((byte) 45, var5)) {
                class700.field9768.method2087(var4, arg0 - 27260);
                if (class700.field9768.method2094((byte) -90) > 10) {
                    class700.field9768.method2092((byte) 92);
                }
            }
        }
        if (class228.method1438((byte) -126)) {
            class112.method856(-68);
        }
        if (class133.method968((byte) 1, class566.field7391)) {
            class310.method1806(arg0 - 46595);
            class442.method2510(32);
        } else if (class232.method1474(class566.field7391, 32142)) {
            class486.method2671((byte) 115);
        }
        if (class302.method1772((byte) -30, class566.field7391) && !class232.method1474(class566.field7391, 32142)) {
            this.method713(-128);
            class148.method1097(arg0 ^ 0x739C);
            class593.method3224((byte) 95);
        } else if (class61.method517((byte) 0, class566.field7391) && !class232.method1474(class566.field7391, arg0 + 5000)) {
            this.method713(-124);
            class593.method3224((byte) 95);
        } else if (class566.field7391 == 12) {
            class593.method3224((byte) 95);
        } else if (class169.method1160(12, class566.field7391) && !class232.method1474(class566.field7391, 32142)) {
            class232.method1471((byte) -102);
        } else if (class566.field7391 == 13) {
            class593.method3224((byte) 95);
            if (class540.field7019 != -3 && class540.field7019 != 2 && class540.field7019 != 15) {
                class250.method1577(3, false);
            }
        }
        class86.method651(false, class520.field6799);
        class700.field9768.method2092((byte) 92);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method702(int arg0) {
        int var1 = class260.field3508;
        int[] var2 = class135.field1779;
        for (int var3 = 0; var3 < class248.field3351 + var1; var3++) {
            class227 var4;
            if (var3 < var1) {
                var4 = class592.field8019[var2[var3]];
            } else {
                var4 = ((class234) class505.field6640.method39((long) class40.field558[var3 - var1], 31750)).field3131;
            }
            if (var4.field508 == arg0 && var4.field2963 >= 0) {
                int var5 = var4.method1265(120);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field506 & 0x1FF) != 0 || (var4.field503 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field506 & 0x1FF) != 256 || (var4.field503 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field506 >> 9;
                    int var7 = var4.field503 >> 9;
                    if (var4.field2963 > class554.field7252[var6][var7]) {
                        class554.field7252[var6][var7] = var4.field2963;
                        class686.field9410[var6][var7] = 1;
                    } else if (class554.field7252[var6][var7] == var4.field2963) {
                        var10002 = class686.field9410[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field506 - var8 >> 9;
                    int var10 = var4.field503 - var8 >> 9;
                    int var11 = var4.field506 + var8 >> 9;
                    int var12 = var4.field503 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2963 > class554.field7252[var13][var14]) {
                                class554.field7252[var13][var14] = var4.field2963;
                                class686.field9410[var13][var14] = 1;
                            } else if (class554.field7252[var13][var14] == var4.field2963) {
                                var10002 = class686.field9410[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method703() {
        class38.field551 = 0;
        for (int var0 = 0; var0 < class248.field3351; var0++) {
            class532 var1 = ((class234) class505.field6640.method39((long) class40.field558[var0], 31750)).field3131;
            if (var1.field2983 && var1.method1276((byte) -127) != -1) {
                int var2 = (var1.method1265(64) - 1) * 256 + 252;
                int var3 = var1.field506 - var2 >> 9;
                int var4 = var1.field503 - var2 >> 9;
                class227 var5 = class567.method3033(var1.field508, 256, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field2960;
                    if (var5 instanceof class532) {
                        var6 += 2048;
                    }
                    if (var5.field3011 == 0 && var5.method1276((byte) -127) != -1) {
                        class217.field2848[class38.field551] = var6;
                        class165.field2056[class38.field551] = var6;
                        class38.field551++;
                        var5.field3011++;
                    }
                    class217.field2848[class38.field551] = var6;
                    class165.field2056[class38.field551] = var1.field2960 + 2048;
                    class38.field551++;
                    var5.field3011++;
                }
            }
        }
        class359.method2063((byte) 120, 0, class38.field551 - 1, class165.field2056, class217.field2848);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method704(byte arg0) {
        if (class653.field9086) {
            class136.method990(0);
        }
        field1205++;
        class518.method2790(0);
        if (class520.field6799 != null) {
            class520.field6799.method392((byte) -39);
        }
        if (class114.field1483 != null) {
            class294.method1737(class114.field1483, class688.field9413, (byte) 83);
            class114.field1483 = null;
        }
        if (class2.field15 != null) {
            class2.field15.method281(0);
            class2.field15 = null;
        }
        class698.method3812(0);
        class448.field5870.method3598((byte) -90);
        if (arg0 != -17) {
            return;
        }
        class435.field5645.method2788(arg0 ^ 0xFFFFFFEC);
        if (class433.field5585 != null) {
            class433.field5585.method3301(arg0 ^ 0x7C);
            class433.field5585 = null;
        }
        try {
            class514.field6737.method1566(28186);
            for (int var2 = 0; var2 < 35; var2++) {
                class388.field4970[var2].method1566(arg0 ^ 0xFFFF91F5);
            }
            class476.field6204.method1566(28186);
            class355.field4593.method1566(28186);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method705() {
        for (int var0 = 0; var0 < class611.field8258; var0++) {
            int[] var1 = class554.field7252[var0];
            for (int var2 = 0; var2 < class656.field9155; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method706() {
        int var0 = class260.field3508;
        int[] var1 = class135.field1779;
        boolean var2 = class260.field3509.field1271 == 1 && var0 > 200 || class260.field3509.field1271 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class193 var13 = class592.field8019[var1[var3]];
            if (var13.method1272((byte) -79)) {
                var13.method271((byte) -74);
                if (var13.field497 >= 0 && var13.field502 >= 0 && var13.field501 < class611.field8258 && var13.field505 < class656.field9155) {
                    var13.field2517 = var13.field2976 ? var2 : false;
                    if (class233.field3130 == var13) {
                        var13.field2963 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field2983) {
                            var14++;
                        }
                        if (var13.field3016 > class424.field5503) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1265(80) << 2);
                        if (var13.field2500) {
                            var15 += 512;
                        } else {
                            if (class41.field578 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field2963 = var15 + 1;
                    }
                } else {
                    var13.field2963 = -1;
                }
            } else {
                var13.field2963 = -1;
            }
        }
        for (int var4 = 0; var4 < class248.field3351; var4++) {
            class532 var10 = ((class234) class505.field6640.method39((long) class40.field558[var4], 31750)).field3131;
            if (var10.method2829((byte) 64) && var10.field6914.method3830(0, class397.field5054)) {
                var10.method271((byte) 46);
                if (var10.field497 >= 0 && var10.field502 >= 0 && var10.field501 < class611.field8258 && var10.field505 < class656.field9155) {
                    int var11 = 0;
                    if (!var10.field2983) {
                        var11++;
                    }
                    if (var10.field3016 > class424.field5503) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1265(99) << 2);
                    if (class41.field578 == 0) {
                        if (var10.field6914.field9702) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class41.field578 == 1) {
                        if (var10.field6914.field9702) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field6914.field9705) {
                        var12 += 1024;
                    } else if (!var10.field6914.field9728) {
                        var12 += 256;
                    }
                    var10.field2963 = var12 + 1;
                } else {
                    var10.field2963 = -1;
                }
            } else {
                var10.field2963 = -1;
            }
        }
        for (int var5 = 0; var5 < class434.field5591.length; var5++) {
            class514 var6 = class434.field5591[var5];
            if (var6 != null) {
                if (var6.field6726 == 1) {
                    class234 var7 = (class234) class505.field6640.method39((long) var6.field6730, 31750);
                    if (var7 != null) {
                        class532 var8 = var7.field3131;
                        if (var8.field2963 >= 0) {
                            var8.field2963 += 2048;
                        }
                    }
                } else if (var6.field6726 == 10) {
                    class193 var9 = class592.field8019[var6.field6730];
                    if (var9 != null && class233.field3130 != var9 && var9.field2963 >= 0) {
                        var9.field2963 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltc;)Z")
    public static final boolean method707(class477 arg0) {
        if (class100.field1336) {
            if (method696(arg0).field2020 != 0) {
                return false;
            }
            if (arg0.field6312 == 0) {
                return false;
            }
        }
        return arg0.field6340;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method708(int arg0) {
        field1218++;
        method694(57);
        class600.method3265(-125);
        class527.method2812(0);
        class367.method2110(127);
        class604.method3278((byte) 98);
        class656.method3613(-1221262642);
        class486.method2673((byte) -87);
        class346.method1991(false);
        class318.method1855((byte) -95);
        class185.method1234((byte) 105);
        class325.method1878(-1);
        class28.method236(-120);
        class119.method888(13);
        class655.method3602(false);
        class642.method3537((byte) 110);
        class405.method2300((byte) -78);
        class546.method2897((byte) 79);
        class635.method3508((byte) 53);
        class151.method1105(-53);
        class514.method2770(-127);
        class289.method1717(-127);
        class364.method2089((byte) 79);
        class336.method1927((byte) -15);
        class653.method3594((byte) 46);
        class518.method2789((byte) -65);
        class455.method2563((byte) 127);
        class249.method1569(-56);
        class668.method3649(-70);
        class16.method94(32486);
        class665.method3640(2);
        class412.method2332(-32684);
        class245.method1532((byte) 15);
        class214.method1371((byte) 18);
        class33.method265((byte) -21);
        class80.method630((byte) -69);
        class678.method3728(-10718);
        class329.method1904(-109);
        class401.method2286(22050);
        class545.method2889(100);
        class61.method513(0);
        class196.method1290(2);
        class143.method1076((byte) 99);
        class294.method1742((byte) 30);
        class567.method3030((byte) -61);
        class352.method2019(3468);
        class440.method2494(-67);
        class135.method988((byte) -15);
        class305.method1803(true);
        class384.method2184(-97);
        class277.method1677(-77);
        class7.method23(63);
        class234.method1485(2054);
        class35.method282(0);
        class541.method2874(-123);
        class361.method2072(true);
        class207.method1330((byte) 38);
        class230.method1453((byte) 110);
        class657.method3615(false);
        class473.method2620(true);
        class477.method2631((byte) -112);
        class169.method1159(true);
        class193.method1271((byte) 116);
        class368.method2116(12);
        class650.method3576(100);
        class160.method1140(52);
        class418.method2362(82);
        class11.method59((byte) -117);
        class227.method1433(0);
        class530.method2820((byte) -127);
        class285.method1701((byte) 7);
        class549.method2908(-1826);
        class558.method2987((byte) -3);
        class270.method1651((byte) 84);
        class162.method1144(false);
        class77.method623(0);
        class302.method1771((byte) 48);
        class156.method1119((byte) -32);
        class389.method2225(9573);
        class503.method2716((byte) 62);
        class106.method785((byte) 127);
        class493.method2691(-14566);
        class138.method1041((byte) -123);
        class519.method2794(0);
        class265.method1642(4096);
        class629.method3491(15);
        class96.method727(1138);
        class628.method3488((byte) -26);
        class220.method1400(true);
        class2.method4(1000);
        class97.method732(-97);
        class210.method1342(5);
        class63.method533((byte) -30);
        class348.method2001(-16661);
        class107.method786(22495);
        class508.method2741(97);
        class559.method2988(2103046438);
        class307.method1805(77);
        class645.method3543(-97);
        class390.method2228(false);
        class699.method3819(122);
        class696.method3779(125);
        class597.method3251(-79);
        class218.method1396((byte) -53);
        class463.method2590(12345678);
        class381.method2175(16653);
        class619.method3377(true);
        class686.method3750(-23978);
        class547.method2902(-1);
        class282.method1689(-95);
        class593.method3222((byte) -18);
        class552.method2952((byte) -58);
        class304.method1797(256);
        class569.method3042((byte) 98);
        class64.method536(-1);
        class254.method1605((byte) -122);
        class105.method780((byte) 76);
        class466.method2594(-3023);
        class313.method1829((byte) 112);
        class83.method640(2);
        class413.method2334((byte) 116);
        class507.method2740(54);
        class255.method1610(true);
        class49.method442(8);
        class421.method2425(0);
        class626.method3478(3);
        class470.method2612(-128);
        class706.method3874();
        class100.method752((byte) -100);
        class52.method460((byte) 103);
        class581.method3190(-1);
        class649.method3573((byte) -80);
        class262.method1626((byte) 100);
        class451.method2547(127);
        class326.method1890(-12506);
        class562.method3004((byte) 109);
        class34.method273(-1);
        class274.method1662(-1009);
        class215.method1376(true);
        class564.method3017(1);
        class407.method2308(47);
        class231.method1457();
        class535.method2848((byte) 125);
        class501.method2711((byte) -65);
        class268.method1649((byte) -125);
        class453.method2554(60);
        class331.method1913(-10);
        class275.method1667(false);
        class213.method1369(1);
        class709.method3896();
        class310.method1808(-82);
        class141.method1067((byte) -88);
        class700.method3831(12);
        class10.method53();
        class576.method3156((byte) -90);
        class465.method2592(16);
        class144.method1078(false);
        class433.method2477((byte) -76);
        class155.method1115(10231);
        class101.method768(-26050);
        class705.method3851((byte) 9);
        class431.method2471((byte) -113);
        class3.method12((byte) -65);
        class117.method882(true);
        class357.method2055(0);
        class152.method1109((byte) 103);
        class266.method1644(4);
        class17.method97(true);
        class237.method1499(-65);
        class571.method3051(false);
        class242.method1522(-127);
        class605.method3281(6248);
        class251.method1593();
        class574.method3060(-105);
        class32.method259((byte) -121);
        class163.method1149();
        class415.method2341(-30);
        class114.method860((byte) 31);
        class54.method468((byte) -42);
        class322.method1864(-86);
        class284.method1697((byte) 123);
        if (arg0 < 73) {
            field1206 = null;
        }
        class499.method2701(0);
        class118.method886(117);
        class73.method586();
        class337.method1934(true);
        class244.method1526(-5883);
        class149.method1099((byte) -45);
        class612.method3322(103);
        class280.method1687(-98);
        class515.method2779(0);
        class608.method3308(543324325);
        class316.method1848((byte) 70);
        class631.method3500(false);
        class428.method2463(17871);
        class636.method3516(14);
        class87.method656(-1);
        class589.method3217((byte) 116);
        class641.method3533(false);
        class708.method3879(true);
        class427.method2452((byte) 123);
        class536.method2854((byte) -42);
        class556.method2980(8);
        class1.method1(-78);
        class647.method3559(1);
        class126.method920(438104291);
        class303.method1774((byte) -122);
        class46.method427(-119);
        class586.method3198(34);
        class37.method300((byte) 126);
        class344.method1982(78);
        class30.method246(-18);
        class297.method1757(false);
        class147.method1093(12);
        class94.method722(false);
        class587.method3204((byte) 58);
        class595.method3229((byte) 85);
        class153.method1110(500);
        class51.method455(125);
        class578.method3172(338);
        class441.method2505(-6637);
        class103.method779((byte) 118);
        class688.method3753(0);
        class260.method1622((byte) 118);
        class446.method2524(87);
        class485.method2669(4);
        class517.method2782(false);
        class256.method1613(-122);
        class187.method1241(0);
        class243.method1524((byte) -80);
        class53.method464((byte) 33);
        class148.method1094((byte) 57);
        class442.method2509(1);
        class59.method506(95);
        class226.method1420((byte) -120);
        class370.method2132((byte) -101);
        class283.method1693((byte) -53);
        class109.method837(121);
        class217.method1387(4);
        class120.method899(72);
        class543.method2882((byte) 88);
        class158.method1126((byte) 92);
        class426.method2449(-18151);
        class369.method2122(5);
        class382.method2176(-4547);
        class602.method3275((byte) -98);
        class132.method962();
        class130.method932(112);
        class261.method1623(-92);
        class497.method2699(104);
        class206.method1328((byte) -40);
        class603.method3277(0);
        class240.method1514(-103);
        class122.method910((byte) 62);
        class469.method2606(-121);
        class399.method2278(0);
        class166.method1155((byte) -87);
        class188.method1243(0);
        class13.method69(-126);
        class476.method2626(true);
        class550.method2911((byte) 92);
        class235.method1490(-100);
        class195.method1283(-1);
        class181.method1206(128);
        class572.method3053(-1);
        class78.method626((byte) 45);
        class246.method1543();
        class667.method3647((byte) 60);
        class293.method1735();
        class102.method773();
        class625.method3475(-28378);
        class672.method3688();
        class192.method1250((byte) 114);
        class145.method1083(true);
        class378.method2162(-888469431);
        class224.method1413(0);
        class478.method2651(32);
        class50.method443(93);
        class356.method2047((byte) 105);
        class480.method2655(true);
        class191.method1248((byte) 127);
        class461.method2587(0);
        class41.method319(51);
        class483.method2663(0);
        class646.method3555(4);
        class165.method1152((byte) 122);
        class437.method2486((byte) -48);
        class379.method2167((byte) -53);
        class374.method2151(0);
        class658.method3618((byte) -67);
        class168.method1157(1);
        class551.method2916();
        class489.method2676(false);
        class197.method1302(-1);
        class66.method544(-6);
        class512.method2764((byte) 13);
        class542.method2879(4646);
        class448.method2544(-3);
        class692.method3769(21560);
        class171.method1166(-90802751);
        class679.method3731(19119);
        class429.method2468((byte) 84);
        class555.method2976((byte) -26);
        class590.method3219((byte) 103);
        class395.method2247(true);
        class537.method2855(true);
        class472.method2613(true);
        class127.method925((byte) 53);
        class438.method2490(-14547);
        class298.method1763(-18972);
        class434.method2481((byte) -88);
        class622.method3454((byte) 87);
        class611.method3313(0);
        class201.method1311(-77);
        class354.method2030(true);
        class134.method973(0);
        class458.method2576(127);
        class25.method148(109);
        class509.method2743(20162);
        class423.method2436(33985);
        class701.method3842((byte) -124);
        class710.method3901((byte) -55);
        class239.method1508(1264);
        class204.method1322((byte) -85);
        class219.method1399(0);
        class408.method2319(102);
        class414.method2339(true);
        class703.method3848(-530554264);
        class660.method3626(0);
        class575.method3127(6);
        class568.method3038(76);
        class6.method20((byte) -60);
        class350.method2009((byte) 26);
        class131.method934(6997);
        class366.method2107(false);
        class492.method2687(false);
        class652.method3583(113);
        class618.method3375((byte) -46);
        class432.method2474(false);
        class397.method2272(3429);
        class150.method1101((byte) 117);
        class447.method2534(-1);
        class89.method676(13517);
        class694.method3776(13);
        class388.method2220((byte) -56);
        class637.method3520((byte) -69);
        class27.method223(true);
        class202.method1316(0);
        class525.method2808((byte) 85);
        class363.method2080(-1);
        class18.method101();
        class228.method1436((byte) -11);
        class663.method3630(false);
        class392.method2232(true);
        class276.method1672((byte) 25);
        class91.method685(18092);
        class580.method3187((byte) 46);
        class223.method1410(92);
        class533.method2832(3228);
        class69.method557(-100);
        class671.method3687(99);
        class445.method2519(1);
        class398.method2277(-1);
        class505.method2721(false);
        class482.method2659((byte) -96);
        class521.method2800(-14429);
        class460.method2585(false);
        class524.method2806((byte) 122);
        class377.method2158(-120);
        class221.method1403((byte) -41);
        class26.method153(false);
        class82.method636((byte) 120);
        class190.method1246(0);
        class630.method3493((byte) -120);
        class21.method117((byte) -40);
        class290.method1725(6149);
        class19.method108(false);
        class522.method2804((byte) -1);
        class456.method2570(-126);
        class585.method3194(-1);
        class182.method1221();
        class95.method723(0);
        class343.method1980();
        class60.method512((byte) 103);
        class544.method2887(0);
        class639.method3524(-93);
        class332.method1919((byte) 14);
        class90.method684(18937);
        class614.method3334(false);
        class333.method1922((byte) -69);
        class295.method1749(10103);
        class47.method435(-115);
        class690.method3759(30199);
        class565.method3018(24071);
        class353.method2026(108);
        class592.method3220((byte) 57);
        class553.method2968(16);
        class8.method31(-4);
        class693.method3774(-120);
        class183.method1228(0);
        class680.method3736(false);
        class93.method717(23805);
        class273.method1659(-2366);
        class554.method2970(-1);
        class178.method1198((byte) 57);
        class420.method2419(false);
        class457.method2573(true);
        class129.method927((byte) 9);
        class72.method573(true);
        class48.method436(1);
        class484.method2666(0);
        class454.method2557(-98);
        class491.method2683((byte) 125);
        class510.method2749(-96);
        class425.method2445((byte) 76);
        class349.method2007(0);
        class278.method1682((byte) -121);
        class638.method3523((byte) 126);
        class238.method1500((byte) -86);
        class520.method2796(114);
        class86.method652((byte) -101);
        class704.method3849((byte) -114);
        class39.method307(78);
        class588.method3213(-13020);
        class287.method1708(16);
        class640.method3531(112);
        class380.method2170(-72);
        class677.method3724((byte) 96);
        class247.method1551(false);
        class233.method1480((byte) 120);
        class359.method2062(true);
        class222.method1407((byte) -107);
        class347.method1994((byte) -84);
        class323.method1870(60);
        class253.method1603(97);
        class495.method2698((byte) -59);
        class416.method2342((byte) 127);
        class259.method1620(117);
        class315.method1835(3);
        class159.method1134((byte) 95);
        class651.method3578((byte) 116);
        class411.method2327(0);
        class176.method1187(false);
        class311.method1810(-28627);
        class422.method2430((byte) -2);
        class596.method3230(82);
        class31.method256(0);
        class513.method2769(-3);
        class124.method913(111);
        class419.method2418((byte) 96);
        class616.method3371(4);
        class683.method3746(-3632);
        class288.method1711(true);
        class44.method414((byte) -79);
        class355.method2041(-72);
        class691.method3762(5759);
        class12.method61((byte) -43);
        class225.method1416(92);
        class252.method1601(-5);
        class435.method2483((byte) 20);
        class594.method3227(0);
        class136.method991(-51);
        class324.method1873((byte) -112);
        class57.method503(false);
        class186.method1238(-20919);
        class123.method911(true);
        class40.method314(63);
        class328.method1892(true);
        class194.method1281((byte) 74);
        class5.method18((byte) 67);
        class697.method3798(true);
        class125.method918((byte) 14);
        class229.method1444(-101);
        class81.method634(1);
        class22.method120(26125);
        class666.method3645(13703);
        class557.method2985((byte) -65);
        class258.method1616((byte) 59);
        class528.method2814(33);
        class38.method305(127);
        class452.method2549(-114);
        class232.method1472(-100);
        class133.method967((byte) 107);
        class20.method112(false);
        class386.method2204(5178);
        class526.method2809(-27959);
        class648.method3565(-2051203508);
        class358.method2060(-960);
        class116.method873(-5527);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method709(String arg0, byte arg1) {
        int var2 = 69 % ((arg1 - 37) / 48);
        field1220++;
        return class659.method3621(field1225 == null ? (field1225 = method716("go")) : field1225, arg0, 8580);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method710(int arg0) {
        field1208++;
        if (class566.field7391 == 14) {
            return;
        }
        long var2 = class694.method3777((byte) -97) / 1000000L - class585.field7940;
        if (arg0 < 37) {
            return;
        }
        class585.field7940 = class694.method3777((byte) -97) / 1000000L;
        boolean var4 = class249.method1570(-121);
        if (var4 && class60.field823 && class266.field3566 != null) {
            class266.field3566.method1793((byte) 125);
        }
        if (class612.method3321(class566.field7391, -1)) {
            if (class686.field9406 != 0L && class686.field9406 < class584.method3191(1)) {
                class658.method3617(class62.method528(2), class260.field3509.field1264, class260.field3509.field1266, false, 11015);
            } else if (!class520.field6799.method379() && class665.field9229) {
                class453.method2556((byte) 111);
            }
        }
        if (class114.field1483 == null) {
            Container var5;
            if (class425.field5520 != null) {
                var5 = class425.field5520;
            } else if (class348.field4462 == null) {
                var5 = class50.field706;
            } else {
                var5 = class348.field4462;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class425.field5520 == var5) {
                Insets var8 = class425.field5520.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class544.field7066 != var6 || class207.field2669 != var7 || class61.field832) {
                if (class520.field6799 == null || class520.field6799.method380()) {
                    class218.method1394(8323);
                } else {
                    class207.field2669 = var7;
                    class544.field7066 = var6;
                }
                class686.field9406 = class584.method3191(1) + 500L;
                class61.field832 = false;
            }
        }
        if (class114.field1483 != null && !class164.field2043 && class612.method3321(class566.field7391, -1)) {
            class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
        }
        boolean var9 = false;
        if (class539.field7014) {
            var9 = true;
            class539.field7014 = false;
        }
        if (var9) {
            class337.method1933((byte) 64);
        }
        if (class520.field6799 != null && class520.field6799.method379() || class62.method528(2) != 1) {
            class211.method1355(-21784);
        }
        if (class133.method968((byte) 1, class566.field7391)) {
            class276.method1673(var9, (byte) 108);
        } else if (class361.method2070(class566.field7391, -103)) {
            class637.method3521((byte) -126);
        } else if (class418.method2349(7, class566.field7391)) {
            class637.method3521((byte) -120);
        } else if (class232.method1474(class566.field7391, 32142)) {
            if (class438.field5668 == 1) {
                if (class172.field2127 < class41.field577) {
                    class172.field2127 = class41.field577;
                }
                int var10 = (class172.field2127 - class41.field577) * 50 / class172.field2127;
                class542.method2877(true, class604.field8136.method3280((byte) 98, class144.field1890) + "<br>(" + var10 + "%)", class520.field6799, class562.field7337, class401.field5111, true);
            } else if (class438.field5668 == 2) {
                if (class191.field2444 < class402.field5147) {
                    class191.field2444 = class402.field5147;
                }
                int var11 = (class191.field2444 - class402.field5147) * 50 / class191.field2444 + 50;
                class542.method2877(true, class604.field8136.method3280((byte) -56, class144.field1890) + "<br>(" + var11 + "%)", class520.field6799, class562.field7337, class401.field5111, true);
            } else {
                class542.method2877(true, class604.field8136.method3280((byte) 119, class144.field1890), class520.field6799, class562.field7337, class401.field5111, true);
            }
        } else if (class566.field7391 == 10) {
            class152.method1107(var2, 0);
        } else if (class566.field7391 == 13) {
            class542.method2877(true, class604.field8138.method3280((byte) -89, class144.field1890) + "<br>" + class604.field8139.method3280((byte) 106, class144.field1890), class520.field6799, class562.field7337, class401.field5111, true);
        }
        if (class15.field176 == 3) {
            for (int var12 = 0; var12 < class57.field758; var12++) {
                Rectangle var13 = class20.field220[var12];
                if (class513.field6724[var12]) {
                    class520.field6799.method400(-1996553985, var13.x, var13.height, (byte) 75, var13.width, var13.y);
                } else if (class541.field7022[var12]) {
                    class520.field6799.method400(-1996554240, var13.x, var13.height, (byte) 90, var13.width, var13.y);
                }
            }
        }
        if (class228.method1438((byte) -126)) {
            class127.method923((byte) -126, class520.field6799);
        }
        if (class688.field9413.field1841 && class612.method3321(class566.field7391, -1) && class15.field176 == 0 && class62.method528(2) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class57.field758; var15++) {
                if (class541.field7022[var15]) {
                    class541.field7022[var15] = false;
                    class650.field9057[var14++] = class20.field220[var15];
                }
            }
            try {
                class520.field6799.method219(class650.field9057, var14);
            } catch (class381 var19) {
            }
        } else if (!class133.method968((byte) 1, class566.field7391)) {
            for (int var16 = 0; var16 < class57.field758; var16++) {
                class541.field7022[var16] = false;
            }
            try {
                class520.field6799.method216();
            } catch (class381 var18) {
                class698.method3809(var18.getMessage() + " (Recovered) " + this.method711((byte) -16), (byte) 121, var18);
                class11.method58(0, -88);
            }
        }
        if (class260.field3509.field1306 == 0) {
            class122.method905(15L, -6145);
        } else if (class260.field3509.field1306 == 1) {
            class122.method905(10L, -6145);
        } else if (class260.field3509.field1306 == 2) {
            class122.method905(5L, -6145);
        } else if (class260.field3509.field1306 == 3) {
            class122.method905(2L, -6145);
        }
        if (class226.field2936) {
            class240.method1518((byte) 97);
        }
        if (class260.field3509.field1265 && class566.field7391 == 3 && class196.field2562 != -1) {
            class260.field3509.field1265 = false;
            class260.field3509.method1574(class688.field9413, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method711(byte arg0) {
        field1217++;
        String var2 = null;
        try {
            var2 = "[1)" + class100.field1326 + "," + class186.field2376 + "," + class611.field8258 + "," + class656.field9155 + "|";
            if (class233.field3130 != null) {
                var2 = var2 + "2)" + class390.field4991 + "," + (class233.field3130.field3030[0] + class100.field1326) + "," + (class233.field3130.field3039[0] + class186.field2376) + "|";
            }
            var2 = var2 + "3)" + class364.field4697 + "|4)" + class260.field3509.field1287 + "|5)" + class62.method528(2) + "|6)" + class519.field6796 + "," + class461.field6047 + "|";
            var2 = var2 + "7)" + class260.field3509.method734((byte) 86, class364.field4697) + "|";
            var2 = var2 + "8)" + class260.field3509.method733(class364.field4697, (byte) -77) + "|";
            var2 = var2 + "9)" + class260.field3509.field1279 + "|";
            var2 = var2 + "10)" + class260.field3509.field1286 + "|";
            var2 = var2 + "11)" + class260.field3509.field1261 + "|";
            var2 = var2 + "12)" + class260.field3509.method1571(class364.field4697, -23572) + "|";
            var2 = var2 + "13)" + class331.field4308 + "|";
            var2 = var2 + "14)" + class566.field7391;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class364.field4697 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1226 == null ? (field1226 = method716("client")) : field1226).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            if (arg0 != -16) {
                field1222 = null;
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltc;IIIIIIIII)V")
    public static final void method712(class477[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class477 var11 = arg0[var10];
            if (var11 != null && var11.field6292 == arg1) {
                int var12 = var11.field6286 + arg6;
                int var13 = var11.field6303 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6312 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6372 + var12;
                    int var19 = var11.field6224 + var13;
                    if (var11.field6312 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6312 == 0 || var11.field6287 || method696(var11).field2020 != 0 || class323.field4197 == var11 || class82.field1124 == var11.field6324) {
                    if (!method707(var11)) {
                        if (class655.field9114 == var11 && class388.method2219(class655.field9114, 9563) != null) {
                            class299.field3907 = true;
                            class570.field7438 = var12;
                            class266.field3565 = var13;
                        }
                        if (var11.field6240 || var14 < var16 && var15 < var17) {
                            if (var11.field6228 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class155 var20 = (class155) class587.field7952.method2090(true); var20 != null; var20 = (class155) class587.field7952.method2088(-152)) {
                                    if (var20.field1960) {
                                        var20.method2438((byte) 110);
                                        var20.field1968.field6359 = false;
                                    }
                                }
                                if (class49.field685 == 0) {
                                    class655.field9114 = null;
                                    class323.field4197 = null;
                                }
                                class210.field2710 = 0;
                                class150.field1929 = false;
                                class201.field2618 = false;
                                if (!class594.field8025) {
                                    class382.method2178((byte) -79);
                                }
                            }
                            boolean var21;
                            if (class691.field9440.method2214(-2703) >= var14 && class691.field9440.method2208(30114) >= var15 && class691.field9440.method2214(-2703) < var16 && class691.field9440.method2208(30114) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class499.field6560 && var21) {
                                if (var11.field6231 >= 0) {
                                    field1223 = var11.field6231;
                                } else if (var11.field6228) {
                                    field1223 = -1;
                                }
                            }
                            if (!class594.field8025 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class697.method3799(66, arg8 - var12, arg9 - var13, var11);
                            }
                            boolean var22 = false;
                            if (class691.field9440.method2216((byte) 92) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class252 var24 = (class252) class700.field9768.method2090(true);
                            if (var24 != null && var24.method324(-2) == 0 && var24.method323(-5) >= var14 && var24.method320(-116) >= var15 && var24.method323(-5) < var16 && var24.method320(-101) < var17) {
                                var23 = true;
                            }
                            if (var11.field6282 != null && !class228.method1438((byte) -127)) {
                                for (int var25 = 0; var25 < var11.field6282.length; var25++) {
                                    if (class390.field4990.method3168(256, var11.field6282[var25])) {
                                        if (var11.field6214 == null || class424.field5503 >= var11.field6214[var25]) {
                                            byte var26 = var11.field6337[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class390.field4990.method3168(256, 86) && !class390.field4990.method3168(256, 82) && !class390.field4990.method3168(256, 81)) && ((var26 & 0x2) == 0 || class390.field4990.method3168(256, 86)) && ((var26 & 0x1) == 0 || class390.field4990.method3168(256, 82)) && ((var26 & 0x4) == 0 || class390.field4990.method3168(256, 81))) {
                                                if (var25 < 10) {
                                                    class619.method3378(-1, "", var11.field6234, (byte) -68, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class695.method3778((byte) 22);
                                                    class162 var27 = method696(var11);
                                                    class329.method1905(var27.method1142((byte) -124), var11, (byte) 31, var27.field2018);
                                                    class295.field3842 = class355.method2043((byte) 92, var11);
                                                    if (class295.field3842 == null) {
                                                        class295.field3842 = "Null";
                                                    }
                                                    class542.field7044 = var11.field6315 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6294[var25];
                                                if (var11.field6214 == null) {
                                                    var11.field6214 = new int[var11.field6282.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6214[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6214[var25] = class424.field5503 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6214 != null) {
                                        var11.field6214[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class330.method1908(var11, var24.method320(-93) - var13, 77, var24.method323(-5) - var12);
                            }
                            if (class655.field9114 != null && class655.field9114 != var11 && var21 && method696(var11).method1147(-104)) {
                                class377.field4835 = var11;
                            }
                            if (class323.field4197 == var11) {
                                class659.field9179 = true;
                                class11.field119 = var12;
                                class24.field263 = var13;
                            }
                            if (var11.field6287 || var11.field6324 != 0) {
                                if (var21 && class87.field1160 != 0 && var11.field6350 != null) {
                                    class155 var29 = new class155();
                                    var29.field1960 = true;
                                    var29.field1968 = var11;
                                    var29.field1969 = class87.field1160;
                                    var29.field1962 = var11.field6350;
                                    class587.field7952.method2087(var29, -110);
                                }
                                if (class655.field9114 != null || class594.field8025 || class475.field6184 != var11.field6324 && class210.field2710 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6324 != 0) {
                                    if (class534.field6947 == var11.field6324 || class317.field4108 == var11.field6324) {
                                        class256.field3466 = var11;
                                        if (class625.field8743 != null) {
                                            class625.field8743.method2619(class520.field6799, var11.field6224, 5120);
                                        }
                                        if (class534.field6947 == var11.field6324) {
                                            if (!class594.field8025 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class354.method2036(true, arg9, arg8, class520.field6799);
                                                for (class126 var30 = (class126) class600.field8094.method2101(260); var30 != null; var30 = (class126) class600.field8094.method2098((byte) 57)) {
                                                    if (arg8 >= var30.field1631 && arg8 < var30.field1627 && arg9 >= var30.field1634 && arg9 < var30.field1629) {
                                                        class382.method2178((byte) -79);
                                                        class614.method3329(var30.field1632, (byte) -46);
                                                    }
                                                }
                                            }
                                            class66.method541(var13, (byte) -5, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class82.field1124 == var11.field6324) {
                                        if (var11.method2647(false, class520.field6799) == null || class323.field4195 != 0 && class323.field4195 != 3 || class594.field8025 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6300[var32];
                                        if (var31 < var33 || var31 > var11.field6344[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6372 / 2;
                                        int var35 = var32 - var11.field6224 / 2;
                                        int var36;
                                        if (class704.field9810 == 4) {
                                            var36 = (int) class141.field1859 & 0x3FFF;
                                        } else {
                                            var36 = (int) class141.field1859 + class7.field56 & 0x3FFF;
                                        }
                                        int var37 = class237.field3193[var36];
                                        int var38 = class237.field3196[var36];
                                        if (class704.field9810 != 4) {
                                            var37 = (class279.field3653 + 256) * var37 >> 8;
                                            var38 = (class279.field3653 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class704.field9810 == 4) {
                                            var41 = (class425.field5518 >> 9) + (var39 >> 2);
                                            var42 = (class509.field6669 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class233.field3130.method1265(102) - 1) * 256;
                                            var41 = (class233.field3130.field506 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class233.field3130.field503 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class499.field6560 && (class345.field4410 & 0x40) != 0) {
                                            class477 var44 = class386.method2203(class634.field8832, 0, class34.field499);
                                            if (var44 == null) {
                                                class695.method3778((byte) 22);
                                            } else {
                                                class47.method433(var42, " ->", 1L, class295.field3842, 19, var11.field6321, false, class368.field4752, var41, true, (byte) 121);
                                            }
                                            continue;
                                        }
                                        if (class50.field699 == class153.field1947) {
                                            class47.method433(var42, "", 1L, class604.field8151.method3280((byte) 127, class144.field1890), 3, -1, false, -1, var41, true, (byte) -13);
                                        }
                                        class47.method433(var42, "", 1L, class407.field5172, 30, -1, false, class460.field6041, var41, true, (byte) -96);
                                        continue;
                                    }
                                    if (class475.field6184 == var11.field6324) {
                                        class178.field2217 = var11;
                                        if (var21) {
                                            class150.field1929 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method323(-5) - var12 - var11.field6372 / 2) * 2.0D / (double) class706.field9835);
                                            int var46 = (int) (-((double) (var24.method320(-121) - var13 - var11.field6224 / 2) * 2.0D / (double) class706.field9835));
                                            int var47 = class556.field7274 + var45 + class706.field9866;
                                            int var48 = class527.field6862 + var46 + class706.field9860;
                                            class230 var49 = class423.method2437(34168);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1448(var50, (byte) 47, var48, var47);
                                            if (var50 != null) {
                                                if (class390.field4990.method3168(256, 82) && class54.field741 > 0) {
                                                    class438.method2489(var50[1], -1011358554, var50[0], var50[2]);
                                                    continue;
                                                }
                                                class201.field2618 = true;
                                                class691.field9443 = var50[0];
                                                class261.field3510 = var50[1];
                                                class329.field4289 = var50[2];
                                            }
                                            class210.field2710 = 1;
                                            class100.field1337 = false;
                                            class429.field5554 = class691.field9440.method2214(-2703);
                                            class576.field7845 = class691.field9440.method2208(30114);
                                            continue;
                                        }
                                        if (var22 && class210.field2710 > 0) {
                                            if (class210.field2710 == 1 && (class429.field5554 != class691.field9440.method2214(-2703) || class576.field7845 != class691.field9440.method2208(30114))) {
                                                class405.field5158 = class556.field7274;
                                                class556.field7275 = class527.field6862;
                                                class210.field2710 = 2;
                                            }
                                            if (class210.field2710 == 2) {
                                                class100.field1337 = true;
                                                class600.method3266(-1, class405.field5158 + (int) ((double) (class429.field5554 - class691.field9440.method2214(-2703)) * 2.0D / (double) class706.field9836));
                                                class138.method1038(-1, class556.field7275 - (int) ((double) (class576.field7845 - class691.field9440.method2208(30114)) * 2.0D / (double) class706.field9836));
                                            }
                                            continue;
                                        }
                                        if (class210.field2710 > 0 && !class100.field1337) {
                                            if ((class457.field5994 == 1 || class52.method461(false)) && class291.field3758 > 2) {
                                                class385.method2193(class429.field5554, (byte) 63, class576.field7845);
                                            } else if (class185.method1233(119)) {
                                                class385.method2193(class429.field5554, (byte) 114, class576.field7845);
                                            }
                                        }
                                        class210.field2710 = 0;
                                        continue;
                                    }
                                    if (class313.field4068 == var11.field6324) {
                                        if (var22) {
                                            class648.method3568((byte) 116, var11.field6224, class691.field9440.method2214(-2703) - var12, var11.field6372, class691.field9440.method2208(30114) - var13);
                                        }
                                        continue;
                                    }
                                    if (class330.field4300 == var11.field6324) {
                                        class263.method1627((byte) -62, var13, var12, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field6290 && var23) {
                                    var11.field6290 = true;
                                    if (var11.field6366 != null) {
                                        class155 var51 = new class155();
                                        var51.field1960 = true;
                                        var51.field1968 = var11;
                                        var51.field1970 = var24.method323(-5) - var12;
                                        var51.field1969 = var24.method320(-103) - var13;
                                        var51.field1962 = var11.field6366;
                                        class587.field7952.method2087(var51, -108);
                                    }
                                }
                                if (var11.field6290 && var22 && var11.field6341 != null) {
                                    class155 var52 = new class155();
                                    var52.field1960 = true;
                                    var52.field1968 = var11;
                                    var52.field1970 = class691.field9440.method2214(-2703) - var12;
                                    var52.field1969 = class691.field9440.method2208(30114) - var13;
                                    var52.field1962 = var11.field6341;
                                    class587.field7952.method2087(var52, 4);
                                }
                                if (var11.field6290 && !var22) {
                                    var11.field6290 = false;
                                    if (var11.field6382 != null) {
                                        class155 var53 = new class155();
                                        var53.field1960 = true;
                                        var53.field1968 = var11;
                                        var53.field1970 = class691.field9440.method2214(-2703) - var12;
                                        var53.field1969 = class691.field9440.method2208(30114) - var13;
                                        var53.field1962 = var11.field6382;
                                        class612.field8260.method2087(var53, 94);
                                    }
                                }
                                if (var22 && var11.field6289 != null) {
                                    class155 var54 = new class155();
                                    var54.field1960 = true;
                                    var54.field1968 = var11;
                                    var54.field1970 = class691.field9440.method2214(-2703) - var12;
                                    var54.field1969 = class691.field9440.method2208(30114) - var13;
                                    var54.field1962 = var11.field6289;
                                    class587.field7952.method2087(var54, 125);
                                }
                                if (!var11.field6359 && var21) {
                                    var11.field6359 = true;
                                    if (var11.field6305 != null) {
                                        class155 var55 = new class155();
                                        var55.field1960 = true;
                                        var55.field1968 = var11;
                                        var55.field1970 = class691.field9440.method2214(-2703) - var12;
                                        var55.field1969 = class691.field9440.method2208(30114) - var13;
                                        var55.field1962 = var11.field6305;
                                        class587.field7952.method2087(var55, -124);
                                    }
                                }
                                if (var11.field6359 && var21 && var11.field6279 != null) {
                                    class155 var56 = new class155();
                                    var56.field1960 = true;
                                    var56.field1968 = var11;
                                    var56.field1970 = class691.field9440.method2214(-2703) - var12;
                                    var56.field1969 = class691.field9440.method2208(30114) - var13;
                                    var56.field1962 = var11.field6279;
                                    class587.field7952.method2087(var56, 24);
                                }
                                if (var11.field6359 && !var21) {
                                    var11.field6359 = false;
                                    if (var11.field6357 != null) {
                                        class155 var57 = new class155();
                                        var57.field1960 = true;
                                        var57.field1968 = var11;
                                        var57.field1970 = class691.field9440.method2214(-2703) - var12;
                                        var57.field1969 = class691.field9440.method2208(30114) - var13;
                                        var57.field1962 = var11.field6357;
                                        class612.field8260.method2087(var57, -113);
                                    }
                                }
                                if (var11.field6293 != null) {
                                    class155 var58 = new class155();
                                    var58.field1968 = var11;
                                    var58.field1962 = var11.field6293;
                                    class232.field3103.method2087(var58, -123);
                                }
                                if (var11.field6264 != null && class521.field6807 > var11.field6335) {
                                    if (var11.field6358 == null || class521.field6807 - var11.field6335 > 32) {
                                        class155 var63 = new class155();
                                        var63.field1968 = var11;
                                        var63.field1962 = var11.field6264;
                                        class587.field7952.method2087(var63, -117);
                                    } else {
                                        label694: for (int var59 = var11.field6335; var59 < class521.field6807; var59++) {
                                            int var60 = class2.field12[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6358.length; var61++) {
                                                if (var11.field6358[var61] == var60) {
                                                    class155 var62 = new class155();
                                                    var62.field1968 = var11;
                                                    var62.field1962 = var11.field6264;
                                                    class587.field7952.method2087(var62, -110);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6335 = class521.field6807;
                                }
                                if (var11.field6249 != null && class240.field3244 > var11.field6368) {
                                    if (var11.field6306 == null || class240.field3244 - var11.field6368 > 32) {
                                        class155 var68 = new class155();
                                        var68.field1968 = var11;
                                        var68.field1962 = var11.field6249;
                                        class587.field7952.method2087(var68, 35);
                                    } else {
                                        label670: for (int var64 = var11.field6368; var64 < class240.field3244; var64++) {
                                            int var65 = class133.field1736[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6306.length; var66++) {
                                                if (var11.field6306[var66] == var65) {
                                                    class155 var67 = new class155();
                                                    var67.field1968 = var11;
                                                    var67.field1962 = var11.field6249;
                                                    class587.field7952.method2087(var67, 116);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6368 = class240.field3244;
                                }
                                if (var11.field6226 != null && class314.field4073 > var11.field6299) {
                                    if (var11.field6347 == null || class314.field4073 - var11.field6299 > 32) {
                                        class155 var73 = new class155();
                                        var73.field1968 = var11;
                                        var73.field1962 = var11.field6226;
                                        class587.field7952.method2087(var73, 17);
                                    } else {
                                        label646: for (int var69 = var11.field6299; var69 < class314.field4073; var69++) {
                                            int var70 = class27.field412[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6347.length; var71++) {
                                                if (var11.field6347[var71] == var70) {
                                                    class155 var72 = new class155();
                                                    var72.field1968 = var11;
                                                    var72.field1962 = var11.field6226;
                                                    class587.field7952.method2087(var72, 8);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6299 = class314.field4073;
                                }
                                if (var11.field6320 != null && class237.field3192 > var11.field6326) {
                                    if (var11.field6369 == null || class237.field3192 - var11.field6326 > 32) {
                                        class155 var78 = new class155();
                                        var78.field1968 = var11;
                                        var78.field1962 = var11.field6320;
                                        class587.field7952.method2087(var78, -108);
                                    } else {
                                        label622: for (int var74 = var11.field6326; var74 < class237.field3192; var74++) {
                                            int var75 = class188.field2418[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6369.length; var76++) {
                                                if (var11.field6369[var76] == var75) {
                                                    class155 var77 = new class155();
                                                    var77.field1968 = var11;
                                                    var77.field1962 = var11.field6320;
                                                    class587.field7952.method2087(var77, -109);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6326 = class237.field3192;
                                }
                                if (var11.field6222 != null && class537.field6990 > var11.field6333) {
                                    if (var11.field6260 == null || class537.field6990 - var11.field6333 > 32) {
                                        class155 var83 = new class155();
                                        var83.field1968 = var11;
                                        var83.field1962 = var11.field6222;
                                        class587.field7952.method2087(var83, -127);
                                    } else {
                                        label598: for (int var79 = var11.field6333; var79 < class537.field6990; var79++) {
                                            int var80 = class380.field4887[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6260.length; var81++) {
                                                if (var11.field6260[var81] == var80) {
                                                    class155 var82 = new class155();
                                                    var82.field1968 = var11;
                                                    var82.field1962 = var11.field6222;
                                                    class587.field7952.method2087(var82, 108);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6333 = class537.field6990;
                                }
                                if (class415.field5339 > var11.field6339 && var11.field6223 != null) {
                                    class155 var84 = new class155();
                                    var84.field1968 = var11;
                                    var84.field1962 = var11.field6223;
                                    class587.field7952.method2087(var84, 110);
                                }
                                if (class352.field4527 > var11.field6339 && var11.field6374 != null) {
                                    class155 var85 = new class155();
                                    var85.field1968 = var11;
                                    var85.field1962 = var11.field6374;
                                    class587.field7952.method2087(var85, -107);
                                }
                                if (class331.field4310 > var11.field6339 && var11.field6245 != null) {
                                    class155 var86 = new class155();
                                    var86.field1968 = var11;
                                    var86.field1962 = var11.field6245;
                                    class587.field7952.method2087(var86, -123);
                                }
                                if (class346.field4423 > var11.field6339 && var11.field6375 != null) {
                                    class155 var87 = new class155();
                                    var87.field1968 = var11;
                                    var87.field1962 = var11.field6375;
                                    class587.field7952.method2087(var87, 116);
                                }
                                if (class149.field1924 > var11.field6339 && var11.field6269 != null) {
                                    class155 var88 = new class155();
                                    var88.field1968 = var11;
                                    var88.field1962 = var11.field6269;
                                    class587.field7952.method2087(var88, -103);
                                }
                                var11.field6339 = class166.field2089;
                                if (var11.field6241 != null) {
                                    for (int var89 = 0; var89 < class458.field5999; var89++) {
                                        class155 var90 = new class155();
                                        var90.field1968 = var11;
                                        var90.field1959 = class495.field6533[var89].method317(-5929);
                                        var90.field1965 = class495.field6533[var89].method316((byte) -83);
                                        var90.field1962 = var11.field6241;
                                        class587.field7952.method2087(var90, 76);
                                    }
                                }
                                if (class424.field5502 && var11.field6318 != null) {
                                    class155 var91 = new class155();
                                    var91.field1968 = var11;
                                    var91.field1962 = var11.field6318;
                                    class587.field7952.method2087(var91, -105);
                                }
                            }
                            if (var11.field6312 == 5 && var11.field6255 != -1) {
                                var11.method2630(class277.field3629, (byte) 102, class382.field4898).method2619(class520.field6799, var11.field6224, 5120);
                            }
                            class238.method1501(var11, 113);
                            if (var11.field6312 == 0) {
                                method712(arg0, var11.field6234, var14, var15, var16, var17, var12 - var11.field6317, var13 - var11.field6356, arg8, arg9);
                                if (var11.field6258 != null) {
                                    method712(var11.field6258, var11.field6234, var14, var15, var16, var17, var12 - var11.field6317, var13 - var11.field6356, arg8, arg9);
                                }
                                class270 var92 = (class270) class700.field9763.method39((long) var11.field6234, 31750);
                                if (var92 != null) {
                                    if (class245.field3273 == class153.field1947 && var92.field3591 == 0 && !class594.field8025 && var21 && !class100.field1336) {
                                        class382.method2178((byte) -79);
                                    }
                                    class379.method2165(10, var17, var12, var16, arg9, var15, var92.field3588, var14, var13, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class238.method1501(var11, -112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method713(int arg0) {
        if (class566.field7391 == 7 && class60.field816 == 0) {
            if (class112.field1466 > 1) {
                class149.field1924 = class166.field2089;
                class112.field1466--;
            }
            if (!class594.field8025) {
                class382.method2178((byte) -79);
            }
            for (int var2 = 0; var2 < 100 && class612.method3318(true); var2++) {
            }
        }
        field1213++;
        class57.field767++;
        if (arg0 >= -123) {
            method714();
        }
        class66.method541(-1, (byte) -5, -1, null);
        class263.method1627((byte) -62, -1, -1, null);
        class412.method2329(65);
        class166.field2089++;
        for (int var3 = 0; var3 < class480.field6406; var3++) {
            class532 var4 = class93.field1230[var3].field3131;
            if (var4 != null) {
                byte var5 = var4.field6914.field9712;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1265(77);
                    if ((var5 & 0x2) != 0 && var4.field3038 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3030[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class611.field8258 - var6 - 1)) {
                                var9 = class611.field8258 - var6 - 1;
                            }
                            int var10 = var4.field3039[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class656.field9155 - var6 - 1) < var10) {
                                var10 = class656.field9155 - var6 - 1;
                            }
                            int var11 = class234.method1484(var9, 0, var6, class652.field9065, var10, -1, 0, class690.field9429, var6, true, class703.field9806[var4.field508], var4.field3030[0], var4.field3039[0], var6, -20943);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3030[var12] = class652.field9065[var11 - (var12 + 1)];
                                    var4.field3039[var12] = class690.field9429[var11 - var12 - 1];
                                    var4.field3032[var12] = 1;
                                }
                                var4.field3038 = var11;
                            }
                        }
                    }
                    class522.method2802(true, var4, 0);
                    int var13 = class255.method1611(var4, (byte) 120);
                    class122.method906(class468.field6110, class230.field3078, 128, var4, var13);
                    class113.method859(var4, -114, class230.field3078);
                    class489.method2678(-1, var4);
                }
            }
        }
        if (class60.field816 == 0 && class45.field627 == 0) {
            if (class704.field9810 == 2) {
                class512.method2763((byte) -67);
            } else {
                class192.method1260(3);
            }
            if ((class499.field6555 >> 9) < 14 || (class611.field8258 - 14) <= (class499.field6555 >> 9) || (class549.field7132 >> 9) < 14 || class656.field9155 - 14 <= class549.field7132 >> 9) {
                class130.method933(6);
            }
        }
        while (true) {
            class155 var14;
            class477 var15;
            class477 var16;
            do {
                var14 = (class155) class232.field3103.method2092((byte) 92);
                if (var14 == null) {
                    while (true) {
                        class155 var17;
                        class477 var18;
                        class477 var19;
                        do {
                            var17 = (class155) class612.field8260.method2092((byte) 92);
                            if (var17 == null) {
                                while (true) {
                                    class155 var20;
                                    class477 var21;
                                    class477 var22;
                                    do {
                                        var20 = (class155) class587.field7952.method2092((byte) 92);
                                        if (var20 == null) {
                                            if (class655.field9114 != null) {
                                                class223.method1412((byte) 50);
                                            }
                                            if ((class424.field5503 % 1500) == 0) {
                                                class419.method2417(1);
                                            }
                                            if (class566.field7391 == 7 && class60.field816 == 0) {
                                                class62.method524((byte) -77);
                                            }
                                            class569.method3041(-3815);
                                            if (class653.field9086 && (class584.method3191(1) - 60000L) > class541.field7037) {
                                                class136.method990(0);
                                            }
                                            for (class691 var23 = (class691) class225.field2926.method2101(260); var23 != null; var23 = (class691) class225.field2926.method2098((byte) 57)) {
                                                if ((class584.method3191(1) / 1000L - 5L) > ((long) var23.field9441)) {
                                                    if (var23.field9435 > 0) {
                                                        class495.method2696(-1, 0, "", 5, "", var23.field9437 + class604.field8143.method3280((byte) -97, class144.field1890), "");
                                                    }
                                                    if (var23.field9435 == 0) {
                                                        class495.method2696(-1, 0, "", 5, "", var23.field9437 + class604.field8144.method3280((byte) 92, class144.field1890), "");
                                                    }
                                                    var23.method2227(118);
                                                }
                                            }
                                            if (class566.field7391 == 7 && class60.field816 == 0) {
                                                if (class2.field15 == null) {
                                                    class250.method1577(3, false);
                                                    return;
                                                }
                                                class659.field9191++;
                                                if (class659.field9191 > 50) {
                                                    class564.field7363++;
                                                    class11 var24 = class130.method931(class649.field9035, (byte) 54, class307.field4022);
                                                    class100.method760(var24, -124);
                                                }
                                                try {
                                                    class96.method730(0);
                                                    return;
                                                } catch (IOException var25) {
                                                    class250.method1577(3, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field1968;
                                        if (var21.field6221 < 0) {
                                            break;
                                        }
                                        var22 = class600.method3268(-85, var21.field6292);
                                    } while (var22 == null || var22.field6258 == null || var22.field6258.length <= var21.field6221 || var22.field6258[var21.field6221] != var21);
                                    class709.method3885(var20);
                                }
                            }
                            var18 = var17.field1968;
                            if (var18.field6221 < 0) {
                                break;
                            }
                            var19 = class600.method3268(1, var18.field6292);
                        } while (var19 == null || var19.field6258 == null || var18.field6221 >= var19.field6258.length || var19.field6258[var18.field6221] != var18);
                        class709.method3885(var17);
                    }
                }
                var15 = var14.field1968;
                if (var15.field6221 < 0) {
                    break;
                }
                var16 = class600.method3268(-4, var15.field6292);
            } while (var16 == null || var16.field6258 == null || var15.field6221 >= var16.field6258.length || var16.field6258[var15.field6221] != var15);
            class709.method3885(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method714() {
        int var0 = class260.field3508;
        int[] var1 = class135.field1779;
        int var2 = class294.field3806 ? var0 : class248.field3351 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class227 var4;
            if (var3 < var0) {
                var4 = class592.field8019[var1[var3]];
            } else {
                var4 = ((class234) class505.field6640.method39((long) class40.field558[var3 - var0], 31750)).field3131;
            }
            if (var4.field2963 >= 0) {
                int var5 = var4.method1265(123);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field506 & 0x1FF) == 0 && (var4.field503 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field506 & 0x1FF) == 256 && (var4.field503 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class193 && var4.field3033 != null && class424.field5503 >= var4.field3033.field6967 && class424.field5503 < var4.field3033.field6969) {
                    ((class193) var4).field2517 = false;
                }
                var4.field510 = class332.method1916(1218445319, var4.field503, var4.field508, var4.field506);
                class587.method3203(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method715(int arg0) {
        int var1 = class260.field3508;
        int[] var2 = class135.field1779;
        int var3 = class294.field3806 ? var1 : class248.field3351 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class227 var5;
            if (var4 < var1) {
                var5 = class592.field8019[var2[var4]];
            } else {
                var5 = ((class234) class505.field6640.method39((long) class40.field558[var4 - var1], 31750)).field3131;
            }
            if (var5.field508 == arg0) {
                var5.field3011 = 0;
                if (var5.field2963 < 0) {
                    var5.field2983 = false;
                } else {
                    int var6 = var5.method1265(77);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field506 & 0x1FF) != 0 || (var5.field503 & 0x1FF) != 0) {
                            var5.field2983 = false;
                            continue;
                        }
                    } else if ((var5.field506 & 0x1FF) != 256 || (var5.field503 & 0x1FF) != 256) {
                        var5.field2983 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field506 >> 9;
                        int var8 = var5.field503 >> 9;
                        if (class554.field7252[var7][var8] != var5.field2963) {
                            var5.field2983 = true;
                            continue;
                        }
                        if (class686.field9410[var7][var8] > 1) {
                            var10002 = class686.field9410[var7][var8]--;
                            var5.field2983 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field506 - var9 >> 9;
                        int var11 = var5.field503 - var9 >> 9;
                        int var12 = var5.field506 + var9 >> 9;
                        int var13 = var5.field503 + var9 >> 9;
                        if (!class145.method1081(var10, var13, var12, (byte) -121, var11, var5.field2963)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class554.field7252[var14][var15] == var5.field2963) {
                                        var10002 = class686.field9410[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2983 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class193 && var5.field3033 != null && class424.field5503 >= var5.field3033.field6967 && class424.field5503 < var5.field3033.field6969) {
                        ((class193) var5).field2517 = false;
                    }
                    var5.field2983 = false;
                    var5.field510 = class332.method1916(1218445319, var5.field503, var5.field508, var5.field506);
                    class587.method3203(var5, true);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method716(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
