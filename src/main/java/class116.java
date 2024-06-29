import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class116 {

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "B")
    private byte field1718;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Lfc;")
    public static class262 field1720 = new class262(0, -1);

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public static void method904(byte arg0) {
        field1720 = null;
        if (arg0 > -116) {
            field1720 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V")
    public static final void method905(int arg0, int arg1) {
        field1722++;
        if (class71.field999 == arg0) {
            return;
        }
        class409.field5183 = class543.field7597 = class466.field6264[arg0];
        class443.method2511(-29079);
        class387.field4934 = new int[4][class409.field5183 >> 3][class543.field7597 >> 3];
        class125.field1796 = new int[class409.field5183][class543.field7597];
        class331.field4227 = new int[class409.field5183][class543.field7597];
        for (int var2 = 0; var2 < 4; var2++) {
            class526.field7350[var2] = class106.method855(class543.field7597, class409.field5183, 65535);
        }
        int var3 = 23 / ((arg1 + 45) / 33);
        class232.field3052 = new byte[4][class409.field5183][class543.field7597];
        class134.method985(-2287, class543.field7597, class409.field5183, 4);
        class391.method2214(class386.field4930, class543.field7597 >> 3, class409.field5183 >> 3, -6723);
        class71.field999 = arg0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)I")
    public final int method906(int arg0) {
        if (arg0 != 1) {
            field1720 = null;
        }
        field1713++;
        return (this.field1718 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIIIBI)Z")
    public static final boolean method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1714++;
        if (!class380.method2169(arg7, arg9, 24, arg3)) {
            return false;
        }
        int var10 = class176.field2464[0];
        int var11 = class176.field2464[2];
        int var12 = class176.field2464[1];
        if (!class380.method2169(arg5, arg2, 24, arg0)) {
            return false;
        }
        int var13 = class176.field2464[0];
        int var14 = class176.field2464[1];
        int var15 = class176.field2464[2];
        if (!class380.method2169(arg1, arg6, 24, arg4)) {
            return false;
        }
        int var16 = class176.field2464[0];
        int var17 = class176.field2464[2];
        if (arg8 < 35) {
            return true;
        } else {
            int var18 = class176.field2464[1];
            return class179.method1223(var12, var17, var13, var14, var15, var18, var11, var16, -43, var10);
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
    public class116() {
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
    public final int method908(int arg0) {
        if (arg0 < 106) {
            this.field1717 = 26;
        }
        field1716++;
        return this.field1718 & 0x7;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lsl;)V")
    public class116(class461 arg0) {
        this.field1718 = arg0.method2601(0);
        this.field1723 = arg0.method2566(-2);
        this.field1721 = arg0.method2622(-539564808);
        this.field1717 = arg0.method2622(-539564808);
        this.field1719 = arg0.method2622(-539564808);
        this.field1715 = arg0.method2622(-539564808);
    }
}
