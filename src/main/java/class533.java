import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class533 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
    public static int[] field7895 = new int[2048];

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[F")
    public static float[] field7894 = new float[4];

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lwca;")
    public static class311 field7896 = null;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Z")
    public static boolean field7897 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7892 = 0;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3134(int arg0, int arg1, boolean arg2) {
        field7893++;
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method1259(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public abstract void method1257(byte arg0);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public abstract void method1262(byte arg0);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lnt;")
    public abstract class454 method1258(int arg0);

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
    public static void method3135(byte arg0) {
        field7896 = null;
        field7894 = null;
        int var1 = -48 % ((55 - arg0) / 38);
        field7895 = null;
    }
}
