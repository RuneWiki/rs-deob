import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class239 extends class46 {

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field3801 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3798 = -2;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "[I")
    public static int[] field3810 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "B")
    public static byte field3817;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "Lib;")
    public class313 field3811;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Lak;")
    public class330 field3806;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lak;")
    public class330 field3808;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lqh;")
    public class33 field3796;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lan;")
    public class85 field3794;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Z")
    public boolean field3819;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "[I")
    public int[] field3799;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "[[[B")
    public static byte[][][] field3816;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V", line = 5)
    public final void method1664(int arg0) {
        field3805++;
        if (arg0 != -8187) {
            return;
        }
        int var2 = this.field3803;
        if (this.field3794 != null) {
            class85 var5 = this.field3794.method598((byte) -80);
            if (var5 == null) {
                this.field3815 = 0;
                this.field3799 = null;
                this.field3797 = 0;
                this.field3795 = 0;
                this.field3803 = -1;
                this.field3802 = 0;
            } else {
                this.field3803 = var5.field1319;
                this.field3795 = var5.field1364;
                this.field3802 = var5.field1378;
                this.field3797 = var5.field1383 * 128;
                this.field3799 = var5.field1338;
                this.field3815 = var5.field1387;
            }
        } else if (this.field3811 != null) {
            int var3 = class30.method254((byte) 74, this.field3811);
            if (var2 != var3) {
                class206 var4 = this.field3811.field4859;
                this.field3803 = var3;
                if (var4.field3120 != null) {
                    var4 = var4.method1465(28);
                }
                if (var4 == null) {
                    this.field3802 = this.field3797 = 0;
                } else {
                    this.field3802 = var4.field3148;
                    this.field3797 = var4.field3122 * 128;
                }
            }
        } else if (this.field3796 != null) {
            this.field3803 = class206.method1471(this.field3796, arg0 + 8186);
            this.field3797 = this.field3796.field494 * 128;
            this.field3802 = this.field3796.field500;
        }
        if (this.field3803 != var2 && this.field3806 != null) {
            class98.field1560.method1864(this.field3806);
            this.field3806 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)[Lqd;", line = 94)
    public static final class252[] method1665(int arg0) {
        field3813++;
        class252[] var1 = new class252[class290.field4519];
        for (int var2 = arg0; var2 < class290.field4519; var2++) {
            if (class94.field1516) {
                var1[var2] = new class172(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], class306.field4757[var2], class63.field1002);
            } else {
                var1[var2] = new class168(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], class306.field4757[var2], class63.field1002);
            }
        }
        class7.method56((byte) 59);
        return var1;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 141)
    public static void method1666(int arg0) {
        if (arg0 != -1) {
            field3816 = (byte[][][]) ((byte[][][]) null);
        }
        field3816 = (byte[][][]) null;
        field3810 = null;
    }
}
