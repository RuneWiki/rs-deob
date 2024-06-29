import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class254 {

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Lda;")
    public class185 field545;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "Lcf;")
    private static class93 field544 = class147.method1066("Continue", -48);

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "Lcf;")
    public static class93 field541 = field544;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Lcf;")
    public static class93 field549 = class147.method1066(")4a=", -48);

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "J")
    public static volatile long field548 = 0L;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Lcf;")
    public static class93 field551 = class147.method1066("overlay", -48);

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "Lpe;")
    public static class244 field543;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "[I")
    public static int[] field540;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIILtg;III)V")
    public static final void method204(int arg0, boolean arg1, int arg2, int arg3, class181 arg4, int arg5, int arg6, int arg7) {
        if (class9.field129) {
            class245.field4425 = 32;
        } else {
            class245.field4425 = 0;
        }
        class9.field129 = false;
        if (!arg1) {
            field541 = null;
        }
        if (class218.field3969 != 0) {
            if (arg3 >= arg0 && arg3 < arg0 + 16 && arg5 <= arg7 && arg7 < (arg5 + 16)) {
                arg4.field3282 -= 4;
                class254.method1731(arg4, (byte) -109);
            } else if (arg0 <= arg3 && (arg0 + 16) > arg3 && (arg5 + arg2 - 16) <= arg7 && (arg2 + arg5) > arg7) {
                arg4.field3282 += 4;
                class254.method1731(arg4, (byte) 114);
            } else if ((arg0 - class245.field4425) <= arg3 && arg0 + class245.field4425 + 16 > arg3 && arg7 >= (arg5 + 16) && (arg2 + arg5 - 16) > arg7) {
                int var8 = (arg2 - 32) * arg2 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg5 - (16 - -(var8 / 2));
                int var10 = arg2 - var8 - 32;
                arg4.field3282 = (arg6 - arg2) * var9 / var10;
                class254.method1731(arg4, (byte) -82);
                class9.field129 = true;
            }
        }
        if (class78.field1462 != 0) {
            int var11 = arg4.field3270;
            if (arg3 >= (arg0 - var11) && arg5 <= arg7 && (arg0 + 16) > arg3 && arg7 <= (arg2 + arg5)) {
                arg4.field3282 += class78.field1462 * 45;
                class254.method1731(arg4, (byte) -110);
            }
        }
        field546++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIILtg;)V")
    public static final void method205(byte arg0, int arg1, int arg2, class181 arg3) {
        field539++;
        if (class148.field2611 != null || class58.field991 || arg3 == null || class67.method460(64, arg3) == null) {
            return;
        }
        class148.field2611 = arg3;
        if (arg0 < 36) {
            return;
        }
        class1.field8 = class67.method460(-116, arg3);
        class56.field932 = false;
        class74.field1353 = arg2;
        class31.field493 = arg1;
        class273.field4857 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static final void method206(boolean arg0) {
        class150.method1081(false);
        class253.method1718(50);
        class210.method1487(0);
        field547++;
        class284.method1948(0);
        class217.method1524((byte) -35);
        class69.method468(-128);
        class79.method549((byte) -112);
        class250.method1695(19371);
        class133.method969((byte) 125);
        class242.method1650(arg0);
        class169.method1218((byte) -110);
        class11.method48(18963);
        class249.method1692(0);
        class14.method62(116);
        class128.method932((byte) -106);
        class51.method281((byte) 97);
        class53.method289((byte) -113);
        class125.method915((byte) -109);
        class148.field2606.method294(0);
        class266.field4731.method294(0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lcc;IB)V")
    public static final void method207(class210 arg0, int arg1, byte arg2) {
        field542++;
        if (class275.field4921 < arg0.field3804) {
            class163.method1180(25732, arg0);
        } else if (arg0.field3833 < class275.field4921) {
            class272.method1807(-44, arg0);
        } else {
            class183.method1341(arg0, (byte) -104);
        }
        if (arg0.field3868 < 128 || arg0.field3784 < 128 || arg0.field3868 >= 13184 || arg0.field3784 >= 13184) {
            arg0.field3804 = 0;
            arg0.field3846 = -1;
            arg0.field3833 = 0;
            arg0.field3840 = -1;
            arg0.field3868 = arg0.field3805[0] * 128 + (arg0.method1475(false) * 64);
            arg0.field3784 = arg0.field3820[0] * 128 + arg0.method1475(false) * 64;
            arg0.method1476(-116);
        }
        if (class166.field2927 == arg0 && (arg0.field3868 < 1536 || arg0.field3784 < 1536 || arg0.field3868 >= 11776 || arg0.field3784 >= 11776)) {
            arg0.field3804 = 0;
            arg0.field3846 = -1;
            arg0.field3833 = 0;
            arg0.field3840 = -1;
            arg0.field3868 = arg0.field3805[0] * 128 + (arg0.method1475(false) * 64);
            arg0.field3784 = arg0.field3820[0] * 128 + (arg0.method1475(false) * 64);
            arg0.method1476(-79);
        }
        if (arg2 < -123) {
            class105.method762(102, arg0);
            class25.method129(arg0, 12478);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lda;)V")
    public class35(class185 arg0) {
        this.field545 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field540 = null;
        field549 = null;
        field544 = null;
        field541 = null;
        field543 = null;
        if (arg0 != 55) {
            method207((class210) null, -116, (byte) 56);
        }
        field551 = null;
    }
}
