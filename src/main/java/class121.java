import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class121 extends class59 {

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field2035 = 128;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lph;")
    public static class229 field2039 = class266.method1858(",Mcran)2titre charg-B", 0);

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Ldg;")
    public static class6 field2033 = new class6(5000);

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "Lsi;")
    public static class66 field2040;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Lec;")
    public static class67 field2031;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V", line = 4)
    public static void method901(int arg0) {
        field2039 = null;
        field2040 = null;
        field2033 = null;
        field2031 = null;
        if (arg0 < 97) {
            field2040 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[I", line = 23)
    public final int[] method63(boolean arg0, int arg1) {
        field2037++;
        if (!arg0) {
            field2035 = -81;
        }
        return class219.field3608;
    }

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)V", line = 38)
    public static final void method902(int arg0) {
        field2032++;
        class154.method1116(arg0 - 8128, false);
        System.gc();
        if (arg0 == 8127) {
            class80.method595(25, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 51)
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)I", line = 55)
    public static final int method903(byte arg0) {
        field2034++;
        return arg0 <= 41 ? 110 : class119.field1998;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lph;", line = 77)
    public static final class229 method904(int arg0, int arg1) {
        field2036++;
        if (arg1 != 30487) {
            field2035 = -8;
        }
        class229 var2 = new class229();
        var2.field3785 = 0;
        var2.field3772 = new byte[arg0];
        return var2;
    }
}
