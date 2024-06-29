import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class103 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lli;")
    public static class185 field1862 = class245.method1649("comp-Btence ", -84);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lli;")
    public static class185 field1865 = class245.method1649(":chalreq:", -117);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lli;")
    private static class185 field1869 = class245.method1649("Loaded wordpack", 124);

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lli;")
    public static class185 field1864 = field1869;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljd;II)Lli;")
    public static final class185 method722(class118 arg0, int arg1, int arg2) {
        field1863++;
        try {
            if (arg2 != 1) {
                field1869 = null;
            }
            class185 var3 = new class185();
            var3.field3437 = arg0.method836((byte) -84);
            if (arg1 < var3.field3437) {
                var3.field3437 = arg1;
            }
            var3.field3411 = new byte[var3.field3437];
            arg0.field2155 += class15.field265.method565(arg0.field2155, arg0.field2115, var3.field3411, -6999, var3.field3437, 0);
            return var3;
        } catch (Exception var4) {
            return class33.field542;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
    public abstract int method723(int arg0, byte arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static final void method724() {
        for (int var0 = 0; var0 < class276.field4884; var0++) {
            class49 var1 = class281.field4969[var0];
            class179.method1267(var1);
            class281.field4969[var0] = null;
        }
        class276.field4884 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method725(byte arg0) {
        field1869 = null;
        field1864 = null;
        field1865 = null;
        field1862 = null;
        int var1 = -85 / ((37 - arg0) / 36);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method726(int arg0) {
        int var1 = (class241.field4310.field2694 >> 7) + class77.field1339;
        field1867++;
        class79.field1388 = 0;
        if (arg0 != 2969) {
            field1868 = 16;
        }
        int var2 = (class241.field4310.field2687 >> 7) + class107.field1933;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class79.field1388 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class79.field1388 = 1;
        }
        if (class79.field1388 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class79.field1388 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lil;")
    public abstract class46 method727(int arg0);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method728(int arg0, byte arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILgb;)V")
    public static final void method729(int arg0, class142 arg1) {
        field1866++;
        if (arg0 != 10383) {
            field1869 = null;
        }
        if (arg1.field2705 == 0) {
            return;
        }
        if (arg1.field2665 != -1 && arg1.field2665 < 32768) {
            class71 var2 = class87.field1712[arg1.field2665];
            if (var2 != null) {
                int var3 = arg1.field2694 - var2.field2694;
                int var4 = arg1.field2687 - var2.field2687;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2683 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2665 >= 32768) {
            int var5 = arg1.field2665 - 32768;
            if (class249.field4421 == var5) {
                var5 = 2047;
            }
            class188 var6 = class93.field1774[var5];
            if (var6 != null) {
                int var7 = arg1.field2694 - var6.field2694;
                int var8 = arg1.field2687 - var6.field2687;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2683 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2717 != 0 || arg1.field2649 != 0) && (arg1.field2686 == 0 || arg1.field2677 > 0)) {
            int var9 = arg1.field2694 - (arg1.field2717 - class77.field1339 - class77.field1339) * 64;
            int var10 = arg1.field2687 - ((arg1.field2649 - class107.field1933 - class107.field1933) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field2683 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2649 = 0;
            arg1.field2717 = 0;
        }
        int var11 = arg1.field2683 - arg1.field2695 & 0x7FF;
        if (var11 == 0) {
            arg1.field2704 = 0;
            return;
        }
        arg1.field2704++;
        if (var11 <= 1024) {
            arg1.field2695 += arg1.field2705;
            boolean var12 = true;
            if (var11 < arg1.field2705 || (2048 - arg1.field2705) < var11) {
                arg1.field2695 = arg1.field2683;
                var12 = false;
            }
            if (arg1.field2693 == arg1.field2654 && (arg1.field2704 > 25 || var12)) {
                if (arg1.field2666 == -1) {
                    arg1.field2654 = arg1.field2700;
                } else {
                    arg1.field2654 = arg1.field2666;
                }
            }
        } else {
            arg1.field2695 -= arg1.field2705;
            boolean var13 = true;
            if (arg1.field2705 > var11 || var11 > (2048 - arg1.field2705)) {
                var13 = false;
                arg1.field2695 = arg1.field2683;
            }
            if (arg1.field2693 == arg1.field2654 && (arg1.field2704 > 25 || var13)) {
                if (arg1.field2648 == -1) {
                    arg1.field2654 = arg1.field2700;
                } else {
                    arg1.field2654 = arg1.field2648;
                }
            }
        }
        arg1.field2695 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(IB)V")
    public abstract void method730(int arg0, byte arg1);
}
