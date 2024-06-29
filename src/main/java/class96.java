import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class96 extends Canvas {

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1515;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lqe;")
    public static class168 field1505 = class66.method448("::fps ", 39);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lqe;")
    public static class168 field1509 = class66.method448("cookieprefix", 40);

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[Lvj;")
    public static class218[] field1511 = new class218[4];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lqe;")
    public static class168 field1513 = class66.method448("Weiter", -120);

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lqe;")
    public static class168 field1512 = class66.method448("cross", 19);

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[J")
    public static long[] field1516 = new long[1000];

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field1520 = -1;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lqe;")
    public static class168 field1508 = class66.method448("; version=1; path=)4; domain=", 71);

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Lqe;")
    public static class168 field1521 = class66.method448("Spieler", -121);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Lrd;")
    public static class207 field1517;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[[[B")
    public static byte[][][] field1510;

    @OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1515.paint(arg0);
        field1519++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method632(byte arg0) {
        field1512 = null;
        field1517 = null;
        field1511 = null;
        field1510 = null;
        field1513 = null;
        field1521 = null;
        if (arg0 != -65) {
            method634(null, 14, 114, 96);
        }
        field1516 = null;
        field1509 = null;
        field1508 = null;
        field1505 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBIII)V")
    public static final void method633(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class91.field1423 = class42.field552 * arg2 / arg4;
        class68.field971 = -1;
        field1506++;
        class151.field2629 = class79.field1189 * arg3 / arg0;
        class27.field342 = -1;
        if (arg1 < 106) {
            method635(29, false);
        }
        class55.method386((byte) 44);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lqf;III)V")
    public static final void method634(class13 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class90.field1406) {
            class177 var4 = class254.field4395[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3101 != null && var4.field3101.field153.method42()) {
                arg0.method41(var4.field3101.field153, 128, 0, 0, true);
            }
        }
        if (arg3 < class90.field1406) {
            class177 var5 = class254.field4395[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3101 != null && var5.field3101.field153.method42()) {
                arg0.method41(var5.field3101.field153, 0, 0, 128, true);
            }
        }
        if (arg2 < class90.field1406 && arg3 < class32.field386) {
            class177 var6 = class254.field4395[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3101 != null && var6.field3101.field153.method42()) {
                arg0.method41(var6.field3101.field153, 128, 0, 128, true);
            }
        }
        if (arg2 < class90.field1406 && arg3 > 0) {
            class177 var7 = class254.field4395[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3101 != null && var7.field3101.field153.method42()) {
                arg0.method41(var7.field3101.field153, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)I")
    public static final int method635(int arg0, boolean arg1) {
        field1523++;
        long var2 = class59.method407(-108);
        for (class245 var4 = arg1 ? (class245) class104.field1673.method1536(70) : (class245) class104.field1673.method1534(-21389); var4 != null; var4 = (class245) class104.field1673.method1534(-21389)) {
            if ((var4.field4249 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4249 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3308;
                    class92.field1441[var5] = class50.field682[var5];
                    var4.method1234(17216);
                    return var5;
                }
                var4.method1234(17216);
            }
        }
        if (arg0 < 72) {
            return 62;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1507++;
        this.field1515.update(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class96(Component arg0) {
        this.field1515 = arg0;
    }
}
