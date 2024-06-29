import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class236 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
    public boolean field4258 = true;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[Z")
    public static boolean[] field4257 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ljd;")
    public static class86 field4259 = class122.method868("::gc", true);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ljd;")
    public static class86 field4261 = class122.method868("Stufe:", true);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4260 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Z")
    public static final boolean method1632(int arg0, int arg1) {
        field4269++;
        if (arg1 >= arg0 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field4259 = null;
        field4257 = null;
        if (arg0 <= 5) {
            field4265 = -18;
        }
        field4261 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4262 = arg5;
        this.field4268 = arg1;
        this.field4267 = arg0;
        this.field4258 = arg6;
        this.field4264 = arg2;
        this.field4263 = arg3;
        this.field4266 = arg4;
    }
}
