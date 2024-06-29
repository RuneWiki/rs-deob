import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class231 extends class213 {

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Lvd;")
    private static class222 field4332 = class212.method1357("Bad session id)3", 10731);

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lvd;")
    public static class222 field4333 = class212.method1357(" Sekunde(Xn(Y -Ubertragen)3", 10731);

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field4334 = 7759444;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
    public static int[] field4337 = new int[5];

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lvd;")
    public static class222 field4331 = field4332;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Le;")
    public class44 field4335;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
    public static final int method1514(int arg0, int arg1) {
        field4338++;
        if (arg1 != 25565) {
            method1515(true);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static void method1515(boolean arg0) {
        if (!arg0) {
            method1514(-102, 103);
        }
        field4331 = null;
        field4333 = null;
        field4332 = null;
        field4337 = null;
    }
}
