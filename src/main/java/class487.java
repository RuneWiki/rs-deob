import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class487 {

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "Llj;")
    private class477 field6571 = new class477();

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6576 = "";

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "Z")
    public static boolean field6580 = false;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "Llj;")
    private class477 field6578;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I", line = 9)
    public final int method2709(int arg0) {
        int var2 = -25 / ((arg0 + 9) / 55);
        field6573++;
        int var3 = 0;
        for (class477 var4 = this.field6571.field6447; var4 != this.field6571; var4 = var4.field6447) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V", line = 36)
    public static void method2710(int arg0) {
        if (arg0 != 11125) {
            field6576 = null;
        }
        field6576 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V", line = 119)
    public class487() {
        this.field6571.field6446 = this.field6571;
        this.field6571.field6447 = this.field6571;
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V", line = 56)
    public final void method2711(int arg0) {
        while (true) {
            class477 var2 = this.field6571.field6447;
            if (this.field6571 == var2) {
                field6574++;
                this.field6578 = null;
                if (arg0 != -14886) {
                    this.field6571 = null;
                    return;
                }
                return;
            }
            var2.method2669(-29226);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Llj;", line = 79)
    public final class477 method2712(int arg0) {
        field6579++;
        class477 var2 = this.field6578;
        if (this.field6571 == var2) {
            this.field6578 = null;
            return null;
        }
        this.field6578 = var2.field6447;
        if (arg0 != 0) {
            this.method2711(85);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILlj;)V", line = 100)
    public final void method2713(int arg0, class477 arg1) {
        field6570++;
        if (arg1.field6446 != null) {
            arg1.method2669(-29226);
        }
        arg1.field6446 = this.field6571.field6446;
        if (arg0 == -82) {
            arg1.field6447 = this.field6571;
            arg1.field6446.field6447 = arg1;
            arg1.field6447.field6446 = arg1;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(I)Llj;", line = 130)
    public final class477 method2714(int arg0) {
        field6575++;
        if (arg0 != 0) {
            return null;
        }
        class477 var2 = this.field6571.field6447;
        if (this.field6571 == var2) {
            return null;
        } else {
            var2.method2669(-29226);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Llj;", line = 152)
    public final class477 method2715(byte arg0) {
        if (arg0 <= 107) {
            return null;
        }
        field6577++;
        class477 var2 = this.field6571.field6447;
        if (this.field6571 == var2) {
            this.field6578 = null;
            return null;
        } else {
            this.field6578 = var2.field6447;
            return var2;
        }
    }
}
