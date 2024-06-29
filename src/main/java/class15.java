import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class15 extends class398 {

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "Lcr;")
    public static class189 field216 = new class189(64);

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "Ljava/lang/String;")
    public static String field218 = "glow2:";

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method94(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field215;
        if (arg5 >= class87.field1227 && arg7 <= class299.field4382 && ~class379.field5521 >= ~arg6 && arg4 <= class125.field1751) {
            class2.method18(arg7, arg3, arg0, arg5, arg4, (byte) -76, arg2, arg6);
        } else {
            class220.method1286(false, arg3, arg0, arg7, arg5, arg2, arg4, arg6);
        }
        if (arg1 != -128) {
            method96(true);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field217;
        int[] var3 = super.field5927.method305(arg0, (byte) 96);
        if (super.field5927.field591) {
            int[][] var4 = this.method2561(arg0, (byte) -96, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class140.field1922; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 != 0) {
            method96(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class15() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(Z)V")
    public static void method96(boolean arg0) {
        if (!arg0) {
            method96(false);
        }
        field218 = null;
        field216 = null;
    }
}
