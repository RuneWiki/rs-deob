import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 extends Canvas {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field825;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
    public static int[] field819 = new int[128];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "F")
    public static float field821 = 0.0F;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lag;")
    public static class188 field822 = null;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field820 = 0;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Z")
    public static boolean field830 = false;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[Z")
    public static boolean[] field831 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method435(int arg0) {
        field831 = null;
        field822 = null;
        field819 = null;
        if (arg0 != 27171) {
            field819 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
    public static final void method436(int arg0, int arg1, byte arg2) {
        field824++;
        if (arg2 > -38) {
            method435(-75);
        }
        class30.field482[arg0] = arg1;
        class6 var3 = (class6) class289.field4545.method1414(true, (long) arg0);
        if (var3 == null) {
            class6 var4 = new class6(class269.method1823(-98) + 500L);
            class289.field4545.method1409((long) arg0, 1, var4);
        } else {
            var3.field106 = class269.method1823(-99) + 500L;
        }
    }

    @OriginalMember(owner = "client!tk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field825.paint(arg0);
        field826++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static final void method437(byte arg0) {
        class167.field2523.method1783(0);
        class6.field110.method1783(0);
        if (arg0 != 14) {
            field819 = null;
        }
        field829++;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)J")
    public static final long method438(int arg0) {
        field827++;
        if (arg0 != 23913) {
            method435(118);
        }
        return class188.field3006.method805((byte) -61);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class53(Component arg0) {
        this.field825 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field823++;
        this.field825.update(arg0);
    }
}
