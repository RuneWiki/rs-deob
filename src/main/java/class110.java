import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class110 extends class535 {

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    private int field1630 = 2048;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    private int field1634 = 3072;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    private int field1637 = 1024;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "Lgm;")
    public static class81 field1628;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(B)V", line = 3)
    public static void method790(byte arg0) {
        field1628 = null;
        if (arg0 >= -94) {
            method791(29, (class519) null, -120);
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[I", line = 13)
    public final int[] method65(int arg0, int arg1) {
        ++field1633;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(62, 0, arg0);
            for (int var5 = 0; ~class174.field2597 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1630 >> 12) + this.field1637;
            }
        }
        if (arg1 != 1) {
            field1628 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[[I", line = 46)
    public final int[][] method61(int arg0, int arg1) {
        if (arg0 > -116) {
            method791(-39, (class519) null, 116);
        }
        ++field1627;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class174.field2597 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field1630 >> 12) + this.field1637;
                var9[var11] = (var6[var11] * this.field1630 >> 12) + this.field1637;
                var10[var11] = (var7[var11] * this.field1630 >> 12) + this.field1637;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 93)
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)V", line = 101)
    public final void method66(byte arg0) {
        ++field1636;
        this.field1630 = -this.field1637 + this.field1634;
        if (arg0 <= 111) {
            method790((byte) -113);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILwn;I)V", line = 117)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field7878 = arg1.method3072((byte) -127) == 1;
                    }
                } else {
                    this.field1634 = arg1.method3018(566990904);
                }
            } else {
                this.field1637 = arg1.method3018(arg2 ^ -566984816);
            }
            ++field1632;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILwn;I)Ljava/lang/String;", line = 171)
    public static final String method791(int arg0, class519 arg1, int arg2) {
        ++field1629;
        try {
            int var3 = arg1.method3033(11790);
            if (~var3 < ~arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            if (arg0 != 23481) {
                field1635 = -75;
            }
            arg1.field7558 += class194.field2811.method1703(arg1.field7545, arg1.field7558, var4, arg0 ^ 15110, 0, var3);
            return class337.method2141(var3, -1969, var4, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
