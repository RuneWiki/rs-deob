import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class474 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field6422 = -1;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljia;")
    private class645 field6423 = new class645();

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "J")
    private long field6418;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B[B)Lnf;")
    public static final class604 method2723(byte arg0, byte[] arg1) {
        field6424++;
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        if (arg0 != -21) {
            field6419 = 116;
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class594.field8348);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class594.field8348);
                int var5 = var2.getHeight(class594.field8348);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class95.field1472.method495(0, var4, var6, var5, var4, true);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lrh;I)V")
    public final void method2724(class280 arg0, int arg1) {
        field6420++;
        if (this.field6418 != arg0.field3858 || this.field6422 != arg0.field3878) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class313.method1985(arg0.field3858, 13426) + " updateNum:" + arg0.field3878 + " delta.owner:" + class313.method1985(this.field6418, 13426) + " updateNum:" + this.field6422);
        }
        if (arg1 > -98) {
            this.method2724(null, 6);
        }
        for (class735 var3 = (class735) this.field6423.method3589((byte) -128); var3 != null; var3 = (class735) this.field6423.method3591(0)) {
            var3.method624(arg0, false);
        }
        arg0.field3878++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfca;)V")
    private final void method2725(int arg0, class93 arg1) {
        field6421++;
        this.field6418 = arg1.method770((byte) 81);
        this.field6422 = arg1.method773(3);
        for (int var3 = arg1.method793((byte) 76); var3 != 0; var3 = arg1.method793((byte) 12)) {
            if (class359.field4904) {
                System.out.println("t:" + var3);
            }
            class735 var4;
            if (var3 == 3) {
                var4 = new class618();
            } else if (var3 == 1) {
                var4 = new class132();
            } else if (var3 == 4) {
                var4 = new class714();
            } else if (var3 == 6) {
                var4 = new class633();
            } else if (var3 == 5) {
                var4 = new class786();
            } else if (var3 == 2) {
                var4 = new class69();
            } else if (var3 == 7) {
                var4 = new class715();
            } else if (var3 == 8) {
                var4 = new class353();
            } else if (var3 == 9) {
                var4 = new class192();
            } else if (var3 == 10) {
                var4 = new class542();
            } else if (var3 == 11) {
                var4 = new class687();
            } else if (var3 == 12) {
                var4 = new class423();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method627(arg0 + 17, arg1);
            this.field6423.method3594((byte) -114, var4);
        }
        if (arg0 != -12) {
            this.method2725(-17, null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lfca;)V")
    public class474(class93 arg0) {
        this.method2725(-12, arg0);
    }
}
