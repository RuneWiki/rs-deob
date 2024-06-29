import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class class185 {

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "Z")
    public static boolean field2789;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public abstract void method1345(int arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Z")
    public abstract boolean method1346(int arg0, int arg1);

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Lll;")
    public abstract class366 method1347(int arg0);

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
    public abstract void method1348(int arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[[S[[F)[[S")
    public static final short[][] method1349(int arg0, short[][] arg1, float[][] arg2) {
        if (arg0 != 16383) {
            return null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        field2791++;
        return arg1;
    }
}
