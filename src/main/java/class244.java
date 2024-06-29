import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class244 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Lma;")
    public static class5[] field4048 = new class5[200];

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lma;")
    private static class5 field4047 = class12.method119("Hidden", (byte) 70);

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[I")
    public static int[] field4053 = new int[1000];

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lma;")
    public static class5 field4046 = field4047;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lii;")
    public static class221 field4045;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZI)Lma;", line = 8)
    public static final class5 method1711(int arg0, int arg1, boolean arg2, int arg3) {
        field4044++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = arg1 / arg3;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg3;
            var5++;
        }
        int var6 = var5;
        if (arg1 < 0 || arg2) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg1 % arg3;
            arg1 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class5 var10 = new class5();
        var10.field72 = var6;
        var10.field57 = var7;
        if (arg0 != 30995) {
            field4052 = 113;
        }
        return var10;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V", line = 74)
    public static final void method1712(int arg0, Object[] arg1, int[] arg2) {
        if (arg0 < 18) {
            method1714(-5, (class56[]) null);
        }
        field4050++;
        class151.method948(0, arg2.length - 1, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lhf;I)[Lb;", line = 87)
    public static final class129[] method1713(class154 arg0, int arg1) {
        field4051++;
        if (!arg0.method977(11)) {
            return new class129[0];
        }
        class32 var2 = arg0.method983(-104);
        while (var2.field497 == 0) {
            class116.method759(-1, 10L);
        }
        if (var2.field497 == 2) {
            return new class129[0];
        } else if (arg1 >= -94) {
            return (class129[]) null;
        } else {
            int[] var3 = (int[]) ((int[]) var2.field496);
            class129[] var4 = new class129[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class129 var6 = new class129();
                var4[var5] = var6;
                var6.field1935 = var3[var5 << 2];
                var6.field1939 = var3[(var5 << 2) + 1];
                var6.field1942 = var3[(var5 << 2) + 2];
                var6.field1930 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[Lwh;)V", line = 136)
    public static final void method1714(int arg0, class56[] arg1) {
        class280.field4749[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 149)
    public static void method1715(int arg0) {
        field4047 = null;
        field4048 = null;
        if (arg0 != 406766978) {
            field4045 = (class221) null;
        }
        field4045 = null;
        field4046 = null;
        field4053 = null;
    }
}
