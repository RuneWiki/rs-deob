import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class125 extends class642 {

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    private int field1823 = 10;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    private int field1824 = 0;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    private int field1821 = 2048;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "Lmh;")
    public static class139 field1826 = new class139(1, 2);

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
    public static int[] field1836 = new int[1];

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "Lla;")
    public static class393 field1832;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "Lfn;")
    public static class617 field1829;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "[I")
    private int[] field1825;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "[I")
    private int[] field1828;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field1830;
        if (arg2 <= 29) {
            field1836 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1824 = arg1.method3115(29871);
                }
            } else {
                this.field1821 = arg1.method3169(26488);
            }
        } else {
            this.field1823 = arg1.method3115(29871);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    private final void method897(byte arg0) {
        ++field1835;
        int var2 = 0;
        this.field1828 = new int[this.field1823 + 1];
        this.field1825 = new int[this.field1823 + 1];
        int var3 = 4096 / this.field1823;
        int var4 = this.field1821 * var3 >> 12;
        for (int var5 = 0; ~this.field1823 < ~var5; ++var5) {
            this.field1825[var5] = var2;
            this.field1828[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1825[this.field1823] = 4096;
        if (arg0 < -64) {
            this.field1828[this.field1823] = this.field1828[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.method897((byte) -114);
        if (arg0 == 6276) {
            ++field1827;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
    public static final boolean method898(int arg0, int arg1, int arg2) {
        ++field1822;
        int var3 = 109 % ((33 - arg0) / 49);
        if (~arg1 <= -1 && ~arg2 <= -1 && ~arg1 > ~class317.field4622[1].length && class317.field4622[1][arg1].length > arg2) {
            return ~(2 & class317.field4622[1][arg1][arg2]) != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg1 != -9) {
            return null;
        } else {
            ++field1820;
            int[] var3 = super.field9216.method1185(arg0, arg1 ^ 122);
            if (super.field9216.field2418) {
                int var4 = class400.field6026[arg0];
                if (~this.field1824 != -1) {
                    for (int var5 = 0; ~var5 > ~class338.field4909; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class542.field8026[var5];
                        int var9 = this.field1824;
                        if (var9 != 1) {
                            if (var9 != 2) {
                                if (var9 == 3) {
                                    var6 = (var8 - var4 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var8 - -var4 - 4096 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~this.field1823 < ~var10; ++var10) {
                            if (var6 >= this.field1825[var10] && ~var6 > ~this.field1825[var10 + 1]) {
                                if (this.field1828[var10] > var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field1823; ++var12) {
                        if (~this.field1825[var12] >= ~var4 && var4 < this.field1825[var12 + 1]) {
                            if (~this.field1828[var12] < ~var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class667.method3738(var3, 0, class338.field4909, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public static void method899(int arg0) {
        field1829 = null;
        if (arg0 == -30839) {
            field1832 = null;
            field1826 = null;
            field1836 = null;
        }
    }
}
