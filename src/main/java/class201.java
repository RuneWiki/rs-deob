import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class201 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public boolean field3632 = true;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field3629 = new Object();

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field3638 = 0;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
    public int[] field3642 = new int[500];

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
    public int[] field3643 = new int[500];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Loh;")
    public static class263 field3626 = class253.method1681(-122, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Loh;")
    public static class263 field3635 = class253.method1681(-117, "<img=1>");

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Loh;")
    public static class263 field3628 = class253.method1681(-125, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3636 = -1;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Loh;")
    public static class263 field3637 = class253.method1681(-123, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "F")
    public static float field3627;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field3630;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1394(int arg0, byte arg1) {
        field3634++;
        if (arg1 != 72) {
            method1394(116, (byte) -82);
        }
        return (arg0 & 0x1A473193) >> 28 != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method1395(byte arg0) {
        field3631++;
        for (int var1 = 0; var1 < class249.field4355; var1++) {
            int var2 = class21.field627[var1];
            class137 var3 = class151.field2725[var2];
            int var4 = class189.field3394.method1301(-8317);
            if ((var4 & 0x80) != 0) {
                var4 += class189.field3394.method1301(-8317) << 8;
            }
            class143.method949(false, var4, var2, var3);
        }
        if (arg0 >= -88) {
            field3625 = 60;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLue;)V")
    public static final void method1396(byte arg0, class86 arg1) {
        field3641++;
        class269.field4751 = arg1;
        if (arg0 >= -27) {
            field3637 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3628 = null;
        field3626 = null;
        if (arg0 != 18701) {
            method1394(29, (byte) -17);
        }
        field3637 = null;
        field3635 = null;
        field3630 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method1398(int arg0, int arg1, int arg2) {
        field3633++;
        int var3 = 77 % ((arg0 - 9) / 34);
        if (class252.field4384 < 2 && class49.field1060 == 0 && !class130.field2387) {
            return;
        }
        class263 var4;
        if (class49.field1060 == 1 && class252.field4384 < 2) {
            var4 = class124.method797(-51, new class263[] { class152.field2739, class277.field4856, class236.field4127, class165.field3012 });
        } else if (class130.field2387 && class252.field4384 < 2) {
            var4 = class124.method797(-50, new class263[] { class151.field2727, class277.field4856, class39.field875, class165.field3012 });
        } else if (class176.field3176 && class248.field4342[81] && class252.field4384 > 2) {
            var4 = class200.method1388(class252.field4384 - 2, false);
        } else {
            var4 = class200.method1388(class252.field4384 - 1, false);
        }
        if (class252.field4384 > 2) {
            var4 = class124.method797(-95, new class263[] { var4, class164.field2986, class136.method891(-126, class252.field4384 - 2), class43.field929 });
        }
        int var5 = class107.field2026.method415(var4, arg1 + 4, arg2 + 15, 16777215, 0, class2.field22, class200.field3624);
        class53.method338(arg1 + 4, 2, 15, arg2, var5 + class107.field2026.method408(var4));
    }

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
    public final void run() {
        field3639++;
        while (this.field3632) {
            Object var1 = this.field3629;
            synchronized (this.field3629) {
                if (this.field3638 < 500) {
                    this.field3643[this.field3638] = class136.field2492;
                    this.field3642[this.field3638] = class252.field4380;
                    this.field3638++;
                }
            }
            class215.method1457(50L, (byte) 120);
        }
    }
}
