import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class318 extends class379 {

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Z")
    public boolean field3912;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "Lfa;")
    public class248 field3917;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Lsi;")
    public static class586 field3914 = new class586();

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lqda;")
    public static class113 field3919 = new class113(64);

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
    public static int[] field3920 = new int[13];

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Lbt;")
    public static class48 field3910;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Z")
    public boolean field3907;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
    public boolean field3911;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "Z")
    public boolean field3913;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "[Ltf;")
    public static class312[] field3916;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 5)
    public static void method1872(int arg0) {
        field3919 = null;
        field3914 = null;
        field3910 = null;
        field3920 = null;
        if (arg0 == -1) {
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V", line = 22)
    public static final void method1873(String arg0, String arg1, byte arg2, String arg3, String arg4, int arg5, int arg6) {
        field3908++;
        class215.method1345(arg3, arg5, arg4, null, arg0, (byte) 116, arg1, -1, arg6);
        if (arg2 <= 2) {
            method1872(-62);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILfa;IZ)V", line = 44)
    public class318(int arg0, class248 arg1, int arg2, boolean arg3) {
        this.field3909 = arg2;
        this.field3912 = arg3;
        this.field3915 = arg0;
        this.field3917 = arg1;
    }
}
