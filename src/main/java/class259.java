import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class259 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "[I")
    public int[] field3840;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
    public int[] field3837;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Ltn;")
    public static class60 field3838 = new class60(14, 7);

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lie;")
    public static class6 field3841;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(I)V", line = 8)
    public class259(int arg0) {
        this.field3839 = arg0;
        this.field3840 = new int[this.field3839];
        this.field3837 = new int[this.field3839];
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 22)
    public static void method1663(byte arg0) {
        field3838 = null;
        if (arg0 >= -49) {
            method1663((byte) 32);
        }
        field3841 = null;
    }
}
