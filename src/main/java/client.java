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
public class client extends class414 {

    @OriginalMember(owner = "client!client", name = "E", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field3750;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field3749;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[Lrj;")
    public static class593[] field3743;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1800(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 8)
    private final void method1776(byte arg0) {
        field3745++;
        if (class392.field5397 == 14) {
            return;
        }
        long var2 = class222.method1290(0) / 1000000L - class394.field5408;
        class394.field5408 = class222.method1290(0) / 1000000L;
        boolean var4 = class555.method3259(0);
        if (var4 && class533.field7714 && class167.field1857 != null) {
            class167.field1857.method117(-7088);
        }
        if (class626.method3590(class392.field5397, false)) {
            if (class491.field6991 != 0L && class491.field6991 < class652.method3700(-1)) {
                class191.method1162(class579.field8201, class413.field5627, (byte) 124, class735.method4098(false), false);
            } else if (!class275.field3370.method328() && class681.field9645) {
                class606.method3439(512);
            }
        }
        if (class370.field4740 == null) {
            Container var5;
            if (class537.field7761 != null) {
                var5 = class537.field7761;
            } else if (class255.field3123 == null) {
                var5 = class471.field6735;
            } else {
                var5 = class255.field3123;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class537.field7761 == var5) {
                Insets var8 = class537.field7761.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class71.field758 != var6 || class217.field2523 != var7 || class698.field9825) {
                if (class275.field3370 == null || class275.field3370.method326()) {
                    class390.method2404(-2);
                } else {
                    class71.field758 = var6;
                    class217.field2523 = var7;
                }
                class491.field6991 = class652.method3700(-1) + 500L;
                class698.field9825 = false;
            }
        }
        if (class370.field4740 != null && !class579.field8197 && class626.method3590(class392.field5397, false)) {
            class191.method1162(-1, -1, (byte) 124, class654.field9334.field9843.method2453(18), false);
        }
        boolean var9 = false;
        if (class237.field2828) {
            var9 = true;
            class237.field2828 = false;
        }
        if (var9) {
            class161.method997(0);
        }
        if (class275.field3370 != null && class275.field3370.method328() || class735.method4098(false) != 1) {
            class486.method2933(true);
        }
        if (class654.method3709(class392.field5397, 125)) {
            class588.method3373(var9, -1);
        } else if (class15.method73(0, class392.field5397)) {
            class565.method3287(512);
        } else if (class50.method290(true, class392.field5397)) {
            class565.method3287(512);
        } else if (class300.method1771(-3163, class392.field5397)) {
            if (class689.field9719 == 1) {
                if (class736.field10295 < class412.field5621) {
                    class736.field10295 = class412.field5621;
                }
                int var11 = (class736.field10295 - class412.field5621) * 50 / class736.field10295;
                class192.method1170(class720.field10104, true, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, 106) + "<br>(" + var11 + "%)", class740.field10344);
            } else if (class689.field9719 == 2) {
                if (class491.field6992 > class319.field4074) {
                    class319.field4074 = class491.field6992;
                }
                int var10 = (class319.field4074 - class491.field6992) * 50 / class319.field4074 + 50;
                class192.method1170(class720.field10104, true, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, 75) + "<br>(" + var10 + "%)", class740.field10344);
            } else {
                class192.method1170(class720.field10104, true, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, 110), class740.field10344);
            }
        } else if (class392.field5397 == 10) {
            class654.method3712(var2, (byte) -33);
        } else if (class392.field5397 == 13) {
            class192.method1170(class720.field10104, false, -8069, class275.field3370, class486.field6918.method2936(class489.field6978, 70) + "<br>" + class486.field6919.method2936(class489.field6978, -56), class740.field10344);
        }
        if (class475.field6775 == 3) {
            for (int var12 = 0; var12 < class717.field10056; var12++) {
                Rectangle var13 = class452.field6510[var12];
                if (class459.field6560[var12]) {
                    class275.field3370.method371(var13.x, var13.y, -65281, var13.height, 1, var13.width);
                } else if (class344.field4472[var12]) {
                    class275.field3370.method371(var13.x, var13.y, -65536, var13.height, 1, var13.width);
                } else {
                    class275.field3370.method371(var13.x, var13.y, -16711936, var13.height, 1, var13.width);
                }
            }
        }
        if (class555.method3256(0)) {
            class502.method2981(class275.field3370, (byte) 119);
        }
        if (class289.field3549.field7847 && class626.method3590(class392.field5397, false) && class475.field6775 == 0 && class735.method4098(false) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class717.field10056; var17++) {
                if (class344.field4472[var17]) {
                    class344.field4472[var17] = false;
                    class313.field3882[var16++] = class452.field6510[var17];
                }
            }
            try {
                if (class397.field5443) {
                    class702.method3943(31374, class313.field3882, var16);
                } else {
                    class275.field3370.method387(class313.field3882, var16, true);
                }
            } catch (class266 var19) {
            }
        } else if (!class654.method3709(class392.field5397, 127)) {
            for (int var14 = 0; var14 < class717.field10056; var14++) {
                class344.field4472[var14] = false;
            }
            try {
                if (class397.field5443) {
                    class178.method1098(false);
                } else {
                    class275.field3370.method388((byte) -121);
                }
            } catch (class266 var20) {
                class151.method936(var20.getMessage() + " (Recovered) " + this.method1797((byte) 25), var20, 84);
                class627.method3597(false, 0, -31618);
            }
        }
        class140.method879((byte) 104);
        if (arg0 >= -44) {
            field3743 = null;
        }
        int var18 = class654.field9334.field9876.method42(-128);
        if (var18 == 0) {
            class524.method3076(1, 15L);
        } else if (var18 == 1) {
            class524.method3076(1, 10L);
        } else if (var18 == 2) {
            class524.method3076(1, 5L);
        } else if (var18 == 3) {
            class524.method3076(1, 2L);
        }
        if (class204.field2414) {
            class567.method3303((byte) -95);
        }
        if (class654.field9334.field9871.method248(-125) == 1 && class392.field5397 == 3 && class327.field4245 != -1) {
            class654.field9334.method3924(true, class654.field9334.field9871, 0);
            class37.method168((byte) 121);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 267)
    public final synchronized void method1777(byte arg0) {
        field3748++;
        if (class255.field3123 != null && class618.field8849 == null && !class289.field3549.field7847) {
            try {
                Class var2 = class255.field3123.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class618.field8849 = (Canvas) var3.get(class255.field3123);
                var3.set(class255.field3123, null);
                if (class618.field8849 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1777(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltp;)Ltp;", line = 295)
    public static final class532 method1778(class532 arg0) {
        int var1 = method1779(arg0).method4183(482687474);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class269.method1608((byte) -72, arg0.field7580);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 318)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class560.method3274(1, "Argument count");
            }
            class593.field8383 = new class444();
            class593.field8383.field6435 = Integer.parseInt(arg0[0]);
            class142.field1593 = new class444();
            class142.field1593.field6435 = Integer.parseInt(arg0[1]);
            class431.field6269 = new class444();
            class431.field6269.field6435 = Integer.parseInt(arg0[2]);
            class237.field2829 = class159.field1757;
            if (arg0[3].equals("live")) {
                class289.field3567 = class324.field4143;
            } else if (arg0[3].equals("rc")) {
                class289.field3567 = class289.field3554;
            } else if (arg0[3].equals("wip")) {
                class289.field3567 = class202.field2398;
            } else {
                class560.method3274(1, "modewhat");
            }
            class489.field6978 = class737.method4111(false, arg0[4]);
            if (class489.field6978 == -1) {
                if (arg0[4].equals("english")) {
                    class489.field6978 = 0;
                } else if (arg0[4].equals("german")) {
                    class489.field6978 = 1;
                } else {
                    class560.method3274(1, "language");
                }
            }
            class240.field2854 = false;
            class226.field2583 = false;
            if (arg0[5].equals("game0")) {
                class99.field1034 = class101.field1048;
            } else if (arg0[5].equals("game1")) {
                class99.field1034 = class15.field130;
            } else if (arg0[5].equals("game2")) {
                class99.field1034 = class467.field6689;
            } else if (arg0[5].equals("game3")) {
                class99.field1034 = class633.field9103;
            } else {
                class560.method3274(1, "game");
            }
            class750.field10490 = false;
            class10.field79 = null;
            class185.field2211 = false;
            class519.field7378 = 0;
            class389.field5383 = 0;
            class359.field4598 = null;
            class757.field10552 = 0;
            class327.field4247 = true;
            class722.field10120 = true;
            class302.field3783 = class99.field1034.field3752;
            class608.field8638 = "";
            class553.field7927 = 0L;
            client var1 = new client();
            class30.field343 = var1;
            var1.method2538(37, false, -127, 768, class289.field3567.method2541(-1) + 32, 1024, class99.field1034.field3758, 632);
            class537.field7761.setLocation(40, 40);
        } catch (Exception var3) {
            class151.method936(null, var3, 120);
        }
        field3734++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltp;)Llo;", line = 408)
    public static final class751 method1779(class532 arg0) {
        class751 var1 = (class751) class478.field6827.method1754(false, ((long) arg0.field7704 << 32) + (long) arg0.field7628);
        return var1 == null ? arg0.field7677 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 416)
    private final void method1780(int arg0) {
        field3740++;
        if (class343.field4446 < class227.field2592.field4381) {
            class76.field802.method2759((byte) -53);
            class301.field3751 = (class227.field2592.field4381 - 1) * 5 * 50;
            if (class301.field3751 > 3000) {
                class301.field3751 = 3000;
            }
            if (class227.field2592.field4381 >= 2 && class227.field2592.field4382 == 6) {
                this.method2532(0, "js5connect_outofdate");
                class392.field5397 = 14;
                return;
            }
            if (class227.field2592.field4381 >= 4 && class227.field2592.field4382 == -1) {
                this.method2532(0, "js5crc");
                class392.field5397 = 14;
                return;
            }
            if (class227.field2592.field4381 >= 4 && class654.method3709(class392.field5397, 126)) {
                if (class227.field2592.field4382 == 7 || class227.field2592.field4382 == 9) {
                    this.method2532(0, "js5connect_full");
                } else if (class227.field2592.field4382 <= 0) {
                    this.method2532(0, "js5io");
                } else if (class685.field9673 == null) {
                    this.method2532(0, "js5connect");
                } else {
                    this.method2532(0, "js5proxy_" + class685.field9673.trim());
                }
                class392.field5397 = 14;
                return;
            }
        }
        class343.field4446 = class227.field2592.field4381;
        if (class301.field3751 > 0) {
            class301.field3751--;
            return;
        }
        try {
            if (class607.field8625 == 0) {
                class312.field3864 = class76.field802.method2757(-12113, class289.field3549);
                class607.field8625++;
            }
            int var2 = 108 / ((31 - arg0) / 41);
            if (class607.field8625 == 1) {
                if (class312.field3864.field3573 == 2) {
                    if (class312.field3864.field3577 != null) {
                        class685.field9673 = (String) class312.field3864.field3577;
                    }
                    this.method1790((byte) 125, 1000);
                    return;
                }
                if (class312.field3864.field3573 == 1) {
                    class607.field8625++;
                }
            }
            if (class607.field8625 == 2) {
                class698.field9822 = new class357((Socket) class312.field3864.field3577, class289.field3549, 25000);
                class244 var3 = new class244(5);
                var3.method1460(class360.field4608.field3126, 24710);
                var3.method1421(632, -20798);
                class698.field9822.method2103(var3.field2912, 126, 5, 0);
                class607.field8625++;
                class7.field52 = class652.method3700(-1);
            }
            if (class607.field8625 == 3) {
                if (class654.method3709(class392.field5397, 126) || class698.field9822.method2102((byte) -121) > 0) {
                    int var4 = class698.field9822.method2098((byte) -127);
                    if (var4 != 0) {
                        this.method1790((byte) 125, var4);
                        return;
                    }
                    class607.field8625++;
                } else if ((class652.method3700(-1) - class7.field52) > 30000L) {
                    this.method1790((byte) 125, 1001);
                    return;
                }
            }
            if (class607.field8625 == 4) {
                boolean var5 = class654.method3709(class392.field5397, 126) || class262.method1575(class392.field5397, 6) || class100.method700((byte) 8, class392.field5397);
                class374[] var6 = class374.method2176(-29825);
                class244 var7 = new class244(var6.length * 4);
                class698.field9822.method2104(var7.field2912.length, var7.field2912, false, 0);
                for (int var8 = 0; var8 < var6.length; var8++) {
                    var6[var8].method2178(var7.method1438(100), -112);
                }
                class227.field2592.method2015((byte) -111, class698.field9822, !var5);
                class607.field8625 = 0;
                class312.field3864 = null;
                class698.field9822 = null;
            }
        } catch (IOException var9) {
            this.method1790((byte) 125, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 580)
    public final void method1781(byte arg0) {
        field3739++;
        if (class750.field10490) {
            class649.field9279 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class390.method2404(-2);
        class93.field985 = new class379(class289.field3549);
        class227.field2592 = new class339();
        class518.method3044(new int[] { 20, 260 }, new int[] { 1000, 100 }, -10451);
        if (class342.field4425 != class237.field2829) {
            class134.field1518 = new byte[50][];
        }
        class654.field9334 = class260.method1556((byte) -72);
        if (class342.field4425 == class237.field2829) {
            class593.field8383.field6430 = this.getCodeBase().getHost();
        } else if (class608.method3444(class237.field2829, -124)) {
            class593.field8383.field6430 = this.getCodeBase().getHost();
            class593.field8383.field6441 = class593.field8383.field6435 + 40000;
            class142.field1593.field6441 = class142.field1593.field6435 + 40000;
            class431.field6269.field6441 = class431.field6269.field6435 + 40000;
            class593.field8383.field6431 = class593.field8383.field6435 + 50000;
            class142.field1593.field6431 = class142.field1593.field6435 + 50000;
            class431.field6269.field6431 = class431.field6269.field6435 + 50000;
        } else if (class237.field2829 == class159.field1757) {
            class593.field8383.field6430 = "127.0.0.1";
            class142.field1593.field6430 = "127.0.0.1";
            class593.field8383.field6441 = class593.field8383.field6435 + 40000;
            class431.field6269.field6430 = "127.0.0.1";
            class142.field1593.field6441 = class142.field1593.field6435 + 40000;
            class431.field6269.field6441 = class431.field6269.field6435 + 40000;
            class593.field8383.field6431 = class593.field8383.field6435 + 50000;
            class142.field1593.field6431 = class142.field1593.field6435 + 50000;
            class431.field6269.field6431 = class431.field6269.field6435 + 50000;
        }
        class221.field2547 = class19.field177 = class710.field10002 = class674.field9558 = new short[256];
        if (class99.field1034 == class101.field1048) {
            class277.field3388 = false;
        }
        class76.field802 = class593.field8383;
        if (arg0 != -56) {
            return;
        }
        if (class99.field1034 == class15.field130) {
            class291.field3581 = class7.field47;
            class296.field3651 = true;
            class127.field1332 = class242.field2881;
            class66.field673 = 0;
            class221.field2544 = 16777215;
        } else if (class99.field1034 == class633.field9103) {
            class127.field1332 = class40.field463;
            class291.field3581 = class371.field4745;
        } else {
            class127.field1332 = class467.field6694;
            class291.field3581 = class585.field8261;
        }
        try {
            class667.field9489 = class30.field343.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class375.field4818 = class124.method796(class618.field8849, -44);
        class353.field4537 = class177.method1088(-125, class618.field8849, true);
        try {
            if (class289.field3549.field7838 != null) {
                class289.field3557 = new class263(class289.field3549.field7838, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class439.field6379[var3] = new class263(class289.field3549.field7839[var3], 6000, 0);
                }
                class37.field421 = new class263(class289.field3549.field7843, 6000, 0);
                class723.field10133 = new class199(255, class289.field3557, class37.field421, 500000);
                class737.field10304 = new class263(class289.field3549.field7853, 24, 0);
                class289.field3549.field7843 = null;
                class289.field3549.field7853 = null;
                class289.field3549.field7839 = null;
                class289.field3549.field7838 = null;
            }
        } catch (IOException var5) {
            class737.field10304 = null;
            class289.field3557 = null;
            class723.field10133 = null;
            class37.field421 = null;
        }
        if (class342.field4425 != class237.field2829) {
            class127.field1333 = true;
        }
        class40.field459 = class486.field6916.method2936(class489.field6978, -57);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 708)
    public final void method1782(byte arg0) {
        field3737++;
        if (arg0 != -94) {
            field3743 = null;
        }
        if (class654.field9334.field9850.method1512(125) != 2) {
            this.method1789(arg0 ^ 0x7825);
            return;
        }
        try {
            this.method1789(arg0 ^ 0x7825);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class151.method936(var5.getMessage() + " (Recovered) " + this.method1797((byte) 25), var5, 95);
            class38.field432 = true;
            class627.method3597(false, 0, -31618);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 734)
    private final void method1783(byte arg0) {
        field3738++;
        if (class392.field5397 == 7 && class461.field6567 == 0) {
            if (class122.field1276 > 1) {
                class122.field1276--;
                class187.field2223 = class514.field7334;
            }
            if (!class149.field1652) {
                class228.method1321(arg0 ^ 0x27);
            }
            for (int var2 = 0; var2 < 100 && class123.method790(arg0 ^ 0xFFFFFFA9); var2++) {
            }
        }
        class721.field10119++;
        class203.method1223(-1, -1, (byte) -122, null);
        class446.method2764(null, -1, -1, 0);
        class50.method283(true);
        class514.field7334++;
        if (arg0 != -87) {
            return;
        }
        for (int var3 = 0; var3 < class529.field7533; var3++) {
            class197 var4 = class452.field6509[var3].field1661;
            if (var4 != null) {
                byte var5 = var4.field2293.field4203;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1128(-1);
                    if ((var5 & 0x2) != 0 && var4.field7184 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field7187[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class489.field6976 - var6 - 1 < var9) {
                                var9 = class489.field6976 - var6 - 1;
                            }
                            int var10 = var4.field7193[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class153.field1677 - var6 - 1)) {
                                var10 = class153.field1677 - var6 - 1;
                            }
                            int var11 = class627.method3593(class286.field3490, var10, var4.field7187[0], var9, var4.field7193[0], class205.field2430[var4.field4628], var6, 0, true, var6, 0, -1, class274.field3365, 0, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field7187[var12] = class286.field3490[var11 - var12 - 1];
                                    var4.field7193[var12] = class274.field3365[var11 - var12 - 1];
                                    var4.field7183[var12] = 1;
                                }
                                var4.field7184 = var11;
                            }
                        }
                    }
                    class10.method45(var4, true, 1519);
                    int var13 = class567.method3301(var4, (byte) 28);
                    class74.method538(var4, true);
                    class344.method2049(class165.field1849, var4, 1081, class66.field675, var13);
                    class158.method976(var4, class165.field1849, (byte) -47);
                    class199.method1199(var4, 92);
                }
            }
        }
        if (class461.field6567 == 0 && class71.field746 == 0) {
            if (class496.field7014 == 2) {
                class60.method464(76);
            } else {
                class19.method86(false);
            }
            if (class167.field1855 >> 9 < 14 || (class489.field6976 - 14) <= (class167.field1855 >> 9) || class590.field8319 >> 9 < 14 || class590.field8319 >> 9 >= class153.field1677 - 14) {
                class577.method3333((byte) 59);
            }
        }
        while (true) {
            class622 var14;
            class532 var15;
            class532 var16;
            do {
                var14 = (class622) class141.field1587.method1729(662);
                if (var14 == null) {
                    while (true) {
                        class622 var17;
                        class532 var18;
                        class532 var19;
                        do {
                            var17 = (class622) class76.field799.method1729(662);
                            if (var17 == null) {
                                while (true) {
                                    class622 var20;
                                    class532 var21;
                                    class532 var22;
                                    do {
                                        var20 = (class622) class518.field7374.method1729(662);
                                        if (var20 == null) {
                                            if (class344.field4474 != null) {
                                                class491.method2950(81);
                                            }
                                            if ((class392.field5398 % 1500) == 0) {
                                                class316.method1892(89);
                                            }
                                            if (class392.field5397 == 7 && class461.field6567 == 0) {
                                                class330.method1974(arg0 + 23212);
                                            }
                                            class77.method548(false);
                                            if (class542.field7815 && class652.method3700(arg0 + 86) - 60000L > class681.field9637) {
                                                class523.method3074(false);
                                            }
                                            for (class38 var23 = (class38) class289.field3572.method2790(arg0 ^ 0xFFFFFFC7); var23 != null; var23 = (class38) class289.field3572.method2794(80)) {
                                                if ((class652.method3700(-1) / 1000L - 5L) > ((long) var23.field425)) {
                                                    if (var23.field426 > 0) {
                                                        class74.method536(var23.field429 + class486.field6923.method2936(class489.field6978, -73), "", 5, 0, (byte) -111, "", "");
                                                    }
                                                    if (var23.field426 == 0) {
                                                        class74.method536(var23.field429 + class486.field6924.method2936(class489.field6978, arg0 + 153), "", 5, 0, (byte) -69, "", "");
                                                    }
                                                    var23.method2401((byte) -57);
                                                }
                                            }
                                            if (class392.field5397 == 7 && class461.field6567 == 0) {
                                                if (class751.field10504 == null) {
                                                    class7.method25(false, (byte) 117);
                                                    return;
                                                }
                                                class688.field9717++;
                                                if (class688.field9717 > 50) {
                                                    class463.field6607++;
                                                    class249 var24 = class289.method1715(class251.field3028, arg0 + 157, class41.field470);
                                                    class510.method3017(var24, 98);
                                                }
                                                try {
                                                    class704.method3953(-104);
                                                    return;
                                                } catch (IOException var25) {
                                                    class7.method25(false, (byte) 72);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field8908;
                                        if (var21.field7628 < 0) {
                                            break;
                                        }
                                        var22 = class269.method1608((byte) -72, var21.field7580);
                                    } while (var22 == null || var22.field7632 == null || var22.field7632.length <= var21.field7628 || var22.field7632[var21.field7628] != var21);
                                    class133.method859(var20);
                                }
                            }
                            var18 = var17.field8908;
                            if (var18.field7628 < 0) {
                                break;
                            }
                            var19 = class269.method1608((byte) -72, var18.field7580);
                        } while (var19 == null || var19.field7632 == null || var18.field7628 >= var19.field7632.length || var19.field7632[var18.field7628] != var18);
                        class133.method859(var17);
                    }
                }
                var15 = var14.field8908;
                if (var15.field7628 < 0) {
                    break;
                }
                var16 = class269.method1608((byte) -72, var15.field7580);
            } while (var16 == null || var16.field7632 == null || var15.field7628 >= var16.field7632.length || var16.field7632[var15.field7628] != var15);
            class133.method859(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1021)
    private final void method1784(int arg0) {
        if (arg0 != 252) {
            return;
        }
        field3744++;
        boolean var2 = class227.field2592.method2020((byte) -78);
        if (!var2) {
            this.method1780(-42);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1037)
    public final void init() {
        field3741++;
        if (!this.method2534(-25706)) {
            return;
        }
        class593.field8383 = new class444();
        class593.field8383.field6435 = Integer.parseInt(this.getParameter("worldid"));
        class142.field1593 = new class444();
        class142.field1593.field6435 = Integer.parseInt(this.getParameter("lobbyid"));
        class142.field1593.field6430 = this.getParameter("lobbyaddress");
        class431.field6269 = new class444();
        class431.field6269.field6435 = Integer.parseInt(this.getParameter("demoid"));
        class431.field6269.field6430 = this.getParameter("demoaddress");
        class237.field2829 = class200.method1209(Integer.parseInt(this.getParameter("modewhere")), true);
        if (class237.field2829 == class159.field1757) {
            class237.field2829 = class465.field6661;
        } else if (!class608.method3444(class237.field2829, -19) && class342.field4425 != class237.field2829) {
            class237.field2829 = class342.field4425;
        }
        class289.field3567 = class511.method3021(Integer.parseInt(this.getParameter("modewhat")), -124);
        if (class289.field3567 != class202.field2398 && class289.field3567 != class289.field3554 && class324.field4143 != class289.field3567) {
            class289.field3567 = class324.field4143;
        }
        try {
            class489.field6978 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class489.field6978 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class240.field2854 = true;
        } else {
            class240.field2854 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class226.field2583 = true;
        } else {
            class226.field2583 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class654.field9329 = true;
        } else {
            class654.field9329 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class99.field1034 = class101.field1048;
            } else if (var4.equals("1")) {
                class99.field1034 = class15.field130;
            } else if (var4.equals("2")) {
                class99.field1034 = class467.field6689;
            } else if (var4.equals("3")) {
                class99.field1034 = class633.field9103;
            }
        }
        try {
            class519.field7378 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class519.field7378 = 0;
        }
        class115.field1204 = this.getParameter("quiturl");
        class608.field8638 = this.getParameter("settings");
        if (class608.field8638 == null) {
            class608.field8638 = "";
        }
        class217.field2519 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class389.field5383 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class389.field5383 = 0;
            }
        }
        class302.field3783 = Integer.parseInt(this.getParameter("colourid"));
        if (class302.field3783 < 0 || class261.field3239.length <= class302.field3783) {
            class302.field3783 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class327.field4247 = true;
            class722.field10120 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class185.field2211 = true;
        }
        class10.field79 = this.getParameter("sskey");
        if (class10.field79 != null && class10.field79.length() < 2) {
            class10.field79 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class750.field10490 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class757.field10552 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class553.field7927 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class359.field4598 = this.getParameter("additionalInfo");
        if (class359.field4598 != null && class359.field4598.length() > 50) {
            class359.field4598 = null;
        }
        class30.field343 = this;
        if (class99.field1034 == class101.field1048) {
            class12.field92 = 765;
            class181.field2143 = 503;
        } else if (class99.field1034 == class15.field130) {
            class12.field92 = 640;
            class181.field2143 = 480;
        }
        this.method2531(class289.field3567.method2541(-1) + 32, 37, 632, class12.field92, -87, class99.field1034.field3758, class181.field2143);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltp;IIIIIIIIIII)V", line = 1197)
    public static final void method1785(class532[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class532 var13 = arg0[var12];
            if (var13 != null && var13.field7580 == arg1) {
                int var14 = var13.field7615 + arg6;
                int var15 = var13.field7641 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field7543 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field7658 + var14;
                    int var21 = var13.field7573 + var15;
                    if (var13.field7543 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field7543 == 0 || var13.field7570 || method1779(var13).field10498 != 0 || class68.field694 == var13 || class628.field9021 == var13.field7664 || class64.field654 == var13.field7664) {
                    if (!method1788(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class397.field5443) {
                            var22 = class389.method2400(95);
                            var23 = class752.method4192(1);
                        }
                        if (class344.field4474 == var13 && class408.method2510(class344.field4474, true) != null) {
                            class551.field7908 = true;
                            class514.field7330 = var14;
                            class125.field1318 = var15;
                        }
                        if (var13.field7558 || var16 < var18 && var17 < var19) {
                            if (var13.field7626 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class622 var24 = (class622) class518.field7374.method1719(65280); var24 != null; var24 = (class622) class518.field7374.method1723(-20665)) {
                                    if (var24.field8917) {
                                        var24.method864(12983);
                                        var24.field8908.field7661 = false;
                                    }
                                }
                                if (class582.field8219 == 0) {
                                    class344.field4474 = null;
                                    class68.field694 = null;
                                }
                                class92.field958 = 0;
                                class652.field9312 = false;
                                class689.field9720 = false;
                                if (!class149.field1652) {
                                    class228.method1321(-89);
                                }
                            }
                            boolean var25;
                            if (class353.field4537.method694((byte) 123) + var22 >= var16 && class353.field4537.method691((byte) -102) + var23 >= var17 && class353.field4537.method694((byte) 124) + var22 < var18 && class353.field4537.method691((byte) -109) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class568.field8075 && var25) {
                                if (var13.field7590 >= 0) {
                                    class61.field627 = var13.field7590;
                                } else if (var13.field7626) {
                                    class61.field627 = -1;
                                }
                            }
                            if (!class149.field1652 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class559.method3272(arg10 - var14, var13, arg11 - var15, true);
                            }
                            boolean var26 = false;
                            if (class353.field4537.method699((byte) 119) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class73 var28 = (class73) class578.field8170.method1719(65280);
                            if (var28 != null && var28.method532(79) == 0 && var28.method530(-1) + var22 >= var16 && var28.method535((byte) -25) + var23 >= var17 && var28.method530(-1) + var22 < var18 && var28.method535((byte) -25) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field7553 != null && !class555.method3256(0)) {
                                for (int var29 = 0; var29 < var13.field7553.length; var29++) {
                                    if (class375.field4818.method1657(var13.field7553[var29], (byte) -40)) {
                                        if (var13.field7597 == null || class392.field5398 >= var13.field7597[var29]) {
                                            byte var30 = var13.field7684[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class375.field4818.method1657(86, (byte) -40) && !class375.field4818.method1657(82, (byte) -40) && !class375.field4818.method1657(81, (byte) -40)) && ((var30 & 0x2) == 0 || class375.field4818.method1657(86, (byte) -40)) && ((var30 & 0x1) == 0 || class375.field4818.method1657(82, (byte) -40)) && ((var30 & 0x4) == 0 || class375.field4818.method1657(81, (byte) -40))) {
                                                if (var29 < 10) {
                                                    class79.method557(var13.field7704, -124, var29 + 1, "", -1);
                                                } else if (var29 == 10) {
                                                    class251.method1503((byte) 109);
                                                    class751 var31 = method1779(var13);
                                                    class76.method545(var13, var31.field10507, var31.method4186(false), 30011);
                                                    class52.field548 = class603.method3422(1, var13);
                                                    if (class52.field548 == null) {
                                                        class52.field548 = "Null";
                                                    }
                                                    class175.field2063 = var13.field7666 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field7625[var29];
                                                if (var13.field7597 == null) {
                                                    var13.field7597 = new int[var13.field7553.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field7597[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field7597[var29] = class392.field5398 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field7597 != null) {
                                        var13.field7597[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class581.method3347(var23 + var28.method535((byte) -25) - var15, false, var13, var22 + var28.method530(-1) - var14);
                            }
                            if (class344.field4474 != null && class344.field4474 != var13 && var25 && method1779(var13).method4184(3617364)) {
                                class520.field7402 = var13;
                            }
                            if (class68.field694 == var13) {
                                class65.field659 = true;
                                class631.field9069 = var14;
                                class687.field9702 = var15;
                            }
                            if (var13.field7570 || var13.field7664 != 0) {
                                if (var25 && class381.field5214 != 0 && var13.field7650 != null) {
                                    class622 var33 = new class622();
                                    var33.field8917 = true;
                                    var33.field8908 = var13;
                                    var33.field8914 = class381.field5214;
                                    var33.field8904 = var13.field7650;
                                    class518.field7374.method1721((byte) -43, var33);
                                }
                                if (class344.field4474 != null || class149.field1652 || class478.field6828 != var13.field7664 && class92.field958 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field7664 != 0) {
                                    if (class299.field3717 == var13.field7664 || class624.field8934 == var13.field7664) {
                                        class477.field6800 = var13;
                                        if (class12.field103 != null) {
                                            class12.field103.method2635(0, var13.field7573, class275.field3370);
                                        }
                                        if (class299.field3717 == var13.field7664) {
                                            if (class149.field1652 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class441.method2745(arg8, arg9, -1, class275.field3370);
                                            class709 var34 = (class709) class147.field1636.method2790(111);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field9993 && arg10 < var34.field9995 && arg11 >= var34.field9991 && arg11 < var34.field9992) {
                                                    class228.method1321(-127);
                                                    class170.method1059(var34.field9990, 6);
                                                }
                                                var34 = (class709) class147.field1636.method2794(123);
                                            }
                                        }
                                    }
                                    if (class628.field9021 == var13.field7664) {
                                        if (var13.method3127(class275.field3370, (byte) -48) == null || class125.field1308 != 0 && class125.field1308 != 3 || class149.field1652 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field7551[var36];
                                        if (var35 < var37 || var35 > var13.field7640[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field7658 / 2;
                                        int var39 = var36 - var13.field7573 / 2;
                                        int var40;
                                        if (class496.field7014 == 4) {
                                            var40 = (int) class227.field2590 & 0x3FFF;
                                        } else {
                                            var40 = (int) class227.field2590 + class34.field367 & 0x3FFF;
                                        }
                                        int var41 = class260.field3230[var40];
                                        int var42 = class260.field3229[var40];
                                        if (class496.field7014 != 4) {
                                            var41 = (class730.field10216 + 256) * var41 >> 8;
                                            var42 = (class730.field10216 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class496.field7014 == 4) {
                                            var45 = (class175.field2062 >> 9) + (var43 >> 2);
                                            var46 = (class246.field2994 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class90.field937.method1128(-1) - 1) * 256;
                                            var45 = (class90.field937.field4635 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class90.field937.field4629 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class568.field8075 && (class12.field96 & 0x40) != 0) {
                                            class532 var48 = class689.method3895((byte) 124, class283.field3449, class620.field8886);
                                            if (var48 == null) {
                                                class251.method1503((byte) 110);
                                            } else {
                                                class723.method4030((long) (var13.field7628 << 0 | var13.field7704), true, var13.field7691, false, 1L, false, 6, class52.field548, var46, var45, true, class192.field2266, " ->");
                                            }
                                            continue;
                                        }
                                        if (class99.field1034 == class15.field130) {
                                            class723.method4030(0L, true, -1, false, 1L, false, 22, class486.field6931.method2936(class489.field6978, 115), var46, var45, true, -1, "");
                                        }
                                        class723.method4030(0L, true, -1, false, 1L, false, 15, class737.field10305, var46, var45, true, class154.field1701, "");
                                        continue;
                                    }
                                    if (class478.field6828 == var13.field7664) {
                                        class354.field4540 = var13;
                                        if (var25) {
                                            class652.field9312 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method530(-1) - var14 - var13.field7658 / 2) * 2.0D / (double) class656.field9363);
                                            int var50 = (int) (-((double) (var23 + var28.method535((byte) -25) - var15 - var13.field7573 / 2) * 2.0D / (double) class656.field9363));
                                            int var51 = class30.field352 + var49 + class656.field9386;
                                            int var52 = class116.field1211 + var50 + class656.field9374;
                                            class92 var53 = class469.method2835(127);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method620(var52, var54, var51, true);
                                            if (var54 != null) {
                                                if (class375.field4818.method1657(82, (byte) -40) && class58.field594 > 0) {
                                                    class402.method2451(var54[2], var54[1], var54[0], (byte) -112);
                                                    continue;
                                                }
                                                class689.field9720 = true;
                                                class510.field7278 = var54[0];
                                                class192.field2268 = var54[1];
                                                class205.field2429 = var54[2];
                                            }
                                            class92.field958 = 1;
                                            class708.field9986 = false;
                                            class356.field4557 = class353.field4537.method694((byte) 113);
                                            class408.field5588 = class353.field4537.method691((byte) -105);
                                            continue;
                                        }
                                        if (var26 && class92.field958 > 0) {
                                            if (class92.field958 == 1 && (class356.field4557 != class353.field4537.method694((byte) -67) || class408.field5588 != class353.field4537.method691((byte) -102))) {
                                                class620.field8885 = class30.field352;
                                                class158.field1735 = class116.field1211;
                                                class92.field958 = 2;
                                            }
                                            if (class92.field958 == 2) {
                                                class708.field9986 = true;
                                                class313.method1864(class620.field8885 + (int) ((double) (class356.field4557 - class353.field4537.method694((byte) -47)) * 2.0D / (double) class656.field9370), 920447620);
                                                class685.method3879(-68, class158.field1735 - (int) ((double) (class408.field5588 - class353.field4537.method691((byte) -121)) * 2.0D / (double) class656.field9370));
                                            }
                                            continue;
                                        }
                                        if (class92.field958 > 0 && !class708.field9986) {
                                            if ((class574.field8142 == 1 || class151.method935(-40)) && class343.field4449 > 2) {
                                                class140.method883(class408.field5588, class356.field4557, -103);
                                            } else if (class44.method260(11657)) {
                                                class140.method883(class408.field5588, class356.field4557, -116);
                                            }
                                        }
                                        class92.field958 = 0;
                                        continue;
                                    }
                                    if (class319.field4075 == var13.field7664) {
                                        if (var26) {
                                            class660.method3757(var22 + class353.field4537.method694((byte) -64) - var14, var13.field7573, var23 + class353.field4537.method691((byte) -127) - var15, -1, var13.field7658);
                                        }
                                        continue;
                                    }
                                    if (class64.field654 == var13.field7664) {
                                        class446.method2764(var13, var14, var15, 0);
                                        continue;
                                    }
                                }
                                if (!var13.field7688 && var27) {
                                    var13.field7688 = true;
                                    if (var13.field7569 != null) {
                                        class622 var55 = new class622();
                                        var55.field8917 = true;
                                        var55.field8908 = var13;
                                        var55.field8910 = var22 + var28.method530(-1) - var14;
                                        var55.field8914 = var23 + var28.method535((byte) -25) - var15;
                                        var55.field8904 = var13.field7569;
                                        class518.field7374.method1721((byte) 109, var55);
                                    }
                                }
                                if (var13.field7688 && var26 && var13.field7549 != null) {
                                    class622 var56 = new class622();
                                    var56.field8917 = true;
                                    var56.field8908 = var13;
                                    var56.field8910 = var22 + class353.field4537.method694((byte) 118) - var14;
                                    var56.field8914 = var23 + class353.field4537.method691((byte) -105) - var15;
                                    var56.field8904 = var13.field7549;
                                    class518.field7374.method1721((byte) -72, var56);
                                }
                                if (var13.field7688 && !var26) {
                                    var13.field7688 = false;
                                    if (var13.field7613 != null) {
                                        class622 var57 = new class622();
                                        var57.field8917 = true;
                                        var57.field8908 = var13;
                                        var57.field8910 = var22 + class353.field4537.method694((byte) 120) - var14;
                                        var57.field8914 = var23 + class353.field4537.method691((byte) -104) - var15;
                                        var57.field8904 = var13.field7613;
                                        class76.field799.method1721((byte) 113, var57);
                                    }
                                }
                                if (var26 && var13.field7701 != null) {
                                    class622 var58 = new class622();
                                    var58.field8917 = true;
                                    var58.field8908 = var13;
                                    var58.field8910 = var22 + class353.field4537.method694((byte) -82) - var14;
                                    var58.field8914 = var23 + class353.field4537.method691((byte) -111) - var15;
                                    var58.field8904 = var13.field7701;
                                    class518.field7374.method1721((byte) -49, var58);
                                }
                                if (!var13.field7661 && var25) {
                                    var13.field7661 = true;
                                    if (var13.field7595 != null) {
                                        class622 var59 = new class622();
                                        var59.field8917 = true;
                                        var59.field8908 = var13;
                                        var59.field8910 = var22 + class353.field4537.method694((byte) 91) - var14;
                                        var59.field8914 = var23 + class353.field4537.method691((byte) -116) - var15;
                                        var59.field8904 = var13.field7595;
                                        class518.field7374.method1721((byte) 99, var59);
                                    }
                                }
                                if (var13.field7661 && var25 && var13.field7586 != null) {
                                    class622 var60 = new class622();
                                    var60.field8917 = true;
                                    var60.field8908 = var13;
                                    var60.field8910 = var22 + class353.field4537.method694((byte) -56) - var14;
                                    var60.field8914 = var23 + class353.field4537.method691((byte) -111) - var15;
                                    var60.field8904 = var13.field7586;
                                    class518.field7374.method1721((byte) -111, var60);
                                }
                                if (var13.field7661 && !var25) {
                                    var13.field7661 = false;
                                    if (var13.field7662 != null) {
                                        class622 var61 = new class622();
                                        var61.field8917 = true;
                                        var61.field8908 = var13;
                                        var61.field8910 = var22 + class353.field4537.method694((byte) -52) - var14;
                                        var61.field8914 = var23 + class353.field4537.method691((byte) -117) - var15;
                                        var61.field8904 = var13.field7662;
                                        class76.field799.method1721((byte) -72, var61);
                                    }
                                }
                                if (var13.field7702 != null) {
                                    class622 var62 = new class622();
                                    var62.field8908 = var13;
                                    var62.field8904 = var13.field7702;
                                    class141.field1587.method1721((byte) 98, var62);
                                }
                                if (var13.field7629 != null && class176.field2068 > var13.field7578) {
                                    if (var13.field7674 == null || class176.field2068 - var13.field7578 > 32) {
                                        class622 var67 = new class622();
                                        var67.field8908 = var13;
                                        var67.field8904 = var13.field7629;
                                        class518.field7374.method1721((byte) 98, var67);
                                    } else {
                                        label699: for (int var63 = var13.field7578; var63 < class176.field2068; var63++) {
                                            int var64 = class410.field5597[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field7674.length; var65++) {
                                                if (var13.field7674[var65] == var64) {
                                                    class622 var66 = new class622();
                                                    var66.field8908 = var13;
                                                    var66.field8904 = var13.field7629;
                                                    class518.field7374.method1721((byte) -69, var66);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7578 = class176.field2068;
                                }
                                if (var13.field7656 != null && class659.field9409 > var13.field7696) {
                                    if (var13.field7564 == null || class659.field9409 - var13.field7696 > 32) {
                                        class622 var72 = new class622();
                                        var72.field8908 = var13;
                                        var72.field8904 = var13.field7656;
                                        class518.field7374.method1721((byte) -80, var72);
                                    } else {
                                        label675: for (int var68 = var13.field7696; var68 < class659.field9409; var68++) {
                                            int var69 = class204.field2410[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field7564.length; var70++) {
                                                if (var13.field7564[var70] == var69) {
                                                    class622 var71 = new class622();
                                                    var71.field8908 = var13;
                                                    var71.field8904 = var13.field7656;
                                                    class518.field7374.method1721((byte) 108, var71);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7696 = class659.field9409;
                                }
                                if (var13.field7644 != null && class314.field3924 > var13.field7634) {
                                    if (var13.field7673 == null || class314.field3924 - var13.field7634 > 32) {
                                        class622 var77 = new class622();
                                        var77.field8908 = var13;
                                        var77.field8904 = var13.field7644;
                                        class518.field7374.method1721((byte) -28, var77);
                                    } else {
                                        label651: for (int var73 = var13.field7634; var73 < class314.field3924; var73++) {
                                            int var74 = class597.field8459[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field7673.length; var75++) {
                                                if (var13.field7673[var75] == var74) {
                                                    class622 var76 = new class622();
                                                    var76.field8908 = var13;
                                                    var76.field8904 = var13.field7644;
                                                    class518.field7374.method1721((byte) 98, var76);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7634 = class314.field3924;
                                }
                                if (var13.field7610 != null && class399.field5465 > var13.field7683) {
                                    if (var13.field7577 == null || class399.field5465 - var13.field7683 > 32) {
                                        class622 var82 = new class622();
                                        var82.field8908 = var13;
                                        var82.field8904 = var13.field7610;
                                        class518.field7374.method1721((byte) -33, var82);
                                    } else {
                                        label627: for (int var78 = var13.field7683; var78 < class399.field5465; var78++) {
                                            int var79 = class615.field8824[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field7577.length; var80++) {
                                                if (var13.field7577[var80] == var79) {
                                                    class622 var81 = new class622();
                                                    var81.field8908 = var13;
                                                    var81.field8904 = var13.field7610;
                                                    class518.field7374.method1721((byte) -67, var81);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7683 = class399.field5465;
                                }
                                if (var13.field7697 != null && class540.field7778 > var13.field7561) {
                                    if (var13.field7681 == null || class540.field7778 - var13.field7561 > 32) {
                                        class622 var87 = new class622();
                                        var87.field8908 = var13;
                                        var87.field8904 = var13.field7697;
                                        class518.field7374.method1721((byte) -69, var87);
                                    } else {
                                        label603: for (int var83 = var13.field7561; var83 < class540.field7778; var83++) {
                                            int var84 = class22.field198[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field7681.length; var85++) {
                                                if (var13.field7681[var85] == var84) {
                                                    class622 var86 = new class622();
                                                    var86.field8908 = var13;
                                                    var86.field8904 = var13.field7697;
                                                    class518.field7374.method1721((byte) 118, var86);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7561 = class540.field7778;
                                }
                                if (class735.field10279 > var13.field7627 && var13.field7638 != null) {
                                    class622 var88 = new class622();
                                    var88.field8908 = var13;
                                    var88.field8904 = var13.field7638;
                                    class518.field7374.method1721((byte) 117, var88);
                                }
                                if (class422.field6146 > var13.field7627 && var13.field7606 != null) {
                                    class622 var89 = new class622();
                                    var89.field8908 = var13;
                                    var89.field8904 = var13.field7606;
                                    class518.field7374.method1721((byte) -100, var89);
                                }
                                if (class174.field2051 > var13.field7627 && var13.field7672 != null) {
                                    class622 var90 = new class622();
                                    var90.field8908 = var13;
                                    var90.field8904 = var13.field7672;
                                    class518.field7374.method1721((byte) -115, var90);
                                }
                                if (class451.field6504 > var13.field7627 && var13.field7675 != null) {
                                    class622 var91 = new class622();
                                    var91.field8908 = var13;
                                    var91.field8904 = var13.field7675;
                                    class518.field7374.method1721((byte) -26, var91);
                                }
                                if (class187.field2223 > var13.field7627 && var13.field7709 != null) {
                                    class622 var92 = new class622();
                                    var92.field8908 = var13;
                                    var92.field8904 = var13.field7709;
                                    class518.field7374.method1721((byte) -71, var92);
                                }
                                var13.field7627 = class514.field7334;
                                if (var13.field7560 != null) {
                                    for (int var93 = 0; var93 < class183.field2202; var93++) {
                                        class622 var94 = new class622();
                                        var94.field8908 = var13;
                                        var94.field8909 = class266.field3307[var93].method2517(124);
                                        var94.field8906 = class266.field3307[var93].method2514((byte) 124);
                                        var94.field8904 = var13.field7560;
                                        class518.field7374.method1721((byte) 101, var94);
                                    }
                                }
                                if (class228.field2645 && var13.field7680 != null) {
                                    class622 var95 = new class622();
                                    var95.field8908 = var13;
                                    var95.field8904 = var13.field7680;
                                    class518.field7374.method1721((byte) -85, var95);
                                }
                            }
                            if (var13.field7543 == 5 && var13.field7616 != -1) {
                                var13.method3122((byte) 36, class430.field6249, class82.field857).method2635(0, var13.field7573, class275.field3370);
                            }
                            class642.method3659(var13, true);
                            if (var13.field7543 == 0) {
                                method1785(arg0, var13.field7704, var16, var17, var18, var19, var14 - var13.field7567, var15 - var13.field7571, arg8, arg9, arg10, arg11);
                                if (var13.field7632 != null) {
                                    method1785(var13.field7632, var13.field7704, var16, var17, var18, var19, var14 - var13.field7567, var15 - var13.field7571, arg8, arg9, arg10, arg11);
                                }
                                class424 var96 = (class424) class153.field1688.method1754(false, (long) var13.field7704);
                                if (var96 != null) {
                                    if (class99.field1034 == class101.field1048 && var96.field6158 == 0 && !class149.field1652 && var25 && !class19.field164) {
                                        class228.method1321(-40);
                                    }
                                    class737.method4112(var96.field6159, var19, var15, var17, var16, var14, arg10, var18, arg9, arg8, (byte) -36, arg11);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class642.method3659(var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2109)
    public static final void method1786(int arg0) {
        int var1 = class585.field8256;
        int[] var2 = class399.field5459;
        int var3 = class416.field5695 ? var1 : class302.field3784 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class504 var5;
            if (var4 < var1) {
                var5 = class75.field792[var2[var4]];
            } else {
                var5 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var4 - var1])).field1661;
            }
            if (var5.field4628 == arg0) {
                var5.field7097 = 0;
                if (var5.field7123 < 0) {
                    var5.field7108 = false;
                } else {
                    int var6 = var5.method1128(-1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4635 & 0x1FF) != 0 || (var5.field4629 & 0x1FF) != 0) {
                            var5.field7108 = false;
                            continue;
                        }
                    } else if ((var5.field4635 & 0x1FF) != 256 || (var5.field4629 & 0x1FF) != 256) {
                        var5.field7108 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4635 >> 9;
                        int var8 = var5.field4629 >> 9;
                        if (class620.field8883[var7][var8] != var5.field7123) {
                            var5.field7108 = true;
                            continue;
                        }
                        if (class140.field1582[var7][var8] > 1) {
                            var10002 = class140.field1582[var7][var8]--;
                            var5.field7108 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field4635 - var9 >> 9;
                        int var11 = var5.field4629 - var9 >> 9;
                        int var12 = var5.field4635 + var9 >> 9;
                        int var13 = var5.field4629 + var9 >> 9;
                        if (!class497.method2964(var11, var5.field7123, var12, var10, var13, 3)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class620.field8883[var14][var15] == var5.field7123) {
                                        var10002 = class140.field1582[var14][var15]--;
                                    }
                                }
                            }
                            var5.field7108 = true;
                            continue;
                        }
                    }
                    var5.field7108 = false;
                    var5.field4627 = class676.method3845(var5.field4629, var5.field4635, 0, var5.field4628);
                    class264.method1594(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2223)
    public final void method1787(int arg0) {
        method1799(false);
        field3747++;
        class533.method3131(-1);
        class47.method269((byte) -99);
        class486.method2932((byte) 34);
        class304.method1825(0);
        class100.method690(241);
        class430.method2693(1);
        class374.method2175(3);
        class618.method3527((byte) 36);
        class630.method3608((byte) 1);
        class134.method862(64);
        class629.method3606(true);
        class58.method428(-71);
        class246.method1489(21778);
        class210.method1249(-2);
        class718.method4002(49);
        class289.method1726(arg0 - 25406);
        class357.method2100(arg0 ^ 0xFFFFC371);
        class339.method2010(-23084);
        class379.method2334(-116);
        class330.method1971(arg0 - 20754);
        class366.method2131((byte) 1);
        class263.method1581(true);
        class199.method1200((byte) 107);
        class620.method3546(0);
        class156.method964(true);
        class553.method3243(false);
        class544.method3193(false);
        class478.method2874((byte) 127);
        class711.method3978(arg0 ^ 0x2395);
        class344.method2050((byte) 80);
        class381.method2344(4);
        class28.method143((byte) 123);
        class146.method913(arg0 ^ 0x3CF0);
        class359.method2113((byte) -118);
        class407.method2509(false);
        class224.method1301(arg0 ^ 0x3CF0);
        class202.method1216(-93);
        class735.method4092((byte) -23);
        class476.method2859(84);
        class747.method4150((byte) -53);
        class239.method1412(arg0 ^ 0x3CB0);
        class334.method1995(false);
        class151.method934(10096);
        class311.method1850(-34847);
        class20.method91((byte) -97);
        class179.method1105(false);
        class320.method1912((byte) -108);
        class737.method4108(-126);
        class495.method2956(arg0 ^ 0xFFFFC30F);
        class302.method1812(arg0 - 25985);
        class84.method591(-103);
        class92.method625((byte) -106);
        class664.method3774(false);
        class418.method2636((byte) 92);
        class440.method2742(true);
        class722.method4026(79);
        class668.method3796((byte) 79);
        class258.method1545((byte) -128);
        class249.method1498((byte) -57);
        class504.method2994((byte) 100);
        class691.method3897(103);
        class468.method2833((byte) -126);
        class752.method4190(true);
        class602.method3417(-46);
        class197.method1180(arg0 ^ 0xFFFFA842);
        class424.method2650(-10114);
        class751.method4188(94);
        class661.method3764((byte) -73);
        class368.method2145((byte) 27);
        class675.method3842(1);
        class389.method2402(true);
        class568.method3306((byte) -53);
        class562.method3278(false);
        class652.method3703((byte) 75);
        class252.method1505(arg0 - 15540);
        class730.method4073(-105);
        class280.method1682((byte) -125);
        class412.method2525(false);
        class167.method1040((byte) -76);
        class204.method1227((byte) 86);
        class200.method1210(false);
        class605.method3436(69);
        class757.method4207((byte) -93);
        class429.method2689(1);
        class66.method493((byte) 97);
        class25.method122((byte) 104);
        class154.method943(arg0 ^ 0xFFFFC377);
        class345.method2057(9);
        class353.method2085(arg0 ^ 0xFFFF861C);
        class310.method1846((byte) -7);
        class316.method1896(24);
        class260.method1553(1);
        class278.method1664(-24494);
        class326.method1942(46);
        class431.method2712(1);
        class59.method445(127);
        class157.method968((byte) 64);
        class534.method3135(arg0 ^ 0xFFFFC35B);
        class756.method4201(false);
        class399.method2443((byte) 95);
        class80.method563(arg0 ^ 0x3CF3);
        class161.method996(arg0 - 15601);
        class688.method3894(9277);
        class556.method3262(arg0 ^ 0x3C82);
        class375.method2186(arg0 ^ 0xFFFFC30D);
        class397.method2431(15214);
        class9.method41((byte) -125);
        class650.method3695(-84);
        class254.method1514((byte) -119);
        class503.method2983(-31398);
        class305.method1833((byte) 117);
        class673.method3837(arg0 - 15601);
        class10.method43(-1025);
        class524.method3075(-30209);
        class41.method247(124);
        class250.method1499(false);
        class494.method2955(arg0 ^ 0x1546);
        class261.method1570(-1236084768);
        class266.method1599(31975);
        class485.method2929(0);
        class413.method2527((byte) -63);
        class535.method3145((byte) 88);
        class713.method3988((byte) -100);
        class163.method1008(116);
        class340.method2024((byte) 60);
        class361.method2120((byte) 64);
        class233.method1370(true);
        class24.method107(-7820);
        class748.method4154((byte) 115);
        class590.method3378(126);
        class133.method851();
        class94.method634(arg0 ^ 0xFFFFCD75);
        class104.method717(false);
        class501.method2973(93);
        class615.method3492((byte) -96);
        class698.method3922((byte) 52);
        class315.method1878((byte) 97);
        class370.method2149((byte) 99);
        class451.method2776(17);
        class232.method1344(true);
        class207.method1233(100);
        class593.method3389(121);
        class557.method3270((byte) -86);
        class489.method2943(false);
        class463.method2816(true);
        class586.method3364((byte) 57);
        class541.method3183(arg0 - 15718);
        class242.method1417(30203);
        class174.method1078(72);
        class564.method3285((byte) -1);
        class656.method3738();
        class727.method4053((byte) -128);
        class209.method1246(17390);
        class743.method4136(false);
        class189.method1156((byte) 115);
        class537.method3157(-128);
        class635.method3644(-118);
        class206.method1231((byte) 95);
        class56.method307(true);
        class686.method3883(-9580);
        class388.method2396(0);
        class219.method1283(true);
        class710.method3970((byte) 27);
        class547.method3220(-31754);
        class642.method3658(arg0 - 30996);
        class745.method4147(-81);
        class257.method1532();
        class255.method1518(80);
        class186.method1147((byte) -126);
        class158.method973(arg0 - 15606);
        class70.method518((byte) 78);
        class754.method4194(0);
        class372.method2163(-121);
        class215.method1263(0);
        class522.method3065(0);
        class228.method1315((byte) -64);
        class536.method3150();
        class256.method1526(-92);
        class279.method1680(0);
        class560.method3275(62);
        class371.method2160(arg0 - 15593);
        class622.method3557(106);
        class85.method596((byte) 57);
        class32.method157(false);
        class459.method2806(true);
        class141.method886(true);
        class614.method3472(3);
        class188.method1155((byte) -104);
        class492.method2954((byte) 65);
        class577.method3332(0);
        class182.method1125(arg0 ^ 0xFFFFC32B);
        class734.method4088((byte) -68);
        class731.method4074();
        class555.method3257(0);
        class88.method610(-9643);
        class677.method3846();
        class552.method3239(-16711936);
        class275.method1633((byte) -109);
        class342.method2029(86);
        class76.method546(false);
        class755.method4196(107);
        class702.method3941(-71);
        class376.method2190(0);
        class571.method3320();
        class98.method687((byte) 104);
        class559.method3271(99);
        class350.method2075((byte) -109);
        class373.method2170(2);
        class300.method1775(-71);
        class162.method1003(-119);
        class703.method3947(arg0 ^ 0xFFFFC30D);
        class284.method1698((byte) 115);
        class680.method3858((byte) 125);
        class621.method3554(-100);
        class742.method4132(4);
        class170.method1061(-35);
        class40.method242(false);
        class648.method3692(10626);
        class270.method1609((byte) 98);
        class175.method1083(arg0 ^ 0xFFFF9147);
        class453.method2784(arg0 ^ 0xFFFFC30F);
        class265.method1597((byte) 83);
        class616.method3493(false);
        class223.method1296(false);
        class408.method2511(23628);
        class99.method689(-6410);
        class327.method1957(true);
        class709.method3966((byte) -116);
        class68.method497((byte) 74);
        class640.method3653(false);
        class723.method4028(-128);
        class332.method1986(2715);
        class491.method2949(-1);
        class512.method3030((byte) 64);
        class341.method2028((byte) -70);
        class343.method2038(arg0 ^ 0xFFFFC30F);
        class178.method1099((byte) 55);
        class441.method2748(-13964);
        class240.method1413(14);
        class477.method2873(-1);
        class599.method3410(false);
        class208.method1240(true);
        class479.method2881(17369);
        class325.method1937(6145);
        class484.method2922((byte) 127);
        class626.method3589(arg0 ^ 0x3CF0);
        class663.method3768(arg0 - 11146);
        class190.method1157((byte) 92);
        class511.method3020(arg0 - 40474);
        class136.method872(13154);
        class657.method3747(25);
        class724.method4031(false);
        class585.method3362(124);
        class324.method1931(105);
        class563.method3281(11);
        class123.method793(false);
        class298.method1767(8);
        class646.method3674(49);
        class633.method3628(91);
        class184.method1144(126);
        class128.method810(2);
        class12.method54(arg0 + 2329);
        class464.method2824(arg0 - 10782);
        class142.method889(47);
        class391.method2407(false);
        class322.method1924(-15436);
        class395.method2421((byte) -7);
        class515.method3038((byte) 29);
        class78.method551(15142);
        class211.method1252((byte) -25);
        class229.method1325(-23);
        class457.method2798((byte) 117);
        class13.method63((byte) 87);
        class528.method3097();
        class510.method3013(256);
        class452.method2782((byte) -72);
        class447.method2768(arg0 - 46349);
        class221.method1288(-28224);
        class283.method1693(false);
        class230.method1334(255);
        class465.method2828(512);
        class578.method3336(-102);
        class65.method488((byte) 10);
        class337.method2001((byte) 75);
        class566.method3295(arg0 ^ 0x3CC6);
        class551.method3232(1);
        class96.method682(-123);
        class475.method2856(true);
        class173.method1073((byte) 97);
        class732.method4086((byte) -114);
        class437.method2723();
        class655.method3717(0);
        class587.method3368();
        class83.method581();
        class111.method749(-16379);
        class582.method3348(2);
        class499.method2968();
        class145.method901((byte) -111);
        class461.method2811((byte) -90);
        class64.method482(arg0 - 31909);
        class634.method3639((byte) 79);
        class701.method3938(118);
        class124.method795(18666);
        class659.method3754(arg0 ^ 0xFFFF8EB7);
        class34.method159(arg0 - 15598);
        class3.method8(true);
        class598.method3405((byte) 74);
        class591.method3382(-15080);
        class201.method1214(-57);
        class120.method778(0);
        class135.method866(arg0 ^ arg0);
        class271.method1615(-1);
        class450.method2775(true);
        class469.method2836(58);
        class619.method3532(arg0 ^ 0x3CF0);
        class63.method476();
        class198.method1189(arg0 ^ 0x24);
        class336.method1999(-1014569436);
        class643.method3664(95);
        class570.method3309(false);
        class676.method3844(true);
        class119.method773(true);
        class11.method48(arg0 - 15599);
        class89.method614(false);
        class90.method615((byte) -18);
        class567.method3304(2);
        class27.method133(0);
        class313.method1865(arg0 ^ 0xFFFFC379);
        class293.method1743((byte) -4);
        class52.method299(arg0 - 15485);
        class36.method164(7979);
        class519.method3048(12905);
        class115.method762((byte) 119);
        class462.method2813(0);
        class421.method2639((byte) -45);
        class417.method2549((byte) -42);
        class331.method1982(0);
        class382.method2350(1);
        class169.method1051((byte) -126);
        class406.method2501(-80);
        class624.method3574(-58);
        class712.method3983(-126);
        class286.method1706(0);
        class720.method4015(arg0 ^ 0xFFFFC354);
        class608.method3446(arg0 ^ 0x3CF0);
        class238.method1405((byte) 25);
        class704.method3954(false);
        class685.method3877(false);
        class351.method2081(0);
        class467.method2830(-30545);
        class687.method3887((byte) -65);
        class309.method1843(-20675);
        class427.method2671((byte) -16);
        class352.method2084(false);
        class253.method1506((byte) 112);
        class384.method2385(-1);
        class378.method2326((byte) -70);
        class746.method4148(-127);
        class180.method1121(-20526);
        class132.method830((byte) 115);
        class272.method1616(200);
        class529.method3105((byte) 93);
        class185.method1145(false);
        class231.method1336(8220);
        class166.method1039(-26065);
        class597.method3403((byte) -124);
        class653.method3706(arg0 ^ 0xB462);
        class669.method3798();
        class628.method3600(true);
        class4.method15(3594);
        class147.method918((byte) 70);
        class109.method746(-4097);
        class518.method3043(5882);
        class436.method2721((byte) 126);
        class35.method162(12);
        class750.method4178(true);
        class354.method2089(-93864889);
        class312.method1855(48);
        class2.method4(14049);
        class721.method4022(0);
        class741.method4129(0);
        class627.method3595((byte) -72);
        class235.method1392(-118);
        class75.method540(arg0 - 28876);
        class525.method3078(arg0 ^ 0xD3957C14);
        class394.method2418((byte) -71);
        class439.method2741(arg0 - 15621);
        class91.method618((byte) 127);
        class422.method2645(120);
        class572.method3324(2);
        class411.method2520(120);
        class205.method1230((byte) 127);
        class674.method3840(arg0 ^ 0x6D0);
        class107.method740((byte) 30);
        class506.method3005((byte) 46);
        class736.method4103(arg0 ^ 0xFFFFC370);
        class15.method71(2);
        class67.method495(true);
        class697.method3920(arg0 - 1722153231);
        class502.method2980(124);
        class449.method2772(39);
        class19.method88((byte) 81);
        class227.method1310((byte) 118);
        class328.method1962();
        class678.method3848(320);
        class303.method1823((byte) 38);
        class448.method2771(7554);
        class140.method884(128);
        class101.method703(32767);
        class93.method631(128);
        class603.method3421(arg0 + 7553);
        class579.method3340(0);
        class296.method1763((byte) -122);
        class660.method3761(-1978299030);
        class62.method471(true);
        class14.method67((byte) 100);
        class403.method2457((byte) -109);
        class682.method3865(-1);
        class445.method2762(true);
        class43.method250((byte) -108);
        class396.method2425(false);
        class105.method720(false);
        class291.method1732(arg0 ^ 0xFFFFC31F);
        class102.method704(121);
        class520.method3049(0);
        class496.method2959((byte) -119);
        class632.method3627(true);
        class480.method2890(-65534);
        class360.method2117(120);
        class5.method19(false);
        class472.method2849((byte) -15);
        class683.method3870(-28);
        class681.method3862(1);
        class707.method3961((byte) 98);
        class23.method103(-56);
        class594.method3393((byte) 39);
        class708.method3964(false);
        class323.method1928(1663338224);
        class600.method3411(arg0 - 15599);
        class299.method1768((byte) 125);
        class97.method684(-14073);
        class443.method2751((byte) -128);
        class22.method101(arg0 - 33022);
        class127.method809((byte) 31);
        class30.method152(121);
        class625.method3588(arg0 - 15480);
        class222.method1289(10);
        class726.method4039((byte) -80);
        class471.method2846(false);
        class159.method980((byte) 127);
        class523.method3071((byte) -110);
        class29.method149((byte) 110);
        class584.method3353(-55);
        class112.method752(1);
        class125.method798((byte) 115);
        class7.method29(957);
        class226.method1307((byte) 66);
        class738.method4114((byte) -53);
        class262.method1580(-1498078175);
        class435.method2716((byte) -105);
        class220.method1286(arg0 - 15668);
        class164.method1014(-126);
        class37.method167((byte) 103);
        class87.method602(109);
        class606.method3441(arg0 ^ 0xFFFFC2F0);
        class542.method3185(17986);
        class82.method575((byte) 101);
        class288.method1714(-4387);
        class740.method4123(arg0 - 15573);
        class637.method3649(104);
        class733.method4087(107);
        class574.method3328(-54);
        class203.method1225(12881);
        class644.method3667(arg0 - 15602);
        class274.method1622((byte) 31);
        class6.method23((byte) 62);
        class595.method3396((byte) -91);
        class314.method1870((byte) 115);
        class550.method3228((byte) -67);
        class168.method1042(arg0 - 15477);
        class592.method3387(false);
        class38.method184((byte) 21);
        class114.method756(arg0 ^ 0xF970);
        class1.method1((byte) 126);
        class456.method2797((byte) 43);
        class667.method3792((byte) -85);
        class108.method743((byte) 67);
        class237.method1401(true);
        class74.method537(256);
        class672.method3835(-128);
        class385.method2390((byte) 33);
        class177.method1092(0);
        class649.method3693(arg0 + 155);
        class410.method2515((byte) -103);
        class267.method1601((byte) -119);
        class153.method941(8);
        class248.method1496((byte) -96);
        class139.method877((byte) 105);
        class103.method714(646);
        class181.method1123(-116);
        class565.method3289(arg0 - 15600);
        class348.method2072((byte) -28);
        class458.method2804((byte) -119);
        class251.method1501((byte) 73);
        class294.method1746((byte) 59);
        class654.method3708(-8369);
        class126.method805((byte) 104);
        class44.method257(-4576);
        class176.method1085((byte) 72);
        class217.method1270(false);
        class538.method3159((byte) 101);
        class514.method3036((byte) -31);
        class638.method3651(arg0 + 9575);
        class247.method1494(arg0 + 1724771164);
        class236.method1398(-817583739);
        if (class414.field5666) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltp;)Z", line = 2746)
    public static final boolean method1788(class532 arg0) {
        if (class19.field164) {
            if (method1779(arg0).field10498 != 0) {
                return false;
            }
            if (arg0.field7543 == 0) {
                return false;
            }
        }
        return arg0.field7648;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2760)
    private final void method1789(int arg0) {
        field3746++;
        if (class392.field5397 == 14) {
            return;
        }
        class392.field5398++;
        if (class392.field5398 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class6.field42 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class353.field4534.setSeed((long) class6.field42);
        }
        if (class392.field5398 % 50 == 0) {
            class664.field9451 = class148.field1649;
            class148.field1649 = 0;
            class661.field9437 = class78.field820;
            class78.field820 = 0;
        }
        this.method1784(252);
        if (class324.field4141 != null) {
            class324.field4141.method1972(-14707);
        }
        class262.method1577(-18667);
        class484.method2923((byte) 22);
        class375.field4818.method1656((byte) 112);
        class353.field4537.method701(6971);
        if (class275.field3370 != null) {
            class275.field3370.method415((int) class652.method3700(arg0 + 30840));
        }
        class442.method2750(103);
        class183.field2202 = 0;
        class757.field10550 = 0;
        for (class426 var3 = class375.field4818.method1658(-14387); var3 != null; var3 = class375.field4818.method1658(-14387)) {
            int var6 = var3.method2513(115);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2514((byte) -81);
                if (class287.method1708(2) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class555.method3256(0)) {
                        class256.method1523(6424);
                    } else {
                        class646.method3684(arg0 ^ 0x7818);
                    }
                } else if (class183.field2202 < 128) {
                    class266.field3307[class183.field2202] = var3;
                    class183.field2202++;
                }
            } else if (var6 == 0 && class757.field10550 < 75) {
                class422.field6148[class757.field10550] = var3;
                class757.field10550++;
            }
        }
        class381.field5214 = 0;
        for (class73 var4 = class353.field4537.method695(false); var4 != null; var4 = class353.field4537.method695(false)) {
            int var5 = var4.method532(42);
            if (var5 == -1) {
                class154.field1693.method1721((byte) 111, var4);
            } else if (var5 == 6) {
                class381.field5214 += var4.method533(arg0 + 30740);
            } else if (class2.method6(var5, false)) {
                class578.field8170.method1721((byte) 109, var4);
                if (class578.field8170.method1727(8) > 10) {
                    class578.field8170.method1729(662);
                }
            }
        }
        if (class555.method3256(0)) {
            class505.method3004(101);
        }
        if (class654.method3709(class392.field5397, 127)) {
            class533.method3129(-121);
            class310.method1847(arg0 ^ 0xFFFF8787);
        } else if (class300.method1771(-3163, class392.field5397)) {
            class685.method3881(1);
        }
        if (class262.method1575(class392.field5397, 6) && !class300.method1771(-3163, class392.field5397)) {
            this.method1783((byte) -87);
            class13.method59(arg0 ^ 0x7879);
            class724.method4032(arg0 ^ 0xFFFF87E5);
        } else if (class100.method700((byte) 8, class392.field5397) && !class300.method1771(-3163, class392.field5397)) {
            this.method1783((byte) -87);
            class724.method4032(arg0 + 30936);
        } else if (class392.field5397 == 12) {
            class724.method4032(112);
        } else if (class28.method135(-752, class392.field5397) && !class300.method1771(-3163, class392.field5397)) {
            class681.method3861((byte) 56);
        } else if (class392.field5397 == 13) {
            class724.method4032(126);
            if (class122.field1266 != -3 && class122.field1266 != 2 && class122.field1266 != 15) {
                class7.method25(false, (byte) 58);
            }
        }
        class557.method3267(class275.field3370, (byte) 120);
        class578.field8170.method1729(arg0 ^ 0xFFFF8511);
        if (arg0 != -30841) {
            main(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 2931)
    private final void method1790(byte arg0, int arg1) {
        class312.field3864 = null;
        class607.field8625 = 0;
        if (arg0 == 125) {
            class227.field2592.field4381++;
            field3736++;
            class698.field9822 = null;
            class227.field2592.field4382 = arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2949)
    public static final void method1791(int arg0) {
        int var1 = class585.field8256;
        int[] var2 = class399.field5459;
        for (int var3 = 0; var3 < class302.field3784 + var1; var3++) {
            class504 var4;
            if (var3 < var1) {
                var4 = class75.field792[var2[var3]];
            } else {
                var4 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var3 - var1])).field1661;
            }
            if (var4.field4628 == arg0 && var4.field7123 >= 0) {
                int var5 = var4.method1128(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4635 & 0x1FF) != 0 || (var4.field4629 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field4635 & 0x1FF) != 256 || (var4.field4629 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4635 >> 9;
                    int var7 = var4.field4629 >> 9;
                    if (var4.field7123 > class620.field8883[var6][var7]) {
                        class620.field8883[var6][var7] = var4.field7123;
                        class140.field1582[var6][var7] = 1;
                    } else if (class620.field8883[var6][var7] == var4.field7123) {
                        var10002 = class140.field1582[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field4635 - var8 >> 9;
                    int var10 = var4.field4629 - var8 >> 9;
                    int var11 = var4.field4635 + var8 >> 9;
                    int var12 = var4.field4629 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field7123 > class620.field8883[var13][var14]) {
                                class620.field8883[var13][var14] = var4.field7123;
                                class140.field1582[var13][var14] = 1;
                            } else if (class620.field8883[var13][var14] == var4.field7123) {
                                var10002 = class140.field1582[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 3047)
    public static final void method1792() {
        int var0 = class585.field8256;
        int[] var1 = class399.field5459;
        int var2 = class654.field9334.field9878.method3748(51);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class183 var14 = class75.field792[var1[var4]];
            if (!var14.method1138(413252706)) {
                var14.field7123 = -1;
            } else if (var14.field2184) {
                var14.field7123 = -1;
            } else {
                var14.method1069(98);
                if (var14.field4395 >= 0 && var14.field4387 >= 0 && var14.field4390 < class489.field6976 && var14.field4402 < class153.field1677) {
                    var14.field2193 = var14.field7122 ? var3 : false;
                    if (class90.field937 == var14) {
                        var14.field7123 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field7108) {
                            var15++;
                        }
                        if (var14.field7180 > class392.field5398) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method1128(-1) << 2);
                        if (var14.field2176) {
                            var16 += 512;
                        } else {
                            if (class524.field7483 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field7123 = var16 + 1;
                    }
                } else {
                    var14.field7123 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class302.field3784; var5++) {
            class197 var11 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var5])).field1661;
            if (var11.method1178(413252706) && var11.field2293.method1944(class722.field10125, -1)) {
                var11.method1069(50);
                if (var11.field4395 >= 0 && var11.field4387 >= 0 && var11.field4390 < class489.field6976 && var11.field4402 < class153.field1677) {
                    int var12 = 0;
                    if (!var11.field7108) {
                        var12++;
                    }
                    if (var11.field7180 > class392.field5398) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method1128(-1) << 2);
                    if (class524.field7483 == 0) {
                        if (var11.field2293.field4161) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class524.field7483 == 1) {
                        if (var11.field2293.field4161) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field2293.field4214) {
                        var13 += 1024;
                    } else if (!var11.field2293.field4194) {
                        var13 += 256;
                    }
                    var11.field7123 = var13 + 1;
                } else {
                    var11.field7123 = -1;
                }
            } else {
                var11.field7123 = -1;
            }
        }
        for (int var6 = 0; var6 < class115.field1203.length; var6++) {
            class210 var7 = class115.field1203[var6];
            if (var7 != null) {
                if (var7.field2471 == 1) {
                    class151 var8 = (class151) class253.field3052.method1754(false, (long) var7.field2481);
                    if (var8 != null) {
                        class197 var9 = var8.field1661;
                        if (var9.field7123 >= 0) {
                            var9.field7123 += 2048;
                        }
                    }
                } else if (var7.field2471 == 10) {
                    class183 var10 = class75.field792[var7.field2481];
                    if (var10 != null && class90.field937 != var10 && var10.field7123 >= 0) {
                        var10.field7123 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3220)
    public final void method1793(int arg0) {
        field3735++;
        if (~class654.field9334.field9850.method1512(arg0 + 25) != arg0) {
            this.method1776((byte) -69);
            return;
        }
        try {
            this.method1776((byte) -116);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class151.method936(var5.getMessage() + " (Recovered) " + this.method1797((byte) 25), var5, 72);
            class38.field432 = true;
            class627.method3597(false, 0, arg0 - 31615);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 3243)
    public static final void method1794() {
        int var0 = class585.field8256;
        int[] var1 = class399.field5459;
        int var2 = class416.field5695 ? var0 : class302.field3784 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class504 var4;
            if (var3 < var0) {
                var4 = class75.field792[var1[var3]];
            } else {
                var4 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var3 - var0])).field1661;
            }
            if (var4.field7123 >= 0) {
                int var5 = var4.method1128(-1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4635 & 0x1FF) == 0 && (var4.field4629 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field4635 & 0x1FF) == 256 && (var4.field4629 & 0x1FF) == 256) {
                    continue;
                }
                var4.field4627 = class676.method3845(var4.field4629, var4.field4635, 0, var4.field4628);
                class264.method1594(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 3284)
    public static final void method1795() {
        class709.field9996 = 0;
        for (int var0 = 0; var0 < class302.field3784; var0++) {
            class197 var1 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var0])).field1661;
            if (var1.field7108 && var1.method1130(0) != -1) {
                int var2 = (var1.method1128(-1) - 1) * 256 + 252;
                int var3 = var1.field4635 - var2 >> 9;
                int var4 = var1.field4629 - var2 >> 9;
                class504 var5 = class641.method3654(var1.field4628, var4, var3, 12487);
                if (var5 != null) {
                    int var6 = var5.field7107;
                    if (var5 instanceof class197) {
                        var6 += 2048;
                    }
                    if (var5.field7097 == 0 && var5.method1130(0) != -1) {
                        class370.field4741[class709.field9996] = var6;
                        class748.field10429[class709.field9996] = var6;
                        class709.field9996++;
                        var5.field7097++;
                    }
                    class370.field4741[class709.field9996] = var6;
                    class748.field10429[class709.field9996] = var1.field7107 + 2048;
                    class709.field9996++;
                    var5.field7097++;
                }
            }
        }
        class347.method2063(class370.field4741, 0, 0, class709.field9996 - 1, class748.field10429);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 3332)
    public final void method1796(boolean arg0) {
        if (class542.field7815) {
            class523.method3074(false);
        }
        field3733++;
        class190.method1160(60);
        if (class275.field3370 != null) {
            class275.field3370.method336(-112);
        }
        if (class370.field4740 != null) {
            class66.method491((byte) -128, class289.field3549, class370.field4740);
            class370.field4740 = null;
        }
        if (class751.field10504 != null) {
            class751.field10504.method1691(38);
            class751.field10504 = null;
        }
        class605.method3435((byte) 126);
        class227.field2592.method2019((byte) 100);
        class93.field985.method2330(24);
        if (class247.field3000 != null) {
            class247.field3000.method4105(-8063);
            class247.field3000 = null;
        }
        try {
            class289.field3557.method1591(-85);
            if (!arg0) {
                this.method1797((byte) -17);
            }
            for (int var2 = 0; var2 < 37; var2++) {
                class439.field6379[var2].method1591(-84);
            }
            class37.field421.method1591(-73);
            class737.field10304.method1591(-95);
            class120.method779(121);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;", line = 3386)
    public final String method1797(byte arg0) {
        field3742++;
        String var2 = null;
        try {
            var2 = "[1)" + class464.field6624 + "," + class181.field2144 + "," + class489.field6976 + "," + class153.field1677 + "|";
            if (class90.field937 != null) {
                var2 = var2 + "2)" + class122.field1278 + "," + (class90.field937.field7187[0] + class464.field6624) + "," + (class90.field937.field7193[0] + class181.field2144) + "|";
            }
            var2 = var2 + "3)" + class654.field9334.field9850.method1512(arg0 ^ 0xFFFFFF9A) + "|4)" + class654.field9334.field9866.method3133(-127) + "|5)" + class735.method4098(false) + "|6)" + class705.field9926 + "," + class476.field6777 + "|";
            var2 = var2 + "7)" + class654.field9334.field9844.method900(81) + "|";
            var2 = var2 + "8)" + class654.field9334.field9856.method2185(18) + "|";
            var2 = var2 + "9)" + class654.field9334.field9837.method1829(43) + "|";
            var2 = var2 + "10)" + class654.field9334.field9836.method466(89) + "|";
            var2 = var2 + "11)" + class654.field9334.field9826.method4205(arg0 - 151) + "|";
            var2 = var2 + "12)" + class654.field9334.field9858.method2982(-124) + "|";
            var2 = var2 + "13)" + class649.field9279 + "|";
            var2 = var2 + "14)" + class392.field5397;
            if (class463.field6618 != null) {
                var2 = var2 + "|15)" + class463.field6618.field2979;
            }
            try {
                if (class654.field9334.field9850.method1512(20) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3749 == null ? (field3749 = method1800("client")) : field3749).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
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
            } catch (Throwable var15) {
            }
            if (arg0 != 25) {
                field3743 = null;
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3471)
    public static final void method1798() {
        for (int var0 = 0; var0 < class489.field6976; var0++) {
            int[] var1 = class620.field8883[var0];
            for (int var2 = 0; var2 < class153.field1677; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 3490)
    public static void method1799(boolean arg0) {
        if (!arg0) {
            field3743 = null;
        }
    }
}
