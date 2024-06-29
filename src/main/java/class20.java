import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class20 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Leg;")
    public static class37 field264 = class174.method1167("null", 70);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Leg;")
    public static class37 field265 = class174.method1167("Fallen lassen", 73);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Leg;")
    public static class37 field266 = class174.method1167("OK", -20);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field268;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lsb;B)V")
    public static final void method127(class109 arg0, byte arg1) {
        arg0.field1789 = arg0.field1767;
        field263++;
        if (arg0.field1834 == 0) {
            arg0.field1765 = 0;
            return;
        }
        if (arg0.field1800 != -1 && arg0.field1785 == 0) {
            class2 var2 = class186.method1242(0, arg0.field1800);
            if (arg0.field1766 > 0 && var2.field27 == 0) {
                arg0.field1765++;
                return;
            }
            if (arg0.field1766 <= 0 && var2.field42 == 0) {
                arg0.field1765++;
                return;
            }
        }
        int var3 = arg0.field1799;
        int var4 = arg0.field1793;
        int var5 = arg0.field1812[arg0.field1834 - 1] * 128 + arg0.method763(-1) * 64;
        int var6 = arg0.field1780[arg0.field1834 - 1] * 128 + (arg0.method763(-1) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg0.field1799 = var5;
            arg0.field1793 = var6;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field1816 = 1280;
            } else if (var6 < var4) {
                arg0.field1816 = 1792;
            } else {
                arg0.field1816 = 1536;
            }
        } else if (var3 <= var5) {
            if (var6 > var4) {
                arg0.field1816 = 1024;
            } else if (var6 < var4) {
                arg0.field1816 = 0;
            }
        } else if (var4 < var6) {
            arg0.field1816 = 768;
        } else if (var6 < var4) {
            arg0.field1816 = 256;
        } else {
            arg0.field1816 = 512;
        }
        int var7 = arg0.field1803;
        int var8 = arg0.field1816 - arg0.field1798 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = -79 % ((arg1 + 40) / 35);
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field1827;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field1787;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field1782;
        }
        boolean var10 = true;
        if (var7 == -1) {
            var7 = arg0.field1827;
        }
        arg0.field1789 = var7;
        if (arg0 instanceof class163) {
            var10 = ((class163) arg0).field2691.field4884;
        }
        int var11 = 4;
        if (var10) {
            if (arg0.field1816 != arg0.field1798 && arg0.field1824 == -1 && arg0.field1819 != 0) {
                var11 = 2;
            }
            if (arg0.field1834 > 2) {
                var11 = 6;
            }
            if (arg0.field1834 > 3) {
                var11 = 8;
            }
            if (arg0.field1765 > 0 && arg0.field1834 > 1) {
                arg0.field1765--;
                var11 = 8;
            }
        } else {
            if (arg0.field1834 > 1) {
                var11 = 6;
            }
            if (arg0.field1834 > 2) {
                var11 = 8;
            }
            if (arg0.field1765 > 0 && arg0.field1834 > 1) {
                arg0.field1765--;
                var11 = 8;
            }
        }
        if (arg0.field1760[arg0.field1834 - 1]) {
            var11 <<= 0x1;
        }
        if (var6 > var4) {
            arg0.field1793 += var11;
            if (arg0.field1793 > var6) {
                arg0.field1793 = var6;
            }
        } else if (var6 < var4) {
            arg0.field1793 -= var11;
            if (arg0.field1793 < var6) {
                arg0.field1793 = var6;
            }
        }
        if (var5 > var3) {
            arg0.field1799 += var11;
            if (arg0.field1799 > var5) {
                arg0.field1799 = var5;
            }
        } else if (var3 > var5) {
            arg0.field1799 -= var11;
            if (var5 > arg0.field1799) {
                arg0.field1799 = var5;
            }
        }
        if (arg0.field1799 == var5 && arg0.field1793 == var6) {
            if (arg0.field1766 > 0) {
                arg0.field1766--;
            }
            arg0.field1834--;
        }
        if (var11 >= 8 && arg0.field1827 == arg0.field1789 && arg0.field1764 != -1) {
            arg0.field1789 = arg0.field1764;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method128(byte arg0) {
        field266 = null;
        field265 = null;
        if (arg0 != -37) {
            method128((byte) -13);
        }
        field264 = null;
        field268 = null;
    }
}
