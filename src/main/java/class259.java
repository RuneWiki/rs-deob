import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class259 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
    public boolean field3992 = true;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field3990 = new Object();

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    public int[] field3996 = new int[500];

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public int field3997 = 0;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public int[] field3995 = new int[500];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3994;

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field3993++;
        while (this.field3992) {
            Object var1 = this.field3990;
            synchronized (this.field3990) {
                if (this.field3997 < 500) {
                    this.field3995[this.field3997] = class290.field4468;
                    this.field3996[this.field3997] = class108.field1622;
                    this.field3997++;
                }
            }
            class324.method2252(-24861, 50L);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1827(boolean arg0) {
        if (!arg0) {
            field3994 = (String) null;
        }
        field3994 = null;
    }
}
