import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class174 extends class134 {

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
    public int[] field2801 = new int[5];

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[Lng;")
    public class73[] field2812 = new class73[5];

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public int field2819 = 0;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "B")
    public byte field2802;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Laj;")
    public static class151 field2792;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Lml;")
    public class167 field2813;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lhi;")
    public class170 field2816;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lmc;")
    public class174 field2810;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Loh;")
    public class184 field2800;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lr;")
    public class23 field2805;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Lri;")
    public class251 field2817;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lla;")
    public class256 field2818;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lt;")
    public class52 field2808;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Z")
    public boolean field2798;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Z")
    public boolean field2799;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
    public boolean field2804;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        if (!arg0) {
            method1284(-82, -46);
        }
        field2792 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
    public static final void method1283(int arg0, byte arg1) {
        int var2 = class263.field4393;
        field2795++;
        if (arg1 > -93) {
            method1282(false);
        }
        int var3 = class107.field1758;
        int var4 = class183.field2926;
        int var5 = class76.field1302;
        int var6 = class245.field4102;
        int var7 = (int) class187.field2993;
        int var8 = (int) class265.field4432 + class17.field338 & 0x7FF;
        if (class163.field2644 / 256 > var7) {
            var7 = class163.field2644 / 256;
        }
        if (class71.field1210[4] && var7 < class219.field3699[4] + 128) {
            var7 = class219.field3699[4] + 128;
        }
        class16.method91(class277.method1939(class182.field2898, class16.field314.field715, class16.field314.field771, (byte) -34) - 50, var7, arg0, var7 * 3 + 600, (byte) -108, class100.field1592, class127.field2115, var8);
        if (class107.field1758 == var3 && class263.field4393 == var2 && class76.field1302 == var5 && class183.field2926 == var4 && class245.field4102 == var6) {
            class169.field2739 = 1;
            return;
        }
        int var9 = class245.field4102 - var6;
        class145.field2385 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        class189.field3026 = 10;
        if (var2 < class263.field4393) {
            var2 += (class263.field4393 - var2) * class145.field2385 / 1000 + class189.field3026;
            if (class263.field4393 > var2) {
                class263.field4393 = var2;
            }
        }
        if (var3 < class107.field1758) {
            var3 += (class107.field1758 - var3) * class145.field2385 / 1000 + class189.field3026;
            if (class107.field1758 > var3) {
                class107.field1758 = var3;
            }
        }
        class261.field4384 = 10;
        class209.field3533 = 10;
        if (var5 < class76.field1302) {
            var5 += (class76.field1302 - var5) * class145.field2385 / 1000 + class189.field3026;
            if (var5 < class76.field1302) {
                class76.field1302 = var5;
            }
        }
        if (var9 > 0) {
            int var10 = class209.field3533 * var9 / 1000 + class261.field4384 + var6;
            var6 = var10 & 0x7FF;
        }
        if (var4 < class183.field2926) {
            var4 += (class183.field2926 - var4) * class209.field3533 / 1000 + class261.field4384;
            if (var4 < class183.field2926) {
                class183.field2926 = var4;
            }
        }
        if (var2 > class263.field4393) {
            int var11 = var2 - ((var2 - class263.field4393) * class145.field2385 / 1000 + class189.field3026);
            if (class263.field4393 < var11) {
                class263.field4393 = var11;
            }
        }
        if (var9 < 0) {
            int var12 = var6 - (-var9 * class209.field3533 / 1000 + class261.field4384);
            var6 = var12 & 0x7FF;
        }
        if (var4 > class183.field2926) {
            int var13 = var4 - ((var4 - class183.field2926) * class209.field3533 / 1000 + class261.field4384);
            if (var13 > class183.field2926) {
                class183.field2926 = var13;
            }
        }
        if (class76.field1302 < var5) {
            int var14 = var5 - (class189.field3026 + ((var5 - class76.field1302) * class145.field2385 / 1000));
            if (var14 > class76.field1302) {
                class76.field1302 = var14;
            }
        }
        int var15 = class245.field4102 - var6;
        if (class107.field1758 < var3) {
            int var16 = var3 - ((var3 - class107.field1758) * class145.field2385 / 1000 + class189.field3026);
            if (var16 > class107.field1758) {
                class107.field1758 = var16;
            }
        }
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 >= 0 || var9 <= 0 || var15 > 0 && var9 < 0) {
            class245.field4102 = var6;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
    public static final boolean method1284(int arg0, int arg1) {
        field2794++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class195.field3154[arg1];
        if (arg0 == 4001) {
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        int var1 = 0;
        field2791++;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class30.method190(true, var1, class90.field1498, var2, var3, (byte) 112)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)I")
    public static final int method1286(byte arg0, int arg1, int arg2) {
        field2796++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != -38) {
            return -43;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(III)V")
    public class174(int arg0, int arg1, int arg2) {
        this.field2803 = arg2;
        this.field2821 = this.field2807 = arg0;
        this.field2806 = arg1;
    }
}
