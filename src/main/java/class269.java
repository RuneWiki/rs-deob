import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class269 {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public int field3994 = -1;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Lct;")
    public static class104 field3996;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lhg;")
    public class299 field3989;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lgt;")
    public static class341 field3992;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
    public int[] field3990;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "[Lae;")
    public static class285[] field3995;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field3991;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)I")
    public static final int method1848(byte arg0, int arg1) {
        field3993++;
        return arg0 == 65 ? arg1 >>> 7 : 107;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method1849(byte arg0) {
        field3995 = null;
        int var1 = -75 % ((arg0 + 15) / 34);
        field3996 = null;
        field3992 = null;
    }
}
