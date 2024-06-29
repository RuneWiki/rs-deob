import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class295 extends class407 {

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "[C")
    private static char[] field4297 = new char[64];

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field4298;

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field4297[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field4297[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field4297[var2] = (char) (var2 + 48 + -52);
        }
        field4297[63] = '-';
        field4297[62] = '*';
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIZ)V", line = 5)
    public final void method1919(int arg0, int arg1, int arg2, boolean arg3) {
        class37.field491.method520(arg1 + -2, arg0, super.field5543.field9833 + 4, super.field5543.field9837 + 2, ((class287) super.field5543).field4221, 0);
        ++field4296;
        if (arg2 != 7) {
            method1923(-47, 41);
        }
        class37.field491.method520(arg1 + -1, arg0 + 1, super.field5543.field9833 - -2, super.field5543.field9837, 0, 0);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBIZ)V", line = 17)
    public final void method1920(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field4293;
        if (arg1 != 105) {
            method1922(86);
        }
        int var5 = this.method2489(arg1 + 9895) * super.field5543.field9833 / 10000;
        class37.field491.method495(arg0, arg2 - -2, var5, super.field5543.field9837 - 2, ((class287) super.field5543).field4225, 0);
        class37.field491.method495(arg0 + var5, arg2 - -2, -var5 + super.field5543.field9833, super.field5543.field9837 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lwia;Lwia;Lwd;)V", line = 31)
    public class295(class791 arg0, class791 arg1, class287 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[F)[F", line = 34)
    public static final float[] method1921(int arg0, int arg1, float[] arg2) {
        if (arg1 != 1) {
            method1924(2, 42, 4, 37);
        }
        ++field4292;
        float[] var3 = new float[arg0];
        class595.method3468(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V", line = 51)
    public static void method1922(int arg0) {
        field4297 = null;
        if (arg0 != 1) {
            method1921(47, 25, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V", line = 62)
    public static final void method1923(int arg0, int arg1) {
        ++field4295;
        class313 var2 = class312.method1998((long) arg0, arg1, -1);
        var2.method2006(-111);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)Z", line = 72)
    public static final boolean method1924(int arg0, int arg1, int arg2, int arg3) {
        ++field4294;
        if (class694.field9700 && class385.field5304) {
            if (class710.field9866 < 100) {
                return false;
            } else {
                int var4 = class440.field5978[arg3][arg2][arg0];
                if (-class744.field10316 == var4) {
                    return false;
                } else if (~class744.field10316 == ~var4) {
                    return true;
                } else if (class774.field10642 == class208.field3219) {
                    return false;
                } else {
                    int var5 = arg2 << class645.field9018;
                    int var6 = arg0 << class645.field9018;
                    if (class263.method1706(class208.field3219[arg3].method1904(arg0 + 1, (byte) 32, arg2 + 1), var6 - 1 + class109.field1611, class208.field3219[arg3].method1904(arg0 + 1, (byte) 52, arg2), arg1 + var6, var5 + 1, var5 - -class109.field1611 + -1, class208.field3219[arg3].method1904(arg0, (byte) -122, arg2), -54, var6 + -1 - -class109.field1611, var5 + 1) && class263.method1706(class208.field3219[arg3].method1904(arg0, (byte) -126, arg2 + 1), class109.field1611 + var6 + -1, class208.field3219[arg3].method1904(arg0 + 1, (byte) 80, arg2 + 1), var6 - -1, var5 + 1, class109.field1611 + var5 - 1, class208.field3219[arg3].method1904(arg0, (byte) -125, arg2), arg1 ^ -33, var6 - -1, class109.field1611 + var5 + -1)) {
                        ++class650.field9083;
                        class440.field5978[arg3][arg2][arg0] = class744.field10316;
                        return true;
                    } else {
                        class440.field5978[arg3][arg2][arg0] = -class744.field10316;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }
}
