import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 extends class96 {

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Lwb;")
    public static class130 field798 = class26.method212("Texturen geladen)3", -32376);

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lwb;")
    public static class130 field803 = class26.method212("(Udns", -32376);

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "Lwb;")
    public static class130 field807 = class26.method212("und loggen sich dann erneut ein)3", -32376);

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Lqa;")
    public static class97 field801 = new class97(5000);

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lab;")
    public static class3 field816 = new class3();

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "Lwb;")
    public static class130 field818 = class26.method212("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", -32376);

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
    public static int[] field819 = new int[2000];

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Lwb;")
    public static class130 field821 = class26.method212("overlay_multiway", -32376);

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Lwb;")
    public static class130 field820 = class26.method212("Ihr Spielkonto wurde deaktiviert)3", -32376);

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Lwb;")
    private static class130 field823 = class26.method212("Loading title screen )2 ", -32376);

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lwb;")
    public static class130 field822 = field823;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Led;")
    public class29 field805;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Led;")
    public class29 field813;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lmc;")
    public static class75 field802;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[I")
    public static int[] field799;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lb;BI[B)V", line = 4)
    public static final void method237(class7 arg0, byte arg1, int arg2, byte[] arg3) {
        field809++;
        class37 var4 = new class37();
        var4.field1086 = arg3;
        if (arg1 != -83) {
            method238(-62);
        }
        var4.field2329 = arg2;
        var4.field1092 = 0;
        var4.field1081 = arg0;
        class108 var5 = class71.field1800;
        synchronized (class71.field1800) {
            class71.field1800.method819(var4, arg1 + 36);
        }
        class115.method879(false);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 36)
    public static final void method238(int arg0) {
        int var1 = 0;
        if (arg0 != 19468) {
            return;
        }
        while (class115.field2833 > var1) {
            int var10002 = class20.field580[var1]--;
            if (class20.field580[var1] >= -10) {
                label77: {
                    class62 var3 = class33.field922[var1];
                    if (var3 == null) {
                        var3 = class62.method519(class27.field775, class101.field2431[var1], 0);
                        if (var3 == null) {
                            break label77;
                        }
                        class20.field580[var1] += var3.method521();
                        class33.field922[var1] = var3;
                    }
                    if (class20.field580[var1] < 0) {
                        label80: {
                            int var10;
                            if (class124.field3013[var1] == 0) {
                                var10 = class22.field643;
                            } else {
                                int var4 = (class124.field3013[var1] & 0xFF) * 128;
                                int var5 = class124.field3013[var1] >> 16 & 0xFF;
                                int var6 = class124.field3013[var1] >> 8 & 0xFF;
                                int var7 = var5 * 128 + 64 - class42.field1179.field2071;
                                int var8 = var6 * 128 + 64 - class42.field1179.field2128;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var7 + var8 - 128;
                                if (var9 > var4) {
                                    class20.field580[var1] = -100;
                                    break label80;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class98.field2368 / var4;
                            }
                            class82 var11 = var3.method520().method618(class116.field2873);
                            class91 var12 = class91.method673(var11, 100, var10);
                            var12.method670(class123.field2991[var1] - 1);
                            class9.field297.method876(var12);
                            class20.field580[var1] = -100;
                        }
                    }
                }
            } else {
                class115.field2833--;
                for (int var2 = var1; var2 < class115.field2833; var2++) {
                    class101.field2431[var2] = class101.field2431[var2 + 1];
                    class33.field922[var2] = class33.field922[var2 + 1];
                    class123.field2991[var2] = class123.field2991[var2 + 1];
                    class20.field580[var2] = class20.field580[var2 + 1];
                    class124.field3013[var2] = class124.field3013[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field812++;
        if (class85.field2026 <= 0) {
            return;
        }
        class85.field2026 -= 20;
        if (class85.field2026 < 0) {
            class85.field2026 = 0;
        }
        if (class85.field2026 == 0 && class113.field2804 != 0 && class17.field475 != -1) {
            class65.method539(class17.field475, field802, 0, 0, false, class113.field2804, (byte) 16);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 176)
    public final void method239(int arg0) {
        field814++;
        if (this.field813 == null) {
            return;
        }
        this.field813.field805 = this.field805;
        if (arg0 == 1) {
            this.field805.field813 = this.field813;
            this.field805 = null;
            this.field813 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V", line = 203)
    public static void method240(byte arg0) {
        field802 = null;
        field801 = null;
        field816 = null;
        if (arg0 != 75) {
            field818 = null;
        }
        field819 = null;
        field803 = null;
        field818 = null;
        field821 = null;
        field822 = null;
        field820 = null;
        field823 = null;
        field798 = null;
        field807 = null;
        field799 = null;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 231)
    public static final void method241(int arg0) {
        try {
            if (arg0 != 1) {
                return;
            }
            Graphics var1 = class84.field2003.getGraphics();
            class8.field273.method187(4, var1, -26826, 4);
        } catch (Exception var2) {
            class84.field2003.repaint();
        }
        field808++;
    }
}
