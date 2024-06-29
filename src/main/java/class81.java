import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class81 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Ltl;")
    public static class59 field1282 = class85.method639(")3)3)3", 9588);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lsm;", line = 5)
    public static final class44 method616(int arg0, byte arg1) {
        field1281++;
        class44 var2 = (class44) class149.field2453.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1232.method2042(class13.method90(arg0, (byte) 127), class165.method1164(arg0, 2047), (byte) -122);
        class44 var4 = new class44();
        var4.field658 = arg0;
        if (var3 != null) {
            var4.method309(-127, new class170(var3));
        }
        if (arg1 != 25) {
            field1282 = (class59) null;
        }
        var4.method307(64);
        if (var4.field673 != -1) {
            var4.method301(method616(var4.field673, (byte) 25), 51, method616(var4.field684, (byte) 25));
        }
        if (var4.field657 != -1) {
            var4.method312(method616(var4.field701, (byte) 25), method616(var4.field657, (byte) 25), 4);
        }
        if (!class276.field4754 && var4.field712) {
            var4.field661 = null;
            var4.field699 = class317.field5344;
            var4.field660 = false;
            var4.field704 = null;
            var4.field687 = 0;
        }
        class149.field2453.method1488((long) arg0, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 58)
    public static void method617(int arg0) {
        field1282 = null;
        int var1 = -123 % ((arg0 - 79) / 33);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 67)
    public static final void method618(int arg0, int arg1) {
        class190.field3182.method1486(false, arg1);
        if (arg0 == -1) {
            field1280++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)Ltl;", line = 79)
    public static final class59 method619(byte arg0, int arg1) {
        field1279++;
        if (arg0 >= -65) {
            method619((byte) 103, 98);
        }
        return class237.method1660(arg1, 110, false, 10);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V", line = 98)
    public static final void method620(int arg0, int arg1, int arg2) {
        field1284++;
        class64 var3 = class159.field2604[class247.field4119][arg0][arg2];
        if (var3 == null) {
            class169.method1194(class247.field4119, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class294 var5 = (class294) var3.method536(arg1 ^ 0xFFFFE3C9);
        class294 var6 = null;
        while (var5 != null) {
            class44 var7 = method616(var5.field5013.field4845, (byte) 25);
            int var8 = var7.field703;
            if (var7.field682 == 1) {
                var8 = (var5.field5013.field4848 + 1) * var8;
            }
            if (var8 > var4) {
                var6 = var5;
                var4 = var8;
            }
            var5 = (class294) var3.method533(24);
        }
        if (var6 == null) {
            class169.method1194(class247.field4119, arg0, arg2);
            return;
        }
        var3.method534(var6, false);
        class294 var9 = (class294) var3.method536(2);
        class281 var10 = null;
        class281 var11 = null;
        while (var9 != null) {
            class281 var12 = var9.field5013;
            if (var6.field5013.field4845 != var12.field4845) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field4845 != var12.field4845 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class294) var3.method533(24);
        }
        if (arg1 != -7221) {
            field1283 = -3;
        }
        long var13 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class23.method148(class247.field4119, arg0, arg2, class73.method589(class247.field4119, true, arg0 * 128 + 64, arg2 * 128 + 64), var6.field5013, var13, var10, var11);
    }
}
