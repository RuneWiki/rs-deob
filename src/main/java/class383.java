import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class383 extends class516 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field5268 = -1;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field5267 = -1;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lada;")
    public static class144 field5272;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[[[B")
    public static byte[][][] field5270;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BZ)V")
    public final void method199(byte arg0, boolean arg1) {
        ++field5278;
        int var3 = 79 / ((arg0 - 63) / 38);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public final void method197(boolean arg0) {
        ++field5276;
        if (arg0) {
            field5272 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lcb;)V")
    public class383(class444 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZ)V")
    public final void method195(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field5266;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
    public static final void method2283(int arg0, boolean arg1) {
        class408.field5577 = arg0;
        if (arg1) {
            method2284(56);
        }
        ++field5271;
        class496.field7054.method837(127);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpb;II)V")
    public final void method202(class563 arg0, int arg1, int arg2) {
        ++field5277;
        super.field7353.method2632(arg0, arg2 ^ arg2);
        super.field7353.method2698(arg1, 1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public final void method200(int arg0, int arg1, int arg2) {
        ++field5273;
        int var4 = -38 / ((-41 - arg0) / 57);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method2284(int arg0) {
        field5272 = null;
        field5270 = null;
        if (arg0 != 30641) {
            method2283(33, true);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IFFF)F")
    public static final float method2285(int arg0, float arg1, float arg2, float arg3) {
        ++field5275;
        if (arg0 != 19171) {
            field5270 = null;
        }
        return (arg1 - arg3) * arg2 + arg3;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Z")
    public final boolean method201(byte arg0) {
        if (arg0 >= -60) {
            method2284(-30);
        }
        ++field5269;
        return false;
    }
}
