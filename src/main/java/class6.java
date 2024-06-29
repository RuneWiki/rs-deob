import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class255 {

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "Lv;")
    public static class147 field83 = new class147(64);

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field85 = 1;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Leb;")
    private static class230 field84 = class68.method589(0, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "Leb;")
    public static class230 field86 = field84;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Leb;")
    public class230 field78;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "Lka;")
    public static class245 field87;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILfk;I)V")
    private final void method57(int arg0, class14 arg1, int arg2) {
        if (arg0 != -128) {
            method60((byte) 78, 49);
        }
        if (arg2 == 1) {
            this.field77 = arg1.method200(255);
        } else if (arg2 == 2) {
            this.field74 = arg1.method187((byte) 61);
        } else if (arg2 == 5) {
            this.field78 = arg1.method171((byte) 79);
        }
        field79++;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)Z")
    public final boolean method58(byte arg0) {
        if (arg0 != -87) {
            this.method58((byte) -106);
        }
        field82++;
        return this.field77 == 115;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLkk;II)Leh;")
    public static final class80 method59(boolean arg0, class223 arg1, int arg2, int arg3) {
        field76++;
        if (arg0) {
            return class205.method1440(arg2, arg3, 2, arg1) ? class45.method385(-114) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Z")
    public static final boolean method60(byte arg0, int arg1) {
        field80++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else if (arg0 >= -11) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfk;B)V")
    public final void method61(class14 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                field81++;
                if (arg1 >= -115) {
                    this.field78 = null;
                    return;
                }
                return;
            }
            this.method57(-128, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
    public static void method62(int arg0) {
        field87 = null;
        field86 = null;
        field83 = null;
        if (arg0 != 129) {
            method59(false, (class223) null, 89, 58);
        }
        field84 = null;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(II)V")
    public static final void method63(int arg0, int arg1) {
        if (arg1 != 64) {
            method63(-34, 45);
        }
        field75++;
        class197 var2 = class164.method1228(4, arg0, -1665874464);
        var2.method1407(-107);
    }
}
