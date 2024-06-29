import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class28 {

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "[J")
    private long[] field482 = new long[10];

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    private int field473 = 256;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    private int field483 = 1;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    private int field484 = 0;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "J")
    private long field478 = class102.method801((byte) -42);

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lhe;")
    public static class54 field468 = class6.method58("Welt", false);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "[[I")
    public static int[][] field472 = new int[104][104];

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Lhe;")
    public static class54 field471 = class6.method58("Stufe)2", false);

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[Leb;")
    public static class31[] field475 = new class31[256];

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Lhe;")
    private static class54 field479 = class6.method58("RuneScape has been updated(Q", false);

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field485 = -1;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
    public static int[] field487 = new int[5];

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lhe;")
    public static class54 field480 = field479;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lef;")
    public static class35 field466;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "[[[I")
    public static int[][][] field474;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZII)I")
    public final int method143(boolean arg0, int arg1, int arg2) {
        field486++;
        int var4 = this.field483;
        this.field483 = 1;
        int var5 = this.field473;
        this.field473 = 300;
        this.field478 = class102.method801((byte) -42);
        if (!arg0) {
            field471 = null;
        }
        if (this.field482[this.field477] == 0L) {
            this.field483 = var4;
            this.field473 = var5;
        } else if (this.field482[this.field477] < this.field478) {
            this.field473 = (int) ((long) (arg2 * 2560) / (this.field478 - this.field482[this.field477]));
        }
        if (this.field473 < 25) {
            this.field473 = 25;
        }
        if (this.field473 > 256) {
            this.field473 = 256;
            this.field483 = (int) ((long) arg2 - (this.field478 - this.field482[this.field477]) / 10L);
        }
        if (arg2 < this.field483) {
            this.field483 = arg2;
        }
        this.field482[this.field477] = this.field478;
        this.field477 = (this.field477 + 1) % 10;
        if (this.field483 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field482[var6] != 0L) {
                    this.field482[var6] += this.field483;
                }
            }
        }
        int var7 = 0;
        if (this.field483 < arg1) {
            this.field483 = arg1;
        }
        class50.method360((long) this.field483, 10);
        while (this.field484 < 256) {
            this.field484 += this.field473;
            var7++;
        }
        this.field484 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static final void method144(int arg0) {
        field470++;
        int var1 = class135.field3067.method1172(class49.field1187);
        for (int var2 = 0; var2 < class67.field1641; var2++) {
            int var6 = class135.field3067.method1172(class108.method821(var2, true));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class82.field2017 = class67.field1641 * 15 + 22;
        class133.field3007 = true;
        var1 += 8;
        int var3 = class71.field1763 - var1 / 2;
        class125.field2870 = var1;
        if (var1 + var3 > 765) {
            var3 = 765 - var1;
        }
        int var4 = class21.field582;
        int var5 = class67.field1641 * 15 - arg0;
        if (var3 < 0) {
            var3 = 0;
        }
        if (var4 + var5 > 503) {
            var4 = 503 - var5;
        }
        class142.field3242 = var3;
        if (var4 < 0) {
            var4 = 0;
        }
        class7.field212 = var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method145(int arg0) {
        field467++;
        int var2 = 0;
        if (arg0 != -1) {
            this.field483 = -22;
        }
        while (var2 < 10) {
            this.field482[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public static void method146(int arg0) {
        field472 = null;
        if (arg0 != 256) {
            field476 = 99;
        }
        field468 = null;
        field487 = null;
        field479 = null;
        field474 = null;
        field480 = null;
        field466 = null;
        field471 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II[Lac;[BIIIZII)V")
    public static final void method147(int arg0, int arg1, class4[] arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (!arg7) {
            field487 = null;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg2[arg9].field117[arg5 + var10][arg8 + var15] = class118.method887(arg2[arg9].field117[arg5 + var10][arg8 + var15], -16777217);
                }
            }
        }
        field469++;
        class83 var11 = new class83(arg3);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && arg0 <= var13 && var13 < arg0 + 8 && var14 >= arg6 && arg6 + 8 > var14) {
                        class157.method1209(arg9, arg5 + class34.method254(var13 & 0x7, (byte) 18, var14 & 0x7, arg4), arg8 + class39.method298(var14 & 0x7, arg4, (byte) -70, var13 & 0x7), var11, 0, -105, 0, arg4);
                    } else {
                        class157.method1209(0, -1, -1, var11, 0, -105, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class16() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field482[var1] = this.field478;
        }
    }
}
