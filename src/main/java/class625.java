import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class625 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
    public static float field8839;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)I")
    public static final int method3515(byte arg0, int arg1, int arg2) {
        field8838++;
        int var3 = -115 % ((arg0 - 20) / 41);
        if (arg1 == -1) {
            return 12345678;
        }
        int var4 = (arg1 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILnp;)Lqt;")
    public static final class403 method3516(int arg0, class115 arg1) {
        int var2 = -16 / ((-arg0 - 65) / 52);
        field8836++;
        class403 var3 = new class403();
        var3.field5400 = arg1.method643((byte) -77);
        var3.field5396 = class83.field859.method2211(var3.field5400, -27582);
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final void method3517(int arg0) {
        if (arg0 == 1) {
            field8841++;
            class692.field9718.method3667(5488);
            class407.field5438.method3667(5488);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final void method3518(int arg0) {
        if (arg0 != 0) {
            field8839 = 1.8139884F;
        }
        field8837++;
        if (class215.field2608 != null && class609.field8517 != null) {
            return;
        }
        class215.field2608 = new int[256];
        class609.field8517 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class215.field2608[var1] = (int) (Math.sin(var2) * 4096.0D);
            class609.field8517[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
    public static final void method3519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8840++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class266.method1567(class412.field5526, true, class72.field740, arg1 + arg3);
        int var10 = class266.method1567(class412.field5526, true, class72.field740, arg1 - arg3);
        class315.method1809(class557.field7954[arg0], arg2, -128, var10, var9);
        if (arg4 != -13377) {
            return;
        }
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class93.field949 && class360.field4834 >= var11) {
                    int var13 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var5);
                    int var14 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var5);
                    if (var12 <= class360.field4834) {
                        class315.method1809(class557.field7954[var12], arg2, arg4 ^ 0x343F, var14, var13);
                    }
                    if (var11 >= class93.field949) {
                        class315.method1809(class557.field7954[var11], arg2, arg4 ^ 0x343F, var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class93.field949 && class360.field4834 >= var15) {
                int var17 = class266.method1567(class412.field5526, true, class72.field740, arg1 + var6);
                int var18 = class266.method1567(class412.field5526, true, class72.field740, arg1 - var6);
                if (var16 <= class360.field4834) {
                    class315.method1809(class557.field7954[var16], arg2, -128, var18, var17);
                }
                if (var15 >= class93.field949) {
                    class315.method1809(class557.field7954[var15], arg2, arg4 ^ 0x343F, var18, var17);
                }
            }
        }
    }
}
