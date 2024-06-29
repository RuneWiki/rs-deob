import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class336 extends class86 {

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public volatile int field4867 = -1;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "Ljava/lang/String;")
    public volatile String field4872;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[[I")
    public static int[][] field4871;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Lwt;")
    public static class194 field4870;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "F")
    public static float field4874;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Lhe;")
    public static class239 field4868;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static final void method2029(int arg0) {
        class103.field1388 = null;
        field4869++;
        class136.field1752 = false;
        if (arg0 > -101) {
            method2031(-48);
        }
        class176.method1103(0);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public static final void method2030(byte arg0) {
        if (arg0 >= -94) {
            method2029(-114);
        }
        class71.field1039++;
        class386.method2321(true, class237.field3318);
        field4866++;
        class79.field1108.method961(class176.field2435, 1608339368);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static void method2031(int arg0) {
        field4871 = null;
        field4870 = null;
        field4868 = null;
        if (arg0 <= 97) {
            field4870 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class336(String arg0) {
        this.field4872 = arg0;
    }

    static {
        new class194("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field4871 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
        field4870 = new class194("glow3:", "leuchten3:", "brillant3:", "brilho3:");
    }
}
