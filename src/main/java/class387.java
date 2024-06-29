import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class387 extends class432 {

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    private int field5448;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    private int field5455;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    private int field5449;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    private int field5451;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Lfn;")
    public static class52 field5453;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Lnf;")
    public static class107 field5456;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static void method2303(boolean arg0) {
        field5453 = null;
        field5456 = null;
        if (!arg0) {
            field5453 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method2304(int arg0, String arg1, int arg2) {
        if (arg2 > -87) {
            field5453 = null;
        }
        ++field5452;
        return class260.method1608(arg1, -70, arg0, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZII)V")
    public final void method1598(boolean arg0, int arg1, int arg2) {
        ++field5450;
        if (arg0) {
            int var4 = this.field5449 * arg1 >> 12;
            int var5 = this.field5448 * arg1 >> 12;
            int var6 = this.field5455 * arg2 >> 12;
            int var7 = this.field5451 * arg2 >> 12;
            class79.method545(var7, var5, var6, super.field5951, var4, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIIIII)V")
    public class387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5448 = arg2;
        this.field5455 = arg1;
        this.field5449 = arg0;
        this.field5451 = arg3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
    public final void method1597(int arg0, int arg1, int arg2) {
        if (arg2 != -20714) {
            method2305((byte) 37, 1);
        }
        ++field5454;
        int var4 = this.field5449 * arg1 >> 12;
        int var5 = this.field5448 * arg1 >> 12;
        int var6 = this.field5455 * arg0 >> 12;
        int var7 = this.field5451 * arg0 >> 12;
        class55.method427(super.field5949, (byte) -42, super.field5951, var6, super.field5950, var4, var5, var7);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)V")
    public final void method1601(byte arg0, int arg1, int arg2) {
        ++field5446;
        if (arg0 <= -60) {
            int var4 = this.field5449 * arg2 >> 12;
            int var5 = this.field5448 * arg2 >> 12;
            int var6 = this.field5455 * arg1 >> 12;
            int var7 = this.field5451 * arg1 >> 12;
            class326.method1962(super.field5949, super.field5950, var4, var5, var6, (byte) 97, var7);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)I")
    public static final int method2305(byte arg0, int arg1) {
        if (arg0 >= -59) {
            method2305((byte) -119, 37);
        }
        ++field5447;
        return arg1 & 255;
    }

    static {
        new class112("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        new class112("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field5453 = new class52(99, 4);
    }
}
