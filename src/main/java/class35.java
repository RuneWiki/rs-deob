import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 {

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    private int field897 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "[Lob;")
    private class99[] field879;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lr;")
    public static class118 field867 = class153.method1136(127, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Z")
    public static boolean field884 = false;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    public static int[] field873 = new int[5];

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lr;")
    public static class118 field885 = class153.method1136(113, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Lr;")
    public static class118 field888 = class153.method1136(83, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "J")
    private long field889;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lpe;")
    public static class109 field878;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lvd;")
    public static class150 field891;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lob;")
    private class99 field875;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lob;")
    private class99 field896;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
    public static int[] field887;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
    public static int[] field890;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "[I")
    public static int[] field895;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method286(int arg0) {
        field880++;
        if (arg0 != 64) {
            method287((byte) 82);
        }
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method287(byte arg0) {
        if (arg0 != -43) {
            return;
        }
        field866++;
        while (true) {
            class113 var1 = class62.field1432;
            class34 var2;
            synchronized (class62.field1432) {
                var2 = (class34) class158.field3643.method890((byte) -82);
            }
            if (var2 == null) {
                return;
            }
            var2.field863.method582(var2.field865, var2.field845, (int) var2.field2295, false, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lob;JB)V")
    public final void method288(class99 arg0, long arg1, byte arg2) {
        if (arg0.field2282 != null) {
            arg0.method768(-1);
        }
        field876++;
        class99 var5 = this.field879[(int) ((long) (this.field892 - 1) & arg1)];
        if (arg2 != -91) {
            return;
        }
        arg0.field2282 = var5.field2282;
        arg0.field2280 = var5;
        arg0.field2295 = arg1;
        arg0.field2282.field2280 = arg0;
        arg0.field2280.field2282 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public static final void method289(int arg0, int arg1, int arg2) {
        field872++;
        if (arg1 != 0) {
            method293((byte) 3);
        }
        class113 var3 = class84.field2022[class106.field2468][arg2][arg0];
        if (var3 == null) {
            class68.field1583.method1183(class106.field2468, arg2, arg0);
            return;
        }
        class84 var4 = null;
        int var5 = -99999999;
        for (class84 var6 = (class84) var3.method889(121); var6 != null; var6 = (class84) var3.method884(true)) {
            class85 var11 = class131.method1013(arg1 ^ 0xFFFFCEDA, var6.field2016);
            int var12 = var11.field2047;
            if (var11.field2033 == 1) {
                var12 = (var6.field2001 + 1) * var12;
            }
            if (var12 > var5) {
                var5 = var12;
                var4 = var6;
            }
        }
        if (var4 == null) {
            class68.field1583.method1183(class106.field2468, arg2, arg0);
            return;
        }
        var3.method894(-1, var4);
        class84 var7 = null;
        class84 var8 = null;
        class84 var9 = (class84) var3.method889(arg1 - 99);
        int var10 = (arg0 << 7) + (arg2 + 1610612736);
        while (var9 != null) {
            if (var4.field2016 != var9.field2016) {
                if (var8 == null) {
                    var8 = var9;
                }
                if (var8.field2016 != var9.field2016 && var7 == null) {
                    var7 = var9;
                }
            }
            var9 = (class84) var3.method884(true);
        }
        class68.field1583.method1151(class106.field2468, arg2, arg0, class46.method386(-15186, class106.field2468, arg2 * 128 + 64, arg0 * 128 + 64), var4, var10, var8, var7);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lob;")
    public final class99 method290(int arg0) {
        field882++;
        if (this.field897 > 0 && this.field879[this.field897 - 1] != this.field896) {
            class99 var2 = this.field896;
            this.field896 = var2.field2280;
            return var2;
        }
        while (this.field897 < this.field892) {
            class99 var3 = this.field879[this.field897++].field2280;
            if (this.field879[this.field897 - 1] != var3) {
                this.field896 = var3.field2280;
                return var3;
            }
        }
        return arg0 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method291(int arg0) {
        if (arg0 != 685067815) {
            return;
        }
        field887 = null;
        field891 = null;
        field867 = null;
        field885 = null;
        field888 = null;
        field873 = null;
        field890 = null;
        field895 = null;
        field878 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lr;ZB)V")
    public static final void method292(class118 arg0, boolean arg1, byte arg2) {
        byte var3 = 4;
        field877++;
        int var4 = var3 + 6;
        int var5 = class10.field228.method41(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class10.field228.method56(arg0, 250) * 13;
        class52.method473(var4 - var3, var6 - var3, var3 + var3 + var5, var3 + var3 + var7, 0);
        class52.method478(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 - -var3 + var7, 16777215);
        if (arg2 != -92) {
            method291(-38);
        }
        class10.field228.method50(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class121.method947(var4 - var3, var5 - (-var3 - var3), 123, var3 + var7 + var3, -var3 + var6);
        if (!arg1) {
            class60.method534((byte) -19, var6, var7, var4, var5);
            return;
        }
        try {
            Graphics var8 = class4.field70.getGraphics();
            class13.field291.method529(0, var8, 0, arg2 - 9588);
        } catch (Exception var9) {
            class4.field70.repaint();
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static final void method293(byte arg0) {
        field870++;
        if (arg0 > -87) {
            method291(-101);
        }
        class1.field19.method394(12693);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)Lob;")
    public final class99 method294(byte arg0) {
        field886++;
        if (this.field875 == null) {
            return null;
        }
        class99 var2 = this.field879[(int) (this.field889 & (long) (this.field892 - 1))];
        int var3 = 36 / ((arg0 + 34) / 53);
        while (this.field875 != var2) {
            if (this.field875.field2295 == this.field889) {
                class99 var4 = this.field875;
                this.field875 = this.field875.field2280;
                return var4;
            }
            this.field875 = this.field875.field2280;
        }
        this.field875 = null;
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILea;I)V")
    public static final void method295(int arg0, class30 arg1, int arg2) {
        if (arg1.field758 > class65.field1479) {
            class101.method777(arg1, (byte) -124);
        } else if (class65.field1479 <= arg1.field748) {
            class132.method1019(31106, arg1);
        } else {
            class10.method79(arg1, 3370);
        }
        if (arg1.field760 < 128 || arg1.field712 < 128 || arg1.field760 >= 13184 || arg1.field712 >= 13184) {
            arg1.field748 = 0;
            arg1.field746 = -1;
            arg1.field760 = arg1.field710[0] * 128 + arg1.field733 * 64;
            arg1.field758 = 0;
            arg1.field735 = -1;
            arg1.field712 = arg1.field755[0] * 128 + arg1.field733 * 64;
            arg1.method260(false);
        }
        field868++;
        if (class89.field2150 == arg1 && (arg1.field760 < 1536 || arg1.field712 < 1536 || arg1.field760 >= 11776 || arg1.field712 >= 11776)) {
            arg1.field735 = -1;
            arg1.field748 = 0;
            arg1.field712 = arg1.field755[0] * 128 + arg1.field733 * 64;
            arg1.field746 = -1;
            arg1.field758 = 0;
            arg1.field760 = arg1.field710[0] * 128 + arg1.field733 * 64;
            arg1.method260(false);
        }
        class45.method376((byte) 127, arg1);
        class115.method900(arg0 ^ 0x3F44, arg1);
        if (arg0 != 16189) {
            method292(null, true, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lob;")
    public final class99 method296(int arg0) {
        this.field897 = arg0;
        field869++;
        return this.method290(arg0 - 1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)Lob;")
    public final class99 method297(long arg0, int arg1) {
        this.field889 = arg0;
        class99 var4 = this.field879[(int) (arg0 & (long) (this.field892 + arg1))];
        this.field875 = var4.field2280;
        field883++;
        while (this.field875 != var4) {
            if (this.field875.field2295 == arg0) {
                class99 var5 = this.field875;
                this.field875 = this.field875.field2280;
                return var5;
            }
            this.field875 = this.field875.field2280;
        }
        this.field875 = null;
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
    public class35(int arg0) {
        this.field879 = new class99[arg0];
        this.field892 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class99 var3 = this.field879[var2] = new class99();
            var3.field2282 = var3;
            var3.field2280 = var3;
        }
    }
}
