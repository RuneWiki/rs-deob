import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class538 extends class345 {

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field8010 = new String[200];

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field8011 = 0;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)Lwv;")
    public abstract class31 method1826(boolean arg0);

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(Z)V")
    public static final void method3263(boolean arg0) {
        field8012++;
        if (arg0) {
            field8010 = null;
        }
        class302.field4135 = new class162[class169.field2636.method1974(-8588)][];
        class484.field6903 = new class162[class169.field2636.method1974(-8588)][];
        class438.field5854 = new boolean[class169.field2636.method1974(-8588)];
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public static void method3264(int arg0) {
        int var1 = -121 / ((arg0 + 31) / 40);
        field8010 = null;
    }
}
