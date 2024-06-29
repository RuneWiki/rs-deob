import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class223 {

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lhh;")
    public static class163 field4060 = null;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lhh;")
    public static class163 field4059 = class137.method1065("Ablegen", 17);

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Lhh;")
    private static class163 field4064 = class137.method1065("Loaded textures", 17);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lhh;")
    public static class163 field4057 = field4064;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lmi;")
    public static class128 field4058 = new class128();

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lhh;")
    public static class163 field4068 = class137.method1065("gr-Un:", 17);

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field4066 = 7759444;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "[I")
    public static int[] field4069 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lhh;")
    public static class163 field4067 = class137.method1065("M", 17);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lhh;")
    public class163 field4063;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    public boolean field4056;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "[[B")
    public static byte[][] field4070;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILgj;)I")
    public static final int method1574(int arg0, class126 arg1) {
        field4055++;
        if (arg0 != 11770) {
            field4066 = 65;
        }
        int var2 = arg1.field2439;
        if (arg1.field3670 == arg1.field3664) {
            var2 = arg1.field2434;
        } else if (arg1.field3664 == arg1.field3638) {
            var2 = arg1.field2452;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1575(byte arg0) {
        field4067 = null;
        field4057 = null;
        field4064 = null;
        field4058 = null;
        field4059 = null;
        field4060 = null;
        int var1 = -49 % ((arg0 - 36) / 52);
        field4070 = null;
        field4068 = null;
        field4069 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static final void method1576(byte arg0) {
        class250.field4400.method120((byte) -107);
        if (arg0 <= -26) {
            field4052++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
    public static final int method1577(int arg0, int arg1, int arg2) {
        int var3 = class111.method889((byte) 9, arg0 + 45365, 4, arg1 + 91923) - (-(class111.method889((byte) 9, arg0 - -10294, 2, arg1 + 37821) + -128 >> 1) - (class111.method889((byte) 9, arg0, 1, arg1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field4051++;
        if (arg2 > var4) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static final void method1578(boolean arg0) {
        if (class46.field775 == null || class26.field412 == null) {
            class46.field775 = new int[256];
            class26.field412 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class46.field775[var1] = (int) (Math.sin(var2) * 4096.0D);
                class26.field412[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            method1576((byte) -61);
        }
        field4062++;
    }
}
