import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class526 extends class20 {

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private int field6848;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lnj;")
    public static class415 field6849 = new class415(43, -1);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Lxa;")
    public static class511 field6856;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lhf;")
    public static class649 field6855;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 3)
    public static void method2809(int arg0) {
        if (arg0 == -27959) {
            field6855 = null;
            field6856 = null;
            field6849 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 15)
    public static final void method2810(int arg0, int arg1) {
        if (arg1 != 2) {
            method2810(-77, -120);
        }
        ++field6858;
        class367 var2 = class573.method3057(5, arg0, arg1);
        var2.method2113(108);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)V", line = 36)
    public final void method115(int arg0, int arg1, int arg2) {
        if (arg0 <= 123) {
            this.method114(-118, -22, 78);
        }
        ++field6852;
        int var4 = this.field6850 * arg1 >> 12;
        int var5 = this.field6848 * arg1 >> 12;
        int var6 = this.field6853 * arg2 >> 12;
        int var7 = this.field6847 * arg2 >> 12;
        class283.method1691(super.field216, var7, var4, super.field217, super.field222, var6, var5, (byte) 124);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIII)V", line = 57)
    public class526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6853 = arg1;
        this.field6850 = arg0;
        this.field6847 = arg3;
        this.field6848 = arg2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 72)
    public final void method111(int arg0, int arg1, int arg2) {
        ++field6851;
        if (arg2 != 52) {
            this.method111(-121, 22, 89);
        }
        int var4 = this.field6850 * arg1 >> 12;
        int var5 = this.field6848 * arg1 >> 12;
        int var6 = this.field6853 * arg0 >> 12;
        int var7 = this.field6847 * arg0 >> 12;
        class99.method743(var4, var5, var6, super.field216, (byte) -65, super.field222, var7);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V", line = 94)
    public final void method114(int arg0, int arg1, int arg2) {
        ++field6854;
        int var4 = this.field6850 * arg1 >> 12;
        int var5 = this.field6848 * arg1 >> 12;
        int var6 = this.field6853 * arg2 >> 12;
        int var7 = this.field6847 * arg2 >> 12;
        class413.method2335(var4, true, var5, super.field217, var7, var6);
        if (arg0 >= -28) {
            method2810(113, -7);
        }
    }
}
