import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class129 extends class134 {

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lcc;")
    public static class216 field1983 = new class216(64);

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
    public static final int method930(int arg0, int arg1, int arg2, int arg3) {
        field1987++;
        if (class220.field3533 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg2 < 58) {
            field1984 = 75;
        }
        if (arg3 < 3 && (class86.field1277[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class220.field3533[var6][var5][var4 + 1] + class220.field3533[var6][var5 + 1][var4 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class220.field3533[var6][var5][var4] + class220.field3533[var6][var5 + 1][var4] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field1983 = null;
        if (arg0 != -24) {
            field1984 = 57;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
    public static final void method932(byte arg0) {
        field1988++;
        if (class229.field3689 > class6.field52) {
            class6.field52 = (float) ((double) class6.field52 / 30.0D + (double) class6.field52);
            if (class229.field3689 < class6.field52) {
                class6.field52 = class229.field3689;
            }
            class110.method809(true);
        } else if (class6.field52 > class229.field3689) {
            class6.field52 = (float) ((double) class6.field52 - (double) class6.field52 / 30.0D);
            if (class6.field52 < class229.field3689) {
                class6.field52 = class229.field3689;
            }
            class110.method809(true);
        }
        if (arg0 >= -104) {
            field1983 = null;
        }
        if (class29.field339 == -1 || class112.field1613 == -1) {
            return;
        }
        int var1 = class112.field1613 - class296.field4682;
        int var2 = class29.field339 - class172.field2765;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class172.field2765 += var2;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 == 0 && var1 == 0) {
            class29.field339 = -1;
            class112.field1613 = -1;
        }
        class296.field4682 += var1;
        class110.method809(true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
    public static final void method933(int arg0, byte arg1) {
        field1986++;
        if (class105.field1533 == null) {
            class105.field1533 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class105.field1533[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 104) {
            method930(-61, 119, -123, 39);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lv;I)V")
    public static final void method934(class152 arg0, int arg1) {
        field1985++;
        byte[] var2 = new byte[24];
        if (class163.field2646 != null) {
            try {
                int var3 = 0;
                class163.field2646.method1402(0L, (byte) -12);
                class163.field2646.method1396(false, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1075(var2, -1279016712, 24, 0);
        if (arg1 != 10204) {
            field1983 = null;
        }
    }
}
