import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class361 {

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field4396 = -1;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public int field4391 = -1;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Luw;")
    public static class208 field4389 = new class208(127, 8);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Ljf;")
    public static class667 field4395 = new class667();

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lrn;")
    public static class633 field4398 = new class633(45, 4);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public int[] field4394;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2078(boolean arg0) {
        field4397++;
        for (class136 var1 = (class136) class332.field4061.method3591(0); var1 != null; var1 = (class136) class332.field4061.method3600((byte) 115)) {
            class249.method1628(-1, false, var1);
        }
        if (!arg0) {
            method2081(null, -54, false);
        }
        for (class136 var2 = (class136) class338.field4126.method3591(0); var2 != null; var2 = (class136) class338.field4126.method3600((byte) 121)) {
            class249.method1628(-1, true, var2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILmc;)V", line = 35)
    private final void method2079(int arg0, int arg1, class234 arg2) {
        if (arg1 == 1) {
            this.field4396 = arg2.method1553((byte) 37);
        } else if (arg1 == 2) {
            this.field4394 = new int[arg2.method1509(true)];
            for (int var4 = 0; var4 < this.field4394.length; var4++) {
                this.field4394[var4] = arg2.method1553((byte) 0);
            }
        } else if (arg1 == 3) {
            this.field4391 = arg2.method1509(true);
        }
        field4393++;
        if (arg0 != -3) {
            this.field4394 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V", line = 72)
    public static void method2080(boolean arg0) {
        field4398 = null;
        if (!arg0) {
            field4389 = null;
            field4395 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 89)
    public static final void method2081(String arg0, int arg1, boolean arg2) {
        field4399++;
        class768.method4166(true, arg0, -1, arg1, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lmc;B)V", line = 100)
    public final void method2082(class234 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (arg1 != -123) {
                    return;
                }
                field4392++;
                return;
            }
            this.method2079(-3, var3, arg0);
        }
    }
}
