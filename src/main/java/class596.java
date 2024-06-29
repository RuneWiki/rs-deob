import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class596 {

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public int field8703;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    private int field8701;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "Lvt;")
    private class256 field8704;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public int field8700;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "Ljca;")
    public static class596 field8705 = new class596(0, 3, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "Ljca;")
    public static class596 field8706 = new class596(1, 3, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "Ljca;")
    public static class596 field8707 = new class596(2, 4, class256.field3653);

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "Ljca;")
    public static class596 field8708 = new class596(3, 1, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Ljca;")
    public static class596 field8709 = new class596(4, 2, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "Ljca;")
    public static class596 field8710 = new class596(5, 3, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Ljca;")
    private static class596 field8711 = new class596(6, 4, class256.field3657);

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public static int field8712 = class112.method688((byte) -127, 16);

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "Lig;")
    public static class206 field8713 = new class206(4, 8);

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "Lig;")
    public static class206 field8714 = new class206(85, 8);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)[Ljca;", line = 7)
    public static final class596[] method3474(byte arg0) {
        field8702++;
        if (arg0 >= -101) {
            method3475(null, -59, -4, 83, 87, null);
        }
        return new class596[] { field8705, field8706, field8707, field8708, field8709, field8710, field8711 };
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Loa;IIIILqd;)V", line = 21)
    public static final void method3475(class605 arg0, int arg1, int arg2, int arg3, int arg4, class385 arg5) {
        field8698++;
        class565 var6 = class601.field8769.method108((byte) -3, arg5.field5850);
        if (var6.field8048 == -1) {
            return;
        }
        int var7;
        if (arg5.field5813) {
            int var8 = arg5.field5851 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class433 var9 = var6.method3271(arg5.field5878, arg0, var7, arg3 - 18160);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field5860;
        if (arg3 != 18160) {
            method3476(68);
        }
        int var11 = arg5.field5858;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field5858;
            var11 = arg5.field5860;
        }
        int var12 = var9.method1577();
        int var13 = var9.method1568();
        if (var6.field8052) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field8058 == 0) {
            var9.method2700(arg1, arg4 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method1582(arg1, arg4 - ((var11 - 1) * 4), var12, var13, 0, var6.field8058 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!jca", name = "toString", descriptor = "()Ljava/lang/String;", line = 76)
    public final String toString() {
        field8699++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 86)
    public static void method3476(int arg0) {
        field8714 = null;
        field8708 = null;
        field8713 = null;
        field8709 = null;
        field8706 = null;
        field8711 = null;
        if (arg0 < 28) {
            field8707 = null;
        }
        field8705 = null;
        field8707 = null;
        field8710 = null;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IILvt;)V", line = 109)
    private class596(int arg0, int arg1, class256 arg2) {
        this.field8703 = arg0;
        this.field8701 = arg1;
        this.field8704 = arg2;
        this.field8700 = this.field8704.field3652 * this.field8701;
        if (this.field8703 >= 16) {
            throw new RuntimeException();
        }
    }
}
