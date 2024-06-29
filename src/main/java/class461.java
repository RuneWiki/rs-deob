import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class461 extends class12 {

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field6570 = -1;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field6567 = 0;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "F")
    public static float field6566;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "F")
    public static float field6568;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "[Lrr;")
    public static class361[] field6573;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method55(OggPacket arg0, int arg1) {
        field6571++;
        int var3 = 112 % ((25 - arg1) / 46);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class461(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIIII)Z")
    public static final boolean method2809(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6575++;
        if (!class114.field1198 || !class396.field5425) {
            return false;
        } else if (class542.field7803 < 100) {
            return false;
        } else if (arg1 != arg6 || arg3 != arg4) {
            if (arg0 <= 76) {
                method2810(null, -13, null, true, true);
            }
            for (int var9 = arg1; var9 <= arg6; var9++) {
                for (int var12 = arg4; var12 <= arg3; var12++) {
                    if (class280.field3432[arg2][var9][var12] == -class188.field2234) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << class748.field10430) + 1;
            int var11 = (arg4 << class748.field10430) + 2;
            if (class316.method1885(arg5, (arg6 + 1 - arg1) * class559.field7987, var11, var10, 36, class504.field7120[arg2].method1671(arg4, arg1, (byte) 120), (arg3 + 1 - arg4) * class559.field7987)) {
                class223.field2557++;
                return true;
            } else {
                return false;
            }
        } else if (class240.method1414(30633, arg1, arg4, arg2)) {
            int var7 = arg1 << class748.field10430;
            int var8 = arg4 << class748.field10430;
            if (class316.method1885(arg5, class559.field7987, var8, var7, 77, class504.field7120[arg2].method1671(arg4, arg1, (byte) -93), class559.field7987)) {
                class223.field2557++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgh;ILjava/lang/String;ZZ)V")
    public static final void method2810(class546 arg0, int arg1, String arg2, boolean arg3, boolean arg4) {
        field6569++;
        if (arg1 != -9) {
            method2811((byte) 27);
        }
        if (!arg3) {
            class148.method923(arg2, (byte) -91, 3, arg0);
            return;
        }
        if (class546.field7836.startsWith("win") && arg0.field7851) {
            String var5 = null;
            if (class255.field3123 != null) {
                var5 = class255.field3123.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class290 var6 = class148.method923(arg2, (byte) -102, 0, arg0);
                class158.field1734 = arg2;
                class563.field8027 = arg0;
                class267.field3319 = var6;
                return;
            }
        }
        if (class546.field7836.startsWith("mac")) {
            String var7 = null;
            if (class255.field3123 != null) {
                var7 = class255.field3123.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class148.method923(arg2, (byte) -8, 1, arg0);
                return;
            }
        }
        class148.method923(arg2, (byte) 113, 2, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2811(byte arg0) {
        field6573 = null;
        int var1 = -92 / ((-arg0 - 18) / 50);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public final void method56(int arg0) {
        field6572++;
        if (arg0 != 3376) {
            field6570 = 13;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lqt;")
    public static final class634 method2812(int arg0, int arg1) {
        field6574++;
        if (arg1 > -46) {
            return null;
        } else if (arg0 == 0) {
            return new class519();
        } else if (arg0 == 1) {
            return new class628();
        } else if (arg0 == 2) {
            return new class4();
        } else if (arg0 == 3) {
            return new class147();
        } else if (arg0 == 4) {
            return new class109();
        } else if (arg0 == 5) {
            return new class518();
        } else if (arg0 == 6) {
            return new class436();
        } else if (arg0 == 7) {
            return new class35();
        } else if (arg0 == 8) {
            return new class750();
        } else if (arg0 == 9) {
            return new class354();
        } else if (arg0 == 10) {
            return new class312();
        } else if (arg0 == 11) {
            return new class2();
        } else if (arg0 == 12) {
            return new class721();
        } else if (arg0 == 13) {
            return new class741();
        } else if (arg0 == 14) {
            return new class415();
        } else if (arg0 == 15) {
            return new class627();
        } else if (arg0 == 16) {
            return new class235();
        } else if (arg0 == 17) {
            return new class75();
        } else if (arg0 == 18) {
            return new class525();
        } else if (arg0 == 19) {
            return new class394();
        } else if (arg0 == 20) {
            return new class439();
        } else if (arg0 == 21) {
            return new class91();
        } else if (arg0 == 22) {
            return new class422();
        } else if (arg0 == 23) {
            return new class572();
        } else if (arg0 == 24) {
            return new class411();
        } else if (arg0 == 25) {
            return new class205();
        } else if (arg0 == 26) {
            return new class674();
        } else if (arg0 == 27) {
            return new class306();
        } else if (arg0 == 28) {
            return new class107();
        } else if (arg0 == 29) {
            return new class506();
        } else if (arg0 == 30) {
            return new class736();
        } else if (arg0 == 31) {
            return new class15();
        } else if (arg0 == 32) {
            return new class67();
        } else if (arg0 == 33) {
            return new class697();
        } else if (arg0 == 34) {
            return new class230();
        } else if (arg0 == 35) {
            return new class502();
        } else if (arg0 == 36) {
            return new class245();
        } else if (arg0 == 37) {
            return new class449();
        } else if (arg0 == 38) {
            return new class19();
        } else if (arg0 == 39) {
            return new class641();
        } else {
            return null;
        }
    }
}
