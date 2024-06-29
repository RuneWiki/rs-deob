import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class141 extends class386 {

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    private int field1762 = -1;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "Luf;")
    public static class414 field1760 = new class414();

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field1768 = new String[5];

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "Lsq;")
    public static class161 field1770 = new class161(3, 2);

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "[I")
    public int[] field1766;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 3)
    public final void method926(boolean arg0) {
        ++field1763;
        super.method926(arg0);
        this.field1766 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIII)V", line = 14)
    public static final void method927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 == 6926) {
            ++field1765;
            int var8 = class396.method2393(class598.field8632, class288.field3883, 5890, arg6);
            int var9 = class396.method2393(class598.field8632, class288.field3883, 5890, arg7);
            int var10 = class396.method2393(class587.field8513, class221.field2866, 5890, arg3);
            int var11 = class396.method2393(class587.field8513, class221.field2866, 5890, arg1);
            int var12 = class396.method2393(class598.field8632, class288.field3883, 5890, arg5 + arg6);
            int var13 = class396.method2393(class598.field8632, class288.field3883, 5890, -arg5 + arg7);
            for (int var14 = var8; ~var12 < ~var14; ++var14) {
                class359.method2018(class678.field9722[var14], var11, arg4 ^ -7036, arg0, var10);
            }
            for (int var15 = var9; var15 > var13; --var15) {
                class359.method2018(class678.field9722[var15], var11, -118, arg0, var10);
            }
            int var16 = class396.method2393(class587.field8513, class221.field2866, 5890, arg3 + arg5);
            int var17 = class396.method2393(class587.field8513, class221.field2866, 5890, -arg5 + arg1);
            for (int var18 = var12; ~var13 <= ~var18; ++var18) {
                int[] var19 = class678.field9722[var18];
                class359.method2018(var19, var16, 77, arg0, var10);
                class359.method2018(var19, var17, 104, arg2, var16);
                class359.method2018(var19, var11, arg4 ^ -6947, arg0, var17);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V", line = 70)
    public static void method928(int arg0) {
        if (arg0 != 4080) {
            field1760 = null;
        }
        field1768 = null;
        field1770 = null;
        field1760 = null;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)Z", line = 82)
    public final boolean method929(byte arg0) {
        ++field1757;
        if (this.field1766 != null) {
            return true;
        } else if (this.field1762 >= 0) {
            class495 var2 = class106.field1382 < 0 ? class495.method2885(class634.field9108, this.field1762) : class495.method2874(class634.field9108, class106.field1382, this.field1762);
            var2.method2876();
            this.field1766 = var2.method2883();
            this.field1761 = var2.field6899;
            this.field1758 = var2.field6906;
            return true;
        } else {
            if (arg0 > -13) {
                field1760 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBLun;)V", line = 109)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field1759;
        if (arg1 < 111) {
            this.field1766 = null;
        }
        if (arg0 == 0) {
            this.field1762 = arg2.method2260(-95);
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I", line = 127)
    public final int method930(byte arg0) {
        ++field1767;
        if (arg0 <= 82) {
            this.method930((byte) -61);
        }
        return this.field1762;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 140)
    public class141() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[[I", line = 145)
    public int[][] method645(int arg0, int arg1) {
        ++field1764;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (super.field5148.field2041 && this.method929((byte) -90)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class365.field4914 != ~this.field1758 ? this.field1758 * arg0 / class365.field4914 : arg0) * this.field1761;
            if (~class599.field8643 != ~this.field1761) {
                for (int var8 = 0; class599.field8643 > var8; ++var8) {
                    int var9 = this.field1761 * var8 / class599.field8643;
                    int var10 = this.field1766[var7 + var9];
                    var6[var8] = class435.method2605(var10 << 4, 4080);
                    var5[var8] = class435.method2605(4080, var10 >> 4);
                    var4[var8] = class435.method2605(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class599.field8643; ++var11) {
                    int var12 = this.field1766[var7++];
                    var6[var11] = class435.method2605(var12 << 4, 4080);
                    var5[var11] = class435.method2605(var12 >> 4, 4080);
                    var4[var11] = class435.method2605(var12 >> 12, 4080);
                }
            }
        }
        if (arg1 != 3) {
            this.method929((byte) 64);
        }
        return var3;
    }
}
