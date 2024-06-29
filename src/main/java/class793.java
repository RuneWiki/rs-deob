import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class793 extends class260 {

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field10896;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field10897;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field10898;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field10899;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field10900;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field10901;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field10902;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (~super.field3828 != -2 && super.field3828 != 0) {
            super.field3828 = this.method123(4377);
        }
        ++field10901;
        if (arg0 < 102) {
            this.method128(11, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        ++field10896;
        super.field3828 = arg0;
        if (arg1 != 122) {
            this.method123(-38);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static final void method4365(byte arg0) {
        for (class513 var1 = (class513) class488.field6903.method1731((byte) -116); var1 != null; var1 = (class513) class488.field6903.method1724(0)) {
            if (var1.field7241) {
                var1.method3095(116);
            }
        }
        ++field10899;
        class513 var2 = (class513) class376.field5192.method1731((byte) -111);
        if (arg0 != -33) {
            method4365((byte) 39);
        }
        while (var2 != null) {
            if (var2.field7241) {
                var2.method3095(87);
            }
            var2 = (class513) class376.field5192.method1724(arg0 + 33);
        }
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)I")
    public final int method4366(int arg0) {
        ++field10897;
        return arg0 >= -14 ? 34 : super.field3828;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method123(62);
        }
        ++field10898;
        return 1;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            field10902 = 67;
        }
        ++field10900;
        return 1;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(ILgn;)V")
    public class793(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lgn;)V")
    public class793(class729 arg0) {
        super(arg0);
    }
}
