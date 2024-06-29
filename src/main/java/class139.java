import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class139 extends class175 {

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    private int field2495 = -1;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "Lmb;")
    private static class96 field2486 = class243.method1708("Loading interfaces )2 ", (byte) 121);

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Lmb;")
    public static class96 field2489 = class243.method1708("hint_headicons", (byte) 113);

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "Lmb;")
    public static class96 field2484 = field2486;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "Lmb;")
    public static class96 field2499 = class243.method1708("Mem:", (byte) 109);

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "[I")
    public static int[] field2492;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "[I")
    private int[] field2493;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "[Lrf;")
    public static class30[] field2491;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I")
    public final int method1034(int arg0) {
        ++field2487;
        return arg0 != -25939 ? 105 : this.field2495;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
    public static void method1035(boolean arg0) {
        if (arg0) {
            method1039(84, (class239) null);
        }
        field2492 = null;
        field2499 = null;
        field2486 = null;
        field2484 = null;
        field2491 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(III)Lsb;")
    public static final class105 method1036(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3269;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field3035.method637(arg0, false);
        if (arg1 != 64) {
            field2486 = null;
        }
        if (super.field3035.field1493 && this.method1037((byte) -52)) {
            int var4 = this.field2481 * (class85.field1440 != this.field2496 ? this.field2496 * arg0 / class85.field1440 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class1.field11 != ~this.field2481) {
                for (int var8 = 0; class1.field11 > var8; ++var8) {
                    int var9 = this.field2481 * var8 / class1.field11;
                    int var10 = this.field2493[var4 + var9];
                    var7[var8] = class130.method985(var10 << 4, 4080);
                    var6[var8] = class130.method985(var10 >> 4, 4080);
                    var5[var8] = class130.method985(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class1.field11; ++var11) {
                    int var12 = this.field2493[var4++];
                    var7[var11] = class130.method985(4080, var12 << 4);
                    var6[var11] = class130.method985(var12 >> 4, 4080);
                    var5[var11] = class130.method985(4080, var12 >> 12);
                }
            }
        }
        ++field2498;
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)Z")
    private final boolean method1037(byte arg0) {
        ++field2497;
        if (arg0 > -40) {
            method1035(true);
        }
        if (this.field2493 != null) {
            return true;
        } else if (this.field2495 >= 0) {
            int var2 = class85.field1440;
            int var3 = class1.field11;
            int var4 = !class187.field3262.method902(-81, this.field2495) ? 128 : 64;
            this.field2493 = class187.field3262.method890(this.field2495, (byte) 95);
            this.field2496 = var4;
            this.field2481 = var4;
            class210.method1461(var2, var3, 4);
            return this.field2493 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 == 0) {
            this.field2495 = arg2.method1663((byte) -98);
        }
        int var4 = 45 / ((-22 - arg0) / 58);
        ++field2483;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
    public final void method1038(int arg0) {
        super.method1038(arg0);
        this.field2493 = null;
        ++field2485;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILrg;)Ldd;")
    public static final class265 method1039(int arg0, class239 arg1) {
        if (arg0 < 113) {
            return null;
        } else {
            ++field2494;
            class265 var2 = new class265(arg1.method1634(-57), arg1.method1634(-48), arg1.method1663((byte) 81), arg1.method1663((byte) -115), arg1.method1617((byte) -43), ~arg1.method1651(4139) == -2);
            int var3 = arg1.method1651(4139);
            for (int var4 = 0; var3 > var4; ++var4) {
                var2.field4630.method1814(1, new class167(arg1.method1663((byte) 118), arg1.method1663((byte) 63), arg1.method1663((byte) -53), arg1.method1663((byte) -61)));
            }
            var2.method1828((byte) -111);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, false);
    }
}
