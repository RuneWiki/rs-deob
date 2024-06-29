import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class86 implements Runnable {

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
    public boolean field1580 = true;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1575 = new Object();

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    public int[] field1588 = new int[500];

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field1586 = 0;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public int[] field1589 = new int[500];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lsg;")
    private static class169 field1577 = class165.method1060("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 1536);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lsg;")
    private static class169 field1576 = class165.method1060("Loading title screen )2 ", 1536);

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lsg;")
    public static class169 field1581 = class165.method1060("Fehler beim Laden Ihres Spielcharakters)3", 1536);

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1579 = 1;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lsg;")
    public static class169 field1585 = field1576;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lsg;")
    public static class169 field1574 = class165.method1060("Anmelde)2Limit -Uberschritten)3", 1536);

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lsg;")
    public static class169 field1587 = field1577;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lsg;")
    public static class169 field1573 = class165.method1060(" <col=00ff80>", 1536);

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lua;")
    public static class181 field1578 = new class181(64);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "[Lgd;")
    public static class59[] field1583;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1574 = null;
        field1576 = null;
        field1578 = null;
        field1587 = null;
        field1581 = null;
        field1585 = null;
        field1583 = null;
        if (arg0 != -128) {
            field1581 = null;
        }
        field1577 = null;
        field1573 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)I")
    public static final int method515(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1583 = null;
        }
        field1590++;
        int var3 = class3.method20(arg2 + 91923, arg0 + 45365, 4, 46) + (class3.method20(arg2 + 37821, arg0 + 10294, 2, 26) - 128 >> 1) + (class3.method20(arg2, arg0, 1, 50) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        field1584++;
        while (this.field1580) {
            Object var1 = this.field1575;
            synchronized (this.field1575) {
                if (this.field1586 < 500) {
                    this.field1588[this.field1586] = class22.field459;
                    this.field1589[this.field1586] = class150.field2806;
                    this.field1586++;
                }
            }
            client.method203(50L, (byte) -72);
        }
    }
}
