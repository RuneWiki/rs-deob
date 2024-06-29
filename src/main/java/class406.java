import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class406 extends class652 {

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field6065;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "F")
    public static float field6071;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "[[Z")
    public static boolean[][] field6066;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lmq;III)V", line = 6)
    public static final void method2498(class71 arg0, int arg1, int arg2, int arg3) {
        field6067++;
        int[] var4 = new int[4];
        class667.method3738(var4, 0, var4.length, arg1);
        class551.method3215((byte) 63, arg0, arg2, var4);
        if (arg3 != -7831) {
            method2498(null, -71, 10, -51);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lpe;Ljava/lang/Object;I)V", line = 20)
    public class406(class611 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6065 = arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLgk;)Liaa;", line = 28)
    public static final class100 method2499(byte arg0, class540 arg1) {
        if (arg0 > -112) {
            field6066 = null;
        }
        field6069++;
        class167 var2 = class577.method3321(255, arg1);
        int var3 = arg1.method3160(false);
        int var4 = arg1.method3160(false);
        return new class100(var2.field2330, var2.field2336, var2.field2334, var2.field2335, var2.field2337, var2.field2332, var2.field2338, var2.field2333, var2.field2329, var3, var4);
    }

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 50)
    public final Object method1254(int arg0) {
        if (arg0 != 0) {
            field6071 = 1.0029286F;
        }
        field6068++;
        return this.field6065;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 62)
    public static void method2500(byte arg0) {
        field6066 = null;
        if (arg0 != 4) {
            method2500((byte) 33);
        }
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)Z", line = 72)
    public final boolean method1255(int arg0) {
        if (arg0 != -7017) {
            method2498(null, -13, -120, 127);
        }
        field6070++;
        return false;
    }
}
