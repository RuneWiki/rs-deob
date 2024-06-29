import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class105 extends class274 {

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    private final int field1661;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    private final int field1654;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    private final int field1666;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    private final int field1667;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lce;")
    public static class126 field1663 = class206.method1445(-7923, "_");

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lce;")
    public static class126 field1662 = class206.method1445(-7923, "compass");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lce;")
    public static class126 field1655 = class206.method1445(-7923, "Konfig geladen)3");

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lce;")
    public static class126 field1658 = class206.method1445(-7923, ")3)3)3");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IIIIIII)V", line = 21)
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1661 = arg1;
        this.field1654 = arg0;
        this.field1666 = arg3;
        this.field1667 = arg2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V", line = 34)
    public final void method52(int arg0, byte arg1, int arg2) {
        field1665++;
        int var4 = this.field1654 * arg0 >> 12;
        int var5 = this.field1661 * arg2 >> 12;
        int var6 = this.field1666 * arg2 >> 12;
        int var7 = this.field1667 * arg0 >> 12;
        class22.method110(this.field4609, this.field4606, var6, var5, var4, var7, -8, this.field4610);
        if (arg1 != 66) {
            field1658 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 68)
    public static void method706(int arg0) {
        field1655 = null;
        field1662 = null;
        field1658 = null;
        if (arg0 != 139069932) {
            field1657 = 40;
        }
        field1663 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V", line = 82)
    public final void method50(int arg0, int arg1, int arg2) {
        int var4 = this.field1654 * arg0 >> 12;
        field1664++;
        if (arg2 != 1) {
            field1657 = 126;
        }
        int var5 = this.field1661 * arg1 >> 12;
        int var6 = this.field1667 * arg0 >> 12;
        int var7 = this.field1666 * arg1 >> 12;
        class167.method1223(var5, var4, 50, var7, this.field4609, var6);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V", line = 124)
    public final void method56(int arg0, int arg1, byte arg2) {
        field1656++;
        if (arg2 != 66) {
            return;
        }
        int var4 = this.field1654 * arg0 >> 12;
        int var5 = this.field1667 * arg0 >> 12;
        int var6 = this.field1661 * arg1 >> 12;
        int var7 = this.field1666 * arg1 >> 12;
        class172.method1250((byte) -47, this.field4610, var5, var4, this.field4606, var6, var7);
    }
}
