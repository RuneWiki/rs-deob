import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public abstract class PixMap {

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lv;")
    public static JagString field306 = class1.method2(255, "Key");

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lv;")
    public static JagString field307 = class1.method2(255, "Hair Dressers");

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "I")
    public int height;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "I")
    public int width;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "J")
    public static long field305;

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Ljava/awt/Image;")
    public Image image;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 11)
    public static final void method119(int arg0) {
        if (arg0 != 5615) {
            method123((byte) -36, null);
        }
        if (++Js5.field132 >= 64) {
            JagException.field107++;
            Js5.field132 = 0;
            if (GameCanvas.field42 >> 6 > JagException.field107) {
                GZip.method50(arg0 - 5615);
            }
        }
        JavaKeyboard.field12 = (Js5.field132 << 6) + ByteArray.field128;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IZI)B", line = 35)
    public static final byte method120(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method119(-26);
        }
        int var3 = arg2 >> 6;
        int var4 = arg0 >> 6;
        if (GameShell.field207[var3][var4] == null) {
            return 0;
        } else if (GameShell.field207[var3][var4].field375 == null) {
            return GameShell.field207[var3][var4].field367;
        } else {
            return GameShell.field207[var3][var4].field375[(arg2 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)V", line = 60)
    public final void bind(int arg0) {
        Draw2D.bind(this.pixels, this.width, this.height);
        if (arg0 > -81) {
            method122(65);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(I)V", line = 93)
    public static void method122(int arg0) {
        field306 = null;
        field307 = null;
        if (arg0 > -44) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B[Lv;)Lv;", line = 106)
    public static final JagString method123(byte arg0, JagString[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -14) {
            method119(105);
        }
        return Timer.method194(arg1, 0, arg1.length, arg0 ^ 0xFFFFA71A);
    }

    @OriginalMember(owner = "mapview!na", name = "<init>", descriptor = "()V", line = 136)
    protected PixMap() {
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
    public abstract void drawImage(int arg0, Graphics arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public abstract void init(boolean arg0, int arg1, int arg2, Component arg3);
}
