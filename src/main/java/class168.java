import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class168 extends class36 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lja;")
    public class224 field2288;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field2291 = 1;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2292 = "Loading wordpack - ";

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
    public static int[] field2287;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 11)
    public static void method1188(int arg0) {
        field2292 = null;
        field2287 = null;
        if (arg0 != 1) {
            field2291 = -82;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lgk;", line = 31)
    public static final class52 method1189(int arg0, int arg1) {
        field2290++;
        class52 var2 = (class52) class269.field3998.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        class52 var3 = class289.method1984(class340.field5107, class240.field3405, false, arg1, (byte) -125);
        if (arg0 != 1) {
            method1188(-69);
        }
        if (var3 != null) {
            class269.field3998.method721((long) arg1, var3, arg0 ^ 0x1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lja;)V", line = 68)
    public class168(class224 arg0) {
        this.field2288 = arg0;
    }
}
