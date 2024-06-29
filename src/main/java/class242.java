import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class242 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Lwa;", line = 12)
    public static final class94 method1723(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class94 var4 = var3.field5092;
            var3.field5092 = null;
            return var4;
        }
    }
}
