import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class122 extends class203 {

    @OriginalMember(owner = "client!th", name = "P", descriptor = "[B")
    public byte[] field2031;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Lmh;")
    private static class62 field2022 = class201.method1405(true, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!th", name = "J", descriptor = "Lmh;")
    public static class62 field2025 = class201.method1405(true, "blinken1:");

    @OriginalMember(owner = "client!th", name = "O", descriptor = "[I")
    public static int[] field2030 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lmh;")
    public static class62 field2024 = field2022;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "[I")
    public static int[] field2026 = new int[2];

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lmh;")
    public static class62 field2029 = class201.method1405(true, ")2");

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lmh;")
    public static class62 field2033 = class201.method1405(true, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method933(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class151 var5 = class165.method1194((byte) 1, arg2, arg0);
        var5.method1088(126);
        var5.field2395 = arg3;
        var5.field2380 = arg1;
        field2032++;
        var5.field2388 = arg4;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V", line = 37)
    public static final void method934(int arg0, int arg1, int arg2) {
        field2028++;
        if (class109.field1770 != arg1) {
            class283.field4840 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class283.field4840[var3] = (var3 << 12) / arg1;
            }
            class49.field717 = arg1 - 1;
            class102.field1670 = arg1 == 64 ? 2048 : 4096;
            class109.field1770 = arg1;
        }
        int var4 = -103 % ((42 - arg0) / 44);
        if (class266.field4496 == arg2) {
            return;
        }
        if (class109.field1770 == arg2) {
            class166.field2702 = class283.field4840;
        } else {
            class166.field2702 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class166.field2702[var5] = (var5 << 12) / arg2;
            }
        }
        class266.field4496 = arg2;
        class307.field5268 = arg2 - 1;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V", line = 87)
    public static void method935(int arg0) {
        field2025 = null;
        field2022 = null;
        field2029 = null;
        field2024 = null;
        field2026 = null;
        if (arg0 == 1) {
            field2033 = null;
            field2030 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILsg;)Z", line = 103)
    public static final boolean method936(int arg0, class191 arg1) {
        field2027++;
        if (arg1.field3103 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field3103.length; var2++) {
            int var3 = client.method2055(arg0 ^ 0xFFFFB3D6, var2, arg1);
            int var4 = arg1.field3214[var2];
            if (arg1.field3103[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3103[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3103[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 == 19515) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V", line = 186)
    public class122(byte[] arg0) {
        this.field2031 = arg0;
    }
}
