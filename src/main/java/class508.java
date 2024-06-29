import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class508 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Luf;")
    public static class310 field7460 = new class310(33, -2);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFLav;IBFFIFIF)[B")
    public static final byte[] method2985(int arg0, float arg1, class451 arg2, int arg3, byte arg4, float arg5, float arg6, int arg7, float arg8, int arg9, float arg10) {
        field7461++;
        if (arg4 <= 78) {
            method2988(75L, (byte) -60, null);
        }
        byte[] var11 = new byte[arg3 * arg9 * arg0];
        class44.method280(arg0, arg2, arg6, (byte) 122, arg7, arg10, arg9, 0, var11, arg5, arg8, arg1, arg3);
        return var11;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZIIB)I")
    public static final int method2986(boolean arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 115) {
            return 98;
        }
        field7462++;
        class113 var4 = class223.method1313(arg0, Integer.MIN_VALUE, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field1529.length > arg2) {
            return var4.field1529[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method2987(int arg0, int arg1, int arg2, boolean arg3) {
        field7463++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg1 >= 0) {
            int var4 = arg0;
            int var5 = arg1 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - (arg1 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(JBLqa;)V")
    public static final void method2988(long arg0, byte arg1, class162 arg2) {
        field7465++;
        class418.field6113 = class119.field1620;
        class282.field3810 = 0;
        class119.field1620 = 0;
        long var4 = class333.method1850(arg1 ^ 0xFFFFF233);
        for (class206 var6 = (class206) class297.field4104.method2306(arg1 + 87); var6 != null; var6 = (class206) class297.field4104.method2302(-114)) {
            if (var6.method1250(arg2, arg0)) {
                class282.field3810++;
            }
        }
        if (class66.field918 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class297.field4104.method2307(0) + ", running: " + class282.field3810 + ". Particles: " + class119.field1620 + ". Time taken: " + (class333.method1850(-3562) - var4) + "ms");
        }
        if (arg1 != 37) {
            method2987(-85, 78, 95, true);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public static void method2989(boolean arg0) {
        if (!arg0) {
            field7460 = null;
        }
        field7460 = null;
    }
}
