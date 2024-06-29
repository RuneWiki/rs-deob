import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class130 extends Canvas {

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1926;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1919 = 50;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "[I")
    public static int[] field1920 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[I")
    public static int[] field1918 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1925 = -1;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1917 = new String[field1919];

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "[I")
    public static int[] field1927 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "[I")
    public static int[] field1921 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "[I")
    public static int[] field1916 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "[I")
    public static int[] field1914 = new int[field1919];

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static final void method967(byte arg0) {
        if (arg0 >= 34) {
            class331.field4892.method2285((byte) -93);
            field1923++;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lvb;")
    public static final class178 method968(boolean arg0) {
        class23.field316 = 0;
        if (!arg0) {
            field1927 = null;
        }
        field1915++;
        return class467.method2761(-16192);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)V")
    public static void method969(boolean arg0) {
        field1920 = null;
        field1921 = null;
        field1916 = null;
        field1927 = null;
        field1918 = null;
        field1917 = null;
        if (arg0) {
            field1914 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1926.paint(arg0);
        field1922++;
    }

    @OriginalMember(owner = "client!ct", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1926.update(arg0);
        field1924++;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class130(Component arg0) {
        this.field1926 = arg0;
    }
}
