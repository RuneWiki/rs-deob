import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class111 extends class22 {

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
    public static boolean field1587 = false;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field1593 = 2;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Lbh;")
    public static class538 field1592 = new class538(5);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "[[B")
    public static byte[][] field1590;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILka;IIILgp;)V")
    public static final void method747(int arg0, class283 arg1, int arg2, int arg3, int arg4, class551 arg5) {
        field1589++;
        if (arg1 != null) {
            arg5.method3290(arg1.method1128(), arg1.method1169(), arg4, arg1.method1120(), arg1.method1114(), arg2, arg3, arg1.method1126(), arg1.method1132(), true, arg1.method1136());
            if (arg0 != 34165) {
                field1593 = -46;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Lrh;")
    public abstract class633 method748(int arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1590 = null;
        field1592 = null;
        if (arg0 != 5) {
            method749(93);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLhd;)I")
    public static final int method750(byte arg0, class595 arg1) {
        field1591++;
        if (arg0 <= 15) {
            field1593 = -28;
        }
        if (class253.field3501 == arg1) {
            return 7681;
        } else if (class369.field4717 == arg1) {
            return 8448;
        } else if (class438.field6017 == arg1) {
            return 34165;
        } else if (class35.field498 == arg1) {
            return 260;
        } else if (class130.field1767 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
