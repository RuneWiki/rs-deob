import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class264 {

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4066 = "slide:";

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "F")
    public static float field4069;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Lth;")
    public class146 field4072;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lwf;")
    public static class306 field4067;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lwf;")
    public static class306 field4071;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Lch;")
    public static class33 field4073;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    public int[] field4074;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 5)
    public static void method1747(int arg0) {
        field4073 = null;
        field4067 = null;
        if (arg0 > -46) {
            method1750((class306) null, -50, 98);
        }
        field4071 = null;
        field4066 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1748(int arg0, int arg1) {
        field4068++;
        int var2 = -117 % ((arg1 - 17) / 34);
        if (class183.method1263(0, arg0)) {
            class289.method1886((byte) -62, class219.field3487[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILmd;IIB)V", line = 41)
    public static final void method1749(int arg0, class17 arg1, int arg2, int arg3, byte arg4) {
        field4063++;
        for (class229 var5 = (class229) class240.field3812.method10((byte) 68); var5 != null; var5 = (class229) class240.field3812.method13((byte) -32)) {
            if (var5.field3671 == arg3 && (arg0 * 128) == var5.field3675 && (arg2 * 128) == var5.field3672 && var5.field3687.field196 == arg1.field196) {
                if (var5.field3690 != null) {
                    class74.field1102.method221(var5.field3690);
                    var5.field3690 = null;
                }
                if (var5.field3694 != null) {
                    class74.field1102.method221(var5.field3694);
                    var5.field3694 = null;
                }
                var5.method1284(0);
                return;
            }
        }
        if (arg4 >= -34) {
            method1747(37);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lwf;II)Ln;", line = 79)
    public static final class178 method1750(class306 arg0, int arg1, int arg2) {
        field4064++;
        if (class46.method317((byte) -112, arg0, arg1)) {
            return arg2 == -9837 ? class69.method494(-31610) : (class178) null;
        } else {
            return null;
        }
    }
}
