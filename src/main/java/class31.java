import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field302 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lofa;I)V", line = 9)
    public static final void method174(int arg0, class347[] arg1, int arg2) {
        int var3 = 0;
        if (arg2 > -23) {
            return;
        }
        while (arg1.length > var3) {
            class347 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4884 == 0) {
                    if (var4.field4928 != null) {
                        method174(arg0, var4.field4928, -105);
                    }
                    class73 var5 = (class73) class355.field5178.method1248(86, (long) var4.field5003);
                    if (var5 != null) {
                        class208.method1359(-13540, var5.field985, arg0);
                    }
                }
                if (arg0 == 0 && var4.field4895 != null) {
                    class158 var6 = new class158();
                    var6.field2137 = var4;
                    var6.field2128 = var4.field4895;
                    class727.method4005(var6);
                }
                if (arg0 == 1 && var4.field4974 != null) {
                    label62: {
                        if (var4.field4955 >= 0) {
                            class347 var7 = class445.method2655(var4.field5003, (byte) 109);
                            if (var7 == null || var7.field4928 == null || var7.field4928.length <= var4.field4955 || var7.field4928[var4.field4955] != var4) {
                                break label62;
                            }
                        }
                        class158 var8 = new class158();
                        var8.field2137 = var4;
                        var8.field2128 = var4.field4974;
                        class727.method4005(var8);
                    }
                }
            }
            var3++;
        }
        field303++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZI)V", line = 81)
    public static final void method175(int arg0, boolean arg1, int arg2) {
        if (arg2 >= -47) {
            method175(105, true, 90);
        }
        field304++;
        if (arg1) {
            class43 var3 = class492.method2903(class311.field4398, 0, class73.field983);
            var3.field457.method1733(arg0, -32466);
            class409.method2457((byte) -100, var3);
        } else {
            class727.method4014(class654.field8809, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 107)
    public static void method176(int arg0) {
        int var1 = -48 % ((arg0 + 28) / 36);
        field302 = null;
    }
}
