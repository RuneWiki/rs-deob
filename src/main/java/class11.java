import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class11 extends Canvas {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field107;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
    public static int[] field118 = new int[50];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field108 = "Members object";

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Loa;")
    public static class101 field114 = new class101(64);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lag;")
    public static class211 field110;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Ldk;")
    public static class251 field117;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Ldk;")
    public static class251 field119;

    @OriginalMember(owner = "client!tj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field107.paint(arg0);
        field115++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        if (class261.field4202 == null || class2.field32 == null) {
            class261.field4202 = new int[256];
            class2.field32 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class261.field4202[var1] = (int) (Math.sin(var2) * 4096.0D);
                class2.field32[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field116++;
        if (arg0 != -16416) {
            field119 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class11(Component arg0) {
        this.field107 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method54(byte arg0) {
        int var1 = -52 / ((30 - arg0) / 54);
        field112++;
        class90.field1464.method1257(-108);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZI)V")
    public static final void method55(int arg0, boolean arg1, int arg2) {
        field109++;
        if (!arg1) {
            method56(false);
        }
        class195.field3160[arg2] = arg0;
        class34 var3 = (class34) class209.field3303.method1059(0, (long) arg2);
        if (var3 == null) {
            class34 var4 = new class34(class191.method1350((byte) 125) + 500L);
            class209.field3303.method1052((long) arg2, (byte) -65, var4);
        } else {
            var3.field514 = class191.method1350((byte) 102) + 500L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static void method56(boolean arg0) {
        field110 = null;
        field114 = null;
        field108 = null;
        if (!arg0) {
            method57(76, -79, 91);
        }
        field119 = null;
        field118 = null;
        field117 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public static final void method57(int arg0, int arg1, int arg2) {
        field113++;
        int var3 = class214.field3548 * arg1 >> 8;
        if (arg2 == -1 && !class277.field4451) {
            class206.method1443(2568);
        } else if (arg2 != -1 && (class281.field4498 != arg2 || !class159.method1096(-124)) && var3 != 0 && !class277.field4451) {
            class116.method830(arg2, var3, class50.field852, 2, false, 270, 0);
        }
        int var4 = 60 % ((arg0 - 42) / 38);
        class281.field4498 = arg2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public static final void method58(int arg0, int arg1) {
        if (arg1 != 18891) {
            method57(16, 55, 1);
        }
        field120++;
        class206.field3273.method1262(arg0, arg1 - 16155);
    }

    @OriginalMember(owner = "client!tj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field121++;
        this.field107.update(arg0);
    }
}
