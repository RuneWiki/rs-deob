import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class619 implements class255 {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int field8673;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lgq;")
    public class761 field8672;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field8663;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field8675;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public int field8667;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field8669;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lkfa;")
    public class407 field8662;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field8665;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field8674;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
    public static long field8676 = -1L;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Ltba;")
    public static class56 field8670;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Lqi;")
    public class669 method271(boolean arg0) {
        if (arg0) {
            this.field8665 = 38;
        }
        field8668++;
        return null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method3396(boolean arg0) {
        if (arg0) {
            method3397((byte) -124);
        }
        field8670 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method3397(byte arg0) {
        class112.method758(-1);
        field8671++;
        if (arg0 != 114) {
            return;
        }
        int var1 = class223.field2944.field634.method2971((byte) -126);
        if (var1 == 2) {
            class284.method1708(class458.field6407, class599.field8320, 100, 100, class84.field1083, (byte) 12);
        } else if (var1 == 3) {
            class357.method2182(2, (byte) 46, class458.field6407, class84.field1083, class662.field9078, class189.field2485, 2, class599.field8320);
        }
        if (class223.field2944.field634.method2976((byte) -124)) {
            class125.method812(class68.field939, (byte) 127);
        }
        if (class458.field6407 != null) {
            class519.method2983(true);
        }
        class306.field3936 = class223.field2944.field634.method2971((byte) -124) != 0;
        class107.field1323 = class223.field2944.field634.method2976((byte) -125);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;IIILnga;)Lvm;")
    public static final class208 method3398(Component arg0, int arg1, int arg2, int arg3, class256 arg4) {
        field8664++;
        if (class554.field7780 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 75) {
                field8670 = null;
            }
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class208 var5 = (class208) Class.forName("gw").getDeclaredConstructor().newInstance();
                var5.field2682 = arg3;
                var5.field2657 = new int[(class48.field709 ? 2 : 1) * 256];
                var5.method570(arg0);
                var5.field2671 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2671 > 16384) {
                    var5.field2671 = 16384;
                }
                var5.method571(var5.field2671);
                if (class692.field9813 > 0 && class511.field7212 == null) {
                    class511.field7212 = new class296();
                    class511.field7212.field3847 = arg4;
                    arg4.method1555(class692.field9813, true, class511.field7212);
                }
                if (class511.field7212 != null) {
                    if (class511.field7212.field3848[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class511.field7212.field3848[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class549 var6 = new class549(arg4, arg1);
                    var6.field2682 = arg3;
                    var6.field2657 = new int[(class48.field709 ? 2 : 1) * 256];
                    var6.method570(arg0);
                    var6.field2671 = 16384;
                    var6.method571(var6.field2671);
                    if (class692.field9813 > 0 && class511.field7212 == null) {
                        class511.field7212 = new class296();
                        class511.field7212.field3847 = arg4;
                        arg4.method1555(class692.field9813, true, class511.field7212);
                    }
                    if (class511.field7212 != null) {
                        if (class511.field7212.field3848[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class511.field7212.field3848[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class208();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lgq;Lkfa;IIIIIII)V")
    public class619(class761 arg0, class407 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8673 = arg4;
        this.field8672 = arg0;
        this.field8663 = arg7;
        this.field8675 = arg3;
        this.field8667 = arg6;
        this.field8669 = arg8;
        this.field8662 = arg1;
        this.field8665 = arg5;
        this.field8674 = arg2;
    }
}
