import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class141 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lhh;")
    private static class163 field2694 = class137.method1065("glow3:", 17);

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lhh;")
    public static class163 field2691 = field2694;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lhh;")
    public static class163 field2692 = field2694;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIII)V")
    public static final void method1081(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class49.field829 = arg0;
        if (arg2 >= -25) {
            method1081(14, -120, (byte) 41, -7, 39, 59);
        }
        class46.field772 = arg1;
        field2690++;
        class219.field3983 = arg4;
        class262.field4581 = arg5;
        class10.field162 = arg3;
        if (class46.field772 >= 100) {
            int var6 = class262.field4581 * 128 + 64;
            int var7 = class10.field162 * 128 + 64;
            int var8 = class127.method1011(var7, var6, class20.field323, 29908) - class219.field3983;
            int var9 = var6 - class123.field2367;
            int var10 = var8 - class191.field3490;
            int var11 = var7 - class88.field1636;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class13.field201 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class63.field1072 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class13.field201 < 128) {
                class13.field201 = 128;
            }
            if (class13.field201 > 383) {
                class13.field201 = 383;
            }
        }
        class5.field99 = 2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
    public static final int method1082(int arg0, byte arg1) {
        field2695++;
        if (arg1 >= -27) {
            field2692 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static void method1083(boolean arg0) {
        field2691 = null;
        field2694 = null;
        if (arg0) {
            method1082(-46, (byte) 28);
        }
        field2692 = null;
    }
}
