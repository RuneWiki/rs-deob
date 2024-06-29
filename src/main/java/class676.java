import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class676 extends class249 {

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    private int field9476;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field9478;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    private int field9481;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field9475;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Ltja;")
    public static class288 field9477 = new class288(4, 8);

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Lmga;")
    public static class739 field9480 = new class739(70, 3);

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public final void method844(int arg0, int arg1, int arg2) {
        ++field9473;
        int var4 = this.field9481 * arg0 >> 12;
        int var5 = this.field9478 * arg0 >> 12;
        int var6 = this.field9476 * arg1 >> 12;
        int var7 = this.field9475 * arg1 >> 12;
        class357.method2246(super.field3694, var4, var6, var7, -128, var5);
        if (arg2 != -7895) {
            this.field9481 = 99;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIIII)V")
    public class676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9476 = arg1;
        this.field9478 = arg2;
        this.field9481 = arg0;
        this.field9475 = arg3;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(BII)V")
    public final void method845(byte arg0, int arg1, int arg2) {
        ++field9474;
        int var4 = this.field9481 * arg2 >> 12;
        int var5 = this.field9478 * arg2 >> 12;
        int var6 = this.field9476 * arg1 >> 12;
        int var7 = this.field9475 * arg1 >> 12;
        class31.method224(var4, -113, super.field3690, super.field3694, var6, var7, super.field3689, var5);
        if (arg0 != 85) {
            field9480 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
    public final void method843(byte arg0, int arg1, int arg2) {
        ++field9479;
        int var4 = this.field9481 * arg2 >> 12;
        int var5 = this.field9478 * arg2 >> 12;
        int var6 = this.field9476 * arg1 >> 12;
        int var7 = this.field9475 * arg1 >> 12;
        class249.method1672(var7, super.field3689, var4, var5, super.field3690, -127, var6);
        if (arg0 != 101) {
            this.method844(118, 17, -55);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method3749(byte arg0) {
        field9480 = null;
        if (arg0 >= -80) {
            method3749((byte) -22);
        }
        field9477 = null;
    }
}
