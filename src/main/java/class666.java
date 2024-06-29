import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class666 {

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lgca;")
    private class227 field9329;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "Z")
    public static boolean field9333 = true;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "Lrp;")
    private class401 field9332;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "[[B")
    public static byte[][] field9327;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method3761(int arg0) {
        field9327 = null;
        if (arg0 != 0) {
            field9335 = 15;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lgca;Z)V")
    public final void method3762(class227 arg0, boolean arg1) {
        field9328++;
        if (!arg1) {
            field9335 = -7;
        }
        this.field9329 = arg0;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3763(int arg0, int arg1, String arg2) {
        field9331++;
        int var3 = class528.field7160;
        int[] var4 = class439.field6091;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class677 var7 = class671.field9407[var4[var6]];
            if (var7 != null && class143.field2063 != var7 && var7.field9693 != null && var7.field9693.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class553.field7456++;
                    class352 var12 = class290.method1786(98, class199.field2836, class524.field7114);
                    var12.field4686.method2822(0, (byte) 113);
                    var12.field4686.method2837(var4[var6], -2);
                    class602.method3388(var12, (byte) 28);
                } else if (arg0 == 4) {
                    class198.field2801++;
                    class352 var8 = class290.method1786(98, class199.field2836, class622.field8637);
                    var8.field4686.method2833(false, 0);
                    var8.field4686.method2837(var4[var6], -2);
                    class602.method3388(var8, (byte) 28);
                } else if (arg0 == 5) {
                    class209.field2957++;
                    class352 var11 = class290.method1786(98, class199.field2836, class64.field755);
                    var11.field4686.method2812(42, var4[var6]);
                    var11.field4686.method2822(0, (byte) 124);
                    class602.method3388(var11, (byte) 28);
                } else if (arg0 == 6) {
                    class562.field7589++;
                    class352 var9 = class290.method1786(98, class199.field2836, class558.field7531);
                    var9.field4686.method2823(var4[var6], -96);
                    var9.field4686.method2817(0, true);
                    class602.method3388(var9, (byte) 28);
                } else if (arg0 == 7) {
                    class611.field8474++;
                    class352 var10 = class290.method1786(98, class199.field2836, class169.field2460);
                    var10.field4686.method2818(var4[var6], -27787);
                    var10.field4686.method2822(0, (byte) 119);
                    class602.method3388(var10, (byte) 28);
                }
                break;
            }
        }
        int var13 = 15 % ((arg1 - 29) / 34);
        if (!var5) {
            class114.method819((byte) -96, 4, class65.field809.method555(class697.field9900, true) + arg2);
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Lrp;")
    public final class401 method3764(int arg0) {
        if (arg0 != -21495) {
            this.method3764(-57);
        }
        field9330++;
        class401 var2 = this.field9332;
        if (this.field9329.field3151 == var2) {
            this.field9332 = null;
            return null;
        } else {
            this.field9332 = var2.field5625;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Lrp;")
    public final class401 method3765(int arg0) {
        if (arg0 != -1968) {
            this.method3764(108);
        }
        field9334++;
        class401 var2 = this.field9329.field3151.field5625;
        if (this.field9329.field3151 == var2) {
            this.field9332 = null;
            return null;
        } else {
            this.field9332 = var2.field5625;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
    public class666() {
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lgca;)V")
    public class666(class227 arg0) {
        this.field9329 = arg0;
    }
}
