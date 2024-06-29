import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class33 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field517 = null;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lkn;")
    public static class442 field522 = new class442("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lmj;")
    public class394 field516;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lmc;")
    public class69 field520;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    public static int[] field521;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
    public static short[] field519;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method331(int arg0) {
        field522 = null;
        if (arg0 >= -77) {
            method331(93);
        }
        field517 = null;
        field519 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method332(int arg0, int arg1) {
        field518++;
        if (!class16.method238(arg1, arg0 + 20)) {
            return;
        }
        class453[] var2 = class143.field2057[arg1];
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class453 var4 = var2[var3];
            if (var4 != null) {
                var4.field6399 = 0;
                var4.field6421 = 0;
                var4.field6427 = 1;
            }
        }
    }
}
