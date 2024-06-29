import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class260 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lbj;")
    private class430 field3297;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3299 = 2;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[I")
    public static int[] field3303 = new int[32];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lsea;")
    public static class399 field3301 = new class399();

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
    public static int[] field3304 = new int[1];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lab;")
    private class623 field3298;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lab;")
    public final class623 method1577(int arg0) {
        field3296++;
        if (arg0 != 1) {
            method1579(52);
        }
        class623 var2 = this.field3297.field6099.field8705;
        if (this.field3297.field6099 == var2) {
            this.field3298 = null;
            return null;
        } else {
            this.field3298 = var2.field8705;
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class260() {
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lab;")
    public final class623 method1578(byte arg0) {
        field3302++;
        class623 var2 = this.field3298;
        if (arg0 != 30) {
            method1579(-80);
        }
        if (this.field3297.field6099 == var2) {
            this.field3298 = null;
            return null;
        } else {
            this.field3298 = var2.field8705;
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field3301 = null;
        field3304 = null;
        if (arg0 != 1) {
            method1579(-79);
        }
        field3303 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lbj;)V")
    public class260(class430 arg0) {
        this.field3297 = arg0;
    }
}
