import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 extends Canvas {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field1546;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[[B")
    public static byte[][] field1544 = new byte[50][];

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "La;")
    private static class1 field1552 = class113.method934(-11538, "shake:");

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "La;")
    public static class1 field1548 = field1552;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1551 = 0;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lpb;")
    public static class92 field1550 = new class92();

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1557 = 255;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1562 = 127;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "La;")
    private static class1 field1566 = class113.method934(-11538, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "La;")
    public static class1 field1564 = field1566;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "La;")
    private static class1 field1567 = class113.method934(-11538, "Prepared visibility map");

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "La;")
    public static class1 field1565 = class113.method934(-11538, "k");

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "La;")
    public static class1 field1560 = field1567;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lbd;")
    public static class11 field1558;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lu;")
    public static class120 field1545;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lwc;")
    public static class134 field1556;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lwc;")
    public static class134 field1561;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[I")
    public static int[] field1559;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
    public static int[] field1563;

    @OriginalMember(owner = "client!kb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 12)
    public final void paint(Graphics arg0) {
        field1553++;
        this.field1546.paint(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 22)
    public static final void method597(byte arg0) {
        class1.field11.method1057((byte) 90);
        field1547++;
        if (arg0 > -12) {
            method599((byte) 69);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 41)
    public static final void method598(int arg0) {
        class15.method266(true);
        class11.method235(false);
        field1555++;
        class100.method857((byte) -90);
        class100.method862((byte) -37);
        class46.method483(64);
        class14.method255((byte) 60);
        class11.method234(true);
        class123.method998(-11965);
        class92.method810(-99);
        class9.method192(1023);
        class103.method876((byte) -93);
        class80.method729(109);
        ((class75) class27.field772).method694(arg0);
        class31.field831.method268((byte) 96);
        class52.field1381.method237(1120);
        class19.field658.method237(1120);
        class131.field3203.method237(arg0 + 1120);
        class80.field2034.method237(1120);
        class128.field3134.method237(1120);
        class108.field2705.method237(1120);
        class76.field1893.method237(1120);
        class42.field1088.method237(arg0 ^ 0x460);
        class70.field1755.method237(1120);
        field1545.method237(arg0 + 1120);
        class93.field2327.method237(1120);
        class109.field2742.method237(1120);
    }

    @OriginalMember(owner = "client!kb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 74)
    public final void update(Graphics arg0) {
        field1549++;
        this.field1546.update(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 90)
    public static void method599(byte arg0) {
        field1565 = null;
        if (arg0 != -46) {
            method597((byte) -3);
        }
        field1567 = null;
        field1544 = null;
        field1545 = null;
        field1560 = null;
        field1552 = null;
        field1559 = null;
        field1550 = null;
        field1548 = null;
        field1566 = null;
        field1558 = null;
        field1561 = null;
        field1563 = null;
        field1564 = null;
        field1556 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 114)
    public class62(Component arg0) {
        this.field1546 = arg0;
    }
}
