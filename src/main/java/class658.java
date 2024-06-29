import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class658 extends class275 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "F")
    public static float field9345;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Z")
    public static boolean field9343;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 4)
    public static final void method3725(int arg0) {
        class652.field9237 = new String[500];
        class34.field681 = class417.field5909.field829 - (arg0 - class417.field5909.field833);
        class114.field1472 = class12.field205.field829 + class12.field205.field833 + 2;
        field9347++;
        for (int var1 = 0; var1 < class652.field9237.length; var1++) {
            class652.field9237[var1] = "";
        }
        class79.method660((byte) -86, class424.field6039.method2561(class370.field4980, 0));
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIIIIIIII)V", line = 29)
    public static final void method3726(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9344++;
        if (arg0 < 512 || arg4 < 512 || arg0 > class473.field6604 * 512 - 1024 || (class205.field2465 - 2) * 512 < arg4) {
            class438.field6260[0] = class438.field6260[1] = -1;
        } else if (arg1 > 111) {
            int var10 = class589.method3416(arg0, -21, arg8, arg4) - arg6;
            class230.field2999.method723(arg7, 0, 0);
            class68.field1045.method262(class230.field2999);
            class68.field1045.method329(arg0, var10, arg4, class438.field6260);
            class230.field2999.method723(-arg7, 0, 0);
            class68.field1045.method262(class230.field2999);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIZLqo;)V", line = 55)
    public static final void method3727(boolean arg0, int arg1, boolean arg2, class21 arg3) {
        field9348++;
        int var4 = arg3.field540;
        int var5 = (int) arg3.field7519;
        arg3.method3045(true);
        if (arg2) {
            class185.method1151(var4, 256);
        }
        class332.method1922(var4, 61);
        if (arg1 != 7070) {
            field9343 = true;
        }
        class17 var6 = class400.method2420((byte) -126, var5);
        if (var6 != null) {
            class314.method1836(var6, false);
        }
        class421.method2544(16);
        if (!arg0 && class127.field1619 != -1) {
            class534.method3137(1, class127.field1619, 2);
        }
        class489 var7 = new class489(class113.field1442);
        for (class21 var8 = (class21) var7.method2851(-66); var8 != null; var8 = (class21) var7.method2849(false)) {
            if (!var8.method3047(32)) {
                var8 = (class21) var7.method2851(-115);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field541 == 3) {
                int var9 = (int) var8.field7519;
                if ((var9 >>> 16) == var4) {
                    method3727(arg0, 7070, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Lgi;")
    public abstract class629 method3464(int arg0);
}
