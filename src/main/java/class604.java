import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class604 {

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field8710 = 0;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lha;")
    public static class116 field8712;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method3464(int arg0) {
        if (arg0 >= -63) {
            method3465(null, 1);
        }
        field8712 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([BI)Lws;")
    public static final class532 method3465(byte[] arg0, int arg1) {
        field8713++;
        class532 var2 = new class532();
        class551 var3 = new class551(arg0);
        var3.field7707 = var3.field7693.length - 2;
        int var4 = var3.method3090(-80);
        int var5 = var3.field7693.length - var4 - 2 - 12;
        var3.field7707 = var5;
        int var6 = var3.method3048(-4);
        var2.field7422 = var3.method3090(-107);
        var2.field7426 = var3.method3090(-115);
        int var7 = 99 % ((arg1 - 53) / 61);
        var2.field7423 = var3.method3090(-125);
        var2.field7421 = var3.method3090(-126);
        int var8 = var3.method3045(-126);
        if (var8 > 0) {
            var2.field7431 = new class607[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var3.method3090(-118);
                class607 var11 = new class607(class468.method2685(var10, false));
                var2.field7431[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var3.method3048(-4);
                    int var13 = var3.method3048(-4);
                    var11.method3475(-103, new class147(var13), (long) var12);
                }
            }
        }
        var3.field7707 = 0;
        var2.field7427 = var3.method3058(8);
        var2.field7420 = new int[var6];
        var2.field7425 = new String[var6];
        var2.field7424 = new int[var6];
        int var14 = 0;
        while (var3.field7707 < var5) {
            int var15 = var3.method3090(-104);
            if (var15 == 3) {
                var2.field7425[var14] = var3.method3077(-20739).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field7420[var14] = var3.method3045(-127);
            } else {
                var2.field7420[var14] = var3.method3048(-4);
            }
            var2.field7424[var14++] = var15;
        }
        return var2;
    }
}
