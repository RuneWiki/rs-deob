import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class324 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field4919 = -1;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[I")
    public static int[] field4920 = new int[2500];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field4906;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2272(int arg0) {
        if (arg0 != 2586) {
            field4913 = -54;
        }
        class137.field1889++;
        class90.field1264.method2238(216, (byte) -128);
        field4918++;
        class90.field1264.method2189(-1, class54.field735);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIIIIII)V", line = 23)
    public static final void method2273(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4908++;
        if (arg5 >= class206.field2952 && arg1 <= class259.field3813 && class101.field1397 <= arg4 && arg6 <= class44.field536) {
            class203.method1438(arg3, 192, arg2, arg5, arg1, arg6, arg7, arg4);
        } else {
            class256.method1750(arg1, arg2, -1, arg6, arg4, arg3, arg5, arg7);
        }
        if (arg0) {
            method2273(false, -128, 73, 72, -126, -46, 57, -43);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 41)
    public static void method2274(byte arg0) {
        field4920 = null;
        if (arg0 > -65) {
            field4917 = -34;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 52)
    public static final void method2275(String arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        field4912++;
        class90.field1264.method2238(135, (byte) -128);
        class90.field1264.method2174((byte) 91, arg2);
        class340.field5111++;
        class90.field1264.method2167(class77.method584(arg0, 100), false);
    }
}
