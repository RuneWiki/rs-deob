import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class128 extends class298 {

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field1578 = 4096;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "J")
    public static long field1582 = -1L;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "[I")
    public static int[] field1584;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Lfc;")
    public static class209 field1587;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Ldg;")
    public static class241 field1576;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Leg;")
    public static class394 field1585;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lg;")
    public static class470 field1581;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 <= -44) {
            ++field1579;
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field1578 = arg2.method916(21933);
                }
            } else {
                this.field1577 = arg2.method916(21933);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z")
    public static final boolean method608(int arg0, int arg1, int arg2, int arg3) {
        if (!class328.method1989(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class482.field6812;
            int var5 = arg2 << class482.field6812;
            int var6 = class398.field5667[arg0].method1861(arg1, arg2) - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 == 1) {
                if (var4 > class404.field5739) {
                    if (!class287.method1818(var4, var6, var5)) {
                        return false;
                    }
                    if (!class287.method1818(var4, var6, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class287.method1818(var4, var7, var5)) {
                        return false;
                    }
                    if (!class287.method1818(var4, var7, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (!class287.method1818(var4, var8, var5)) {
                    return false;
                } else {
                    return class287.method1818(var4, var8, class200.field2777 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class68.field851) {
                    if (!class287.method1818(var4, var6, class200.field2777 + var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var6, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class287.method1818(var4, var7, class200.field2777 + var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var7, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (!class287.method1818(var4, var8, class200.field2777 + var5)) {
                    return false;
                } else {
                    return class287.method1818(class200.field2777 + var4, var8, class200.field2777 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class404.field5739) {
                    if (!class287.method1818(class200.field2777 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var6, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class287.method1818(class200.field2777 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var7, class200.field2777 + var5)) {
                        return false;
                    }
                }
                if (!class287.method1818(class200.field2777 + var4, var8, var5)) {
                    return false;
                } else {
                    return class287.method1818(class200.field2777 + var4, var8, class200.field2777 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class68.field851) {
                    if (!class287.method1818(var4, var6, var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class287.method1818(var4, var7, var5)) {
                        return false;
                    }
                    if (!class287.method1818(class200.field2777 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class287.method1818(var4, var8, var5)) {
                    return false;
                } else {
                    return class287.method1818(class200.field2777 + var4, var8, var5);
                }
            } else if (!class287.method1818(class137.field1663 + var4, var9, class137.field1663 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class287.method1818(var4, var8, class200.field2777 + var5);
            } else if (arg3 == 32) {
                return class287.method1818(class200.field2777 + var4, var8, class200.field2777 + var5);
            } else if (arg3 == 64) {
                return class287.method1818(class200.field2777 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class287.method1818(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
    public static void method609(byte arg0) {
        int var1 = 120 % ((-93 - arg0) / 32);
        field1584 = null;
        field1576 = null;
        field1587 = null;
        field1585 = null;
        field1581 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field1580;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            for (int var5 = 0; ~var5 > ~class158.field1877; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1577 && var6 <= this.field1578 ? 4096 : 0;
            }
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static final void method610(int arg0) {
        ++field1575;
        try {
            if (class142.field1712 == 1) {
                int var1 = class208.field2882.method962((byte) 52);
                if (var1 > 0 && class208.field2882.method944((byte) -113)) {
                    int var2 = var1 - class175.field2099;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class208.field2882.method966(-115, var2);
                    return;
                }
                class208.field2882.method974((byte) 126);
                class208.field2882.method949(arg0 + -3022);
                class185.field2437 = null;
                class474.field6658 = null;
                if (field1581 == null) {
                    class142.field1712 = 0;
                } else {
                    class142.field1712 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class208.field2882.method974((byte) 126);
            class474.field6658 = null;
            class142.field1712 = 0;
            field1581 = null;
            class185.field2437 = null;
        }
        if (arg0 != 3145) {
            method609((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILeg;ILjava/awt/Canvas;)Loj;")
    public static final class280 method611(int arg0, class394 arg1, int arg2, Canvas arg3) {
        ++field1586;
        return arg0 < 115 ? null : new class411(arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lud;")
    public static final class2 method612(int arg0, byte arg1) {
        ++field1583;
        class2[] var2 = class458.method2696(-120);
        if (arg1 >= -79) {
            return null;
        } else {
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class2 var4 = var2[var3];
                if (var4.field8 == arg0) {
                    return var4;
                }
            }
            return null;
        }
    }

    static {
        new class40("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field1584 = new int[14];
    }
}
