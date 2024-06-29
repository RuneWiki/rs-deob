import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class187 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "[I")
    public static int[] field2930 = new int[1000];

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lau;")
    public static class692 field2932 = new class692();

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Lmo;")
    public static class482 field2933 = new class482(8);

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lufa;Z)V", line = 8)
    public static final void method1330(class141 arg0, boolean arg1) {
        field2929++;
        boolean var2 = false;
        if (class148.field2508 == arg0.field2376 || arg0.field2371 == -1 || arg0.field2378 != 0) {
            var2 = true;
        } else {
            class606 var3 = class480.field6871.method1417(-3585, arg0.field2371);
            if (var3.field8703 || (arg0.field2423 + 1) > var3.field8699[arg0.field2444]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field2376 - arg0.field2413;
            int var5 = class148.field2508 - arg0.field2413;
            int var6 = arg0.field2408 * 512 + arg0.method1108(94) * 256;
            int var7 = arg0.field2447 * 512 + arg0.method1108(93) * 256;
            int var8 = arg0.field2394 * 512 + arg0.method1108(79) * 256;
            int var9 = arg0.field2430 * 512 + arg0.method1108(81) * 256;
            arg0.field3154 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field3155 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        if (!arg1) {
            method1330(null, true);
        }
        arg0.field2460 = 0;
        if (arg0.field2380 == 0) {
            arg0.method1109(false, 8192, (byte) 101);
        }
        if (arg0.field2380 == 1) {
            arg0.method1109(false, 12288, (byte) 85);
        }
        if (arg0.field2380 == 2) {
            arg0.method1109(false, 0, (byte) 88);
        }
        if (arg0.field2380 == 3) {
            arg0.method1109(false, 4096, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 75)
    public static void method1331(int arg0) {
        field2933 = null;
        field2930 = null;
        field2932 = null;
        if (arg0 != -18522) {
            method1330(null, true);
        }
    }
}
