import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class316 {

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Lge;")
    public static class511 field4697 = new class511(200);

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Lge;")
    public static class511 field4701 = new class511(4);

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "Lqt;")
    public static class459 field4703 = new class459(46, -1);

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4704 = new String[8];

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "[Ltf;")
    public static class198[] field4702;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1996(int arg0, int arg1) {
        field4696++;
        if (arg0 != 4) {
            method1999(-125, 7, null, -84, -65, -96, -99);
        }
        class275 var2 = class213.method1433((byte) 85, 14, arg1);
        var2.method1774((byte) 97);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I", line = 18)
    public final int method1997(int arg0) {
        field4694++;
        if (arg0 != 0) {
            field4701 = null;
        }
        return this.field4695;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 30)
    public static void method1998(byte arg0) {
        field4701 = null;
        field4702 = null;
        if (arg0 != -61) {
            field4701 = null;
        }
        field4697 = null;
        field4703 = null;
        field4704 = null;
    }

    @OriginalMember(owner = "client!qv", name = "toString", descriptor = "()Ljava/lang/String;", line = 46)
    public final String toString() {
        field4698++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILuc;IIII)V", line = 54)
    public static final void method1999(int arg0, int arg1, class23 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4693++;
        class229.method1530(arg5, arg1 ^ 0x80, arg0, arg1, arg2.field6961, arg4, arg3, arg2.field6956, arg2.field6965, arg6);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V", line = 71)
    public class316(int arg0, int arg1) {
        this.field4699 = arg1;
        this.field4695 = arg0;
    }
}
