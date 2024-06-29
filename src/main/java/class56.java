import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class56 {

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "[[Ljava/lang/String;")
    public static String[][] field680 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lfw;I)Z", line = 6)
    public final boolean method373(class56 arg0, int arg1) {
        field670++;
        if (arg1 != -15742) {
            this.field683 = -67;
        }
        return this.field674 == arg0.field674 && this.field669 == arg0.field669 && this.field677 == arg0.field677;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;IZLkk;Z)V", line = 25)
    public static final void method374(String arg0, int arg1, boolean arg2, class192 arg3, boolean arg4) {
        if (arg1 != 0) {
            field682 = 110;
        }
        field678++;
        if (!arg4) {
            class506.method2844(3, arg3, arg0, (byte) 61);
            return;
        }
        if (class192.field2897.startsWith("win") && arg3.field2892) {
            String var5 = null;
            if (class514.field6818 != null) {
                var5 = class514.field6818.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class198 var6 = class506.method2844(0, arg3, arg0, (byte) -128);
                class718.field9979 = arg0;
                class411.field5709 = arg3;
                class5.field124 = var6;
                return;
            }
        }
        if (class192.field2897.startsWith("mac")) {
            String var7 = null;
            if (class514.field6818 != null) {
                var7 = class514.field6818.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class506.method2844(1, arg3, arg0, (byte) -125);
                return;
            }
        }
        class506.method2844(2, arg3, arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 93)
    public static final void method375(int arg0) {
        field676++;
        if (arg0 != 0) {
            field680 = null;
        }
        for (class132 var1 = (class132) class64.field776.method21(2); var1 != null; var1 = (class132) class64.field776.method9(arg0 - 128)) {
            class109 var2 = var1.field2153;
            if (var2.field1471 < class29.field474) {
                var1.method3564(true);
                var2.method793(0);
            } else if (var2.field1509 <= class29.field474) {
                var2.method797(true);
                if (var2.field1490 > 0) {
                    class134 var3 = (class134) class390.field5470.method2135((long) (var2.field1490 - 1), (byte) 31);
                    if (var3 != null) {
                        class556 var4 = var3.field2154;
                        if (var4.field3505 >= 0 && var4.field3505 < (class719.field10004 * 512) && var4.field3502 >= 0 && var4.field3502 < class107.field1453 * 512) {
                            var2.method796(var4.field3505, var4.field3502, 0, class153.method1118(var4.field3502, var4.field3505, arg0 ^ 0xFFFFFFB0, var2.field3508) - var2.field1475, class29.field474);
                        }
                    }
                }
                if (var2.field1490 < 0) {
                    int var5 = -var2.field1490 - 1;
                    class383 var6;
                    if (class303.field4293 == var5) {
                        var6 = class472.field6475;
                    } else {
                        var6 = class248.field3438[var5];
                    }
                    if (var6 != null && var6.field3505 >= 0 && var6.field3505 < class719.field10004 * 512 && var6.field3502 >= 0 && class107.field1453 * 512 > var6.field3502) {
                        var2.method796(var6.field3505, var6.field3502, 0, class153.method1118(var6.field3502, var6.field3505, 127, var2.field3508) - var2.field1475, class29.field474);
                    }
                }
                var2.method805(120, class244.field3417);
                class294.method1821(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(JI)V", line = 163)
    public static final void method376(long arg0, int arg1) {
        class132.field2151.setTime(new Date(arg0));
        if (arg1 != -8474) {
            method376(-108L, -127);
        }
        field681++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V", line = 179)
    public static void method377(boolean arg0) {
        field680 = null;
        if (!arg0) {
            field680 = null;
        }
    }
}
