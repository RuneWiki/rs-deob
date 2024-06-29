import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class109 implements class447 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Ljg;")
    public class338 field1778;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Ljha;")
    public class692 field1775;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "[I")
    public static int[] field1777;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Ljw;")
    public class551 method930(int arg0) {
        if (arg0 != 17503) {
            this.method930(127);
        }
        field1780++;
        return class375.field5253;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public static void method931(int arg0) {
        field1777 = null;
        if (arg0 != 11416) {
            method931(-11);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(ILjg;Ljha;II)V")
    public class109(int arg0, class338 arg1, class692 arg2, int arg3, int arg4) {
        this.field1779 = arg4;
        this.field1774 = arg3;
        this.field1776 = arg0;
        this.field1778 = arg1;
        this.field1775 = arg2;
    }
}
