import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class84 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lrd;")
    public static class173 field1666 = class133.method843("bevor Sie den Vorgang wiederholen)3", 23);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lrd;")
    public static class173 field1665 = class133.method843("Lade Sprites )2 ", 73);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lrd;")
    public static class173 field1671 = class133.method843("http:)4)4www)3runescape)3com", -99);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lrd;")
    private static class173 field1674 = class133.method843("Starting game engine)3)3)3", -93);

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lrd;")
    public static class173 field1677 = field1674;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "La;")
    public static class1 field1672;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field1669;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1670;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    public int[] field1675;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method548(int arg0) {
        class170.method1099(-122);
        class18.method158((byte) 61);
        field1676++;
        class151.method994(true);
        class74.method454(arg0 ^ 0x3E85);
        class64.method407(0);
        class8.method54(arg0 ^ 0xFFFFC179);
        class203.method1352(arg0 ^ 0xFFFFC12A);
        class37.method281(-118);
        class202.method1344(-86);
        class111.method672((byte) -84);
        class101.method618((byte) -97);
        class121.method739((byte) 122);
        ((class186) class72.field1400).method1248((byte) -71);
        class191.field3737.method53(arg0 ^ 0xFFFFC13B);
        class175.field3444.method128((byte) 109);
        if (arg0 != 16118) {
            return;
        }
        class179.field3522.method128((byte) 64);
        class160.field2982.method128((byte) 85);
        class74.field1444.method128((byte) 126);
        class111.field2054.method128((byte) 80);
        class114.field2106.method128((byte) 74);
        class143.field2683.method128((byte) -81);
        class145.field2700.method128((byte) -98);
        class187.field3659.method128((byte) -25);
        class116.field2151.method128((byte) -89);
        class54.field1091.method128((byte) 121);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method549(int arg0) {
        field1665 = null;
        if (arg0 != -137) {
            field1674 = null;
        }
        field1672 = null;
        field1666 = null;
        field1671 = null;
        field1674 = null;
        field1677 = null;
        field1669 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method409(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public abstract void method410(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
    public static final boolean method550(int arg0, int arg1) {
        field1667++;
        if (arg1 != 2000) {
            method550(39, -95);
        }
        if (arg0 < 0) {
            return false;
        }
        int var2 = class179.field3526[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
    public static final Object method551(byte[] arg0, boolean arg1, boolean arg2) {
        field1662++;
        if (arg1) {
            method551(null, true, true);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class74.field1441) {
            try {
                class94 var3 = (class94) Class.forName("vc").getDeclaredConstructor().newInstance();
                var3.method590((byte) 52, arg0);
                return var3;
            } catch (Throwable var4) {
                class74.field1441 = true;
            }
        }
        return arg2 ? class198.method1315(18576, arg0) : arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method411(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public final void method552(int arg0) {
        if (arg0 != -2001) {
            field1672 = null;
        }
        class27.method221(this.field1675, this.field1664, this.field1673);
        field1668++;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    protected class84() {
    }
}
