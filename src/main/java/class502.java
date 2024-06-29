import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class502 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lck;")
    private class221 field7066;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field7068 = 0;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public static int[] field7067 = new int[32];

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field7073 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 5)
    public static void method2896(byte arg0) {
        field7067 = null;
        if (arg0 != -47) {
            method2896((byte) -110);
        }
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        this.field7066.method1420((byte) -124, this.field7072);
        field7070++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 25)
    public static final void method2897(String arg0, int arg1) {
        field7069++;
        if (class760.field10595 == null) {
            return;
        }
        class166.field2121++;
        class650 var2 = class314.method1837(class425.field6050, true, class625.field8727);
        var2.field8928.method1141(class663.method3588(arg1, arg0), arg1 + 70);
        var2.field8928.method1110(arg0, -30452);
        class108.method745(var2, -64);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lck;II)V", line = 58)
    public class502(class221 arg0, int arg1, int arg2) {
        this.field7066 = arg0;
        this.field7072 = arg2;
    }
}
