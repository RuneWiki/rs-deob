import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class790 {

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Lgj;")
    private class662 field10830;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public int field10827;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "Z")
    public static boolean field10829 = false;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field10826;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Lgj;")
    public static class662 field10828;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 5)
    public static void method4311(int arg0) {
        field10828 = null;
        if (arg0 != 0) {
            method4312(null, false);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Luv;Z)I", line = 26)
    public static final int method4312(class385 arg0, boolean arg1) {
        field10826++;
        if (arg0.field5225 == 0) {
            return 0;
        }
        if (arg0.field5286 != -1) {
            class385 var2 = null;
            if (arg0.field5286 < 32768) {
                class755 var3 = (class755) class664.field9216.method337((long) arg0.field5286, 1);
                if (var3 != null) {
                    var2 = var3.field10414;
                }
            } else if (arg0.field5286 >= 32768) {
                var2 = class527.field7150[arg0.field5286 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field7396 - var2.field7396;
                int var5 = arg0.field7398 - var2.field7398;
                if (var4 != 0 || var5 != 0) {
                    arg0.method2332((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, 7416);
                }
            }
        }
        if (arg0 instanceof class771) {
            class771 var6 = (class771) arg0;
            if (var6.field10633 != -1 && (var6.field5307 == 0 || var6.field5309 > 0)) {
                var6.method2332(var6.field10633, 7416);
                var6.field10633 = -1;
            }
        } else if (arg0 instanceof class666) {
            class666 var7 = (class666) arg0;
            if (var7.field9237 != -1 && (var7.field5307 == 0 || var7.field5309 > 0)) {
                int var8 = var7.field7396 - ((var7.field9237 - class217.field3198 - class217.field3198) * 256);
                int var9 = var7.field7398 - ((var7.field9258 - (class400.field5510 + class400.field5510)) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method2332((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, 7416);
                }
                var7.field9237 = -1;
            }
        }
        return arg1 ? 93 : arg0.method2344(16383);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 120)
    public class790(class598 arg0, int arg1, class662 arg2) {
        new class43(64);
        this.field10830 = arg2;
        this.field10827 = this.field10830.method3730((byte) -104, 15);
    }
}
