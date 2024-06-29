import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class51 {

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Lnj;")
    public static class415 field707 = new class415(68, -1);

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "[Z")
    public static boolean[] field713 = new boolean[200];

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Ldda;", line = 6)
    public static final class367 method454(byte arg0) {
        field710++;
        if (arg0 != -50) {
            return null;
        }
        class367 var1 = (class367) class457.field5988.method887(-68);
        if (var1 != null) {
            var1.method2438((byte) 110);
            var1.method237((byte) -98);
            return var1;
        }
        class367 var2;
        do {
            var2 = (class367) class357.field4620.method887(-128);
            if (var2 == null) {
                return null;
            }
            if (var2.method2109((byte) -86) > class584.method3191(1)) {
                return null;
            }
            var2.method2438((byte) -50);
            var2.method237((byte) -103);
        } while ((Long.MIN_VALUE & var2.field437) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 45)
    public static void method455(int arg0) {
        if (arg0 > 122) {
            field707 = null;
            field713 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)V", line = 57)
    public static final void method456(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg0 << 3;
        field709++;
        int var6 = arg3 << 3;
        class141.field1859 = var5;
        if (class704.field9810 == 2) {
            class470.field6146 = var4;
            class299.field3911 = var6;
            class358.field4639 = var5;
        }
        int var7 = 45 / ((1 - arg2) / 63);
        class710.field9918 = var6;
        class560.method2999(16384);
        class63.field862 = true;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)V", line = 83)
    public static final void method457(int arg0, byte arg1, int arg2) {
        field712++;
        if (class50.field699 == class153.field1947) {
            if (class367.method2112(0, -2, false, arg0, arg2, 1, 1, 0, true)) {
                return;
            }
            class367.method2112(0, -3, false, arg0, arg2, 1, 1, 0, true);
        } else if (class367.method2112(0, -3, false, arg0, arg2, 1, 1, 0, true)) {
            return;
        } else {
            class367.method2112(0, -2, false, arg0, arg2, 1, 1, 0, true);
        }
        if (arg1 != -45) {
            method457(62, (byte) 51, 88);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I", line = 117)
    public static final int method458(int arg0, int arg1) {
        int var2 = 65 / ((-arg0 - 49) / 39);
        field708++;
        return arg1 >>> 10;
    }
}
