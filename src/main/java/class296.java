import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class296 extends class583 {

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Llc;")
    public class646 field4165;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Lqfa;")
    public static class98 field4164 = new class98(39, 6);

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "Ljava/awt/Image;")
    public static Image field4170;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lha;IZB)Lfj;", line = 3)
    public static final class655 method1922(class58 arg0, int arg1, boolean arg2, byte arg3) {
        field4166++;
        if (arg3 != -22) {
            return null;
        } else if (arg1 == -1) {
            return null;
        } else {
            if (class24.field340 != null) {
                for (int var4 = 0; var4 < class24.field340.length; var4++) {
                    if (class24.field340[var4] == arg1) {
                        return class415.field5857[var4];
                    }
                }
            }
            class655 var5 = (class655) class636.field8756.method4022((long) arg1, (byte) 105);
            if (var5 != null) {
                if (arg2 && var5.field8990 == null) {
                    class143 var6 = class228.method1422(class735.field10238, 2, arg1);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field8990 = var6;
                }
                return var5;
            }
            class204[] var7 = class204.method1236(class288.field4076, arg1);
            if (var7 == null) {
                return null;
            }
            class143 var8 = class228.method1422(class735.field10238, 2, arg1);
            if (var8 == null) {
                return null;
            }
            class655 var9;
            if (arg2) {
                var9 = new class655(arg0.method459(var8, var7, true), var8);
            } else {
                var9 = new class655(arg0.method459(var8, var7, true));
            }
            class636.field8756.method4018((byte) 127, var9, (long) arg1);
            return var9;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Llc;)V", line = 77)
    public class296(class646 arg0) {
        this.field4165 = arg0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 88)
    public static void method1923(boolean arg0) {
        field4170 = null;
        field4164 = null;
        if (!arg0) {
            method1922(null, 87, true, (byte) 117);
        }
    }
}
