import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class158 extends class436 {

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "[Lap;")
    public static class279[] field2236 = new class279[4];

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method14(int arg0, int arg1) {
        ++field2237;
        int[] var3 = super.field6258.method2688((byte) -79, arg0);
        if (arg1 != 18338) {
            field2236 = null;
        }
        if (super.field6258.field6138) {
            int[][] var4 = this.method2731(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class43.field653; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 46)
    public class158() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 49)
    public static void method1060(boolean arg0) {
        field2236 = null;
        if (!arg0) {
            method1061(68, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V", line = 63)
    public static final void method1061(int arg0, byte arg1) {
        ++field2235;
        if (arg1 != -117) {
            field2236 = null;
        }
        class399 var2 = class269.method1655(12, arg0, -31);
        var2.method2582(arg1 ^ -117);
    }
}
