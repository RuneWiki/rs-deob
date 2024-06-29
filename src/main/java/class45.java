import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class45 implements class489 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lo;")
    public static class24 field956;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        if (arg0 > 82) {
            field956 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lmh;")
    public static final class449 method451(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field954++;
        try {
            return new class277();
        } catch (Throwable var2) {
            try {
                return (class449) Class.forName("rl").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class213();
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lje;JB[I)Ljava/lang/String;")
    public final String method452(class278 arg0, long arg1, byte arg2, int[] arg3) {
        int var6 = -10 % ((arg2 - 50) / 59);
        field952++;
        if (class267.field4052 == arg0) {
            class450 var7 = class370.field5440.method1386(arg3[0], 8);
            return var7.method2690((byte) -35, (int) arg1);
        } else if (class196.field3145 == arg0 || class271.field4113 == arg0) {
            class12 var8 = class135.field2271.method1636((int) arg1, -112);
            return var8.field192;
        } else if (class257.field3944 == arg0 || class535.field7841 == arg0 || class39.field564 == arg0) {
            return class370.field5440.method1386(arg3[0], 107).method2690((byte) -35, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLnn;)Lmp;")
    public static final class536 method453(byte arg0, class289 arg1) {
        if (arg0 == 87) {
            field953++;
            return new class536(arg1.method1848((byte) 117), arg1.method1848((byte) 127), arg1.method1848((byte) 116), arg1.method1848((byte) 122), arg1.method1863(-117), arg1.method1863(101), arg1.method1858(arg0 - 3343));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZII)V")
    public static final void method454(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field955++;
        long var6 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
        if (arg4 != 20964) {
            method451(-105);
        }
        class11 var8 = (class11) class12.field165.method1622(var6, 69);
        if (var8 == null) {
            var8 = new class11();
            class12.field165.method1618(var8, var6, -1);
        }
        if (arg1 >= var8.field151.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field151.length; var11++) {
                var9[var11] = var8.field151[var11];
                var10[var11] = var8.field149[var11];
            }
            for (int var12 = var8.field151.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field151 = var9;
            var8.field149 = var10;
        }
        var8.field151[arg1] = arg2;
        var8.field149[arg1] = arg5;
    }
}
