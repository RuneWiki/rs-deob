import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class200 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3060 = 1;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3058 = "cyan:";

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    public static int[] field3068 = new int[50];

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
    public static int[] field3069 = new int[128];

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3071 = "Prepared sound engine";

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lpk;")
    public static class120 field3062;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1407(int arg0, int arg1) {
        if (arg1 == 32724) {
            field3061++;
            return arg0 & 0x3FF;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 35)
    public static void method1408(int arg0) {
        field3062 = null;
        field3071 = null;
        int var1 = -112 / ((arg0 - 54) / 58);
        field3069 = null;
        field3058 = null;
        field3068 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
    public abstract void method990(int arg0, int arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public abstract void method988(int arg0, int arg1, int arg2);
}
