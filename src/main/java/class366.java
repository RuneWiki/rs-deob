import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class366 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[[I")
    public static int[][] field4724 = new int[128][128];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Z")
    public static boolean field4726 = false;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field4728 = new int[14];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
    public static boolean field4727 = false;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z")
    public final boolean method2106(int arg0) {
        if (arg0 != 14) {
            field4726 = false;
        }
        field4729++;
        return class524.field6825 == this | class482.field6417 == this;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method2107(boolean arg0) {
        field4728 = null;
        field4724 = null;
        if (arg0) {
            field4726 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4725++;
        throw new IllegalStateException();
    }
}
