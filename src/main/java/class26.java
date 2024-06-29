import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class88 {

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field367 = -1;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Lhj;")
    public static class69 field369 = class181.method1318(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -107);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[S")
    public static short[] field364 = new short[256];

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lhj;")
    private static class69 field377 = class181.method1318("Allocating memory", (byte) -126);

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Ltk;")
    public static class50 field370 = null;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[Lhj;")
    public static class69[] field374 = new class69[500];

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lhj;")
    public static class69 field373 = class181.method1318("Hidden)2use", (byte) -108);

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lhj;")
    public static class69 field376 = field377;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "B")
    public byte field371;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Ld;")
    public static class225 field378;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Ltk;")
    public static class50 field379;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lhj;")
    public class69 field363;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lhj;")
    public class69 field375;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lnc;")
    public static class83 field365;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIII)Lhj;")
    public static final class69 method147(boolean arg0, int arg1, int arg2, int arg3) {
        field380++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = arg3 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg1;
            var5++;
        }
        int var6 = var5;
        if (arg3 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        if (arg2 <= 93) {
            method150((byte) -34, -124, (class222) null);
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg3 % arg1;
            arg3 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class69 var9 = new class69();
        var9.field1331 = var6;
        var9.field1351 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3) {
        class221.field3970 = new class217[arg0][arg1][arg2];
        class31.field429 = new int[arg0][arg1 + 1][arg2 + 1];
        class43.method247(false);
        class109.field2091 = arg1;
        class146.field2694 = arg2;
        class139.field2593 = new int[arg0][arg1 + 1][arg2 + 1];
        class168.method1239();
        class53.field950 = arg3;
        class186.field3348 = new boolean[class53.field950 + class53.field950 + 1][class53.field950 + class53.field950 + 1];
        class181.field3296 = new boolean[class53.field950 + class53.field950 + 2][class53.field950 + class53.field950 + 2];
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method149(int arg0) {
        if (arg0 != 16600) {
            field378 = null;
        }
        field378 = null;
        field369 = null;
        field373 = null;
        field364 = null;
        field370 = null;
        field376 = null;
        field377 = null;
        field379 = null;
        field374 = null;
        field365 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILkk;)V")
    public static final void method150(byte arg0, int arg1, class222 arg2) {
        if (arg0 != -121) {
            method147(true, -126, 24, 98);
        }
        if (arg2.field4028 > class180.field3272) {
            class34.method181(arg2, true);
        } else if (class180.field3272 > arg2.field4056) {
            class227.method1622(arg2, -1);
        } else {
            class266.method1838(arg2, -122);
        }
        field372++;
        if (arg2.field3985 < 128 || arg2.field4005 < 128 || arg2.field3985 >= 13184 || arg2.field4005 >= 13184) {
            arg2.field4028 = 0;
            arg2.field4010 = -1;
            arg2.field4056 = 0;
            arg2.field3992 = -1;
            arg2.field3985 = arg2.field3998[0] * 128 + (arg2.method813(15963) * 64);
            arg2.field4005 = arg2.field4046[0] * 128 + (arg2.method813(15963) * 64);
            arg2.method1579(0);
        }
        if (class156.field2904 == arg2 && (arg2.field3985 < 1536 || arg2.field4005 < 1536 || arg2.field3985 >= 11776 || arg2.field4005 >= 11776)) {
            arg2.field4056 = 0;
            arg2.field3992 = -1;
            arg2.field4010 = -1;
            arg2.field4028 = 0;
            arg2.field3985 = arg2.field3998[0] * 128 + (arg2.method813(arg0 ^ 0xFFFFC1DC) * 64);
            arg2.field4005 = arg2.field4046[0] * 128 + arg2.method813(15963) * 64;
            arg2.method1579(0);
        }
        class112.method830(0, arg2);
        class69.method466(arg2, (byte) -105);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BB)[B")
    public static final byte[] method151(byte[] arg0, byte arg1) {
        int var2 = arg0.length;
        if (arg1 < 28) {
            field364 = null;
        }
        field366++;
        byte[] var3 = new byte[var2];
        class1.method4(arg0, 0, var3, 0, var2);
        return var3;
    }
}
