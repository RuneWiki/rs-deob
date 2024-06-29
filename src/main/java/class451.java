import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class451 extends class223 {

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lst;")
    public static class366 field6368 = new class366();

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "Lcba;")
    public static class471 field6371 = new class471(87, -1);

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lcba;")
    public static class471 field6373 = new class471(90, 12);

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "Lej;")
    public static class104 field6375 = new class104("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Lgr;")
    public static class367 field6374;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "Lpu;")
    public static class483 field6372;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIBI)V")
    public final void method506(int arg0, int arg1, byte arg2, int arg3) {
        super.field3194 = arg3;
        super.field3187 = arg1;
        ++field6370;
        if (arg2 == -115) {
            super.field3193 = arg0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIF)V")
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "(I)V")
    public static void method2649(int arg0) {
        field6375 = null;
        field6371 = null;
        field6374 = null;
        field6372 = null;
        field6373 = null;
        int var1 = 72 % ((arg0 - 79) / 47);
        field6368 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(FB)V")
    public final void method504(float arg0, byte arg1) {
        super.field3179 = arg0;
        ++field6367;
        if (arg1 <= 87) {
            this.method506(99, 92, (byte) -68, -70);
        }
    }
}
