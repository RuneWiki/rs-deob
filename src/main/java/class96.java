import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class96 extends class248 {

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private final int field1583;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    private final int field1596;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    private final int field1584;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private final int field1585;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
    public static int[] field1588 = new int[200];

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field1581 = 0;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Ldf;")
    private static class51 field1593 = class46.method233("Ok", 100);

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Ldf;")
    public static class51 field1589 = field1593;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lja;")
    public static class55 field1592;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
    public static int[] field1591;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static final void method714(int arg0) {
        class42.field674.method1353(-94);
        ++field1594;
        class146.field2437.method1353(-109);
        if (arg0 == 13302) {
            class70.field1124.method1353(arg0 ^ -13225);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        int var4 = 71 / ((20 - arg1) / 59);
        ++field1582;
        int var5 = this.field1585 * arg2 >> 12;
        int var6 = this.field1596 * arg2 >> 12;
        int var7 = this.field1583 * arg0 >> 12;
        int var8 = this.field1584 * arg0 >> 12;
        class43.method219(var6, var7, (byte) -79, var8, super.field4365, var5, super.field4372);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILu;Lu;)I")
    public static final int method715(int arg0, class111 arg1, class111 arg2) {
        ++field1590;
        int var3 = 0;
        if (arg1.method827(class100.field1658, -94)) {
            ++var3;
        }
        if (arg1.method827(class40.field618, -91)) {
            ++var3;
        }
        if (arg1.method827(class249.field4379, arg0 + -1639430300)) {
            ++var3;
        }
        if (arg2.method827(class100.field1658, arg0 + -1639430278)) {
            ++var3;
        }
        if (arg2.method827(class40.field618, -120)) {
            ++var3;
        }
        if (arg2.method827(class249.field4379, -113)) {
            ++var3;
        }
        if (arg0 != 1639430188) {
            field1592 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V")
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1583 = arg1;
        this.field1596 = arg0;
        this.field1584 = arg3;
        this.field1585 = arg2;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method716(int arg0) {
        field1589 = null;
        field1591 = null;
        if (arg0 != -1869054132) {
            field1592 = null;
        }
        field1593 = null;
        field1592 = null;
        field1588 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V")
    public final void method153(int arg0, byte arg1, int arg2) {
        ++field1580;
        int var4 = this.field1596 * arg2 >> 12;
        int var5 = this.field1585 * arg2 >> 12;
        int var6 = this.field1584 * arg0 >> 12;
        if (arg1 == 98) {
            int var7 = this.field1583 * arg0 >> 12;
            class92.method696(super.field4368, var7, arg1 ^ 15, var6, var4, var5);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        ++field1595;
        int var4 = this.field1596 * arg1 >> 12;
        int var5 = -89 % ((arg2 - 66) / 40);
        int var6 = this.field1583 * arg0 >> 12;
        int var7 = this.field1585 * arg1 >> 12;
        int var8 = this.field1584 * arg0 >> 12;
        class97.method722(super.field4372, var4, super.field4368, super.field4365, var7, (byte) -58, var6, var8);
    }
}
