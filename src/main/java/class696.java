import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class696 {

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public int field9879;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    public static int[] field9877 = new int[25];

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lvh;")
    public static class125 field9876 = new class125(51, 12);

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lhp;")
    public static class329 field9881 = new class329();

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field9882 = 0;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lvh;")
    public static class125 field9883 = new class125(50, 3);

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Ljn;")
    public static class117 field9884 = new class117(4);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)V")
    public static final void method3918(int arg0, byte arg1) {
        field9875++;
        if (class569.field8314 == arg0) {
            return;
        }
        int var2 = -40 / ((-arg1 - 34) / 53);
        class430.field6136 = class580.field8504 = class75.field1180[arg0];
        class47.method370(0);
        class366.field5086 = new int[class430.field6136][class580.field8504];
        class184.field2920 = new int[4][class430.field6136 >> 3][class580.field8504 >> 3];
        class256.field3692 = new int[class430.field6136][class580.field8504];
        for (int var3 = 0; var3 < 4; var3++) {
            class45.field609[var3] = class128.method1010(class430.field6136, 1, class580.field8504);
        }
        class468.field6756 = new byte[4][class430.field6136][class580.field8504];
        class678.method3833((byte) 13, class580.field8504, class430.field6136, 4);
        class611.method3464(class580.field8504 >> 3, class430.field6136 >> 3, class637.field9048, true);
        class569.field8314 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLek;)Lpga;")
    public static final class153 method3919(byte arg0, class465 arg1) {
        if (arg0 <= 16) {
            field9882 = -53;
        }
        field9878++;
        int var2 = arg1.method2691((byte) -67);
        return new class153(var2);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method3920(byte arg0) {
        field9876 = null;
        int var1 = 77 / ((-arg0 - 22) / 60);
        field9877 = null;
        field9884 = null;
        field9883 = null;
        field9881 = null;
    }

    @OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9880++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(II)V")
    public class696(int arg0, int arg1) {
        this.field9879 = arg1;
    }
}
