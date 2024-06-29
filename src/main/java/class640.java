import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class640 extends class583 {

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public int field8792;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "Laf;")
    public class435 field8790;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field8791 = 0;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "[I")
    public static int[] field8793 = new int[32];

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Lgda;")
    public static class53 field8794 = new class53(36, 5);

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method3547(boolean arg0, int arg1) {
        field8795++;
        if (arg0) {
            return null;
        }
        class101 var2 = (class101) class400.field5666.method1180((byte) 26, (long) arg1);
        if (var2 != null) {
            class248 var3 = var2.field1210.method1929((byte) -107);
            if (var3 != null) {
                double var4 = var2.field1210.method1930(-119);
                if (var4 >= (double) var3.method1579(-103) && var4 <= (double) var3.method1584((byte) 64)) {
                    return var3.method1582(0);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1227(int arg0);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
    public abstract boolean method1226(int arg0);

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
    public static void method3548(int arg0) {
        field8794 = null;
        field8793 = null;
        int var1 = -38 / ((arg0 + 66) / 44);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Laf;I)V")
    public class640(class435 arg0, int arg1) {
        this.field8792 = arg1;
        this.field8790 = arg0;
    }
}
