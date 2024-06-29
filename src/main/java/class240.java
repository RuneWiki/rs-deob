import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class240 extends class202 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lqd;")
    private static class40 field3975 = class147.method1106(" has logged out)3", (byte) -77);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lqd;")
    public static class40 field3976 = field3975;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lrb;")
    public static class213 field3980;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[Lcm;")
    public static class185[] field3978;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[Log;")
    public static class197[] field3979;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 8)
    public static void method1683(byte arg0) {
        field3976 = null;
        field3975 = null;
        field3978 = null;
        if (arg0 > -89) {
            method1684(11);
        }
        field3980 = null;
        field3979 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 40)
    public static final void method1684(int arg0) {
        if (arg0 != -21270) {
            method1684(-81);
        }
        field3981++;
        class315.field5338 = class89.method693(8, true, 2048, 0.4F, 35, 4, 120, 8);
    }
}
