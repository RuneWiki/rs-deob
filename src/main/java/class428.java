import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public abstract class class428 {

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lgca;")
    public class261 field6741;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6753 = new String[] { method3396(method3395("o\u007f:;g6")), method3396(method3395("o\u007f:;e6")), method3396(method3395("o\u007f:;y6")), method3396(method3395("o\u007f:;x6")), method3396(method3395("e3u;T")), method3396(method3395("o\u007f:;\u0015ws2a\u00176")), method3396(method3395("ph7y")), method3396(method3395("o\u007f:;f6")), method3396(method3395("o\u007f:;d6")), method3396(method3395("o\u007f:;c6")), method3396(method3395("o\u007f:;b6")) };

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6750 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "Lak;")
    public static class369 field6751 = new class369();

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "D")
    public static double field6752;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "F")
    public static float field6749;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public void method3296(byte arg0) {
        try {
            field6743++;
            if (arg0 != -26) {
                field6749 = -0.34515822F;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public static void method3390(int arg0) {
        try {
            field6750 = null;
            if (arg0 != 6761) {
                method3393(14);
            }
            field6751 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6753[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lln;BI)V")
    public abstract void method1222(class399 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
    public abstract void method1224(boolean arg0);

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
    public abstract void method1219(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lgca;)V")
    public class428(class261 arg0) {
        try {
            this.field6741 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[5] + (arg0 == null ? field6753[6] : field6753[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public void method3391(int arg0) {
        try {
            field6744++;
            if (arg0 != 100) {
                this.method3392(-14);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public void method3297(int arg0) {
        try {
            field6747++;
            if (arg0 <= 114) {
                this.method3391(49);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
    public abstract void method1225(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
    public void method3392(int arg0) {
        try {
            field6745++;
            if (arg0 != -142) {
                method3393(-108);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "(I)Z")
    public abstract boolean method1226(int arg0);

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZ)V")
    public abstract void method1221(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "(I)I")
    public static final int method3393(int arg0) {
        try {
            field6742++;
            class63 var1 = class662.field9437;
            boolean var2 = false;
            if (class623.field8996.field6379.method4132(true) != 0) {
                Canvas var3 = new Canvas();
                var3.setSize(100, 100);
                var2 = true;
                var1 = class114.method1098(var3, null, 0, 0, null, 0);
            }
            long var4 = class712.method5167(-2334);
            for (int var6 = 0; var6 < 10000; var6++) {
                var1.method163(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            }
            int var7 = (int) (class712.method5167(-2334) - var4);
            int var8 = 84 / ((arg0 + 27) / 46);
            var1.method664(0, -16777216, 100, 0, 100, true);
            if (var2) {
                var1.method668(-4369);
            }
            return var7;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6753[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
    public void method3394(byte arg0) {
        try {
            field6748++;
            if (arg0 < 45) {
                this.method1224(true);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "(I)V")
    public void method2733(int arg0) {
        try {
            if (arg0 != 75) {
                this.method1226(-115);
            }
            field6746++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6753[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3395(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3396(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
