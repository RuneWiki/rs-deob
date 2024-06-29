import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class297 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Lhj;")
    public static class596 field3536 = new class596(131, 2);

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[BIIBI)V")
    public static final void method1735(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3540++;
        if (arg5 >= arg3) {
            return;
        }
        int var6 = arg3 - arg5 >> 2;
        int var7 = arg2 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg4 == 42) {
                            return;
                        } else {
                            field3539 = -121;
                            return;
                        }
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public static void method1736(int arg0) {
        field3536 = null;
        if (arg0 > -54) {
            method1735(76, null, -103, 66, (byte) 106, 92);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLes;)Lew;")
    public static final class519 method1737(byte arg0, class403 arg1) {
        if (arg0 != 1) {
            method1738(null, -83, 20, null);
        }
        field3538++;
        class553 var2 = class198.method1292(arg1, (byte) 78);
        int var3 = arg1.method2381((byte) 102);
        int var4 = arg1.method2381((byte) 33);
        return new class519(var2.field7693, var2.field7699, var2.field7690, var2.field7700, var2.field7694, var2.field7703, var2.field7696, var2.field7688, var2.field7691, var3, var4);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method1738(String arg0, int arg1, int arg2, String arg3) {
        field3537++;
        if (arg1 < arg3.length() || !class62.method534(7900)) {
            return;
        }
        class331.method1966(-8324);
        class506.field7198 = arg2;
        class710.field9967 = arg0;
        class742.field10333 = arg3;
        class48.method454(6, -1);
    }
}
