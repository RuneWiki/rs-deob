import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class719 implements class331 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lifa;")
    private class449 field9954;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Llk;")
    private class612 field9956;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lwv;")
    public static class37 field9961 = new class37(14, 7);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lbu;")
    public static class21 field9962 = new class21(131, 0);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field9960;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method298(byte arg0) {
        field9960++;
        if (arg0 != -98) {
            this.field9956 = null;
        }
        return this.field9956.method3556(117);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 15)
    public final void method297(int arg0) {
        field9957++;
        int var2 = -11 % ((83 - arg0) / 32);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lda;Ljava/lang/String;IIII)I", line = 26)
    private final int method4027(class66 arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 > -107) {
            return 27;
        } else {
            field9955++;
            return arg0.method571(0, null, 0, this.field9954.field6138 - arg4 * 2, arg2 - -arg4, 0, 0, -22888, arg1, this.field9954.field6141 - (arg4 * 2), null, arg4 + arg5, 0, this.field9954.field6139, null, this.field9954.field6140);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZ)V", line = 38)
    public final void method299(boolean arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field9959++;
        class25 var3 = this.field9956.method3555(this.field9954.field6136, (byte) 124);
        if (var3 == null) {
            return;
        }
        int var4 = this.field9954.field6143.method703(this.field9954.field6138, class527.field7532, (byte) 79) + this.field9954.field6137;
        int var5 = this.field9954.field6144.method2781(this.field9954.field6141, 0, class296.field4307) + this.field9954.field6147;
        if (this.field9954.field6146) {
            class37.field491.method520(var4, var5, this.field9954.field6138, this.field9954.field6141, this.field9954.field6145, 0);
        }
        int var6 = var5 + this.method4027(class269.field3907, var3.field386, var5, -112, 5, var4) * 12;
        int var9 = var6 + 8;
        if (this.field9954.field6146) {
            class37.field491.method487(var4, var9, this.field9954.field6138 + var4 - 1, var9, this.field9954.field6145, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method4027(class269.field3907, var3.field389, var6, -121, 5, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method4027(class269.field3907, var3.field385, var10, -108, 5, var4) * 12;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Llk;Lifa;)V", line = 72)
    public class719(class612 arg0, class449 arg1) {
        this.field9954 = arg1;
        this.field9956 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 81)
    public static void method4028(int arg0) {
        field9961 = null;
        if (arg0 != 12) {
            method4028(119);
        }
        field9962 = null;
    }
}
