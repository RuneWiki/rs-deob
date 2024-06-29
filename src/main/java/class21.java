import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
    public static int[] field400 = new int[100];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lcc;")
    private static class209 field393 = class95.method669(120, "yellow:");

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lcc;")
    public static class209 field398 = field393;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lcc;")
    public static class209 field399 = field393;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lsg;")
    public static class162 field396 = new class162();

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
    public static int[] field402 = new int[2];

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lcc;")
    public static class209 field403 = class95.method669(99, "logo");

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lcc;")
    public static class209 field405 = class95.method669(91, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lcc;")
    public static class209 field406 = class95.method669(91, "Liste der Welten geladen");

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[Lij;")
    public static class194[] field404;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Lcc;")
    public static final class209 method183(String arg0, boolean arg1) {
        field395++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        if (arg1) {
            method183((String) null, false);
        }
        class209 var3 = new class209();
        var3.field3811 = 0;
        var3.field3786 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field3811++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method184(int arg0) {
        field396 = null;
        field405 = null;
        field402 = null;
        field398 = null;
        if (arg0 != 100) {
            return;
        }
        field403 = null;
        field399 = null;
        field400 = null;
        field404 = null;
        field406 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field397++;
        for (int var5 = arg2; var5 < class266.field4771; var5++) {
            if (class45.field900[var5] + field400[var5] > arg3 && class45.field900[var5] < arg1 + arg3 && class210.field3831[var5] + class163.field2958[var5] > arg0 && class163.field2958[var5] < (arg0 + arg4)) {
                class129.field2476[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILsj;)V")
    public static final void method186(int arg0, class49 arg1) {
        field394++;
        class179.field3258 = arg1;
        if (arg0 <= 102) {
            method184(-102);
        }
    }
}
