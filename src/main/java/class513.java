import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class513 {

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lea;")
    public static class474 field7490 = new class474("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method3045(byte arg0) {
        field7490 = null;
        if (arg0 != -40) {
            method3048(-86, 126);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3046(String arg0, int arg1) {
        field7486++;
        if (class545.field7788.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class545.field7788.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class545.field7788.startsWith("mac")) {
            return "lib" + arg0 + ".jnilib";
        } else if (arg1 == -1) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[BI)I")
    public static final int method3047(byte arg0, byte[] arg1, int arg2) {
        if (arg0 < 108) {
            field7487 = -31;
        }
        field7488++;
        return class245.method1628(120, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
    public static final boolean method3048(int arg0, int arg1) {
        field7485++;
        if (arg0 == 22 || arg0 == 5 || arg0 == 6 || arg0 == 10 || arg0 == 1012) {
            return true;
        } else if (arg0 == 9 || arg0 == 1008) {
            return true;
        } else {
            return arg1 > -68;
        }
    }
}
