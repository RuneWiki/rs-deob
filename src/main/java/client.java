import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
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
public class client extends class429 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lcba;")
    public static class471 field3456 = new class471(43, 3);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Lml;")
    public static class325 field3473 = new class325(10, 6);

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3474 = 1;

    @OriginalMember(owner = "client!client", name = "B", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3471;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field3475;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field3476;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lsa;")
    public static class174[] field3472;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmc;)Lpf;")
    public static final class500 method1534(class114 arg0) {
        class500 var1 = (class500) class259.field3603.method1242(0, ((long) arg0.field1810 << 32) + (long) arg0.field1749);
        return var1 == null ? arg0.field1753 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1535(byte arg0) {
        field3469++;
        if (class440.field6254 == 13) {
            return;
        }
        long var2 = class487.method2831((byte) 124) / 1000000L - class200.field2816;
        class200.field2816 = class487.method2831((byte) 119) / 1000000L;
        boolean var4 = class553.method3139(true);
        if (var4 && class144.field2229 && class209.field2952 != null) {
            class209.field2952.method2241(13670);
        }
        if (class187.method1163(class440.field6254, (byte) -80)) {
            if (class303.field4138 != 0L && class303.field4138 < class488.method2835(arg0 + 30213)) {
                class512.method2963(class486.method2827(106), false, class491.field6875.field3355, -4, class491.field6875.field3379);
            } else if (!class69.field1165.method1346() && class640.field9316) {
                class91.method665((byte) 114);
            }
        }
        if (class87.field1383 == null) {
            Container var5;
            if (class233.field3284 == null) {
                var5 = class500.field6968.field3975;
            } else {
                var5 = class233.field3284;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class233.field3284 == var5) {
                Insets var8 = class233.field3284.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class342.field4611 != var6 || class178.field2543 != var7) {
                if (class69.field1165 == null || class69.field1165.method1273()) {
                    class120.method840((byte) 41);
                } else {
                    class178.field2543 = var7;
                    class342.field4611 = var6;
                }
                class303.field4138 = class488.method2835(30160) + 500L;
            }
        }
        if (class87.field1383 != null && !class408.field5783 && class187.method1163(class440.field6254, (byte) -34)) {
            class512.method2963(class491.field6875.field3359, false, -1, arg0 ^ 0x37, -1);
        }
        boolean var9 = false;
        if (class190.field2693) {
            var9 = true;
            class190.field2693 = false;
        }
        if (var9) {
            class312.method1950(false);
        }
        if (class69.field1165 != null && class69.field1165.method1346() || class486.method2827(38) != 1) {
            class40.method413(-101);
        }
        if (class440.field6254 == 0) {
            class559.method3188(class6.field79, class342.field4604, class564.field7809[class56.field1007], arg0 + 145, class1.field19[class56.field1007], var9, class386.field5182[class56.field1007]);
        } else if (class440.field6254 == 1) {
            class194.method1203(class69.field1165, class515.field7246, (byte) 17, var9 | class69.field1165.method1346(), class564.field7809[class56.field1007].getRGB(), class386.field5182[class56.field1007].getRGB(), class1.field19[class56.field1007].getRGB());
        } else if (class213.method1390(0, class440.field6254)) {
            class533.method3065((byte) 122);
        } else if (class522.method3014(class440.field6254, (byte) -112)) {
            class533.method3065((byte) 121);
        } else if (class51.method485((byte) -35, class440.field6254)) {
            if (class296.field4065 == 1) {
                if (class457.field6446 > class365.field4969) {
                    class365.field4969 = class457.field6446;
                }
                int var11 = (class365.field4969 - class457.field6446) * 50 / class365.field4969;
                class639.method3699(class443.field6309.method739(class173.field2491, 57) + "<br>(" + var11 + "%)", true, class206.field2905, (byte) 82);
            } else if (class296.field4065 == 2) {
                if (class226.field3242 < class553.field7629) {
                    class226.field3242 = class553.field7629;
                }
                int var10 = (class226.field3242 - class553.field7629) * 50 / class226.field3242 + 50;
                class639.method3699(class443.field6309.method739(class173.field2491, arg0 ^ 0x7A) + "<br>(" + var10 + "%)", true, class206.field2905, (byte) 82);
            } else {
                class639.method3699(class443.field6309.method739(class173.field2491, 82), true, class206.field2905, (byte) 82);
            }
        } else if (class440.field6254 == 9) {
            class459.method2685(var2, 4);
        } else if (class440.field6254 == 12) {
            class639.method3699(class280.field3888.method739(class173.field2491, 79) + "<br>" + class140.field2182.method739(class173.field2491, arg0 + 176), true, class206.field2905, (byte) 82);
        }
        if (arg0 != -53) {
            return;
        }
        if (class597.field8622 == 3) {
            for (int var12 = 0; var12 < class628.field9187; var12++) {
                Rectangle var13 = class564.field7815[var12];
                if (class201.field2818[var12]) {
                    class69.field1165.method1368(var13.y, var13.width, var13.height, -1996553985, var13.x, (byte) -16);
                } else if (class18.field226[var12]) {
                    class69.field1165.method1368(var13.y, var13.width, var13.height, -1996554240, var13.x, (byte) -16);
                }
            }
        }
        if (class521.method3010(arg0 ^ 0xFFFFFFC3)) {
            class336.method2041(class69.field1165, -124);
        }
        if (class187.method1163(class440.field6254, (byte) -47) && class597.field8622 == 0 && class486.method2827(115) == 1 && !var9 && class288.field3976.equals("1.1")) {
            int var16 = 0;
            for (int var17 = 0; var17 < class628.field9187; var17++) {
                if (class18.field226[var17]) {
                    class18.field226[var17] = false;
                    class427.field6065[var16++] = class564.field7815[var17];
                }
            }
            try {
                class69.field1165.method1327(class427.field6065, var16);
            } catch (class589 var18) {
            }
        } else if (class440.field6254 != 0) {
            for (int var14 = 0; var14 < class628.field9187; var14++) {
                class18.field226[var14] = false;
            }
            try {
                class69.field1165.method1307();
            } catch (class589 var19) {
                class235.method1474(var19, var19.getMessage() + " (Recovered) " + this.method1553(-90), (byte) 115);
                class452.method2658(arg0 ^ 0xFFFFFFCC, 0);
            }
        }
        if (class491.field6875.field3373 == 0) {
            class21.method220(0, 15L);
        } else if (class491.field6875.field3373 == 1) {
            class21.method220(0, 10L);
        } else if (class491.field6875.field3373 == 2) {
            class21.method220(0, 5L);
        } else if (class491.field6875.field3373 == 3) {
            class21.method220(0, 2L);
        }
        if (class637.field9281) {
            class14.method171((byte) 39);
        }
        if (class491.field6875.field3380 && class440.field6254 == 2 && class56.field1005 != -1) {
            class491.field6875.field3380 = false;
            class491.field6875.method2607((byte) -112, class500.field6968);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class28.method307(-13880, "Argument count");
            }
            class504.field7014 = new class189();
            class504.field7014.field2680 = Integer.parseInt(arg0[0]);
            class332.field4446 = new class189();
            class332.field4446.field2680 = Integer.parseInt(arg0[1]);
            class31.field506 = new class189();
            class31.field506.field2680 = Integer.parseInt(arg0[2]);
            class53.field988 = class270.field3766;
            if (arg0[3].equals("live")) {
                class173.field2494 = class420.field5902;
            } else if (arg0[3].equals("rc")) {
                class173.field2494 = class452.field6377;
            } else if (arg0[3].equals("wip")) {
                class173.field2494 = class269.field3760;
            } else {
                class28.method307(-13880, "modewhat");
            }
            class173.field2491 = class186.method1159(arg0[4], (byte) -124);
            if (class173.field2491 == -1) {
                if (arg0[4].equals("english")) {
                    class173.field2491 = 0;
                } else if (arg0[4].equals("german")) {
                    class173.field2491 = 1;
                } else {
                    class28.method307(-13880, "language");
                }
            }
            class589.field8420 = false;
            class623.field8997 = false;
            if (arg0[5].equals("game0")) {
                class163.field2363 = class245.field3415;
            } else if (arg0[5].equals("game1")) {
                class163.field2363 = class37.field767;
            } else {
                class28.method307(-13880, "game");
            }
            class212.field2999 = false;
            class224.field3218 = 0;
            class310.field4180 = "";
            class449.field6358 = true;
            class310.field4179 = true;
            class537.field7519 = 0;
            class517.field7259 = 0;
            class68.field1153 = null;
            class56.field1007 = class163.field2363.field1720;
            class597.field8629 = false;
            client var1 = new client();
            class313.field4221 = var1;
            var1.method2546(1024, false, (byte) 73, 32, class173.field2494.method3718((byte) -94) + 32, 606, class163.field2363.field1717, 768);
            class233.field3284.setLocation(40, 40);
        } catch (Exception var3) {
            class235.method1474(var3, null, (byte) 115);
        }
        field3467++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field3456 = null;
        if (arg0 == -62) {
            field3473 = null;
            field3472 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method1537(int arg0) {
        field3453++;
        if (~class103.field1570 != arg0) {
            this.method1535((byte) -53);
            return;
        }
        try {
            this.method1535((byte) -53);
        } catch (Throwable var3) {
            class235.method1474(var3, var3.getMessage() + " (Recovered) " + this.method1553(-72), (byte) 115);
            class452.method2658(arg0 + 10, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1538(int arg0) {
        int var1 = class559.field7738;
        int[] var2 = class358.field4825;
        for (int var3 = 0; var3 < class480.field6764 + var1; var3++) {
            class33 var4;
            if (var3 < var1) {
                var4 = class349.field4696[var2[var3]];
            } else {
                var4 = ((class576) class278.field3837.method1242(0, (long) class586.field8386[var3 - var1])).field7929;
            }
            if (var4.field6035 == arg0 && var4.field588 >= 0) {
                int var5 = var4.method337(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6037 & 0x7F) != 0 || (var4.field6029 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6037 & 0x7F) != 64 || (var4.field6029 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6037 >> 7;
                    int var7 = var4.field6029 >> 7;
                    if (var4.field588 > class280.field3890[var6][var7]) {
                        class280.field3890[var6][var7] = var4.field588;
                        class264.field3691[var6][var7] = 1;
                    } else if (class280.field3890[var6][var7] == var4.field588) {
                        var10002 = class264.field3691[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6037 - var8 >> 7;
                    int var10 = var4.field6029 - var8 >> 7;
                    int var11 = var4.field6037 + var8 >> 7;
                    int var12 = var4.field6029 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field588 > class280.field3890[var13][var14]) {
                                class280.field3890[var13][var14] = var4.field588;
                                class264.field3691[var13][var14] = 1;
                            } else if (class280.field3890[var13][var14] == var4.field588) {
                                var10002 = class264.field3691[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        int var1 = class559.field7738;
        int[] var2 = class358.field4825;
        int var3 = class434.field6191 ? var1 : class480.field6764 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class33 var5;
            if (var4 < var1) {
                var5 = class349.field4696[var2[var4]];
            } else {
                var5 = ((class576) class278.field3837.method1242(0, (long) class586.field8386[var4 - var1])).field7929;
            }
            if (var5.field6035 == arg0) {
                var5.field582 = 0;
                if (var5.field588 < 0) {
                    var5.field558 = false;
                } else {
                    int var6 = var5.method337(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6037 & 0x7F) != 0 || (var5.field6029 & 0x7F) != 0) {
                            var5.field558 = false;
                            continue;
                        }
                    } else if ((var5.field6037 & 0x7F) != 64 || (var5.field6029 & 0x7F) != 64) {
                        var5.field558 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6037 >> 7;
                        int var8 = var5.field6029 >> 7;
                        if (class280.field3890[var7][var8] != var5.field588) {
                            var5.field558 = true;
                            continue;
                        }
                        if (class264.field3691[var7][var8] > 1) {
                            var10002 = class264.field3691[var7][var8]--;
                            var5.field558 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6037 - var9 >> 7;
                        int var11 = var5.field6029 - var9 >> 7;
                        int var12 = var5.field6037 + var9 >> 7;
                        int var13 = var5.field6029 + var9 >> 7;
                        if (!class526.method3031(-2, var13, var12, var5.field588, var10, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class280.field3890[var14][var15] == var5.field588) {
                                        var10002 = class264.field3691[var14][var15]--;
                                    }
                                }
                            }
                            var5.field558 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class188 && var5.field615 != null && class405.field5763 >= var5.field615.field4478 && class405.field5763 < var5.field615.field4488) {
                        ((class188) var5).field2658 = false;
                    }
                    var5.field558 = false;
                    var5.field6042 = class183.method1144(91, var5.field6037, var5.field6029, var5.field6035);
                    class108.method761(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmc;)Lmc;")
    public static final class114 method1540(class114 arg0) {
        int var1 = method1534(arg0).method2899((byte) -44);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class612.method3584(arg0.field1897, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1541() {
        class99.field1511 = 0;
        for (int var0 = 0; var0 < class480.field6764; var0++) {
            class109 var1 = ((class576) class278.field3837.method1242(0, (long) class586.field8386[var0])).field7929;
            if (var1.field558 && var1.method336(-2102190848) != -1) {
                int var2 = (var1.method337(0) - 1) * 64 + 60;
                int var3 = var1.field6037 - var2 >> 7;
                int var4 = var1.field6029 - var2 >> 7;
                class33 var5 = class531.method3057(var4, (byte) -73, var1.field6035, var3);
                if (var5 != null) {
                    int var6 = var5.field607;
                    if (var5 instanceof class109) {
                        var6 += 2048;
                    }
                    if (var5.field582 == 0 && var5.method336(-2102190848) != -1) {
                        class580.field7975[class99.field1511] = var6;
                        class318.field4314[class99.field1511] = var6;
                        class99.field1511++;
                        var5.field582++;
                    }
                    class580.field7975[class99.field1511] = var6;
                    class318.field4314[class99.field1511] = var1.field607 + 2048;
                    class99.field1511++;
                    var5.field582++;
                }
            }
        }
        class32.method331(class99.field1511 - 1, 0, 2, class318.field4314, class580.field7975);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1542(byte arg0) {
        field3466++;
        if (class440.field6254 == 13) {
            return;
        }
        class405.field5763++;
        if (class405.field5763 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class128.field2064 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class362.field4859.setSeed((long) class128.field2064);
        }
        if (class405.field5763 % 50 == 0) {
            class302.field4128 = class436.field6200;
            class57.field1012 = class258.field3602;
            class436.field6200 = 0;
            class258.field3602 = 0;
        }
        this.method1557(arg0 + 28);
        if (class555.field7656 != null) {
            class555.field7656.method2396(false);
        }
        class548.method3125(15327);
        class316.field4245.method2698(arg0 ^ 0x68);
        class602.field8697.method2146((byte) -125);
        if (class69.field1165 != null) {
            class69.field1165.method1362((int) class488.method2835(arg0 + 30188));
        }
        class586.method3437(4);
        class105.field1583 = 0;
        class591.field8442 = 0;
        for (class620 var3 = class316.field4245.method2695(-65); var3 != null; var3 = class316.field4245.method2695(-65)) {
            int var6 = var3.method3203(-4253);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method3201(arg0 ^ 0xFFFF8DD4);
                if (class210.method1381(true) && (var7 == '`' || var7 == '§')) {
                    if (class521.method3010(arg0 ^ 0xFFFFFFEC)) {
                        class108.method762(true);
                    } else {
                        class319.method1988(arg0 + 65);
                    }
                } else if (class105.field1583 < 128) {
                    class297.field4068[class105.field1583] = var3;
                    class105.field1583++;
                }
            } else if (var6 == 0 && class591.field8442 < 75) {
                class476.field6697[class591.field8442] = var3;
                class591.field8442++;
            }
        }
        if (arg0 != -28) {
            return;
        }
        class231.field3283 = 0;
        for (class32 var4 = class602.field8697.method2156((byte) -122); var4 != null; var4 = class602.field8697.method2156((byte) -115)) {
            int var5 = var4.method323(false);
            if (var5 == -1) {
                class91.field1421.method463(var4, -124);
            } else if (var5 == 6) {
                class231.field3283 += var4.method325(-19995);
            } else if (class53.method507(81, var5)) {
                class623.field8998.method463(var4, -95);
                if (class623.field8998.method464(false) > 10) {
                    class623.field8998.method459(3553);
                }
            }
        }
        if (class521.method3010(8)) {
            class305.method1933((byte) 29);
        }
        if (class440.field6254 == 0) {
            this.method1555((byte) -67);
            class16.method183((byte) 122);
        } else if (class440.field6254 == 1) {
            this.method1555((byte) -4);
            class16.method183((byte) 124);
        } else if (class51.method485((byte) 124, class440.field6254)) {
            class141.method934(arg0 ^ 0x1AFE);
        }
        if (class340.method2063(class440.field6254, 30645) && !class51.method485((byte) -106, class440.field6254)) {
            this.method1547(-51);
            class509.method2943((byte) -105);
            class213.method1395(100);
        } else if (class604.method3558(3, class440.field6254) && !class51.method485((byte) 124, class440.field6254)) {
            this.method1547(-51);
            class213.method1395(arg0 ^ 0xFFFFFFC5);
        } else if (class440.field6254 == 11) {
            class213.method1395(73);
        } else if (class587.method3447(class440.field6254, -28130) && !class51.method485((byte) -4, class440.field6254)) {
            class87.method652((byte) -61);
        } else if (class440.field6254 == 12) {
            class213.method1395(2);
            if (class645.field9369 != -3 && class645.field9369 != 2 && class645.field9369 != 15) {
                class368.method2208(false, false);
            }
        }
        class174.method1094(class69.field1165, true);
        class623.field8998.method459(3553);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1543(int arg0, byte[] arg1) {
        if (arg0 != 3391) {
            this.method1557(-32);
        }
        field3465++;
        class11 var3 = new class11(arg1);
        while (true) {
            int var4 = var3.method110((byte) 114);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class335.field4464 = var3.method93((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1544() {
        for (int var0 = 0; var0 < class32.field513; var0++) {
            int[] var1 = class280.field3890[var0];
            for (int var2 = 0; var2 < class611.field8786; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmc;IIIIIIIII)V")
    public static final void method1545(class114[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class114 var11 = arg0[var10];
            if (var11 != null && var11.field1897 == arg1) {
                int var12 = var11.field1767 + arg6;
                int var13 = var11.field1814 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field1880 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field1853 + var12;
                    int var19 = var11.field1769 + var13;
                    if (var11.field1880 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field1880 == 0 || var11.field1900 || method1534(var11).field6963 != 0 || class638.field9294 == var11 || class200.field2814 == var11.field1901) {
                    if (!method1554(var11)) {
                        if (class137.field2159 == var11 && class628.method3658(true, class137.field2159) != null) {
                            class480.field6766 = true;
                            class244.field3403 = var12;
                            class14.field193 = var13;
                        }
                        if (var11.field1858 || var14 < var16 && var15 < var17) {
                            if (var11.field1842 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class224 var20 = (class224) class596.field8616.method456((byte) -86); var20 != null; var20 = (class224) class596.field8616.method460((byte) 62)) {
                                    if (var20.field3209) {
                                        var20.method1117(0);
                                        var20.field3210.field1788 = false;
                                    }
                                }
                                if (class337.field4554 == 0) {
                                    class137.field2159 = null;
                                    class638.field9294 = null;
                                }
                                class557.field7711 = 0;
                                class473.field6661 = false;
                                class626.field9130 = false;
                                if (!class483.field6820) {
                                    class449.method2648((byte) -70);
                                }
                            }
                            boolean var21;
                            if (class602.field8697.method2153((byte) 126) >= var14 && class602.field8697.method2152(0) >= var15 && class602.field8697.method2153((byte) 87) < var16 && class602.field8697.method2152(0) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class493.field6904 && var21) {
                                if (var11.field1806 >= 0) {
                                    class575.field7926 = var11.field1806;
                                } else if (var11.field1842) {
                                    class575.field7926 = -1;
                                }
                            }
                            if (!class483.field6820 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class366.method2196(arg8 - var12, (byte) 116, arg9 - var13, var11);
                            }
                            boolean var22 = false;
                            if (class602.field8697.method2151((byte) 35) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class32 var24 = (class32) class623.field8998.method456((byte) -113);
                            if (var24 != null && var24.method323(false) == 0 && var24.method328((byte) -112) >= var14 && var24.method324(-5) >= var15 && var24.method328((byte) -114) < var16 && var24.method324(-5) < var17) {
                                var23 = true;
                            }
                            if (var11.field1872 != null) {
                                for (int var25 = 0; var25 < var11.field1872.length; var25++) {
                                    if (class316.field4245.method2691(var11.field1872[var25], 19521)) {
                                        if (var11.field1893 == null || class405.field5763 >= var11.field1893[var25]) {
                                            byte var26 = var11.field1775[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class316.field4245.method2691(86, 19521) && !class316.field4245.method2691(82, 19521) && !class316.field4245.method2691(81, 19521)) && ((var26 & 0x2) == 0 || class316.field4245.method2691(86, 19521)) && ((var26 & 0x1) == 0 || class316.field4245.method2691(82, 19521)) && ((var26 & 0x4) == 0 || class316.field4245.method2691(81, 19521))) {
                                                if (var25 < 10) {
                                                    class229.method1458(-1, "", var11.field1810, var25 + 1, false);
                                                } else if (var25 == 10) {
                                                    class339.method2057((byte) -123);
                                                    class500 var27 = method1534(var11);
                                                    class412.method2454(var11, var27.field6969, var27.method2897((byte) 122), -2);
                                                    class412.field5799 = class293.method1879(var11, 50);
                                                    if (class412.field5799 == null) {
                                                        class412.field5799 = "Null";
                                                    }
                                                    class494.field6922 = var11.field1824 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field1812[var25];
                                                if (var11.field1893 == null) {
                                                    var11.field1893 = new int[var11.field1872.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1893[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1893[var25] = class405.field5763 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1893 != null) {
                                        var11.field1893[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class385.method2258(var24.method324(-5) - var13, var24.method328((byte) -124) - var12, 0, var11);
                            }
                            if (class137.field2159 != null && class137.field2159 != var11 && var21 && method1534(var11).method2895(198523317)) {
                                class63.field1092 = var11;
                            }
                            if (class638.field9294 == var11) {
                                class604.field8712 = true;
                                class131.field2099 = var12;
                                class185.field2600 = var13;
                            }
                            if (var11.field1900 || var11.field1901 != 0) {
                                if (var21 && class231.field3283 != 0 && var11.field1907 != null) {
                                    class224 var29 = new class224();
                                    var29.field3209 = true;
                                    var29.field3210 = var11;
                                    var29.field3211 = class231.field3283;
                                    var29.field3207 = var11.field1907;
                                    class596.field8616.method463(var29, -109);
                                }
                                if (class137.field2159 != null || class483.field6820 || class412.field5800 != var11.field1901 && class557.field7711 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1901 != 0) {
                                    if (class13.field189 == var11.field1901 || class576.field7930 == var11.field1901) {
                                        class253.field3513 = var11;
                                        if (class538.field7520 != null) {
                                            class538.field7520.method1651(0, var11.field1769, class69.field1165);
                                        }
                                        if (class13.field189 == var11.field1901) {
                                            if (!class483.field6820 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class347.method2090(arg8, class69.field1165, false, arg9);
                                                for (class374 var30 = (class374) class526.field7389.method3150(16); var30 != null; var30 = (class374) class526.field7389.method3147(16)) {
                                                    if (arg8 >= var30.field5034 && arg8 < var30.field5036 && arg9 >= var30.field5031 && arg9 < var30.field5030) {
                                                        class449.method2648((byte) -42);
                                                        class346.method2087(var30.field5037, -1);
                                                    }
                                                }
                                            }
                                            class296.method1891((byte) -124, var12, var13, var11);
                                            continue;
                                        }
                                    }
                                    if (class200.field2814 == var11.field1901) {
                                        if (var11.method810(false, class69.field1165) == null || class634.field9270 != 0 && class634.field9270 != 3 || class483.field6820 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field1885[var32];
                                        if (var31 < var33 || var31 > var11.field1834[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field1853 / 2;
                                        int var35 = var32 - var11.field1769 / 2;
                                        int var36;
                                        if (class107.field1653 == 4) {
                                            var36 = (int) class1.field13 & 0x3FFF;
                                        } else {
                                            var36 = (int) class1.field13 + class2.field27 & 0x3FFF;
                                        }
                                        int var37 = class1.field2[var36];
                                        int var38 = class1.field7[var36];
                                        if (class107.field1653 != 4) {
                                            var37 = (class353.field4779 + 256) * var37 >> 8;
                                            var38 = (class353.field4779 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class107.field1653 == 4) {
                                            var41 = (class592.field8507 >> 7) + (var39 >> 2);
                                            var42 = (class312.field4212 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class645.field9372.method337(0) - 1) * 64;
                                            var41 = (class645.field9372.field6037 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class645.field9372.field6029 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class493.field6904 && (class226.field3238 & 0x40) != 0) {
                                            class114 var44 = class512.method2969(class608.field8768, class103.field1566, (byte) 89);
                                            if (var44 == null) {
                                                class339.method2057((byte) -100);
                                            } else {
                                                class404.method2410(" ->", var42, (byte) -120, var41, 45, var11.field1787, true, 1L, class412.field5799, class65.field1111, false);
                                            }
                                            continue;
                                        }
                                        if (class37.field767 == class163.field2363) {
                                            class404.method2410("", var42, (byte) -120, var41, 49, -1, true, 1L, class98.field1501.method739(class173.field2491, -78), -1, false);
                                        }
                                        class404.method2410("", var42, (byte) -120, var41, 5, -1, true, 1L, class510.field7143, class153.field2308, false);
                                        continue;
                                    }
                                    if (class412.field5800 == var11.field1901) {
                                        class319.field4326 = var11;
                                        if (var21) {
                                            class473.field6661 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method328((byte) -105) - var12 - var11.field1853 / 2) * 2.0D / (double) class413.field5820);
                                            int var46 = (int) (-((double) (var24.method324(-5) - var13 - var11.field1769 / 2) * 2.0D / (double) class413.field5820));
                                            int var47 = class285.field3931 + var45 + class413.field5829;
                                            int var48 = class627.field9160 + var46 + class413.field5826;
                                            class477 var49 = class133.method906(-123);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2781(var47, 383, var48, var50);
                                            if (var50 != null) {
                                                if (class316.field4245.method2691(82, 19521) && class258.field3599 > 0) {
                                                    class166.method1064(var50[1], -1601088218, var50[2], var50[0]);
                                                    continue;
                                                }
                                                class626.field9130 = true;
                                                class494.field6923 = var50[0];
                                                class35.field699 = var50[1];
                                                class316.field4249 = var50[2];
                                            }
                                            class557.field7711 = 1;
                                            class122.field1978 = false;
                                            class376.field5059 = class602.field8697.method2153((byte) 123);
                                            class94.field1453 = class602.field8697.method2152(0);
                                            continue;
                                        }
                                        if (var22 && class557.field7711 > 0) {
                                            if (class557.field7711 == 1 && (class376.field5059 != class602.field8697.method2153((byte) 77) || class94.field1453 != class602.field8697.method2152(0))) {
                                                class365.field4962 = class285.field3931;
                                                class111.field1719 = class627.field9160;
                                                class557.field7711 = 2;
                                            }
                                            if (class557.field7711 == 2) {
                                                class122.field1978 = true;
                                                class99.method707(class365.field4962 + (int) ((double) (class376.field5059 - class602.field8697.method2153((byte) 99)) * 2.0D / (double) class413.field5812), 128);
                                                class454.method2668(-1, class111.field1719 - (int) ((double) (class94.field1453 - class602.field8697.method2152(0)) * 2.0D / (double) class413.field5812));
                                            }
                                            continue;
                                        }
                                        if (class557.field7711 > 0 && !class122.field1978) {
                                            if ((class384.field5143 == 1 || class553.method3138((byte) 18)) && class210.field2958 > 2) {
                                                class31.method322(class376.field5059, class94.field1453, false);
                                            } else if (class164.method1056(34037)) {
                                                class31.method322(class376.field5059, class94.field1453, false);
                                            }
                                        }
                                        class557.field7711 = 0;
                                        continue;
                                    }
                                    if (class596.field8617 == var11.field1901) {
                                        if (var22) {
                                            class630.method3672(class602.field8697.method2152(0) - var13, var11.field1853, class602.field8697.method2153((byte) 120) - var12, var11.field1769, (byte) 126);
                                        }
                                        continue;
                                    }
                                    if (class546.field7570 == var11.field1901) {
                                        class440.method2599((byte) -9, var11, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field1801 && var23) {
                                    var11.field1801 = true;
                                    if (var11.field1818 != null) {
                                        class224 var51 = new class224();
                                        var51.field3209 = true;
                                        var51.field3210 = var11;
                                        var51.field3202 = var24.method328((byte) -128) - var12;
                                        var51.field3211 = var24.method324(-5) - var13;
                                        var51.field3207 = var11.field1818;
                                        class596.field8616.method463(var51, -124);
                                    }
                                }
                                if (var11.field1801 && var22 && var11.field1865 != null) {
                                    class224 var52 = new class224();
                                    var52.field3209 = true;
                                    var52.field3210 = var11;
                                    var52.field3202 = class602.field8697.method2153((byte) 107) - var12;
                                    var52.field3211 = class602.field8697.method2152(0) - var13;
                                    var52.field3207 = var11.field1865;
                                    class596.field8616.method463(var52, -101);
                                }
                                if (var11.field1801 && !var22) {
                                    var11.field1801 = false;
                                    if (var11.field1784 != null) {
                                        class224 var53 = new class224();
                                        var53.field3209 = true;
                                        var53.field3210 = var11;
                                        var53.field3202 = class602.field8697.method2153((byte) -96) - var12;
                                        var53.field3211 = class602.field8697.method2152(0) - var13;
                                        var53.field3207 = var11.field1784;
                                        class93.field1433.method463(var53, -101);
                                    }
                                }
                                if (var22 && var11.field1851 != null) {
                                    class224 var54 = new class224();
                                    var54.field3209 = true;
                                    var54.field3210 = var11;
                                    var54.field3202 = class602.field8697.method2153((byte) 87) - var12;
                                    var54.field3211 = class602.field8697.method2152(0) - var13;
                                    var54.field3207 = var11.field1851;
                                    class596.field8616.method463(var54, -112);
                                }
                                if (!var11.field1788 && var21) {
                                    var11.field1788 = true;
                                    if (var11.field1752 != null) {
                                        class224 var55 = new class224();
                                        var55.field3209 = true;
                                        var55.field3210 = var11;
                                        var55.field3202 = class602.field8697.method2153((byte) -42) - var12;
                                        var55.field3211 = class602.field8697.method2152(0) - var13;
                                        var55.field3207 = var11.field1752;
                                        class596.field8616.method463(var55, -127);
                                    }
                                }
                                if (var11.field1788 && var21 && var11.field1781 != null) {
                                    class224 var56 = new class224();
                                    var56.field3209 = true;
                                    var56.field3210 = var11;
                                    var56.field3202 = class602.field8697.method2153((byte) 110) - var12;
                                    var56.field3211 = class602.field8697.method2152(0) - var13;
                                    var56.field3207 = var11.field1781;
                                    class596.field8616.method463(var56, -96);
                                }
                                if (var11.field1788 && !var21) {
                                    var11.field1788 = false;
                                    if (var11.field1843 != null) {
                                        class224 var57 = new class224();
                                        var57.field3209 = true;
                                        var57.field3210 = var11;
                                        var57.field3202 = class602.field8697.method2153((byte) 126) - var12;
                                        var57.field3211 = class602.field8697.method2152(0) - var13;
                                        var57.field3207 = var11.field1843;
                                        class93.field1433.method463(var57, -122);
                                    }
                                }
                                if (var11.field1755 != null) {
                                    class224 var58 = new class224();
                                    var58.field3210 = var11;
                                    var58.field3207 = var11.field1755;
                                    class472.field6633.method463(var58, -98);
                                }
                                if (var11.field1758 != null && class554.field7641 > var11.field1887) {
                                    if (var11.field1777 == null || class554.field7641 - var11.field1887 > 32) {
                                        class224 var63 = new class224();
                                        var63.field3210 = var11;
                                        var63.field3207 = var11.field1758;
                                        class596.field8616.method463(var63, -101);
                                    } else {
                                        label693: for (int var59 = var11.field1887; var59 < class554.field7641; var59++) {
                                            int var60 = class58.field1056[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1777.length; var61++) {
                                                if (var11.field1777[var61] == var60) {
                                                    class224 var62 = new class224();
                                                    var62.field3210 = var11;
                                                    var62.field3207 = var11.field1758;
                                                    class596.field8616.method463(var62, -118);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1887 = class554.field7641;
                                }
                                if (var11.field1884 != null && class130.field2093 > var11.field1888) {
                                    if (var11.field1791 == null || class130.field2093 - var11.field1888 > 32) {
                                        class224 var68 = new class224();
                                        var68.field3210 = var11;
                                        var68.field3207 = var11.field1884;
                                        class596.field8616.method463(var68, -103);
                                    } else {
                                        label669: for (int var64 = var11.field1888; var64 < class130.field2093; var64++) {
                                            int var65 = class192.field2721[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1791.length; var66++) {
                                                if (var11.field1791[var66] == var65) {
                                                    class224 var67 = new class224();
                                                    var67.field3210 = var11;
                                                    var67.field3207 = var11.field1884;
                                                    class596.field8616.method463(var67, -122);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1888 = class130.field2093;
                                }
                                if (var11.field1852 != null && class293.field4035 > var11.field1829) {
                                    if (var11.field1875 == null || class293.field4035 - var11.field1829 > 32) {
                                        class224 var73 = new class224();
                                        var73.field3210 = var11;
                                        var73.field3207 = var11.field1852;
                                        class596.field8616.method463(var73, -96);
                                    } else {
                                        label645: for (int var69 = var11.field1829; var69 < class293.field4035; var69++) {
                                            int var70 = class572.field7887[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1875.length; var71++) {
                                                if (var11.field1875[var71] == var70) {
                                                    class224 var72 = new class224();
                                                    var72.field3210 = var11;
                                                    var72.field3207 = var11.field1852;
                                                    class596.field8616.method463(var72, -104);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1829 = class293.field4035;
                                }
                                if (var11.field1836 != null && class224.field3216 > var11.field1803) {
                                    if (var11.field1855 == null || class224.field3216 - var11.field1803 > 32) {
                                        class224 var78 = new class224();
                                        var78.field3210 = var11;
                                        var78.field3207 = var11.field1836;
                                        class596.field8616.method463(var78, -112);
                                    } else {
                                        label621: for (int var74 = var11.field1803; var74 < class224.field3216; var74++) {
                                            int var75 = class184.field2595[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1855.length; var76++) {
                                                if (var11.field1855[var76] == var75) {
                                                    class224 var77 = new class224();
                                                    var77.field3210 = var11;
                                                    var77.field3207 = var11.field1836;
                                                    class596.field8616.method463(var77, -117);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1803 = class224.field3216;
                                }
                                if (var11.field1889 != null && class96.field1460 > var11.field1894) {
                                    if (var11.field1763 == null || class96.field1460 - var11.field1894 > 32) {
                                        class224 var83 = new class224();
                                        var83.field3210 = var11;
                                        var83.field3207 = var11.field1889;
                                        class596.field8616.method463(var83, -108);
                                    } else {
                                        label597: for (int var79 = var11.field1894; var79 < class96.field1460; var79++) {
                                            int var80 = class517.field7257[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1763.length; var81++) {
                                                if (var11.field1763[var81] == var80) {
                                                    class224 var82 = new class224();
                                                    var82.field3210 = var11;
                                                    var82.field3207 = var11.field1889;
                                                    class596.field8616.method463(var82, -126);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1894 = class96.field1460;
                                }
                                if (class142.field2195 > var11.field1837 && var11.field1870 != null) {
                                    class224 var84 = new class224();
                                    var84.field3210 = var11;
                                    var84.field3207 = var11.field1870;
                                    class596.field8616.method463(var84, -94);
                                }
                                if (class633.field9257 > var11.field1837 && var11.field1864 != null) {
                                    class224 var85 = new class224();
                                    var85.field3210 = var11;
                                    var85.field3207 = var11.field1864;
                                    class596.field8616.method463(var85, -128);
                                }
                                if (class236.field3312 > var11.field1837 && var11.field1860 != null) {
                                    class224 var86 = new class224();
                                    var86.field3210 = var11;
                                    var86.field3207 = var11.field1860;
                                    class596.field8616.method463(var86, -93);
                                }
                                if (class97.field1473 > var11.field1837 && var11.field1849 != null) {
                                    class224 var87 = new class224();
                                    var87.field3210 = var11;
                                    var87.field3207 = var11.field1849;
                                    class596.field8616.method463(var87, -111);
                                }
                                if (class105.field1586 > var11.field1837 && var11.field1762 != null) {
                                    class224 var88 = new class224();
                                    var88.field3210 = var11;
                                    var88.field3207 = var11.field1762;
                                    class596.field8616.method463(var88, -100);
                                }
                                var11.field1837 = class81.field1324;
                                if (var11.field1790 != null) {
                                    for (int var89 = 0; var89 < class105.field1583; var89++) {
                                        class224 var90 = new class224();
                                        var90.field3210 = var11;
                                        var90.field3206 = class297.field4068[var89].method3200((byte) 114);
                                        var90.field3200 = class297.field4068[var89].method3201(29232);
                                        var90.field3207 = var11.field1790;
                                        class596.field8616.method463(var90, -111);
                                    }
                                }
                                if (class516.field7249 && var11.field1819 != null) {
                                    class224 var91 = new class224();
                                    var91.field3210 = var11;
                                    var91.field3207 = var11.field1819;
                                    class596.field8616.method463(var91, -124);
                                }
                            }
                            if (var11.field1880 == 5 && var11.field1828 != -1) {
                                var11.method799(class303.field4141, false, class358.field4823).method1651(0, var11.field1769, class69.field1165);
                            }
                            class117.method827(false, var11);
                            if (var11.field1880 == 0) {
                                method1545(arg0, var11.field1810, var14, var15, var16, var17, var12 - var11.field1800, var13 - var11.field1904, arg8, arg9);
                                if (var11.field1886 != null) {
                                    method1545(var11.field1886, var11.field1810, var14, var15, var16, var17, var12 - var11.field1800, var13 - var11.field1904, arg8, arg9);
                                }
                                class128 var92 = (class128) class211.field2971.method1242(0, (long) var11.field1810);
                                if (var92 != null) {
                                    if (class245.field3415 == class163.field2363 && var92.field2063 == 0 && !class483.field6820 && var21 && !class168.field2427) {
                                        class449.method2648((byte) 92);
                                    }
                                    class84.method641(var15, var92.field2065, var14, arg9, var17, var13, arg8, var16, (byte) 82, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class117.method827(false, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1546(byte arg0, byte[] arg1) {
        field3463++;
        class11 var3 = new class11(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method110((byte) 27);
                if (var4 == 0) {
                    if (arg0 >= -25) {
                        method1544();
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class208.field2934 = new int[6];
                    var5[0] = var3.method93((byte) 84);
                    var5[1] = var3.method93((byte) 124);
                    var5[2] = var3.method93((byte) 119);
                    var5[3] = var3.method93((byte) 89);
                    var5[4] = var3.method93((byte) 119);
                    var5[5] = var3.method93((byte) 76);
                } else if (var4 == 4) {
                    int var6 = var3.method110((byte) 55);
                    class7.field87 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class7.field87[var7] = var3.method93((byte) 73);
                        if (class7.field87[var7] == 65535) {
                            class7.field87[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method110((byte) 112);
                    class376.field5055 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class376.field5055[var9] = var3.method93((byte) 120);
                        if (class376.field5055[var9] == 65535) {
                            class376.field5055[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1547(int arg0) {
        field3468++;
        if (arg0 != -51) {
            this.method1548((byte) -99);
        }
        if (class440.field6254 == 6 && class348.field4669 == 0) {
            if (class331.field4422 > 1) {
                class331.field4422--;
                class105.field1586 = class81.field1324;
            }
            if (!class483.field6820) {
                class449.method2648((byte) -70);
            }
            for (int var2 = 0; var2 < 100 && class492.method2864(arg0 ^ 0xFFFFF062); var2++) {
            }
        }
        class64.field1097++;
        class296.method1891((byte) -122, -1, -1, null);
        class440.method2599((byte) -9, null, -1, -1);
        class470.method2741(-16727);
        class81.field1324++;
        for (int var3 = 0; var3 < class204.field2859; var3++) {
            class109 var4 = class342.field4610[var3].field7929;
            if (var4 != null) {
                byte var5 = var4.field1669.field8535;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method337(0);
                    if ((var5 & 0x2) != 0 && var4.field617 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field616[0] + var7;
                            int var10 = var4.field618[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class32.field513 - var6 - 1) < var9) {
                                var9 = class32.field513 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class611.field8786 - var6 - 1 < var10) {
                                var10 = class611.field8786 - var6 - 1;
                            }
                            int var11 = class573.method3265(class314.field4234, (byte) -84, class428.field6075[var4.field6035], var6, var10, var4.field616[0], 0, var4.field618[0], var6, -1, 0, class236.field3314, var9, true, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field616[var12] = class314.field4234[var11 - var12 - 1];
                                    var4.field618[var12] = class236.field3314[var11 - var12 - 1];
                                    var4.field620[var12] = 1;
                                }
                                var4.field617 = var11;
                            }
                        }
                    }
                    class348.method2095(true, (byte) -47, var4);
                    int var13 = class572.method3261(false, var4);
                    class141.method933(var4, var13, class155.field2315, class152.field2303, (byte) 77);
                    class182.method1142(true, var4);
                }
            }
        }
        if (class348.field4669 == 0 && class10.field109 == 0) {
            if (class107.field1653 == 2) {
                class65.method545((byte) 122);
            } else {
                class5.method37(-15);
            }
            if ((class563.field7794 >> 7) < 14 || (class32.field513 - 14) <= (class563.field7794 >> 7) || (class462.field6488 >> 7) < 14 || class462.field6488 >> 7 >= class611.field8786 - 14) {
                class597.method3528(-124);
            }
        }
        while (true) {
            class224 var14;
            class114 var15;
            class114 var16;
            do {
                var14 = (class224) class472.field6633.method459(3553);
                if (var14 == null) {
                    while (true) {
                        class224 var17;
                        class114 var18;
                        class114 var19;
                        do {
                            var17 = (class224) class93.field1433.method459(arg0 ^ 0xFFFFF22C);
                            if (var17 == null) {
                                while (true) {
                                    class224 var20;
                                    class114 var21;
                                    class114 var22;
                                    do {
                                        var20 = (class224) class596.field8616.method459(3553);
                                        if (var20 == null) {
                                            if (class137.field2159 != null) {
                                                class602.method3552((byte) 78);
                                            }
                                            if ((class405.field5763 % 1500) == 0) {
                                                class492.method2857(21220);
                                            }
                                            if (class440.field6254 == 6 && class348.field4669 == 0) {
                                                class175.method1112(-1);
                                            }
                                            class508.method2939(-105);
                                            if (class173.field2495 && class621.field8932 < (class488.method2835(30160) - 60000L)) {
                                                class333.method2035(true);
                                            }
                                            for (class447 var23 = (class447) class347.field4657.method3150(16); var23 != null; var23 = (class447) class347.field4657.method3147(16)) {
                                                if ((long) var23.field6348 < class488.method2835(30160) / 1000L - 5L) {
                                                    if (var23.field6344 > 0) {
                                                        class56.method513("", (byte) 38, 5, 0, "", var23.field6347 + class56.field1004.method739(class173.field2491, arg0 ^ 0xFFFFFFA3));
                                                    }
                                                    if (var23.field6344 == 0) {
                                                        class56.method513("", (byte) 110, 5, 0, "", var23.field6347 + class559.field7746.method739(class173.field2491, 116));
                                                    }
                                                    var23.method939(73);
                                                }
                                            }
                                            if (class440.field6254 == 6 && class348.field4669 == 0) {
                                                if (class143.field2203 == null) {
                                                    class368.method2208(false, false);
                                                    return;
                                                }
                                                class531.field7442++;
                                                if (class531.field7442 > 50) {
                                                    class23.field333++;
                                                    class351.method2108(class122.field1986, arg0 - 10460);
                                                }
                                                try {
                                                    if (class143.field2203 != null && class479.field6754.field165 > 0) {
                                                        class436.field6200 += class479.field6754.field165;
                                                        class143.field2203.method998(34066, class479.field6754.field138, 0, class479.field6754.field165);
                                                        class479.field6754.field165 = 0;
                                                        class531.field7442 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class368.method2208(false, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field3210;
                                        if (var21.field1749 < 0) {
                                            break;
                                        }
                                        var22 = class612.method3584(var21.field1897, arg0 ^ 0xFFFFFFCD);
                                    } while (var22 == null || var22.field1886 == null || var21.field1749 >= var22.field1886.length || var22.field1886[var21.field1749] != var21);
                                    class123.method862(var20);
                                }
                            }
                            var18 = var17.field3210;
                            if (var18.field1749 < 0) {
                                break;
                            }
                            var19 = class612.method3584(var18.field1897, 0);
                        } while (var19 == null || var19.field1886 == null || var18.field1749 >= var19.field1886.length || var19.field1886[var18.field1749] != var18);
                        class123.method862(var17);
                    }
                }
                var15 = var14.field3210;
                if (var15.field1749 < 0) {
                    break;
                }
                var16 = class612.method3584(var15.field1897, 0);
            } while (var16 == null || var16.field1886 == null || var15.field1749 >= var16.field1886.length || var16.field1886[var15.field1749] != var15);
            class123.method862(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1548(byte arg0) {
        field3458++;
        method1536((byte) -62);
        class41.method415(16384);
        class464.method2714(false);
        class314.method1958((byte) 8);
        class104.method738(-126);
        class291.method1877(113);
        class517.method2984(97);
        class372.method2214(51);
        class132.method894((byte) -102);
        class176.method1122(0);
        class366.method2194((byte) 125);
        class205.method1249(34);
        class193.method1196(1692859728);
        class645.method3716(false);
        class111.method778((byte) -104);
        class163.method1052(7);
        class207.method1315(false);
        class440.method2612(23795);
        class201.method1224(-17897);
        class46.method458(false);
        class246.method1525(3);
        class414.method2482(-26512);
        class444.method2630((byte) -108);
        class400.method2392(125);
        class263.method1727((byte) 47);
        class21.method236((byte) -99);
        class323.method2006((byte) 114);
        class219.method1415((byte) -92);
        class571.method3250(0);
        class427.method2542((byte) 3);
        class594.method3518(13376);
        class341.method2071(11);
        class206.method1257(102);
        class596.method3524(true);
        class339.method2060((byte) 3);
        class194.method1212(120);
        class356.method2133((byte) -91);
        class572.method3254(19857);
        class124.method870((byte) -93);
        class546.method3119((byte) 25);
        class476.method2772(false);
        class18.method193((byte) -17);
        class393.method2359((byte) -108);
        class185.method1153(38);
        class251.method1563(121);
        class607.method3561(-127);
        class633.method3678(10535);
        class636.method3690((byte) -98);
        class76.method586(79);
        class147.method977(32768);
        class367.method2203(0);
        class576.method3281((byte) -100);
        class204.method1231(7);
        class471.method2743(-105);
        class618.method3596(-53);
        class600.method3531(88);
        class477.method2782(false);
        class525.method3026((byte) -113);
        class257.method1653((byte) -128);
        class555.method3151((byte) 98);
        class114.method811(0);
        class368.method2206(-2702);
        class408.method2421(-94);
        class11.method70((byte) -49);
        class33.method332((byte) 124);
        class91.method664(2);
        class622.method3631(0);
        class325.method2013((byte) 89);
        class438.method2587(false);
        class335.method2037(true);
        class500.method2893(1);
        class566.method3221((byte) -119);
        class371.method2213((byte) 104);
        class528.method3032((byte) 113);
        class278.method1785(-257);
        class142.method938(121);
        class164.method1057(-92);
        class590.method3456(-27393);
        class175.method1114((byte) -115);
        class162.method1038(108);
        class212.method1389((byte) -87);
        class63.method537(111);
        class189.method1180((byte) -95);
        class286.method1828(17587);
        class270.method1760(0);
        class226.method1445((byte) 104);
        class437.method2586(false);
        class241.method1505(0);
        class101.method725(26265);
        class353.method2121(1);
        class78.method607(-70);
        class244.method1516((byte) 124);
        class184.method1149(-177);
        class524.method3020(true);
        class567.method3225((byte) -6);
        class112.method781(126);
        class317.method1969(-256);
        class105.method743((byte) -120);
        class174.method1110(false);
        class593.method3508(false);
        class621.method3614(false);
        class384.method2254(6530);
        class589.method3453(-100);
        class310.method1943((byte) -114);
        class64.method542(5123);
        class483.method2814(0);
        class274.method1770((byte) 86);
        class223.method1426(103);
        class623.method3635(-1415865760);
        class592.method3499((byte) -92);
        class379.method2243(-11310);
        class474.method2750((byte) 28);
        class640.method3700(6141);
        class298.method1899((byte) 94);
        class369.method2210(91);
        class71.method575((byte) -116);
        class340.method2064(80);
        class268.method1751((byte) 71);
        class489.method2842((byte) 91);
        class346.method2088(31);
        class84.method640(12877);
        class182.method1139((byte) -126);
        class425.method2533(0);
        class87.method651(-16559);
        class254.method1582(-7916);
        class611.method3575(64);
        class187.method1167(-29533);
        class475.method2770();
        class336.method2040((byte) 107);
        class107.method755((byte) -19);
        class215.method1399(6);
        class580.method3319(10731);
        class516.method2979((byte) 111);
        class422.method2519(-20475);
        class123.method858();
        class413.method2468();
        class240.method1498();
        class591.method3465(120);
        class463.method2703(18);
        class448.method2645(-10);
        class548.method3123(2);
        class39.method409(-127);
        class19.method198((byte) 41);
        class211.method1384((byte) -84);
        class269.method1752(46);
        class22.method255((byte) -34);
        class37.method385((byte) 111);
        class312.method1954((byte) 117);
        class537.method3082((byte) 35);
        class253.method1575(1);
        class328.method2023(0);
        class376.method2225(-23166);
        class283.method1822((byte) 76);
        class113.method797(101);
        class642.method3704(-125);
        class575.method3277((byte) 7);
        class258.method1660(false);
        class151.method988((byte) 111);
        class582.method3325((byte) 10);
        class227.method1446(14516);
        class8.method48((byte) 97);
        class144.method952(true);
        class221.method1419(-122);
        class342.method2075((byte) -91);
        class348.method2097((byte) -81);
        class503.method2913(-59);
        class83.method636();
        class60.method530((byte) 117);
        class122.method845(-1);
        class47.method470((byte) 61);
        class183.method1143(4);
        class224.method1437((byte) 88);
        class74.method581(true);
        class560.method3192((byte) 54);
        class197.method1214((byte) 127);
        class171.method1089(-69);
        class344.method2083(-30910);
        class23.method260((byte) -87);
        class559.method3187(98);
        class485.method2824(false);
        class108.method764((byte) 97);
        class203.method1230((byte) 119);
        class225.method1443(2);
        class529.method3038((byte) -41);
        class3.method14(67);
        class196.method1213();
        class565.method3219(-99);
        class133.method899((byte) 103);
        class261.method1703((byte) -16);
        class421.method2517(0);
        class202.method1225(-11557);
        class126.method876(7);
        class62.method535((byte) -118);
        class337.method2049((byte) 117);
        class630.method3668(false);
        class420.method2515(-17899);
        class15.method179(1);
        class180.method1134(-28770);
        class209.method1379(11602);
        class170.method1087(-85);
        class309.method1941(-1);
        class641.method3702(65535);
        class374.method2218(-39);
        class77.method596(-3);
        class51.method491((byte) 39);
        class141.method935((byte) 125);
        class93.method681((byte) -90);
        class412.method2451(false);
        class119.method833(-30064);
        class106.method745(-25945);
        class58.method519((byte) 68);
        class386.method2263(-1);
        class473.method2748(-29417);
        class217.method1404(-27);
        class637.method3693((byte) -112);
        class25.method292((byte) -2);
        class615.method3590(-1);
        class506.method2928(-2);
        class137.method921(8192);
        class6.method40((byte) -85);
        class66.method548(5557);
        class297.method1895((byte) 48);
        class523.method3016(621199212);
        class154.method1006((byte) 104);
        class398.method2385(54);
        class30.method314((byte) 46);
        class271.method1761(false);
        class539.method3095();
        class48.method473(106);
        class480.method2792(-32747);
        class99.method705((byte) -76);
        class509.method2941(-4);
        class457.method2677(0);
        class168.method1075(true);
        class218.method1410((byte) -125);
        class469.method2737(0);
        class602.method3551((byte) -61);
        class130.method888(-78);
        class397.method2374(-80);
        class214.method1398((byte) 9);
        class332.method2033(-122);
        class191.method1186(31243);
        class10.method59(true);
        class118.method831(-30758);
        class315.method1965((byte) 71);
        class324.method2012(-1);
        class329.method2024(60);
        class79.method610(120);
        class229.method1459(5);
        class349.method2099(0);
        class584.method3419();
        class453.method2662((byte) 68);
        class7.method44(468465217);
        class433.method2571();
        class518.method2987();
        class262.method1714();
        class265.method1737((byte) 68);
        class345.method2084(-125);
        class338.method2051();
        class233.method1470(-5240);
        class306.method1938(false);
        class643.method3708(-54);
        class192.method1195(true);
        class28.method308((byte) 120);
        class504.method2917((byte) 97);
        class85.method644(1472604639);
        class290.method1872();
        class190.method1184((byte) 116);
        class466.method2720(true);
        class377.method2229(21283);
        class402.method2404(0);
        class117.method823((byte) -54);
        class68.method568(-1);
        class169.method1081(-13645);
        class181.method1136((byte) -75);
        class568.method3232(false);
        class152.method992((byte) -79);
        class625.method3651(-125);
        class492.method2862(102);
        class619.method3604(-26259);
        class434.method2582(17036);
        class395.method2370(116);
        class634.method3682((byte) 58);
        class606.method3559(111);
        class316.method1968(1);
        class394.method2362((byte) 102);
        class208.method1371(true);
        class583.method3368(0);
        class166.method1066(3553);
        class519.method2995(-3);
        class98.method701(7);
        class556.method3152(3);
        class266.method1744((byte) 71);
        class277.method1782(-28448);
        class510.method2950((byte) -95);
        class45.method439((byte) -125);
        class418.method2512(72);
        class629.method3664(32993);
        class146.method971(-19961);
        class320.method1991(-109);
        class603.method3556((byte) 31);
        class541.method3102(1);
        class403.method2405(-1);
        class388.method2341(16);
        class94.method684((byte) 44);
        class608.method3567(80);
        class534.method3066(-119);
        class557.method3162(-116);
        class150.method983(-1);
        class399.method2387(0);
        class333.method2036(12156);
        class242.method1511(28273);
        class595.method3521((byte) 7);
        class200.method1222(14528);
        class20.method211(-1);
        class538.method3089((byte) 119);
        class35.method362(52);
        class435.method2584(5);
        class131.method893((byte) -61);
        class264.method1735(true);
        class14.method173(5);
        class370.method2211(0);
        class424.method2527(7425);
        class220.method1418(34336);
        class549.method3130(true);
        class161.method1037();
        class245.method1517(-4250);
        class95.method686(0);
        class213.method1391((byte) -128);
        class57.method515((byte) -2);
        class490.method2844((byte) 101);
        class646.method3726(false);
        class350.method2104((byte) -127);
        class61.method532(4096);
        class472.method2744(2048);
        class507.method2936((byte) 47);
        class311.method1945((byte) 102);
        class487.method2829((byte) 91);
        class512.method2965((byte) 119);
        class56.method514(true);
        class459.method2684(-5005);
        class390.method2348((byte) -127);
        class387.method2265(10352);
        class533.method3063(63);
        class75.method583(false);
        class428.method2543(1833556716);
        class515.method2976(-57);
        class493.method2866((byte) -103);
        class612.method3581(1826);
        class65.method546(-32658);
        class331.method2030(32);
        class1.method4(-125);
        class526.method3029((byte) -121);
        class90.method654((byte) -101);
        class404.method2412(4096);
        class236.method1480((byte) 46);
        class16.method182((byte) -37);
        class24.method279();
        class520.method3001((byte) 90);
        class569.method3237(18826);
        class276.method1780(4);
        class129.method884();
        class491.method2847((byte) 121);
        class282.method1816(-26195);
        class275.method1775(12868);
        class53.method505((byte) -128);
        class362.method2165((byte) 122);
        class363.method2174(-85);
        class496.method2872(-1492023961);
        class562.method3209((byte) 125);
        class267.method1749(-76);
        class165.method1061(true);
        class648.method3729(-58);
        class501.method2906(-105);
        class638.method3694(125);
        class597.method3526(20885);
        class302.method1918(false);
        class456.method2671((byte) -83);
        class401.method2399(108);
        class31.method318(122);
        class478.method2788(30281);
        class313.method1956(-49);
        class495.method2870((byte) 63);
        class2.method10(19340);
        class365.method2191(-84);
        class610.method3570((byte) -72);
        class103.method731((byte) 87);
        class326.method2018(2);
        class405.method2415((byte) -128);
        class173.method1092(-79);
        class285.method1826(-65);
        class177.method1125((byte) -100);
        class426.method2535(0);
        class554.method3140(0);
        class632.method3674((byte) -9);
        class143.method940(-31618);
        class343.method2079((byte) -70);
        class272.method1767(-25392);
        class40.method414((byte) 125);
        class532.method3061(43);
        class305.method1934((byte) -95);
        class564.method3216(2);
        class347.method2092((byte) 29);
        class452.method2659(0);
        class280.method1807((byte) -55);
        class494.method2869((byte) -118);
        class300.method1910(-6966);
        class481.method2800((byte) -91);
        class49.method477(-4);
        class451.method2649(-5);
        class498.method2891(6);
        class644.method3713(1);
        class378.method2234((byte) -112);
        class358.method2143(21102);
        class210.method1382(-119);
        class385.method2260((byte) -123);
        class587.method3443(-1);
        class431.method2560(false);
        class319.method1990(22);
        class86.method649(27620);
        class318.method1985(1288);
        class80.method615(-1);
        class439.method2590(0);
        class235.method1476(false);
        class96.method688(55);
        class259.method1662(true);
        class140.method932(68);
        class551.method3131((byte) 106);
        class461.method2686((byte) 109);
        class486.method2826(-91);
        class167.method1071((byte) -58);
        class430.method2559(-7767);
        class92.method677((byte) 60);
        class585.method3432(25226);
        class586.method3435(-28136);
        class110.method773((byte) 27);
        class447.method2642(25822);
        class391.method2351(10108);
        class304.method1927(-112);
        class32.method330(true);
        class55.method511(76);
        class505.method2921(false);
        class406.method2417(255);
        class228.method1453(false);
        class542.method3105(16);
        class442.method2617((byte) 28);
        class561.method3198((byte) -118);
        class139.method930((byte) -96);
        class178.method1131((byte) 109);
        class160.method1029(true);
        class360.method2159(-73);
        class239.method1494(true);
        class543.method3107(14);
        class69.method569(21697);
        class294.method1886(1);
        class43.method417(36);
        class252.method1571(0);
        class148.method980((byte) -108);
        class351.method2109((byte) -107);
        int var2 = -40 % ((-arg0 - 68) / 54);
        class552.method3133(-112);
        class443.method2619(2);
        class628.method3659((byte) 90);
        class120.method838(1024);
        class303.method1925((byte) 97);
        class470.method2740((byte) -100);
        class296.method1890(0);
        class29.method311(15084652);
        class222.method1421(3198);
        class479.method2791(1780193356);
        class639.method3696((byte) -34);
        if (class429.field6115) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3457++;
        if (!this.method2547((byte) -85)) {
            return;
        }
        class504.field7014 = new class189();
        class504.field7014.field2680 = Integer.parseInt(this.getParameter("worldid"));
        class332.field4446 = new class189();
        class332.field4446.field2680 = Integer.parseInt(this.getParameter("lobbyid"));
        class332.field4446.field2686 = this.getParameter("lobbyaddress");
        class31.field506 = new class189();
        class31.field506.field2680 = Integer.parseInt(this.getParameter("demoid"));
        class31.field506.field2686 = this.getParameter("demoaddress");
        class53.field988 = class583.method3345(Integer.parseInt(this.getParameter("modewhere")), (byte) 70);
        if (!class625.method3649(class53.field988, -1) && class71.field1181 != class53.field988) {
            class53.field988 = class71.field1181;
        }
        class173.field2494 = class575.method3276(Integer.parseInt(this.getParameter("modewhat")), (byte) -95);
        if (class269.field3760 != class173.field2494 && class452.field6377 != class173.field2494 && class420.field5902 != class173.field2494) {
            class173.field2494 = class420.field5902;
        }
        try {
            class173.field2491 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class173.field2491 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class623.field8997 = true;
        } else {
            class623.field8997 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class589.field8420 = true;
        } else {
            class589.field8420 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class369.field5013 = true;
        } else {
            class369.field5013 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class163.field2363 = class245.field3415;
            } else if (var4.equals("1")) {
                class163.field2363 = class37.field767;
            }
        }
        try {
            class517.field7259 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class517.field7259 = 0;
        }
        class68.field1154 = this.getParameter("quiturl");
        class310.field4180 = this.getParameter("settings");
        if (class310.field4180 == null) {
            class310.field4180 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class537.field7519 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class537.field7519 = 0;
            }
        }
        class56.field1007 = Integer.parseInt(this.getParameter("colourid"));
        if (class56.field1007 < 0 || class1.field19.length <= class56.field1007) {
            class56.field1007 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class449.field6358 = true;
            class310.field4179 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class212.field2999 = true;
        }
        class68.field1153 = this.getParameter("sskey");
        if (class68.field1153 != null && class68.field1153.length() < 2) {
            class68.field1153 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class597.field8629 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class224.field3218 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class313.field4221 = this;
        if (class245.field3415 == class163.field2363) {
            class209.field2954 = 765;
            class78.field1266 = 503;
        } else if (class37.field767 == class163.field2363) {
            class78.field1266 = 480;
            class209.field2954 = 640;
        }
        this.method2550(class173.field2494.method3718((byte) 77) + 32, class209.field2954, class78.field1266, false, 606);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1549(byte arg0, int arg1) {
        class591.field8440.field5869++;
        if (arg0 >= -92) {
            this.method1542((byte) 114);
        }
        class188.field2629 = 0;
        class122.field1984 = null;
        class106.field1602 = null;
        class591.field8440.field5870 = arg1;
        field3464++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;Lgi;)Lsca;")
    public static final class40 method1550(int arg0, boolean arg1, String arg2, class583 arg3) {
        if (arg1) {
            method1544();
        }
        field3459++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class30.field499, 0);
        if (class30.field499[0] == 0) {
            if (class30.field499[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class30.field499, 1);
            if (class30.field499[1] > 1) {
                byte[] var6 = new byte[class30.field499[1]];
                OpenGL.glGetInfoLogARB(var4, class30.field499[1], class30.field499, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class30.field499[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class40(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1551() {
        int var0 = class559.field7738;
        int[] var1 = class358.field4825;
        boolean var2 = class491.field6875.field3348 == 1 && var0 > 200 || class491.field6875.field3348 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class188 var13 = class349.field4696[var1[var3]];
            if (var13.method1173(0)) {
                var13.method338(-25405);
                if (var13.field6036 >= 0 && var13.field6028 >= 0 && var13.field6030 < class32.field513 && var13.field6031 < class611.field8786) {
                    var13.field2658 = var13.field567 ? var2 : false;
                    if (class645.field9372 == var13) {
                        var13.field588 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field558) {
                            var14++;
                        }
                        if (var13.field541 > class405.field5763) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method337(0) << 2);
                        if (var13.field2661) {
                            var15 += 512;
                        } else {
                            if (class407.field5780 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field588 = var15 + 1;
                    }
                } else {
                    var13.field588 = -1;
                }
            } else {
                var13.field588 = -1;
            }
        }
        for (int var4 = 0; var4 < class480.field6764; var4++) {
            class109 var10 = ((class576) class278.field3837.method1242(0, (long) class586.field8386[var4])).field7929;
            if (var10.method767(0) && var10.field1669.method3515(false, class189.field2681)) {
                var10.method338(-25405);
                if (var10.field6036 >= 0 && var10.field6028 >= 0 && var10.field6030 < class32.field513 && var10.field6031 < class611.field8786) {
                    int var11 = 0;
                    if (!var10.field558) {
                        var11++;
                    }
                    if (var10.field541 > class405.field5763) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method337(0) << 2);
                    if (class407.field5780 == 0) {
                        if (var10.field1669.field8559) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class407.field5780 == 1) {
                        if (var10.field1669.field8559) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field1669.field8568) {
                        var12 += 1024;
                    } else if (!var10.field1669.field8542) {
                        var12 += 256;
                    }
                    var10.field588 = var12 + 1;
                } else {
                    var10.field588 = -1;
                }
            } else {
                var10.field588 = -1;
            }
        }
        for (int var5 = 0; var5 < class132.field2113.length; var5++) {
            class201 var6 = class132.field2113[var5];
            if (var6 != null) {
                if (var6.field2819 == 1) {
                    class576 var7 = (class576) class278.field3837.method1242(0, (long) var6.field2817);
                    if (var7 != null) {
                        class109 var8 = var7.field7929;
                        if (var8.field588 >= 0) {
                            var8.field588 += 2048;
                        }
                    }
                } else if (var6.field2819 == 10) {
                    class188 var9 = class349.field4696[var6.field2817];
                    if (var9 != null && class645.field9372 != var9 && var9.field588 >= 0) {
                        var9.field588 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1552(int arg0) {
        if (class173.field2495) {
            class333.method2035(true);
        }
        field3454++;
        if (class69.field1165 != null) {
            class69.field1165.method1284((byte) -70);
        }
        if (class87.field1383 != null) {
            class634.method3681(class500.field6968, 12837, class87.field1383);
            class87.field1383 = null;
        }
        if (class143.field2203 != null) {
            class143.field2203.method1004(arg0 + 34061);
            class143.field2203 = null;
        }
        if (arg0 != 4) {
            method1545(null, 0, 30, -6, -48, 125, 10, -17, -2, 15);
        }
        class222.method1422(18320);
        class591.field8440.method2480((byte) 125);
        class320.field4332.method2625((byte) -116);
        if (class314.field4235 != null) {
            class314.field4235.method3597(0);
            class314.field4235 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method1553(int arg0) {
        field3470++;
        String var2 = null;
        try {
            var2 = "[1)" + class519.field7304 + "," + class6.field80 + "," + class32.field513 + "," + class611.field8786 + "|";
            if (class645.field9372 != null) {
                var2 = var2 + "2)" + class206.field2901 + "," + (class645.field9372.field616[0] + class519.field7304) + "," + (class645.field9372.field618[0] + class6.field80) + "|";
            }
            var2 = var2 + "3)" + class103.field1570 + "|4)" + class491.field6875.field3360 + "|5)" + class486.method2827(71) + "|6)" + class387.field5196 + "," + class134.field2128 + "|";
            var2 = var2 + "7)" + class491.field6875.method1502(class103.field1570, 1) + "|";
            var2 = var2 + "8)" + class491.field6875.method1507(class103.field1570, (byte) 61) + "|";
            var2 = var2 + "9)" + class491.field6875.field3357 + "|";
            var2 = var2 + "10)" + class491.field6875.field3361 + "|";
            var2 = var2 + "11)" + class491.field6875.field3351 + "|";
            var2 = var2 + "12)" + class491.field6875.method2608(class103.field1570, (byte) -105) + "|";
            var2 = var2 + "13)" + class366.field4987 + "|";
            var2 = var2 + "14)" + class440.field6254;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class103.field1570 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3475 == null ? (field3475 = method1561("client")) : field3475).getClassLoader());
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
            } catch (Throwable var16) {
            }
            if (arg0 > -39) {
                this.method1555((byte) 3);
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmc;)Z")
    public static final boolean method1554(class114 arg0) {
        if (class168.field2427) {
            if (method1534(arg0).field6963 != 0) {
                return false;
            }
            if (arg0.field1880 == 0) {
                return false;
            }
        }
        return arg0.field1825;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1555(byte arg0) {
        if (!class491.field6875.field3380) {
            for (int var2 = 0; var2 < class105.field1583; var2++) {
                if (class297.field4068[var2].method3201(29232) == 's' || class297.field4068[var2].method3201(29232) == 'S') {
                    class491.field6875.field3380 = true;
                    break;
                }
            }
        }
        field3452++;
        if (class257.field3572 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class488.method2835(30160);
            if (class130.field2092 == 0L) {
                class130.field2092 = var5;
            }
            if (var4 > 16384 && (var5 - class130.field2092) < 5000L) {
                if (var5 - class380.field5122 > 1000L) {
                    System.gc();
                    class380.field5122 = var5;
                }
                class342.field4604 = class366.field4986.method739(class173.field2491, 127);
                class6.field79 = 5;
            } else {
                class342.field4604 = class378.field5070.method739(class173.field2491, 117);
                class257.field3572 = 10;
                class6.field79 = 5;
            }
        } else if (class257.field3572 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class428.field6075[var7] = class80.method621(class611.field8786, class32.field513, false);
            }
            class342.field4604 = class6.field75.method739(class173.field2491, 113);
            class6.field79 = 10;
            class257.field3572 = 20;
        } else if (class257.field3572 == 20) {
            if (class555.field7656 == null) {
                class555.field7656 = new class400(class591.field8440, class320.field4332, class474.field6675, class463.field6514);
            }
            if (class555.field7656.method2389((byte) 127)) {
                class107.field1646 = class546.method3112(false, 1000000, true, 1, 0);
                class212.field2988 = class546.method3112(false, 1000000, true, 1, 1);
                class346.field4656 = class546.method3112(false, 1000000, true, 1, 2);
                class418.field5891 = class546.method3112(false, 1000000, true, 1, 3);
                class603.field8707 = class546.method3112(false, 1000000, true, 1, 4);
                class23.field346 = class546.method3112(true, 1000000, true, 1, 5);
                class236.field3305 = class546.method3112(true, 1000000, false, 1, 6);
                class566.field7830 = class546.method3112(false, 1000000, true, 1, 7);
                class645.field9371 = class546.method3112(false, 1000000, true, 1, 8);
                class505.field7049 = class546.method3112(false, 1000000, true, 1, 9);
                class277.field3831 = class546.method3112(false, 1000000, true, 1, 10);
                class7.field89 = class546.method3112(false, 1000000, true, 1, 11);
                class49.field960 = class546.method3112(false, 1000000, true, 1, 12);
                class385.field5162 = class546.method3112(false, 1000000, true, 1, 13);
                class572.field7893 = class546.method3112(false, 1000000, false, 1, 14);
                class549.field7603 = class546.method3112(false, 1000000, true, 1, 15);
                class507.field7092 = class546.method3112(false, 1000000, true, 1, 16);
                class366.field4973 = class546.method3112(false, 1000000, true, 1, 17);
                class336.field4486 = class546.method3112(false, 1000000, true, 1, 18);
                class152.field2307 = class546.method3112(false, 1000000, true, 1, 19);
                class318.field4318 = class546.method3112(false, 1000000, true, 1, 20);
                class498.field6959 = class546.method3112(false, 1000000, true, 1, 21);
                class633.field9253 = class546.method3112(false, 1000000, true, 1, 22);
                class587.field8402 = class546.method3112(true, 1000000, true, 1, 23);
                class341.field4603 = class546.method3112(false, 1000000, true, 1, 24);
                class623.field8995 = class546.method3112(false, 1000000, true, 1, 25);
                class440.field6280 = class546.method3112(true, 1000000, true, 1, 26);
                class610.field8772 = class546.method3112(false, 1000000, true, 1, 27);
                class269.field3759 = class546.method3112(true, 1000000, true, 1, 28);
                class406.field5774 = class546.method3112(false, 1000000, true, 1, 29);
                class398.field5688 = class546.method3112(true, 1000000, true, 1, 30);
                class142.field2194 = class546.method3112(true, 1000000, true, 1, 31);
                class342.field4604 = class510.field7120.method739(class173.field2491, 101);
                class257.field3572 = 30;
                class6.field79 = 15;
            } else {
                class342.field4604 = class210.field2961.method739(class173.field2491, -112);
                class6.field79 = 12;
            }
        } else if (class257.field3572 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 32; var9++) {
                var8 += class223.field3188[var9].method1729(true) * class495.field6929[var9] / 100;
            }
            if (var8 == 100) {
                class342.field4604 = class151.field2294.method739(class173.field2491, -62);
                class6.field79 = 20;
                class151.method990(class645.field9371, (byte) -25);
                class512.method2966(class645.field9371, -3991);
                class257.field3572 = 35;
            } else {
                if (var8 != 0) {
                    class342.field4604 = class294.field4043.method739(class173.field2491, 76) + var8 + "%";
                }
                class6.field79 = 20;
            }
        } else if (class257.field3572 == 35) {
            class272.method1766(class398.field5688, (byte) -22, class500.field6968);
            class342.field4604 = class401.field5721.method739(class173.field2491, -104);
            class257.field3572 = 40;
            class6.field79 = 20;
        } else if (class257.field3572 == 40) {
            if (class269.field3759.method241(27148)) {
                this.method1546((byte) -88, class269.field3759.method242(1, (byte) -125));
                this.method1543(3391, class269.field3759.method242(3, (byte) -117));
                if (class335.field4464 == -1 || class566.field7830.method229(class335.field4464, -1, 0)) {
                    class342.field4604 = class235.field3293.method739(class173.field2491, -79);
                    class257.field3572 = 41;
                    class6.field79 = 25;
                }
            } else {
                class342.field4604 = class6.field78.method739(class173.field2491, -126) + class269.field3759.method213((byte) -93) + "%";
                class6.field79 = 25;
            }
        } else if (class257.field3572 == 41) {
            int var10 = class525.method3028((byte) -5, "jaggl");
            if (var10 >= 0 && var10 < 100) {
                class342.field4604 = class554.field7639.method739(class173.field2491, -93) + var10 + "%";
                class6.field79 = 25;
            } else {
                class342.field4604 = class349.field4686.method739(class173.field2491, 62);
                class6.field79 = 25;
                class257.field3572 = 42;
            }
        } else if (class257.field3572 == 42) {
            int var11 = class525.method3028((byte) -5, "jagdx");
            if (var11 >= 0 && var11 < 100) {
                class342.field4604 = class278.field3841.method739(class173.field2491, -105) + var11 + "%";
                class6.field79 = 25;
            } else {
                class342.field4604 = class420.field5901.method739(class173.field2491, 124);
                class257.field3572 = 43;
                class6.field79 = 25;
            }
        } else if (class257.field3572 == 43) {
            int var12 = class525.method3028((byte) -5, "jagmisc");
            if (var12 >= 0 && var12 < 100) {
                class342.field4604 = class457.field6434.method739(class173.field2491, -87) + var12 + "%";
                class6.field79 = 25;
            } else {
                if (var12 == 100) {
                    this.method2549(-110);
                }
                class342.field4604 = class351.field4716.method739(class173.field2491, -121);
                class257.field3572 = 44;
                class6.field79 = 25;
            }
        } else if (class257.field3572 == 44) {
            int var13 = class525.method3028((byte) -5, "sw3d");
            if (var13 >= 0 && var13 < 100) {
                class342.field4604 = class619.field8877.method739(class173.field2491, -108) + var13 + "%";
                class6.field79 = 25;
            } else {
                class342.field4604 = class444.field6322.method739(class173.field2491, 82);
                class6.field79 = 25;
                class257.field3572 = 45;
            }
        } else if (class257.field3572 == 45) {
            int var14 = class525.method3028((byte) -5, "jaclib");
            if (var14 >= 0 && var14 < 100) {
                class342.field4604 = class242.field3395.method739(class173.field2491, 82) + var14 + "%";
                class6.field79 = 25;
            } else {
                if (var14 == 100) {
                    this.method2551(0);
                }
                class342.field4604 = class103.field1557.method739(class173.field2491, 114);
                class6.field79 = 25;
                class257.field3572 = 46;
            }
        } else if (class257.field3572 == 46) {
            int var15 = class525.method3028((byte) -5, "hw3d");
            if (var15 >= 0 && var15 < 100) {
                class342.field4604 = class492.field6890.method739(class173.field2491, 69) + var15 + "%";
                class6.field79 = 25;
            } else {
                class342.field4604 = class304.field4154.method739(class173.field2491, 86);
                class257.field3572 = 47;
                class6.field79 = 25;
            }
        } else if (class257.field3572 == 47) {
            if (class142.field2194.method241(27148)) {
                class342.field4604 = class192.field2719.method739(class173.field2491, 117);
                class6.field79 = 25;
                class257.field3572 = 50;
            } else {
                class342.field4604 = class325.field4375.method739(class173.field2491, -113);
                class6.field79 = 25;
            }
        } else if (class257.field3572 == 50) {
            class121.method843(true);
            class342.field4604 = class366.field4983.method739(class173.field2491, 92);
            class6.field79 = 30;
            class257.field3572 = 60;
        } else if (class257.field3572 == 60) {
            int var16 = class487.method2834(-12305, class385.field5162, class645.field9371);
            int var17 = class291.method1875((byte) -111);
            if (var16 < var17) {
                class342.field4604 = class438.field6218.method739(class173.field2491, 111) + var16 * 100 / var17 + "%";
                class6.field79 = 35;
            } else {
                class342.field4604 = class221.field3163.method739(class173.field2491, 112);
                class6.field79 = 35;
                class257.field3572 = 70;
            }
        } else if (class257.field3572 == 70) {
            int var18 = class261.method1706(class645.field9371, (byte) -127);
            int var19 = class306.method1936(114);
            if (var19 > var18) {
                class342.field4604 = class58.field1051.method739(class173.field2491, 57) + var18 * 100 / var19 + "%";
                class6.field79 = 40;
            } else {
                class342.field4604 = class372.field5026.method739(class173.field2491, -62);
                class6.field79 = 40;
                class257.field3572 = 80;
            }
        } else if (class257.field3572 != 80) {
            if (arg0 > -1) {
                this.method1535((byte) 103);
            }
            if (class257.field3572 == 90) {
                class342.field4604 = class215.field3066.method739(class173.field2491, 94);
                class257.field3572 = 95;
                class6.field79 = 50;
            } else if (class257.field3572 == 95) {
                if (class491.field6875.field3380) {
                    class491.field6875.field3378 = 0;
                    class491.field6875.field3368 = 0;
                    class491.field6875.field3360 = 0;
                    class491.field6875.field3359 = 1;
                    class491.field6875.field3366 = 0;
                }
                class491.field6875.field3380 = true;
                class491.field6875.method2607((byte) -123, class500.field6968);
                class170.method1083(false, (byte) -124, class491.field6875.field3368);
                class342.field4604 = class304.field4153.method739(class173.field2491, 75);
                class6.field79 = 55;
                class257.field3572 = 100;
            } else if (class257.field3572 == 100) {
                class613.method3586(class645.field9371, class385.field5162, class69.field1165, (byte) -91);
                class342.field4604 = class567.field7835.method739(class173.field2491, -109);
                class6.field79 = 60;
                class45.method440(1, 43);
                class257.field3572 = 110;
            } else if (class257.field3572 == 110) {
                class346.field4656.method241(27148);
                byte var20 = 0;
                int var21 = var20 + class346.field4656.method213((byte) -97);
                class507.field7092.method241(27148);
                int var22 = var21 + class507.field7092.method213((byte) -120);
                class366.field4973.method241(27148);
                int var23 = var22 + class366.field4973.method213((byte) -84);
                class336.field4486.method241(27148);
                int var24 = var23 + class336.field4486.method213((byte) -115);
                class152.field2307.method241(27148);
                int var25 = var24 + class152.field2307.method213((byte) -122);
                class318.field4318.method241(27148);
                int var26 = var25 + class318.field4318.method213((byte) -87);
                class498.field6959.method241(27148);
                int var27 = var26 + class498.field6959.method213((byte) -99);
                class633.field9253.method241(27148);
                int var28 = var27 + class633.field9253.method213((byte) -128);
                class341.field4603.method241(27148);
                int var29 = var28 + class341.field4603.method213((byte) -101);
                class623.field8995.method241(27148);
                int var30 = var29 + class623.field8995.method213((byte) -94);
                class610.field8772.method241(27148);
                int var31 = var30 + class610.field8772.method213((byte) -80);
                class406.field5774.method241(27148);
                int var32 = var31 + class406.field5774.method213((byte) -97);
                if (var32 < 1200) {
                    class342.field4604 = class451.field6375.method739(class173.field2491, -98) + var32 / 12 + "%";
                    class6.field79 = 65;
                } else {
                    class533.field7455 = new class546(class163.field2363, class173.field2491, class346.field4656);
                    class263.field3678 = new class100(class163.field2363, class173.field2491, class346.field4656);
                    class62.field1080 = new class427(class163.field2363, class173.field2491, class346.field4656, class645.field9371);
                    class643.field9342 = new class594(class163.field2363, class173.field2491, class366.field4973);
                    class141.field2191 = new class341(class163.field2363, class173.field2491, class346.field4656);
                    class493.field6910 = new class206(class163.field2363, class173.field2491, class346.field4656);
                    class412.field5801 = new class467(class163.field2363, class173.field2491, class346.field4656, class566.field7830);
                    class154.field2312 = new class596(class163.field2363, class173.field2491, class346.field4656);
                    class534.field7475 = new class339(class163.field2363, class173.field2491, class346.field4656);
                    class18.field227 = new class194(class163.field2363, class173.field2491, true, class507.field7092, class566.field7830);
                    class163.field2366 = new class356(class163.field2363, class173.field2491, class346.field4656, class645.field9371);
                    class340.field4583 = new class572(class163.field2363, class173.field2491, class346.field4656, class645.field9371);
                    class516.field7253 = new class573(class163.field2363, class173.field2491, true, class336.field4486, class566.field7830);
                    class181.field2574 = new class124(class163.field2363, class173.field2491, true, class533.field7455, class152.field2307, class566.field7830);
                    class630.field9230 = new class476(class163.field2363, class173.field2491, class346.field4656);
                    class331.field4418 = new class18(class163.field2363, class173.field2491, class318.field4318, class107.field1646, class212.field2988);
                    class303.field4141 = new class393(class163.field2363, class173.field2491, class346.field4656);
                    class358.field4823 = new class185(class163.field2363, class173.field2491, class346.field4656);
                    class78.field1263 = new class251(class163.field2363, class173.field2491, class498.field6959, class566.field7830);
                    class642.field9327 = new class607(class163.field2363, class173.field2491, class346.field4656);
                    class554.field7640 = new class633(class163.field2363, class173.field2491, class346.field4656);
                    class481.field6786 = new class636(class163.field2363, class173.field2491, class346.field4656);
                    class595.field8604 = new class380(class163.field2363, class173.field2491, class633.field9253);
                    class534.field7474 = new class76(class163.field2363, class173.field2491, class346.field4656);
                    class68.method563(class645.field9371, class566.field7830, (byte) -107, class418.field5891, class385.field5162);
                    class474.method2754((byte) -97, class406.field5774);
                    class169.field2444 = new class147(class173.field2491, class341.field4603, class623.field8995);
                    class451.field6374 = new class367(class173.field2491, class341.field4603, class623.field8995, new class134());
                    class342.field4604 = class615.field8839.method739(class173.field2491, -104);
                    class6.field79 = 65;
                    class485.method2825(0);
                    class18.field227.method1206(0, !class491.field6875.method2608(class103.field1570, (byte) -120));
                    class189.field2681 = new class458();
                    class510.method2946((byte) -120);
                    class337.method2044(class610.field8772, (byte) 109);
                    class600.method3538(class566.field7830, (byte) 74, class60.field1065);
                    class257.field3572 = 120;
                }
            } else if (class257.field3572 == 120) {
                int var33 = class394.method2363(class645.field9371, 8191);
                int var34 = class430.method2557(true);
                if (var33 < var34) {
                    class342.field4604 = class476.field6708.method739(class173.field2491, 61) + var33 * 100 / var34 + "%";
                    class6.field79 = 70;
                } else {
                    class608.method3568(0, class69.field1165, class645.field9371);
                    class190.method1183(-105, class257.field3566);
                    class342.field4604 = class632.field9244.method739(class173.field2491, -65);
                    class257.field3572 = 130;
                    class6.field79 = 70;
                }
            } else if (class257.field3572 == 130) {
                if (class277.field3831.method227("", "huffman", 121)) {
                    class122 var35 = new class122(class277.field3831.method228("", 87, "huffman"));
                    class45.method442(var35, (byte) -36);
                    class342.field4604 = class425.field6047.method739(class173.field2491, 91);
                    class6.field79 = 75;
                    class257.field3572 = 140;
                } else {
                    class342.field4604 = class621.field8919.method739(class173.field2491, 91) + "0%";
                    class6.field79 = 75;
                }
            } else if (class257.field3572 == 140) {
                if (class418.field5891.method241(27148)) {
                    class342.field4604 = class377.field5069.method739(class173.field2491, -109);
                    class6.field79 = 80;
                    class257.field3572 = 150;
                } else {
                    class342.field4604 = class565.field7818.method739(class173.field2491, -64) + class418.field5891.method213((byte) -106) + "%";
                    class6.field79 = 80;
                }
            } else if (class257.field3572 == 150) {
                if (class49.field960.method241(27148)) {
                    class342.field4604 = class114.field1906.method739(class173.field2491, -93);
                    class6.field79 = 82;
                    class257.field3572 = 160;
                } else {
                    class342.field4604 = class23.field334.method739(class173.field2491, -99) + class49.field960.method213((byte) -128) + "%";
                    class6.field79 = 82;
                }
            } else if (class257.field3572 == 160) {
                if (class385.field5162.method241(27148)) {
                    class342.field4604 = class551.field7610.method739(class173.field2491, 102);
                    class6.field79 = 85;
                    class257.field3572 = 170;
                } else {
                    class342.field4604 = class551.field7610.method739(class173.field2491, -121) + class385.field5162.method213((byte) -105) + "%";
                    class6.field79 = 85;
                }
            } else if (class257.field3572 == 170) {
                if (class587.field8402.method251("details", 0)) {
                    class413.method2457(class587.field8402, class141.field2191, class493.field6910, class18.field227, class163.field2366, class340.field4583, class189.field2681);
                    class342.field4604 = class408.field5786.method739(class173.field2491, -87);
                    class6.field79 = 89;
                    class257.field3572 = 190;
                } else {
                    class342.field4604 = class244.field3407.method739(class173.field2491, 122) + class587.field8402.method214("details", true) + "%";
                    class6.field79 = 87;
                }
            } else if (class257.field3572 == 190) {
                class344.field4633 = new String[class554.field7640.field9251];
                class77.field1259 = new int[class481.field6786.field9278];
                class552.field7627 = new boolean[class481.field6786.field9278];
                for (int var36 = 0; var36 < class481.field6786.field9278; var36++) {
                    if (class481.field6786.method3691(19, var36).field7991 == 0) {
                        class552.field7627[var36] = true;
                        class462.field6478++;
                    }
                    class77.field1259[var36] = -1;
                }
                class582.method3321((byte) 44);
                class68.field1151 = class418.field5891.method252((byte) -95, "loginscreen");
                class178.field2551 = class418.field5891.method252((byte) 36, "lobbyscreen");
                class23.field346.method235(false, false, true);
                class236.field3305.method235(true, false, true);
                class645.field9371.method235(true, false, true);
                class385.field5162.method235(true, false, true);
                class277.field3831.method235(true, false, true);
                class418.field5891.method235(true, false, true);
                class637.field9281 = true;
                class346.field4656.field288 = 2;
                class366.field4973.field288 = 2;
                class507.field7092.field288 = 2;
                class336.field4486.field288 = 2;
                class152.field2307.field288 = 2;
                class318.field4318.field288 = 2;
                class498.field6959.field288 = 2;
                class512.method2963(class491.field6875.field3359, false, -1, -4, -1);
                class342.field4604 = class593.field8557.method739(class173.field2491, -94);
                class257.field3572 = 200;
                class6.field79 = 95;
            } else if (class257.field3572 == 200) {
                class45.method440(2, -95);
            }
        } else if (class440.field6280.method241(27148)) {
            class60.field1065 = new class97(class440.field6280, class505.field7049, class645.field9371);
            class342.field4604 = class341.field4586.method739(class173.field2491, 115);
            class257.field3572 = 90;
            class6.field79 = 45;
        } else {
            class342.field4604 = class112.field1725.method739(class173.field2491, 82) + class440.field6280.method213((byte) -94) + "%";
            class6.field79 = 45;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1556() {
        int var0 = class559.field7738;
        int[] var1 = class358.field4825;
        int var2 = class434.field6191 ? var0 : class480.field6764 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class33 var4;
            if (var3 < var0) {
                var4 = class349.field4696[var1[var3]];
            } else {
                var4 = ((class576) class278.field3837.method1242(0, (long) class586.field8386[var3 - var0])).field7929;
            }
            if (var4.field588 >= 0) {
                int var5 = var4.method337(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6037 & 0x7F) == 0 && (var4.field6029 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6037 & 0x7F) == 64 && (var4.field6029 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class188 && var4.field615 != null && class405.field5763 >= var4.field615.field4478 && class405.field5763 < var4.field615.field4488) {
                    ((class188) var4).field2658 = false;
                }
                var4.field6042 = class183.method1144(87, var4.field6037, var4.field6029, var4.field6035);
                class108.method761(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1557(int arg0) {
        if (arg0 != 0) {
            field3472 = null;
        }
        field3460++;
        boolean var2 = class591.field8440.method2488(arg0 - 5973);
        if (!var2) {
            this.method1558(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1558(int arg0) {
        field3461++;
        if (class591.field8440.field5869 > class611.field8789) {
            class157.field2324 = (class591.field8440.field5869 * 50 - 50) * 5;
            class336.field4477.field2678 = !class336.field4477.field2678;
            if (class157.field2324 > 3000) {
                class157.field2324 = 3000;
            }
            if (class591.field8440.field5869 >= 2 && class591.field8440.field5870 == 6) {
                this.method2555(-120, "js5connect_outofdate");
                class440.field6254 = 13;
                return;
            }
            if (class591.field8440.field5869 >= 4 && class591.field8440.field5870 == -1) {
                this.method2555(-76, "js5crc");
                class440.field6254 = 13;
                return;
            }
            if (class591.field8440.field5869 >= 4 && class142.method937(class440.field6254, false)) {
                if (class591.field8440.field5870 == 7 || class591.field8440.field5870 == 9) {
                    this.method2555(arg0 - 72, "js5connect_full");
                } else if (class591.field8440.field5870 <= 0) {
                    this.method2555(arg0 - 106, "js5io");
                } else {
                    this.method2555(-84, "js5connect");
                }
                class440.field6254 = 13;
                return;
            }
        }
        class611.field8789 = class591.field8440.field5869;
        if (class157.field2324 > 0) {
            class157.field2324--;
            return;
        }
        try {
            if (class188.field2629 == 0) {
                class122.field1984 = class500.field6968.method1851(class336.field4477.method1178(arg0 + 12623), class336.field4477.field2686, 3298);
                class188.field2629++;
            }
            if (class188.field2629 == 1) {
                if (class122.field1984.field5134 == 2) {
                    this.method1549((byte) -122, 1000);
                    return;
                }
                if (class122.field1984.field5134 == 1) {
                    class188.field2629++;
                }
            }
            if (class188.field2629 == 2) {
                class106.field1602 = new class246((Socket) class122.field1984.field5132, class500.field6968);
                class11 var2 = new class11(5);
                var2.method108((byte) -128, class21.field301.field6351);
                var2.method117(-104, 606);
                class106.field1602.method1521(false, 5, 0, var2.field138);
                class188.field2629++;
                class481.field6787 = class488.method2835(30160);
            }
            if (arg0 != 0) {
                field3473 = null;
            }
            if (class188.field2629 == 3) {
                if (class142.method937(class440.field6254, false) || class106.field1602.method1527(arg0 ^ 0x2) > 0) {
                    int var3 = class106.field1602.method1526(false);
                    if (var3 != 0) {
                        this.method1549((byte) -105, var3);
                        return;
                    }
                    class188.field2629++;
                } else if ((class488.method2835(arg0 ^ 0x75D0) - class481.field6787) > 30000L) {
                    this.method1549((byte) -112, 1001);
                    return;
                }
            }
            if (class188.field2629 == 4) {
                boolean var4 = class440.field6254 == 1 || class340.method2063(class440.field6254, 30645) || class604.method3558(arg0 + 3, class440.field6254);
                class591.field8440.method2487(arg0 ^ 0xC8, !var4, class106.field1602);
                class122.field1984 = null;
                class106.field1602 = null;
                class188.field2629 = 0;
            }
        } catch (IOException var5) {
            this.method1549((byte) -116, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1559(int arg0) {
        if (class597.field8629) {
            class366.field4987 = 64;
        }
        field3462++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class120.method840((byte) 41);
        class320.field4332 = new class444(class500.field6968);
        class591.field8440 = new class414();
        if (class71.field1181 != class53.field988) {
            class20.field250 = new byte[50][];
        }
        class491.field6875 = new class440(class500.field6968);
        if (class71.field1181 == class53.field988) {
            class504.field7014.field2686 = this.getCodeBase().getHost();
        } else if (class625.method3649(class53.field988, -1)) {
            class504.field7014.field2686 = this.getCodeBase().getHost();
            class504.field7014.field2682 = class504.field7014.field2680 + 40000;
            class332.field4446.field2682 = class332.field4446.field2680 + 40000;
            class504.field7014.field2685 = class504.field7014.field2680 + 50000;
            class31.field506.field2682 = class31.field506.field2680 + 40000;
            class332.field4446.field2685 = class332.field4446.field2680 + 50000;
            class31.field506.field2685 = class31.field506.field2680 + 50000;
        } else if (class53.field988 == class270.field3766) {
            class504.field7014.field2686 = "127.0.0.1";
            class332.field4446.field2686 = "127.0.0.1";
            class504.field7014.field2682 = class504.field7014.field2680 + 40000;
            class31.field506.field2686 = "127.0.0.1";
            class332.field4446.field2682 = class332.field4446.field2680 + 40000;
            class504.field7014.field2685 = class504.field7014.field2680 + 50000;
            class31.field506.field2682 = class31.field506.field2680 + 40000;
            class332.field4446.field2685 = class332.field4446.field2680 + 50000;
            class31.field506.field2685 = class31.field506.field2680 + 50000;
        }
        class555.field7654 = class210.field2960 = class487.field6839 = class269.field3762 = new short[256];
        class336.field4477 = class504.field7014;
        if (class37.field767 == class163.field2363) {
            class309.field4173 = class580.field7979;
            class192.field2724 = class84.field1365;
            class304.field4149 = true;
            class45.field852 = 0;
            class532.field7447 = class629.field9205;
            class245.field3413 = class146.field2255;
            class303.field4135 = 16777215;
        } else {
            class245.field3413 = class244.field3402;
            class309.field4173 = class412.field5797;
            class192.field2724 = class379.field5111;
            class532.field7447 = class501.field6989;
        }
        if (class245.field3415 == class163.field2363) {
            class37.field781 = false;
        }
        class316.field4245 = class190.method1185(52, class166.field2390);
        class602.field8697 = class611.method3578(true, class166.field2390, 52);
        if (arg0 != 19611) {
            method1544();
        }
        class312.field4199 = class288.field3965;
        try {
            if (class500.field6968.field3970 != null) {
                class401.field5722 = new class323(class500.field6968.field3970, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class43.field814[var3] = new class323(class500.field6968.field3966[var3], 6000, 0);
                }
                class309.field4170 = new class323(class500.field6968.field3962, 6000, 0);
                class516.field7250 = new class219(255, class401.field5722, class309.field4170, 500000);
                class69.field1168 = new class323(class500.field6968.field3971, 24, 0);
                class500.field6968.field3970 = null;
                class500.field6968.field3971 = null;
                class500.field6968.field3962 = null;
                class500.field6968.field3966 = null;
            }
        } catch (IOException var4) {
            class516.field7250 = null;
            class401.field5722 = null;
            class309.field4170 = null;
            class69.field1168 = null;
        }
        if (class71.field1181 != class53.field988) {
            class137.field2157 = true;
        }
        if (class245.field3415 == class163.field2363) {
            class595.field8613 = class506.field7054.method739(class173.field2491, -90);
        } else if (class37.field767 == class163.field2363) {
            class595.field8613 = class117.field1921.method739(class173.field2491, -125);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1560(byte arg0) {
        if (class103.field1570 == 2) {
            try {
                this.method1542((byte) -28);
            } catch (Throwable var4) {
                class235.method1474(var4, var4.getMessage() + " (Recovered) " + this.method1553(-110), (byte) 115);
                class452.method2658(7, 0);
            }
        } else {
            this.method1542((byte) -28);
        }
        int var3 = -114 / ((arg0 + 47) / 40);
        field3455++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1561(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
