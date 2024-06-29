import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class229 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4074 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lug;")
    public static class179 field4077 = new class179(5000);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lqj;")
    private static class196 field4078 = class80.method502("Loading interfaces )2 ", -48);

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lqj;")
    public static class196 field4083 = field4078;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lqj;")
    public static class196 field4082 = class80.method502("Weiter", -48);

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field4080 = 0;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[Z")
    public static boolean[] field4081 = new boolean[8];

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[Leb;")
    public static class200[] field4085 = new class200[5000];

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[S")
    public static short[] field4084 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field4079;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1540(int arg0) {
        field4084 = null;
        field4081 = null;
        field4077 = null;
        field4083 = null;
        field4085 = null;
        if (arg0 != 957) {
            field4084 = null;
        }
        field4079 = null;
        field4074 = null;
        field4082 = null;
        field4078 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILbk;I)[Lwi;")
    public static final class233[] method1541(int arg0, int arg1, class136 arg2, int arg3) {
        field4076++;
        return class84.method528(arg2, arg3, arg1, arg0) ? class95.method587(-118) : null;
    }
}
