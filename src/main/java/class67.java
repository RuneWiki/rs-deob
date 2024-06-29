import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class67 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[[I")
    public static int[][] field1355 = new int[5][5000];

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lqb;")
    public static class146 field1362 = new class146(0, 0);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lsd;")
    private static class166 field1363 = class135.method935("flash1:", 0);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1366 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lsd;")
    public static class166 field1364 = class135.method935("scrollen:", 0);

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lsd;")
    public static class166 field1368 = class135.method935("(U4", 0);

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lsd;")
    public static class166 field1370 = field1363;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lsd;")
    private static class166 field1365 = class135.method935("Hidden", 0);

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lsd;")
    public static class166 field1371 = field1363;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lsd;")
    public static class166 field1372 = class135.method935("Hierhin gehen", 0);

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lsd;")
    public static class166 field1367 = field1365;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field1357;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    public int[] field1369;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final void method544(int arg0) {
        field1360++;
        class17.method89(this.field1369, this.field1354, this.field1361);
        if (arg0 != 0) {
            this.method544(54);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method545(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method546(int arg0) {
        if (arg0 >= -2) {
            method549(17);
        }
        field1364 = null;
        field1368 = null;
        field1362 = null;
        field1370 = null;
        field1367 = null;
        field1371 = null;
        field1363 = null;
        field1365 = null;
        field1355 = null;
        field1372 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method547(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method548(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public static final void method549(int arg0) {
        while (true) {
            if (class179.field3377.method702(class19.field335, 56) >= 27) {
                int var1 = class179.field3377.method708(8, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class124.field2434[var1] == null) {
                        var2 = true;
                        class124.field2434[var1] = new class154();
                    }
                    class154 var3 = class124.field2434[var1];
                    class58.field1186[class98.field1880++] = var1;
                    var3.field3535 = class49.field910;
                    int var4 = class179.field3377.method708(8, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var3.field2958 = class185.method1252(class179.field3377.method708(8, 14), 24851);
                    int var5 = class179.field3377.method708(8, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class62.field1273[class179.field3377.method708(8, 3)];
                    if (var2) {
                        var3.field3489 = var3.field3488 = var6;
                    }
                    int var7 = class179.field3377.method708(8, 1);
                    int var8 = class179.field3377.method708(8, 1);
                    if (var8 == 1) {
                        class2.field11[class206.field4058++] = var1;
                    }
                    var3.field3525 = var3.field2958.field1563;
                    var3.field3496 = var3.field2958.field1580;
                    var3.field3539 = var3.field2958.field1559;
                    var3.field3507 = var3.field2958.field1603;
                    var3.field3490 = var3.field2958.field1562;
                    var3.field3508 = var3.field2958.field1576;
                    var3.field3528 = var3.field2958.field1566;
                    var3.field3492 = var3.field2958.field1574;
                    var3.field3516 = var3.field2958.field1571;
                    if (var3.field3528 == 0) {
                        var3.field3488 = 0;
                    }
                    var3.method1242(class41.field728.field3554[0] + var5, 112, var7 == 1, class41.field728.field3521[0] + var4);
                    continue;
                }
            }
            int var9 = -27 / ((arg0 + 21) / 40);
            field1356++;
            class179.field3377.method711((byte) 127);
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    protected class67() {
    }
}
