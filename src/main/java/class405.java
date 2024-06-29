import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class405 implements class389 {

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Lgaa;")
    private class433 field5818;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lcv;")
    private class22 field5817;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
    public static int[] field5811 = new int[50];

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field5819 = 0;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "[[B")
    public static byte[][] field5810;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;Lla;III)I")
    private final int method2435(int arg0, String arg1, class395 arg2, int arg3, int arg4, int arg5) {
        field5816++;
        return arg0 <= 74 ? 119 : arg2.method2402(0, null, null, this.field5818.field6235 - (arg5 * 2), 0, (byte) -113, 0, 0, this.field5818.field6233, arg3 + arg5, -(arg5 * 2) + this.field5818.field6230, this.field5818.field6223, arg1, 0, null, arg4 + arg5);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public static void method2436(int arg0) {
        field5810 = null;
        field5811 = null;
        if (arg0 != 1) {
            field5810 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 <= -29) {
            field5815++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        field5813++;
        if (arg0 != 21378) {
            this.method2435(53, null, null, -99, -84, 18);
        }
        return this.field5817.method217(true);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)[Lvn;")
    public static final class186[] method2437(byte arg0) {
        if (arg0 >= -102) {
            return null;
        } else {
            field5809++;
            return new class186[] { class493.field7077, class386.field5652, class6.field51 };
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZ)V")
    public final void method344(boolean arg0, boolean arg1) {
        field5812++;
        class410 var3 = this.field5817.method215(true, this.field5818.field6227);
        if (arg0) {
            this.method2435(42, null, null, 103, 59, -86);
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field5818.field6226.method1329(class570.field8333, this.field5818.field6230, false) + this.field5818.field6228;
        int var5 = this.field5818.field6229.method2447(-1464849236, class140.field2349, this.field5818.field6235) + this.field5818.field6222;
        if (this.field5818.field6231) {
            class637.field9048.method791(var4, var5, this.field5818.field6230, this.field5818.field6235, this.field5818.field6234, 0);
        }
        int var6 = var5 + this.method2435(115, var3.field5866, class148.field2503, var5, var4, 5) * 12;
        int var9 = var6 + 8;
        if (this.field5818.field6231) {
            class637.field9048.method782(var4, var9, var4 + this.field5818.field6230 - 1, var9, this.field5818.field6234, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2435(85, var3.field5860, class148.field2503, var6, var4, 5) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2435(113, var3.field5857, class148.field2503, var10, var4, 5) * 12;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lcv;Lgaa;)V")
    public class405(class22 arg0, class433 arg1) {
        this.field5818 = arg1;
        this.field5817 = arg0;
    }
}
