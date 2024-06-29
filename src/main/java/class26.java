import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class26 extends class70 implements class196 {

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lpd;")
    public class433 field423;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Z")
    private boolean field418;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lud;")
    public static class63 field424 = new class63("WTRC", 1);

    @OriginalMember(owner = "client!af", name = "C", descriptor = "[Z")
    public static boolean[] field433 = new boolean[200];

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        ++field430;
        this.field423.method2599((byte) 86, arg1);
        int var3 = -119 % ((arg0 - 59) / 60);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        this.field423.method2598(12, arg1);
        if (arg0 <= -31) {
            ++field416;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field422;
        if (arg1 == 118) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field432;
        class201 var5 = this.field423.method2590(false, 10, arg3, false, super.field968, 131072, super.field966);
        if (var5 == null) {
            return false;
        } else {
            class23 var6 = arg3.method1088();
            if (arg1 != 3) {
                return true;
            } else {
                var6.method185(super.field966, super.field971, super.field968);
                return var5.method310(arg0, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)[Lpg;")
    public static final class492[] method204(int arg0) {
        ++field425;
        return arg0 != 0 ? null : new class492[] { class516.field7655, class323.field4981, class194.field2767, class288.field4289, class48.field673, class473.field6910, class371.field5696, class375.field5742, class357.field5536, class523.field7736, class510.field7581, class72.field982, class219.field3073, class369.field5665, class388.field5890, class81.field1088, class252.field3497, class77.field1040, class17.field275, class91.field1333, class14.field235, class404.field6111, class10.field153, class201.field2832, class167.field2434, class8.field120, class484.field7044, class198.field2801, class415.field6225, class463.field6778, class67.field920, class168.field2438, class110.field1552, class13.field206, class310.field4639, class259.field3619, class249.field3462, class23.field348, class338.field5351, class41.field637, class393.field5969, class422.field6301, class320.field4904, class64.field897, class352.field5456, class471.field6896, class523.field7725, class38.field610, class368.field5662, class517.field7665, class193.field2743, class317.field4863, class17.field270, class325.field4995, class490.field7164, class319.field4891, class232.field3296, class527.field7779, class73.field985, class204.field2860, class467.field6801, class396.field6022, class438.field6527, class434.field6452, class524.field7741, class193.field2733, class329.field5057, class363.field5625, class455.field6682, class193.field2731, class289.field4301, class252.field3494, class234.field3320, class30.field460, class141.field2042, class421.field6287, class366.field5634, class463.field6774, class225.field3176, class54.field729, class527.field7784, class456.field6694, class315.field4815, class282.field4030, class346.field5418, class441.field6554, class174.field2503, class172.field2484, class487.field7139, class519.field7698, class303.field4458, class21.field334, class279.field3850, class8.field121, class455.field6685, class461.field6761, class417.field6248, class371.field5699, class399.field6088, class340.field5367, class94.field1367, class34.field534, class281.field3867, class100.field1442, class8.field118, class380.field5790, class55.field741, class496.field7248, class374.field5735, class95.field1381 };
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        ++field417;
        class201 var3 = this.field423.method2590(true, 10, arg1, true, super.field968, 262144, super.field966);
        if (arg0 != -126) {
            this.field423 = null;
        }
        if (var3 != null) {
            int var4 = super.field966 >> 7;
            int var5 = super.field968 >> 7;
            this.field423.method2589(var5, var4, false, var4, var5, arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field428;
        class201 var3 = this.field423.method2590(true, 10, arg0, false, super.field968, 2048, super.field966);
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = arg0.method1088();
            var4.method185(super.field966, super.field971, super.field968);
            class507 var5 = null;
            if (this.field418) {
                var5 = class82.method527(1, 1761171873);
            }
            if (this.field423.field6448 == null) {
                var3.method318(var4, var5 == null ? null : var5.field7549[0], 0);
            } else {
                class258 var6 = this.field423.field6448.method870();
                arg0.method1047(var3, var6, var4, var5 != null ? var5.field7549[0] : null, 0);
            }
            int var7 = super.field966 >> 7;
            int var8 = super.field968 >> 7;
            if (arg1 != -150) {
                return null;
            } else {
                this.field423.method2589(var8, var7, true, var7, var8, arg0, true, var3);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        ++field427;
        int var2 = -81 % ((arg0 - 27) / 63);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        if (arg0 != 25707) {
            this.method61((class49) null, (byte) -35, (class496) null, 85, false, 88, -94);
        }
        ++field426;
        return this.field423.field6429;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        if (arg0 > -108) {
            return true;
        } else {
            ++field415;
            return this.field423.method2593(10);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        ++field429;
        return arg0 != 7 ? false : false;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.field418 = false;
        }
        ++field431;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field421;
        if (arg0 != 63) {
            field433 = null;
        }
        return this.field423.field6432;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        if (arg0 != -7234) {
            field424 = null;
        }
        ++field420;
        return this.field423.field6421;
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public static void method205(int arg0) {
        field424 = null;
        if (arg0 != 28971) {
            field433 = null;
        }
        field433 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        ++field419;
        int var4 = 116 / ((-62 - arg2) / 39);
        return this.field423.method2590(false, 10, arg1, false, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lqa;Leu;IIIIIZIII)V")
    public class26(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class422.method2540((byte) 82, arg8, arg9));
        this.field423 = new class433(arg0, arg1, arg8, arg9, arg2, arg3, super.field966, super.field968, arg7, arg10);
        this.field418 = arg1.field1886 != 0 && !arg7;
    }
}
