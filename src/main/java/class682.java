import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class682 {

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "[I")
    public static int[] field9475 = new int[3];

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "F")
    public static float field9474;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
    public static void method3840(int arg0) {
        field9475 = null;
        if (arg0 != 0) {
            field9474 = -0.2779004F;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZI)Lua;")
    public static final class3 method3841(int arg0, boolean arg1, int arg2) {
        field9476++;
        if (arg2 != 28389) {
            field9475 = null;
        }
        class244[] var3 = class754.field10383;
        synchronized (class754.field10383) {
            class3 var4;
            if (class754.field10383.length <= arg0 || class754.field10383[arg0].method1636((byte) -17)) {
                var4 = new class3();
                var4.field18 = new class574[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field18[var5] = new class574();
                }
            } else {
                var4 = (class3) class754.field10383[arg0].method1640(arg2 ^ 0x6EE7);
                var4.method3012(113);
                int var10002 = class51.field757[arg0]--;
            }
            var4.field22 = arg1;
            return var4;
        }
    }
}
