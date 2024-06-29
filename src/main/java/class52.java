import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class52 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lhi;")
    public static class82 field837 = class95.method664((byte) -110, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lhi;")
    public static class82 field843 = class95.method664((byte) -31, "(Udns");

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public static boolean field841 = false;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
    public static boolean field839 = true;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lhi;")
    private static class82 field844 = class95.method664((byte) -56, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lhi;")
    public static class82 field842 = field844;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
    public static boolean field845 = false;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lum;")
    public static class222 field846;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILtg;)V", line = 4)
    public static final void method369(int arg0, class93 arg1) {
        arg1.field1668 = arg1.field1703;
        field840++;
        if (arg1.field1674 == 0) {
            arg1.field1652 = 0;
            return;
        }
        if (arg1.field1709 != -1 && arg1.field1671 == 0) {
            class35 var2 = class284.method1973(arg1.field1709, false);
            if (arg1.field1722 > 0 && var2.field562 == 0) {
                arg1.field1652++;
                return;
            }
            if (arg1.field1722 <= 0 && var2.field561 == 0) {
                arg1.field1652++;
                return;
            }
        }
        int var3 = arg1.field1685;
        int var4 = arg1.field1689;
        int var5 = arg1.field1723[arg1.field1674 - 1] * 128 + arg1.method520(true) * 64;
        int var6 = arg1.field1720[arg1.field1674 - 1] * 128 + (arg1.method520(true) * 64);
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg1.field1685 = var5;
            arg1.field1689 = var6;
            return;
        }
        if (var5 > var3) {
            if (var6 > var4) {
                arg1.field1673 = 1280;
            } else if (var4 <= var6) {
                arg1.field1673 = 1536;
            } else {
                arg1.field1673 = 1792;
            }
        } else if (var3 > var5) {
            if (var6 > var4) {
                arg1.field1673 = 768;
            } else if (var4 > var6) {
                arg1.field1673 = 256;
            } else {
                arg1.field1673 = 512;
            }
        } else if (var4 < var6) {
            arg1.field1673 = 1024;
        } else if (var6 < var4) {
            arg1.field1673 = 0;
        }
        int var7 = arg1.field1673 - arg1.field1704 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = 4;
        int var9 = arg1.field1694;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg1.field1663;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg1.field1654;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg1.field1675;
        }
        boolean var10 = true;
        if (var9 == -1) {
            var9 = arg1.field1663;
        }
        arg1.field1668 = var9;
        if (arg1 instanceof class275) {
            var10 = ((class275) arg1).field4628.field4070;
        }
        if (var10) {
            if (arg1.field1704 != arg1.field1673 && arg1.field1683 == -1 && arg1.field1710 != 0) {
                var8 = 2;
            }
            if (arg1.field1674 > 2) {
                var8 = 6;
            }
            if (arg1.field1674 > 3) {
                var8 = 8;
            }
            if (arg1.field1652 > 0 && arg1.field1674 > 1) {
                var8 = 8;
                arg1.field1652--;
            }
        } else {
            if (arg1.field1674 > 1) {
                var8 = 6;
            }
            if (arg1.field1674 > 2) {
                var8 = 8;
            }
            if (arg1.field1652 > 0 && arg1.field1674 > 1) {
                arg1.field1652--;
                var8 = 8;
            }
        }
        if (arg1.field1653[arg1.field1674 - 1]) {
            var8 <<= 0x1;
        }
        if (var3 < var5) {
            arg1.field1685 += var8;
            if (var5 < arg1.field1685) {
                arg1.field1685 = var5;
            }
        } else if (var5 < var3) {
            arg1.field1685 -= var8;
            if (arg1.field1685 < var5) {
                arg1.field1685 = var5;
            }
        }
        if (var4 < var6) {
            arg1.field1689 += var8;
            if (var6 < arg1.field1689) {
                arg1.field1689 = var6;
            }
        } else if (var4 > var6) {
            arg1.field1689 -= var8;
            if (arg1.field1689 < var6) {
                arg1.field1689 = var6;
            }
        }
        if (arg0 != 8) {
            method369(-43, (class93) null);
        }
        if (var8 >= 8 && arg1.field1668 == arg1.field1663 && arg1.field1667 != -1) {
            arg1.field1668 = arg1.field1667;
        }
        if (arg1.field1685 == var5 && arg1.field1689 == var6) {
            arg1.field1674--;
            if (arg1.field1722 > 0) {
                arg1.field1722--;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 240)
    public static void method370(int arg0) {
        field842 = null;
        field843 = null;
        field844 = null;
        field837 = null;
        field846 = null;
        if (arg0 != 0) {
            method370(102);
        }
    }
}
