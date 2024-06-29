import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class568 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public static boolean field8075 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public static boolean field8076 = true;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
    public static boolean field8077 = false;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Lhu;")
    public static class131[] field8080;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lkia;")
    public static final class619 method3305(int arg0, int arg1) {
        field8079++;
        if (arg0 != -1) {
            field8077 = true;
        }
        return new class619(arg1, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method3306(byte arg0) {
        int var1 = -125 % ((arg0 - 21) / 48);
        field8080 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILcs;)Ljba;")
    public static final class398 method3307(int arg0, class340 arg1) {
        field8078++;
        class398 var2;
        if (class75.field782 == null) {
            var2 = new class398();
        } else {
            var2 = class75.field782;
            class75.field782 = class75.field782.field5451;
            class738.field10313--;
            var2.field5451 = null;
        }
        if (arg0 != 30103) {
            field8076 = true;
        }
        var2.field5449 = arg1;
        return var2;
    }
}
