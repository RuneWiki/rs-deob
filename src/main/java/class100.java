import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class100 extends class535 {

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    private int field1548 = -1;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "Lci;")
    public static class320 field1557;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "[I")
    private int[] field1556;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILwn;I)V", line = 7)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1548 = arg1.method3018(566990904);
        }
        ++field1558;
        if (arg2 != -6232) {
            this.field1555 = 50;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 237)
    public class100() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[[I", line = 28)
    public final int[][] method61(int arg0, int arg1) {
        ++field1553;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (arg0 > -116) {
            this.method484(-103);
        }
        if (super.field7879.field1528) {
            int var4 = this.field1555 * (class362.field5263 == this.field1559 ? arg1 : this.field1559 * arg1 / class362.field5263);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class174.field2597 != this.field1555) {
                for (int var8 = 0; var8 < class174.field2597; ++var8) {
                    int var9 = this.field1555 * var8 / class174.field2597;
                    int var10 = this.field1556[var4 + var9];
                    var7[var8] = class168.method1203(4080, var10 << 4);
                    var6[var8] = class168.method1203(4080, var10 >> 4);
                    var5[var8] = class168.method1203(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class174.field2597 < ~var11; ++var11) {
                    int var12 = this.field1556[var4++];
                    var7[var11] = class168.method1203(var12, 255) << 4;
                    var6[var11] = class168.method1203(var12 >> 4, 4080);
                    var5[var11] = class168.method1203(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V", line = 92)
    public static final void method738(int arg0) {
        ++field1551;
        class17.field186 = -1;
        class213.field3219 = arg0;
        class112.field1651 = -1;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V", line = 102)
    public static final void method739(int arg0) {
        ++field1550;
        class218.field3339.method81(arg0 + 9918);
        class49.field909.method641(14919);
        class212.field3194.method3100(89);
        class481.field6991.setBackground(Color.black);
        class492.field7133 = -1;
        class218.field3339 = class270.method1752((byte) 117, class481.field6991);
        if (arg0 == -24777) {
            class49.field909 = class478.method2828(class481.field6991, true, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I", line = 120)
    public final int method740(byte arg0) {
        ++field1546;
        int var2 = -118 % ((36 - arg0) / 46);
        return this.field1548;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(B)V", line = 130)
    public static void method741(byte arg0) {
        if (arg0 != 37) {
            method738(-103);
        }
        field1557 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZI)V", line = 140)
    public final void method742(int arg0, boolean arg1, int arg2) {
        ++field1554;
        super.method742(arg0, arg1, arg2);
        if (~this.field1548 <= -1 && class402.field5711 != null) {
            int var4 = class402.field5711.method93((byte) -69, this.field1548).field823 ? 64 : 128;
            this.field1556 = class402.field5711.method94((byte) 88, 1.0F, false, var4, var4, this.field1548);
            this.field1555 = var4;
            this.field1559 = var4;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)I", line = 157)
    public static final int method743(int arg0, byte arg1) {
        ++field1560;
        int var2 = 0;
        if (~arg0 > -1 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (~arg0 <= -17) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (~arg0 <= -5) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg1 >= -82) {
            field1557 = null;
        }
        if (arg0 >= 1) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V", line = 205)
    public static final void method744(int arg0) {
        ++field1547;
        if (arg0 >= -117) {
            field1557 = null;
        }
        if (class294.field4388 == null || class434.field6213 == null) {
            class434.field6213 = new int[256];
            class294.field4388 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class294.field4388[var1] = (int) (4096.0D * Math.sin(var2));
                class434.field6213[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 240)
    public final void method484(int arg0) {
        super.method484(arg0);
        ++field1549;
        this.field1556 = null;
    }
}
