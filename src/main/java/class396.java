import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class396 {

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field5699;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "B")
    public byte field5690;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Luq;")
    public class318 field5697;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[Z")
    public static boolean[] field5692 = new boolean[5];

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lkba;")
    public class187 field5687;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lth;")
    public static class290 field5689;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lgb;")
    public class448 field5695;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lwo;")
    public class695 field5691;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lkca;")
    public class760 field5688;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Llj;", line = 13)
    public static final class213 method2469(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class213 var4 = var3.field3838;
            var3.field3838 = null;
            class537.method3176(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 24)
    public static void method2470(byte arg0) {
        field5692 = null;
        field5689 = null;
        if (arg0 != -1) {
            method2469(-61, 103, -72);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method2471(int arg0) {
        if (arg0 != -7431) {
            this.field5695 = null;
        }
        field5693++;
        return this.field5690 == 2 || this.field5690 == 3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(BIIIIIILuq;)V", line = 57)
    public class396(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class318 arg7) {
        this.field5696 = arg2;
        this.field5699 = arg3;
        this.field5698 = arg5;
        this.field5690 = arg0;
        this.field5686 = arg4;
        this.field5694 = arg1;
        this.field5697 = arg7;
        this.field5700 = arg6;
    }
}
