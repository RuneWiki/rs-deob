import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class39 extends class128 {

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Ljava/lang/String;")
    public static String field587 = null;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field597 = "yellow:";

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Ljava/lang/String;")
    public String field603;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "[I")
    public static int[] field588;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method260(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field600;
        if (~arg5 == -4) {
            method260(true, -1, true, 16693, -1, class288.field4610, arg6);
        } else if (arg3 == 16693) {
            Container var7;
            if (class43.field653 != null) {
                var7 = class43.field653;
            } else if (class31.field469 != null) {
                var7 = class31.field469;
            } else {
                var7 = class45.field667.field744;
            }
            class284.field4553 = var7.getSize().width;
            field590 = var7.getSize().height;
            if (class31.field469 == var7) {
                Insets var8 = class31.field469.getInsets();
                class284.field4553 -= var8.right + var8.left;
                field590 -= var8.top + var8.bottom;
            }
            if (~arg5 > -3) {
                class218.field3386 = 765;
                class212.field3196 = 0;
                class174.field2460 = 503;
                class11.field186 = (class284.field4553 + -765) / 2;
            } else {
                class11.field186 = 0;
                class212.field3196 = 0;
                class218.field3386 = class284.field4553;
                class174.field2460 = field590;
            }
            if (arg0) {
                class90.method587(class291.field4645, true);
                class279.method1811(class291.field4645, 117);
                if (class3.field23 != null) {
                    class3.field23.method297(-17721, class291.field4645);
                }
                class70.field1023.method86(48);
                class36.method249(false, class291.field4645);
                class288.method1928((byte) -127, class291.field4645);
                if (class3.field23 != null) {
                    class3.field23.method300(class291.field4645, (byte) -8);
                }
            } else {
                class291.field4645.setSize(class218.field3386, class174.field2460);
                if (class31.field469 == var7) {
                    Insets var9 = class31.field469.getInsets();
                    class291.field4645.setLocation(class11.field186 + var9.left, class212.field3196 + var9.top);
                } else {
                    class291.field4645.setLocation(class11.field186, class212.field3196);
                }
            }
            if (~arg5 < -1) {
                method260(true, -1, true, arg3, -1, 0, arg6);
            } else {
                class280.field4453 = !class294.method1973(2);
                class220.method1430(class218.field3386, class174.field2460);
                if (class104.field1499 != -1) {
                    class241.method1587((byte) 109, true);
                }
                if (class272.field4332 != null && (~class142.field1961 == -31 || ~class142.field1961 == -26)) {
                    class276.method1796(false);
                }
                for (int var10 = 0; ~var10 > -101; ++var10) {
                    class274.field4355[var10] = true;
                }
                class292.field4665 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public final void method261(int arg0) {
        ++field594;
        super.field1793 |= Long.MIN_VALUE;
        if (this.method267((byte) 31) == (long) arg0) {
            class42.field626.method1068(this, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)Ldb;")
    public static final class68 method262(int arg0) {
        ++field585;
        try {
            return new class210();
        } catch (Throwable var3) {
            int var1 = -59 / ((-4 - arg0) / 61);
            try {
                return (class68) Class.forName("si").newInstance();
            } catch (Throwable var2) {
                return new class259();
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)I")
    public static final int method263(int arg0, byte arg1, String arg2, String arg3) {
        int var4 = arg3.length();
        int var5 = 0;
        ++field589;
        int var6 = arg2.length();
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~(-var8 + var5) > ~var4 || ~var6 < ~(-var9 + var7)) {
            if (var5 - var8 >= var4) {
                return -1;
            }
            if (var6 <= -var9 + var7) {
                return 1;
            }
            char var22;
            if (~var8 == -1) {
                var22 = arg3.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (~var9 == -1) {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class263.method1707((byte) -51, var22);
            var9 = class263.method1707((byte) -36, var24);
            char var26 = class108.method684(true, var22, arg0);
            char var27 = class108.method684(true, var24, arg0);
            if (~var26 != ~var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class131.method833(arg0, (byte) -16, var28) - class131.method833(arg0, (byte) -78, var29);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (~arg0 != -3) {
                var16 = var11;
                var17 = var11;
            } else {
                var17 = -var11 + var4 + -1;
                var16 = var6 + -1 - var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class131.method833(arg0, (byte) -125, var20) + -class131.method833(arg0, (byte) -39, var21);
                }
            }
        }
        if (arg1 != 93) {
            field592 = 100;
        }
        int var12 = -var6 + var4;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; ~var13 > ~var10; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (~var14 != ~var15) {
                    return class131.method833(arg0, (byte) -52, var14) + -class131.method833(arg0, (byte) -106, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)I")
    public final int method264(byte arg0) {
        ++field602;
        int var2 = 65 % ((38 - arg0) / 56);
        return (int) super.field2141;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
    public static void method265(int arg0) {
        if (arg0 == -1) {
            field588 = null;
            field597 = null;
            field587 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
    public final int method266(byte arg0) {
        ++field601;
        if (arg0 != -20) {
            field590 = 33;
        }
        return (int) (255L & super.field2141 >>> 32);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)J")
    public final long method267(byte arg0) {
        if (arg0 < 17) {
            return 80L;
        } else {
            ++field596;
            return Long.MAX_VALUE & super.field1793;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
    public final void method268(byte arg0) {
        ++field599;
        if (arg0 != -19) {
            method265(-76);
        }
        super.field1793 = 500L + class299.method2006(9594) | super.field1793 & Long.MIN_VALUE;
        class110.field1563.method1068(this, (byte) -45);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(II)V")
    public class39(int arg0, int arg1) {
        super.field2141 = (long) arg1 | (long) arg0 << 32;
    }
}
