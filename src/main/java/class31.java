import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field579 = -1;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lok;")
    public static class146 field578 = class235.method1724(-12908, " weitere Optionen");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lok;")
    public static class146 field582 = class235.method1724(-12908, "(Y<)4col>");

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lok;")
    public static class146 field580 = class235.method1724(-12908, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lok;")
    public static class146 field581 = class235.method1724(-12908, "hitmarks");

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[Lok;")
    public static class146[] field585 = null;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "J")
    public static long field583 = 0L;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lok;")
    public static class146 field584 = class235.method1724(-12908, "<col=ff7000>");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lr;")
    public static class264 field575 = null;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lwg;")
    public class283 field573;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
    public int[] field574;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lok;")
    public class146[] field577;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 16)
    public static void method223(byte arg0) {
        int var1 = 21 / ((arg0 - 6) / 51);
        field582 = null;
        field581 = null;
        field580 = null;
        field575 = null;
        field578 = null;
        field584 = null;
        field585 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lvi;IIBI)V", line = 31)
    public static final void method224(class5 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field576++;
        if (arg3 != -84) {
            return;
        }
        for (class206 var5 = (class206) class9.field202.method1251(-94); var5 != null; var5 = (class206) class9.field202.method1253(47)) {
            if (var5.field3428 == arg1 && arg2 * 128 == var5.field3426 && (arg4 * 128) == var5.field3420 && var5.field3447.field68 == arg0.field68) {
                if (var5.field3437 != null) {
                    class82.field1315.method1331(var5.field3437);
                    var5.field3437 = null;
                }
                if (var5.field3427 != null) {
                    class82.field1315.method1331(var5.field3427);
                    var5.field3427 = null;
                }
                var5.method1325(arg3 ^ 0xB25);
                return;
            }
        }
    }
}
