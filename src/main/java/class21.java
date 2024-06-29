import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 extends Canvas {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field581;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lkd;")
    public static class73 field576 = class126.method1070((byte) -66, "Menge eingeben:");

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lkd;")
    public static class73 field578 = class126.method1070((byte) -66, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field580 = false;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lkd;")
    private static class73 field587 = class126.method1070((byte) -66, "Click to continue");

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lkd;")
    public static class73 field583 = class126.method1070((byte) -66, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field590 = 0;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lkd;")
    public static class73 field585 = field587;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lqb;")
    public static class113 field575;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lha;")
    public static class50 field582;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method168(byte arg0) {
        field591++;
        if (arg0 != -35) {
            field587 = null;
        }
        class78.field1991.method534((byte) 45);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method169(boolean arg0) {
        field589++;
        class9.method85(2);
        if (class87.field2196 == 1) {
            class41.field1100[class111.field2735 / 100].method860(class122.field3122 - 12, class74.field1918 + -8 + -4);
        }
        if (class87.field2196 == 2) {
            class41.field1100[class111.field2735 / 100 + 4].method860(class122.field3122 - 8 - 4, class74.field1918 + -4 + -8);
        }
        if (class1.field80 != -1) {
            class109.method870(104, class1.field80);
            class103.method830(23578, 4, 0, 334, class1.field80, 0, 512);
        }
        if (class52.field1393 != -1) {
            class109.method870(119, class52.field1393);
            class103.method830(23578, 0, 0, 334, class52.field1393, 0, 512);
        }
        class14.method118(arg0);
        if (!class15.field459) {
            class80.method683((byte) -113);
            class48.method384((byte) -36);
        } else if (class50.field1333 == 0) {
            class146.method1169((byte) 106);
        }
        if (class53.field1420 == 1) {
            class28.field805.method860(472, 296);
        }
        if (class92.field2378) {
            byte var1 = 20;
            short var2 = 507;
            class109.field2688.method361(class32.method258(-128, new class73[] { class115.field2905, class78.method676(class76.field1942, -108) }), var2, var1, 16776960, -1);
            int var9 = var1 + 15;
            int var3 = 16776960;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class77.field1971) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class77.field1971) {
                var3 = 16711680;
            }
            class109.field2688.method361(class32.method258(-112, new class73[] { class47.field1266, class78.method676(var5, -19), class18.field510 }), var2, var9, var3, -1);
            var9 += 15;
            if (client.field594) {
                class109.field2688.method361(class150.field3717, var2, var9, 16711680, -1);
                var9 += 15;
                client.field594 = false;
            }
            if (class116.field2974) {
                class109.field2688.method361(class5.field174, var2, var9, 16711680, -1);
                var9 += 15;
                class116.field2974 = false;
            }
            if (class98.field2456) {
                class109.field2688.method361(class2.field137, var2, var9, 16711680, -1);
                class98.field2456 = false;
                var9 += 15;
            }
        }
        if (class53.field1424 == 0) {
            return;
        }
        int var6 = class53.field1424 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class109.field2688.method355(class32.method258(-58, new class73[] { class38.field1039, class78.method676(var7, -74), class48.field1279, class78.method676(var8, -62) }), 4, 329, 16776960, -1);
        } else {
            class109.field2688.method355(class32.method258(-97, new class73[] { class38.field1039, class78.method676(var7, -3), class146.field3603, class78.method676(var8, -12) }), 4, 329, 16776960, -1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field584++;
        this.field581.paint(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method170(int arg0) {
        class58.field1547 = 0;
        class110.field2712 = 0;
        field579++;
        class45.method336((byte) -68);
        class100.method812((byte) -64);
        class89.method744((byte) 91);
        int var1 = -76 / ((arg0 + 28) / 32);
        for (int var2 = 0; var2 < class58.field1547; var2++) {
            int var4 = class89.field2246[var2];
            if (class49.field1308 != class133.field3345[var4].field2270) {
                class133.field3345[var4].field301 = null;
                class133.field3345[var4] = null;
            }
        }
        if (class81.field2039 != class89.field2235.field2816) {
            throw new RuntimeException("gnp1 pos:" + class89.field2235.field2816 + " psize:" + class81.field2039);
        }
        for (int var3 = 0; var3 < client.field618; var3++) {
            if (class133.field3345[class55.field1455[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + client.field618);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field586++;
        this.field581.update(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class21(Component arg0) {
        this.field581 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field587 = null;
        field575 = null;
        field578 = null;
        field576 = null;
        field582 = null;
        if (arg0 >= 80) {
            field585 = null;
            field583 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
    public static final int method172(int arg0, int arg1, int arg2) {
        field577++;
        class2 var3 = (class2) class70.field1768.method1099(57, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field141.length) {
            if (arg0 > -25) {
                method168((byte) -86);
            }
            return var3.field141[arg1];
        } else {
            return -1;
        }
    }
}
