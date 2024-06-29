import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class506 extends class392 {

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public int field6857;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "Lgm;")
    public static class125 field6858 = new class125("", 12);

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method2817(int arg0, boolean arg1) {
        if (arg1) {
            method2817(-73, true);
        }
        field6860++;
        if (arg0 == 37) {
            class642.field8940 = 3.0F;
        } else if (arg0 == 50) {
            class642.field8940 = 4.0F;
        } else if (arg0 == 75) {
            class642.field8940 = 6.0F;
        } else if (arg0 == 100) {
            class642.field8940 = 8.0F;
        } else if (arg0 == 200) {
            class642.field8940 = 16.0F;
        }
        class239.field3133 = -1;
        class239.field3133 = -1;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(I)V", line = 37)
    public class506(int arg0) {
        this.field6857 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V", line = 45)
    public static void method2818(int arg0) {
        if (arg0 == 26767) {
            field6858 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method622(boolean arg0);

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)Z")
    public abstract boolean method626(int arg0);
}
