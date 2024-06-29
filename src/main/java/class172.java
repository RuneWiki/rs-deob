import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class172 extends Canvas {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field3106;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lud;")
    public static class279 field3100 = class130.method1024("Starte 3D)2Softwarebibliothek)3", 255);

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lud;")
    public static class279 field3102 = class130.method1024("Sprites charg-Bs", 255);

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field3107 = 128;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lud;")
    public static class279 field3112 = class130.method1024(" x ", 255);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lhc;")
    public static class171 field3111 = new class171(20);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lul;")
    public static class43 field3103;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[Lud;")
    public static class279[] field3110;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method1341(int arg0, long arg1) {
        field3105++;
        if (arg1 != 0L) {
            int var3 = -3 % ((arg0 + 21) / 60);
            class314.field5534.method1634(219, 0);
            class314.field5534.method490(arg1, 14886);
            class285.field5082++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1342(boolean arg0) {
        field3103 = null;
        field3112 = null;
        if (!arg0) {
            field3100 = null;
            field3110 = null;
            field3102 = null;
            field3111 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 50)
    public final void paint(Graphics arg0) {
        field3101++;
        this.field3106.paint(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 58)
    public class172(Component arg0) {
        this.field3106 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 71)
    public static final void method1343(int arg0, int arg1) {
        field3104++;
        if (class53.field1111 == arg0) {
            return;
        }
        if (class53.field1111 == 0) {
            class39.method348((byte) 121);
        }
        if (arg0 == 40) {
            class176.method1367(-32140);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class312.field5522 != null) {
            class312.field5522.method2024(-1);
            class312.field5522 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class29.field693 = 1;
            class202.field3593 = 0;
            class311.field5509 = 0;
            class12.field394 = 0;
            class103.field1948 = 1;
            class85.method733(true, arg1 ^ 0x72D8);
        }
        if (arg0 == 25 || arg0 == 10) {
            class134.method1049(arg1 + 29398);
        }
        if (arg0 == 5) {
            class104.method883((byte) -85, class266.field4799);
        } else {
            class155.method1221((byte) -94);
        }
        if (arg1 != -29401) {
            return;
        }
        boolean var3 = class53.field1111 == 5 || class53.field1111 == 10 || class53.field1111 == 28;
        if (var3 != var2) {
            if (var2) {
                class125.field2292 = class323.field5656;
                if (class113.field2073 == 0) {
                    class126.method1014(arg1 ^ 0xFFFF8D26, 2);
                } else {
                    class210.method1543(12218, 0, 2, class33.field742, class323.field5656, 255, false);
                }
                class255.field4552.method1380(false, (byte) 127);
            } else {
                class126.method1014(1, 2);
                class255.field4552.method1380(true, (byte) 126);
            }
        }
        if (class97.field1824 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class97.method836();
        }
        class53.field1111 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)I", line = 161)
    public static final int method1344(int arg0, int arg1) {
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        field3108++;
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 != 2) {
            field3103 = (class43) null;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!wk", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 204)
    public final void update(Graphics arg0) {
        field3109++;
        this.field3106.update(arg0);
    }
}
