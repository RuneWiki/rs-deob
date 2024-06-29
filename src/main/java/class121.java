import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class121 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lvc;")
    private static class137 field2814 = class45.method325("You are standing in a members)2only area)3", -46);

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lvc;")
    public static class137 field2822 = class45.method325(" steht bereits auf Ihrer Freunde)2Liste(Q", -46);

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lvc;")
    public static class137 field2815 = field2814;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lvc;")
    private static class137 field2821 = class45.method325("We suspect someone knows your password)3", -46);

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lvc;")
    private static class137 field2819 = class45.method325("Loaded input handler", -46);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lvc;")
    public static class137 field2820 = field2819;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lvc;")
    public static class137 field2813 = field2821;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lqa;")
    public static class105 field2823 = new class105(30);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lvc;")
    public static class137 field2824 = class45.method325("Handel akzeptieren", -46);

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lvc;")
    public static class137 field2825 = class45.method325("b12_full", -46);

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lvc;")
    public static class137 field2828 = class45.method325("Gegenstand f-Ur Mitglieder", -46);

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lvc;")
    public static class137 field2827 = class45.method325("Sie haben gerade eine andere Welt verlassen)3", -46);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Z")
    public static boolean field2826;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lq;")
    public static final class104 method911(Throwable arg0, String arg1) {
        class104 var2;
        if (arg0 instanceof class104) {
            var2 = (class104) arg0;
            var2.field2411 = var2.field2411 + ' ' + arg1;
        } else {
            var2 = new class104(arg0, arg1);
        }
        field2812++;
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method912(boolean arg0) {
        field2817++;
        class108.field2526++;
        class80.method590(-14851, true);
        class33.method243((byte) 41, true);
        class80.method590(-14851, arg0);
        class33.method243((byte) -127, false);
        class64.method466(true);
        class32.method240((byte) 108);
        if (!class32.field691) {
            int var1 = class48.field1087;
            int var2 = class70.field1489 + class105.field2436 & 0x7FF;
            if (class78.field1729 / 256 > var1) {
                var1 = class78.field1729 / 256;
            }
            if (class60.field1294[4] && class72.field1537[4] + 128 > var1) {
                var1 = class72.field1537[4] + 128;
            }
            class122.method917(var2, var1, class24.field583, var1 * 3 + 600, 2047, class106.field2466, class32.method241(class104.field2412.field1672, (byte) -123, class28.field627, class104.field2412.field1646) - 50);
        }
        int var3;
        if (class32.field691) {
            var3 = class63.method459(false);
        } else {
            var3 = class141.method1079((byte) 20);
        }
        int var4 = class44.field947;
        int var5 = class7.field142;
        int var6 = class37.field812;
        int var7 = class1.field3;
        int var8 = class6.field123;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class60.field1294[var9]) {
                int var10 = (int) (Math.random() * (double) (client.field484[var9] * 2 + 1) + Math.sin((double) class24.field568[var9] / 100.0D * (double) class72.field1538[var9]) * (double) class72.field1537[var9] - (double) client.field484[var9]);
                if (var9 == 4) {
                    class37.field812 += var10;
                    if (class37.field812 < 128) {
                        class37.field812 = 128;
                    }
                    if (class37.field812 > 383) {
                        class37.field812 = 383;
                    }
                }
                if (var9 == 3) {
                    class6.field123 = class6.field123 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class44.field947 += var10;
                }
                if (var9 == 1) {
                    class7.field142 += var10;
                }
                if (var9 == 2) {
                    class1.field3 += var10;
                }
            }
        }
        class21.method178(255);
        class14.field336 = 0;
        class14.field345 = true;
        class14.field356 = class126.field2956 - 4;
        class14.field344 = class32.field693 - 4;
        class62.method451();
        class10.field220.method553(class44.field947, class7.field142, class1.field3, class37.field812, class6.field123, var3);
        class10.field220.method513();
        class45.method322(-14148);
        class39.method280(-63);
        ((class1) class97.field2256).method5(class69.field1438, (byte) 54);
        class42.method298(512);
        if (class114.field2725 && class56.method385(false, true, (byte) 104) == 0) {
            class114.field2725 = false;
        }
        if (class114.field2725) {
            class21.method178(255);
            class62.method451();
            class7.method42((byte) -23, class114.field2723, null, false);
        }
        class137.method1015(91);
        class6.field123 = var8;
        class7.field142 = var5;
        class44.field947 = var4;
        class1.field3 = var7;
        class37.field812 = var6;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        if (!arg0) {
            method912(false);
        }
        field2819 = null;
        field2821 = null;
        field2820 = null;
        field2814 = null;
        field2815 = null;
        field2824 = null;
        field2825 = null;
        field2827 = null;
        field2822 = null;
        field2813 = null;
        field2823 = null;
        field2828 = null;
    }
}
