import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class444 {

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Laq;")
    public class310 field6354 = new class310();

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field6347 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Laq;")
    private class310 field6355;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILaq;)V", line = 5)
    public final void method2712(int arg0, class310 arg1) {
        field6348++;
        if (arg0 != 0) {
            this.method2714(-24);
        }
        if (arg1.field4181 != null) {
            arg1.method1929(arg0);
        }
        arg1.field4188 = this.field6354;
        arg1.field4181 = this.field6354.field4181;
        arg1.field4181.field4188 = arg1;
        arg1.field4188.field4181 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I", line = 24)
    public final int method2713(int arg0) {
        field6350++;
        int var2 = arg0;
        class310 var3 = this.field6354.field4188;
        while (this.field6354 != var3) {
            var3 = var3.field4188;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Laq;", line = 48)
    public final class310 method2714(int arg0) {
        field6353++;
        class310 var2 = this.field6355;
        if (this.field6354 == var2) {
            this.field6355 = null;
            return null;
        } else {
            this.field6355 = var2.field4188;
            return arg0 == 4120 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 70)
    public final void method2715(boolean arg0) {
        while (true) {
            class310 var2 = this.field6354.field4188;
            if (this.field6354 == var2) {
                field6352++;
                this.field6355 = null;
                if (!arg0) {
                    this.field6355 = null;
                    return;
                }
                return;
            }
            var2.method1929(0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 117)
    public class444() {
        this.field6354.field4181 = this.field6354;
        this.field6354.field4188 = this.field6354;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 102)
    public static final String method2716(boolean arg0) {
        field6351++;
        if (arg0) {
            return null;
        } else if (class147.field2154 || class242.field3576 == null) {
            return "";
        } else {
            return class242.field3576.field4151;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Laq;", line = 126)
    public final class310 method2717(int arg0) {
        field6349++;
        class310 var2 = this.field6354.field4188;
        if (this.field6354 == var2) {
            this.field6355 = null;
            return null;
        } else {
            this.field6355 = var2.field4188;
            return arg0 == 0 ? var2 : null;
        }
    }
}
