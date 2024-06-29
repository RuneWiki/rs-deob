import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class151 extends Canvas {

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field2939;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
    public static int[] field2936 = new int[128];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lsd;")
    public static class166 field2935 = class135.method935(":trade:", 0);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field2934 = 127;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!qg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2938++;
        this.field2939.paint(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static final void method1025(byte arg0) {
        for (class8 var1 = (class8) class178.field3372.method1109((byte) -126); var1 != null; var1 = (class8) class178.field3372.method1115((byte) -72)) {
            if (var1.field145 != null) {
                class11.field206.method1010(var1.field145);
                var1.field145 = null;
            }
            if (var1.field140 != null) {
                class11.field206.method1010(var1.field140);
                var1.field140 = null;
            }
        }
        field2940++;
        if (arg0 <= 21) {
            field2936 = null;
        }
        class178.field3372.method1104(78);
    }

    @OriginalMember(owner = "client!qg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2939.update(arg0);
        field2937++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
    public static final void method1026(byte arg0, int arg1) {
        field2933++;
        class169.method1180(-27053);
        class135.method938(false);
        int var2 = class70.method566((byte) 50, arg1).field1860;
        if (var2 == 0) {
            return;
        }
        int var3 = class91.field1785[arg1];
        if (arg0 <= 65) {
            field2934 = 52;
        }
        if (var2 == 1) {
            if (var3 == 1) {
                class40.method280(0.9F);
            }
            if (var3 == 2) {
                class40.method280(0.8F);
            }
            if (var3 == 3) {
                class40.method280(0.7F);
            }
            if (var3 == 4) {
                class40.method280(0.6F);
            }
            class19.method118(-128);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class79.field1622 != var4) {
                if (class79.field1622 == 0 && class185.field3567 != -1) {
                    class79.method647(0, false, (byte) 101, class11.field213, class185.field3567, var4);
                    class49.field913 = false;
                } else if (var4 == 0) {
                    class28.method203(1);
                    class49.field913 = false;
                } else {
                    class199.method1313(91, var4);
                }
                class79.field1622 = var4;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class57.field1115 = 127;
            }
            if (var3 == 1) {
                class57.field1115 = 96;
            }
            if (var3 == 2) {
                class57.field1115 = 64;
            }
            if (var3 == 3) {
                class57.field1115 = 32;
            }
            if (var3 == 4) {
                class57.field1115 = 0;
            }
        }
        if (var2 == 6) {
            class130.field2554 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field2934 = 127;
            }
            if (var3 == 1) {
                field2934 = 96;
            }
            if (var3 == 2) {
                field2934 = 64;
            }
            if (var3 == 3) {
                field2934 = 32;
            }
            if (var3 == 4) {
                field2934 = 0;
            }
        }
        if (var2 == 9) {
            class200.field3963 = var3;
        }
        if (var2 == 5) {
            class140.field2733 = var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2935 = null;
        field2936 = null;
        if (arg0 != 96) {
            method1025((byte) 49);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class151(Component arg0) {
        this.field2939 = arg0;
    }
}
