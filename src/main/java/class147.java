import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class147 extends class411 {

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public static int field1895 = 1406;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "F")
    public static float field1896;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "Leaa;")
    public static class501 field1893;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "[Llba;")
    public static class550[] field1892;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIBZ)V")
    public final void method907(int arg0, int arg1, byte arg2, boolean arg3) {
        class21.field142.method391(arg1 + -2, arg0, super.field5796.field2415 - -4, super.field5796.field2402 - -2, ((class288) super.field5796).field3830, 0);
        ++field1897;
        if (arg2 != -36) {
            method908(-49, -39, 108);
        }
        class21.field142.method391(arg1 + -1, arg0 + 1, super.field5796.field2415 + 2, super.field5796.field2402, 0, 0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
    public static final boolean method908(int arg0, int arg1, int arg2) {
        int var3 = -120 % ((20 - arg2) / 50);
        ++field1894;
        return ~(33 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)V")
    public static void method909(byte arg0) {
        int var1 = -37 / ((arg0 - 56) / 61);
        field1893 = null;
        field1892 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIZ)V")
    public final void method910(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1899;
        int var5 = this.method2366(100) * super.field5796.field2415 / 10000;
        class21.field142.method447(arg2, arg1 + 2, var5, super.field5796.field2402 + -2, ((class288) super.field5796).field3831, 0);
        class21.field142.method447(arg2 + var5, arg0 + arg1, -var5 + super.field5796.field2415, super.field5796.field2402 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lni;Lni;Luu;)V")
    public class147(class522 arg0, class522 arg1, class288 arg2) {
        super(arg0, arg1, arg2);
    }
}
