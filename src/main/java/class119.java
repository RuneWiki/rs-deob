import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class119 extends class114 {

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field1713 = -1;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Lac;")
    public static class153 field1720 = new class153(16);

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1722 = "Loaded textures";

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIII)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1721 = arg0;
        this.field1717 = arg3;
        this.field1718 = arg2;
        this.field1716 = arg1;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static void method782(byte arg0) {
        if (arg0 != 67) {
            field1713 = -47;
        }
        field1722 = null;
        field1720 = null;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        ++field1714;
        int var4 = this.field1721 * arg0 >> 12;
        int var5 = this.field1718 * arg0 >> 12;
        int var6 = this.field1716 * arg1 >> 12;
        if (arg2 != -29715) {
            this.field1717 = -52;
        }
        int var7 = this.field1717 * arg1 >> 12;
        class14.method84(var5, super.field1661, 1510045708, var6, var7, var4);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        if (arg0 == 32768) {
            ++field1715;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        ++field1719;
        if (arg1 != -8132) {
            this.method103(122, 113, 19);
        }
    }
}
