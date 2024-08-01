import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class class81 extends class71 {

    @OriginalMember(owner = "ic", name = "x", descriptor = "I")
    public int field1600 = -1;

    @OriginalMember(owner = "ic", name = "D", descriptor = "I")
    public int field1605 = 0;

    @OriginalMember(owner = "ic", name = "p", descriptor = "Llf;")
    public static class109 field1592 = class35.method275(" steht bereits auf Ihrer Freunde)2Liste(Q", 2);

    @OriginalMember(owner = "ic", name = "n", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "ic", name = "o", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "ic", name = "q", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "ic", name = "r", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "ic", name = "s", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "ic", name = "t", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "ic", name = "u", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "ic", name = "v", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "ic", name = "w", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "ic", name = "y", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "ic", name = "z", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "ic", name = "A", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "ic", name = "E", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "ic", name = "C", descriptor = "[[S")
    public static short[][] field1604;

    @OriginalMember(owner = "ic", name = "a", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1604 = null;
        if (arg0 != 380184944) {
            method517(31, -6, -38, -15, null, (byte) -126, null);
        }
        field1592 = null;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method516(byte arg0, byte[] arg1) {
        field1596++;
        if (arg0 <= 31) {
            return null;
        } else {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class122.method878(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IIIILkf;BLvg;)V")
    public static final void method517(int arg0, int arg1, int arg2, int arg3, class100 arg4, byte arg5, class200 arg6) {
        field1603++;
        if (arg4 == null) {
            return;
        }
        if (arg5 != 110) {
            method516((byte) 104, null);
        }
        int var7 = arg0 * arg0 + arg2 * arg2;
        int var8 = class69.field1343 + class47.field970 & 0x7FF;
        int var9 = Math.max(arg6.field3881 / 2, arg6.field3901 / 2) + 10;
        if (var9 * var9 < var7) {
            return;
        }
        int var10 = class124.field2387[var8];
        int var11 = var10 * 256 / (class144.field2780 + 256);
        int var12 = class124.field2383[var8];
        int var13 = var12 * 256 / (class144.field2780 + 256);
        int var14 = arg0 * var11 + arg2 * var13 >> 16;
        int var15 = arg2 * var11 - arg0 * var13 >> 16;
        arg4.method725(arg1 + arg6.field3881 / 2 + var14 - arg4.field2012 / 2, arg6.field3901 / 2 + -var15 + arg3 + -(arg4.field2010 / 2), arg6.field3815, arg6.field3876);
    }
}
