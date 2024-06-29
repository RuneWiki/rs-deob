import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lmc;")
    public static class75 field2055 = class30.method234(true, "huffman");

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lmc;")
    private static class75 field2068 = class30.method234(true, "Welcome to RuneScape");

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lmc;")
    public static class75 field2071 = class30.method234(true, "Freunde");

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lmc;")
    public static class75 field2056 = class30.method234(true, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lmc;")
    public static class75 field2078 = field2068;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lmc;")
    private static class75 field2079 = class30.method234(true, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lmc;")
    public static class75 field2069 = field2079;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    public static int[] field2081 = new int[2048];

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 3)
    public static final void method694(int arg0) {
        if (arg0 == -86) {
            class92.field2270 = false;
            field2072++;
            class29.field620 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLmc;Lja;Lmc;)[Laa;", line = 22)
    public static final class2[] method695(boolean arg0, class75 arg1, class55 arg2, class75 arg3) {
        if (arg0) {
            int var4 = arg2.method433(arg3, (byte) 100);
            field2061++;
            int var5 = arg2.method451(arg1, var4, (byte) 124);
            return class44.method337(1330296878, var5, arg2, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 38)
    public static final void method696(int arg0, int arg1, int arg2, int arg3) {
        field2063++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class15.field280[arg1][arg3 + var4][arg2 + var8] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class15.field280[arg1][arg3][arg2 + var5] = class15.field280[arg1][arg3 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class15.field280[arg1][arg3 + var6][arg2] = class15.field280[arg1][arg3 + var6][arg2 - 1];
            }
        }
        int var7 = 87 % ((arg0 + 30) / 40);
        if (arg3 > 0 && class15.field280[arg1][arg3 - 1][arg2] != 0) {
            class15.field280[arg1][arg3][arg2] = class15.field280[arg1][arg3 - 1][arg2];
        } else if (arg2 > 0 && class15.field280[arg1][arg3][arg2 - 1] != 0) {
            class15.field280[arg1][arg3][arg2] = class15.field280[arg1][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class15.field280[arg1][arg3 - 1][arg2 - 1] != 0) {
            class15.field280[arg1][arg3][arg2] = class15.field280[arg1][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 103)
    public final void focusGained(FocusEvent arg0) {
        field2060++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 127)
    public static final void method697(int arg0) {
        field2066++;
        if (!class110.field2798) {
            return;
        }
        if (arg0 != 29945) {
            field2074 = 41;
        }
        class27.field554 = null;
        class70.field1797 = null;
        class99.field2496 = null;
        class82.field2031 = null;
        class111.field2821 = null;
        class55.field1361 = null;
        class96.field2401 = null;
        class62.field1631 = null;
        class110.field2784 = null;
        class101.field2617 = null;
        class10.field220 = null;
        class31.field705 = null;
        class38.field897 = null;
        class99.field2559 = null;
        class91.field2250 = null;
        class104.field2636 = null;
        class35.field848 = null;
        class131.field3195 = null;
        class119.field2947 = null;
        class75.field1899 = null;
        class110.field2798 = false;
        class36.field854 = null;
        class55.field1394 = null;
        class104.field2638 = null;
        class94.field2371 = null;
        class5.field72 = null;
        class16.field298 = null;
        class40.field958 = null;
        class57.field1446 = null;
        class131.field3179 = null;
        class52.field1317 = null;
        class88.field2159 = null;
        class36.field872 = null;
        class130.field3164 = null;
        class57.field1444 = null;
        class45.field1074 = null;
        class23.field449 = null;
        class8.field131 = null;
        class92.field2283 = null;
        class62.field1649 = null;
        class92.field2282 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lcb;", line = 207)
    public static final class15 method698(byte arg0, int arg1) {
        field2059++;
        if (arg0 != -56) {
            return null;
        }
        class15 var2 = (class15) class41.field998.method559((long) arg1, -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field865.method436(arg1, 5, 1);
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method95(new class61(var3), arg1, true);
        }
        var4.method101(-125);
        class41.field998.method558((long) arg1, var4, 304);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 232)
    public static void method699(int arg0) {
        field2055 = null;
        field2079 = null;
        field2069 = null;
        if (arg0 <= 34) {
            field2062 = 98;
        }
        field2071 = null;
        field2078 = null;
        field2068 = null;
        field2081 = null;
        field2056 = null;
    }

    @OriginalMember(owner = "client!o", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 250)
    public final void keyTyped(KeyEvent arg0) {
        field2076++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 260)
    public static final void method700(int arg0, int arg1) {
        field2054++;
        if (arg0 != 1540 || !class21.method147((byte) 123)) {
            return;
        }
        if (class1.field27) {
            class26.field530 = arg1;
        } else {
            class107.method875(arg1, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!o", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 284)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class129.field3136 != null) {
            class114.field2888 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class52.field1288.length) {
                var3 = class52.field1288[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class75.field1872 >= 0 && var3 >= 0) {
                class126.field3088[class75.field1872] = ~var3;
                class75.field1872 = class75.field1872 + 1 & 0x7F;
                if (field2080 == class75.field1872) {
                    class75.field1872 = -1;
                }
            }
        }
        arg0.consume();
        field2075++;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 390)
    public static final void method701(int arg0) {
        class112.field2843 = 0;
        class76.field1921 = 0;
        class71.method601(1);
        field2073++;
        class96.method808(true);
        class74.method619((byte) 51);
        if (arg0 != -16851) {
            return;
        }
        for (int var1 = 0; var1 < class112.field2843; var1++) {
            int var3 = class78.field1955[var1];
            if (class34.field781 != class12.field231[var3].field1215) {
                class12.field231[var3].field2447 = null;
                class12.field231[var3] = null;
            }
        }
        if (class27.field547 != class97.field2448.field1556) {
            throw new RuntimeException("gnp1 pos:" + class97.field2448.field1556 + " psize:" + class27.field547);
        }
        for (int var2 = 0; var2 < class110.field2790; var2++) {
            if (class12.field231[class118.field2929[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class110.field2790);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 447)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2077++;
        if (class129.field3136 != null) {
            class75.field1872 = -1;
        }
    }

    @OriginalMember(owner = "client!o", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 466)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2058++;
        if (class129.field3136 != null) {
            class114.field2888 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class52.field1288.length) {
                var3 = class52.field1288[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class50.method388(false, arg0);
            }
            if (class75.field1872 >= 0 && var3 >= 0) {
                class126.field3088[class75.field1872] = var3;
                class75.field1872 = class75.field1872 + 1 & 0x7F;
                if (field2080 == class75.field1872) {
                    class75.field1872 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class25.field509 + 1 & 0x7F;
                if (class130.field3162 != var5) {
                    class69.field1768[class25.field509] = var3;
                    class17.field343[class25.field509] = var4;
                    class25.field509 = var5;
                }
            }
        }
        arg0.consume();
    }
}
