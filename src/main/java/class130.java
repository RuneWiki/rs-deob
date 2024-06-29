import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class130 extends class594 implements class524 {

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "Lsb;")
    public static class266 field2349 = new class266(72, -1);

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field2349 = null;
        if (arg0 >= -118) {
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBLas;)V")
    public static final void method1098(int arg0, byte arg1, class138 arg2) {
        ++field2347;
        if (~class132.field2373 > -51) {
            if (arg2 != null && arg2.field2430 != null && arg2.field2430.length > arg0 && arg2.field2430[arg0] != null) {
                int var3 = arg2.field2430[arg0][0];
                int var4 = var3 >> 8;
                if (~arg2.field2430[arg0].length < -2) {
                    int var5 = (int) (Math.random() * (double) arg2.field2430[arg0].length);
                    if (~var5 < -1) {
                        var4 = arg2.field2430[arg0][var5];
                    }
                }
                int var6 = (245 & var3) >> 5;
                if (arg2.field2451) {
                    class500.method2982(255, 0, 0, false, var6, var4);
                } else {
                    class56.method651(255, arg1 ^ -7473, 0, var6, var4);
                }
                if (arg1 != 88) {
                    field2350 = -62;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([[II)V")
    public static final void method1099(int[][] arg0, int arg1) {
        if (arg1 != -7) {
            method1100((byte) -78);
        }
        class582.field8429 = arg0;
        ++field2346;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)V")
    public static final void method1100(byte arg0) {
        int var1 = -12 % ((-72 - arg0) / 45);
        ++field2348;
        int var2 = 0;
        if (class527.field7429 != null) {
            var2 = class527.field7429.method2822((byte) 54, class90.field1654);
        }
        if (~var2 == -3) {
            int var3 = class513.field7237 > 800 ? 800 : class513.field7237;
            class506.field7173 = var3;
            class594.field8553 = (-var3 + class513.field7237) / 2;
            int var4 = ~class193.field3033 < -601 ? 600 : class193.field3033;
            class310.field4626 = var4;
            class139.field2459 = 0;
        } else if (~var2 == -2) {
            int var5 = class513.field7237 > 1024 ? 1024 : class513.field7237;
            class594.field8553 = (class513.field7237 - var5) / 2;
            class506.field7173 = var5;
            int var6 = ~class193.field3033 >= -769 ? class193.field3033 : 768;
            class310.field4626 = var6;
            class139.field2459 = 0;
        } else {
            class139.field2459 = 0;
            class506.field7173 = class513.field7237;
            class310.field4626 = class193.field3033;
            class594.field8553 = 0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljq;IZ[[I)V")
    public class130(class475 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class121.field2214, class2.field372, arg1 * arg1 * 6, arg2);
        super.field8555.method3266(-2, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method3387(-3), arg1, arg1, 0, class635.method3618(super.field8543, 1), super.field8555.field6838, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method3386(arg1, var6 + 34069, 0, arg1, arg3[var6]);
            }
        }
    }
}
