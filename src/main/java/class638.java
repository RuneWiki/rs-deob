import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class638 {

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
    public boolean field8954 = true;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Llp;")
    public static class359 field8958 = class405.method2593((byte) -127);

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "C")
    private char field8959;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field8960;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Ljava/lang/String;")
    public String field8955;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/awt/Component;ILk;I)Lcl;")
    public static final class245 method3703(int arg0, Component arg1, int arg2, class525 arg3, int arg4) {
        field8953++;
        if (class41.field581 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class245 var5 = (class245) Class.forName("kn").getDeclaredConstructor().newInstance();
                var5.field3921 = arg2;
                var5.field3891 = new int[(class3.field23 ? 2 : 1) * 256];
                var5.method984(arg1);
                var5.field3913 = (arg2 & 0xFFFFFC00) - arg0;
                if (var5.field3913 > 16384) {
                    var5.field3913 = 16384;
                }
                var5.method990(var5.field3913);
                if (class561.field8083 > 0 && class299.field4681 == null) {
                    class299.field4681 = new class300();
                    class299.field4681.field4686 = arg3;
                    arg3.method3180(class299.field4681, false, class561.field8083);
                }
                if (class299.field4681 != null) {
                    if (class299.field4681.field4684[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class299.field4681.field4684[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class103 var6 = new class103(arg3, arg4);
                    var6.field3921 = arg2;
                    var6.field3891 = new int[(class3.field23 ? 2 : 1) * 256];
                    var6.method984(arg1);
                    var6.field3913 = 16384;
                    var6.method990(var6.field3913);
                    if (class561.field8083 > 0 && class299.field4681 == null) {
                        class299.field4681 = new class300();
                        class299.field4681.field4686 = arg3;
                        arg3.method3180(class299.field4681, false, class561.field8083);
                    }
                    if (class299.field4681 != null) {
                        if (class299.field4681.field4684[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class299.field4681.field4684[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class245();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILie;)V")
    private final void method3704(int arg0, int arg1, class6 arg2) {
        field8957++;
        if (arg1 == 1) {
            this.field8959 = class457.method2868(-75, arg2.method81(true));
        } else if (arg1 == 2) {
            this.field8960 = arg2.method72(-58);
        } else if (arg1 == 4) {
            this.field8954 = false;
        } else if (arg1 == 5) {
            this.field8955 = arg2.method42((byte) -68);
        }
        if (arg0 <= 38) {
            this.field8959 = 'R';
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lie;I)V")
    public final void method3705(class6 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method70(arg1 - 9059);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method3705(null, -126);
                }
                field8961++;
                return;
            }
            this.method3704(92, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method3706(int arg0) {
        if (arg0 != -22981) {
            field8958 = null;
        }
        field8958 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Z")
    public final boolean method3707(byte arg0) {
        field8952++;
        if (arg0 == -121) {
            return this.field8959 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)I")
    public static final int method3708(boolean arg0, int arg1) {
        if (arg0) {
            method3706(36);
        }
        field8956++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)Z")
    public static final boolean method3709(int arg0, int arg1, int arg2) {
        if (arg2 == 115) {
            field8962++;
            return false;
        } else {
            return false;
        }
    }
}
