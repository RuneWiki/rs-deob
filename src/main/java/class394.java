import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class394 extends class204 {

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public int field5651 = (int) (class669.method3713(0) / 1000L);

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Ljava/lang/String;")
    public String field5647;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "S")
    public short field5652;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lll;")
    public static class114 field5646 = new class114();

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field5650 = 0;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Lnl;")
    public static class50 field5654 = new class50(1);

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[I")
    public static int[] field5655 = new int[5];

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)I")
    public static final int method2340(int arg0, int arg1, int arg2, int arg3) {
        field5649++;
        if (class397.field5666 == null) {
            return 0;
        }
        if (arg1 != -1) {
            method2340(-86, 127, 2, -124);
        }
        int var4 = arg0 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class588.field8082 - 1) || class12.field113 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class645.field9140[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class397.field5666[var6].method159(arg0, arg3);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ldga;I)Lafa;")
    public static final class550 method2341(class138 arg0, int arg1) {
        field5648++;
        class380 var2 = class248.method1550(-120)[arg0.method957((byte) -103)];
        class97 var3 = class296.method1767(false)[arg0.method957((byte) -83)];
        int var4 = arg0.method924(arg1 - 18234);
        int var5 = arg0.method924(arg1 ^ 0x473E);
        int var6 = arg0.method922((byte) -124);
        if (arg1 != 18236) {
            field5646 = null;
        }
        int var7 = arg0.method922((byte) -121);
        int var8 = arg0.method943(-78);
        return new class550(var2, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public static final void method2342(byte arg0) {
        field5645++;
        if (arg0 > -106) {
            method2343(37, -116, null);
        }
        int var1 = class654.field9256;
        int[] var2 = class123.field1595;
        for (int var3 = 0; var3 < var1; var3++) {
            class519 var9 = class292.field3912[var2[var3]];
            if (var9 != null && var9.field443 > 0) {
                var9.field443--;
                if (var9.field443 == 0) {
                    var9.field503 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class306.field4106; var4++) {
            long var5 = (long) class690.field9742[var4];
            class637 var7 = (class637) class77.field955.method2506(10, var5);
            if (var7 != null) {
                class676 var8 = var7.field8702;
                if (var8.field443 > 0) {
                    var8.field443--;
                    if (var8.field443 == 0) {
                        var8.field503 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILfca;)I")
    public static final int method2343(int arg0, int arg1, class188 arg2) {
        if (arg1 != -1) {
            return -127;
        }
        field5653++;
        if (!client.method1411(arg2).method1647(arg0, (byte) -120) && arg2.field2410 == null) {
            return -1;
        } else if (arg2.field2390 == null || arg0 >= arg2.field2390.length) {
            return -1;
        } else {
            return arg2.field2390[arg0];
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public static void method2344(byte arg0) {
        if (arg0 != 103) {
            method2340(50, -29, -128, -66);
        }
        field5654 = null;
        field5646 = null;
        field5655 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class394(String arg0, int arg1) {
        this.field5647 = arg0;
        this.field5652 = (short) arg1;
    }
}
