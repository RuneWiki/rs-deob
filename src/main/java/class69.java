import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class69 extends class302 {

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lri;")
    public static class73 field1045 = new class73(101, 7);

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1050 = "";

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "F")
    public static float field1046;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V", line = 4)
    public final void method403(int arg0, int arg1, int arg2) {
        if (arg1 == 4802) {
            ++field1051;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZ)V", line = 14)
    public final void method404(int arg0, int arg1, boolean arg2) {
        ++field1044;
        if (!arg2) {
            this.field1049 = 31;
        }
        int var4 = this.field1047 * arg0 >> 12;
        int var5 = this.field1049 * arg0 >> 12;
        int var6 = this.field1052 * arg1 >> 12;
        int var7 = this.field1048 * arg1 >> 12;
        class385.method2356(var5, var6, var4, super.field4273, -70, var7);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V", line = 33)
    public final void method405(int arg0, int arg1, int arg2) {
        ++field1054;
        if (arg0 != 2) {
            field1045 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 51)
    public static void method406(byte arg0) {
        field1050 = null;
        if (arg0 == 95) {
            field1045 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIII)V", line = 64)
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1048 = arg3;
        this.field1052 = arg1;
        this.field1049 = arg2;
        this.field1047 = arg0;
    }
}
