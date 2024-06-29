import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class46 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field584 = "rating: ";

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field586;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[[[Ltl;")
    public static class246[][][] field585;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method259(boolean arg0, boolean arg1, String arg2) {
        field587++;
        if (arg1) {
            field585 = null;
        }
        if (arg0) {
            try {
                class224.field3612.getAppletContext().showDocument(new URL(class224.field3612.getCodeBase(), arg2), "_blank");
            } catch (Exception var3) {
            }
            return;
        }
        try {
            class277.method1848(class194.field3107.field609, 2795, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            class224.field3612.getAppletContext().showDocument(new URL(class224.field3612.getCodeBase(), arg2), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method260(byte arg0) {
        if (arg0 >= 96) {
            field584 = null;
            field585 = null;
            field586 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Leh;Leh;B)V")
    public static final void method261(class137 arg0, class137 arg1, byte arg2) {
        field588++;
        class286.field4556 = arg0;
        class240.field3963 = arg1;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class286.field4556.method926(26899, 34);
        class274.field4385 = var3 + var5;
        class182.field2902 = var4 + var5;
        if (arg2 <= 118) {
            field584 = null;
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class108.field1451 = var6 + var5;
    }
}
