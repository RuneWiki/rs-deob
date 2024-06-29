import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class104 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[I")
    public static int[] field1989 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ljd;")
    public static class86 field1988 = class122.method868("Update)2Liste geladen)3", true);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Loj;")
    public static class155[] field1993 = new class155[27];

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljd;")
    public static class86 field1984 = class122.method868("3D)2Softwarebibliothek gestartet)3", true);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ljd;")
    public static class86 field1992 = class122.method868("Wordpack geladen)3", true);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[B")
    public byte[] field1987;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[B")
    public byte[] field1996;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method743(int arg0) {
        class63.method452((byte) 94);
        System.gc();
        field2001++;
        class138.method983(25, (byte) 10);
        if (arg0 < 14) {
            field1983 = -27;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method744(byte arg0) {
        field1994++;
        int var1 = class141.field2684.method1767(class198.field3524);
        for (int var2 = 0; var2 < class16.field463; var2++) {
            int var6 = class141.field2684.method1767(class127.method896(12307, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        if (arg0 < 116) {
            method745((byte) 84);
        }
        int var3 = class16.field463 * 15 + 21;
        int var4 = class200.field3576 - (var1 / 2);
        int var5 = class57.field1168;
        if ((var3 + var5) > class248.field4414) {
            var5 = class248.field4414 - var3;
        }
        if (class4.field53 < var4 + var1) {
            var4 = class4.field53 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class209.field3776 == 1) {
            if (class200.field3576 == class12.field398 && class57.field1168 == class272.field4765) {
                class108.field2080 = var1;
                class127.field2462 = class16.field463 * 15 + 22;
                class195.field3506 = true;
                class209.field3776 = 0;
                class202.field3642 = var4;
                class112.field2144 = var5;
            }
        } else if (class200.field3576 == class185.field3288 && class57.field1168 == class39.field906) {
            class112.field2144 = var5;
            class108.field2080 = var1;
            class195.field3506 = true;
            class209.field3776 = 0;
            class127.field2462 = class16.field463 * 15 + 22;
            class202.field3642 = var4;
        } else {
            class272.field4765 = class39.field906;
            class209.field3776 = 1;
            class12.field398 = class185.field3288;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field1989 = null;
        if (arg0 != 68) {
            field1989 = null;
        }
        field1992 = null;
        field1988 = null;
        field1993 = null;
        field1984 = null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static final void method746(byte arg0) {
        int var1 = -111 % ((21 - arg0) / 33);
        field1998++;
        int var2 = class213.field3858;
        int var3 = class183.field3263;
        int var4 = class200.field3571 - class248.field4414 - var2;
        int var5 = class255.field4540 - var3 - class4.field53;
        if (var3 <= 0 && var5 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var6 = 0;
            Container var7;
            if (class88.field1746 != null) {
                var7 = class88.field1746;
            } else if (class138.field2627 == null) {
                var7 = class157.field2954.field4514;
            } else {
                var7 = class138.field2627;
            }
            int var8 = 0;
            if (class138.field2627 == var7) {
                Insets var9 = class138.field2627.getInsets();
                var8 = var9.top;
                var6 = var9.left;
            }
            Graphics var10 = var7.getGraphics();
            var10.setColor(Color.black);
            if (var3 > 0) {
                var10.fillRect(var6, var8, var3, class200.field3571);
            }
            if (var2 > 0) {
                var10.fillRect(var6, var8, class255.field4540, var2);
            }
            if (var5 > 0) {
                var10.fillRect(class255.field4540 + var6 - var5, var8, var5, class200.field3571);
            }
            if (var4 > 0) {
                var10.fillRect(var6, class200.field3571 + var8 - var4, class255.field4540, var4);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }
}
