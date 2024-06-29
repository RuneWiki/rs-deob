import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class694 extends Canvas {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field9729;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Lgk;")
    public static class616 field9730 = new class616();

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field9732 = 0;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field9731;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field9733;

    // $FF: synthetic method
    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3820(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZZB)V", line = 5)
    public static final void method3817(boolean arg0, boolean arg1, byte arg2) {
        field9728++;
        if (arg1) {
            class330.field4163--;
            if (class330.field4163 == 0) {
                class655.field9213 = null;
            }
        }
        if (arg0) {
            class385.field5196--;
            if (class385.field5196 == 0) {
                class194.field2239 = null;
            }
        }
        if (arg2 != 43) {
            field9730 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 33)
    public class694(Component arg0) {
        this.field9729 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 41)
    public final void update(Graphics arg0) {
        field9726++;
        this.field9729.update(arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 51)
    public static void method3818(int arg0) {
        field9730 = null;
        if (arg0 != -8925) {
            method3819(null, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lhl;B)V", line = 61)
    public static final void method3819(class323 arg0, byte arg1) {
        field9727++;
        if (arg1 != 6 || class487.field7044 == null) {
            return;
        }
        class49 var2 = null;
        if (arg0.field3975 == 0) {
            var2 = (class49) class578.method3272(arg0.field3973, arg0.field3971, arg0.field3968);
        }
        if (arg0.field3975 == 1) {
            var2 = (class49) class411.method2298(arg0.field3973, arg0.field3971, arg0.field3968);
        }
        if (arg0.field3975 == 2) {
            var2 = (class49) class362.method2121(arg0.field3973, arg0.field3971, arg0.field3968, field9733 == null ? (field9733 = method3820("gda")) : field9733);
        }
        if (arg0.field3975 == 3) {
            var2 = (class49) class328.method1845(arg0.field3973, arg0.field3971, arg0.field3968);
        }
        if (var2 == null) {
            arg0.field3977 = -1;
            arg0.field3970 = 0;
            arg0.field3969 = 0;
        } else {
            arg0.field3977 = var2.method238(arg1 + 6512);
            arg0.field3970 = var2.method241((byte) 29);
            arg0.field3969 = var2.method237(false);
        }
    }

    @OriginalMember(owner = "client!eu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 102)
    public final void paint(Graphics arg0) {
        this.field9729.paint(arg0);
        field9731++;
    }
}
