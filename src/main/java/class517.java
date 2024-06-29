import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class517 implements class104 {

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lffa;")
    public class562 field6766;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
    public boolean field6764;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public int field6773;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Loca;")
    public class573 field6771;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field6768 = 0;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Lpe;")
    public static class615 field6774;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2782(boolean arg0) {
        if (arg0) {
            method2782(false);
        }
        field6774 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lpe;I)V", line = 18)
    public static final void method2783(class615 arg0, int arg1) {
        class389.field4986 = arg0;
        field6769++;
        if (arg1 != 29577) {
            method2782(false);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(ILffa;Loca;IIIIIIIZ)V", line = 42)
    public class517(int arg0, class562 arg1, class573 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field6770 = arg8;
        this.field6766 = arg1;
        this.field6764 = arg10;
        this.field6773 = arg3;
        this.field6760 = arg9;
        this.field6765 = arg4;
        this.field6771 = arg2;
        this.field6762 = arg5;
        this.field6772 = arg0;
        this.field6761 = arg6;
        this.field6763 = arg7;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Lfl;", line = 63)
    public final class103 method318(int arg0) {
        field6767++;
        if (arg0 != -26207) {
            this.method318(-82);
        }
        return class213.field2745;
    }
}
