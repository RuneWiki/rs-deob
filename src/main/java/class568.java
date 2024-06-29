import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class568 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[I")
    public static int[][] field7645 = new int[6][];

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lfc;")
    public static class235 field7650 = new class235(12, 0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[[Laca;")
    public static class667[][] field7648;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method3134(int arg0) {
        field7645 = null;
        field7650 = null;
        if (arg0 != -27464) {
            field7648 = null;
        }
        field7648 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public static final void method3135(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class150.field2245; var5++) {
            Rectangle var7 = class121.field1678[var5];
            if ((var7.x + var7.width) > arg2 && arg2 + arg3 > var7.x && arg4 < var7.y + var7.height && var7.y < arg0 + arg4) {
                class287.field3996[var5] = true;
            }
        }
        int var6 = -111 % ((arg1 + 33) / 32);
        field7647++;
    }

    @OriginalMember(owner = "client!of", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7646++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V")
    public class568(int arg0, int arg1) {
    }
}
