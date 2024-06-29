import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class400 {

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "Lvh;")
    public class361 field5965 = new class361();

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field5967 = 0;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "Lvh;")
    private class361 field5972;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Lvd;")
    public static class39 field5963;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(FI[BIFIILoia;FFIIFI)V")
    public static final void method2537(float arg0, int arg1, byte[] arg2, int arg3, float arg4, int arg5, int arg6, class89 arg7, float arg8, float arg9, int arg10, int arg11, float arg12, int arg13) {
        field5970++;
        int var14 = arg10 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            arg7.method721(arg12 / (float) arg10, arg10, arg9 / (float) arg5, var15, arg5, arg8 * 127.0F, -13046, arg11, arg4 / (float) arg13, arg13, 0);
            int var19 = arg3;
            arg8 = arg0 * arg8;
            for (int var20 = 0; var20 < var14; var20++) {
                arg2[var19] = (byte) ((int) ((float) arg2[var19] + var15[var20]));
                var19++;
            }
            arg12 *= 2.0F;
            arg4 *= 2.0F;
            arg9 *= 2.0F;
        }
        int var17 = arg3;
        for (int var18 = arg6; var18 < var14; var18++) {
            arg2[var17] = (byte) (arg2[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Lvh;")
    public final class361 method2538(int arg0) {
        if (arg0 != -18526) {
            this.field5972 = null;
        }
        field5968++;
        class361 var2 = this.field5965.field5222;
        if (this.field5965 == var2) {
            this.field5972 = null;
            return null;
        } else {
            this.field5972 = var2.field5222;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lvh;I)V")
    public final void method2539(class361 arg0, int arg1) {
        field5971++;
        if (arg0.field5227 != null) {
            arg0.method2247(0);
        }
        arg0.field5222 = this.field5965;
        arg0.field5227 = this.field5965.field5227;
        if (arg1 != 0) {
            method2537(1.4062661F, 78, null, -81, 0.93681884F, 83, 73, null, -1.4793826F, 1.729592F, 28, -42, -0.32372338F, -45);
        }
        arg0.field5227.field5222 = arg0;
        arg0.field5222.field5227 = arg0;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
    public final int method2540(int arg0) {
        field5962++;
        int var2 = arg0;
        for (class361 var3 = this.field5965.field5222; var3 != this.field5965; var3 = var3.field5222) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
    public static final void method2541(byte arg0) {
        if (arg0 != -122) {
            method2542(-4L, null, 115);
        }
        field5964++;
        class228.field3349 = 0;
        class421.field6284 = 0;
        class420.field6278 = 0;
        class49.field699 = 0;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(JLha;I)V")
    public static final void method2542(long arg0, class60 arg1, int arg2) {
        class637.field8950 = class515.field7306;
        class274.field3893 = 0;
        class285.field4052 = 0;
        field5961++;
        class515.field7306 = 0;
        if (arg2 != -2682) {
            method2543(-102);
        }
        long var4 = class524.method3075(18);
        for (class626 var6 = (class626) class493.field7031.method1615((byte) 126); var6 != null; var6 = (class626) class493.field7031.method1625(-125)) {
            if (var6.method3616(arg1, arg0)) {
                class285.field4052++;
            }
        }
        if (class508.field7237 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class493.field7031.method1622(0) + ", running: " + class285.field4052);
            System.out.println("Emitters: " + class274.field3893 + " Particles: " + class515.field7306 + ". Time taken: " + (class524.method3075(18) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)V")
    public static void method2543(int arg0) {
        if (arg0 != -24565) {
            method2542(82L, null, 40);
        }
        field5963 = null;
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
    public final void method2544(int arg0) {
        while (true) {
            class361 var2 = this.field5965.field5222;
            if (this.field5965 == var2) {
                field5973++;
                this.field5972 = null;
                int var3 = -119 % ((arg0 - 32) / 33);
                return;
            }
            var2.method2247(0);
        }
    }

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)Lvh;")
    public final class361 method2545(int arg0) {
        field5966++;
        class361 var2 = this.field5972;
        if (this.field5965 == var2) {
            this.field5972 = null;
            return null;
        }
        if (arg0 != -13332) {
            method2543(62);
        }
        this.field5972 = var2.field5222;
        return var2;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "()V")
    public class400() {
        this.field5965.field5227 = this.field5965;
        this.field5965.field5222 = this.field5965;
    }
}
