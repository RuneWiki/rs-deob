import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class517 {

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "Z")
    public static boolean field7686 = true;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "[I")
    public static int[] field7690 = new int[3];

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field7691 = 0;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "Lfe;")
    public static class191 field7688;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7689;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
    public static final void method3071() {
        for (int var0 = 0; var0 < class516.field7651; var0++) {
            class237 var1 = class135.field1788[var0];
            class35.method177(var1);
            class135.field1788[var0] = null;
        }
        class516.field7651 = 0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        if (arg0 != 84) {
            field7688 = null;
        }
        field7689 = null;
        field7690 = null;
        field7688 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lps;I)V")
    public static final void method3073(class428 arg0, int arg1) {
        field7687++;
        int var2 = arg0.method2573(arg1 - 14319);
        class66.field755 = new class340[var2];
        for (int var3 = arg1; var3 < var2; var3++) {
            class66.field755[var3] = new class340();
            class66.field755[var3].field4983 = arg0.method2573(-14319);
            class66.field755[var3].field4982 = arg0.method2567(true);
        }
        class580.field8547 = arg0.method2573(arg1 - 14319);
        class481.field7296 = arg0.method2573(arg1 - 14319);
        class156.field1992 = arg0.method2573(-14319);
        class392.field5710 = new class418[class481.field7296 + 1 - class580.field8547];
        for (int var4 = 0; var4 < class156.field1992; var4++) {
            int var5 = arg0.method2573(-14319);
            class418 var6 = class392.field5710[var5] = new class418();
            var6.field5314 = arg0.method2561((byte) -40);
            var6.field5316 = arg0.method2589(-11179);
            var6.field6010 = var5 + class580.field8547;
            var6.field6009 = arg0.method2567(true);
            var6.field6005 = arg0.method2567(true);
        }
        class374.field5505 = arg0.method2589(-11179);
        class287.field4218 = true;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3074(boolean arg0, int arg1, int arg2) {
        field7685++;
        if (arg0) {
            field7691 = 90;
        }
        return (class203.method1310((byte) -115, arg1, arg2) | class622.method3629(arg2, (byte) 11, arg1) | class6.method26(arg2, true, arg1)) & class271.method1721((byte) 103, arg2, arg1);
    }
}
