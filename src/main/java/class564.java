import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class564 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public int field8028 = 1;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lof;")
    public static class620 field8030 = new class620(64);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Llo;")
    public static class751 field8032 = new class751(0, -1);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "C")
    public char field8029;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[Lsq;", line = 3)
    public static final class178[] method3283(int arg0) {
        field8035++;
        int var1 = -52 % ((-arg0 - 15) / 43);
        return new class178[] { class310.field3854, class578.field8192, class625.field8985, class538.field7771, class120.field1248, class445.field6450, class186.field2218, class655.field9347, class463.field6615, class563.field8023, class408.field5586, class173.field2037, class518.field7363, class104.field1085 };
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILig;)V", line = 26)
    public final void method3284(int arg0, class244 arg1) {
        if (arg0 != 0) {
            return;
        }
        field8031++;
        while (true) {
            int var3 = arg1.method1423(-47);
            if (var3 == 0) {
                return;
            }
            this.method3286(arg0 - 30, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 55)
    public static void method3285(byte arg0) {
        field8030 = null;
        field8032 = null;
        if (arg0 != -1) {
            method3283(-48);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILig;)V", line = 69)
    private final void method3286(int arg0, int arg1, class244 arg2) {
        if (arg0 > -6) {
            field8030 = null;
        }
        field8034++;
        if (arg1 == 1) {
            this.field8029 = class169.method1054(arg2.method1448((byte) -82), -161);
        } else if (arg1 == 2) {
            this.field8028 = 0;
        }
    }
}
