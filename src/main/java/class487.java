import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class487 {

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[F")
    public static float[] field6894 = new float[4];

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
    public static int[] field6893 = new int[13];

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "[[[S")
    public static short[][][] field6892;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)I")
    public static final int method2924(boolean arg0) {
        if (!arg0) {
            field6894 = null;
        }
        field6895++;
        int var1 = class372.field5224.method2440(-30381);
        if ((class555.field7777.length - 1) > var1) {
            class372.field5224 = class555.field7777[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public static void method2925(int arg0) {
        field6893 = null;
        field6894 = null;
        field6892 = null;
        int var1 = -104 % ((arg0 + 33) / 49);
    }
}
