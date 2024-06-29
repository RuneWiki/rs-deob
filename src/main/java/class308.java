import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class308 extends class499 {

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    private int field4129;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    private int field4124;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    private int field4127;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "Z")
    public static boolean field4132 = false;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "Lcb;")
    public static class318 field4135 = new class318(22, 20);

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
    public static boolean field4137 = true;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Lcb;")
    public static class318 field4138 = null;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)V")
    public final void method1380(int arg0, byte arg1, int arg2) {
        ++field4126;
        int var4 = this.field4124 * arg2 >> 12;
        int var5 = this.field4127 * arg2 >> 12;
        int var6 = this.field4136 * arg0 >> 12;
        if (arg1 != -20) {
            field4137 = true;
        }
        int var7 = this.field4129 * arg0 >> 12;
        class54.method329(var6, var5, super.field6738, var7, 23, var4);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
    public static final void method1844(int arg0, int arg1) {
        class168.field2093 = null;
        class159.field1987 = false;
        class208.field2732 = -1;
        ++field4133;
        class369.field5301 = 1;
        int var2 = 122 / ((-25 - arg1) / 44);
        class490.field6609 = arg0;
        class265.field3643 = -1;
        class333.field4865 = 0;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIII)V")
    public class308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4129 = arg3;
        this.field4136 = arg1;
        this.field4124 = arg0;
        this.field4127 = arg2;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method1845(boolean arg0) {
        field4135 = null;
        field4138 = null;
        if (!arg0) {
            field4138 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)V")
    public final void method1374(int arg0, int arg1, int arg2) {
        ++field4131;
        int var4 = this.field4124 * arg0 >> 12;
        if (arg1 > -112) {
            field4132 = true;
        }
        int var5 = this.field4127 * arg0 >> 12;
        int var6 = this.field4136 * arg2 >> 12;
        int var7 = this.field4129 * arg2 >> 12;
        class396.method2349(var7, super.field6739, 14319, var4, var5, super.field6738, super.field6741, var6);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)V")
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field4130;
        if (arg0 < 16) {
            this.method1380(-43, (byte) -112, -91);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1846(int arg0, boolean arg1) {
        ++field4125;
        if (!arg1) {
            return false;
        } else {
            return ~arg0 == -2 || arg0 == 3 || ~arg0 == -6;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/awt/Canvas;ILe;Lpq;)Loa;")
    public static final class689 method1847(int arg0, Canvas arg1, int arg2, class479 arg3, class159 arg4) {
        ++field4134;
        if (!class149.method1008(true)) {
            throw new RuntimeException("");
        } else if (!class552.method3093("jaggl", 0)) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else if (arg2 != 1678548140) {
                return null;
            } else {
                class381 var8 = new class381(var5, arg1, var6, arg3, arg4, arg0);
                var8.method1915(false);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
    public static final void method1848(boolean arg0) {
        class276.field3744.method2414((byte) 127);
        ++field4128;
        class261.field3604.method1129((byte) -109);
        class34.field336.method181(78);
        class578.field7980.method1742(123);
        class318.field4640.method3385(arg0);
        class237.field3088.method1352((byte) -78);
        class77.field971.method777(arg0);
        class236.field3079.method1053(64);
        class150.field1888.method3001((byte) 45);
        class48.field654.method2606((byte) 81);
        class613.field8364.method1873(98);
        class70.field916.method1012(-90);
        class665.field9460.method221(19834);
        class559.field7615.method2315(64);
        class191.field2486.method1258((byte) -51);
        class603.field8243.method2900(false);
        class502.field6772.method1309(-22751);
        class640.field8730.method2491(0);
        class637.field8698.method1370((byte) -17);
        class67.field876.method3215(65536);
        class369.method2267(-11885);
        class658.method3643((byte) -106);
        class518.method2947(2324);
        if (class375.field5396 != class333.field4859) {
            for (int var1 = 0; ~var1 > ~class91.field1128.length; ++var1) {
                class91.field1128[var1] = null;
            }
            class625.field8506 = 0;
        }
        class172.method1149(18);
        class473.method2659(68);
        class446.method2560(-127);
        class154.method1026((byte) 80);
        class542.method3055(-8915);
        class317.field4631.method3142(false);
        class9.field103.method1929();
        class101.field1229.method3025((byte) 10);
        class54.method316(58);
        class401.field5696.method1060(-118);
        class93.field1162.method1060(-113);
        class119.field1528.method1060(-122);
        class108.field1300.method1060(-119);
        class589.field8086.method1060(-108);
        class397.field5664.method1060(-115);
        class328.field4812.method1060(-121);
        class284.field3839.method1060(-108);
        class39.field510.method1060(-118);
        class355.field5163.method1060(-127);
        class103.field1263.method1060(-121);
        class209.field2740.method1060(-109);
        class314.field4517.method1060(-118);
        class613.field8373.method1060(-119);
        class16.field132.method1060(-125);
        class360.field5194.method1060(-123);
        class560.field7638.method1060(-121);
        class563.field7708.method1060(-128);
        class175.field2199.method1060(-107);
        class560.field7636.method1060(-117);
        class327.field4752.method1060(-112);
        class23.field223.method1060(-128);
        class440.field6064.method1060(-128);
        class307.field4123.method1060(-109);
        class429.field5959.method1060(-109);
        class61.field846.method1060(-120);
        class3.field29.method1060(-115);
        class417.field5814.method1060(-124);
        class639.field8722.method1060(-125);
        class462.field6300.method1060(-112);
        class640.field8729.method1060(-124);
        class16.field134.method1060(-115);
        class254.field3498.method3142(!arg0);
        class612.field8348.method3142(false);
        class154.field1910.method3142(false);
        class326.field4747.method3142(false);
    }
}
