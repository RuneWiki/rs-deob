import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class81 extends class38 {

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private final int field1572;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private final int field1564;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    private final int field1574;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    private final int field1562;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    private final int field1576;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private final int field1566;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    private final int field1563;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    private final int field1567;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Ldj;")
    public static class44 field1569 = class89.method650(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field1578 = 0;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Ldj;")
    private static class44 field1575 = class89.method650(255, "K");

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Ldj;")
    public static class44 field1581 = field1575;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "[I")
    public static int[] field1582 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Ldj;")
    public static class44 field1565 = field1575;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lri;")
    public static class189 field1580 = new class189(64);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Ldj;")
    public static class44 field1584 = class89.method650(255, "Stufe)2");

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Ldj;")
    private static class44 field1585 = class89.method650(255, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Ldj;")
    public static class44 field1583 = field1585;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lnf;")
    public static class147 field1571;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1585 = null;
        field1584 = null;
        field1571 = null;
        field1581 = null;
        field1582 = null;
        field1569 = null;
        if (arg0 >= -21) {
            method613((class44) null, (class44) null, (class225) null, -93);
        }
        field1583 = null;
        field1575 = null;
        field1580 = null;
        field1565 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1572 = arg7;
        this.field1564 = arg1;
        this.field1574 = arg4;
        this.field1562 = arg0;
        this.field1576 = arg2;
        this.field1566 = arg5;
        this.field1563 = arg6;
        this.field1567 = arg3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ldj;Ldj;Lve;I)[Lle;")
    public static final class125[] method613(class44 arg0, class44 arg1, class225 arg2, int arg3) {
        if (arg3 != 391935500) {
            return null;
        } else {
            ++field1570;
            int var4 = arg2.method1463(arg1, -96);
            int var5 = arg2.method1461(var4, arg0, 0);
            return class54.method390(-126, var4, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        ++field1579;
        int var4 = this.field1562 * arg1 >> 12;
        int var5 = -88 % ((-45 - arg0) / 39);
        int var6 = this.field1576 * arg1 >> 12;
        int var7 = this.field1567 * arg2 >> 12;
        int var8 = this.field1564 * arg2 >> 12;
        int var9 = this.field1574 * arg1 >> 12;
        int var10 = this.field1566 * arg2 >> 12;
        int var11 = this.field1563 * arg1 >> 12;
        int var12 = this.field1572 * arg2 >> 12;
        class203.method1311(var4, var8, (byte) 77, super.field669, var12, var10, var6, var7, var9, var11);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZ)V")
    public final void method261(int arg0, int arg1, boolean arg2) {
        ++field1577;
        if (arg2) {
            field1580 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
    public final void method260(byte arg0, int arg1, int arg2) {
        if (arg0 != -69) {
            field1580 = null;
        }
        ++field1573;
    }
}
