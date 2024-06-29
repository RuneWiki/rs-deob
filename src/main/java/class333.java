import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class333 implements class315 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "[F")
    public float[] field4264;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Lqk;")
    public static class148 field4266 = new class148(26, 7);

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lju;")
    public static class102 field4269 = new class102(2, 7);

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class746 var7 = (class746) class184.field2669.method1945(false);
        if (arg3 != 24935) {
            return;
        }
        while (var7 != null) {
            if (class245.field3409 >= var7.field10399) {
                var7.method1(-36);
            } else {
                class136.method886((var7.field10386 << 9) + 256, var7.field10398, (var7.field10391 << 9) + 256, true, arg6, arg4 >> 1, arg1, var7.field10395 * 2, arg0 >> 1);
                class743.field10354.method2434(arg2 + class161.field2235[0], var7.field10390 | 0xFF000000, var7.field10389, true, 0, class161.field2235[1] + arg5);
            }
            var7 = (class746) class184.field2669.method1944(arg3 - 15527);
        }
        field4263++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1928(int arg0) {
        field4268++;
        if (class213.field3004 == 7) {
            class529.method3148(0, false);
            return;
        }
        class329.field4216 = class275.field3699;
        class275.field3699 = null;
        if (arg0 == 1) {
            class647.method3754(13, true);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZIZI)Ljava/lang/String;", line = 50)
    public static final String method1929(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field4269 = null;
        }
        field4267++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - arg1 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 99)
    public static void method1930(byte arg0) {
        if (arg0 != 0) {
            field4266 = null;
        }
        field4266 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(II)V", line = 117)
    public class333(int arg0, int arg1) {
        this.field4262 = arg1;
        this.field4265 = arg0;
        this.field4264 = new float[arg0 * arg1];
    }
}
