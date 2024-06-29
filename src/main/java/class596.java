import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class596 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lg;")
    public static class619 field7570;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILs;)V")
    public static final void method3211(int arg0, class358 arg1) {
        class116.field1542[arg0] = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3212(int arg0, String arg1) {
        field7569++;
        class13 var2 = class634.method3387((byte) -117);
        var2.field130.method1491(-129, class117.field1594.field1774);
        var2.field130.method1541(374, 0);
        int var3 = var2.field130.field3133;
        var2.field130.method1541(374, 647);
        int[] var4 = class287.method1744(-116, var2);
        int var5 = var2.field130.field3133;
        var2.field130.method1547(arg1, -6457);
        var2.field130.method1491(-129, class496.field6338);
        var2.field130.field3133 += 7;
        var2.field130.method1537(var5, var4, var2.field130.field3133, -123);
        var2.field130.method1534(var2.field130.field3133 - var3, arg0 + 119);
        class116.method679(var2, 0);
        class497.field6377 = 0;
        class778.field10629 = 1;
        class223.field3035 = -3;
        class89.field1229 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lvb;")
    public static final class657 method3213(int arg0, byte arg1) {
        field7566++;
        class657 var2 = (class657) class306.field3845.method2931((long) arg0, (byte) -89);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class482.field6224.method139(0, (byte) -94, arg0);
        class657 var4 = new class657();
        if (var3 != null) {
            var4.method3580(-1, new class234(var3));
        }
        var4.method3581(-112);
        class306.field3845.method2918((long) arg0, var4, arg1 ^ 0xFFFFFFF4);
        if (arg1 != -114) {
            field7570 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method3214(int arg0) {
        if (arg0 != 15770) {
            method3212(84, null);
        }
        field7570 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static final int method3215(int arg0, int arg1) {
        return class656.field8465 == null ? 0 : class656.field8465[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILjava/awt/Component;ILoq;)Lnr;")
    public static final class161 method3216(int arg0, int arg1, Component arg2, int arg3, class775 arg4) {
        field7568++;
        if (class791.field10837 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class161 var5 = (class161) Class.forName("sb").getDeclaredConstructor().newInstance();
                var5.field2153 = arg1;
                var5.field2133 = new int[(class654.field8426 ? 2 : 1) * 256];
                var5.method573(arg2);
                var5.field2146 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field2146 > 16384) {
                    var5.field2146 = 16384;
                }
                var5.method571(var5.field2146);
                if (class437.field5739 > 0 && class335.field4079 == null) {
                    class335.field4079 = new class700();
                    class335.field4079.field9278 = arg4;
                    arg4.method4248(class335.field4079, 0, class437.field5739);
                }
                if (arg0 != 1) {
                    method3216(89, -69, null, 123, null);
                }
                if (class335.field4079 != null) {
                    if (class335.field4079.field9272[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class335.field4079.field9272[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class672 var6 = new class672(arg4, arg3);
                    var6.field2153 = arg1;
                    var6.field2133 = new int[(class654.field8426 ? 2 : 1) * 256];
                    var6.method573(arg2);
                    var6.field2146 = 16384;
                    var6.method571(var6.field2146);
                    if (class437.field5739 > 0 && class335.field4079 == null) {
                        class335.field4079 = new class700();
                        class335.field4079.field9278 = arg4;
                        arg4.method4248(class335.field4079, arg0 ^ 0x1, class437.field5739);
                    }
                    if (class335.field4079 != null) {
                        if (class335.field4079.field9272[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class335.field4079.field9272[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class161();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
