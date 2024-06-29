import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class110 extends class300 {

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    private int field1588 = 0;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field1586 = 12288;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    private int field1589 = 2048;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    private int field1587 = 0;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field1584 = 8192;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field1592 = 4096;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field1591 = 2048;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lke;")
    public static class106 field1595 = new class106(64);

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "[I")
    public static int[] field1596 = new int[2500];

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lvk;")
    public static class160 field1594;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lvl;")
    public static class73 field1585;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field1581;
        class123.method801(-98);
        if (arg0 <= 126) {
            this.field1586 = -16;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)Z")
    private final boolean method733(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field1586 >> 12;
        ++field1582;
        if (arg2 < 53) {
            this.field1589 = -104;
        }
        int var5 = class255.field4160[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1586;
        int var7 = (var6 << 12) / this.field1584;
        int var8 = this.field1592 * var7 >> 12;
        return var8 > arg0 - arg1 && -arg1 + arg0 > -var8;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)Z")
    private final boolean method734(int arg0, int arg1, int arg2) {
        int var4 = -41 % ((arg1 - 56) / 47);
        ++field1583;
        int var5 = (-arg0 + arg2) * this.field1586 >> 12;
        int var6 = class255.field4160[255 & var5 * 255 >> 12];
        int var7 = (var6 << 12) / this.field1586;
        int var8 = (var7 << 12) / this.field1584;
        int var9 = this.field1592 * var8 >> 12;
        return ~(arg0 + arg2) > ~var9 && ~(-var9) > ~(arg0 + arg2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field1590;
        if (arg1 < -43) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field1584 = arg0.method1186((byte) -102);
                                    }
                                } else {
                                    this.field1592 = arg0.method1186((byte) -35);
                                }
                            } else {
                                this.field1586 = arg0.method1186((byte) -88);
                            }
                        } else {
                            this.field1589 = arg0.method1186((byte) -47);
                        }
                    } else {
                        this.field1588 = arg0.method1186((byte) -74);
                    }
                } else {
                    this.field1587 = arg0.method1186((byte) -47);
                }
            } else {
                this.field1591 = arg0.method1186((byte) -37);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field1593;
        if (arg1 != -957953300) {
            this.method734(-88, -74, -69);
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int var4 = class235.field3797[arg0] + -2048;
            for (int var5 = 0; class180.field2826 > var5; ++var5) {
                int var6 = class5.field73[var5] + -2048;
                int var7 = var6 - -this.field1588;
                int var8 = var6 - -this.field1591;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = this.field1587 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field1589 + var4;
                int var14 = var8 >= -2048 ? var8 : var8 - -4096;
                int var15 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var16 = var14 > 2048 ? var14 - 4096 : var14;
                int var17 = var9 <= 2048 ? var9 : var9 + -4096;
                int var18 = ~var15 < -2049 ? var15 + -4096 : var15;
                var3[var5] = !this.method734(var16, -45, var12) && !this.method733(var18, var17, 65) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method735(int arg0) {
        field1595 = null;
        field1594 = null;
        if (arg0 != 2012526092) {
            method735(53);
        }
        field1585 = null;
        field1596 = null;
    }
}
