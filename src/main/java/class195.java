import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class195 extends class136 {

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field2833 = 0;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    private int field2837 = 10;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field2838 = 2048;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    public static boolean field2843 = false;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lsl;")
    public static class318 field2839 = new class318(46, 8);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Lfa;")
    public static class156 field2846 = new class156(64);

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Z")
    public static boolean field2847 = false;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Z")
    public static boolean field2848 = false;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    private int[] field2832;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[I")
    private int[] field2842;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 5)
    public final void method269(boolean arg0) {
        this.method1367(-3);
        if (arg0) {
            field2848 = true;
        }
        ++field2845;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILiv;)V", line = 19)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field2836;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2833 = arg2.method577(255);
                }
            } else {
                this.field2838 = arg2.method623((byte) -116);
            }
        } else {
            this.field2837 = arg2.method577(255);
        }
        if (arg0 != 4) {
            field2848 = false;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;Lla;I)V", line = 65)
    public static final void method1364(boolean arg0, String arg1, class314 arg2, int arg3) {
        ++field2844;
        byte var4 = 4;
        int var5 = 6 - -var4;
        int var6 = var4 + 6;
        int var7 = class307.field4366.method1978((byte) -103, arg1, 250, (class16[]) null);
        int var8 = class307.field4366.method1976(94, (class16[]) null, 250, arg1) * arg3;
        class225.field3300.method386(-var4 + var5, var6 - var4, var4 + var4 + var7, var4 + var8 + var4, -16777216, 0);
        class225.field3300.method397(-var4 + var5, -var4 + var6, var4 + var4 + var7, var4 + var8 + var4, -1, 0);
        arg2.method1963(-1, 0, (class16[]) null, 0, 1, (class10) null, var6, var5, 0, 0, var8, var7, -1, 1, arg1, (int[]) null);
        class410.method2512(-var4 + var5, true, var8 - -var4 + var4, var4 + var7 + var4, -var4 + var6);
        if (arg0) {
            class225.field3300.method302();
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 89)
    public static final void method1365(int arg0) {
        ++field2835;
        class432.method2619((byte) 56, 25);
        class283.method1806(2048);
        System.gc();
        int var1 = 82 / ((10 - arg0) / 47);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CZ)Z", line = 104)
    public static final boolean method1366(char arg0, boolean arg1) {
        ++field2841;
        if (arg1) {
            return false;
        } else {
            return ~arg0 <= -49 && ~arg0 >= -58;
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 115)
    private final void method1367(int arg0) {
        ++field2840;
        this.field2832 = new int[this.field2837 - -1];
        this.field2842 = new int[this.field2837 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field2837;
        int var4 = this.field2838 * var3 >> 12;
        if (arg0 != -3) {
            this.method82(18, 43);
        }
        for (int var5 = 0; ~this.field2837 < ~var5; ++var5) {
            this.field2832[var5] = var2;
            this.field2842[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2832[this.field2837] = 4096;
        this.field2842[this.field2837] = this.field2842[0] + 4096;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 292)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I", line = 150)
    public final int[] method82(int arg0, int arg1) {
        ++field2834;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 20 % ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            int var5 = class290.field4168[arg1];
            if (this.field2833 != 0) {
                for (int var6 = 0; ~class467.field6889 < ~var6; ++var6) {
                    int var7 = 0;
                    short var8 = 0;
                    int var9 = class453.field6672[var6];
                    int var10 = this.field2833;
                    if (~var10 != -2) {
                        if (~var10 != -3) {
                            if (var10 == 3) {
                                var7 = (-var5 + var9 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var5 + var9 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var7 = var9;
                    }
                    for (int var11 = 0; ~var11 > ~this.field2837; ++var11) {
                        if (~var7 <= ~this.field2832[var11] && var7 < this.field2832[var11 - -1]) {
                            if (~this.field2842[var11] < ~var7) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var6] = var8;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; ~this.field2837 < ~var13; ++var13) {
                    if (var5 >= this.field2832[var13] && var5 < this.field2832[var13 - -1]) {
                        if (var5 < this.field2842[var13]) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class201.method1409(var3, 0, class467.field6889, var12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 272)
    public static void method1368(byte arg0) {
        field2839 = null;
        field2846 = null;
        if (arg0 != -48) {
            method1366((char) 65414, true);
        }
    }
}
