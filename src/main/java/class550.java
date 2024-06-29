import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class550 {

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lgg;")
    private class114 field7743 = new class114(64);

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "Lkha;")
    private class687 field7745;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "[I")
    public static int[] field7739;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method3132(byte arg0, int arg1) {
        field7744++;
        class548 var2 = class696.method3872(arg1, 11, arg0 - 1633382023);
        if (arg0 != 79) {
            method3133(58);
        }
        var2.method3127((byte) 123);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Z", line = 23)
    public static final boolean method3133(int arg0) {
        field7742++;
        if (arg0 < 99) {
            return true;
        } else {
            return class668.field9150 >= 1;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lbu;", line = 41)
    public final class568 method3134(int arg0, int arg1) {
        field7741++;
        class114 var3 = this.field7743;
        class568 var4;
        synchronized (this.field7743) {
            var4 = (class568) this.field7743.method778((long) arg1, 78);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field7745;
        byte[] var6;
        synchronized (this.field7745) {
            var6 = this.field7745.method3810(arg0, -23360, arg1);
        }
        class568 var7 = new class568();
        if (var6 != null) {
            var7.method3197(false, new class179(var6));
        }
        class114 var8 = this.field7743;
        synchronized (this.field7743) {
            this.field7743.method774((long) arg1, -65, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 72)
    public static void method3135(int arg0) {
        if (arg0 == 5) {
            field7739 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 84)
    public class550(class286 arg0, int arg1, class687 arg2) {
        this.field7745 = arg2;
        this.field7745.method3812(0, 5);
    }
}
