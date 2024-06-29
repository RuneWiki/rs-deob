import java.awt.Canvas;
import java.awt.Color;
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
public class client extends class764 {

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[Lsn;")
    public static class739[] field1305 = new class739[4];

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Ljn;")
    public static class134 field1291 = new class134(1, -1);

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
    public static int[] field1308 = new int[2];

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1309 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "D")
    public static double field1289;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lha;")
    public static class473 field1307;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Ljava/lang/Class;")
    public static Class field1311;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3)
    public static void method769(byte arg0) {
        field1307 = null;
        field1291 = null;
        field1305 = null;
        int var1 = 111 % ((arg0 - 61) / 45);
        field1308 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 18)
    public static final void method770(int arg0) {
        int var1 = class783.field10748;
        int[] var2 = class244.field3610;
        for (int var3 = 0; var3 < class429.field5988 + var1; var3++) {
            class654 var4;
            if (var3 < var1) {
                var4 = class413.field5787[var2[var3]];
            } else {
                var4 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[var3 - var1])).field9573;
            }
            if (var4.field3467 == arg0 && var4.field9199 >= 0) {
                int var5 = var4.method3744(1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3470 & 0x1FF) != 0 || (var4.field3460 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3470 & 0x1FF) != 256 || (var4.field3460 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3470 >> 9;
                    int var7 = var4.field3460 >> 9;
                    if (var4.field9199 > class712.field9919[var6][var7]) {
                        class712.field9919[var6][var7] = var4.field9199;
                        class356.field5138[var6][var7] = 1;
                    } else if (class712.field9919[var6][var7] == var4.field9199) {
                        var10002 = class356.field5138[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3470 - var8 >> 9;
                    int var10 = var4.field3460 - var8 >> 9;
                    int var11 = var4.field3470 + var8 >> 9;
                    int var12 = var4.field3460 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field9199 > class712.field9919[var13][var14]) {
                                class712.field9919[var13][var14] = var4.field9199;
                                class356.field5138[var13][var14] = 1;
                            } else if (class712.field9919[var13][var14] == var4.field9199) {
                                var10002 = class356.field5138[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 116)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class505.method2946("Argument count", (byte) 51);
            }
            class718.field9950 = new class589();
            class718.field9950.field8306 = Integer.parseInt(arg0[0]);
            class367.field5275 = new class589();
            class367.field5275.field8306 = Integer.parseInt(arg0[1]);
            class170.field2161 = new class589();
            class170.field2161.field8306 = Integer.parseInt(arg0[2]);
            class425.field5937 = class107.field1249;
            if (arg0[3].equals("live")) {
                class53.field644 = class65.field721;
            } else if (arg0[3].equals("rc")) {
                class53.field644 = class483.field6691;
            } else if (arg0[3].equals("wip")) {
                class53.field644 = class521.field7192;
            } else {
                class505.method2946("modewhat", (byte) 22);
            }
            class553.field7667 = class647.method3703(0, arg0[4]);
            if (class553.field7667 == -1) {
                if (arg0[4].equals("english")) {
                    class553.field7667 = 0;
                } else if (arg0[4].equals("german")) {
                    class553.field7667 = 1;
                } else {
                    class505.method2946("language", (byte) -110);
                }
            }
            class359.field5181 = false;
            class736.field10137 = false;
            if (arg0[5].equals("game0")) {
                class327.field4603 = class692.field9661;
            } else if (arg0[5].equals("game1")) {
                class327.field4603 = class389.field5550;
            } else if (arg0[5].equals("game2")) {
                class327.field4603 = class467.field6490;
            } else if (arg0[5].equals("game3")) {
                class327.field4603 = class48.field563;
            } else {
                class505.method2946("game", (byte) 82);
            }
            class12.field75 = true;
            class161.field2078 = true;
            class570.field8016 = 0;
            class766.field10546 = null;
            class718.field9946 = 0;
            class457.field6392 = false;
            class291.field4283 = 0;
            class44.field467 = 0L;
            class56.field663 = null;
            class638.field8971 = false;
            class391.field5566 = class327.field4603.field10814;
            class704.field9801 = "";
            client var1 = new client();
            class274.field3958 = var1;
            var1.method4209(768, 646, class327.field4603.field10820, false, (byte) -108, 37, 1024, class53.field644.method2441(3) + 32);
            class43.field453.setLocation(40, 40);
        } catch (Exception var3) {
            class502.method2937(var3, (byte) -115, null);
        }
        field1298++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 202)
    public final void method771(int arg0) {
        if (class638.field8971) {
            class771.field10608 = 64;
        }
        field1300++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class189.method1181(-1);
        class710.field9835 = new class133(class129.field1674);
        class68.field750 = new class424();
        class474.method2827(new int[] { 20, 260 }, 126, new int[] { 1000, 100 });
        if (class425.field5937 != class224.field3414) {
            class81.field904 = new byte[50][];
        }
        class688.field9602 = class230.method1531(3);
        if (class425.field5937 == class224.field3414) {
            class718.field9950.field8299 = this.getCodeBase().getHost();
        } else if (class529.method3142(class425.field5937, 2)) {
            class718.field9950.field8299 = this.getCodeBase().getHost();
            class718.field9950.field8310 = class718.field9950.field8306 + 40000;
            class367.field5275.field8310 = class367.field5275.field8306 + 40000;
            class718.field9950.field8302 = class718.field9950.field8306 + 50000;
            class170.field2161.field8310 = class170.field2161.field8306 + 40000;
            class367.field5275.field8302 = class367.field5275.field8306 + 50000;
            class170.field2161.field8302 = class170.field2161.field8306 + 50000;
        } else if (class425.field5937 == class107.field1249) {
            class718.field9950.field8299 = "127.0.0.1";
            class367.field5275.field8299 = "127.0.0.1";
            class170.field2161.field8299 = "127.0.0.1";
            class718.field9950.field8310 = class718.field9950.field8306 + 40000;
            class367.field5275.field8310 = class367.field5275.field8306 + 40000;
            class170.field2161.field8310 = class170.field2161.field8306 + 40000;
            class718.field9950.field8302 = class718.field9950.field8306 + 50000;
            class367.field5275.field8302 = class367.field5275.field8306 + 50000;
            class170.field2161.field8302 = class170.field2161.field8306 + 50000;
        }
        class735.field10134 = class718.field9950;
        class45.field476 = class429.field5992 = class586.field8273 = class387.field5520 = new short[256];
        int var3 = -82 / ((arg0 + 14) / 53);
        if (class389.field5550 == class327.field4603) {
            class248.field3697 = 0;
            class5.field31 = 16777215;
            class472.field6536 = class422.field5869;
            class140.field1791 = class636.field8941;
            class152.field1997 = true;
        } else if (class48.field563 == class327.field4603) {
            class140.field1791 = class376.field5390;
            class472.field6536 = class75.field835;
        } else {
            class140.field1791 = class655.field9231;
            class472.field6536 = class6.field35;
        }
        if (class692.field9661 == class327.field4603) {
            class149.field1964 = false;
        }
        try {
            class734.field10127 = class274.field3958.getToolkit().getSystemClipboard();
        } catch (Exception var5) {
        }
        class479.field6647 = class170.method1097((byte) 22, class749.field10341);
        class205.field2881 = class612.method3542(true, true, class749.field10341);
        try {
            if (class129.field1674.field10575 != null) {
                class448.field6274 = new class136(class129.field1674.field10575, 5200, 0);
                for (int var4 = 0; var4 < 37; var4++) {
                    class100.field1178[var4] = new class136(class129.field1674.field10566[var4], 6000, 0);
                }
                class514.field7050 = new class136(class129.field1674.field10565, 6000, 0);
                class43.field448 = new class327(255, class448.field6274, class514.field7050, 500000);
                class620.field8693 = new class136(class129.field1674.field10557, 24, 0);
                class129.field1674.field10565 = null;
                class129.field1674.field10575 = null;
                class129.field1674.field10557 = null;
                class129.field1674.field10566 = null;
            }
        } catch (IOException var6) {
            class514.field7050 = null;
            class448.field6274 = null;
            class43.field448 = null;
            class620.field8693 = null;
        }
        if (class425.field5937 != class224.field3414) {
            class493.field6792 = true;
        }
        class32.field305 = class712.field9865.method3999(class553.field7667, (byte) -17);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 331)
    public static final void method772() {
        int var0 = class783.field10748;
        int[] var1 = class244.field3610;
        int var2 = class582.field8241 ? var0 : class429.field5988 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class654 var4;
            if (var3 < var0) {
                var4 = class413.field5787[var1[var3]];
            } else {
                var4 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[var3 - var0])).field9573;
            }
            if (var4.field9199 >= 0) {
                int var5 = var4.method3744(1);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3470 & 0x1FF) == 0 && (var4.field3460 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3470 & 0x1FF) == 256 && (var4.field3460 & 0x1FF) == 256) {
                    continue;
                }
                var4.field3464 = class373.method2316(var4.field3470, var4.field3467, var4.field3460, -127);
                class497.method2922(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;", line = 373)
    public final String method773(byte arg0) {
        field1292++;
        if (arg0 >= -120) {
            return null;
        }
        String var2 = null;
        try {
            var2 = "[1)" + class444.field6151 + "," + class236.field3535 + "," + class741.field10208 + "," + class525.field7224 + "|";
            if (class724.field10031 != null) {
                var2 = var2 + "2)" + class435.field6040 + "," + (class724.field10031.field9219[0] + class444.field6151) + "," + (class724.field10031.field9214[0] + class236.field3535) + "|";
            }
            var2 = var2 + "3)" + class688.field9602.field8517.method2604((byte) -98) + "|4)" + class688.field9602.field8540.method4329((byte) -98) + "|5)" + class647.method3714(53) + "|6)" + class742.field10226 + "," + class249.field3700 + "|";
            var2 = var2 + "7)" + class688.field9602.field8528.method677((byte) -98) + "|";
            var2 = var2 + "8)" + class688.field9602.field8538.method2315((byte) -98) + "|";
            var2 = var2 + "9)" + class688.field9602.field8507.method1714((byte) -98) + "|";
            var2 = var2 + "10)" + class688.field9602.field8506.method1732((byte) -98) + "|";
            var2 = var2 + "11)" + class688.field9602.field8544.method3925((byte) -98) + "|";
            var2 = var2 + "12)" + class688.field9602.field8542.method1756((byte) -98) + "|";
            var2 = var2 + "13)" + class771.field10608 + "|";
            var2 = var2 + "14)" + class664.field9331;
            if (class495.field6813 != null) {
                var2 = var2 + "|15)" + class495.field6813.field6744;
            }
            try {
                if (class688.field9602.field8517.method2604((byte) -98) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1311 == null ? (field1311 = method796("client")) : field1311).getClassLoader());
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
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 456)
    public final void method774(int arg0) {
        field1302++;
        if (class688.field9602.field8517.method2604((byte) -98) == 2) {
            try {
                this.method791(false);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class502.method2937(var5, (byte) 124, var5.getMessage() + " (Recovered) " + this.method773((byte) -125));
                class365.field5257 = true;
                class532.method3154(0, false, 1);
            }
        } else {
            this.method791(false);
        }
        if (arg0 <= 24) {
            this.method795((byte) -14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 482)
    public static final void method775() {
        class50.field604 = 0;
        for (int var0 = 0; var0 < class429.field5988; var0++) {
            class359 var1 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[var0])).field9573;
            if (var1.field9136 && var1.method2255(-10144) != -1) {
                int var2 = (var1.method3744(1) - 1) * 256 + 252;
                int var3 = var1.field3470 - var2 >> 9;
                int var4 = var1.field3460 - var2 >> 9;
                class654 var5 = class167.method1050(var4, var3, var1.field3467, (byte) -128);
                if (var5 != null) {
                    int var6 = var5.field9186;
                    if (var5 instanceof class359) {
                        var6 += 2048;
                    }
                    if (var5.field9134 == 0 && var5.method2255(-10144) != -1) {
                        class759.field10429[class50.field604] = var6;
                        class418.field5817[class50.field604] = var6;
                        class50.field604++;
                        var5.field9134++;
                    }
                    class759.field10429[class50.field604] = var6;
                    class418.field5817[class50.field604] = var1.field9186 + 2048;
                    class50.field604++;
                    var5.field9134++;
                }
            }
        }
        class424.method2560(class50.field604 - 1, 0, (byte) 62, class418.field5817, class759.field10429);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 534)
    private final void method776(int arg0, int arg1) {
        field1296++;
        class68.field750.field5909++;
        class290.field4277 = null;
        class57.field672 = arg0;
        class68.field750.field5908 = arg1;
        class273.field3955 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 548)
    private final void method777(int arg0) {
        field1290++;
        if (class664.field9331 == 14) {
            return;
        }
        class533.field7336++;
        if (class533.field7336 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class332.field4720 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class33.field321.setSeed((long) class332.field4720);
        }
        if ((class533.field7336 % 50) == 0) {
            class59.field685 = class510.field6922;
            class510.field6922 = 0;
            class277.field3992 = class495.field6815;
            class495.field6815 = 0;
        }
        this.method778((byte) 125);
        if (class203.field2847 != null) {
            class203.field2847.method94((byte) -29);
        }
        class751.method4155((byte) 115);
        class457.method2750(-10);
        if (arg0 >= -81) {
            this.method795((byte) 123);
        }
        class479.field6647.method270(684998560);
        class205.field2881.method360((byte) -120);
        if (class111.field1332 != null) {
            class111.field1332.method232((int) class683.method3903((byte) 4));
        }
        class261.method1720(5888);
        class572.field8055 = 0;
        class94.field1099 = 0;
        for (class659 var3 = class479.field6647.method272((byte) 17); var3 != null; var3 = class479.field6647.method272((byte) 17)) {
            int var6 = var3.method731(-16904);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method733((byte) -82);
                if (class204.method1307(89) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class188.method1178(44)) {
                        class175.method1120(92);
                    } else {
                        class577.method3378((byte) -58);
                    }
                } else if (class94.field1099 < 128) {
                    class462.field6462[class94.field1099] = var3;
                    class94.field1099++;
                }
            } else if (var6 == 0 && class572.field8055 < 75) {
                class346.field5040[class572.field8055] = var3;
                class572.field8055++;
            }
        }
        class637.field8957 = 0;
        for (class620 var4 = class205.field2881.method359(0); var4 != null; var4 = class205.field2881.method359(0)) {
            int var5 = var4.method1627(false);
            if (var5 == -1) {
                class179.field2264.method1039(var4, 0);
            } else if (var5 == 6) {
                class637.field8957 += var4.method1625(8459);
            } else if (class424.method2554(-104, var5)) {
                class297.field4326.method1039(var4, 0);
                if (class297.field4326.method1036((byte) -20) > 10) {
                    class297.field4326.method1034(20791);
                }
            }
        }
        if (class188.method1178(74)) {
            class605.method3495((byte) 109);
        }
        if (class274.method1783(118, class664.field9331)) {
            class189.method1184(true);
            class54.method460(-1);
        } else if (class363.method2286((byte) -24, class664.field9331)) {
            class625.method3603(1580965795);
        }
        if (class760.method4198(class664.field9331, 2) && !class363.method2286((byte) -24, class664.field9331)) {
            this.method793((byte) 109);
            class195.method1279(110);
            class432.method2588(-11);
        } else if (class232.method1593((byte) -123, class664.field9331) && !class363.method2286((byte) -24, class664.field9331)) {
            this.method793((byte) 103);
            class432.method2588(-11);
        } else if (class664.field9331 == 12) {
            class432.method2588(-11);
        } else if (class203.method1303(class664.field9331, true) && !class363.method2286((byte) -24, class664.field9331)) {
            class60.method484(0);
        } else if (class664.field9331 == 13) {
            class432.method2588(-11);
            if (class687.field9591 != -3 && class687.field9591 != 2 && class687.field9591 != 15) {
                class570.method3355((byte) 117, false);
            }
        }
        class447.method2711(class111.field1332, (byte) -84);
        class297.field4326.method1034(20791);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 714)
    private final void method778(byte arg0) {
        field1287++;
        boolean var2 = class68.field750.method2557(-24841);
        if (!var2) {
            this.method784((byte) 24);
        }
        if (arg0 <= 76) {
            this.method776(58, 120);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsha;)Lnp;", line = 731)
    public static final class174 method779(class115 arg0) {
        class174 var1 = (class174) class638.field8966.method3669(false, ((long) arg0.field1446 << 32) + (long) arg0.field1482);
        return var1 == null ? arg0.field1500 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 738)
    public static final int method780(String arg0, byte arg1) {
        if (arg1 != 66) {
            method794();
        }
        field1301++;
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 749)
    public final void init() {
        field1288++;
        if (!this.method4218(true)) {
            return;
        }
        class718.field9950 = new class589();
        class718.field9950.field8306 = Integer.parseInt(this.getParameter("worldid"));
        class367.field5275 = new class589();
        class367.field5275.field8306 = Integer.parseInt(this.getParameter("lobbyid"));
        class367.field5275.field8299 = this.getParameter("lobbyaddress");
        class170.field2161 = new class589();
        class170.field2161.field8306 = Integer.parseInt(this.getParameter("demoid"));
        class170.field2161.field8299 = this.getParameter("demoaddress");
        class425.field5937 = class590.method3456(Integer.parseInt(this.getParameter("modewhere")), 0);
        if (class425.field5937 == class107.field1249) {
            class425.field5937 = class645.field9029;
        } else if (!class529.method3142(class425.field5937, 2) && class425.field5937 != class224.field3414) {
            class425.field5937 = class224.field3414;
        }
        class53.field644 = class568.method3348(Integer.parseInt(this.getParameter("modewhat")), 30474);
        if (class53.field644 != class521.field7192 && class53.field644 != class483.field6691 && class65.field721 != class53.field644) {
            class53.field644 = class65.field721;
        }
        try {
            class553.field7667 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class553.field7667 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class736.field10137 = true;
        } else {
            class736.field10137 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class359.field5181 = true;
        } else {
            class359.field5181 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class529.field7258 = true;
        } else {
            class529.field7258 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class327.field4603 = class692.field9661;
            } else if (var4.equals("1")) {
                class327.field4603 = class389.field5550;
            } else if (var4.equals("2")) {
                class327.field4603 = class467.field6490;
            } else if (var4.equals("3")) {
                class327.field4603 = class48.field563;
            }
        }
        try {
            class718.field9946 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class718.field9946 = 0;
        }
        class25.field232 = this.getParameter("quiturl");
        class704.field9801 = this.getParameter("settings");
        if (class704.field9801 == null) {
            class704.field9801 = "";
        }
        class629.field8814 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class570.field8016 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class570.field8016 = 0;
            }
        }
        class391.field5566 = Integer.parseInt(this.getParameter("colourid"));
        if (class391.field5566 < 0 || class524.field7212.length <= class391.field5566) {
            class391.field5566 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class12.field75 = true;
            class161.field2078 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class457.field6392 = true;
        }
        class766.field10546 = this.getParameter("sskey");
        if (class766.field10546 != null && class766.field10546.length() < 2) {
            class766.field10546 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class638.field8971 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class291.field4283 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class44.field467 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class56.field663 = this.getParameter("additionalInfo");
        if (class56.field663 != null && class56.field663.length() > 50) {
            class56.field663 = null;
        }
        if (class692.field9661 == class327.field4603) {
            class565.field7983 = 503;
            class456.field6378 = 765;
        } else if (class389.field5550 == class327.field4603) {
            class565.field7983 = 480;
            class456.field6378 = 640;
        }
        class274.field3958 = this;
        this.method4213(class327.field4603.field10820, class565.field7983, 646, class456.field6378, 37, 0, class53.field644.method2441(3) + 32);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 920)
    public final void method781(byte arg0) {
        if (class489.field6728) {
            class775.method4276((byte) -21);
        }
        field1293++;
        class770.method4252(13593);
        if (class111.field1332 != null) {
            class111.field1332.method2821((byte) 108);
        }
        if (class661.field9305 != null) {
            class119.method851(class129.field1674, -1, class661.field9305);
            class661.field9305 = null;
        }
        if (class679.field9490 != null) {
            class679.field9490.method3634(22654);
            class679.field9490 = null;
        }
        class586.method3439(7);
        class68.field750.method2551((byte) -64);
        class710.field9835.method901((byte) -103);
        if (class791.field10838 != null) {
            class791.field10838.method2051(123);
            class791.field10838 = null;
        }
        try {
            class448.field6274.method912(1);
            int var2 = 0;
            if (arg0 > -7) {
                method794();
            }
            while (var2 < 37) {
                class100.field1178[var2].method912(1);
                var2++;
            }
            class514.field7050.method912(1);
            class620.field8693.method912(1);
            class742.method4112((byte) 81);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 976)
    public static final void method782() {
        for (int var0 = 0; var0 < class741.field10208; var0++) {
            int[] var1 = class712.field9919[var0];
            for (int var2 = 0; var2 < class525.field7224; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 993)
    public final synchronized void method783(int arg0) {
        field1303++;
        if (arg0 != 6868) {
            return;
        }
        if (class511.field7007 != null && class749.field10341 == null && !class129.field1674.field10561) {
            try {
                Class var2 = class511.field7007.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class749.field10341 = (Canvas) var3.get(class511.field7007);
                var3.set(class511.field7007, null);
                if (class749.field10341 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method783(arg0);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1025)
    private final void method784(byte arg0) {
        field1286++;
        if (arg0 != 24) {
            field1308 = null;
        }
        if (class68.field750.field5909 > class442.field6086) {
            class735.field10134.method3452(-113);
            class381.field5454 = (class68.field750.field5909 * 50 - 50) * 5;
            if (class381.field5454 > 3000) {
                class381.field5454 = 3000;
            }
            if (class68.field750.field5909 >= 2 && class68.field750.field5908 == 6) {
                this.method4212(24, "js5connect_outofdate");
                class664.field9331 = 14;
                return;
            }
            if (class68.field750.field5909 >= 4 && class68.field750.field5908 == -1) {
                this.method4212(50, "js5crc");
                class664.field9331 = 14;
                return;
            }
            if (class68.field750.field5909 >= 4 && class274.method1783(83, class664.field9331)) {
                if (class68.field750.field5908 == 7 || class68.field750.field5908 == 9) {
                    this.method4212(-112, "js5connect_full");
                } else if (class68.field750.field5908 <= 0) {
                    this.method4212(arg0 ^ 0xFFFFFF94, "js5io");
                } else if (class601.field8409 == null) {
                    this.method4212(-83, "js5connect");
                } else {
                    this.method4212(-95, "js5proxy_" + class601.field8409.trim());
                }
                class664.field9331 = 14;
                return;
            }
        }
        class442.field6086 = class68.field750.field5909;
        if (class381.field5454 > 0) {
            class381.field5454--;
            return;
        }
        try {
            if (class57.field672 == 0) {
                class273.field3955 = class735.field10134.method3450(class129.field1674, (byte) -101);
                class57.field672++;
            }
            if (class57.field672 == 1) {
                if (class273.field3955.field4970 == 2) {
                    if (class273.field3955.field4975 != null) {
                        class601.field8409 = (String) class273.field3955.field4975;
                    }
                    this.method776(0, 1000);
                    return;
                }
                if (class273.field3955.field4970 == 1) {
                    class57.field672++;
                }
            }
            if (class57.field672 == 2) {
                class290.field4277 = new class313((Socket) class273.field3955.field4975, class129.field1674, 25000);
                class511 var2 = new class511(5);
                var2.method3005(arg0 ^ 0xE7, class377.field5412.field4450);
                var2.method3003(646, -23061);
                class290.field4277.method2015(0, 5, var2.field6979, arg0 ^ 0x19);
                class57.field672++;
                class473.field6569 = class683.method3903((byte) 4);
            }
            if (class57.field672 == 3) {
                if (class274.method1783(32, class664.field9331) || class290.field4277.method2013((byte) 49) > 0) {
                    int var3 = class290.field4277.method2010(0);
                    if (var3 != 0) {
                        this.method776(0, var3);
                        return;
                    }
                    class57.field672++;
                } else if ((class683.method3903((byte) 4) - class473.field6569) > 30000L) {
                    this.method776(0, 1001);
                    return;
                }
            }
            if (class57.field672 == 4) {
                boolean var4 = class274.method1783(arg0 ^ 0x5, class664.field9331) || class760.method4198(class664.field9331, 2) || class232.method1593((byte) -121, class664.field9331);
                class455[] var5 = class455.method2742(-2);
                class511 var6 = new class511(var5.length * 4);
                class290.field4277.method2017(-114, var6.field6979.length, var6.field6979, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method2745(false, var6.method3008(64));
                }
                class68.field750.method2556(-113, !var4, class290.field4277);
                class57.field672 = 0;
                class290.field4277 = null;
                class273.field3955 = null;
            }
        } catch (IOException var8) {
            this.method776(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 1189)
    public static final void method785(int arg0, int arg1) {
        field1297++;
        class17 var2 = class245.method1634(1, (long) arg1, arg0);
        var2.method69(13);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lsha;)Lsha;", line = 1200)
    public static final class115 method786(class115 arg0) {
        int var1 = method779(arg0).method1115(-852618862);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class384.method2387(false, arg0.field1436);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lsha;IIIIIIIIIII)V", line = 1221)
    public static final void method787(class115[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class115 var13 = arg0[var12];
            if (var13 != null && var13.field1436 == arg1) {
                int var14 = var13.field1408 + arg6;
                int var15 = var13.field1503 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field1564 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field1560 + var14;
                    int var21 = var13.field1517 + var15;
                    if (var13.field1564 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field1564 == 0 || var13.field1476 || method779(var13).field2201 != 0 || class434.field6028 == var13 || class526.field7241 == var13.field1553 || class379.field5441 == var13.field1553) {
                    if (!method788(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class55.field651) {
                            var22 = class236.method1611(-5110);
                            var23 = class339.method2149((byte) 98);
                        }
                        if (class81.field906 == var13 && class607.method3506((byte) 9, class81.field906) != null) {
                            class86.field1036 = true;
                            class48.field560 = var14;
                            class372.field5347 = var15;
                        }
                        if (var13.field1512 || var16 < var18 && var17 < var19) {
                            if (var13.field1406 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class114 var24 = (class114) class495.field6812.method1041(1048832); var24 != null; var24 = (class114) class495.field6812.method1033(-1)) {
                                    if (var24.field1385) {
                                        var24.method527(-11229);
                                        var24.field1378.field1498 = false;
                                    }
                                }
                                if (class161.field2084 == 0) {
                                    class81.field906 = null;
                                    class434.field6028 = null;
                                }
                                class559.field7871 = 0;
                                class436.field6053 = false;
                                class718.field9945 = false;
                                if (!class263.field3850) {
                                    class442.method2652(-16777216);
                                }
                            }
                            boolean var25;
                            if (class205.field2881.method354((byte) -20) + var22 >= var16 && class205.field2881.method351(-25269) + var23 >= var17 && class205.field2881.method354((byte) -20) + var22 < var18 && class205.field2881.method351(-25269) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class773.field10644 && var25) {
                                if (var13.field1412 >= 0) {
                                    class213.field2954 = var13.field1412;
                                } else if (var13.field1406) {
                                    class213.field2954 = -1;
                                }
                            }
                            if (!class263.field3850 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class514.method3062(arg10 - var14, (byte) -107, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class205.field2881.method352((byte) -110) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class620 var28 = (class620) class297.field4326.method1041(1048832);
                            if (var28 != null && var28.method1627(false) == 0 && var28.method1623(true) + var22 >= var16 && var28.method1626(83) + var23 >= var17 && var28.method1623(true) + var22 < var18 && var28.method1626(71) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field1430 != null && !class188.method1178(45)) {
                                for (int var29 = 0; var29 < var13.field1430.length; var29++) {
                                    if (class479.field6647.method273(var13.field1430[var29], Integer.MAX_VALUE)) {
                                        if (var13.field1523 == null || class533.field7336 >= var13.field1523[var29]) {
                                            byte var30 = var13.field1400[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class479.field6647.method273(86, Integer.MAX_VALUE) && !class479.field6647.method273(82, Integer.MAX_VALUE) && !class479.field6647.method273(81, Integer.MAX_VALUE)) && ((var30 & 0x2) == 0 || class479.field6647.method273(86, Integer.MAX_VALUE)) && ((var30 & 0x1) == 0 || class479.field6647.method273(82, Integer.MAX_VALUE)) && ((var30 & 0x4) == 0 || class479.field6647.method273(81, Integer.MAX_VALUE))) {
                                                if (var29 < 10) {
                                                    class212.method1331(-1, var13.field1446, "", -99, var29 + 1);
                                                } else if (var29 == 10) {
                                                    class76.method561(-1);
                                                    class174 var31 = method779(var13);
                                                    class646.method3700(5, var13, var31.field2203, var31.method1112((byte) 53));
                                                    class56.field656 = class548.method3244(var13, 11969);
                                                    if (class56.field656 == null) {
                                                        class56.field656 = "Null";
                                                    }
                                                    class523.field7205 = var13.field1504 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field1485[var29];
                                                if (var13.field1523 == null) {
                                                    var13.field1523 = new int[var13.field1430.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field1523[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field1523[var29] = class533.field7336 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field1523 != null) {
                                        var13.field1523[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class558.method3287(var13, var23 + var28.method1626(42) - var15, var22 + var28.method1623(true) - var14, 100);
                            }
                            if (class81.field906 != null && class81.field906 != var13 && var25 && method779(var13).method1106(-127)) {
                                class31.field296 = var13;
                            }
                            if (class434.field6028 == var13) {
                                class475.field6583 = true;
                                class518.field7144 = var14;
                                class474.field6579 = var15;
                            }
                            if (var13.field1476 || var13.field1553 != 0) {
                                if (var25 && class637.field8957 != 0 && var13.field1419 != null) {
                                    class114 var33 = new class114();
                                    var33.field1385 = true;
                                    var33.field1378 = var13;
                                    var33.field1372 = class637.field8957;
                                    var33.field1384 = var13.field1419;
                                    class495.field6812.method1039(var33, 0);
                                }
                                if (class81.field906 != null || class263.field3850 || class459.field6417 != var13.field1553 && class559.field7871 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field1553 != 0) {
                                    if (class166.field2124 == var13.field1553 || class234.field3514 == var13.field1553) {
                                        class53.field643 = var13;
                                        if (class516.field7081 != null) {
                                            class516.field7081.method2306(class111.field1332, (byte) 36, var13.field1517);
                                        }
                                        if (class166.field2124 == var13.field1553) {
                                            if (class263.field3850 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class409.method2500(class111.field1332, arg9, arg8, 254240553);
                                            class154 var34 = (class154) class580.field8153.method3103((byte) 72);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field2014 && arg10 < var34.field2016 && arg11 >= var34.field2012 && arg11 < var34.field2017) {
                                                    class442.method2652(-16777216);
                                                    class305.method1986(var34.field2015, 120);
                                                }
                                                var34 = (class154) class580.field8153.method3104(-10964);
                                            }
                                        }
                                    }
                                    if (class526.field7241 == var13.field1553) {
                                        if (var13.method843(class111.field1332, 1531777828) == null || class255.field3779 != 0 && class255.field3779 != 3 || class263.field3850 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field1506[var36];
                                        if (var35 < var37 || var35 > var13.field1399[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field1560 / 2;
                                        int var39 = var36 - var13.field1517 / 2;
                                        int var40;
                                        if (class695.field9691 == 4) {
                                            var40 = (int) class702.field9790 & 0x3FFF;
                                        } else {
                                            var40 = (int) class702.field9790 + class703.field9795 & 0x3FFF;
                                        }
                                        int var41 = class448.field6265[var40];
                                        int var42 = class448.field6270[var40];
                                        if (class695.field9691 != 4) {
                                            var41 = (class686.field9577 + 256) * var41 >> 8;
                                            var42 = (class686.field9577 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class695.field9691 == 4) {
                                            var45 = (class568.field8011 >> 9) + (var43 >> 2);
                                            var46 = (class177.field2234 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class724.field10031.method3744(1) - 1) * 256;
                                            var45 = (class724.field10031.field3470 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class724.field10031.field3460 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class773.field10644 && (class774.field10657 & 0x40) != 0) {
                                            class115 var48 = class446.method2705(class539.field7462, 35, class326.field4586);
                                            if (var48 == null) {
                                                class76.method561(-1);
                                            } else {
                                                class86.method647((long) (var13.field1482 << 0 | var13.field1446), class56.field656, var46, false, 1L, " ->", 15, class50.field602, var13.field1458, 79, true, var45, true);
                                            }
                                            continue;
                                        }
                                        if (class389.field5550 == class327.field4603) {
                                            class86.method647(0L, class712.field9880.method3999(class553.field7667, (byte) -110), var46, false, 1L, "", 59, -1, -1, 108, true, var45, true);
                                        }
                                        class86.method647(0L, class633.field8839, var46, false, 1L, "", 45, class345.field5008, -1, 99, true, var45, true);
                                        continue;
                                    }
                                    if (class459.field6417 == var13.field1553) {
                                        class378.field5431 = var13;
                                        if (var25) {
                                            class436.field6053 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1623(true) - var14 - var13.field1560 / 2) * 2.0D / (double) class46.field489);
                                            int var50 = (int) (-((double) (var23 + var28.method1626(100) - var15 - var13.field1517 / 2) * 2.0D / (double) class46.field489));
                                            int var51 = class612.field8623 + var49 + class46.field503;
                                            int var52 = class744.field10276 + var50 + class46.field511;
                                            class305 var53 = class591.method3457(-23350);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1991(-256, var54, var52, var51);
                                            if (var54 != null) {
                                                if (class479.field6647.method273(82, Integer.MAX_VALUE) && class597.field8370 > 0) {
                                                    class250.method1680(var54[1], var54[2], var54[0], (byte) -123);
                                                    continue;
                                                }
                                                class718.field9945 = true;
                                                class2.field14 = var54[0];
                                                class4.field27 = var54[1];
                                                class206.field2894 = var54[2];
                                            }
                                            class559.field7871 = 1;
                                            class256.field3785 = false;
                                            class539.field7463 = class205.field2881.method354((byte) -20);
                                            class189.field2371 = class205.field2881.method351(-25269);
                                            continue;
                                        }
                                        if (var26 && class559.field7871 > 0) {
                                            if (class559.field7871 == 1 && (class539.field7463 != class205.field2881.method354((byte) -20) || class189.field2371 != class205.field2881.method351(-25269))) {
                                                class707.field9825 = class612.field8623;
                                                class169.field2149 = class744.field10276;
                                                class559.field7871 = 2;
                                            }
                                            if (class559.field7871 == 2) {
                                                class256.field3785 = true;
                                                class669.method3821(class707.field9825 + (int) ((double) (class539.field7463 - class205.field2881.method354((byte) -20)) * 2.0D / (double) class46.field494), 30019);
                                                class259.method1712(-1, class169.field2149 - (int) ((double) (class189.field2371 - class205.field2881.method351(-25269)) * 2.0D / (double) class46.field494));
                                            }
                                            continue;
                                        }
                                        if (class559.field7871 > 0 && !class256.field3785) {
                                            if ((class232.field3488 == 1 || class361.method2270((byte) 60)) && class640.field8992 > 2) {
                                                class149.method991(class189.field2371, class539.field7463, 28694);
                                            } else if (class392.method2421((byte) -128)) {
                                                class149.method991(class189.field2371, class539.field7463, 28694);
                                            }
                                        }
                                        class559.field7871 = 0;
                                        continue;
                                    }
                                    if (class691.field9649 == var13.field1553) {
                                        if (var26) {
                                            class477.method2842(var13.field1517, var23 + class205.field2881.method351(-25269) - var15, -119, var13.field1560, var22 + class205.field2881.method354((byte) -20) - var14);
                                        }
                                        continue;
                                    }
                                    if (class379.field5441 == var13.field1553) {
                                        class400.method2459(var15, var14, var13, 5510);
                                        continue;
                                    }
                                }
                                if (!var13.field1450 && var27) {
                                    var13.field1450 = true;
                                    if (var13.field1507 != null) {
                                        class114 var55 = new class114();
                                        var55.field1385 = true;
                                        var55.field1378 = var13;
                                        var55.field1383 = var22 + var28.method1623(true) - var14;
                                        var55.field1372 = var23 + var28.method1626(47) - var15;
                                        var55.field1384 = var13.field1507;
                                        class495.field6812.method1039(var55, 0);
                                    }
                                }
                                if (var13.field1450 && var26 && var13.field1397 != null) {
                                    class114 var56 = new class114();
                                    var56.field1385 = true;
                                    var56.field1378 = var13;
                                    var56.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                    var56.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                    var56.field1384 = var13.field1397;
                                    class495.field6812.method1039(var56, 0);
                                }
                                if (var13.field1450 && !var26) {
                                    var13.field1450 = false;
                                    if (var13.field1465 != null) {
                                        class114 var57 = new class114();
                                        var57.field1385 = true;
                                        var57.field1378 = var13;
                                        var57.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                        var57.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                        var57.field1384 = var13.field1465;
                                        class194.field2593.method1039(var57, 0);
                                    }
                                }
                                if (var26 && var13.field1438 != null) {
                                    class114 var58 = new class114();
                                    var58.field1385 = true;
                                    var58.field1378 = var13;
                                    var58.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                    var58.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                    var58.field1384 = var13.field1438;
                                    class495.field6812.method1039(var58, 0);
                                }
                                if (!var13.field1498 && var25) {
                                    var13.field1498 = true;
                                    if (var13.field1437 != null) {
                                        class114 var59 = new class114();
                                        var59.field1385 = true;
                                        var59.field1378 = var13;
                                        var59.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                        var59.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                        var59.field1384 = var13.field1437;
                                        class495.field6812.method1039(var59, 0);
                                    }
                                }
                                if (var13.field1498 && var25 && var13.field1409 != null) {
                                    class114 var60 = new class114();
                                    var60.field1385 = true;
                                    var60.field1378 = var13;
                                    var60.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                    var60.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                    var60.field1384 = var13.field1409;
                                    class495.field6812.method1039(var60, 0);
                                }
                                if (var13.field1498 && !var25) {
                                    var13.field1498 = false;
                                    if (var13.field1519 != null) {
                                        class114 var61 = new class114();
                                        var61.field1385 = true;
                                        var61.field1378 = var13;
                                        var61.field1383 = var22 + class205.field2881.method354((byte) -20) - var14;
                                        var61.field1372 = var23 + class205.field2881.method351(-25269) - var15;
                                        var61.field1384 = var13.field1519;
                                        class194.field2593.method1039(var61, 0);
                                    }
                                }
                                if (var13.field1471 != null) {
                                    class114 var62 = new class114();
                                    var62.field1378 = var13;
                                    var62.field1384 = var13.field1471;
                                    class485.field6704.method1039(var62, 0);
                                }
                                if (var13.field1416 != null && class79.field893 > var13.field1454) {
                                    if (var13.field1395 == null || class79.field893 - var13.field1454 > 32) {
                                        class114 var67 = new class114();
                                        var67.field1378 = var13;
                                        var67.field1384 = var13.field1416;
                                        class495.field6812.method1039(var67, 0);
                                    } else {
                                        label711: for (int var63 = var13.field1454; var63 < class79.field893; var63++) {
                                            int var64 = class492.field6783[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field1395.length; var65++) {
                                                if (var13.field1395[var65] == var64) {
                                                    class114 var66 = new class114();
                                                    var66.field1378 = var13;
                                                    var66.field1384 = var13.field1416;
                                                    class495.field6812.method1039(var66, 0);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1454 = class79.field893;
                                }
                                if (var13.field1396 != null && class208.field2904 > var13.field1433) {
                                    if (var13.field1487 == null || class208.field2904 - var13.field1433 > 32) {
                                        class114 var72 = new class114();
                                        var72.field1378 = var13;
                                        var72.field1384 = var13.field1396;
                                        class495.field6812.method1039(var72, 0);
                                    } else {
                                        label687: for (int var68 = var13.field1433; var68 < class208.field2904; var68++) {
                                            int var69 = class687.field9592[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field1487.length; var70++) {
                                                if (var13.field1487[var70] == var69) {
                                                    class114 var71 = new class114();
                                                    var71.field1378 = var13;
                                                    var71.field1384 = var13.field1396;
                                                    class495.field6812.method1039(var71, 0);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1433 = class208.field2904;
                                }
                                if (var13.field1486 != null && class673.field9448 > var13.field1442) {
                                    if (var13.field1453 == null || class673.field9448 - var13.field1442 > 32) {
                                        class114 var77 = new class114();
                                        var77.field1378 = var13;
                                        var77.field1384 = var13.field1486;
                                        class495.field6812.method1039(var77, 0);
                                    } else {
                                        label663: for (int var73 = var13.field1442; var73 < class673.field9448; var73++) {
                                            int var74 = class276.field3983[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field1453.length; var75++) {
                                                if (var13.field1453[var75] == var74) {
                                                    class114 var76 = new class114();
                                                    var76.field1378 = var13;
                                                    var76.field1384 = var13.field1486;
                                                    class495.field6812.method1039(var76, 0);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1442 = class673.field9448;
                                }
                                if (var13.field1418 != null && class764.field10507 > var13.field1403) {
                                    if (var13.field1405 == null || class764.field10507 - var13.field1403 > 32) {
                                        class114 var82 = new class114();
                                        var82.field1378 = var13;
                                        var82.field1384 = var13.field1418;
                                        class495.field6812.method1039(var82, 0);
                                    } else {
                                        label639: for (int var78 = var13.field1403; var78 < class764.field10507; var78++) {
                                            int var79 = class43.field461[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field1405.length; var80++) {
                                                if (var13.field1405[var80] == var79) {
                                                    class114 var81 = new class114();
                                                    var81.field1378 = var13;
                                                    var81.field1384 = var13.field1418;
                                                    class495.field6812.method1039(var81, 0);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1403 = class764.field10507;
                                }
                                if (var13.field1388 != null && class409.field5747 > var13.field1499) {
                                    if (var13.field1460 == null || class409.field5747 - var13.field1499 > 32) {
                                        class114 var87 = new class114();
                                        var87.field1378 = var13;
                                        var87.field1384 = var13.field1388;
                                        class495.field6812.method1039(var87, 0);
                                    } else {
                                        label615: for (int var83 = var13.field1499; var83 < class409.field5747; var83++) {
                                            int var84 = class314.field4509[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field1460.length; var85++) {
                                                if (var13.field1460[var85] == var84) {
                                                    class114 var86 = new class114();
                                                    var86.field1378 = var13;
                                                    var86.field1384 = var13.field1388;
                                                    class495.field6812.method1039(var86, 0);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field1499 = class409.field5747;
                                }
                                if (class323.field4563 > var13.field1547 && var13.field1537 != null) {
                                    class114 var88 = new class114();
                                    var88.field1378 = var13;
                                    var88.field1384 = var13.field1537;
                                    class495.field6812.method1039(var88, 0);
                                }
                                if (class345.field5014 > var13.field1547 && var13.field1425 != null) {
                                    class114 var89 = new class114();
                                    var89.field1378 = var13;
                                    var89.field1384 = var13.field1425;
                                    class495.field6812.method1039(var89, 0);
                                }
                                if (class284.field4090 > var13.field1547 && var13.field1402 != null) {
                                    class114 var90 = new class114();
                                    var90.field1378 = var13;
                                    var90.field1384 = var13.field1402;
                                    class495.field6812.method1039(var90, 0);
                                }
                                if (class25.field229 > var13.field1547 && var13.field1461 != null) {
                                    class114 var91 = new class114();
                                    var91.field1378 = var13;
                                    var91.field1384 = var13.field1461;
                                    class495.field6812.method1039(var91, 0);
                                }
                                if (class747.field10320 > var13.field1547 && var13.field1515 != null) {
                                    class114 var92 = new class114();
                                    var92.field1378 = var13;
                                    var92.field1384 = var13.field1515;
                                    class495.field6812.method1039(var92, 0);
                                }
                                if (class497.field6824 > var13.field1547 && var13.field1441 != null) {
                                    class114 var93 = new class114();
                                    var93.field1378 = var13;
                                    var93.field1384 = var13.field1441;
                                    class495.field6812.method1039(var93, 0);
                                }
                                if (class137.field1757 > var13.field1547 && var13.field1520 != null) {
                                    class114 var94 = new class114();
                                    var94.field1378 = var13;
                                    var94.field1384 = var13.field1520;
                                    class495.field6812.method1039(var94, 0);
                                }
                                var13.field1547 = class453.field6312;
                                if (var13.field1525 != null) {
                                    for (int var95 = 0; var95 < class94.field1099; var95++) {
                                        class114 var96 = new class114();
                                        var96.field1378 = var13;
                                        var96.field1379 = class462.field6462[var95].method727(17788);
                                        var96.field1380 = class462.field6462[var95].method733((byte) -71);
                                        var96.field1384 = var13.field1525;
                                        class495.field6812.method1039(var96, 0);
                                    }
                                }
                                if (class477.field6613 && var13.field1466 != null) {
                                    class114 var97 = new class114();
                                    var97.field1378 = var13;
                                    var97.field1384 = var13.field1466;
                                    class495.field6812.method1039(var97, 0);
                                }
                            }
                            if (var13.field1564 == 5 && var13.field1502 != -1) {
                                var13.method829(class72.field790, class651.field9101, (byte) -72).method2306(class111.field1332, (byte) 36, var13.field1517);
                            }
                            class410.method2504(var13, 0);
                            if (var13.field1564 == 0) {
                                method787(arg0, var13.field1446, var16, var17, var18, var19, var14 - var13.field1559, var15 - var13.field1495, arg8, arg9, arg10, arg11);
                                if (var13.field1394 != null) {
                                    method787(var13.field1394, var13.field1446, var16, var17, var18, var19, var14 - var13.field1559, var15 - var13.field1495, arg8, arg9, arg10, arg11);
                                }
                                class610 var98 = (class610) class278.field3993.method3669(false, (long) var13.field1446);
                                if (var98 != null) {
                                    if (class692.field9661 == class327.field4603 && var98.field8598 == 0 && !class263.field3850 && var25 && !class635.field8860) {
                                        class442.method2652(-16777216);
                                    }
                                    class121.method854(var14, var16, arg9, var18, var17, var19, arg10, arg8, var15, arg11, var98.field8600, false);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class410.method2504(var13, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lsha;)Z", line = 2150)
    public static final boolean method788(class115 arg0) {
        if (class635.field8860) {
            if (method779(arg0).field2201 != 0) {
                return false;
            }
            if (arg0.field1564 == 0) {
                return false;
            }
        }
        return arg0.field1489;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2164)
    public final void method789(byte arg0) {
        field1294++;
        method769((byte) -109);
        class745.method4123(true);
        class17.method65(-117);
        class712.method4000(0);
        class140.method929((byte) 123);
        class45.method355(0);
        class110.method803(0);
        class455.method2741(false);
        class302.method1977(219386388);
        class349.method2203((byte) 106);
        class648.method3716(34836);
        class450.method2721(true);
        class730.method4057(2);
        class49.method415(-4480);
        class69.method528(23959);
        class179.method1135(-1690834428);
        class638.method3665(1083);
        class764.method4211(-1);
        class550.method3247((byte) -112);
        class396.method2440(false);
        class678.method3858(0);
        class788.method4324((byte) 92);
        class12.method44((byte) -60);
        class473.method2812(2885);
        class607.method3499(-215);
        class490.method2898((byte) -38);
        class657.method3767(-26902);
        class579.method3394((byte) 125);
        class165.method1037(85);
        class313.method2009((byte) -59);
        class133.method893((byte) -107);
        class23.method96((byte) -3);
        class246.method1652(2);
        class327.method2066((byte) 108);
        class39.method306(13);
        class484.method2877(3471);
        class611.method3537(7);
        class446.method2702((byte) 104);
        class436.method2622(18112);
        class631.method3620(-17279);
        class536.method3185(242);
        class514.method3068(1008);
        class67.method516(false);
        class495.method2915(116);
        class787.method4321((byte) -81);
        class99.method710(-50);
        class467.method2795(57);
        class645.method3698(-114);
        class93.method673(16);
        class76.method558((byte) 123);
        class747.method4141((byte) -97);
        class394.method2428(34037);
        class7.method17((byte) 54);
        class301.method1966(-128);
        class290.method1927(-95);
        class217.method1352(0);
        class587.method3441(0);
        class381.method2376((byte) 124);
        class685.method3904(-42);
        class634.method3635((byte) 71);
        class511.method3040((byte) -67);
        class399.method2457(555978786);
        class432.method2597(1);
        class134.method903(true);
        class323.method2045(2);
        class474.method2826((byte) -51);
        class739.method4098(2883842);
        class245.method1643(-1);
        class305.method1990(-18746);
        class762.method4205((byte) 100);
        class370.method2304(false);
        class115.method826(0);
        class577.method3382((byte) -65);
        class723.method4023(0);
        class48.method410(false);
        class459.method2763(81);
        class609.method3531((byte) -127);
        class116.method847(255);
        class654.method3752(false);
        class472.method2809(-128);
        class728.method4049(-28651);
        class774.method4275(120);
        class160.method1023((byte) -95);
        class615.method3549((byte) -127);
        class461.method2774(true);
        class604.method3490((byte) 103);
        class683.method3902(5823);
        class468.method2799(false);
        class138.method923(-1);
        class686.method3906((byte) 88);
        class589.method3449(-109);
        class433.method2599(0);
        class704.method3975(115);
        class732.method4072(125);
        class454.method2734(14);
        class533.method3157((byte) -68);
        class218.method1353(-9);
        class247.method1667(0);
        class294.method1938(-19476);
        class146.method973(127);
        class695.method3929(4);
        class231.method1568((byte) 84);
        class507.method2955((byte) -123);
        class181.method1151((byte) -61);
        class534.method3172(1);
        class452.method2728((byte) -98);
        class418.method2526(103);
        class413.method2517(97);
        class636.method3647(true);
        class581.method3421((byte) 34);
        class442.method2637((byte) 75);
        class523.method3119(false);
        class773.method4274(false);
        class692.method3926(0);
        class258.method1709(true);
        class422.method2543(2);
        class354.method2226(-19513);
        class583.method3427(101);
        class61.method489(true);
        class660.method3772(1);
        class94.method678(-79);
        class372.method2313((byte) 89);
        class748.method4146(false);
        int var2 = -8 / ((27 - arg0) / 48);
        class383.method2383((byte) 106);
        class777.method4281(-128);
        class578.method3385(-94);
        class701.method3966(10082);
        class263.method1731(-127);
        class434.method2600(false);
        class269.method1754(105);
        class259.method1710(-1);
        class202.method1301((byte) -13);
        class419.method2532((byte) -116);
        class192.method1188(false);
        class304.method1980(-1);
        class480.method2856(-991);
        class204.method1310(true);
        class130.method889((byte) -101);
        class260.method1717(12753);
        class357.method2238((byte) 84);
        class731.method4067(true);
        class300.method1961(-119);
        class714.method4005(-11872);
        class668.method3815(-11236);
        class253.method1693(-29873);
        class230.method1529((byte) 80);
        class288.method1902(false);
        class641.method3681((byte) -65);
        class22.method91((byte) 103);
        class700.method3950();
        class1.method5(109);
        class486.method2889(113);
        class254.method1700((byte) -121);
        class510.method2960((byte) -96);
        class240.method1617(-75);
        class43.method346((byte) -90);
        class483.method2873((byte) 81);
        class256.method1706(-11373);
        class164.method1031(8);
        class706.method3985((byte) -123);
        class602.method3481(4);
        class644.method3689(-89);
        class546.method3229(-1);
        class81.method576(0);
        class66.method509((byte) 60);
        class297.method1945(-35);
        class482.method2864((byte) 121);
        class661.method3774((byte) -122);
        class528.method3135(0);
        class403.method2469((byte) 21);
        class46.method383();
        class145.method961(-52);
        class122.method862(false);
        class266.method1739((byte) -31);
        class409.method2502(2287);
        class141.method936(-27);
        class77.method562(10);
        class75.method552((byte) -82);
        class378.method2365(39);
        class84.method641(0);
        class267.method1745(true);
        class15.method58((byte) -88);
        class449.method2717(false);
        class705.method3984((byte) -43);
        class289.method1918(-95);
        class491.method2902(3);
        class18.method70(114);
        class388.method2412();
        class148.method981(105);
        class565.method3337(503);
        class402.method2465((byte) 0);
        class325.method2059(-113);
        class86.method646(7);
        class58.method477(-22919);
        class395.method2436((byte) 72);
        class226.method1522((byte) 26);
        class506.method2951();
        class308.method1999((byte) 84);
        class248.method1673((byte) -40);
        class68.method519((byte) 91);
        class195.method1276(-5);
        class114.method819(2);
        class385.method2392(-114);
        class637.method3662(true);
        class555.method3269(false);
        class727.method4046(0);
        class516.method3070((byte) 120);
        class770.method4251(-16802);
        class44.method349(true);
        class113.method816(5);
        class186.method1163();
        class626.method3604(78);
        class444.method2668(124);
        class373.method2318(122);
        class321.method2041();
        class377.method2363(-3105);
        class346.method2188(-89);
        class70.method532((byte) -35);
        class717.method4011((byte) -102);
        class59.method481(false);
        class571.method3359((byte) 107);
        class622.method3573();
        class295.method1941((byte) -128);
        class119.method850((byte) 99);
        class664.method3788(78);
        class224.method1513((byte) -74);
        class250.method1681(-91);
        class189.method1185(0);
        class340.method2158((byte) -9);
        class502.method2939(false);
        class268.method1750(-1);
        class408.method2495((byte) 38);
        class771.method4256(-6);
        class760.method4199((byte) -89);
        class568.method3349(-126);
        class80.method573(-79);
        class447.method2712((byte) 45);
        class276.method1797(true);
        class156.method1011((byte) -110);
        class132.method892(18970);
        class735.method4081(false);
        class574.method3368(2);
        class677.method3856(66);
        class235.method1607(1);
        class31.method262(true);
        class154.method1007(213);
        class629.method3612((byte) 22);
        class726.method4040((byte) 76);
        class438.method2632(false);
        class656.method3762(2060);
        class177.method1130((byte) -70);
        class208.method1324(0);
        class710.method3996(25145);
        class74.method549(0);
        class489.method2891((byte) 34);
        class53.method457((byte) -49);
        class351.method2216((byte) 96);
        class78.method563((byte) -123);
        class107.method758(-109);
        class443.method2662(-89);
        class521.method3112(-658);
        class60.method483((byte) 41);
        class314.method2018(126);
        class33.method274(-21336);
        class205.method1316((byte) 110);
        class475.method2834(88);
        class333.method2117((byte) -75);
        class708.method3992(true);
        class601.method3478((byte) -111);
        class57.method474(91);
        class126.method872(-128);
        class389.method2413((byte) -117);
        class702.method3970((byte) 124);
        class176.method1127(true);
        class713.method4004(true);
        class524.method3122(-54);
        class10.method29((byte) -48);
        class744.method4119(0);
        class617.method3560(-118);
        class559.method3294(-1689898042);
        class504.method2941(79);
        class743.method4118(-125);
        class675.method3848(6);
        class329.method2076(-114);
        class532.method3153(-40);
        class679.method3862(34166);
        class501.method2935(100);
        class326.method2063(true);
        class212.method1332(3);
        class29.method133((byte) -97);
        class758.method4194(true);
        class183.method1154(-26);
        class292.method1931(-126);
        class707.method3989(15);
        class353.method2225((byte) 89);
        class38.method295();
        class345.method2179((byte) -121);
        class85.method643((byte) -88);
        class564.method3336((byte) -111);
        class689.method3913((byte) -1);
        class221.method1359((byte) 112);
        class368.method2297(-12);
        class182.method1153(false);
        class111.method811(-15);
        class650.method3726(-92);
        class324.method2057(-123);
        class282.method1832((byte) 66);
        class180.method1149(1024);
        class407.method2493((byte) -124);
        class274.method1784(13267);
        class761.method4202(127);
        class561.method3320();
        class477.method2843((byte) -62);
        class588.method3444((byte) -90);
        class198.method1286();
        class698.method3943();
        class6.method15(4550);
        class733.method4074();
        class505.method2945((byte) -39);
        class56.method471(63);
        class330.method2083(-1);
        class249.method1675(6);
        class670.method3824((byte) -28);
        class96.method691(18);
        class658.method3770(false);
        class376.method2352(939);
        class151.method996(0);
        class476.method2837(25408);
        class406.method2486((byte) -77);
        class244.method1633(2048);
        class778.method4287(15);
        class414.method2519((byte) -94);
        class62.method492(10);
        class41.method331(-7606);
        class237.method1614((byte) -31);
        class570.method3353(-25562);
        class624.method3595();
        class270.method1757(0);
        class328.method2070(-128);
        class152.method1000(-27567);
        class341.method2161((byte) -114);
        class384.method2389((byte) 56);
        class129.method887(-28853);
        class278.method1804(255);
        class404.method2478((byte) 30);
        class736.method4084(4);
        class781.method4296(-116);
        class753.method4159(false);
        class752.method4157(-25981);
        class108.method768((byte) 27);
        class653.method3735(0);
        class540.method3210((byte) 21);
        class651.method3729(1416222412);
        class563.method3331(7);
        class194.method1199((byte) -117);
        class633.method3631(-9625);
        class655.method3755((byte) 111);
        class425.method2565(false);
        class746.method4126((byte) -86);
        class35.method288(-16);
        class772.method4258(false);
        class539.method3203(105);
        class470.method2802(0);
        class173.method1104((byte) -73);
        class227.method1524((byte) -18);
        class734.method4078((byte) 111);
        class223.method1433(5);
        class382.method2382(28673);
        class612.method3541(0);
        class517.method3084(true);
        class397.method2444(10571);
        class769.method4250(127);
        class669.method3818(64);
        class586.method3438(true);
        class97.method697(-31257);
        class262.method1725((byte) -127);
        class718.method4013(-123);
        class435.method2609((byte) 45);
        class453.method2730((byte) 63);
        class556.method3277(-1);
        class362.method2278(34962);
        class280.method1828();
        class72.method533(false);
        class423.method2546(74);
        class380.method2373(25632);
        class363.method2282(4096);
        class535.method3179(1);
        class367.method2291((byte) -73);
        class336.method2128((byte) -110);
        class360.method2264(false);
        class79.method567(true);
        class451.method2724(108);
        class457.method2752((byte) 45);
        class538.method3195(4);
        class585.method3436((byte) -116);
        class169.method1092(-94366580);
        class665.method3792(true);
        class605.method3492(-51);
        class699.method3944(1);
        class188.method1179(63);
        class185.method1158(1);
        class595.method3469(-40);
        class219.method1356((byte) 114);
        class448.method2715(1223622372);
        class635.method3644(-1);
        class775.method4278((byte) -88);
        class243.method1628(0);
        class694.method3928((byte) 120);
        class456.method2746(-119);
        class139.method926((byte) -92);
        class170.method1095(-28951);
        class412.method2516((byte) 50);
        class88.method652((byte) 105);
        class623.method3584(108);
        class225.method1518();
        class167.method1049(-19207);
        class16.method61((byte) 85);
        class281.method1831(5);
        class429.method2579(false);
        class401.method2464(-110);
        class566.method3338(true);
        class400.method2461(-26628);
        class128.method880(31675);
        class285.method1877((byte) -72);
        class416.method2521(0);
        class759.method4197(500);
        class554.method3263(-10189);
        class265.method1734(36161);
        class358.method2244(-113);
        class203.method1306(false);
        class347.method2191(4);
        class785.method4306(0);
        class65.method508(-15);
        class462.method2780(600);
        class339.method2147((byte) 121);
        class545.method3228((byte) 119);
        class213.method1334(12);
        class725.method4035(-124);
        class693.method3927(-2193);
        class676.method3853(3063);
        class616.method3554((byte) -27);
        class123.method868(99);
        class558.method3283(118);
        class95.method685((byte) 98);
        class261.method1723(false);
        class530.method3150(9216);
        class471.method2808(770);
        class724.method4034(0);
        class214.method1343((byte) -112);
        class190.method1186((byte) 105);
        class625.method3597(-6993);
        class672.method3835(-98);
        class663.method3785(-109);
        class580.method3399(-62);
        class428.method2577((byte) 91);
        class494.method2912(90);
        class149.method989(true);
        class592.method3460((byte) -126);
        class671.method3828(true);
        class478.method2851((byte) -46);
        class273.method1774(128);
        class640.method3677(-93);
        class153.method1004(false);
        class92.method667(99);
        class793.method4340(32574);
        class120.method853(20);
        class591.method3458(22);
        class499.method2931(250);
        class100.method712((byte) 38);
        class551.method3251(114);
        class25.method107((byte) 67);
        class750.method4154(3314);
        class83.method636(1);
        class158.method1016((byte) -97);
        class497.method2921(true);
        class106.method751(false);
        class557.method3279(34336);
        class356.method2234(8);
        class392.method2419(-78);
        class562.method3324(97);
        class582.method3426(16);
        class576.method3371(44);
        class175.method1118(0);
        class4.method12(-754974720);
        class548.method3245(-122);
        class5.method14(56);
        class646.method3701((byte) 114);
        class531.method3151(-112);
        class463.method2784((byte) 97);
        class603.method3488((byte) -76);
        class161.method1025(0);
        class544.method3221((byte) -64);
        class666.method3797(128);
        class102.method722((byte) 120);
        class350.method2205(false);
        class620.method3569(8266);
        class469.method2800(112);
        class485.method2884((byte) 121);
        class137.method920((byte) -128);
        class742.method4113((byte) 75);
        class594.method3467(-125);
        class593.method3466(true);
        class493.method2908(-24381);
        class361.method2271(false);
        class498.method2925((byte) 25);
        class171.method1099(-66);
        class172.method1102(115);
        class24.method101(-68);
        class465.method2789((byte) -40);
        class630.method3618(-118);
        class315.method2019(-30674);
        class642.method3688(-20771);
        class131.method890(-10006);
        class543.method3218(0);
        class751.method4156((byte) 66);
        class135.method907(12328);
        class54.method463(-99);
        class390.method2417(-73);
        class386.method2394(-113);
        class50.method421((byte) 55);
        class293.method1935((byte) -48);
        class104.method730(18885);
        class766.method4221(87);
        class525.method3123((byte) 87);
        class722.method4018(false);
        class479.method2852((byte) -41);
        class791.method4330((byte) -118);
        class32.method264(18);
        class187.method1171((byte) -119);
        class715.method4007(0);
        class157.method1012(26414);
        class112.method813(16776960);
        class275.method1796((byte) -117);
        class206.method1317((byte) -127);
        class405.method2485((byte) 69);
        class319.method2035((byte) 17);
        class749.method4148(false);
        class387.method2396(52);
        class688.method3912(true);
        class632.method3624(93);
        class696.method3932(true);
        class492.method2906(2);
        class687.method3909((byte) -84);
        class109.method801(5);
        class393.method2424((byte) 110);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2723)
    public static final void method790(int arg0) {
        int var1 = class783.field10748;
        int[] var2 = class244.field3610;
        int var3 = class582.field8241 ? var1 : class429.field5988 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class654 var5;
            if (var4 < var1) {
                var5 = class413.field5787[var2[var4]];
            } else {
                var5 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[var4 - var1])).field9573;
            }
            if (var5.field3467 == arg0) {
                var5.field9134 = 0;
                if (var5.field9199 < 0) {
                    var5.field9136 = false;
                } else {
                    int var6 = var5.method3744(1);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3470 & 0x1FF) != 0 || (var5.field3460 & 0x1FF) != 0) {
                            var5.field9136 = false;
                            continue;
                        }
                    } else if ((var5.field3470 & 0x1FF) != 256 || (var5.field3460 & 0x1FF) != 256) {
                        var5.field9136 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3470 >> 9;
                        int var8 = var5.field3460 >> 9;
                        if (class712.field9919[var7][var8] != var5.field9199) {
                            var5.field9136 = true;
                            continue;
                        }
                        if (class356.field5138[var7][var8] > 1) {
                            var10002 = class356.field5138[var7][var8]--;
                            var5.field9136 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3470 - var9 >> 9;
                        int var11 = var5.field3460 - var9 >> 9;
                        int var12 = var5.field3470 + var9 >> 9;
                        int var13 = var5.field3460 + var9 >> 9;
                        if (!class24.method103(0, var5.field9199, var12, var10, var13, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class712.field9919[var14][var15] == var5.field9199) {
                                        var10002 = class356.field5138[var14][var15]--;
                                    }
                                }
                            }
                            var5.field9136 = true;
                            continue;
                        }
                    }
                    var5.field9136 = false;
                    var5.field3464 = class373.method2316(var5.field3470, var5.field3467, var5.field3460, 108);
                    class497.method2922(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 2838)
    private final void method791(boolean arg0) {
        field1304++;
        if (class664.field9331 == 14) {
            return;
        }
        long var2 = class76.method555((byte) 112) / 1000000L - class287.field4213;
        class287.field4213 = class76.method555((byte) 84) / 1000000L;
        boolean var4 = class525.method3129((byte) -114);
        if (var4 && class15.field90 && class32.field307 != null) {
            class32.field307.method1913(116);
        }
        if (class657.method3765((byte) 69, class664.field9331)) {
            if (class217.field2990 != 0L && class683.method3903((byte) 4) > class217.field2990) {
                class234.method1602(class647.method3714(-117), false, class651.field9092, 16367, class329.field4611);
            } else if (!class111.field1332.method175() && class326.field4590) {
                class436.method2616(124);
            }
        }
        if (class661.field9305 == null) {
            Container var5;
            if (class43.field453 != null) {
                var5 = class43.field453;
            } else if (class511.field7007 == null) {
                var5 = class785.field10774;
            } else {
                var5 = class511.field7007;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class43.field453 == var5) {
                Insets var8 = class43.field453.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class20.field163 != var6 || class277.field3991 != var7 || class501.field6854) {
                if (class111.field1332 == null || class111.field1332.method200()) {
                    class189.method1181(-1);
                } else {
                    class20.field163 = var6;
                    class277.field3991 = var7;
                }
                class217.field2990 = class683.method3903((byte) 4) + 500L;
                class501.field6854 = false;
            }
        }
        if (class661.field9305 != null && !class536.field7412 && class657.method3765((byte) 69, class664.field9331)) {
            class234.method1602(class688.field9602.field8518.method3732((byte) -98), false, -1, 16367, -1);
        }
        boolean var9 = arg0;
        if (class516.field7074) {
            class516.field7074 = false;
            var9 = true;
        }
        if (var9) {
            class670.method3826(true);
        }
        if (class111.field1332 != null && class111.field1332.method175() || class647.method3714(121) != 1) {
            class23.method99(100);
        }
        if (class274.method1783(-106, class664.field9331)) {
            class25.method106(var9, -83);
        } else if (class722.method4017((byte) 74, class664.field9331)) {
            class726.method4038(-777);
        } else if (class203.method1304(class664.field9331, (byte) -57)) {
            class726.method4038(-777);
        } else if (class363.method2286((byte) -24, class664.field9331)) {
            if (class511.field7009 == 1) {
                if (class609.field8590 < class616.field8645) {
                    class609.field8590 = class616.field8645;
                }
                int var10 = (class609.field8590 - class616.field8645) * 50 / class609.field8590;
                class323.method2046(class582.field8243, class111.field1332, true, false, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -48) + "<br>(" + var10 + "%)");
            } else if (class511.field7009 == 2) {
                if (class483.field6687 > class593.field8344) {
                    class593.field8344 = class483.field6687;
                }
                int var11 = (class593.field8344 - class483.field6687) * 50 / class593.field8344 + 50;
                class323.method2046(class582.field8243, class111.field1332, true, arg0, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -89) + "<br>(" + var11 + "%)");
            } else {
                class323.method2046(class582.field8243, class111.field1332, true, arg0, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -53));
            }
        } else if (class664.field9331 == 10) {
            class623.method3586(-125, var2);
        } else if (class664.field9331 == 13) {
            class323.method2046(class582.field8243, class111.field1332, false, false, class559.field7865, class712.field9867.method3999(class553.field7667, (byte) -88) + "<br>" + class712.field9868.method3999(class553.field7667, (byte) -55));
        }
        if (class122.field1620 == 3) {
            for (int var12 = 0; var12 < class187.field2331; var12++) {
                Rectangle var13 = class185.field2308[var12];
                if (class435.field6034[var12]) {
                    class111.field1332.method2818(-65281, var13.width, var13.x, (byte) 86, var13.y, var13.height);
                } else if (class585.field8271[var12]) {
                    class111.field1332.method2818(-65536, var13.width, var13.x, (byte) 71, var13.y, var13.height);
                } else {
                    class111.field1332.method2818(-16711936, var13.width, var13.x, (byte) -29, var13.y, var13.height);
                }
            }
        }
        if (class188.method1178(46)) {
            class521.method3109(77, class111.field1332);
        }
        if (class129.field1674.field10561 && class657.method3765((byte) 69, class664.field9331) && class122.field1620 == 0 && class647.method3714(-121) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class187.field2331; var17++) {
                if (class585.field8271[var17]) {
                    class585.field8271[var17] = false;
                    class349.field5074[var16++] = class185.field2308[var17];
                }
            }
            try {
                if (class55.field651) {
                    class560.method3307((byte) -116, class349.field5074, var16);
                } else {
                    class111.field1332.method2820(0, class349.field5074, var16);
                }
            } catch (class357 var19) {
            }
        } else if (!class274.method1783(-116, class664.field9331)) {
            for (int var14 = 0; var14 < class187.field2331; var14++) {
                class585.field8271[var14] = false;
            }
            try {
                if (class55.field651) {
                    class537.method3193(1);
                } else {
                    class111.field1332.method2817(false);
                }
            } catch (class357 var20) {
                class502.method2937(var20, (byte) 87, var20.getMessage() + " (Recovered) " + this.method773((byte) -128));
                class532.method3154(0, false, 1);
            }
        }
        class661.method3775(51);
        int var18 = class688.field9602.field8502.method1189((byte) -98);
        if (var18 == 0) {
            class730.method4066((byte) -45, 15L);
        } else if (var18 == 1) {
            class730.method4066((byte) -45, 10L);
        } else if (var18 == 2) {
            class730.method4066((byte) -45, 5L);
        } else if (var18 == 3) {
            class730.method4066((byte) -45, 2L);
        }
        if (class743.field10240) {
            class510.method2966((byte) 117);
        }
        if (class688.field9602.field8520.method1929((byte) -98) == 1 && class664.field9331 == 3 && class610.field8597 != -1) {
            class688.field9602.method3503(class688.field9602.field8520, -123, 0);
            class266.method1738(-106);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 3100)
    public static final void method792(boolean arg0) {
        class519[] var1 = class187.field2329;
        synchronized (class187.field2329) {
            int var2 = 0;
            if (!arg0) {
                field1309 = null;
            }
            while (true) {
                if (var2 >= class187.field2329.length) {
                    break;
                }
                class187.field2329[var2] = new class519();
                class718.field9948[var2] = 0;
                var2++;
            }
        }
        field1299++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 3122)
    private final void method793(byte arg0) {
        if (class664.field9331 == 7 && class567.field7992 == 0) {
            if (class637.field8958 > 1) {
                class637.field8958--;
                class137.field1757 = class453.field6312;
            }
            if (!class263.field3850) {
                class442.method2652(-16777216);
            }
            for (int var2 = 0; var2 < 100 && class748.method4147(50); var2++) {
            }
        }
        field1306++;
        class510.field6925++;
        class88.method655(null, -1, -1, -112);
        class400.method2459(-1, -1, null, 5510);
        class744.method4121((byte) -121);
        class453.field6312++;
        for (int var3 = 0; var3 < class744.field10275; var3++) {
            class359 var4 = class669.field9376[var3].field9573;
            if (var4 != null) {
                byte var5 = var4.field5172.field8868;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method3744(1);
                    if ((var5 & 0x2) != 0 && var4.field9215 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field9219[0] + var7;
                            int var10 = var4.field9214[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class741.field10208 - var6 - 1)) {
                                var9 = class741.field10208 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class525.field7224 - var6 - 1)) {
                                var10 = class525.field7224 - var6 - 1;
                            }
                            int var11 = class400.method2460(var4.field9219[0], var10, 0, class468.field6495, var4.field9214[0], var6, var6, var6, var9, -1, field1305[var4.field3467], true, 99, 0, class194.field2596);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field9219[var12] = class194.field2596[var11 - var12 - 1];
                                    var4.field9214[var12] = class468.field6495[var11 - var12 - 1];
                                    var4.field9213[var12] = 1;
                                }
                                var4.field9215 = var11;
                            }
                        }
                    }
                    class24.method104(-4710, var4, true);
                    int var13 = class568.method3343(var4, false);
                    class564.method3334(var4, -1);
                    class58.method478(class612.field8621, var13, class742.field10221, -128, var4);
                    class439.method2633(class612.field8621, var4, 0);
                    class641.method3686((byte) -101, var4);
                }
            }
        }
        if (class567.field7992 == 0 && class785.field10773 == 0) {
            if (class695.field9691 == 2) {
                class351.method2217(16384);
            } else {
                class668.method3817(-29);
            }
            if ((class497.field6818 >> 9) < 14 || class741.field10208 - 14 <= class497.field6818 >> 9 || (class412.field5779 >> 9) < 14 || (class412.field5779 >> 9) >= (class525.field7224 - 14)) {
                class482.method2863(-1851856253);
            }
        }
        while (true) {
            class114 var14;
            class115 var15;
            class115 var16;
            do {
                var14 = (class114) class485.field6704.method1034(20791);
                if (var14 == null) {
                    while (true) {
                        class114 var17;
                        class115 var18;
                        class115 var19;
                        do {
                            var17 = (class114) class194.field2593.method1034(20791);
                            if (var17 == null) {
                                while (true) {
                                    class114 var20;
                                    class115 var21;
                                    class115 var22;
                                    do {
                                        var20 = (class114) class495.field6812.method1034(20791);
                                        if (var20 == null) {
                                            if (class81.field906 != null) {
                                                class570.method3356(-2);
                                            }
                                            if ((class533.field7336 % 1500) == 0) {
                                                class701.method3967((byte) -15);
                                            }
                                            if (class664.field9331 == 7 && class567.field7992 == 0) {
                                                class386.method2395(false);
                                            }
                                            class340.method2153((byte) -65);
                                            if (class489.field6728 && class669.field9370 < class683.method3903((byte) 4) - 60000L) {
                                                class775.method4276((byte) -21);
                                            }
                                            for (class666 var23 = (class666) class195.field2765.method3103((byte) 72); var23 != null; var23 = (class666) class195.field2765.method3104(-10964)) {
                                                if ((long) var23.field9356 < class683.method3903((byte) 4) / 1000L - 5L) {
                                                    if (var23.field9360 > 0) {
                                                        class727.method4042("", "", (byte) -127, "", 5, 0, var23.field9359 + class712.field9872.method3999(class553.field7667, (byte) -39));
                                                    }
                                                    if (var23.field9360 == 0) {
                                                        class727.method4042("", "", (byte) -56, "", 5, 0, var23.field9359 + class712.field9873.method3999(class553.field7667, (byte) -76));
                                                    }
                                                    var23.method2773(52);
                                                }
                                            }
                                            if (arg0 <= 78) {
                                                method770(105);
                                            }
                                            if (class664.field9331 == 7 && class567.field7992 == 0) {
                                                if (class679.field9490 == null) {
                                                    class570.method3355((byte) 116, false);
                                                    return;
                                                }
                                                class471.field6528++;
                                                if (class471.field6528 > 50) {
                                                    class136.field1755++;
                                                    class116 var24 = class248.method1672(class84.field1023, class727.field10053, -20647);
                                                    class443.method2655(0, var24);
                                                }
                                                try {
                                                    class581.method3420(0);
                                                    return;
                                                } catch (IOException var25) {
                                                    class570.method3355((byte) -72, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field1378;
                                        if (var21.field1482 < 0) {
                                            break;
                                        }
                                        var22 = class384.method2387(false, var21.field1436);
                                    } while (var22 == null || var22.field1394 == null || var22.field1394.length <= var21.field1482 || var22.field1394[var21.field1482] != var21);
                                    class700.method3959(var20);
                                }
                            }
                            var18 = var17.field1378;
                            if (var18.field1482 < 0) {
                                break;
                            }
                            var19 = class384.method2387(false, var18.field1436);
                        } while (var19 == null || var19.field1394 == null || var18.field1482 >= var19.field1394.length || var19.field1394[var18.field1482] != var18);
                        class700.method3959(var17);
                    }
                }
                var15 = var14.field1378;
                if (var15.field1482 < 0) {
                    break;
                }
                var16 = class384.method2387(false, var15.field1436);
            } while (var16 == null || var16.field1394 == null || var16.field1394.length <= var15.field1482 || var16.field1394[var15.field1482] != var15);
            class700.method3959(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3406)
    public static final void method794() {
        int var0 = class783.field10748;
        int[] var1 = class244.field3610;
        int var2 = class688.field9602.field8501.method3773((byte) -98);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class723 var14 = class413.field5787[var1[var4]];
            if (!var14.method4031(-27674)) {
                var14.field9199 = -1;
            } else if (var14.field9989) {
                var14.field9199 = -1;
            } else {
                var14.method79(false);
                if (var14.field3745 >= 0 && var14.field3758 >= 0 && var14.field3754 < class741.field10208 && var14.field3755 < class525.field7224) {
                    var14.field10002 = var14.field9207 ? var3 : false;
                    if (class724.field10031 == var14) {
                        var14.field9199 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field9136) {
                            var15++;
                        }
                        if (var14.field9126 > class533.field7336) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method3744(1) << 2);
                        if (var14.field10008 || var14.field9996) {
                            var16 += 512;
                        } else {
                            if (class109.field1324 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field9199 = var16 + 1;
                    }
                } else {
                    var14.field9199 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class429.field5988; var5++) {
            class359 var11 = ((class685) class450.field6288.method3669(false, (long) class425.field5934[var5])).field9573;
            if (var11.method2253(-27674) && var11.field5172.method3657(class173.field2192, -19156)) {
                var11.method79(false);
                if (var11.field3745 >= 0 && var11.field3758 >= 0 && var11.field3754 < class741.field10208 && var11.field3755 < class525.field7224) {
                    int var12 = 0;
                    if (!var11.field9136) {
                        var12++;
                    }
                    if (var11.field9126 > class533.field7336) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method3744(1) << 2);
                    if (class109.field1324 == 0) {
                        if (var11.field5172.field8937) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class109.field1324 == 1) {
                        if (var11.field5172.field8937) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field5172.field8933) {
                        var13 += 1024;
                    } else if (!var11.field5172.field8936) {
                        var13 += 256;
                    }
                    var11.field9199 = var13 + 1;
                } else {
                    var11.field9199 = -1;
                }
            } else {
                var11.field9199 = -1;
            }
        }
        for (int var6 = 0; var6 < class115.field1569.length; var6++) {
            class657 var7 = class115.field1569[var6];
            if (var7 != null) {
                if (var7.field9270 == 1) {
                    class685 var8 = (class685) class450.field6288.method3669(false, (long) var7.field9275);
                    if (var8 != null) {
                        class359 var9 = var8.field9573;
                        if (var9.field9199 >= 0) {
                            var9.field9199 += 2048;
                        }
                    }
                } else if (var7.field9270 == 10) {
                    class723 var10 = class413.field5787[var7.field9275];
                    if (var10 != null && class724.field10031 != var10 && var10.field9199 >= 0) {
                        var10.field9199 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 3579)
    public final void method795(byte arg0) {
        field1295++;
        if (class688.field9602.field8517.method2604((byte) -98) == 2) {
            try {
                this.method777(-104);
            } catch (ThreadDeath var5) {
                throw var5;
            } catch (Throwable var6) {
                class502.method2937(var6, (byte) 51, var6.getMessage() + " (Recovered) " + this.method773((byte) -128));
                class365.field5257 = true;
                class532.method3154(0, false, 1);
            }
        } else {
            this.method777(-94);
        }
        int var4 = 6 / ((75 - arg0) / 36);
    }
}
