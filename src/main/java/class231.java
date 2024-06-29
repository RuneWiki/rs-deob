import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class231 implements class258 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lsk;")
    public static class423 field3510 = new class423("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[[I")
    public static int[][] field3514 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lrf;")
    public static class54 field3515 = new class54(0, -1);

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Lbg;")
    public static class310 field3516 = new class310(13, -1);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3511++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static final void method1388(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class169.field2628[var1] = false;
        }
        field3512++;
        class249.field3823 = class369.field5424;
        class24.field320 = class290.field4403;
        class414.field5997 = class456.field6999;
        class369.field5413 = -1;
        class435.field6382 = class243.field3655;
        class253.field3861 = class16.field226;
        class408.field5928 = 5;
        class463.field7114 = -1;
        class461.field7099 = 0;
        class2.field8 = class288.field4373;
        if (arg0 != 119) {
            field3515 = null;
        }
        class475.field7252 = 0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method1389(boolean arg0) {
        if (arg0) {
            field3514 = null;
            field3515 = null;
            field3516 = null;
            field3510 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class231(String arg0, int arg1) {
        this.field3513 = arg1;
    }
}
