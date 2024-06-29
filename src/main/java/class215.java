import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class215 extends RuntimeException {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Ljava/lang/String;")
    public String field3037;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3038;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Liq;")
    public static class362 field3041 = new class362("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
    public static int[] field3046 = new int[4];

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
    public static boolean field3045 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ltq;")
    public static class376 field3044;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        class235.field3295 = arg0;
        class388.field5464 = arg3;
        class219.field3080 = arg2;
        field3036++;
        class81.field946 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3044 = null;
        field3041 = null;
        if (arg0 != 18119) {
            method1448((byte) -114);
        }
        field3046 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class215(Throwable arg0, String arg1) {
        this.field3037 = arg1;
        this.field3038 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Object;Lrd;B)V")
    public static final void method1447(Object arg0, class185 arg1, byte arg2) {
        field3042++;
        if (arg1.field2682 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field2682.peekEvent() != null; var3++) {
            class150.method907(1L, (byte) -32);
        }
        if (arg2 != -59) {
            field3046 = null;
        }
        if (arg0 != null) {
            arg1.field2682.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static final void method1448(byte arg0) {
        class98.field1194 = new class184[class274.field3881.method2432(true)][];
        if (arg0 < 91) {
            method1445(-123, -31, 22, 63, true);
        }
        field3039++;
        class327.field4638 = new boolean[class274.field3881.method2432(true)];
    }
}
