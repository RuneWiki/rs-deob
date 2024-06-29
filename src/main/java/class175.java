import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class175 extends class6 {

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "Z")
    public volatile boolean field2597 = true;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "[I")
    public static int[] field2593 = new int[13];

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field2596 = 328;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "Ldi;")
    public static class83 field2599 = new class83(1, 2);

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "Z")
    public boolean field2600;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "Z")
    public boolean field2601;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1129(boolean arg0) {
        class162.method1062((byte) -91, class20.field269.field7669);
        field2594++;
        int var1 = (class510.field7566 >> 3) + (class329.field4493 >> 10);
        class436.field6379 = class316.field4324.field1738 = 0;
        int var2 = (class373.field5478 >> 10) + (class14.field204 >> 3);
        class316.field4324.method2586(8, -12186, 8);
        byte var3 = 18;
        class80.field1224 = new byte[var3][];
        class487.field7130 = new int[var3];
        class411.field6007 = new int[var3];
        class526.field7779 = new byte[var3][];
        class110.field1657 = new int[var3];
        class117.field1750 = new int[var3];
        class318.field4372 = new byte[var3][];
        class310.field4218 = new int[var3];
        class250.field3463 = new int[var3];
        class110.field1649 = new int[var3][4];
        class11.field165 = new byte[var3][];
        class322.field4391 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class527.field7799 >> 4)) / 8; var5 <= ((var1 + (class527.field7799 >> 4)) / 8); var5++) {
            for (int var7 = (var2 - (class422.field6182 >> 4)) / 8; var7 <= ((class422.field6182 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class310.field4218[var4] = var8;
                class117.field1750[var4] = class297.field4079.method735(-111, "m" + var5 + "_" + var7);
                class487.field7130[var4] = class297.field4079.method735(-73, "l" + var5 + "_" + var7);
                class411.field6007[var4] = class297.field4079.method735(-104, "n" + var5 + "_" + var7);
                class250.field3463[var4] = class297.field4079.method735(80, "um" + var5 + "_" + var7);
                class110.field1657[var4] = class297.field4079.method735(113, "ul" + var5 + "_" + var7);
                if (class411.field6007[var4] == -1) {
                    class117.field1750[var4] = -1;
                    class487.field7130[var4] = -1;
                    class250.field3463[var4] = -1;
                    class110.field1657[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class411.field6007.length; var6++) {
            class411.field6007[var6] = -1;
            class117.field1750[var6] = -1;
            class487.field7130[var6] = -1;
            class250.field3463[var6] = -1;
            class110.field1657[var6] = -1;
        }
        class484.method2848(arg0, var2, var1, (byte) 119, false);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 88)
    public static final void method1130(byte arg0) {
        field2595++;
        class509.method3049(-127, (long) class441.field6516, class269.field3721);
        if (class188.field2723 != -1) {
            class441.method2622(class188.field2723, arg0 - 232);
        }
        for (int var1 = 0; var1 < class9.field146; var1++) {
            if (class463.field6801[var1]) {
                class165.field2477[var1] = true;
            }
            class25.field330[var1] = class463.field6801[var1];
            class463.field6801[var1] = false;
        }
        class264.field3653 = class441.field6516;
        if (arg0 != 31) {
            method1130((byte) 115);
        }
        if (class269.field3721.method308()) {
            class401.field5885 = true;
        }
        if (class188.field2723 != -1) {
            class9.field146 = 0;
            class186.method1174((byte) -123);
        }
        class269.field3721.method260();
        class66.method567(74, class297.field4078);
        class193.field2758 = 0;
    }

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V", line = 131)
    public static void method1131(int arg0) {
        field2599 = null;
        if (arg0 == -4122) {
            field2593 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(CI)Z", line = 155)
    public static final boolean method1132(char arg0, int arg1) {
        field2602++;
        if (!(arg1 <= ~arg0 || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class112.field1678;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)I")
    public abstract int method657(int arg0);

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)[B")
    public abstract byte[] method656(int arg0);
}
