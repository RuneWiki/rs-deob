import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 extends Canvas {

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1846;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lu;")
    public static class135 field1841 = class87.method676((byte) -53, ":: (X");

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lu;")
    private static class135 field1852 = class87.method676((byte) -114, "Connection timed out)3");

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1848 = -1;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1850 = 1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lu;")
    public static class135 field1836 = field1852;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lu;")
    public static class135 field1853 = class87.method676((byte) -82, "backleft2");

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[Lic;")
    public static class59[] field1844 = new class59[2048];

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lpd;")
    public static class108 field1839;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lve;")
    public static class146 field1847;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field1849;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method622(int arg0) {
        class100.field2422 = false;
        class127.field3050 = false;
        field1851++;
        if (arg0 != -25416) {
            field1850 = 32;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method623(int arg0) {
        class132.field3197 = null;
        class152.field3754 = null;
        field1837++;
        class107.field2576 = null;
        class113.field2726 = null;
        class116.field2800 = null;
        class97.field2354 = null;
        class135.field3237 = null;
        class122.field2924 = null;
        class32.field759 = null;
        class44.field1055 = null;
        class132.field3199 = null;
        class52.field1241 = null;
        int var1 = -106 % ((arg0 - 54) / 55);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method624(int arg0) {
        field1849 = null;
        field1847 = null;
        field1853 = null;
        field1836 = null;
        field1839 = null;
        field1841 = null;
        int var1 = 101 % ((-arg0 - 57) / 44);
        field1852 = null;
        field1844 = null;
    }

    @OriginalMember(owner = "client!lb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1846.paint(arg0);
        field1845++;
    }

    @OriginalMember(owner = "client!lb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1846.update(arg0);
        field1854++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class78(Component arg0) {
        this.field1846 = arg0;
    }
}
