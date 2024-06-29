import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class240 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Ldr;")
    public static class675 field3109 = new class675(82, 12);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lcga;")
    public static class449 field3112 = new class449(5, -1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
    public boolean field3110;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[Lxa;")
    public static class468[] field3111;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 3)
    public static void method1442(byte arg0) {
        field3112 = null;
        if (arg0 != -36) {
            field3111 = null;
        }
        field3109 = null;
        field3111 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwv;Lwv;IIIIIIII)V", line = 15)
    public static final void method1443(class32 arg0, class32 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3108++;
        int var10 = arg0.method217((byte) -34);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class468 var12 = (class468) class222.field2583.method1221((long) var10, true);
        if (var12 == null) {
            class495[] var13 = class495.method2699(class136.field1656, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class309.field3898.method402(var13[0], true);
            class222.field2583.method1230((byte) -111, (long) var10, var12);
        }
        class632.method3546(arg1.field8018, arg3, arg1.method210(false) * 256, arg1.field8011, arg9 >> 1, arg4 + 12673, arg4, arg1.field8010, arg8 >> 1, arg2);
        int var14 = class347.field4465[0] + arg7 - 18;
        int var15 = class347.field4465[1] + arg5 - 70;
        int var16 = arg6 / 4 * 18 + var14;
        int var17 = arg6 % 4 * 18 + var15;
        var12.method2556(var16, var17);
        if (arg0 == arg1) {
            class309.field3898.method3636(18, -256, var16 - 1, var17 + -1, 18, (byte) -125);
        }
        class341 var18 = class203.method1184(false);
        var18.field4351 = var16;
        var18.field4352 = var17 + 16;
        var18.field4347 = var16 + 16;
        var18.field4349 = var17;
        var18.field4350 = arg0;
        class163.field1920.method1714(var18, (byte) 11);
    }
}
