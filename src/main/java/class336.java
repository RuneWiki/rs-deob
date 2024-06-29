import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class class336 extends class339 {

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "Ldc;")
    public class23 field4540;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "[Lnt;")
    public static class493[] field4543 = new class493[14];

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLvea;)I", line = 5)
    public static final int method1972(byte arg0, class404 arg1) {
        field4542++;
        if (class404.field5331 == arg1) {
            return 5120;
        } else if (class404.field5335 == arg1) {
            return 5122;
        } else if (class404.field5336 == arg1) {
            return 5124;
        } else if (class404.field5338 == arg1) {
            return 5121;
        } else if (class404.field5339 == arg1) {
            return 5123;
        } else if (class404.field5340 == arg1) {
            return 5125;
        } else if (class404.field5341 == arg1) {
            return 5131;
        } else if (class404.field5342 == arg1) {
            return 5126;
        } else {
            int var2 = -71 / ((arg0 - 64) / 55);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ldc;I)V", line = 51)
    public class336(class23 arg0, int arg1) {
        this.field4540 = arg0;
        this.field4541 = arg1;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V", line = 68)
    public static void method1973(byte arg0) {
        field4543 = null;
        int var1 = 64 / ((arg0 - 60) / 58);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1009(boolean arg0);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1006(int arg0);
}
