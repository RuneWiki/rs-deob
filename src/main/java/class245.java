import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class245 extends class262 implements class226 {

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lso;")
    private class497 field3472;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3476 = null;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3484;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field3485;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Z")
    public static boolean field3481;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1545(boolean arg0, int arg1) {
        ++field3479;
        if (arg1 != -4450) {
            this.method1638((byte) -55);
        }
        return super.method1711(super.field3680.field1584, (byte) 104, arg0);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Loia;Lso;Z)V")
    public class245(class97 arg0, class497 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field3472 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lso;")
    public final class497 method1547(int arg0) {
        ++field3483;
        if (arg0 != 11876) {
            method1634(-119, -37, -97);
        }
        return this.field3472;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1633(byte arg0) {
        field3476 = null;
        if (arg0 >= -30) {
            method1637(96, 44, 118, -5);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
    public static final void method1634(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        if (var3 != null) {
            class9.method60(var3.field7462);
            class9.method60(var3.field7463);
            if (var3.field7462 != null) {
                var3.field7462 = null;
            }
            if (var3.field7463 != null) {
                var3.field7463 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Z")
    public final boolean method1544(int arg0) {
        if (arg0 <= 80) {
            this.field3472 = null;
        }
        ++field3475;
        return super.method1716(super.field3680.field1584, (byte) -113);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1543(int arg0) {
        super.method1543(arg0);
        ++field3477;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLsm;)V")
    public static final void method1635(boolean arg0, class300 arg1) {
        ++field3480;
        if (class325.field4448 != null) {
            class237 var2 = null;
            if (arg1.field4131 == 0) {
                var2 = (class237) class454.method2624(arg1.field4130, arg1.field4132, arg1.field4125);
            }
            if (~arg1.field4131 == -2) {
                var2 = (class237) class728.method4037(arg1.field4130, arg1.field4132, arg1.field4125);
            }
            if (!arg0) {
                method1634(-95, 51, 78);
            }
            if (arg1.field4131 == 2) {
                var2 = (class237) class614.method3480(arg1.field4130, arg1.field4132, arg1.field4125, field3485 != null ? field3485 : (field3485 = method1639("bea")));
            }
            if (~arg1.field4131 == -4) {
                var2 = (class237) class572.method3313(arg1.field4130, arg1.field4132, arg1.field4125);
            }
            if (var2 != null) {
                arg1.field4129 = var2.method1032(!arg0);
                arg1.field4135 = var2.method1034(-126);
                arg1.field4124 = var2.method1033(-41);
            } else {
                arg1.field4124 = 0;
                arg1.field4135 = 0;
                arg1.field4129 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILgj;II)Ldc;")
    public static final class5 method1636(int arg0, class662 arg1, int arg2, int arg3) {
        ++field3482;
        byte[] var4 = arg1.method3732(arg2, 8906, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 2) {
                field3476 = null;
            }
            return new class5(var4);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -78) {
            field3481 = true;
        }
        class554.field7832 = new byte[arg1][arg0][arg2];
        ++field3484;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I")
    public final int method1638(byte arg0) {
        ++field3473;
        int var2 = 26 / ((14 - arg0) / 43);
        return super.method1638((byte) 116);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public final void method1546(int arg0, int arg1) {
        super.method1546(this.field3472.field6795 * arg0, arg1);
        ++field3478;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1639(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
