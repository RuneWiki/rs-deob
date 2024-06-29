import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class689 extends class159 {

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public volatile int field9211 = -1;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field9212;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public static int field9209 = 0;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9210 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "Lmw;")
    public static class517 field9213 = new class517(1, -1);

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "[[I")
    public static int[][] field9214;

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 12)
    public class689(String arg0) {
        this.field9212 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V", line = 23)
    public static void method3775(boolean arg0) {
        field9214 = null;
        field9213 = null;
        if (!arg0) {
            field9213 = null;
        }
        field9210 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 35)
    public static final boolean method3776(String arg0, int arg1) {
        field9208++;
        return arg1 == -1 ? class732.field9911.containsKey(arg0) : true;
    }
}
