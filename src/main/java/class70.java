import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class70 extends class75 {

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field748 = -1;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "Ljo;")
    public static class303 field750;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V", line = 14)
    public static void method459(int arg0) {
        field750 = null;
        if (arg0 != -1) {
            field750 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZC)Z", line = 25)
    public static final boolean method460(boolean arg0, char arg1) {
        field753++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class671.method3762(arg1, 0)) {
            return true;
        } else {
            char[] var2 = class230.field2937;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class250.field3227;
            if (arg0) {
                method461(-41, -19, 80);
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V", line = 71)
    public static final void method461(int arg0, int arg1, int arg2) {
        field752++;
        class530 var3 = class242.method1402(-100, 13, arg0);
        var3.method3025((byte) -69);
        if (arg1 >= -49) {
            field749 = -43;
        }
        var3.field7593 = arg2;
    }
}
