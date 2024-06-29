import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class483 extends Canvas {

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field7372;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Z")
    public static boolean field7373 = false;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[J")
    public static long[] field7371 = new long[256];

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "J")
    public static long field7379;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Llt;")
    public static class458 field7377;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IJ)V")
    public static final void method2913(int arg0, long arg1) {
        try {
            if (arg0 != 0) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field7370++;
    }

    @OriginalMember(owner = "client!nk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field7372.update(arg0);
        field7375++;
    }

    @OriginalMember(owner = "client!nk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field7369++;
        this.field7372.paint(arg0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method2914(int arg0) {
        field7371 = null;
        field7377 = null;
        if (arg0 != -16809) {
            method2915(-78);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class483(Component arg0) {
        this.field7372 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public static final void method2915(int arg0) {
        if (arg0 != 128) {
            field7377 = null;
        }
        field7374++;
        int var1 = (int) ((double) class150.field2422 * 34.46D);
        int var2 = var1 << 0;
        if (class345.field5116.method1969()) {
            var2 += 128;
        }
        class345.field5116.method1891(50, var2);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7371[var0] = var1;
        }
        field7376 = 0;
        field7379 = 0L;
        field7380 = 0;
    }
}
