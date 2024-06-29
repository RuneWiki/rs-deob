import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class264 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lnc;")
    public static class89 field4127 = new class89(64);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4131 = "Loaded fonts";

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Lib;")
    public static class267[] field4133 = new class267[6];

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lrd;")
    public static class196 field4132;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[[[B")
    public static byte[][][] field4130;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()Z")
    public boolean method1494() {
        field4129++;
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()I")
    public abstract int method19();

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbg;IIIZ)V")
    public void method1492(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4126++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public abstract void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lbg;")
    public class264 method1475(int arg0, int arg1, int arg2) {
        field4135++;
        return this;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4127 = null;
        field4130 = null;
        field4133 = null;
        field4131 = null;
        field4132 = null;
        if (arg0 != 6) {
            field4134 = -87;
        }
    }
}
