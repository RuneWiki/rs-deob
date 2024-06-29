import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class216 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lwa;")
    private static class75 field3687 = class66.method560(")3de", false);

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lwa;")
    private static class75 field3691 = class66.method560("en", false);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lwa;")
    private static class75 field3689 = class66.method560(")3fr", false);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lwa;")
    public static class75 field3694 = class66.method560("Stufe)2", false);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lwa;")
    private static class75 field3700 = class66.method560("fr", false);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lwa;")
    private static class75 field3697 = class66.method560("de", false);

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lwa;")
    private static class75 field3698 = class66.method560(")3en", false);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[Lwa;")
    private static class75[] field3686 = new class75[] { field3698, field3687, field3689 };

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[Lwa;")
    public static class75[] field3688 = new class75[] { field3691, field3697, field3700 };

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lwa;")
    private static class75 field3699 = class66.method560(" from your friend list first)3", false);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lwa;")
    public static class75 field3690 = field3699;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Lmc;")
    public static class170 field3701 = new class170();

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lwa;")
    public static class75 field3702 = class66.method560("<col=ffffff>", false);

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[I")
    public static int[] field3703 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 16)
    public static void method1587(int arg0) {
        field3701 = null;
        field3703 = null;
        field3686 = null;
        field3689 = null;
        if (arg0 != 103) {
            return;
        }
        field3698 = null;
        field3690 = null;
        field3688 = null;
        field3700 = null;
        field3699 = null;
        field3694 = null;
        field3691 = null;
        field3687 = null;
        field3702 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 47)
    public static final void method1588(int arg0) {
        class18.method120(104, 104);
        class125.method991(class136.field2333, (byte) -41, class118.field1995);
        class12.method61(class136.field2333, false);
        field3695++;
        if (class118.field2003 == 10) {
            class52.method380(78, 28);
        }
        if (class118.field2003 == arg0) {
            class52.method380(arg0 + 19, 25);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method1589(int arg0, int arg1, int arg2) {
        field3685++;
        if (arg0 != 23519) {
            method1591((byte) -19, -35, (class75) null, (class75) null, (class75) null);
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        class108 var3 = class3.method14((byte) 83, arg2);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method843((byte) -124, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[BZ)Z", line = 123)
    public static final boolean method1590(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field3693++;
        boolean var4 = arg3;
        class60 var5 = new class60(arg2);
        int var6 = -1;
        label70: while (true) {
            int var7 = var5.method533(291);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class108 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method504(-128);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var5.method501(0);
                                    }
                                    int var10 = var5.method504(-9);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method501(0) >> 2;
                                    int var13 = (var8 & 0xFD9) >> 6;
                                    var14 = arg1 + var11;
                                    var15 = arg0 + var13;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class3.method14((byte) 83, var6);
                } while (var12 == 22 && !class161.field2727 && var16.field1851 == 0 && var16.field1820 != 1 && !var16.field1809);
                var9 = true;
                if (!var16.method844(arg3)) {
                    class55.field916++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BILwa;Lwa;Lwa;)V", line = 212)
    public static final void method1591(byte arg0, int arg1, class75 arg2, class75 arg3, class75 arg4) {
        class63.method545(arg4, arg1, arg2, 1, -1, arg3);
        field3684++;
        if (arg0 <= 93) {
            field3690 = (class75) null;
        }
    }
}
