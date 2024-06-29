import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class607 extends class735 {

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field8185 = 0;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "Lpga;")
    public static class495 field8188;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3452(int arg0) {
        class244[] var1 = class754.field10383;
        synchronized (class754.field10383) {
            if (arg0 <= 51) {
                method3454(null, (byte) -122);
            }
            int var2 = 0;
            while (true) {
                if (class754.field10383.length <= var2) {
                    break;
                }
                class754.field10383[var2] = new class244();
                class51.field757[var2] = 0;
                var2++;
            }
        }
        field8187++;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 36)
    public static void method3453(int arg0) {
        if (arg0 > -5) {
            field8188 = null;
        }
        field8188 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lida;B)I", line = 48)
    public static final int method3454(class272 arg0, byte arg1) {
        if (arg1 < 95) {
            method3454(null, (byte) -14);
        }
        field8186++;
        String var2 = class521.method3109(arg0, 0);
        return class535.field7417.method1137(256, class719.field10005, var2);
    }
}
