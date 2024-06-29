import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class196 extends InputStream {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lvj;")
    public static class304 field2748 = new class304("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
    public static int[] field2752 = new int[2];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lql;I)V")
    public static final void method1275(class515 arg0, int arg1) {
        field2744++;
        class219 var2 = (class219) class368.field4965.method182((long) arg0.field6170, (byte) 121);
        if (arg1 != 23088 || var2 == null) {
            return;
        }
        if (var2.field2959 != null) {
            class318.field4175.method3070(var2.field2959);
            var2.field2959 = null;
        }
        var2.method300(false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)F")
    public static final float method1276(int arg0, float arg1) {
        if (arg0 != 20365) {
            field2745 = -82;
        }
        field2743++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!nb", name = "read", descriptor = "()I")
    public final int read() {
        field2747++;
        class94.method674(30000L, 1);
        return -1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        int var1 = -29 / ((arg0 - 15) / 60);
        field2748 = null;
        field2752 = null;
    }
}
