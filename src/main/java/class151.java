import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class151 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lnh;")
    public static class54 field2644 = new class54(30);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "S")
    public static short field2647 = 256;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lcf;")
    private static class93 field2649 = class147.method1066("level: ", -48);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lcf;")
    public static class93 field2645 = field2649;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lcf;")
    private static class93 field2653 = class147.method1066("flash3:", -48);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lcf;")
    public static class93 field2646 = field2653;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lcf;")
    public static class93 field2651 = field2653;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[[[I")
    public static int[][][] field2652;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2642++;
        int var9 = arg5 - arg4;
        int var10 = arg8 - arg1;
        int var11 = (arg2 - arg6 << 16) / var9;
        int var12 = (arg0 - arg3 << 16) / var10;
        class144.method1044(arg6, arg1, var12, arg3, arg4, arg7, arg5, var11, 0, arg8, -19299);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1085(byte arg0) {
        if (arg0 != 2) {
            method1085((byte) -3);
        }
        field2653 = null;
        field2645 = null;
        field2646 = null;
        field2649 = null;
        field2652 = null;
        field2644 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILhg;)Lvi;")
    public static final class191 method1086(int arg0, int arg1, class177 arg2) {
        if (arg0 >= -126) {
            field2651 = null;
        }
        field2648++;
        byte[] var3 = arg2.method1264(101, arg1);
        return var3 == null ? null : new class191(var3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
    public static final int method1087(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field2641++;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == arg1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLuf;)V")
    public static final void method1088(byte arg0, class173 arg1) {
        short var2 = 256;
        field2643++;
        for (int var3 = 0; var3 < class222.field4002.length; var3++) {
            class222.field4002[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class222.field4002[var16] = (int) (Math.random() * 284.0D);
        }
        int var5 = 0;
        if (arg0 < 2) {
            return;
        }
        while (var5 < 20) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class31.field494[var15] = (class222.field4002[var15 + 1] + class222.field4002[var15 - 1] + class222.field4002[var15 - 128] + class222.field4002[var15 - -128]) / 4;
                }
            }
            int[] var13 = class222.field4002;
            class222.field4002 = class31.field494;
            class31.field494 = var13;
            var5++;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3538; var7++) {
            for (int var8 = 0; var8 < arg1.field3541; var8++) {
                if (arg1.field3019[var6++] != 0) {
                    int var9 = var7 + arg1.field3529 + 16;
                    int var10 = var8 + arg1.field3526 + 16;
                    int var11 = (var9 << 7) + var10;
                    class222.field4002[var11] = 0;
                }
            }
        }
    }
}
