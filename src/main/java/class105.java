import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class105 extends class775 {

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Lqw;")
    public static class84 field1490 = new class84();

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "Ljb;")
    public static class519 field1494 = new class519(121, 3);

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "[I")
    public static int[] field1496 = new int[4096];

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIII)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1492 = arg3;
        this.field1495 = arg0;
        this.field1486 = arg1;
        this.field1488 = arg2;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static void method800(int arg0) {
        field1490 = null;
        field1494 = null;
        int var1 = 66 % ((30 - arg0) / 38);
        field1496 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
    public final void method111(int arg0, int arg1, int arg2) {
        if (arg2 != 17793) {
            this.method110(124, 97, -16);
        }
        ++field1487;
        int var4 = this.field1495 * arg1 >> 12;
        int var5 = this.field1488 * arg1 >> 12;
        int var6 = this.field1486 * arg0 >> 12;
        int var7 = this.field1492 * arg0 >> 12;
        class220.method1409(super.field10661, var4, super.field10665, var5, var7, (byte) 28, var6);
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(III)V")
    public final void method109(int arg0, int arg1, int arg2) {
        ++field1491;
        int var4 = this.field1495 * arg2 >> 12;
        if (arg0 != -1) {
            this.field1492 = 87;
        }
        int var5 = this.field1488 * arg2 >> 12;
        int var6 = this.field1486 * arg1 >> 12;
        int var7 = this.field1492 * arg1 >> 12;
        class193.method1278(var6, (byte) -87, super.field10662, var4, var5, var7);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Luq;ILuq;I)V")
    public static final void method801(class172 arg0, int arg1, class172 arg2, int arg3) {
        class366.field5271 = arg2;
        if (arg3 > -115) {
            method800(117);
        }
        ++field1489;
        class638.field8601 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        ++field1493;
        int var4 = this.field1495 * arg0 >> 12;
        int var5 = this.field1488 * arg0 >> 12;
        int var6 = this.field1486 * arg2 >> 12;
        int var7 = this.field1492 * arg2 >> 12;
        class749.method4094(var6, var4, var7, super.field10665, super.field10661, -120, var5, super.field10662);
        if (arg1 != 512) {
            this.method111(-1, -88, -21);
        }
    }
}
