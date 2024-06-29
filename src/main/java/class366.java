import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class366 implements Runnable {

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "[Lbr;")
    public volatile class414[] field5275 = new class414[2];

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
    public volatile boolean field5273 = false;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Z")
    public volatile boolean field5276 = false;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "Ljb;")
    public static class519 field5269 = new class519(101, -1);

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "Ljb;")
    public static class519 field5277 = new class519(14, 2);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Luq;")
    public static class172 field5271;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "Lec;")
    public class248 field5274;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)V")
    public static void method2303(boolean arg0) {
        field5269 = null;
        if (arg0) {
            method2304(0.8783732F, 105, 5, 82, true, 113, -116, 28);
        }
        field5271 = null;
        field5277 = null;
    }

    @OriginalMember(owner = "client!ow", name = "run", descriptor = "()V")
    public final void run() {
        this.field5276 = true;
        field5272++;
        try {
            while (!this.field5273) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class414 var2 = this.field5275[var1];
                    if (var2 != null) {
                        var2.method2492((byte) 113);
                    }
                }
                class171.method1152(10L, false);
                class265.method1778(-51, null, this.field5274);
            }
        } catch (Exception var9) {
            class607.method3379(null, var9, true);
        } finally {
            Object var6 = null;
            this.field5276 = false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(FIIIZIII)[I")
    public static final int[] method2304(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field5270++;
        int[] var8 = new int[arg7];
        if (arg3 <= 73) {
            return null;
        }
        class128 var9 = new class128();
        var9.field1751 = (int) (arg0 * 4096.0F);
        var9.field1760 = arg4;
        var9.field1761 = arg1;
        var9.field1752 = arg6;
        var9.field1764 = arg2;
        var9.field1759 = arg5;
        var9.method46(-8);
        class685.method3757(-5975, arg7, 1);
        var9.method910(8, 0, var8);
        return var8;
    }
}
