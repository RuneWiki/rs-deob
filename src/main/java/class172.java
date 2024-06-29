import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class172 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lc;")
    public static class125 field3037 = new class125();

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lr;")
    public static class66 field3044 = class93.method641(43, ")1 ");

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field3042 = 50;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public static int[] field3043;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lbb;")
    public static final class1 method1167(byte arg0, int arg1) {
        field3041++;
        class1 var2 = (class1) class132.field2460.method1617(14366, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 53) {
            field3037 = null;
        }
        byte[] var3 = class88.field1715.method135(arg1, 0, 4);
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method1((byte) -64, new class249(var3), arg1);
        }
        class132.field2460.method1615(var4, arg0 + 69, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
    public static final boolean method1168(int arg0, int arg1) {
        if (arg0 != 122) {
            field3037 = null;
        }
        field3039++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Llh;")
    public static final class249 method1169(int arg0) {
        field3038++;
        if (arg0 != 0) {
            return null;
        }
        class249 var1 = new class249(24);
        var1.method1638(32, 3);
        var1.method1638(32, class63.field1242);
        var1.method1638(32, class76.field1514 ? 1 : 0);
        var1.method1638(32, class198.field3421 ? 1 : 0);
        var1.method1638(32, class64.field1265 ? 1 : 0);
        var1.method1638(arg0 + 32, class7.field61 ? 1 : 0);
        var1.method1638(32, class66.field1277 ? 1 : 0);
        var1.method1638(32, class205.field3512 ? 1 : 0);
        var1.method1638(arg0 + 32, class15.field200 ? 1 : 0);
        var1.method1638(arg0 ^ 0x20, class212.field3647 ? 1 : 0);
        var1.method1638(arg0 + 32, class124.field2334);
        var1.method1638(32, class43.field760 ? 1 : 0);
        var1.method1638(32, class33.field492 ? 1 : 0);
        var1.method1638(arg0 ^ 0x20, class155.field2764 ? 1 : 0);
        var1.method1638(32, class44.field782);
        var1.method1638(arg0 ^ 0x20, class250.field4401 ? 1 : 0);
        var1.method1638(32, class61.field1030);
        var1.method1638(32, class164.field2936);
        var1.method1638(32, class54.field944);
        var1.method1650(false, class131.field2438);
        var1.method1650(false, class51.field901);
        var1.method1638(32, class176.field3095 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field3044 = null;
        int var1 = -64 % ((33 - arg0) / 51);
        field3043 = null;
        field3037 = null;
    }
}
