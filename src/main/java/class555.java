import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class555 extends class679 {

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field7833;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field7827;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field7832;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field7837;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public int field7834;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public int field7831;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
    public static boolean field7830 = false;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lbh;")
    public static class538 field7836 = new class538(50);

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lju;")
    public static class102 field7839 = new class102(24, 16);

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field7841 = -1;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lhia;")
    public static class570 field7840 = new class570(0, 0);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lag;", line = 4)
    public class214 method210(int arg0) {
        if (arg0 != 7288) {
            field7830 = true;
        }
        field7835++;
        return class550.field7766;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 17)
    public static void method3301(boolean arg0) {
        field7839 = null;
        field7836 = null;
        field7840 = null;
        if (!arg0) {
            method3301(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method3302(int arg0, int arg1, int arg2) {
        if (arg1 != 16) {
            field7830 = false;
        }
        field7828++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 49)
    public static final void method3303(byte arg0) {
        class126.field1741.method2132(((float) class674.field9500.field5115.method2769(arg0 - 28) * 0.1F + 0.7F) * 1.1523438F);
        field7829++;
        if (arg0 != 28) {
            field7839 = null;
        }
        class126.field1741.method2161(class93.field1283, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class126.field1741.method2069(class56.field783, -1, 0);
        class126.field1741.method2136(class560.field7963);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lvfa;Lrq;IIIIIIIIIIIII)V", line = 66)
    public class555(class92 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7833 = arg14;
        this.field7827 = arg10;
        this.field7832 = arg12;
        this.field7837 = arg13;
        this.field7834 = arg11;
        this.field7831 = arg9;
    }
}
