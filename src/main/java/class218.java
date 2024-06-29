import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class218 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
    public static boolean field2924 = true;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field2923;

    static {
        new class206("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method1246(int arg0, boolean arg1) {
        class39.field570 = 0;
        class343.field4589 = 0;
        field2923++;
        class154.method907(16082);
        class233.method1300(true, arg1);
        class464.method2741(14078);
        for (int var2 = arg0; var2 < class39.field570; var2++) {
            int var4 = class233.field3099[var2];
            if (class70.field968 != class221.field2941[var4].field1153) {
                if (class221.field2941[var4].field1780.method2537(-23)) {
                    class318.method1743(class221.field2941[var4], (byte) -123);
                }
                class221.field2941[var4].method757((class429) null, arg0 + 21748);
                class221.field2941[var4] = null;
            }
        }
        if (class136.field1983 != class314.field4171.field456) {
            throw new RuntimeException("gnp1 pos:" + class314.field4171.field456 + " psize:" + class136.field1983);
        }
        for (int var3 = 0; var3 < class202.field2734; var3++) {
            if (class221.field2941[class412.field5638[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class202.field2734);
            }
        }
    }
}
