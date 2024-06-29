import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class312 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lad;")
    public class147 field4890;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field4891 = 0;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
    public static long field4894;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lhi;")
    public static class323 field4895;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[[I")
    public static int[][] field4888;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[[I")
    public static int[][] field4893;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 4)
    public static void method2202(byte arg0) {
        field4893 = (int[][]) null;
        int var1 = 97 / ((-arg0 - 63) / 46);
        field4888 = (int[][]) null;
        field4895 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V", line = 23)
    public class312(int arg0, int arg1) {
        this.field4890 = class42.method257(arg0, (byte) 14);
        this.field4887 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lnk;ILnk;Z)V", line = 34)
    public static final void method2203(class16 arg0, int arg1, class16 arg2, boolean arg3) {
        if (arg1 != 5803) {
            method2205(-76, (byte) -117);
        }
        class253.field4015 = arg2;
        field4892++;
        class291.field4583 = arg0;
        class225.field3396 = arg3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lsf;", line = 50)
    public static final class123 method2204(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2999;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V", line = 63)
    public static final void method2205(int arg0, byte arg1) {
        field4889++;
        if (class349.field5569 == null) {
            class349.field5569 = new byte[4][104][104];
        }
        int var2 = 0;
        if (arg0 != -7935) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class349.field5569[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lad;I)V", line = 100)
    public class312(class147 arg0, int arg1) {
        this.field4887 = arg1;
        this.field4890 = arg0;
    }
}
