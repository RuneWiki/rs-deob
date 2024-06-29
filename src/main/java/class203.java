import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class203 extends class242 {

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Ldf;")
    public static class51 field3398 = class46.method233("(U1", 100);

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Ldf;")
    public static class51 field3395 = class46.method233("m", 100);

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[J")
    public static long[] field3396 = new long[100];

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
    public static int[] field3400 = new int[128];

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[[S")
    public static short[][] field3399;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBILu;)[Lcg;")
    public static final class156[] method1410(int arg0, byte arg1, int arg2, class111 arg3) {
        field3401++;
        if (arg1 != -35) {
            method1411(-78);
        }
        return class69.method480(arg0, 57, arg2, arg3) ? class66.method456(0) : null;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3395 = null;
        if (arg0 == 32172) {
            field3396 = null;
            field3400 = null;
            field3399 = null;
            field3398 = null;
        }
    }
}
