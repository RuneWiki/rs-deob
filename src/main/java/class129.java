import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class129 extends class146 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
    public int[] field2125 = new int[5];

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[Lta;")
    public class190[] field2131 = new class190[5];

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field2130 = 0;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[S")
    public static short[] field2129 = new short[] { 34, 48, 14, 60, 18, 38, 36, 45 };

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "J")
    public static long field2136 = 0L;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[S")
    public static short[] field2138 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "S")
    public static short field2148 = 32767;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Llb;")
    public class105 field2132;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Laj;")
    public class117 field2146;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lsb;")
    public static class124 field2134;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lmb;")
    public class128 field2144;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lnb;")
    public class129 field2135;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lrd;")
    public class192 field2126;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Lcc;")
    public class195 field2143;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Lge;")
    public class249 field2133;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Z")
    public boolean field2123;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
    public boolean field2140;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Z")
    public boolean field2149;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(III)V")
    public class129(int arg0, int arg1, int arg2) {
        this.field2141 = arg1;
        this.field2137 = arg2;
        this.field2128 = this.field2152 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILai;)V")
    public static final void method938(int arg0, class196 arg1) {
        class241.method1587(arg1, 200000, true);
        field2147++;
        int var2 = -39 % ((arg0 - 24) / 46);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lkj;")
    public static final class114 method939(int arg0, int arg1, int arg2) {
        field2145++;
        class114 var3 = class8.method43(arg0, (byte) 116);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg1 != 36) {
                method940(false);
            }
            return var3 == null || var3.field1820 == null || arg2 >= var3.field1820.length ? null : var3.field1820[arg2];
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
    public static void method940(boolean arg0) {
        field2134 = null;
        field2129 = null;
        if (!arg0) {
            method938(-47, (class196) null);
        }
        field2138 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public static final int method941(int arg0) {
        if (arg0 != 34) {
            method940(false);
        }
        field2122++;
        return class248.field3962.method1160((byte) -118);
    }
}
