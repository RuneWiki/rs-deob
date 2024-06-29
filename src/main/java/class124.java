import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class124 extends class221 {

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    private final int field2330;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    private final int field2331;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    private final int field2333;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private final int field2339;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lrd;")
    private static class173 field2329 = class133.method843("Type", 118);

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
    public static int[] field2334 = new int[5];

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Lrd;")
    public static class173 field2338 = class133.method843("<br>(X100(U(Y", 35);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lrd;")
    public static class173 field2332 = field2329;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lrd;")
    public static class173 field2335 = class133.method843(")2", -80);

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lrd;")
    public static class173 field2340 = class133.method843("null", 73);

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field2341 = 0;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
    public static int[][][] field2328;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field2332 = null;
        }
        ++field2337;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
    public static final void method799() {
        for (int var0 = 0; var0 < class108.field2023; ++var0) {
            for (int var5 = 0; var5 < class71.field1384; ++var5) {
                for (int var6 = 0; var6 < class55.field1093; ++var6) {
                    class208.field4055[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class208.field4057; ++var1) {
            for (int var4 = 0; var4 < class208.field4044[var1]; ++var4) {
                class208.field4056[var1][var4] = null;
            }
            class208.field4044[var1] = 0;
        }
        for (int var2 = 0; var2 < class191.field3742; ++var2) {
            class172.field3345[var2] = null;
        }
        class191.field3742 = 0;
        for (int var3 = 0; var3 < class181.field3553.length; ++var3) {
            class181.field3553[var3] = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V")
    public final void method399(int arg0, int arg1, byte arg2) {
        ++field2327;
        int var4 = -113 % ((-50 - arg2) / 44);
        int var5 = this.field2331 * arg0 >> 12;
        int var6 = this.field2333 * arg0 >> 12;
        int var7 = this.field2339 * arg1 >> 12;
        int var8 = this.field2330 * arg1 >> 12;
        class99.method603(var7, var8, super.field4251, var6, super.field4246, super.field4248, -4378, var5);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIII)V")
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2330 = arg3;
        this.field2331 = arg0;
        this.field2333 = arg2;
        this.field2339 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V")
    public final void method394(int arg0, int arg1, int arg2) {
        ++field2336;
        int var4 = this.field2339 * arg1 >> 12;
        int var5 = this.field2330 * arg1 >> 12;
        int var6 = this.field2333 * arg2 >> 12;
        int var7 = this.field2331 * arg2 >> 12;
        class117.method714(var7, var6, var4, super.field4248, -19433, var5);
        if (arg0 != 0) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method800(int arg0) {
        field2340 = null;
        field2329 = null;
        field2335 = null;
        field2334 = null;
        field2332 = null;
        field2328 = null;
        if (arg0 < -55) {
            field2338 = null;
        }
    }
}
