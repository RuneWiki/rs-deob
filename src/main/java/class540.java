import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class540 extends class504 {

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljava/lang/String;")
    public String field7118;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Ldb;")
    public static class298 field7114 = new class298(18, -1);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    public static int[] field7117 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILst;)V", line = 4)
    public static final void method2982(int arg0, class403 arg1) {
        field7116++;
        if (arg0 != 1) {
            method2982(-54, null);
        }
        class597 var2 = (class597) class526.field7004.method2918((long) arg1.field5633, (byte) -41);
        if (var2 == null) {
            class372.method2192(null, arg1.field8609, arg0 ^ 0xDC1E3AC8, 0, arg1, null, arg1.field5649[0], arg1.field5643[0]);
        } else {
            var2.method3294((byte) -121);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 23)
    public static void method2983(int arg0) {
        if (arg0 != 1) {
            field7117 = null;
        }
        field7114 = null;
        field7117 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILjava/lang/String;IIBI)V", line = 41)
    public static final void method2984(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 != -106) {
            method2983(-96);
        }
        field7113++;
        class199 var8 = new class199();
        var8.field2894 = arg3;
        var8.field2896 = class642.field8626 + arg0;
        var8.field2893 = arg1;
        var8.field2891 = arg5;
        var8.field2889 = arg4;
        var8.field2890 = arg7;
        var8.field2895 = arg2;
        class346.field4757.method327(var8, true);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 67)
    public class540() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 69)
    public class540(String arg0, int arg1) {
        this.field7118 = arg0;
    }
}
