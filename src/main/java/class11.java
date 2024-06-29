import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class11 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lcq;")
    public static class110 field107 = new class110(42, 10);

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
    public static int[] field108 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "Lsb;")
    public static class305 field109 = new class305(40, 3);

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 7)
    public static final void method58(int arg0) {
        field111++;
        while (class626.field8849.method2581(class257.field3209, -129) >= 15) {
            int var1 = class626.field8849.method2574(296813219, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class214 var3 = (class214) class274.field3433.method3669((long) var1, -1);
            if (var3 == null) {
                class600 var4 = new class600();
                var4.field9434 = var1;
                var3 = new class214(var4);
                class274.field3433.method3671(false, var3, (long) var1);
                class653.field9160[class53.field533++] = var3;
                var2 = true;
            }
            class600 var5 = var3.field2601;
            class398.field5375[class651.field9144++] = var1;
            var5.field9452 = class678.field9539;
            if (var5.field8461 != null && var5.field8461.method1255((byte) 121)) {
                class578.method3268(0, var5);
            }
            int var6 = class626.field8849.method2574(296813219, 3) + 4 << 11 & 0x38CB;
            int var7 = class626.field8849.method2574(296813219, 2);
            int var8 = class626.field8849.method2574(296813219, 1);
            var5.method3368((byte) -109, class369.field5055.method342(-14190, class626.field8849.method2574(296813219, 14)));
            int var9 = class626.field8849.method2574(296813219, 1);
            if (var9 == 1) {
                class8.field90[class645.field9107++] = var1;
            }
            int var10 = class626.field8849.method2574(296813219, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class626.field8849.method2574(296813219, 5);
            var5.method3736(var5.field8461.field2524, 0);
            if (var11 > 15) {
                var11 -= 32;
            }
            var5.field9469 = var5.field8461.field2502 << 3;
            if (var2) {
                var5.method3733(var6, true, (byte) -103);
            }
            var5.method3358(var8 == 1, var7, class362.field4859.field9517[0] + var10, class362.field4859.field9513[0] + var11, var5.method1414(-31789), (byte) -117);
            if (var5.field8461.method1255((byte) 85)) {
                class394.method2232(var5, null, 0, var5.field9517[0], var5.field5166, 1480634889, null, var5.field9513[0]);
            }
        }
        class626.field8849.method2583((byte) -58);
        if (arg0 >= -104) {
            field107 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V", line = 98)
    public static void method59(int arg0) {
        field109 = null;
        if (arg0 == 15) {
            field107 = null;
            field108 = null;
        }
    }
}
