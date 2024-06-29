import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class84 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lcu;")
    public static class206 field1296 = new class206(29, -1);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Ldb;")
    public static class298 field1297 = new class298(112, 1);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lcu;")
    public static class206 field1298 = new class206(45, 4);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ltfa;")
    public class31 field1290;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lbi;")
    public static class449 field1299;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    public int[] field1292;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
    public static final boolean method689(int arg0, int arg1, int arg2) {
        field1294++;
        if (arg1 != 29196) {
            method691(9, null, null, false);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method690(boolean arg0) {
        field1298 = null;
        if (!arg0) {
            field1297 = null;
            field1296 = null;
            field1299 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;Lbi;Z)Ldca;")
    public static final class164 method691(int arg0, String arg1, class449 arg2, boolean arg3) {
        field1291++;
        int var4 = arg2.method2523(arg1, (byte) 44);
        if (var4 == -1) {
            return new class164(0);
        }
        int[] var5 = arg2.method2534(var4, arg0 + 13758);
        class164 var6 = new class164(var5.length);
        int var7 = 0;
        int var8 = arg0;
        while (true) {
            while (var7 < var6.field2570) {
                class335 var9 = new class335(arg2.method2537(false, var4, var5[var8++]));
                int var10 = var9.method2045(arg0 ^ 0xFFFFFF9E);
                int var11 = var9.method2001((byte) -83);
                int var12 = var9.method2034(255);
                if (!arg3 && var12 == 1) {
                    var6.field2570--;
                } else {
                    var6.field2565[var7] = var10;
                    var6.field2559[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
