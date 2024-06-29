import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class224 {

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    private int field927 = 2048;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    private int field920 = 3072;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    private int field930 = 1024;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[I")
    public static int[] field917 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field921 = 0;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Lkj;")
    public static class145 field915;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "[[[B")
    public static byte[][][] field929;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field927 = -this.field930 + this.field920;
        if (arg0 <= -4) {
            ++field914;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3624 = arg0.method201(255) == 1;
                }
            } else {
                this.field920 = arg0.method190(-3);
            }
        } else {
            this.field930 = arg0.method190(-3);
        }
        if (arg2 >= -46) {
            field918 = 124;
        }
        ++field922;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field926;
        if (!arg1) {
            method449(true);
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            for (int var5 = 0; ~var5 > ~class78.field1108; ++var5) {
                var3[var5] = (var4[var5] * this.field927 >> 12) + this.field930;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(Z)V")
    public static final void method449(boolean arg0) {
        int var1 = class57.field808;
        ++field923;
        int var2 = class106.field1641;
        int var3 = class25.field345;
        int var4 = class240.field3852;
        int var5 = 6116423;
        if (arg0) {
            class127.method876(var1, var4, var2, var3, var5);
            class127.method876(var1 - -1, var4 + 1, var2 + -2, 16, 0);
            class127.method855(var1 + 1, var4 - -18, var2 + -2, var3 + -19, 0);
            class232.field3734.method1325(class86.field1366, var1 + 3, var4 + 14, var5, -1);
            int var6 = class141.field2074;
            int var7 = class31.field416;
            for (int var8 = 0; var8 < class245.field3920; ++var8) {
                int var9 = (-var8 + class245.field3920 + -1) * 15 + var4 + 31;
                int var10 = 16777215;
                if (var7 > var1 && var1 + var2 > var7 && ~(var9 + -13) > ~var6 && ~(var9 + 3) < ~var6) {
                    var10 = 16776960;
                }
                class232.field3734.method1325(class102.method674(-19736, var8), var1 + 3, var9, var10, 0);
            }
            class79.method532(class57.field808, class106.field1641, class240.field3852, class25.field345, 2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static void method450(int arg0) {
        if (arg0 == 6116423) {
            field917 = null;
            field929 = null;
            field915 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)I")
    public static final int method451(int arg0) {
        ++field916;
        try {
            if (class131.field1917 == 0) {
                if (~class146.field2155 < ~(-5000L + class260.method1785((byte) -111))) {
                    return 0;
                }
                class286.field4541 = class2.field23.method140(arg0 + -22884, class235.field3773, class155.field2304);
                class64.field899 = class260.method1785((byte) -108);
                class131.field1917 = 1;
            }
            if (class64.field899 + 30000L < class260.method1785((byte) -123)) {
                return class106.method696(false, 1000);
            } else {
                if (arg0 != 16472) {
                    field929 = null;
                }
                if (~class131.field1917 == -2) {
                    if (~class286.field4541.field3247 == -3) {
                        return class106.method696(false, 1001);
                    }
                    if (class286.field4541.field3247 != 1) {
                        return -1;
                    }
                    int var1 = 0;
                    class240.field3833 = new class273((Socket) class286.field4541.field3249, class2.field23);
                    class13.field165.field349 = 0;
                    if (class287.field4546) {
                        var1 = class216.field3524;
                    }
                    class286.field4541 = null;
                    class13.field165.method184(23, 96);
                    class13.field165.method166(var1, -3);
                    class240.field3833.method1843(-115, class13.field165.field339, class13.field165.field349, 0);
                    if (class239.field3821 != null) {
                        class239.field3821.method402(122);
                    }
                    if (class54.field739 != null) {
                        class54.field739.method402(75);
                    }
                    int var2 = class240.field3833.method1839((byte) -68);
                    if (class239.field3821 != null) {
                        class239.field3821.method402(arg0 + -16438);
                    }
                    if (class54.field739 != null) {
                        class54.field739.method402(43);
                    }
                    if (var2 != 0) {
                        return class106.method696(false, var2);
                    }
                    class131.field1917 = 2;
                }
                if (~class131.field1917 == -3) {
                    if (~class240.field3833.method1840((byte) 127) > -3) {
                        return -1;
                    }
                    class64.field898 = class240.field3833.method1839((byte) -125);
                    class64.field898 <<= 8;
                    class64.field898 += class240.field3833.method1839((byte) -118);
                    class237.field3792 = new byte[class64.field898];
                    class136.field1997 = 0;
                    class131.field1917 = 3;
                }
                if (~class131.field1917 == -4) {
                    int var3 = class240.field3833.method1840((byte) 118);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (~(-class136.field1997 + class64.field898) > ~var3) {
                            var3 = -class136.field1997 + class64.field898;
                        }
                        class240.field3833.method1841(-1, class237.field3792, var3, class136.field1997);
                        class136.field1997 += var3;
                        if (class136.field1997 < class64.field898) {
                            return -1;
                        } else if (!class238.method1616(class237.field3792, 0)) {
                            return class106.method696(false, 1002);
                        } else {
                            class216.field3526 = new class157[class118.field1734];
                            int var4 = 0;
                            for (int var5 = class45.field577; class187.field2950 >= var5; ++var5) {
                                class157 var6 = class245.method1655(5, var5);
                                if (var6 != null) {
                                    class216.field3526[var4++] = var6;
                                }
                            }
                            class240.field3833.method1842(false);
                            class237.field3792 = null;
                            class240.field3833 = null;
                            class131.field1917 = 0;
                            class284.field4496 = 0;
                            class146.field2155 = class260.method1785((byte) -105);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class106.method696(false, 1003);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V")
    public static final void method452(int arg0, int arg1) {
        ++field925;
        if (class74.method509(arg0, 0)) {
            class261.method1789(-1, -104, class104.field1608[arg0]);
            if (arg1 >= -83) {
                method450(117);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field919;
            int[][] var3 = super.field3616.method1341(false, arg0);
            if (super.field3616.field3042) {
                int[][] var4 = this.method1532(85, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class78.field1108; ++var11) {
                    var8[var11] = (var5[var11] * this.field927 >> 12) + this.field930;
                    var9[var11] = this.field930 - -(var6[var11] * this.field927 >> 12);
                    var10[var11] = (var7[var11] * this.field927 >> 12) + this.field930;
                }
            }
            return var3;
        }
    }
}
