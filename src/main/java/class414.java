import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class414 implements class58 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lsd;")
    private class56 field6093;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "[I")
    public static int[] field6092 = new int[3];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZ)V")
    public final void method575(boolean arg0, boolean arg1) {
        if (arg1) {
            class364.field5573.method410(0, 0, class660.field9408, class412.field6066, this.field6093.field888, 0);
        }
        if (arg0) {
            field6095++;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIII)I")
    public static final int method2543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6096++;
        if (arg4 >= -101) {
            method2543(-72, 26, 71, -5, -124);
        }
        int var5 = 65536 - class582.field8230[arg0 * 8192 / arg2] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public static void method2544(int arg0) {
        if (arg0 != 8192) {
            field6092 = null;
        }
        field6092 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        field6094++;
        if (arg0 != -28886) {
            field6092 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZD)V")
    public static final void method2545(boolean arg0, double arg1) {
        if (class352.field5148 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class710.field9999[var3] = var4 > 255 ? 255 : var4;
            }
            class352.field5148 = arg1;
        }
        field6097++;
        if (arg0) {
            method2544(-104);
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lsd;)V")
    public class414(class56 arg0) {
        this.field6093 = arg0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Z")
    public final boolean method574(byte arg0) {
        field6091++;
        return arg0 > 96;
    }
}
