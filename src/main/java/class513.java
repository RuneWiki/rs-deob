import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class513 extends class574 {

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field7426;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Ldj;")
    public static class703 field7430 = new class703(9, 0, 4, 1);

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[I")
    public static int[] field7433 = new int[1];

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field7436 = 0;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
    public final boolean method3116(byte arg0) {
        field7429++;
        return arg0 == -5 ? false : false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method3117(int arg0, String arg1, boolean arg2) {
        field7435++;
        if (arg1 == null) {
            return;
        }
        if (class365.field5352 >= 100) {
            class758.method4212(4, 2, class608.field8659.method3543(-24350, class45.field748));
        } else if (arg0 == 4) {
            String var3 = class136.method973(10149, arg1);
            if (var3 != null) {
                for (int var4 = 0; var4 < class365.field5352; var4++) {
                    String var9 = class136.method973(10149, class716.field10113[var4]);
                    if (var9 != null && var9.equals(var3)) {
                        class758.method4212(4, 2, arg1 + class608.field8660.method3543(arg0 - 24354, class45.field748));
                        return;
                    }
                    if (class751.field10462[var4] != null) {
                        String var10 = class136.method973(10149, class751.field10462[var4]);
                        if (var10 != null && var10.equals(var3)) {
                            class758.method4212(4, 2, arg1 + class608.field8660.method3543(-24350, class45.field748));
                            return;
                        }
                    }
                }
                for (int var5 = 0; var5 < class386.field5583; var5++) {
                    String var7 = class136.method973(arg0 + 10145, class196.field2860[var5]);
                    if (var7 != null && var7.equals(var3)) {
                        class758.method4212(4, 2, class608.field8665.method3543(-24350, class45.field748) + arg1 + class608.field8666.method3543(-24350, class45.field748));
                        return;
                    }
                    if (class519.field7483[var5] != null) {
                        String var8 = class136.method973(arg0 ^ 0x27A1, class519.field7483[var5]);
                        if (var8 != null && var8.equals(var3)) {
                            class758.method4212(4, 2, class608.field8665.method3543(-24350, class45.field748) + arg1 + class608.field8666.method3543(-24350, class45.field748));
                            return;
                        }
                    }
                }
                if (class136.method973(10149, class108.field1536.field9056).equals(var3)) {
                    class758.method4212(4, 2, class608.field8662.method3543(-24350, class45.field748));
                } else {
                    class75.field1102++;
                    class88 var6 = class448.method2741((byte) 61, class453.field6477, class583.field8319);
                    var6.field1260.method2881(class231.method1605((byte) 44, arg1) + 1, (byte) 111);
                    var6.field1260.method2902(arg1, false);
                    var6.field1260.method2881(arg2 ? 1 : 0, (byte) 120);
                    class523.method3183(var6, (byte) 31);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lut;Ljava/lang/Object;I)V")
    public class513(class688 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7426 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3118(String arg0, int arg1) {
        System.out.println("Error: " + class576.method3417("%0a", arg0, "\n", -73));
        int var2 = 37 / ((arg1 - 22) / 46);
        field7428++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILha;III)V")
    public static final void method3119(int arg0, byte arg1, int arg2, class543 arg3, int arg4, int arg5, int arg6) {
        if ((class568.field8208 == null || class509.field7379 == null || class727.field10224 == null) && class603.field8548.method2609(0, class494.field7113) && class603.field8548.method2609(0, class167.field2365) && class603.field8548.method2609(0, class342.field4707)) {
            class676 var7 = class676.method3850(class603.field8548, class167.field2365, 0);
            class509.field7379 = arg3.method202(var7, true);
            var7.method3842();
            class236.field3530 = arg3.method202(var7, true);
            class568.field8208 = arg3.method202(class676.method3850(class603.field8548, class494.field7113, 0), true);
            class676 var8 = class676.method3850(class603.field8548, class342.field4707, 0);
            class727.field10224 = arg3.method202(var8, true);
            var8.method3842();
            class640.field9112 = arg3.method202(var8, true);
        }
        int var9 = 82 / ((43 - arg1) / 63);
        field7424++;
        if (class568.field8208 == null || class509.field7379 == null || class727.field10224 == null) {
            return;
        }
        int var10 = (arg6 - (class727.field10224.method777() * 2)) / class568.field8208.method777();
        for (int var11 = 0; var11 < var10; var11++) {
            class568.field8208.method3128(arg4 + class727.field10224.method777() + (class568.field8208.method777() * var11), -class568.field8208.method787() + arg0 + arg2);
        }
        int var12 = (arg2 - class727.field10224.method787() - arg5) / class509.field7379.method787();
        for (int var13 = 0; var13 < var12; var13++) {
            class509.field7379.method3128(arg4, class509.field7379.method787() * var13 + arg5 + arg0);
            class236.field3530.method3128(arg4 + arg6 - class236.field3530.method777(), var13 * class509.field7379.method787() + arg5 + arg0);
        }
        class727.field10224.method3128(arg4, arg0 + arg2 - class727.field10224.method787());
        class640.field9112.method3128(arg4 + arg6 - class727.field10224.method777(), arg0 + arg2 + -class727.field10224.method787());
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
    public static void method3120(byte arg0) {
        field7430 = null;
        if (arg0 != -48) {
            field7436 = -108;
        }
        field7433 = null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3121(int arg0) {
        field7434++;
        int var2 = 7 / ((3 - arg0) / 58);
        return this.field7426;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjc;I)V")
    public static final void method3122(int arg0, class168 arg1, int arg2) {
        if (arg0 < 102) {
            method3117(-11, null, true);
        }
        class609.field8692 = 0;
        field7431++;
        class257.field3687 = false;
        class163.method1148(arg1, (byte) 56);
        class544.method3272(74, arg1);
        if (class257.field3687) {
            System.out.println("---endgpp---");
        }
        if (arg1.field6864 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field6864 + " psize:" + arg2);
        }
    }
}
