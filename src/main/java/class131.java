import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class131 extends class313 {

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    private int field2253 = 4096;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2254 = -1;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2255 = "Connected to update server";

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Ltm;")
    public static class79 field2248 = new class79(16);

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2258 = " from your friend list first.";

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "F")
    public static float field2257 = 0.0F;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[Lwb;")
    public static class171[] field2252;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 9)
    public class131() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILpi;)V", line = 14)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            return;
        }
        if (arg0 == 0) {
            this.field2249 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field2253 = arg2.method2339((byte) -46);
        }
        field2251++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I", line = 54)
    public final int[] method111(int arg0, int arg1) {
        field2250++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            return (int[]) null;
        }
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2249 && this.field2253 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V", line = 97)
    public static void method1081(int arg0) {
        field2258 = null;
        field2255 = null;
        field2252 = null;
        if (arg0 != 4096) {
            field2257 = -0.9736845F;
        }
        field2248 = null;
    }
}
