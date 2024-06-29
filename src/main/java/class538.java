import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class538 extends class217 {

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field7768;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    private int field7765;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    private int field7770;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    private int field7773;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lsq;")
    public static class178 field7771 = new class178(4, 1, 1, 1);

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lpia;")
    public static class94 field7772 = new class94(69, 1);

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[I")
    public static int[] field7774 = new int[4096];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    public static int[] field7775 = new int[1];

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V")
    public final void method1268(int arg0, int arg1, byte arg2) {
        if (arg2 != -39) {
            method3159((byte) 96);
        }
        ++field7767;
        int var4 = this.field7765 * arg1 >> 12;
        int var5 = this.field7770 * arg1 >> 12;
        int var6 = this.field7773 * arg0 >> 12;
        int var7 = this.field7768 * arg0 >> 12;
        class604.method3434(var7, super.field2520, -104, var5, var4, var6);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method3159(byte arg0) {
        field7775 = null;
        field7772 = null;
        field7774 = null;
        field7771 = null;
        if (arg0 <= 7) {
            field7774 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V")
    public final void method1265(int arg0, int arg1, boolean arg2) {
        ++field7769;
        if (!arg2) {
            this.method1267(-10, 48, -62);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIII)V")
    public class538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7768 = arg3;
        this.field7765 = arg0;
        this.field7770 = arg2;
        this.field7773 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public final void method1267(int arg0, int arg1, int arg2) {
        ++field7766;
        if (arg0 != -5) {
            field7771 = null;
        }
    }
}
