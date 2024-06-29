import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class284 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
    public static boolean field3608 = false;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
    public static int[] field3613 = new int[1];

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Lvq;")
    public static class323 field3614 = new class323(128);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        if (arg0 != 1) {
            method1678(67, (byte) -27, 85, null, null, -118, -53, null);
        }
        field3613 = null;
        field3614 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)J")
    public abstract long method542(int arg0);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public static final void method1677(int arg0, int arg1) {
        field3609++;
        if (class483.field7059 == arg1) {
            return;
        }
        if (class483.field7059 == 0) {
            class451.method2691(-122);
        }
        if (arg1 == 12) {
            class36.method261(class493.field7171, -48, class361.field4657, class233.field2976);
        }
        if (arg0 != -20429) {
            field3614 = null;
        }
        if (arg1 != 12 && class442.field6333 != null) {
            class442.field6333.method2473(10228);
            class442.field6333 = null;
        }
        if (arg1 == 2) {
            class430.method2519(arg0 ^ 0xFFFFBB7B, class428.field6077 != class277.field3510);
        }
        if (arg1 == 6) {
            class48.method491(71, class277.field3510 != class17.field256);
        }
        if (arg1 == 4) {
            class438.method2578(class361.field4657, 32, class493.field7171);
        } else if (arg1 == 5) {
            class36.method261(class493.field7171, arg0 ^ 0x4FAB, class361.field4657, class233.field2976);
        } else if (arg1 == 8) {
            class36.method261(class493.field7171, arg0 ^ 0x4FE4, class361.field4657, class233.field2976);
        } else if (arg1 == 11) {
            class438.method2578(class361.field4657, 32, class493.field7171);
        }
        if (class268.method1594(3, class483.field7059)) {
            class404.field5750.field586 = 2;
            class84.field1055.field586 = 2;
            class470.field6830.field586 = 2;
            class233.field2984.field586 = 2;
            class8.field76.field586 = 2;
            class3.field29.field586 = 2;
            class126.field1687.field586 = 2;
        }
        if (class268.method1594(3, arg1)) {
            class466.field6742 = 1;
            class384.field5058 = 0;
            class327.field4133 = 1;
            class141.field1833 = 0;
            class308.field3948 = 0;
            class280.method1663(true, 1475);
            class404.field5750.field586 = 1;
            class84.field1055.field586 = 1;
            class470.field6830.field586 = 1;
            class233.field2984.field586 = 1;
            class8.field76.field586 = 1;
            class3.field29.field586 = 1;
            class126.field1687.field586 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class286.method1691(arg0 + 20330);
        }
        if (arg1 == 1) {
            class78.method670(false, class33.field416, class448.field6413);
        } else {
            class68.method607(arg0 ^ 0x4FF7);
        }
        boolean var2 = arg1 == 1 || class500.method3009(arg1, arg0 + 20307) || class395.method2282((byte) 74, arg1);
        boolean var3 = class483.field7059 == 1 || class500.method3009(class483.field7059, -124) || class395.method2282((byte) 74, class483.field7059);
        if (var2 != var3) {
            if (var2) {
                class387.field5085 = class93.field1130;
                if (class407.field5817.field3629 == 0) {
                    class348.method1991(2, (byte) -125);
                } else {
                    class113.method819(-1891108953, false, class530.field7806, class407.field5817.field3629, 0, 2, class93.field1130);
                }
                class298.field3825.method2058(false, arg0 ^ 0xFFFFB033);
            } else {
                class348.method1991(2, (byte) -85);
                class298.field3825.method2058(true, 0);
            }
        }
        if (class268.method1594(3, arg1) || arg1 == 12) {
            class33.field416.method313();
        }
        class483.field7059 = arg1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBILma;Ll;IILhd;)V")
    public static final void method1678(int arg0, byte arg1, int arg2, class10 arg3, class16 arg4, int arg5, int arg6, class523 arg7) {
        field3611++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class142.field1835 == 4) {
            var8 = (int) class463.field6626 & 0x3FFF;
        } else {
            var8 = (int) class463.field6626 + class309.field3967 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field7617 / 2, arg7.field7574 / 2) + 10;
        if (arg1 != 86) {
            method1678(22, (byte) 98, -19, null, null, -38, -55, null);
        }
        int var10 = arg2 * arg2 + arg6 * arg6;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class36.field443[var8];
        int var12 = class36.field478[var8];
        if (class142.field1835 != 4) {
            var11 = var11 * 256 / (class317.field4050 + 256);
            var12 = var12 * 256 / (class317.field4050 + 256);
        }
        int var13 = arg2 * var12 + arg6 * var11 >> 15;
        int var14 = arg6 * var12 - (arg2 * var11) >> 15;
        arg4.method129(arg7.field7617 / 2 + arg5 + var13 - (arg4.method148() / 2), -var14 + arg0 - -(arg7.field7574 / 2) + -(arg4.method131() / 2), arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public abstract void method543(int arg0);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)I")
    public abstract int method544(int arg0, int arg1);
}
