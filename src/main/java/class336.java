import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class336 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[F")
    public static float[] field4675 = new float[4];

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4677 = "";

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[[[Lnt;")
    public static class148[][][] field4678;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lid;")
    public static final class412 method2053(int arg0, int arg1) {
        field4676++;
        class412[] var2 = class441.method2696((byte) -100);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class412 var4 = var2[var3];
            if (var4.field6117 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method2054(int arg0) {
        if (arg0 != 0) {
            method2054(-115);
        }
        field4675 = null;
        field4677 = null;
        field4678 = null;
    }
}
