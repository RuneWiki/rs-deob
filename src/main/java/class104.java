import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 extends Canvas {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field1726;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lbb;")
    public static class90 field1725 = new class90();

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public static int[] field1734 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lsb;")
    public static class221 field1731 = new class221(64);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
    public static int[] field1736 = new int[4];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[Lti;")
    public static class5[] field1735;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method730(int arg0, int arg1) {
        class132.field2351.method1478(arg1, arg0 + 5304);
        if (arg0 != -5185) {
            method731(7);
        }
        field1732++;
        class252.field4407.method1478(arg1, 75);
        class192.field3358.method1478(arg1, 117);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method731(int arg0) {
        int var1 = class144.field2520 * 128 + 64;
        int var2 = class152.field2625 * 128 + 64;
        int var3 = class158.method1123(class231.field4013, var1, arg0 + 23502, var2) - class24.field435;
        field1730++;
        if (class82.field1356 < 100) {
            if (var3 > class22.field406) {
                class22.field406 += (var3 - class22.field406) * class82.field1356 / 1000 + class97.field1560;
                if (class22.field406 > var3) {
                    class22.field406 = var3;
                }
            }
            if (class22.field406 > var3) {
                class22.field406 -= class97.field1560 + ((class22.field406 - var3) * class82.field1356 / 1000);
                if (var3 > class22.field406) {
                    class22.field406 = var3;
                }
            }
            if (client.field2695 < var1) {
                client.field2695 += (var1 - client.field2695) * class82.field1356 / 1000 + class97.field1560;
                if (var1 < client.field2695) {
                    client.field2695 = var1;
                }
            }
            if (class78.field1273 < var2) {
                class78.field1273 += (var2 - class78.field1273) * class82.field1356 / 1000 + class97.field1560;
                if (var2 < class78.field1273) {
                    class78.field1273 = var2;
                }
            }
            if (client.field2695 > var1) {
                client.field2695 -= (client.field2695 - var1) * class82.field1356 / 1000 + class97.field1560;
                if (var1 > client.field2695) {
                    client.field2695 = var1;
                }
            }
            if (class78.field1273 > var2) {
                class78.field1273 -= (class78.field1273 - var2) * class82.field1356 / 1000 + class97.field1560;
                if (class78.field1273 < var2) {
                    class78.field1273 = var2;
                }
            }
        } else {
            client.field2695 = class144.field2520 * 128 + 64;
            class78.field1273 = class152.field2625 * 128 + 64;
            class22.field406 = class158.method1123(class231.field4013, client.field2695, arg0 + 23502, class78.field1273) - class24.field435;
        }
        int var4 = class212.field3648 * 128 + 64;
        int var5 = class275.field4779 * 128 + 64;
        int var6 = class158.method1123(class231.field4013, var4, -6230, var5) - class16.field304;
        int var7 = var6 - class22.field406;
        int var8 = var5 - class78.field1273;
        int var9 = var4 - client.field2695;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class8.field170 < var11) {
            class8.field170 += (var11 - class8.field170) * class226.field3900 / 1000 + class187.field3269;
            if (var11 < class8.field170) {
                class8.field170 = var11;
            }
        }
        int var13 = var12 - class220.field3827;
        if (var11 < class8.field170) {
            class8.field170 -= (class8.field170 - var11) * class226.field3900 / 1000 + class187.field3269;
            if (var11 > class8.field170) {
                class8.field170 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (arg0 != -29732) {
            method731(-79);
        }
        if (var13 > 0) {
            class220.field3827 += class187.field3269 + (class226.field3900 * var13 / 1000);
            class220.field3827 &= 0x7FF;
        }
        if (var13 < 0) {
            class220.field3827 -= class187.field3269 + (-var13 * class226.field3900 / 1000);
            class220.field3827 &= 0x7FF;
        }
        int var14 = var12 - class220.field3827;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class220.field3827 = var12;
        }
    }

    @OriginalMember(owner = "client!jj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1727++;
        this.field1726.update(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class104(Component arg0) {
        this.field1726 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1729++;
        this.field1726.paint(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method732(int arg0) {
        field1734 = null;
        field1725 = null;
        field1731 = null;
        field1735 = null;
        if (arg0 != -12926) {
            method730(-122, 32);
        }
        field1736 = null;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static final void method733(int arg0) {
        field1728++;
        class237.field4119.method1481(false);
        int var1 = -94 % ((arg0 + 35) / 40);
        class116.field2101.method1481(false);
    }
}
