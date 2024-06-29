import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class269 implements class235 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Luf;")
    public static class168 field4534 = class148.method1019(-1720, "::fpsoff");

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Luf;")
    public static class168 field4535 = class148.method1019(-1720, "(U3");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lfj;")
    public static class283 field4533;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 5)
    public static void method1869(byte arg0) {
        field4534 = null;
        if (arg0 != -114) {
            field4534 = (class168) null;
        }
        field4535 = null;
        field4533 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[IJ)Luf;", line = 36)
    public final class168 method1589(int arg0, int arg1, int[] arg2, long arg3) {
        field4532++;
        if (arg1 == 0) {
            class187 var7 = class116.method842(-1153, arg2[0]);
            return var7.method1322((int) arg3, arg0 ^ 0xFFFFBB8A);
        } else if (arg0 != -17525) {
            return (class168) null;
        } else if (arg1 == 1 || arg1 == 10) {
            class238 var6 = class284.method1963((byte) 100, (int) arg3);
            return var6.field3833;
        } else if (arg1 == 6 || arg1 == 7) {
            return class116.method842(-1153, arg2[0]).method1322((int) arg3, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 69)
    public static final void method1870(int arg0, int arg1) {
        if (arg1 == -19800) {
            class103.field1604.method1428(arg0, arg1 ^ 0xFFFFC652);
            field4536++;
        }
    }
}
