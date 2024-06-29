import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class617 {

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lwf;")
    private class117 field9125 = new class117(16);

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lkda;")
    private class328 field9121;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field9123 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    public static int[] field9118 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Z")
    public static boolean field9126 = false;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method3613(byte arg0) {
        field9118 = null;
        if (arg0 < 42) {
            method3617(1.0519049F, 1.226408F, false, -89, 0.4975593F);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method3614(int arg0) {
        class117 var2 = this.field9125;
        synchronized (this.field9125) {
            this.field9125.method846(0);
        }
        int var3 = 126 % ((40 - arg0) / 62);
        field9120++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)Lgr;")
    public final class369 method3615(int arg0, boolean arg1) {
        field9117++;
        class117 var3 = this.field9125;
        class369 var4;
        synchronized (this.field9125) {
            var4 = (class369) this.field9125.method842(0, (long) arg0);
        }
        if (!arg1) {
            this.method3614(111);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field9121;
        byte[] var6;
        synchronized (this.field9121) {
            var6 = this.field9121.method1966(arg0, 30, arg1);
        }
        class369 var7 = new class369();
        if (var6 != null) {
            var7.method2210(new class148(var6), -10);
        }
        class117 var8 = this.field9125;
        synchronized (this.field9125) {
            this.field9125.method835((byte) 124, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
    public final void method3616(int arg0, byte arg1) {
        field9127++;
        if (arg1 == 115) {
            class117 var3 = this.field9125;
            synchronized (this.field9125) {
                this.field9125.method834(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFZIF)F")
    public static final float method3617(float arg0, float arg1, boolean arg2, int arg3, float arg4) {
        field9124++;
        float[] var5 = class44.field530[arg3];
        if (!arg2) {
            method3613((byte) 2);
        }
        return var5[2] * arg1 + var5[0] * arg4 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkda;Lkda;ILkda;Lkda;)V")
    public static final void method3618(class328 arg0, class328 arg1, int arg2, class328 arg3, class328 arg4) {
        class55.field649 = arg4;
        class39.field474 = arg0;
        field9122++;
        if (arg2 != 99) {
            method3618(null, null, 31, null, null);
        }
        class282.field3951 = arg3;
        class169.field2636 = arg1;
        class302.field4135 = new class162[class169.field2636.method1974(arg2 - 8687)][];
        class438.field5854 = new boolean[class169.field2636.method1974(-8588)];
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class617(class39 arg0, int arg1, class328 arg2) {
        this.field9121 = arg2;
        this.field9121.method1975(104, 30);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public final void method3619(byte arg0) {
        if (arg0 <= 54) {
            field9118 = null;
        }
        field9119++;
        class117 var2 = this.field9125;
        synchronized (this.field9125) {
            this.field9125.method837(125);
        }
    }
}
