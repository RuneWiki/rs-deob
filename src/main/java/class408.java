import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class408 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5774 = 0;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BF)F")
    public static final float method2391(byte arg0, float arg1) {
        if (arg0 <= 94) {
            return -0.8218942F;
        } else {
            field5776++;
            return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public static final void method2392(boolean arg0) {
        field5775++;
        class473 var1 = class11.field127;
        synchronized (class11.field127) {
            class11.field127.method2774((byte) 120);
            if (!arg0) {
                method2391((byte) -104, -1.0860965F);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lmc;")
    public static final class314 method2393(int arg0) {
        field5777++;
        if (arg0 != 18982) {
            field5774 = -93;
        }
        class314 var1 = (class314) class50.field725.method3152(false);
        if (var1 != null) {
            var1.method2791((byte) 112);
            var1.method1645(54);
            return var1;
        }
        class314 var2;
        do {
            var2 = (class314) class248.field3367.method3152(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1807(2) > class254.method1522((byte) -51)) {
                return null;
            }
            var2.method2791((byte) 112);
            var2.method1645(arg0 - 18953);
        } while ((var2.field3883 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    static {
        new class157("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
