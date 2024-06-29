import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class225 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
    public static int[] field3505 = new int[2];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method1591(int arg0) {
        if (arg0 == 256) {
            field3505 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)I")
    public abstract int method176(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILmd;Ljava/awt/Component;)Lmj;")
    public static final class218 method1592(int arg0, int arg1, int arg2, class239 arg3, Component arg4) {
        field3506++;
        if (class197.field3105 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class218 var5 = (class218) Class.forName("ib").getDeclaredConstructor().newInstance();
                var5.field3434 = arg1;
                var5.field3414 = new int[(class189.field2953 ? 2 : 1) * 256];
                var5.method590(arg4);
                var5.field3432 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field3432 > 16384) {
                    var5.field3432 = 16384;
                }
                var5.method589(var5.field3432);
                if (class232.field3757 > 0 && class130.field1866 == null) {
                    class130.field1866 = new class291();
                    class130.field1866.field4684 = arg3;
                    arg3.method1684(0, class130.field1866, class232.field3757);
                }
                if (class130.field1866 != null) {
                    if (class130.field1866.field4680[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class130.field1866.field4680[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class219 var6 = new class219(arg3, arg0);
                    var6.field3434 = arg1;
                    var6.field3414 = new int[(class189.field2953 ? 2 : 1) * 256];
                    var6.method590(arg4);
                    var6.field3432 = arg2;
                    var6.method589(var6.field3432);
                    if (class232.field3757 > 0 && class130.field1866 == null) {
                        class130.field1866 = new class291();
                        class130.field1866.field4684 = arg3;
                        arg3.method1684(arg2 - 16384, class130.field1866, class232.field3757);
                    }
                    if (class130.field1866 != null) {
                        if (class130.field1866.field4680[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class130.field1866.field4680[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class218();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public abstract void method178(boolean arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)J")
    public abstract long method177(byte arg0);
}
