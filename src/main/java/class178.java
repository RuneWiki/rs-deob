import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class178 extends Canvas {

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2462;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "[I")
    public static int[] field2459 = new int[13];

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILbk;)V")
    public static final void method1166(int arg0, class211 arg1) {
        field2460++;
        if ((arg1.field2867.length - arg1.field2888) < 1) {
            return;
        }
        int var2 = arg1.method1342((byte) -127);
        if (var2 < 0 || var2 > 1) {
            return;
        }
        if (arg0 != 49) {
            field2461 = 70;
        }
        if (arg1.field2867.length - arg1.field2888 < 2) {
            return;
        }
        int var3 = arg1.method1355(32136);
        if (var3 * 6 != arg1.field2867.length - arg1.field2888) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field2888 >= arg1.field2867.length) {
                            return;
                        }
                        var4 = arg1.method1355(arg0 + 32087);
                        var5 = arg1.method1336((byte) -50);
                    } while (class160.field2272.length <= var4);
                } while (!class148.field2087[var4]);
            } while (class108.method604(var4, arg0 ^ 0x4F).field3785 == '1' && (var5 < -1 || var5 > 1));
            class160.field2272[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field2459 = null;
        if (arg0 != 8) {
            method1168(82, 81, 39, (byte) 75, -123);
        }
    }

    @OriginalMember(owner = "client!hs", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2462.update(arg0);
        field2457++;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class178(Component arg0) {
        this.field2462 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)V")
    public static final void method1168(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 < 65) {
            return;
        }
        if (class94.field1038 == 1) {
            class118.field1411[class105.field1194 / 100].method90(class130.field1803 - 8, class420.field6040 - 8);
        }
        field2463++;
        if (class94.field1038 == 2) {
            class118.field1411[class105.field1194 / 100 + 4].method90(class130.field1803 - 8, class420.field6040 - 8);
        }
        class112.method619(15247);
    }

    @OriginalMember(owner = "client!hs", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2458++;
        this.field2462.paint(arg0);
    }
}
