import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class186 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    private int[] field2913;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public final int method1260(int arg0, int arg1) {
        field2912++;
        int var3 = (this.field2913.length >> 1) - 1;
        if (arg0 != 316610721) {
            return -21;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2913[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2913[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lch;I)V")
    public static final void method1261(class166 arg0, int arg1) {
        if (arg1 != 316610721) {
            return;
        }
        field2911++;
        class451 var2 = (class451) class101.field1683.method2516((long) arg0.field3130, arg1 - 316610722);
        if (var2 == null) {
            return;
        }
        if (var2.field6723 != null) {
            class510.field7455.method1734(var2.field6723);
            var2.field6723 = null;
        }
        var2.method1821((byte) 42);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V")
    public class186(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2913 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2913[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2913[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2913[var5 + var5] = arg0[var4];
            this.field2913[var5 - (-var5 - 1)] = var4++;
        }
    }

    static {
        new class306(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }
}
