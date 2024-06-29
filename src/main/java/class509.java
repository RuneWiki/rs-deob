import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class509 extends RuntimeException {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7248;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Ljava/lang/String;")
    public String field7247;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7252 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Log;")
    public static class651 field7246 = new class651();

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lqe;")
    public static class469 field7254 = new class469(46, 6);

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lqe;")
    public static class469 field7255 = new class469(36, 3);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
    public static final boolean method3013(int arg0, int arg1) {
        if (arg1 != -16764) {
            method3013(-73, -79);
        }
        field7249++;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method3014(int arg0) {
        field7253++;
        client var1 = class236.field3433;
        synchronized (class236.field3433) {
            if (class183.field2801 == null) {
                Container var2;
                if (class169.field2648 != null) {
                    var2 = class169.field2648;
                } else if (class466.field6830 == null) {
                    var2 = class176.field2729;
                } else {
                    var2 = class466.field6830;
                }
                class153.field2475 = var2.getSize().width;
                class455.field6702 = var2.getSize().height;
                if (class169.field2648 == var2) {
                    Insets var3 = class169.field2648.getInsets();
                    class455.field6702 -= var3.top + var3.bottom;
                    class153.field2475 -= var3.right + var3.left;
                }
                if (arg0 != 36) {
                    field7246 = null;
                }
                if (class756.method4219((byte) 8) == 1) {
                    class501.field7123 = class291.field4165;
                    class510.field7263 = class344.field4988;
                    class37.field381 = 0;
                    class238.field3466 = (class153.field2475 - class291.field4165) / 2;
                } else {
                    class195.method1356((byte) 120);
                }
                if (class607.field8585 != class206.field3043) {
                    boolean var10000;
                    if (class501.field7123 < 1024 && class510.field7263 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class106.field1476.setSize(class501.field7123, class510.field7263);
                if (class736.field10316 != null) {
                    if (class419.field6265) {
                        class396.method2527(1, class106.field1476);
                    } else {
                        class736.field10316.method417(class106.field1476, class501.field7123, class510.field7263);
                    }
                }
                if (class169.field2648 == var2) {
                    Insets var4 = class169.field2648.getInsets();
                    class106.field1476.setLocation(var4.left + class238.field3466, var4.top - -class37.field381);
                } else {
                    class106.field1476.setLocation(class238.field3466, class37.field381);
                }
                if (class87.field1249 != -1) {
                    class483.method2891(true, false);
                }
                class378.method2447((byte) 84);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class509(Throwable arg0, String arg1) {
        this.field7248 = arg0;
        this.field7247 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Lhb;")
    public static final class728 method3015(int arg0) {
        field7245++;
        class390 var1 = null;
        class728 var2 = new class728(class199.field2993, 0);
        try {
            class197 var3 = class179.field2759.method4060("", true, (byte) 35);
            while (var3.field2986 == 0) {
                class277.method1759(1L, 66);
            }
            if (var3.field2986 == 1) {
                var1 = (class390) var3.field2990;
                byte[] var4 = new byte[(int) var1.method2505((byte) 111)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method2500(var4, var5, (byte) 103, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class728(new class645(var4), class199.field2993, 0);
            }
        } catch (Exception var8) {
        }
        if (arg0 != 6) {
            return null;
        }
        try {
            if (var1 != null) {
                var1.method2504(82);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)V")
    public static final void method3016(int arg0, int arg1, byte arg2) {
        field7244++;
        class150 var3 = class676.method3885(1000, 13, arg1);
        var3.method1116(115);
        var3.field2346 = arg0;
        if (arg2 < 68) {
            method3016(-83, -67, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
    public static final int method3017(int arg0) {
        field7250++;
        if (arg0 != 768) {
            method3013(111, -100);
        }
        return class361.method2251(false, arg0 ^ 0x302);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static final void method3018(int arg0) throws class566 {
        if (class22.field234 == 1) {
            class502.field7152.method462(class210.field3078, class304.field4305);
        } else {
            class502.field7152.method462(0, 0);
        }
        field7251++;
        if (arg0 != -30201) {
            method3019((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method3019(byte arg0) {
        field7255 = null;
        int var1 = 27 % ((79 - arg0) / 38);
        field7246 = null;
        field7254 = null;
    }
}
