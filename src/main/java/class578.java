import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class578 extends class416 {

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "Z")
    public volatile boolean field7580 = true;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "F")
    public static float field7586 = 1024.0F;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Z")
    public boolean field7581;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Z")
    public boolean field7583;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/awt/Component;BLkk;)Luu;")
    public static final class289 method3168(int arg0, int arg1, Component arg2, byte arg3, class192 arg4) {
        field7585++;
        if (class405.field5646 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class289 var5 = (class289) Class.forName("cu").getDeclaredConstructor().newInstance();
                var5.field4106 = new int[(class27.field430 ? 2 : 1) * 256];
                var5.field4135 = arg1;
                var5.method1422(arg2);
                var5.field4124 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field4124 > 16384) {
                    var5.field4124 = 16384;
                }
                var5.method1420(var5.field4124);
                if (class382.field5306 > 0 && class682.field9523 == null) {
                    class682.field9523 = new class559();
                    class682.field9523.field7359 = arg4;
                    arg4.method1311(class682.field9523, class382.field5306, arg3 ^ 0x1B);
                }
                if (class682.field9523 != null) {
                    if (class682.field9523.field7353[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class682.field9523.field7353[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class590 var6 = new class590(arg4, arg0);
                    var6.field4135 = arg1;
                    var6.field4106 = new int[(class27.field430 ? 2 : 1) * 256];
                    var6.method1422(arg2);
                    var6.field4124 = 16384;
                    var6.method1420(var6.field4124);
                    if (arg3 != 27) {
                        return null;
                    }
                    if (class382.field5306 > 0 && class682.field9523 == null) {
                        class682.field9523 = new class559();
                        class682.field9523.field7359 = arg4;
                        arg4.method1311(class682.field9523, class382.field5306, 0);
                    }
                    if (class682.field9523 != null) {
                        if (class682.field9523.field7353[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class682.field9523.field7353[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class289();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
    public static final boolean method3169(int arg0) {
        field7582++;
        if (class15.field215 < 1) {
            return false;
        } else {
            int var1 = -102 % ((arg0 + 3) / 56);
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
    public abstract int method3170(int arg0);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)[B")
    public abstract byte[] method3171(int arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method3172(int arg0, int arg1, boolean arg2, int arg3) {
        field7584++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg0 != 256) {
            field7586 = 0.06669602F;
        }
        if (!arg2 || arg3 < 0) {
            return Integer.toString(arg3, arg1);
        }
        int var4 = 2;
        for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        char[] var6 = new char[var4];
        var6[0] = '+';
        for (int var7 = var4 - 1; var7 > 0; var7--) {
            int var8 = arg3;
            arg3 /= arg1;
            int var9 = var8 - (arg1 * arg3);
            if (var9 < 10) {
                var6[var7] = (char) (var9 + 48);
            } else {
                var6[var7] = (char) (var9 + 87);
            }
        }
        return new String(var6);
    }
}
