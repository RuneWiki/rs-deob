import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class541 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
    public static int[] field6806 = new int[16384];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public static int[] field6805 = new int[16384];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6804;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6805[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field6806[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 3)
    public static void method2943(byte arg0) {
        field6806 = null;
        int var1 = 15 % ((-arg0 - 21) / 33);
        field6805 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 15)
    public static final void method2944() {
        for (int var0 = 0; var0 < class100.field1332; var0++) {
            class620 var1 = class757.field10327[var0];
            class366.method2103(var1, true);
            class757.field10327[var0] = null;
        }
        class100.field1332 = 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V", line = 28)
    public static final void method2945(int arg0, boolean arg1) {
        field6803++;
        class384.field4796++;
        class13 var2 = class659.method3587(class68.field909, 98, class740.field10016);
        class116.method679(var2, 0);
        if (arg0 != -20621) {
            return;
        }
        for (class278 var3 = (class278) class149.field1895.method2610((byte) -82); var3 != null; var3 = (class278) class149.field1895.method2620(0)) {
            if (!var3.method1942(27475)) {
                var3 = (class278) class149.field1895.method2610((byte) -54);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field3613 == 0) {
                class24.method107((byte) -105, var3, true, arg1);
            }
        }
        if (class165.field2182 != null) {
            class776.method4255(class165.field2182, arg0 + 19614);
            class165.field2182 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIB)Ltea;", line = 73)
    public static final class589 method2946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6804++;
        long var7 = (long) arg5 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg0 * 97549L ^ (long) arg1 * 67481L ^ (long) arg3 * 475427L ^ (long) arg4 * 76724863L;
        class589 var9 = (class589) class311.field3893.method2931(var7, (byte) -113);
        if (var9 == null) {
            class589 var10 = class702.field9291.method956(arg1, arg0, arg3, arg2, arg5, arg4);
            class311.field3893.method2918(var7, var10, 95);
            return arg6 <= 69 ? null : var10;
        } else {
            return var9;
        }
    }
}
