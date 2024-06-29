import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class208 extends class76 {

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "Lia;")
    private static class257 field3559 = class28.method234(-7, "glow2:");

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "Lia;")
    public static class257 field3564 = field3559;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Lia;")
    public static class257 field3561 = class28.method234(82, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "Lia;")
    public static class257 field3562 = class28.method234(103, ": ");

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lia;")
    public static class257 field3557 = field3559;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Z")
    public static boolean field3556;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)[Lte;")
    public static final class184[] method1398(byte arg0) {
        ++field3554;
        class184[] var1 = new class184[class135.field2421];
        for (int var2 = 0; ~class135.field2421 < ~var2; ++var2) {
            int var3 = class72.field1411[var2] * class193.field3287[var2];
            byte[] var4 = class137.field2454[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var3 > var6; ++var6) {
                var5[var6] = class3.field92[class30.method252(255, var4[var6])];
            }
            var1[var2] = new class190(class20.field427, class9.field184, class57.field1212[var2], class154.field2701[var2], class72.field1411[var2], class193.field3287[var2], var5);
        }
        if (arg0 != 14) {
            field3562 = null;
        }
        class126.method875(false);
        return var1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILmb;)V")
    public static final void method1399(int arg0, class178 arg1) {
        ++field3565;
        if (arg0 != 26) {
            field3557 = null;
        }
        class17.field373 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field3560;
        if (arg1 <= 2) {
            field3556 = false;
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var4[0];
            for (int var11 = 0; ~var11 > ~class96.field1807; ++var11) {
                var9[var11] = -var10[var11] + 4096;
                var6[var11] = -var7[var11] + 4096;
                var5[var11] = -var8[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            for (int var5 = 0; class96.field1807 > var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        ++field3555;
        if (arg0 != -9351) {
            field3557 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
    public static final void method1400(byte arg0) {
        int var1 = -87 / ((19 - arg0) / 59);
        ++field3558;
        if (class100.field1840.toLowerCase().indexOf("microsoft") == -1) {
            class74.field1447[45] = 26;
            if (class100.field1837 == null) {
                class74.field1447[222] = 59;
                class74.field1447[192] = 58;
            } else {
                class74.field1447[222] = 58;
                class74.field1447[192] = 28;
                class74.field1447[520] = 59;
            }
            class74.field1447[47] = 73;
            class74.field1447[92] = 74;
            class74.field1447[46] = 72;
            class74.field1447[61] = 27;
            class74.field1447[59] = 57;
            class74.field1447[44] = 71;
            class74.field1447[93] = 43;
            class74.field1447[91] = 42;
        } else {
            class74.field1447[221] = 43;
            class74.field1447[223] = 28;
            class74.field1447[188] = 71;
            class74.field1447[190] = 72;
            class74.field1447[191] = 73;
            class74.field1447[186] = 57;
            class74.field1447[189] = 26;
            class74.field1447[192] = 58;
            class74.field1447[219] = 42;
            class74.field1447[222] = 59;
            class74.field1447[220] = 74;
            class74.field1447[187] = 27;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
    public static void method1401(byte arg0) {
        field3559 = null;
        field3557 = null;
        field3561 = null;
        field3564 = null;
        field3562 = null;
        if (arg0 != 104) {
            method1398((byte) 31);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field1477 = arg0.method1051((byte) -128) == 1;
        }
        ++field3563;
        if (arg1 > -86) {
            this.method158((class152) null, (byte) 56, 2);
        }
    }
}
