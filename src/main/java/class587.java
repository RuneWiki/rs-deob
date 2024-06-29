import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class587 extends class13 {

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[B")
    public byte[] field8003;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "[I")
    public static int[] field8009 = new int[3];

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field8005 = 0;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[S")
    public static short[] field8006 = new short[256];

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Lmu;")
    public static class303 field8007 = new class303(9, -1);

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Z")
    public static boolean field8002;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZBI)V", line = 4)
    public static final void method3350(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field8011++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class445.field6322 - class145.field2394) * var6 / 100 + class145.field2394;
        if (class21.field335 > var7) {
            var7 = class21.field335;
        } else if (class606.field8313 < var7) {
            var7 = class606.field8313;
        }
        int var8 = var7 * 512 * arg5 / (arg2 * 334);
        if (var8 < class79.field1413) {
            short var12 = class79.field1413;
            var7 = arg2 * 334 * var12 / (arg5 * 512);
            if (var7 > class606.field8313) {
                var7 = class606.field8313;
                int var13 = arg5 * var7 * 512 / (var12 * 334);
                int var14 = (arg2 - var13) / 2;
                if (arg3) {
                    class272.field3822.method305();
                    class272.field3822.method624(var14, (byte) -125, arg0, arg1, arg5, -16777216);
                    class272.field3822.method624(var14, (byte) -125, arg0 + arg2 - var14, arg1, arg5, -16777216);
                }
                arg0 += var14;
                arg2 -= var14 * 2;
            }
        } else if (class651.field8945 < var8) {
            short var9 = class651.field8945;
            var7 = arg2 * var9 * 334 / (arg5 * 512);
            if (class21.field335 > var7) {
                var7 = class21.field335;
                int var10 = arg2 * 334 * var9 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg3) {
                    class272.field3822.method305();
                    class272.field3822.method624(arg2, (byte) -125, arg0, arg1, var11, -16777216);
                    class272.field3822.method624(arg2, (byte) -125, arg0, arg1 + arg5 - var11, var11, -16777216);
                }
                arg1 += var11;
                arg5 -= var11 * 2;
            }
        }
        class136.field2281 = arg5 * var7 / 334;
        class470.field6595 = arg1;
        class504.field7021 = (short) arg5;
        class551.field7595 = (short) arg2;
        class67.field1271 = arg0;
        int var15 = -3 % ((-arg4 - 8) / 56);
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)V", line = 97)
    public static final void method3351(byte arg0) {
        if (class21.method168(class214.field3036, -114) || class626.method3575(class214.field3036, -103)) {
            class671.method3770(5000, class108.field1896 >> 12, class275.field3870 >> 12, (byte) -13);
        } else {
            int var1 = class58.field1147.field5746[0] >> 3;
            int var2 = class58.field1147.field5743[0] >> 3;
            if (var1 >= 0 && class376.field5325 >> 3 > var1 && var2 >= 0 && var2 < (class175.field2711 >> 3)) {
                class671.method3770(5000, var1, var2, (byte) -13);
            } else {
                class671.method3770(0, class376.field5325 >> 4, class175.field2711 >> 4, (byte) -13);
            }
        }
        field8013++;
        class466.method2742(-1);
        class535.method3085(true);
        int var3 = -8 % ((-arg0 - 30) / 38);
        class443.method2663((byte) 98);
        class162.method1234(117);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([B)V", line = 128)
    public class587(byte[] arg0) {
        this.field8003 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V", line = 136)
    public static void method3352(boolean arg0) {
        field8009 = null;
        field8006 = null;
        if (!arg0) {
            field8006 = null;
        }
        field8007 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V", line = 150)
    public static final void method3353(int arg0, boolean arg1) {
        if (arg1 && class489.field6765 != null) {
            class644.field8865 = class489.field6765.field2613;
        } else {
            class644.field8865 = -1;
        }
        field8004++;
        class489.field6765 = null;
        class445.field6321 = null;
        class362.field5203 = 0;
        class591.field8075 = null;
        class489.method2877();
        class489.field6776.method1270(127);
        class539.field7466 = null;
        class445.field6324 = null;
        class283.field3954 = null;
        class323.field4479 = null;
        class530.field7314 = null;
        class480.field6698 = null;
        class428.field6146 = null;
        class489.field6768 = null;
        class204.field2944 = null;
        class606.field8321 = -1;
        if (arg0 > -44) {
            return;
        }
        class638.field8761 = -1;
        class214.field3034 = null;
        if (class489.field6760 != null) {
            class489.field6760.method2130(7851);
            class489.field6760.method2131((byte) -100, 64, 128);
        }
        if (class489.field6764 != null) {
            class489.field6764.method1040(64, 1, 64);
        }
        if (class489.field6767 != null) {
            class489.field6767.method1689(64, true);
        }
        class732.field9890.method3433(64, -124);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lin;I[ILin;)V", line = 199)
    public static final void method3354(class91 arg0, int arg1, int[] arg2, class91 arg3) {
        field8010++;
        if (arg2 != null) {
            class669.field9118 = arg2;
        }
        class281.field3935 = arg0;
        if (arg1 >= -6) {
            method3353(-36, true);
        }
        class428.field6143 = arg3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 221)
    public static final void method3355(int arg0) {
        class678.method3811((byte) -50);
        field8012++;
        int var1 = class693.field9368.field4419.method3484(-32350);
        if (var1 == 2) {
            class343.method2165(class272.field3822, 100, (byte) 9, class582.field7968, 100, class467.field6559);
        } else if (var1 == 3) {
            class131.method1087(2, class272.field3822, class467.field6559, (byte) 73, class91.field1624, class453.field6392, class582.field7968, 2);
        }
        if (class693.field9368.field4419.method3492(false)) {
            class281.method1850(arg0 + 93, class458.field6458);
        }
        if (class272.field3822 != null) {
            class316.method2045((byte) -9);
        }
        class458.field6459 = arg0 != class693.field9368.field4419.method3484(-32350);
        class241.field3529 = class693.field9368.field4419.method3492(false);
    }
}
