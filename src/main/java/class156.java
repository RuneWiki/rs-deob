import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class156 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lra;")
    public static class361 field1973 = new class361(107, 17);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    public static final int method1118(int arg0, int arg1) {
        field1972++;
        if (arg1 != 1649011527) {
            method1120((byte) -88, -18);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        field1973 = null;
        if (arg0 != -32) {
            method1119((byte) -127);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Llfa;")
    public static final class313 method1120(byte arg0, int arg1) {
        field1974++;
        class313 var2 = (class313) class259.field3494.method3655(-118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class398.field5072.method3346(-1, 0, arg1);
        class313 var4 = new class313();
        if (var3 != null) {
            var4.method1827(new class418(var3), arg1, 8);
        }
        if (arg0 >= -20) {
            field1973 = null;
        }
        class259.field3494.method3650((long) arg1, -127, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)V")
    public static final void method1121(byte arg0, int arg1, int arg2, int arg3) {
        field1971++;
        class367 var4 = class573.method3057(9, arg1, 2);
        var4.method2115(1);
        var4.field4735 = arg3;
        if (arg0 != 49) {
            method1119((byte) 56);
        }
        var4.field4736 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZLjava/lang/String;Lpe;)Loda;")
    public static final class657 method1122(byte arg0, boolean arg1, String arg2, class615 arg3) {
        field1975++;
        int var4 = arg3.method3359(arg2, (byte) -123);
        if (var4 == -1) {
            return new class657(0);
        }
        int[] var5 = arg3.method3369((byte) -101, var4);
        class657 var6 = new class657(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field9164) {
                class418 var10 = new class418(arg3.method3346(-1, var4, var5[var8++]));
                int var11 = var10.method2355(101);
                int var12 = var10.method2393(-30727);
                int var13 = var10.method2396(-4);
                if (!arg1 && var13 == 1) {
                    var6.field9164--;
                } else {
                    var6.field9165[var7] = var11;
                    var6.field9162[var7] = var12;
                    var7++;
                }
            }
            int var9 = 30 / ((arg0 - 36) / 36);
            return var6;
        }
    }
}
