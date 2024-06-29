import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class37 extends class140 {

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "S")
    public short field581;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
    public boolean field576;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "S")
    public short field587;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "S")
    public short field569;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "B")
    public byte field570;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "B")
    public byte field573;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "S")
    public short field580;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lff;")
    public static class9 field572 = new class9(10, 6);

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "[Lna;")
    public static class35[] field582;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "[Lni;")
    public static class360[] field586;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
    public abstract int method285(byte arg0);

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
    public static void method286(byte arg0) {
        field572 = null;
        field582 = null;
        field586 = null;
        if (arg0 >= -53) {
            field577 = 39;
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    public void method287(int arg0) {
        field578++;
        if (arg0 <= 32) {
            method290((byte) 100, -26, -55, 76, 109, -12, -6, -128, 59);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
    public static final String method288(int arg0, String[] arg1, byte arg2, int arg3) {
        field579++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg2 != 8) {
                return null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)V")
    public static final void method289(byte arg0, int arg1) {
        if (arg0 != 44) {
            field586 = null;
        }
        if (arg1 == 37) {
            class6.field170 = 3.0F;
        } else if (arg1 == 50) {
            class6.field170 = 4.0F;
        } else if (arg1 == 75) {
            class6.field170 = 6.0F;
        } else if (arg1 == 100) {
            class6.field170 = 8.0F;
        } else if (arg1 == 200) {
            class6.field170 = 16.0F;
        }
        class412.field5694 = -1;
        field571++;
        class412.field5694 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method290(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -100) {
            method286((byte) 1);
        }
        field567++;
        if (arg8 < 1 || arg1 < 1 || (class12.field251 - 2) < arg8 || (class289.field3782 - 2) < arg1) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class401.method2330(arg1, arg8, 2)) {
            var9 = arg2 + 1;
        }
        if (!class154.field2244.method1855((byte) -69, class166.field2414) && !class63.method436(var9, arg1, arg8, class455.field6229, arg0 - 2760)) {
            return;
        }
        if (class497.field6886 == null) {
            return;
        }
        class387.field5261.method1313(arg8, true, arg1, arg2, class120.field1754[arg2], arg5, class370.field4984);
        if (arg4 < 0) {
            return;
        }
        boolean var10 = class154.field2244.field7764;
        class154.field2244.field7764 = true;
        class387.field5261.method1314(arg7, 115, class370.field4984, arg1, class120.field1754[arg2], arg6, arg4, arg8, var9, arg2, arg3);
        class154.field2244.field7764 = var10;
        return;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field584 = arg1;
        this.field581 = (short) arg4;
        this.field576 = arg8;
        this.field568 = arg2;
        this.field587 = (short) arg6;
        this.field569 = (short) arg7;
        this.field570 = arg9;
        this.field573 = (byte) arg0;
        this.field574 = arg3;
        this.field580 = (short) arg5;
    }
}
