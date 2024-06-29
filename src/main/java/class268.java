import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class268 {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Lmn;")
    public static class247 field3704 = new class247(8);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1603(int arg0) {
        if (arg0 >= -27) {
            method1604((byte) -88, 11, 27, 53, 4, -21);
        }
        field3704 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIIIII)V")
    public static final void method1604(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class439.field6489 = arg1;
        field3705++;
        class21.field280 = arg2;
        if (arg0 < 124) {
            return;
        }
        class458.field6723 = arg5;
        class138.field1969 = arg3;
        class325.field4443 = arg4;
        if (class21.field280 >= 100) {
            int var6 = class439.field6489 * 128 + 64;
            int var7 = class458.field6723 * 128 + 64;
            int var8 = class242.method1465(90, class436.field6379, var7, var6) - class138.field1969;
            int var9 = var6 - class329.field4493;
            int var10 = var8 - class62.field766;
            int var11 = var7 - class373.field5478;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class107.field1604 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class94.field1399 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class107.field1604 < 1024) {
                class107.field1604 = 1024;
            }
            class493.field7186 = 0;
            if (class107.field1604 > 3072) {
                class107.field1604 = 3072;
            }
        }
        class491.field7168 = 2;
    }
}
