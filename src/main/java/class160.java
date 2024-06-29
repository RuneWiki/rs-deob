import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class160 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lkf;")
    public static class212 field2692 = new class212(5000);

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
    public static boolean field2698 = false;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Lve;")
    public static class255 field2705 = class87.method607(35, "<)4col>");

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Lve;")
    private static class255 field2708 = class87.method607(97, "white:");

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lve;")
    public static class255 field2707 = class87.method607(75, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lve;")
    public static class255 field2706 = class87.method607(72, "Cache:");

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lve;")
    public static class255 field2697 = field2708;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lve;")
    public static class255 field2704 = field2708;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "Lve;")
    public static class255 field2710 = class87.method607(107, "Fallen lassen");

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "[I")
    public static int[] field2711 = new int[256];

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lfb;")
    public static class54 field2696;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[I")
    public static int[] field2709;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "[[[B")
    public static byte[][][] field2700;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILme;JZ)V", line = 5)
    public static final void method1162(int arg0, int arg1, int arg2, int arg3, class177 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class304 var8 = new class304();
        var8.field5194 = arg4;
        var8.field5203 = arg1 * 128 + 64;
        var8.field5195 = arg2 * 128 + 64;
        var8.field5196 = arg3;
        var8.field5200 = arg5;
        var8.field5197 = arg6;
        if (class118.field1984[arg0][arg1][arg2] == null) {
            class118.field1984[arg0][arg1][arg2] = new class249(arg0, arg1, arg2);
        }
        class118.field1984[arg0][arg1][arg2].field4184 = var8;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2694++;
        for (int var5 = arg0; var5 < class279.field4784; var5++) {
            if ((class49.field745[var5] + class247.field4147[var5]) > arg3 && class247.field4147[var5] < arg3 + arg4 && arg2 < (class271.field4679[var5] + class10.field146[var5]) && class271.field4679[var5] < (arg2 + arg1)) {
                class236.field3931[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 50)
    public static void method1164(byte arg0) {
        field2706 = null;
        if (arg0 != -115) {
            method1164((byte) -20);
        }
        field2704 = null;
        field2710 = null;
        field2707 = null;
        field2696 = null;
        field2700 = (byte[][][]) null;
        field2692 = null;
        field2697 = null;
        field2711 = null;
        field2708 = null;
        field2709 = null;
        field2705 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIB)I", line = 85)
    public static final int method1165(byte[] arg0, int arg1, byte arg2) {
        field2712++;
        return arg2 >= -32 ? 66 : class114.method874(arg1, -856902136, arg0, 0);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(III)V", line = 97)
    public class160(int arg0, int arg1, int arg2) {
        this.field2693 = arg1;
        this.field2699 = arg2;
        this.field2695 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public abstract void method160(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V")
    public abstract void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)V")
    public abstract void method163(byte arg0, int arg1, int arg2);
}
