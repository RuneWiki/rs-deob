import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class722 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "S")
    public static short field9802 = 320;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "F")
    public static float field9804;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
    public static final boolean method4007(int arg0, byte arg1) {
        field9803++;
        if (class609.field8353[arg0]) {
            return true;
        } else if (class732.field9887.method861((byte) -124, arg0)) {
            int var2 = class732.field9887.method860(0, arg0);
            if (var2 == 0) {
                class609.field8353[arg0] = true;
                return true;
            }
            if (class396.field5798[arg0] == null) {
                class396.field5798[arg0] = new class378[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class396.field5798[arg0][var3] == null) {
                    byte[] var4 = class732.field9887.method863(arg1 ^ 0xFFFFF8E8, arg0, var3);
                    if (var4 != null) {
                        class378 var5 = class396.field5798[arg0][var3] = new class378();
                        var5.field5506 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2393(new class215(var4), true);
                    }
                }
            }
            if (arg1 != 84) {
                field9804 = -0.8522395F;
            }
            class609.field8353[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
