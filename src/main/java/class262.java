import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class262 extends Canvas {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field4668;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    public static boolean field4671 = false;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "J")
    public static long field4674 = 0L;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Ltg;")
    public static class277 field4673 = new class277(16);

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field4678 = -2;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Llc;")
    public static class143 field4679 = class66.method374(")4j", -1);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!be", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4676++;
        this.field4668.paint(arg0);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class262(Component arg0) {
        this.field4668 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lvk;")
    public static final class148 method1743(int arg0, int arg1) {
        class148 var2 = (class148) class171.field3053.method826((long) arg0, false);
        field4669++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class176.field3150.method41(-18328, class149.method965(arg0, (byte) 21), class69.method402((byte) -119, arg0));
        class148 var4 = new class148();
        var4.field2685 = arg0;
        if (var3 != null) {
            var4.method951(new class190(var3), -1);
        }
        var4.method949(-27);
        if (var4.field2713 != -1) {
            var4.method954((byte) -71, method1743(var4.field2715, 17366), method1743(var4.field2713, 17366));
        }
        if (var4.field2672 != -1) {
            var4.method952(method1743(var4.field2672, 17366), method1743(var4.field2666, 17366), -74);
        }
        if (arg1 != 17366) {
            method1744((byte) -17);
        }
        if (!class179.field3203 && var4.field2679) {
            var4.field2701 = 0;
            var4.field2673 = null;
            var4.field2681 = client.field4014;
            var4.field2700 = null;
            var4.field2711 = false;
        }
        class171.field3053.method827(-3, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method1744(byte arg0) {
        if (arg0 >= -125) {
            return;
        }
        if (class143.field2564 > class5.field80) {
            class5.field80 = (float) ((double) class5.field80 / 30.0D + (double) class5.field80);
            if (class5.field80 > class143.field2564) {
                class5.field80 = class143.field2564;
            }
            class141.method849((byte) 113);
        } else if (class5.field80 > class143.field2564) {
            class5.field80 = (float) ((double) class5.field80 - (double) class5.field80 / 30.0D);
            if (class143.field2564 > class5.field80) {
                class5.field80 = class143.field2564;
            }
            class141.method849((byte) 109);
        }
        if (class227.field4096 != -1 && class147.field2651 != -1) {
            int var1 = class227.field4096 - class41.field691;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class41.field691 += var1;
            int var2 = class147.field2651 - class203.field3691;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class227.field4096 = -1;
                class147.field2651 = -1;
            }
            class203.field3691 += var2;
            class141.method849((byte) 109);
        }
        field4675++;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method1745(byte arg0) {
        field4679 = null;
        if (arg0 < 42) {
            method1743(73, 64);
        }
        field4673 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lvc;")
    public static final class166 method1746(int arg0, int arg1, int arg2) {
        field4670++;
        class166 var3 = (class166) field4673.method1824((long) arg2 << 32 | (long) arg1, 0);
        int var4 = 88 % (arg0 / 60);
        if (var3 == null) {
            var3 = new class166(arg2, arg1);
            field4673.method1825(var3, (byte) 64, var3.field1162);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4668.update(arg0);
        field4672++;
    }
}
