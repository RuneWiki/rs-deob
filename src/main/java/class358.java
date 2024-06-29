import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class358 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field4803 = 1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4797 = -1;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[F")
    public static float[] field4800 = new float[16384];

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[F")
    public static float[] field4799 = new float[16384];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "C")
    public char field4801;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBLnp;)V")
    private final void method2104(int arg0, byte arg1, class115 arg2) {
        field4802++;
        if (arg0 == 1) {
            this.field4801 = class161.method876((byte) 19, arg2.method657(false));
        } else if (arg0 == 2) {
            this.field4803 = 0;
        }
        int var4 = 9 / ((-arg1 - 37) / 52);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lnp;I)V")
    public final void method2105(class115 arg0, int arg1) {
        if (arg1 < 10) {
            method2106((byte) 86);
        }
        field4798++;
        while (true) {
            int var3 = arg0.method620((byte) 30);
            if (var3 == 0) {
                return;
            }
            this.method2104(var3, (byte) 87, arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method2106(byte arg0) {
        field4799 = null;
        field4800 = null;
        if (arg0 != -57) {
            field4797 = -125;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4799[var2] = (float) Math.sin((double) var2 * var0);
            field4800[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
