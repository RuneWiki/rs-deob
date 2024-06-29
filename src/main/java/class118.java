import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class118 extends class96 {

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Z")
    public static boolean field1847 = false;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Llb;")
    public static class210 field1851 = new class210(0, 0);

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lna;")
    public class26 field1862;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
    public int[] field1852;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
    public int[] field1853;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
    public int[] field1857;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
    public int[] field1864;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 15)
    public final void method813(int arg0) {
        if (this.field1864 != null) {
            for (int var2 = 0; var2 < this.field1864.length; var2++) {
                this.field1864[var2] = class240.method1652(this.field1864[var2], 32768);
            }
        }
        if (this.field1853 != null) {
            for (int var3 = 0; var3 < this.field1853.length; var3++) {
                this.field1853[var3] = class240.method1652(this.field1853[var3], 32768);
            }
        }
        field1855++;
        int var4 = 46 / ((arg0 + 27) / 38);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)I", line = 45)
    public final int method814(int arg0, int arg1) {
        field1849++;
        if (this.field1864 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field1864.length; var3++) {
            if (this.field1852[var3] == arg0) {
                return this.field1864[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwa;II)V", line = 66)
    private final void method815(class82 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method814(-91, -3);
        }
        if (arg2 == 1) {
            this.field1862 = arg0.method615(true);
        } else if (arg2 == 2) {
            int var6 = arg0.method642((byte) -38);
            this.field1853 = new int[var6];
            this.field1857 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1853[var7] = arg0.method576(1);
                this.field1857[var7] = class315.method2183(true, arg0.method599(false));
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method642((byte) -114);
            this.field1864 = new int[var4];
            this.field1852 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1864[var5] = arg0.method576(arg1 + 1);
                this.field1852[var5] = class315.method2183(true, arg0.method599(false));
            }
        } else if (arg2 == 4) {
        }
        field1848++;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 128)
    public static void method816(int arg0) {
        field1851 = null;
        if (arg0 != -1667) {
            field1863 = 101;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I", line = 141)
    public final int method817(byte arg0, int arg1) {
        field1850++;
        int var3 = 45 / ((arg0 + 30) / 49);
        if (this.field1853 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field1853.length; var4++) {
            if (this.field1857[var4] == arg1) {
                return this.field1853[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwa;B)V", line = 170)
    public final void method818(class82 arg0, byte arg1) {
        if (arg1 <= 104) {
            this.field1853 = (int[]) null;
        }
        while (true) {
            int var3 = arg0.method642((byte) -62);
            if (var3 == 0) {
                field1856++;
                return;
            }
            this.method815(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)Lna;", line = 191)
    public static final class26 method819(byte arg0) {
        class26 var1;
        if (class134.field2046 == 1 && class126.field1955 < 2) {
            var1 = class236.method1587(new class26[] { class110.field1755, class61.field989, class236.field3764, class12.field169 }, (byte) -105);
        } else if (class86.field1420 && class126.field1955 < 2) {
            var1 = class236.method1587(new class26[] { class33.field559, class61.field989, class308.field5303, class12.field169 }, (byte) -95);
        } else if (class225.field3564 && class78.field1183[81] && class126.field1955 > 2) {
            var1 = class82.method641(class126.field1955 - 2, true);
        } else {
            var1 = class82.method641(class126.field1955 - 1, true);
        }
        if (class126.field1955 > 2) {
            var1 = class236.method1587(new class26[] { var1, class273.field4574, class149.method1019((byte) 9, class126.field1955 - 2), class264.field4318 }, (byte) -62);
        }
        int var2 = -97 % ((arg0 - 55) / 32);
        field1858++;
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)V", line = 224)
    public static final void method820(int arg0, int arg1) {
        field1859++;
        if (arg1 == -28236) {
            class186 var2 = (class186) class55.field876.method1827((long) arg0, 0);
            if (var2 != null) {
                var2.method1006(-1024);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Color;ZZLna;I)V", line = 265)
    public static final void method821(Color arg0, boolean arg1, boolean arg2, class26 arg3, int arg4) {
        field1854++;
        try {
            Graphics var5 = class250.field4085.getGraphics();
            if (class110.field1749 == null) {
                class110.field1749 = new Font("Helvetica", 1, 13);
                class312.field5334 = class250.field4085.getFontMetrics(class110.field1749);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class38.field622, class141.field2153);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg1) {
                return;
            }
            try {
                if (class50.field792 == null) {
                    class50.field792 = class250.field4085.createImage(304, 34);
                }
                Graphics var6 = class50.field792.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class110.field1749);
                var6.setColor(Color.white);
                arg3.method163(22, (304 - arg3.method206(-21018, class312.field5334)) / 2, var6, (byte) -90);
                var5.drawImage(class50.field792, class38.field622 / 2 - 152, class141.field2153 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class38.field622 / 2 - 152;
                int var9 = class141.field2153 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg4 * 3 + (var8 + 2), var9 + 2, 300 - arg4 * 3, 30);
                var5.setFont(class110.field1749);
                var5.setColor(Color.white);
                arg3.method163(var9 + 22, var8 + (-arg3.method206(-21018, class312.field5334) + 304) / 2, var5, (byte) -125);
            }
            if (class216.field3385 != null) {
                var5.setFont(class110.field1749);
                var5.setColor(Color.white);
                class216.field3385.method163(class141.field2153 / 2 - 26, class38.field622 / 2 - class216.field3385.method206(-21018, class312.field5334) / 2, var5, (byte) -116);
            }
        } catch (Exception var12) {
            class250.field4085.repaint();
        }
    }
}
