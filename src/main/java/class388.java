import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class388 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field5748;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    public int[] field5749;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public int[] field5750;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field5752 = 1;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Llh;")
    public static class364 field5751 = new class364(64);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[S")
    public static short[] field5754 = new short[256];

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 3)
    public static void method2438(byte arg0) {
        field5751 = null;
        field5754 = null;
        if (arg0 <= 94) {
            field5751 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILhh;II)Llo;", line = 18)
    public static final class527 method2439(int arg0, class84 arg1, int arg2, int arg3) {
        field5753++;
        byte[] var4 = arg1.method683(arg0, arg2, arg3 - 2476);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 2481) {
                method2440(-10, 23);
            }
            return new class527(var4);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 38)
    public static final void method2440(int arg0, int arg1) {
        field5747++;
        class401.field5889 = arg1;
        if (arg0 > -61) {
            field5751 = null;
        }
        class465.field6835.method2349(0);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I", line = 50)
    public static int method2441(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V", line = 63)
    public class388(int arg0) {
        this.field5748 = arg0;
        this.field5749 = new int[this.field5748];
        this.field5750 = new int[this.field5748];
    }
}
