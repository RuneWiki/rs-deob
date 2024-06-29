import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class363 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field5211 = 0;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lbr;")
    public static class223 field5212 = null;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field5213 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llf;Z)Lqn;", line = 12)
    public static final class40 method2353(class130 arg0, boolean arg1) {
        arg0.method837(true);
        field5214++;
        int var2 = arg0.method837(arg1);
        class40 var3 = class170.method1215(-5, var2);
        var3.field549 = arg0.method837(arg1);
        int var4 = arg0.method837(true);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method837(true);
            var3.method43(var6, 124, arg0);
        }
        var3.method39((byte) -23);
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 52)
    public static void method2354(byte arg0) {
        if (arg0 != -96) {
            method2353((class130) null, true);
        }
        field5212 = null;
    }
}
