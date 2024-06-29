import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class406 extends class140 {

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "Lho;")
    public static class103 field5840 = new class103(8, 0);

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
    public static boolean field5845 = false;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "B")
    public byte field5841;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public int field5834;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "Lug;")
    public class396 field5839;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
    public final int method864(byte arg0) {
        ++field5837;
        if (this.field5839 == null) {
            return 0;
        } else {
            return arg0 != 13 ? -73 : this.field5839.field5729 * 100 / (this.field5839.field5761.length + -this.field5841);
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)[B")
    public final byte[] method868(int arg0) {
        int var2 = 92 % ((arg0 - 63) / 51);
        ++field5843;
        if (!super.field1861 && this.field5839.field5761.length + -this.field5841 <= this.field5839.field5729) {
            return this.field5839.field5761;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
    public static void method2488(int arg0) {
        if (arg0 < 61) {
            field5842 = 13;
        }
        field5840 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILmh;)Z")
    public static final boolean method2489(int arg0, class448 arg1) {
        ++field5835;
        if (arg0 != 17223) {
            field5842 = -107;
        }
        class70 var2 = class123.field1593.method2920(arg1.method46(115), 19219);
        if (~var2.field853 == 0) {
            return true;
        } else {
            class470 var3 = class465.field6927.method502((byte) 51, var2.field853);
            return var3.field6968 == -1 ? true : var3.method2865(0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Ljk;")
    public static final class450 method2490(byte arg0, int arg1) {
        ++field5844;
        int var2 = arg1 >> 16;
        if (arg0 != -116) {
            method2493((byte) -75, -0.7943301426559093D);
        }
        int var3 = arg1 & 65535;
        if (class339.field4491[var2] == null || class339.field4491[var2][var3] == null) {
            boolean var4 = class372.method2199(-40, var2);
            if (!var4) {
                return null;
            }
        }
        return class339.field4491[var2][var3];
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZII)I")
    public static final int method2491(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field5842 = -72;
        }
        ++field5833;
        if (arg3 >= arg0) {
            return arg3 > arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public static final void method2492(int arg0, int arg1, int arg2) {
        if (arg0 < 36) {
            field5842 = -19;
        }
        ++field5836;
        if (class446.field6486 != arg1) {
            class4.field37 = new int[arg1];
            for (int var3 = 0; ~arg1 < ~var3; ++var3) {
                class4.field37[var3] = (var3 << 12) / arg1;
            }
            class161.field2098 = arg1 * 32;
            class446.field6486 = arg1;
            class102.field1388 = arg1 + -1;
        }
        if (~class305.field4055 != ~arg2) {
            if (class446.field6486 != arg2) {
                class190.field2457 = new int[arg2];
                for (int var4 = 0; arg2 > var4; ++var4) {
                    class190.field2457[var4] = (var4 << 12) / arg2;
                }
            } else {
                class190.field2457 = class4.field37;
            }
            class115.field1508 = arg2 + -1;
            class305.field4055 = arg2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BD)V")
    public static final void method2493(byte arg0, double arg1) {
        if (class75.field944 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class387.field5624[var3] = var4 <= 255 ? var4 : 255;
            }
            class75.field944 = arg1;
        }
        ++field5838;
        if (arg0 <= 120) {
            field5840 = null;
        }
    }
}
