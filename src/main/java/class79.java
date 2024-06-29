import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Z")
    public boolean field1816 = true;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Ljava/lang/Object;")
    public Object field1810 = new Object();

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[I")
    public int[] field1821 = new int[500];

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
    public int[] field1822 = new int[500];

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field1823 = 0;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lgd;")
    private static class40 field1803 = class14.method90(false, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lgd;")
    private static class40 field1798 = class14.method90(false, "Hide");

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lgd;")
    public static class40 field1802 = class14.method90(false, "Freunde");

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lgd;")
    private static class40 field1797 = class14.method90(false, "Take");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lgd;")
    private static class40 field1799 = class14.method90(false, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lgd;")
    public static class40 field1812 = class14.method90(false, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lgd;")
    public static class40 field1813 = class14.method90(false, "Okay");

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lgd;")
    public static class40 field1811 = field1803;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lgd;")
    public static class40 field1807 = class14.method90(false, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lgd;")
    public static class40 field1801 = field1799;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lgd;")
    public static class40 field1817 = class14.method90(false, "@lre@");

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lgd;")
    public static class40 field1794 = field1797;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lgd;")
    public static class40 field1793 = field1798;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lgd;")
    public static class40 field1804 = class14.method90(false, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Z")
    public static boolean field1820 = false;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lgd;")
    private static class40 field1806 = class14.method90(false, "Loaded sprites");

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lgd;")
    public static class40 field1815 = field1806;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
    public static int[] field1809;

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        while (this.field1816) {
            Object var1 = this.field1810;
            synchronized (this.field1810) {
                if (this.field1823 < 500) {
                    this.field1822[this.field1823] = class40.field1001;
                    this.field1821[this.field1823] = class135.field3282;
                    this.field1823++;
                }
            }
            class51.method400((byte) -127, 50L);
        }
        field1805++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method527(boolean arg0) {
        field1819++;
        class2.field40++;
        class130.method1025((byte) 45, arg0);
        class12.method67(true, 99);
        class130.method1025((byte) -128, false);
        class12.method67(false, 103);
        class4.method28(19402);
        class126.method1002((byte) -117);
        if (!class8.field198) {
            int var1 = class16.field419;
            if (class59.field1497 / 256 > var1) {
                var1 = class59.field1497 / 256;
            }
            int var2 = class2.field43 + class87.field1948 & 0x7FF;
            if (class92.field2116[4] && class49.field1253[4] + 128 > var1) {
                var1 = class49.field1253[4] + 128;
            }
            class113.method875(var1, class94.field2171, class58.method439(class13.field332.field838, class13.field332.field792, !arg0, class99.field2361) - 50, var2, var1 * 3 + 600, 51, class100.field2371);
        }
        int var3;
        if (class8.field198) {
            var3 = class82.method548((byte) 115);
        } else {
            var3 = class55.method414(-109);
        }
        int var4 = class64.field1561;
        int var5 = class24.field573;
        int var6 = class113.field2735;
        int var7 = class53.field1350;
        int var8 = class128.field3073;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class92.field2116[var9]) {
                int var10 = (int) ((double) -class92.field2098[var9] + (double) (class92.field2098[var9] * 2 + 1) * Math.random() + Math.sin((double) class76.field1746[var9] / 100.0D * (double) class13.field343[var9]) * (double) class49.field1253[var9]);
                if (var9 == 1) {
                    class113.field2735 += var10;
                }
                if (var9 == 0) {
                    class64.field1561 += var10;
                }
                if (var9 == 4) {
                    class53.field1350 += var10;
                    if (class53.field1350 < 128) {
                        class53.field1350 = 128;
                    }
                    if (class53.field1350 > 383) {
                        class53.field1350 = 383;
                    }
                }
                if (var9 == 3) {
                    class128.field3073 = class128.field3073 + var10 & 0x7FF;
                }
                if (var9 == 2) {
                    class24.field573 += var10;
                }
            }
        }
        class113.method880(-28475);
        class97.field2296 = 0;
        class97.field2306 = class40.field1001 - 4;
        class97.field2285 = class135.field3282 - 4;
        class97.field2294 = true;
        class27.method162();
        class21.field490.method981(class64.field1561, class113.field2735, class24.field573, class53.field1350, class128.field3073, var3);
        class21.field490.method984();
        class34.method217(-100);
        class77.method522(-63);
        ((class92) class109.field2667).method618((byte) 91, class86.field1919);
        class24.method148((byte) -8);
        if (class83.field1879 && class135.method1058(false, (byte) -20, true) == 0) {
            class83.field1879 = false;
        }
        if (class83.field1879) {
            class113.method880(-28475);
            class27.method162();
            class100.method704(false, null, arg0, class69.field1668);
        }
        class70.method490((byte) 120);
        class128.field3073 = var8;
        class113.field2735 = var6;
        class24.field573 = var5;
        class64.field1561 = var4;
        class53.field1350 = var7;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 155)
    public static final int method528(int arg0, KeyEvent arg1) {
        field1814++;
        int var2 = arg1.getKeyChar();
        if (arg0 != -9087) {
            field1794 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 178)
    public static final void method529(int arg0) {
        field1796++;
        if (class7.field179 != null) {
            class7.field179.method71();
            class7.field179 = null;
        }
        if (arg0 != -19) {
            field1807 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 199)
    public static final void method530(int arg0) {
        field1800++;
        class40 var1 = null;
        for (int var2 = 0; var2 < class48.field1231; var2++) {
            if (class131.field3178[var2].method258(field1817, (byte) -68) != -1) {
                var1 = class131.field3178[var2].method240(-28427, class131.field3178[var2].method258(field1817, (byte) -88));
                break;
            }
        }
        if (var1 == null) {
            class74.method504(true);
            return;
        }
        int var3 = class101.field2407;
        int var4 = class65.field1575;
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class16.field431;
        if (var5 > 190) {
            var5 = 190;
        }
        int var6 = 6116423;
        int var7 = class65.field1578;
        class27.method164(var3, var4, var5, var7, var6);
        class27.method164(var3 + 1, var4 - -1, var5 - 2, 16, 0);
        class27.method168(var3 + 1, var4 + 18, var5 - 2, var7 + -19, 0);
        class1.field17.method358(var1, var3 + 3, var4 + 14, var6, false);
        int var8 = class135.field3282;
        if (arg0 < 112) {
            return;
        }
        int var9 = class40.field1001;
        if (class113.field2742 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (class113.field2742 == 1) {
            var8 -= 205;
            var9 -= 553;
        }
        if (class113.field2742 == 2) {
            var8 -= 357;
            var9 -= 17;
        }
        for (int var10 = 0; var10 < class48.field1231; var10++) {
            int var11 = (class48.field1231 - var10 - 1) * 15 + var4 + 31;
            class40 var12 = class131.field3178[var10];
            if (var12.method261(var1, false)) {
                var12 = var12.method242(0, -12448, var12.method255(-10) - var1.method255(-10));
                if (var12.method261(class34.field867, false)) {
                    var12 = var12.method242(0, -12448, var12.method255(-10) - class34.field867.method255(-10));
                }
            }
            int var13 = 16777215;
            if (var3 < var9 && var9 < var3 + var5 && var8 > var11 - 13 && var11 + 3 > var8) {
                var13 = 16776960;
            }
            class1.field17.method358(var12, var3 + 3, var11, var13, true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lje;", line = 311)
    public static final class59 method531(byte arg0) {
        field1818++;
        try {
            if (arg0 != -125) {
                method530(-48);
            }
            return (class59) Class.forName("ga").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class50();
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 348)
    public static void method532(int arg0) {
        field1803 = null;
        field1817 = null;
        field1811 = null;
        field1799 = null;
        field1813 = null;
        field1807 = null;
        field1802 = null;
        field1801 = null;
        field1794 = null;
        field1804 = null;
        field1793 = null;
        field1797 = null;
        field1815 = null;
        if (arg0 == 4433) {
            field1806 = null;
            field1809 = null;
            field1798 = null;
            field1812 = null;
        }
    }
}
