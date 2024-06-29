import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class14 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    public static int[] field153 = new int[2048];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lqj;")
    public static class196 field155 = class80.method502(")1 ", -48);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lqj;")
    public static class196 field154 = class80.method502("Lade)3)3)3", -48);

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Ljf;")
    public static final class172 method62(int arg0, int arg1, int arg2) {
        field156++;
        if (arg0 != -1204912992) {
            return null;
        }
        class172 var3 = (class172) class187.field3284.method1551(32768, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class172(arg1, arg2);
            class187.field3284.method1552(var3, var3.field1850, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public static void method63(boolean arg0) {
        field153 = null;
        field154 = null;
        if (arg0) {
            method62(94, -35, 120);
        }
        field155 = null;
    }
}
