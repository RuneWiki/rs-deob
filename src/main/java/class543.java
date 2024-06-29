import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class543 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "Lda;")
    public static class423 field7644;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method3088(byte arg0) {
        field7642++;
        if (arg0 >= -2) {
            return true;
        } else {
            return this.method2338((byte) 92) || this.method2334(0) || this.method2330(0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V", line = 26)
    public static void method3089(int arg0) {
        if (arg0 > -13) {
            field7644 = null;
        }
        field7644 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Lhd;", line = 39)
    public static final class332 method3090(int arg0, int arg1) {
        field7645++;
        class332 var2 = (class332) class71.field954.method778((long) arg1, arg0 - 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field2699.method3810(arg0, -23360, arg1);
        class332 var4 = new class332();
        if (var3 != null) {
            var4.method1953(97, new class179(var3));
        }
        var4.method1951(9916);
        class71.field954.method774((long) arg1, arg0 ^ 0xFFFFFFD3, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
    public abstract void method2331(byte arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Z")
    public abstract boolean method2330(int arg0);

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)V")
    public abstract void method2328(byte arg0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)Luk;")
    public abstract class283 method2333(boolean arg0);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)I")
    public abstract int method2336(byte arg0);

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I")
    public abstract int method2337(int arg0);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)Z")
    public abstract boolean method2334(int arg0);

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)Z")
    public abstract boolean method2338(byte arg0);
}
