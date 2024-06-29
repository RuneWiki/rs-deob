import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class218 extends class15 {

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Lvl;")
    public class407 field3063;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lcp;")
    public static class432 field3062 = new class432();

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lpn;")
    public static class72 field3065 = new class72(66, 7);

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lpn;")
    public static class72 field3066 = new class72(11, 8);

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
    public static int[] field3068 = new int[14];

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field3069 = -1;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "[I")
    public static int[] field3072 = new int[13];

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Lco;")
    public static class210 field3070 = new class210(200);

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "Lco;")
    public static class210 field3073 = new class210(4);

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1221(int arg0);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1222(boolean arg0);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI[B)I")
    public static final int method1223(byte arg0, int arg1, byte[] arg2) {
        field3061++;
        int var3 = 81 / ((arg0 + 5) / 35);
        return class233.method1287(arg1, 0, (byte) -13, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3070 = null;
        field3073 = null;
        if (arg0 != -1) {
            return;
        }
        field3065 = null;
        field3068 = null;
        field3062 = null;
        field3072 = null;
        field3066 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static final void method1225() {
        class182.method988(1, class346.field4937);
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lvl;I)V")
    public class218(class407 arg0, int arg1) {
        this.field3063 = arg0;
        this.field3060 = arg1;
    }
}
