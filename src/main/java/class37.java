import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 {

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lle;")
    public static class71 field844 = new class71(100);

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lrc;")
    public static class105 field851 = class43.method374("Handel)4Duell", 0);

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lrc;")
    private static class105 field854 = class43.method374("Could not complete login)3", 0);

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[Lrc;")
    public static class105[] field856 = new class105[100];

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lrc;")
    public static class105 field852 = field854;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lrc;")
    public static class105 field858 = class43.method374("", 0);

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Lrc;")
    public static class105 field860 = class43.method374("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lrc;")
    public static class105 field850 = field858;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lrc;")
    public static class105 field857 = field858;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lrc;")
    public static class105 field863 = field858;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field862 = -1;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lrc;")
    public static class105 field849 = field858;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lrc;")
    public static class105 field855 = field858;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lrc;")
    public static class105 field865 = field858;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "[J")
    public static long[] field866 = new long[100];

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
    public static boolean field868 = false;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lrc;")
    public static class105 field867 = class43.method374("null", 0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lfc;")
    public static class34 field853;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Lfc;")
    public static class34 field861;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lk;")
    public class60 field848;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 8)
    public static void method338(int arg0) {
        field856 = null;
        field858 = null;
        field861 = null;
        field853 = null;
        if (arg0 != 0) {
            method340((byte) 39);
        }
        field849 = null;
        field852 = null;
        field857 = null;
        field850 = null;
        field865 = null;
        field867 = null;
        field866 = null;
        field855 = null;
        field844 = null;
        field851 = null;
        field854 = null;
        field863 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 43)
    public static final void method339(byte arg0) {
        class116.method939(class95.field2191, (byte) 51);
        if (class31.field746 != -1) {
            class116.method939(class31.field746, (byte) 51);
        }
        field837++;
        class59.field1319 = 0;
        class42.field944.method323(0);
        class57.field1206 = class38.method355(class57.field1206);
        class69.method583();
        class87.method719(class95.field2191, 0, 0, 503, 104, 765, 0);
        if (class31.field746 != -1) {
            class87.method719(class31.field746, 0, 0, 503, 104, 765, 0);
        }
        if (class130.field3165) {
            class130.method1045(false);
        } else {
            class89.method739((byte) -122);
            class120.method972(115);
        }
        try {
            if (arg0 < -12) {
                Graphics var1 = class41.field935.getGraphics();
                class42.field944.method320(0, var1, (byte) -89, 0);
            }
        } catch (Exception var2) {
            class41.field935.repaint();
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V", line = 80)
    public static final void method340(byte arg0) {
        field839++;
        if (arg0 != -104) {
            field849 = null;
        }
        if (class33.field771.toLowerCase().indexOf("microsoft") != -1) {
            class14.field279[186] = 57;
            class14.field279[187] = 27;
            class14.field279[188] = 71;
            class14.field279[189] = 26;
            class14.field279[190] = 72;
            class14.field279[191] = 73;
            class14.field279[192] = 58;
            class14.field279[219] = 42;
            class14.field279[220] = 74;
            class14.field279[221] = 43;
            class14.field279[222] = 59;
            class14.field279[223] = 28;
            return;
        }
        class14.field279[44] = 71;
        class14.field279[45] = 26;
        class14.field279[46] = 72;
        class14.field279[47] = 73;
        class14.field279[59] = 57;
        class14.field279[61] = 27;
        class14.field279[91] = 42;
        class14.field279[92] = 74;
        class14.field279[93] = 43;
        if (class33.field781 == null) {
            class14.field279[192] = 58;
            class14.field279[222] = 59;
        } else {
            class14.field279[192] = 28;
            class14.field279[222] = 58;
            class14.field279[520] = 59;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 132)
    public static final void method341(boolean arg0) {
        field842++;
        if (class74.field1634 == null) {
            return;
        }
        class41.method365(0);
        if (class67.field1518 > 0) {
            class74.field1634.method735(256, false);
            class67.field1518 = 0;
        }
        class74.field1634.method731(-124);
        class74.field1634 = null;
        if (!arg0) {
            field856 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V", line = 157)
    public static final void method342(boolean arg0) {
        field843++;
        if (!arg0) {
            return;
        }
        for (class104 var1 = (class104) class130.field3151.method31(1280); var1 != null; var1 = (class104) class130.field3151.method26((byte) 108)) {
            if (var1.field2341 > 0) {
                var1.field2341--;
            }
            if (var1.field2341 != 0) {
                if (var1.field2362 > 0) {
                    var1.field2362--;
                }
                if (var1.field2362 == 0 && var1.field2348 >= 1 && var1.field2344 >= 1 && var1.field2348 <= 102 && var1.field2344 <= 102 && (var1.field2357 < 0 || class110.method906(true, var1.field2357, var1.field2339))) {
                    class28.method266(!arg0, var1.field2348, var1.field2357, var1.field2344, var1.field2355, var1.field2339, var1.field2359, var1.field2340);
                    var1.field2362 = -1;
                    if (var1.field2370 == var1.field2357 && var1.field2370 == -1) {
                        var1.method551(-115);
                    } else if (var1.field2370 == var1.field2357 && var1.field2359 == var1.field2338 && var1.field2368 == var1.field2339) {
                        var1.method551(-110);
                    }
                }
            } else if (var1.field2370 < 0 || class110.method906(true, var1.field2370, var1.field2368)) {
                class28.method266(false, var1.field2348, var1.field2370, var1.field2344, var1.field2355, var1.field2368, var1.field2338, var1.field2340);
                var1.method551(-58);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 231)
    public static final void method343(byte arg0) {
        field847++;
        class22.field532.method602((byte) -70);
        if (arg0 != -12) {
            method343((byte) -28);
        }
    }
}
