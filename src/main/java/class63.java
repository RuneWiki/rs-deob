import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class63 extends class261 {

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Z")
    public static boolean field959 = false;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Ltj;")
    public static class169 field957;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 5)
    public static void method383(int arg0) {
        if (arg0 >= 91) {
            field957 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 26)
    public class63() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z", line = 31)
    public static final boolean method384(int arg0, boolean arg1) {
        if (arg1) {
            field959 = false;
        }
        field958++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I", line = 49)
    public final int[] method21(byte arg0, int arg1) {
        int[] var3 = this.field4425.method906(arg1, 8251);
        int var4 = 73 / ((arg0 + 49) / 33);
        if (this.field4425.field2043) {
            int[][] var5 = this.method1819(-52, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; var9 < class92.field1576; var9++) {
                var3[var9] = (var6[var9] + var8[var9] + var7[var9]) / 3;
            }
        }
        field955++;
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 87)
    public static final void method385(int arg0) {
        field956++;
        boolean var1 = false;
        if (arg0 >= -28) {
            method384(-10, true);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class136.field2272 - 1); var2++) {
                if (class264.field4466[var2] < 1000 && class264.field4466[var2 + 1] > 1000) {
                    var1 = false;
                    class255 var3 = class44.field684[var2];
                    class44.field684[var2] = class44.field684[var2 + 1];
                    class44.field684[var2 + 1] = var3;
                    class255 var4 = class203.field3509[var2];
                    class203.field3509[var2] = class203.field3509[var2 + 1];
                    class203.field3509[var2 + 1] = var4;
                    int var5 = class295.field5063[var2];
                    class295.field5063[var2] = class295.field5063[var2 + 1];
                    class295.field5063[var2 + 1] = var5;
                    int var6 = class287.field4910[var2];
                    class287.field4910[var2] = class287.field4910[var2 + 1];
                    class287.field4910[var2 + 1] = var6;
                    short var7 = class264.field4466[var2];
                    class264.field4466[var2] = class264.field4466[var2 + 1];
                    class264.field4466[var2 + 1] = var7;
                    long var8 = class131.field2161[var2];
                    class131.field2161[var2] = class131.field2161[var2 + 1];
                    class131.field2161[var2 + 1] = var8;
                }
            }
        }
    }
}
