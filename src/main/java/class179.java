import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class179 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2614 = new String[500];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lbk;")
    public static class46 field2615 = null;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -10562) {
            method1178(-94, -31, -87, -98, -18, -19, 59, 67);
        }
        field2613++;
        if (class176.method1165(arg4, arg3 ^ 0x5059)) {
            client.method316(class275.field4236[arg4], -1, arg1, arg0, arg6, arg7, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
    public static final boolean method1179(int arg0, int arg1, int arg2) {
        int var3 = class54.field863[arg0][arg1][arg2];
        if (-class104.field1534 == var3) {
            return false;
        } else if (class104.field1534 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class7.method66(var4 + 1, class166.field2451[arg0][arg1][arg2], var5 + 1) && class7.method66(var4 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg2], var5 + 1) && class7.method66(var4 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class7.method66(var4 + 1, class166.field2451[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class54.field863[arg0][arg1][arg2] = class104.field1534;
                return true;
            } else {
                class54.field863[arg0][arg1][arg2] = -class104.field1534;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        if (arg0 >= -106) {
            method1180((byte) -95);
        }
        field2614 = null;
        field2615 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lca;I)Lid;")
    public static final class165 method1181(class54 arg0, int arg1) {
        if (arg1 < 33) {
            method1182(-64, (class297) null);
        }
        field2618++;
        return new class165(arg0.method457((byte) 110), arg0.method457((byte) 83), arg0.method457((byte) 57), arg0.method457((byte) 122), arg0.method457((byte) 75), arg0.method457((byte) 70), arg0.method457((byte) 73), arg0.method457((byte) 102), arg0.method408(8), arg0.method407(255));
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjk;)V")
    public static final void method1182(int arg0, class297 arg1) {
        int var2 = arg1.field4600;
        field2617++;
        if (var2 == 324) {
            if (class25.field401 == -1) {
                class280.field4307 = arg1.field4642;
                class25.field401 = arg1.field4658;
            }
            if (class171.field2508.field4022) {
                arg1.field4658 = class25.field401;
            } else {
                arg1.field4658 = class280.field4307;
            }
        } else if (var2 == 325) {
            if (class25.field401 == -1) {
                class25.field401 = arg1.field4658;
                class280.field4307 = arg1.field4642;
            }
            if (class171.field2508.field4022) {
                arg1.field4658 = class280.field4307;
            } else {
                arg1.field4658 = class25.field401;
            }
        } else if (var2 == 327) {
            arg1.field4622 = 150;
            arg1.field4691 = (int) (Math.sin((double) class120.field1794 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4604 = -1;
            arg1.field4584 = 5;
        } else if (var2 == 328) {
            if (class185.field2687.field3488 == null) {
                arg1.field4604 = 0;
            } else {
                arg1.field4622 = 150;
                arg1.field4691 = (int) (Math.sin((double) class120.field1794 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4584 = 5;
                arg1.field4604 = ((int) class37.method286(25077, class185.field2687.field3488) << 11) + 2047;
                arg1.field4527 = class185.field2687.field422;
                arg1.field4613 = class185.field2687.field399;
                arg1.field4546 = class185.field2687.field405;
                arg1.field4701 = 0;
            }
        } else if (arg0 > -36) {
            method1182(92, (class297) null);
        }
    }
}
