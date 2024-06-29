import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class68 extends class86 {

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Z")
    public boolean field1013;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "[I")
    public static int[] field1009 = new int[200];

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Lgn;")
    public static class475 field1012 = new class475(8, 8);

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)V", line = 13)
    public static void method469(byte arg0) {
        field1009 = null;
        if (arg0 >= 92) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIZ)V", line = 29)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1016 = arg3;
        this.field1011 = arg2;
        this.field1014 = arg4;
        this.field1013 = arg5;
        this.field1015 = arg0;
        this.field1010 = arg1;
    }
}
