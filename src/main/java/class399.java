import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class399 extends class56 {

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "[I")
    public static int[] field5216 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "Lhj;")
    public static class596 field5217 = new class596(68, 0);

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class399() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public static void method2339(int arg0) {
        if (arg0 == 20271) {
            field5216 = null;
            field5217 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field5218;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field752.field2441) {
                int[][] var4 = this.method495(90, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class642.field8759 > var8; ++var8) {
                    var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
                }
            }
            return var3;
        }
    }
}
