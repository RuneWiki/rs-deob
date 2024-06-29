import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class80 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lcd;")
    public static class23 field1738 = class54.method414("Standort", -1);

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lcd;")
    public static class23 field1739 = class54.method414("oder benutzen Sie eine andere Welt)3", -1);

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lcd;")
    public static class23 field1748 = class54.method414("Lade Texturen )2 ", -1);

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lcd;")
    public static class23 field1750 = class54.method414("Keine Antwort vom Server)3", -1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lhe;")
    public static class68 field1734;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1743;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
    public int[] field1741;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method542(int arg0) {
        class196.method1274(this.field1741, this.field1735, this.field1740);
        if (arg0 != 7350) {
            this.method544(null, 50, 28, (byte) -35, -75, -71);
        }
        field1747++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method543(int arg0) {
        if (arg0 != -11832) {
            field1736 = -125;
        }
        field1739 = null;
        field1748 = null;
        field1734 = null;
        field1750 = null;
        field1738 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public abstract void method544(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method545(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method546(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLbb;)V")
    public static final void method547(byte arg0, class12 arg1) {
        field1742++;
        arg1.field250 = arg1.field262;
        if (arg1.field247 == 0) {
            arg1.field284 = 0;
            return;
        }
        if (arg1.field288 != -1 && arg1.field252 == 0) {
            class94 var2 = class20.method128(arg1.field288, (byte) 29);
            if (arg1.field236 > 0 && var2.field1984 == 0) {
                arg1.field284++;
                return;
            }
            if (arg1.field236 <= 0 && var2.field1968 == 0) {
                arg1.field284++;
                return;
            }
        }
        int var3 = arg1.field215;
        int var4 = arg1.field277;
        int var5 = arg1.field219[arg1.field247 - 1] * 128 + arg1.field231 * 64;
        int var6 = arg1.field230[arg1.field247 - 1] * 128 + arg1.field231 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field277 = var6;
            arg1.field215 = var5;
            return;
        }
        int var7 = 4;
        if (var3 >= var5) {
            if (var3 > var5) {
                if (var6 > var4) {
                    arg1.field227 = 768;
                } else if (var6 < var4) {
                    arg1.field227 = 256;
                } else {
                    arg1.field227 = 512;
                }
            } else if (var4 < var6) {
                arg1.field227 = 1024;
            } else if (var6 < var4) {
                arg1.field227 = 0;
            }
        } else if (var6 > var4) {
            arg1.field227 = 1280;
        } else if (var4 > var6) {
            arg1.field227 = 1792;
        } else {
            arg1.field227 = 1536;
        }
        int var8 = arg1.field227 - arg1.field264 & 0x7FF;
        int var9 = arg1.field216;
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var9 = arg1.field268;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = arg1.field229;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = arg1.field253;
        }
        if (var9 == -1) {
            var9 = arg1.field268;
        }
        arg1.field250 = var9;
        if (arg1 instanceof class182) {
            var10 = ((class182) arg1).field3595.field82;
        }
        if (var10) {
            if (arg1.field264 != arg1.field227 && arg1.field218 == -1 && arg1.field271 != 0) {
                var7 = 2;
            }
            if (arg1.field247 > 2) {
                var7 = 6;
            }
            if (arg1.field247 > 3) {
                var7 = 8;
            }
            if (arg1.field284 > 0 && arg1.field247 > 1) {
                var7 = 8;
                arg1.field284--;
            }
        } else {
            if (arg1.field247 > 1) {
                var7 = 6;
            }
            if (arg1.field247 > 2) {
                var7 = 8;
            }
            if (arg1.field284 > 0 && arg1.field247 > 1) {
                var7 = 8;
                arg1.field284--;
            }
        }
        if (arg1.field212[arg1.field247 - 1]) {
            var7 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field215 += var7;
            if (arg1.field215 > var5) {
                arg1.field215 = var5;
            }
        } else if (var5 < var3) {
            arg1.field215 -= var7;
            if (arg1.field215 < var5) {
                arg1.field215 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field277 += var7;
            if (var6 < arg1.field277) {
                arg1.field277 = var6;
            }
        } else if (var6 < var4) {
            arg1.field277 -= var7;
            if (var6 > arg1.field277) {
                arg1.field277 = var6;
            }
        }
        if (arg1.field215 == var5 && arg1.field277 == var6) {
            if (arg1.field236 > 0) {
                arg1.field236--;
            }
            arg1.field247--;
        }
        if (var7 >= 8 && arg1.field268 == arg1.field250 && arg1.field269 != -1) {
            arg1.field250 = arg1.field269;
        }
        if (arg0 != -7) {
            method547((byte) 39, null);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    protected class80() {
    }
}
