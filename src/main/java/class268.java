import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class268 extends class544 {

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[C")
    private static char[] field3492 = new char[64];

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "F")
    public static float field3499;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field3504;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3492[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3492[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3492[var2] = (char) (var2 + 48 - 52);
        }
        field3492[63] = '/';
        field3492[62] = '+';
        field3503 = -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 6)
    public final int method1499(int arg0) {
        field3498++;
        if (arg0 != 0) {
            field3499 = -0.86053133F;
        }
        return class62.method359((byte) 81, this.field3493);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method1500(int arg0) {
        if (arg0 != -26680) {
            field3503 = -12;
        }
        field3501++;
        return (this.field3493 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method1501(int arg0) {
        field3496++;
        if (arg0 != 0) {
            method1502((byte) -7, null);
        }
        return (this.field3493 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)[B", line = 46)
    public static final byte[] method1502(byte arg0, byte[] arg1) {
        field3495++;
        class374 var2 = new class374(arg1);
        if (arg0 != 49) {
            field3492 = null;
        }
        int var3 = var2.method2129(-99);
        int var4 = var2.method2123(false);
        if (var4 < 0 || !(class246.field3156 == 0 || var4 <= class246.field3156)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2147(var5, (byte) -117, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2123(false);
            if (var6 < 0 || class246.field3156 != 0 && class246.field3156 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class500.method2888(var7, var6, arg1, var4, 9);
            } else {
                class595 var8 = class259.field3335;
                synchronized (class259.field3335) {
                    class259.field3335.method3449(var2, var7, arg0 - 164);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 103)
    public static void method1503(byte arg0) {
        int var1 = 70 % ((arg0 - 57) / 44);
        field3492 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I", line = 139)
    public final int method1504(byte arg0) {
        field3494++;
        if (arg0 != 108) {
            this.method1507(-71);
        }
        return this.field3493 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V", line = 150)
    public static final void method1505(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3497++;
        class136.field1663.field4966 = 0;
        class136.field1663.method2093(class368.field4848.field3279, -112);
        class136.field1663.method2093(arg0, -116);
        class136.field1663.method2093(arg2, -116);
        class136.field1663.method2115(arg4, 3324);
        class136.field1663.method2115(arg1, 3324);
        class71.field687 = 0;
        class137.field1672 = 1;
        if (arg3 >= -46) {
            field3492 = null;
        }
        class197.field2379 = -3;
        class585.field8495 = 0;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V", line = 170)
    public class268(int arg0, int arg1) {
        this.field3500 = arg1;
        this.field3493 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Z", line = 180)
    public final boolean method1506(int arg0, byte arg1) {
        field3491++;
        if (arg1 > -120) {
            this.method1507(39);
        }
        return (this.field3493 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)Z", line = 194)
    public final boolean method1507(int arg0) {
        field3504++;
        if (arg0 < 77) {
            this.method1504((byte) 68);
        }
        return (this.field3493 & 0x1) != 0;
    }
}
