import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class252 extends class104 {

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "[B")
    public byte[] field3831;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3830 = "red:";

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field3835 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "[[[I")
    public static int[][][] field3836;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILlc;)V", line = 11)
    public static final void method1836(int arg0, class175 arg1) {
        if (arg0 != -11910) {
            method1837(-72, (short[]) null);
        }
        field3834++;
        class269.field4237 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[S)[S", line = 23)
    public static final short[] method1837(int arg0, short[] arg1) {
        field3832++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 >= -66) {
            field3836 = (int[][][]) ((int[][][]) null);
        }
        short[] var2 = new short[arg1.length];
        class86.method506(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V", line = 41)
    public static void method1838(int arg0) {
        field3830 = null;
        int var1 = -25 / ((9 - arg0) / 43);
        field3836 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([B)V", line = 52)
    public class252(byte[] arg0) {
        this.field3831 = arg0;
    }
}
