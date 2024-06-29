import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class487 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Loga;")
    public static class158 field6925 = new class158();

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public static void method2782(int arg0) {
        if (arg0 >= 110) {
            field6925 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2783(boolean arg0, byte[] arg1) {
        if (!arg0) {
            field6925 = null;
        }
        field6924++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class667.method3739(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static final void method2784(int arg0) {
        field6926++;
        int var1 = arg0;
        if (class335.field4872 != null) {
            var1 = class335.field4872.method3437(false, class62.field996);
        }
        if (var1 == 2) {
            int var2 = class173.field2443 <= 800 ? class173.field2443 : 800;
            int var3 = class300.field4447 <= 600 ? class300.field4447 : 600;
            class189.field2573 = (class173.field2443 - var2) / 2;
            class454.field6538 = var2;
            class425.field6218 = var3;
            class356.field5273 = 0;
        } else if (var1 == 1) {
            int var4 = class173.field2443 <= 1024 ? class173.field2443 : 1024;
            int var5 = class300.field4447 > 768 ? 768 : class300.field4447;
            class454.field6538 = var4;
            class189.field2573 = (class173.field2443 - var4) / 2;
            class356.field5273 = 0;
            class425.field6218 = var5;
        } else {
            class454.field6538 = class173.field2443;
            class189.field2573 = 0;
            class425.field6218 = class300.field4447;
            class356.field5273 = 0;
        }
    }
}
