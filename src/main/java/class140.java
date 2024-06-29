import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class140 {

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2614 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2612 = 0;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lrd;")
    private static class173 field2607 = class133.method843("glow2:", -117);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lrd;")
    public static class173 field2608 = class133.method843("Hierhin gehen", -124);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lrd;")
    public static class173 field2618 = field2607;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lrd;")
    public static class173 field2615 = field2607;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lof;")
    public static class145 field2617 = new class145();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "La;")
    public static class1 field2605;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lhi;")
    public static class79 field2604;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[Ldh;")
    public static class39[] field2621;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[[[B")
    public static byte[][][] field2602;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/Object;ZLna;)V")
    public static final void method869(Object arg0, boolean arg1, class130 arg2) {
        field2619++;
        if (arg1) {
            field2608 = null;
        }
        if (arg2.field2462 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2462.peekEvent() != null; var3++) {
            class151.method996(12121, 1L);
        }
        if (arg0 != null) {
            arg2.field2462.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbc;ILbc;Lbc;)V")
    public static final void method870(class14 arg0, int arg1, class14 arg2, class14 arg3) {
        class22.field486 = arg0.method135(class203.field3973, 120);
        field2610++;
        class203.field3962 = arg2.method135(class163.field3023, 123);
        class216.field4194 = arg2.method135(class123.field2302, 121);
        class177.field3463 = arg2.method135(class70.field1372, 123);
        class172.field3362 = arg2.method135(class54.field1092, 125);
        class63.field1237 = arg2.method135(class24.field523, 119);
        class67.field1304 = arg2.method135(class133.field2510, 122);
        class176.field3452 = arg2.method135(class94.field1758, 121);
        class87.field1707 = arg2.method135(class164.field3041, 122);
        if (arg1 < 79) {
            method873(-87, true, true);
        }
        class207.field4033 = arg2.method135(class71.field1390, 123);
        class171.field3309 = arg2.method135(class40.field823, 122);
        class107.field1990 = arg3.method135(class119.field2201, 127);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method871(byte arg0) {
        field2604 = null;
        field2607 = null;
        field2621 = null;
        field2608 = null;
        if (arg0 != 84) {
            return;
        }
        field2605 = null;
        field2618 = null;
        field2617 = null;
        field2602 = null;
        field2615 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(DB)V")
    public static final void method872(double arg0, byte arg1) {
        int var3 = 69 / ((arg1 - 27) / 52);
        field2609++;
        if (class150.field2853 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class30.field612[var4] = var5 > 255 ? 255 : var5;
        }
        class150.field2853 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZZ)I")
    public static final int method873(int arg0, boolean arg1, boolean arg2) {
        field2616++;
        int var3 = arg0;
        if (arg1) {
            var3 = class52.field1063 + class48.field1028 + arg0;
        }
        if (arg2) {
            var3 += class105.field1968 + class211.field4092;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method874(int arg0) {
        int var1 = -66 % ((-arg0 - 39) / 34);
        for (int var2 = 0; var2 < class36.field783; var2++) {
            int var3 = class4.field97[var2];
            class120 var4 = client.field632[var3];
            int var5 = class70.field1358.method751((byte) 117);
            if ((var5 & 0x80) != 0) {
                var4.field2756 = class70.field1358.method785(-1);
                var4.field2770 = class70.field1358.method755((byte) -105);
            }
            if ((var5 & 0x20) != 0) {
                var4.field2778 = class70.field1358.method758(true);
                int var6 = class70.field1358.method784((byte) 38);
                if (var4.field2778 == 65535) {
                    var4.field2778 = -1;
                }
                var4.field2803 = var6 >> 16;
                var4.field2753 = class217.field4203 + (var6 & 0xFFFF);
                var4.field2799 = 0;
                var4.field2777 = 0;
                if (class217.field4203 < var4.field2753) {
                    var4.field2799 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                var4.field2818 = class70.field1358.method742((byte) -98);
                if (var4.field2818 == 65535) {
                    var4.field2818 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var7 = class70.field1358.method751((byte) 83);
                int var8 = class70.field1358.method779(15151);
                var4.method972((byte) 98, var8, var7, class217.field4203);
            }
            if ((var5 & 0x2) != 0) {
                var4.field2215 = class94.method593(class70.field1358.method758(true), (byte) -38);
                var4.field2766 = var4.field2215.field915;
                var4.field2754 = var4.field2215.field929;
                var4.field2760 = var4.field2215.field945;
                var4.field2815 = var4.field2215.field937;
                var4.field2796 = var4.field2215.field925;
                var4.field2804 = var4.field2215.field941;
                var4.field2811 = var4.field2215.field908;
                var4.field2755 = var4.field2215.field946;
                var4.field2787 = var4.field2215.field923;
            }
            if ((var5 & 0x8) != 0) {
                var4.field2774 = class70.field1358.method746(-19941);
                var4.field2817 = 100;
            }
            if ((var5 & 0x10) != 0) {
                int var9 = class70.field1358.method779(15151);
                int var10 = class70.field1358.method779(15151);
                var4.method972((byte) 98, var10, var9, class217.field4203);
                var4.field2808 = class217.field4203 + 300;
                var4.field2784 = class70.field1358.method751((byte) 102);
            }
            if ((var5 & 0x40) != 0) {
                int var11 = class70.field1358.method742((byte) -98);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class70.field1358.method735((byte) -51);
                if (var4.field2809 == var11 && var11 != -1) {
                    class178 var13 = class167.method1080(11098, var11);
                    int var14 = var13.field3503;
                    if (var14 == 1) {
                        var4.field2783 = 0;
                        var4.field2763 = var12;
                        var4.field2790 = 0;
                        var4.field2752 = 0;
                        class82.method513(var4.field2820, false, var4.field2752, (byte) 16, var13, var4.field2801);
                    }
                    if (var14 == 2) {
                        var4.field2783 = 0;
                    }
                } else if (var11 == -1 || var4.field2809 == -1 || class167.method1080(11098, var11).field3513 >= class167.method1080(11098, var4.field2809).field3513) {
                    var4.field2771 = var4.field2780;
                    var4.field2763 = var12;
                    var4.field2783 = 0;
                    var4.field2809 = var11;
                    var4.field2752 = 0;
                    var4.field2790 = 0;
                    if (var4.field2809 != -1) {
                        class82.method513(var4.field2820, false, var4.field2752, (byte) 16, class167.method1080(11098, var4.field2809), var4.field2801);
                    }
                }
            }
        }
        field2613++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lrd;")
    public static final class173 method875(int arg0, byte arg1) {
        field2606++;
        if (arg1 >= -8) {
            method869(null, false, null);
        }
        return arg0 < 999999999 ? class93.method588(arg0, true) : class38.field801;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrd;ZI)V")
    public static final void method876(class173 arg0, boolean arg1, int arg2) {
        field2611++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class150.field2851.method528(arg0, 250);
        int var7 = class150.field2851.method544(arg0, 250) * 13;
        class27.method219(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        if (arg2 != -14911) {
            method870(null, -91, null, null);
        }
        class27.method207(var4 - var3, -var3 + var5, var3 + var3 + var6, var7 - -var3 + var3, 16777215);
        class150.field2851.method517(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class100.method616(var5 - var3, 0, var4 - var3, var6 - -var3 + var3, var3 + var7 + var3);
        if (!arg1) {
            class169.method1089(var6, (byte) 94, var7, var4, var5);
            return;
        }
        try {
            Graphics var8 = class165.field3183.getGraphics();
            class67.field1307.method411(0, 0, var8, 60);
        } catch (Exception var9) {
            class165.field3183.repaint();
        }
    }
}
