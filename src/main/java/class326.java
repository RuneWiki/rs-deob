import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class326 extends class513 {

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Ltt;")
    public static class338 field4391 = new class338(74, 7);

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Ltt;")
    public static class338 field4392 = new class338(11, 7);

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method1896(int arg0) {
        field4390++;
        class256 var1 = class592.method3279((byte) -99, 15, 0);
        var1.method1546((byte) -88);
        if (arg0 != -3379) {
            field4392 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[BLjava/lang/String;)I")
    public static final int method1897(int arg0, int arg1, byte[] arg2, String arg3) {
        field4385++;
        if (arg0 != 16038) {
            method1902(30);
        }
        int var4 = arg1;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class589.method3258((byte) -93, arg3.charAt(var6));
            int var8 = var5 > var6 + 1 ? class589.method3258((byte) -119, arg3.charAt(var6 + 1)) : -1;
            int var9 = var5 > var6 + 2 ? class589.method3258((byte) -91, arg3.charAt(var6 + 2)) : -1;
            int var10 = var5 <= var6 + 3 ? -1 : class589.method3258((byte) -109, arg3.charAt(var6 + 3));
            arg2[arg1++] = (byte) class665.method3789(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class665.method3789(class15.method97(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class665.method3789(class15.method97(3, var9) << 6, var10);
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        field4389++;
        class238.method1470();
        if (arg0 != -18164) {
            field4392 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
    public static final boolean method1899(byte arg0) {
        field4388++;
        if (arg0 != 65) {
            field4386 = -113;
        }
        return class576.field7861 >= 1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
    public static final void method1900(boolean arg0) {
        field4384++;
        class611 var1 = null;
        try {
            var1 = class388.method2237("2", (byte) 106);
            class157 var2 = new class157(class32.field456 * 6 + 3);
            var2.method915(-31914, 1);
            var2.method918(24551, class32.field456);
            for (int var3 = 0; var3 < class235.field3125.length; var3++) {
                if (class516.field7179[var3]) {
                    var2.method918(24551, var3);
                    var2.method958(0, class235.field3125[var3]);
                }
            }
            var1.method3389(88, 0, var2.field2199, var2.field2219);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3390(0);
            }
        } catch (Exception var4) {
        }
        class254.field3331 = class529.method2982((byte) -69);
        class122.field1599 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Ld;")
    public abstract class327 method1702(int arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
    public static final boolean method1901(int arg0, int arg1, int arg2) {
        field4387++;
        if (arg2 != -1087) {
            field4392 = null;
        }
        return (arg0 & 0x70000) != 0 | class215.method1366(arg1, (byte) 60, arg0) || class400.method2291(6410, arg0, arg1);
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public static void method1902(int arg0) {
        field4392 = null;
        if (arg0 > 42) {
            field4391 = null;
        }
    }
}
