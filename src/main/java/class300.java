import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class300 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lbf;")
    public static class209 field5062 = new class209(32);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public static int[] field5065 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lma;")
    private static class5 field5064 = class12.method119("Loaded fonts", (byte) 62);

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lma;")
    public static class5 field5063 = field5064;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Leb;")
    public static class253 field5066;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Z", line = 20)
    public static final boolean method2038(boolean arg0) {
        field5061++;
        if (arg0) {
            method2038(true);
        }
        if (class76.field1191 != 0) {
            try {
                return !(Boolean) class2.field24.method31(class267.field4597.field2262, 0);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 43)
    public static void method2039(int arg0) {
        if (arg0 != 18278) {
            method2040((Throwable) null, (String) null);
        }
        field5066 = null;
        field5064 = null;
        field5062 = null;
        field5065 = null;
        field5063 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llk;", line = 70)
    public static final class235 method2040(Throwable arg0, String arg1) {
        field5060++;
        class235 var2;
        if (arg0 instanceof class235) {
            var2 = (class235) arg0;
            var2.field3883 = var2.field3883 + ' ' + arg1;
        } else {
            var2 = new class235(arg0, arg1);
        }
        return var2;
    }
}
