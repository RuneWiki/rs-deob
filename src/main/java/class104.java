import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class104 implements class576 {

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "Ldh;")
    public static class320 field1081 = new class320(96, 10);

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "Lsq;")
    public static class178 field1085 = new class178(15, 0, 1, 0);

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "[I")
    public static int[] field1086;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)I")
    public static final int method716(int arg0, int arg1, int arg2) {
        if (arg2 != 16691) {
            field1081 = null;
        }
        field1083++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method717(boolean arg0) {
        field1085 = null;
        field1081 = null;
        if (!arg0) {
            field1086 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1082++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILha;ZI)Lab;")
    public static final class667 method718(int arg0, class58 arg1, boolean arg2, int arg3) {
        field1080++;
        if (arg3 == -1) {
            return null;
        }
        if (class7.field55 != null) {
            for (int var4 = 0; var4 < class7.field55.length; var4++) {
                if (class7.field55[var4] == arg3) {
                    return class256.field3132[var4];
                }
            }
        }
        class667 var5 = (class667) class181.field2142.method3538((long) arg3, 0);
        if (var5 != null) {
            if (arg2 && var5.field9494 == null) {
                class535 var6 = class618.method3528(class278.field3417, (byte) 101, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field9494 = var6;
            }
            return var5;
        }
        if (arg0 < 8) {
            method718(-66, null, true, 122);
        }
        class155[] var7 = class155.method959(class586.field8270, arg3);
        if (var7 == null) {
            return null;
        }
        class535 var8 = class618.method3528(class278.field3417, (byte) 101, arg3);
        if (var8 == null) {
            return null;
        }
        class667 var9;
        if (arg2) {
            var9 = new class667(arg1.method373(var8, var7, true), var8);
        } else {
            var9 = new class667(arg1.method373(var8, var7, true));
        }
        class181.field2142.method3537(77, (long) arg3, var9);
        return var9;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class104(String arg0, int arg1) {
        this.field1084 = arg1;
    }
}
