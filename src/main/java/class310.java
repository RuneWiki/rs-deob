import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class310 extends class302 {

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4453 = -1;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4450 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lri;")
    public static class73 field4452 = new class73(25, 1);

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field4460 = 0;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V", line = 9)
    public final void method404(int arg0, int arg1, boolean arg2) {
        ++field4455;
        int var4 = this.field4459 * arg0 >> 12;
        int var5 = this.field4448 * arg0 >> 12;
        int var6 = this.field4454 * arg1 >> 12;
        int var7 = this.field4449 * arg1 >> 12;
        class359.method2232(super.field4273, var6, var7, var5, super.field4272, arg2, var4);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 26)
    public static void method1943(byte arg0) {
        if (arg0 == 77) {
            field4452 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V", line = 38)
    public static final void method1944(int arg0, int arg1, int arg2) {
        ++field4457;
        int var3 = 107 % ((arg0 - -24) / 45);
        class338 var4 = class230.method1580(1, -1332166328, arg1);
        var4.method2053(-101);
        var4.field4756 = arg2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V", line = 57)
    public final void method403(int arg0, int arg1, int arg2) {
        ++field4458;
        int var4 = this.field4459 * arg0 >> 12;
        int var5 = this.field4448 * arg0 >> 12;
        int var6 = this.field4454 * arg2 >> 12;
        if (arg1 == 4802) {
            int var7 = this.field4449 * arg2 >> 12;
            class203.method1376(super.field4267, var5, var6, var4, var7, 6306);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 76)
    public final void method405(int arg0, int arg1, int arg2) {
        ++field4451;
        int var4 = this.field4459 * arg1 >> 12;
        if (arg0 == 2) {
            int var5 = this.field4448 * arg1 >> 12;
            int var6 = this.field4454 * arg2 >> 12;
            int var7 = this.field4449 * arg2 >> 12;
            class325.method2012(arg0 + 2147483645, var4, var5, super.field4272, var7, var6, super.field4273, super.field4267);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIII)V", line = 110)
    public class310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4454 = arg1;
        this.field4449 = arg3;
        this.field4448 = arg2;
        this.field4459 = arg0;
    }
}
