import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class26 extends class259 {

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Ljava/lang/String;")
    public String field288;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ljava/lang/String;")
    public static String field292 = "flash2:";

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lvb;")
    public static class73 field289;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Llf;")
    public static class94 field290;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[[[B")
    public static byte[][][] field286;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field292 = null;
        field286 = null;
        if (arg0 != -63) {
            field286 = null;
        }
        field289 = null;
        field290 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class26() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)I")
    public static final int method172(boolean arg0) {
        if (arg0) {
            field291++;
            return 14;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static final void method173(int arg0) {
        if (arg0 != -21305) {
            method171((byte) -20);
        }
        class294.field4677.method1422((byte) 89);
        field287++;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class26(String arg0, int arg1) {
        this.field288 = arg0;
    }
}
