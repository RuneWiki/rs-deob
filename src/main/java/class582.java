import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class582 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field8279 = 0;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lwt;")
    public static class284 field8280;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "[Ltn;")
    public static class77[] field8278;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ler;I)V", line = 7)
    public static final void method3413(class92 arg0, int arg1) {
        if (class156.field2678 == null) {
            class432 var2 = new class432();
            byte[] var3 = var2.method2743(128, 128, 16, -103);
            class156.field2678 = class129.method1126(false, (byte) 126, var3);
        }
        field8281++;
        if (class229.field3675 == null) {
            class689 var4 = new class689();
            byte[] var5 = var4.method3903(13, 16, 128, 128);
            class229.field3675 = class129.method1126(false, (byte) -75, var5);
        }
        class562 var6 = arg0.field1329;
        if (var6.method3339(0) && class374.field5846 == null) {
            byte[] var7 = class680.method3878(new class206(419684), 128, 128, 16.0F, 4.0F, (byte) -11, 8, 0.5F, 0.6F, 4.0F, 16);
            class374.field5846 = class129.method1126(false, (byte) -94, var7);
        }
        if (arg1 != 6119) {
            method3413(null, -39);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 51)
    public static void method3414(int arg0) {
        field8280 = null;
        field8278 = null;
        if (arg0 > -116) {
            method3414(77);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V", line = 67)
    public static final void method3415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8282++;
        if (arg3 != 1) {
            return;
        }
        if (arg1 >= class576.field8218 && class340.field5510 >= arg6 && arg5 >= class545.field7931 && arg4 <= class585.field8331) {
            if (arg2 == 1) {
                class136.method1173(arg5, arg6, arg0, arg3 - 118, arg1, arg4);
            } else {
                class268.method1903(arg2, arg3 - 18360, arg0, arg4, arg6, arg5, arg1);
            }
        } else if (arg2 == 1) {
            class258.method1826(arg0, arg5, false, arg4, arg6, arg1);
        } else {
            class373.method2454(arg4, arg6, arg2, (byte) 89, arg0, arg5, arg1);
        }
    }
}
