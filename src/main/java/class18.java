import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
    public static boolean field376 = true;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lrd;")
    private static class173 field379 = class133.method843("Take", 109);

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
    public static int[] field380 = new int[25];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lrd;")
    public static class173 field373 = field379;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILbc;B)Z")
    public static final boolean method155(int arg0, int arg1, class14 arg2, byte arg3) {
        field377++;
        byte[] var4 = arg2.method142(arg0, arg1, (byte) 2);
        int var5 = 14 / ((-arg3 - 18) / 39);
        if (var4 == null) {
            return false;
        } else {
            class78.method477((byte) 125, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method156(int arg0) {
        field379 = null;
        field373 = null;
        if (arg0 >= 124) {
            field380 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
    public static final int method157(int arg0, int arg1) {
        int var2 = 109 / ((arg0 + 1) / 59);
        field374++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method158(byte arg0) {
        class190.field3711.method53(-51);
        field375++;
        if (arg0 != 61) {
            method157(-97, -40);
        }
    }
}
