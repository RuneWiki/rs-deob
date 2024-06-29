import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class87 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "[I")
    public static int[] field988 = new int[1];

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "Z")
    public static boolean field992 = true;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "Z")
    public static boolean field989;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 10)
    public static void method556(int arg0) {
        if (arg0 != 0) {
            method557(null, 43, false);
        }
        field988 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([SIZ)[S", line = 22)
    public static final short[] method557(short[] arg0, int arg1, boolean arg2) {
        field991++;
        short[] var3 = new short[arg1];
        class210.method1329(arg0, 0, var3, 0, arg1);
        return arg2 ? var3 : null;
    }

    @OriginalMember(owner = "client!qda", name = "toString", descriptor = "()Ljava/lang/String;", line = 46)
    public final String toString() {
        field990++;
        throw new IllegalStateException();
    }
}
