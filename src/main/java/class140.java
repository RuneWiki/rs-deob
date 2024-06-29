import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class140 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public static boolean field2026 = true;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2024 = "flash1:";

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2025 = "Loading textures - ";

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
    public static int[] field2028 = new int[200];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method950(byte arg0) {
        if (arg0 != 2) {
            method950((byte) -58);
        }
        field2025 = null;
        field2024 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lml;")
    public static final class15 method951(byte arg0, int arg1) {
        class15 var2 = (class15) class61.field989.method945((long) arg1, true);
        field2027++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class3.field39.method1605(-127, class81.method635(true, arg1), class51.method386(arg1, -3));
        class15 var4 = new class15();
        var4.field246 = arg1;
        if (var3 != null) {
            var4.method114(new class54(var3), arg0 ^ 0xDF6);
        }
        var4.method112(-28932);
        if (var4.field271 != -1) {
            var4.method99(method951((byte) -94, var4.field220), method951((byte) -94, var4.field271), 1);
        }
        if (arg0 != -94) {
            field2024 = null;
        }
        if (var4.field270 != -1) {
            var4.method98(method951((byte) -94, var4.field270), method951((byte) -94, var4.field228), (byte) -100);
        }
        if (!class207.field3097 && var4.field286) {
            var4.field265 = class24.field393;
            var4.field279 = class216.field3324;
            var4.field248 = class1.field23;
            var4.field280 = 0;
            var4.field259 = false;
        }
        class61.field989.method941(var4, (long) arg1, -8447);
        return var4;
    }
}
