import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class366 extends class132 {

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    private int field4708;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    private int field4711;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    private int field4705;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    private int field4710;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field4709 = 0;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lhb;")
    public static class250 field4703 = new class250(57, 2);

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public static int field4716 = 765;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "[C")
    public static char[] field4717 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBII)I")
    public static final int method2145(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = 43 % ((arg1 - -61) / 60);
        ++field4714;
        if (class92.field1285 == null) {
            return 0;
        } else {
            int var5 = arg2 >> 7;
            int var6 = arg3 >> 7;
            if (var5 >= 0 && ~var6 <= -1 && ~(class200.field2594 + -1) <= ~var5 && class118.field1647 - 1 >= var6) {
                int var7 = arg0;
                if (~arg0 > -4 && (2 & class8.field76[1][var5][var6]) != 0) {
                    var7 = arg0 + 1;
                }
                return class92.field1285[var7].method1185(arg2, arg3);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZLeo;)V")
    public static final void method2146(boolean arg0, class423 arg1) {
        if (arg0) {
            method2146(true, (class423) null);
        }
        ++field4707;
        if (arg1.field5741 == 5 && ~arg1.field5763 != 0) {
            class108.method712(arg1, -14712, class512.field7538);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        ++field4706;
        if (arg2 != 0) {
            this.method929(42, false, -112);
        }
        int var4 = this.field4710 * arg1 >> 12;
        int var5 = this.field4705 * arg1 >> 12;
        int var6 = this.field4708 * arg0 >> 12;
        int var7 = this.field4711 * arg0 >> 12;
        class227.method1438(-84, super.field1792, var4, var6, var5, var7, super.field1787, super.field1786);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
    public static final void method2147(int arg0, int arg1) {
        ++field4712;
        class319.field4103 = arg0;
        if (arg1 != 1858731079) {
            field4709 = -73;
        }
        class382.field5036.method90((byte) -27);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB)V")
    public final void method927(int arg0, int arg1, byte arg2) {
        ++field4713;
        int var4 = 28 / ((-47 - arg2) / 33);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method2148(byte arg0) {
        if (arg0 != 106) {
            field4717 = null;
        }
        field4703 = null;
        field4717 = null;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIII)V")
    public class366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4708 = arg1;
        this.field4711 = arg3;
        this.field4705 = arg2;
        this.field4710 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZI)V")
    public final void method929(int arg0, boolean arg1, int arg2) {
        ++field4704;
        int var4 = this.field4710 * arg2 >> 12;
        int var5 = this.field4705 * arg2 >> 12;
        int var6 = this.field4708 * arg0 >> 12;
        int var7 = this.field4711 * arg0 >> 12;
        class408.method2422(super.field1787, var4, var6, var7, arg1, var5);
    }
}
