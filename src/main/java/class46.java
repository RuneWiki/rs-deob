import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends Canvas {

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field861;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lje;")
    public static class67 field848 = class85.method592(255, "::fpsoff");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    public static int[] field849 = new int[] { 0, 8, 0, 0, 0, 0, 0, 0, -2, 0, 7, 0, 0, 0, 6, 6, -2, 0, -2, 0, 5, 5, 5, 0, 4, 24, 4, 0, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, -2, 0, 0, 15, 4, 14, 0, 0, -2, 0, 0, 10, 3, 0, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, -2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, -1, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 6, 0, 0, 8, 0, 11, 0, 0, 3, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 7, 12, 0, -2, 0, 0, 0, 0, 0, 0, 6, 6, 0, 5, 0, 0, -1, 0, 3, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 0, 1, -2, 2, 0, 0, -1, 0, 2, 0, 0, 4, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 4, 0, 0, 0 };

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
    public static int[] field847 = new int[500];

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Z")
    public static boolean field855 = false;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lkc;")
    public static class72 field859 = null;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lje;")
    public static class67 field852 = class85.method592(255, "mapscene");

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lfd;")
    public static class40 field856;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lfd;")
    public static class40 field857;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lkd;")
    public static class73 field846;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method294(int arg0) {
        class49.field938 = new int[104];
        class84.field1858 = new int[104];
        class80.field1757 = new int[4][105][105];
        class59.field1185 = new byte[4][104][104];
        class40.field713 = new byte[4][104][104];
        class103.field2300 = new int[104];
        class41.field783 = new int[104];
        class79.field1745 = new byte[4][104][104];
        if (arg0 != 14223) {
            field853 = -57;
        }
        field860++;
        class158.field3613 = new int[104];
        class80.field1772 = new int[105][105];
        class27.field491 = new byte[4][104][104];
        class2.field21 = 99;
        class106.field2424 = new byte[4][105][105];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
    public static final int method295(int arg0, int arg1, int arg2) {
        int var3 = 24 / ((55 - arg1) / 63);
        field850++;
        if (arg2 >= 2) {
            int var4 = method295(arg0 * arg0, -51, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            return var4;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
    public static final void method296(int arg0, byte arg1) {
        field851++;
        class117 var2 = (class117) class79.field1705.method1119(28254, (long) arg0);
        if (arg1 == -25 && var2 != null) {
            for (int var3 = 0; var3 < var2.field2638.length; var3++) {
                var2.field2638[var3] = -1;
                var2.field2637[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method297(int arg0) {
        field857 = null;
        field849 = null;
        field856 = null;
        if (arg0 < 113) {
            return;
        }
        field852 = null;
        field848 = null;
        field847 = null;
        field859 = null;
        field846 = null;
    }

    @OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field861.update(arg0);
        field862++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lcc;")
    public static final class18 method298(int arg0, boolean arg1) {
        field854++;
        class18 var2 = (class18) class92.field2069.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field450.method267((byte) -124, arg0, 1);
        if (arg1) {
            method296(-105, (byte) 8);
        }
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method126(new class91(var3), 97, arg0);
        }
        var4.method131((byte) -61);
        class92.field2069.method765((long) arg0, var4, (byte) -51);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field861.paint(arg0);
        field863++;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class46(Component arg0) {
        this.field861 = arg0;
    }
}
