import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class72 extends class204 {

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lvo;")
    public static class345 field1152;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIII)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field3160 = arg1;
        super.field3163 = (byte) arg4;
        super.field3158 = (byte) arg3;
        super.field3154 = arg2;
        super.field3155 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Canvas;IILfa;)Lr;")
    public static final class98 method584(Canvas arg0, int arg1, int arg2, class615 arg3) {
        if (arg2 < 12) {
            field1152 = null;
        }
        ++field1153;
        return new class382(arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        if (arg0 != 96) {
            field1155 = 113;
        }
        ++field1150;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/String;B)V")
    public static final void method586(String[] arg0, byte arg1) {
        if (arg1 > -68) {
            field1155 = -107;
        }
        ++field1148;
        if (arg0.length <= 1) {
            class476.field6818 = class476.field6818 + arg0[0];
        } else {
            for (int var2 = 0; ~arg0.length < ~var2; ++var2) {
                if (arg0[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg0[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class28.method269(32316, "Pausing for " + var3 + " seconds...");
                    class465.field6654 = arg0;
                    class94.field1402 = var2 + 1;
                    class221.field3302 = class254.method1619(true) + (long) (var3 * 1000);
                    return;
                }
                class476.field6818 = arg0[var2];
                class418.method2476(0, false);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Z")
    public final boolean method587(byte arg0) {
        if (arg0 >= -22) {
            field1152 = null;
        }
        ++field1149;
        return class678.field9661[(super.field3155 >> class49.field637) - class371.field5135 + class668.field9389][(super.field3154 >> class49.field637) + -class22.field303 + class668.field9389];
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)Z")
    public final boolean method588(int arg0) {
        ++field1147;
        if (arg0 != 0) {
            field1152 = null;
        }
        class198 var2 = class124.method994(super.field3158, super.field3155 >> class49.field637, super.field3154 >> class49.field637);
        return var2 != null && var2.field3085.field2482 ? class365.method2190(-127, super.field3155 >> class49.field637, super.field3158, super.field3154 >> class49.field637, var2.field3085.method626(-32768) + this.method626(-32768)) : class118.method952(super.field3158, super.field3155 >> class49.field637, true, super.field3154 >> class49.field637);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1152 = null;
        if (arg0 != 5) {
            method589(111);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        ++field1156;
        if (arg6 <= 22) {
            this.method590((class204) null, 39, true, (class98) null, 9, 32, (byte) 68);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[Lam;)I")
    public final int method591(int arg0, class289[] arg1) {
        ++field1154;
        return arg0 != -1 ? 110 : this.method1413(super.field3154 >> class49.field637, -6813, super.field3155 >> class49.field637, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        ++field1151;
        return arg0 != -15258 ? false : false;
    }
}
