import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class141 {

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "Leba;")
    public static class550 field1912 = new class550(103, 8);

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1913 = new BigInteger("bc8064591cade7cc46a5ffce292917f52fbad6b9acc065ce0efae88f3dfc44e26559ec582911f2b3e020ae3d56d87370aa0cd1357dcbbccab1a6339ab121ed6f", 16);

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field1916 = 0;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "[Loea;")
    public static class628[] field1915;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field1912 = null;
        field1915 = null;
        field1913 = null;
        int var1 = -24 / ((arg0 + 81) / 37);
    }

    @OriginalMember(owner = "client!tca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1917++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILhk;Lhk;)V")
    public static final void method794(int arg0, int arg1, int arg2, class363 arg3, class363 arg4) {
        class207 var5 = class549.method3077(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2763 = arg3;
        var5.field2764 = arg4;
        int var6 = class446.field5914 == class246.field3214 ? 1 : 0;
        if (!arg3.method161(28602)) {
            class100.field1206[var6][class189.field2627[var6]++] = arg3;
        } else if (arg3.method168(20071)) {
            class648.field8957[var6][class629.field8709[var6]++] = arg3;
        } else {
            class150.field2058[var6][class57.field730[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method161(28602)) {
            if (arg4.method168(20071)) {
                class648.field8957[var6][class629.field8709[var6]++] = arg4;
                return;
            }
            class150.field2058[var6][class57.field730[var6]++] = arg4;
            return;
        }
        class100.field1206[var6][class189.field2627[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lio;B)Lfo;")
    public static final class22 method795(class157 arg0, byte arg1) {
        if (arg1 > -125) {
            field1915 = null;
        }
        field1911++;
        return new class22(arg0.method928(2016790224), arg0.method928(2016790224), arg0.method928(2016790224), arg0.method928(2016790224), arg0.method933((byte) 1), arg0.method933((byte) 1), arg0.method930(255));
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(II)V")
    public class141(int arg0, int arg1) {
        this.field1914 = arg1;
    }
}
