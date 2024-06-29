import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class281 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    public static int[] field4798 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    public static int[] field4795 = new int[50];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lwm;")
    public class152 field4799;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[[[I")
    public static int[][][] field4797;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 29)
    public static void method1909(int arg0) {
        field4798 = null;
        if (arg0 != 10) {
            method1909(108);
        }
        field4797 = (int[][][]) null;
        field4795 = null;
    }
}
