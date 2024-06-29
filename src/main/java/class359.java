import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class359 {

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field5316 = 0;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Z")
    public static boolean field5320 = false;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Ljg;")
    public static class215 field5315 = new class215();

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "Loe;")
    public static class127 field5321 = new class127(73, -1);

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lsk;")
    public static class423 field5322 = new class423("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lmn;")
    public static class237 field5323;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Lqq;")
    public static class318 field5318;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V", line = 9)
    public static final void method2189() {
        for (int var0 = 0; var0 < class103.field1830; var0++) {
            class205 var1 = class355.field5297[var0];
            class74.method553(var1);
            class355.field5297[var0] = null;
        }
        class103.field1830 = 0;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 24)
    public static void method2190(int arg0) {
        field5321 = null;
        field5323 = null;
        field5322 = null;
        field5318 = null;
        if (arg0 != -7019) {
            method2190(-53);
        }
        field5315 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 38)
    public static final void method2191(byte arg0) {
        field5319++;
        if (arg0 == 60) {
            class330.field4948 = 0;
            class329.field4932.method13(false);
            class381.field5555 = false;
        }
    }
}
