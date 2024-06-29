import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 extends Canvas {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field2516;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lhe;")
    public static class54 field2507 = class6.method58(" Sekunde(Xn(Y -Ubertragen)3", false);

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2515 = 0;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lec;")
    public static class32 field2509 = new class32(32);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lhe;")
    private static class54 field2517 = class6.method58("FULL", false);

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2518 = 0;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lhe;")
    public static class54 field2520 = field2517;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[Lhe;")
    public static class54[] field2521;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)I")
    public static final int method790(boolean arg0, int arg1) {
        field2514++;
        return arg0 ? arg1 >> 17 & 0x7 : 122;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lef;Lef;BLef;)V")
    public static final void method791(class35 arg0, class35 arg1, byte arg2, class35 arg3) {
        class84.field2093 = arg0;
        field2512++;
        int var4 = 25 / ((arg2 - 12) / 41);
        class48.field1161 = arg1;
        class40.field1053 = arg3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
    public static final boolean method792(int arg0) {
        field2510++;
        class34 var1 = class100.field2527;
        synchronized (class100.field2527) {
            if (class84.field2091 == class84.field2088) {
                return false;
            } else {
                class108.field2635 = class115.field2733[class84.field2088];
                class89.field2194 = class51.field1235[class84.field2088];
                class84.field2088 = arg0 & class84.field2088 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2513++;
        this.field2516.update(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field2509 = null;
        field2517 = null;
        field2521 = null;
        field2507 = null;
        field2520 = null;
        if (arg0 != 7) {
            method792(-88);
        }
    }

    @OriginalMember(owner = "client!ob", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2508++;
        this.field2516.paint(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class99(Component arg0) {
        this.field2516 = arg0;
    }
}
