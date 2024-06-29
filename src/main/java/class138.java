import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class138 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lce;")
    public static class246 field2114 = new class246();

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lna;")
    public static class26 field2115 = class69.method505(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -119);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lna;")
    public static class26 field2119 = class69.method505("Chargement du module texte )2 ", (byte) -120);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
    public static int[][][] field2117;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lwa;Z)V", line = 15)
    public static final void method921(class82 arg0, boolean arg1) {
        field2111++;
        if (!arg1) {
            field2117 = (int[][][]) ((int[][][]) null);
        }
        byte[] var2 = new byte[24];
        if (class299.field5144 != null) {
            try {
                class299.field5144.method336(-41, 0L);
                class299.field5144.method334(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method592(var2, 0, 24, 88);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILe;)I", line = 65)
    public static final int method922(int arg0, class159 arg1) {
        field2113++;
        if (arg0 != 0) {
            method921((class82) null, false);
        }
        int var2 = arg1.field2485;
        class236 var3 = arg1.method1656(false);
        if (arg1.field3901 == var3.field3751) {
            var2 = arg1.field2473;
        } else if (arg1.field3901 == var3.field3780 || arg1.field3901 == var3.field3773 || arg1.field3901 == var3.field3760 || arg1.field3901 == var3.field3757) {
            var2 = arg1.field2505;
        } else if (arg1.field3901 == var3.field3786 || arg1.field3901 == var3.field3756 || arg1.field3901 == var3.field3765 || arg1.field3901 == var3.field3794) {
            var2 = arg1.field2490;
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V", line = 92)
    public static final void method923(int arg0, long arg1) {
        field2112++;
        if (arg1 == 0L) {
            return;
        }
        if (class132.field2014 >= 100) {
            class214.method1420(class2.field18, 0, class254.field4155, -1);
            return;
        }
        int var3 = -103 / ((arg0 + 20) / 41);
        class26 var4 = class153.method1042(-29664, arg1).method176((byte) -50);
        for (int var5 = 0; var5 < class132.field2014; var5++) {
            if (class85.field1394[var5] == arg1) {
                class214.method1420(class2.field18, 0, class236.method1587(new class26[] { var4, class230.field3655 }, (byte) -108), -1);
                return;
            }
        }
        for (int var6 = 0; var6 < class321.field5520; var6++) {
            if (class121.field1890[var6] == arg1) {
                class214.method1420(class2.field18, 0, class236.method1587(new class26[] { class45.field715, var4, class103.field1656 }, (byte) -65), -1);
                return;
            }
        }
        if (var4.method159((byte) -42, class13.field221.field2495)) {
            class214.method1420(class2.field18, 0, class313.field5345, -1);
            return;
        }
        class268.field4425++;
        class85.field1394[class132.field2014] = arg1;
        class309.field5316[class132.field2014++] = class153.method1042(-29664, arg1);
        class100.field1611 = class74.field1144;
        class114.field1789.method1431(0, 34);
        class114.field1789.method579(arg1, -2037491440);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lll;Ljava/lang/Object;I)V", line = 162)
    public static final void method924(class156 arg0, Object arg1, int arg2) {
        field2110++;
        if (arg2 >= -29) {
            field2117 = (int[][][]) ((int[][][]) null);
        }
        if (arg0.field2433 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2433.peekEvent() != null; var3++) {
            class126.method862(1L, 64);
        }
        if (arg1 != null) {
            arg0.field2433.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lic;", line = 186)
    public static final class117 method925(int arg0, int arg1) {
        field2118++;
        class117 var2 = (class117) class244.field4009.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1001) {
            field2119 = (class26) null;
        }
        byte[] var3 = class191.field2989.method1889(31, (byte) -122, arg1);
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method810(2, new class82(var3), arg1);
        }
        class244.field4009.method1978((byte) -75, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 210)
    public static void method926(byte arg0) {
        field2114 = null;
        field2117 = (int[][][]) null;
        field2119 = null;
        field2115 = null;
        if (arg0 <= 56) {
            field2115 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILna;Lve;)Lse;", line = 234)
    public static final class12 method927(int arg0, class26 arg1, class266 arg2) {
        field2109++;
        int var3 = arg2.method1876(arg1, (byte) -30);
        if (var3 == -1) {
            return new class12(0);
        } else if (arg0 > -38) {
            return (class12) null;
        } else {
            int[] var4 = arg2.method1897((byte) -128, var3);
            class12 var5 = new class12(var4.length);
            for (int var6 = 0; var6 < var5.field165; var6++) {
                class82 var7 = new class82(arg2.method1889(var3, (byte) -122, var4[var6]));
                var5.field166[var6] = var7.method615(true);
                var5.field177[var6] = var7.method599(false);
                var5.field173[var6] = (short) var7.method576(1);
                var5.field160[var6] = (short) var7.method576(1);
                var5.field170[var6] = var7.method587(-502942936);
            }
            return var5;
        }
    }
}
