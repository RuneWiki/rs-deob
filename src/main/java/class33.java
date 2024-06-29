import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[B")
    private byte[] field706 = new byte[4];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lfc;")
    private class39 field687;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "J")
    private long field702;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lv;")
    private static class146 field682 = class159.method1226((byte) -37, "Connecting to update server");

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lv;")
    public static class146 field688 = field682;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lv;")
    public static class146 field681 = class159.method1226((byte) -37, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lv;")
    public static class146 field696 = class159.method1226((byte) -37, "leuchten3:");

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lv;")
    private static class146 field701 = class159.method1226((byte) -37, "Bad session id)3");

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lv;")
    private static class146 field683 = class159.method1226((byte) -37, "Please remove ");

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lv;")
    public static class146 field708 = class159.method1226((byte) -37, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Lv;")
    public static class146 field704 = field683;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field707 = -1;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Z")
    public static boolean field691 = false;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lv;")
    public static class146 field695 = field701;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lv;")
    public static class146 field699 = class159.method1226((byte) -37, "Art");

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lv;")
    public static class146 field690 = field683;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field713 = 1;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lla;")
    public static class77 field693;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field689;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[B")
    private byte[] field703;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lmb;BLmb;)V")
    public static final void method219(class85 arg0, byte arg1, class85 arg2) {
        field685++;
        if (class124.field2874 == null) {
            class124.field2874 = class67.method476(class3.field89, class142.field3244, class134.field3064, (byte) -118);
        }
        if (class89.field2116 == null) {
            class89.field2116 = class100.method835(class3.field89, class134.field3064, class15.field250, (byte) -121);
        }
        if (class51.field1156 == null) {
            class51.field1156 = class100.method835(class3.field89, class134.field3064, class125.field2907, (byte) -122);
        }
        if (class64.field1454 == null) {
            class64.field1454 = class100.method835(class3.field89, class134.field3064, class150.field3476, (byte) -122);
        }
        class56.method382(0, 23, 765, 480, 0);
        class56.method385(0, 0, 125, 23, 12425273, 9135624);
        class56.method385(125, 0, 640, 23, 5197647, 2697513);
        int var3 = 7 % ((arg1 + 70) / 51);
        arg0.method806(class147.field3403, 62, 15, 0, -1);
        if (class64.field1454 != null) {
            class64.field1454[1].method1065(140, 1);
            arg2.method827(class57.field1288, 152, 10, 16777215, -1);
            class64.field1454[0].method1065(140, 12);
            arg2.method827(class58.field1306, 152, 21, 16777215, -1);
        }
        if (class51.field1156 != null) {
            short var4 = 280;
            if (class72.field1689[0] == 0 && class29.field604[0] == 0) {
                class51.field1156[2].method1065(var4, 4);
            } else {
                class51.field1156[0].method1065(var4, 4);
            }
            short var5 = 390;
            short var6 = 500;
            if (class72.field1689[0] == 0 && class29.field604[0] == 1) {
                class51.field1156[3].method1065(var4 + 15, 4);
            } else {
                class51.field1156[1].method1065(var4 + 15, 4);
            }
            short var7 = 610;
            arg0.method827(class148.field3450, var4 + 32, 17, 16777215, -1);
            if (class72.field1689[0] == 1 && class29.field604[0] == 0) {
                class51.field1156[2].method1065(var5, 4);
            } else {
                class51.field1156[0].method1065(var5, 4);
            }
            if (class72.field1689[0] == 1 && class29.field604[0] == 1) {
                class51.field1156[3].method1065(var5 + 15, 4);
            } else {
                class51.field1156[1].method1065(var5 + 15, 4);
            }
            arg0.method827(class145.field3304, var5 + 32, 17, 16777215, -1);
            if (class72.field1689[0] == 2 && class29.field604[0] == 0) {
                class51.field1156[2].method1065(var6, 4);
            } else {
                class51.field1156[0].method1065(var6, 4);
            }
            if (class72.field1689[0] == 2 && class29.field604[0] == 1) {
                class51.field1156[3].method1065(var6 + 15, 4);
            } else {
                class51.field1156[1].method1065(var6 + 15, 4);
            }
            arg0.method827(class155.field3539, var6 + 32, 17, 16777215, -1);
            if (class72.field1689[0] == 3 && class29.field604[0] == 0) {
                class51.field1156[2].method1065(var7, 4);
            } else {
                class51.field1156[0].method1065(var7, 4);
            }
            if (class72.field1689[0] == 3 && class29.field604[0] == 1) {
                class51.field1156[3].method1065(var7 + 15, 4);
            } else {
                class51.field1156[1].method1065(var7 + 15, 4);
            }
            arg0.method827(class95.field2318, var7 + 32, 17, 16777215, -1);
        }
        class56.method382(708, 4, 50, 16, 0);
        arg2.method806(class140.field3210, 733, 16, 16777215, -1);
        class49.field1139 = -1;
        if (class124.field2874 != null) {
            byte var8 = 88;
            byte var9 = 19;
            int var10 = 480 / (var9 + 1);
            int var11 = 765 / (var8 + 1);
            int var12;
            int var13;
            do {
                var12 = var10;
                var13 = var11;
                if (class20.field312 <= (var11 - 1) * var10) {
                    var11--;
                }
                if (class20.field312 <= (var10 - 1) * var11) {
                    var10--;
                }
                if (class20.field312 <= (var10 - 1) * var11) {
                    var10--;
                }
            } while (var10 != var12 || var11 != var13);
            int var14 = (765 - var8 * var11) / (var11 + 1);
            int var15 = (480 - var9 * var10) / (var10 + 1);
            if (var15 > 5) {
                var15 = 5;
            }
            int var16 = (480 - (var10 - 1) * var15 - var9 * var10) / 2;
            if (var14 > 5) {
                var14 = 5;
            }
            int var17 = (765 - (var11 - 1) * var14 - var8 * var11) / 2;
            int var18 = var16 + 23;
            int var19 = var17;
            int var20 = 0;
            for (int var21 = 0; var21 < class20.field312; var21++) {
                class122 var22 = class97.field2337[var21];
                class146 var23 = class75.method564(false, var22.field2847);
                boolean var24 = true;
                if (var22.field2847 == -1) {
                    var23 = class148.field3441;
                    var24 = false;
                } else if (var22.field2847 > 1980) {
                    var24 = false;
                    var23 = class60.field1383;
                }
                if (class2.field45 >= var19 && class151.field3491 >= var18 && class2.field45 < var19 + var8 && var9 + var18 > class151.field3491 && var24) {
                    class49.field1139 = var21;
                    class124.field2874[var22.field2829 ? 1 : 0].method442(var19, var18, 128, 16777215);
                } else {
                    class124.field2874[var22.field2829 ? 1 : 0].method430(var19, var18);
                }
                if (class89.field2116 != null) {
                    class89.field2116[(var22.field2829 ? 8 : 0) + var22.field2845].method1065(var19 + 29, var18);
                }
                arg0.method806(class75.method564(false, var22.field2827), var19 + 15, var9 / 2 + var18 + 5, 0, -1);
                arg2.method806(var23, var19 + 60, var9 / 2 + 5 + var18, 268435455, -1);
                var18 += var9 + var15;
                var20++;
                if (var20 >= var10) {
                    var19 += var8 + var14;
                    var20 = 0;
                    var18 = var16 + 23;
                }
            }
        }
        try {
            Graphics var25 = class1.field3.getGraphics();
            class141.field3233.method599(21982, 0, var25, 0);
        } catch (Exception var26) {
            class1.field3.repaint();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)[B")
    public final byte[] method220(int arg0) throws IOException {
        field709++;
        if (class51.method345((byte) -1) > this.field702) {
            throw new IOException("fdt");
        }
        if (this.field684 == 0) {
            if (this.field687.field866 == 2) {
                throw new IOException("fds");
            }
            if (this.field687.field866 == 1) {
                this.field684 = 1;
                this.field689 = (DataInputStream) this.field687.field870;
            }
        }
        if (arg0 != 23) {
            return null;
        }
        if (this.field684 == 1) {
            int var2 = this.field689.available();
            if (var2 > 0) {
                if (this.field698 + var2 > 4) {
                    var2 = 4 - this.field698;
                }
                this.field698 += this.field689.read(this.field706, this.field698, var2);
                if (this.field698 == 4) {
                    int var3 = (new class95(this.field706)).method740((byte) 50);
                    this.field703 = new byte[var3];
                    this.field684 = 2;
                }
            }
        }
        if (this.field684 == 2) {
            int var4 = this.field689.available();
            if (var4 > 0) {
                if (var4 + this.field712 > this.field703.length) {
                    var4 = this.field703.length - this.field712;
                }
                this.field712 += this.field689.read(this.field703, this.field712, var4);
                if (this.field703.length == this.field712) {
                    return this.field703;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)I")
    public static final int method221(int arg0, byte arg1, int arg2) {
        field700++;
        if (arg1 >= -61) {
            return -52;
        }
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZILla;IZ)V")
    public static final void method222(int arg0, int arg1, boolean arg2, int arg3, class77 arg4, int arg5, boolean arg6) {
        class67.field1526 = arg1;
        class77.field1870 = arg3;
        field710++;
        field693 = arg4;
        class58.field1300 = 1;
        class120.field2778 = arg0;
        class132.field3010 = arg5;
        class25.field410 = arg2;
        if (!arg6) {
            method224((byte) -49);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ)V")
    public static final void method223(byte arg0, long arg1) {
        field697++;
        if (arg1 == 0L) {
            return;
        }
        if (class124.field2892 >= 100 && class76.field1819 != 1 || class124.field2892 >= 200) {
            class26.method174(0, class158.field3633, (byte) -76, class35.field765);
        } else if (arg0 == 104) {
            class146 var3 = class68.method483(37, arg1).method1087(false);
            for (int var4 = 0; var4 < class124.field2892; var4++) {
                if (class120.field2776[var4] == arg1) {
                    class26.method174(0, class158.field3633, (byte) -76, class71.method509(new class146[] { var3, class98.field2370 }, (byte) -120));
                    return;
                }
            }
            for (int var5 = 0; var5 < class54.field1233; var5++) {
                if (class37.field838[var5] == arg1) {
                    class26.method174(0, class158.field3633, (byte) -76, class71.method509(new class146[] { field704, var3, class98.field2373 }, (byte) -96));
                    return;
                }
            }
            if (var3.method1107((byte) -96, class116.field2696.field1506)) {
                class26.method174(0, class158.field3633, (byte) -76, class115.field2682);
            } else {
                class63.field1423[class124.field2892] = var3;
                class120.field2776[class124.field2892] = arg1;
                class77.field1825++;
                class100.field2433[class124.field2892] = 0;
                class111.field2627[class124.field2892] = 0;
                class87.field2071 = class44.field1016;
                class124.field2892++;
                class82.field1990.method265((byte) -85, 19);
                class82.field1990.method746(arg1, 1101310632);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method224(byte arg0) {
        field696 = null;
        field693 = null;
        field704 = null;
        field699 = null;
        field681 = null;
        field701 = null;
        field688 = null;
        field683 = null;
        field682 = null;
        field695 = null;
        if (arg0 >= -26) {
            method219(null, (byte) -40, null);
        }
        field708 = null;
        field690 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lcf;Ljava/net/URL;)V")
    public class33(class21 arg0, URL arg1) {
        this.field687 = arg0.method118((byte) 117, arg1);
        this.field684 = 0;
        this.field702 = class51.method345((byte) -1) + 30000L;
    }
}
